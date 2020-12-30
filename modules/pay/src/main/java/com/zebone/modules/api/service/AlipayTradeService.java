package com.zebone.modules.api.service;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePayRequest;
import com.alipay.api.request.AlipayTradePrecreateRequest;
import com.alipay.api.response.AlipayTradePayResponse;
import com.alipay.api.response.AlipayTradePrecreateResponse;
import com.google.gson.Gson;
import com.zebone.modules.ali.entity.AliConfig;
import com.zebone.modules.api.dto.PayDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlipayTradeService {

    public Object tradePay(PayDTO aliPayDTO, AliConfig aliConfig) throws AlipayApiException {
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
        String bizContent = gson.toJson(aliPayDTO);

        // 2.1使用SDK，构建群发请求模型
        AlipayClient alipayClient = new DefaultAlipayClient(gateway, appId, privateKey, "json", charset, alipayPublicKey,"RSA2");
        AlipayTradePayRequest alipayRequest = new AlipayTradePayRequest();
        alipayRequest.setBizContent(bizContent);

        //3.使用SDK，调用交易下单接口
        AlipayTradePayResponse alipayResponse = null;
        alipayResponse = alipayClient.execute(alipayRequest);

        return alipayResponse;
    }

    public Object tradePayQrCode(PayDTO aliPayDTO, AliConfig aliConfig) throws AlipayApiException{
        Gson gson = new Gson();
        // 2.1使用SDK，构建群发请求模型
        AlipayClient alipayClient = alipayClient(aliPayDTO,aliConfig);
        AlipayTradePrecreateRequest alipayRequest = new AlipayTradePrecreateRequest();
        String bizContent = gson.toJson(aliPayDTO);
        alipayRequest.setBizContent(bizContent);
        alipayRequest.setNotifyUrl("http://kiosk.vipgz1.idcfengye.com/his/api/unite/pay/aliPayNotify");
        //3.使用SDK，调用交易下单接口
        AlipayTradePrecreateResponse alipayResponse = alipayClient.execute(alipayRequest);
        //4.获取预下单同步返回数据回传后台接口
        return alipayResponse;
    }

    private AlipayClient alipayClient(PayDTO aliPayDTO,AliConfig aliConfig){
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

}
