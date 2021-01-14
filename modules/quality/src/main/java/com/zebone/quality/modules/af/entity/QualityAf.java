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
 * @version 2021-01-14
 */
@Table(name="quality_af", alias="a", columns={
		@Column(name="cm_0_1_1_1", attrName="cm0111", label="质控医师"),
		@Column(name="cm_0_1_1_2", attrName="cm0112", label="质控护士"),
		@Column(name="cm_0_1_1_3", attrName="cm0113", label="主治医师"),
		@Column(name="cm_0_1_1_4", attrName="cm0114", label="责任护士"),
		@Column(name="cm_0_1_1_5", attrName="cm0115", label="上报科室"),
		@Column(name="case_id", attrName="caseId", label="患者病案号"),
		@Column(name="cm_0_1_3_1", attrName="cm0131", label="第一诊断或第二诊断ICD-10四位亚目编码与名称"),
		@Column(name="cm_0_1_3_2", attrName="cm0132", label="第一诊断或第二诊断ICD-10六位临床扩展编码与名称"),
		@Column(name="cm_0_1_4_1", attrName="cm0141", label="主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称"),
		@Column(name="cm_0_1_4_1_1", attrName="cm01411", label="其他ICD-9-CM-3四位亚目编码与名称"),
		@Column(name="cm_0_1_4_2", attrName="cm0142", label="主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称"),
		@Column(name="cm_0_1_4_2_1", attrName="cm01421", label="其他ICD-9-CM-3六位临床扩展编码与名称"),
		@Column(name="cm_0_1_5", attrName="cm015", label="是否出院后31天内重复住院"),
		@Column(name="cm_0_2_1_1", attrName="cm0211", label="出生日期"),
		@Column(name="cm_0_2_1_2", attrName="cm0212", label="患者性别"),
		@Column(name="cm_0_2_1_3", attrName="cm0213", label="患者体重", comment="患者体重（kg）"),
		@Column(name="cm_0_2_1_5", attrName="cm0215", label="患者身高", comment="患者身高（cm）"),
		@Column(name="cm_0_2_2_1", attrName="cm0221", label="发病日期时间是否无法确定或无记录"),
		@Column(name="cm_0_2_2_2", attrName="cm0222", label="发病日期时间"),
		@Column(name="cm_0_2_3_1", attrName="cm0231", label="到达本院急诊或者门诊日期时间是否无法确定或无记录"),
		@Column(name="cm_0_2_3_2", attrName="cm0232", label="到达本院急诊或者门诊日期时间"),
		@Column(name="cm_0_2_4_1", attrName="cm0241", label="入院日期时间"),
		@Column(name="cm_0_2_4_2", attrName="cm0242", label="出院日期时间"),
		@Column(name="cm_0_2_6_1", attrName="cm0261", label="手术开始", comment="手术开始（切皮）日期时间"),
		@Column(name="cm_0_2_6_2", attrName="cm0262", label="手术结束", comment="手术结束（缝皮结束）日期时间"),
		@Column(name="cm_0_3_1", attrName="cm031", label="费用支付方式"),
		@Column(name="cm_0_3_2", attrName="cm032", label="收入住院途径"),
		@Column(name="cm_0_3_3", attrName="cm033", label="到院交通工具"),
		@Column(name="af_1_1_0", attrName="af110", label="实施相关检查"),
		@Column(name="af_1_1_0_1", attrName="af1101", label="其他实施相关检查"),
		@Column(name="af_1_1_2", attrName="af112", label="症状严重程度", comment="症状严重程度（EHRA评分）评估"),
		@Column(name="af_1_1_3", attrName="af113", label="是否为血流动力学不稳定性房颤"),
		@Column(name="af_1_1_4", attrName="af114", label="血流动力学不稳定的临床表现"),
		@Column(name="af_1_2_1", attrName="af121", label="房颤患者脑卒中风险评估工具"),
		@Column(name="af_1_2_2", attrName="af122", label="使用CHADS₂评分工具的房颤患者脑卒中风险评估分值"),
		@Column(name="af_1_2_3", attrName="af123", label="CHADS₂评分风险评估分层"),
		@Column(name="af_1_2_4", attrName="af124", label="使用CHA₂DS₂-VASc评分工具的房颤患者脑卒中风险评估分值"),
		@Column(name="af_1_2_5", attrName="af125", label="房颤患者脑卒中风险评估分层"),
		@Column(name="af_1_3_1", attrName="af131", label="是否首次房颤患者 出血风险评估", comment="是否首次房颤患者 出血风险评估(HAS-BLED 评分)"),
		@Column(name="af_1_3_2", attrName="af132", label="首次房颤患者 出血风险评估分值"),
		@Column(name="af_1_3_4", attrName="af134", label="HAS-BLED评分≥3者视为高危患者"),
		@Column(name="af_2_1_1", attrName="af211", label="是否为CHA₂DS₂-VASc评分≥2的男性或≥3的女性房颤患者"),
		@Column(name="af_2_2_1", attrName="af221", label="肌酐清除率", comment="肌酐清除率(ml／min)"),
		@Column(name="af_2_3_1", attrName="af231", label="是否接受抗凝治疗"),
		@Column(name="af_2_3_2", attrName="af232", label="抗凝药选择"),
		@Column(name="af_2_3_2_1", attrName="af2321", label="其他非维生素K拮抗剂口服抗凝药物"),
		@Column(name="af_2_4_1", attrName="af241", label="华法林治疗后是否测定INR值"),
		@Column(name="af_2_4_2", attrName="af242", label="INR值"),
		@Column(name="af_3_1_1", attrName="af311", label="是否接受抗心律失常药物治疗"),
		@Column(name="af_3_1_2", attrName="af312", label="抗心律失常药物"),
		@Column(name="af_3_1_2_1", attrName="af3121", label="Ⅰa类药物选择"),
		@Column(name="af_3_1_2_2", attrName="af3122", label="Ⅰb类药物选择"),
		@Column(name="af_3_1_2_3", attrName="af3123", label="Ⅰc类药物选择"),
		@Column(name="af_3_1_2_4", attrName="af3124", label="Ⅱ类药物选择"),
		@Column(name="af_3_1_2_5", attrName="af3125", label="Ⅲ类药物选择"),
		@Column(name="af_3_1_2_6", attrName="af3126", label="Ⅳ类药物选择"),
		@Column(name="af_3_1_3", attrName="af313", label="其他常用使用抗心律失常药物"),
		@Column(name="af_4_1_1_1", attrName="af4111", label="是否有ACEI/ARB用药长期医嘱"),
		@Column(name="af_4_1_1_2", attrName="af4112", label="长期医嘱药物的选择", comment="长期医嘱药物的选择(ACEI/ARB)"),
		@Column(name="af_4_1_1_3", attrName="af4113", label="ACEI抑制剂药物的选择"),
		@Column(name="af_4_1_1_3_1", attrName="af41131", label="其他ACEI 药物名称"),
		@Column(name="af_4_1_1_4", attrName="af4114", label="使用ARB类药物的选择"),
		@Column(name="af_4_1_1_4_1", attrName="af41141", label="其他ARB 药物名称"),
		@Column(name="af_4_1_2_1", attrName="af4121", label="是否有β受体阻滞剂用药长期医嘱"),
		@Column(name="af_4_1_2_2", attrName="af4122", label="使用首剂β-受体阻滞剂药物的选择"),
		@Column(name="af_4_1_2_2_1", attrName="af41221", label="其他β-受体阻滞剂药物名称"),
		@Column(name="af_4_1_3_1", attrName="af4131", label="是否有固酮拮抗剂药物用药长期医嘱"),
		@Column(name="af_4_1_3_2", attrName="af4132", label="使用醛固酮受体拮抗剂的选择"),
		@Column(name="af_4_1_3_2_1", attrName="af41321", label="其他醛固酮受体拮抗剂类药物名称"),
		@Column(name="af_4_2_1_1", attrName="af4211", label="出院带药医嘱中有继续使用ACEI或ARB药物记录医嘱"),
		@Column(name="af_4_2_1_2", attrName="af4212", label="出院带药医嘱药物的选择", comment="出院带药医嘱药物的选择(ACEI/ARB)"),
		@Column(name="af_4_2_1_3", attrName="af4213", label="ACEI抑制剂药物的选择"),
		@Column(name="af_4_2_1_3_1", attrName="af42131", label="其他ACEI 药物名称"),
		@Column(name="af_4_2_1_4", attrName="af4214", label="使用ARB类药物的选择"),
		@Column(name="af_4_2_1_4_1", attrName="af42141", label="其他ARB 药物名称"),
		@Column(name="af_4_2_2_1", attrName="af4221", label="出院带药医嘱中有继续使用β受体阻滞剂药物医嘱"),
		@Column(name="af_4_2_2_2", attrName="af4222", label="使用首剂β-受体阻滞剂药物的选择"),
		@Column(name="af_4_2_2_2_1", attrName="af42221", label="其他β-受体阻滞剂药物名称"),
		@Column(name="af_4_2_3_1", attrName="af4231", label="出院带药医嘱中有继续使用醛固酮拮抗剂药物医嘱"),
		@Column(name="af_4_2_3_2", attrName="af4232", label="使用醛固酮受体拮抗剂的选择"),
		@Column(name="af_4_2_3_2_1", attrName="af42321", label="其他醛固酮受体拮抗剂类药物名称"),
		@Column(name="af_5_1_1", attrName="af511", label="是否进行房颤导管消融治疗"),
		@Column(name="af_5_1_2", attrName="af512", label="适应证"),
		@Column(name="af_5_1_3_1", attrName="af5131", label="消融治疗入路"),
		@Column(name="af_5_1_3_2", attrName="af5132", label="消融治疗方法"),
		@Column(name="af_5_1_3_3", attrName="af5133", label="其他消融治疗方法"),
		@Column(name="af_5_1_3", attrName="af513", label="房颤导管消融常用术式和终点"),
		@Column(name="af_5_1_3_4", attrName="af5134", label="其他消融术"),
		@Column(name="af_5_1_4_0", attrName="af5140", label="是否有治疗并发症"),
		@Column(name="af_5_1_4", attrName="af514", label="治疗并发症"),
		@Column(name="af_5_1_4_1", attrName="af5141", label="其他治疗并发症"),
		@Column(name="af_5_1_5", attrName="af515", label="影响程度的选择"),
		@Column(name="af_5_2_1", attrName="af521", label="是否进行左心耳封堵治疗"),
		@Column(name="af_5_2_2", attrName="af522", label="应用LAAC预防NVAF血栓事件的适合性评估情况"),
		@Column(name="af_5_2_2_1", attrName="af5221", label="其他应用LAAC预防NVAF血栓事件的适合性评估情"),
		@Column(name="af_5_3_1", attrName="af531", label="是否LAAC术中使用TEE监测"),
		@Column(name="af_5_2_4", attrName="af524", label="TEE在LAAC术中监测"),
		@Column(name="af_5_2_4_0", attrName="af5240", label="是否有治疗并发症"),
		@Column(name="af_5_2_3", attrName="af523", label="治疗并发症"),
		@Column(name="af_5_2_3_1", attrName="af5231", label="其他治疗并发症"),
		@Column(name="af_5_2_5", attrName="af525", label="影响程度的选择"),
		@Column(name="cm_3_1", attrName="cm31", label="手术野皮肤准备常用方法的选择"),
		@Column(name="cm_3_2", attrName="cm32", label="使用含抗菌剂", comment="使用含抗菌剂（三氯生）缝线"),
		@Column(name="cm_3_2_1", attrName="cm321", label="其他含抗菌剂缝线填写"),
		@Column(name="cm_3_3", attrName="cm33", label="手术切口类别的选择"),
		@Column(name="cm_3_4", attrName="cm34", label="手术切口愈合情况的选择"),
		@Column(name="af_6_1_1", attrName="af611", label="新型口服抗凝药", comment="新型口服抗凝药（NOAC）or华法林"),
		@Column(name="af_6_1_1_1", attrName="af6111", label="其他非维生素K拮抗剂口服抗凝药物"),
		@Column(name="af_7_1_1", attrName="af711", label="常見危险因素"),
		@Column(name="af_7_1_1_1", attrName="af7111", label="其他危险因素"),
		@Column(name="af_7_2_1", attrName="af721", label="使用新型口服抗凝药", comment="使用新型口服抗凝药（NOAC）or华法林药物治疗的健康教育"),
		@Column(name="af_7_2_2", attrName="af722", label="使用抗心律失常药物治疗的健康教育"),
		@Column(name="af_7_3_1", attrName="af731", label="房颤导管消融治疗", comment="房颤导管消融治疗（含冷冻球囊）的健康教育"),
		@Column(name="af_7_3_2", attrName="af732", label="左心耳封堵治疗的健康教育左心耳封堵治疗"),
		@Column(name="af_7_4_1", attrName="af741", label="交与患者“出院小结”的副本告知患者出院时风险因素"),
		@Column(name="af_7_4_2", attrName="af742", label="出院带药"),
		@Column(name="af_7_4_3", attrName="af743", label="告知何为风险因素与紧急情况"),
		@Column(name="af_7_4_4", attrName="af744", label="告知发生紧急情况时求援救治途径"),
		@Column(name="af_7_4_5", attrName="af745", label="出院时教育与随访"),
		@Column(name="cm_4_3", attrName="cm43", label="离院方式选择"),
		@Column(name="cm_4_5", attrName="cm45", label="非医嘱离院可能涉及因素"),
		@Column(name="cm_4_4_1", attrName="cm441", label="其他非医嘱离院因素填写"),
		@Column(name="cm_4_6", attrName="cm46", label="死亡可能涉及因素"),
		@Column(name="cm_5_1", attrName="cm51", label="患者是否对服务的体验与评价"),
		@Column(name="cm_5_2_1", attrName="cm521", label="整体医院评级"),
		@Column(name="cm_5_2_2", attrName="cm522", label="患者推荐"),
		@Column(name="cm_5_2_3", attrName="cm523", label="病房、床单元和卫生间清洁度"),
		@Column(name="cm_5_2_5", attrName="cm525", label="病房与周边噪音"),
		@Column(name="cm_5_2_6", attrName="cm526", label="医生沟通"),
		@Column(name="cm_5_2_7", attrName="cm527", label="护士沟通"),
		@Column(name="cm_5_2_8", attrName="cm528", label="药师沟通"),
		@Column(name="cm_5_2_9", attrName="cm529", label="康复计划"),
		@Column(name="cm_5_2_10", attrName="cm5210", label="出院时的知情告知"),
		@Column(name="cm_5_2_11", attrName="cm5211", label="膳食评价"),
		@Column(name="cm_6_1", attrName="cm61", label="住院总费用"),
		@Column(name="cm_6_2", attrName="cm62", label="住院总费用其中自付金额"),
		@Column(name="cm_6_3", attrName="cm63", label="一般医疗服务费"),
		@Column(name="cm_6_4", attrName="cm64", label="一般治疗操作费"),
		@Column(name="cm_6_5", attrName="cm65", label="护理费"),
		@Column(name="cm_6_6", attrName="cm66", label="综合医疗服务类其他费用"),
		@Column(name="cm_6_7", attrName="cm67", label="病理诊断费"),
		@Column(name="cm_6_8", attrName="cm68", label="实验室诊断费"),
		@Column(name="cm_6_9", attrName="cm69", label="影像学诊断费"),
		@Column(name="cm_6_10", attrName="cm610", label="临床诊断项目费"),
		@Column(name="cm_6_11", attrName="cm611", label="非手术治疗项目费"),
		@Column(name="cm_6_12", attrName="cm612", label="其中", comment="其中：临床物理治疗费"),
		@Column(name="cm_6_13", attrName="cm613", label="手术治疗费"),
		@Column(name="cm_6_14", attrName="cm614", label="其中", comment="其中：麻醉费"),
		@Column(name="cm_6_15", attrName="cm615", label="其中", comment="其中：手术费"),
		@Column(name="cm_6_16", attrName="cm616", label="康复费"),
		@Column(name="cm_6_17", attrName="cm617", label="中医治疗费"),
		@Column(name="cm_6_18", attrName="cm618", label="西药费"),
		@Column(name="cm_6_19", attrName="cm619", label="其中", comment="其中：抗菌药物费"),
		@Column(name="cm_6_20", attrName="cm620", label="中成药费"),
		@Column(name="cm_6_21", attrName="cm621", label="中草药费"),
		@Column(name="cm_6_22", attrName="cm622", label="血费"),
		@Column(name="cm_6_23", attrName="cm623", label="白蛋白类制品费"),
		@Column(name="cm_6_24", attrName="cm624", label="球蛋白类制品费"),
		@Column(name="cm_6_25", attrName="cm625", label="凝血因子类制品费"),
		@Column(name="cm_6_26", attrName="cm626", label="细胞因子类制品费"),
		@Column(name="cm_6_27", attrName="cm627", label="检查用一次性医用材料费"),
		@Column(name="cm_6_28", attrName="cm628", label="治疗用一次性医用材料费"),
		@Column(name="cm_6_29", attrName="cm629", label="手术用一次性医用材料费"),
		@Column(name="cm_6_30", attrName="cm630", label="其他费"),
		@Column(name="cm_0_2_5_1", attrName="cm0251", label="入住CCU日期时间"),
		@Column(name="cm_0_2_5_2", attrName="cm0252", label="离开CCU日期时间"),
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(includeEntity=DataEntity.class),
	}, orderBy="a.update_date DESC"
)
public class QualityAf extends DataEntity<QualityAf> {
	
	private static final long serialVersionUID = 1L;
	private String cm0111;		// 质控医师
	private String cm0112;		// 质控护士
	private String cm0113;		// 主治医师
	private String cm0114;		// 责任护士
	private String cm0115;		// 上报科室
	private String caseId;		// 患者病案号
	private String cm0131;		// 第一诊断或第二诊断ICD-10四位亚目编码与名称
	private String cm0132;		// 第一诊断或第二诊断ICD-10六位临床扩展编码与名称
	private String cm0141;		// 主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称
	private String cm01411;		// 其他ICD-9-CM-3四位亚目编码与名称
	private String cm0142;		// 主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称
	private String cm01421;		// 其他ICD-9-CM-3六位临床扩展编码与名称
	private String cm015;		// 是否出院后31天内重复住院
	private Date cm0211;		// 出生日期
	private String cm0212;		// 患者性别
	private Double cm0213;		// 患者体重（kg）
	private Double cm0215;		// 患者身高（cm）
	private String cm0221;		// 发病日期时间是否无法确定或无记录
	private Date cm0222;		// 发病日期时间
	private String cm0231;		// 到达本院急诊或者门诊日期时间是否无法确定或无记录
	private Date cm0232;		// 到达本院急诊或者门诊日期时间
	private Date cm0241;		// 入院日期时间
	private Date cm0242;		// 出院日期时间
	private Date cm0261;		// 手术开始（切皮）日期时间
	private Date cm0262;		// 手术结束（缝皮结束）日期时间
	private String cm031;		// 费用支付方式
	private String cm032;		// 收入住院途径
	private String cm033;		// 到院交通工具
	private String af110;		// 实施相关检查
	private String af1101;		// 其他实施相关检查
	private String af112;		// 症状严重程度（EHRA评分）评估
	private String af113;		// 是否为血流动力学不稳定性房颤
	private String af114;		// 血流动力学不稳定的临床表现
	private String af121;		// 房颤患者脑卒中风险评估工具
	private Long af122;		// 使用CHADS₂评分工具的房颤患者脑卒中风险评估分值
	private String af123;		// CHADS₂评分风险评估分层
	private Long af124;		// 使用CHA₂DS₂-VASc评分工具的房颤患者脑卒中风险评估分值
	private String af125;		// 房颤患者脑卒中风险评估分层
	private String af131;		// 是否首次房颤患者 出血风险评估(HAS-BLED 评分)
	private Long af132;		// 首次房颤患者 出血风险评估分值
	private String af134;		// HAS-BLED评分≥3者视为高危患者
	private String af211;		// 是否为CHA₂DS₂-VASc评分≥2的男性或≥3的女性房颤患者
	private String af221;		// 肌酐清除率(ml／min)
	private String af231;		// 是否接受抗凝治疗
	private String af232;		// 抗凝药选择
	private String af2321;		// 其他非维生素K拮抗剂口服抗凝药物
	private String af241;		// 华法林治疗后是否测定INR值
	private Double af242;		// INR值
	private String af311;		// 是否接受抗心律失常药物治疗
	private String af312;		// 抗心律失常药物
	private String af3121;		// Ⅰa类药物选择
	private String af3122;		// Ⅰb类药物选择
	private String af3123;		// Ⅰc类药物选择
	private String af3124;		// Ⅱ类药物选择
	private String af3125;		// Ⅲ类药物选择
	private String af3126;		// Ⅳ类药物选择
	private String af313;		// 其他常用使用抗心律失常药物
	private String af4111;		// 是否有ACEI/ARB用药长期医嘱
	private String af4112;		// 长期医嘱药物的选择(ACEI/ARB)
	private String af4113;		// ACEI抑制剂药物的选择
	private String af41131;		// 其他ACEI 药物名称
	private String af4114;		// 使用ARB类药物的选择
	private String af41141;		// 其他ARB 药物名称
	private String af4121;		// 是否有β受体阻滞剂用药长期医嘱
	private String af4122;		// 使用首剂β-受体阻滞剂药物的选择
	private String af41221;		// 其他β-受体阻滞剂药物名称
	private String af4131;		// 是否有固酮拮抗剂药物用药长期医嘱
	private String af4132;		// 使用醛固酮受体拮抗剂的选择
	private String af41321;		// 其他醛固酮受体拮抗剂类药物名称
	private String af4211;		// 出院带药医嘱中有继续使用ACEI或ARB药物记录医嘱
	private String af4212;		// 出院带药医嘱药物的选择(ACEI/ARB)
	private String af4213;		// ACEI抑制剂药物的选择
	private String af42131;		// 其他ACEI 药物名称
	private String af4214;		// 使用ARB类药物的选择
	private String af42141;		// 其他ARB 药物名称
	private String af4221;		// 出院带药医嘱中有继续使用β受体阻滞剂药物医嘱
	private String af4222;		// 使用首剂β-受体阻滞剂药物的选择
	private String af42221;		// 其他β-受体阻滞剂药物名称
	private String af4231;		// 出院带药医嘱中有继续使用醛固酮拮抗剂药物医嘱
	private String af4232;		// 使用醛固酮受体拮抗剂的选择
	private String af42321;		// 其他醛固酮受体拮抗剂类药物名称
	private String af511;		// 是否进行房颤导管消融治疗
	private String af512;		// 适应证
	private String af5131;		// 消融治疗入路
	private String af5132;		// 消融治疗方法
	private String af5133;		// 其他消融治疗方法
	private String af513;		// 房颤导管消融常用术式和终点
	private String af5134;		// 其他消融术
	private String af5140;		// 是否有治疗并发症
	private String af514;		// 治疗并发症
	private String af5141;		// 其他治疗并发症
	private String af515;		// 影响程度的选择
	private String af521;		// 是否进行左心耳封堵治疗
	private String af522;		// 应用LAAC预防NVAF血栓事件的适合性评估情况
	private String af5221;		// 其他应用LAAC预防NVAF血栓事件的适合性评估情
	private String af531;		// 是否LAAC术中使用TEE监测
	private String af524;		// TEE在LAAC术中监测
	private String af5240;		// 是否有治疗并发症
	private String af523;		// 治疗并发症
	private String af5231;		// 其他治疗并发症
	private String af525;		// 影响程度的选择
	private String cm31;		// 手术野皮肤准备常用方法的选择
	private String cm32;		// 使用含抗菌剂（三氯生）缝线
	private String cm321;		// 其他含抗菌剂缝线填写
	private String cm33;		// 手术切口类别的选择
	private String cm34;		// 手术切口愈合情况的选择
	private String af611;		// 新型口服抗凝药（NOAC）or华法林
	private String af6111;		// 其他非维生素K拮抗剂口服抗凝药物
	private String af711;		// 常見危险因素
	private String af7111;		// 其他危险因素
	private String af721;		// 使用新型口服抗凝药（NOAC）or华法林药物治疗的健康教育
	private String af722;		// 使用抗心律失常药物治疗的健康教育
	private String af731;		// 房颤导管消融治疗（含冷冻球囊）的健康教育
	private String af732;		// 左心耳封堵治疗的健康教育左心耳封堵治疗
	private String af741;		// 交与患者“出院小结”的副本告知患者出院时风险因素
	private String af742;		// 出院带药
	private String af743;		// 告知何为风险因素与紧急情况
	private String af744;		// 告知发生紧急情况时求援救治途径
	private String af745;		// 出院时教育与随访
	private String cm43;		// 离院方式选择
	private String cm45;		// 非医嘱离院可能涉及因素
	private String cm441;		// 其他非医嘱离院因素填写
	private String cm46;		// 死亡可能涉及因素
	private String cm51;		// 患者是否对服务的体验与评价
	private String cm521;		// 整体医院评级
	private String cm522;		// 患者推荐
	private String cm523;		// 病房、床单元和卫生间清洁度
	private String cm525;		// 病房与周边噪音
	private String cm526;		// 医生沟通
	private String cm527;		// 护士沟通
	private String cm528;		// 药师沟通
	private String cm529;		// 康复计划
	private String cm5210;		// 出院时的知情告知
	private String cm5211;		// 膳食评价
	private Double cm61;		// 住院总费用
	private Double cm62;		// 住院总费用其中自付金额
	private Double cm63;		// 一般医疗服务费
	private Double cm64;		// 一般治疗操作费
	private Double cm65;		// 护理费
	private Double cm66;		// 综合医疗服务类其他费用
	private Double cm67;		// 病理诊断费
	private Double cm68;		// 实验室诊断费
	private Double cm69;		// 影像学诊断费
	private Double cm610;		// 临床诊断项目费
	private Double cm611;		// 非手术治疗项目费
	private Double cm612;		// 其中：临床物理治疗费
	private Double cm613;		// 手术治疗费
	private Double cm614;		// 其中：麻醉费
	private Double cm615;		// 其中：手术费
	private Double cm616;		// 康复费
	private Double cm617;		// 中医治疗费
	private Double cm618;		// 西药费
	private Double cm619;		// 其中：抗菌药物费
	private Double cm620;		// 中成药费
	private Double cm621;		// 中草药费
	private Double cm622;		// 血费
	private Double cm623;		// 白蛋白类制品费
	private Double cm624;		// 球蛋白类制品费
	private Double cm625;		// 凝血因子类制品费
	private Double cm626;		// 细胞因子类制品费
	private Double cm627;		// 检查用一次性医用材料费
	private Double cm628;		// 治疗用一次性医用材料费
	private Double cm629;		// 手术用一次性医用材料费
	private Double cm630;		// 其他费
	private Date cm0251;		// 入住CCU日期时间
	private Date cm0252;		// 离开CCU日期时间
	
	public QualityAf() {
		this(null);
	}

	public QualityAf(String id){
		super(id);
	}
	
	@Length(min=0, max=32, message="质控医师长度不能超过 32 个字符")
	public String getCm0111() {
		return cm0111;
	}

	public void setCm0111(String cm0111) {
		this.cm0111 = cm0111;
	}
	
	@Length(min=0, max=32, message="质控护士长度不能超过 32 个字符")
	public String getCm0112() {
		return cm0112;
	}

	public void setCm0112(String cm0112) {
		this.cm0112 = cm0112;
	}
	
	@Length(min=0, max=32, message="主治医师长度不能超过 32 个字符")
	public String getCm0113() {
		return cm0113;
	}

	public void setCm0113(String cm0113) {
		this.cm0113 = cm0113;
	}
	
	@Length(min=0, max=32, message="责任护士长度不能超过 32 个字符")
	public String getCm0114() {
		return cm0114;
	}

	public void setCm0114(String cm0114) {
		this.cm0114 = cm0114;
	}
	
	@Length(min=0, max=32, message="上报科室长度不能超过 32 个字符")
	public String getCm0115() {
		return cm0115;
	}

	public void setCm0115(String cm0115) {
		this.cm0115 = cm0115;
	}
	
	@Length(min=0, max=32, message="患者病案号长度不能超过 32 个字符")
	public String getCaseId() {
		return caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}
	
	@Length(min=0, max=32, message="第一诊断或第二诊断ICD-10四位亚目编码与名称长度不能超过 32 个字符")
	public String getCm0131() {
		return cm0131;
	}

	public void setCm0131(String cm0131) {
		this.cm0131 = cm0131;
	}
	
	@Length(min=0, max=32, message="第一诊断或第二诊断ICD-10六位临床扩展编码与名称长度不能超过 32 个字符")
	public String getCm0132() {
		return cm0132;
	}

	public void setCm0132(String cm0132) {
		this.cm0132 = cm0132;
	}
	
	@Length(min=0, max=32, message="主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称长度不能超过 32 个字符")
	public String getCm0141() {
		return cm0141;
	}

	public void setCm0141(String cm0141) {
		this.cm0141 = cm0141;
	}
	
	@Length(min=0, max=32, message="其他ICD-9-CM-3四位亚目编码与名称长度不能超过 32 个字符")
	public String getCm01411() {
		return cm01411;
	}

	public void setCm01411(String cm01411) {
		this.cm01411 = cm01411;
	}
	
	@Length(min=0, max=32, message="主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称长度不能超过 32 个字符")
	public String getCm0142() {
		return cm0142;
	}

	public void setCm0142(String cm0142) {
		this.cm0142 = cm0142;
	}
	
	@Length(min=0, max=32, message="其他ICD-9-CM-3六位临床扩展编码与名称长度不能超过 32 个字符")
	public String getCm01421() {
		return cm01421;
	}

	public void setCm01421(String cm01421) {
		this.cm01421 = cm01421;
	}
	
	@Length(min=0, max=32, message="是否出院后31天内重复住院长度不能超过 32 个字符")
	public String getCm015() {
		return cm015;
	}

	public void setCm015(String cm015) {
		this.cm015 = cm015;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCm0211() {
		return cm0211;
	}

	public void setCm0211(Date cm0211) {
		this.cm0211 = cm0211;
	}
	
	@Length(min=0, max=32, message="患者性别长度不能超过 32 个字符")
	public String getCm0212() {
		return cm0212;
	}

	public void setCm0212(String cm0212) {
		this.cm0212 = cm0212;
	}
	
	public Double getCm0213() {
		return cm0213;
	}

	public void setCm0213(Double cm0213) {
		this.cm0213 = cm0213;
	}
	
	public Double getCm0215() {
		return cm0215;
	}

	public void setCm0215(Double cm0215) {
		this.cm0215 = cm0215;
	}
	
	@Length(min=0, max=32, message="发病日期时间是否无法确定或无记录长度不能超过 32 个字符")
	public String getCm0221() {
		return cm0221;
	}

	public void setCm0221(String cm0221) {
		this.cm0221 = cm0221;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCm0222() {
		return cm0222;
	}

	public void setCm0222(Date cm0222) {
		this.cm0222 = cm0222;
	}
	
	@Length(min=0, max=32, message="到达本院急诊或者门诊日期时间是否无法确定或无记录长度不能超过 32 个字符")
	public String getCm0231() {
		return cm0231;
	}

	public void setCm0231(String cm0231) {
		this.cm0231 = cm0231;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCm0232() {
		return cm0232;
	}

	public void setCm0232(Date cm0232) {
		this.cm0232 = cm0232;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCm0241() {
		return cm0241;
	}

	public void setCm0241(Date cm0241) {
		this.cm0241 = cm0241;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCm0242() {
		return cm0242;
	}

	public void setCm0242(Date cm0242) {
		this.cm0242 = cm0242;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCm0261() {
		return cm0261;
	}

	public void setCm0261(Date cm0261) {
		this.cm0261 = cm0261;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCm0262() {
		return cm0262;
	}

	public void setCm0262(Date cm0262) {
		this.cm0262 = cm0262;
	}
	
	@Length(min=0, max=32, message="费用支付方式长度不能超过 32 个字符")
	public String getCm031() {
		return cm031;
	}

	public void setCm031(String cm031) {
		this.cm031 = cm031;
	}
	
	@Length(min=0, max=32, message="收入住院途径长度不能超过 32 个字符")
	public String getCm032() {
		return cm032;
	}

	public void setCm032(String cm032) {
		this.cm032 = cm032;
	}
	
	@Length(min=0, max=32, message="到院交通工具长度不能超过 32 个字符")
	public String getCm033() {
		return cm033;
	}

	public void setCm033(String cm033) {
		this.cm033 = cm033;
	}
	
	@Length(min=0, max=32, message="实施相关检查长度不能超过 32 个字符")
	public String getAf110() {
		return af110;
	}

	public void setAf110(String af110) {
		this.af110 = af110;
	}
	
	@Length(min=0, max=32, message="其他实施相关检查长度不能超过 32 个字符")
	public String getAf1101() {
		return af1101;
	}

	public void setAf1101(String af1101) {
		this.af1101 = af1101;
	}
	
	@Length(min=0, max=32, message="症状严重程度长度不能超过 32 个字符")
	public String getAf112() {
		return af112;
	}

	public void setAf112(String af112) {
		this.af112 = af112;
	}
	
	@Length(min=0, max=32, message="是否为血流动力学不稳定性房颤长度不能超过 32 个字符")
	public String getAf113() {
		return af113;
	}

	public void setAf113(String af113) {
		this.af113 = af113;
	}
	
	@Length(min=0, max=32, message="血流动力学不稳定的临床表现长度不能超过 32 个字符")
	public String getAf114() {
		return af114;
	}

	public void setAf114(String af114) {
		this.af114 = af114;
	}
	
	@Length(min=0, max=32, message="房颤患者脑卒中风险评估工具长度不能超过 32 个字符")
	public String getAf121() {
		return af121;
	}

	public void setAf121(String af121) {
		this.af121 = af121;
	}
	
	public Long getAf122() {
		return af122;
	}

	public void setAf122(Long af122) {
		this.af122 = af122;
	}
	
	@Length(min=0, max=32, message="CHADS₂评分风险评估分层长度不能超过 32 个字符")
	public String getAf123() {
		return af123;
	}

	public void setAf123(String af123) {
		this.af123 = af123;
	}
	
	public Long getAf124() {
		return af124;
	}

	public void setAf124(Long af124) {
		this.af124 = af124;
	}
	
	@Length(min=0, max=32, message="房颤患者脑卒中风险评估分层长度不能超过 32 个字符")
	public String getAf125() {
		return af125;
	}

	public void setAf125(String af125) {
		this.af125 = af125;
	}
	
	@Length(min=0, max=32, message="是否首次房颤患者 出血风险评估长度不能超过 32 个字符")
	public String getAf131() {
		return af131;
	}

	public void setAf131(String af131) {
		this.af131 = af131;
	}
	
	public Long getAf132() {
		return af132;
	}

	public void setAf132(Long af132) {
		this.af132 = af132;
	}
	
	@Length(min=0, max=32, message="HAS-BLED评分≥3者视为高危患者长度不能超过 32 个字符")
	public String getAf134() {
		return af134;
	}

	public void setAf134(String af134) {
		this.af134 = af134;
	}
	
	@Length(min=0, max=32, message="是否为CHA₂DS₂-VASc评分≥2的男性或≥3的女性房颤患者长度不能超过 32 个字符")
	public String getAf211() {
		return af211;
	}

	public void setAf211(String af211) {
		this.af211 = af211;
	}
	
	@Length(min=0, max=32, message="肌酐清除率长度不能超过 32 个字符")
	public String getAf221() {
		return af221;
	}

	public void setAf221(String af221) {
		this.af221 = af221;
	}
	
	@Length(min=0, max=32, message="是否接受抗凝治疗长度不能超过 32 个字符")
	public String getAf231() {
		return af231;
	}

	public void setAf231(String af231) {
		this.af231 = af231;
	}
	
	@Length(min=0, max=32, message="抗凝药选择长度不能超过 32 个字符")
	public String getAf232() {
		return af232;
	}

	public void setAf232(String af232) {
		this.af232 = af232;
	}
	
	@Length(min=0, max=32, message="其他非维生素K拮抗剂口服抗凝药物长度不能超过 32 个字符")
	public String getAf2321() {
		return af2321;
	}

	public void setAf2321(String af2321) {
		this.af2321 = af2321;
	}
	
	@Length(min=0, max=32, message="华法林治疗后是否测定INR值长度不能超过 32 个字符")
	public String getAf241() {
		return af241;
	}

	public void setAf241(String af241) {
		this.af241 = af241;
	}
	
	public Double getAf242() {
		return af242;
	}

	public void setAf242(Double af242) {
		this.af242 = af242;
	}
	
	@Length(min=0, max=32, message="是否接受抗心律失常药物治疗长度不能超过 32 个字符")
	public String getAf311() {
		return af311;
	}

	public void setAf311(String af311) {
		this.af311 = af311;
	}
	
	@Length(min=0, max=32, message="抗心律失常药物长度不能超过 32 个字符")
	public String getAf312() {
		return af312;
	}

	public void setAf312(String af312) {
		this.af312 = af312;
	}
	
	@Length(min=0, max=32, message="Ⅰa类药物选择长度不能超过 32 个字符")
	public String getAf3121() {
		return af3121;
	}

	public void setAf3121(String af3121) {
		this.af3121 = af3121;
	}
	
	@Length(min=0, max=32, message="Ⅰb类药物选择长度不能超过 32 个字符")
	public String getAf3122() {
		return af3122;
	}

	public void setAf3122(String af3122) {
		this.af3122 = af3122;
	}
	
	@Length(min=0, max=32, message="Ⅰc类药物选择长度不能超过 32 个字符")
	public String getAf3123() {
		return af3123;
	}

	public void setAf3123(String af3123) {
		this.af3123 = af3123;
	}
	
	@Length(min=0, max=32, message="Ⅱ类药物选择长度不能超过 32 个字符")
	public String getAf3124() {
		return af3124;
	}

	public void setAf3124(String af3124) {
		this.af3124 = af3124;
	}
	
	@Length(min=0, max=32, message="Ⅲ类药物选择长度不能超过 32 个字符")
	public String getAf3125() {
		return af3125;
	}

	public void setAf3125(String af3125) {
		this.af3125 = af3125;
	}
	
	@Length(min=0, max=32, message="Ⅳ类药物选择长度不能超过 32 个字符")
	public String getAf3126() {
		return af3126;
	}

	public void setAf3126(String af3126) {
		this.af3126 = af3126;
	}
	
	@Length(min=0, max=32, message="其他常用使用抗心律失常药物长度不能超过 32 个字符")
	public String getAf313() {
		return af313;
	}

	public void setAf313(String af313) {
		this.af313 = af313;
	}
	
	@Length(min=0, max=32, message="是否有ACEI/ARB用药长期医嘱长度不能超过 32 个字符")
	public String getAf4111() {
		return af4111;
	}

	public void setAf4111(String af4111) {
		this.af4111 = af4111;
	}
	
	@Length(min=0, max=32, message="长期医嘱药物的选择长度不能超过 32 个字符")
	public String getAf4112() {
		return af4112;
	}

	public void setAf4112(String af4112) {
		this.af4112 = af4112;
	}
	
	@Length(min=0, max=32, message="ACEI抑制剂药物的选择长度不能超过 32 个字符")
	public String getAf4113() {
		return af4113;
	}

	public void setAf4113(String af4113) {
		this.af4113 = af4113;
	}
	
	@Length(min=0, max=32, message="其他ACEI 药物名称长度不能超过 32 个字符")
	public String getAf41131() {
		return af41131;
	}

	public void setAf41131(String af41131) {
		this.af41131 = af41131;
	}
	
	@Length(min=0, max=32, message="使用ARB类药物的选择长度不能超过 32 个字符")
	public String getAf4114() {
		return af4114;
	}

	public void setAf4114(String af4114) {
		this.af4114 = af4114;
	}
	
	@Length(min=0, max=32, message="其他ARB 药物名称长度不能超过 32 个字符")
	public String getAf41141() {
		return af41141;
	}

	public void setAf41141(String af41141) {
		this.af41141 = af41141;
	}
	
	@Length(min=0, max=32, message="是否有β受体阻滞剂用药长期医嘱长度不能超过 32 个字符")
	public String getAf4121() {
		return af4121;
	}

	public void setAf4121(String af4121) {
		this.af4121 = af4121;
	}
	
	@Length(min=0, max=32, message="使用首剂β-受体阻滞剂药物的选择长度不能超过 32 个字符")
	public String getAf4122() {
		return af4122;
	}

	public void setAf4122(String af4122) {
		this.af4122 = af4122;
	}
	
	@Length(min=0, max=32, message="其他β-受体阻滞剂药物名称长度不能超过 32 个字符")
	public String getAf41221() {
		return af41221;
	}

	public void setAf41221(String af41221) {
		this.af41221 = af41221;
	}
	
	@Length(min=0, max=32, message="是否有固酮拮抗剂药物用药长期医嘱长度不能超过 32 个字符")
	public String getAf4131() {
		return af4131;
	}

	public void setAf4131(String af4131) {
		this.af4131 = af4131;
	}
	
	@Length(min=0, max=32, message="使用醛固酮受体拮抗剂的选择长度不能超过 32 个字符")
	public String getAf4132() {
		return af4132;
	}

	public void setAf4132(String af4132) {
		this.af4132 = af4132;
	}
	
	@Length(min=0, max=32, message="其他醛固酮受体拮抗剂类药物名称长度不能超过 32 个字符")
	public String getAf41321() {
		return af41321;
	}

	public void setAf41321(String af41321) {
		this.af41321 = af41321;
	}
	
	@Length(min=0, max=32, message="出院带药医嘱中有继续使用ACEI或ARB药物记录医嘱长度不能超过 32 个字符")
	public String getAf4211() {
		return af4211;
	}

	public void setAf4211(String af4211) {
		this.af4211 = af4211;
	}
	
	@Length(min=0, max=32, message="出院带药医嘱药物的选择长度不能超过 32 个字符")
	public String getAf4212() {
		return af4212;
	}

	public void setAf4212(String af4212) {
		this.af4212 = af4212;
	}
	
	@Length(min=0, max=32, message="ACEI抑制剂药物的选择长度不能超过 32 个字符")
	public String getAf4213() {
		return af4213;
	}

	public void setAf4213(String af4213) {
		this.af4213 = af4213;
	}
	
	@Length(min=0, max=32, message="其他ACEI 药物名称长度不能超过 32 个字符")
	public String getAf42131() {
		return af42131;
	}

	public void setAf42131(String af42131) {
		this.af42131 = af42131;
	}
	
	@Length(min=0, max=32, message="使用ARB类药物的选择长度不能超过 32 个字符")
	public String getAf4214() {
		return af4214;
	}

	public void setAf4214(String af4214) {
		this.af4214 = af4214;
	}
	
	@Length(min=0, max=32, message="其他ARB 药物名称长度不能超过 32 个字符")
	public String getAf42141() {
		return af42141;
	}

	public void setAf42141(String af42141) {
		this.af42141 = af42141;
	}
	
	@Length(min=0, max=32, message="出院带药医嘱中有继续使用β受体阻滞剂药物医嘱长度不能超过 32 个字符")
	public String getAf4221() {
		return af4221;
	}

	public void setAf4221(String af4221) {
		this.af4221 = af4221;
	}
	
	@Length(min=0, max=32, message="使用首剂β-受体阻滞剂药物的选择长度不能超过 32 个字符")
	public String getAf4222() {
		return af4222;
	}

	public void setAf4222(String af4222) {
		this.af4222 = af4222;
	}
	
	@Length(min=0, max=32, message="其他β-受体阻滞剂药物名称长度不能超过 32 个字符")
	public String getAf42221() {
		return af42221;
	}

	public void setAf42221(String af42221) {
		this.af42221 = af42221;
	}
	
	@Length(min=0, max=32, message="出院带药医嘱中有继续使用醛固酮拮抗剂药物医嘱长度不能超过 32 个字符")
	public String getAf4231() {
		return af4231;
	}

	public void setAf4231(String af4231) {
		this.af4231 = af4231;
	}
	
	@Length(min=0, max=32, message="使用醛固酮受体拮抗剂的选择长度不能超过 32 个字符")
	public String getAf4232() {
		return af4232;
	}

	public void setAf4232(String af4232) {
		this.af4232 = af4232;
	}
	
	@Length(min=0, max=32, message="其他醛固酮受体拮抗剂类药物名称长度不能超过 32 个字符")
	public String getAf42321() {
		return af42321;
	}

	public void setAf42321(String af42321) {
		this.af42321 = af42321;
	}
	
	@Length(min=0, max=32, message="是否进行房颤导管消融治疗长度不能超过 32 个字符")
	public String getAf511() {
		return af511;
	}

	public void setAf511(String af511) {
		this.af511 = af511;
	}
	
	@Length(min=0, max=32, message="适应证长度不能超过 32 个字符")
	public String getAf512() {
		return af512;
	}

	public void setAf512(String af512) {
		this.af512 = af512;
	}
	
	@Length(min=0, max=32, message="消融治疗入路长度不能超过 32 个字符")
	public String getAf5131() {
		return af5131;
	}

	public void setAf5131(String af5131) {
		this.af5131 = af5131;
	}
	
	@Length(min=0, max=32, message="消融治疗方法长度不能超过 32 个字符")
	public String getAf5132() {
		return af5132;
	}

	public void setAf5132(String af5132) {
		this.af5132 = af5132;
	}
	
	@Length(min=0, max=32, message="其他消融治疗方法长度不能超过 32 个字符")
	public String getAf5133() {
		return af5133;
	}

	public void setAf5133(String af5133) {
		this.af5133 = af5133;
	}
	
	@Length(min=0, max=32, message="房颤导管消融常用术式和终点长度不能超过 32 个字符")
	public String getAf513() {
		return af513;
	}

	public void setAf513(String af513) {
		this.af513 = af513;
	}
	
	@Length(min=0, max=32, message="其他消融术长度不能超过 32 个字符")
	public String getAf5134() {
		return af5134;
	}

	public void setAf5134(String af5134) {
		this.af5134 = af5134;
	}
	
	@Length(min=0, max=32, message="是否有治疗并发症长度不能超过 32 个字符")
	public String getAf5140() {
		return af5140;
	}

	public void setAf5140(String af5140) {
		this.af5140 = af5140;
	}
	
	@Length(min=0, max=32, message="治疗并发症长度不能超过 32 个字符")
	public String getAf514() {
		return af514;
	}

	public void setAf514(String af514) {
		this.af514 = af514;
	}
	
	@Length(min=0, max=32, message="其他治疗并发症长度不能超过 32 个字符")
	public String getAf5141() {
		return af5141;
	}

	public void setAf5141(String af5141) {
		this.af5141 = af5141;
	}
	
	@Length(min=0, max=32, message="影响程度的选择长度不能超过 32 个字符")
	public String getAf515() {
		return af515;
	}

	public void setAf515(String af515) {
		this.af515 = af515;
	}
	
	@Length(min=0, max=32, message="是否进行左心耳封堵治疗长度不能超过 32 个字符")
	public String getAf521() {
		return af521;
	}

	public void setAf521(String af521) {
		this.af521 = af521;
	}
	
	@Length(min=0, max=32, message="应用LAAC预防NVAF血栓事件的适合性评估情况长度不能超过 32 个字符")
	public String getAf522() {
		return af522;
	}

	public void setAf522(String af522) {
		this.af522 = af522;
	}
	
	@Length(min=0, max=32, message="其他应用LAAC预防NVAF血栓事件的适合性评估情长度不能超过 32 个字符")
	public String getAf5221() {
		return af5221;
	}

	public void setAf5221(String af5221) {
		this.af5221 = af5221;
	}
	
	@Length(min=0, max=32, message="是否LAAC术中使用TEE监测长度不能超过 32 个字符")
	public String getAf531() {
		return af531;
	}

	public void setAf531(String af531) {
		this.af531 = af531;
	}
	
	@Length(min=0, max=32, message="TEE在LAAC术中监测长度不能超过 32 个字符")
	public String getAf524() {
		return af524;
	}

	public void setAf524(String af524) {
		this.af524 = af524;
	}
	
	@Length(min=0, max=32, message="是否有治疗并发症长度不能超过 32 个字符")
	public String getAf5240() {
		return af5240;
	}

	public void setAf5240(String af5240) {
		this.af5240 = af5240;
	}
	
	@Length(min=0, max=32, message="治疗并发症长度不能超过 32 个字符")
	public String getAf523() {
		return af523;
	}

	public void setAf523(String af523) {
		this.af523 = af523;
	}
	
	@Length(min=0, max=32, message="其他治疗并发症长度不能超过 32 个字符")
	public String getAf5231() {
		return af5231;
	}

	public void setAf5231(String af5231) {
		this.af5231 = af5231;
	}
	
	@Length(min=0, max=32, message="影响程度的选择长度不能超过 32 个字符")
	public String getAf525() {
		return af525;
	}

	public void setAf525(String af525) {
		this.af525 = af525;
	}
	
	@Length(min=0, max=32, message="手术野皮肤准备常用方法的选择长度不能超过 32 个字符")
	public String getCm31() {
		return cm31;
	}

	public void setCm31(String cm31) {
		this.cm31 = cm31;
	}
	
	@Length(min=0, max=32, message="使用含抗菌剂长度不能超过 32 个字符")
	public String getCm32() {
		return cm32;
	}

	public void setCm32(String cm32) {
		this.cm32 = cm32;
	}
	
	@Length(min=0, max=32, message="其他含抗菌剂缝线填写长度不能超过 32 个字符")
	public String getCm321() {
		return cm321;
	}

	public void setCm321(String cm321) {
		this.cm321 = cm321;
	}
	
	@Length(min=0, max=32, message="手术切口类别的选择长度不能超过 32 个字符")
	public String getCm33() {
		return cm33;
	}

	public void setCm33(String cm33) {
		this.cm33 = cm33;
	}
	
	@Length(min=0, max=32, message="手术切口愈合情况的选择长度不能超过 32 个字符")
	public String getCm34() {
		return cm34;
	}

	public void setCm34(String cm34) {
		this.cm34 = cm34;
	}
	
	@Length(min=0, max=32, message="新型口服抗凝药长度不能超过 32 个字符")
	public String getAf611() {
		return af611;
	}

	public void setAf611(String af611) {
		this.af611 = af611;
	}
	
	@Length(min=0, max=32, message="其他非维生素K拮抗剂口服抗凝药物长度不能超过 32 个字符")
	public String getAf6111() {
		return af6111;
	}

	public void setAf6111(String af6111) {
		this.af6111 = af6111;
	}
	
	@Length(min=0, max=32, message="常見危险因素长度不能超过 32 个字符")
	public String getAf711() {
		return af711;
	}

	public void setAf711(String af711) {
		this.af711 = af711;
	}
	
	@Length(min=0, max=32, message="其他危险因素长度不能超过 32 个字符")
	public String getAf7111() {
		return af7111;
	}

	public void setAf7111(String af7111) {
		this.af7111 = af7111;
	}
	
	@Length(min=0, max=32, message="使用新型口服抗凝药长度不能超过 32 个字符")
	public String getAf721() {
		return af721;
	}

	public void setAf721(String af721) {
		this.af721 = af721;
	}
	
	@Length(min=0, max=32, message="使用抗心律失常药物治疗的健康教育长度不能超过 32 个字符")
	public String getAf722() {
		return af722;
	}

	public void setAf722(String af722) {
		this.af722 = af722;
	}
	
	@Length(min=0, max=32, message="房颤导管消融治疗长度不能超过 32 个字符")
	public String getAf731() {
		return af731;
	}

	public void setAf731(String af731) {
		this.af731 = af731;
	}
	
	@Length(min=0, max=32, message="左心耳封堵治疗的健康教育左心耳封堵治疗长度不能超过 32 个字符")
	public String getAf732() {
		return af732;
	}

	public void setAf732(String af732) {
		this.af732 = af732;
	}
	
	@Length(min=0, max=32, message="交与患者“出院小结”的副本告知患者出院时风险因素长度不能超过 32 个字符")
	public String getAf741() {
		return af741;
	}

	public void setAf741(String af741) {
		this.af741 = af741;
	}
	
	@Length(min=0, max=32, message="出院带药长度不能超过 32 个字符")
	public String getAf742() {
		return af742;
	}

	public void setAf742(String af742) {
		this.af742 = af742;
	}
	
	@Length(min=0, max=32, message="告知何为风险因素与紧急情况长度不能超过 32 个字符")
	public String getAf743() {
		return af743;
	}

	public void setAf743(String af743) {
		this.af743 = af743;
	}
	
	@Length(min=0, max=32, message="告知发生紧急情况时求援救治途径长度不能超过 32 个字符")
	public String getAf744() {
		return af744;
	}

	public void setAf744(String af744) {
		this.af744 = af744;
	}
	
	@Length(min=0, max=32, message="出院时教育与随访长度不能超过 32 个字符")
	public String getAf745() {
		return af745;
	}

	public void setAf745(String af745) {
		this.af745 = af745;
	}
	
	@Length(min=0, max=32, message="离院方式选择长度不能超过 32 个字符")
	public String getCm43() {
		return cm43;
	}

	public void setCm43(String cm43) {
		this.cm43 = cm43;
	}
	
	@Length(min=0, max=32, message="非医嘱离院可能涉及因素长度不能超过 32 个字符")
	public String getCm45() {
		return cm45;
	}

	public void setCm45(String cm45) {
		this.cm45 = cm45;
	}
	
	@Length(min=0, max=32, message="其他非医嘱离院因素填写长度不能超过 32 个字符")
	public String getCm441() {
		return cm441;
	}

	public void setCm441(String cm441) {
		this.cm441 = cm441;
	}
	
	@Length(min=0, max=32, message="死亡可能涉及因素长度不能超过 32 个字符")
	public String getCm46() {
		return cm46;
	}

	public void setCm46(String cm46) {
		this.cm46 = cm46;
	}
	
	@Length(min=0, max=32, message="患者是否对服务的体验与评价长度不能超过 32 个字符")
	public String getCm51() {
		return cm51;
	}

	public void setCm51(String cm51) {
		this.cm51 = cm51;
	}
	
	@Length(min=0, max=32, message="整体医院评级长度不能超过 32 个字符")
	public String getCm521() {
		return cm521;
	}

	public void setCm521(String cm521) {
		this.cm521 = cm521;
	}
	
	@Length(min=0, max=32, message="患者推荐长度不能超过 32 个字符")
	public String getCm522() {
		return cm522;
	}

	public void setCm522(String cm522) {
		this.cm522 = cm522;
	}
	
	@Length(min=0, max=32, message="病房、床单元和卫生间清洁度长度不能超过 32 个字符")
	public String getCm523() {
		return cm523;
	}

	public void setCm523(String cm523) {
		this.cm523 = cm523;
	}
	
	@Length(min=0, max=32, message="病房与周边噪音长度不能超过 32 个字符")
	public String getCm525() {
		return cm525;
	}

	public void setCm525(String cm525) {
		this.cm525 = cm525;
	}
	
	@Length(min=0, max=32, message="医生沟通长度不能超过 32 个字符")
	public String getCm526() {
		return cm526;
	}

	public void setCm526(String cm526) {
		this.cm526 = cm526;
	}
	
	@Length(min=0, max=32, message="护士沟通长度不能超过 32 个字符")
	public String getCm527() {
		return cm527;
	}

	public void setCm527(String cm527) {
		this.cm527 = cm527;
	}
	
	@Length(min=0, max=32, message="药师沟通长度不能超过 32 个字符")
	public String getCm528() {
		return cm528;
	}

	public void setCm528(String cm528) {
		this.cm528 = cm528;
	}
	
	@Length(min=0, max=32, message="康复计划长度不能超过 32 个字符")
	public String getCm529() {
		return cm529;
	}

	public void setCm529(String cm529) {
		this.cm529 = cm529;
	}
	
	@Length(min=0, max=32, message="出院时的知情告知长度不能超过 32 个字符")
	public String getCm5210() {
		return cm5210;
	}

	public void setCm5210(String cm5210) {
		this.cm5210 = cm5210;
	}
	
	@Length(min=0, max=32, message="膳食评价长度不能超过 32 个字符")
	public String getCm5211() {
		return cm5211;
	}

	public void setCm5211(String cm5211) {
		this.cm5211 = cm5211;
	}
	
	public Double getCm61() {
		return cm61;
	}

	public void setCm61(Double cm61) {
		this.cm61 = cm61;
	}
	
	public Double getCm62() {
		return cm62;
	}

	public void setCm62(Double cm62) {
		this.cm62 = cm62;
	}
	
	public Double getCm63() {
		return cm63;
	}

	public void setCm63(Double cm63) {
		this.cm63 = cm63;
	}
	
	public Double getCm64() {
		return cm64;
	}

	public void setCm64(Double cm64) {
		this.cm64 = cm64;
	}
	
	public Double getCm65() {
		return cm65;
	}

	public void setCm65(Double cm65) {
		this.cm65 = cm65;
	}
	
	public Double getCm66() {
		return cm66;
	}

	public void setCm66(Double cm66) {
		this.cm66 = cm66;
	}
	
	public Double getCm67() {
		return cm67;
	}

	public void setCm67(Double cm67) {
		this.cm67 = cm67;
	}
	
	public Double getCm68() {
		return cm68;
	}

	public void setCm68(Double cm68) {
		this.cm68 = cm68;
	}
	
	public Double getCm69() {
		return cm69;
	}

	public void setCm69(Double cm69) {
		this.cm69 = cm69;
	}
	
	public Double getCm610() {
		return cm610;
	}

	public void setCm610(Double cm610) {
		this.cm610 = cm610;
	}
	
	public Double getCm611() {
		return cm611;
	}

	public void setCm611(Double cm611) {
		this.cm611 = cm611;
	}
	
	public Double getCm612() {
		return cm612;
	}

	public void setCm612(Double cm612) {
		this.cm612 = cm612;
	}
	
	public Double getCm613() {
		return cm613;
	}

	public void setCm613(Double cm613) {
		this.cm613 = cm613;
	}
	
	public Double getCm614() {
		return cm614;
	}

	public void setCm614(Double cm614) {
		this.cm614 = cm614;
	}
	
	public Double getCm615() {
		return cm615;
	}

	public void setCm615(Double cm615) {
		this.cm615 = cm615;
	}
	
	public Double getCm616() {
		return cm616;
	}

	public void setCm616(Double cm616) {
		this.cm616 = cm616;
	}
	
	public Double getCm617() {
		return cm617;
	}

	public void setCm617(Double cm617) {
		this.cm617 = cm617;
	}
	
	public Double getCm618() {
		return cm618;
	}

	public void setCm618(Double cm618) {
		this.cm618 = cm618;
	}
	
	public Double getCm619() {
		return cm619;
	}

	public void setCm619(Double cm619) {
		this.cm619 = cm619;
	}
	
	public Double getCm620() {
		return cm620;
	}

	public void setCm620(Double cm620) {
		this.cm620 = cm620;
	}
	
	public Double getCm621() {
		return cm621;
	}

	public void setCm621(Double cm621) {
		this.cm621 = cm621;
	}
	
	public Double getCm622() {
		return cm622;
	}

	public void setCm622(Double cm622) {
		this.cm622 = cm622;
	}
	
	public Double getCm623() {
		return cm623;
	}

	public void setCm623(Double cm623) {
		this.cm623 = cm623;
	}
	
	public Double getCm624() {
		return cm624;
	}

	public void setCm624(Double cm624) {
		this.cm624 = cm624;
	}
	
	public Double getCm625() {
		return cm625;
	}

	public void setCm625(Double cm625) {
		this.cm625 = cm625;
	}
	
	public Double getCm626() {
		return cm626;
	}

	public void setCm626(Double cm626) {
		this.cm626 = cm626;
	}
	
	public Double getCm627() {
		return cm627;
	}

	public void setCm627(Double cm627) {
		this.cm627 = cm627;
	}
	
	public Double getCm628() {
		return cm628;
	}

	public void setCm628(Double cm628) {
		this.cm628 = cm628;
	}
	
	public Double getCm629() {
		return cm629;
	}

	public void setCm629(Double cm629) {
		this.cm629 = cm629;
	}
	
	public Double getCm630() {
		return cm630;
	}

	public void setCm630(Double cm630) {
		this.cm630 = cm630;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCm0251() {
		return cm0251;
	}

	public void setCm0251(Date cm0251) {
		this.cm0251 = cm0251;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCm0252() {
		return cm0252;
	}

	public void setCm0252(Date cm0252) {
		this.cm0252 = cm0252;
	}
	
}