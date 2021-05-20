package com.zebone.modules.api.dto;

import com.alipay.api.response.AlipayTradePrecreateResponse;
import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

public class AlipayPrecreateResponse extends AlipayTradePrecreateResponse {

    @ApiModelProperty(value = "商户信息",required = true)
    @Override
    public String getBody(){
        return  super.getBody();
    }

    @ApiModelProperty(value = "网关返回码",required = true)
    @Override
    public String getCode(){
        return  super.getCode();
    }

    @ApiModelProperty(value = "错误码",required = true)
    @Override
    public String getErrorCode() {
        return super.getErrorCode();
    }

    @ApiModelProperty(value = "网关返回码描述",required = true)
    @Override
    public String getMsg() {
        return super.getMsg();
    }

    @ApiModelProperty(value = "商户订单号",required = true)
    @Override
    public String getOutTradeNo() {
        return super.getOutTradeNo();
    }

    @ApiModelProperty(value = "参数描述",required = true)
    @Override
    public Map<String, String> getParams() {
        return super.getParams();
    }

    @ApiModelProperty(value = "当前预下单请求生成的二维码码串，可以用二维码生成工具根据该码串值生成对应的二维码",required = true)
    @Override
    public String getQrCode() {
        return super.getQrCode();
    }

    @ApiModelProperty(value = "业务返回码",required = true)
    @Override
    public String getSubCode() {
        return super.getSubCode();
    }

    @ApiModelProperty(value = "业务返回码描述",required = true)
    @Override
    public String getSubMsg() {
        return super.getSubMsg();
    }

    @ApiModelProperty(value = "是否成功",required = true)
    @Override
    public boolean isSuccess    () {
        return super.isSuccess();
    }
}
