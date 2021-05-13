/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.modules.pay.entity;

import java.util.Date;
import com.jeesite.common.mybatis.annotation.JoinTable;
import com.jeesite.common.mybatis.annotation.JoinTable.Type;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Length;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 月账单Entity
 * @author lijin
 * @version 2020-12-09
 */
@Table(name="payment_month_bill", alias="a", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="bill_date", attrName="billDate", label="账单日期"),
		@Column(name="bill_count", attrName="billCount", label="交易订单总笔数"),
		@Column(name="bill_no", attrName="billNo", label="账单号"),
		@Column(includeEntity=DataEntity.class),
		@Column(name="bill_receipt_amount", attrName="billReceiptAmount", label="商家实收"),
		@Column(name="bill_total_amount", attrName="billTotalAmount", label="订单金额"),
		@Column(name="pay_type", attrName="payType", label="支付类型"),
		@Column(name="refund_count", attrName="refundCount", label="退款订单总笔数"),
		@Column(name="app_id", attrName="appId", label="应用ID"),
	}, orderBy="a.update_date DESC"
)
public class TradeMonthBill extends DataEntity<TradeMonthBill> {
	
	private static final long serialVersionUID = 1L;
	private Date billDate;		// 账单日期
	private String billCount;		// 交易订单总笔数
	private String billNo;		// 账单号
	private String billReceiptAmount;		// 商家实收
	private String billTotalAmount;		// 订单金额
	private String payType;		// 支付类型
	private String refundCount;		// 退款订单总笔数
	private String appId;		// 应用ID
	
	public TradeMonthBill() {
		this(null);
	}

	public TradeMonthBill(String id){
		super(id);
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	
	@Length(min=0, max=255, message="交易订单总笔数长度不能超过 255 个字符")
	public String getBillCount() {
		return billCount;
	}

	public void setBillCount(String billCount) {
		this.billCount = billCount;
	}
	
	@Length(min=0, max=255, message="账单号长度不能超过 255 个字符")
	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	
	@Length(min=0, max=255, message="商家实收长度不能超过 255 个字符")
	public String getBillReceiptAmount() {
		return billReceiptAmount;
	}

	public void setBillReceiptAmount(String billReceiptAmount) {
		this.billReceiptAmount = billReceiptAmount;
	}
	
	@Length(min=0, max=255, message="订单金额长度不能超过 255 个字符")
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
	
	@Length(min=0, max=255, message="退款订单总笔数长度不能超过 255 个字符")
	public String getRefundCount() {
		return refundCount;
	}

	public void setRefundCount(String refundCount) {
		this.refundCount = refundCount;
	}
	
	@Length(min=0, max=255, message="应用ID长度不能超过 255 个字符")
	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}
	
}