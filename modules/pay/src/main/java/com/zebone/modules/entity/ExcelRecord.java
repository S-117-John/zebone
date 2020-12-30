package com.zebone.modules.entity;

import com.jeesite.common.utils.excel.annotation.ExcelField;
import com.zebone.modules.pay.entity.TradeRecord;
import lombok.Data;

import java.util.Date;

@Data
public class ExcelRecord{

    @ExcelField(title="支付方式", attrName="payType", align= ExcelField.Align.CENTER, sort=10)
    private String payType;		// 支付方式

    @ExcelField(title="商户订单号", attrName="outTradeNo", align= ExcelField.Align.CENTER, sort=20)
    private String outTradeNo;		// 商户订单号

    @ExcelField(title="交易号", attrName="tradeNo", align= ExcelField.Align.CENTER, sort=30)
    private String tradeNo;		// 交易号

    @ExcelField(title="交易金额", attrName="totalAmount", align= ExcelField.Align.CENTER, sort=40)
    private String totalAmount;		// 交易金额

    @ExcelField(title="实收金额", attrName="receiptAmount", align= ExcelField.Align.CENTER, sort=50)
    private String receiptAmount;		// 实收金额

    @ExcelField(title="交易时间", attrName="gmtPayment", align= ExcelField.Align.CENTER, sort=60)
    private Date gmtPayment;		// 交易时间

    @ExcelField(title="交易状态", attrName="tradeStatus", align= ExcelField.Align.CENTER, sort=70)
    private String tradeStatus;		// 交易状态

    @ExcelField(title="买家账号", attrName="buyerLogonId", align= ExcelField.Align.CENTER, sort=80)
    private String buyerLogonId;		// 买家账号

    @ExcelField(title="买家用户id", attrName="buyerUserId", align= ExcelField.Align.CENTER, sort=90)
    private String buyerUserId;		// 买家用户id


}
