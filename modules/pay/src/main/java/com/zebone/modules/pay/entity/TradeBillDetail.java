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
 * 账单明细Entity
 * @author lijin
 * @version 2020-12-09
 */
@Table(name="payment_detail_bill", alias="a", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="bill_amount", attrName="billAmount", label="订单金额"),
		@Column(name="bill_no", attrName="billNo", label="账单号"),
		@Column(name="biz_type", attrName="bizType", label="业务类型"),
		@Column(name="buyer_id", attrName="buyerId", label="买家账号"),
		@Column(includeEntity=DataEntity.class),
		@Column(name="out_trade_no", attrName="outTradeNo", label="商户交易号"),
		@Column(name="product_name", attrName="productName", label="商品名称", queryType=QueryType.LIKE),
		@Column(name="receipt_amount", attrName="receiptAmount", label="实收金额"),
		@Column(name="refund_batch_no", attrName="refundBatchNo", label="退款批次号"),
		@Column(name="trade_create_time", attrName="tradeCreateTime", label="交易创建时间"),
		@Column(name="trade_end_time", attrName="tradeEndTime", label="交易完成时间"),
		@Column(name="trade_no", attrName="tradeNo", label="交易号"),
	}, orderBy="a.update_date DESC"
)
public class TradeBillDetail extends DataEntity<TradeBillDetail> {
	
	private static final long serialVersionUID = 1L;
	private String billAmount;		// 订单金额
	private String billNo;		// 账单号
	private String bizType;		// 业务类型
	private String buyerId;		// 买家账号
	private String outTradeNo;		// 商户交易号
	private String productName;		// 商品名称
	private String receiptAmount;		// 实收金额
	private String refundBatchNo;		// 退款批次号
	private Date tradeCreateTime;		// 交易创建时间
	private Date tradeEndTime;		// 交易完成时间
	private String tradeNo;		// 交易号

	/**
	 * 对账结果
	 */
	private String billResult;

	public String getBillResult() {
		return billResult;
	}

	public void setBillResult(String billResult) {
		this.billResult = billResult;
	}

	public TradeBillDetail() {
		this(null);
	}

	public TradeBillDetail(String id){
		super(id);
	}
	
	@Length(min=0, max=255, message="订单金额长度不能超过 255 个字符")
	public String getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}
	
	@Length(min=0, max=255, message="账单号长度不能超过 255 个字符")
	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	
	@Length(min=0, max=255, message="业务类型长度不能超过 255 个字符")
	public String getBizType() {
		return bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	
	@Length(min=0, max=255, message="买家账号长度不能超过 255 个字符")
	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	
	@Length(min=0, max=255, message="商户交易号长度不能超过 255 个字符")
	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	
	@Length(min=0, max=255, message="商品名称长度不能超过 255 个字符")
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	@Length(min=0, max=255, message="实收金额长度不能超过 255 个字符")
	public String getReceiptAmount() {
		return receiptAmount;
	}

	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}
	
	@Length(min=0, max=255, message="退款批次号长度不能超过 255 个字符")
	public String getRefundBatchNo() {
		return refundBatchNo;
	}

	public void setRefundBatchNo(String refundBatchNo) {
		this.refundBatchNo = refundBatchNo;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getTradeCreateTime() {
		return tradeCreateTime;
	}

	public void setTradeCreateTime(Date tradeCreateTime) {
		this.tradeCreateTime = tradeCreateTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getTradeEndTime() {
		return tradeEndTime;
	}

	public void setTradeEndTime(Date tradeEndTime) {
		this.tradeEndTime = tradeEndTime;
	}
	
	@Length(min=0, max=255, message="交易号长度不能超过 255 个字符")
	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public Date getTradeCreateTime_gte() {
		return sqlMap.getWhere().getValue("trade_create_time", QueryType.GTE);
	}

	public void setTradeCreateTime_gte(Date tradeCreateTime) {
		sqlMap.getWhere().and("trade_create_time", QueryType.GTE, tradeCreateTime);
	}
	
	public Date getTradeCreateTime_lte() {
		return sqlMap.getWhere().getValue("trade_create_time", QueryType.LTE);
	}

	public void setTradeCreateTime_lte(Date tradeCreateTime) {
		sqlMap.getWhere().and("trade_create_time", QueryType.LTE, tradeCreateTime);
	}
	
	public Date getTradeEndTime_gte() {
		return sqlMap.getWhere().getValue("trade_end_time", QueryType.GTE);
	}

	public void setTradeEndTime_gte(Date tradeEndTime) {
		sqlMap.getWhere().and("trade_end_time", QueryType.GTE, tradeEndTime);
	}
	
	public Date getTradeEndTime_lte() {
		return sqlMap.getWhere().getValue("trade_end_time", QueryType.LTE);
	}

	public void setTradeEndTime_lte(Date tradeEndTime) {
		sqlMap.getWhere().and("trade_end_time", QueryType.LTE, tradeEndTime);
	}
	
}