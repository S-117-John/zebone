package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "quality_tn")
@Data
public class TnDO extends DataEntity{



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
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要诊断ICD-10四位亚目编码与名称'")
    private String tn_0_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要诊断ICD-10六位临床扩展编码与名称'")
    private String cm_0_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要诊断ICD-10六位临床扩展编码与名称'")
    private String tn_0_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称'")
    private String cm_0_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要手术操作ICD-9-CM-3四位亚目编码与名称'")
    private String tn_0_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称'")
    private String cm_0_1_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要手术操作ICD-9-CM-3六位临床扩展编码与名称'")
    private String tn_0_1_4_2;
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
    @Column(columnDefinition = "double COMMENT '年龄'")
    private Double age;
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
    @Column(columnDefinition = "datetime COMMENT '术中病理送检时间'")
    private Date tn_2_2_2;
    @Column(columnDefinition = "datetime COMMENT '病理检查结果报告时间'")
    private Date tn_2_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '术中快速活体组织病理学检查是否在30min内提供结论'")
    private String tn_2_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '术中冰冻病理学检查结果显示甲状腺结节为良性病变'")
    private String tn_2_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有手术后并发症'")
    private String cm_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术后并发症类别及ICD-10四位亚目的选择'")
    private String cm_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他手术后并发症类别及ICD-10四位亚目和名称填写'")
    private String cm_2_3_1_1;
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
    @Column(columnDefinition = "varchar(64) COMMENT '甲状腺手术后特指并发症的选择'")
    private String tn_3_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他甲状腺手术后特指并发症'")
    private String tn_3_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '影响程度的选择'")
    private String cm_2_4;
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
    @Column(columnDefinition = "varchar(64) COMMENT '术前健康教育'")
    private String cm_7_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术后健康教育'")
    private String cm_7_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '交与患者“出院小结”的副本告知患者出院时风险因素'")
    private String cm_7_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药'")
    private String cm_7_2_2;
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
