/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.modules.ali.entity;

import org.hibernate.validator.constraints.Length;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 支付宝配置Entity
 * @author lijin
 * @version 2020-12-08
 */
@Table(name="payment_ali_config", alias="a", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="app_id", attrName="appId", label="应用ID"),
		@Column(name="app_name", attrName="appName", label="应用名称", queryType=QueryType.LIKE),
		@Column(name="gateway", attrName="gateway", label="支付宝网关"),
		@Column(name="merchant_id", attrName="merchantId", label="商户"),
		@Column(name="partner", attrName="partner", label="partner"),
		@Column(name="pay_public_key", attrName="payPublicKey", label="支付公钥"),
		@Column(name="private_key", attrName="privateKey", label="应用私钥"),
		@Column(name="public_key", attrName="publicKey", label="应用公钥"),
		@Column(includeEntity=DataEntity.class),
	}, orderBy="a.update_date DESC"
)
public class AliConfig extends DataEntity<AliConfig> {
	
	private static final long serialVersionUID = 1L;
	private String appId;		// 应用ID
	private String appName;		// 应用名称
	private String gateway;		// 支付宝网关
	private String merchantId;		// 商户
	private String partner;		// partner
	private String payPublicKey;		// 支付公钥
	private String privateKey;		// 应用私钥
	private String publicKey;		// 应用公钥
	
	public AliConfig() {
		this(null);
	}

	public AliConfig(String id){
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
	
	@Length(min=0, max=255, message="支付宝网关长度不能超过 255 个字符")
	public String getGateway() {
		return gateway;
	}

	public void setGateway(String gateway) {
		this.gateway = gateway;
	}
	
	@Length(min=0, max=255, message="商户长度不能超过 255 个字符")
	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	
	@Length(min=0, max=255, message="partner长度不能超过 255 个字符")
	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}
	
	@Length(min=0, max=3000, message="支付公钥长度不能超过 3000 个字符")
	public String getPayPublicKey() {
		return payPublicKey;
	}

	public void setPayPublicKey(String payPublicKey) {
		this.payPublicKey = payPublicKey;
	}
	
	@Length(min=0, max=3000, message="应用私钥长度不能超过 3000 个字符")
	public String getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}
	
	@Length(min=0, max=3000, message="应用公钥长度不能超过 3000 个字符")
	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}
	
}