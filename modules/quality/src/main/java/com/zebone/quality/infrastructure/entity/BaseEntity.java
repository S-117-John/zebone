package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author 卡卡西
 */
@MappedSuperclass
@Data
public class BaseEntity {

    @Id
    private String id;

    /**
     * 质控医师
     */
    @Column(length = 32)
    private String cm0111;

    /**
     * 质控护士
     */
    @Column(length = 32)
    private String cm0112;

    /**
     * 主治医师
     */
    @Column(length = 32)
    private String cm0113;

    /**
     * 责任护士
     */
    @Column(length = 32)
    private String cm0114;

    /**
     * 上报科室
     */
    @Column(length = 32)
    private String cm0115;

    /**
     * 患者病案号
     */
    private String caseId;

    /**
     * 出院诊断ICD-10四位亚目编码与名称
     */
    private String cm0131;

    /**
     * 出院诊断ICD-10六位临床扩展编码与名称
     */
    private String cm0132;

    /**
     *主要手术操作 国家临床版ICD-9.CM-3编码与手术名称
     */
    private String cm0141;

    /**
     * 是否出院后31天内重复住院
     */
    private String cm015;
}
