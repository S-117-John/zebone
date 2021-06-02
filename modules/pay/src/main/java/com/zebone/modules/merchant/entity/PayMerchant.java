/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.modules.merchant.entity;

import org.hibernate.validator.constraints.Length;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 商户信息Entity
 * @author lijin
 * @version 2020-12-08
 */
@Table(name="payment_merchant", alias="a", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(includeEntity=DataEntity.class),
		@Column(name="merchant_no", attrName="merchantNo", label="商户编号"),
		@Column(name="name", attrName="name", label="商户名称", queryType=QueryType.LIKE),
	}, orderBy="a.update_date DESC"
)
public class PayMerchant extends DataEntity<PayMerchant> {
	
	private static final long serialVersionUID = 1L;
	private String merchantNo;		// 商户编号
	private String name;		// 商户名称
	
	public PayMerchant() {
		this(null);
	}

	public PayMerchant(String id){
		super(id);
	}
	
	@Length(min=0, max=255, message="商户编号长度不能超过 255 个字符")
	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
	
	@Length(min=0, max=255, message="商户名称长度不能超过 255 个字符")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}