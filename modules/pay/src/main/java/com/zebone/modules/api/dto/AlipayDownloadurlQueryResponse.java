package com.zebone.modules.api.dto;

import com.alipay.api.response.AlipayDataDataserviceBillDownloadurlQueryResponse;
import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

/**
 * @author 刘旋
 * @date 2021/05/19 17:29
 **/
public class AlipayDownloadurlQueryResponse extends AlipayDataDataserviceBillDownloadurlQueryResponse {

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

    @ApiModelProperty(value = "参数描述",required = true)
    @Override
    public Map<String, String> getParams() {
        return super.getParams();
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
    public boolean isSuccess() {
        return super.isSuccess();
    }

    @ApiModelProperty(value = "账单下载地址",required = true)
    @Override
    public String getBillDownloadUrl(){
        return  super.getBillDownloadUrl();
    }
}
