package com.zebone.modules.api;


import com.zebone.modules.api.dto.WxpayParam;
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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
                data.put("transaction_id", param.getOutTradeNo());
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

}
