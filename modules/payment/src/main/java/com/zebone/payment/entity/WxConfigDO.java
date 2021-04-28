package com.zebone.payment.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "biz_wx_config")
public class WxConfigDO {

    @Id
    private String id;

    /**
     * 应用ID
     */
//    @Column(name = "app_id")
    private String appId;

    /**
     * 应用名称
     */
//    @Column(name = "app_name")
    private String appName;

    /**
     * 开发者密钥
     */
//    @Column(name = "app_secret")
    private String appSecret;

    /**
     * 证书地址
     */
//    @Column(name = "certificate_path")
    private String certificatePath;

    /**
     * 商户ID
     */
//    @Column(name = "mch_id")
    private String mchId;

    /**
     * 平台商户号
     */
//    @Column(name = "merchant_id")
    private String merchantId;

    /**
     * 支付密钥
     */
//    @Column(name = "pay_sign_key")
    private String paySignKey;

    /**
     * token
     */
//    @Column(name = "token")
    private String token;
}
