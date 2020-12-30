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
 * 日账单Entity
 * @author lijin
 * @version 2020-12-09
 */
@Table(name="biz_trade_day_bill", alias="a", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="app_id", attrName="appId", label="应用ID"),
		@Column(name="bill_count", attrName="billCount", label="交易笔数"),
		@Column(name="bill_date", attrName="billDate", label="账单日期"),
		@Column(name="bill_no", attrName="billNo", label="账单号"),
		@Column(name="bill_receipt_amount", attrName="billReceiptAmount", label="实收金额"),
		@Column(name="bill_total_amount", attrName="billTotalAmount", label="账单金额"),
		@Column(includeEntity=DataEntity.class),
		@Column(name="pay_type", attrName="payType", label="支付类型"),
		@Column(name="refund_count", attrName="refundCount", label="退款笔数"),
	}, orderBy="a.update_date DESC"
)
public class TradeDayBill extends DataEntity<TradeDayBill> {
	
	private static final long serialVersionUID = 1L;
	private String appId;		// 应用ID
	private String billCount;		// 交易笔数
	private Date billDate;		// 账单日期
	private String billNo;		// 账单号
	private String billReceiptAmount;		// 实收金额
	private String billTotalAmount;		// 账单金额
	private String payType;		// 支付类型
	private String refundCount;		// 退款笔数
	
	public TradeDayBill() {
		this(null);
	}

	public TradeDayBill(String id){
		super(id);
	}
	
	@Length(min=0, max=255, message="应用ID长度不能超过 255 个字符")
	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}
	
	@Length(min=0, max=255, message="交易笔数长度不能超过 255 个字符")
	public String getBillCount() {
		return billCount;
	}

	public void setBillCount(String billCount) {
		this.billCount = billCount;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	
	@Length(min=0, max=255, message="账单号长度不能超过 255 个字符")
	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	
	@Length(min=0, max=255, message="实收金额长度不能超过 255 个字符")
	public String getBillReceiptAmount() {
		return billReceiptAmount;
	}

	public void setBillReceiptAmount(String billReceiptAmount) {
		this.billReceiptAmount = billReceiptAmount;
	}
	
	@Length(min=0, max=255, message="账单金额长度不能超过 255 个字符")
	public String getBillTotalAmount() {
		return billTotalAmount;
	}

	public void setBillTotalAmount(String billTotalAmount) {
		this.billTotalAmount = billTotalAmount;
	}
	
	@Length(min=0, max=255, message="支付类型长度不能超过 255 个字符")
	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}
	
	@Length(min=0, max=255, message="退款笔数长度不能超过 255 个字符")
	public String getRefundCount() {
		return refundCount;
	}

	public void setRefundCount(String refundCount) {
		this.refundCount = refundCount;
	}
	
}