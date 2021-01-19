package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "quality_tn")
@Data
public class TnDO extends BaseEntity{


    @Column(columnDefinition = "varchar(64) COMMENT '其他主要诊断ICD-10四位亚目编码与名称'")
    private String tn_0_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要诊断ICD-10六位临床扩展编码与名称'")
    private String tn_0_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要手术操作ICD-9-CM-3四位亚目编码与名称'")
    private String tn_0_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要手术操作ICD-9-CM-3六位临床扩展编码与名称'")
    private String tn_0_1_4_2;
    @Column(columnDefinition = "double COMMENT '年龄'")
    private Double age;
    @Column(columnDefinition = "varchar(64) COMMENT '临床表现'")
    private String tn_1_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他临床表现'")
    private String tn_1_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '治疗前是否进行甲状腺及淋巴结超声检查'")
    private String tn_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '超声检查甲状腺及淋巴结情况'")
    private String tn_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '超声报告中是否有下列描述'")
    private String tn_1_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '超声检查印象'")
    private String tn_1_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他超声检查印象'")
    private String tn_1_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '超声检查甲状腺结节ACR TI--RADS 分级'")
    private String tn_1_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '甲状腺结节治疗前是否进行细针细胞学FNA指征检查'")
    private String tn_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '细针穿刺细胞学检查(FNA)指征'")
    private String tn_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他细针细胞学FNA指症'")
    private String tn_1_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '细针细胞学FNA评估为良性病变'")
    private String tn_1_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '甲状腺功能是否检测'")
    private String tn_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术前甲状腺功能检测结果是否确定'")
    private String tn_1_4_2_1;
    @Column(columnDefinition = "double COMMENT 'TSH检测值(mU／L)'")
    private Double tn_1_4_2_2;
    @Column(columnDefinition = "double COMMENT 'T3检测值(ng/mL)'")
    private Double tn_1_4_2_3;
    @Column(columnDefinition = "double COMMENT 'T4检测值(ng/mL)'")
    private Double tn_1_4_2_4;
    @Column(columnDefinition = "double COMMENT 'FT3检测值(pmol／L)'")
    private Double tn_1_4_2_5;
    @Column(columnDefinition = "double COMMENT 'FT4检测值(pmol／L)'")
    private Double tn_1_4_2_6;
    @Column(columnDefinition = "varchar(64) COMMENT '术前甲状腺功能评估结论'")
    private String tn_1_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '甲状腺结节再次手术'")
    private String tn_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '甲状腺结节再次手术主要原因'")
    private String tn_2_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '甲状腺手术适应证的选择'")
    private String tn_2_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他甲状腺手术适应症'")
    private String tn_2_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术治疗方式选择'")
    private String tn_2_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他手术治疗方式'")
    private String tn_2_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术中甲状腺病灶最大直径的选择'")
    private String tn_2_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '其他术中甲状腺病灶最大直径'")
    private String tn_2_1_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行术中快速活体组织病理学检查'")
    private String tn_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术中病理送检时间'")
    private Date tn_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '病理检查结果报告时间'")
    private Date tn_2_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '术中快速活体组织病理学检查是否在30min内提供结论'")
    private String tn_2_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '术中冰冻病理学检查结果显示甲状腺结节为良性病变'")
    private String tn_2_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '甲状腺手术后特指并发症的选择'")
    private String tn_3_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他甲状腺手术后特指并发症'")
    private String tn_3_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行术后甲状腺功能检测'")
    private String tn_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术后甲状腺功能检测结果是否确定'")
    private String tn_3_2_2_1;
    @Column(columnDefinition = "double COMMENT 'TSH检测值(mU／L)'")
    private Double tn_3_2_2_2;
    @Column(columnDefinition = "double COMMENT 'T3检测值(ng/mL)'")
    private Double tn_3_2_2_3;
    @Column(columnDefinition = "double COMMENT 'T4检测值(ng/mL)'")
    private Double tn_3_2_2_4;
    @Column(columnDefinition = "double COMMENT 'FT3检测值(pmol／L)'")
    private Double tn_3_2_2_5;
    @Column(columnDefinition = "double COMMENT 'FT4检测值(pmol／L)'")
    private Double tn_3_2_2_6;
    @Column(columnDefinition = "varchar(64) COMMENT '手术是否造成甲减'")
    private String tn_3_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '手术造成甲减分层'")
    private String tn_3_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '术后内分泌补充治疗适应证的选择'")
    private String tn_3_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '术后是否进行内分泌补充治疗'")
    private String tn_3_2_6;
    @Column(columnDefinition = "varchar(64) COMMENT '内分泌补充治疗药物的选择'")
    private String tn_3_2_7;
    @Column(columnDefinition = "varchar(64) COMMENT '其他内分泌补充治疗药物'")
    private String tn_3_2_7_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术后病理诊断是否仍为良性病变'")
    private String tn_5_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术后病理诊断 (ICD-10-M形态学编码及诊断名称)'")
    private String tn_5_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '术中快速病理诊断与术后病理诊断是否一致'")
    private String tn_5_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '标本切片是否作免疫组化检查'")
    private String tn_5_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否输血'")
    private String tn_6_1_1;
    @Column(columnDefinition = "double COMMENT '出血量(ml)'")
    private Double tn_6_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '手术中输血指征'")
    private String tn_6_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '手术中其它输血指征'")
    private String tn_6_1_3_1;
    @Column(columnDefinition = "double COMMENT '输血量(ml)'")
    private Double tn_6_1_4;
    @Column(columnDefinition = "double COMMENT '出血量(ml)'")
    private Double tn_6_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术后输血指征'")
    private String tn_6_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '手术后其它输血指征'")
    private String tn_6_2_2_1;
    @Column(columnDefinition = "double COMMENT '输血量(ml)'")
    private Double tn_6_2_3;

}
