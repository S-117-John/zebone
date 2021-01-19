/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.tc.entity;

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
 * quality_tcEntity
 * @author 卡卡西
 * @version 2021-01-19
 */
@Table(name="quality_tc", alias="a", columns={
		@Column(name="cm_0_1_1_1", attrName="cm_0_1_1_1", label="质控医师"),
		@Column(name="cm_0_1_1_2", attrName="cm_0_1_1_2", label="质控护士"),
		@Column(name="cm_0_1_1_3", attrName="cm_0_1_1_3", label="主治医师"),
		@Column(name="cm_0_1_1_4", attrName="cm_0_1_1_4", label="责任护士"),
		@Column(name="cm_0_1_1_5", attrName="cm_0_1_1_5", label="上报科室"),
		@Column(name="case_id", attrName="caseId", label="患者病案号"),
		@Column(name="cm_0_1_3_1", attrName="cm_0_1_3_1", label="主要诊断ICD-10四位亚目编码与名称"),
		@Column(name="cm_0_1_3_2", attrName="cm_0_1_3_2", label="主要诊断ICD-10六位临床扩展编码与名称"),
		@Column(name="cm_0_1_4_1", attrName="cm_0_1_4_1", label="主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称"),
		@Column(name="tc_0_1_4_1", attrName="tc_0_1_4_1", label="其他主要手术操作ICD-9-CM-3四位亚目编码与名称"),
		@Column(name="cm_0_1_4_2", attrName="cm_0_1_4_2", label="主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称"),
		@Column(name="tc_0_1_4_2", attrName="tc_0_1_4_2", label="其他主要手术操作ICD-9-CM-3六位临床扩展编码与名称"),
		@Column(name="cm_0_1_5", attrName="cm_0_1_5", label="是否出院后31天内重复住院"),
		@Column(name="cm_0_2_1_1", attrName="cm_0_2_1_1", label="出生日期"),
		@Column(name="cm_0_2_1_2", attrName="cm_0_2_1_2", label="患者性别"),
		@Column(name="cm_0_2_1_3", attrName="cm_0_2_1_3", label="患者体重", comment="患者体重（kg）"),
		@Column(name="cm_0_2_1_5", attrName="cm_0_2_1_5", label="患者身高", comment="患者身高（cm）"),
		@Column(name="cm_0_2_2_1", attrName="cm_0_2_2_1", label="发病日期时间是否无法确定或无记录"),
		@Column(name="cm_0_2_2_2", attrName="cm_0_2_2_2", label="发病日期时间"),
		@Column(name="cm_0_2_4_1", attrName="cm_0_2_4_1", label="入院日期时间"),
		@Column(name="cm_0_2_4_2", attrName="cm_0_2_4_2", label="出院日期时间"),
		@Column(name="cm_0_2_6_1", attrName="cm_0_2_6_1", label="手术开始", comment="手术开始（切皮）日期时间"),
		@Column(name="cm_0_2_6_2", attrName="cm_0_2_6_2", label="手术结束", comment="手术结束（缝皮结束）日期时间"),
		@Column(name="cm_0_3_1", attrName="cm_0_3_1", label="费用支付方式"),
		@Column(name="cm_0_3_2", attrName="cm_0_3_2", label="收入住院途径"),
		@Column(name="cm_0_3_3", attrName="cm_0_3_3", label="到院交通工具"),
		@Column(name="tc_1_1_1", attrName="tc_1_1_1", label="甲状腺癌治疗前是否在进行 TNM 临床分期"),
		@Column(name="tc_1_1_2", attrName="tc_1_1_2", label="主要有那些临床表现及体征"),
		@Column(name="tc_1_1_2_1", attrName="tc_1_1_2_1", label="其他主要有那些临床表现及体征"),
		@Column(name="tc_1_1_3", attrName="tc_1_1_3", label="主要辅助检查"),
		@Column(name="tc_1_1_4", attrName="tc_1_1_4", label="次要辅助检查"),
		@Column(name="tc_1_1_4_1", attrName="tc_1_1_4_1", label="其他次要辅助检查"),
		@Column(name="tc_1_2_7_r", attrName="tc_1_2_7_r", label="nan"),
		@Column(name="tc_1_2_1", attrName="tc_1_2_1", label="患者年龄"),
		@Column(name="tc_1_2_2", attrName="tc_1_2_2", label="T 原肿瘤"),
		@Column(name="tc_1_2_3", attrName="tc_1_2_3", label="N 淋巴结转移"),
		@Column(name="tc_1_2_4", attrName="tc_1_2_4", label="M 远处转移"),
		@Column(name="tc_1_2_5", attrName="tc_1_2_5", label="术前细胞学检查"),
		@Column(name="tc_1_3_1", attrName="tc_1_3_1", label="cTNM 临床分期结果选择"),
		@Column(name="tc_1_3_2", attrName="tc_1_3_2", label="乳头状癌及滤泡癌 患者年龄&lt;55岁"),
		@Column(name="tc_1_3_3", attrName="tc_1_3_3", label="乳头状癌及滤泡癌患者年龄≥55岁"),
		@Column(name="tc_1_3_4", attrName="tc_1_3_4", label="未分化癌 ", comment="未分化癌 （所用未分化均为Ⅳ期）"),
		@Column(name="tc_1_3_5", attrName="tc_1_3_5", label="髓样癌"),
		@Column(name="tc_1_4_1", attrName="tc_1_4_1", label="治疗前是否接受过（MDT）多学科协作诊疗", comment="治疗前是否接受过（MDT）多学科协作诊疗(2个或以上治疗科室会诊)"),
		@Column(name="tc_2_1_1", attrName="tc_2_1_1", label="术前评估有无淋巴结转移"),
		@Column(name="tc_2_1_2", attrName="tc_2_1_2", label="淋巴结转移征象"),
		@Column(name="tc_2_1_2_1", attrName="tc_2_1_2_1", label="其他淋巴结转移征象"),
		@Column(name="tc_2_2_1", attrName="tc_2_2_1", label="是否甲状腺癌手术治疗"),
		@Column(name="tc_2_3_1", attrName="tc_2_3_1", label="甲状腺癌再次手术"),
		@Column(name="tc_2_3_2", attrName="tc_2_3_2", label="甲状腺癌再次手术主要原因"),
		@Column(name="tc_2_3_2_1", attrName="tc_2_3_2_1", label="其它甲状腺癌再次手术主要原因"),
		@Column(name="tc_2_4_1", attrName="tc_2_4_1", label="甲状腺癌手术治疗方式"),
		@Column(name="tc_2_4_1_1", attrName="tc_2_4_1_1", label="其他甲状腺癌手术治疗方式"),
		@Column(name="tc_2_4_3", attrName="tc_2_4_3", label="甲状腺全切除手术适应证的选择"),
		@Column(name="tc_2_4_3_1", attrName="tc_2_4_3_1", label="其他甲状腺全切除手术适应证"),
		@Column(name="tc_2_4_2", attrName="tc_2_4_2", label="甲状腺腺叶切除适应证的选择"),
		@Column(name="tc_2_4_2_1", attrName="tc_2_4_2_1", label="其他甲状腺腺叶切除适应证"),
		@Column(name="tc_2_4_4", attrName="tc_2_4_4", label="甲状腺全切除+淋巴结清扫手术适应证的选择"),
		@Column(name="tc_2_4_4_1", attrName="tc_2_4_4_1", label="其他甲状腺全切除+淋巴结清扫手术适应证"),
		@Column(name="tc_2_5_1", attrName="tc_2_5_1", label="是否进行术中快速病理"),
		@Column(name="tc_2_5_2", attrName="tc_2_5_2", label="术中冰冻病理学检查证实有颈侧区淋巴结转移"),
		@Column(name="tc_2_5_3", attrName="tc_2_5_3", label="清扫淋巴结手术部位"),
		@Column(name="tc_2_5_4", attrName="tc_2_5_4", label="淋巴结清扫范围"),
		@Column(name="tc_2_5_4_1", attrName="tc_2_5_4_1", label="其他淋巴结清扫范围"),
		@Column(name="tc_3_2_2", attrName="tc_3_2_2", label="甲状腺手术后特指并发症的选择"),
		@Column(name="tc_3_2_2_1", attrName="tc_3_2_2_1", label="其他甲状腺手术后特指并发症"),
		@Column(name="tc_5_1_1", attrName="tc_5_1_1", label="术后病理诊断"),
		@Column(name="tc_5_1_2_0", attrName="tc_5_1_2_0", label="病理诊断结论"),
		@Column(name="tc_5_1_2", attrName="tc_5_1_2", label="乳头状甲状腺癌"),
		@Column(name="tc_5_1_3", attrName="tc_5_1_3", label="滤泡性甲状腺癌"),
		@Column(name="tc_5_1_4", attrName="tc_5_1_4", label="乳头状甲状腺癌"),
		@Column(name="tc_5_1_5", attrName="tc_5_1_5", label="乳头状甲状腺癌"),
		@Column(name="tc_5_1_6", attrName="tc_5_1_6", label="滤泡性甲状腺癌"),
		@Column(name="tc_5_1_7", attrName="tc_5_1_7", label="是否进行促甲状腺素", comment="是否进行促甲状腺素(TSH)检测"),
		@Column(name="tc_5_1_8", attrName="tc_5_1_8", label="促甲状腺素", comment="促甲状腺素(TSH)检测结果(mIU/ L )"),
		@Column(name="tc_5_2_1", attrName="tc_5_2_1", label="术后内分泌抑制治疗适应证的选择"),
		@Column(name="tc_5_2_1_1", attrName="tc_5_2_1_1", label="其他术后内分泌抑制治疗适应证"),
		@Column(name="tc_5_2_2", attrName="tc_5_2_2", label="是否进行内分泌抑制治疗"),
		@Column(name="tc_5_2_3", attrName="tc_5_2_3", label="促甲状腺素", comment="促甲状腺素(TSH)抑制剂的选择"),
		@Column(name="tc_5_2_3_1", attrName="tc_5_2_3_1", label="其他促甲状腺素", comment="其他促甲状腺素(TSH)抑制剂"),
		@Column(name="tc_5_2_4", attrName="tc_5_2_4", label="治疗并发症的选择"),
		@Column(name="tc_5_2_4_1", attrName="tc_5_2_4_1", label="其他治疗并发症"),
		@Column(name="tc_5_2_5", attrName="tc_5_2_5", label="术后核素治疗适应证的选择"),
		@Column(name="tc_5_2_5_1", attrName="tc_5_2_5_1", label="其他术后核素治疗适应证"),
		@Column(name="tc_5_2_6", attrName="tc_5_2_6", label="是否进行术后核素治疗"),
		@Column(name="tc_6_1", attrName="tc_6_1", label="是否输血"),
		@Column(name="tc_6_1_1", attrName="tc_6_1_1", label="出血量", comment="出血量(ml)"),
		@Column(name="tc_6_1_2", attrName="tc_6_1_2", label="输血量", comment="输血量(ml)"),
		@Column(name="tc_6_2_1", attrName="tc_6_2_1", label="出血量", comment="出血量(ml)"),
		@Column(name="tc_6_2_2", attrName="tc_6_2_2", label="输血量", comment="输血量(ml)"),
		@Column(name="tc_7_2_1", attrName="tc_7_2_1", label="是否进行甲状腺复发风险评估"),
		@Column(name="tc_7_2_2", attrName="tc_7_2_2", label="告知甲状腺癌复发风险评估结果"),
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
		@Column(name="cm_0_1_4_1_1", attrName="cm01411", label="其他ICD-9-CM-3四位亚目编码与名称"),
		@Column(name="cm_6_22", attrName="cm_6_22", label="血费"),
		@Column(name="cm_6_23", attrName="cm_6_23", label="白蛋白类制品费"),
		@Column(name="cm_6_24", attrName="cm_6_24", label="球蛋白类制品费"),
		@Column(name="cm_6_25", attrName="cm_6_25", label="凝血因子类制品费"),
		@Column(name="cm_6_26", attrName="cm_6_26", label="细胞因子类制品费"),
		@Column(name="cm_6_27", attrName="cm_6_27", label="检查用一次性医用材料费"),
		@Column(name="cm_6_28", attrName="cm_6_28", label="治疗用一次性医用材料费"),
		@Column(name="cm_6_29", attrName="cm_6_29", label="手术用一次性医用材料费"),
		@Column(name="cm_6_30", attrName="cm_6_30", label="其他费"),
		@Column(name="cm_0_1_4_2_1", attrName="cm01421", label="其他ICD-9-CM-3六位临床扩展编码与名称"),
		@Column(name="cm_0_2_3_1", attrName="cm0231", label="到达本院急诊或者门诊日期时间是否无法确定或无记录"),
		@Column(name="cm_0_2_3_2", attrName="cm0232", label="到达本院急诊或者门诊日期时间"),
		@Column(name="cm_0_2_5_1", attrName="cm0251", label="入住CCU日期时间"),
		@Column(name="cm_0_2_5_2", attrName="cm0252", label="离开CCU日期时间"),
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(includeEntity=DataEntity.class),
	}, orderBy="a.update_date DESC"
)
public class QualityTc extends DataEntity<QualityTc> {
	
	private static final long serialVersionUID = 1L;
	private String cm_0_1_1_1;		// 质控医师
	private String cm_0_1_1_2;		// 质控护士
	private String cm_0_1_1_3;		// 主治医师
	private String cm_0_1_1_4;		// 责任护士
	private String cm_0_1_1_5;		// 上报科室
	private String caseId;		// 患者病案号
	private String cm_0_1_3_1;		// 主要诊断ICD-10四位亚目编码与名称
	private String cm_0_1_3_2;		// 主要诊断ICD-10六位临床扩展编码与名称
	private String cm_0_1_4_1;		// 主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称
	private String tc_0_1_4_1;		// 其他主要手术操作ICD-9-CM-3四位亚目编码与名称
	private String cm_0_1_4_2;		// 主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称
	private String tc_0_1_4_2;		// 其他主要手术操作ICD-9-CM-3六位临床扩展编码与名称
	private String cm_0_1_5;		// 是否出院后31天内重复住院
	private Date cm_0_2_1_1;		// 出生日期
	private String cm_0_2_1_2;		// 患者性别
	private Double cm_0_2_1_3;		// 患者体重（kg）
	private Double cm_0_2_1_5;		// 患者身高（cm）
	private String cm_0_2_2_1;		// 发病日期时间是否无法确定或无记录
	private Date cm_0_2_2_2;		// 发病日期时间
	private Date cm_0_2_4_1;		// 入院日期时间
	private Date cm_0_2_4_2;		// 出院日期时间
	private Date cm_0_2_6_1;		// 手术开始（切皮）日期时间
	private Date cm_0_2_6_2;		// 手术结束（缝皮结束）日期时间
	private String cm_0_3_1;		// 费用支付方式
	private String cm_0_3_2;		// 收入住院途径
	private String cm_0_3_3;		// 到院交通工具
	private String tc_1_1_1;		// 甲状腺癌治疗前是否在进行 TNM 临床分期
	private String tc_1_1_2;		// 主要有那些临床表现及体征
	private String tc_1_1_2_1;		// 其他主要有那些临床表现及体征
	private String tc_1_1_3;		// 主要辅助检查
	private String tc_1_1_4;		// 次要辅助检查
	private String tc_1_1_4_1;		// 其他次要辅助检查
	private String tc_1_2_7_r;		// nan
	private String tc_1_2_1;		// 患者年龄
	private String tc_1_2_2;		// T 原肿瘤
	private String tc_1_2_3;		// N 淋巴结转移
	private String tc_1_2_4;		// M 远处转移
	private String tc_1_2_5;		// 术前细胞学检查
	private String tc_1_3_1;		// cTNM 临床分期结果选择
	private String tc_1_3_2;		// 乳头状癌及滤泡癌 患者年龄&lt;55岁
	private String tc_1_3_3;		// 乳头状癌及滤泡癌患者年龄≥55岁
	private String tc_1_3_4;		// 未分化癌 （所用未分化均为Ⅳ期）
	private String tc_1_3_5;		// 髓样癌
	private String tc_1_4_1;		// 治疗前是否接受过（MDT）多学科协作诊疗(2个或以上治疗科室会诊)
	private String tc_2_1_1;		// 术前评估有无淋巴结转移
	private String tc_2_1_2;		// 淋巴结转移征象
	private String tc_2_1_2_1;		// 其他淋巴结转移征象
	private String tc_2_2_1;		// 是否甲状腺癌手术治疗
	private String tc_2_3_1;		// 甲状腺癌再次手术
	private String tc_2_3_2;		// 甲状腺癌再次手术主要原因
	private String tc_2_3_2_1;		// 其它甲状腺癌再次手术主要原因
	private String tc_2_4_1;		// 甲状腺癌手术治疗方式
	private String tc_2_4_1_1;		// 其他甲状腺癌手术治疗方式
	private String tc_2_4_3;		// 甲状腺全切除手术适应证的选择
	private String tc_2_4_3_1;		// 其他甲状腺全切除手术适应证
	private String tc_2_4_2;		// 甲状腺腺叶切除适应证的选择
	private String tc_2_4_2_1;		// 其他甲状腺腺叶切除适应证
	private String tc_2_4_4;		// 甲状腺全切除+淋巴结清扫手术适应证的选择
	private String tc_2_4_4_1;		// 其他甲状腺全切除+淋巴结清扫手术适应证
	private String tc_2_5_1;		// 是否进行术中快速病理
	private String tc_2_5_2;		// 术中冰冻病理学检查证实有颈侧区淋巴结转移
	private String tc_2_5_3;		// 清扫淋巴结手术部位
	private String tc_2_5_4;		// 淋巴结清扫范围
	private String tc_2_5_4_1;		// 其他淋巴结清扫范围
	private String tc_3_2_2;		// 甲状腺手术后特指并发症的选择
	private String tc_3_2_2_1;		// 其他甲状腺手术后特指并发症
	private String tc_5_1_1;		// 术后病理诊断
	private String tc_5_1_2_0;		// 病理诊断结论
	private String tc_5_1_2;		// 乳头状甲状腺癌
	private String tc_5_1_3;		// 滤泡性甲状腺癌
	private String tc_5_1_4;		// 乳头状甲状腺癌
	private String tc_5_1_5;		// 乳头状甲状腺癌
	private String tc_5_1_6;		// 滤泡性甲状腺癌
	private String tc_5_1_7;		// 是否进行促甲状腺素(TSH)检测
	private Double tc_5_1_8;		// 促甲状腺素(TSH)检测结果(mIU/ L )
	private String tc_5_2_1;		// 术后内分泌抑制治疗适应证的选择
	private String tc_5_2_1_1;		// 其他术后内分泌抑制治疗适应证
	private String tc_5_2_2;		// 是否进行内分泌抑制治疗
	private String tc_5_2_3;		// 促甲状腺素(TSH)抑制剂的选择
	private String tc_5_2_3_1;		// 其他促甲状腺素(TSH)抑制剂
	private String tc_5_2_4;		// 治疗并发症的选择
	private String tc_5_2_4_1;		// 其他治疗并发症
	private String tc_5_2_5;		// 术后核素治疗适应证的选择
	private String tc_5_2_5_1;		// 其他术后核素治疗适应证
	private String tc_5_2_6;		// 是否进行术后核素治疗
	private String tc_6_1;		// 是否输血
	private Double tc_6_1_1;		// 出血量(ml)
	private Double tc_6_1_2;		// 输血量(ml)
	private Double tc_6_2_1;		// 出血量(ml)
	private Double tc_6_2_2;		// 输血量(ml)
	private String tc_7_2_1;		// 是否进行甲状腺复发风险评估
	private String tc_7_2_2;		// 告知甲状腺癌复发风险评估结果
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
	private String cm01411;		// 其他ICD-9-CM-3四位亚目编码与名称
	private Double cm_6_22;		// 血费
	private Double cm_6_23;		// 白蛋白类制品费
	private Double cm_6_24;		// 球蛋白类制品费
	private Double cm_6_25;		// 凝血因子类制品费
	private Double cm_6_26;		// 细胞因子类制品费
	private Double cm_6_27;		// 检查用一次性医用材料费
	private Double cm_6_28;		// 治疗用一次性医用材料费
	private Double cm_6_29;		// 手术用一次性医用材料费
	private Double cm_6_30;		// 其他费
	private String cm01421;		// 其他ICD-9-CM-3六位临床扩展编码与名称
	private String cm0231;		// 到达本院急诊或者门诊日期时间是否无法确定或无记录
	private Date cm0232;		// 到达本院急诊或者门诊日期时间
	private Date cm0251;		// 入住CCU日期时间
	private Date cm0252;		// 离开CCU日期时间
	
	public QualityTc() {
		this(null);
	}

	public QualityTc(String id){
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
	
	@Length(min=0, max=32, message="患者病案号长度不能超过 32 个字符")
	public String getCaseId() {
		return caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}
	
	@Length(min=0, max=32, message="主要诊断ICD-10四位亚目编码与名称长度不能超过 32 个字符")
	public String getCm_0_1_3_1() {
		return cm_0_1_3_1;
	}

	public void setCm_0_1_3_1(String cm_0_1_3_1) {
		this.cm_0_1_3_1 = cm_0_1_3_1;
	}
	
	@Length(min=0, max=32, message="主要诊断ICD-10六位临床扩展编码与名称长度不能超过 32 个字符")
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
	
	@Length(min=0, max=64, message="其他主要手术操作ICD-9-CM-3四位亚目编码与名称长度不能超过 64 个字符")
	public String getTc_0_1_4_1() {
		return tc_0_1_4_1;
	}

	public void setTc_0_1_4_1(String tc_0_1_4_1) {
		this.tc_0_1_4_1 = tc_0_1_4_1;
	}
	
	@Length(min=0, max=32, message="主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称长度不能超过 32 个字符")
	public String getCm_0_1_4_2() {
		return cm_0_1_4_2;
	}

	public void setCm_0_1_4_2(String cm_0_1_4_2) {
		this.cm_0_1_4_2 = cm_0_1_4_2;
	}
	
	@Length(min=0, max=64, message="其他主要手术操作ICD-9-CM-3六位临床扩展编码与名称长度不能超过 64 个字符")
	public String getTc_0_1_4_2() {
		return tc_0_1_4_2;
	}

	public void setTc_0_1_4_2(String tc_0_1_4_2) {
		this.tc_0_1_4_2 = tc_0_1_4_2;
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
	
	@Length(min=0, max=64, message="甲状腺癌治疗前是否在进行 TNM 临床分期长度不能超过 64 个字符")
	public String getTc_1_1_1() {
		return tc_1_1_1;
	}

	public void setTc_1_1_1(String tc_1_1_1) {
		this.tc_1_1_1 = tc_1_1_1;
	}
	
	@Length(min=0, max=64, message="主要有那些临床表现及体征长度不能超过 64 个字符")
	public String getTc_1_1_2() {
		return tc_1_1_2;
	}

	public void setTc_1_1_2(String tc_1_1_2) {
		this.tc_1_1_2 = tc_1_1_2;
	}
	
	@Length(min=0, max=64, message="其他主要有那些临床表现及体征长度不能超过 64 个字符")
	public String getTc_1_1_2_1() {
		return tc_1_1_2_1;
	}

	public void setTc_1_1_2_1(String tc_1_1_2_1) {
		this.tc_1_1_2_1 = tc_1_1_2_1;
	}
	
	@Length(min=0, max=64, message="主要辅助检查长度不能超过 64 个字符")
	public String getTc_1_1_3() {
		return tc_1_1_3;
	}

	public void setTc_1_1_3(String tc_1_1_3) {
		this.tc_1_1_3 = tc_1_1_3;
	}
	
	@Length(min=0, max=64, message="次要辅助检查长度不能超过 64 个字符")
	public String getTc_1_1_4() {
		return tc_1_1_4;
	}

	public void setTc_1_1_4(String tc_1_1_4) {
		this.tc_1_1_4 = tc_1_1_4;
	}
	
	@Length(min=0, max=64, message="其他次要辅助检查长度不能超过 64 个字符")
	public String getTc_1_1_4_1() {
		return tc_1_1_4_1;
	}

	public void setTc_1_1_4_1(String tc_1_1_4_1) {
		this.tc_1_1_4_1 = tc_1_1_4_1;
	}
	
	@Length(min=0, max=64, message="nan长度不能超过 64 个字符")
	public String getTc_1_2_7_r() {
		return tc_1_2_7_r;
	}

	public void setTc_1_2_7_r(String tc_1_2_7_r) {
		this.tc_1_2_7_r = tc_1_2_7_r;
	}
	
	@Length(min=0, max=64, message="患者年龄长度不能超过 64 个字符")
	public String getTc_1_2_1() {
		return tc_1_2_1;
	}

	public void setTc_1_2_1(String tc_1_2_1) {
		this.tc_1_2_1 = tc_1_2_1;
	}
	
	@Length(min=0, max=64, message="T 原肿瘤长度不能超过 64 个字符")
	public String getTc_1_2_2() {
		return tc_1_2_2;
	}

	public void setTc_1_2_2(String tc_1_2_2) {
		this.tc_1_2_2 = tc_1_2_2;
	}
	
	@Length(min=0, max=64, message="N 淋巴结转移长度不能超过 64 个字符")
	public String getTc_1_2_3() {
		return tc_1_2_3;
	}

	public void setTc_1_2_3(String tc_1_2_3) {
		this.tc_1_2_3 = tc_1_2_3;
	}
	
	@Length(min=0, max=64, message="M 远处转移长度不能超过 64 个字符")
	public String getTc_1_2_4() {
		return tc_1_2_4;
	}

	public void setTc_1_2_4(String tc_1_2_4) {
		this.tc_1_2_4 = tc_1_2_4;
	}
	
	@Length(min=0, max=64, message="术前细胞学检查长度不能超过 64 个字符")
	public String getTc_1_2_5() {
		return tc_1_2_5;
	}

	public void setTc_1_2_5(String tc_1_2_5) {
		this.tc_1_2_5 = tc_1_2_5;
	}
	
	@Length(min=0, max=64, message="cTNM 临床分期结果选择长度不能超过 64 个字符")
	public String getTc_1_3_1() {
		return tc_1_3_1;
	}

	public void setTc_1_3_1(String tc_1_3_1) {
		this.tc_1_3_1 = tc_1_3_1;
	}
	
	@Length(min=0, max=64, message="乳头状癌及滤泡癌 患者年龄&lt;55岁长度不能超过 64 个字符")
	public String getTc_1_3_2() {
		return tc_1_3_2;
	}

	public void setTc_1_3_2(String tc_1_3_2) {
		this.tc_1_3_2 = tc_1_3_2;
	}
	
	@Length(min=0, max=64, message="乳头状癌及滤泡癌患者年龄≥55岁长度不能超过 64 个字符")
	public String getTc_1_3_3() {
		return tc_1_3_3;
	}

	public void setTc_1_3_3(String tc_1_3_3) {
		this.tc_1_3_3 = tc_1_3_3;
	}
	
	@Length(min=0, max=64, message="未分化癌 长度不能超过 64 个字符")
	public String getTc_1_3_4() {
		return tc_1_3_4;
	}

	public void setTc_1_3_4(String tc_1_3_4) {
		this.tc_1_3_4 = tc_1_3_4;
	}
	
	@Length(min=0, max=64, message="髓样癌长度不能超过 64 个字符")
	public String getTc_1_3_5() {
		return tc_1_3_5;
	}

	public void setTc_1_3_5(String tc_1_3_5) {
		this.tc_1_3_5 = tc_1_3_5;
	}
	
	@Length(min=0, max=64, message="治疗前是否接受过（MDT）多学科协作诊疗长度不能超过 64 个字符")
	public String getTc_1_4_1() {
		return tc_1_4_1;
	}

	public void setTc_1_4_1(String tc_1_4_1) {
		this.tc_1_4_1 = tc_1_4_1;
	}
	
	@Length(min=0, max=64, message="术前评估有无淋巴结转移长度不能超过 64 个字符")
	public String getTc_2_1_1() {
		return tc_2_1_1;
	}

	public void setTc_2_1_1(String tc_2_1_1) {
		this.tc_2_1_1 = tc_2_1_1;
	}
	
	@Length(min=0, max=64, message="淋巴结转移征象长度不能超过 64 个字符")
	public String getTc_2_1_2() {
		return tc_2_1_2;
	}

	public void setTc_2_1_2(String tc_2_1_2) {
		this.tc_2_1_2 = tc_2_1_2;
	}
	
	@Length(min=0, max=64, message="其他淋巴结转移征象长度不能超过 64 个字符")
	public String getTc_2_1_2_1() {
		return tc_2_1_2_1;
	}

	public void setTc_2_1_2_1(String tc_2_1_2_1) {
		this.tc_2_1_2_1 = tc_2_1_2_1;
	}
	
	@Length(min=0, max=64, message="是否甲状腺癌手术治疗长度不能超过 64 个字符")
	public String getTc_2_2_1() {
		return tc_2_2_1;
	}

	public void setTc_2_2_1(String tc_2_2_1) {
		this.tc_2_2_1 = tc_2_2_1;
	}
	
	@Length(min=0, max=64, message="甲状腺癌再次手术长度不能超过 64 个字符")
	public String getTc_2_3_1() {
		return tc_2_3_1;
	}

	public void setTc_2_3_1(String tc_2_3_1) {
		this.tc_2_3_1 = tc_2_3_1;
	}
	
	@Length(min=0, max=64, message="甲状腺癌再次手术主要原因长度不能超过 64 个字符")
	public String getTc_2_3_2() {
		return tc_2_3_2;
	}

	public void setTc_2_3_2(String tc_2_3_2) {
		this.tc_2_3_2 = tc_2_3_2;
	}
	
	@Length(min=0, max=64, message="其它甲状腺癌再次手术主要原因长度不能超过 64 个字符")
	public String getTc_2_3_2_1() {
		return tc_2_3_2_1;
	}

	public void setTc_2_3_2_1(String tc_2_3_2_1) {
		this.tc_2_3_2_1 = tc_2_3_2_1;
	}
	
	@Length(min=0, max=64, message="甲状腺癌手术治疗方式长度不能超过 64 个字符")
	public String getTc_2_4_1() {
		return tc_2_4_1;
	}

	public void setTc_2_4_1(String tc_2_4_1) {
		this.tc_2_4_1 = tc_2_4_1;
	}
	
	@Length(min=0, max=64, message="其他甲状腺癌手术治疗方式长度不能超过 64 个字符")
	public String getTc_2_4_1_1() {
		return tc_2_4_1_1;
	}

	public void setTc_2_4_1_1(String tc_2_4_1_1) {
		this.tc_2_4_1_1 = tc_2_4_1_1;
	}
	
	@Length(min=0, max=64, message="甲状腺全切除手术适应证的选择长度不能超过 64 个字符")
	public String getTc_2_4_3() {
		return tc_2_4_3;
	}

	public void setTc_2_4_3(String tc_2_4_3) {
		this.tc_2_4_3 = tc_2_4_3;
	}
	
	@Length(min=0, max=64, message="其他甲状腺全切除手术适应证长度不能超过 64 个字符")
	public String getTc_2_4_3_1() {
		return tc_2_4_3_1;
	}

	public void setTc_2_4_3_1(String tc_2_4_3_1) {
		this.tc_2_4_3_1 = tc_2_4_3_1;
	}
	
	@Length(min=0, max=64, message="甲状腺腺叶切除适应证的选择长度不能超过 64 个字符")
	public String getTc_2_4_2() {
		return tc_2_4_2;
	}

	public void setTc_2_4_2(String tc_2_4_2) {
		this.tc_2_4_2 = tc_2_4_2;
	}
	
	@Length(min=0, max=64, message="其他甲状腺腺叶切除适应证长度不能超过 64 个字符")
	public String getTc_2_4_2_1() {
		return tc_2_4_2_1;
	}

	public void setTc_2_4_2_1(String tc_2_4_2_1) {
		this.tc_2_4_2_1 = tc_2_4_2_1;
	}
	
	@Length(min=0, max=64, message="甲状腺全切除+淋巴结清扫手术适应证的选择长度不能超过 64 个字符")
	public String getTc_2_4_4() {
		return tc_2_4_4;
	}

	public void setTc_2_4_4(String tc_2_4_4) {
		this.tc_2_4_4 = tc_2_4_4;
	}
	
	@Length(min=0, max=64, message="其他甲状腺全切除+淋巴结清扫手术适应证长度不能超过 64 个字符")
	public String getTc_2_4_4_1() {
		return tc_2_4_4_1;
	}

	public void setTc_2_4_4_1(String tc_2_4_4_1) {
		this.tc_2_4_4_1 = tc_2_4_4_1;
	}
	
	@Length(min=0, max=64, message="是否进行术中快速病理长度不能超过 64 个字符")
	public String getTc_2_5_1() {
		return tc_2_5_1;
	}

	public void setTc_2_5_1(String tc_2_5_1) {
		this.tc_2_5_1 = tc_2_5_1;
	}
	
	@Length(min=0, max=64, message="术中冰冻病理学检查证实有颈侧区淋巴结转移长度不能超过 64 个字符")
	public String getTc_2_5_2() {
		return tc_2_5_2;
	}

	public void setTc_2_5_2(String tc_2_5_2) {
		this.tc_2_5_2 = tc_2_5_2;
	}
	
	@Length(min=0, max=64, message="清扫淋巴结手术部位长度不能超过 64 个字符")
	public String getTc_2_5_3() {
		return tc_2_5_3;
	}

	public void setTc_2_5_3(String tc_2_5_3) {
		this.tc_2_5_3 = tc_2_5_3;
	}
	
	@Length(min=0, max=64, message="淋巴结清扫范围长度不能超过 64 个字符")
	public String getTc_2_5_4() {
		return tc_2_5_4;
	}

	public void setTc_2_5_4(String tc_2_5_4) {
		this.tc_2_5_4 = tc_2_5_4;
	}
	
	@Length(min=0, max=64, message="其他淋巴结清扫范围长度不能超过 64 个字符")
	public String getTc_2_5_4_1() {
		return tc_2_5_4_1;
	}

	public void setTc_2_5_4_1(String tc_2_5_4_1) {
		this.tc_2_5_4_1 = tc_2_5_4_1;
	}
	
	@Length(min=0, max=64, message="甲状腺手术后特指并发症的选择长度不能超过 64 个字符")
	public String getTc_3_2_2() {
		return tc_3_2_2;
	}

	public void setTc_3_2_2(String tc_3_2_2) {
		this.tc_3_2_2 = tc_3_2_2;
	}
	
	@Length(min=0, max=64, message="其他甲状腺手术后特指并发症长度不能超过 64 个字符")
	public String getTc_3_2_2_1() {
		return tc_3_2_2_1;
	}

	public void setTc_3_2_2_1(String tc_3_2_2_1) {
		this.tc_3_2_2_1 = tc_3_2_2_1;
	}
	
	@Length(min=0, max=64, message="术后病理诊断长度不能超过 64 个字符")
	public String getTc_5_1_1() {
		return tc_5_1_1;
	}

	public void setTc_5_1_1(String tc_5_1_1) {
		this.tc_5_1_1 = tc_5_1_1;
	}
	
	@Length(min=0, max=64, message="病理诊断结论长度不能超过 64 个字符")
	public String getTc_5_1_2_0() {
		return tc_5_1_2_0;
	}

	public void setTc_5_1_2_0(String tc_5_1_2_0) {
		this.tc_5_1_2_0 = tc_5_1_2_0;
	}
	
	@Length(min=0, max=64, message="乳头状甲状腺癌长度不能超过 64 个字符")
	public String getTc_5_1_2() {
		return tc_5_1_2;
	}

	public void setTc_5_1_2(String tc_5_1_2) {
		this.tc_5_1_2 = tc_5_1_2;
	}
	
	@Length(min=0, max=64, message="滤泡性甲状腺癌长度不能超过 64 个字符")
	public String getTc_5_1_3() {
		return tc_5_1_3;
	}

	public void setTc_5_1_3(String tc_5_1_3) {
		this.tc_5_1_3 = tc_5_1_3;
	}
	
	@Length(min=0, max=64, message="乳头状甲状腺癌长度不能超过 64 个字符")
	public String getTc_5_1_4() {
		return tc_5_1_4;
	}

	public void setTc_5_1_4(String tc_5_1_4) {
		this.tc_5_1_4 = tc_5_1_4;
	}
	
	@Length(min=0, max=64, message="乳头状甲状腺癌长度不能超过 64 个字符")
	public String getTc_5_1_5() {
		return tc_5_1_5;
	}

	public void setTc_5_1_5(String tc_5_1_5) {
		this.tc_5_1_5 = tc_5_1_5;
	}
	
	@Length(min=0, max=64, message="滤泡性甲状腺癌长度不能超过 64 个字符")
	public String getTc_5_1_6() {
		return tc_5_1_6;
	}

	public void setTc_5_1_6(String tc_5_1_6) {
		this.tc_5_1_6 = tc_5_1_6;
	}
	
	@Length(min=0, max=64, message="是否进行促甲状腺素长度不能超过 64 个字符")
	public String getTc_5_1_7() {
		return tc_5_1_7;
	}

	public void setTc_5_1_7(String tc_5_1_7) {
		this.tc_5_1_7 = tc_5_1_7;
	}
	
	public Double getTc_5_1_8() {
		return tc_5_1_8;
	}

	public void setTc_5_1_8(Double tc_5_1_8) {
		this.tc_5_1_8 = tc_5_1_8;
	}
	
	@Length(min=0, max=64, message="术后内分泌抑制治疗适应证的选择长度不能超过 64 个字符")
	public String getTc_5_2_1() {
		return tc_5_2_1;
	}

	public void setTc_5_2_1(String tc_5_2_1) {
		this.tc_5_2_1 = tc_5_2_1;
	}
	
	@Length(min=0, max=64, message="其他术后内分泌抑制治疗适应证长度不能超过 64 个字符")
	public String getTc_5_2_1_1() {
		return tc_5_2_1_1;
	}

	public void setTc_5_2_1_1(String tc_5_2_1_1) {
		this.tc_5_2_1_1 = tc_5_2_1_1;
	}
	
	@Length(min=0, max=64, message="是否进行内分泌抑制治疗长度不能超过 64 个字符")
	public String getTc_5_2_2() {
		return tc_5_2_2;
	}

	public void setTc_5_2_2(String tc_5_2_2) {
		this.tc_5_2_2 = tc_5_2_2;
	}
	
	@Length(min=0, max=64, message="促甲状腺素长度不能超过 64 个字符")
	public String getTc_5_2_3() {
		return tc_5_2_3;
	}

	public void setTc_5_2_3(String tc_5_2_3) {
		this.tc_5_2_3 = tc_5_2_3;
	}
	
	@Length(min=0, max=64, message="其他促甲状腺素长度不能超过 64 个字符")
	public String getTc_5_2_3_1() {
		return tc_5_2_3_1;
	}

	public void setTc_5_2_3_1(String tc_5_2_3_1) {
		this.tc_5_2_3_1 = tc_5_2_3_1;
	}
	
	@Length(min=0, max=64, message="治疗并发症的选择长度不能超过 64 个字符")
	public String getTc_5_2_4() {
		return tc_5_2_4;
	}

	public void setTc_5_2_4(String tc_5_2_4) {
		this.tc_5_2_4 = tc_5_2_4;
	}
	
	@Length(min=0, max=64, message="其他治疗并发症长度不能超过 64 个字符")
	public String getTc_5_2_4_1() {
		return tc_5_2_4_1;
	}

	public void setTc_5_2_4_1(String tc_5_2_4_1) {
		this.tc_5_2_4_1 = tc_5_2_4_1;
	}
	
	@Length(min=0, max=64, message="术后核素治疗适应证的选择长度不能超过 64 个字符")
	public String getTc_5_2_5() {
		return tc_5_2_5;
	}

	public void setTc_5_2_5(String tc_5_2_5) {
		this.tc_5_2_5 = tc_5_2_5;
	}
	
	@Length(min=0, max=64, message="其他术后核素治疗适应证长度不能超过 64 个字符")
	public String getTc_5_2_5_1() {
		return tc_5_2_5_1;
	}

	public void setTc_5_2_5_1(String tc_5_2_5_1) {
		this.tc_5_2_5_1 = tc_5_2_5_1;
	}
	
	@Length(min=0, max=64, message="是否进行术后核素治疗长度不能超过 64 个字符")
	public String getTc_5_2_6() {
		return tc_5_2_6;
	}

	public void setTc_5_2_6(String tc_5_2_6) {
		this.tc_5_2_6 = tc_5_2_6;
	}
	
	@Length(min=0, max=64, message="是否输血长度不能超过 64 个字符")
	public String getTc_6_1() {
		return tc_6_1;
	}

	public void setTc_6_1(String tc_6_1) {
		this.tc_6_1 = tc_6_1;
	}
	
	public Double getTc_6_1_1() {
		return tc_6_1_1;
	}

	public void setTc_6_1_1(Double tc_6_1_1) {
		this.tc_6_1_1 = tc_6_1_1;
	}
	
	public Double getTc_6_1_2() {
		return tc_6_1_2;
	}

	public void setTc_6_1_2(Double tc_6_1_2) {
		this.tc_6_1_2 = tc_6_1_2;
	}
	
	public Double getTc_6_2_1() {
		return tc_6_2_1;
	}

	public void setTc_6_2_1(Double tc_6_2_1) {
		this.tc_6_2_1 = tc_6_2_1;
	}
	
	public Double getTc_6_2_2() {
		return tc_6_2_2;
	}

	public void setTc_6_2_2(Double tc_6_2_2) {
		this.tc_6_2_2 = tc_6_2_2;
	}
	
	@Length(min=0, max=64, message="是否进行甲状腺复发风险评估长度不能超过 64 个字符")
	public String getTc_7_2_1() {
		return tc_7_2_1;
	}

	public void setTc_7_2_1(String tc_7_2_1) {
		this.tc_7_2_1 = tc_7_2_1;
	}
	
	@Length(min=0, max=64, message="告知甲状腺癌复发风险评估结果长度不能超过 64 个字符")
	public String getTc_7_2_2() {
		return tc_7_2_2;
	}

	public void setTc_7_2_2(String tc_7_2_2) {
		this.tc_7_2_2 = tc_7_2_2;
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
	
	@Length(min=0, max=32, message="其他ICD-9-CM-3四位亚目编码与名称长度不能超过 32 个字符")
	public String getCm01411() {
		return cm01411;
	}

	public void setCm01411(String cm01411) {
		this.cm01411 = cm01411;
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
	
	@Length(min=0, max=32, message="其他ICD-9-CM-3六位临床扩展编码与名称长度不能超过 32 个字符")
	public String getCm01421() {
		return cm01421;
	}

	public void setCm01421(String cm01421) {
		this.cm01421 = cm01421;
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