package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Data
//@Table(name = "QUALITY_PIP")
public class PipDO extends BaseEntity{



    @Column(columnDefinition = "varchar(64) COMMENT '手术类型'")
    private String pip_0_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称(心血管病医院)'")
    private String pip_0_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称(心血管病医院)'")
    private String pip_0_1_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '术前伴随内科疾患'")
    private String pip_2_2_1;


}
