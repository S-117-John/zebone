package com.zebone.modules.api.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class WxpayParam {

    @SerializedName("appid")
    private String appId;

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
}
