package com.zebone.quality.infrastructure.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "QUALITY_MVR")
@Data
public class MvrDO extends DataEntity{



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
    @Column(columnDefinition = "datetime COMMENT '出生日期'")
    private Date cm_0_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者性别'")
    private String cm_0_2_1_2;
    @Column(columnDefinition = "double COMMENT '患者体重（kg）'")
    private Double cm_0_2_1_3;
    @Column(columnDefinition = "double COMMENT '患者身高（cm）'")
    private Double cm_0_2_1_5;
    @Column(columnDefinition = "datetime COMMENT '入院日期时间'")
    private Date cm_0_2_4_1;
    @Column(columnDefinition = "datetime COMMENT '出院日期时间'")
    private Date cm_0_2_4_2;
    @Column(columnDefinition = "datetime COMMENT '入住ICU日期时间'")
    private Date cm_0_2_5_1;
    @Column(columnDefinition = "datetime COMMENT '离开ICU日期时间'")
    private Date cm_0_2_5_2;
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
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施手术前的超声心动图评估'")
    private String mvr_1_1_1;
    @Column(columnDefinition = "double COMMENT '左室射血分数（LVEF）测量值(%)'")
    private Double mvr_1_1_2;
    @Column(columnDefinition = "double COMMENT '左心房前后径(mm)'")
    private Double mvr_1_1_4;
    @Column(columnDefinition = "double COMMENT '反流量(ml)'")
    private Double mvr_1_1_5;
    @Column(columnDefinition = "double COMMENT '二尖瓣口面积(cm²)'")
    private Double mvr_1_1_7;
    @Column(columnDefinition = "varchar(64) COMMENT '二尖瓣口面积分层'")
    private String mvr_1_1_8;
    @Column(columnDefinition = "varchar(64) COMMENT '是否左心耳血栓'")
    private String mvr_1_1_9;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有冠心病史，或冠心病危险因素'")
    private String mvr_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施手术前的冠状动脉造影评估'")
    private String mvr_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '冠状动脉病变数量'")
    private String mvr_1_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '血管病变主要位置'")
    private String mvr_1_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用SinoSCOREⅡ风险评估表进行手术前风险评估'")
    private String mvr_1_3_1;
    @Column(columnDefinition = "double COMMENT 'MVR手术风险评估（SinoSCOREⅡ）评估值'")
    private Double mvr_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '评估结果分层的选择'")
    private String mvr_1_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用欧州心血管手术危险因素评分 EuroSCORE进行手术前评估'")
    private String mvr_1_4_1;
    @Column(columnDefinition = "double COMMENT '欧州心血管手术危险因素评分 EuroSCORE值'")
    private Double mvr_0_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '评估结果分层的选择'")
    private String mvr_1_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '二尖瓣手术适应证'")
    private String mvr_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他二尖瓣手术适应证'")
    private String mvr_2_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施急诊二尖瓣手术'")
    private String mvr_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否人工机械瓣膜急性功能障碍'")
    private String mvr_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否同时合并其他手术'")
    private String mvr_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '合并其他手术种类'")
    private String mvr_2_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '手术切口的选择'")
    private String mvr_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他手术切口'")
    private String mvr_2_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '二尖瓣病变类型'")
    private String mvr_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '二尖瓣手术种类'")
    private String mvr_3_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '瓣膜种类'")
    private String mvr_3_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用体外循环辅助的二尖瓣手术'")
    private String mvr_3_2_1;
    @Column(columnDefinition = "datetime COMMENT '体外循环起始日期时间'")
    private Date mvr_3_2_2;
    @Column(columnDefinition = "datetime COMMENT '体外循环结朿日期时间'")
    private Date mvr_3_2_3;
    @Column(columnDefinition = "double COMMENT '体外循环持续时间(分钟)'")
    private Double mvr_3_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '术中是否使用TEE超声'")
    private String mvr_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'TEE返流分级'")
    private String mvr_3_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否围术期使用血制品'")
    private String mvr_3_4_1;
    @Column(columnDefinition = "double COMMENT '全血量(ml)'")
    private Double mvr_3_4_2;
    @Column(columnDefinition = "double COMMENT '红细胞量(ml)'")
    private Double mvr_3_4_3;
    @Column(columnDefinition = "double COMMENT '血浆量(ml)'")
    private Double mvr_3_4_4;
    @Column(columnDefinition = "double COMMENT '血小板量(ml)'")
    private Double mvr_3_4_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否术后入住ICU/术后复苏室'")
    private String mvr_3_5_0;
    @Column(columnDefinition = "varchar(64) COMMENT '是否ICU/术后复苏室实施机械通气'")
    private String mvr_3_5_1;
    @Column(columnDefinition = "datetime COMMENT '起始日期时间'")
    private Date mvr_3_5_2;
    @Column(columnDefinition = "datetime COMMENT '终止日期时间'")
    private Date mvr_3_5_3;
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
    @Column(columnDefinition = "varchar(64) COMMENT '术后72小时之后继续使用的原因'")
    private String cm_1_6_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否术后活动性出血或血肿'")
    private String mvr_5_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术后活动性出血或血肿主要情况'")
    private String mvr_5_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否再手术'")
    private String mvr_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '再手术指征的选择'")
    private String mvr_5_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他心脏问题再手术'")
    private String mvr_5_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他非心脏问题再手术'")
    private String mvr_5_2_2_2;
    @Column(columnDefinition = "datetime COMMENT '再手术起始日期时间'")
    private Date mvr_5_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有手术后并发症'")
    private String cm_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术后并发症类别及ICD-10四位亚目的选择'")
    private String cm_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '介入操作与手术其他并发症'")
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
    @Column(columnDefinition = "varchar(64) COMMENT '手术患者手术后呼吸道并发症'")
    private String cm_2_3_8;
    @Column(columnDefinition = "varchar(64) COMMENT '手术患者手术后生理/代谢紊乱'")
    private String cm_2_3_9;
    @Column(columnDefinition = "varchar(64) COMMENT '与手术/操作相关感染'")
    private String cm_2_3_10;
    @Column(columnDefinition = "varchar(64) COMMENT '手术过程中异物遗留'")
    private String cm_2_3_11;
    @Column(columnDefinition = "varchar(64) COMMENT '麻醉并发症'")
    private String cm_2_3_12;
    @Column(columnDefinition = "varchar(64) COMMENT '输注、输血反应'")
    private String cm_2_3_13;
    @Column(columnDefinition = "varchar(64) COMMENT '住院患者发生压疮(L89.0至L89.9)'")
    private String cm_2_3_14;
    @Column(columnDefinition = "varchar(64) COMMENT '脑卒中/脑血管事件(I61-I64)'")
    private String cm_2_3_15;
    @Column(columnDefinition = "varchar(64) COMMENT '心脏手术后特指并发症类别及ICD-10四位亚目的选择'")
    private String cm_6_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '影响程度的选择'")
    private String cm_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时是否有继续使用华法林的带药医嘱'")
    private String mvr_7_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时是否有继续使用除华法林外其他抗凝药物的用药医嘱'")
    private String mvr_7_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他抗凝药物用药'")
    private String mvr_7_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他抗凝药物名称'")
    private String mvr_7_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行术前、术后健康教育，且有记录'")
    private String mvr_8_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'MVR手术术前,术后的健康教育'")
    private String mvr_8_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时,告知患者/家属高危因素评估结果'")
    private String mvr_8_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '常见高危因素的选择'")
    private String mvr_8_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他常见高危因素'")
    private String mvr_8_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其它特殊使用级抗菌药物填写'")
    private String mvr_4_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否履行出院教育与告知责任，且有记录'")
    private String mvr_8_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '交与患者“出院小结”的副本告知患者出院时风险因素'")
    private String cm_7_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药'")
    private String cm_7_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '告知何为发生紧急意外情况或者疾病复发'")
    private String cm_7_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '告知发生紧急意外情况或者疾病复发如何救治及前途经'")
    private String cm_7_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时教育与随访'")
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
