package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 卡卡西
 * 病种信息
 */
@Entity
@Table(name = "QUALITY_DISEASE")
@Data
public class DiseaseInfoDO{

    @Id
    private String id;

    /**
     * 编码
     */
    @Column(columnDefinition = "varchar(32) COMMENT '病种编码'",unique = true)
    private String code;

    /**
     * 名称
     */
    @Column(columnDefinition = "varchar(32) COMMENT '病种名称'")
    private String name;

    /**
     GHCZBFJK
     * 病种分类
     */
    @Column(columnDefinition = "varchar(32) COMMENT '病种分类'")
    private String type;

    @Column(columnDefinition = "varchar(3000) COMMENT '图标'")
    private String image;

    /**
     * 接口地址
     */
    @Column(columnDefinition = "varchar(64) COMMENT '上传接口URL'")
    private String interfaceUrl;
}
