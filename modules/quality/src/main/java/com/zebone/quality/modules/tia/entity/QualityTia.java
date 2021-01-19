/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.tia.entity;

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
 * TIA短暂性脑缺血发作Entity
 * @author 卡卡西
 * @version 2021-01-16
 */
@Table(name="quality_tia", alias="a", columns={
		@Column(name="cm_0_1_1_1", attrName="cm_0_1_1_1", label="质控医师"),
		@Column(name="cm_0_1_1_2", attrName="cm_0_1_1_2", label="质控护士"),
		@Column(name="cm_0_1_1_3", attrName="cm_0_1_1_3", label="主治医师"),
		@Column(name="cm_0_1_1_4", attrName="cm_0_1_1_4", label="责任护士"),
		@Column(name="cm_0_1_1_5", attrName="cm_0_1_1_5", label="上报科室"),
		@Column(name="case_id", attrName="caseId", label="患者病案号"),
		@Column(name="cm_0_1_3_1", attrName="cm_0_1_3_1", label="主要诊断ICD-10四位亚目编码与名称"),
		@Column(name="cm_0_1_3_2", attrName="cm_0_1_3_2", label="主要诊断ICD-10六位临床扩展编码与名称"),
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
		@Column(name="cm_0_3_1", attrName="cm_0_3_1", label="费用支付方式"),
		@Column(includeEntity=DataEntity.class),
		@Column(name="cm_0_3_2", attrName="cm_0_3_2", label="收入住院途径"),
		@Column(name="cm_0_3_3", attrName="cm_0_3_3", label="到院交通工具"),
		@Column(name="tia_1_1_2_1", attrName="tia_1_1_2_1", label="评估日期时间"),
		@Column(name="tia_1_1_3", attrName="tia_1_1_3", label="是否实施ABCD/2/3/3-I评分"),
		@Column(name="tia_1_1_4", attrName="tia_1_1_4", label="选择评估分值实施类型"),
		@Column(name="tia_1_1_4_1_0", attrName="tia_1_1_4_1_0", label="ABCD评估分值"),
		@Column(name="tia_1_1_4_1_1", attrName="tia_1_1_4_1_1", label="ABCD2评估分值"),
		@Column(name="tia_1_1_4_2_1", attrName="tia_1_1_4_2_1", label="ABCD3评估分值"),
		@Column(name="tia_1_1_4_3_1", attrName="tia_1_1_4_3_1", label="ABCD3-I评估分值"),
		@Column(name="tia_1_1_4_5", attrName="tia_1_1_4_5", label="ABCD2/3/3-I 评估风险分层"),
		@Column(name="tia_1_2_1_1", attrName="tia_1_2_1_1", label="是否实施首次头部影像学检查"),
		@Column(name="tia_1_2_1_2", attrName="tia_1_2_1_2", label="头部影像学检查项目"),
		@Column(name="tia_1_2_1_4", attrName="tia_1_2_1_4", label="其他头部影像学检查项目"),
		@Column(name="tia_1_2_1_3_1", attrName="tia_1_2_1_3_1", label="报告日期时间"),
		@Column(name="tia_1_2_2_1", attrName="tia_1_2_2_1", label="是否实施首次全血细胞计数检查"),
		@Column(name="tia_1_2_2_2_1", attrName="tia_1_2_2_2_1", label="报告日期时间"),
		@Column(name="tia_1_2_3_1", attrName="tia_1_2_3_1", label="是否实施首次凝血功能检查"),
		@Column(name="tia_1_2_3_2_1", attrName="tia_1_2_3_2_1", label="凝血功能检查项目"),
		@Column(name="tia_1_2_3_3_1", attrName="tia_1_2_3_3_1", label="报告日期时间"),
		@Column(name="tia_1_2_4_1", attrName="tia_1_2_4_1", label="是否实施首次生化检验检查"),
		@Column(name="tia_1_2_4_2_1", attrName="tia_1_2_4_2_1", label="生化检验项目"),
		@Column(name="tia_1_2_4_3_1", attrName="tia_1_2_4_3_1", label="报告日期时间"),
		@Column(name="tia_1_2_5_1", attrName="tia_1_2_5_1", label="是否实施首次ECG检查"),
		@Column(name="tia_1_2_5_2_1", attrName="tia_1_2_5_2_1", label="报告日期时间"),
		@Column(name="tia_1_2_5_3", attrName="tia_1_2_5_3", label="心电图", comment="心电图（ECG）检查结果"),
		@Column(name="tia_1_2_6_1", attrName="tia_1_2_6_1", label="是否实施首次心脏与血管检查"),
		@Column(name="tia_1_2_6_3", attrName="tia_1_2_6_3", label="心脏检查相关项目选择"),
		@Column(name="tia_1_2_6_3_1", attrName="tia_1_2_6_3_1", label="其他心脏检查项目"),
		@Column(name="tia_1_2_6_5", attrName="tia_1_2_6_5", label="血管检查相关项目选择"),
		@Column(name="tia_1_2_6_5_1", attrName="tia_1_2_6_5_1", label="其他血管检查相关项目"),
		@Column(name="tia_1_2_6_2_1", attrName="tia_1_2_6_2_1", label="首次报告日期时间"),
		@Column(name="tia_1_2_6_4", attrName="tia_1_2_6_4", label="评估结论"),
		@Column(name="tia_1_2_6_4_1", attrName="tia_1_2_6_4_1", label="其他评估结论"),
		@Column(name="tia_1_3", attrName="tia_1_3", label="收入院诊疗指症"),
		@Column(name="tia_2_1_1_1", attrName="tia_2_1_1_1", label="房颤患者"),
		@Column(name="tia_2_1_1", attrName="tia_2_1_1", label="是否实施房颤患者脑卒中风险评估", comment="是否实施房颤患者脑卒中风险评估（CHA2DS2-VASc评分）"),
		@Column(name="tia_2_1_2_1", attrName="tia_2_1_2_1", label="房颤患者脑卒中风险评估分值"),
		@Column(name="tia_2_2_1", attrName="tia_2_2_1", label="是否实施房颤症状严重程度EHRA评估"),
		@Column(name="tia_2_2_2", attrName="tia_2_2_2", label="房颤症状严重程度EHRA评估结果"),
		@Column(name="tia_2_3_1", attrName="tia_2_3_1", label="是否有使用抗凝药物的禁忌症"),
		@Column(name="tia_2_3_2", attrName="tia_2_3_2", label="使用抗凝药物的禁忌症"),
		@Column(name="tia_2_4_1", attrName="tia_2_4_1", label="是否常用抗凝药物"),
		@Column(name="tia_2_4_2", attrName="tia_2_4_2", label="抗凝药物"),
		@Column(name="tia_2_4_3", attrName="tia_2_4_3", label="用药日期时间"),
		@Column(name="tia_3_1_1_1", attrName="tia_3_1_1_1", label="高卒中复发风险因素"),
		@Column(name="tia_3_1_1_2", attrName="tia_3_1_1_2", label="其他高卒中复发风险因素"),
		@Column(name="tia_3_1_1", attrName="tia_3_1_1", label="是否有使用阿司匹林禁忌症"),
		@Column(name="tia_3_1_2", attrName="tia_3_1_2", label="阿司匹林禁忌症"),
		@Column(name="tia_3_2_1", attrName="tia_3_2_1", label="患者是否使用首剂阿司匹林/氯吡格雷"),
		@Column(name="tia_3_2_2_1", attrName="tia_3_2_2_1", label="用药日期时间"),
		@Column(name="tia_3_3", attrName="tia_3_3", label="选择药物"),
		@Column(name="tia_3_3_1", attrName="tia_3_3_1", label="其他抗血小板药物"),
		@Column(name="tia_4_1_1", attrName="tia_4_1_1", label="患者评估时机选择"),
		@Column(name="tia_4_1_2_1", attrName="tia_4_1_2_1", label="评估日期"),
		@Column(name="tia_4_2_1", attrName="tia_4_2_1", label="选择血脂评估项目"),
		@Column(name="tia_4_3", attrName="tia_4_3", label="评价血脂水平"),
		@Column(name="tia_4_4_0", attrName="tia_4_4_0", label="是否使用他汀类药物"),
		@Column(name="tia_4_4_1_1", attrName="tia_4_4_1_1", label="首次使用他汀类医嘱的日期"),
		@Column(name="tia_4_4_2", attrName="tia_4_4_2", label="他汀类药物"),
		@Column(name="tia_5_1", attrName="tia_5_1", label="选择抗血小扳聚集治疗药物"),
		@Column(name="tia_5_1_1", attrName="tia_5_1_1", label="其他抗血小扳聚集治疗药物"),
		@Column(name="tia_5_2", attrName="tia_5_2", label="他汀类药物"),
		@Column(name="tia_5_3", attrName="tia_5_3", label="选择抗凝药物"),
		@Column(name="tia_5_4_1", attrName="tia_5_4_1", label="患者是否伴发糖尿病"),
		@Column(name="tia_5_4", attrName="tia_5_4", label="选择降糖药物"),
		@Column(name="tia_5_4_2", attrName="tia_5_4_2", label="其他降糖药物"),
		@Column(name="tia_5_5_1", attrName="tia_5_5_1", label="患者是否伴发高血压"),
		@Column(name="tia_5_5", attrName="tia_5_5", label="选择降压药物"),
		@Column(name="tia_5_5_2", attrName="tia_5_5_2", label="其他降压药物"),
		@Column(name="tia_6_1_1", attrName="tia_6_1_1", label="行走评估结果"),
		@Column(name="tia_6_1_2", attrName="tia_6_1_2", label="呼吸评估结果"),
		@Column(name="tia_6_1_3", attrName="tia_6_1_3", label="饮食评估结果"),
		@Column(name="tia_6_2_1", attrName="tia_6_2_1", label="实施卒中健康教育有记录"),
		@Column(name="tia_6_3_1", attrName="tia_6_3_1", label="吸烟史"),
		@Column(name="tia_6_3_2", attrName="tia_6_3_2", label="吸烟程度评估有记录"),
		@Column(name="tia_6_3_3", attrName="tia_6_3_3", label="接受戒烟的建议或者戒烟治疗有记录"),
		@Column(name="tia_7_1", attrName="tia_7_1", label="血管功能评估时间"),
		@Column(name="tia_7_2", attrName="tia_7_2", label="血管功能评估方法"),
		@Column(name="tia_9_1_1", attrName="tia_9_1_1", label="出院时是否进行Essen卒中风险评分"),
		@Column(name="tia_9_1_2_1", attrName="tia_9_1_2_1", label="Essen卒中风险评分值"),
		@Column(name="tia_9_2_1", attrName="tia_9_2_1", label="主要风险因素评估"),
		@Column(name="tia_9_2_1_1", attrName="tia_9_2_1_1", label="其他主要风险因素填写"),
		@Column(name="tia_9_2_2", attrName="tia_9_2_2", label="其他风险因素评估"),
		@Column(name="tia_9_2_2_1", attrName="tia_9_2_2_1", label="其他风险因素填写"),
		@Column(name="tia_9_3_1", attrName="tia_9_3_1", label="交与患者“出院小结”的副本告知患者出院时风险因素"),
		@Column(name="tia_9_3_2", attrName="tia_9_3_2", label="出院带药"),
		@Column(name="tia_9_3_3", attrName="tia_9_3_3", label="告知发生紧急情况时求援救治途径"),
		@Column(name="tia_9_3_4", attrName="tia_9_3_4", label="出院时教育与随访"),
		@Column(name="tia_9_3_5", attrName="tia_9_3_5", label="告知何为风险因素与紧急情况"),
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
		@Column(name="cm_0_1_4_1", attrName="cm0141", label="主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称"),
		@Column(name="cm_0_1_4_1_1", attrName="cm01411", label="其他ICD-9-CM-3四位亚目编码与名称"),
		@Column(name="cm_0_1_4_2", attrName="cm0142", label="主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称"),
		@Column(name="cm_0_1_4_2_1", attrName="cm01421", label="其他ICD-9-CM-3六位临床扩展编码与名称"),
		@Column(name="cm_0_2_5_1", attrName="cm0251", label="入住CCU日期时间"),
		@Column(name="cm_0_2_5_2", attrName="cm0252", label="离开CCU日期时间"),
		@Column(name="cm_0_2_6_1", attrName="cm0261", label="手术开始", comment="手术开始（切皮）日期时间"),
		@Column(name="cm_0_2_6_2", attrName="cm0262", label="手术结束", comment="手术结束（缝皮结束）日期时间"),
		@Column(name="cm_3_1", attrName="cm31", label="手术野皮肤准备常用方法的选择"),
		@Column(name="cm_3_2", attrName="cm32", label="使用含抗菌剂", comment="使用含抗菌剂（三氯生）缝线"),
		@Column(name="cm_3_2_1", attrName="cm321", label="其他含抗菌剂缝线填写"),
		@Column(name="cm_3_3", attrName="cm33", label="手术切口类别的选择"),
		@Column(name="cm_3_4", attrName="cm34", label="手术切口愈合情况的选择"),
		@Column(name="id", attrName="id", label="id", isPK=true),
	}, orderBy="a.update_date DESC"
)
public class QualityTia extends DataEntity<QualityTia> {
	
	private static final long serialVersionUID = 1L;
	private String cm_0_1_1_1;		// 质控医师
	private String cm_0_1_1_2;		// 质控护士
	private String cm_0_1_1_3;		// 主治医师
	private String cm_0_1_1_4;		// 责任护士
	private String cm_0_1_1_5;		// 上报科室
	private String caseId;		// 患者病案号
	private String cm_0_1_3_1;		// 主要诊断ICD-10四位亚目编码与名称
	private String cm_0_1_3_2;		// 主要诊断ICD-10六位临床扩展编码与名称
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
	private String cm_0_3_1;		// 费用支付方式
	private String cm_0_3_2;		// 收入住院途径
	private String cm_0_3_3;		// 到院交通工具
	private String tia_1_1_2_1;		// 评估日期时间
	private String tia_1_1_3;		// 是否实施ABCD/2/3/3-I评分
	private String tia_1_1_4;		// 选择评估分值实施类型
	private Double tia_1_1_4_1_0;		// ABCD评估分值
	private Double tia_1_1_4_1_1;		// ABCD2评估分值
	private Double tia_1_1_4_2_1;		// ABCD3评估分值
	private Double tia_1_1_4_3_1;		// ABCD3-I评估分值
	private String tia_1_1_4_5;		// ABCD2/3/3-I 评估风险分层
	private String tia_1_2_1_1;		// 是否实施首次头部影像学检查
	private String tia_1_2_1_2;		// 头部影像学检查项目
	private String tia_1_2_1_4;		// 其他头部影像学检查项目
	private String tia_1_2_1_3_1;		// 报告日期时间
	private String tia_1_2_2_1;		// 是否实施首次全血细胞计数检查
	private String tia_1_2_2_2_1;		// 报告日期时间
	private String tia_1_2_3_1;		// 是否实施首次凝血功能检查
	private String tia_1_2_3_2_1;		// 凝血功能检查项目
	private String tia_1_2_3_3_1;		// 报告日期时间
	private String tia_1_2_4_1;		// 是否实施首次生化检验检查
	private String tia_1_2_4_2_1;		// 生化检验项目
	private String tia_1_2_4_3_1;		// 报告日期时间
	private String tia_1_2_5_1;		// 是否实施首次ECG检查
	private String tia_1_2_5_2_1;		// 报告日期时间
	private String tia_1_2_5_3;		// 心电图（ECG）检查结果
	private String tia_1_2_6_1;		// 是否实施首次心脏与血管检查
	private String tia_1_2_6_3;		// 心脏检查相关项目选择
	private String tia_1_2_6_3_1;		// 其他心脏检查项目
	private String tia_1_2_6_5;		// 血管检查相关项目选择
	private String tia_1_2_6_5_1;		// 其他血管检查相关项目
	private String tia_1_2_6_2_1;		// 首次报告日期时间
	private String tia_1_2_6_4;		// 评估结论
	private String tia_1_2_6_4_1;		// 其他评估结论
	private String tia_1_3;		// 收入院诊疗指症
	private String tia_2_1_1_1;		// 房颤患者
	private String tia_2_1_1;		// 是否实施房颤患者脑卒中风险评估（CHA2DS2-VASc评分）
	private Double tia_2_1_2_1;		// 房颤患者脑卒中风险评估分值
	private String tia_2_2_1;		// 是否实施房颤症状严重程度EHRA评估
	private String tia_2_2_2;		// 房颤症状严重程度EHRA评估结果
	private String tia_2_3_1;		// 是否有使用抗凝药物的禁忌症
	private String tia_2_3_2;		// 使用抗凝药物的禁忌症
	private String tia_2_4_1;		// 是否常用抗凝药物
	private String tia_2_4_2;		// 抗凝药物
	private String tia_2_4_3;		// 用药日期时间
	private String tia_3_1_1_1;		// 高卒中复发风险因素
	private String tia_3_1_1_2;		// 其他高卒中复发风险因素
	private String tia_3_1_1;		// 是否有使用阿司匹林禁忌症
	private String tia_3_1_2;		// 阿司匹林禁忌症
	private String tia_3_2_1;		// 患者是否使用首剂阿司匹林/氯吡格雷
	private String tia_3_2_2_1;		// 用药日期时间
	private String tia_3_3;		// 选择药物
	private String tia_3_3_1;		// 其他抗血小板药物
	private String tia_4_1_1;		// 患者评估时机选择
	private String tia_4_1_2_1;		// 评估日期
	private String tia_4_2_1;		// 选择血脂评估项目
	private String tia_4_3;		// 评价血脂水平
	private String tia_4_4_0;		// 是否使用他汀类药物
	private String tia_4_4_1_1;		// 首次使用他汀类医嘱的日期
	private String tia_4_4_2;		// 他汀类药物
	private String tia_5_1;		// 选择抗血小扳聚集治疗药物
	private String tia_5_1_1;		// 其他抗血小扳聚集治疗药物
	private String tia_5_2;		// 他汀类药物
	private String tia_5_3;		// 选择抗凝药物
	private String tia_5_4_1;		// 患者是否伴发糖尿病
	private String tia_5_4;		// 选择降糖药物
	private String tia_5_4_2;		// 其他降糖药物
	private String tia_5_5_1;		// 患者是否伴发高血压
	private String tia_5_5;		// 选择降压药物
	private String tia_5_5_2;		// 其他降压药物
	private String tia_6_1_1;		// 行走评估结果
	private String tia_6_1_2;		// 呼吸评估结果
	private String tia_6_1_3;		// 饮食评估结果
	private String tia_6_2_1;		// 实施卒中健康教育有记录
	private String tia_6_3_1;		// 吸烟史
	private String tia_6_3_2;		// 吸烟程度评估有记录
	private String tia_6_3_3;		// 接受戒烟的建议或者戒烟治疗有记录
	private String tia_7_1;		// 血管功能评估时间
	private String tia_7_2;		// 血管功能评估方法
	private String tia_9_1_1;		// 出院时是否进行Essen卒中风险评分
	private Double tia_9_1_2_1;		// Essen卒中风险评分值
	private String tia_9_2_1;		// 主要风险因素评估
	private String tia_9_2_1_1;		// 其他主要风险因素填写
	private String tia_9_2_2;		// 其他风险因素评估
	private String tia_9_2_2_1;		// 其他风险因素填写
	private String tia_9_3_1;		// 交与患者“出院小结”的副本告知患者出院时风险因素
	private String tia_9_3_2;		// 出院带药
	private String tia_9_3_3;		// 告知发生紧急情况时求援救治途径
	private String tia_9_3_4;		// 出院时教育与随访
	private String tia_9_3_5;		// 告知何为风险因素与紧急情况
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
	private String cm0141;		// 主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称
	private String cm01411;		// 其他ICD-9-CM-3四位亚目编码与名称
	private String cm0142;		// 主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称
	private String cm01421;		// 其他ICD-9-CM-3六位临床扩展编码与名称
	private Date cm0251;		// 入住CCU日期时间
	private Date cm0252;		// 离开CCU日期时间
	private Date cm0261;		// 手术开始（切皮）日期时间
	private Date cm0262;		// 手术结束（缝皮结束）日期时间
	private String cm31;		// 手术野皮肤准备常用方法的选择
	private String cm32;		// 使用含抗菌剂（三氯生）缝线
	private String cm321;		// 其他含抗菌剂缝线填写
	private String cm33;		// 手术切口类别的选择
	private String cm34;		// 手术切口愈合情况的选择
	
	public QualityTia() {
		this(null);
	}

	public QualityTia(String id){
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
	
	@Length(min=0, max=32, message="评估日期时间长度不能超过 32 个字符")
	public String getTia_1_1_2_1() {
		return tia_1_1_2_1;
	}

	public void setTia_1_1_2_1(String tia_1_1_2_1) {
		this.tia_1_1_2_1 = tia_1_1_2_1;
	}
	
	@Length(min=0, max=32, message="是否实施ABCD/2/3/3-I评分长度不能超过 32 个字符")
	public String getTia_1_1_3() {
		return tia_1_1_3;
	}

	public void setTia_1_1_3(String tia_1_1_3) {
		this.tia_1_1_3 = tia_1_1_3;
	}
	
	@Length(min=0, max=32, message="选择评估分值实施类型长度不能超过 32 个字符")
	public String getTia_1_1_4() {
		return tia_1_1_4;
	}

	public void setTia_1_1_4(String tia_1_1_4) {
		this.tia_1_1_4 = tia_1_1_4;
	}
	
	public Double getTia_1_1_4_1_0() {
		return tia_1_1_4_1_0;
	}

	public void setTia_1_1_4_1_0(Double tia_1_1_4_1_0) {
		this.tia_1_1_4_1_0 = tia_1_1_4_1_0;
	}
	
	public Double getTia_1_1_4_1_1() {
		return tia_1_1_4_1_1;
	}

	public void setTia_1_1_4_1_1(Double tia_1_1_4_1_1) {
		this.tia_1_1_4_1_1 = tia_1_1_4_1_1;
	}
	
	public Double getTia_1_1_4_2_1() {
		return tia_1_1_4_2_1;
	}

	public void setTia_1_1_4_2_1(Double tia_1_1_4_2_1) {
		this.tia_1_1_4_2_1 = tia_1_1_4_2_1;
	}
	
	public Double getTia_1_1_4_3_1() {
		return tia_1_1_4_3_1;
	}

	public void setTia_1_1_4_3_1(Double tia_1_1_4_3_1) {
		this.tia_1_1_4_3_1 = tia_1_1_4_3_1;
	}
	
	@Length(min=0, max=32, message="ABCD2/3/3-I 评估风险分层长度不能超过 32 个字符")
	public String getTia_1_1_4_5() {
		return tia_1_1_4_5;
	}

	public void setTia_1_1_4_5(String tia_1_1_4_5) {
		this.tia_1_1_4_5 = tia_1_1_4_5;
	}
	
	@Length(min=0, max=32, message="是否实施首次头部影像学检查长度不能超过 32 个字符")
	public String getTia_1_2_1_1() {
		return tia_1_2_1_1;
	}

	public void setTia_1_2_1_1(String tia_1_2_1_1) {
		this.tia_1_2_1_1 = tia_1_2_1_1;
	}
	
	@Length(min=0, max=32, message="头部影像学检查项目长度不能超过 32 个字符")
	public String getTia_1_2_1_2() {
		return tia_1_2_1_2;
	}

	public void setTia_1_2_1_2(String tia_1_2_1_2) {
		this.tia_1_2_1_2 = tia_1_2_1_2;
	}
	
	@Length(min=0, max=32, message="其他头部影像学检查项目长度不能超过 32 个字符")
	public String getTia_1_2_1_4() {
		return tia_1_2_1_4;
	}

	public void setTia_1_2_1_4(String tia_1_2_1_4) {
		this.tia_1_2_1_4 = tia_1_2_1_4;
	}
	
	@Length(min=0, max=32, message="报告日期时间长度不能超过 32 个字符")
	public String getTia_1_2_1_3_1() {
		return tia_1_2_1_3_1;
	}

	public void setTia_1_2_1_3_1(String tia_1_2_1_3_1) {
		this.tia_1_2_1_3_1 = tia_1_2_1_3_1;
	}
	
	@Length(min=0, max=32, message="是否实施首次全血细胞计数检查长度不能超过 32 个字符")
	public String getTia_1_2_2_1() {
		return tia_1_2_2_1;
	}

	public void setTia_1_2_2_1(String tia_1_2_2_1) {
		this.tia_1_2_2_1 = tia_1_2_2_1;
	}
	
	@Length(min=0, max=32, message="报告日期时间长度不能超过 32 个字符")
	public String getTia_1_2_2_2_1() {
		return tia_1_2_2_2_1;
	}

	public void setTia_1_2_2_2_1(String tia_1_2_2_2_1) {
		this.tia_1_2_2_2_1 = tia_1_2_2_2_1;
	}
	
	@Length(min=0, max=32, message="是否实施首次凝血功能检查长度不能超过 32 个字符")
	public String getTia_1_2_3_1() {
		return tia_1_2_3_1;
	}

	public void setTia_1_2_3_1(String tia_1_2_3_1) {
		this.tia_1_2_3_1 = tia_1_2_3_1;
	}
	
	@Length(min=0, max=32, message="凝血功能检查项目长度不能超过 32 个字符")
	public String getTia_1_2_3_2_1() {
		return tia_1_2_3_2_1;
	}

	public void setTia_1_2_3_2_1(String tia_1_2_3_2_1) {
		this.tia_1_2_3_2_1 = tia_1_2_3_2_1;
	}
	
	@Length(min=0, max=32, message="报告日期时间长度不能超过 32 个字符")
	public String getTia_1_2_3_3_1() {
		return tia_1_2_3_3_1;
	}

	public void setTia_1_2_3_3_1(String tia_1_2_3_3_1) {
		this.tia_1_2_3_3_1 = tia_1_2_3_3_1;
	}
	
	@Length(min=0, max=32, message="是否实施首次生化检验检查长度不能超过 32 个字符")
	public String getTia_1_2_4_1() {
		return tia_1_2_4_1;
	}

	public void setTia_1_2_4_1(String tia_1_2_4_1) {
		this.tia_1_2_4_1 = tia_1_2_4_1;
	}
	
	@Length(min=0, max=32, message="生化检验项目长度不能超过 32 个字符")
	public String getTia_1_2_4_2_1() {
		return tia_1_2_4_2_1;
	}

	public void setTia_1_2_4_2_1(String tia_1_2_4_2_1) {
		this.tia_1_2_4_2_1 = tia_1_2_4_2_1;
	}
	
	@Length(min=0, max=32, message="报告日期时间长度不能超过 32 个字符")
	public String getTia_1_2_4_3_1() {
		return tia_1_2_4_3_1;
	}

	public void setTia_1_2_4_3_1(String tia_1_2_4_3_1) {
		this.tia_1_2_4_3_1 = tia_1_2_4_3_1;
	}
	
	@Length(min=0, max=32, message="是否实施首次ECG检查长度不能超过 32 个字符")
	public String getTia_1_2_5_1() {
		return tia_1_2_5_1;
	}

	public void setTia_1_2_5_1(String tia_1_2_5_1) {
		this.tia_1_2_5_1 = tia_1_2_5_1;
	}
	
	@Length(min=0, max=32, message="报告日期时间长度不能超过 32 个字符")
	public String getTia_1_2_5_2_1() {
		return tia_1_2_5_2_1;
	}

	public void setTia_1_2_5_2_1(String tia_1_2_5_2_1) {
		this.tia_1_2_5_2_1 = tia_1_2_5_2_1;
	}
	
	@Length(min=0, max=32, message="心电图长度不能超过 32 个字符")
	public String getTia_1_2_5_3() {
		return tia_1_2_5_3;
	}

	public void setTia_1_2_5_3(String tia_1_2_5_3) {
		this.tia_1_2_5_3 = tia_1_2_5_3;
	}
	
	@Length(min=0, max=32, message="是否实施首次心脏与血管检查长度不能超过 32 个字符")
	public String getTia_1_2_6_1() {
		return tia_1_2_6_1;
	}

	public void setTia_1_2_6_1(String tia_1_2_6_1) {
		this.tia_1_2_6_1 = tia_1_2_6_1;
	}
	
	@Length(min=0, max=32, message="心脏检查相关项目选择长度不能超过 32 个字符")
	public String getTia_1_2_6_3() {
		return tia_1_2_6_3;
	}

	public void setTia_1_2_6_3(String tia_1_2_6_3) {
		this.tia_1_2_6_3 = tia_1_2_6_3;
	}
	
	@Length(min=0, max=32, message="其他心脏检查项目长度不能超过 32 个字符")
	public String getTia_1_2_6_3_1() {
		return tia_1_2_6_3_1;
	}

	public void setTia_1_2_6_3_1(String tia_1_2_6_3_1) {
		this.tia_1_2_6_3_1 = tia_1_2_6_3_1;
	}
	
	@Length(min=0, max=32, message="血管检查相关项目选择长度不能超过 32 个字符")
	public String getTia_1_2_6_5() {
		return tia_1_2_6_5;
	}

	public void setTia_1_2_6_5(String tia_1_2_6_5) {
		this.tia_1_2_6_5 = tia_1_2_6_5;
	}
	
	@Length(min=0, max=32, message="其他血管检查相关项目长度不能超过 32 个字符")
	public String getTia_1_2_6_5_1() {
		return tia_1_2_6_5_1;
	}

	public void setTia_1_2_6_5_1(String tia_1_2_6_5_1) {
		this.tia_1_2_6_5_1 = tia_1_2_6_5_1;
	}
	
	@Length(min=0, max=32, message="首次报告日期时间长度不能超过 32 个字符")
	public String getTia_1_2_6_2_1() {
		return tia_1_2_6_2_1;
	}

	public void setTia_1_2_6_2_1(String tia_1_2_6_2_1) {
		this.tia_1_2_6_2_1 = tia_1_2_6_2_1;
	}
	
	@Length(min=0, max=32, message="评估结论长度不能超过 32 个字符")
	public String getTia_1_2_6_4() {
		return tia_1_2_6_4;
	}

	public void setTia_1_2_6_4(String tia_1_2_6_4) {
		this.tia_1_2_6_4 = tia_1_2_6_4;
	}
	
	@Length(min=0, max=32, message="其他评估结论长度不能超过 32 个字符")
	public String getTia_1_2_6_4_1() {
		return tia_1_2_6_4_1;
	}

	public void setTia_1_2_6_4_1(String tia_1_2_6_4_1) {
		this.tia_1_2_6_4_1 = tia_1_2_6_4_1;
	}
	
	@Length(min=0, max=32, message="收入院诊疗指症长度不能超过 32 个字符")
	public String getTia_1_3() {
		return tia_1_3;
	}

	public void setTia_1_3(String tia_1_3) {
		this.tia_1_3 = tia_1_3;
	}
	
	@Length(min=0, max=32, message="房颤患者长度不能超过 32 个字符")
	public String getTia_2_1_1_1() {
		return tia_2_1_1_1;
	}

	public void setTia_2_1_1_1(String tia_2_1_1_1) {
		this.tia_2_1_1_1 = tia_2_1_1_1;
	}
	
	@Length(min=0, max=32, message="是否实施房颤患者脑卒中风险评估长度不能超过 32 个字符")
	public String getTia_2_1_1() {
		return tia_2_1_1;
	}

	public void setTia_2_1_1(String tia_2_1_1) {
		this.tia_2_1_1 = tia_2_1_1;
	}
	
	public Double getTia_2_1_2_1() {
		return tia_2_1_2_1;
	}

	public void setTia_2_1_2_1(Double tia_2_1_2_1) {
		this.tia_2_1_2_1 = tia_2_1_2_1;
	}
	
	@Length(min=0, max=32, message="是否实施房颤症状严重程度EHRA评估长度不能超过 32 个字符")
	public String getTia_2_2_1() {
		return tia_2_2_1;
	}

	public void setTia_2_2_1(String tia_2_2_1) {
		this.tia_2_2_1 = tia_2_2_1;
	}
	
	@Length(min=0, max=32, message="房颤症状严重程度EHRA评估结果长度不能超过 32 个字符")
	public String getTia_2_2_2() {
		return tia_2_2_2;
	}

	public void setTia_2_2_2(String tia_2_2_2) {
		this.tia_2_2_2 = tia_2_2_2;
	}
	
	@Length(min=0, max=32, message="是否有使用抗凝药物的禁忌症长度不能超过 32 个字符")
	public String getTia_2_3_1() {
		return tia_2_3_1;
	}

	public void setTia_2_3_1(String tia_2_3_1) {
		this.tia_2_3_1 = tia_2_3_1;
	}
	
	@Length(min=0, max=32, message="使用抗凝药物的禁忌症长度不能超过 32 个字符")
	public String getTia_2_3_2() {
		return tia_2_3_2;
	}

	public void setTia_2_3_2(String tia_2_3_2) {
		this.tia_2_3_2 = tia_2_3_2;
	}
	
	@Length(min=0, max=32, message="是否常用抗凝药物长度不能超过 32 个字符")
	public String getTia_2_4_1() {
		return tia_2_4_1;
	}

	public void setTia_2_4_1(String tia_2_4_1) {
		this.tia_2_4_1 = tia_2_4_1;
	}
	
	@Length(min=0, max=32, message="抗凝药物长度不能超过 32 个字符")
	public String getTia_2_4_2() {
		return tia_2_4_2;
	}

	public void setTia_2_4_2(String tia_2_4_2) {
		this.tia_2_4_2 = tia_2_4_2;
	}
	
	@Length(min=0, max=32, message="用药日期时间长度不能超过 32 个字符")
	public String getTia_2_4_3() {
		return tia_2_4_3;
	}

	public void setTia_2_4_3(String tia_2_4_3) {
		this.tia_2_4_3 = tia_2_4_3;
	}
	
	@Length(min=0, max=32, message="高卒中复发风险因素长度不能超过 32 个字符")
	public String getTia_3_1_1_1() {
		return tia_3_1_1_1;
	}

	public void setTia_3_1_1_1(String tia_3_1_1_1) {
		this.tia_3_1_1_1 = tia_3_1_1_1;
	}
	
	@Length(min=0, max=32, message="其他高卒中复发风险因素长度不能超过 32 个字符")
	public String getTia_3_1_1_2() {
		return tia_3_1_1_2;
	}

	public void setTia_3_1_1_2(String tia_3_1_1_2) {
		this.tia_3_1_1_2 = tia_3_1_1_2;
	}
	
	@Length(min=0, max=32, message="是否有使用阿司匹林禁忌症长度不能超过 32 个字符")
	public String getTia_3_1_1() {
		return tia_3_1_1;
	}

	public void setTia_3_1_1(String tia_3_1_1) {
		this.tia_3_1_1 = tia_3_1_1;
	}
	
	@Length(min=0, max=32, message="阿司匹林禁忌症长度不能超过 32 个字符")
	public String getTia_3_1_2() {
		return tia_3_1_2;
	}

	public void setTia_3_1_2(String tia_3_1_2) {
		this.tia_3_1_2 = tia_3_1_2;
	}
	
	@Length(min=0, max=32, message="患者是否使用首剂阿司匹林/氯吡格雷长度不能超过 32 个字符")
	public String getTia_3_2_1() {
		return tia_3_2_1;
	}

	public void setTia_3_2_1(String tia_3_2_1) {
		this.tia_3_2_1 = tia_3_2_1;
	}
	
	@Length(min=0, max=32, message="用药日期时间长度不能超过 32 个字符")
	public String getTia_3_2_2_1() {
		return tia_3_2_2_1;
	}

	public void setTia_3_2_2_1(String tia_3_2_2_1) {
		this.tia_3_2_2_1 = tia_3_2_2_1;
	}
	
	@Length(min=0, max=32, message="选择药物长度不能超过 32 个字符")
	public String getTia_3_3() {
		return tia_3_3;
	}

	public void setTia_3_3(String tia_3_3) {
		this.tia_3_3 = tia_3_3;
	}
	
	@Length(min=0, max=32, message="其他抗血小板药物长度不能超过 32 个字符")
	public String getTia_3_3_1() {
		return tia_3_3_1;
	}

	public void setTia_3_3_1(String tia_3_3_1) {
		this.tia_3_3_1 = tia_3_3_1;
	}
	
	@Length(min=0, max=32, message="患者评估时机选择长度不能超过 32 个字符")
	public String getTia_4_1_1() {
		return tia_4_1_1;
	}

	public void setTia_4_1_1(String tia_4_1_1) {
		this.tia_4_1_1 = tia_4_1_1;
	}
	
	@Length(min=0, max=32, message="评估日期长度不能超过 32 个字符")
	public String getTia_4_1_2_1() {
		return tia_4_1_2_1;
	}

	public void setTia_4_1_2_1(String tia_4_1_2_1) {
		this.tia_4_1_2_1 = tia_4_1_2_1;
	}
	
	@Length(min=0, max=32, message="选择血脂评估项目长度不能超过 32 个字符")
	public String getTia_4_2_1() {
		return tia_4_2_1;
	}

	public void setTia_4_2_1(String tia_4_2_1) {
		this.tia_4_2_1 = tia_4_2_1;
	}
	
	@Length(min=0, max=32, message="评价血脂水平长度不能超过 32 个字符")
	public String getTia_4_3() {
		return tia_4_3;
	}

	public void setTia_4_3(String tia_4_3) {
		this.tia_4_3 = tia_4_3;
	}
	
	@Length(min=0, max=32, message="是否使用他汀类药物长度不能超过 32 个字符")
	public String getTia_4_4_0() {
		return tia_4_4_0;
	}

	public void setTia_4_4_0(String tia_4_4_0) {
		this.tia_4_4_0 = tia_4_4_0;
	}
	
	@Length(min=0, max=32, message="首次使用他汀类医嘱的日期长度不能超过 32 个字符")
	public String getTia_4_4_1_1() {
		return tia_4_4_1_1;
	}

	public void setTia_4_4_1_1(String tia_4_4_1_1) {
		this.tia_4_4_1_1 = tia_4_4_1_1;
	}
	
	@Length(min=0, max=32, message="他汀类药物长度不能超过 32 个字符")
	public String getTia_4_4_2() {
		return tia_4_4_2;
	}

	public void setTia_4_4_2(String tia_4_4_2) {
		this.tia_4_4_2 = tia_4_4_2;
	}
	
	@Length(min=0, max=32, message="选择抗血小扳聚集治疗药物长度不能超过 32 个字符")
	public String getTia_5_1() {
		return tia_5_1;
	}

	public void setTia_5_1(String tia_5_1) {
		this.tia_5_1 = tia_5_1;
	}
	
	@Length(min=0, max=32, message="其他抗血小扳聚集治疗药物长度不能超过 32 个字符")
	public String getTia_5_1_1() {
		return tia_5_1_1;
	}

	public void setTia_5_1_1(String tia_5_1_1) {
		this.tia_5_1_1 = tia_5_1_1;
	}
	
	@Length(min=0, max=32, message="他汀类药物长度不能超过 32 个字符")
	public String getTia_5_2() {
		return tia_5_2;
	}

	public void setTia_5_2(String tia_5_2) {
		this.tia_5_2 = tia_5_2;
	}
	
	@Length(min=0, max=32, message="选择抗凝药物长度不能超过 32 个字符")
	public String getTia_5_3() {
		return tia_5_3;
	}

	public void setTia_5_3(String tia_5_3) {
		this.tia_5_3 = tia_5_3;
	}
	
	@Length(min=0, max=32, message="患者是否伴发糖尿病长度不能超过 32 个字符")
	public String getTia_5_4_1() {
		return tia_5_4_1;
	}

	public void setTia_5_4_1(String tia_5_4_1) {
		this.tia_5_4_1 = tia_5_4_1;
	}
	
	@Length(min=0, max=32, message="选择降糖药物长度不能超过 32 个字符")
	public String getTia_5_4() {
		return tia_5_4;
	}

	public void setTia_5_4(String tia_5_4) {
		this.tia_5_4 = tia_5_4;
	}
	
	@Length(min=0, max=32, message="其他降糖药物长度不能超过 32 个字符")
	public String getTia_5_4_2() {
		return tia_5_4_2;
	}

	public void setTia_5_4_2(String tia_5_4_2) {
		this.tia_5_4_2 = tia_5_4_2;
	}
	
	@Length(min=0, max=32, message="患者是否伴发高血压长度不能超过 32 个字符")
	public String getTia_5_5_1() {
		return tia_5_5_1;
	}

	public void setTia_5_5_1(String tia_5_5_1) {
		this.tia_5_5_1 = tia_5_5_1;
	}
	
	@Length(min=0, max=32, message="选择降压药物长度不能超过 32 个字符")
	public String getTia_5_5() {
		return tia_5_5;
	}

	public void setTia_5_5(String tia_5_5) {
		this.tia_5_5 = tia_5_5;
	}
	
	@Length(min=0, max=32, message="其他降压药物长度不能超过 32 个字符")
	public String getTia_5_5_2() {
		return tia_5_5_2;
	}

	public void setTia_5_5_2(String tia_5_5_2) {
		this.tia_5_5_2 = tia_5_5_2;
	}
	
	@Length(min=0, max=32, message="行走评估结果长度不能超过 32 个字符")
	public String getTia_6_1_1() {
		return tia_6_1_1;
	}

	public void setTia_6_1_1(String tia_6_1_1) {
		this.tia_6_1_1 = tia_6_1_1;
	}
	
	@Length(min=0, max=32, message="呼吸评估结果长度不能超过 32 个字符")
	public String getTia_6_1_2() {
		return tia_6_1_2;
	}

	public void setTia_6_1_2(String tia_6_1_2) {
		this.tia_6_1_2 = tia_6_1_2;
	}
	
	@Length(min=0, max=32, message="饮食评估结果长度不能超过 32 个字符")
	public String getTia_6_1_3() {
		return tia_6_1_3;
	}

	public void setTia_6_1_3(String tia_6_1_3) {
		this.tia_6_1_3 = tia_6_1_3;
	}
	
	@Length(min=0, max=32, message="实施卒中健康教育有记录长度不能超过 32 个字符")
	public String getTia_6_2_1() {
		return tia_6_2_1;
	}

	public void setTia_6_2_1(String tia_6_2_1) {
		this.tia_6_2_1 = tia_6_2_1;
	}
	
	@Length(min=0, max=32, message="吸烟史长度不能超过 32 个字符")
	public String getTia_6_3_1() {
		return tia_6_3_1;
	}

	public void setTia_6_3_1(String tia_6_3_1) {
		this.tia_6_3_1 = tia_6_3_1;
	}
	
	@Length(min=0, max=32, message="吸烟程度评估有记录长度不能超过 32 个字符")
	public String getTia_6_3_2() {
		return tia_6_3_2;
	}

	public void setTia_6_3_2(String tia_6_3_2) {
		this.tia_6_3_2 = tia_6_3_2;
	}
	
	@Length(min=0, max=32, message="接受戒烟的建议或者戒烟治疗有记录长度不能超过 32 个字符")
	public String getTia_6_3_3() {
		return tia_6_3_3;
	}

	public void setTia_6_3_3(String tia_6_3_3) {
		this.tia_6_3_3 = tia_6_3_3;
	}
	
	@Length(min=0, max=32, message="血管功能评估时间长度不能超过 32 个字符")
	public String getTia_7_1() {
		return tia_7_1;
	}

	public void setTia_7_1(String tia_7_1) {
		this.tia_7_1 = tia_7_1;
	}
	
	@Length(min=0, max=32, message="血管功能评估方法长度不能超过 32 个字符")
	public String getTia_7_2() {
		return tia_7_2;
	}

	public void setTia_7_2(String tia_7_2) {
		this.tia_7_2 = tia_7_2;
	}
	
	@Length(min=0, max=32, message="出院时是否进行Essen卒中风险评分长度不能超过 32 个字符")
	public String getTia_9_1_1() {
		return tia_9_1_1;
	}

	public void setTia_9_1_1(String tia_9_1_1) {
		this.tia_9_1_1 = tia_9_1_1;
	}
	
	public Double getTia_9_1_2_1() {
		return tia_9_1_2_1;
	}

	public void setTia_9_1_2_1(Double tia_9_1_2_1) {
		this.tia_9_1_2_1 = tia_9_1_2_1;
	}
	
	@Length(min=0, max=32, message="主要风险因素评估长度不能超过 32 个字符")
	public String getTia_9_2_1() {
		return tia_9_2_1;
	}

	public void setTia_9_2_1(String tia_9_2_1) {
		this.tia_9_2_1 = tia_9_2_1;
	}
	
	@Length(min=0, max=32, message="其他主要风险因素填写长度不能超过 32 个字符")
	public String getTia_9_2_1_1() {
		return tia_9_2_1_1;
	}

	public void setTia_9_2_1_1(String tia_9_2_1_1) {
		this.tia_9_2_1_1 = tia_9_2_1_1;
	}
	
	@Length(min=0, max=32, message="其他风险因素评估长度不能超过 32 个字符")
	public String getTia_9_2_2() {
		return tia_9_2_2;
	}

	public void setTia_9_2_2(String tia_9_2_2) {
		this.tia_9_2_2 = tia_9_2_2;
	}
	
	@Length(min=0, max=32, message="其他风险因素填写长度不能超过 32 个字符")
	public String getTia_9_2_2_1() {
		return tia_9_2_2_1;
	}

	public void setTia_9_2_2_1(String tia_9_2_2_1) {
		this.tia_9_2_2_1 = tia_9_2_2_1;
	}
	
	@Length(min=0, max=32, message="交与患者“出院小结”的副本告知患者出院时风险因素长度不能超过 32 个字符")
	public String getTia_9_3_1() {
		return tia_9_3_1;
	}

	public void setTia_9_3_1(String tia_9_3_1) {
		this.tia_9_3_1 = tia_9_3_1;
	}
	
	@Length(min=0, max=32, message="出院带药长度不能超过 32 个字符")
	public String getTia_9_3_2() {
		return tia_9_3_2;
	}

	public void setTia_9_3_2(String tia_9_3_2) {
		this.tia_9_3_2 = tia_9_3_2;
	}
	
	@Length(min=0, max=32, message="告知发生紧急情况时求援救治途径长度不能超过 32 个字符")
	public String getTia_9_3_3() {
		return tia_9_3_3;
	}

	public void setTia_9_3_3(String tia_9_3_3) {
		this.tia_9_3_3 = tia_9_3_3;
	}
	
	@Length(min=0, max=32, message="出院时教育与随访长度不能超过 32 个字符")
	public String getTia_9_3_4() {
		return tia_9_3_4;
	}

	public void setTia_9_3_4(String tia_9_3_4) {
		this.tia_9_3_4 = tia_9_3_4;
	}
	
	@Length(min=0, max=32, message="告知何为风险因素与紧急情况长度不能超过 32 个字符")
	public String getTia_9_3_5() {
		return tia_9_3_5;
	}

	public void setTia_9_3_5(String tia_9_3_5) {
		this.tia_9_3_5 = tia_9_3_5;
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
	
}