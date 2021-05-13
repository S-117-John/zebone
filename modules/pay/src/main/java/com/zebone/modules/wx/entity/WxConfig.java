/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.modules.wx.entity;

import org.hibernate.validator.constraints.Length;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 微信配置Entity
 * @author lijin
 * @version 2020-12-08
 */
@Table(name="payment_wx_config", alias="a", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="app_id", attrName="appId", label="应用ID"),
		@Column(name="app_name", attrName="appName", label="应用名称", queryType=QueryType.LIKE),
		@Column(name="app_secret", attrName="appSecret", label="开发者密钥"),
		@Column(name="certificate_path", attrName="certificatePath", label="证书地址"),
		@Column(includeEntity=DataEntity.class),
		@Column(name="mch_id", attrName="mchId", label="商户ID"),
		@Column(name="merchant_id", attrName="merchantId", label="平台商户号"),
		@Column(name="pay_sign_key", attrName="paySignKey", label="支付密钥"),
		@Column(name="token", attrName="token", label="token"),
	}, orderBy="a.update_date DESC"
)
public class WxConfig extends DataEntity<WxConfig> {
	
	private static final long serialVersionUID = 1L;
	private String appId;		// 应用ID
	private String appName;		// 应用名称
	private String appSecret;		// 开发者密钥
	private String certificatePath;		// 证书地址
	private String mchId;		// 商户ID
	private String merchantId;		// 平台商户号
	private String paySignKey;		// 支付密钥
	private String token;		// token
	
	public WxConfig() {
		this(null);
	}

	public WxConfig(String id){
		super(id);
	}
	
	@Length(min=0, max=255, message="应用ID长度不能超过 255 个字符")
	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}
	
	@Length(min=0, max=255, message="应用名称长度不能超过 255 个字符")
	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	
	@Length(min=0, max=255, message="开发者密钥长度不能超过 255 个字符")
	public String getAppSecret() {
		return appSecret;
	}

	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}
	
	@Length(min=0, max=255, message="证书地址长度不能超过 255 个字符")
	public String getCertificatePath() {
		return certificatePath;
	}

	public void setCertificatePath(String certificatePath) {
		this.certificatePath = certificatePath;
	}
	
	@Length(min=0, max=255, message="商户ID长度不能超过 255 个字符")
	public String getMchId() {
		return mchId;
	}

	public void setMchId(String mchId) {
		this.mchId = mchId;
	}
	
	@Length(min=0, max=255, message="平台商户号长度不能超过 255 个字符")
	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	
	@Length(min=0, max=255, message="支付密钥长度不能超过 255 个字符")
	public String getPaySignKey() {
		return paySignKey;
	}

	public void setPaySignKey(String paySignKey) {
		this.paySignKey = paySignKey;
	}
	
	@Length(min=0, max=255, message="token长度不能超过 255 个字符")
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
}