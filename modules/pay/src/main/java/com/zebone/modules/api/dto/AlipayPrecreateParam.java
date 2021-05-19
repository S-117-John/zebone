package com.zebone.modules.api.dto;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class AlipayPrecreateParam {

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

    @ApiModelProperty(value = "商户操作员编号",required = false)
    @SerializedName("operator_id")
    private String operatorId;

    @ApiModelProperty(value = "商户号",required = false)
    @SerializedName("store_id")
    private String storeId;

}
