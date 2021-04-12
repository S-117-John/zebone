package com.zebone.payment;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.wechat.pay.contrib.apache.httpclient.WechatPayHttpClientBuilder;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

@RestController
@RequestMapping("api")
public class TestController {

    @GetMapping("index")
    public String index() throws IOException {
//        //...
//        WechatPayHttpClientBuilder builder = WechatPayHttpClientBuilder.create()
//                .withMerchant(merchantId, merchantSerialNumber, merchantPrivateKey)
//                .withWechatpay(wechatpayCertificates);
//
//        // 通过WechatPayHttpClientBuilder构造的HttpClient，会自动的处理签名和验签
//        HttpClient httpClient = builder.build();
//        HttpPost httpPost = new HttpPost("https://api.mch.weixin.qq.com/v3/pay/transactions/jsapi");
//        httpPost.addHeader("Accept", "application/json");
//        httpPost.addHeader("Content-type","application/json; charset=utf-8");
//
//        ByteArrayOutputStream bos = new ByteArrayOutputStream();
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        ObjectNode rootNode = objectMapper.createObjectNode();
//        rootNode.put("mchid","1900009191")
//                .put("appid", "wxd678efh567hg6787")
//                .put("description", "Image形象店-深圳腾大-QQ公仔")
//                .put("notify_url", "https://www.weixin.qq.com/wxpay/pay.php")
//                .put("out_trade_no", "1217752501201407033233368018");
//        rootNode.putObject("amount")
//                .put("total", 1);
//        rootNode.putObject("payer")
//                .put("openid", "oUpF8uMuAJO_M2pxb1Q9zNjWeS6o");
//
//        objectMapper.writeValue(bos, rootNode);
//
//        httpPost.setEntity(new StringEntity(bos.toString("UTF-8")));
//        CloseableHttpResponse response = httpClient.execute(httpPost);
//
//        String bodyAsString = EntityUtils.toString(response.getEntity());
//        System.out.println(bodyAsString);
//        return "hello";
        return "";
    }
}
