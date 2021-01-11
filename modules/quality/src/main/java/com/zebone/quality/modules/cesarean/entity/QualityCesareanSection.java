/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.cesarean.entity;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.jeesite.common.mybatis.annotation.JoinTable;
import com.jeesite.common.mybatis.annotation.JoinTable.Type;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.constraints.NotNull;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 剖宫产Entity
 * @author lijin
 * @version 2021-01-04
 */
@Table(name="quality_cesarean_section", alias="a", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="case_id", attrName="caseId", label="患者病案号"),
		@Column(name="cm0111", attrName="cm0111", label="质控医师"),
		@Column(name="cm0112", attrName="cm0112", label="质控护士"),
		@Column(name="cm0113", attrName="cm0113", label="主治医师"),
		@Column(name="cm0114", attrName="cm0114", label="责任护士"),
		@Column(name="cm0115", attrName="cm0115", label="上报科室"),
		@Column(name="cm0131", attrName="cm0131", label="出院诊断ICD-10四位亚目编码与名称"),
		@Column(name="cm0132", attrName="cm0132", label="出院诊断ICD-10六位临床扩展编码与名称"),
		@Column(name="cm0141", attrName="cm0141", label="主要手术操作 国家临床版ICD-9.CM-3编码与手术名称"),
		@Column(name="cm015", attrName="cm015", label="是否出院后31天内重复住院"),
		@Column(name="cm0211", attrName="cm0211", label="出生日期"),
		@Column(name="cm0213", attrName="cm0213", label="患者体重", comment="患者体重（kg）"),
		@Column(name="cm0215", attrName="cm0215", label="患者身高", comment="患者身高（cm）"),
		@Column(name="cm0216", attrName="cm0216", label="新生儿出生体重", comment="新生儿出生体重（克）"),
		@Column(name="cm0231", attrName="cm0231", label="到达本院急诊或者门诊日期时间是否确定"),
		@Column(name="cm0232", attrName="cm0232", label="到达本院急诊或者门诊日期时间"),
		@Column(name="cm0241", attrName="cm0241", label="入院日期时间"),
		@Column(name="cm0242", attrName="cm0242", label="出院日期时间"),
		@Column(name="cm0261", attrName="cm0261", label="手术开始", comment="手术开始（切皮）日期时间"),
		@Column(name="cm0262", attrName="cm0262", label="手术结束", comment="手术结束（缝皮结束）日期时间"),
		@Column(name="cm031", attrName="cm031", label="费用支付方式"),
		@Column(name="cm032", attrName="cm032", label="收入住院途径"),
		@Column(name="cm033", attrName="cm033", label="到院交通工具"),
		@Column(name="cm111", attrName="cm111", label="是否使用预防性抗菌药物"),
		@Column(name="cm1212", attrName="cm1212", label="预防性抗菌药物选择"),
		@Column(name="cm1221", attrName="cm1221", label="其他特殊使用级抗菌药物名称"),
		@Column(name="cm1222", attrName="cm1222", label="选择碳青霉烯类及替加环素等特殊使用级抗菌药物"),
		@Column(name="cm1311", attrName="cm1311", label="选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素填写"),
		@Column(name="cm1312", attrName="cm1312", label="选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素"),
		@Column(name="cm141", attrName="cm141", label="使用首剂抗菌药物起始时间"),
		@Column(name="cm151", attrName="cm151", label="手术时间是否≥3小时"),
		@Column(name="cm152", attrName="cm152", label="是否术中追加抗菌药物"),
		@Column(name="cm153", attrName="cm153", label="术中出血量是否≥1500ml"),
		@Column(name="cm154", attrName="cm154", label="是否术中追加抗菌药物"),
		@Column(name="cm161", attrName="cm161", label="术后抗菌药物停止使用时间"),
		@Column(name="cm162", attrName="cm162", label="使用抗菌药物时间使用时间分层"),
		@Column(name="cm1632", attrName="cm1632", label="术后48小时之后继续使用的原因"),
		@Column(name="cm31", attrName="cm31", label="手术野皮肤准备常用方法的选择"),
		@Column(name="cm32", attrName="cm32", label="使用含抗菌剂（三氯生）缝线", comment="使用含抗菌剂（三氯生）缝线"),
		@Column(name="cm321", attrName="cm321", label="其他含抗菌剂缝线填写"),
		@Column(name="cm33", attrName="cm33", label="手术切口类别的选择"),
		@Column(name="cm34", attrName="cm34", label="手术切口愈合情况的选择"),
		@Column(name="cm43", attrName="cm43", label="离院方式选择"),
		@Column(name="cm441", attrName="cm441", label="其他非医嘱离院因素填写"),
		@Column(name="cm45", attrName="cm45", label="非医嘱离院可能涉及因素"),
		@Column(name="cm46", attrName="cm46", label="死亡可能涉及因素"),
		@Column(name="cm51", attrName="cm51", label="患者是否对服务的体验与评价"),
		@Column(name="cm521", attrName="cm521", label="整体医院评级"),
		@Column(name="cm522", attrName="cm522", label="患者推荐"),
		@Column(name="cm523", attrName="cm523", label="病房、床单元和卫生间清洁度"),
		@Column(name="cm525", attrName="cm525", label="病房与周边噪音"),
		@Column(name="cm526", attrName="cm526", label="医生沟通"),
		@Column(name="cm527", attrName="cm527", label="护士沟通"),
		@Column(name="cm528", attrName="cm528", label="药师沟通"),
		@Column(name="cm529", attrName="cm529", label="康复计划"),
		@Column(name="cm61", attrName="cm61", label="住院总费用"),
		@Column(name="cm62", attrName="cm62", label="住院总费用其中自付金额"),
		@Column(name="cm63", attrName="cm63", label="一般医疗服务费"),
		@Column(name="cm64", attrName="cm64", label="一般治疗操作费"),
		@Column(name="cm65", attrName="cm65", label="护理费"),
		@Column(name="cm66", attrName="cm66", label="综合医疗服务类其他费用"),
		@Column(name="cm67", attrName="cm67", label="病理诊断费"),
		@Column(name="cm68", attrName="cm68", label="实验室诊断费"),
		@Column(name="cm69", attrName="cm69", label="影像学诊断费"),
		@Column(name="cm721", attrName="cm721", label="交与患者“出院小结”的副本告知患者出院时风险因素"),
		@Column(name="cm722", attrName="cm722", label="母乳喂养与出院带药"),
		@Column(name="cm723", attrName="cm723", label="告知出院关注事项"),
		@Column(name="cm724", attrName="cm724", label="出院时教育"),
		@Column(name="cm_5_2_10", attrName="cm521$0", label="出院时的知情告知"),
		@Column(name="cm725", attrName="cm725", label="告知随访"),
		@Column(name="cm_5_2_11", attrName="cm521$1", label="膳食评价"),
		@Column(name="cm_6_10", attrName="cm61$0", label="临床诊断项目费"),
		@Column(name="cm_6_11", attrName="cm61$1", label="非手术治疗项目费"),
		@Column(name="cm_6_12", attrName="cm61$2", label="其中：临床物理治疗费", comment="其中：临床物理治疗费"),
		@Column(name="cm_6_13", attrName="cm61$3", label="手术治疗费"),
		@Column(name="cm_6_14", attrName="cm61$4", label="其中：麻醉费", comment="其中：麻醉费"),
		@Column(name="cm_6_15", attrName="cm61$5", label="其中：手术费", comment="其中：手术费"),
		@Column(name="cm_6_16", attrName="cm61$6", label="康复费"),
		@Column(name="cm_6_17", attrName="cm61$7", label="中医治疗费"),
		@Column(name="cm_6_18", attrName="cm61$8", label="西药费"),
		@Column(name="cm_6_19", attrName="cm61$9", label="其中：抗菌药物费", comment="其中：抗菌药物费"),
		@Column(name="cm_6_20", attrName="cm62$0", label="中成药费"),
		@Column(name="cm_6_21", attrName="cm62$1", label="中草药费"),
		@Column(name="cm_6_22", attrName="cm62$2", label="血费"),
		@Column(name="cm_6_23", attrName="cm62$3", label="白蛋白类制品费"),
		@Column(name="cm_6_24", attrName="cm62$4", label="球蛋白类制品费"),
		@Column(name="cm_6_25", attrName="cm62$5", label="凝血因子类制品费"),
		@Column(name="cm_6_26", attrName="cm62$6", label="细胞因子类制品费"),
		@Column(name="cm_6_27", attrName="cm62$7", label="检查用一次性医用材料费"),
		@Column(name="cm_6_28", attrName="cm62$8", label="治疗用一次性医用材料费"),
		@Column(name="cm_6_29", attrName="cm62$9", label="手术用一次性医用材料费"),
		@Column(name="cm_6_30", attrName="cm63$0", label="其他费"),
		@Column(name="cs022", attrName="cs022", label="末次月经日期"),
		@Column(name="cs0221", attrName="cs0221", label="末次月经日期是否确定"),
		@Column(name="cs111", attrName="cs111", label="产次"),
		@Column(name="cs1111", attrName="cs1111", label="剖宮产史"),
		@Column(name="cs113", attrName="cs113", label="临产方式"),
		@Column(name="cs114", attrName="cs114", label="孕周"),
		@Column(name="cs115", attrName="cs115", label="胎位"),
		@Column(name="cs116", attrName="cs116", label="胎儿数量"),
		@Column(name="cs121", attrName="cs121", label="手术前风险评估的检查项目"),
		@Column(name="cs122", attrName="cs122", label="手术前知情告知"),
		@Column(name="cs124", attrName="cs124", label="麻醉方式"),
		@Column(name="cs125", attrName="cs125", label="特殊感染评估"),
		@Column(name="cs126", attrName="cs126", label="孕妇伴有特殊感染ICD.10编码及诊断名称"),
		@Column(name="cs211", attrName="cs211", label="符合医学指征"),
		@Column(name="cs2111", attrName="cs2111", label="剖宫产指征"),
		@Column(name="cs211a", attrName="cs211a", label="胎儿窘迫"),
		@Column(name="cs211b", attrName="cs211b", label="头盆不称"),
		@Column(name="cs211c", attrName="cs211c", label="瘢痕子宫"),
		@Column(name="cs211d", attrName="cs211d", label="胎位异常"),
		@Column(name="cs211e", attrName="cs211e", label="前置胎盘及前置血管"),
		@Column(name="cs211f", attrName="cs211f", label="双胎或多胎妊娠"),
		@Column(name="cs211g", attrName="cs211g", label="脐带脱垂"),
		@Column(name="cs211h", attrName="cs211h", label="胎盘早剥"),
		@Column(name="cs211i", attrName="cs211i", label="孕妇存在严重合并症和并发症"),
		@Column(name="cs211j", attrName="cs211j", label="妊娠巨大儿者"),
		@Column(name="cs211k", attrName="cs211k", label="产道畸形"),
		@Column(name="cs211l", attrName="cs211l", label="外阴疾病"),
		@Column(name="cs211m", attrName="cs211m", label="生殖道严重的感染性疾病"),
		@Column(name="cs211n", attrName="cs211n", label="妊娠合并肿瘤"),
		@Column(name="cs211o", attrName="cs211o", label="剖宫产+伴绝育手术"),
		@Column(name="cs211p", attrName="cs211p", label="其他病理状态"),
		@Column(name="cs211q", attrName="cs211q", label="高龄初产妇"),
		@Column(name="cs211r", attrName="cs211r", label="符合DRGs编码的 剖宫产,伴重要合并症与伴隨病"),
		@Column(name="cs221", attrName="cs221", label="孕妇要求剖宫产的评估"),
		@Column(name="cs231", attrName="cs231", label="手术方式选择"),
		@Column(name="cs242", attrName="cs242", label="胎儿娩出日期时间"),
		@Column(name="cs41", attrName="cs41", label="是否实施新生儿Apgar评分"),
		@Column(name="cs42", attrName="cs42", label="新生儿出生后1、5、10min,Apgar评分值"),
		@Column(name="cs431", attrName="cs431", label="出生后1min,Apgar评分值"),
		@Column(name="cs432", attrName="cs432", label="出生后5min,Apgar评分值"),
		@Column(name="cs433", attrName="cs433", label="出生后10min,Apgar评分值"),
		@Column(name="cs51", attrName="cs51", label="术后24小时内出血量"),
		@Column(name="cs511", attrName="cs511", label="术后24小时内实际出血量", comment="术后24小时内实际出血量（ml）"),
		@Column(name="cs521", attrName="cs521", label="剖宫产产后出血可能的原因"),
		@Column(name="cs53", attrName="cs53", label="术后24小时内输血量"),
		@Column(name="cs54", attrName="cs54", label="术后24小时内实际输血量", comment="术后24小时内实际输血量（ml）"),
		@Column(name="cs55", attrName="cs55", label="止血干预措施的选择"),
		@Column(name="cs611", attrName="cs611", label="是否有剖宫产并发症"),
		@Column(name="cs6121", attrName="cs6121", label="剖宫产并发症ICD.10编码"),
		@Column(name="cs6121a", attrName="cs6121a", label="产后出血"),
		@Column(name="cs6121b", attrName="cs6121b", label="产褥期感染"),
		@Column(name="cs6121c", attrName="cs6121c", label="产科栓塞"),
		@Column(name="cs6121d", attrName="cs6121d", label="栓塞病"),
		@Column(name="cs6121e", attrName="cs6121e", label="胎盘和胎膜滞留不伴有出血"),
		@Column(name="cs6121f", attrName="cs6121f", label="产科手术伤口的感染"),
		@Column(name="cs6121g", attrName="cs6121g", label="产科伤口裂开"),
		@Column(name="cs6121h", attrName="cs6121h", label="其他并发症"),
		@Column(name="cs62", attrName="cs62", label="是否再次手术"),
		@Column(name="cs63", attrName="cs63", label="再次手术原因"),
		@Column(name="cs631", attrName="cs631", label="其他再次手术原因"),
		@Column(name="cs64", attrName="cs64", label="影响程度的选择"),
		@Column(name="cs71", attrName="cs71", label="是否有新生儿产伤"),
		@Column(name="cs72", attrName="cs72", label="产程和分娩期间并发症所列的名称及ICD.10编码"),
		@Column(name="cs72a", attrName="cs72a", label="ICD-10", comment="ICD-10：P10产伤引起的颅内撕裂和出血"),
		@Column(name="cs72b", attrName="cs72b", label="ICD-10", comment="ICD-10：P11产伤致新生儿脑伤"),
		@Column(name="cs72c", attrName="cs72c", label="ICD-10", comment="ICD-10：P12头皮产伤"),
		@Column(name="cs72d", attrName="cs72d", label="ICD-10", comment="ICD-10：P13颅骨产伤"),
		@Column(name="cs72e", attrName="cs72e", label="ICD-10", comment="ICD-10：P14神经产伤"),
		@Column(name="cs72f", attrName="cs72f", label="ICD-10", comment="ICD-10：P15其他产伤"),
		@Column(name="cs72g", attrName="cs72g", label="ICD-10", comment="ICD-10：P20子宫内低氧症"),
		@Column(name="cs72h", attrName="cs72h", label="ICD-10", comment="ICD-10：P21出生窒息"),
		@Column(name="cs73", attrName="cs73", label="新生儿是否有先天性畸形、变形和染色体异常"),
		@Column(name="cs74", attrName="cs74", label="新生儿", comment="新生儿：先天性畸形、变形和染色体异常的名称及ICD.10编码"),
		@Column(name="cs811", attrName="cs811", label="母乳喂养禁忌症选择"),
		@Column(name="cs82", attrName="cs82", label="提供母乳喂养"),
		@Column(name="cs911", attrName="cs911", label="住院期间为产妇提供术前健康教育"),
		@Column(name="cs912", attrName="cs912", label="提供产后康复健康教育"),
		@Column(name="cs913", attrName="cs913", label="是否提供术后镇痛"),
		@Column(name="cs914", attrName="cs914", label="药物选择"),
		@Column(name="cs9141", attrName="cs9141", label="其他镇痛药物"),
		@Column(name="cs_12_1", attrName="cs1$21", label="体内乙肝病毒检测是否阳性孕妇"),
		@Column(name="cs_12_2", attrName="cs1$22", label="孕妇体内乙肝病毒含量风险评估"),
		@Column(name="cs_12_3", attrName="cs1$23", label="高风险孕妇孕期使用核苷类抗病毒药物"),
		@Column(name="cs_12_3_1", attrName="cs1$231", label="高风险孕妇孕期使用核苷类抗病毒药物"),
		@Column(name="cs_12_3_2", attrName="cs1$232", label="其他核苷类抗病毒药物"),
		@Column(name="cs_12_4", attrName="cs1$24", label="产时降低传播的措施"),
		@Column(name="cs_12_5", attrName="cs1$25", label="HBsAg阳性母亲的新生儿，出生后注射乙肝免疫球蛋白", comment="HBsAg阳性母亲的新生儿，出生后注射乙肝免疫球蛋白(HBIG)情况"),
		@Column(name="cs_1_2_31", attrName="cs123$1", label="麻醉前知情告知"),
}, orderBy="a.id DESC"
)
@Data

public class QualityCesareanSection extends DataEntity<QualityCesareanSection> {
	
	private static final long serialVersionUID = 1L;


	@SerializedName("caseid")
	private String caseId;		// 患者病案号
	@SerializedName("CM-0-1-1-1")
	private String cm0111;		// 质控医师
	@SerializedName("CM-0-1-1-2")
	private String cm0112;		// 质控护士
	@SerializedName("CM-0-1-1-3")
	private String cm0113;		// 主治医师
	@SerializedName("CM-0-1-1-4")
	private String cm0114;		// 责任护士
	@SerializedName("CM-0-1-1-5")
	private String cm0115;		// 上报科室
	@SerializedName("CM-0-1-3-1")
	private String cm0131;		// 出院诊断ICD-10四位亚目编码与名称
	@SerializedName("CM-0-1-3-2")
	private String cm0132;		// 出院诊断ICD-10六位临床扩展编码与名称
	@SerializedName("CM-0-1-4-1")
	private String cm0141;		// 主要手术操作 国家临床版ICD-9.CM-3编码与手术名称
	@SerializedName("CM-0-1-5")
	private String cm015;		// 是否出院后31天内重复住院

	@SerializedName("CM-0-2-1-1")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date cm0211;		// 出生日期
	@SerializedName("CM-0-2-1-3")
	private Double cm0213;		// 患者体重（kg）
	@SerializedName("CM-0-2-1-5")
	private Double cm0215;		// 患者身高（cm）
	@SerializedName("CM-0-2-1-6")
	private Double cm0216;		// 新生儿出生体重（克）
	@SerializedName("CM-0-2-3-1")
	private String cm0231;		// 到达本院急诊或者门诊日期时间是否确定

	@SerializedName("CM-0-2-3-2")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date cm0232;		// 到达本院急诊或者门诊日期时间

	@SerializedName("CM-0-2-4-1")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date cm0241;		// 入院日期时间

	@SerializedName("CM-0-2-4-2")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date cm0242;		// 出院日期时间

	@SerializedName("CM-0-2-6-1")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date cm0261;		// 手术开始（切皮）日期时间

	@SerializedName("CM-0-2-6-2")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date cm0262;		// 手术结束（缝皮结束）日期时间

	@SerializedName("CM-0-3-1")
	private String cm031;		// 费用支付方式
	@SerializedName("CM-0-3-2")
	private String cm032;		// 收入住院途径
	@SerializedName("CM-0-3-3")
	private String cm033;		// 到院交通工具
	@SerializedName("CM-1-1-1")
	private String cm111;		// 是否使用预防性抗菌药物
	@SerializedName("CM-1-2-1-2")
	private String cm1212;		// 预防性抗菌药物选择
	@SerializedName("CM-1-2-2-1")
	private String cm1221;		// 其他特殊使用级抗菌药物名称

	@SerializedName("CM-1-2-2-2")
	private String cm1222;		// 选择碳青霉烯类及替加环素等特殊使用级抗菌药物

	@SerializedName("CM-1-3-1-1")
	private String cm1311;		// 选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素填写

	@SerializedName("CM-1-3-1-2")
	private String cm1312;		// 选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素

	@SerializedName("CM-1-4-1")
	private String cm141;		// 使用首剂抗菌药物起始时间

	@SerializedName("CM-1-5-1")
	private String cm151;		// 手术时间是否≥3小时

	@SerializedName("CM-1-5-2")
	private String cm152;		// 是否术中追加抗菌药物

	@SerializedName("CM-1-5-3")
	private String cm153;		// 术中出血量是否≥1500ml

	@SerializedName("CM-1-5-4")
	private String cm154;		// 是否术中追加抗菌药物

	@SerializedName("CM-1-6-1")
	private String cm161;		// 术后抗菌药物停止使用时间

	@SerializedName("CM-1-6-2")
	private String cm162;		// 使用抗菌药物时间使用时间分层

	@SerializedName("CM-1-6-3-2")
	private String cm1632;		// 术后48小时之后继续使用的原因

	@SerializedName("CM-3-1")
	private String cm31;		// 手术野皮肤准备常用方法的选择

	@SerializedName("CM-3-2")
	private String cm32;		// 使用含抗菌剂（三氯生）缝线

	@SerializedName("CM-3-2-1")
	private String cm321;		// 其他含抗菌剂缝线填写

	@SerializedName("CM-3-3")
	private String cm33;		// 手术切口类别的选择

	@SerializedName("CM-3-4")
	private String cm34;		// 手术切口愈合情况的选择

	@SerializedName("CM-4-3")
	private String cm43;		// 离院方式选择

	@SerializedName("CM-4-4-1")
	private String cm441;		// 其他非医嘱离院因素填写

	@SerializedName("CM-4-5")
	private String cm45;		// 非医嘱离院可能涉及因素

	@SerializedName("CM-4-6")
	private String cm46;		// 死亡可能涉及因素

	@SerializedName("CM-5-1")
	private String cm51;		// 患者是否对服务的体验与评价

	@SerializedName("CM-5-2-1")
	private String cm521;		// 整体医院评级

	@SerializedName("CM-5-2-2")
	private String cm522;		// 患者推荐

	@SerializedName("CM-5-2-3")
	private String cm523;		// 病房、床单元和卫生间清洁度

	@SerializedName("CM-5-2-5")
	private String cm525;		// 病房与周边噪音

	@SerializedName("CM-5-2-6")
	private String cm526;		// 医生沟通

	@SerializedName("CM-5-2-7")
	private String cm527;		// 护士沟通

	@SerializedName("CM-5-2-8")
	private String cm528;		// 药师沟通

	@SerializedName("CM-5-2-9")
	private String cm529;		// 康复计划

	@SerializedName("CM-6-1")
	private Double cm61;		// 住院总费用

	@SerializedName("CM-6-2")
	private Double cm62;		// 住院总费用其中自付金额

	@SerializedName("CM-6-3")
	private Double cm63;		// 一般医疗服务费

	@SerializedName("CM-6-4")
	private Double cm64;		// 一般治疗操作费

	@SerializedName("CM-6-5")
	private Double cm65;		// 护理费

	@SerializedName("CM-6-6")
	private Double cm66;		// 综合医疗服务类其他费用

	@SerializedName("CM-6-7")
	private Double cm67;		// 病理诊断费

	@SerializedName("CM-6-8")
	private Double cm68;		// 实验室诊断费

	@SerializedName("CM-6-9")
	private Double cm69;		// 影像学诊断费

	@SerializedName("CM-7-2-1")
	private String cm721;		// 交与患者“出院小结”的副本告知患者出院时风险因素

	@SerializedName("CM-7-2-2")
	private String cm722;		// 母乳喂养与出院带药

	@SerializedName("CM-7-2-3")
	private String cm723;		// 告知 出院关注事项

	@SerializedName("CM-7-2-4")
	private String cm724;		// 出院时教育

	@SerializedName("CM-5-2-10")
	private String cm521$0;		// 出院时的知情告知

	@SerializedName("CM-7-2-5")
	private String cm725;		// 告知随访

	@SerializedName("CM-5-2-11")
	private String cm521$1;		// 膳食评价

	@SerializedName("CM-6-10")
	private Double cm61$0;		// 临床诊断项目费

	@SerializedName("CM-6-11")
	private Double cm61$1;		// 非手术治疗项目费

	@SerializedName("CM-6-12")
	private Double cm61$2;		// 其中：临床物理治疗费

	@SerializedName("CM-6-13")
	private Double cm61$3;		// 手术治疗费

	@SerializedName("CM-6-14")
	private Double cm61$4;		// 其中：麻醉费

	@SerializedName("CM-6-15")
	private Double cm61$5;		// 其中：手术费

	@SerializedName("CM-6-16")
	private Double cm61$6;		// 康复费

	@SerializedName("CM-6-17")
	private Double cm61$7;		// 中医治疗费

	@SerializedName("CM-6-18")
	private Double cm61$8;		// 西药费

	@SerializedName("CM-6-19")
	private Double cm61$9;		// 其中：抗菌药物费

	@SerializedName("CM-6-20")
	private Double cm62$0;		// 中成药费

	@SerializedName("CM-6-21")
	private Double cm62$1;		// 中草药费

	@SerializedName("CM-6-22")
	private Double cm62$2;		// 血费

	@SerializedName("CM-6-23")
	private Double cm62$3;		// 白蛋白类制品费

	@SerializedName("CM-6-24")
	private Double cm62$4;		// 球蛋白类制品费

	@SerializedName("CM-6-25")
	private Double cm62$5;		// 凝血因子类制品费

	@SerializedName("CM-6-26")
	private Double cm62$6;		// 细胞因子类制品费

	@SerializedName("CM-6-27")
	private Double cm62$7;		// 检查用一次性医用材料费

	@SerializedName("CM-6-28")
	private Double cm62$8;		// 治疗用一次性医用材料费

	@SerializedName("CM-6-29")
	private Double cm62$9;		// 手术用一次性医用材料费

	@SerializedName("CM-6-30")
	private Double cm63$0;		// 其他费

	@SerializedName("CS-2-22")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date cs022;		// 末次月经日期

	@SerializedName("CS-0-2-2-1")
	private String cs0221;		// 末次月经日期是否确定

	@SerializedName("CS-1-1-1")
	private String cs111;		// 产次

	@SerializedName("CS-1-1-1-1")
	private String cs1111;		// 剖宮产史

	@SerializedName("CS-1-1-3")
	private String cs113;		// 临产方式

	@SerializedName("CS-1-1-4")
	private String cs114;		// 孕周

	@SerializedName("CS-1-1-5")
	private String cs115;		// 胎位

	@SerializedName("CS-1-1-6")
	private String cs116;		// 胎儿数量

	@SerializedName("CS-1-2-1")
	private String cs121;		// 手术前风险评估的检查项目

	@SerializedName("CS-1-2-2")
	private String cs122;		// 手术前知情告知

	@SerializedName("CS-1-2-4")
	private String cs124;		// 麻醉方式

	@SerializedName("CS-1-2-5")
	private String cs125;		// 特殊感染评估

	@SerializedName("CS-1-2-6")
	private String cs126;		// 孕妇伴有特殊感染ICD.10编码及诊断名称

	@SerializedName("CS-2-1-1")
	private String cs211;		// 符合医学指征

	@SerializedName("CS-2-1-1-1")
	private String cs2111;		// 剖宫产指征

	@SerializedName("CS-2-1-1-a")
	private String cs211a;		// 胎儿窘迫

	@SerializedName("CS-2-1-1-b")
	private String cs211b;		// 头盆不称

	@SerializedName("CS-2-1-1-c")
	private String cs211c;		// 瘢痕子宫

	@SerializedName("CS-2-1-1-d")
	private String cs211d;		// 胎位异常

	@SerializedName("CS-2-1-1-e")
	private String cs211e;		// 前置胎盘及前置血管

	@SerializedName("CS-2-1-1-f")
	private String cs211f;		// 双胎或多胎妊娠

	@SerializedName("CS-2-1-1-g")
	private String cs211g;		// 脐带脱垂

	@SerializedName("CS-2-1-1-h")
	private String cs211h;		// 胎盘早剥

	@SerializedName("CS-2-1-1-i")
	private String cs211i;		// 孕妇存在严重合并症和并发症

	@SerializedName("CS-2-1-1-j")
	private String cs211j;		// 妊娠巨大儿者

	@SerializedName("CS-2-1-1-k")
	private String cs211k;		// 产道畸形

	@SerializedName("CS-2-1-1-l")
	private String cs211l;		// 外阴疾病

	@SerializedName("CS-2-1-1-m")
	private String cs211m;		// 生殖道严重的感染性疾病

	@SerializedName("CS-2-1-1-n")
	private String cs211n;		// 妊娠合并肿瘤

	@SerializedName("CS-2-1-1-o")
	private String cs211o;		// 剖宫产+伴绝育手术

	@SerializedName("CS-2-1-1-p")
	private String cs211p;		// 其他病理状态

	@SerializedName("CS-2-1-1-q")
	private String cs211q;		// 高龄初产妇

	@SerializedName("CS-2-1-1-r")
	private String cs211r;		// 符合DRGs编码的 剖宫产,伴重要合并症与伴隨病

	@SerializedName("CS-2-2-1")
	private String cs221;		// 孕妇要求剖宫产的评估

	@SerializedName("CS-2-3-1")
	private String cs231;		// 手术方式选择


	@SerializedName("CS-2-4-2")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date cs242;		// 胎儿娩出日期时间

	@SerializedName("CS-4-1")
	private String cs41;		// 是否实施新生儿Apgar评分

	@SerializedName("CS-4-2")
	private String cs42;		// 新生儿出生后1、5、10min,Apgar评分值

	@SerializedName("CS-4-3-1")
	private String cs431;		// 出生后1min,Apgar评分值

	@SerializedName("CS-4-3-2")
	private String cs432;		// 出生后5min,Apgar评分值

	@SerializedName("CS-4-3-3")
	private String cs433;		// 出生后10min,Apgar评分值

	@SerializedName("CS-5-1")
	private String cs51;		// 术后24小时内出血量

	@SerializedName("CS-5-1-1")
	private String cs511;		// 术后24小时内实际出血量（ml）

	@SerializedName("CS-5-2-1")
	private String cs521;		// 剖宫产产后出血可能的原因

	@SerializedName("CS-5-3")
	private String cs53;		// 术后24小时内输血量

	@SerializedName("CS-5-4")
	private String cs54;		// 术后24小时内实际输血量（ml）

	@SerializedName("CS-5-5")
	private String cs55;		// 止血干预措施的选择

	@SerializedName("CS-6-1-1")
	private String cs611;		// 是否有剖宫产并发症

	@SerializedName("CS-6-1-2-1")
	private String cs6121;		// 剖宫产并发症ICD.10编码

	@SerializedName("CS-6-1-2-1-a")
	private String cs6121a;		// 产后出血

	@SerializedName("CS-6-1-2-1-b")
	private String cs6121b;		// 产褥期感染

	@SerializedName("CS-6-1-2-1-c")
	private String cs6121c;		// 产科栓塞

	@SerializedName("CS-6-1-2-1-d")
	private String cs6121d;		// 栓塞病

	@SerializedName("CS-6-1-2-1-e")
	private String cs6121e;		// 胎盘和胎膜滞留不伴有出血

	@SerializedName("CS-6-1-2-1-f")
	private String cs6121f;		// 产科手术伤口的感染

	@SerializedName("CS-6-1-2-1-g")
	private String cs6121g;		// 产科伤口裂开

	@SerializedName("CS-6-1-2-1-h")
	private String cs6121h;		// 其他并发症

	@SerializedName("CS-6-2")
	private String cs62;		// 是否再次手术

	@SerializedName("CS-6-3")
	private String cs63;		// 再次手术原因

	@SerializedName("CS-6-3-1")
	private String cs631;		// 其他再次手术原因

	@SerializedName("CS-6-4")
	private String cs64;		// 影响程度的选择

	@SerializedName("CS-7-1")
	private String cs71;		// 是否有新生儿产伤

	@SerializedName("CS-7-2")
	private String cs72;		// 产程和分娩期间并发症所列的名称及ICD.10编码

	@SerializedName("CS-7-2-a")
	private String cs72a;		// ICD-10：P10产伤引起的颅内撕裂和出血

	@SerializedName("CS-7-2-b")
	private String cs72b;		// ICD-10：P11产伤致新生儿脑伤

	@SerializedName("CS-7-2-c")
	private String cs72c;		// ICD-10：P12头皮产伤

	@SerializedName("CS-7-2-d")
	private String cs72d;		// ICD-10：P13颅骨产伤

	@SerializedName("CS-7-2-e")
	private String cs72e;		// ICD-10：P14神经产伤

	@SerializedName("CS-7-2-f")
	private String cs72f;		// ICD-10：P15其他产伤

	@SerializedName("CS-7-2-g")
	private String cs72g;		// ICD-10：P20子宫内低氧症

	@SerializedName("CS-7-2-h")
	private String cs72h;		// ICD-10：P21出生窒息

	@SerializedName("CS-7-3")
	private String cs73;		// 新生儿是否有先天性畸形、变形和染色体异常

	@SerializedName("CS-7-4")
	private String cs74;		// 新生儿：先天性畸形、变形和染色体异常的名称及ICD.10编码

	@SerializedName("CS-8-1-1")
	private String cs811;		// 母乳喂养禁忌症选择

	@SerializedName("CS-8-2")
	private String cs82;		// 提供母乳喂养

	@SerializedName("CS-9-1-1")
	private String cs911;		// 住院期间为产妇提供术前健康教育

	@SerializedName("CS-9-1-2")
	private String cs912;		// 提供产后康复健康教育

	@SerializedName("CS-9-1-3")
	private String cs913;		// 是否提供术后镇痛

	@SerializedName("CS-9-1-4")
	private String cs914;		// 药物选择

	@SerializedName("CS-9-4-1")
	private String cs9141;		// 其他镇痛药物

	@SerializedName("CS-12-1")
	private String cs1$21;		// 体内乙肝病毒检测是否阳性孕妇

	@SerializedName("CS-12-2")
	private String cs1$22;		// 孕妇体内乙肝病毒含量风险评估

	@SerializedName("CS-12-3")
	private String cs1$23;		// 高风险孕妇孕期使用核苷类抗病毒药物

	@SerializedName("CS-12-3-1")
	private String cs1$231;		// 高风险孕妇孕期使用核苷类抗病毒药物

	@SerializedName("CS-12-3-2")
	private String cs1$232;		// 其他核苷类抗病毒药物

	@SerializedName("CS-12-4")
	private String cs1$24;		// 产时降低传播的措施

	@SerializedName("CS-12-5")
	private String cs1$25;		// HBsAg阳性母亲的新生儿，出生后注射乙肝免疫球蛋白(HBIG)情况

	@SerializedName("CS-12-31")
	private String cs123$1;		// 麻醉前知情告知

	public QualityCesareanSection() {
		this(null);
	}

	public QualityCesareanSection(String id){
		super(id);
	}

}