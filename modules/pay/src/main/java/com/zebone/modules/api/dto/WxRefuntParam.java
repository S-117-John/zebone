package com.zebone.modules.api.dto;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 刘旋
 **/
@Data
public class WxRefuntParam {
    /**
     * 微信订单号
     */
    @ApiModelProperty(value = "微信订单号(与商户订单号二选一即可)",required = true)
    @SerializedName("transaction_id")
    private String transactionId;

    /**
     * 商户订单号
     */
    @ApiModelProperty(value = "商户订单号(与微信订单号二选一即可)",required = true)
    @SerializedName("out_trade_no")
    private String outTradeNo;

    /**
     * 商户退款单号
     */
    @ApiModelProperty(value = "商户系统内部的退款单号，商户系统内部唯一，只能是数字、大小写字母_-|*@ ，同一退款单号多次请求只退一笔。",required = true)
    @SerializedName("out_refund_no")
    private String outRefundNo;

    /**
     * 退款原因
     */
    @ApiModelProperty(value = "若商户传入，会在下发给用户的退款消息中体现退款原因。",required = false)
    @SerializedName("reason")
    private String reason;

    /**
     * 退款金额
     */
    @ApiModelProperty(value = "退款金额，币种的最小单位（分），只能为整数，不能超过原订单支付金额。",required = false)
    @SerializedName("refund")
    private String refund;


}
