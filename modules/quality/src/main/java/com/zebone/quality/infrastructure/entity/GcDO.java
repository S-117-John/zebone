package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "quality_gc")
@Data
public class GcDO extends DataEntity{


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
    @Column(columnDefinition = "varchar(64) COMMENT '发病日期时间是否无法确定或无记录'")
    private String cm_0_2_2_1;
    @Column(columnDefinition = "datetime COMMENT '发病日期时间'")
    private Date cm_0_2_2_2;
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
    @Column(columnDefinition = "varchar(64) COMMENT '临床TNM分期前主要检查项目'")
    private String gc_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '治疗前是否完成临床 TNM分期'")
    private String gc_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '原发肿瘤（T）分期'")
    private String gc_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '区域淋巴结（N）分期'")
    private String gc_1_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '远处转移（M）分期'")
    private String gc_1_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '胃癌治疗前 cTNM 分期结论'")
    private String gc_1_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '治疗前是否完成胃癌CT分期'")
    private String gc_1_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'cT分期病理学定义'")
    private String gc_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '治疗前是否完成胃癌超声内镜（EUS）分期'")
    private String gc_1_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'uT分期病理学定义'")
    private String gc_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否是治疗前接受过2个或以上治疗科室会诊的患者'")
    private String gc_1_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '治疗前是否有病理组织形态学/细胞学诊断报告'")
    private String gc_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '采集组织或细胞学标本来源途径'")
    private String gc_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他细胞学标本来源途径'")
    private String gc_2_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有pTNM 临床分期结论'")
    private String gc_2_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT 'pTNM 临床分期结论'")
    private String gc_2_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '病理组织形态学/细胞学诊断报告单pTNM 临床分期结论距本次治疗前的时限'")
    private String gc_2_2_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '手术路径的选择'")
    private String gc_3_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术中探及胃癌病变涉及的范围'")
    private String gc_3_1_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '手术治疗符合原则规范'")
    private String gc_3_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '实施的胃癌根治性术式的选择'")
    private String gc_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术后消化道重建的方式的选择'")
    private String gc_3_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他术后消化道重建的方式'")
    private String gc_3_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '胃癌手术中达到安全切缘是否有证实措施'")
    private String gc_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '记入手术记录中安全切缘证实措施的选择'")
    private String gc_3_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用各种吻合器'")
    private String gc_3_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行手术淋巴结清扫'")
    private String gc_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '淋巴结清扫组别'")
    private String gc_4_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '淋巴结清除结果'")
    private String gc_4_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有病理学诊断'")
    private String gc_5_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '采集组织或细胞学标本途经的选择'")
    private String gc_5_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '合格的病理报告包括以下主要内容'")
    private String gc_5_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他合格的病理报告'")
    private String gc_5_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有胃癌病理pTNM分期'")
    private String gc_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'pTNM 分期结论'")
    private String gc_5_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有组织学分级（G）'")
    private String gc_5_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '组织学分级（G）'")
    private String gc_5_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有术前评估'")
    private String gc_6_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术前评估内容'")
    private String gc_6_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '治疗的适应证'")
    private String gc_6_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有内镜治疗禁忌证'")
    private String gc_6_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '治疗禁忌证'")
    private String gc_6_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他治疗禁忌证'")
    private String gc_6_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术式选择'")
    private String gc_6_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他术式选择'")
    private String gc_6_3_1_1;
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
    @Column(columnDefinition = "varchar(64) COMMENT '胃癌手术特指的并发症'")
    private String cm_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '影响程度的选择'")
    private String cm_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否是非计划二次手术'")
    private String gc_8_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '非计划二次手术主要原因的选择'")
    private String gc_8_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他非计划二次手术主要原因'")
    private String gc_8_2_2_1;
    @Column(columnDefinition = "datetime COMMENT '二次手术开始（切皮）日期时间'")
    private Date gc_8_2_3;
    @Column(columnDefinition = "datetime COMMENT '二次手术结束（缝皮结束）日期时间'")
    private Date gc_8_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '内镜治疗术后并发症'")
    private String gc_8_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '并发症'")
    private String gc_8_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他并发症'")
    private String gc_8_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术后并发症处理'")
    private String gc_8_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他术后并发症处理'")
    private String gc_8_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术前是否进行营养评估'")
    private String gc_9_1_1;
    @Column(columnDefinition = "double COMMENT 'NRS-2002评估分值'")
    private Double gc_9_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'PG-SGA评估分级'")
    private String gc_9_1_3;
    @Column(columnDefinition = "double COMMENT 'NUTRIC Score评估分值'")
    private Double gc_9_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '术前是否给予营养支持'")
    private String gc_9_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术前给予营养支持符合原则规范'")
    private String gc_9_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他术前给予营养支持符合原则规范'")
    private String gc_9_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否给予补充性肠外营养（SPN）'")
    private String gc_9_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '补充性肠外营养（SPN）给予条件'")
    private String gc_9_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他补充性肠外营养（SPN）给予条件'")
    private String gc_9_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行术后辅助放疗'")
    private String gc_10_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术后辅助放疗指征的选择'")
    private String gc_10_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '精确放疗技术的选择'")
    private String gc_10_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有关于放疗总剂量的记录'")
    private String gc_11_1_7;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有关于剂量分割方式的记录'")
    private String gc_11_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否明确记录肿瘤区（GTV）'")
    private String gc_11_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有临床靶区（CTV）的记录'")
    private String gc_11_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有计划靶区（PTV）的记录'")
    private String gc_11_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '常规二维放疗的放疗靶区范围是否明确记录了放疗野范围'")
    private String gc_11_1_6;
    @Column(columnDefinition = "varchar(64) COMMENT '是否为临床或病理分期为M1的胃癌病例'")
    private String gc_12_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否为胃癌初次化疗'")
    private String gc_12_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '胃癌初次化疗采用方案'")
    private String gc_12_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '顺铂＋氟尿嘧啶类'")
    private String gc_12_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '奥沙利铂＋氟尿嘧啶类'")
    private String gc_12_1_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '三药联合方案'")
    private String gc_12_1_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '单药方案'")
    private String gc_12_1_3_5;
    @Column(columnDefinition = "varchar(64) COMMENT '其他胃癌初次化疗采用方案'")
    private String gc_12_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术后是否使用靶向治疗药物'")
    private String gc_12_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '胃癌常用靶向治疗药物'")
    private String gc_12_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他靶向治疗药物'")
    private String gc_12_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '抗肿瘤药物疗效的选择'")
    private String gc_13_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其它抗肿瘤药物疗效'")
    private String gc_13_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '目标病灶的评价'")
    private String gc_13_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '非目标病灶的评价'")
    private String gc_13_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '新病灶'")
    private String gc_13_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '总疗效'")
    private String gc_13_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '免疫治疗(iRECIST)--靶病灶'")
    private String gc_13_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '免疫治疗(iRECIST)--非靶病灶'")
    private String gc_13_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用了抗癌药的药物'")
    private String gc_14_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '有无抗癌药的药物不良反应'")
    private String gc_14_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '抗癌药的药物不良反应'")
    private String gc_14_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其它抗癌药的药物不良反应'")
    private String gc_14_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '不良反应定级'")
    private String gc_14_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '胃癌患者履行出院知情告知'")
    private String gc_15_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '交与患者“出院小结”的副本告知患者出院时风险因素'")
    private String gc_15_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '告知出院时的病情风险情况'")
    private String gc_15_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '出院后合理的进餐制度和正确的进餐方式预防合并症'")
    private String gc_15_1_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '告知胃癌术后常见并发症的应对措施'")
    private String gc_15_1_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时教育与随访'")
    private String gc_15_1_2_5;
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
