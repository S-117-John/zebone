package com.zebone.modules.api.dto;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 卡卡西
 */
@Data
public class AlipayRefuntParam {

    @ApiModelProperty(value = "应用ID",required = true)
    @SerializedName("app_id")
    private String appId;

    @ApiModelProperty(value = "商户订单号",required = true)
    @SerializedName("out_trade_no")
    private String outTradeNo;

    @ApiModelProperty(value = "支付宝交易号",required = true)
    @SerializedName("trade_no")
    private String tradeNo;

    @ApiModelProperty(value = "需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数",required = true)
    @SerializedName("refund_amount")
    private Double refundAmount;


}
