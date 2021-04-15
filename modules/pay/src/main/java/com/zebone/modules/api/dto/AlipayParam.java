package com.zebone.modules.api.dto;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class AlipayParam {




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
    @ApiModelProperty(value = "支付场景",hidden = true)
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


}
