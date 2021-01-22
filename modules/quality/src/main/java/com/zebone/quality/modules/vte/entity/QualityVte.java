/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.vte.entity;

import org.hibernate.validator.constraints.Length;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * VTE中高危风险患者预防静脉血栓栓塞症Entity
 * @author 卡卡西
 * @version 2021-01-22
 */
@Table(name="quality_vte", alias="a", columns={
		@Column(name="vte_0_1_2", attrName="vte_0_1_2", label="VTE风险评估"),
		@Column(name="vte_0_1_2_1", attrName="vte_0_1_2_1", label="其他临床科室的其他中高风险患者的科室名称"),
		@Column(name="cm_0_1_1_1", attrName="cm_0_1_1_1", label="质控医师"),
		@Column(name="cm_0_1_1_2", attrName="cm_0_1_1_2", label="质控护士"),
		@Column(name="cm_0_1_1_3", attrName="cm_0_1_1_3", label="主治医师"),
		@Column(name="cm_0_1_1_4", attrName="cm_0_1_1_4", label="责任护士"),
		@Column(name="cm_0_1_1_5", attrName="cm_0_1_1_5", label="上报科室"),
		@Column(name="caseid", attrName="caseid", label="患者病案号"),
		@Column(name="vte_0_1_1", attrName="vte_0_1_1", label="中高风险患者和入住ICU的患者的主要风险项选择"),
		@Column(name="vte_0_1_1_t", attrName="vte_0_1_1_t", label="严重创伤 ", comment="严重创伤 (累及身体多个部位损伤)"),
		@Column(name="vte_0_1_1_d", attrName="vte_0_1_1_d", label="脓毒症ICD-10亚目编码"),
		@Column(name="vte_0_1_1_e", attrName="vte_0_1_1_e", label="累及身体多个部位损伤ICD-10类目编码"),
		@Column(name="vte_0_1_1_i", attrName="vte_0_1_1_i", label="制动选择"),
		@Column(name="vte_0_1_1_j", attrName="vte_0_1_1_j", label="机械通气ICD-9-CM-3亚目编码"),
		@Column(name="vte_0_1_1_k", attrName="vte_0_1_1_k", label="留置中心静脉导管ICD-9-CM-3亚目编码"),
		@Column(name="vte_0_1_1_l", attrName="vte_0_1_1_l", label="血液净化治疗ICD-9-CM-3亚目编码"),
		@Column(name="vte_0_1_1_m", attrName="vte_0_1_1_m", label="使用肌肉松弛和镇静药物选择"),
		@Column(name="vte_0_1_1_n", attrName="vte_0_1_1_n", label="应用收缩血管药物选择"),
		@Column(name="vte_0_1_1_q", attrName="vte_0_1_1_q", label="医师认为需评估的其他中高风险患者--高危孕产妇记录"),
		@Column(name="vte_0_1_3", attrName="vte_0_1_3", label="出院时主要诊断ICD-10编码及名称"),
		@Column(name="vte_0_1_4", attrName="vte_0_1_4", label="出院时其他诊断ICD-10编码及名称"),
		@Column(name="vte_0_1_5", attrName="vte_0_1_5", label="出院时主要手术及操作ICD-9-CM-3编码及名称"),
		@Column(name="vte_0_1_6", attrName="vte_0_1_6", label="出院时其他手术及操作ICD-9-CM-3编码及名称"),
		@Column(name="cm_0_1_5", attrName="cm_0_1_5", label="是否出院后31天内重复住院"),
		@Column(name="cm_0_2_1_1", attrName="cm_0_2_1_1", label="出生日期"),
		@Column(name="cm_0_2_1_2", attrName="cm_0_2_1_2", label="患者性别"),
		@Column(name="cm_0_2_1_3", attrName="cm_0_2_1_3", label="患者体重", comment="患者体重（kg）"),
		@Column(name="cm_0_2_1_5", attrName="cm_0_2_1_5", label="患者身高", comment="患者身高（cm）"),
		@Column(name="cm_0_2_4_1", attrName="cm_0_2_4_1", label="入院日期时间"),
		@Column(name="cm_0_2_4_2", attrName="cm_0_2_4_2", label="出院日期时间"),
		@Column(name="cm_0_2_5_1", attrName="cm_0_2_5_1", label="入住ICU日期时间"),
		@Column(name="cm_0_2_5_2", attrName="cm_0_2_5_2", label="离开ICU日期时间"),
		@Column(name="cm_0_2_6_1", attrName="cm_0_2_6_1", label="手术开始", comment="手术开始（切皮）日期时间"),
		@Column(name="cm_0_2_6_2", attrName="cm_0_2_6_2", label="手术结束", comment="手术结束（缝皮结束）日期时间"),
		@Column(name="cm_0_3_1", attrName="cm_0_3_1", label="费用支付方式"),
		@Column(name="cm_0_3_2", attrName="cm_0_3_2", label="收入住院途径"),
		@Column(name="cm_0_3_3", attrName="cm_0_3_3", label="到院交通工具"),
		@Column(name="vte_1_1_1", attrName="vte_1_1_1", label="实施血栓风险因素评估工具选择"),
		@Column(name="vte_1_1_2", attrName="vte_1_1_2", label="Caprini评估分值"),
		@Column(name="vte_1_1_3", attrName="vte_1_1_3", label="风险分层"),
		@Column(name="vte_1_1_4", attrName="vte_1_1_4", label="Padua评分分值"),
		@Column(name="vte_1_1_5", attrName="vte_1_1_5", label="风险分层"),
		@Column(name="vte_1_2_1", attrName="vte_1_2_1", label="呼吸", comment="呼吸(次/分)"),
		@Column(name="vte_1_2_2", attrName="vte_1_2_2", label="脉搏", comment="脉搏(次/分)"),
		@Column(name="vte_1_2_3", attrName="vte_1_2_3", label="收缩压", comment="收缩压(mmHg)"),
		@Column(name="vte_1_2_4", attrName="vte_1_2_4", label="舒张压", comment="舒张压(mmHg)"),
		@Column(name="vte_2_1_1", attrName="vte_2_1_1", label="实施实施下肢静脉血管多普勒超声检查评估"),
		@Column(name="vte_2_1_2", attrName="vte_2_1_2", label="实施多普勒超声检查评估日期时间"),
		@Column(name="vte_2_1_3", attrName="vte_2_1_3", label="有无多普勒超声检查阳性发现"),
		@Column(name="vte_2_2_1", attrName="vte_2_2_1", label="实施D⁃二聚体检测评估"),
		@Column(name="vte_2_2_2", attrName="vte_2_2_2", label="D⁃二聚体检测评估日期时间"),
		@Column(name="vte_2_2_3", attrName="vte_2_2_3", label="D⁃二聚体检测值", comment="D⁃二聚体检测值(μg／L)"),
		@Column(name="vte_2_2_4", attrName="vte_2_2_4", label="D⁃二聚体检测评估结论"),
		@Column(name="vte_2_2_5", attrName="vte_2_2_5", label="是否实施氧合评估"),
		@Column(name="vte_2_2_6", attrName="vte_2_2_6", label="氧合评估"),
		@Column(name="vte_2_2_6_1", attrName="vte_2_2_6_1", label="动脉血气分析值", comment="动脉血气分析值(mmHg)"),
		@Column(name="vte_2_2_6_2", attrName="vte_2_2_6_2", label="指氧仪检查值", comment="指氧仪检查值(%)"),
		@Column(name="vte_2_2_7", attrName="vte_2_2_7", label="是否实施心脏生物学标志物检测"),
		@Column(name="vte_2_2_8", attrName="vte_2_2_8", label="心脏生物学标志物检测项目"),
		@Column(name="vte_2_2_8_1", attrName="vte_2_2_8_1", label="肌钙蛋白T", comment="肌钙蛋白T（TnT）检测值"),
		@Column(name="vte_2_2_8_2", attrName="vte_2_2_8_2", label="肌钙蛋白I", comment="肌钙蛋白I（TnI）检测值"),
		@Column(name="vte_2_2_8_3", attrName="vte_2_2_8_3", label="肌酸激酶同工酶", comment="肌酸激酶同工酶（CK-MB）检测值"),
		@Column(name="vte_2_2_8_4", attrName="vte_2_2_8_4", label="心肌肌红蛋白", comment="心肌肌红蛋白（Myo）检测值"),
		@Column(name="vte_2_2_8_5", attrName="vte_2_2_8_5", label="B型钠尿肽", comment="B型钠尿肽（BNP）检测值"),
		@Column(name="vte_2_2_8_6", attrName="vte_2_2_8_6", label="N端B型钠尿肽前体", comment="N端B型钠尿肽前体（NT-ProBNP）检测值"),
		@Column(name="vte_2_2_9", attrName="vte_2_2_9", label="是否实施凝血功能检测"),
		@Column(name="vte_2_2_10", attrName="vte_2_2_10", label="凝血功能检测项目"),
		@Column(name="vte_2_2_10_1", attrName="vte_2_2_10_1", label="血浆凝血酶原时间", comment="血浆凝血酶原时间（PT）检测值"),
		@Column(name="vte_2_2_10_2", attrName="vte_2_2_10_2", label="纤维蛋白原", comment="纤维蛋白原（FIB）检测值"),
		@Column(name="vte_2_2_10_3", attrName="vte_2_2_10_3", label="活化部分凝血活酶时间", comment="活化部分凝血活酶时间（APTT）检测值"),
		@Column(name="vte_2_2_10_4", attrName="vte_2_2_10_4", label="血浆凝血酶时间", comment="血浆凝血酶时间（TT）检测值"),
		@Column(name="vte_2_3_1", attrName="vte_2_3_1", label="是否行CT肺动脉造影", comment="是否行CT肺动脉造影（CTPA）检查评估"),
		@Column(name="vte_2_3_2", attrName="vte_2_3_2", label="实施行CT肺动脉造影", comment="实施行CT肺动脉造影（CTPA）检查日期时间"),
		@Column(name="vte_2_3_3", attrName="vte_2_3_3", label="CT肺动脉造影", comment="CT肺动脉造影（CTPA）检查阳性发现"),
		@Column(name="vte_3_1_1", attrName="vte_3_1_1", label="有无履行VTE预防相关的患者/家属知情同意"),
		@Column(name="vte_3_1_2", attrName="vte_3_1_2", label="VTE预防相关的患者/家属知情同意"),
		@Column(name="vte_3_2_1", attrName="vte_3_2_1", label="有无实施出血风险和其他可能影响预防的因素评估"),
		@Column(name="vte_3_2_2", attrName="vte_3_2_2", label="实施出血风险和其他可能影响预防的因素评估"),
		@Column(name="vte_3_2_2_1", attrName="vte_3_2_2_1", label="患者因素选择"),
		@Column(name="vte_3_2_2_2", attrName="vte_3_2_2_2", label="基础疾病"),
		@Column(name="vte_3_2_2_3", attrName="vte_3_2_2_3", label="合并用药"),
		@Column(name="vte_3_2_2_4", attrName="vte_3_2_2_4", label="侵入性操作"),
		@Column(name="vte_3_2_2_5", attrName="vte_3_2_2_5", label="其他实施出血风险和其他可能影响预防的因素评估"),
		@Column(name="vte_3_2_3", attrName="vte_3_2_3", label="物理性预防措施应用禁忌"),
		@Column(name="vte_3_3_0", attrName="vte_3_3_0", label="是否需要三级预防深静脉栓塞"),
		@Column(name="vte_3_3_1", attrName="vte_3_3_1", label="三级预防深静脉栓塞措施选择"),
		@Column(name="vte_3_3_2", attrName="vte_3_3_2", label="基本预防措施的选择"),
		@Column(name="vte_3_3_2_1", attrName="vte_3_3_2_1", label="其他基本预防措施"),
		@Column(name="vte_3_3_3", attrName="vte_3_3_3", label="医嘱执行起始日期"),
		@Column(name="vte_3_3_4", attrName="vte_3_3_4", label="机械预防措施的选择"),
		@Column(name="vte_3_3_4_1", attrName="vte_3_3_4_1", label="其他机械预防措施"),
		@Column(name="vte_3_3_5", attrName="vte_3_3_5", label="医嘱执行日期"),
		@Column(name="vte_3_3_6", attrName="vte_3_3_6", label="预防性地药物的选择"),
		@Column(name="vte_3_3_6_1", attrName="vte_3_3_6_1", label="其他预防性地药物"),
		@Column(name="vte_3_2_7", attrName="vte_3_2_7", label="医嘱执行日期"),
		@Column(name="vte_3_3_8", attrName="vte_3_3_8", label="出院后继续使用抗凝药"),
		@Column(name="vte_3_3_8_1", attrName="vte_3_3_8_1", label="其他出院后继续使用抗凝药"),
		@Column(name="vte_3_4_1", attrName="vte_3_4_1", label="预防依从性评估"),
		@Column(name="vte_3_4_2", attrName="vte_3_4_2", label="预防安全性主要监测项目"),
		@Column(name="vte_3_4_2_1", attrName="vte_3_4_2_1", label="其他预防安全性主要监测项目"),
		@Column(name="vte_3_4_3", attrName="vte_3_4_3", label="是否进行预防效果评估"),
		@Column(name="vte_3_4_4", attrName="vte_3_4_4", label="预防效果评估及相关不良事件"),
		@Column(name="vte_3_4_4_1", attrName="vte_3_4_4_1", label="与预防相关的不良事件"),
		@Column(name="vte_3_4_4_2", attrName="vte_3_4_4_2", label="与预防不相关的不良事件"),
		@Column(name="vte_3_4_4_3", attrName="vte_3_4_4_3", label="其他预防效果评估及相关不良事件"),
		@Column(name="vte_4_1_1", attrName="vte_4_1_1", label="是否为临床高度拟诊VTE的患者"),
		@Column(name="vte_4_1_2", attrName="vte_4_1_2", label="DVT临床高度可疑患者的识别检查项目"),
		@Column(name="vte_4_1_2_1", attrName="vte_4_1_2_1", label="其他DVT临床高度可疑患者的识别检查项目"),
		@Column(name="vte_4_1_3", attrName="vte_4_1_3", label="急性PTE临床高度可疑患者的识别检查项目"),
		@Column(name="vte_4_1_3_1", attrName="vte_4_1_3_1", label="其他急性PTE临床高度可疑患者的识别检查项目"),
		@Column(name="vte_4_1_4", attrName="vte_4_1_4", label="出现首个VTE的临床表现时间"),
		@Column(name="vte_4_2_1", attrName="vte_4_2_1", label="是否经MDT制定VTE 针对性紧急处理方案"),
		@Column(name="vte_4_2_2", attrName="vte_4_2_2", label="临床高度可疑为VTE后,针对性紧急处理的方法"),
		@Column(name="vte_4_2_2_1", attrName="vte_4_2_2_1", label="其他临床高度可疑为VTE后,针对性紧急处理的方法"),
		@Column(name="vte_4_5_1", attrName="vte_4_5_1", label="抗凝重叠治疗医嘱的执行起始的时间选择"),
		@Column(name="vte_4_5_1_a", attrName="vte_4_5_1_a", label="溶栓剂", comment="溶栓剂（rt-PA+尿激酶）治疗医嘱的执行起始的时间"),
		@Column(name="vte_4_5_1_b", attrName="vte_4_5_1_b", label="溶栓剂", comment="溶栓剂（rt-PA使用普通肝素（UFH）治疗医嘱的执行起始的时间+尿激酶）治疗医嘱的执行起始的时间"),
		@Column(name="vte_4_5_1_c", attrName="vte_4_5_1_c", label="低分子肝素钙", comment="低分子肝素钙（LMWH）治疗医嘱的执行起始的时间"),
		@Column(name="vte_4_5_1_d", attrName="vte_4_5_1_d", label="维生素K拮抗剂", comment="维生素K拮抗剂（VKA）治疗医嘱的执行起始的时间"),
		@Column(name="vte_4_5_1_e", attrName="vte_4_5_1_e", label="华法林", comment="华法林（Warfarin）治疗医嘱的执行起始的时间"),
		@Column(name="vte_4_5_1_f", attrName="vte_4_5_1_f", label="其他抗凝剂治疗医嘱的执行起始的时间"),
		@Column(name="vte_4_6_1", attrName="vte_4_6_1", label="放置静脉滤器", comment="放置静脉滤器（IVCF）预防PTE的执行起始的时间"),
		@Column(name="vte_4_6_2", attrName="vte_4_6_2", label="放置静脉滤器", comment="放置静脉滤器（IVCF）预防PTE的术式"),
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
public class QualityVte extends DataEntity<QualityVte> {
	
	private static final long serialVersionUID = 1L;
	private String vte_0_1_2;		// VTE风险评估
	private String vte_0_1_2_1;		// 其他临床科室的其他中高风险患者的科室名称
	private String cm_0_1_1_1;		// 质控医师
	private String cm_0_1_1_2;		// 质控护士
	private String cm_0_1_1_3;		// 主治医师
	private String cm_0_1_1_4;		// 责任护士
	private String cm_0_1_1_5;		// 上报科室
	private String caseid;		// 患者病案号
	private String vte_0_1_1;		// 中高风险患者和入住ICU的患者的主要风险项选择
	private String vte_0_1_1_t;		// 严重创伤 (累及身体多个部位损伤)
	private String vte_0_1_1_d;		// 脓毒症ICD-10亚目编码
	private String vte_0_1_1_e;		// 累及身体多个部位损伤ICD-10类目编码
	private String vte_0_1_1_i;		// 制动选择
	private String vte_0_1_1_j;		// 机械通气ICD-9-CM-3亚目编码
	private String vte_0_1_1_k;		// 留置中心静脉导管ICD-9-CM-3亚目编码
	private String vte_0_1_1_l;		// 血液净化治疗ICD-9-CM-3亚目编码
	private String vte_0_1_1_m;		// 使用肌肉松弛和镇静药物选择
	private String vte_0_1_1_n;		// 应用收缩血管药物选择
	private String vte_0_1_1_q;		// 医师认为需评估的其他中高风险患者--高危孕产妇记录
	private String vte_0_1_3;		// 出院时主要诊断ICD-10编码及名称
	private String vte_0_1_4;		// 出院时其他诊断ICD-10编码及名称
	private String vte_0_1_5;		// 出院时主要手术及操作ICD-9-CM-3编码及名称
	private String vte_0_1_6;		// 出院时其他手术及操作ICD-9-CM-3编码及名称
	private String cm_0_1_5;		// 是否出院后31天内重复住院
	private String cm_0_2_1_1;		// 出生日期
	private String cm_0_2_1_2;		// 患者性别
	private Double cm_0_2_1_3;		// 患者体重（kg）
	private Double cm_0_2_1_5;		// 患者身高（cm）
	private String cm_0_2_4_1;		// 入院日期时间
	private String cm_0_2_4_2;		// 出院日期时间
	private String cm_0_2_5_1;		// 入住ICU日期时间
	private String cm_0_2_5_2;		// 离开ICU日期时间
	private String cm_0_2_6_1;		// 手术开始（切皮）日期时间
	private String cm_0_2_6_2;		// 手术结束（缝皮结束）日期时间
	private String cm_0_3_1;		// 费用支付方式
	private String cm_0_3_2;		// 收入住院途径
	private String cm_0_3_3;		// 到院交通工具
	private String vte_1_1_1;		// 实施血栓风险因素评估工具选择
	private Double vte_1_1_2;		// Caprini评估分值
	private String vte_1_1_3;		// 风险分层
	private Double vte_1_1_4;		// Padua评分分值
	private String vte_1_1_5;		// 风险分层
	private Double vte_1_2_1;		// 呼吸(次/分)
	private Double vte_1_2_2;		// 脉搏(次/分)
	private Double vte_1_2_3;		// 收缩压(mmHg)
	private Double vte_1_2_4;		// 舒张压(mmHg)
	private String vte_2_1_1;		// 实施实施下肢静脉血管多普勒超声检查评估
	private String vte_2_1_2;		// 实施多普勒超声检查评估日期时间
	private String vte_2_1_3;		// 有无多普勒超声检查阳性发现
	private String vte_2_2_1;		// 实施D⁃二聚体检测评估
	private String vte_2_2_2;		// D⁃二聚体检测评估日期时间
	private Double vte_2_2_3;		// D⁃二聚体检测值(μg／L)
	private String vte_2_2_4;		// D⁃二聚体检测评估结论
	private String vte_2_2_5;		// 是否实施氧合评估
	private String vte_2_2_6;		// 氧合评估
	private Double vte_2_2_6_1;		// 动脉血气分析值(mmHg)
	private Double vte_2_2_6_2;		// 指氧仪检查值(%)
	private String vte_2_2_7;		// 是否实施心脏生物学标志物检测
	private String vte_2_2_8;		// 心脏生物学标志物检测项目
	private Double vte_2_2_8_1;		// 肌钙蛋白T（TnT）检测值
	private Double vte_2_2_8_2;		// 肌钙蛋白I（TnI）检测值
	private Double vte_2_2_8_3;		// 肌酸激酶同工酶（CK-MB）检测值
	private Double vte_2_2_8_4;		// 心肌肌红蛋白（Myo）检测值
	private Double vte_2_2_8_5;		// B型钠尿肽（BNP）检测值
	private Double vte_2_2_8_6;		// N端B型钠尿肽前体（NT-ProBNP）检测值
	private String vte_2_2_9;		// 是否实施凝血功能检测
	private String vte_2_2_10;		// 凝血功能检测项目
	private Double vte_2_2_10_1;		// 血浆凝血酶原时间（PT）检测值
	private Double vte_2_2_10_2;		// 纤维蛋白原（FIB）检测值
	private Double vte_2_2_10_3;		// 活化部分凝血活酶时间（APTT）检测值
	private Double vte_2_2_10_4;		// 血浆凝血酶时间（TT）检测值
	private String vte_2_3_1;		// 是否行CT肺动脉造影（CTPA）检查评估
	private String vte_2_3_2;		// 实施行CT肺动脉造影（CTPA）检查日期时间
	private String vte_2_3_3;		// CT肺动脉造影（CTPA）检查阳性发现
	private String vte_3_1_1;		// 有无履行VTE预防相关的患者/家属知情同意
	private String vte_3_1_2;		// VTE预防相关的患者/家属知情同意
	private String vte_3_2_1;		// 有无实施出血风险和其他可能影响预防的因素评估
	private String vte_3_2_2;		// 实施出血风险和其他可能影响预防的因素评估
	private String vte_3_2_2_1;		// 患者因素选择
	private String vte_3_2_2_2;		// 基础疾病
	private String vte_3_2_2_3;		// 合并用药
	private String vte_3_2_2_4;		// 侵入性操作
	private String vte_3_2_2_5;		// 其他实施出血风险和其他可能影响预防的因素评估
	private String vte_3_2_3;		// 物理性预防措施应用禁忌
	private String vte_3_3_0;		// 是否需要三级预防深静脉栓塞
	private String vte_3_3_1;		// 三级预防深静脉栓塞措施选择
	private String vte_3_3_2;		// 基本预防措施的选择
	private String vte_3_3_2_1;		// 其他基本预防措施
	private String vte_3_3_3;		// 医嘱执行起始日期
	private String vte_3_3_4;		// 机械预防措施的选择
	private String vte_3_3_4_1;		// 其他机械预防措施
	private String vte_3_3_5;		// 医嘱执行日期
	private String vte_3_3_6;		// 预防性地药物的选择
	private String vte_3_3_6_1;		// 其他预防性地药物
	private String vte_3_2_7;		// 医嘱执行日期
	private String vte_3_3_8;		// 出院后继续使用抗凝药
	private String vte_3_3_8_1;		// 其他出院后继续使用抗凝药
	private String vte_3_4_1;		// 预防依从性评估
	private String vte_3_4_2;		// 预防安全性主要监测项目
	private String vte_3_4_2_1;		// 其他预防安全性主要监测项目
	private String vte_3_4_3;		// 是否进行预防效果评估
	private String vte_3_4_4;		// 预防效果评估及相关不良事件
	private String vte_3_4_4_1;		// 与预防相关的不良事件
	private String vte_3_4_4_2;		// 与预防不相关的不良事件
	private String vte_3_4_4_3;		// 其他预防效果评估及相关不良事件
	private String vte_4_1_1;		// 是否为临床高度拟诊VTE的患者
	private String vte_4_1_2;		// DVT临床高度可疑患者的识别检查项目
	private String vte_4_1_2_1;		// 其他DVT临床高度可疑患者的识别检查项目
	private String vte_4_1_3;		// 急性PTE临床高度可疑患者的识别检查项目
	private String vte_4_1_3_1;		// 其他急性PTE临床高度可疑患者的识别检查项目
	private String vte_4_1_4;		// 出现首个VTE的临床表现时间
	private String vte_4_2_1;		// 是否经MDT制定VTE 针对性紧急处理方案
	private String vte_4_2_2;		// 临床高度可疑为VTE后,针对性紧急处理的方法
	private String vte_4_2_2_1;		// 其他临床高度可疑为VTE后,针对性紧急处理的方法
	private String vte_4_5_1;		// 抗凝重叠治疗医嘱的执行起始的时间选择
	private String vte_4_5_1_a;		// 溶栓剂（rt-PA+尿激酶）治疗医嘱的执行起始的时间
	private String vte_4_5_1_b;		// 溶栓剂（rt-PA使用普通肝素（UFH）治疗医嘱的执行起始的时间+尿激酶）治疗医嘱的执行起始的时间
	private String vte_4_5_1_c;		// 低分子肝素钙（LMWH）治疗医嘱的执行起始的时间
	private String vte_4_5_1_d;		// 维生素K拮抗剂（VKA）治疗医嘱的执行起始的时间
	private String vte_4_5_1_e;		// 华法林（Warfarin）治疗医嘱的执行起始的时间
	private String vte_4_5_1_f;		// 其他抗凝剂治疗医嘱的执行起始的时间
	private String vte_4_6_1;		// 放置静脉滤器（IVCF）预防PTE的执行起始的时间
	private String vte_4_6_2;		// 放置静脉滤器（IVCF）预防PTE的术式
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
	
	public QualityVte() {
		this(null);
	}

	public QualityVte(String id){
		super(id);
	}
	
	@Length(min=0, max=64, message="VTE风险评估长度不能超过 64 个字符")
	public String getVte_0_1_2() {
		return vte_0_1_2;
	}

	public void setVte_0_1_2(String vte_0_1_2) {
		this.vte_0_1_2 = vte_0_1_2;
	}
	
	@Length(min=0, max=64, message="其他临床科室的其他中高风险患者的科室名称长度不能超过 64 个字符")
	public String getVte_0_1_2_1() {
		return vte_0_1_2_1;
	}

	public void setVte_0_1_2_1(String vte_0_1_2_1) {
		this.vte_0_1_2_1 = vte_0_1_2_1;
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
	
	@Length(min=0, max=64, message="中高风险患者和入住ICU的患者的主要风险项选择长度不能超过 64 个字符")
	public String getVte_0_1_1() {
		return vte_0_1_1;
	}

	public void setVte_0_1_1(String vte_0_1_1) {
		this.vte_0_1_1 = vte_0_1_1;
	}
	
	@Length(min=0, max=64, message="严重创伤 长度不能超过 64 个字符")
	public String getVte_0_1_1_t() {
		return vte_0_1_1_t;
	}

	public void setVte_0_1_1_t(String vte_0_1_1_t) {
		this.vte_0_1_1_t = vte_0_1_1_t;
	}
	
	@Length(min=0, max=64, message="脓毒症ICD-10亚目编码长度不能超过 64 个字符")
	public String getVte_0_1_1_d() {
		return vte_0_1_1_d;
	}

	public void setVte_0_1_1_d(String vte_0_1_1_d) {
		this.vte_0_1_1_d = vte_0_1_1_d;
	}
	
	@Length(min=0, max=64, message="累及身体多个部位损伤ICD-10类目编码长度不能超过 64 个字符")
	public String getVte_0_1_1_e() {
		return vte_0_1_1_e;
	}

	public void setVte_0_1_1_e(String vte_0_1_1_e) {
		this.vte_0_1_1_e = vte_0_1_1_e;
	}
	
	@Length(min=0, max=64, message="制动选择长度不能超过 64 个字符")
	public String getVte_0_1_1_i() {
		return vte_0_1_1_i;
	}

	public void setVte_0_1_1_i(String vte_0_1_1_i) {
		this.vte_0_1_1_i = vte_0_1_1_i;
	}
	
	@Length(min=0, max=64, message="机械通气ICD-9-CM-3亚目编码长度不能超过 64 个字符")
	public String getVte_0_1_1_j() {
		return vte_0_1_1_j;
	}

	public void setVte_0_1_1_j(String vte_0_1_1_j) {
		this.vte_0_1_1_j = vte_0_1_1_j;
	}
	
	@Length(min=0, max=64, message="留置中心静脉导管ICD-9-CM-3亚目编码长度不能超过 64 个字符")
	public String getVte_0_1_1_k() {
		return vte_0_1_1_k;
	}

	public void setVte_0_1_1_k(String vte_0_1_1_k) {
		this.vte_0_1_1_k = vte_0_1_1_k;
	}
	
	@Length(min=0, max=64, message="血液净化治疗ICD-9-CM-3亚目编码长度不能超过 64 个字符")
	public String getVte_0_1_1_l() {
		return vte_0_1_1_l;
	}

	public void setVte_0_1_1_l(String vte_0_1_1_l) {
		this.vte_0_1_1_l = vte_0_1_1_l;
	}
	
	@Length(min=0, max=64, message="使用肌肉松弛和镇静药物选择长度不能超过 64 个字符")
	public String getVte_0_1_1_m() {
		return vte_0_1_1_m;
	}

	public void setVte_0_1_1_m(String vte_0_1_1_m) {
		this.vte_0_1_1_m = vte_0_1_1_m;
	}
	
	@Length(min=0, max=64, message="应用收缩血管药物选择长度不能超过 64 个字符")
	public String getVte_0_1_1_n() {
		return vte_0_1_1_n;
	}

	public void setVte_0_1_1_n(String vte_0_1_1_n) {
		this.vte_0_1_1_n = vte_0_1_1_n;
	}
	
	@Length(min=0, max=64, message="医师认为需评估的其他中高风险患者--高危孕产妇记录长度不能超过 64 个字符")
	public String getVte_0_1_1_q() {
		return vte_0_1_1_q;
	}

	public void setVte_0_1_1_q(String vte_0_1_1_q) {
		this.vte_0_1_1_q = vte_0_1_1_q;
	}
	
	@Length(min=0, max=64, message="出院时主要诊断ICD-10编码及名称长度不能超过 64 个字符")
	public String getVte_0_1_3() {
		return vte_0_1_3;
	}

	public void setVte_0_1_3(String vte_0_1_3) {
		this.vte_0_1_3 = vte_0_1_3;
	}
	
	@Length(min=0, max=64, message="出院时其他诊断ICD-10编码及名称长度不能超过 64 个字符")
	public String getVte_0_1_4() {
		return vte_0_1_4;
	}

	public void setVte_0_1_4(String vte_0_1_4) {
		this.vte_0_1_4 = vte_0_1_4;
	}
	
	@Length(min=0, max=64, message="出院时主要手术及操作ICD-9-CM-3编码及名称长度不能超过 64 个字符")
	public String getVte_0_1_5() {
		return vte_0_1_5;
	}

	public void setVte_0_1_5(String vte_0_1_5) {
		this.vte_0_1_5 = vte_0_1_5;
	}
	
	@Length(min=0, max=64, message="出院时其他手术及操作ICD-9-CM-3编码及名称长度不能超过 64 个字符")
	public String getVte_0_1_6() {
		return vte_0_1_6;
	}

	public void setVte_0_1_6(String vte_0_1_6) {
		this.vte_0_1_6 = vte_0_1_6;
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
	
	@Length(min=0, max=64, message="实施血栓风险因素评估工具选择长度不能超过 64 个字符")
	public String getVte_1_1_1() {
		return vte_1_1_1;
	}

	public void setVte_1_1_1(String vte_1_1_1) {
		this.vte_1_1_1 = vte_1_1_1;
	}
	
	public Double getVte_1_1_2() {
		return vte_1_1_2;
	}

	public void setVte_1_1_2(Double vte_1_1_2) {
		this.vte_1_1_2 = vte_1_1_2;
	}
	
	@Length(min=0, max=64, message="风险分层长度不能超过 64 个字符")
	public String getVte_1_1_3() {
		return vte_1_1_3;
	}

	public void setVte_1_1_3(String vte_1_1_3) {
		this.vte_1_1_3 = vte_1_1_3;
	}
	
	public Double getVte_1_1_4() {
		return vte_1_1_4;
	}

	public void setVte_1_1_4(Double vte_1_1_4) {
		this.vte_1_1_4 = vte_1_1_4;
	}
	
	@Length(min=0, max=64, message="风险分层长度不能超过 64 个字符")
	public String getVte_1_1_5() {
		return vte_1_1_5;
	}

	public void setVte_1_1_5(String vte_1_1_5) {
		this.vte_1_1_5 = vte_1_1_5;
	}
	
	public Double getVte_1_2_1() {
		return vte_1_2_1;
	}

	public void setVte_1_2_1(Double vte_1_2_1) {
		this.vte_1_2_1 = vte_1_2_1;
	}
	
	public Double getVte_1_2_2() {
		return vte_1_2_2;
	}

	public void setVte_1_2_2(Double vte_1_2_2) {
		this.vte_1_2_2 = vte_1_2_2;
	}
	
	public Double getVte_1_2_3() {
		return vte_1_2_3;
	}

	public void setVte_1_2_3(Double vte_1_2_3) {
		this.vte_1_2_3 = vte_1_2_3;
	}
	
	public Double getVte_1_2_4() {
		return vte_1_2_4;
	}

	public void setVte_1_2_4(Double vte_1_2_4) {
		this.vte_1_2_4 = vte_1_2_4;
	}
	
	@Length(min=0, max=64, message="实施实施下肢静脉血管多普勒超声检查评估长度不能超过 64 个字符")
	public String getVte_2_1_1() {
		return vte_2_1_1;
	}

	public void setVte_2_1_1(String vte_2_1_1) {
		this.vte_2_1_1 = vte_2_1_1;
	}
	
	@Length(min=0, max=64, message="实施多普勒超声检查评估日期时间长度不能超过 64 个字符")
	public String getVte_2_1_2() {
		return vte_2_1_2;
	}

	public void setVte_2_1_2(String vte_2_1_2) {
		this.vte_2_1_2 = vte_2_1_2;
	}
	
	@Length(min=0, max=64, message="有无多普勒超声检查阳性发现长度不能超过 64 个字符")
	public String getVte_2_1_3() {
		return vte_2_1_3;
	}

	public void setVte_2_1_3(String vte_2_1_3) {
		this.vte_2_1_3 = vte_2_1_3;
	}
	
	@Length(min=0, max=64, message="实施D⁃二聚体检测评估长度不能超过 64 个字符")
	public String getVte_2_2_1() {
		return vte_2_2_1;
	}

	public void setVte_2_2_1(String vte_2_2_1) {
		this.vte_2_2_1 = vte_2_2_1;
	}
	
	@Length(min=0, max=64, message="D⁃二聚体检测评估日期时间长度不能超过 64 个字符")
	public String getVte_2_2_2() {
		return vte_2_2_2;
	}

	public void setVte_2_2_2(String vte_2_2_2) {
		this.vte_2_2_2 = vte_2_2_2;
	}
	
	public Double getVte_2_2_3() {
		return vte_2_2_3;
	}

	public void setVte_2_2_3(Double vte_2_2_3) {
		this.vte_2_2_3 = vte_2_2_3;
	}
	
	@Length(min=0, max=64, message="D⁃二聚体检测评估结论长度不能超过 64 个字符")
	public String getVte_2_2_4() {
		return vte_2_2_4;
	}

	public void setVte_2_2_4(String vte_2_2_4) {
		this.vte_2_2_4 = vte_2_2_4;
	}
	
	@Length(min=0, max=64, message="是否实施氧合评估长度不能超过 64 个字符")
	public String getVte_2_2_5() {
		return vte_2_2_5;
	}

	public void setVte_2_2_5(String vte_2_2_5) {
		this.vte_2_2_5 = vte_2_2_5;
	}
	
	@Length(min=0, max=64, message="氧合评估长度不能超过 64 个字符")
	public String getVte_2_2_6() {
		return vte_2_2_6;
	}

	public void setVte_2_2_6(String vte_2_2_6) {
		this.vte_2_2_6 = vte_2_2_6;
	}
	
	public Double getVte_2_2_6_1() {
		return vte_2_2_6_1;
	}

	public void setVte_2_2_6_1(Double vte_2_2_6_1) {
		this.vte_2_2_6_1 = vte_2_2_6_1;
	}
	
	public Double getVte_2_2_6_2() {
		return vte_2_2_6_2;
	}

	public void setVte_2_2_6_2(Double vte_2_2_6_2) {
		this.vte_2_2_6_2 = vte_2_2_6_2;
	}
	
	@Length(min=0, max=64, message="是否实施心脏生物学标志物检测长度不能超过 64 个字符")
	public String getVte_2_2_7() {
		return vte_2_2_7;
	}

	public void setVte_2_2_7(String vte_2_2_7) {
		this.vte_2_2_7 = vte_2_2_7;
	}
	
	@Length(min=0, max=64, message="心脏生物学标志物检测项目长度不能超过 64 个字符")
	public String getVte_2_2_8() {
		return vte_2_2_8;
	}

	public void setVte_2_2_8(String vte_2_2_8) {
		this.vte_2_2_8 = vte_2_2_8;
	}
	
	public Double getVte_2_2_8_1() {
		return vte_2_2_8_1;
	}

	public void setVte_2_2_8_1(Double vte_2_2_8_1) {
		this.vte_2_2_8_1 = vte_2_2_8_1;
	}
	
	public Double getVte_2_2_8_2() {
		return vte_2_2_8_2;
	}

	public void setVte_2_2_8_2(Double vte_2_2_8_2) {
		this.vte_2_2_8_2 = vte_2_2_8_2;
	}
	
	public Double getVte_2_2_8_3() {
		return vte_2_2_8_3;
	}

	public void setVte_2_2_8_3(Double vte_2_2_8_3) {
		this.vte_2_2_8_3 = vte_2_2_8_3;
	}
	
	public Double getVte_2_2_8_4() {
		return vte_2_2_8_4;
	}

	public void setVte_2_2_8_4(Double vte_2_2_8_4) {
		this.vte_2_2_8_4 = vte_2_2_8_4;
	}
	
	public Double getVte_2_2_8_5() {
		return vte_2_2_8_5;
	}

	public void setVte_2_2_8_5(Double vte_2_2_8_5) {
		this.vte_2_2_8_5 = vte_2_2_8_5;
	}
	
	public Double getVte_2_2_8_6() {
		return vte_2_2_8_6;
	}

	public void setVte_2_2_8_6(Double vte_2_2_8_6) {
		this.vte_2_2_8_6 = vte_2_2_8_6;
	}
	
	@Length(min=0, max=64, message="是否实施凝血功能检测长度不能超过 64 个字符")
	public String getVte_2_2_9() {
		return vte_2_2_9;
	}

	public void setVte_2_2_9(String vte_2_2_9) {
		this.vte_2_2_9 = vte_2_2_9;
	}
	
	@Length(min=0, max=64, message="凝血功能检测项目长度不能超过 64 个字符")
	public String getVte_2_2_10() {
		return vte_2_2_10;
	}

	public void setVte_2_2_10(String vte_2_2_10) {
		this.vte_2_2_10 = vte_2_2_10;
	}
	
	public Double getVte_2_2_10_1() {
		return vte_2_2_10_1;
	}

	public void setVte_2_2_10_1(Double vte_2_2_10_1) {
		this.vte_2_2_10_1 = vte_2_2_10_1;
	}
	
	public Double getVte_2_2_10_2() {
		return vte_2_2_10_2;
	}

	public void setVte_2_2_10_2(Double vte_2_2_10_2) {
		this.vte_2_2_10_2 = vte_2_2_10_2;
	}
	
	public Double getVte_2_2_10_3() {
		return vte_2_2_10_3;
	}

	public void setVte_2_2_10_3(Double vte_2_2_10_3) {
		this.vte_2_2_10_3 = vte_2_2_10_3;
	}
	
	public Double getVte_2_2_10_4() {
		return vte_2_2_10_4;
	}

	public void setVte_2_2_10_4(Double vte_2_2_10_4) {
		this.vte_2_2_10_4 = vte_2_2_10_4;
	}
	
	@Length(min=0, max=64, message="是否行CT肺动脉造影长度不能超过 64 个字符")
	public String getVte_2_3_1() {
		return vte_2_3_1;
	}

	public void setVte_2_3_1(String vte_2_3_1) {
		this.vte_2_3_1 = vte_2_3_1;
	}
	
	@Length(min=0, max=64, message="实施行CT肺动脉造影长度不能超过 64 个字符")
	public String getVte_2_3_2() {
		return vte_2_3_2;
	}

	public void setVte_2_3_2(String vte_2_3_2) {
		this.vte_2_3_2 = vte_2_3_2;
	}
	
	@Length(min=0, max=64, message="CT肺动脉造影长度不能超过 64 个字符")
	public String getVte_2_3_3() {
		return vte_2_3_3;
	}

	public void setVte_2_3_3(String vte_2_3_3) {
		this.vte_2_3_3 = vte_2_3_3;
	}
	
	@Length(min=0, max=64, message="有无履行VTE预防相关的患者/家属知情同意长度不能超过 64 个字符")
	public String getVte_3_1_1() {
		return vte_3_1_1;
	}

	public void setVte_3_1_1(String vte_3_1_1) {
		this.vte_3_1_1 = vte_3_1_1;
	}
	
	@Length(min=0, max=64, message="VTE预防相关的患者/家属知情同意长度不能超过 64 个字符")
	public String getVte_3_1_2() {
		return vte_3_1_2;
	}

	public void setVte_3_1_2(String vte_3_1_2) {
		this.vte_3_1_2 = vte_3_1_2;
	}
	
	@Length(min=0, max=64, message="有无实施出血风险和其他可能影响预防的因素评估长度不能超过 64 个字符")
	public String getVte_3_2_1() {
		return vte_3_2_1;
	}

	public void setVte_3_2_1(String vte_3_2_1) {
		this.vte_3_2_1 = vte_3_2_1;
	}
	
	@Length(min=0, max=64, message="实施出血风险和其他可能影响预防的因素评估长度不能超过 64 个字符")
	public String getVte_3_2_2() {
		return vte_3_2_2;
	}

	public void setVte_3_2_2(String vte_3_2_2) {
		this.vte_3_2_2 = vte_3_2_2;
	}
	
	@Length(min=0, max=64, message="患者因素选择长度不能超过 64 个字符")
	public String getVte_3_2_2_1() {
		return vte_3_2_2_1;
	}

	public void setVte_3_2_2_1(String vte_3_2_2_1) {
		this.vte_3_2_2_1 = vte_3_2_2_1;
	}
	
	@Length(min=0, max=64, message="基础疾病长度不能超过 64 个字符")
	public String getVte_3_2_2_2() {
		return vte_3_2_2_2;
	}

	public void setVte_3_2_2_2(String vte_3_2_2_2) {
		this.vte_3_2_2_2 = vte_3_2_2_2;
	}
	
	@Length(min=0, max=64, message="合并用药长度不能超过 64 个字符")
	public String getVte_3_2_2_3() {
		return vte_3_2_2_3;
	}

	public void setVte_3_2_2_3(String vte_3_2_2_3) {
		this.vte_3_2_2_3 = vte_3_2_2_3;
	}
	
	@Length(min=0, max=64, message="侵入性操作长度不能超过 64 个字符")
	public String getVte_3_2_2_4() {
		return vte_3_2_2_4;
	}

	public void setVte_3_2_2_4(String vte_3_2_2_4) {
		this.vte_3_2_2_4 = vte_3_2_2_4;
	}
	
	@Length(min=0, max=64, message="其他实施出血风险和其他可能影响预防的因素评估长度不能超过 64 个字符")
	public String getVte_3_2_2_5() {
		return vte_3_2_2_5;
	}

	public void setVte_3_2_2_5(String vte_3_2_2_5) {
		this.vte_3_2_2_5 = vte_3_2_2_5;
	}
	
	@Length(min=0, max=64, message="物理性预防措施应用禁忌长度不能超过 64 个字符")
	public String getVte_3_2_3() {
		return vte_3_2_3;
	}

	public void setVte_3_2_3(String vte_3_2_3) {
		this.vte_3_2_3 = vte_3_2_3;
	}
	
	@Length(min=0, max=64, message="是否需要三级预防深静脉栓塞长度不能超过 64 个字符")
	public String getVte_3_3_0() {
		return vte_3_3_0;
	}

	public void setVte_3_3_0(String vte_3_3_0) {
		this.vte_3_3_0 = vte_3_3_0;
	}
	
	@Length(min=0, max=64, message="三级预防深静脉栓塞措施选择长度不能超过 64 个字符")
	public String getVte_3_3_1() {
		return vte_3_3_1;
	}

	public void setVte_3_3_1(String vte_3_3_1) {
		this.vte_3_3_1 = vte_3_3_1;
	}
	
	@Length(min=0, max=64, message="基本预防措施的选择长度不能超过 64 个字符")
	public String getVte_3_3_2() {
		return vte_3_3_2;
	}

	public void setVte_3_3_2(String vte_3_3_2) {
		this.vte_3_3_2 = vte_3_3_2;
	}
	
	@Length(min=0, max=64, message="其他基本预防措施长度不能超过 64 个字符")
	public String getVte_3_3_2_1() {
		return vte_3_3_2_1;
	}

	public void setVte_3_3_2_1(String vte_3_3_2_1) {
		this.vte_3_3_2_1 = vte_3_3_2_1;
	}
	
	@Length(min=0, max=64, message="医嘱执行起始日期长度不能超过 64 个字符")
	public String getVte_3_3_3() {
		return vte_3_3_3;
	}

	public void setVte_3_3_3(String vte_3_3_3) {
		this.vte_3_3_3 = vte_3_3_3;
	}
	
	@Length(min=0, max=64, message="机械预防措施的选择长度不能超过 64 个字符")
	public String getVte_3_3_4() {
		return vte_3_3_4;
	}

	public void setVte_3_3_4(String vte_3_3_4) {
		this.vte_3_3_4 = vte_3_3_4;
	}
	
	@Length(min=0, max=64, message="其他机械预防措施长度不能超过 64 个字符")
	public String getVte_3_3_4_1() {
		return vte_3_3_4_1;
	}

	public void setVte_3_3_4_1(String vte_3_3_4_1) {
		this.vte_3_3_4_1 = vte_3_3_4_1;
	}
	
	@Length(min=0, max=64, message="医嘱执行日期长度不能超过 64 个字符")
	public String getVte_3_3_5() {
		return vte_3_3_5;
	}

	public void setVte_3_3_5(String vte_3_3_5) {
		this.vte_3_3_5 = vte_3_3_5;
	}
	
	@Length(min=0, max=64, message="预防性地药物的选择长度不能超过 64 个字符")
	public String getVte_3_3_6() {
		return vte_3_3_6;
	}

	public void setVte_3_3_6(String vte_3_3_6) {
		this.vte_3_3_6 = vte_3_3_6;
	}
	
	@Length(min=0, max=64, message="其他预防性地药物长度不能超过 64 个字符")
	public String getVte_3_3_6_1() {
		return vte_3_3_6_1;
	}

	public void setVte_3_3_6_1(String vte_3_3_6_1) {
		this.vte_3_3_6_1 = vte_3_3_6_1;
	}
	
	@Length(min=0, max=64, message="医嘱执行日期长度不能超过 64 个字符")
	public String getVte_3_2_7() {
		return vte_3_2_7;
	}

	public void setVte_3_2_7(String vte_3_2_7) {
		this.vte_3_2_7 = vte_3_2_7;
	}
	
	@Length(min=0, max=64, message="出院后继续使用抗凝药长度不能超过 64 个字符")
	public String getVte_3_3_8() {
		return vte_3_3_8;
	}

	public void setVte_3_3_8(String vte_3_3_8) {
		this.vte_3_3_8 = vte_3_3_8;
	}
	
	@Length(min=0, max=64, message="其他出院后继续使用抗凝药长度不能超过 64 个字符")
	public String getVte_3_3_8_1() {
		return vte_3_3_8_1;
	}

	public void setVte_3_3_8_1(String vte_3_3_8_1) {
		this.vte_3_3_8_1 = vte_3_3_8_1;
	}
	
	@Length(min=0, max=64, message="预防依从性评估长度不能超过 64 个字符")
	public String getVte_3_4_1() {
		return vte_3_4_1;
	}

	public void setVte_3_4_1(String vte_3_4_1) {
		this.vte_3_4_1 = vte_3_4_1;
	}
	
	@Length(min=0, max=64, message="预防安全性主要监测项目长度不能超过 64 个字符")
	public String getVte_3_4_2() {
		return vte_3_4_2;
	}

	public void setVte_3_4_2(String vte_3_4_2) {
		this.vte_3_4_2 = vte_3_4_2;
	}
	
	@Length(min=0, max=64, message="其他预防安全性主要监测项目长度不能超过 64 个字符")
	public String getVte_3_4_2_1() {
		return vte_3_4_2_1;
	}

	public void setVte_3_4_2_1(String vte_3_4_2_1) {
		this.vte_3_4_2_1 = vte_3_4_2_1;
	}
	
	@Length(min=0, max=64, message="是否进行预防效果评估长度不能超过 64 个字符")
	public String getVte_3_4_3() {
		return vte_3_4_3;
	}

	public void setVte_3_4_3(String vte_3_4_3) {
		this.vte_3_4_3 = vte_3_4_3;
	}
	
	@Length(min=0, max=64, message="预防效果评估及相关不良事件长度不能超过 64 个字符")
	public String getVte_3_4_4() {
		return vte_3_4_4;
	}

	public void setVte_3_4_4(String vte_3_4_4) {
		this.vte_3_4_4 = vte_3_4_4;
	}
	
	@Length(min=0, max=64, message="与预防相关的不良事件长度不能超过 64 个字符")
	public String getVte_3_4_4_1() {
		return vte_3_4_4_1;
	}

	public void setVte_3_4_4_1(String vte_3_4_4_1) {
		this.vte_3_4_4_1 = vte_3_4_4_1;
	}
	
	@Length(min=0, max=64, message="与预防不相关的不良事件长度不能超过 64 个字符")
	public String getVte_3_4_4_2() {
		return vte_3_4_4_2;
	}

	public void setVte_3_4_4_2(String vte_3_4_4_2) {
		this.vte_3_4_4_2 = vte_3_4_4_2;
	}
	
	@Length(min=0, max=64, message="其他预防效果评估及相关不良事件长度不能超过 64 个字符")
	public String getVte_3_4_4_3() {
		return vte_3_4_4_3;
	}

	public void setVte_3_4_4_3(String vte_3_4_4_3) {
		this.vte_3_4_4_3 = vte_3_4_4_3;
	}
	
	@Length(min=0, max=64, message="是否为临床高度拟诊VTE的患者长度不能超过 64 个字符")
	public String getVte_4_1_1() {
		return vte_4_1_1;
	}

	public void setVte_4_1_1(String vte_4_1_1) {
		this.vte_4_1_1 = vte_4_1_1;
	}
	
	@Length(min=0, max=64, message="DVT临床高度可疑患者的识别检查项目长度不能超过 64 个字符")
	public String getVte_4_1_2() {
		return vte_4_1_2;
	}

	public void setVte_4_1_2(String vte_4_1_2) {
		this.vte_4_1_2 = vte_4_1_2;
	}
	
	@Length(min=0, max=64, message="其他DVT临床高度可疑患者的识别检查项目长度不能超过 64 个字符")
	public String getVte_4_1_2_1() {
		return vte_4_1_2_1;
	}

	public void setVte_4_1_2_1(String vte_4_1_2_1) {
		this.vte_4_1_2_1 = vte_4_1_2_1;
	}
	
	@Length(min=0, max=64, message="急性PTE临床高度可疑患者的识别检查项目长度不能超过 64 个字符")
	public String getVte_4_1_3() {
		return vte_4_1_3;
	}

	public void setVte_4_1_3(String vte_4_1_3) {
		this.vte_4_1_3 = vte_4_1_3;
	}
	
	@Length(min=0, max=64, message="其他急性PTE临床高度可疑患者的识别检查项目长度不能超过 64 个字符")
	public String getVte_4_1_3_1() {
		return vte_4_1_3_1;
	}

	public void setVte_4_1_3_1(String vte_4_1_3_1) {
		this.vte_4_1_3_1 = vte_4_1_3_1;
	}
	
	@Length(min=0, max=64, message="出现首个VTE的临床表现时间长度不能超过 64 个字符")
	public String getVte_4_1_4() {
		return vte_4_1_4;
	}

	public void setVte_4_1_4(String vte_4_1_4) {
		this.vte_4_1_4 = vte_4_1_4;
	}
	
	@Length(min=0, max=64, message="是否经MDT制定VTE 针对性紧急处理方案长度不能超过 64 个字符")
	public String getVte_4_2_1() {
		return vte_4_2_1;
	}

	public void setVte_4_2_1(String vte_4_2_1) {
		this.vte_4_2_1 = vte_4_2_1;
	}
	
	@Length(min=0, max=64, message="临床高度可疑为VTE后,针对性紧急处理的方法长度不能超过 64 个字符")
	public String getVte_4_2_2() {
		return vte_4_2_2;
	}

	public void setVte_4_2_2(String vte_4_2_2) {
		this.vte_4_2_2 = vte_4_2_2;
	}
	
	@Length(min=0, max=64, message="其他临床高度可疑为VTE后,针对性紧急处理的方法长度不能超过 64 个字符")
	public String getVte_4_2_2_1() {
		return vte_4_2_2_1;
	}

	public void setVte_4_2_2_1(String vte_4_2_2_1) {
		this.vte_4_2_2_1 = vte_4_2_2_1;
	}
	
	@Length(min=0, max=64, message="抗凝重叠治疗医嘱的执行起始的时间选择长度不能超过 64 个字符")
	public String getVte_4_5_1() {
		return vte_4_5_1;
	}

	public void setVte_4_5_1(String vte_4_5_1) {
		this.vte_4_5_1 = vte_4_5_1;
	}
	
	@Length(min=0, max=64, message="溶栓剂长度不能超过 64 个字符")
	public String getVte_4_5_1_a() {
		return vte_4_5_1_a;
	}

	public void setVte_4_5_1_a(String vte_4_5_1_a) {
		this.vte_4_5_1_a = vte_4_5_1_a;
	}
	
	@Length(min=0, max=64, message="溶栓剂长度不能超过 64 个字符")
	public String getVte_4_5_1_b() {
		return vte_4_5_1_b;
	}

	public void setVte_4_5_1_b(String vte_4_5_1_b) {
		this.vte_4_5_1_b = vte_4_5_1_b;
	}
	
	@Length(min=0, max=64, message="低分子肝素钙长度不能超过 64 个字符")
	public String getVte_4_5_1_c() {
		return vte_4_5_1_c;
	}

	public void setVte_4_5_1_c(String vte_4_5_1_c) {
		this.vte_4_5_1_c = vte_4_5_1_c;
	}
	
	@Length(min=0, max=64, message="维生素K拮抗剂长度不能超过 64 个字符")
	public String getVte_4_5_1_d() {
		return vte_4_5_1_d;
	}

	public void setVte_4_5_1_d(String vte_4_5_1_d) {
		this.vte_4_5_1_d = vte_4_5_1_d;
	}
	
	@Length(min=0, max=64, message="华法林长度不能超过 64 个字符")
	public String getVte_4_5_1_e() {
		return vte_4_5_1_e;
	}

	public void setVte_4_5_1_e(String vte_4_5_1_e) {
		this.vte_4_5_1_e = vte_4_5_1_e;
	}
	
	@Length(min=0, max=64, message="其他抗凝剂治疗医嘱的执行起始的时间长度不能超过 64 个字符")
	public String getVte_4_5_1_f() {
		return vte_4_5_1_f;
	}

	public void setVte_4_5_1_f(String vte_4_5_1_f) {
		this.vte_4_5_1_f = vte_4_5_1_f;
	}
	
	@Length(min=0, max=64, message="放置静脉滤器长度不能超过 64 个字符")
	public String getVte_4_6_1() {
		return vte_4_6_1;
	}

	public void setVte_4_6_1(String vte_4_6_1) {
		this.vte_4_6_1 = vte_4_6_1;
	}
	
	@Length(min=0, max=64, message="放置静脉滤器长度不能超过 64 个字符")
	public String getVte_4_6_2() {
		return vte_4_6_2;
	}

	public void setVte_4_6_2(String vte_4_6_2) {
		this.vte_4_6_2 = vte_4_6_2;
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