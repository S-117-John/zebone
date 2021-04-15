package com.zebone.modules.ali.service;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayDataDataserviceBillDownloadurlQueryRequest;
import com.alipay.api.response.AlipayDataDataserviceBillDownloadurlQueryResponse;
import com.google.gson.Gson;
import com.zebone.modules.ali.entity.AliConfig;
import com.zebone.modules.api.dto.AlipayBillParam;
import com.zebone.modules.api.dto.AlipayParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AliPayService {

    @Autowired
    private AliConfigService aliConfigService;

    public String downLoadAliBill(String billDate, String appId) throws AlipayApiException {
        String filePath = "";
        String jsonStr = "";
        String gateway = "";
        String privateKey = "";
        String aliPublicKey = "";
        String alipayPublicKey = "";
        AliConfig ac = new AliConfig();
        ac.setAppId(appId);
        List<AliConfig> aliConfigList = aliConfigService.findList(ac);
        if(aliConfigList.size()==1){
            ac = aliConfigList.get(0);
        }
        if (ac != null) {
            gateway = ac.getGateway();
            appId = ac.getAppId();
            privateKey = ac.getPrivateKey();
            aliPublicKey = ac.getPayPublicKey();
        }
        AlipayBillParam alipayParam = new AlipayBillParam();
        alipayParam.setBillType("trade");
        alipayParam.setBillDate(billDate);
        String strType = "json";// 数据格式
        String chartType = "utf-8";// 编码格式
        Gson gson = new Gson();
        String bizContent = gson.toJson(alipayParam);
        // 支付宝公钥
        AlipayClient alipayClient = new DefaultAlipayClient(gateway, appId, privateKey, strType, chartType, aliPublicKey,"RSA2");
        AlipayDataDataserviceBillDownloadurlQueryRequest request = new AlipayDataDataserviceBillDownloadurlQueryRequest();
        request.setBizContent("{\"bill_type\":\"trade\",\"bill_date\":\""+ alipayParam.getBillDate() + "\"}");

        AlipayDataDataserviceBillDownloadurlQueryResponse response = alipayClient.execute(request);

        // 获得下载对账单地址
        return response.getBillDownloadUrl();
    }

}
