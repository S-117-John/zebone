package com.zebone.modules.api.dto;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PayDTO {

    /**
     * 支付类型
     */
    @ApiModelProperty(value = "支付类型",example = "微信：1，支付宝：2")
    private String payType;


    /**
     * 应用ID
     */
    @ApiModelProperty(value = "应用ID",required = true,example = "2021002111634604")
    private String appId;
    /**
     * 商户订单号
     */
    @ApiModelProperty(value = "商户订单号",required = true)
    @SerializedName("out_trade_no")
    private String outTradeNo;


    /**
     * 支付场景
     * 条码支付，取值：bar_code
     * 声波支付，取值：wave_code
     */
    @ApiModelProperty(value = "支付场景")
    private String scene = "bar_code";

    /**
     * 支付授权码
     */
    @ApiModelProperty(value = "支付授权码",required = true)
    @SerializedName("auth_code")
    private String authCode;

    /**
     * 商品标题/交易标题/订单标题/订单关键字等。
     * 注意：不可使用特殊字符，如 /，=，& 等。
     */
    @ApiModelProperty(value = "商品标题/交易标题/订单标题/订单关键字等。注意：不可使用特殊字符，如 /，=，& 等",required = true)
    private String subject;

    /**
     * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
     */
    @ApiModelProperty(value = "订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]",required = true)
    @SerializedName("total_amount")
    private String totalAmount;

    /**
     * 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
     */
    @ApiModelProperty(value = "需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数")
    @SerializedName("refund_amount")
    private String refundAmount;

    @ApiModelProperty(value = "交易号")
    @SerializedName("trade_no")
    private String tradeNo;

    /**
     * 账单类型，商户通过接口或商户经开放平台授权后其所属服务商通过接口可以获取以下账单类型：trade、signcustomer；trade指商户基于支付宝交易收单的业务账单；signcustomer是指基于商户支付宝余额收入及支出等资金变动的帐务账单。
     */
    @ApiModelProperty(value = "账单类型，商户通过接口或商户经开放平台授权后其所属服务商通过接口可以获取以下账单类型：trade、signcustomer；trade指商户基于支付宝交易收单的业务账单；signcustomer是指基于商户支付宝余额收入及支出等资金变动的帐务账单。")
    @SerializedName("bill_type")
    private String billType;

    /**
     * 账单时间：日账单格式为yyyy-MM-dd，最早可下载2016年1月1日开始的日账单；月账单格式为yyyy-MM，最早可下载2016年1月开始的月账单。
     */
    @ApiModelProperty(value = "账单时间：日账单格式为yyyy-MM-dd，最早可下载2016年1月1日开始的日账单；月账单格式为yyyy-MM，最早可下载2016年1月开始的月账单")
    @SerializedName("bill_date")
    private String billDate;
}
