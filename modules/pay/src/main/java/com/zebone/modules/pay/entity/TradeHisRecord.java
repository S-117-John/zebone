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
 * 院内交易记录Entity
 * @author lijin
 * @version 2020-12-08
 */
@Table(name="biz_trade_his_record", alias="a", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="bank_trade_no", attrName="bankTradeNo", label="银行交易号"),
		@Column(includeEntity=DataEntity.class),
		@Column(name="his_trade_no", attrName="hisTradeNo", label="his交易号"),
		@Column(name="merchant_no", attrName="merchantNo", label="商户号"),
		@Column(name="pay_type", attrName="payType", label="支付类型"),
		@Column(name="subject", attrName="subject", label="支付标题"),
		@Column(name="total_amount", attrName="totalAmount", label="交易金额"),
		@Column(name="trade_date", attrName="tradeDate", label="交易日期"),
		@Column(name="trade_result", attrName="tradeResult", label="交易结果"),
	}, orderBy="a.update_date DESC"
)
public class TradeHisRecord extends DataEntity<TradeHisRecord> {
	
	private static final long serialVersionUID = 1L;
	private String bankTradeNo;		// 银行交易号
	private String hisTradeNo;		// his交易号
	private String merchantNo;		// 商户号
	private String payType;		// 支付类型
	private String subject;		// 支付标题
	private String totalAmount;		// 交易金额
	private Date tradeDate;		// 交易日期
	private String tradeResult;		// 交易结果
	
	public TradeHisRecord() {
		this(null);
	}

	public TradeHisRecord(String id){
		super(id);
	}
	
	@Length(min=0, max=255, message="银行交易号长度不能超过 255 个字符")
	public String getBankTradeNo() {
		return bankTradeNo;
	}

	public void setBankTradeNo(String bankTradeNo) {
		this.bankTradeNo = bankTradeNo;
	}
	
	@Length(min=0, max=255, message="his交易号长度不能超过 255 个字符")
	public String getHisTradeNo() {
		return hisTradeNo;
	}

	public void setHisTradeNo(String hisTradeNo) {
		this.hisTradeNo = hisTradeNo;
	}
	
	@Length(min=0, max=255, message="商户号长度不能超过 255 个字符")
	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
	
	@Length(min=0, max=255, message="支付类型长度不能超过 255 个字符")
	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}
	
	@Length(min=0, max=255, message="支付标题长度不能超过 255 个字符")
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Length(min=0, max=255, message="交易金额长度不能超过 255 个字符")
	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}
	
	@Length(min=0, max=255, message="交易结果长度不能超过 255 个字符")
	public String getTradeResult() {
		return tradeResult;
	}

	public void setTradeResult(String tradeResult) {
		this.tradeResult = tradeResult;
	}
	
	public Date getTradeDate_gte() {
		return sqlMap.getWhere().getValue("trade_date", QueryType.GTE);
	}

	public void setTradeDate_gte(Date tradeDate) {
		sqlMap.getWhere().and("trade_date", QueryType.GTE, tradeDate);
	}
	
	public Date getTradeDate_lte() {
		return sqlMap.getWhere().getValue("trade_date", QueryType.LTE);
	}

	public void setTradeDate_lte(Date tradeDate) {
		sqlMap.getWhere().and("trade_date", QueryType.LTE, tradeDate);
	}
	
}