package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "QUALITY_AECOPD")
@Data
public class AecopdDO extends BaseEntity{


    @Column(columnDefinition = "varchar(64) COMMENT '入院后是否实施首次病情严重程度评估'")
    private String aecopd_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '评价结果'")
    private String aecopd_1_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '入院后是否实施首次氧合评估（首次）'")
    private String aecopd_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '实施首次氧合评估时是否吸氧'")
    private String aecopd_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '动脉血气分析/指氧仪检查'")
    private String aecopd_1_2_3;
    @Column(columnDefinition = "double COMMENT '动脉血气分析（mmHg）'")
    private Double aecopd_1_2_3_3;
    @Column(columnDefinition = "double COMMENT '指氧仪检查（%）'")
    private Double aecopd_1_2_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '入院后首次氧合评估结论的判定'")
    private String aecopd_1_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '入院后是否实施首次胸部影像学检查'")
    private String aecopd_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '首次胸部影像学检查模式'")
    private String aecopd_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '胸部影像学检查评估'")
    private String aecopd_1_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其它胸部影像学检查评估'")
    private String aecopd_1_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '入院后是否实施首次心电图检查评估'")
    private String aecopd_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '心电图检查评估'")
    private String aecopd_1_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其它心电图检查评估'")
    private String aecopd_1_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '入院后是否实施首次实验室检查评估'")
    private String aecopd_1_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '实验室检查评估'")
    private String aecopd_1_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其它实验室检查评估'")
    private String aecopd_1_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否入住ICU'")
    private String aecopd_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '收住ICU符合指征的选择'")
    private String aecopd_2_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '入住ICU时机'")
    private String aecopd_2_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '选择AECOPD治疗的分级'")
    private String aecopd_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '氧疗方法'")
    private String aecopd_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '氧疗 30min 后是否复查动脉血气'")
    private String aecopd_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '用药前病情判定分层'")
    private String aecopd_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '轻度及中度COPD急性加重'")
    private String aecopd_4_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他轻度及中度COPD急性加重抗菌药物'")
    private String aecopd_4_1_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '重度及极重度COPD急性加重，无铜绿假单孢菌感染危险因素患者抗菌药物选择'")
    private String aecopd_4_1_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他重度及极重度COPD急性加重，无铜绿假单孢菌感染危险因素患者抗菌药物'")
    private String aecopd_4_1_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '重度及极重度COPD急性加重，有铜绿假单孢菌感染危险因素患者抗菌药物选择'")
    private String aecopd_4_1_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '其他重度及极重度COPD急性加重，有铜绿假单孢菌感染危险因素患者抗菌药物'")
    private String aecopd_4_1_2_6;
    @Column(columnDefinition = "varchar(64) COMMENT '患者接受首剂抗菌药物治疗（注射剂输入/注射）日期时间'")
    private Date aecopd_4_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '接受首剂抗菌药物使用时机的分层'")
    private String aecopd_4_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '患者停止使用抗菌药物日期'")
    private Date aecopd_4_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '支气管舒张剂、吸入糖皮质激素使用的选择'")
    private String aecopd_5_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他支气管舒张剂、吸入糖皮质激素使用'")
    private String aecopd_5_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施血清茶碱浓度监测'")
    private String aecopd_5_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '全身使用糖皮质激素药物的选择'")
    private String aecopd_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他使用糖皮质激素药物'")
    private String aecopd_5_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '全身使用糖皮质激素药物起始日期'")
    private Date aecopd_5_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '全身使用糖皮质激素药物终止日期'")
    private Date aecopd_5_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有有心功不全'")
    private String aecopd_6_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '首位处置项目'")
    private String aecopd_6_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '有心功不全时,其他处置项目'")
    private String aecopd_6_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有有肺动脉高压和右心功能不全'")
    private String aecopd_6_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用血管扩张剂（无禁忌症）的选择'")
    private String aecopd_6_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '有肺动脉高压和右心功能不全时,使用其他血管扩张剂'")
    private String aecopd_6_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有血栓形成高危因素'")
    private String aecopd_6_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '首位处置项目'")
    private String aecopd_6_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '有血栓形成高危因素时,其他处置项目'")
    private String aecopd_6_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有呼吸功能不全'")
    private String aecopd_6_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '首位处置项目'")
    private String aecopd_6_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '有呼吸功能不全时,其他处置项目'")
    private String aecopd_6_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有气胸'")
    private String aecopd_6_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '首位处置项目'")
    private String aecopd_6_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '有气胸时,其他处置项目'")
    private String aecopd_6_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施无创正压通气（NIV）'")
    private String aecopd_7_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '无创正压通气的应用指征'")
    private String aecopd_7_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'NIV相对禁忌证'")
    private String aecopd_7_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者无创正压通气起始日期时间'")
    private Date aecopd_7_1_6;
    @Column(columnDefinition = "varchar(64) COMMENT '患者无创正压通气终止日期时间'")
    private Date aecopd_7_1_7;
    @Column(columnDefinition = "double COMMENT '无创正压通气疗程（小时）'")
    private Double aecopd_7_1_8;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施有创机械通气'")
    private String aecopd_7_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '有创机械通气指征'")
    private String aecopd_7_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '患者有机械通气起始日期时间'")
    private Date aecopd_7_2_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者有机械通气终止日期时间'")
    private Date aecopd_7_2_6;
    @Column(columnDefinition = "double COMMENT '有机械通气疗程（小时）'")
    private Double aecopd_7_2_7;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施有创-无创序贯通气疗法'")
    private String aecopd_7_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '有无吸烟史'")
    private String aecopd_8_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '吸烟程度评估有记录'")
    private String aecopd_8_2;
    @Column(columnDefinition = "varchar(64) COMMENT '接受戒烟的建议或者戒烟治疗有记录'")
    private String aecopd_8_3;
    @Column(columnDefinition = "varchar(64) COMMENT '符合出院标准'")
    private String aecopd_9_1_1;

}
