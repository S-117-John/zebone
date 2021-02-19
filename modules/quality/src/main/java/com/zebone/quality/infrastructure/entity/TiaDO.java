package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "quality_tia")
public class TiaDO extends DataEntity{


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
    @Column(columnDefinition = "varchar(64) COMMENT '是否出院后31天内重复住院'")
    private String cm_0_1_5;
    @Column(columnDefinition = "datetime COMMENT '出生日期'")
    private Date cm_0_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者性别'")
    private String cm_0_2_1_2;
    @Column(columnDefinition = "double COMMENT '患者体重（kg）'")
    private Double cm_0_2_1_3;
    @Column(columnDefinition = "double COMMENT '患者身高（cm）'")
    private Double cm_0_2_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '发病日期时间是否无法确定或无记录'")
    private String cm_0_2_2_1;
    @Column(columnDefinition = "datetime COMMENT '发病日期时间'")
    private Date cm_0_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '到达本院急诊或者门诊日期时间是否无法确定或无记录'")
    private String cm_0_2_3_1;
    @Column(columnDefinition = "datetime COMMENT '到达本院急诊或者门诊日期时间'")
    private Date cm_0_2_3_2;
    @Column(columnDefinition = "datetime COMMENT '入院日期时间'")
    private Date cm_0_2_4_1;
    @Column(columnDefinition = "datetime COMMENT '出院日期时间'")
    private Date cm_0_2_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '费用支付方式'")
    private String cm_0_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '收入住院途径'")
    private String cm_0_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '到院交通工具'")
    private String cm_0_3_3;
    @Column(columnDefinition = "datetime COMMENT '评估日期时间'")
    private Date tia_1_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施ABCD/2/3/3-I评分'")
    private String tia_1_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '选择评估分值实施类型'")
    private String tia_1_1_4;
    @Column(columnDefinition = "double COMMENT 'ABCD评估分值'")
    private Double tia_1_1_4_1_0;
    @Column(columnDefinition = "double COMMENT 'ABCD2评估分值'")
    private Double tia_1_1_4_1_1;
    @Column(columnDefinition = "double COMMENT 'ABCD3评估分值'")
    private Double tia_1_1_4_2_1;
    @Column(columnDefinition = "double COMMENT 'ABCD3-I评估分值'")
    private Double tia_1_1_4_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'ABCD2/3/3-I 评估风险分层'")
    private String tia_1_1_4_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施首次头部影像学检查'")
    private String tia_1_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '头部影像学检查项目'")
    private String tia_1_2_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他头部影像学检查项目'")
    private String tia_1_2_1_4;
    @Column(columnDefinition = "datetime COMMENT '报告日期时间'")
    private Date tia_1_2_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施首次全血细胞计数检查'")
    private String tia_1_2_2_1;
    @Column(columnDefinition = "datetime COMMENT '报告日期时间'")
    private Date tia_1_2_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施首次凝血功能检查'")
    private String tia_1_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '凝血功能检查项目'")
    private String tia_1_2_3_2_1;
    @Column(columnDefinition = "datetime COMMENT '报告日期时间'")
    private Date tia_1_2_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施首次生化检验检查'")
    private String tia_1_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '生化检验项目'")
    private String tia_1_2_4_2_1;
    @Column(columnDefinition = "datetime COMMENT '报告日期时间'")
    private Date tia_1_2_4_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施首次ECG检查'")
    private String tia_1_2_5_1;
    @Column(columnDefinition = "datetime COMMENT '报告日期时间'")
    private Date tia_1_2_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '心电图（ECG）检查结果'")
    private String tia_1_2_5_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施首次心脏与血管检查'")
    private String tia_1_2_6_1;
    @Column(columnDefinition = "varchar(64) COMMENT '心脏检查相关项目选择'")
    private String tia_1_2_6_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他心脏检查项目'")
    private String tia_1_2_6_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '血管检查相关项目选择'")
    private String tia_1_2_6_5;
    @Column(columnDefinition = "varchar(64) COMMENT '其他血管检查相关项目'")
    private String tia_1_2_6_5_1;
    @Column(columnDefinition = "datetime COMMENT '首次报告日期时间'")
    private Date tia_1_2_6_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '评估结论'")
    private String tia_1_2_6_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他评估结论'")
    private String tia_1_2_6_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '收入院诊疗指症'")
    private String tia_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '房颤患者'")
    private String tia_2_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施房颤患者脑卒中风险评估（CHA2DS2-VASc评分）'")
    private String tia_2_1_1;
    @Column(columnDefinition = "double COMMENT '房颤患者脑卒中风险评估分值'")
    private Double tia_2_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施房颤症状严重程度EHRA评估'")
    private String tia_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '房颤症状严重程度EHRA评估结果'")
    private String tia_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有使用抗凝药物的禁忌症'")
    private String tia_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用抗凝药物的禁忌症'")
    private String tia_2_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否常用抗凝药物'")
    private String tia_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '抗凝药物'")
    private String tia_2_4_2;
    @Column(columnDefinition = "datetime COMMENT '用药日期时间'")
    private Date tia_2_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '高卒中复发风险因素'")
    private String tia_3_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他高卒中复发风险因素'")
    private String tia_3_1_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有使用阿司匹林禁忌症'")
    private String tia_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '阿司匹林禁忌症'")
    private String tia_3_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '患者是否使用首剂阿司匹林/氯吡格雷'")
    private String tia_3_2_1;
    @Column(columnDefinition = "datetime COMMENT '用药日期时间'")
    private Date tia_3_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '选择药物'")
    private String tia_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他抗血小板药物'")
    private String tia_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者评估时机选择'")
    private String tia_4_1_1;
    @Column(columnDefinition = "datetime COMMENT '评估日期'")
    private Date tia_4_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '选择血脂评估项目'")
    private String tia_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '评价血脂水平'")
    private String tia_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用他汀类药物'")
    private String tia_4_4_0;
    @Column(columnDefinition = "datetime COMMENT '首次使用他汀类医嘱的日期'")
    private Date tia_4_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '他汀类药物'")
    private String tia_4_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '选择抗血小扳聚集治疗药物'")
    private String tia_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他抗血小扳聚集治疗药物'")
    private String tia_5_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '他汀类药物'")
    private String tia_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '选择抗凝药物'")
    private String tia_5_3;
    @Column(columnDefinition = "varchar(64) COMMENT '患者是否伴发糖尿病'")
    private String tia_5_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '选择降糖药物'")
    private String tia_5_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他降糖药物'")
    private String tia_5_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '患者是否伴发高血压'")
    private String tia_5_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '选择降压药物'")
    private String tia_5_5;
    @Column(columnDefinition = "varchar(64) COMMENT '其他降压药物'")
    private String tia_5_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '行走评估结果'")
    private String tia_6_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '呼吸评估结果'")
    private String tia_6_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '饮食评估结果'")
    private String tia_6_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '实施卒中健康教育有记录'")
    private String tia_6_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '吸烟史'")
    private String tia_6_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '吸烟程度评估有记录'")
    private String tia_6_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '接受戒烟的建议或者戒烟治疗有记录'")
    private String tia_6_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '血管功能评估时间'")
    private String tia_7_1;
    @Column(columnDefinition = "varchar(64) COMMENT '血管功能评估方法'")
    private String tia_7_2;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时是否进行Essen卒中风险评分'")
    private String tia_9_1_1;
    @Column(columnDefinition = "double COMMENT 'Essen卒中风险评分值'")
    private Double tia_9_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要风险因素评估'")
    private String tia_9_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要风险因素填写'")
    private String tia_9_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他风险因素评估'")
    private String tia_9_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他风险因素填写'")
    private String tia_9_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '交与患者“出院小结”的副本告知患者出院时风险因素'")
    private String tia_9_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药'")
    private String tia_9_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '告知发生紧急情况时求援救治途径'")
    private String tia_9_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时教育与随访'")
    private String tia_9_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '告知何为风险因素与紧急情况'")
    private String tia_9_3_5;
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
