package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

//@Entity
//@Table(name = "QUALITY_CABG")
@Data
public class CabgDO extends DataEntity{

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
    @Column(columnDefinition = "varchar(64) COMMENT '其他ICD-9-CM-3四位亚目编码与名称'")
    private String cm_0_1_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称'")
    private String cm_0_1_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他ICD-9-CM-3 六位临床扩展编码与名称'")
    private String cm_0_1_4_2_1;
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
    @Column(columnDefinition = "varchar(64) COMMENT '入住ICU/麻醉复苏室日期时间'")
    private Date cm_0_2_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '离开ICU/麻醉复苏室日期时间'")
    private Date cm_0_2_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '手术开始日期时间'")
    private Date cm_0_2_6_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术结束日期时间'")
    private Date cm_0_2_6_2;
    @Column(columnDefinition = "varchar(64) COMMENT '费用支付方式'")
    private String cm_0_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '收入住院途径'")
    private String cm_0_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '到院交通工具'")
    private String cm_0_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '实施手术前的冠状动脉造影评估'")
    private String cabg_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '冠状动脉病变数量'")
    private String cabg_1_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '血管病变主要位置'")
    private String cabg_1_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用“SinoSCOREⅡ风险评估表”进行手术前风险评估'")
    private String cabg_1_1_1;
    @Column(columnDefinition = "double COMMENT '”CABG手术风险评估（SinoSCOREⅡ）“评估值'")
    private Double cabg_1_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '评估结果分层的选择'")
    private String cabg_1_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用”欧州心血管手术危险因素评分 EuroSCORE“进行手术前评估'")
    private String cabg_1_3_1;
    @Column(columnDefinition = "double COMMENT '实施手术前的危险因素EuroSCORE 评分值'")
    private Double cabg_1_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '评估结果分层'")
    private String cabg_1_3_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否在术前24小时内使用β受体阻滞剂'")
    private String cabg_1_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用首剂β-受体阻滞剂'")
    private String cabg_1_4_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '使用首剂β-受体阻滞剂编写'")
    private String cabg_1_4_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术前最后一次实验室检查结果'")
    private String cabg_1_4_1;
    @Column(columnDefinition = "double COMMENT '术前最后一次血肌酐值（mg/dL）'")
    private Double cabg_1_4_2;
    @Column(columnDefinition = "double COMMENT '术前最后一次总胆固醇（mg/dL）'")
    private Double cabg_1_4_3;
    @Column(columnDefinition = "double COMMENT '术前最后一次低密度脂蛋白（mg/dL）'")
    private Double cabg_1_4_4;
    @Column(columnDefinition = "double COMMENT '术前最后一次血糖（mg/dL）'")
    private Double cabg_1_4_5;
    @Column(columnDefinition = "double COMMENT '术前最后一次血红蛋白（g/L）'")
    private Double cabg_1_4_6;
    @Column(columnDefinition = "double COMMENT '术后最高血肌酐值（mg/dL）'")
    private Double cabg_1_4_7;
    @Column(columnDefinition = "double COMMENT '术后最高CK-MB（U/L）'")
    private Double cabg_1_4_8;
    @Column(columnDefinition = "double COMMENT '术后最高cTnI（ug/L）'")
    private Double cabg_1_4_9;
    @Column(columnDefinition = "varchar(64) COMMENT '术前最后一次超声心动图左室射血分数'")
    private String cabg_1_5_1;
    @Column(columnDefinition = "double COMMENT '术前最后一次超声心动图左室射血分数(%)'")
    private Double cabg_1_5_2;
    @Column(columnDefinition = "double COMMENT '左室舒张末内径(mm)'")
    private Double cabg_1_5_3;
    @Column(columnDefinition = "double COMMENT '左房内径(mm)'")
    private Double cabg_1_5_4;
    @Column(columnDefinition = "double COMMENT '三尖瓣收缩期返流流速(m/s)'")
    private Double cabg_1_5_5;
    @Column(columnDefinition = "double COMMENT '主动脉瓣跨瓣压差(mmHg)'")
    private Double cabg_1_5_6;
    @Column(columnDefinition = "varchar(64) COMMENT '手术指征'")
    private String cabg_2_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他手术指征'")
    private String cabg_2_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施急诊CABG手术'")
    private String cabg_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施急诊CABG手术'")
    private String cabg_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他急诊CABG手术'")
    private String cabg_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术切口的选择'")
    private String cabg_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否合并其他手术'")
    private String cabg_2_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术方法'")
    private String cabg_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用体外循环'")
    private String cabg_2_6;
    @Column(columnDefinition = "varchar(64) COMMENT '体外循环使用日期开始时间'")
    private Date cabg_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '体外循环使用日期结束时间'")
    private Date cabg_3_3_3;
    @Column(columnDefinition = "double COMMENT '体外循环持续时间'")
    private Double cabg_3_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否术中转为体外循环'")
    private String cabg_2_7;
    @Column(columnDefinition = "varchar(64) COMMENT 'CABG术中是否放置漂浮导管'")
    private String cabg_2_7_1;
    @Column(columnDefinition = "varchar(64) COMMENT '围术期使用血制品'")
    private String cabg_2_8_1;
    @Column(columnDefinition = "double COMMENT '其中:全血量（ml）'")
    private Double cabg_2_8_3;
    @Column(columnDefinition = "double COMMENT '其中:红细胞量（ml）'")
    private Double cabg_2_8_4;
    @Column(columnDefinition = "double COMMENT '其中:血浆量（ml）'")
    private Double cabg_2_8_5;
    @Column(columnDefinition = "double COMMENT '其中:血小板量（ml）'")
    private Double cabg_2_8_6;
    @Column(columnDefinition = "double COMMENT '临床用血总量（ml）'")
    private Double cabg_2_8_2;
    @Column(columnDefinition = "varchar(64) COMMENT '建立血管桥支数'")
    private String cabg_3_1_0;
    @Column(columnDefinition = "varchar(64) COMMENT '血管桥材料'")
    private String cabg_3_10_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他血管桥材料'")
    private String cabg_3_10_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '远端吻合口位置'")
    private String cabg_3_10_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施桥血管流量监测'")
    private String cabg_3_10_1_5;
    @Column(columnDefinition = "double COMMENT '桥血管流量（mL/min）'")
    private Double cabg_3_10_1_6;
    @Column(columnDefinition = "varchar(64) COMMENT '血管桥材料'")
    private String cabg_3_10_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他血管桥材料'")
    private String cabg_3_10_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '远端吻合口位置'")
    private String cabg_3_10_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施桥血管流量监测'")
    private String cabg_3_10_2_4;
    @Column(columnDefinition = "double COMMENT '桥血管流量（mL/min）'")
    private Double cabg_3_10_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '血管桥材料'")
    private String cabg_3_10_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他血管桥材料'")
    private String cabg_3_10_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '远端吻合口位置'")
    private String cabg_3_10_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施桥血管流量监测'")
    private String cabg_3_10_3_4;
    @Column(columnDefinition = "double COMMENT '桥血管流量（mL/min）'")
    private Double cabg_3_10_3_5;
    @Column(columnDefinition = "varchar(64) COMMENT '血管桥材料'")
    private String cabg_3_10_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他血管桥材料'")
    private String cabg_3_10_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '远端吻合口位置'")
    private String cabg_3_10_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施桥血管流量监测'")
    private String cabg_3_10_4_4;
    @Column(columnDefinition = "double COMMENT '桥血管流量（mL/min）'")
    private Double cabg_3_10_4_5;
    @Column(columnDefinition = "varchar(64) COMMENT '血管桥材料'")
    private String cabg_3_10_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他血管桥材料'")
    private String cabg_3_10_5_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '远端吻合口位置'")
    private String cabg_3_10_5_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施桥血管流量监测'")
    private String cabg_3_10_5_4;
    @Column(columnDefinition = "double COMMENT '桥血管流量（mL/min）'")
    private Double cabg_3_10_5_5;
    @Column(columnDefinition = "varchar(64) COMMENT '血管桥材料'")
    private String cabg_3_10_6_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他血管桥材料'")
    private String cabg_3_10_6_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '远端吻合口位置'")
    private String cabg_3_10_6_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施桥血管流量监测'")
    private String cabg_3_10_6_4;
    @Column(columnDefinition = "double COMMENT '桥血管流量（mL/min）'")
    private Double cabg_3_10_6_5;
    @Column(columnDefinition = "varchar(64) COMMENT '血管桥材料'")
    private String cabg_3_10_7_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他血管桥材料'")
    private String cabg_3_10_7_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '远端吻合口位置'")
    private String cabg_3_10_7_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施桥血管流量监测'")
    private String cabg_3_10_7_4;
    @Column(columnDefinition = "double COMMENT '桥血管流量（mL/min）'")
    private Double cabg_3_10_7_5;
    @Column(columnDefinition = "varchar(64) COMMENT '血管桥材料'")
    private String cabg_3_10_8_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他血管桥材料'")
    private String cabg_3_10_8_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '远端吻合口位置'")
    private String cabg_3_10_8_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施桥血管流量监测'")
    private String cabg_3_10_8_4;
    @Column(columnDefinition = "double COMMENT '桥血管流量（mL/min）'")
    private Double cabg_3_10_8_5;
    @Column(columnDefinition = "varchar(64) COMMENT '血管桥材料'")
    private String cabg_3_10_9_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他血管桥材料'")
    private String cabg_3_10_9_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '远端吻合口位置'")
    private String cabg_3_10_9_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施桥血管流量监测'")
    private String cabg_3_10_9_4;
    @Column(columnDefinition = "double COMMENT '桥血管流量（mL/min）'")
    private Double cabg_3_10_9_5;
    @Column(columnDefinition = "varchar(64) COMMENT '血管桥材料'")
    private String cabg_3_10_10_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他血管桥材料'")
    private String cabg_3_10_10_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '远端吻合口位置'")
    private String cabg_3_10_10_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施桥血管流量监测'")
    private String cabg_3_10_10_4;
    @Column(columnDefinition = "double COMMENT '桥血管流量（mL/min）'")
    private Double cabg_3_10_10_5;
    @Column(columnDefinition = "varchar(64) COMMENT '术后是否入住ICU/术后复苏室'")
    private String cabg_3_12;
    @Column(columnDefinition = "varchar(64) COMMENT '在ICU/术后复苏室是否实施机械通气'")
    private String cabg_3_13;
    @Column(columnDefinition = "varchar(64) COMMENT '起始时间'")
    private Date cabg_3_15_1;
    @Column(columnDefinition = "varchar(64) COMMENT '终止时间'")
    private Date cabg_3_15_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用预防性抗菌药物'")
    private String cm_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '预防性抗菌药物选择'")
    private String cm_1_2_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '选择碳青霉烯类及替加环素等特殊使用级抗菌药物'")
    private String cm_1_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他特殊使用级抗菌药物名称'")
    private String cm_1_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素'")
    private String cm_1_3_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素填写'")
    private String cm_1_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用首剂抗菌药物起始时间'")
    private Date cm_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术时间是否≥3小时'")
    private String cm_1_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否术中追加抗菌药物'")
    private String cm_1_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '术中出血量是否≥1500ml'")
    private String cm_1_5_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否术中追加抗菌药物'")
    private String cm_1_5_4;
    @Column(columnDefinition = "varchar(64) COMMENT '术后抗菌药物停止使用时间'")
    private Date cm_1_6_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用抗菌药物时间使用时间分层'")
    private String cm_1_6_2;
    @Column(columnDefinition = "varchar(64) COMMENT '术后72小时之后继续使用的原因'")
    private String cm_1_6_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '术后医嘱-阿司匹林药物'")
    private String cabg_13_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '用药日期时间'")
    private Date cabg_4_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '术后医嘱-氯吡格雷'")
    private String cabg_13_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '用药日期时间'")
    private Date cabg_4_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '术后医嘱-替格瑞洛'")
    private String cabg_13_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '用药日期时间'")
    private Date cabg_4_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术后是否有活动性出血或血肿'")
    private String cabg_5_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术后活动性出血或血肿主要情况'")
    private String cabg_5_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '再手术'")
    private String cabg_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '再手术指征'")
    private String cabg_5_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他心脏问题再手术'")
    private String cabg_5_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他非心脏问题再手术'")
    private String cabg_5_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '再手术起始时间'")
    private Date cabg_5_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有手术后并发证'")
    private String cm_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术后并发证类别及ICD-10四位亚目的选择'")
    private String cm_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他手术后并发证类别及ICD-10四位亚目和名称填写'")
    private String cm_2_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '介入操作与手术其他并发证'")
    private String cm_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术患者手术后肺栓塞'")
    private String cm_2_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '手术患者手术后深静脉血栓'")
    private String cm_2_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '手术患者手术后败血症'")
    private String cm_2_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '手术患者手术后出血或血肿'")
    private String cm_2_3_5;
    @Column(columnDefinition = "varchar(64) COMMENT '手术患者手术伤口裂开'")
    private String cm_2_3_6;
    @Column(columnDefinition = "varchar(64) COMMENT '手术患者猝死'")
    private String cm_2_3_7;
    @Column(columnDefinition = "varchar(64) COMMENT '手术患者手术后呼吸道并发证'")
    private String cm_2_3_8;
    @Column(columnDefinition = "varchar(64) COMMENT '手术患者手术后生理/代谢紊乱'")
    private String cm_2_3_9;
    @Column(columnDefinition = "varchar(64) COMMENT '与手术/操作相关感染'")
    private String cm_2_3_10;
    @Column(columnDefinition = "varchar(64) COMMENT '手术过程中异物遗留'")
    private String cm_2_3_11;
    @Column(columnDefinition = "varchar(64) COMMENT '麻醉并发证'")
    private String cm_2_3_12;
    @Column(columnDefinition = "varchar(64) COMMENT '输注、输血反应'")
    private String cm_2_3_13;
    @Column(columnDefinition = "varchar(64) COMMENT '住院患者发生压疮'")
    private String cm_2_70;
    @Column(columnDefinition = "varchar(64) COMMENT '循环系统术后并发证'")
    private String cm_2_71;
    @Column(columnDefinition = "varchar(64) COMMENT '心脏和血管植入物的并发证'")
    private String cm_2_72;
    @Column(columnDefinition = "varchar(64) COMMENT '脑卒中/脑血管事件'")
    private String cm_2_73;
    @Column(columnDefinition = "varchar(64) COMMENT 'CABG术后特指并发症--手术后急性肾损伤'")
    private String cabg_6_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行术后头颅影像学检查'")
    private String cabg_7_2;
    @Column(columnDefinition = "varchar(64) COMMENT '头颅影像学检查结果'")
    private String cm_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药医嘱：阿司匹林医嘱'")
    private String cabg_14_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '药物品名的选择'")
    private String cabg_14_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他抗血小板药物'")
    private String cabg_14_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药医嘱-β阻滞剂医嘱'")
    private String cabg_14_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '药物品名的选择'")
    private String cabg_14_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他β-受体阻滞剂'")
    private String cabg_14_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药医嘱-他汀类药物医嘱'")
    private String cabg_14_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '药物品名的选择'")
    private String cabg_14_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他降脂药物'")
    private String cabg_14_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术前健康教育项目的选择'")
    private String cabg_7_1;
    @Column(columnDefinition = "varchar(64) COMMENT '围术期心梗的护理措施'")
    private String cabg_7_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '循环维护'")
    private String cabg_7_4_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '心律失常'")
    private String cabg_7_4_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '下肢组织灌注量改变'")
    private String cabg_7_4_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '合并糖尿病的护理'")
    private String cabg_7_4_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '术后主要护理措施无法确定或无记录'")
    private String cabg_7_4_1_6;
    @Column(columnDefinition = "varchar(64) COMMENT '血运重建术后应当定期进行全面的临床和预后评估的选择'")
    private String cabg_7_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '应当对患者进行健康教育的选择'")
    private String cabg_7_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '饮食和体重的控制标准的选择'")
    private String cabg_7_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '推荐选择健康食品，改变生活方式、饮食疗法及药物治疗的选择'")
    private String cabg_7_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '糖尿病患者控制血糖水平'")
    private String cabg_7_3_5;
    @Column(columnDefinition = "varchar(64) COMMENT '手术野皮肤准备常用方法的选择'")
    private String cm_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用含抗菌剂（三氯生）缝线'")
    private String cm_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他含抗菌剂缝线填写'")
    private String cm_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术切口类别的选择'")
    private String cm_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '手术切口愈合情况的选择'")
    private String cm_3_4;
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
