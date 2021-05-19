package com.zebone.modules.api.dto;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class WxpayParam {

    @ApiModelProperty(value = "app id",required = true)
    @SerializedName("appid")
    private String appId;

    @ApiModelProperty(hidden = true)
    @SerializedName("mch_id")
    private String mchId;

    /**
     * 商品描述
     */
    @ApiModelProperty(value = "商品描述",required = true)
    @SerializedName("body")
    private String body;

    /**
     * 商户订单号
     */
    @SerializedName("out_trade_no")
    private String outTradeNo;

    /**
     *订单金额
     */
    @ApiModelProperty(value = "订单金额",required = true)
    @SerializedName("total_fee")
    private Integer totalFee;

    /**
     * 付款吗
     */
    @ApiModelProperty(value = "付款码",required = true)
    @SerializedName("auth_code")
    private String authCode;

    /**
     * 微信订单号
     */
    @ApiModelProperty(value = "微信订单号",required = true)
    @SerializedName("transaction_id")
    private String transactionId;
}
