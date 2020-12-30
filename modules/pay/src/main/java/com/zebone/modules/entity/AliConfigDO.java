package com.zebone.modules.entity;



import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "BIZ_ALI_CONFIG")
public class AliConfigDO{

    @Id
    private String id;
    private String merchantId;

    private String appName;			//应用名称
    private String gateway;			//支付宝网关地址
    private String appId;			//应用ID
    private String partner;			//

    @Column(length = 3000)
    private String privateKey;		//私钥

    @Column(length = 3000)
    private String payPublicKey;	//支付公钥

    @Column(length = 3000)
    private String publicKey;		//公钥


    private String status;
    private String createBy;
    private Date createDate;
    private Date updateDate;
    private String updateBy;
    private String remarks;
}
