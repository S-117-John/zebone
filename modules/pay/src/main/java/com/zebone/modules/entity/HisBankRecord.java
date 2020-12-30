package com.zebone.modules.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "BIZ_TRADE_HIS_RECORD")
public class HisBankRecord {

    @Id
    private String id;
    private String status;
    private String createBy;
    private Date createDate;
    private Date updateDate;
    private String updateBy;
    private String remarks;

    /**
     * his交易号
     */
    private String hisTradeNo;

    /**
     * 银行交易号
     */
    private String bankTradeNo;

    /**
     * 交易金额
     */
    private String totalAmount;

    /**
     * 交易时间
     */
    private Date tradeDate;

    /**
     * 交易结果
     */
    private String tradeResult;

    /**
     * 支付方式
     */
    private String payType;

    /**
     * 平台注册商户号
     */
    private String merchantNo;

    /**
     * 交易标题
     */
    private String subject;
}

