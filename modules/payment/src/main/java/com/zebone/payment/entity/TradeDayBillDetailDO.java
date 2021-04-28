package com.zebone.payment.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "biz_trade_bill_detail")
public class TradeDayBillDetailDO {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    /**
     * 交易笔数
     */
//    @Column(name = "bill_amount")
    private String billAmount;

    /**
     * 账单号
     */
//    @Column(name = "bill_no")
    private String billNo;

    /**
     * 业务类型
     */
//    @Column(name = "biz_type")
    private String bizType;

    /**
     * 买家账号
     */
//    @Column(name = "buyer_id")
    private String buyerId;

    /**
     * 商户订单号
     */
//    @Column(name = "out_trade_no")
    private String outTradeNo;

    /**
     * 产品名称
     */
//    @Column(name = "product_name")
    private String productName;

    /**
     * 实收金额
     */
//    @Column(name = "receipt_amount")
    private String receiptAmount;

    /**
     * 退款批次号
     */
//    @Column(name = "refund_batch_no")
    private String refundBatchNo;

    /**
     * 交易创建时间
     */
//    @Column(name = "trade_create_time")
    private Date tradeCreateTime;

    /**
     * 交易完成时间
     */
//    @Column(name = "trade_end_time")
    private Date tradeEndTime;

    /**
     * 交易号
     */
//    @Column(name = "trade_no")
    private String tradeNo;

//    @Column(name = "create_by")
    private String createBy;

//    @Column(name = "create_date")
    private Date createDate;

//    @Column(name = "remarks")
    private String remarks;

//    @Column(name = "status")
    private String status;

//    @Column(name = "update_by")
    private String updateBy;

//    @Column(name = "update_date")
    private Date updateDate;
}
