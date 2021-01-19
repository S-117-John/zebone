package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "quality_tia")
public class TiaDO extends BaseEntity{

    @Column(columnDefinition = "varchar(32) COMMENT '评估日期时间'")
    private Date tia_1_1_2_1;
    @Column(columnDefinition = "varchar(32) COMMENT '是否实施ABCD/2/3/3-I评分'")
    private String tia_1_1_3;
    @Column(columnDefinition = "varchar(32) COMMENT '选择评估分值实施类型'")
    private String tia_1_1_4;
    @Column(columnDefinition = "double COMMENT 'ABCD评估分值'")
    private Double tia_1_1_4_1_0;
    @Column(columnDefinition = "double COMMENT 'ABCD2评估分值'")
    private Double tia_1_1_4_1_1;
    @Column(columnDefinition = "double COMMENT 'ABCD3评估分值'")
    private Double tia_1_1_4_2_1;
    @Column(columnDefinition = "double COMMENT 'ABCD3-I评估分值'")
    private Double tia_1_1_4_3_1;
    @Column(columnDefinition = "varchar(32) COMMENT 'ABCD2/3/3-I 评估风险分层'")
    private String tia_1_1_4_5;
    @Column(columnDefinition = "varchar(32) COMMENT '是否实施首次头部影像学检查'")
    private String tia_1_2_1_1;
    @Column(columnDefinition = "varchar(32) COMMENT '头部影像学检查项目'")
    private String tia_1_2_1_2;
    @Column(columnDefinition = "varchar(32) COMMENT '其他头部影像学检查项目'")
    private String tia_1_2_1_4;
    @Column(columnDefinition = "varchar(32) COMMENT '报告日期时间'")
    private Date tia_1_2_1_3_1;
    @Column(columnDefinition = "varchar(32) COMMENT '是否实施首次全血细胞计数检查'")
    private String tia_1_2_2_1;
    @Column(columnDefinition = "varchar(32) COMMENT '报告日期时间'")
    private Date tia_1_2_2_2_1;
    @Column(columnDefinition = "varchar(32) COMMENT '是否实施首次凝血功能检查'")
    private String tia_1_2_3_1;
    @Column(columnDefinition = "varchar(32) COMMENT '凝血功能检查项目'")
    private String tia_1_2_3_2_1;
    @Column(columnDefinition = "varchar(32) COMMENT '报告日期时间'")
    private Date tia_1_2_3_3_1;
    @Column(columnDefinition = "varchar(32) COMMENT '是否实施首次生化检验检查'")
    private String tia_1_2_4_1;
    @Column(columnDefinition = "varchar(32) COMMENT '生化检验项目'")
    private String tia_1_2_4_2_1;
    @Column(columnDefinition = "varchar(32) COMMENT '报告日期时间'")
    private Date tia_1_2_4_3_1;
    @Column(columnDefinition = "varchar(32) COMMENT '是否实施首次ECG检查'")
    private String tia_1_2_5_1;
    @Column(columnDefinition = "varchar(32) COMMENT '报告日期时间'")
    private Date tia_1_2_5_2_1;
    @Column(columnDefinition = "varchar(32) COMMENT '心电图（ECG）检查结果'")
    private String tia_1_2_5_3;
    @Column(columnDefinition = "varchar(32) COMMENT '是否实施首次心脏与血管检查'")
    private String tia_1_2_6_1;
    @Column(columnDefinition = "varchar(32) COMMENT '心脏检查相关项目选择'")
    private String tia_1_2_6_3;
    @Column(columnDefinition = "varchar(32) COMMENT '其他心脏检查项目'")
    private String tia_1_2_6_3_1;
    @Column(columnDefinition = "varchar(32) COMMENT '血管检查相关项目选择'")
    private String tia_1_2_6_5;
    @Column(columnDefinition = "varchar(32) COMMENT '其他血管检查相关项目'")
    private String tia_1_2_6_5_1;
    @Column(columnDefinition = "varchar(32) COMMENT '首次报告日期时间'")
    private Date tia_1_2_6_2_1;
    @Column(columnDefinition = "varchar(32) COMMENT '评估结论'")
    private String tia_1_2_6_4;
    @Column(columnDefinition = "varchar(32) COMMENT '其他评估结论'")
    private String tia_1_2_6_4_1;
    @Column(columnDefinition = "varchar(32) COMMENT '收入院诊疗指症'")
    private String tia_1_3;
    @Column(columnDefinition = "varchar(32) COMMENT '房颤患者'")
    private String tia_2_1_1_1;
    @Column(columnDefinition = "varchar(32) COMMENT '是否实施房颤患者脑卒中风险评估（CHA2DS2-VASc评分）'")
    private String tia_2_1_1;
    @Column(columnDefinition = "double COMMENT '房颤患者脑卒中风险评估分值'")
    private Double tia_2_1_2_1;
    @Column(columnDefinition = "varchar(32) COMMENT '是否实施房颤症状严重程度EHRA评估'")
    private String tia_2_2_1;
    @Column(columnDefinition = "varchar(32) COMMENT '房颤症状严重程度EHRA评估结果'")
    private String tia_2_2_2;
    @Column(columnDefinition = "varchar(32) COMMENT '是否有使用抗凝药物的禁忌症'")
    private String tia_2_3_1;
    @Column(columnDefinition = "varchar(32) COMMENT '使用抗凝药物的禁忌症'")
    private String tia_2_3_2;
    @Column(columnDefinition = "varchar(32) COMMENT '是否常用抗凝药物'")
    private String tia_2_4_1;
    @Column(columnDefinition = "varchar(32) COMMENT '抗凝药物'")
    private String tia_2_4_2;
    @Column(columnDefinition = "varchar(32) COMMENT '用药日期时间'")
    private Date tia_2_4_3;
    @Column(columnDefinition = "varchar(32) COMMENT '高卒中复发风险因素'")
    private String tia_3_1_1_1;
    @Column(columnDefinition = "varchar(32) COMMENT '其他高卒中复发风险因素'")
    private String tia_3_1_1_2;
    @Column(columnDefinition = "varchar(32) COMMENT '是否有使用阿司匹林禁忌症'")
    private String tia_3_1_1;
    @Column(columnDefinition = "varchar(32) COMMENT '阿司匹林禁忌症'")
    private String tia_3_1_2;
    @Column(columnDefinition = "varchar(32) COMMENT '患者是否使用首剂阿司匹林/氯吡格雷'")
    private String tia_3_2_1;
    @Column(columnDefinition = "varchar(32) COMMENT '用药日期时间'")
    private Date tia_3_2_2_1;
    @Column(columnDefinition = "varchar(32) COMMENT '选择药物'")
    private String tia_3_3;
    @Column(columnDefinition = "varchar(32) COMMENT '其他抗血小板药物'")
    private String tia_3_3_1;
    @Column(columnDefinition = "varchar(32) COMMENT '患者评估时机选择'")
    private String tia_4_1_1;
    @Column(columnDefinition = "varchar(32) COMMENT '评估日期'")
    private Date tia_4_1_2_1;
    @Column(columnDefinition = "varchar(32) COMMENT '选择血脂评估项目'")
    private String tia_4_2_1;
    @Column(columnDefinition = "varchar(32) COMMENT '评价血脂水平'")
    private String tia_4_3;
    @Column(columnDefinition = "varchar(32) COMMENT '是否使用他汀类药物'")
    private String tia_4_4_0;
    @Column(columnDefinition = "varchar(32) COMMENT '首次使用他汀类医嘱的日期'")
    private Date tia_4_4_1_1;
    @Column(columnDefinition = "varchar(32) COMMENT '他汀类药物'")
    private String tia_4_4_2;
    @Column(columnDefinition = "varchar(32) COMMENT '选择抗血小扳聚集治疗药物'")
    private String tia_5_1;
    @Column(columnDefinition = "varchar(32) COMMENT '其他抗血小扳聚集治疗药物'")
    private String tia_5_1_1;
    @Column(columnDefinition = "varchar(32) COMMENT '他汀类药物'")
    private String tia_5_2;
    @Column(columnDefinition = "varchar(32) COMMENT '选择抗凝药物'")
    private String tia_5_3;
    @Column(columnDefinition = "varchar(32) COMMENT '患者是否伴发糖尿病'")
    private String tia_5_4_1;
    @Column(columnDefinition = "varchar(32) COMMENT '选择降糖药物'")
    private String tia_5_4;
    @Column(columnDefinition = "varchar(32) COMMENT '其他降糖药物'")
    private String tia_5_4_2;
    @Column(columnDefinition = "varchar(32) COMMENT '患者是否伴发高血压'")
    private String tia_5_5_1;
    @Column(columnDefinition = "varchar(32) COMMENT '选择降压药物'")
    private String tia_5_5;
    @Column(columnDefinition = "varchar(32) COMMENT '其他降压药物'")
    private String tia_5_5_2;
    @Column(columnDefinition = "varchar(32) COMMENT '行走评估结果'")
    private String tia_6_1_1;
    @Column(columnDefinition = "varchar(32) COMMENT '呼吸评估结果'")
    private String tia_6_1_2;
    @Column(columnDefinition = "varchar(32) COMMENT '饮食评估结果'")
    private String tia_6_1_3;
    @Column(columnDefinition = "varchar(32) COMMENT '实施卒中健康教育有记录'")
    private String tia_6_2_1;
    @Column(columnDefinition = "varchar(32) COMMENT '吸烟史'")
    private String tia_6_3_1;
    @Column(columnDefinition = "varchar(32) COMMENT '吸烟程度评估有记录'")
    private String tia_6_3_2;
    @Column(columnDefinition = "varchar(32) COMMENT '接受戒烟的建议或者戒烟治疗有记录'")
    private String tia_6_3_3;
    @Column(columnDefinition = "varchar(32) COMMENT '血管功能评估时间'")
    private String tia_7_1;
    @Column(columnDefinition = "varchar(32) COMMENT '血管功能评估方法'")
    private String tia_7_2;
    @Column(columnDefinition = "varchar(32) COMMENT '出院时是否进行Essen卒中风险评分'")
    private String tia_9_1_1;
    @Column(columnDefinition = "double COMMENT 'Essen卒中风险评分值'")
    private Double tia_9_1_2_1;
    @Column(columnDefinition = "varchar(32) COMMENT '主要风险因素评估'")
    private String tia_9_2_1;
    @Column(columnDefinition = "varchar(32) COMMENT '其他主要风险因素填写'")
    private String tia_9_2_1_1;
    @Column(columnDefinition = "varchar(32) COMMENT '其他风险因素评估'")
    private String tia_9_2_2;
    @Column(columnDefinition = "varchar(32) COMMENT '其他风险因素填写'")
    private String tia_9_2_2_1;
    @Column(columnDefinition = "varchar(32) COMMENT '交与患者“出院小结”的副本告知患者出院时风险因素'")
    private String tia_9_3_1;
    @Column(columnDefinition = "varchar(32) COMMENT '出院带药'")
    private String tia_9_3_2;
    @Column(columnDefinition = "varchar(32) COMMENT '告知发生紧急情况时求援救治途径'")
    private String tia_9_3_3;
    @Column(columnDefinition = "varchar(32) COMMENT '出院时教育与随访'")
    private String tia_9_3_4;
    @Column(columnDefinition = "varchar(32) COMMENT '告知何为风险因素与紧急情况'")
    private String tia_9_3_5;



}
