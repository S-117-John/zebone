package com.zebone.modules.api.dto;

import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 刘旋
 * @date 2021/05/20 11:03
 **/
@Data
public class WxNativePayResponse {
    @ApiModelProperty(value = "预支付交易会话标识",required = true)
    @ApiField("prepay_id")
    private String prepayId ;
}
