package com.zebone.modules.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "BIZ_TRADE_BILL_DETAIL")
public class BillDetailDO {

    @Id
    private String id;
    private String status;
    private String createBy;
    private Date createDate;
    private Date updateDate;
    private String updateBy;
    private String remarks;

    /**
     * 账单号
     */
    private String billNo;

    /**
     * 交易号
     */
    @Column(unique = true)
    private String tradeNo;

    /**
     * 商户订单号
     */
    private String outTradeNo;

    /**
     * 业务类型
     */
    private String bizType;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 交易创建时间
     */
    private Date tradeCreateTime;

    /**
     * 交易完成时间
     */
    private Date tradeEndTime;

    /**
     * 对方账户
     */
    private String buyerId;

    private String billAmount;

    /**
     * 商家实收
     */
    private String receiptAmount;

    /**
     * 退款批次号
     */
    private String refundBatchNo;
}
