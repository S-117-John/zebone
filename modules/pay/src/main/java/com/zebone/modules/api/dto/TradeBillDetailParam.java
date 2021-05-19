package com.zebone.modules.api.dto;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 刘旋
 * @date 2021/05/18 18:03
 **/
@Data
public class TradeBillDetailParam {

    @ApiModelProperty(value = "商户订单号",required = true)
    @SerializedName("out_trade_no")
    private String outTradeNo;

    @ApiModelProperty(value = "交易号",required = true)
    @SerializedName("trade_no")
    private String tradeNo;
}
