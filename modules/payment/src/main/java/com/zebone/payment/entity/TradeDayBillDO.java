package com.zebone.payment.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "payment_day_bill")
public class TradeDayBillDO {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    /**
     * 应用id
     */
//    @Column(name = "app_id")
    private String appId;

    /**
     * 交易笔数
     */
//    @Column(name = "bill_count")
    private String billCount;		//

    /**
     * 账单日期
     */
//    @Column(name = "bill_date")
    private Date billDate;		//

    /**
     * 账单号
     */
//    @Column(name = "bill_no")
    private String billNo;		//

    /**
     * 实收金额
     */
//    @Column(name = "bill_receipt_amount")
    private String billReceiptAmount;		//

    /**
     * 账单金额
     */
//    @Column(name = "bill_total_amount")
    private String billTotalAmount;		//

    /**
     * 支付类型
     */
//    @Column(name = "pay_type")
    private String payType;		//

    /**
     * 退款笔数
     */
//    @Column(name = "refund_count")
    private String refundCount;		//


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
