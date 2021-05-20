package com.zebone.modules.api.dto;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class AlipayQueryParam {




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

    @ApiModelProperty(value = "支付宝交易号",required = true)
    private String tradeNo;

    @ApiModelProperty(value = "商户操作员编号",required = true)
    @SerializedName("operator_id")
    private String operatorId;

    @ApiModelProperty(value = "商户号",required = true)
    @SerializedName("store_id")
    private String storeId;


}
