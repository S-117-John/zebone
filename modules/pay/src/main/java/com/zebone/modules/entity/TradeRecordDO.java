package com.zebone.modules.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "payment_record_trade")
public class TradeRecordDO {

    @Id
    private String id;
    private String status;
    private String createBy;
    private Date createDate;
    private Date updateDate;
    private String updateBy;
    private String remarks;

    /**
     * 支付方式
     */
    private String payType;

    /**
     * 交易号
     */
    private String tradeNo;

    /**
     * 商户订单号
     */
    private String outTradeNo;

    /**
     * 买家账号
     */
    private String buyerLogonId;

    /**
     * 交易金额
     */
    private String totalAmount;

    /**
     * 实收金额
     */
    private String receiptAmount;

    /**
     * 交易支付时间
     */
    private Date gmtPayment;

    /**
     * 买家用户ID
     */
    private String buyerUserId;

    /**
     * 交易状态
     */
    private String tradeStatus;

}
