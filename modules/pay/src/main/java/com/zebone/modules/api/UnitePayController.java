package com.zebone.modules.api;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayDataDataserviceBillDownloadurlQueryRequest;
import com.alipay.api.request.AlipayTradePrecreateRequest;
import com.alipay.api.response.AlipayDataDataserviceBillDownloadurlQueryResponse;
import com.alipay.api.response.AlipayTradePayResponse;
import com.alipay.api.response.AlipayTradePrecreateResponse;
import com.google.gson.Gson;
import com.zebone.common.constant.PayTypeConstant;
import com.zebone.modules.ali.entity.AliConfig;
import com.zebone.modules.ali.service.AliConfigService;
import com.zebone.modules.api.dto.PayDTO;
import com.zebone.modules.api.service.AlipayTradeService;
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
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@RestController
@RequestMapping(value = "api/unite/pay")

@Api(value = "统一支付接口",tags = "统一支付接口")
public class UnitePayController {

    @Autowired
    private AliConfigService aliConfigService;

    @Autowired
    private AlipayTradeService alipayTradeService;

    @Autowired
    private TradeRecordService tradeRecordService;

    @ApiOperation(httpMethod = "POST",value = "统一收单交易支付接口",notes = "收银员使用扫码设备读取用户手机支付宝“付款码”信息后，将二维码或条码信息通过本接口上送至支付宝发起支付")
    @RequestMapping("aliPayBarcode")
    public Object aliPayBarcode(@RequestBody PayDTO payDTO, HttpServletRequest request, HttpServletResponse response) throws InvocationTargetException, IllegalAccessException, AlipayApiException, AlipayApiException {
        Object result = null;
        if(PayTypeConstant.WX.equalsIgnoreCase(payDTO.getPayType())){

        }else if(PayTypeConstant.AL.equalsIgnoreCase(payDTO.getPayType())){
            AliConfig aliConfig = new AliConfig();
            aliConfig.setAppId(payDTO.getAppId());

            List<AliConfig> aliConfigList = aliConfigService.findList(aliConfig);
            if(aliConfigList.size()==1){
                result = alipayTradeService.tradePay(payDTO,aliConfigList.get(0));

                AlipayTradePayResponse alipayTradePayResponse = (AlipayTradePayResponse) result;
                TradeRecord tradeRecord = new TradeRecord();
                BeanUtils.copyProperties(alipayTradePayResponse,tradeRecord);
                if(!alipayTradePayResponse.isSuccess()){
                    tradeRecord.setRemarks(alipayTradePayResponse.getSubMsg());
                }
                tradeRecord.setOutTradeNo(payDTO.getOutTradeNo());
                tradeRecord.setPayType(payDTO.getPayType());
                tradeRecordService.save(tradeRecord);
            }

        }


        return result;
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
    public Object downLoadAliBill(@RequestBody PayDTO payDTO, HttpServletRequest req, HttpServletResponse res) throws IOException, AlipayApiException {
        String filePath = "";
        String jsonStr = "";
        String gateway = "";
        String appId = "";
        String privateKey = "";
        String aliPublicKey = "";
        String alipayPublicKey = "";
        AliConfig aliConfig = new AliConfig();
        aliConfig.setAppId(payDTO.getAppId());

        List<AliConfig> aliConfigList = aliConfigService.findList(aliConfig);
        AliConfig ac = aliConfigList.get(0);
        if (ac != null) {
            gateway = ac.getGateway();
            appId = ac.getAppId();
            privateKey = ac.getPrivateKey();
            aliPublicKey = ac.getPayPublicKey();
        }

        payDTO.setBillType("trade");
        String strType = "json";// 数据格式
        String chartType = "utf-8";// 编码格式
        Gson gson = new Gson();
        String bizContent = gson.toJson(payDTO);
        // 支付宝公钥
        AlipayClient alipayClient = new DefaultAlipayClient(gateway, appId, privateKey, strType, chartType, aliPublicKey,"RSA2");
        AlipayDataDataserviceBillDownloadurlQueryRequest request = new AlipayDataDataserviceBillDownloadurlQueryRequest();
        request.setBizContent("{\"bill_type\":\"trade\",\"bill_date\":\""+ payDTO.getBillDate() + "\"}");

        AlipayDataDataserviceBillDownloadurlQueryResponse response = alipayClient.execute(request);

        // 获得下载对账单地址
        return response;
    }

    @ApiOperation(httpMethod = "POST",value = "统一收单线下交易预创建",notes = "收银员通过收银台或商户后台调用支付宝接口，生成二维码后，展示给用户，由用户扫描二维码完成订单支付。")
    @RequestMapping("aliPayQrcode")
    public Object aliPayQrcode(@RequestBody PayDTO payDTO, @ApiIgnore HttpServletRequest request, @ApiIgnore HttpServletResponse response) throws AlipayApiException {
        Object result = null;
        if(PayTypeConstant.WX.equalsIgnoreCase(payDTO.getPayType())){

        }else if(PayTypeConstant.AL.equalsIgnoreCase(payDTO.getPayType())){
            AliConfig aliConfig = new AliConfig();
            aliConfig.setAppId(payDTO.getAppId());

            List<AliConfig> aliConfigList = aliConfigService.findList(aliConfig);
            if(aliConfigList.size()==1){
                result = alipayTradeService.tradePayQrCode(payDTO,aliConfigList.get(0));

                AlipayTradePrecreateResponse alipayTradePrecreateResponse = (AlipayTradePrecreateResponse) result;
                TradeRecord tradeRecord = new TradeRecord();
                BeanUtils.copyProperties(alipayTradePrecreateResponse,tradeRecord);
                if(!alipayTradePrecreateResponse.isSuccess()){
                    tradeRecord.setRemarks(alipayTradePrecreateResponse.getSubMsg());
                }
                tradeRecord.setOutTradeNo(payDTO.getOutTradeNo());
                tradeRecord.setPayType(payDTO.getPayType());
                tradeRecordService.save(tradeRecord);
            }

        }


        return result;
    }
}
