package com.zebone.modules.api.dto;

import com.alipay.api.response.AlipayTradePrecreateResponse;
import io.swagger.annotations.ApiModelProperty;

public class AlipayPrecreateResponse extends AlipayTradePrecreateResponse {

    @ApiModelProperty(value = "商户订单号",required = true)
    @Override
    public String getOutTradeNo() {
        return super.getOutTradeNo();
    }
}
