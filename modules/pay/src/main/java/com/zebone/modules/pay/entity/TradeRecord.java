/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.modules.pay.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.jeesite.common.mybatis.annotation.JoinTable;
import com.jeesite.common.mybatis.annotation.JoinTable.Type;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 交易记录Entity
 * @author lijin
 * @version 2020-12-08
 */
@Table(name="payment_record_trade", alias="a", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="pay_type", attrName="payType", label="支付方式"),
		@Column(name="out_trade_no", attrName="outTradeNo", label="商户订单号"),
		@Column(name="trade_no", attrName="tradeNo", label="交易号"),
		@Column(name="total_amount", attrName="totalAmount", label="交易金额"),
		@Column(name="receipt_amount", attrName="receiptAmount", label="实收金额"),
		@Column(name="gmt_payment", attrName="gmtPayment", label="交易时间"),
		@Column(name="trade_status", attrName="tradeStatus", label="交易状态"),
		@Column(includeEntity=DataEntity.class),
		@Column(name="buyer_logon_id", attrName="buyerLogonId", label="买家账号"),
		@Column(name="buyer_user_id", attrName="buyerUserId", label="买家用户id"),
		@Column(name="app_id", attrName="appId", label="app id"),
	}, orderBy="a.update_date DESC"
)
public class TradeRecord extends DataEntity<TradeRecord> {
	
	private static final long serialVersionUID = 1L;
	private String payType;		// 支付方式
	private String outTradeNo;		// 商户订单号
	private String tradeNo;		// 交易号
	private String totalAmount;		// 交易金额
	private String receiptAmount;		// 实收金额
	private Date gmtPayment;		// 交易时间
	private String tradeStatus;		// 交易状态1:支付成功2：退款成功3：交易失败4：退款失败,5:预创建成功，6:预创建失败
	private String buyerLogonId;		// 买家账号
	private String buyerUserId;		// 买家用户id
	private String appId;

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public TradeRecord() {
		this(null);
	}

	public TradeRecord(String id){
		super(id);
	}
	
	@Length(min=0, max=255, message="支付方式长度不能超过 255 个字符")
	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}
	
	@Length(min=0, max=255, message="商户订单号长度不能超过 255 个字符")
	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	
	@Length(min=0, max=255, message="交易号长度不能超过 255 个字符")
	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	@Length(min=0, max=255, message="交易金额长度不能超过 255 个字符")
	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	@Length(min=0, max=255, message="实收金额长度不能超过 255 个字符")
	public String getReceiptAmount() {
		return receiptAmount;
	}

	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getGmtPayment() {
		return gmtPayment;
	}

	public void setGmtPayment(Date gmtPayment) {
		this.gmtPayment = gmtPayment;
	}
	
	@Length(min=0, max=255, message="交易状态长度不能超过 255 个字符")
	public String getTradeStatus() {
		return tradeStatus;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	
	@Length(min=0, max=255, message="买家账号长度不能超过 255 个字符")
	public String getBuyerLogonId() {
		return buyerLogonId;
	}

	public void setBuyerLogonId(String buyerLogonId) {
		this.buyerLogonId = buyerLogonId;
	}
	
	@Length(min=0, max=255, message="买家用户id长度不能超过 255 个字符")
	public String getBuyerUserId() {
		return buyerUserId;
	}

	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	
	public Date getGmtPayment_gte() {
		return sqlMap.getWhere().getValue("gmt_payment", QueryType.GTE);
	}

	public void setGmtPayment_gte(Date gmtPayment) {
		sqlMap.getWhere().and("gmt_payment", QueryType.GTE, gmtPayment);
	}
	
	public Date getGmtPayment_lte() {
		return sqlMap.getWhere().getValue("gmt_payment", QueryType.LTE);
	}

	public void setGmtPayment_lte(Date gmtPayment) {
		sqlMap.getWhere().and("gmt_payment", QueryType.LTE, gmtPayment);
	}
	
	public Date getCreateDate_gte() {
		return sqlMap.getWhere().getValue("create_date", QueryType.GTE);
	}

	public void setCreateDate_gte(Date createDate) {
		sqlMap.getWhere().and("create_date", QueryType.GTE, createDate);
	}
	
	public Date getCreateDate_lte() {
		return sqlMap.getWhere().getValue("create_date", QueryType.LTE);
	}

	public void setCreateDate_lte(Date createDate) {
		sqlMap.getWhere().and("create_date", QueryType.LTE, createDate);
	}
	
}