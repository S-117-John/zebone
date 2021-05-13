package com.zebone.modules.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "payment_month_bill")
public class MonthBillDO {

    @Id
    private String id;
    private String status;
    private String createBy;
    private Date createDate;
    private Date updateDate;
    private String updateBy;
    private String remarks;

    /**
     * 账单日期
     */
    private Date billDate;

    /**
     * 账单号
     */
    @Column(unique = true)
    private String billNo;




    /**
     * 支付类型
     */
    private String payType;

    /**
     * 应用id
     */
    private String appId;

    /**
     * 订单笔数
     */
    private String billCount;

    /**
     * 退款笔数
     */
    private String refundCount;

    /**
     * 订单金额
     */
    private String billTotalAmount;

    /**
     * 实收金额
     */
    private String billReceiptAmount;
}
