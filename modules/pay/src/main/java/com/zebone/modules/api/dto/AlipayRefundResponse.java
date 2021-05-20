package com.zebone.modules.api.dto;

import com.alipay.api.domain.PresetPayToolInfo;
import com.alipay.api.domain.TradeFundBill;
import com.alipay.api.response.AlipayTradeRefundResponse;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 刘旋
 * @date 2021/05/19 16:00
 **/
public class AlipayRefundResponse extends AlipayTradeRefundResponse {

    @ApiModelProperty(value = "商户信息",required = true)
    @Override
    public String getBody(){
        return  super.getBody();
    }

    @ApiModelProperty(value = "用户的登录id",required = true)
    @Override
    public String getBuyerLogonId(){
        return  super.getBuyerLogonId();
    }

    @ApiModelProperty(value = "买家在支付宝的用户id",required = true)
    @Override
    public String getBuyerUserId(){
        return  super.getBuyerUserId();
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

    @ApiModelProperty(value = "本次退款是否发生了资金变化",required = true)
    @Override
    public String getFundChange() {
        return super.getFundChange();
    }

    @ApiModelProperty(value = "退款时间",required = true)
    @Override
    public Date getGmtRefundPay() {
        return super.getGmtRefundPay();
    }

    @ApiModelProperty(value = "是否有银行卡冲退",required = true)
    @Override
    public String getHasDepositBack() {
        return super.getHasDepositBack();
    }

    @ApiModelProperty(value = "网关返回码描述",required = true)
    @Override
    public String getMsg() {
        return super.getMsg();
    }

    @ApiModelProperty(value = "操作员id",required = true)
    @Override
    public String getOpenId() {
        return super.getOpenId();
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

    @ApiModelProperty(value = "本次退款金额中买家退款金额",required = true)
    @Override
    public String getPresentRefundBuyerAmount() {
        return super.getPresentRefundBuyerAmount();
    }

    @ApiModelProperty(value = "本次退款金额中平台优惠退款金额",required = true)
    @Override
    public String getPresentRefundDiscountAmount() {
        return super.getPresentRefundDiscountAmount();
    }

    @ApiModelProperty(value = "本次退款金额中商家优惠退款金额",required = true)
    @Override
    public String getPresentRefundMdiscountAmount() {
        return super.getPresentRefundMdiscountAmount();
    }

    @ApiModelProperty(value = "退款手续费",required = true)
    @Override
    public String getRefundChargeAmount() {
        return super.getRefundChargeAmount();
    }

    @ApiModelProperty(value = "退款币种信息",required = true)
    @Override
    public String getRefundCurrency() {
        return super.getRefundCurrency();
    }

    @ApiModelProperty(value = "退款使用的资金渠道",required = true)
    @Override
    public List<TradeFundBill> getRefundDetailItemList() {
        return super.getRefundDetailItemList();
    }

    @ApiModelProperty(value = "业务返回码",required = true)
    @Override
    public String getSubCode() {
        return super.getSubCode();
    }

    @ApiModelProperty(value = "退款总金额",required = true)
    @Override
    public String getRefundFee() {
        return super.getRefundFee();
    }

    @ApiModelProperty(value = "退回的前置资产列表",required = true)
    @Override
    public PresetPayToolInfo getRefundPresetPaytoolList() {
        return super.getRefundPresetPaytoolList();
    }

    @ApiModelProperty(value = "退款清算编号，用于清算对账使用；只在银行间联交易场景下返回该信息；",required = true)
    @Override
    public String getRefundSettlementId() {
        return super.getRefundSettlementId();
    }

    @ApiModelProperty(value = "本次商户实际退回金额。",required = true)
    @Override
    public String getSendBackFee() {
        return super.getSendBackFee();
    }

    @ApiModelProperty(value = "业务返回码描述",required = true)
    @Override
    public String getSubMsg() {
        return super.getSubMsg();
    }

    @ApiModelProperty(value = "交易在支付时候的门店名称",required = true)
    @Override
    public String getStoreName() {
        return super.getStoreName();
    }

    @ApiModelProperty(value = "是否成功",required = true)
    @Override
    public boolean isSuccess() {
        return super.isSuccess();
    }

    @ApiModelProperty(value = "支付宝交易号",required = true)
    @Override
    public String getTradeNo() {
        return super.getTradeNo();
    }
}
