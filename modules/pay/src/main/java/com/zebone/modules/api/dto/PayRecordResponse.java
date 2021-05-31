package com.zebone.modules.api.dto;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 第三方支付数据
 */
@Data
public class PayRecordResponse {
	@ApiModelProperty(value = "支付方式、业务类型名称(银联)",required = true)
	private String settBusiName;

	@ApiModelProperty(value = "交易日期",required = true)
	// 交易日期
	private String trxDate;

	@ApiModelProperty(value = "交易时间",required = true)
	// 交易时间
	private String trxTime;

	@ApiModelProperty(value = "入账金额",required = true)
	// 入账金额
	private Double payAmount;

	@ApiModelProperty(value = "商户订单号",required = true)
	// 商户订单号
	private String merOrderNo;

	@ApiModelProperty(value = "支付交易流水号",required = true)
	// 支付交易流水号
	private String tradeNo;



}
