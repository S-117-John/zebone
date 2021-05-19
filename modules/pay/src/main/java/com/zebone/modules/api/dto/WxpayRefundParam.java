package com.zebone.modules.api.dto;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class WxpayRefundParam {

    @SerializedName("appid")
    private String appId;

    @ApiModelProperty(hidden = true)
    @SerializedName("mch_id")
    private String mchId;


    /**
     * 商户订单号
     */
    @SerializedName("out_trade_no")
    private String outTradeNo;


    /**
     * 商户退款单号
     */
    private String outRefundNo;

    /**
     *订单金额
     */
    @SerializedName("total_fee")
    private Integer totalFee;


    /**
     * 退款金额
     */
    private Integer refundFee;



    /**
     * 微信订单号
     */
    @SerializedName("transaction_id")
    private String transactionId;
}
