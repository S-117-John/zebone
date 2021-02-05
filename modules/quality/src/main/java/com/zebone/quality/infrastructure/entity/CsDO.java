package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "quality_cs")
@Data
public class CsDO extends DataEntity{


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
    @Column(columnDefinition = "varchar(64) COMMENT '患者身份证号'")
    private String idcard;
    @Column(columnDefinition = "varchar(64) COMMENT '出院诊断ICD-10四位亚目编码与名称'")
    private String cm_0_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院诊断ICD-10六位临床扩展编码与名称'")
    private String cm_0_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作 国家临床版ICD-9.CM-3编码与手术名称'")
    private String cm_0_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否出院后31天内重复住院'")
    private String cm_0_1_5;
    @Column(columnDefinition = "datetime COMMENT '出生日期'")
    private Date cm_0_2_1_1;
    @Column(columnDefinition = "double COMMENT '患者体重（kg）'")
    private Double cm_0_2_1_3;
    @Column(columnDefinition = "double COMMENT '患者身高（cm）'")
    private Double cm_0_2_1_5;
    @Column(columnDefinition = "double COMMENT '新生儿出生体重（克）'")
    private Double cm_0_2_1_6;
    @Column(columnDefinition = "varchar(64) COMMENT '末次月经日期是否确定'")
    private String cs_0_2_2_1;
    @Column(columnDefinition = "datetime COMMENT '末次月经日期'")
    private Date cs_0_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '到达本院急诊或者门诊日期时间是否确定'")
    private String cm_0_2_3_1;
    @Column(columnDefinition = "datetime COMMENT '到达本院急诊或者门诊日期时间'")
    private Date cm_0_2_3_2;
    @Column(columnDefinition = "datetime COMMENT '入院日期时间'")
    private Date cm_0_2_4_1;
    @Column(columnDefinition = "datetime COMMENT '出院日期时间'")
    private Date cm_0_2_4_2;
    @Column(columnDefinition = "datetime COMMENT '手术开始（切皮）日期时间'")
    private Date cm_0_2_6_1;
    @Column(columnDefinition = "datetime COMMENT '手术结束（缝皮结束）日期时间'")
    private Date cm_0_2_6_2;
    @Column(columnDefinition = "varchar(64) COMMENT '费用支付方式'")
    private String cm_0_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '收入住院途径'")
    private String cm_0_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '到院交通工具'")
    private String cm_0_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '产次'")
    private String cs_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '剖宮产史'")
    private String cs_1_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '临产方式'")
    private String cs_1_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '孕周'")
    private String cs_1_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '胎位'")
    private String cs_1_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '胎儿数量'")
    private String cs_1_1_6;
    @Column(columnDefinition = "varchar(64) COMMENT '手术前风险评估的检查项目'")
    private String cs_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术前知情告知'")
    private String cs_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '麻醉前知情告知'")
    private String cs_1_2_31;
    @Column(columnDefinition = "varchar(64) COMMENT '麻醉方式'")
    private String cs_1_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '特殊感染评估'")
    private String cs_1_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '孕妇伴有特殊感染ICD.10编码及诊断名称'")
    private String cs_1_2_6;
    @Column(columnDefinition = "varchar(64) COMMENT '剖宫产指征'")
    private String cs_2_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '符合医学指征'")
    private String cs_2_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '胎儿窘迫'")
    private String cs_2_1_1_a;
    @Column(columnDefinition = "varchar(64) COMMENT '头盆不称'")
    private String cs_2_1_1_b;
    @Column(columnDefinition = "varchar(64) COMMENT '瘢痕子宫'")
    private String cs_2_1_1_c;
    @Column(columnDefinition = "varchar(64) COMMENT '胎位异常'")
    private String cs_2_1_1_d;
    @Column(columnDefinition = "varchar(64) COMMENT '前置胎盘及前置血管'")
    private String cs_2_1_1_e;
    @Column(columnDefinition = "varchar(64) COMMENT '双胎或多胎妊娠'")
    private String cs_2_1_1_f;
    @Column(columnDefinition = "varchar(64) COMMENT '脐带脱垂'")
    private String cs_2_1_1_g;
    @Column(columnDefinition = "varchar(64) COMMENT '胎盘早剥'")
    private String cs_2_1_1_h;
    @Column(columnDefinition = "varchar(64) COMMENT '孕妇存在严重合并症和并发症'")
    private String cs_2_1_1_i;
    @Column(columnDefinition = "varchar(64) COMMENT '妊娠巨大儿者'")
    private String cs_2_1_1_j;
    @Column(columnDefinition = "varchar(64) COMMENT '产道畸形'")
    private String cs_2_1_1_k;
    @Column(columnDefinition = "varchar(64) COMMENT '外阴疾病'")
    private String cs_2_1_1_l;
    @Column(columnDefinition = "varchar(64) COMMENT '妊娠合并肿瘤'")
    private String cs_2_1_1_n;
    @Column(columnDefinition = "varchar(64) COMMENT '生殖道严重的感染性疾病'")
    private String cs_2_1_1_m;
    @Column(columnDefinition = "varchar(64) COMMENT '剖宫产+伴绝育手术'")
    private String cs_2_1_1_o;
    @Column(columnDefinition = "varchar(64) COMMENT '其他病理状态'")
    private String cs_2_1_1_p;
    @Column(columnDefinition = "varchar(64) COMMENT '高龄初产妇'")
    private String cs_2_1_1_q;
    @Column(columnDefinition = "varchar(64) COMMENT '符合DRGs编码的 剖宫产,伴重要合并症与伴隨病'")
    private String cs_2_1_1_r;
    @Column(columnDefinition = "varchar(64) COMMENT '孕妇要求剖宫产的评估'")
    private String cs_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术方式选择'")
    private String cs_2_3_1;
    @Column(columnDefinition = "datetime COMMENT '胎儿娩出日期时间'")
    private Date cs_2_4_2;
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
    @Column(columnDefinition = "datetime COMMENT '使用首剂抗菌药物起始时间'")
    private Date cm_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术时间是否≥3小时'")
    private String cm_1_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否术中追加抗菌药物'")
    private String cm_1_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '术中出血量是否≥1500ml'")
    private String cm_1_5_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否术中追加抗菌药物'")
    private String cm_1_5_4;
    @Column(columnDefinition = "datetime COMMENT '术后抗菌药物停止使用时间'")
    private Date cm_1_6_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用抗菌药物时间使用时间分层'")
    private String cm_1_6_2;
    @Column(columnDefinition = "varchar(64) COMMENT '术后48小时之后继续使用的原因'")
    private String cm_1_6_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施新生儿Apgar评分'")
    private String cs_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '新生儿出生后1、5、10min,Apgar评分值'")
    private String cs_4_2;
    @Column(columnDefinition = "double COMMENT '出生后1min,Apgar评分值'")
    private Double cs_4_3_1;
    @Column(columnDefinition = "double COMMENT '出生后5min,Apgar评分值'")
    private Double cs_4_3_2;
    @Column(columnDefinition = "double COMMENT '出生后10min,Apgar评分值'")
    private Double cs_4_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '术后24小时内出血量'")
    private String cs_5_1;
    @Column(columnDefinition = "double COMMENT '术后24小时内实际出血量（ml）'")
    private Double cs_5_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '剖宫产产后出血可能的原因'")
    private String cs_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术后24小时内输血量'")
    private String cs_5_3;
    @Column(columnDefinition = "double COMMENT '术后24小时内实际输血量（ml）'")
    private Double cs_5_4;
    @Column(columnDefinition = "varchar(64) COMMENT '止血干预措施的选择'")
    private String cs_5_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有剖宫产并发症'")
    private String cs_6_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '剖宫产并发症ICD.10编码'")
    private String cs_6_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '产后出血'")
    private String cs_6_1_2_1_a;
    @Column(columnDefinition = "varchar(64) COMMENT '产褥期感染'")
    private String cs_6_1_2_1_b;
    @Column(columnDefinition = "varchar(64) COMMENT '产科栓塞'")
    private String cs_6_1_2_1_c;
    @Column(columnDefinition = "varchar(64) COMMENT '栓塞病'")
    private String cs_6_1_2_1_d;
    @Column(columnDefinition = "varchar(64) COMMENT '胎盘和胎膜滞留不伴有出血'")
    private String cs_6_1_2_1_e;
    @Column(columnDefinition = "varchar(64) COMMENT '产科手术伤口的感染'")
    private String cs_6_1_2_1_f;
    @Column(columnDefinition = "varchar(64) COMMENT '产科伤口裂开'")
    private String cs_6_1_2_1_g;
    @Column(columnDefinition = "varchar(64) COMMENT '其他并发症'")
    private String cs_6_1_2_1_h;
    @Column(columnDefinition = "varchar(64) COMMENT '是否再次手术'")
    private String cs_6_2;
    @Column(columnDefinition = "varchar(64) COMMENT '再次手术原因'")
    private String cs_6_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他再次手术原因'")
    private String cs_6_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '影响程度的选择'")
    private String cs_6_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有新生儿产伤'")
    private String cs_7_1;
    @Column(columnDefinition = "varchar(64) COMMENT '产程和分娩期间并发症所列的名称及ICD.10编码'")
    private String cs_7_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'ICD-10：P10产伤引起的颅内撕裂和出血'")
    private String cs_7_2_a;
    @Column(columnDefinition = "varchar(64) COMMENT 'ICD-10：P11产伤致新生儿脑伤'")
    private String cs_7_2_b;
    @Column(columnDefinition = "varchar(64) COMMENT 'ICD-10：P12头皮产伤'")
    private String cs_7_2_c;
    @Column(columnDefinition = "varchar(64) COMMENT 'ICD-10：P13颅骨产伤'")
    private String cs_7_2_d;
    @Column(columnDefinition = "varchar(64) COMMENT 'ICD-10：P14神经产伤'")
    private String cs_7_2_e;
    @Column(columnDefinition = "varchar(64) COMMENT 'ICD-10：P15其他产伤'")
    private String cs_7_2_f;
    @Column(columnDefinition = "varchar(64) COMMENT 'ICD-10：P20子宫内低氧症'")
    private String cs_7_2_g;
    @Column(columnDefinition = "varchar(64) COMMENT 'ICD-10：P21出生窒息'")
    private String cs_7_2_h;
    @Column(columnDefinition = "varchar(64) COMMENT '新生儿是否有先天性畸形、变形和染色体异常'")
    private String cs_7_3;
    @Column(columnDefinition = "varchar(64) COMMENT '新生儿：先天性畸形、变形和染色体异常的名称及ICD.10编码'")
    private String cs_7_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有母乳喂养禁忌证'")
    private String cs_8_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '母乳喂养禁忌证选择'")
    private String cs_8_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '提供母乳喂养'")
    private String cs_8_2;
    @Column(columnDefinition = "varchar(64) COMMENT '住院期间为产妇提供术前健康教育'")
    private String cs_9_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '提供产后康复健康教育'")
    private String cs_9_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否提供术后镇痛'")
    private String cs_9_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '药物选择'")
    private String cs_9_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他镇痛药物'")
    private String cs_9_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '交与患者“出院小结”的副本告知患者出院时风险因素'")
    private String cm_7_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '母乳喂养与出院带药'")
    private String cm_7_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '告知 出院关注事项'")
    private String cm_7_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时教育'")
    private String cm_7_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '告知随访'")
    private String cm_7_2_5;
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
