package com.zebone.modules.api.service;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePayRequest;
import com.alipay.api.request.AlipayTradePrecreateRequest;
import com.alipay.api.request.AlipayTradeRefundRequest;
import com.alipay.api.response.AlipayTradePayResponse;
import com.alipay.api.response.AlipayTradePrecreateResponse;
import com.alipay.api.response.AlipayTradeRefundResponse;
import com.google.gson.Gson;
import com.zebone.modules.ali.entity.AliConfig;
import com.zebone.modules.api.dto.AlipayParam;
import com.zebone.modules.api.dto.AlipayRefuntParam;
import org.springframework.stereotype.Service;

/**
 * @author 卡卡西
 */
@Service
public class AlipayService {

    public Object tradePay(AlipayParam aliAlipayParam, AliConfig aliConfig) throws AlipayApiException {
        String gateway="";
        String appId="";
        String privateKey="";
        String alipayPublicKey="";
        if(aliConfig!=null){
            gateway = aliConfig.getGateway();
            appId = aliConfig.getAppId();
            privateKey = aliConfig.getPrivateKey();
            alipayPublicKey = aliConfig.getPayPublicKey();
        }
        String charset = "GBK";
        Gson gson = new Gson();
        String bizContent = gson.toJson(aliAlipayParam);

        // 2.1使用SDK，构建群发请求模型
        AlipayClient alipayClient = new DefaultAlipayClient(gateway, appId, privateKey, "json", charset, alipayPublicKey,"RSA2");
        AlipayTradePayRequest alipayRequest = new AlipayTradePayRequest();
        alipayRequest.setBizContent(bizContent);

        //3.使用SDK，调用交易下单接口
        AlipayTradePayResponse alipayResponse = null;
        alipayResponse = alipayClient.execute(alipayRequest);

        return alipayResponse;
    }

    public Object tradePayQrCode(AlipayParam aliAlipayParam, AliConfig aliConfig) throws AlipayApiException{
        Gson gson = new Gson();
        // 2.1使用SDK，构建群发请求模型
        AlipayClient alipayClient = alipayClient(aliAlipayParam,aliConfig);
        AlipayTradePrecreateRequest alipayRequest = new AlipayTradePrecreateRequest();
        String bizContent = gson.toJson(aliAlipayParam);
        alipayRequest.setBizContent(bizContent);
        alipayRequest.setNotifyUrl("http://kiosk.vipgz1.idcfengye.com/his/api/unite/pay/aliPayNotify");
        //3.使用SDK，调用交易下单接口
        AlipayTradePrecreateResponse alipayResponse = alipayClient.execute(alipayRequest);
        //4.获取预下单同步返回数据回传后台接口
        return alipayResponse;
    }

    private AlipayClient alipayClient(AlipayParam aliAlipayParam, AliConfig aliConfig){
        String gateway="";
        String appId="";
        String privateKey="";
        String alipayPublicKey="";
        if(aliConfig!=null){
            gateway = aliConfig.getGateway();
            appId = aliConfig.getAppId();
            privateKey = aliConfig.getPrivateKey();
            alipayPublicKey = aliConfig.getPayPublicKey();
        }
        String charset = "GBK";
        // 2.1使用SDK，构建群发请求模型
        AlipayClient alipayClient = new DefaultAlipayClient(gateway, appId, privateKey, "json", charset, alipayPublicKey,"RSA2");
        return alipayClient;
    }

    public Object refund(AlipayRefuntParam aliAlipayParam, AliConfig aliConfig) throws AlipayApiException {
        String gateway="";
        String appId="";
        String privateKey="";
        String alipayPublicKey="";
        if(aliConfig!=null){
            gateway = aliConfig.getGateway();
            appId = aliConfig.getAppId();
            privateKey = aliConfig.getPrivateKey();
            alipayPublicKey = aliConfig.getPayPublicKey();
        }
        String charset = "GBK";
        Gson gson = new Gson();
        String bizContent = gson.toJson(aliAlipayParam);

        // 2.1使用SDK，构建群发请求模型
        AlipayClient alipayClient = new DefaultAlipayClient(gateway, appId, privateKey, "json", charset, alipayPublicKey,"RSA2");
        AlipayTradeRefundRequest alipayRequest = new AlipayTradeRefundRequest ();
        alipayRequest.setBizContent(bizContent);

        //3.使用SDK，调用交易下单接口
        AlipayTradeRefundResponse response = alipayClient.execute(alipayRequest);
        if(response.isSuccess()){
            System.out.println("调用成功");
        } else {
            System.out.println("调用失败");
        }
        return response;
    }

}
