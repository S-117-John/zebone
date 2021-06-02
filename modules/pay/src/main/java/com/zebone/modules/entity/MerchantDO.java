package com.zebone.modules.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "payment_merchant")
public class MerchantDO {

    @Id
    private String id;


    private String name;

    /**
     * 商户号
     */
    private String merchantNo;

    private String status;
    private String createBy;
    private Date createDate;
    private Date updateDate;
    private String updateBy;
    private String remarks;
}
