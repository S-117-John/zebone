package com.zebone.payment.config;




import com.zebone.payment.sdk.IWXPayDomain;
import com.zebone.payment.sdk.WXPayConfig;
import com.zebone.payment.sdk.WXPayConstants;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class MyWxConfig extends WXPayConfig {

    private byte[] certData;

    private String appId;

    private String mchId;

    private String apiKey;

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public MyWxConfig() throws Exception {
//        String certPath = "/path/to/apiclient_cert.p12";
//        File file = new File(certPath);
//        InputStream certStream = new FileInputStream(file);
//        this.certData = new byte[(int) file.length()];
//        certStream.read(this.certData);
//        certStream.close();
    }


    /**
     * 获取 App ID
     *
     * @return App ID
     */
    @Override
    public String getAppID() {
        return this.appId;
    }

    /**
     * 获取 Mch ID
     *
     * @return Mch ID
     */
    @Override
    public String getMchID() {
        return this.mchId;
    }

    /**
     * 获取 API 密钥
     *
     * @return API密钥
     */
    @Override
    public String getKey() {
        return this.apiKey;
    }

    /**
     * 获取商户证书内容
     *
     * @return 商户证书内容
     */
    @Override
    public InputStream getCertStream() {
        ByteArrayInputStream certBis = new ByteArrayInputStream(this.certData);
        return certBis;
    }

    /**
     * 获取WXPayDomain, 用于多域名容灾自动切换
     *
     * @return
     */
    @Override
    public IWXPayDomain getWXPayDomain() {
        // 这个方法需要这样实现, 否则无法正常初始化WXPay
        IWXPayDomain iwxPayDomain = new IWXPayDomain() {

            @Override
            public void report(String domain, long elapsedTimeMillis, Exception ex) {

            }

            @Override
            public DomainInfo getDomain(WXPayConfig config) {
                return new IWXPayDomain.DomainInfo(WXPayConstants.DOMAIN_API, true);
            }
        };
        return iwxPayDomain;

    }


}
