package com.zebone.modules.api;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayDataDataserviceBillDownloadurlQueryRequest;
import com.alipay.api.response.*;
import com.google.gson.Gson;
import com.zebone.modules.ali.entity.AliConfig;
import com.zebone.modules.ali.service.AliConfigService;
import com.zebone.modules.api.dto.*;
import com.zebone.modules.api.service.AlipayService;
import com.zebone.modules.pay.entity.TradeRecord;
import com.zebone.modules.pay.service.TradeRecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@RestController
@RequestMapping(value = "api/alipay")

@Api(value = "支付宝支付接口",tags = "支付宝支付接口")
public class AlipayController {

    @Autowired
    private AliConfigService aliConfigService;

    @Autowired
    private AlipayService alipayService;

    @Autowired
    private TradeRecordService tradeRecordService;

    @ApiOperation(httpMethod = "POST",value = "统一收单交易支付接口",notes = "收银员使用扫码设备读取用户手机支付宝“付款码”信息后，将二维码或条码信息通过本接口上送至支付宝发起支付")
    @RequestMapping("aliPayBarcode")
    public AlipayPayResponse aliPayBarcode(@RequestBody AlipayParam alipayParam, HttpServletRequest request, HttpServletResponse response) throws InvocationTargetException, IllegalAccessException, AlipayApiException, AlipayApiException {
        AlipayTradePayResponse result = null;
        AliConfig aliConfig = new AliConfig();
        aliConfig.setAppId(alipayParam.getAppId());

        List<AliConfig> aliConfigList = aliConfigService.findList(aliConfig);
        if(aliConfigList.size()==1){
            result = (AlipayTradePayResponse) alipayService.tradePay(alipayParam,aliConfigList.get(0));

            AlipayTradePayResponse alipayTradePayResponse = (AlipayTradePayResponse) result;
            TradeRecord tradeRecord = new TradeRecord();
            BeanUtils.copyProperties(alipayTradePayResponse,tradeRecord);

            if(alipayTradePayResponse.isSuccess()){
                tradeRecord.setTradeStatus("1");
            }

            if(!alipayTradePayResponse.isSuccess()){
                tradeRecord.setRemarks(alipayTradePayResponse.getSubMsg());
                tradeRecord.setTradeStatus("3");
            }
            tradeRecord.setOutTradeNo(alipayParam.getOutTradeNo());
            tradeRecord.setPayType("2");
            tradeRecord.setAppId(alipayParam.getAppId());
            tradeRecordService.save(tradeRecord);
        }

        AlipayPayResponse alipayPayResponse=new AlipayPayResponse();
        BeanUtils.copyProperties(result,alipayPayResponse);
        return alipayPayResponse;
    }



    /**
     * （1）bill_type参数格式只支持日账单（yyyy-MM-dd）和月账单（yyyy-MM），建议检查bill_type日期格式是否正确（无法下载年账单）。
     *
     * （2）接口不支持下载当天或者当月的账单，建议检查下载账单时间是否与当前时间一致。
     *
     * 注：日账单建议第二日10:00以后下载；月账单一般会在次月4日或之后生成，建议次月4号或后面日期下载。
     * @param
     * @param req
     * @param res
     * @return
     * @throws IOException
     */
    @ApiOperation(httpMethod = "POST",value = "支付宝查询对账单下载地址",notes = "为方便商户快速查账，支持商户通过本接口获取商户离线账单下载地址")
    @RequestMapping("aliDownLoadBill")
    public AlipayDownloadurlQueryResponse  downLoadAliBill(@RequestBody AlipayBillParam alipayParam, HttpServletRequest req, HttpServletResponse res) throws IOException, AlipayApiException {
        String filePath = "";
        String jsonStr = "";
        String gateway = "";
        String appId = "";
        String privateKey = "";
        String aliPublicKey = "";
        String alipayPublicKey = "";
        AliConfig aliConfig = new AliConfig();
        aliConfig.setAppId(alipayParam.getAppId());
        AlipayDownloadurlQueryResponse alipayDownloadurlQueryResponse=new AlipayDownloadurlQueryResponse();
        List<AliConfig> aliConfigList = aliConfigService.findList(aliConfig);
        AliConfig ac = aliConfigList.get(0);
        if (ac != null) {
            gateway = ac.getGateway();
            appId = ac.getAppId();
            privateKey = ac.getPrivateKey();
            aliPublicKey = ac.getPayPublicKey();
        }

        alipayParam.setBillType("trade");
        String strType = "json";// 数据格式
        String chartType = "utf-8";// 编码格式
        Gson gson = new Gson();
        String bizContent = gson.toJson(alipayParam);
        // 支付宝公钥
        AlipayClient alipayClient = new DefaultAlipayClient(gateway, appId, privateKey, strType, chartType, aliPublicKey,"RSA2");
        AlipayDataDataserviceBillDownloadurlQueryRequest request = new AlipayDataDataserviceBillDownloadurlQueryRequest();
        request.setBizContent("{\"bill_type\":\"trade\",\"bill_date\":\""+ alipayParam.getBillDate() + "\"}");

        AlipayDataDataserviceBillDownloadurlQueryResponse response = alipayClient.execute(request);
        BeanUtils.copyProperties(response,alipayDownloadurlQueryResponse);
        // 获得下载对账单地址
        return alipayDownloadurlQueryResponse;
    }

//    @ApiOperation(httpMethod = "POST",value = "统一收单线下交易预创建",notes = "收银员通过收银台或商户后台调用支付宝接口，生成二维码后，展示给用户，由用户扫描二维码完成订单支付。")
//    @RequestMapping("aliPayQrcode")
//    public Object aliPayQrcode(@RequestBody AlipayParam alipayParam, @ApiIgnore HttpServletRequest request, @ApiIgnore HttpServletResponse response) throws AlipayApiException {
//        Object result = null;
//        AliConfig aliConfig = new AliConfig();
//        aliConfig.setAppId(alipayParam.getAppId());
//
//        List<AliConfig> aliConfigList = aliConfigService.findList(aliConfig);
//        if(aliConfigList.size()==1){
//            result = alipayService.tradePayQrCode(alipayParam,aliConfigList.get(0));
//
//            AlipayTradePrecreateResponse alipayTradePrecreateResponse = (AlipayTradePrecreateResponse) result;
//            TradeRecord tradeRecord = new TradeRecord();
//            BeanUtils.copyProperties(alipayTradePrecreateResponse,tradeRecord);
//            if(!alipayTradePrecreateResponse.isSuccess()){
//                tradeRecord.setRemarks(alipayTradePrecreateResponse.getSubMsg());
//            }
//            tradeRecord.setOutTradeNo(alipayParam.getOutTradeNo());
//            tradeRecord.setPayType("1");
//            tradeRecordService.save(tradeRecord);
//        }
//
//
//        return result;
//    }

    @ApiOperation(httpMethod = "POST",value = "统一收单交易退款接口",notes = "当交易发生之后一段时间内，由于买家或者卖家的原因需要退款时，卖家可以通过退款接口将支付款退还给买家，支付宝将在收到退款请求并且验证成功之后，按照退款规则将支付款按原路退到买家帐号上。 交易超过约定时间（签约时设置的可退款时间）的订单无法进行退款 支付宝退款支持单笔交易分多次退款，多次退款需要提交原支付订单的商户订单号和设置不同的退款单号。一笔退款失败后重新提交，要采用原来的退款单号。总退款金额不能超过用户实际支付金额")
    @RequestMapping("refund")
    public AlipayRefundResponse refund(@RequestBody AlipayRefuntParam param) throws AlipayApiException {
        AlipayTradeRefundResponse result=null;
        AliConfig aliConfig = new AliConfig();
        aliConfig.setAppId(param.getAppId());

        List<AliConfig> aliConfigList = aliConfigService.findList(aliConfig);
        if(aliConfigList.size()==1){
            result = (AlipayTradeRefundResponse) alipayService.refund(param,aliConfigList.get(0));

            AlipayTradeRefundResponse alipayTradeRefundResponse = (AlipayTradeRefundResponse) result;
            TradeRecord tradeRecord = new TradeRecord();
            BeanUtils.copyProperties(alipayTradeRefundResponse,tradeRecord);

            if(alipayTradeRefundResponse.isSuccess()){
                tradeRecord.setTradeStatus("2");
            }

            if(!alipayTradeRefundResponse.isSuccess()){
                tradeRecord.setRemarks(alipayTradeRefundResponse.getSubMsg());
            }
            tradeRecord.setOutTradeNo(param.getOutTradeNo());
            tradeRecord.setPayType("1");
            tradeRecord.setTotalAmount("-"+alipayTradeRefundResponse.getRefundFee());
            tradeRecord.setAppId(param.getAppId());
            tradeRecordService.save(tradeRecord);
        }
        AlipayRefundResponse alipayRefundResponse=new AlipayRefundResponse();
        BeanUtils.copyProperties(result,alipayRefundResponse);
        return alipayRefundResponse;
    }

    @ApiOperation(httpMethod = "POST",value = "统一收单线下交易预创建",notes = "收银员通过收银台或商户后台调用支付宝接口，生成二维码后，展示给用户，由用户扫描二维码完成订单支付")
    @RequestMapping("precreate")
    public AlipayPrecreateResponse precreate(@RequestBody AlipayPrecreateParam alipayParam, HttpServletRequest request, HttpServletResponse response) throws InvocationTargetException, IllegalAccessException, AlipayApiException, AlipayApiException {
        AlipayTradePrecreateResponse result = null;
        AliConfig aliConfig = new AliConfig();
        aliConfig.setAppId(alipayParam.getAppId());

        List<AliConfig> aliConfigList = aliConfigService.findList(aliConfig);
        if(aliConfigList.size()==1){
            result = alipayService.precreate(alipayParam,aliConfigList.get(0));

            TradeRecord tradeRecord = new TradeRecord();
            BeanUtils.copyProperties(result,tradeRecord);

            if(result.isSuccess()){
                tradeRecord.setTradeStatus("5");
            }

            if(!result.isSuccess()){
                tradeRecord.setRemarks(result.getSubMsg());
            }
            tradeRecord.setOutTradeNo(alipayParam.getOutTradeNo());
            tradeRecord.setPayType("2");
            tradeRecord.setAppId(alipayParam.getAppId());
            tradeRecordService.save(tradeRecord);
        }

        AlipayPrecreateResponse alipayPrecreateResponse = new AlipayPrecreateResponse();
        BeanUtils.copyProperties(result,alipayPrecreateResponse);
        return alipayPrecreateResponse;
    }


    @ApiOperation(httpMethod = "POST",value = "统一收单线下交易查询",notes = "该接口提供所有支付宝支付订单的查询，商户可以通过该接口主动查询订单状态，完成下一步的业务逻辑。 需要调用查询接口的情况： 当商户后台、网络、服务器等出现异常，商户系统最终未接收到支付通知； 调用支付接口后，返回系统错误或未知交易状态情况； 调用alipay.trade.pay，返回INPROCESS的状态； 调用alipay.trade.cancel之前，需确认支付状态")
    @RequestMapping("query")
    public AlipayQueryResponse query(@RequestBody AlipayQueryParam alipayParam, HttpServletRequest request, HttpServletResponse response) throws InvocationTargetException, IllegalAccessException, AlipayApiException, AlipayApiException {
        AlipayTradeQueryResponse result = null;
        AliConfig aliConfig = new AliConfig();
        aliConfig.setAppId(alipayParam.getAppId());

        List<AliConfig> aliConfigList = aliConfigService.findList(aliConfig);
        if(aliConfigList.size()==1){
            result = (AlipayTradeQueryResponse) alipayService.query(alipayParam,aliConfigList.get(0));

            AlipayTradeQueryResponse alipayTradePayResponse = (AlipayTradeQueryResponse) result;
            TradeRecord tradeRecord = new TradeRecord();
            BeanUtils.copyProperties(alipayTradePayResponse,tradeRecord);

            if(alipayTradePayResponse.isSuccess()){
                tradeRecord.setTradeStatus("1");
            }

            if(!alipayTradePayResponse.isSuccess()){
                tradeRecord.setRemarks(alipayTradePayResponse.getSubMsg());
                tradeRecord.setTradeStatus("3");
            }
            tradeRecord.setOutTradeNo(alipayParam.getOutTradeNo());
            tradeRecord.setPayType("2");
            tradeRecord.setAppId(alipayParam.getAppId());
            tradeRecordService.save(tradeRecord);
        }

        AlipayQueryResponse alipayPayResponse=new AlipayQueryResponse();
        BeanUtils.copyProperties(result,alipayPayResponse);
        return alipayPayResponse;
    }

}
