package com.zebone.payment;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.wechat.pay.contrib.apache.httpclient.WechatPayHttpClientBuilder;
import com.zebone.payment.config.MyWxConfig;
import com.zebone.payment.entity.WxConfigDO;
import com.zebone.payment.repository.WxConfigRepository;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

@RestController
@RequestMapping("api")
public class TestController {
    @Autowired
    private WxConfigRepository wxConfigRepository;
    @GetMapping("index")
    public String index() throws IOException {
        String appId = "wx0402a678abdc05c8";

            SimpleDateFormat simpleDateFormatBill = new SimpleDateFormat("yyyyMMdd");
            //微信账单
        try {
            MyWxConfig config = new MyWxConfig();
        } catch (Exception e) {
            e.printStackTrace();
        }
        WxConfigDO wxConfig = wxConfigRepository.findById(appId).get();
        return "";
    }
}
