package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author 卡卡西
 */
//@Entity
//@Table(name = "QUALITY_LC")
@Data
public class LcDO extends DataEntity{


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
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要手术操作ICD-9-CM-3四位亚目编码与名称'")
    private String lc_0_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称'")
    private String cm_0_1_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要手术操作ICD-9-CM-3六位临床扩展编码与名称'")
    private String lc_0_1_4_2;
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
    @Column(columnDefinition = "varchar(64) COMMENT '发病日期时间是否无法确定或无记录'")
    private String cm_0_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '发病日期时间'")
    private Date cm_0_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '入院日期时间'")
    private Date cm_0_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院日期时间'")
    private Date cm_0_2_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '入住ICU日期时间'")
    private Date cm_0_2_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '离开ICU日期时间'")
    private Date cm_0_2_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '手术开始（切皮）日期时间'")
    private Date cm_0_2_6_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术结束（缝皮结束）日期时间'")
    private Date cm_0_2_6_2;
    @Column(columnDefinition = "varchar(64) COMMENT '费用支付方式'")
    private String cm_0_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '收入住院途径'")
    private String cm_0_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '到院交通工具'")
    private String cm_0_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否治疗前完成临床TNM分期'")
    private String lc_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '原发肿瘤（T）分期'")
    private String lc_1_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '区域淋巴结（N）分期'")
    private String lc_1_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '远处转移（M）分期'")
    private String lc_1_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '肺癌治疗前 TNM 临床分期结论'")
    private String lc_1_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '治疗前是否接受过2个或以上治疗科室会诊的患者'")
    private String lc_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否治疗前病理组织形态学/细胞学诊断'")
    private String lc_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '采集组织或细胞学标本途经'")
    private String lc_2_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他采集组织/细胞学标本途经'")
    private String lc_2_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否非小细胞肺癌患者组织细胞学或病理学无法再细分'")
    private String lc_2_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '治疗前肺癌患者是否进行胸部CT检查'")
    private String lc_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'TNM 临床分期结论'")
    private String lc_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他TNM 临床分期结论'")
    private String lc_4_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否行肺癌手术'")
    private String lc_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '行肺切除术情况'")
    private String lc_4_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他行肺切除术情况'")
    private String lc_4_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '纵隔淋巴结清除范围选择部位'")
    private String lc_4_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '左胸清除纵隔淋巴结范围'")
    private String lc_4_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '右胸清除纵隔淋巴结范围'")
    private String lc_4_3_3_1;
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
    @Column(columnDefinition = "varchar(64) COMMENT '术后48小时之后继续使用的原因'")
    private String cm_1_6_3_2;
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
    @Column(columnDefinition = "varchar(64) COMMENT '肺癌手术特指的手术后并发症'")
    private String lc_6_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他手术后并发症类别及ICD-10四位亚目和名称填写'")
    private String cm_2_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '影响程度的选择'")
    private String cm_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否为0-31天内非计划二次手术'")
    private String lc_6_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '非计划二次手术的原因'")
    private String lc_6_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术起始(切皮)日期时间'")
    private Date lc_6_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '手术结束(切口闭合)日期时间'")
    private Date lc_6_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '术后标本是否送病理检查'")
    private String lc_7_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有术后病理报告的记录'")
    private String lc_7_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '病理报告结论中是否有pTNM分期'")
    private String lc_7_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '肺癌手术后病理pTNM分期结论'")
    private String lc_7_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '术后区域淋巴结是否送病理检查'")
    private String lc_7_2_1;
    @Column(columnDefinition = "double COMMENT '淋巴结总数(个)'")
    private Double lc_7_2_2;
    @Column(columnDefinition = "double COMMENT '受累的淋巴结数目(个)'")
    private Double lc_7_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '肺癌非手术治疗前是否接受基因检测'")
    private String lc_8_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '接受基因检测人群的选择'")
    private String lc_8_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他接受基因检测人群'")
    private String lc_8_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '接受基因检测的标本选择'")
    private String lc_8_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '检测类别的选择'")
    private String lc_8_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '检测项目的选择'")
    private String lc_8_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '其他检测项目'")
    private String lc_8_1_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '结果阳性的选择'")
    private String lc_8_1_6;
    @Column(columnDefinition = "varchar(64) COMMENT '其他结果阳性'")
    private String lc_8_1_6_1;
    @Column(columnDefinition = "varchar(64) COMMENT '肺癌患者手术后行放疗'")
    private String lc_9_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '放疗指征的选择'")
    private String lc_9_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '非小细胞肺癌放疗指征的选择'")
    private String lc_9_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他非小细胞肺癌放疗指征'")
    private String lc_9_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '小细胞肺癌放疗指征的选择'")
    private String lc_9_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他小细胞肺癌放疗指征'")
    private String lc_9_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '采用放疗技术的选择'")
    private String lc_9_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '采用其他放疗技术'")
    private String lc_9_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '放射治疗记录内容选择'")
    private String lc_9_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他放射治疗记录内容'")
    private String lc_9_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用基因检测阳性结果指导用药的靶向治疗'")
    private String lc_10_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '接受基因检测并阳性的种类'")
    private String lc_10_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他接受基因检测并阳性的种类'")
    private String lc_10_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '药物选择'")
    private String lc_10_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他药物选择'")
    private String lc_10_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施抗肿瘤药物治疗'")
    private String lc_11_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '抗肿瘤药物治疗选择的依据'")
    private String lc_11_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他抗肿瘤药物治疗'")
    private String lc_11_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '目标病灶的评价'")
    private String lc_11_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '非目标病灶的评价'")
    private String lc_11_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '新病灶'")
    private String lc_11_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '总疗效'")
    private String lc_11_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '免疫治疗(iRECIST)--靶病灶'")
    private String lc_11_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '免疫治疗(iRECIST)--非靶病灶'")
    private String lc_11_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用了抗肿瘤药物'")
    private String lc_12_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '有无抗肿瘤药物的药物不良反应'")
    private String lc_12_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '抗肿瘤药物的药物不良反应'")
    private String lc_12_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他抗癌药的药物不良反应'")
    private String lc_12_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '不良反应定级'")
    private String lc_12_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '肺癌患者履行出院知情告知'")
    private String lc_13_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '交与患者“出院小结”的副本告知患者出院时风险因素'")
    private String cm_7_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术后化疗与放疗'")
    private String lc_13_1_2;
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
