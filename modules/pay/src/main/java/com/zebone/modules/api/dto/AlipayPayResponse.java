package com.zebone.modules.api.dto;

import com.alipay.api.domain.TradeFundBill;
import com.alipay.api.domain.VoucherDetail;
import com.alipay.api.response.AlipayTradePayResponse;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 刘旋
 * @date 2021/05/19 16:49
 **/
public class AlipayPayResponse extends AlipayTradePayResponse {
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

    @ApiModelProperty(value = "先享后付2.0垫资金额,不返回表示没有走垫资，非空表示垫资支付的金额",required = true)
    @Override
    public String getAdvanceAmount() {
        return super.getAdvanceAmount();
    }

    @ApiModelProperty(value = "异步支付模式",required = true)
    @Override
    public String getAsyncPaymentMode() {
        return super.getAsyncPaymentMode();
    }

    @ApiModelProperty(value = "预授权支付模式，该参数仅在信用预授权支付场景下返回。信用预授权支付：CREDIT_PREAUTH_PAY",required = true)
    @Override
    public String getAuthTradePayMode() {
        return super.getAuthTradePayMode();
    }

    @ApiModelProperty(value = "商户传入业务信息，具体值要和支付宝约定将商户传入信息分发给相应系统，应用于安全，营销等参数直传场景格式为json格式",required = true)
    @Override
    public String getBusinessParams() {
        return super.getBusinessParams();
    }


    @ApiModelProperty(value = "买家付款的金额",required = true)
    @Override
    public String getBuyerPayAmount() {
        return super.getBuyerPayAmount();
    }

    @ApiModelProperty(value = "买家用户名",required = true)
    @Override
    public String getBuyerUserName() {
        return super.getBuyerUserName();
    }

    @ApiModelProperty(value = "买家用户名",required = true)
    @Override
    public String getBuyerUserType() {
        return super.getBuyerUserType();
    }

    @ApiModelProperty(value = "卡余额",required = true)
    @Override
    public String getCardBalance() {
        return super.getCardBalance();
    }

    @ApiModelProperty(value = "手续费",required = true)
    @Override
    public String getChargeAmount() {
        return super.getChargeAmount();
    }

    @ApiModelProperty(value = "费率活动标识",required = true)
    @Override
    public String getChargeFlags() {
        return super.getChargeFlags();
    }

    @ApiModelProperty(value = "平台优惠金额",required = true)
    @Override
    public String getDiscountAmount() {
        return super.getDiscountAmount();
    }

    @ApiModelProperty(value = "本次交易支付所使用的单品券优惠的商品优惠信息。只有在query_options中指定时才返回该字段信息。",required = true)
    @Override
    public String getDiscountGoodsDetail() {
        return super.getDiscountGoodsDetail();
    }

    @ApiModelProperty(value = "交易支付使用的资金渠道。",required = true)
    @Override
    public List<TradeFundBill> getFundBillList() {
        return super.getFundBillList();
    }

    @ApiModelProperty(value = "支付时间",required = true)
    @Override
    public Date getGmtPayment() {
        return super.getGmtPayment();
    }

    @ApiModelProperty(value = "交易中可给用户开具发票的金额",required = true)
    @Override
    public String getInvoiceAmount() {
        return super.getInvoiceAmount();
    }

    @ApiModelProperty(value = "商家优惠金额",required = true)
    @Override
    public String getMdiscountAmount() {
        return super.getMdiscountAmount();
    }

    @ApiModelProperty(value = "支付金额",required = true)
    @Override
    public String getPayAmount() {
        return super.getPayAmount();
    }

    @ApiModelProperty(value = "支付币种",required = true)
    @Override
    public String getPayCurrency() {
        return super.getPayCurrency();
    }

    @ApiModelProperty(value = "使用集分宝付款的金额",required = true)
    @Override
    public String getPointAmount() {
        return super.getPointAmount();
    }

    @ApiModelProperty(value = "实收金额",required = true)
    @Override
    public String getReceiptAmount() {
        return super.getReceiptAmount();
    }

    @ApiModelProperty(value = "结算币种订单金额",required = true)
    @Override
    public String getSettleAmount() {
        return super.getSettleAmount();
    }

    @ApiModelProperty(value = "结算币种兑换标价币种汇率",required = true)
    @Override
    public String getSettleTransRate() {
        return super.getSettleTransRate();
    }

    @ApiModelProperty(value = "支付清算编号，用于清算对账使用",required = true)
    @Override
    public String getSettlementId() {
        return super.getSettlementId();
    }

    @ApiModelProperty(value = "结算币种",required = true)
    @Override
    public String getSettleCurrency() {
        return super.getSettleAmount();
    }

    @ApiModelProperty(value = "订单总金额",required = true)
    @Override
    public String getTotalAmount() {
        return super.getTotalAmount();
    }

    @ApiModelProperty(value = "标价币种",required = true)
    @Override
    public String getTransCurrency() {
        return super.getTransCurrency();
    }

    @ApiModelProperty(value = "标价币种兑换支付币种汇率",required = true)
    @Override
    public String getTransPayRate() {
        return super.getTransPayRate();
    }

    @ApiModelProperty(value = "本交易支付时使用的所有优惠券信息。",required = true)
    @Override
    public List<VoucherDetail> getVoucherDetailList() {
        return super.getVoucherDetailList();
    }
}
