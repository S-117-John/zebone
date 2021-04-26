package com.zebone.modules.api.dto;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class WxpayParam {

    @SerializedName("appid")
    private String appId;

    @ApiModelProperty(hidden = true)
    @SerializedName("mch_id")
    private String mchId;

    /**
     * 商品描述
     */
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
    @SerializedName("total_fee")
    private Integer totalFee;

    /**
     * 付款吗
     */
    @SerializedName("auth_code")
    private String authCode;

    /**
     * 微信订单号
     */
    @SerializedName("transaction_id")
    private String transactionId;
}
