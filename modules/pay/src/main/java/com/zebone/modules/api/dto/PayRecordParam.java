package com.zebone.modules.api.dto;

import com.zebone.modules.pay.entity.TradeRecord;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.lang.reflect.Field;
import java.util.Date;

/**
 * @author 刘旋
 * @date 2021/05/31 10:10
 **/
@Data
public class PayRecordParam {
    @ApiModelProperty(value = "商户订单号(至少选择一项进行条件筛选)")
    private String outTradeNo;

    @ApiModelProperty(value = "交易号")
    private String tradeNo;

    @ApiModelProperty(value = "交易时间格式：yyyyMMdd")
    private String timeStamp;

    @ApiModelProperty(value = "交易渠道 1：微信支付 2：支付宝")
    private String payMode;
}
