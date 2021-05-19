package com.zebone.modules.api;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jeesite.common.shiro.realms.O;
import com.zebone.modules.api.dto.WxRefuntParam;
import com.zebone.modules.api.dto.WxpayParam;
import com.zebone.modules.api.dto.WxpayRefundParam;
import com.zebone.modules.pay.entity.TradeRecord;
import com.zebone.modules.pay.service.TradeRecordService;
import com.zebone.modules.wx.config.MyWxConfig;
import com.zebone.modules.wx.entity.WxConfig;
import com.zebone.modules.wx.sdk.WXPay;
import com.zebone.modules.wx.sdk.WXPayConfig;
import com.zebone.modules.wx.sdk.WXPayConstants;
import com.zebone.modules.wx.service.WxConfigService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping(value = "api/wx")
@Api(value = "微信支付接口",tags = "微信支付接口")
public class WxpayController {

    @Autowired
    private WxConfigService wxConfigService;

    @Autowired
    private TradeRecordService tradeRecordService;

    @ApiOperation(httpMethod = "POST",value = "付款码支付",notes = "收银员使用扫码设备读取微信用户付款码以后，二维码或条码信息会传送至商户收银台，由商户收银台或者商户后台调用该接口发起支付")
    @RequestMapping("micropay")
    public Object micropay(@RequestBody WxpayParam param){
        Map<String, String> resp = null;
        try {
            MyWxConfig config = new MyWxConfig();
            WxConfig wxConfig = new WxConfig();
            wxConfig.setAppId(param.getAppId());
            List<WxConfig> wxConfigList = wxConfigService.findList(wxConfig);
            wxConfig = wxConfigList.stream().findFirst().orElseThrow(()->new Exception("未查询到微信支付信息"));
//            WXPay wxpay = new WXPay(config, false, true);
            config.setApiKey(wxConfig.getPaySignKey());
            config.setAppId(param.getAppId());
            config.setMchId(wxConfig.getMchId());
            WXPay wxpay = new WXPay(config);
            Map<String, String> data = new HashMap<String, String>();
            data.put("body", param.getBody());
            data.put("out_trade_no", param.getOutTradeNo());
            data.put("total_fee", param.getTotalFee()+"");
            InetAddress addr = InetAddress.getLocalHost();
            data.put("spbill_create_ip", addr.getHostAddress());
            data.put("auth_code", param.getAuthCode());
            resp = wxpay.microPay(data);
            TradeRecord tradeRecord = new TradeRecord();
            tradeRecord.setPayType("1");
            tradeRecord.setOutTradeNo(param.getOutTradeNo());
            tradeRecord.setTotalAmount(param.getTotalFee()/100.00+"");
            if("FAIL".equals(MapUtils.getString(resp,"result_code"))){
                tradeRecord.setGmtPayment(new Date());
                tradeRecord.setTradeStatus("3");
                tradeRecord.setRemarks(MapUtils.getString(resp,"err_code_des"));
            }
            if("SUCCESS".equals(MapUtils.getString(resp,"result_code"))){
                tradeRecord.setTradeNo(MapUtils.getString(resp,"transaction_id"));
                tradeRecord.setReceiptAmount(MapUtils.getString(resp,"cash_fee"));
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
                tradeRecord.setGmtPayment(simpleDateFormat.parse(MapUtils.getString(resp,"time_end")));
                tradeRecord.setTradeStatus("1");

            }

            tradeRecordService.save(tradeRecord);

            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return resp;
    }

    @ApiOperation(httpMethod = "POST",value = "查询订单",notes = "该接口提供所有微信支付订单的查询，商户可以通过查询订单接口主动查询订单状态，完成下一步的业务逻辑。\n" +
            "\n" +
            "需要调用查询接口的情况：\n" +
            "\n" +
            "◆ 当商户后台、网络、服务器等出现异常；\n" +
            "◆ 调用支付接口后，返回系统错误或未知交易状态情况；\n" +
            "◆ 调用付款码支付API，返回USERPAYING的状态；\n" +
            "◆ 调用关单或撤销接口API之前，需确认支付状态")
    @RequestMapping("orderquery")
    public Object orderquery(@RequestBody WxpayParam param){
        Map<String, String> resp = null;
        try {
            MyWxConfig config = new MyWxConfig();
            WxConfig wxConfig = new WxConfig();
            wxConfig.setAppId(param.getAppId());
            List<WxConfig> wxConfigList = wxConfigService.findList(wxConfig);
            wxConfig = wxConfigList.stream().findFirst().orElseThrow(()->new Exception("未查询到微信支付信息"));
//            WXPay wxpay = new WXPay(config, false, true);
            config.setApiKey(wxConfig.getPaySignKey());
            config.setAppId(param.getAppId());
            config.setMchId(wxConfig.getMchId());
            WXPay wxpay = new WXPay(config);
            Map<String, String> data = new HashMap<String, String>();

            data.put("out_trade_no", param.getOutTradeNo());

            if(!StringUtils.isEmpty(param.getTransactionId())){
                data.put("transaction_id", param.getTransactionId());
            }

            resp = wxpay.orderQuery(data);
            TradeRecord tradeRecord = new TradeRecord();
            tradeRecord.setPayType("1");
            tradeRecord.setOutTradeNo(param.getOutTradeNo());
            if("FAIL".equals(MapUtils.getString(resp,"result_code"))){
                tradeRecord.setGmtPayment(new Date());
                tradeRecord.setTradeStatus("3");
                tradeRecord.setRemarks(MapUtils.getString(resp,"err_code_des"));
            }
            if("SUCCESS".equals(MapUtils.getString(resp,"result_code"))){
                tradeRecord.setTradeNo(MapUtils.getString(resp,"transaction_id"));
                tradeRecord.setTotalAmount(Integer.parseInt(MapUtils.getString(resp,"total_fee"))/100.00+"");
                tradeRecord.setReceiptAmount(Integer.parseInt(MapUtils.getString(resp,"cash_fee"))/100.00+"");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
                tradeRecord.setGmtPayment(simpleDateFormat.parse(MapUtils.getString(resp,"time_end")));
                tradeRecord.setTradeStatus("1");

            }

            tradeRecordService.save(tradeRecord);

            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return resp;
    }

    @ApiOperation(httpMethod = "POST",value = "Native支付",notes = "除付款码支付场景以外，商户系统先调用该接口在微信支付服务后台生成预支付交易单，返回正确的预支付交易会话标识后再按Native、JSAPI、APP等不同场景生成交易串调起支付")
    @RequestMapping("nativePay")
    public Object nativePay(@RequestBody WxpayParam param){
        Map<String, String> resp = null;
        try {
            MyWxConfig config = new MyWxConfig();
            WxConfig wxConfig = new WxConfig();
            wxConfig.setAppId(param.getAppId());
            List<WxConfig> wxConfigList = wxConfigService.findList(wxConfig);
            wxConfig = wxConfigList.stream().findFirst().orElseThrow(()->new Exception("未查询到微信支付信息"));
//            WXPay wxpay = new WXPay(config, false, true);
            config.setApiKey(wxConfig.getPaySignKey());
            config.setAppId(param.getAppId());
            config.setMchId(wxConfig.getMchId());
            WXPay wxpay = new WXPay(config);
            Map<String, String> data = new HashMap<String, String>();
            data.put("body", param.getBody());
            data.put("out_trade_no", param.getOutTradeNo());
            data.put("total_fee", param.getTotalFee()+"");
            InetAddress addr = InetAddress.getLocalHost();
            data.put("spbill_create_ip", addr.getHostAddress());
            data.put("notify_url","");
            data.put("trade_type","NATIVE");
            resp = wxpay.unifiedOrder(data);
            TradeRecord tradeRecord = new TradeRecord();
            tradeRecord.setPayType("1");
            tradeRecord.setOutTradeNo(param.getOutTradeNo());
            tradeRecord.setTotalAmount(param.getTotalFee()/100.00+"");
            if("FAIL".equals(MapUtils.getString(resp,"result_code"))){
                tradeRecord.setGmtPayment(new Date());
                tradeRecord.setTradeStatus("3");
                tradeRecord.setRemarks(MapUtils.getString(resp,"err_code_des"));
            }
            if("SUCCESS".equals(MapUtils.getString(resp,"result_code"))){
                tradeRecord.setTradeNo(MapUtils.getString(resp,"transaction_id"));
                tradeRecord.setReceiptAmount(MapUtils.getString(resp,"cash_fee"));
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
                tradeRecord.setGmtPayment(simpleDateFormat.parse(MapUtils.getString(resp,"time_end")));
                tradeRecord.setTradeStatus("1");

            }

            tradeRecordService.save(tradeRecord);

            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return resp;
    }
    @ApiOperation(httpMethod = "POST",value = "申请退款",notes = "当交易发生之后一年内，由于买家或者卖家的原因需要退款时，卖家可以通过退款接口将支付金额退还给买家，微信支付将在收到退款请求并且验证成功之后，将支付款按原路退还至买家账号上。")
    @RequestMapping("wxRefund")
    public Map<String,String> wxRefund(@RequestBody WxRefuntParam wxRefuntParam){
        Map<String,String> map=new LinkedHashMap<>();
        Map<String,String> data=new LinkedHashMap<>();
        boolean flag=false;
        Map<String,String> res=null;
        try {
            //微信订单号
            if (StringUtils.hasText(wxRefuntParam.getTransactionId())){
                data.put("transaction_id",wxRefuntParam.getTransactionId());
                flag=true;
            }
            //商户订单号
            if (StringUtils.hasText(wxRefuntParam.getOutRefundNo())){
                data.put("out_trade_no",wxRefuntParam.getOutRefundNo());
                flag=true;
            }
            if (flag){
                TradeRecord tradeRecord=new TradeRecord();
                tradeRecord.setOutTradeNo(wxRefuntParam.getOutRefundNo());
                tradeRecord.setTradeNo(wxRefuntParam.getTransactionId());
                tradeRecord = tradeRecordService.get(tradeRecord);
                if (tradeRecord==null){
                    throw new Exception("查询不到此笔订单");
                }
                //商户退款单号
                data.put("outRefundNo",wxRefuntParam.getOutRefundNo());
                //退款原因
                data.put("reason",wxRefuntParam.getReason());
                //退款金额
                Map<String,Object> amount=new LinkedHashMap<>();
                amount.put("refund",wxRefuntParam.getRefund());
                //交易金额
                amount.put("total",tradeRecord.getTotalAmount());
                //币种
                amount.put("currency","CNY");
                String json = (String) JSON.toJSONString(amount);
                data.put("amount",json);
                //发起退款
                MyWxConfig config = new MyWxConfig();
                WXPay wxPay=new WXPay(config);
                res=wxPay.refund(data);
                //退款完毕，将记录持久化
                tradeRecord = new TradeRecord();
                tradeRecord.setPayType("1");
                tradeRecord.setOutTradeNo(wxRefuntParam.getOutTradeNo());
                if("FAIL".equals(MapUtils.getString(res,"result_code"))){
                    tradeRecord.setGmtPayment(new Date());
                    tradeRecord.setTradeStatus("3");
                    tradeRecord.setRemarks(MapUtils.getString(res,"err_code_des"));
                }
                if("SUCCESS".equals(MapUtils.getString(res,"result_code"))){
                    tradeRecord.setTradeNo(MapUtils.getString(res,"transaction_id"));
                    Map<String,String> maps = (Map<String, String>) JSONObject.parse(res.get("amount"));
                    Integer refund = Integer.valueOf(maps.get("refund"));
                    tradeRecord.setTotalAmount(String.valueOf(refund));
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
                    tradeRecord.setGmtPayment(simpleDateFormat.parse(MapUtils.getString(res,"time_end")));
                    tradeRecord.setTradeStatus("1");
                }
                tradeRecordService.save(tradeRecord);
            }else{
                throw new Exception("微信订单号和商户订单号不能同时为空");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return res;
    }

    @ApiOperation(httpMethod = "POST",value = "申请退款",notes = "当交易发生之后一段时间内，由于买家或者卖家的原因需要退款时，卖家可以通过退款接口将支付款退还给买家，微信支付将在收到退款请求并且验证成功之后，按照退款规则将支付款按原路退到买家账号上")
    @RequestMapping("refund")
    public Object refund(@RequestBody WxpayRefundParam param){
        Map<String, String> resp = null;
        try {

            WxConfig wxConfig = new WxConfig();
            wxConfig.setAppId(param.getAppId());
            List<WxConfig> wxConfigList = wxConfigService.findList(wxConfig);
            wxConfig = wxConfigList.stream().findFirst().orElseThrow(()->new Exception("未查询到微信支付信息"));

            MyWxConfig config = new MyWxConfig(wxConfig.getCertificatePath());
            config.setApiKey(wxConfig.getPaySignKey());
            config.setAppId(param.getAppId());
            config.setMchId(wxConfig.getMchId());
            WXPay wxpay = new WXPay(config);
            Map<String, String> data = new HashMap<String, String>();
            //商户订单号
            data.put("out_trade_no", param.getOutTradeNo());
            //微信支付订单号
            data.put("transaction_id",param.getTransactionId());

            //商户退款单号
            data.put("out_refund_no","");

            //订单金额
            data.put("total_fee", param.getTotalFee()+"");

            //退款金额
            data.put("refund_fee",param.getTotalFee()+"");


            resp = wxpay.refund(data);
            TradeRecord tradeRecord = new TradeRecord();
            tradeRecord.setPayType("1");
            tradeRecord.setOutTradeNo(param.getOutTradeNo());
            tradeRecord.setTotalAmount(param.getTotalFee()/100.00+"");
            if("FAIL".equals(MapUtils.getString(resp,"result_code"))){
                tradeRecord.setGmtPayment(new Date());
                tradeRecord.setTradeStatus("3");
                tradeRecord.setRemarks(MapUtils.getString(resp,"err_code_des"));
            }
            if("SUCCESS".equals(MapUtils.getString(resp,"result_code"))){
                tradeRecord.setTradeNo(MapUtils.getString(resp,"transaction_id"));
                tradeRecord.setReceiptAmount(MapUtils.getString(resp,"cash_fee"));
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
                tradeRecord.setGmtPayment(simpleDateFormat.parse(MapUtils.getString(resp,"time_end")));
                tradeRecord.setTradeStatus("1");

            }

            tradeRecordService.save(tradeRecord);

            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return resp;
    }
}
