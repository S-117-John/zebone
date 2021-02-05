package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

//@Entity
//@Table(name = "QUALITY_AVR")
@Data
public class AvrDO extends BaseEntity{



    @Column(columnDefinition = "varchar(64) COMMENT '是否实施实施手术前的超声心动图评估'")
    private String avr_1_1_1;
    @Column(columnDefinition = "double COMMENT '左室射血分数（LVEF）测量值(%)'")
    private Double avr_1_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'LVEF评估结果的选择'")
    private String avr_1_1_3;
    @Column(columnDefinition = "double COMMENT '左心房前后径(mm)'")
    private Double avr_1_1_4;
    @Column(columnDefinition = "double COMMENT '反流量(ml)'")
    private Double avr_1_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '反流量评估结果的选择'")
    private String avr_1_1_6;
    @Column(columnDefinition = "double COMMENT '主动脉瓣口面积(cm²)'")
    private Double avr_1_1_7;
    @Column(columnDefinition = "double COMMENT '收缩期峰值流速(m/s)'")
    private Double avr_1_1_8;
    @Column(columnDefinition = "double COMMENT '跨瓣压差( mmHg)'")
    private Double avr_1_1_9;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有冠心病史，或冠心病危险因素'")
    private String avr_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施实施手术前的冠状动脉造影评估'")
    private String avr_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '冠状动脉病变数量'")
    private String avr_1_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '血管病变主要位置'")
    private String avr_1_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用SinoSCOREⅡ风险评估表进行手术前风险评估'")
    private String avr_1_3_1;
    @Column(columnDefinition = "double COMMENT 'AVR手术风险评估（SinoSCORE-Ⅱ）评估值'")
    private Double avr_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '评估结果分层的选择'")
    private String avr_1_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用欧州心血管手术危险因素评分 EuroSCORE进行手术前评估'")
    private String avr_1_3_5;
    @Column(columnDefinition = "double COMMENT '欧州心血管手术危险因素评分 EuroSCORE值'")
    private Double avr_1_3_6;
    @Column(columnDefinition = "varchar(64) COMMENT '评估结果分层的选择'")
    private String avr_1_3_7;
    @Column(columnDefinition = "varchar(64) COMMENT '术前最后一次实验室检查结果'")
    private String avr_1_4_1;
    @Column(columnDefinition = "double COMMENT '术前最后一次血肌酐值(mg/dL)'")
    private Double avr_1_4_1_1;
    @Column(columnDefinition = "double COMMENT '术前最后一次总胆固醇(mg/dL)'")
    private Double avr_1_4_1_2;
    @Column(columnDefinition = "double COMMENT '术前最后一次低密度脂蛋白(mg/dL)'")
    private Double avr_1_4_1_3;
    @Column(columnDefinition = "double COMMENT '术前最后一次血糖(mg/dL)'")
    private Double avr_1_4_1_4;
    @Column(columnDefinition = "double COMMENT '术前最后一次血红蛋白(g/L)'")
    private Double avr_1_4_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '出院前末次实验检查结果'")
    private String avr_1_4_2;
    @Column(columnDefinition = "double COMMENT '出院前末次血肌酐值(mg/dL)'")
    private Double avr_1_4_2_1;
    @Column(columnDefinition = "double COMMENT '出院前末次总胆固醇(mg/dL)'")
    private Double avr_1_4_2_2;
    @Column(columnDefinition = "double COMMENT '出院前末次低密度脂蛋白(mg/dL)'")
    private Double avr_1_4_2_3;
    @Column(columnDefinition = "double COMMENT '出院前末次血糖(mg/dL)'")
    private Double avr_1_4_2_4;
    @Column(columnDefinition = "double COMMENT '出院前末次血红蛋白(g/L)'")
    private Double avr_1_4_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '主动脉瓣手术适应证'")
    private String avr_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施急诊主动脉瓣手术'")
    private String avr_2_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否合并其他手术'")
    private String avr_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '合并手术'")
    private String avr_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '手术切口的选择'")
    private String avr_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他手术切口'")
    private String avr_2_3_1_1;
    @Column(columnDefinition = "double COMMENT '患者体表面积(m²)'")
    private Double avr_3_1_1;
    @Column(columnDefinition = "double COMMENT '人工瓣有效瓣口面积(cm²)'")
    private Double avr_3_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '起始日期时间'")
    private Date avr_3_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '终止日期时间'")
    private Date avr_3_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '术中使用经食道超声'")
    private String avr_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'TEE返流分级'")
    private String avr_3_3_2;
    @Column(columnDefinition = "double COMMENT '跨瓣压差(mmHg)'")
    private Double avr_3_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否围术期使用血制品'")
    private String avr_3_4_1;
    @Column(columnDefinition = "double COMMENT '其中:全血量(ml)'")
    private Double avr_3_4_2;
    @Column(columnDefinition = "double COMMENT '其中:红细胞量(ml)'")
    private Double avr_3_4_3;
    @Column(columnDefinition = "double COMMENT '其中:血浆量(ml)'")
    private Double avr_3_4_4;
    @Column(columnDefinition = "double COMMENT '其中:血小板量(ml)'")
    private Double avr_3_4_5;
    @Column(columnDefinition = "double COMMENT '临床用血总量(ml)'")
    private Double avr_3_4_6;
    @Column(columnDefinition = "varchar(64) COMMENT '是否术后入住ICU/术后复苏室'")
    private String avr_3_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否ICU/术后复苏室实施机械通气'")
    private String avr_3_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '起始日期时间'")
    private Date avr_3_5_3;
    @Column(columnDefinition = "varchar(64) COMMENT '终止日期时间'")
    private Date avr_3_5_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有术后活动性出血或血肿'")
    private String avr_5_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术后活动性出血或血肿主要情况'")
    private String avr_5_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否再手术'")
    private String avr_5_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '再手术指征的选择'")
    private String avr_5_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他心脏问题再手术'")
    private String avr_5_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他非心脏问题再手术'")
    private String avr_5_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '再手术起始日期时间'")
    private Date avr_5_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '住院患者发生压疮'")
    private String avr_6_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '循环系统术后并发症'")
    private String avr_6_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '心脏和血管植入物的并发症(不包括脓毒症)'")
    private String avr_6_2_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '术后并发脑卒中/脑血管事件'")
    private String avr_6_2_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT 'AVR术后特指并发症--手术后急性肾损伤'")
    private String avr_6_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT 'AVR术后透析名称与编码'")
    private String avr_6_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '术后头颅影像学检查'")
    private String avr_6_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '头颅影像学检查结果'")
    private String avr_6_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时是否有继续使用华法林的带药医嘱'")
    private String avr_7_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时是否有继续使用除华法林外其他抗凝药物的用药医嘱'")
    private String avr_7_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药医嘱包括以下药物'")
    private String avr_7_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他抗凝药物'")
    private String avr_7_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行术前、术后健康教育，且有记录可追踪'")
    private String avr_8_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时,告知患者本人高危因素本人评估结果'")
    private String avr_8_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '常见高危因素的选择'")
    private String avr_8_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他常见高危因素'")
    private String avr_8_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否履行出院告知与术后康复教育责任，且有记录可追踪'")
    private String avr_8_3_1;

}
