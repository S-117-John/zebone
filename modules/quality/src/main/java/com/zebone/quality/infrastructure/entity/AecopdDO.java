package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "QUALITY_AECOPD")
@Data
public class AecopdDO extends DataEntity{


    @Column(columnDefinition = "varchar(64) COMMENT '质控医师'")
    private String cm_0_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '质控护士'")
    private String cm_0_1_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '主治医师'")
    private String cm_0_1_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '责任护士'")
    private String cm_0_1_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '上报科室'")
    private String cm_0_1_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '患者病案号'")
    private String caseid;
    @Column(columnDefinition = "varchar(64) COMMENT '主要诊断ICD-10四位亚目编码与名称'")
    private String cm_0_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要诊断ICD-10六位临床扩展编码与名称'")
    private String cm_0_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称'")
    private String cm_0_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称'")
    private String cm_0_1_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否出院后31天内重复住院'")
    private String cm_0_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '出生日期'")
    private Date cm_0_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者性别'")
    private String cm_0_2_1_2;
    @Column(columnDefinition = "double COMMENT '患者体重（kg）'")
    private Double cm_0_2_1_3;
    @Column(columnDefinition = "double COMMENT '患者身高（cm）'")
    private Double cm_0_2_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '入院日期时间'")
    private Date cm_0_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院日期时间'")
    private Date cm_0_2_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '入住ICU/RICU日期时间'")
    private Date cm_0_2_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '离开ICU/RICU日期时间'")
    private Date cm_0_2_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '费用支付方式'")
    private String cm_0_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '收入住院途径'")
    private String cm_0_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '到院交通工具'")
    private String cm_0_3_3;
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
    @Column(columnDefinition = "varchar(64) COMMENT '交与患者“出院小结”的副本告知患者出院时风险因素'")
    private String cm_7_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药'")
    private String cm_7_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '告知发生紧急意外情况或者疾病复发如何救治及前途经'")
    private String cm_7_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时教育与随访'")
    private String cm_7_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '告知何为发生紧急意外情况或者疾病复发'")
    private String cm_7_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '符合出院标准'")
    private String aecopd_9_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '离院方式选择'")
    private String cm_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '非医嘱离院可能涉及因素'")
    private String cm_4_5;
    @Column(columnDefinition = "varchar(64) COMMENT '其他非医嘱离院因素填写'")
    private String cm_4_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '死亡可能涉及因素'")
    private String cm_4_6;
    @Column(columnDefinition = "varchar(64) COMMENT '患者是否对服务的体验与评价'")
    private String cm_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '整体医院评级'")
    private String cm_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者推荐'")
    private String cm_5_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '病房、床单元和卫生间清洁度'")
    private String cm_5_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '病房与周边噪音'")
    private String cm_5_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '医生沟通'")
    private String cm_5_2_6;
    @Column(columnDefinition = "varchar(64) COMMENT '护士沟通'")
    private String cm_5_2_7;
    @Column(columnDefinition = "varchar(64) COMMENT '药师沟通'")
    private String cm_5_2_8;
    @Column(columnDefinition = "varchar(64) COMMENT '康复计划'")
    private String cm_5_2_9;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时的知情告知'")
    private String cm_5_2_10;
    @Column(columnDefinition = "varchar(64) COMMENT '膳食评价'")
    private String cm_5_2_11;
    @Column(columnDefinition = "double COMMENT '住院总费用'")
    private Double cm_6_1;
    @Column(columnDefinition = "double COMMENT '住院总费用其中自付金额'")
    private Double cm_6_2;
    @Column(columnDefinition = "double COMMENT '一般医疗服务费'")
    private Double cm_6_3;
    @Column(columnDefinition = "double COMMENT '一般治疗操作费'")
    private Double cm_6_4;
    @Column(columnDefinition = "double COMMENT '护理费'")
    private Double cm_6_5;
    @Column(columnDefinition = "double COMMENT '综合医疗服务类其他费用'")
    private Double cm_6_6;
    @Column(columnDefinition = "double COMMENT '病理诊断费'")
    private Double cm_6_7;
    @Column(columnDefinition = "double COMMENT '实验室诊断费'")
    private Double cm_6_8;
    @Column(columnDefinition = "double COMMENT '影像学诊断费'")
    private Double cm_6_9;
    @Column(columnDefinition = "double COMMENT '临床诊断项目费'")
    private Double cm_6_10;
    @Column(columnDefinition = "double COMMENT '非手术治疗项目费'")
    private Double cm_6_11;
    @Column(columnDefinition = "double COMMENT '其中：临床物理治疗费'")
    private Double cm_6_12;
    @Column(columnDefinition = "double COMMENT '手术治疗费'")
    private Double cm_6_13;
    @Column(columnDefinition = "double COMMENT '其中：麻醉费'")
    private Double cm_6_14;
    @Column(columnDefinition = "double COMMENT '其中：手术费'")
    private Double cm_6_15;
    @Column(columnDefinition = "double COMMENT '康复费'")
    private Double cm_6_16;
    @Column(columnDefinition = "double COMMENT '中医治疗费'")
    private Double cm_6_17;
    @Column(columnDefinition = "double COMMENT '西药费'")
    private Double cm_6_18;
    @Column(columnDefinition = "double COMMENT '其中：抗菌药物费'")
    private Double cm_6_19;
    @Column(columnDefinition = "double COMMENT '中成药费'")
    private Double cm_6_20;
    @Column(columnDefinition = "double COMMENT '中草药费'")
    private Double cm_6_21;
    @Column(columnDefinition = "double COMMENT '血费'")
    private Double cm_6_22;
    @Column(columnDefinition = "double COMMENT '白蛋白类制品费'")
    private Double cm_6_23;
    @Column(columnDefinition = "double COMMENT '球蛋白类制品费'")
    private Double cm_6_24;
    @Column(columnDefinition = "double COMMENT '凝血因子类制品费'")
    private Double cm_6_25;
    @Column(columnDefinition = "double COMMENT '细胞因子类制品费'")
    private Double cm_6_26;
    @Column(columnDefinition = "double COMMENT '检查用一次性医用材料费'")
    private Double cm_6_27;
    @Column(columnDefinition = "double COMMENT '治疗用一次性医用材料费'")
    private Double cm_6_28;
    @Column(columnDefinition = "double COMMENT '手术用一次性医用材料费'")
    private Double cm_6_29;
    @Column(columnDefinition = "double COMMENT '其他费'")
    private Double cm_6_30;


}
