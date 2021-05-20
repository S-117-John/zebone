package com.zebone.modules.api.dto;

import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 刘旋
 * @date 2021/05/20 10:50
 **/
@Data
public class WxOrderqueryRespnonse {
    @ApiModelProperty(value = "SUCCESS/FAIL",required = true)
    @ApiField("return_code")
    private String returnCode;

    @ApiModelProperty(value = "当return_code为FAIL时返回信息为错误原因",required = true)
    @ApiField("return_msg")
    private String returnMsg;

    @ApiModelProperty(value = "调用接口提交的公众账号ID",required = true)
    @ApiField("appid")
    private String appId;

    @ApiModelProperty(value = "调用接口提交的商户号",required = true)
    @ApiField("mch_id")
    private String mchId;

    @ApiModelProperty(value = "微信返回的随机字符串",required = true)
    @ApiField("nonce_str")
    private String nonceStr;

    @ApiModelProperty(value = "微信返回的签名，详见签名生成算法",required = true)
    @ApiField("sign")
    private String sign;

    @ApiModelProperty(value = "SUCCESS/FAIL",required = true)
    @ApiField("result_code")
    private String resultCode;

    @ApiModelProperty(value = "用户在商户appid 下的唯一标识",required = true)
    @ApiField("openid")
    private String openId;

    @ApiModelProperty(value = "用户是否关注公众账号，仅在公众账号类型支付有效，取值范围：Y或N;Y-关注;N-未关注",required = true)
    @ApiField("is_subscribe")
    private String isSubscribe;

    @ApiModelProperty(value = "交易类型",required = true)
    @ApiField("trade_type")
    private String tradeType;

    @ApiModelProperty(value = "交易状态 ",required = true)
    @ApiField("trade_state ")
    private String tradeState ;

    @ApiModelProperty(value = "银行类型，采用字符串类型的银行标识，详见银行类型",required = true)
    @ApiField("bank_type")
    private String bank_type;

    @ApiModelProperty(value = "订单总金额，单位为分，只能为整数，详见支付金额",required = true)
    @ApiField("total_fee")
    private Integer totalFee;

    @ApiModelProperty(value = "订单现金支付金额，详见支付金额",required = true)
    @ApiField("cash_fee")
    private Integer cashFee;

    @ApiModelProperty(value = "微信支付订单号",required = true)
    @ApiField("transaction_id")
    private String transactionId;

    @ApiModelProperty(value = "商户系统内部订单号",required = true)
    @ApiField("out_trade_no")
    private String outTradeNo;

    @ApiModelProperty(value = "订单生成时间",required = true)
    @ApiField("time_end")
    private String timeEnd;

    @ApiModelProperty(value = "交易状态描",required = true)
    @ApiField("trade_state_desc")
    private String tradeStateDesc;
}
