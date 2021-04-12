package com.zebone.payment.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "pay_merchant")
public class MerchantDO extends BaseEntity{

    /**
     * 商户名称
     */
    private String name;

    /**
     * 商户号
     */
    private String merchantNo;

}
