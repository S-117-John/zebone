package com.zebone.modules.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "payment_wx_config")
public class WxConfigDO {

    @Id
    private String id;
    private String merchantId;

    private String appName;			//应用名称
    private String appId;			//应用ID、开发者ID
    private String appSecret;		//开发者密钥
    private String mchId;			//商户ID
    private String paySignKey;		//支付密钥
    private String token;			//
    private String certificatePath;	//证书地址

    private String status;
    private String createBy;
    private Date createDate;
    private Date updateDate;
    private String updateBy;
    private String remarks;
}
