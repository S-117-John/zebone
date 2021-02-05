package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table(name = "quality_TC")
//@Data
public class TcDO extends BaseEntity{

    @Column(columnDefinition = "varchar(64) COMMENT '其他主要手术操作ICD-9-CM-3四位亚目编码与名称'")
    private String tc_0_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要手术操作ICD-9-CM-3六位临床扩展编码与名称'")
    private String tc_0_1_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '甲状腺癌治疗前是否在进行 TNM 临床分期'")
    private String tc_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要有那些临床表现及体征'")
    private String tc_1_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要有那些临床表现及体征'")
    private String tc_1_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要辅助检查'")
    private String tc_1_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '次要辅助检查'")
    private String tc_1_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他次要辅助检查'")
    private String tc_1_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'nan'")
    private String tc_1_2_7_r;
    @Column(columnDefinition = "varchar(64) COMMENT '患者年龄'")
    private String tc_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'T 原肿瘤'")
    private String tc_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'N 淋巴结转移'")
    private String tc_1_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT 'M 远处转移'")
    private String tc_1_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '术前细胞学检查'")
    private String tc_1_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT 'cTNM 临床分期结果选择'")
    private String tc_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '乳头状癌及滤泡癌 患者年龄<55岁'")
    private String tc_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '乳头状癌及滤泡癌患者年龄≥55岁'")
    private String tc_1_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '未分化癌 （所用未分化均为Ⅳ期）'")
    private String tc_1_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '髓样癌'")
    private String tc_1_3_5;
    @Column(columnDefinition = "varchar(64) COMMENT '治疗前是否接受过（MDT）多学科协作诊疗(2个或以上治疗科室会诊)'")
    private String tc_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术前评估有无淋巴结转移'")
    private String tc_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '淋巴结转移征象'")
    private String tc_2_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他淋巴结转移征象'")
    private String tc_2_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否甲状腺癌手术治疗'")
    private String tc_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '甲状腺癌再次手术'")
    private String tc_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '甲状腺癌再次手术主要原因'")
    private String tc_2_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其它甲状腺癌再次手术主要原因'")
    private String tc_2_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '甲状腺癌手术治疗方式'")
    private String tc_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他甲状腺癌手术治疗方式'")
    private String tc_2_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '甲状腺全切除手术适应证的选择'")
    private String tc_2_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他甲状腺全切除手术适应证'")
    private String tc_2_4_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '甲状腺腺叶切除适应证的选择'")
    private String tc_2_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他甲状腺腺叶切除适应证'")
    private String tc_2_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '甲状腺全切除+淋巴结清扫手术适应证的选择'")
    private String tc_2_4_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他甲状腺全切除+淋巴结清扫手术适应证'")
    private String tc_2_4_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行术中快速病理'")
    private String tc_2_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术中冰冻病理学检查证实有颈侧区淋巴结转移'")
    private String tc_2_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '清扫淋巴结手术部位'")
    private String tc_2_5_3;
    @Column(columnDefinition = "varchar(64) COMMENT '淋巴结清扫范围'")
    private String tc_2_5_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他淋巴结清扫范围'")
    private String tc_2_5_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '甲状腺手术后特指并发症的选择'")
    private String tc_3_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他甲状腺手术后特指并发症'")
    private String tc_3_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术后病理诊断'")
    private String tc_5_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '病理诊断结论'")
    private String tc_5_1_2_0;
    @Column(columnDefinition = "varchar(64) COMMENT '乳头状甲状腺癌'")
    private String tc_5_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '滤泡性甲状腺癌'")
    private String tc_5_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '乳头状甲状腺癌'")
    private String tc_5_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '乳头状甲状腺癌'")
    private String tc_5_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '滤泡性甲状腺癌'")
    private String tc_5_1_6;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行促甲状腺素(TSH)检测'")
    private String tc_5_1_7;
    @Column(columnDefinition = "double COMMENT '促甲状腺素(TSH)检测结果(mIU/ L )'")
    private Double tc_5_1_8;
    @Column(columnDefinition = "varchar(64) COMMENT '术后内分泌抑制治疗适应证的选择'")
    private String tc_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他术后内分泌抑制治疗适应证'")
    private String tc_5_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行内分泌抑制治疗'")
    private String tc_5_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '促甲状腺素(TSH)抑制剂的选择'")
    private String tc_5_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他促甲状腺素(TSH)抑制剂'")
    private String tc_5_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '治疗并发症的选择'")
    private String tc_5_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他治疗并发症'")
    private String tc_5_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术后核素治疗适应证的选择'")
    private String tc_5_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '其他术后核素治疗适应证'")
    private String tc_5_2_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行术后核素治疗'")
    private String tc_5_2_6;
    @Column(columnDefinition = "varchar(64) COMMENT '是否输血'")
    private String tc_6_1;
    @Column(columnDefinition = "double COMMENT '出血量(ml)'")
    private Double tc_6_1_1;
    @Column(columnDefinition = "double COMMENT '输血量(ml)'")
    private Double tc_6_1_2;
    @Column(columnDefinition = "double COMMENT '出血量(ml)'")
    private Double tc_6_2_1;
    @Column(columnDefinition = "double COMMENT '输血量(ml)'")
    private Double tc_6_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行甲状腺复发风险评估'")
    private String tc_7_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '告知甲状腺癌复发风险评估结果'")
    private String tc_7_2_2;

}
