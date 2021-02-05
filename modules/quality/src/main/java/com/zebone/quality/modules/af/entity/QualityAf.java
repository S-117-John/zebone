/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.af.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.jeesite.common.mybatis.annotation.JoinTable;
import com.jeesite.common.mybatis.annotation.JoinTable.Type;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * AF房颤Entity
 * @author kakaxi
 * @version 2021-02-03
 */
@Table(name="quality_af", alias="a", columns={
		@Column(name="cm_0_1_1_1", attrName="cm_0_1_1_1", label="质控医师"),
		@Column(name="cm_0_1_1_2", attrName="cm_0_1_1_2", label="质控护士"),
		@Column(name="cm_0_1_1_3", attrName="cm_0_1_1_3", label="主治医师"),
		@Column(name="cm_0_1_1_4", attrName="cm_0_1_1_4", label="责任护士"),
		@Column(name="cm_0_1_1_5", attrName="cm_0_1_1_5", label="上报科室"),
		@Column(name="caseid", attrName="caseid", label="患者病案号"),
		@Column(name="cm_0_1_3_1", attrName="cm_0_1_3_1", label="第一诊断或第二诊断ICD-10四位亚目编码与名称"),
		@Column(name="cm_0_1_3_2", attrName="cm_0_1_3_2", label="第一诊断或第二诊断ICD-10六位临床扩展编码与名称"),
		@Column(name="cm_0_1_4_1", attrName="cm_0_1_4_1", label="主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称"),
		@Column(name="cm_0_1_4_1_1", attrName="cm_0_1_4_1_1", label="其他ICD-9-CM-3四位亚目编码与名称"),
		@Column(name="cm_0_1_4_2", attrName="cm_0_1_4_2", label="主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称"),
		@Column(name="cm_0_1_4_2_1", attrName="cm_0_1_4_2_1", label="其他ICD-9-CM-3六位临床扩展编码与名称"),
		@Column(name="cm_0_1_5", attrName="cm_0_1_5", label="是否出院后31天内重复住院"),
		@Column(name="cm_0_2_1_1", attrName="cm_0_2_1_1", label="出生日期"),
		@Column(name="cm_0_2_1_2", attrName="cm_0_2_1_2", label="患者性别"),
		@Column(name="cm_0_2_1_3", attrName="cm_0_2_1_3", label="患者体重", comment="患者体重（kg）"),
		@Column(name="cm_0_2_1_5", attrName="cm_0_2_1_5", label="患者身高", comment="患者身高（cm）"),
		@Column(name="cm_0_2_2_1", attrName="cm_0_2_2_1", label="发病日期时间是否无法确定或无记录"),
		@Column(name="cm_0_2_2_2", attrName="cm_0_2_2_2", label="发病日期时间"),
		@Column(name="cm_0_2_3_1", attrName="cm_0_2_3_1", label="到达本院急诊或者门诊日期时间是否无法确定或无记录"),
		@Column(name="cm_0_2_3_2", attrName="cm_0_2_3_2", label="到达本院急诊或者门诊日期时间"),
		@Column(name="cm_0_2_4_1", attrName="cm_0_2_4_1", label="入院日期时间"),
		@Column(name="cm_0_2_4_2", attrName="cm_0_2_4_2", label="出院日期时间"),
		@Column(name="cm_0_2_6_1", attrName="cm_0_2_6_1", label="手术开始", comment="手术开始（切皮）日期时间"),
		@Column(name="cm_0_2_6_2", attrName="cm_0_2_6_2", label="手术结束", comment="手术结束（缝皮结束）日期时间"),
		@Column(name="cm_0_3_1", attrName="cm_0_3_1", label="费用支付方式"),
		@Column(name="cm_0_3_2", attrName="cm_0_3_2", label="收入住院途径"),
		@Column(name="cm_0_3_3", attrName="cm_0_3_3", label="到院交通工具"),
		@Column(name="af_1_1_0", attrName="af_1_1_0", label="实施相关检查"),
		@Column(name="af_1_1_0_1", attrName="af_1_1_0_1", label="其他实施相关检查"),
		@Column(name="af_1_1_2", attrName="af_1_1_2", label="症状严重程度", comment="症状严重程度（EHRA评分）评估"),
		@Column(name="af_1_1_3", attrName="af_1_1_3", label="是否为血流动力学不稳定性房颤"),
		@Column(name="af_1_1_4", attrName="af_1_1_4", label="血流动力学不稳定的临床表现"),
		@Column(name="af_1_2_1", attrName="af_1_2_1", label="房颤患者脑卒中风险评估工具"),
		@Column(name="af_1_2_2", attrName="af_1_2_2", label="使用CHADS₂评分工具的房颤患者脑卒中风险评估分值"),
		@Column(name="af_1_2_3", attrName="af_1_2_3", label="CHADS₂评分风险评估分层"),
		@Column(name="af_1_2_4", attrName="af_1_2_4", label="使用CHA₂DS₂-VASc评分工具的房颤患者脑卒中风险评估分值"),
		@Column(name="af_1_2_5", attrName="af_1_2_5", label="房颤患者脑卒中风险评估分层"),
		@Column(name="af_1_3_1", attrName="af_1_3_1", label="是否首次房颤患者 出血风险评估", comment="是否首次房颤患者 出血风险评估(HAS-BLED 评分)"),
		@Column(name="af_1_3_2", attrName="af_1_3_2", label="首次房颤患者 出血风险评估分值"),
		@Column(name="af_1_3_4", attrName="af_1_3_4", label="HAS-BLED评分≥3者视为高危患者"),
		@Column(name="af_2_1_1", attrName="af_2_1_1", label="是否为CHA₂DS₂-VASc评分≥2的男性或≥3的女性房颤患者"),
		@Column(name="af_2_2_1", attrName="af_2_2_1", label="肌酐清除率", comment="肌酐清除率(ml／min)"),
		@Column(name="af_2_3_1", attrName="af_2_3_1", label="是否接受抗凝治疗"),
		@Column(name="af_2_3_2", attrName="af_2_3_2", label="抗凝药选择"),
		@Column(name="af_2_3_2_1", attrName="af_2_3_2_1", label="其他非维生素K拮抗剂口服抗凝药物"),
		@Column(name="af_2_4_1", attrName="af_2_4_1", label="华法林治疗后是否测定INR值"),
		@Column(name="af_2_4_2", attrName="af_2_4_2", label="INR值"),
		@Column(name="af_3_1_1", attrName="af_3_1_1", label="是否接受抗心律失常药物治疗"),
		@Column(name="af_3_1_2", attrName="af_3_1_2", label="抗心律失常药物"),
		@Column(name="af_3_1_2_1", attrName="af_3_1_2_1", label="Ⅰa类药物选择"),
		@Column(name="af_3_1_2_2", attrName="af_3_1_2_2", label="Ⅰb类药物选择"),
		@Column(name="af_3_1_2_3", attrName="af_3_1_2_3", label="Ⅰc类药物选择"),
		@Column(name="af_3_1_2_4", attrName="af_3_1_2_4", label="Ⅱ类药物选择"),
		@Column(name="af_3_1_2_5", attrName="af_3_1_2_5", label="Ⅲ类药物选择"),
		@Column(name="af_3_1_2_6", attrName="af_3_1_2_6", label="Ⅳ类药物选择"),
		@Column(name="af_3_1_3", attrName="af_3_1_3", label="其他常用使用抗心律失常药物"),
		@Column(name="af_4_1_1_1", attrName="af_4_1_1_1", label="是否有ACEI/ARB用药长期医嘱"),
		@Column(name="af_4_1_1_2", attrName="af_4_1_1_2", label="长期医嘱药物的选择", comment="长期医嘱药物的选择(ACEI/ARB)"),
		@Column(name="af_4_1_1_3", attrName="af_4_1_1_3", label="ACEI抑制剂药物的选择"),
		@Column(name="af_4_1_1_3_1", attrName="af_4_1_1_3_1", label="其他ACEI 药物名称"),
		@Column(name="af_4_1_1_4", attrName="af_4_1_1_4", label="使用ARB类药物的选择"),
		@Column(name="af_4_1_1_4_1", attrName="af_4_1_1_4_1", label="其他ARB 药物名称"),
		@Column(name="af_4_1_2_1", attrName="af_4_1_2_1", label="是否有β受体阻滞剂用药长期医嘱"),
		@Column(name="af_4_1_2_2", attrName="af_4_1_2_2", label="使用首剂β-受体阻滞剂药物的选择"),
		@Column(name="af_4_1_2_2_1", attrName="af_4_1_2_2_1", label="其他β-受体阻滞剂药物名称"),
		@Column(name="af_4_1_3_1", attrName="af_4_1_3_1", label="是否有固酮拮抗剂药物用药长期医嘱"),
		@Column(name="af_4_1_3_2", attrName="af_4_1_3_2", label="使用醛固酮受体拮抗剂的选择"),
		@Column(name="af_4_1_3_2_1", attrName="af_4_1_3_2_1", label="其他醛固酮受体拮抗剂类药物名称"),
		@Column(name="af_4_2_1_1", attrName="af_4_2_1_1", label="出院带药医嘱中有继续使用ACEI或ARB药物记录医嘱"),
		@Column(name="af_4_2_1_2", attrName="af_4_2_1_2", label="出院带药医嘱药物的选择", comment="出院带药医嘱药物的选择(ACEI/ARB)"),
		@Column(name="af_4_2_1_3", attrName="af_4_2_1_3", label="ACEI抑制剂药物的选择"),
		@Column(name="af_4_2_1_3_1", attrName="af_4_2_1_3_1", label="其他ACEI 药物名称"),
		@Column(name="af_4_2_1_4", attrName="af_4_2_1_4", label="使用ARB类药物的选择"),
		@Column(name="af_4_2_1_4_1", attrName="af_4_2_1_4_1", label="其他ARB 药物名称"),
		@Column(name="af_4_2_2_1", attrName="af_4_2_2_1", label="出院带药医嘱中有继续使用β受体阻滞剂药物医嘱"),
		@Column(name="af_4_2_2_2", attrName="af_4_2_2_2", label="使用首剂β-受体阻滞剂药物的选择"),
		@Column(name="af_4_2_2_2_1", attrName="af_4_2_2_2_1", label="其他β-受体阻滞剂药物名称"),
		@Column(name="af_4_2_3_1", attrName="af_4_2_3_1", label="出院带药医嘱中有继续使用醛固酮拮抗剂药物医嘱"),
		@Column(name="af_4_2_3_2", attrName="af_4_2_3_2", label="使用醛固酮受体拮抗剂的选择"),
		@Column(name="af_4_2_3_2_1", attrName="af_4_2_3_2_1", label="其他醛固酮受体拮抗剂类药物名称"),
		@Column(name="af_5_1_1", attrName="af_5_1_1", label="是否进行房颤导管消融治疗"),
		@Column(name="af_5_1_2", attrName="af_5_1_2", label="适应证"),
		@Column(name="af_5_1_3_1", attrName="af_5_1_3_1", label="消融治疗入路"),
		@Column(name="af_5_1_3_2", attrName="af_5_1_3_2", label="消融治疗方法"),
		@Column(name="af_5_1_3_3", attrName="af_5_1_3_3", label="其他消融治疗方法"),
		@Column(name="af_5_1_3", attrName="af_5_1_3", label="房颤导管消融常用术式和终点"),
		@Column(name="af_5_1_3_4", attrName="af_5_1_3_4", label="其他消融术"),
		@Column(name="af_5_1_4_0", attrName="af_5_1_4_0", label="是否有治疗并发症"),
		@Column(name="af_5_1_4", attrName="af_5_1_4", label="治疗并发症"),
		@Column(name="af_5_1_4_1", attrName="af_5_1_4_1", label="其他治疗并发症"),
		@Column(name="af_5_1_5", attrName="af_5_1_5", label="影响程度的选择"),
		@Column(name="af_5_2_1", attrName="af_5_2_1", label="是否进行左心耳封堵治疗"),
		@Column(name="af_5_2_2", attrName="af_5_2_2", label="应用LAAC预防NVAF血栓事件的适合性评估情况"),
		@Column(name="af_5_2_2_1", attrName="af_5_2_2_1", label="其他应用LAAC预防NVAF血栓事件的适合性评估情"),
		@Column(name="af_5_3_1", attrName="af_5_3_1", label="是否LAAC术中使用TEE监测"),
		@Column(name="af_5_2_4", attrName="af_5_2_4", label="TEE在LAAC术中监测"),
		@Column(name="af_5_2_4_0", attrName="af_5_2_4_0", label="是否有治疗并发症"),
		@Column(name="af_5_2_3", attrName="af_5_2_3", label="治疗并发症"),
		@Column(name="af_5_2_3_1", attrName="af_5_2_3_1", label="其他治疗并发症"),
		@Column(name="af_5_2_5", attrName="af_5_2_5", label="影响程度的选择"),
		@Column(name="cm_3_1", attrName="cm_3_1", label="手术野皮肤准备常用方法的选择"),
		@Column(name="cm_3_2", attrName="cm_3_2", label="使用含抗菌剂", comment="使用含抗菌剂（三氯生）缝线"),
		@Column(name="cm_3_2_1", attrName="cm_3_2_1", label="其他含抗菌剂缝线填写"),
		@Column(name="cm_3_3", attrName="cm_3_3", label="手术切口类别的选择"),
		@Column(name="cm_3_4", attrName="cm_3_4", label="手术切口愈合情况的选择"),
		@Column(name="af_6_1_1", attrName="af_6_1_1", label="新型口服抗凝药", comment="新型口服抗凝药（NOAC）or华法林"),
		@Column(name="af_6_1_1_1", attrName="af_6_1_1_1", label="其他非维生素K拮抗剂口服抗凝药物"),
		@Column(name="af_7_1_1", attrName="af_7_1_1", label="常見危险因素"),
		@Column(name="af_7_1_1_1", attrName="af_7_1_1_1", label="其他危险因素"),
		@Column(name="af_7_2_1", attrName="af_7_2_1", label="使用新型口服抗凝药", comment="使用新型口服抗凝药（NOAC）or华法林药物治疗的健康教育"),
		@Column(name="af_7_2_2", attrName="af_7_2_2", label="使用抗心律失常药物治疗的健康教育"),
		@Column(name="af_7_3_1", attrName="af_7_3_1", label="房颤导管消融治疗", comment="房颤导管消融治疗（含冷冻球囊）的健康教育"),
		@Column(name="af_7_3_2", attrName="af_7_3_2", label="左心耳封堵治疗的健康教育左心耳封堵治疗"),
		@Column(name="af_7_4_1", attrName="af_7_4_1", label="交与患者“出院小结”的副本告知患者出院时风险因素"),
		@Column(name="af_7_4_2", attrName="af_7_4_2", label="出院带药"),
		@Column(name="af_7_4_3", attrName="af_7_4_3", label="告知何为风险因素与紧急情况"),
		@Column(name="af_7_4_4", attrName="af_7_4_4", label="告知发生紧急情况时求援救治途径"),
		@Column(name="af_7_4_5", attrName="af_7_4_5", label="出院时教育与随访"),
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
public class QualityAf extends DataEntity<QualityAf> {
	
	private static final long serialVersionUID = 1L;
	private String cm_0_1_1_1;		// 质控医师
	private String cm_0_1_1_2;		// 质控护士
	private String cm_0_1_1_3;		// 主治医师
	private String cm_0_1_1_4;		// 责任护士
	private String cm_0_1_1_5;		// 上报科室
	private String caseid;		// 患者病案号
	private String cm_0_1_3_1;		// 第一诊断或第二诊断ICD-10四位亚目编码与名称
	private String cm_0_1_3_2;		// 第一诊断或第二诊断ICD-10六位临床扩展编码与名称
	private String cm_0_1_4_1;		// 主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称
	private String cm_0_1_4_1_1;		// 其他ICD-9-CM-3四位亚目编码与名称
	private String cm_0_1_4_2;		// 主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称
	private String cm_0_1_4_2_1;		// 其他ICD-9-CM-3六位临床扩展编码与名称
	private String cm_0_1_5;		// 是否出院后31天内重复住院
	private Date cm_0_2_1_1;		// 出生日期
	private String cm_0_2_1_2;		// 患者性别
	private Double cm_0_2_1_3;		// 患者体重（kg）
	private Double cm_0_2_1_5;		// 患者身高（cm）
	private String cm_0_2_2_1;		// 发病日期时间是否无法确定或无记录
	private Date cm_0_2_2_2;		// 发病日期时间
	private String cm_0_2_3_1;		// 到达本院急诊或者门诊日期时间是否无法确定或无记录
	private Date cm_0_2_3_2;		// 到达本院急诊或者门诊日期时间
	private Date cm_0_2_4_1;		// 入院日期时间
	private Date cm_0_2_4_2;		// 出院日期时间
	private Date cm_0_2_6_1;		// 手术开始（切皮）日期时间
	private Date cm_0_2_6_2;		// 手术结束（缝皮结束）日期时间
	private String cm_0_3_1;		// 费用支付方式
	private String cm_0_3_2;		// 收入住院途径
	private String cm_0_3_3;		// 到院交通工具
	private String af_1_1_0;		// 实施相关检查
	private String af_1_1_0_1;		// 其他实施相关检查
	private String af_1_1_2;		// 症状严重程度（EHRA评分）评估
	private String af_1_1_3;		// 是否为血流动力学不稳定性房颤
	private String af_1_1_4;		// 血流动力学不稳定的临床表现
	private String af_1_2_1;		// 房颤患者脑卒中风险评估工具
	private Long af_1_2_2;		// 使用CHADS₂评分工具的房颤患者脑卒中风险评估分值
	private String af_1_2_3;		// CHADS₂评分风险评估分层
	private Long af_1_2_4;		// 使用CHA₂DS₂-VASc评分工具的房颤患者脑卒中风险评估分值
	private String af_1_2_5;		// 房颤患者脑卒中风险评估分层
	private String af_1_3_1;		// 是否首次房颤患者 出血风险评估(HAS-BLED 评分)
	private Long af_1_3_2;		// 首次房颤患者 出血风险评估分值
	private String af_1_3_4;		// HAS-BLED评分≥3者视为高危患者
	private String af_2_1_1;		// 是否为CHA₂DS₂-VASc评分≥2的男性或≥3的女性房颤患者
	private String af_2_2_1;		// 肌酐清除率(ml／min)
	private String af_2_3_1;		// 是否接受抗凝治疗
	private String af_2_3_2;		// 抗凝药选择
	private String af_2_3_2_1;		// 其他非维生素K拮抗剂口服抗凝药物
	private String af_2_4_1;		// 华法林治疗后是否测定INR值
	private Double af_2_4_2;		// INR值
	private String af_3_1_1;		// 是否接受抗心律失常药物治疗
	private String af_3_1_2;		// 抗心律失常药物
	private String af_3_1_2_1;		// Ⅰa类药物选择
	private String af_3_1_2_2;		// Ⅰb类药物选择
	private String af_3_1_2_3;		// Ⅰc类药物选择
	private String af_3_1_2_4;		// Ⅱ类药物选择
	private String af_3_1_2_5;		// Ⅲ类药物选择
	private String af_3_1_2_6;		// Ⅳ类药物选择
	private String af_3_1_3;		// 其他常用使用抗心律失常药物
	private String af_4_1_1_1;		// 是否有ACEI/ARB用药长期医嘱
	private String af_4_1_1_2;		// 长期医嘱药物的选择(ACEI/ARB)
	private String af_4_1_1_3;		// ACEI抑制剂药物的选择
	private String af_4_1_1_3_1;		// 其他ACEI 药物名称
	private String af_4_1_1_4;		// 使用ARB类药物的选择
	private String af_4_1_1_4_1;		// 其他ARB 药物名称
	private String af_4_1_2_1;		// 是否有β受体阻滞剂用药长期医嘱
	private String af_4_1_2_2;		// 使用首剂β-受体阻滞剂药物的选择
	private String af_4_1_2_2_1;		// 其他β-受体阻滞剂药物名称
	private String af_4_1_3_1;		// 是否有固酮拮抗剂药物用药长期医嘱
	private String af_4_1_3_2;		// 使用醛固酮受体拮抗剂的选择
	private String af_4_1_3_2_1;		// 其他醛固酮受体拮抗剂类药物名称
	private String af_4_2_1_1;		// 出院带药医嘱中有继续使用ACEI或ARB药物记录医嘱
	private String af_4_2_1_2;		// 出院带药医嘱药物的选择(ACEI/ARB)
	private String af_4_2_1_3;		// ACEI抑制剂药物的选择
	private String af_4_2_1_3_1;		// 其他ACEI 药物名称
	private String af_4_2_1_4;		// 使用ARB类药物的选择
	private String af_4_2_1_4_1;		// 其他ARB 药物名称
	private String af_4_2_2_1;		// 出院带药医嘱中有继续使用β受体阻滞剂药物医嘱
	private String af_4_2_2_2;		// 使用首剂β-受体阻滞剂药物的选择
	private String af_4_2_2_2_1;		// 其他β-受体阻滞剂药物名称
	private String af_4_2_3_1;		// 出院带药医嘱中有继续使用醛固酮拮抗剂药物医嘱
	private String af_4_2_3_2;		// 使用醛固酮受体拮抗剂的选择
	private String af_4_2_3_2_1;		// 其他醛固酮受体拮抗剂类药物名称
	private String af_5_1_1;		// 是否进行房颤导管消融治疗
	private String af_5_1_2;		// 适应证
	private String af_5_1_3_1;		// 消融治疗入路
	private String af_5_1_3_2;		// 消融治疗方法
	private String af_5_1_3_3;		// 其他消融治疗方法
	private String af_5_1_3;		// 房颤导管消融常用术式和终点
	private String af_5_1_3_4;		// 其他消融术
	private String af_5_1_4_0;		// 是否有治疗并发症
	private String af_5_1_4;		// 治疗并发症
	private String af_5_1_4_1;		// 其他治疗并发症
	private String af_5_1_5;		// 影响程度的选择
	private String af_5_2_1;		// 是否进行左心耳封堵治疗
	private String af_5_2_2;		// 应用LAAC预防NVAF血栓事件的适合性评估情况
	private String af_5_2_2_1;		// 其他应用LAAC预防NVAF血栓事件的适合性评估情
	private String af_5_3_1;		// 是否LAAC术中使用TEE监测
	private String af_5_2_4;		// TEE在LAAC术中监测
	private String af_5_2_4_0;		// 是否有治疗并发症
	private String af_5_2_3;		// 治疗并发症
	private String af_5_2_3_1;		// 其他治疗并发症
	private String af_5_2_5;		// 影响程度的选择
	private String cm_3_1;		// 手术野皮肤准备常用方法的选择
	private String cm_3_2;		// 使用含抗菌剂（三氯生）缝线
	private String cm_3_2_1;		// 其他含抗菌剂缝线填写
	private String cm_3_3;		// 手术切口类别的选择
	private String cm_3_4;		// 手术切口愈合情况的选择
	private String af_6_1_1;		// 新型口服抗凝药（NOAC）or华法林
	private String af_6_1_1_1;		// 其他非维生素K拮抗剂口服抗凝药物
	private String af_7_1_1;		// 常見危险因素
	private String af_7_1_1_1;		// 其他危险因素
	private String af_7_2_1;		// 使用新型口服抗凝药（NOAC）or华法林药物治疗的健康教育
	private String af_7_2_2;		// 使用抗心律失常药物治疗的健康教育
	private String af_7_3_1;		// 房颤导管消融治疗（含冷冻球囊）的健康教育
	private String af_7_3_2;		// 左心耳封堵治疗的健康教育左心耳封堵治疗
	private String af_7_4_1;		// 交与患者“出院小结”的副本告知患者出院时风险因素
	private String af_7_4_2;		// 出院带药
	private String af_7_4_3;		// 告知何为风险因素与紧急情况
	private String af_7_4_4;		// 告知发生紧急情况时求援救治途径
	private String af_7_4_5;		// 出院时教育与随访
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
	
	public QualityAf() {
		this(null);
	}

	public QualityAf(String id){
		super(id);
	}
	
	@Length(min=0, max=32, message="质控医师长度不能超过 32 个字符")
	public String getCm_0_1_1_1() {
		return cm_0_1_1_1;
	}

	public void setCm_0_1_1_1(String cm_0_1_1_1) {
		this.cm_0_1_1_1 = cm_0_1_1_1;
	}
	
	@Length(min=0, max=32, message="质控护士长度不能超过 32 个字符")
	public String getCm_0_1_1_2() {
		return cm_0_1_1_2;
	}

	public void setCm_0_1_1_2(String cm_0_1_1_2) {
		this.cm_0_1_1_2 = cm_0_1_1_2;
	}
	
	@Length(min=0, max=32, message="主治医师长度不能超过 32 个字符")
	public String getCm_0_1_1_3() {
		return cm_0_1_1_3;
	}

	public void setCm_0_1_1_3(String cm_0_1_1_3) {
		this.cm_0_1_1_3 = cm_0_1_1_3;
	}
	
	@Length(min=0, max=32, message="责任护士长度不能超过 32 个字符")
	public String getCm_0_1_1_4() {
		return cm_0_1_1_4;
	}

	public void setCm_0_1_1_4(String cm_0_1_1_4) {
		this.cm_0_1_1_4 = cm_0_1_1_4;
	}
	
	@Length(min=0, max=32, message="上报科室长度不能超过 32 个字符")
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
	
	@Length(min=0, max=32, message="第一诊断或第二诊断ICD-10四位亚目编码与名称长度不能超过 32 个字符")
	public String getCm_0_1_3_1() {
		return cm_0_1_3_1;
	}

	public void setCm_0_1_3_1(String cm_0_1_3_1) {
		this.cm_0_1_3_1 = cm_0_1_3_1;
	}
	
	@Length(min=0, max=32, message="第一诊断或第二诊断ICD-10六位临床扩展编码与名称长度不能超过 32 个字符")
	public String getCm_0_1_3_2() {
		return cm_0_1_3_2;
	}

	public void setCm_0_1_3_2(String cm_0_1_3_2) {
		this.cm_0_1_3_2 = cm_0_1_3_2;
	}
	
	@Length(min=0, max=32, message="主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称长度不能超过 32 个字符")
	public String getCm_0_1_4_1() {
		return cm_0_1_4_1;
	}

	public void setCm_0_1_4_1(String cm_0_1_4_1) {
		this.cm_0_1_4_1 = cm_0_1_4_1;
	}
	
	@Length(min=0, max=32, message="其他ICD-9-CM-3四位亚目编码与名称长度不能超过 32 个字符")
	public String getCm_0_1_4_1_1() {
		return cm_0_1_4_1_1;
	}

	public void setCm_0_1_4_1_1(String cm_0_1_4_1_1) {
		this.cm_0_1_4_1_1 = cm_0_1_4_1_1;
	}
	
	@Length(min=0, max=32, message="主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称长度不能超过 32 个字符")
	public String getCm_0_1_4_2() {
		return cm_0_1_4_2;
	}

	public void setCm_0_1_4_2(String cm_0_1_4_2) {
		this.cm_0_1_4_2 = cm_0_1_4_2;
	}
	
	@Length(min=0, max=32, message="其他ICD-9-CM-3六位临床扩展编码与名称长度不能超过 32 个字符")
	public String getCm_0_1_4_2_1() {
		return cm_0_1_4_2_1;
	}

	public void setCm_0_1_4_2_1(String cm_0_1_4_2_1) {
		this.cm_0_1_4_2_1 = cm_0_1_4_2_1;
	}
	
	@Length(min=0, max=32, message="是否出院后31天内重复住院长度不能超过 32 个字符")
	public String getCm_0_1_5() {
		return cm_0_1_5;
	}

	public void setCm_0_1_5(String cm_0_1_5) {
		this.cm_0_1_5 = cm_0_1_5;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCm_0_2_1_1() {
		return cm_0_2_1_1;
	}

	public void setCm_0_2_1_1(Date cm_0_2_1_1) {
		this.cm_0_2_1_1 = cm_0_2_1_1;
	}
	
	@Length(min=0, max=32, message="患者性别长度不能超过 32 个字符")
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
	
	@Length(min=0, max=32, message="发病日期时间是否无法确定或无记录长度不能超过 32 个字符")
	public String getCm_0_2_2_1() {
		return cm_0_2_2_1;
	}

	public void setCm_0_2_2_1(String cm_0_2_2_1) {
		this.cm_0_2_2_1 = cm_0_2_2_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCm_0_2_2_2() {
		return cm_0_2_2_2;
	}

	public void setCm_0_2_2_2(Date cm_0_2_2_2) {
		this.cm_0_2_2_2 = cm_0_2_2_2;
	}
	
	@Length(min=0, max=32, message="到达本院急诊或者门诊日期时间是否无法确定或无记录长度不能超过 32 个字符")
	public String getCm_0_2_3_1() {
		return cm_0_2_3_1;
	}

	public void setCm_0_2_3_1(String cm_0_2_3_1) {
		this.cm_0_2_3_1 = cm_0_2_3_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCm_0_2_3_2() {
		return cm_0_2_3_2;
	}

	public void setCm_0_2_3_2(Date cm_0_2_3_2) {
		this.cm_0_2_3_2 = cm_0_2_3_2;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCm_0_2_4_1() {
		return cm_0_2_4_1;
	}

	public void setCm_0_2_4_1(Date cm_0_2_4_1) {
		this.cm_0_2_4_1 = cm_0_2_4_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCm_0_2_4_2() {
		return cm_0_2_4_2;
	}

	public void setCm_0_2_4_2(Date cm_0_2_4_2) {
		this.cm_0_2_4_2 = cm_0_2_4_2;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCm_0_2_6_1() {
		return cm_0_2_6_1;
	}

	public void setCm_0_2_6_1(Date cm_0_2_6_1) {
		this.cm_0_2_6_1 = cm_0_2_6_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCm_0_2_6_2() {
		return cm_0_2_6_2;
	}

	public void setCm_0_2_6_2(Date cm_0_2_6_2) {
		this.cm_0_2_6_2 = cm_0_2_6_2;
	}
	
	@Length(min=0, max=32, message="费用支付方式长度不能超过 32 个字符")
	public String getCm_0_3_1() {
		return cm_0_3_1;
	}

	public void setCm_0_3_1(String cm_0_3_1) {
		this.cm_0_3_1 = cm_0_3_1;
	}
	
	@Length(min=0, max=32, message="收入住院途径长度不能超过 32 个字符")
	public String getCm_0_3_2() {
		return cm_0_3_2;
	}

	public void setCm_0_3_2(String cm_0_3_2) {
		this.cm_0_3_2 = cm_0_3_2;
	}
	
	@Length(min=0, max=32, message="到院交通工具长度不能超过 32 个字符")
	public String getCm_0_3_3() {
		return cm_0_3_3;
	}

	public void setCm_0_3_3(String cm_0_3_3) {
		this.cm_0_3_3 = cm_0_3_3;
	}
	
	@Length(min=0, max=32, message="实施相关检查长度不能超过 32 个字符")
	public String getAf_1_1_0() {
		return af_1_1_0;
	}

	public void setAf_1_1_0(String af_1_1_0) {
		this.af_1_1_0 = af_1_1_0;
	}
	
	@Length(min=0, max=32, message="其他实施相关检查长度不能超过 32 个字符")
	public String getAf_1_1_0_1() {
		return af_1_1_0_1;
	}

	public void setAf_1_1_0_1(String af_1_1_0_1) {
		this.af_1_1_0_1 = af_1_1_0_1;
	}
	
	@Length(min=0, max=32, message="症状严重程度长度不能超过 32 个字符")
	public String getAf_1_1_2() {
		return af_1_1_2;
	}

	public void setAf_1_1_2(String af_1_1_2) {
		this.af_1_1_2 = af_1_1_2;
	}
	
	@Length(min=0, max=32, message="是否为血流动力学不稳定性房颤长度不能超过 32 个字符")
	public String getAf_1_1_3() {
		return af_1_1_3;
	}

	public void setAf_1_1_3(String af_1_1_3) {
		this.af_1_1_3 = af_1_1_3;
	}
	
	@Length(min=0, max=32, message="血流动力学不稳定的临床表现长度不能超过 32 个字符")
	public String getAf_1_1_4() {
		return af_1_1_4;
	}

	public void setAf_1_1_4(String af_1_1_4) {
		this.af_1_1_4 = af_1_1_4;
	}
	
	@Length(min=0, max=32, message="房颤患者脑卒中风险评估工具长度不能超过 32 个字符")
	public String getAf_1_2_1() {
		return af_1_2_1;
	}

	public void setAf_1_2_1(String af_1_2_1) {
		this.af_1_2_1 = af_1_2_1;
	}
	
	public Long getAf_1_2_2() {
		return af_1_2_2;
	}

	public void setAf_1_2_2(Long af_1_2_2) {
		this.af_1_2_2 = af_1_2_2;
	}
	
	@Length(min=0, max=32, message="CHADS₂评分风险评估分层长度不能超过 32 个字符")
	public String getAf_1_2_3() {
		return af_1_2_3;
	}

	public void setAf_1_2_3(String af_1_2_3) {
		this.af_1_2_3 = af_1_2_3;
	}
	
	public Long getAf_1_2_4() {
		return af_1_2_4;
	}

	public void setAf_1_2_4(Long af_1_2_4) {
		this.af_1_2_4 = af_1_2_4;
	}
	
	@Length(min=0, max=32, message="房颤患者脑卒中风险评估分层长度不能超过 32 个字符")
	public String getAf_1_2_5() {
		return af_1_2_5;
	}

	public void setAf_1_2_5(String af_1_2_5) {
		this.af_1_2_5 = af_1_2_5;
	}
	
	@Length(min=0, max=32, message="是否首次房颤患者 出血风险评估长度不能超过 32 个字符")
	public String getAf_1_3_1() {
		return af_1_3_1;
	}

	public void setAf_1_3_1(String af_1_3_1) {
		this.af_1_3_1 = af_1_3_1;
	}
	
	public Long getAf_1_3_2() {
		return af_1_3_2;
	}

	public void setAf_1_3_2(Long af_1_3_2) {
		this.af_1_3_2 = af_1_3_2;
	}
	
	@Length(min=0, max=32, message="HAS-BLED评分≥3者视为高危患者长度不能超过 32 个字符")
	public String getAf_1_3_4() {
		return af_1_3_4;
	}

	public void setAf_1_3_4(String af_1_3_4) {
		this.af_1_3_4 = af_1_3_4;
	}
	
	@Length(min=0, max=32, message="是否为CHA₂DS₂-VASc评分≥2的男性或≥3的女性房颤患者长度不能超过 32 个字符")
	public String getAf_2_1_1() {
		return af_2_1_1;
	}

	public void setAf_2_1_1(String af_2_1_1) {
		this.af_2_1_1 = af_2_1_1;
	}
	
	@Length(min=0, max=32, message="肌酐清除率长度不能超过 32 个字符")
	public String getAf_2_2_1() {
		return af_2_2_1;
	}

	public void setAf_2_2_1(String af_2_2_1) {
		this.af_2_2_1 = af_2_2_1;
	}
	
	@Length(min=0, max=32, message="是否接受抗凝治疗长度不能超过 32 个字符")
	public String getAf_2_3_1() {
		return af_2_3_1;
	}

	public void setAf_2_3_1(String af_2_3_1) {
		this.af_2_3_1 = af_2_3_1;
	}
	
	@Length(min=0, max=32, message="抗凝药选择长度不能超过 32 个字符")
	public String getAf_2_3_2() {
		return af_2_3_2;
	}

	public void setAf_2_3_2(String af_2_3_2) {
		this.af_2_3_2 = af_2_3_2;
	}
	
	@Length(min=0, max=32, message="其他非维生素K拮抗剂口服抗凝药物长度不能超过 32 个字符")
	public String getAf_2_3_2_1() {
		return af_2_3_2_1;
	}

	public void setAf_2_3_2_1(String af_2_3_2_1) {
		this.af_2_3_2_1 = af_2_3_2_1;
	}
	
	@Length(min=0, max=32, message="华法林治疗后是否测定INR值长度不能超过 32 个字符")
	public String getAf_2_4_1() {
		return af_2_4_1;
	}

	public void setAf_2_4_1(String af_2_4_1) {
		this.af_2_4_1 = af_2_4_1;
	}
	
	public Double getAf_2_4_2() {
		return af_2_4_2;
	}

	public void setAf_2_4_2(Double af_2_4_2) {
		this.af_2_4_2 = af_2_4_2;
	}
	
	@Length(min=0, max=32, message="是否接受抗心律失常药物治疗长度不能超过 32 个字符")
	public String getAf_3_1_1() {
		return af_3_1_1;
	}

	public void setAf_3_1_1(String af_3_1_1) {
		this.af_3_1_1 = af_3_1_1;
	}
	
	@Length(min=0, max=32, message="抗心律失常药物长度不能超过 32 个字符")
	public String getAf_3_1_2() {
		return af_3_1_2;
	}

	public void setAf_3_1_2(String af_3_1_2) {
		this.af_3_1_2 = af_3_1_2;
	}
	
	@Length(min=0, max=32, message="Ⅰa类药物选择长度不能超过 32 个字符")
	public String getAf_3_1_2_1() {
		return af_3_1_2_1;
	}

	public void setAf_3_1_2_1(String af_3_1_2_1) {
		this.af_3_1_2_1 = af_3_1_2_1;
	}
	
	@Length(min=0, max=32, message="Ⅰb类药物选择长度不能超过 32 个字符")
	public String getAf_3_1_2_2() {
		return af_3_1_2_2;
	}

	public void setAf_3_1_2_2(String af_3_1_2_2) {
		this.af_3_1_2_2 = af_3_1_2_2;
	}
	
	@Length(min=0, max=32, message="Ⅰc类药物选择长度不能超过 32 个字符")
	public String getAf_3_1_2_3() {
		return af_3_1_2_3;
	}

	public void setAf_3_1_2_3(String af_3_1_2_3) {
		this.af_3_1_2_3 = af_3_1_2_3;
	}
	
	@Length(min=0, max=32, message="Ⅱ类药物选择长度不能超过 32 个字符")
	public String getAf_3_1_2_4() {
		return af_3_1_2_4;
	}

	public void setAf_3_1_2_4(String af_3_1_2_4) {
		this.af_3_1_2_4 = af_3_1_2_4;
	}
	
	@Length(min=0, max=32, message="Ⅲ类药物选择长度不能超过 32 个字符")
	public String getAf_3_1_2_5() {
		return af_3_1_2_5;
	}

	public void setAf_3_1_2_5(String af_3_1_2_5) {
		this.af_3_1_2_5 = af_3_1_2_5;
	}
	
	@Length(min=0, max=32, message="Ⅳ类药物选择长度不能超过 32 个字符")
	public String getAf_3_1_2_6() {
		return af_3_1_2_6;
	}

	public void setAf_3_1_2_6(String af_3_1_2_6) {
		this.af_3_1_2_6 = af_3_1_2_6;
	}
	
	@Length(min=0, max=32, message="其他常用使用抗心律失常药物长度不能超过 32 个字符")
	public String getAf_3_1_3() {
		return af_3_1_3;
	}

	public void setAf_3_1_3(String af_3_1_3) {
		this.af_3_1_3 = af_3_1_3;
	}
	
	@Length(min=0, max=32, message="是否有ACEI/ARB用药长期医嘱长度不能超过 32 个字符")
	public String getAf_4_1_1_1() {
		return af_4_1_1_1;
	}

	public void setAf_4_1_1_1(String af_4_1_1_1) {
		this.af_4_1_1_1 = af_4_1_1_1;
	}
	
	@Length(min=0, max=32, message="长期医嘱药物的选择长度不能超过 32 个字符")
	public String getAf_4_1_1_2() {
		return af_4_1_1_2;
	}

	public void setAf_4_1_1_2(String af_4_1_1_2) {
		this.af_4_1_1_2 = af_4_1_1_2;
	}
	
	@Length(min=0, max=32, message="ACEI抑制剂药物的选择长度不能超过 32 个字符")
	public String getAf_4_1_1_3() {
		return af_4_1_1_3;
	}

	public void setAf_4_1_1_3(String af_4_1_1_3) {
		this.af_4_1_1_3 = af_4_1_1_3;
	}
	
	@Length(min=0, max=32, message="其他ACEI 药物名称长度不能超过 32 个字符")
	public String getAf_4_1_1_3_1() {
		return af_4_1_1_3_1;
	}

	public void setAf_4_1_1_3_1(String af_4_1_1_3_1) {
		this.af_4_1_1_3_1 = af_4_1_1_3_1;
	}
	
	@Length(min=0, max=32, message="使用ARB类药物的选择长度不能超过 32 个字符")
	public String getAf_4_1_1_4() {
		return af_4_1_1_4;
	}

	public void setAf_4_1_1_4(String af_4_1_1_4) {
		this.af_4_1_1_4 = af_4_1_1_4;
	}
	
	@Length(min=0, max=32, message="其他ARB 药物名称长度不能超过 32 个字符")
	public String getAf_4_1_1_4_1() {
		return af_4_1_1_4_1;
	}

	public void setAf_4_1_1_4_1(String af_4_1_1_4_1) {
		this.af_4_1_1_4_1 = af_4_1_1_4_1;
	}
	
	@Length(min=0, max=32, message="是否有β受体阻滞剂用药长期医嘱长度不能超过 32 个字符")
	public String getAf_4_1_2_1() {
		return af_4_1_2_1;
	}

	public void setAf_4_1_2_1(String af_4_1_2_1) {
		this.af_4_1_2_1 = af_4_1_2_1;
	}
	
	@Length(min=0, max=32, message="使用首剂β-受体阻滞剂药物的选择长度不能超过 32 个字符")
	public String getAf_4_1_2_2() {
		return af_4_1_2_2;
	}

	public void setAf_4_1_2_2(String af_4_1_2_2) {
		this.af_4_1_2_2 = af_4_1_2_2;
	}
	
	@Length(min=0, max=32, message="其他β-受体阻滞剂药物名称长度不能超过 32 个字符")
	public String getAf_4_1_2_2_1() {
		return af_4_1_2_2_1;
	}

	public void setAf_4_1_2_2_1(String af_4_1_2_2_1) {
		this.af_4_1_2_2_1 = af_4_1_2_2_1;
	}
	
	@Length(min=0, max=32, message="是否有固酮拮抗剂药物用药长期医嘱长度不能超过 32 个字符")
	public String getAf_4_1_3_1() {
		return af_4_1_3_1;
	}

	public void setAf_4_1_3_1(String af_4_1_3_1) {
		this.af_4_1_3_1 = af_4_1_3_1;
	}
	
	@Length(min=0, max=32, message="使用醛固酮受体拮抗剂的选择长度不能超过 32 个字符")
	public String getAf_4_1_3_2() {
		return af_4_1_3_2;
	}

	public void setAf_4_1_3_2(String af_4_1_3_2) {
		this.af_4_1_3_2 = af_4_1_3_2;
	}
	
	@Length(min=0, max=32, message="其他醛固酮受体拮抗剂类药物名称长度不能超过 32 个字符")
	public String getAf_4_1_3_2_1() {
		return af_4_1_3_2_1;
	}

	public void setAf_4_1_3_2_1(String af_4_1_3_2_1) {
		this.af_4_1_3_2_1 = af_4_1_3_2_1;
	}
	
	@Length(min=0, max=32, message="出院带药医嘱中有继续使用ACEI或ARB药物记录医嘱长度不能超过 32 个字符")
	public String getAf_4_2_1_1() {
		return af_4_2_1_1;
	}

	public void setAf_4_2_1_1(String af_4_2_1_1) {
		this.af_4_2_1_1 = af_4_2_1_1;
	}
	
	@Length(min=0, max=32, message="出院带药医嘱药物的选择长度不能超过 32 个字符")
	public String getAf_4_2_1_2() {
		return af_4_2_1_2;
	}

	public void setAf_4_2_1_2(String af_4_2_1_2) {
		this.af_4_2_1_2 = af_4_2_1_2;
	}
	
	@Length(min=0, max=32, message="ACEI抑制剂药物的选择长度不能超过 32 个字符")
	public String getAf_4_2_1_3() {
		return af_4_2_1_3;
	}

	public void setAf_4_2_1_3(String af_4_2_1_3) {
		this.af_4_2_1_3 = af_4_2_1_3;
	}
	
	@Length(min=0, max=32, message="其他ACEI 药物名称长度不能超过 32 个字符")
	public String getAf_4_2_1_3_1() {
		return af_4_2_1_3_1;
	}

	public void setAf_4_2_1_3_1(String af_4_2_1_3_1) {
		this.af_4_2_1_3_1 = af_4_2_1_3_1;
	}
	
	@Length(min=0, max=32, message="使用ARB类药物的选择长度不能超过 32 个字符")
	public String getAf_4_2_1_4() {
		return af_4_2_1_4;
	}

	public void setAf_4_2_1_4(String af_4_2_1_4) {
		this.af_4_2_1_4 = af_4_2_1_4;
	}
	
	@Length(min=0, max=32, message="其他ARB 药物名称长度不能超过 32 个字符")
	public String getAf_4_2_1_4_1() {
		return af_4_2_1_4_1;
	}

	public void setAf_4_2_1_4_1(String af_4_2_1_4_1) {
		this.af_4_2_1_4_1 = af_4_2_1_4_1;
	}
	
	@Length(min=0, max=32, message="出院带药医嘱中有继续使用β受体阻滞剂药物医嘱长度不能超过 32 个字符")
	public String getAf_4_2_2_1() {
		return af_4_2_2_1;
	}

	public void setAf_4_2_2_1(String af_4_2_2_1) {
		this.af_4_2_2_1 = af_4_2_2_1;
	}
	
	@Length(min=0, max=32, message="使用首剂β-受体阻滞剂药物的选择长度不能超过 32 个字符")
	public String getAf_4_2_2_2() {
		return af_4_2_2_2;
	}

	public void setAf_4_2_2_2(String af_4_2_2_2) {
		this.af_4_2_2_2 = af_4_2_2_2;
	}
	
	@Length(min=0, max=32, message="其他β-受体阻滞剂药物名称长度不能超过 32 个字符")
	public String getAf_4_2_2_2_1() {
		return af_4_2_2_2_1;
	}

	public void setAf_4_2_2_2_1(String af_4_2_2_2_1) {
		this.af_4_2_2_2_1 = af_4_2_2_2_1;
	}
	
	@Length(min=0, max=32, message="出院带药医嘱中有继续使用醛固酮拮抗剂药物医嘱长度不能超过 32 个字符")
	public String getAf_4_2_3_1() {
		return af_4_2_3_1;
	}

	public void setAf_4_2_3_1(String af_4_2_3_1) {
		this.af_4_2_3_1 = af_4_2_3_1;
	}
	
	@Length(min=0, max=32, message="使用醛固酮受体拮抗剂的选择长度不能超过 32 个字符")
	public String getAf_4_2_3_2() {
		return af_4_2_3_2;
	}

	public void setAf_4_2_3_2(String af_4_2_3_2) {
		this.af_4_2_3_2 = af_4_2_3_2;
	}
	
	@Length(min=0, max=32, message="其他醛固酮受体拮抗剂类药物名称长度不能超过 32 个字符")
	public String getAf_4_2_3_2_1() {
		return af_4_2_3_2_1;
	}

	public void setAf_4_2_3_2_1(String af_4_2_3_2_1) {
		this.af_4_2_3_2_1 = af_4_2_3_2_1;
	}
	
	@Length(min=0, max=32, message="是否进行房颤导管消融治疗长度不能超过 32 个字符")
	public String getAf_5_1_1() {
		return af_5_1_1;
	}

	public void setAf_5_1_1(String af_5_1_1) {
		this.af_5_1_1 = af_5_1_1;
	}
	
	@Length(min=0, max=32, message="适应证长度不能超过 32 个字符")
	public String getAf_5_1_2() {
		return af_5_1_2;
	}

	public void setAf_5_1_2(String af_5_1_2) {
		this.af_5_1_2 = af_5_1_2;
	}
	
	@Length(min=0, max=32, message="消融治疗入路长度不能超过 32 个字符")
	public String getAf_5_1_3_1() {
		return af_5_1_3_1;
	}

	public void setAf_5_1_3_1(String af_5_1_3_1) {
		this.af_5_1_3_1 = af_5_1_3_1;
	}
	
	@Length(min=0, max=32, message="消融治疗方法长度不能超过 32 个字符")
	public String getAf_5_1_3_2() {
		return af_5_1_3_2;
	}

	public void setAf_5_1_3_2(String af_5_1_3_2) {
		this.af_5_1_3_2 = af_5_1_3_2;
	}
	
	@Length(min=0, max=32, message="其他消融治疗方法长度不能超过 32 个字符")
	public String getAf_5_1_3_3() {
		return af_5_1_3_3;
	}

	public void setAf_5_1_3_3(String af_5_1_3_3) {
		this.af_5_1_3_3 = af_5_1_3_3;
	}
	
	@Length(min=0, max=32, message="房颤导管消融常用术式和终点长度不能超过 32 个字符")
	public String getAf_5_1_3() {
		return af_5_1_3;
	}

	public void setAf_5_1_3(String af_5_1_3) {
		this.af_5_1_3 = af_5_1_3;
	}
	
	@Length(min=0, max=32, message="其他消融术长度不能超过 32 个字符")
	public String getAf_5_1_3_4() {
		return af_5_1_3_4;
	}

	public void setAf_5_1_3_4(String af_5_1_3_4) {
		this.af_5_1_3_4 = af_5_1_3_4;
	}
	
	@Length(min=0, max=32, message="是否有治疗并发症长度不能超过 32 个字符")
	public String getAf_5_1_4_0() {
		return af_5_1_4_0;
	}

	public void setAf_5_1_4_0(String af_5_1_4_0) {
		this.af_5_1_4_0 = af_5_1_4_0;
	}
	
	@Length(min=0, max=32, message="治疗并发症长度不能超过 32 个字符")
	public String getAf_5_1_4() {
		return af_5_1_4;
	}

	public void setAf_5_1_4(String af_5_1_4) {
		this.af_5_1_4 = af_5_1_4;
	}
	
	@Length(min=0, max=32, message="其他治疗并发症长度不能超过 32 个字符")
	public String getAf_5_1_4_1() {
		return af_5_1_4_1;
	}

	public void setAf_5_1_4_1(String af_5_1_4_1) {
		this.af_5_1_4_1 = af_5_1_4_1;
	}
	
	@Length(min=0, max=32, message="影响程度的选择长度不能超过 32 个字符")
	public String getAf_5_1_5() {
		return af_5_1_5;
	}

	public void setAf_5_1_5(String af_5_1_5) {
		this.af_5_1_5 = af_5_1_5;
	}
	
	@Length(min=0, max=32, message="是否进行左心耳封堵治疗长度不能超过 32 个字符")
	public String getAf_5_2_1() {
		return af_5_2_1;
	}

	public void setAf_5_2_1(String af_5_2_1) {
		this.af_5_2_1 = af_5_2_1;
	}
	
	@Length(min=0, max=32, message="应用LAAC预防NVAF血栓事件的适合性评估情况长度不能超过 32 个字符")
	public String getAf_5_2_2() {
		return af_5_2_2;
	}

	public void setAf_5_2_2(String af_5_2_2) {
		this.af_5_2_2 = af_5_2_2;
	}
	
	@Length(min=0, max=32, message="其他应用LAAC预防NVAF血栓事件的适合性评估情长度不能超过 32 个字符")
	public String getAf_5_2_2_1() {
		return af_5_2_2_1;
	}

	public void setAf_5_2_2_1(String af_5_2_2_1) {
		this.af_5_2_2_1 = af_5_2_2_1;
	}
	
	@Length(min=0, max=32, message="是否LAAC术中使用TEE监测长度不能超过 32 个字符")
	public String getAf_5_3_1() {
		return af_5_3_1;
	}

	public void setAf_5_3_1(String af_5_3_1) {
		this.af_5_3_1 = af_5_3_1;
	}
	
	@Length(min=0, max=32, message="TEE在LAAC术中监测长度不能超过 32 个字符")
	public String getAf_5_2_4() {
		return af_5_2_4;
	}

	public void setAf_5_2_4(String af_5_2_4) {
		this.af_5_2_4 = af_5_2_4;
	}
	
	@Length(min=0, max=32, message="是否有治疗并发症长度不能超过 32 个字符")
	public String getAf_5_2_4_0() {
		return af_5_2_4_0;
	}

	public void setAf_5_2_4_0(String af_5_2_4_0) {
		this.af_5_2_4_0 = af_5_2_4_0;
	}
	
	@Length(min=0, max=32, message="治疗并发症长度不能超过 32 个字符")
	public String getAf_5_2_3() {
		return af_5_2_3;
	}

	public void setAf_5_2_3(String af_5_2_3) {
		this.af_5_2_3 = af_5_2_3;
	}
	
	@Length(min=0, max=32, message="其他治疗并发症长度不能超过 32 个字符")
	public String getAf_5_2_3_1() {
		return af_5_2_3_1;
	}

	public void setAf_5_2_3_1(String af_5_2_3_1) {
		this.af_5_2_3_1 = af_5_2_3_1;
	}
	
	@Length(min=0, max=32, message="影响程度的选择长度不能超过 32 个字符")
	public String getAf_5_2_5() {
		return af_5_2_5;
	}

	public void setAf_5_2_5(String af_5_2_5) {
		this.af_5_2_5 = af_5_2_5;
	}
	
	@Length(min=0, max=32, message="手术野皮肤准备常用方法的选择长度不能超过 32 个字符")
	public String getCm_3_1() {
		return cm_3_1;
	}

	public void setCm_3_1(String cm_3_1) {
		this.cm_3_1 = cm_3_1;
	}
	
	@Length(min=0, max=32, message="使用含抗菌剂长度不能超过 32 个字符")
	public String getCm_3_2() {
		return cm_3_2;
	}

	public void setCm_3_2(String cm_3_2) {
		this.cm_3_2 = cm_3_2;
	}
	
	@Length(min=0, max=32, message="其他含抗菌剂缝线填写长度不能超过 32 个字符")
	public String getCm_3_2_1() {
		return cm_3_2_1;
	}

	public void setCm_3_2_1(String cm_3_2_1) {
		this.cm_3_2_1 = cm_3_2_1;
	}
	
	@Length(min=0, max=32, message="手术切口类别的选择长度不能超过 32 个字符")
	public String getCm_3_3() {
		return cm_3_3;
	}

	public void setCm_3_3(String cm_3_3) {
		this.cm_3_3 = cm_3_3;
	}
	
	@Length(min=0, max=32, message="手术切口愈合情况的选择长度不能超过 32 个字符")
	public String getCm_3_4() {
		return cm_3_4;
	}

	public void setCm_3_4(String cm_3_4) {
		this.cm_3_4 = cm_3_4;
	}
	
	@Length(min=0, max=32, message="新型口服抗凝药长度不能超过 32 个字符")
	public String getAf_6_1_1() {
		return af_6_1_1;
	}

	public void setAf_6_1_1(String af_6_1_1) {
		this.af_6_1_1 = af_6_1_1;
	}
	
	@Length(min=0, max=32, message="其他非维生素K拮抗剂口服抗凝药物长度不能超过 32 个字符")
	public String getAf_6_1_1_1() {
		return af_6_1_1_1;
	}

	public void setAf_6_1_1_1(String af_6_1_1_1) {
		this.af_6_1_1_1 = af_6_1_1_1;
	}
	
	@Length(min=0, max=32, message="常見危险因素长度不能超过 32 个字符")
	public String getAf_7_1_1() {
		return af_7_1_1;
	}

	public void setAf_7_1_1(String af_7_1_1) {
		this.af_7_1_1 = af_7_1_1;
	}
	
	@Length(min=0, max=32, message="其他危险因素长度不能超过 32 个字符")
	public String getAf_7_1_1_1() {
		return af_7_1_1_1;
	}

	public void setAf_7_1_1_1(String af_7_1_1_1) {
		this.af_7_1_1_1 = af_7_1_1_1;
	}
	
	@Length(min=0, max=32, message="使用新型口服抗凝药长度不能超过 32 个字符")
	public String getAf_7_2_1() {
		return af_7_2_1;
	}

	public void setAf_7_2_1(String af_7_2_1) {
		this.af_7_2_1 = af_7_2_1;
	}
	
	@Length(min=0, max=32, message="使用抗心律失常药物治疗的健康教育长度不能超过 32 个字符")
	public String getAf_7_2_2() {
		return af_7_2_2;
	}

	public void setAf_7_2_2(String af_7_2_2) {
		this.af_7_2_2 = af_7_2_2;
	}
	
	@Length(min=0, max=32, message="房颤导管消融治疗长度不能超过 32 个字符")
	public String getAf_7_3_1() {
		return af_7_3_1;
	}

	public void setAf_7_3_1(String af_7_3_1) {
		this.af_7_3_1 = af_7_3_1;
	}
	
	@Length(min=0, max=32, message="左心耳封堵治疗的健康教育左心耳封堵治疗长度不能超过 32 个字符")
	public String getAf_7_3_2() {
		return af_7_3_2;
	}

	public void setAf_7_3_2(String af_7_3_2) {
		this.af_7_3_2 = af_7_3_2;
	}
	
	@Length(min=0, max=32, message="交与患者“出院小结”的副本告知患者出院时风险因素长度不能超过 32 个字符")
	public String getAf_7_4_1() {
		return af_7_4_1;
	}

	public void setAf_7_4_1(String af_7_4_1) {
		this.af_7_4_1 = af_7_4_1;
	}
	
	@Length(min=0, max=32, message="出院带药长度不能超过 32 个字符")
	public String getAf_7_4_2() {
		return af_7_4_2;
	}

	public void setAf_7_4_2(String af_7_4_2) {
		this.af_7_4_2 = af_7_4_2;
	}
	
	@Length(min=0, max=32, message="告知何为风险因素与紧急情况长度不能超过 32 个字符")
	public String getAf_7_4_3() {
		return af_7_4_3;
	}

	public void setAf_7_4_3(String af_7_4_3) {
		this.af_7_4_3 = af_7_4_3;
	}
	
	@Length(min=0, max=32, message="告知发生紧急情况时求援救治途径长度不能超过 32 个字符")
	public String getAf_7_4_4() {
		return af_7_4_4;
	}

	public void setAf_7_4_4(String af_7_4_4) {
		this.af_7_4_4 = af_7_4_4;
	}
	
	@Length(min=0, max=32, message="出院时教育与随访长度不能超过 32 个字符")
	public String getAf_7_4_5() {
		return af_7_4_5;
	}

	public void setAf_7_4_5(String af_7_4_5) {
		this.af_7_4_5 = af_7_4_5;
	}
	
	@Length(min=0, max=32, message="离院方式选择长度不能超过 32 个字符")
	public String getCm_4_3() {
		return cm_4_3;
	}

	public void setCm_4_3(String cm_4_3) {
		this.cm_4_3 = cm_4_3;
	}
	
	@Length(min=0, max=32, message="非医嘱离院可能涉及因素长度不能超过 32 个字符")
	public String getCm_4_5() {
		return cm_4_5;
	}

	public void setCm_4_5(String cm_4_5) {
		this.cm_4_5 = cm_4_5;
	}
	
	@Length(min=0, max=32, message="其他非医嘱离院因素填写长度不能超过 32 个字符")
	public String getCm_4_4_1() {
		return cm_4_4_1;
	}

	public void setCm_4_4_1(String cm_4_4_1) {
		this.cm_4_4_1 = cm_4_4_1;
	}
	
	@Length(min=0, max=32, message="死亡可能涉及因素长度不能超过 32 个字符")
	public String getCm_4_6() {
		return cm_4_6;
	}

	public void setCm_4_6(String cm_4_6) {
		this.cm_4_6 = cm_4_6;
	}
	
	@Length(min=0, max=32, message="患者是否对服务的体验与评价长度不能超过 32 个字符")
	public String getCm_5_1() {
		return cm_5_1;
	}

	public void setCm_5_1(String cm_5_1) {
		this.cm_5_1 = cm_5_1;
	}
	
	@Length(min=0, max=32, message="整体医院评级长度不能超过 32 个字符")
	public String getCm_5_2_1() {
		return cm_5_2_1;
	}

	public void setCm_5_2_1(String cm_5_2_1) {
		this.cm_5_2_1 = cm_5_2_1;
	}
	
	@Length(min=0, max=32, message="患者推荐长度不能超过 32 个字符")
	public String getCm_5_2_2() {
		return cm_5_2_2;
	}

	public void setCm_5_2_2(String cm_5_2_2) {
		this.cm_5_2_2 = cm_5_2_2;
	}
	
	@Length(min=0, max=32, message="病房、床单元和卫生间清洁度长度不能超过 32 个字符")
	public String getCm_5_2_3() {
		return cm_5_2_3;
	}

	public void setCm_5_2_3(String cm_5_2_3) {
		this.cm_5_2_3 = cm_5_2_3;
	}
	
	@Length(min=0, max=32, message="病房与周边噪音长度不能超过 32 个字符")
	public String getCm_5_2_5() {
		return cm_5_2_5;
	}

	public void setCm_5_2_5(String cm_5_2_5) {
		this.cm_5_2_5 = cm_5_2_5;
	}
	
	@Length(min=0, max=32, message="医生沟通长度不能超过 32 个字符")
	public String getCm_5_2_6() {
		return cm_5_2_6;
	}

	public void setCm_5_2_6(String cm_5_2_6) {
		this.cm_5_2_6 = cm_5_2_6;
	}
	
	@Length(min=0, max=32, message="护士沟通长度不能超过 32 个字符")
	public String getCm_5_2_7() {
		return cm_5_2_7;
	}

	public void setCm_5_2_7(String cm_5_2_7) {
		this.cm_5_2_7 = cm_5_2_7;
	}
	
	@Length(min=0, max=32, message="药师沟通长度不能超过 32 个字符")
	public String getCm_5_2_8() {
		return cm_5_2_8;
	}

	public void setCm_5_2_8(String cm_5_2_8) {
		this.cm_5_2_8 = cm_5_2_8;
	}
	
	@Length(min=0, max=32, message="康复计划长度不能超过 32 个字符")
	public String getCm_5_2_9() {
		return cm_5_2_9;
	}

	public void setCm_5_2_9(String cm_5_2_9) {
		this.cm_5_2_9 = cm_5_2_9;
	}
	
	@Length(min=0, max=32, message="出院时的知情告知长度不能超过 32 个字符")
	public String getCm_5_2_10() {
		return cm_5_2_10;
	}

	public void setCm_5_2_10(String cm_5_2_10) {
		this.cm_5_2_10 = cm_5_2_10;
	}
	
	@Length(min=0, max=32, message="膳食评价长度不能超过 32 个字符")
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