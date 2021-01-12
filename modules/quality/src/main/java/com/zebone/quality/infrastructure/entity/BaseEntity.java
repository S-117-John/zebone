package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

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

    /**
     * 主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称
     */
    private String cm_0_1_4_2;
    /**
     * 出生日期
     */
    private Date cm0211;

    /**
     * 患者性别
     */
    private String cm_0_2_1_2;

    /**
     * 患者体重（kg）
     */
    private Double cm0213;

    /**
     * 患者身高（cm）
     */
    private Double cm0215;

    /**
     * 发病日期时间是否无法确定或无记录
     */
    private String cm_0_2_2_1;

    /**
     * 发病日期时间
     */
    private String cm_0_2_2_2;

    /**
     * 到达本院急诊或者门诊日期时间：
     */
    private Date cm0232;

    /**
     * 入院日期时间：
     */
    private Date cm0241;

    /**
     * 出院日期时间
     */
    private Date cm0242;

    /**
     * 入住CCU日期时间
     */
    private Date cm_0_2_5_1;


    /**
     * 离开CCU日期时间
     */
    private Date cm_0_2_5_2;

    /**
     * 费用支付方式：
     */
    @Column(length = 32)
    private String cm031;

    /**
     * 收入住院途径：
     */
    @Column(length = 32)
    private String cm032;

    /**
     * 到院交通工具：
     */
    @Column(length = 32)
    private String cm033;
}
