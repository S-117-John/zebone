/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.cs.entity;

import lombok.Data;
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
 * cs剖宫产Entity
 * @author 卡卡西
 * @version 2021-02-05
 */
@Table(name="quality_cs", alias="a", columns={
		@Column(name="cm_0_1_1_1", attrName="cm_0_1_1_1", label="质控医师"),
		@Column(name="cm_0_1_1_2", attrName="cm_0_1_1_2", label="质控护士"),
		@Column(name="cm_0_1_1_3", attrName="cm_0_1_1_3", label="主治医师"),
		@Column(name="cm_0_1_1_4", attrName="cm_0_1_1_4", label="责任护士"),
		@Column(name="cm_0_1_1_5", attrName="cm_0_1_1_5", label="上报科室"),
		@Column(name="caseid", attrName="caseid", label="患者病案号"),
		@Column(name="idcard", attrName="idcard", label="患者身份证号"),
		@Column(name="cm_0_1_3_1", attrName="cm_0_1_3_1", label="出院诊断ICD-10四位亚目编码与名称"),
		@Column(name="cm_0_1_3_2", attrName="cm_0_1_3_2", label="出院诊断ICD-10六位临床扩展编码与名称"),
		@Column(name="cm_0_1_4_1", attrName="cm_0_1_4_1", label="主要手术操作 国家临床版ICD-9.CM-3编码与手术名称"),
		@Column(name="cm_0_1_5", attrName="cm_0_1_5", label="是否出院后31天内重复住院"),
		@Column(name="cm_0_2_1_1", attrName="cm_0_2_1_1", label="出生日期"),
		@Column(name="cm_0_2_1_3", attrName="cm_0_2_1_3", label="患者体重", comment="患者体重（kg）"),
		@Column(name="cm_0_2_1_5", attrName="cm_0_2_1_5", label="患者身高", comment="患者身高（cm）"),
		@Column(name="cm_0_2_1_6", attrName="cm_0_2_1_6", label="新生儿出生体重", comment="新生儿出生体重（克）"),
		@Column(name="cs_0_2_2_1", attrName="cs_0_2_2_1", label="末次月经日期是否确定"),
		@Column(name="cs_0_2_2", attrName="cs_0_2_2", label="末次月经日期"),
		@Column(name="cm_0_2_3_1", attrName="cm_0_2_3_1", label="到达本院急诊或者门诊日期时间是否确定"),
		@Column(name="cm_0_2_3_2", attrName="cm_0_2_3_2", label="到达本院急诊或者门诊日期时间"),
		@Column(name="cm_0_2_4_1", attrName="cm_0_2_4_1", label="入院日期时间"),
		@Column(name="cm_0_2_4_2", attrName="cm_0_2_4_2", label="出院日期时间"),
		@Column(name="cm_0_2_6_1", attrName="cm_0_2_6_1", label="手术开始", comment="手术开始（切皮）日期时间"),
		@Column(name="cm_0_2_6_2", attrName="cm_0_2_6_2", label="手术结束", comment="手术结束（缝皮结束）日期时间"),
		@Column(name="cm_0_3_1", attrName="cm_0_3_1", label="费用支付方式"),
		@Column(name="cm_0_3_2", attrName="cm_0_3_2", label="收入住院途径"),
		@Column(name="cm_0_3_3", attrName="cm_0_3_3", label="到院交通工具"),
		@Column(name="cs_1_1_1", attrName="cs_1_1_1", label="产次"),
		@Column(name="cs_1_1_1_1", attrName="cs_1_1_1_1", label="剖宮产史"),
		@Column(name="cs_1_1_3", attrName="cs_1_1_3", label="临产方式"),
		@Column(name="cs_1_1_4", attrName="cs_1_1_4", label="孕周"),
		@Column(name="cs_1_1_5", attrName="cs_1_1_5", label="胎位"),
		@Column(name="cs_1_1_6", attrName="cs_1_1_6", label="胎儿数量"),
		@Column(name="cs_1_2_1", attrName="cs_1_2_1", label="手术前风险评估的检查项目"),
		@Column(name="cs_1_2_2", attrName="cs_1_2_2", label="手术前知情告知"),
		@Column(name="cs_1_2_31", attrName="cs_1_2_31", label="麻醉前知情告知"),
		@Column(name="cs_1_2_4", attrName="cs_1_2_4", label="麻醉方式"),
		@Column(name="cs_1_2_5", attrName="cs_1_2_5", label="特殊感染评估"),
		@Column(name="cs_1_2_6", attrName="cs_1_2_6", label="孕妇伴有特殊感染ICD.10编码及诊断名称"),
		@Column(name="cs_2_1_1_1", attrName="cs_2_1_1_1", label="剖宫产指征"),
		@Column(name="cs_2_5_1", attrName="cs_2_5_1", label="符合医学指征"),
		@Column(name="cs_2_1_1_a", attrName="cs_2_1_1_a", label="胎儿窘迫"),
		@Column(name="cs_2_1_1_b", attrName="cs_2_1_1_b", label="头盆不称"),
		@Column(name="cs_2_1_1_c", attrName="cs_2_1_1_c", label="瘢痕子宫"),
		@Column(name="cs_2_1_1_d", attrName="cs_2_1_1_d", label="胎位异常"),
		@Column(name="cs_2_1_1_e", attrName="cs_2_1_1_e", label="前置胎盘及前置血管"),
		@Column(name="cs_2_1_1_f", attrName="cs_2_1_1_f", label="双胎或多胎妊娠"),
		@Column(name="cs_2_1_1_g", attrName="cs_2_1_1_g", label="脐带脱垂"),
		@Column(name="cs_2_1_1_h", attrName="cs_2_1_1_h", label="胎盘早剥"),
		@Column(name="cs_2_1_1_i", attrName="cs_2_1_1_i", label="孕妇存在严重合并症和并发症"),
		@Column(name="cs_2_1_1_j", attrName="cs_2_1_1_j", label="妊娠巨大儿者"),
		@Column(name="cs_2_1_1_k", attrName="cs_2_1_1_k", label="产道畸形"),
		@Column(name="cs_2_1_1_l", attrName="cs_2_1_1_l", label="外阴疾病"),
		@Column(name="cs_2_1_1_n", attrName="cs_2_1_1_n", label="妊娠合并肿瘤"),
		@Column(name="cs_2_1_1_m", attrName="cs_2_1_1_m", label="生殖道严重的感染性疾病"),
		@Column(name="cs_2_1_1_o", attrName="cs_2_1_1_o", label="剖宫产+伴绝育手术"),
		@Column(name="cs_2_1_1_p", attrName="cs_2_1_1_p", label="其他病理状态"),
		@Column(name="cs_2_1_1_q", attrName="cs_2_1_1_q", label="高龄初产妇"),
		@Column(name="cs_2_1_1_r", attrName="cs_2_1_1_r", label="符合DRGs编码的 剖宫产,伴重要合并症与伴隨病"),
		@Column(name="cs_2_2_1", attrName="cs_2_2_1", label="孕妇要求剖宫产的评估"),
		@Column(name="cs_2_3_1", attrName="cs_2_3_1", label="手术方式选择"),
		@Column(name="cs_2_4_2", attrName="cs_2_4_2", label="胎儿娩出日期时间"),
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
		@Column(name="cs_4_1", attrName="cs_4_1", label="是否实施新生儿Apgar评分"),
		@Column(name="cs_4_2", attrName="cs_4_2", label="新生儿出生后1、5、10min,Apgar评分值"),
		@Column(name="cs_4_3_1", attrName="cs_4_3_1", label="出生后1min,Apgar评分值"),
		@Column(name="cs_4_3_2", attrName="cs_4_3_2", label="出生后5min,Apgar评分值"),
		@Column(name="cs_4_3_3", attrName="cs_4_3_3", label="出生后10min,Apgar评分值"),
		@Column(name="cs_5_1", attrName="cs_5_1", label="术后24小时内出血量"),
		@Column(name="cs_5_1_1", attrName="cs_5_1_1", label="术后24小时内实际出血量", comment="术后24小时内实际出血量（ml）"),
		@Column(name="cs_5_2_1", attrName="cs_5_2_1", label="剖宫产产后出血可能的原因"),
		@Column(name="cs_5_3", attrName="cs_5_3", label="术后24小时内输血量"),
		@Column(name="cs_5_4", attrName="cs_5_4", label="术后24小时内实际输血量", comment="术后24小时内实际输血量（ml）"),
		@Column(name="cs_5_5", attrName="cs_5_5", label="止血干预措施的选择"),
		@Column(name="cs_6_1_1", attrName="cs_6_1_1", label="是否有剖宫产并发症"),
		@Column(name="cs_6_1_2_1", attrName="cs_6_1_2_1", label="剖宫产并发症ICD.10编码"),
		@Column(name="cs_6_1_2_1_a", attrName="cs_6_1_2_1_a", label="产后出血"),
		@Column(name="cs_6_1_2_1_b", attrName="cs_6_1_2_1_b", label="产褥期感染"),
		@Column(name="cs_6_1_2_1_c", attrName="cs_6_1_2_1_c", label="产科栓塞"),
		@Column(name="cs_6_1_2_1_d", attrName="cs_6_1_2_1_d", label="栓塞病"),
		@Column(name="cs_6_1_2_1_e", attrName="cs_6_1_2_1_e", label="胎盘和胎膜滞留不伴有出血"),
		@Column(name="cs_6_1_2_1_f", attrName="cs_6_1_2_1_f", label="产科手术伤口的感染"),
		@Column(name="cs_6_1_2_1_g", attrName="cs_6_1_2_1_g", label="产科伤口裂开"),
		@Column(name="cs_6_1_2_1_h", attrName="cs_6_1_2_1_h", label="其他并发症"),
		@Column(name="cs_6_2", attrName="cs_6_2", label="是否再次手术"),
		@Column(name="cs_6_3", attrName="cs_6_3", label="再次手术原因"),
		@Column(name="cs_6_3_1", attrName="cs_6_3_1", label="其他再次手术原因"),
		@Column(name="cs_6_4", attrName="cs_6_4", label="影响程度的选择"),
		@Column(name="cs_7_1", attrName="cs_7_1", label="是否有新生儿产伤"),
		@Column(name="cs_7_2", attrName="cs_7_2", label="产程和分娩期间并发症所列的名称及ICD.10编码"),
		@Column(name="cs_7_2_a", attrName="cs_7_2_a", label="ICD-10", comment="ICD-10：P10产伤引起的颅内撕裂和出血"),
		@Column(name="cs_7_2_b", attrName="cs_7_2_b", label="ICD-10", comment="ICD-10：P11产伤致新生儿脑伤"),
		@Column(name="cs_7_2_c", attrName="cs_7_2_c", label="ICD-10", comment="ICD-10：P12头皮产伤"),
		@Column(name="cs_7_2_d", attrName="cs_7_2_d", label="ICD-10", comment="ICD-10：P13颅骨产伤"),
		@Column(name="cs_7_2_e", attrName="cs_7_2_e", label="ICD-10", comment="ICD-10：P14神经产伤"),
		@Column(name="cs_7_2_f", attrName="cs_7_2_f", label="ICD-10", comment="ICD-10：P15其他产伤"),
		@Column(name="cs_7_2_g", attrName="cs_7_2_g", label="ICD-10", comment="ICD-10：P20子宫内低氧症"),
		@Column(name="cs_7_2_h", attrName="cs_7_2_h", label="ICD-10", comment="ICD-10：P21出生窒息"),
		@Column(name="cs_7_3", attrName="cs_7_3", label="新生儿是否有先天性畸形、变形和染色体异常"),
		@Column(name="cs_7_4", attrName="cs_7_4", label="新生儿", comment="新生儿：先天性畸形、变形和染色体异常的名称及ICD.10编码"),
		@Column(name="cs_8_2_1", attrName="cs_8_2_1", label="是否有母乳喂养禁忌证"),
		@Column(name="cs_8_1_1", attrName="cs_8_1_1", label="母乳喂养禁忌证选择"),
		@Column(name="cs_8_2", attrName="cs_8_2", label="提供母乳喂养"),
		@Column(name="cs_9_1_1", attrName="cs_9_1_1", label="住院期间为产妇提供术前健康教育"),
		@Column(name="cs_9_1_2", attrName="cs_9_1_2", label="提供产后康复健康教育"),
		@Column(name="cs_9_1_3", attrName="cs_9_1_3", label="是否提供术后镇痛"),
		@Column(name="cs_9_1_4", attrName="cs_9_1_4", label="药物选择"),
		@Column(name="cs_9_1_4_1", attrName="cs_9_1_4_1", label="其他镇痛药物"),
		@Column(name="cm_7_2_1", attrName="cm_7_2_1", label="交与患者“出院小结”的副本告知患者出院时风险因素"),
		@Column(name="cm_7_2_2", attrName="cm_7_2_2", label="母乳喂养与出院带药"),
		@Column(name="cm_7_2_3", attrName="cm_7_2_3", label="告知 出院关注事项"),
		@Column(name="cm_7_2_4", attrName="cm_7_2_4", label="出院时教育"),
		@Column(name="cm_7_2_5", attrName="cm_7_2_5", label="告知随访"),
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

@Data
public class QualityCs extends DataEntity<QualityCs> {
	
	private static final long serialVersionUID = 1L;
	private String cm_0_1_1_1;		// 质控医师
	private String cm_0_1_1_2;		// 质控护士
	private String cm_0_1_1_3;		// 主治医师
	private String cm_0_1_1_4;		// 责任护士
	private String cm_0_1_1_5;		// 上报科室
	private String caseid;		// 患者病案号
	private String idcard;		// 患者身份证号
	private String cm_0_1_3_1;		// 出院诊断ICD-10四位亚目编码与名称
	private String cm_0_1_3_2;		// 出院诊断ICD-10六位临床扩展编码与名称
	private String cm_0_1_4_1;		// 主要手术操作 国家临床版ICD-9.CM-3编码与手术名称
	private String cm_0_1_5;		// 是否出院后31天内重复住院
	private Date cm_0_2_1_1;		// 出生日期
	private Double cm_0_2_1_3;		// 患者体重（kg）
	private Double cm_0_2_1_5;		// 患者身高（cm）
	private Double cm_0_2_1_6;		// 新生儿出生体重（克）
	private String cs_0_2_2_1;		// 末次月经日期是否确定
	private Date cs_0_2_2;		// 末次月经日期
	private String cm_0_2_3_1;		// 到达本院急诊或者门诊日期时间是否确定
	private Date cm_0_2_3_2;		// 到达本院急诊或者门诊日期时间
	private Date cm_0_2_4_1;		// 入院日期时间
	private Date cm_0_2_4_2;		// 出院日期时间
	private Date cm_0_2_6_1;		// 手术开始（切皮）日期时间
	private Date cm_0_2_6_2;		// 手术结束（缝皮结束）日期时间
	private String cm_0_3_1;		// 费用支付方式
	private String cm_0_3_2;		// 收入住院途径
	private String cm_0_3_3;		// 到院交通工具
	private String cs_1_1_1;		// 产次
	private String cs_1_1_1_1;		// 剖宮产史
	private String cs_1_1_3;		// 临产方式
	private String cs_1_1_4;		// 孕周
	private String cs_1_1_5;		// 胎位
	private String cs_1_1_6;		// 胎儿数量
	private String cs_1_2_1;		// 手术前风险评估的检查项目
	private String cs_1_2_2;		// 手术前知情告知
	private String cs_1_2_31;		// 麻醉前知情告知
	private String cs_1_2_4;		// 麻醉方式
	private String cs_1_2_5;		// 特殊感染评估
	private String cs_1_2_6;		// 孕妇伴有特殊感染ICD.10编码及诊断名称
	private String cs_2_1_1_1;		// 剖宫产指征
	private String cs_2_5_1;		// 符合医学指征
	private String cs_2_1_1_a;		// 胎儿窘迫
	private String cs_2_1_1_b;		// 头盆不称
	private String cs_2_1_1_c;		// 瘢痕子宫
	private String cs_2_1_1_d;		// 胎位异常
	private String cs_2_1_1_e;		// 前置胎盘及前置血管
	private String cs_2_1_1_f;		// 双胎或多胎妊娠
	private String cs_2_1_1_g;		// 脐带脱垂
	private String cs_2_1_1_h;		// 胎盘早剥
	private String cs_2_1_1_i;		// 孕妇存在严重合并症和并发症
	private String cs_2_1_1_j;		// 妊娠巨大儿者
	private String cs_2_1_1_k;		// 产道畸形
	private String cs_2_1_1_l;		// 外阴疾病
	private String cs_2_1_1_n;		// 妊娠合并肿瘤
	private String cs_2_1_1_m;		// 生殖道严重的感染性疾病
	private String cs_2_1_1_o;		// 剖宫产+伴绝育手术
	private String cs_2_1_1_p;		// 其他病理状态
	private String cs_2_1_1_q;		// 高龄初产妇
	private String cs_2_1_1_r;		// 符合DRGs编码的 剖宫产,伴重要合并症与伴隨病
	private String cs_2_2_1;		// 孕妇要求剖宫产的评估
	private String cs_2_3_1;		// 手术方式选择
	private Date cs_2_4_2;		// 胎儿娩出日期时间
	private String cm_1_1_1;		// 是否使用预防性抗菌药物
	private String cm_1_2_1_2;		// 预防性抗菌药物选择
	private String cm_1_2_2_2;		// 选择碳青霉烯类及替加环素等特殊使用级抗菌药物
	private String cm_1_2_2_1;		// 其他特殊使用级抗菌药物名称
	private String cm_1_3_1_2;		// 选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素
	private String cm_1_3_1_1;		// 选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素填写
	private Date cm_1_4_1;		// 使用首剂抗菌药物起始时间
	private String cm_1_5_1;		// 手术时间是否≥3小时
	private String cm_1_5_2;		// 是否术中追加抗菌药物
	private String cm_1_5_3;		// 术中出血量是否≥1500ml
	private String cm_1_5_4;		// 是否术中追加抗菌药物
	private Date cm_1_6_1;		// 术后抗菌药物停止使用时间
	private String cm_1_6_2;		// 使用抗菌药物时间使用时间分层
	private String cm_1_6_3_2;		// 术后48小时之后继续使用的原因
	private String cs_4_1;		// 是否实施新生儿Apgar评分
	private String cs_4_2;		// 新生儿出生后1、5、10min,Apgar评分值
	private Double cs_4_3_1;		// 出生后1min,Apgar评分值
	private Double cs_4_3_2;		// 出生后5min,Apgar评分值
	private Double cs_4_3_3;		// 出生后10min,Apgar评分值
	private String cs_5_1;		// 术后24小时内出血量
	private Double cs_5_1_1;		// 术后24小时内实际出血量（ml）
	private String cs_5_2_1;		// 剖宫产产后出血可能的原因
	private String cs_5_3;		// 术后24小时内输血量
	private Double cs_5_4;		// 术后24小时内实际输血量（ml）
	private String cs_5_5;		// 止血干预措施的选择
	private String cs_6_1_1;		// 是否有剖宫产并发症
	private String cs_6_1_2_1;		// 剖宫产并发症ICD.10编码
	private String cs_6_1_2_1_a;		// 产后出血
	private String cs_6_1_2_1_b;		// 产褥期感染
	private String cs_6_1_2_1_c;		// 产科栓塞
	private String cs_6_1_2_1_d;		// 栓塞病
	private String cs_6_1_2_1_e;		// 胎盘和胎膜滞留不伴有出血
	private String cs_6_1_2_1_f;		// 产科手术伤口的感染
	private String cs_6_1_2_1_g;		// 产科伤口裂开
	private String cs_6_1_2_1_h;		// 其他并发症
	private String cs_6_2;		// 是否再次手术
	private String cs_6_3;		// 再次手术原因
	private String cs_6_3_1;		// 其他再次手术原因
	private String cs_6_4;		// 影响程度的选择
	private String cs_7_1;		// 是否有新生儿产伤
	private String cs_7_2;		// 产程和分娩期间并发症所列的名称及ICD.10编码
	private String cs_7_2_a;		// ICD-10：P10产伤引起的颅内撕裂和出血
	private String cs_7_2_b;		// ICD-10：P11产伤致新生儿脑伤
	private String cs_7_2_c;		// ICD-10：P12头皮产伤
	private String cs_7_2_d;		// ICD-10：P13颅骨产伤
	private String cs_7_2_e;		// ICD-10：P14神经产伤
	private String cs_7_2_f;		// ICD-10：P15其他产伤
	private String cs_7_2_g;		// ICD-10：P20子宫内低氧症
	private String cs_7_2_h;		// ICD-10：P21出生窒息
	private String cs_7_3;		// 新生儿是否有先天性畸形、变形和染色体异常
	private String cs_7_4;		// 新生儿：先天性畸形、变形和染色体异常的名称及ICD.10编码
	private String cs_8_2_1;		// 是否有母乳喂养禁忌证
	private String cs_8_1_1;		// 母乳喂养禁忌证选择
	private String cs_8_2;		// 提供母乳喂养
	private String cs_9_1_1;		// 住院期间为产妇提供术前健康教育
	private String cs_9_1_2;		// 提供产后康复健康教育
	private String cs_9_1_3;		// 是否提供术后镇痛
	private String cs_9_1_4;		// 药物选择
	private String cs_9_1_4_1;		// 其他镇痛药物
	private String cm_7_2_1;		// 交与患者“出院小结”的副本告知患者出院时风险因素
	private String cm_7_2_2;		// 母乳喂养与出院带药
	private String cm_7_2_3;		// 告知 出院关注事项
	private String cm_7_2_4;		// 出院时教育
	private String cm_7_2_5;		// 告知随访
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

    private Date startTime;     //出院开始时间
    private Date endTime;       //出院截至时间
	
	public QualityCs() {
		this(null);
	}

	public QualityCs(String id){
		super(id);
	}

	@Override
	public Date getCreateDate_gte() {
		return sqlMap.getWhere().getValue("create_date", QueryType.GTE);
	}

	@Override
	public void setCreateDate_gte(Date createDate) {
		sqlMap.getWhere().and("create_date", QueryType.GTE, createDate);
	}

	@Override
	public Date getCreateDate_lte() {
		return sqlMap.getWhere().getValue("create_date", QueryType.LTE);
	}

	@Override
	public void setCreateDate_lte(Date createDate) {
		sqlMap.getWhere().and("create_date", QueryType.LTE, createDate);
	}
}