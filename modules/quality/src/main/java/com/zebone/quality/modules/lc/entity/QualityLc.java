/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.lc.entity;

import org.hibernate.validator.constraints.Length;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * LC肺癌（手术治疗）Entity
 * @author 卡卡西
 * @version 2021-01-21
 */
@Table(name="quality_lc", alias="a", columns={
		@Column(name="cm_0_1_1_1", attrName="cm_0_1_1_1", label="质控医师"),
		@Column(name="cm_0_1_1_2", attrName="cm_0_1_1_2", label="质控护士"),
		@Column(name="cm_0_1_1_3", attrName="cm_0_1_1_3", label="主治医师"),
		@Column(name="cm_0_1_1_4", attrName="cm_0_1_1_4", label="责任护士"),
		@Column(name="cm_0_1_1_5", attrName="cm_0_1_1_5", label="上报科室"),
		@Column(name="caseid", attrName="caseid", label="患者病案号"),
		@Column(name="cm_0_1_3_1", attrName="cm_0_1_3_1", label="主要诊断ICD-10四位亚目编码与名称"),
		@Column(name="cm_0_1_3_2", attrName="cm_0_1_3_2", label="主要诊断ICD-10六位临床扩展编码与名称"),
		@Column(name="cm_0_1_4_1", attrName="cm_0_1_4_1", label="主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称"),
		@Column(name="lc_0_1_4_1", attrName="lc_0_1_4_1", label="其他主要手术操作ICD-9-CM-3四位亚目编码与名称"),
		@Column(name="cm_0_1_4_2", attrName="cm_0_1_4_2", label="主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称"),
		@Column(name="lc_0_1_4_2", attrName="lc_0_1_4_2", label="其他主要手术操作ICD-9-CM-3六位临床扩展编码与名称"),
		@Column(name="cm_0_1_5", attrName="cm_0_1_5", label="是否出院后31天内重复住院"),
		@Column(name="cm_0_2_1_1", attrName="cm_0_2_1_1", label="出生日期"),
		@Column(name="cm_0_2_1_2", attrName="cm_0_2_1_2", label="患者性别"),
		@Column(name="cm_0_2_1_3", attrName="cm_0_2_1_3", label="患者体重", comment="患者体重（kg）"),
		@Column(name="cm_0_2_1_5", attrName="cm_0_2_1_5", label="患者身高", comment="患者身高（cm）"),
		@Column(name="cm_0_2_2_1", attrName="cm_0_2_2_1", label="发病日期时间是否无法确定或无记录"),
		@Column(name="cm_0_2_2_2", attrName="cm_0_2_2_2", label="发病日期时间"),
		@Column(name="cm_0_2_4_1", attrName="cm_0_2_4_1", label="入院日期时间"),
		@Column(name="cm_0_2_4_2", attrName="cm_0_2_4_2", label="出院日期时间"),
		@Column(name="cm_0_2_5_1", attrName="cm_0_2_5_1", label="入住ICU日期时间"),
		@Column(name="cm_0_2_5_2", attrName="cm_0_2_5_2", label="离开ICU日期时间"),
		@Column(name="cm_0_2_6_1", attrName="cm_0_2_6_1", label="手术开始", comment="手术开始（切皮）日期时间"),
		@Column(name="cm_0_2_6_2", attrName="cm_0_2_6_2", label="手术结束", comment="手术结束（缝皮结束）日期时间"),
		@Column(name="cm_0_3_1", attrName="cm_0_3_1", label="费用支付方式"),
		@Column(name="cm_0_3_2", attrName="cm_0_3_2", label="收入住院途径"),
		@Column(name="cm_0_3_3", attrName="cm_0_3_3", label="到院交通工具"),
		@Column(name="lc_1_1_1", attrName="lc_1_1_1", label="是否治疗前完成临床TNM分期"),
		@Column(name="lc_1_1_2", attrName="lc_1_1_2", label="原发肿瘤", comment="原发肿瘤（T）分期"),
		@Column(name="lc_1_1_3", attrName="lc_1_1_3", label="区域淋巴结", comment="区域淋巴结（N）分期"),
		@Column(name="lc_1_1_4", attrName="lc_1_1_4", label="远处转移", comment="远处转移（M）分期"),
		@Column(name="lc_1_1_5", attrName="lc_1_1_5", label="肺癌治疗前 TNM 临床分期结论"),
		@Column(name="lc_1_2_1", attrName="lc_1_2_1", label="治疗前是否接受过2个或以上治疗科室会诊的患者"),
		@Column(name="lc_2_1_1", attrName="lc_2_1_1", label="是否治疗前病理组织形态学/细胞学诊断"),
		@Column(name="lc_2_1_2", attrName="lc_2_1_2", label="采集组织或细胞学标本途经"),
		@Column(name="lc_2_1_2_1", attrName="lc_2_1_2_1", label="其他采集组织/细胞学标本途经"),
		@Column(name="lc_2_1_3", attrName="lc_2_1_3", label="是否非小细胞肺癌患者组织细胞学或病理学无法再细分"),
		@Column(name="lc_3_1_1", attrName="lc_3_1_1", label="治疗前肺癌患者是否进行胸部CT检查"),
		@Column(name="lc_4_1_1", attrName="lc_4_1_1", label="TNM 临床分期结论"),
		@Column(name="lc_4_1_1_1", attrName="lc_4_1_1_1", label="其他TNM 临床分期结论"),
		@Column(name="lc_4_2_1", attrName="lc_4_2_1", label="是否行肺癌手术"),
		@Column(name="lc_4_2_2", attrName="lc_4_2_2", label="行肺切除术情况"),
		@Column(name="lc_4_2_2_1", attrName="lc_4_2_2_1", label="其他行肺切除术情况"),
		@Column(name="lc_4_3_1", attrName="lc_4_3_1", label="纵隔淋巴结清除范围选择部位"),
		@Column(name="lc_4_3_2_1", attrName="lc_4_3_2_1", label="左胸清除纵隔淋巴结范围"),
		@Column(name="lc_4_3_3_1", attrName="lc_4_3_3_1", label="右胸清除纵隔淋巴结范围"),
		@Column(name="cm_1_1_1", attrName="cm_1_1_1", label="是否使用预防性抗菌药物"),
		@Column(name="cm_1_2_1_2", attrName="cm_1_2_1_2", label="预防性抗菌药物选择"),
		@Column(name="cm_1_2_2_2", attrName="cm_1_2_2_2", label="选择碳青霉烯类及替加环素等特殊使用级抗菌药物"),
		@Column(name="cm_1_2_2_1", attrName="cm_1_2_2_1", label="其他特殊使用级抗菌药物名称"),
		@Column(name="cm_1_3_1_2", attrName="cm_1_3_1_2", label="选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素"),
		@Column(name="cm_1_3_1_1", attrName="cm_1_3_1_1", label="选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素填写"),
		@Column(name="cm_1_4_1", attrName="cm_1_4_1", label="使用首剂抗菌药物起始时间"),
		@Column(name="cm_1_5_1", attrName="cm_1_5_1", label="手术时间是否≥3小时"),
		@Column(name="cm_1_5_2", attrName="cm_1_5_2", label="是否术中追加抗菌药物"),
		@Column(name="cm_1_5_3", attrName="cm_1_5_3", label="术中出血量是否≥1500ml"),
		@Column(name="cm_1_5_4", attrName="cm_1_5_4", label="是否术中追加抗菌药物"),
		@Column(name="cm_1_6_1", attrName="cm_1_6_1", label="术后抗菌药物停止使用时间"),
		@Column(name="cm_1_6_2", attrName="cm_1_6_2", label="使用抗菌药物时间使用时间分层"),
		@Column(name="cm_1_6_3_2", attrName="cm_1_6_3_2", label="术后48小时之后继续使用的原因"),
		@Column(name="cm_2_1", attrName="cm_2_1", label="是否有手术后并发症"),
		@Column(name="cm_2_2", attrName="cm_2_2", label="手术后并发症类别及ICD-10四位亚目的选择"),
		@Column(name="cm_2_3_1", attrName="cm_2_3_1", label="介入操作与手术其他并发症"),
		@Column(name="cm_2_3_2", attrName="cm_2_3_2", label="手术患者手术后肺栓塞"),
		@Column(name="cm_2_3_3", attrName="cm_2_3_3", label="手术患者手术后深静脉血栓"),
		@Column(name="cm_2_3_4", attrName="cm_2_3_4", label="手术患者手术后败血症"),
		@Column(name="cm_2_3_5", attrName="cm_2_3_5", label="手术患者手术后出血或血肿"),
		@Column(name="cm_2_3_6", attrName="cm_2_3_6", label="手术患者手术伤口裂开"),
		@Column(name="cm_2_3_7", attrName="cm_2_3_7", label="手术患者猝死"),
		@Column(name="cm_2_3_8", attrName="cm_2_3_8", label="手术患者手术后呼吸道并发症"),
		@Column(name="cm_2_3_9", attrName="cm_2_3_9", label="手术患者手术后生理/代谢紊乱"),
		@Column(name="cm_2_3_10", attrName="cm_2_3_10", label="与手术/操作相关感染"),
		@Column(name="cm_2_3_11", attrName="cm_2_3_11", label="手术过程中异物遗留"),
		@Column(name="cm_2_3_12", attrName="cm_2_3_12", label="麻醉并发症"),
		@Column(name="cm_2_3_13", attrName="cm_2_3_13", label="输注、输血反应"),
		@Column(name="lc_6_1_2", attrName="lc_6_1_2", label="肺癌手术特指的手术后并发症"),
		@Column(name="cm_2_3_1_1", attrName="cm_2_3_1_1", label="其他手术后并发症类别及ICD-10四位亚目和名称填写"),
		@Column(name="cm_2_4", attrName="cm_2_4", label="影响程度的选择"),
		@Column(name="lc_6_2_1", attrName="lc_6_2_1", label="是否为0-31天内非计划二次手术"),
		@Column(name="lc_6_2_2_1", attrName="lc_6_2_2_1", label="非计划二次手术的原因"),
		@Column(name="lc_6_2_3", attrName="lc_6_2_3", label="手术起始", comment="手术起始(切皮)日期时间"),
		@Column(name="lc_6_2_4", attrName="lc_6_2_4", label="手术结束", comment="手术结束(切口闭合)日期时间"),
		@Column(name="lc_7_1_1", attrName="lc_7_1_1", label="术后标本是否送病理检查"),
		@Column(name="lc_7_1_2", attrName="lc_7_1_2", label="是否有术后病理报告的记录"),
		@Column(name="lc_7_1_3", attrName="lc_7_1_3", label="病理报告结论中是否有pTNM分期"),
		@Column(name="lc_7_1_4", attrName="lc_7_1_4", label="肺癌手术后病理pTNM分期结论"),
		@Column(name="lc_7_2_1", attrName="lc_7_2_1", label="术后区域淋巴结是否送病理检查"),
		@Column(name="lc_7_2_2", attrName="lc_7_2_2", label="淋巴结总数", comment="淋巴结总数(个)"),
		@Column(name="lc_7_2_3", attrName="lc_7_2_3", label="受累的淋巴结数目", comment="受累的淋巴结数目(个)"),
		@Column(name="lc_8_1_1", attrName="lc_8_1_1", label="肺癌非手术治疗前是否接受基因检测"),
		@Column(name="lc_8_1_2", attrName="lc_8_1_2", label="接受基因检测人群的选择"),
		@Column(name="lc_8_1_2_1", attrName="lc_8_1_2_1", label="其他接受基因检测人群"),
		@Column(name="lc_8_1_3", attrName="lc_8_1_3", label="接受基因检测的标本选择"),
		@Column(name="lc_8_1_4", attrName="lc_8_1_4", label="检测类别的选择"),
		@Column(name="lc_8_1_5", attrName="lc_8_1_5", label="检测项目的选择"),
		@Column(name="lc_8_1_5_1", attrName="lc_8_1_5_1", label="其他检测项目"),
		@Column(name="lc_8_1_6", attrName="lc_8_1_6", label="结果阳性的选择"),
		@Column(name="lc_8_1_6_1", attrName="lc_8_1_6_1", label="其他结果阳性"),
		@Column(name="lc_9_1_1", attrName="lc_9_1_1", label="肺癌患者手术后行放疗"),
		@Column(name="lc_9_1_2", attrName="lc_9_1_2", label="放疗指征的选择"),
		@Column(name="lc_9_1_3", attrName="lc_9_1_3", label="非小细胞肺癌放疗指征的选择"),
		@Column(name="lc_9_1_3_1", attrName="lc_9_1_3_1", label="其他非小细胞肺癌放疗指征"),
		@Column(name="lc_9_1_4", attrName="lc_9_1_4", label="小细胞肺癌放疗指征的选择"),
		@Column(name="lc_9_1_4_1", attrName="lc_9_1_4_1", label="其他小细胞肺癌放疗指征"),
		@Column(name="lc_9_2_1", attrName="lc_9_2_1", label="采用放疗技术的选择"),
		@Column(name="lc_9_2_1_1", attrName="lc_9_2_1_1", label="采用其他放疗技术"),
		@Column(name="lc_9_2_2", attrName="lc_9_2_2", label="放射治疗记录内容选择"),
		@Column(name="lc_9_2_2_1", attrName="lc_9_2_2_1", label="其他放射治疗记录内容"),
		@Column(name="lc_10_1_1", attrName="lc_10_1_1", label="是否使用基因检测阳性结果指导用药的靶向治疗"),
		@Column(name="lc_10_1_2", attrName="lc_10_1_2", label="接受基因检测并阳性的种类"),
		@Column(name="lc_10_1_2_1", attrName="lc_10_1_2_1", label="其他接受基因检测并阳性的种类"),
		@Column(name="lc_10_1_3", attrName="lc_10_1_3", label="药物选择"),
		@Column(name="lc_10_1_3_1", attrName="lc_10_1_3_1", label="其他药物选择"),
		@Column(name="lc_11_1_1", attrName="lc_11_1_1", label="是否实施抗肿瘤药物治疗"),
		@Column(name="lc_11_1_2", attrName="lc_11_1_2", label="抗肿瘤药物治疗选择的依据"),
		@Column(name="lc_11_1_2_1", attrName="lc_11_1_2_1", label="其他抗肿瘤药物治疗"),
		@Column(name="lc_11_2_1", attrName="lc_11_2_1", label="目标病灶的评价"),
		@Column(name="lc_11_2_2", attrName="lc_11_2_2", label="非目标病灶的评价"),
		@Column(name="lc_11_2_3", attrName="lc_11_2_3", label="新病灶"),
		@Column(name="lc_11_2_4", attrName="lc_11_2_4", label="总疗效"),
		@Column(name="lc_11_3_1", attrName="lc_11_3_1", label="免疫治疗", comment="免疫治疗(iRECIST)--靶病灶"),
		@Column(name="lc_11_3_2", attrName="lc_11_3_2", label="免疫治疗", comment="免疫治疗(iRECIST)--非靶病灶"),
		@Column(name="lc_12_1_1", attrName="lc_12_1_1", label="是否使用了抗肿瘤药物"),
		@Column(name="lc_12_1_2", attrName="lc_12_1_2", label="有无抗肿瘤药物的药物不良反应"),
		@Column(name="lc_12_1_3", attrName="lc_12_1_3", label="抗肿瘤药物的药物不良反应"),
		@Column(name="lc_12_1_3_1", attrName="lc_12_1_3_1", label="其他抗癌药的药物不良反应"),
		@Column(name="lc_12_2_1", attrName="lc_12_2_1", label="不良反应定级"),
		@Column(name="lc_13_1_1", attrName="lc_13_1_1", label="肺癌患者履行出院知情告知"),
		@Column(name="cm_7_2_1", attrName="cm_7_2_1", label="交与患者“出院小结”的副本告知患者出院时风险因素"),
		@Column(name="lc_13_1_2", attrName="lc_13_1_2", label="术后化疗与放疗"),
		@Column(name="cm_7_2_4", attrName="cm_7_2_4", label="告知发生紧急意外情况或者疾病复发如何救治及前途经"),
		@Column(name="cm_7_2_5", attrName="cm_7_2_5", label="出院时教育与随访"),
		@Column(name="cm_3_1", attrName="cm_3_1", label="手术野皮肤准备常用方法的选择"),
		@Column(name="cm_3_2", attrName="cm_3_2", label="使用含抗菌剂", comment="使用含抗菌剂（三氯生）缝线"),
		@Column(name="cm_3_2_1", attrName="cm_3_2_1", label="其他含抗菌剂缝线填写"),
		@Column(name="cm_3_3", attrName="cm_3_3", label="手术切口类别的选择"),
		@Column(name="cm_3_4", attrName="cm_3_4", label="手术切口愈合情况的选择"),
		@Column(name="cm_4_3", attrName="cm_4_3", label="离院方式选择"),
		@Column(name="cm_4_5", attrName="cm_4_5", label="非医嘱离院可能涉及因素"),
		@Column(name="cm_4_4_1", attrName="cm_4_4_1", label="其他非医嘱离院因素填写"),
		@Column(name="cm_4_6", attrName="cm_4_6", label="死亡可能涉及因素"),
		@Column(name="cm_5_1", attrName="cm_5_1", label="患者是否对服务的体验与评价"),
		@Column(name="cm_5_2_1", attrName="cm_5_2_1", label="整体医院评级"),
		@Column(name="cm_5_2_2", attrName="cm_5_2_2", label="患者推荐"),
		@Column(name="cm_5_2_3", attrName="cm_5_2_3", label="病房、床单元和卫生间清洁度"),
		@Column(name="cm_5_2_5", attrName="cm_5_2_5", label="病房与周边噪音"),
		@Column(name="cm_5_2_6", attrName="cm_5_2_6", label="医生沟通"),
		@Column(name="cm_5_2_7", attrName="cm_5_2_7", label="护士沟通"),
		@Column(name="cm_5_2_8", attrName="cm_5_2_8", label="药师沟通"),
		@Column(name="cm_5_2_9", attrName="cm_5_2_9", label="康复计划"),
		@Column(name="cm_5_2_10", attrName="cm_5_2_10", label="出院时的知情告知"),
		@Column(name="cm_5_2_11", attrName="cm_5_2_11", label="膳食评价"),
		@Column(name="cm_6_1", attrName="cm_6_1", label="住院总费用"),
		@Column(name="cm_6_2", attrName="cm_6_2", label="住院总费用其中自付金额"),
		@Column(name="cm_6_3", attrName="cm_6_3", label="一般医疗服务费"),
		@Column(name="cm_6_4", attrName="cm_6_4", label="一般治疗操作费"),
		@Column(name="cm_6_5", attrName="cm_6_5", label="护理费"),
		@Column(name="cm_6_6", attrName="cm_6_6", label="综合医疗服务类其他费用"),
		@Column(name="cm_6_7", attrName="cm_6_7", label="病理诊断费"),
		@Column(name="cm_6_8", attrName="cm_6_8", label="实验室诊断费"),
		@Column(name="cm_6_9", attrName="cm_6_9", label="影像学诊断费"),
		@Column(name="cm_6_10", attrName="cm_6_10", label="临床诊断项目费"),
		@Column(name="cm_6_11", attrName="cm_6_11", label="非手术治疗项目费"),
		@Column(name="cm_6_12", attrName="cm_6_12", label="其中", comment="其中：临床物理治疗费"),
		@Column(name="cm_6_13", attrName="cm_6_13", label="手术治疗费"),
		@Column(name="cm_6_14", attrName="cm_6_14", label="其中", comment="其中：麻醉费"),
		@Column(name="cm_6_15", attrName="cm_6_15", label="其中", comment="其中：手术费"),
		@Column(name="cm_6_16", attrName="cm_6_16", label="康复费"),
		@Column(name="cm_6_17", attrName="cm_6_17", label="中医治疗费"),
		@Column(name="cm_6_18", attrName="cm_6_18", label="西药费"),
		@Column(name="cm_6_19", attrName="cm_6_19", label="其中", comment="其中：抗菌药物费"),
		@Column(name="cm_6_20", attrName="cm_6_20", label="中成药费"),
		@Column(name="cm_6_21", attrName="cm_6_21", label="中草药费"),
		@Column(name="cm_6_22", attrName="cm_6_22", label="血费"),
		@Column(name="cm_6_23", attrName="cm_6_23", label="白蛋白类制品费"),
		@Column(name="cm_6_24", attrName="cm_6_24", label="球蛋白类制品费"),
		@Column(name="cm_6_25", attrName="cm_6_25", label="凝血因子类制品费"),
		@Column(name="cm_6_26", attrName="cm_6_26", label="细胞因子类制品费"),
		@Column(name="cm_6_27", attrName="cm_6_27", label="检查用一次性医用材料费"),
		@Column(name="cm_6_28", attrName="cm_6_28", label="治疗用一次性医用材料费"),
		@Column(name="cm_6_29", attrName="cm_6_29", label="手术用一次性医用材料费"),
		@Column(name="cm_6_30", attrName="cm_6_30", label="其他费"),
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(includeEntity=DataEntity.class),
	}, orderBy="a.update_date DESC"
)
public class QualityLc extends DataEntity<QualityLc> {
	
	private static final long serialVersionUID = 1L;
	private String cm_0_1_1_1;		// 质控医师
	private String cm_0_1_1_2;		// 质控护士
	private String cm_0_1_1_3;		// 主治医师
	private String cm_0_1_1_4;		// 责任护士
	private String cm_0_1_1_5;		// 上报科室
	private String caseid;		// 患者病案号
	private String cm_0_1_3_1;		// 主要诊断ICD-10四位亚目编码与名称
	private String cm_0_1_3_2;		// 主要诊断ICD-10六位临床扩展编码与名称
	private String cm_0_1_4_1;		// 主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称
	private String lc_0_1_4_1;		// 其他主要手术操作ICD-9-CM-3四位亚目编码与名称
	private String cm_0_1_4_2;		// 主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称
	private String lc_0_1_4_2;		// 其他主要手术操作ICD-9-CM-3六位临床扩展编码与名称
	private String cm_0_1_5;		// 是否出院后31天内重复住院
	private String cm_0_2_1_1;		// 出生日期
	private String cm_0_2_1_2;		// 患者性别
	private Double cm_0_2_1_3;		// 患者体重（kg）
	private Double cm_0_2_1_5;		// 患者身高（cm）
	private String cm_0_2_2_1;		// 发病日期时间是否无法确定或无记录
	private String cm_0_2_2_2;		// 发病日期时间
	private String cm_0_2_4_1;		// 入院日期时间
	private String cm_0_2_4_2;		// 出院日期时间
	private String cm_0_2_5_1;		// 入住ICU日期时间
	private String cm_0_2_5_2;		// 离开ICU日期时间
	private String cm_0_2_6_1;		// 手术开始（切皮）日期时间
	private String cm_0_2_6_2;		// 手术结束（缝皮结束）日期时间
	private String cm_0_3_1;		// 费用支付方式
	private String cm_0_3_2;		// 收入住院途径
	private String cm_0_3_3;		// 到院交通工具
	private String lc_1_1_1;		// 是否治疗前完成临床TNM分期
	private String lc_1_1_2;		// 原发肿瘤（T）分期
	private String lc_1_1_3;		// 区域淋巴结（N）分期
	private String lc_1_1_4;		// 远处转移（M）分期
	private String lc_1_1_5;		// 肺癌治疗前 TNM 临床分期结论
	private String lc_1_2_1;		// 治疗前是否接受过2个或以上治疗科室会诊的患者
	private String lc_2_1_1;		// 是否治疗前病理组织形态学/细胞学诊断
	private String lc_2_1_2;		// 采集组织或细胞学标本途经
	private String lc_2_1_2_1;		// 其他采集组织/细胞学标本途经
	private String lc_2_1_3;		// 是否非小细胞肺癌患者组织细胞学或病理学无法再细分
	private String lc_3_1_1;		// 治疗前肺癌患者是否进行胸部CT检查
	private String lc_4_1_1;		// TNM 临床分期结论
	private String lc_4_1_1_1;		// 其他TNM 临床分期结论
	private String lc_4_2_1;		// 是否行肺癌手术
	private String lc_4_2_2;		// 行肺切除术情况
	private String lc_4_2_2_1;		// 其他行肺切除术情况
	private String lc_4_3_1;		// 纵隔淋巴结清除范围选择部位
	private String lc_4_3_2_1;		// 左胸清除纵隔淋巴结范围
	private String lc_4_3_3_1;		// 右胸清除纵隔淋巴结范围
	private String cm_1_1_1;		// 是否使用预防性抗菌药物
	private String cm_1_2_1_2;		// 预防性抗菌药物选择
	private String cm_1_2_2_2;		// 选择碳青霉烯类及替加环素等特殊使用级抗菌药物
	private String cm_1_2_2_1;		// 其他特殊使用级抗菌药物名称
	private String cm_1_3_1_2;		// 选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素
	private String cm_1_3_1_1;		// 选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素填写
	private String cm_1_4_1;		// 使用首剂抗菌药物起始时间
	private String cm_1_5_1;		// 手术时间是否≥3小时
	private String cm_1_5_2;		// 是否术中追加抗菌药物
	private String cm_1_5_3;		// 术中出血量是否≥1500ml
	private String cm_1_5_4;		// 是否术中追加抗菌药物
	private String cm_1_6_1;		// 术后抗菌药物停止使用时间
	private String cm_1_6_2;		// 使用抗菌药物时间使用时间分层
	private String cm_1_6_3_2;		// 术后48小时之后继续使用的原因
	private String cm_2_1;		// 是否有手术后并发症
	private String cm_2_2;		// 手术后并发症类别及ICD-10四位亚目的选择
	private String cm_2_3_1;		// 介入操作与手术其他并发症
	private String cm_2_3_2;		// 手术患者手术后肺栓塞
	private String cm_2_3_3;		// 手术患者手术后深静脉血栓
	private String cm_2_3_4;		// 手术患者手术后败血症
	private String cm_2_3_5;		// 手术患者手术后出血或血肿
	private String cm_2_3_6;		// 手术患者手术伤口裂开
	private String cm_2_3_7;		// 手术患者猝死
	private String cm_2_3_8;		// 手术患者手术后呼吸道并发症
	private String cm_2_3_9;		// 手术患者手术后生理/代谢紊乱
	private String cm_2_3_10;		// 与手术/操作相关感染
	private String cm_2_3_11;		// 手术过程中异物遗留
	private String cm_2_3_12;		// 麻醉并发症
	private String cm_2_3_13;		// 输注、输血反应
	private String lc_6_1_2;		// 肺癌手术特指的手术后并发症
	private String cm_2_3_1_1;		// 其他手术后并发症类别及ICD-10四位亚目和名称填写
	private String cm_2_4;		// 影响程度的选择
	private String lc_6_2_1;		// 是否为0-31天内非计划二次手术
	private String lc_6_2_2_1;		// 非计划二次手术的原因
	private String lc_6_2_3;		// 手术起始(切皮)日期时间
	private String lc_6_2_4;		// 手术结束(切口闭合)日期时间
	private String lc_7_1_1;		// 术后标本是否送病理检查
	private String lc_7_1_2;		// 是否有术后病理报告的记录
	private String lc_7_1_3;		// 病理报告结论中是否有pTNM分期
	private String lc_7_1_4;		// 肺癌手术后病理pTNM分期结论
	private String lc_7_2_1;		// 术后区域淋巴结是否送病理检查
	private Double lc_7_2_2;		// 淋巴结总数(个)
	private Double lc_7_2_3;		// 受累的淋巴结数目(个)
	private String lc_8_1_1;		// 肺癌非手术治疗前是否接受基因检测
	private String lc_8_1_2;		// 接受基因检测人群的选择
	private String lc_8_1_2_1;		// 其他接受基因检测人群
	private String lc_8_1_3;		// 接受基因检测的标本选择
	private String lc_8_1_4;		// 检测类别的选择
	private String lc_8_1_5;		// 检测项目的选择
	private String lc_8_1_5_1;		// 其他检测项目
	private String lc_8_1_6;		// 结果阳性的选择
	private String lc_8_1_6_1;		// 其他结果阳性
	private String lc_9_1_1;		// 肺癌患者手术后行放疗
	private String lc_9_1_2;		// 放疗指征的选择
	private String lc_9_1_3;		// 非小细胞肺癌放疗指征的选择
	private String lc_9_1_3_1;		// 其他非小细胞肺癌放疗指征
	private String lc_9_1_4;		// 小细胞肺癌放疗指征的选择
	private String lc_9_1_4_1;		// 其他小细胞肺癌放疗指征
	private String lc_9_2_1;		// 采用放疗技术的选择
	private String lc_9_2_1_1;		// 采用其他放疗技术
	private String lc_9_2_2;		// 放射治疗记录内容选择
	private String lc_9_2_2_1;		// 其他放射治疗记录内容
	private String lc_10_1_1;		// 是否使用基因检测阳性结果指导用药的靶向治疗
	private String lc_10_1_2;		// 接受基因检测并阳性的种类
	private String lc_10_1_2_1;		// 其他接受基因检测并阳性的种类
	private String lc_10_1_3;		// 药物选择
	private String lc_10_1_3_1;		// 其他药物选择
	private String lc_11_1_1;		// 是否实施抗肿瘤药物治疗
	private String lc_11_1_2;		// 抗肿瘤药物治疗选择的依据
	private String lc_11_1_2_1;		// 其他抗肿瘤药物治疗
	private String lc_11_2_1;		// 目标病灶的评价
	private String lc_11_2_2;		// 非目标病灶的评价
	private String lc_11_2_3;		// 新病灶
	private String lc_11_2_4;		// 总疗效
	private String lc_11_3_1;		// 免疫治疗(iRECIST)--靶病灶
	private String lc_11_3_2;		// 免疫治疗(iRECIST)--非靶病灶
	private String lc_12_1_1;		// 是否使用了抗肿瘤药物
	private String lc_12_1_2;		// 有无抗肿瘤药物的药物不良反应
	private String lc_12_1_3;		// 抗肿瘤药物的药物不良反应
	private String lc_12_1_3_1;		// 其他抗癌药的药物不良反应
	private String lc_12_2_1;		// 不良反应定级
	private String lc_13_1_1;		// 肺癌患者履行出院知情告知
	private String cm_7_2_1;		// 交与患者“出院小结”的副本告知患者出院时风险因素
	private String lc_13_1_2;		// 术后化疗与放疗
	private String cm_7_2_4;		// 告知发生紧急意外情况或者疾病复发如何救治及前途经
	private String cm_7_2_5;		// 出院时教育与随访
	private String cm_3_1;		// 手术野皮肤准备常用方法的选择
	private String cm_3_2;		// 使用含抗菌剂（三氯生）缝线
	private String cm_3_2_1;		// 其他含抗菌剂缝线填写
	private String cm_3_3;		// 手术切口类别的选择
	private String cm_3_4;		// 手术切口愈合情况的选择
	private String cm_4_3;		// 离院方式选择
	private String cm_4_5;		// 非医嘱离院可能涉及因素
	private String cm_4_4_1;		// 其他非医嘱离院因素填写
	private String cm_4_6;		// 死亡可能涉及因素
	private String cm_5_1;		// 患者是否对服务的体验与评价
	private String cm_5_2_1;		// 整体医院评级
	private String cm_5_2_2;		// 患者推荐
	private String cm_5_2_3;		// 病房、床单元和卫生间清洁度
	private String cm_5_2_5;		// 病房与周边噪音
	private String cm_5_2_6;		// 医生沟通
	private String cm_5_2_7;		// 护士沟通
	private String cm_5_2_8;		// 药师沟通
	private String cm_5_2_9;		// 康复计划
	private String cm_5_2_10;		// 出院时的知情告知
	private String cm_5_2_11;		// 膳食评价
	private Double cm_6_1;		// 住院总费用
	private Double cm_6_2;		// 住院总费用其中自付金额
	private Double cm_6_3;		// 一般医疗服务费
	private Double cm_6_4;		// 一般治疗操作费
	private Double cm_6_5;		// 护理费
	private Double cm_6_6;		// 综合医疗服务类其他费用
	private Double cm_6_7;		// 病理诊断费
	private Double cm_6_8;		// 实验室诊断费
	private Double cm_6_9;		// 影像学诊断费
	private Double cm_6_10;		// 临床诊断项目费
	private Double cm_6_11;		// 非手术治疗项目费
	private Double cm_6_12;		// 其中：临床物理治疗费
	private Double cm_6_13;		// 手术治疗费
	private Double cm_6_14;		// 其中：麻醉费
	private Double cm_6_15;		// 其中：手术费
	private Double cm_6_16;		// 康复费
	private Double cm_6_17;		// 中医治疗费
	private Double cm_6_18;		// 西药费
	private Double cm_6_19;		// 其中：抗菌药物费
	private Double cm_6_20;		// 中成药费
	private Double cm_6_21;		// 中草药费
	private Double cm_6_22;		// 血费
	private Double cm_6_23;		// 白蛋白类制品费
	private Double cm_6_24;		// 球蛋白类制品费
	private Double cm_6_25;		// 凝血因子类制品费
	private Double cm_6_26;		// 细胞因子类制品费
	private Double cm_6_27;		// 检查用一次性医用材料费
	private Double cm_6_28;		// 治疗用一次性医用材料费
	private Double cm_6_29;		// 手术用一次性医用材料费
	private Double cm_6_30;		// 其他费
	
	public QualityLc() {
		this(null);
	}

	public QualityLc(String id){
		super(id);
	}
	
	@Length(min=0, max=64, message="质控医师长度不能超过 64 个字符")
	public String getCm_0_1_1_1() {
		return cm_0_1_1_1;
	}

	public void setCm_0_1_1_1(String cm_0_1_1_1) {
		this.cm_0_1_1_1 = cm_0_1_1_1;
	}
	
	@Length(min=0, max=64, message="质控护士长度不能超过 64 个字符")
	public String getCm_0_1_1_2() {
		return cm_0_1_1_2;
	}

	public void setCm_0_1_1_2(String cm_0_1_1_2) {
		this.cm_0_1_1_2 = cm_0_1_1_2;
	}
	
	@Length(min=0, max=64, message="主治医师长度不能超过 64 个字符")
	public String getCm_0_1_1_3() {
		return cm_0_1_1_3;
	}

	public void setCm_0_1_1_3(String cm_0_1_1_3) {
		this.cm_0_1_1_3 = cm_0_1_1_3;
	}
	
	@Length(min=0, max=64, message="责任护士长度不能超过 64 个字符")
	public String getCm_0_1_1_4() {
		return cm_0_1_1_4;
	}

	public void setCm_0_1_1_4(String cm_0_1_1_4) {
		this.cm_0_1_1_4 = cm_0_1_1_4;
	}
	
	@Length(min=0, max=64, message="上报科室长度不能超过 64 个字符")
	public String getCm_0_1_1_5() {
		return cm_0_1_1_5;
	}

	public void setCm_0_1_1_5(String cm_0_1_1_5) {
		this.cm_0_1_1_5 = cm_0_1_1_5;
	}
	
	@Length(min=0, max=64, message="患者病案号长度不能超过 64 个字符")
	public String getCaseid() {
		return caseid;
	}

	public void setCaseid(String caseid) {
		this.caseid = caseid;
	}
	
	@Length(min=0, max=64, message="主要诊断ICD-10四位亚目编码与名称长度不能超过 64 个字符")
	public String getCm_0_1_3_1() {
		return cm_0_1_3_1;
	}

	public void setCm_0_1_3_1(String cm_0_1_3_1) {
		this.cm_0_1_3_1 = cm_0_1_3_1;
	}
	
	@Length(min=0, max=64, message="主要诊断ICD-10六位临床扩展编码与名称长度不能超过 64 个字符")
	public String getCm_0_1_3_2() {
		return cm_0_1_3_2;
	}

	public void setCm_0_1_3_2(String cm_0_1_3_2) {
		this.cm_0_1_3_2 = cm_0_1_3_2;
	}
	
	@Length(min=0, max=64, message="主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称长度不能超过 64 个字符")
	public String getCm_0_1_4_1() {
		return cm_0_1_4_1;
	}

	public void setCm_0_1_4_1(String cm_0_1_4_1) {
		this.cm_0_1_4_1 = cm_0_1_4_1;
	}
	
	@Length(min=0, max=64, message="其他主要手术操作ICD-9-CM-3四位亚目编码与名称长度不能超过 64 个字符")
	public String getLc_0_1_4_1() {
		return lc_0_1_4_1;
	}

	public void setLc_0_1_4_1(String lc_0_1_4_1) {
		this.lc_0_1_4_1 = lc_0_1_4_1;
	}
	
	@Length(min=0, max=64, message="主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称长度不能超过 64 个字符")
	public String getCm_0_1_4_2() {
		return cm_0_1_4_2;
	}

	public void setCm_0_1_4_2(String cm_0_1_4_2) {
		this.cm_0_1_4_2 = cm_0_1_4_2;
	}
	
	@Length(min=0, max=64, message="其他主要手术操作ICD-9-CM-3六位临床扩展编码与名称长度不能超过 64 个字符")
	public String getLc_0_1_4_2() {
		return lc_0_1_4_2;
	}

	public void setLc_0_1_4_2(String lc_0_1_4_2) {
		this.lc_0_1_4_2 = lc_0_1_4_2;
	}
	
	@Length(min=0, max=64, message="是否出院后31天内重复住院长度不能超过 64 个字符")
	public String getCm_0_1_5() {
		return cm_0_1_5;
	}

	public void setCm_0_1_5(String cm_0_1_5) {
		this.cm_0_1_5 = cm_0_1_5;
	}
	
	@Length(min=0, max=64, message="出生日期长度不能超过 64 个字符")
	public String getCm_0_2_1_1() {
		return cm_0_2_1_1;
	}

	public void setCm_0_2_1_1(String cm_0_2_1_1) {
		this.cm_0_2_1_1 = cm_0_2_1_1;
	}
	
	@Length(min=0, max=64, message="患者性别长度不能超过 64 个字符")
	public String getCm_0_2_1_2() {
		return cm_0_2_1_2;
	}

	public void setCm_0_2_1_2(String cm_0_2_1_2) {
		this.cm_0_2_1_2 = cm_0_2_1_2;
	}
	
	public Double getCm_0_2_1_3() {
		return cm_0_2_1_3;
	}

	public void setCm_0_2_1_3(Double cm_0_2_1_3) {
		this.cm_0_2_1_3 = cm_0_2_1_3;
	}
	
	public Double getCm_0_2_1_5() {
		return cm_0_2_1_5;
	}

	public void setCm_0_2_1_5(Double cm_0_2_1_5) {
		this.cm_0_2_1_5 = cm_0_2_1_5;
	}
	
	@Length(min=0, max=64, message="发病日期时间是否无法确定或无记录长度不能超过 64 个字符")
	public String getCm_0_2_2_1() {
		return cm_0_2_2_1;
	}

	public void setCm_0_2_2_1(String cm_0_2_2_1) {
		this.cm_0_2_2_1 = cm_0_2_2_1;
	}
	
	@Length(min=0, max=64, message="发病日期时间长度不能超过 64 个字符")
	public String getCm_0_2_2_2() {
		return cm_0_2_2_2;
	}

	public void setCm_0_2_2_2(String cm_0_2_2_2) {
		this.cm_0_2_2_2 = cm_0_2_2_2;
	}
	
	@Length(min=0, max=64, message="入院日期时间长度不能超过 64 个字符")
	public String getCm_0_2_4_1() {
		return cm_0_2_4_1;
	}

	public void setCm_0_2_4_1(String cm_0_2_4_1) {
		this.cm_0_2_4_1 = cm_0_2_4_1;
	}
	
	@Length(min=0, max=64, message="出院日期时间长度不能超过 64 个字符")
	public String getCm_0_2_4_2() {
		return cm_0_2_4_2;
	}

	public void setCm_0_2_4_2(String cm_0_2_4_2) {
		this.cm_0_2_4_2 = cm_0_2_4_2;
	}
	
	@Length(min=0, max=64, message="入住ICU日期时间长度不能超过 64 个字符")
	public String getCm_0_2_5_1() {
		return cm_0_2_5_1;
	}

	public void setCm_0_2_5_1(String cm_0_2_5_1) {
		this.cm_0_2_5_1 = cm_0_2_5_1;
	}
	
	@Length(min=0, max=64, message="离开ICU日期时间长度不能超过 64 个字符")
	public String getCm_0_2_5_2() {
		return cm_0_2_5_2;
	}

	public void setCm_0_2_5_2(String cm_0_2_5_2) {
		this.cm_0_2_5_2 = cm_0_2_5_2;
	}
	
	@Length(min=0, max=64, message="手术开始长度不能超过 64 个字符")
	public String getCm_0_2_6_1() {
		return cm_0_2_6_1;
	}

	public void setCm_0_2_6_1(String cm_0_2_6_1) {
		this.cm_0_2_6_1 = cm_0_2_6_1;
	}
	
	@Length(min=0, max=64, message="手术结束长度不能超过 64 个字符")
	public String getCm_0_2_6_2() {
		return cm_0_2_6_2;
	}

	public void setCm_0_2_6_2(String cm_0_2_6_2) {
		this.cm_0_2_6_2 = cm_0_2_6_2;
	}
	
	@Length(min=0, max=64, message="费用支付方式长度不能超过 64 个字符")
	public String getCm_0_3_1() {
		return cm_0_3_1;
	}

	public void setCm_0_3_1(String cm_0_3_1) {
		this.cm_0_3_1 = cm_0_3_1;
	}
	
	@Length(min=0, max=64, message="收入住院途径长度不能超过 64 个字符")
	public String getCm_0_3_2() {
		return cm_0_3_2;
	}

	public void setCm_0_3_2(String cm_0_3_2) {
		this.cm_0_3_2 = cm_0_3_2;
	}
	
	@Length(min=0, max=64, message="到院交通工具长度不能超过 64 个字符")
	public String getCm_0_3_3() {
		return cm_0_3_3;
	}

	public void setCm_0_3_3(String cm_0_3_3) {
		this.cm_0_3_3 = cm_0_3_3;
	}
	
	@Length(min=0, max=64, message="是否治疗前完成临床TNM分期长度不能超过 64 个字符")
	public String getLc_1_1_1() {
		return lc_1_1_1;
	}

	public void setLc_1_1_1(String lc_1_1_1) {
		this.lc_1_1_1 = lc_1_1_1;
	}
	
	@Length(min=0, max=64, message="原发肿瘤长度不能超过 64 个字符")
	public String getLc_1_1_2() {
		return lc_1_1_2;
	}

	public void setLc_1_1_2(String lc_1_1_2) {
		this.lc_1_1_2 = lc_1_1_2;
	}
	
	@Length(min=0, max=64, message="区域淋巴结长度不能超过 64 个字符")
	public String getLc_1_1_3() {
		return lc_1_1_3;
	}

	public void setLc_1_1_3(String lc_1_1_3) {
		this.lc_1_1_3 = lc_1_1_3;
	}
	
	@Length(min=0, max=64, message="远处转移长度不能超过 64 个字符")
	public String getLc_1_1_4() {
		return lc_1_1_4;
	}

	public void setLc_1_1_4(String lc_1_1_4) {
		this.lc_1_1_4 = lc_1_1_4;
	}
	
	@Length(min=0, max=64, message="肺癌治疗前 TNM 临床分期结论长度不能超过 64 个字符")
	public String getLc_1_1_5() {
		return lc_1_1_5;
	}

	public void setLc_1_1_5(String lc_1_1_5) {
		this.lc_1_1_5 = lc_1_1_5;
	}
	
	@Length(min=0, max=64, message="治疗前是否接受过2个或以上治疗科室会诊的患者长度不能超过 64 个字符")
	public String getLc_1_2_1() {
		return lc_1_2_1;
	}

	public void setLc_1_2_1(String lc_1_2_1) {
		this.lc_1_2_1 = lc_1_2_1;
	}
	
	@Length(min=0, max=64, message="是否治疗前病理组织形态学/细胞学诊断长度不能超过 64 个字符")
	public String getLc_2_1_1() {
		return lc_2_1_1;
	}

	public void setLc_2_1_1(String lc_2_1_1) {
		this.lc_2_1_1 = lc_2_1_1;
	}
	
	@Length(min=0, max=64, message="采集组织或细胞学标本途经长度不能超过 64 个字符")
	public String getLc_2_1_2() {
		return lc_2_1_2;
	}

	public void setLc_2_1_2(String lc_2_1_2) {
		this.lc_2_1_2 = lc_2_1_2;
	}
	
	@Length(min=0, max=64, message="其他采集组织/细胞学标本途经长度不能超过 64 个字符")
	public String getLc_2_1_2_1() {
		return lc_2_1_2_1;
	}

	public void setLc_2_1_2_1(String lc_2_1_2_1) {
		this.lc_2_1_2_1 = lc_2_1_2_1;
	}
	
	@Length(min=0, max=64, message="是否非小细胞肺癌患者组织细胞学或病理学无法再细分长度不能超过 64 个字符")
	public String getLc_2_1_3() {
		return lc_2_1_3;
	}

	public void setLc_2_1_3(String lc_2_1_3) {
		this.lc_2_1_3 = lc_2_1_3;
	}
	
	@Length(min=0, max=64, message="治疗前肺癌患者是否进行胸部CT检查长度不能超过 64 个字符")
	public String getLc_3_1_1() {
		return lc_3_1_1;
	}

	public void setLc_3_1_1(String lc_3_1_1) {
		this.lc_3_1_1 = lc_3_1_1;
	}
	
	@Length(min=0, max=64, message="TNM 临床分期结论长度不能超过 64 个字符")
	public String getLc_4_1_1() {
		return lc_4_1_1;
	}

	public void setLc_4_1_1(String lc_4_1_1) {
		this.lc_4_1_1 = lc_4_1_1;
	}
	
	@Length(min=0, max=64, message="其他TNM 临床分期结论长度不能超过 64 个字符")
	public String getLc_4_1_1_1() {
		return lc_4_1_1_1;
	}

	public void setLc_4_1_1_1(String lc_4_1_1_1) {
		this.lc_4_1_1_1 = lc_4_1_1_1;
	}
	
	@Length(min=0, max=64, message="是否行肺癌手术长度不能超过 64 个字符")
	public String getLc_4_2_1() {
		return lc_4_2_1;
	}

	public void setLc_4_2_1(String lc_4_2_1) {
		this.lc_4_2_1 = lc_4_2_1;
	}
	
	@Length(min=0, max=64, message="行肺切除术情况长度不能超过 64 个字符")
	public String getLc_4_2_2() {
		return lc_4_2_2;
	}

	public void setLc_4_2_2(String lc_4_2_2) {
		this.lc_4_2_2 = lc_4_2_2;
	}
	
	@Length(min=0, max=64, message="其他行肺切除术情况长度不能超过 64 个字符")
	public String getLc_4_2_2_1() {
		return lc_4_2_2_1;
	}

	public void setLc_4_2_2_1(String lc_4_2_2_1) {
		this.lc_4_2_2_1 = lc_4_2_2_1;
	}
	
	@Length(min=0, max=64, message="纵隔淋巴结清除范围选择部位长度不能超过 64 个字符")
	public String getLc_4_3_1() {
		return lc_4_3_1;
	}

	public void setLc_4_3_1(String lc_4_3_1) {
		this.lc_4_3_1 = lc_4_3_1;
	}
	
	@Length(min=0, max=64, message="左胸清除纵隔淋巴结范围长度不能超过 64 个字符")
	public String getLc_4_3_2_1() {
		return lc_4_3_2_1;
	}

	public void setLc_4_3_2_1(String lc_4_3_2_1) {
		this.lc_4_3_2_1 = lc_4_3_2_1;
	}
	
	@Length(min=0, max=64, message="右胸清除纵隔淋巴结范围长度不能超过 64 个字符")
	public String getLc_4_3_3_1() {
		return lc_4_3_3_1;
	}

	public void setLc_4_3_3_1(String lc_4_3_3_1) {
		this.lc_4_3_3_1 = lc_4_3_3_1;
	}
	
	@Length(min=0, max=64, message="是否使用预防性抗菌药物长度不能超过 64 个字符")
	public String getCm_1_1_1() {
		return cm_1_1_1;
	}

	public void setCm_1_1_1(String cm_1_1_1) {
		this.cm_1_1_1 = cm_1_1_1;
	}
	
	@Length(min=0, max=64, message="预防性抗菌药物选择长度不能超过 64 个字符")
	public String getCm_1_2_1_2() {
		return cm_1_2_1_2;
	}

	public void setCm_1_2_1_2(String cm_1_2_1_2) {
		this.cm_1_2_1_2 = cm_1_2_1_2;
	}
	
	@Length(min=0, max=64, message="选择碳青霉烯类及替加环素等特殊使用级抗菌药物长度不能超过 64 个字符")
	public String getCm_1_2_2_2() {
		return cm_1_2_2_2;
	}

	public void setCm_1_2_2_2(String cm_1_2_2_2) {
		this.cm_1_2_2_2 = cm_1_2_2_2;
	}
	
	@Length(min=0, max=64, message="其他特殊使用级抗菌药物名称长度不能超过 64 个字符")
	public String getCm_1_2_2_1() {
		return cm_1_2_2_1;
	}

	public void setCm_1_2_2_1(String cm_1_2_2_1) {
		this.cm_1_2_2_1 = cm_1_2_2_1;
	}
	
	@Length(min=0, max=64, message="选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素长度不能超过 64 个字符")
	public String getCm_1_3_1_2() {
		return cm_1_3_1_2;
	}

	public void setCm_1_3_1_2(String cm_1_3_1_2) {
		this.cm_1_3_1_2 = cm_1_3_1_2;
	}
	
	@Length(min=0, max=64, message="选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素填写长度不能超过 64 个字符")
	public String getCm_1_3_1_1() {
		return cm_1_3_1_1;
	}

	public void setCm_1_3_1_1(String cm_1_3_1_1) {
		this.cm_1_3_1_1 = cm_1_3_1_1;
	}
	
	@Length(min=0, max=64, message="使用首剂抗菌药物起始时间长度不能超过 64 个字符")
	public String getCm_1_4_1() {
		return cm_1_4_1;
	}

	public void setCm_1_4_1(String cm_1_4_1) {
		this.cm_1_4_1 = cm_1_4_1;
	}
	
	@Length(min=0, max=64, message="手术时间是否≥3小时长度不能超过 64 个字符")
	public String getCm_1_5_1() {
		return cm_1_5_1;
	}

	public void setCm_1_5_1(String cm_1_5_1) {
		this.cm_1_5_1 = cm_1_5_1;
	}
	
	@Length(min=0, max=64, message="是否术中追加抗菌药物长度不能超过 64 个字符")
	public String getCm_1_5_2() {
		return cm_1_5_2;
	}

	public void setCm_1_5_2(String cm_1_5_2) {
		this.cm_1_5_2 = cm_1_5_2;
	}
	
	@Length(min=0, max=64, message="术中出血量是否≥1500ml长度不能超过 64 个字符")
	public String getCm_1_5_3() {
		return cm_1_5_3;
	}

	public void setCm_1_5_3(String cm_1_5_3) {
		this.cm_1_5_3 = cm_1_5_3;
	}
	
	@Length(min=0, max=64, message="是否术中追加抗菌药物长度不能超过 64 个字符")
	public String getCm_1_5_4() {
		return cm_1_5_4;
	}

	public void setCm_1_5_4(String cm_1_5_4) {
		this.cm_1_5_4 = cm_1_5_4;
	}
	
	@Length(min=0, max=64, message="术后抗菌药物停止使用时间长度不能超过 64 个字符")
	public String getCm_1_6_1() {
		return cm_1_6_1;
	}

	public void setCm_1_6_1(String cm_1_6_1) {
		this.cm_1_6_1 = cm_1_6_1;
	}
	
	@Length(min=0, max=64, message="使用抗菌药物时间使用时间分层长度不能超过 64 个字符")
	public String getCm_1_6_2() {
		return cm_1_6_2;
	}

	public void setCm_1_6_2(String cm_1_6_2) {
		this.cm_1_6_2 = cm_1_6_2;
	}
	
	@Length(min=0, max=64, message="术后48小时之后继续使用的原因长度不能超过 64 个字符")
	public String getCm_1_6_3_2() {
		return cm_1_6_3_2;
	}

	public void setCm_1_6_3_2(String cm_1_6_3_2) {
		this.cm_1_6_3_2 = cm_1_6_3_2;
	}
	
	@Length(min=0, max=64, message="是否有手术后并发症长度不能超过 64 个字符")
	public String getCm_2_1() {
		return cm_2_1;
	}

	public void setCm_2_1(String cm_2_1) {
		this.cm_2_1 = cm_2_1;
	}
	
	@Length(min=0, max=64, message="手术后并发症类别及ICD-10四位亚目的选择长度不能超过 64 个字符")
	public String getCm_2_2() {
		return cm_2_2;
	}

	public void setCm_2_2(String cm_2_2) {
		this.cm_2_2 = cm_2_2;
	}
	
	@Length(min=0, max=64, message="介入操作与手术其他并发症长度不能超过 64 个字符")
	public String getCm_2_3_1() {
		return cm_2_3_1;
	}

	public void setCm_2_3_1(String cm_2_3_1) {
		this.cm_2_3_1 = cm_2_3_1;
	}
	
	@Length(min=0, max=64, message="手术患者手术后肺栓塞长度不能超过 64 个字符")
	public String getCm_2_3_2() {
		return cm_2_3_2;
	}

	public void setCm_2_3_2(String cm_2_3_2) {
		this.cm_2_3_2 = cm_2_3_2;
	}
	
	@Length(min=0, max=64, message="手术患者手术后深静脉血栓长度不能超过 64 个字符")
	public String getCm_2_3_3() {
		return cm_2_3_3;
	}

	public void setCm_2_3_3(String cm_2_3_3) {
		this.cm_2_3_3 = cm_2_3_3;
	}
	
	@Length(min=0, max=64, message="手术患者手术后败血症长度不能超过 64 个字符")
	public String getCm_2_3_4() {
		return cm_2_3_4;
	}

	public void setCm_2_3_4(String cm_2_3_4) {
		this.cm_2_3_4 = cm_2_3_4;
	}
	
	@Length(min=0, max=64, message="手术患者手术后出血或血肿长度不能超过 64 个字符")
	public String getCm_2_3_5() {
		return cm_2_3_5;
	}

	public void setCm_2_3_5(String cm_2_3_5) {
		this.cm_2_3_5 = cm_2_3_5;
	}
	
	@Length(min=0, max=64, message="手术患者手术伤口裂开长度不能超过 64 个字符")
	public String getCm_2_3_6() {
		return cm_2_3_6;
	}

	public void setCm_2_3_6(String cm_2_3_6) {
		this.cm_2_3_6 = cm_2_3_6;
	}
	
	@Length(min=0, max=64, message="手术患者猝死长度不能超过 64 个字符")
	public String getCm_2_3_7() {
		return cm_2_3_7;
	}

	public void setCm_2_3_7(String cm_2_3_7) {
		this.cm_2_3_7 = cm_2_3_7;
	}
	
	@Length(min=0, max=64, message="手术患者手术后呼吸道并发症长度不能超过 64 个字符")
	public String getCm_2_3_8() {
		return cm_2_3_8;
	}

	public void setCm_2_3_8(String cm_2_3_8) {
		this.cm_2_3_8 = cm_2_3_8;
	}
	
	@Length(min=0, max=64, message="手术患者手术后生理/代谢紊乱长度不能超过 64 个字符")
	public String getCm_2_3_9() {
		return cm_2_3_9;
	}

	public void setCm_2_3_9(String cm_2_3_9) {
		this.cm_2_3_9 = cm_2_3_9;
	}
	
	@Length(min=0, max=64, message="与手术/操作相关感染长度不能超过 64 个字符")
	public String getCm_2_3_10() {
		return cm_2_3_10;
	}

	public void setCm_2_3_10(String cm_2_3_10) {
		this.cm_2_3_10 = cm_2_3_10;
	}
	
	@Length(min=0, max=64, message="手术过程中异物遗留长度不能超过 64 个字符")
	public String getCm_2_3_11() {
		return cm_2_3_11;
	}

	public void setCm_2_3_11(String cm_2_3_11) {
		this.cm_2_3_11 = cm_2_3_11;
	}
	
	@Length(min=0, max=64, message="麻醉并发症长度不能超过 64 个字符")
	public String getCm_2_3_12() {
		return cm_2_3_12;
	}

	public void setCm_2_3_12(String cm_2_3_12) {
		this.cm_2_3_12 = cm_2_3_12;
	}
	
	@Length(min=0, max=64, message="输注、输血反应长度不能超过 64 个字符")
	public String getCm_2_3_13() {
		return cm_2_3_13;
	}

	public void setCm_2_3_13(String cm_2_3_13) {
		this.cm_2_3_13 = cm_2_3_13;
	}
	
	@Length(min=0, max=64, message="肺癌手术特指的手术后并发症长度不能超过 64 个字符")
	public String getLc_6_1_2() {
		return lc_6_1_2;
	}

	public void setLc_6_1_2(String lc_6_1_2) {
		this.lc_6_1_2 = lc_6_1_2;
	}
	
	@Length(min=0, max=64, message="其他手术后并发症类别及ICD-10四位亚目和名称填写长度不能超过 64 个字符")
	public String getCm_2_3_1_1() {
		return cm_2_3_1_1;
	}

	public void setCm_2_3_1_1(String cm_2_3_1_1) {
		this.cm_2_3_1_1 = cm_2_3_1_1;
	}
	
	@Length(min=0, max=64, message="影响程度的选择长度不能超过 64 个字符")
	public String getCm_2_4() {
		return cm_2_4;
	}

	public void setCm_2_4(String cm_2_4) {
		this.cm_2_4 = cm_2_4;
	}
	
	@Length(min=0, max=64, message="是否为0-31天内非计划二次手术长度不能超过 64 个字符")
	public String getLc_6_2_1() {
		return lc_6_2_1;
	}

	public void setLc_6_2_1(String lc_6_2_1) {
		this.lc_6_2_1 = lc_6_2_1;
	}
	
	@Length(min=0, max=64, message="非计划二次手术的原因长度不能超过 64 个字符")
	public String getLc_6_2_2_1() {
		return lc_6_2_2_1;
	}

	public void setLc_6_2_2_1(String lc_6_2_2_1) {
		this.lc_6_2_2_1 = lc_6_2_2_1;
	}
	
	@Length(min=0, max=64, message="手术起始长度不能超过 64 个字符")
	public String getLc_6_2_3() {
		return lc_6_2_3;
	}

	public void setLc_6_2_3(String lc_6_2_3) {
		this.lc_6_2_3 = lc_6_2_3;
	}
	
	@Length(min=0, max=64, message="手术结束长度不能超过 64 个字符")
	public String getLc_6_2_4() {
		return lc_6_2_4;
	}

	public void setLc_6_2_4(String lc_6_2_4) {
		this.lc_6_2_4 = lc_6_2_4;
	}
	
	@Length(min=0, max=64, message="术后标本是否送病理检查长度不能超过 64 个字符")
	public String getLc_7_1_1() {
		return lc_7_1_1;
	}

	public void setLc_7_1_1(String lc_7_1_1) {
		this.lc_7_1_1 = lc_7_1_1;
	}
	
	@Length(min=0, max=64, message="是否有术后病理报告的记录长度不能超过 64 个字符")
	public String getLc_7_1_2() {
		return lc_7_1_2;
	}

	public void setLc_7_1_2(String lc_7_1_2) {
		this.lc_7_1_2 = lc_7_1_2;
	}
	
	@Length(min=0, max=64, message="病理报告结论中是否有pTNM分期长度不能超过 64 个字符")
	public String getLc_7_1_3() {
		return lc_7_1_3;
	}

	public void setLc_7_1_3(String lc_7_1_3) {
		this.lc_7_1_3 = lc_7_1_3;
	}
	
	@Length(min=0, max=64, message="肺癌手术后病理pTNM分期结论长度不能超过 64 个字符")
	public String getLc_7_1_4() {
		return lc_7_1_4;
	}

	public void setLc_7_1_4(String lc_7_1_4) {
		this.lc_7_1_4 = lc_7_1_4;
	}
	
	@Length(min=0, max=64, message="术后区域淋巴结是否送病理检查长度不能超过 64 个字符")
	public String getLc_7_2_1() {
		return lc_7_2_1;
	}

	public void setLc_7_2_1(String lc_7_2_1) {
		this.lc_7_2_1 = lc_7_2_1;
	}
	
	public Double getLc_7_2_2() {
		return lc_7_2_2;
	}

	public void setLc_7_2_2(Double lc_7_2_2) {
		this.lc_7_2_2 = lc_7_2_2;
	}
	
	public Double getLc_7_2_3() {
		return lc_7_2_3;
	}

	public void setLc_7_2_3(Double lc_7_2_3) {
		this.lc_7_2_3 = lc_7_2_3;
	}
	
	@Length(min=0, max=64, message="肺癌非手术治疗前是否接受基因检测长度不能超过 64 个字符")
	public String getLc_8_1_1() {
		return lc_8_1_1;
	}

	public void setLc_8_1_1(String lc_8_1_1) {
		this.lc_8_1_1 = lc_8_1_1;
	}
	
	@Length(min=0, max=64, message="接受基因检测人群的选择长度不能超过 64 个字符")
	public String getLc_8_1_2() {
		return lc_8_1_2;
	}

	public void setLc_8_1_2(String lc_8_1_2) {
		this.lc_8_1_2 = lc_8_1_2;
	}
	
	@Length(min=0, max=64, message="其他接受基因检测人群长度不能超过 64 个字符")
	public String getLc_8_1_2_1() {
		return lc_8_1_2_1;
	}

	public void setLc_8_1_2_1(String lc_8_1_2_1) {
		this.lc_8_1_2_1 = lc_8_1_2_1;
	}
	
	@Length(min=0, max=64, message="接受基因检测的标本选择长度不能超过 64 个字符")
	public String getLc_8_1_3() {
		return lc_8_1_3;
	}

	public void setLc_8_1_3(String lc_8_1_3) {
		this.lc_8_1_3 = lc_8_1_3;
	}
	
	@Length(min=0, max=64, message="检测类别的选择长度不能超过 64 个字符")
	public String getLc_8_1_4() {
		return lc_8_1_4;
	}

	public void setLc_8_1_4(String lc_8_1_4) {
		this.lc_8_1_4 = lc_8_1_4;
	}
	
	@Length(min=0, max=64, message="检测项目的选择长度不能超过 64 个字符")
	public String getLc_8_1_5() {
		return lc_8_1_5;
	}

	public void setLc_8_1_5(String lc_8_1_5) {
		this.lc_8_1_5 = lc_8_1_5;
	}
	
	@Length(min=0, max=64, message="其他检测项目长度不能超过 64 个字符")
	public String getLc_8_1_5_1() {
		return lc_8_1_5_1;
	}

	public void setLc_8_1_5_1(String lc_8_1_5_1) {
		this.lc_8_1_5_1 = lc_8_1_5_1;
	}
	
	@Length(min=0, max=64, message="结果阳性的选择长度不能超过 64 个字符")
	public String getLc_8_1_6() {
		return lc_8_1_6;
	}

	public void setLc_8_1_6(String lc_8_1_6) {
		this.lc_8_1_6 = lc_8_1_6;
	}
	
	@Length(min=0, max=64, message="其他结果阳性长度不能超过 64 个字符")
	public String getLc_8_1_6_1() {
		return lc_8_1_6_1;
	}

	public void setLc_8_1_6_1(String lc_8_1_6_1) {
		this.lc_8_1_6_1 = lc_8_1_6_1;
	}
	
	@Length(min=0, max=64, message="肺癌患者手术后行放疗长度不能超过 64 个字符")
	public String getLc_9_1_1() {
		return lc_9_1_1;
	}

	public void setLc_9_1_1(String lc_9_1_1) {
		this.lc_9_1_1 = lc_9_1_1;
	}
	
	@Length(min=0, max=64, message="放疗指征的选择长度不能超过 64 个字符")
	public String getLc_9_1_2() {
		return lc_9_1_2;
	}

	public void setLc_9_1_2(String lc_9_1_2) {
		this.lc_9_1_2 = lc_9_1_2;
	}
	
	@Length(min=0, max=64, message="非小细胞肺癌放疗指征的选择长度不能超过 64 个字符")
	public String getLc_9_1_3() {
		return lc_9_1_3;
	}

	public void setLc_9_1_3(String lc_9_1_3) {
		this.lc_9_1_3 = lc_9_1_3;
	}
	
	@Length(min=0, max=64, message="其他非小细胞肺癌放疗指征长度不能超过 64 个字符")
	public String getLc_9_1_3_1() {
		return lc_9_1_3_1;
	}

	public void setLc_9_1_3_1(String lc_9_1_3_1) {
		this.lc_9_1_3_1 = lc_9_1_3_1;
	}
	
	@Length(min=0, max=64, message="小细胞肺癌放疗指征的选择长度不能超过 64 个字符")
	public String getLc_9_1_4() {
		return lc_9_1_4;
	}

	public void setLc_9_1_4(String lc_9_1_4) {
		this.lc_9_1_4 = lc_9_1_4;
	}
	
	@Length(min=0, max=64, message="其他小细胞肺癌放疗指征长度不能超过 64 个字符")
	public String getLc_9_1_4_1() {
		return lc_9_1_4_1;
	}

	public void setLc_9_1_4_1(String lc_9_1_4_1) {
		this.lc_9_1_4_1 = lc_9_1_4_1;
	}
	
	@Length(min=0, max=64, message="采用放疗技术的选择长度不能超过 64 个字符")
	public String getLc_9_2_1() {
		return lc_9_2_1;
	}

	public void setLc_9_2_1(String lc_9_2_1) {
		this.lc_9_2_1 = lc_9_2_1;
	}
	
	@Length(min=0, max=64, message="采用其他放疗技术长度不能超过 64 个字符")
	public String getLc_9_2_1_1() {
		return lc_9_2_1_1;
	}

	public void setLc_9_2_1_1(String lc_9_2_1_1) {
		this.lc_9_2_1_1 = lc_9_2_1_1;
	}
	
	@Length(min=0, max=64, message="放射治疗记录内容选择长度不能超过 64 个字符")
	public String getLc_9_2_2() {
		return lc_9_2_2;
	}

	public void setLc_9_2_2(String lc_9_2_2) {
		this.lc_9_2_2 = lc_9_2_2;
	}
	
	@Length(min=0, max=64, message="其他放射治疗记录内容长度不能超过 64 个字符")
	public String getLc_9_2_2_1() {
		return lc_9_2_2_1;
	}

	public void setLc_9_2_2_1(String lc_9_2_2_1) {
		this.lc_9_2_2_1 = lc_9_2_2_1;
	}
	
	@Length(min=0, max=64, message="是否使用基因检测阳性结果指导用药的靶向治疗长度不能超过 64 个字符")
	public String getLc_10_1_1() {
		return lc_10_1_1;
	}

	public void setLc_10_1_1(String lc_10_1_1) {
		this.lc_10_1_1 = lc_10_1_1;
	}
	
	@Length(min=0, max=64, message="接受基因检测并阳性的种类长度不能超过 64 个字符")
	public String getLc_10_1_2() {
		return lc_10_1_2;
	}

	public void setLc_10_1_2(String lc_10_1_2) {
		this.lc_10_1_2 = lc_10_1_2;
	}
	
	@Length(min=0, max=64, message="其他接受基因检测并阳性的种类长度不能超过 64 个字符")
	public String getLc_10_1_2_1() {
		return lc_10_1_2_1;
	}

	public void setLc_10_1_2_1(String lc_10_1_2_1) {
		this.lc_10_1_2_1 = lc_10_1_2_1;
	}
	
	@Length(min=0, max=64, message="药物选择长度不能超过 64 个字符")
	public String getLc_10_1_3() {
		return lc_10_1_3;
	}

	public void setLc_10_1_3(String lc_10_1_3) {
		this.lc_10_1_3 = lc_10_1_3;
	}
	
	@Length(min=0, max=64, message="其他药物选择长度不能超过 64 个字符")
	public String getLc_10_1_3_1() {
		return lc_10_1_3_1;
	}

	public void setLc_10_1_3_1(String lc_10_1_3_1) {
		this.lc_10_1_3_1 = lc_10_1_3_1;
	}
	
	@Length(min=0, max=64, message="是否实施抗肿瘤药物治疗长度不能超过 64 个字符")
	public String getLc_11_1_1() {
		return lc_11_1_1;
	}

	public void setLc_11_1_1(String lc_11_1_1) {
		this.lc_11_1_1 = lc_11_1_1;
	}
	
	@Length(min=0, max=64, message="抗肿瘤药物治疗选择的依据长度不能超过 64 个字符")
	public String getLc_11_1_2() {
		return lc_11_1_2;
	}

	public void setLc_11_1_2(String lc_11_1_2) {
		this.lc_11_1_2 = lc_11_1_2;
	}
	
	@Length(min=0, max=64, message="其他抗肿瘤药物治疗长度不能超过 64 个字符")
	public String getLc_11_1_2_1() {
		return lc_11_1_2_1;
	}

	public void setLc_11_1_2_1(String lc_11_1_2_1) {
		this.lc_11_1_2_1 = lc_11_1_2_1;
	}
	
	@Length(min=0, max=64, message="目标病灶的评价长度不能超过 64 个字符")
	public String getLc_11_2_1() {
		return lc_11_2_1;
	}

	public void setLc_11_2_1(String lc_11_2_1) {
		this.lc_11_2_1 = lc_11_2_1;
	}
	
	@Length(min=0, max=64, message="非目标病灶的评价长度不能超过 64 个字符")
	public String getLc_11_2_2() {
		return lc_11_2_2;
	}

	public void setLc_11_2_2(String lc_11_2_2) {
		this.lc_11_2_2 = lc_11_2_2;
	}
	
	@Length(min=0, max=64, message="新病灶长度不能超过 64 个字符")
	public String getLc_11_2_3() {
		return lc_11_2_3;
	}

	public void setLc_11_2_3(String lc_11_2_3) {
		this.lc_11_2_3 = lc_11_2_3;
	}
	
	@Length(min=0, max=64, message="总疗效长度不能超过 64 个字符")
	public String getLc_11_2_4() {
		return lc_11_2_4;
	}

	public void setLc_11_2_4(String lc_11_2_4) {
		this.lc_11_2_4 = lc_11_2_4;
	}
	
	@Length(min=0, max=64, message="免疫治疗长度不能超过 64 个字符")
	public String getLc_11_3_1() {
		return lc_11_3_1;
	}

	public void setLc_11_3_1(String lc_11_3_1) {
		this.lc_11_3_1 = lc_11_3_1;
	}
	
	@Length(min=0, max=64, message="免疫治疗长度不能超过 64 个字符")
	public String getLc_11_3_2() {
		return lc_11_3_2;
	}

	public void setLc_11_3_2(String lc_11_3_2) {
		this.lc_11_3_2 = lc_11_3_2;
	}
	
	@Length(min=0, max=64, message="是否使用了抗肿瘤药物长度不能超过 64 个字符")
	public String getLc_12_1_1() {
		return lc_12_1_1;
	}

	public void setLc_12_1_1(String lc_12_1_1) {
		this.lc_12_1_1 = lc_12_1_1;
	}
	
	@Length(min=0, max=64, message="有无抗肿瘤药物的药物不良反应长度不能超过 64 个字符")
	public String getLc_12_1_2() {
		return lc_12_1_2;
	}

	public void setLc_12_1_2(String lc_12_1_2) {
		this.lc_12_1_2 = lc_12_1_2;
	}
	
	@Length(min=0, max=64, message="抗肿瘤药物的药物不良反应长度不能超过 64 个字符")
	public String getLc_12_1_3() {
		return lc_12_1_3;
	}

	public void setLc_12_1_3(String lc_12_1_3) {
		this.lc_12_1_3 = lc_12_1_3;
	}
	
	@Length(min=0, max=64, message="其他抗癌药的药物不良反应长度不能超过 64 个字符")
	public String getLc_12_1_3_1() {
		return lc_12_1_3_1;
	}

	public void setLc_12_1_3_1(String lc_12_1_3_1) {
		this.lc_12_1_3_1 = lc_12_1_3_1;
	}
	
	@Length(min=0, max=64, message="不良反应定级长度不能超过 64 个字符")
	public String getLc_12_2_1() {
		return lc_12_2_1;
	}

	public void setLc_12_2_1(String lc_12_2_1) {
		this.lc_12_2_1 = lc_12_2_1;
	}
	
	@Length(min=0, max=64, message="肺癌患者履行出院知情告知长度不能超过 64 个字符")
	public String getLc_13_1_1() {
		return lc_13_1_1;
	}

	public void setLc_13_1_1(String lc_13_1_1) {
		this.lc_13_1_1 = lc_13_1_1;
	}
	
	@Length(min=0, max=64, message="交与患者“出院小结”的副本告知患者出院时风险因素长度不能超过 64 个字符")
	public String getCm_7_2_1() {
		return cm_7_2_1;
	}

	public void setCm_7_2_1(String cm_7_2_1) {
		this.cm_7_2_1 = cm_7_2_1;
	}
	
	@Length(min=0, max=64, message="术后化疗与放疗长度不能超过 64 个字符")
	public String getLc_13_1_2() {
		return lc_13_1_2;
	}

	public void setLc_13_1_2(String lc_13_1_2) {
		this.lc_13_1_2 = lc_13_1_2;
	}
	
	@Length(min=0, max=64, message="告知发生紧急意外情况或者疾病复发如何救治及前途经长度不能超过 64 个字符")
	public String getCm_7_2_4() {
		return cm_7_2_4;
	}

	public void setCm_7_2_4(String cm_7_2_4) {
		this.cm_7_2_4 = cm_7_2_4;
	}
	
	@Length(min=0, max=64, message="出院时教育与随访长度不能超过 64 个字符")
	public String getCm_7_2_5() {
		return cm_7_2_5;
	}

	public void setCm_7_2_5(String cm_7_2_5) {
		this.cm_7_2_5 = cm_7_2_5;
	}
	
	@Length(min=0, max=64, message="手术野皮肤准备常用方法的选择长度不能超过 64 个字符")
	public String getCm_3_1() {
		return cm_3_1;
	}

	public void setCm_3_1(String cm_3_1) {
		this.cm_3_1 = cm_3_1;
	}
	
	@Length(min=0, max=64, message="使用含抗菌剂长度不能超过 64 个字符")
	public String getCm_3_2() {
		return cm_3_2;
	}

	public void setCm_3_2(String cm_3_2) {
		this.cm_3_2 = cm_3_2;
	}
	
	@Length(min=0, max=64, message="其他含抗菌剂缝线填写长度不能超过 64 个字符")
	public String getCm_3_2_1() {
		return cm_3_2_1;
	}

	public void setCm_3_2_1(String cm_3_2_1) {
		this.cm_3_2_1 = cm_3_2_1;
	}
	
	@Length(min=0, max=64, message="手术切口类别的选择长度不能超过 64 个字符")
	public String getCm_3_3() {
		return cm_3_3;
	}

	public void setCm_3_3(String cm_3_3) {
		this.cm_3_3 = cm_3_3;
	}
	
	@Length(min=0, max=64, message="手术切口愈合情况的选择长度不能超过 64 个字符")
	public String getCm_3_4() {
		return cm_3_4;
	}

	public void setCm_3_4(String cm_3_4) {
		this.cm_3_4 = cm_3_4;
	}
	
	@Length(min=0, max=64, message="离院方式选择长度不能超过 64 个字符")
	public String getCm_4_3() {
		return cm_4_3;
	}

	public void setCm_4_3(String cm_4_3) {
		this.cm_4_3 = cm_4_3;
	}
	
	@Length(min=0, max=64, message="非医嘱离院可能涉及因素长度不能超过 64 个字符")
	public String getCm_4_5() {
		return cm_4_5;
	}

	public void setCm_4_5(String cm_4_5) {
		this.cm_4_5 = cm_4_5;
	}
	
	@Length(min=0, max=64, message="其他非医嘱离院因素填写长度不能超过 64 个字符")
	public String getCm_4_4_1() {
		return cm_4_4_1;
	}

	public void setCm_4_4_1(String cm_4_4_1) {
		this.cm_4_4_1 = cm_4_4_1;
	}
	
	@Length(min=0, max=64, message="死亡可能涉及因素长度不能超过 64 个字符")
	public String getCm_4_6() {
		return cm_4_6;
	}

	public void setCm_4_6(String cm_4_6) {
		this.cm_4_6 = cm_4_6;
	}
	
	@Length(min=0, max=64, message="患者是否对服务的体验与评价长度不能超过 64 个字符")
	public String getCm_5_1() {
		return cm_5_1;
	}

	public void setCm_5_1(String cm_5_1) {
		this.cm_5_1 = cm_5_1;
	}
	
	@Length(min=0, max=64, message="整体医院评级长度不能超过 64 个字符")
	public String getCm_5_2_1() {
		return cm_5_2_1;
	}

	public void setCm_5_2_1(String cm_5_2_1) {
		this.cm_5_2_1 = cm_5_2_1;
	}
	
	@Length(min=0, max=64, message="患者推荐长度不能超过 64 个字符")
	public String getCm_5_2_2() {
		return cm_5_2_2;
	}

	public void setCm_5_2_2(String cm_5_2_2) {
		this.cm_5_2_2 = cm_5_2_2;
	}
	
	@Length(min=0, max=64, message="病房、床单元和卫生间清洁度长度不能超过 64 个字符")
	public String getCm_5_2_3() {
		return cm_5_2_3;
	}

	public void setCm_5_2_3(String cm_5_2_3) {
		this.cm_5_2_3 = cm_5_2_3;
	}
	
	@Length(min=0, max=64, message="病房与周边噪音长度不能超过 64 个字符")
	public String getCm_5_2_5() {
		return cm_5_2_5;
	}

	public void setCm_5_2_5(String cm_5_2_5) {
		this.cm_5_2_5 = cm_5_2_5;
	}
	
	@Length(min=0, max=64, message="医生沟通长度不能超过 64 个字符")
	public String getCm_5_2_6() {
		return cm_5_2_6;
	}

	public void setCm_5_2_6(String cm_5_2_6) {
		this.cm_5_2_6 = cm_5_2_6;
	}
	
	@Length(min=0, max=64, message="护士沟通长度不能超过 64 个字符")
	public String getCm_5_2_7() {
		return cm_5_2_7;
	}

	public void setCm_5_2_7(String cm_5_2_7) {
		this.cm_5_2_7 = cm_5_2_7;
	}
	
	@Length(min=0, max=64, message="药师沟通长度不能超过 64 个字符")
	public String getCm_5_2_8() {
		return cm_5_2_8;
	}

	public void setCm_5_2_8(String cm_5_2_8) {
		this.cm_5_2_8 = cm_5_2_8;
	}
	
	@Length(min=0, max=64, message="康复计划长度不能超过 64 个字符")
	public String getCm_5_2_9() {
		return cm_5_2_9;
	}

	public void setCm_5_2_9(String cm_5_2_9) {
		this.cm_5_2_9 = cm_5_2_9;
	}
	
	@Length(min=0, max=64, message="出院时的知情告知长度不能超过 64 个字符")
	public String getCm_5_2_10() {
		return cm_5_2_10;
	}

	public void setCm_5_2_10(String cm_5_2_10) {
		this.cm_5_2_10 = cm_5_2_10;
	}
	
	@Length(min=0, max=64, message="膳食评价长度不能超过 64 个字符")
	public String getCm_5_2_11() {
		return cm_5_2_11;
	}

	public void setCm_5_2_11(String cm_5_2_11) {
		this.cm_5_2_11 = cm_5_2_11;
	}
	
	public Double getCm_6_1() {
		return cm_6_1;
	}

	public void setCm_6_1(Double cm_6_1) {
		this.cm_6_1 = cm_6_1;
	}
	
	public Double getCm_6_2() {
		return cm_6_2;
	}

	public void setCm_6_2(Double cm_6_2) {
		this.cm_6_2 = cm_6_2;
	}
	
	public Double getCm_6_3() {
		return cm_6_3;
	}

	public void setCm_6_3(Double cm_6_3) {
		this.cm_6_3 = cm_6_3;
	}
	
	public Double getCm_6_4() {
		return cm_6_4;
	}

	public void setCm_6_4(Double cm_6_4) {
		this.cm_6_4 = cm_6_4;
	}
	
	public Double getCm_6_5() {
		return cm_6_5;
	}

	public void setCm_6_5(Double cm_6_5) {
		this.cm_6_5 = cm_6_5;
	}
	
	public Double getCm_6_6() {
		return cm_6_6;
	}

	public void setCm_6_6(Double cm_6_6) {
		this.cm_6_6 = cm_6_6;
	}
	
	public Double getCm_6_7() {
		return cm_6_7;
	}

	public void setCm_6_7(Double cm_6_7) {
		this.cm_6_7 = cm_6_7;
	}
	
	public Double getCm_6_8() {
		return cm_6_8;
	}

	public void setCm_6_8(Double cm_6_8) {
		this.cm_6_8 = cm_6_8;
	}
	
	public Double getCm_6_9() {
		return cm_6_9;
	}

	public void setCm_6_9(Double cm_6_9) {
		this.cm_6_9 = cm_6_9;
	}
	
	public Double getCm_6_10() {
		return cm_6_10;
	}

	public void setCm_6_10(Double cm_6_10) {
		this.cm_6_10 = cm_6_10;
	}
	
	public Double getCm_6_11() {
		return cm_6_11;
	}

	public void setCm_6_11(Double cm_6_11) {
		this.cm_6_11 = cm_6_11;
	}
	
	public Double getCm_6_12() {
		return cm_6_12;
	}

	public void setCm_6_12(Double cm_6_12) {
		this.cm_6_12 = cm_6_12;
	}
	
	public Double getCm_6_13() {
		return cm_6_13;
	}

	public void setCm_6_13(Double cm_6_13) {
		this.cm_6_13 = cm_6_13;
	}
	
	public Double getCm_6_14() {
		return cm_6_14;
	}

	public void setCm_6_14(Double cm_6_14) {
		this.cm_6_14 = cm_6_14;
	}
	
	public Double getCm_6_15() {
		return cm_6_15;
	}

	public void setCm_6_15(Double cm_6_15) {
		this.cm_6_15 = cm_6_15;
	}
	
	public Double getCm_6_16() {
		return cm_6_16;
	}

	public void setCm_6_16(Double cm_6_16) {
		this.cm_6_16 = cm_6_16;
	}
	
	public Double getCm_6_17() {
		return cm_6_17;
	}

	public void setCm_6_17(Double cm_6_17) {
		this.cm_6_17 = cm_6_17;
	}
	
	public Double getCm_6_18() {
		return cm_6_18;
	}

	public void setCm_6_18(Double cm_6_18) {
		this.cm_6_18 = cm_6_18;
	}
	
	public Double getCm_6_19() {
		return cm_6_19;
	}

	public void setCm_6_19(Double cm_6_19) {
		this.cm_6_19 = cm_6_19;
	}
	
	public Double getCm_6_20() {
		return cm_6_20;
	}

	public void setCm_6_20(Double cm_6_20) {
		this.cm_6_20 = cm_6_20;
	}
	
	public Double getCm_6_21() {
		return cm_6_21;
	}

	public void setCm_6_21(Double cm_6_21) {
		this.cm_6_21 = cm_6_21;
	}
	
	public Double getCm_6_22() {
		return cm_6_22;
	}

	public void setCm_6_22(Double cm_6_22) {
		this.cm_6_22 = cm_6_22;
	}
	
	public Double getCm_6_23() {
		return cm_6_23;
	}

	public void setCm_6_23(Double cm_6_23) {
		this.cm_6_23 = cm_6_23;
	}
	
	public Double getCm_6_24() {
		return cm_6_24;
	}

	public void setCm_6_24(Double cm_6_24) {
		this.cm_6_24 = cm_6_24;
	}
	
	public Double getCm_6_25() {
		return cm_6_25;
	}

	public void setCm_6_25(Double cm_6_25) {
		this.cm_6_25 = cm_6_25;
	}
	
	public Double getCm_6_26() {
		return cm_6_26;
	}

	public void setCm_6_26(Double cm_6_26) {
		this.cm_6_26 = cm_6_26;
	}
	
	public Double getCm_6_27() {
		return cm_6_27;
	}

	public void setCm_6_27(Double cm_6_27) {
		this.cm_6_27 = cm_6_27;
	}
	
	public Double getCm_6_28() {
		return cm_6_28;
	}

	public void setCm_6_28(Double cm_6_28) {
		this.cm_6_28 = cm_6_28;
	}
	
	public Double getCm_6_29() {
		return cm_6_29;
	}

	public void setCm_6_29(Double cm_6_29) {
		this.cm_6_29 = cm_6_29;
	}
	
	public Double getCm_6_30() {
		return cm_6_30;
	}

	public void setCm_6_30(Double cm_6_30) {
		this.cm_6_30 = cm_6_30;
	}
	
}