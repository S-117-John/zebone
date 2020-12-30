package com.zebone.modules.ali.vo;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;
import com.zebone.modules.ali.entity.AliConfig;
import lombok.Data;

@Table(name="biz_ali_config", alias="a", columns={
        @Column(name="id", attrName="id", label="id", isPK=true),
        @Column(name="app_id", attrName="appId", label="应用ID"),
        @Column(name="app_name", attrName="appName", label="应用名称", queryType= QueryType.LIKE),
        @Column(name="gateway", attrName="gateway", label="支付宝网关"),
        @Column(name="merchant_id", attrName="merchantId", label="商户"),
        @Column(name="partner", attrName="partner", label="partner"),
        @Column(name="pay_public_key", attrName="payPublicKey", label="支付公钥"),
        @Column(name="private_key", attrName="privateKey", label="应用私钥"),
        @Column(name="public_key", attrName="publicKey", label="应用公钥"),
        @Column(name="merchant_name", attrName="merchantName", label="商户"),
        @Column(includeEntity= DataEntity.class),
}, orderBy="a.update_date DESC"
)
@Data
public class AliConfigVO extends AliConfig {

    private String merchantName;
}
