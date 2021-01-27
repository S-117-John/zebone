/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.aecopd.entity;

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
 * AECOPD慢性阻塞性肺疾病急性发作（住院）Entity
 * @author 卡卡西
 * @version 2021-01-27
 */
@Table(name="quality_aecopd", alias="a", columns={
		@Column(name="cm_0_1_1_1", attrName="cm_0_1_1_1", label="质控医师"),
		@Column(name="cm_0_1_1_2", attrName="cm_0_1_1_2", label="质控护士"),
		@Column(name="cm_0_1_1_3", attrName="cm_0_1_1_3", label="主治医师"),
		@Column(name="cm_0_1_1_4", attrName="cm_0_1_1_4", label="责任护士"),
		@Column(name="cm_0_1_1_5", attrName="cm_0_1_1_5", label="上报科室"),
		@Column(name="caseid", attrName="caseid", label="患者病案号"),
		@Column(name="cm_0_1_3_1", attrName="cm_0_1_3_1", label="主要诊断ICD-10四位亚目编码与名称"),
		@Column(name="cm_0_1_3_2", attrName="cm_0_1_3_2", label="主要诊断ICD-10六位临床扩展编码与名称"),
		@Column(name="cm_0_1_4_1", attrName="cm_0_1_4_1", label="主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称"),
		@Column(name="cm_0_1_4_2", attrName="cm_0_1_4_2", label="主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称"),
		@Column(name="cm_0_1_5", attrName="cm_0_1_5", label="是否出院后31天内重复住院"),
		@Column(name="cm_0_2_1_1", attrName="cm_0_2_1_1", label="出生日期"),
		@Column(name="cm_0_2_1_2", attrName="cm_0_2_1_2", label="患者性别"),
		@Column(name="cm_0_2_1_3", attrName="cm_0_2_1_3", label="患者体重", comment="患者体重（kg）"),
		@Column(name="cm_0_2_1_5", attrName="cm_0_2_1_5", label="患者身高", comment="患者身高（cm）"),
		@Column(name="cm_0_2_4_1", attrName="cm_0_2_4_1", label="入院日期时间"),
		@Column(name="cm_0_2_4_2", attrName="cm_0_2_4_2", label="出院日期时间"),
		@Column(name="cm_0_2_5_1", attrName="cm_0_2_5_1", label="入住CCU日期时间"),
		@Column(name="cm_0_2_5_2", attrName="cm_0_2_5_2", label="离开CCU日期时间"),
		@Column(name="cm_0_3_1", attrName="cm_0_3_1", label="费用支付方式"),
		@Column(name="cm_0_3_2", attrName="cm_0_3_2", label="收入住院途径"),
		@Column(name="cm_0_3_3", attrName="cm_0_3_3", label="到院交通工具"),
		@Column(name="aecopd_1_1_1", attrName="aecopd_1_1_1", label="入院后是否实施首次病情严重程度评估"),
		@Column(name="aecopd_1_1_2", attrName="aecopd_1_1_2", label="评价结果"),
		@Column(name="aecopd_1_2_1", attrName="aecopd_1_2_1", label="入院后是否实施首次氧合评估", comment="入院后是否实施首次氧合评估（首次）"),
		@Column(name="aecopd_1_2_2", attrName="aecopd_1_2_2", label="实施首次氧合评估时是否吸氧"),
		@Column(name="aecopd_1_2_3", attrName="aecopd_1_2_3", label="动脉血气分析/指氧仪检查"),
		@Column(name="aecopd_1_2_3_3", attrName="aecopd_1_2_3_3", label="动脉血气分析", comment="动脉血气分析（mmHg）"),
		@Column(name="aecopd_1_2_3_4", attrName="aecopd_1_2_3_4", label="指氧仪检查", comment="指氧仪检查（%）"),
		@Column(name="aecopd_1_2_4", attrName="aecopd_1_2_4", label="入院后首次氧合评估结论的判定"),
		@Column(name="aecopd_1_3_1", attrName="aecopd_1_3_1", label="入院后是否实施首次胸部影像学检查"),
		@Column(name="aecopd_1_3_2", attrName="aecopd_1_3_2", label="首次胸部影像学检查模式"),
		@Column(name="aecopd_1_3_3", attrName="aecopd_1_3_3", label="胸部影像学检查评估"),
		@Column(name="aecopd_1_3_3_1", attrName="aecopd_1_3_3_1", label="其它胸部影像学检查评估"),
		@Column(name="aecopd_1_4_1", attrName="aecopd_1_4_1", label="入院后是否实施首次心电图检查评估"),
		@Column(name="aecopd_1_4_2", attrName="aecopd_1_4_2", label="心电图检查评估"),
		@Column(name="aecopd_1_4_2_1", attrName="aecopd_1_4_2_1", label="其它心电图检查评估"),
		@Column(name="aecopd_1_5_1", attrName="aecopd_1_5_1", label="入院后是否实施首次实验室检查评估"),
		@Column(name="aecopd_1_5_2", attrName="aecopd_1_5_2", label="实验室检查评估"),
		@Column(name="aecopd_1_5_2_1", attrName="aecopd_1_5_2_1", label="其它实验室检查评估"),
		@Column(name="aecopd_2_1_1", attrName="aecopd_2_1_1", label="是否入住ICU"),
		@Column(name="aecopd_2_1_2", attrName="aecopd_2_1_2", label="收住ICU符合指征的选择"),
		@Column(name="aecopd_2_1_3", attrName="aecopd_2_1_3", label="入住ICU时机"),
		@Column(name="aecopd_2_2_1", attrName="aecopd_2_2_1", label="选择AECOPD治疗的分级"),
		@Column(name="aecopd_3_1_1", attrName="aecopd_3_1_1", label="氧疗方法"),
		@Column(name="aecopd_3_2_1", attrName="aecopd_3_2_1", label="氧疗 30min 后是否复查动脉血气"),
		@Column(name="aecopd_4_1_1", attrName="aecopd_4_1_1", label="用药前病情判定分层"),
		@Column(name="aecopd_4_1_2_1", attrName="aecopd_4_1_2_1", label="轻度及中度COPD急性加重"),
		@Column(name="aecopd_4_1_2_1_1", attrName="aecopd_4_1_2_1_1", label="其他轻度及中度COPD急性加重抗菌药物"),
		@Column(name="aecopd_4_1_2_3", attrName="aecopd_4_1_2_3", label="重度及极重度COPD急性加重，无铜绿假单孢菌感染危险因素患者抗菌药物选择"),
		@Column(name="aecopd_4_1_2_4", attrName="aecopd_4_1_2_4", label="其他重度及极重度COPD急性加重，无铜绿假单孢菌感染危险因素患者抗菌药物"),
		@Column(name="aecopd_4_1_2_5", attrName="aecopd_4_1_2_5", label="重度及极重度COPD急性加重，有铜绿假单孢菌感染危险因素患者抗菌药物选择"),
		@Column(name="aecopd_4_1_2_6", attrName="aecopd_4_1_2_6", label="其他重度及极重度COPD急性加重，有铜绿假单孢菌感染危险因素患者抗菌药物"),
		@Column(name="aecopd_4_1_3", attrName="aecopd_4_1_3", label="患者接受首剂抗菌药物治疗", comment="患者接受首剂抗菌药物治疗（注射剂输入/注射）日期时间"),
		@Column(name="aecopd_4_1_4", attrName="aecopd_4_1_4", label="接受首剂抗菌药物使用时机的分层"),
		@Column(name="aecopd_4_1_5", attrName="aecopd_4_1_5", label="患者停止使用抗菌药物日期"),
		@Column(name="aecopd_5_1_1", attrName="aecopd_5_1_1", label="支气管舒张剂、吸入糖皮质激素使用的选择"),
		@Column(name="aecopd_5_1_1_1", attrName="aecopd_5_1_1_1", label="其他支气管舒张剂、吸入糖皮质激素使用"),
		@Column(name="aecopd_5_1_2", attrName="aecopd_5_1_2", label="是否实施血清茶碱浓度监测"),
		@Column(name="aecopd_5_2_1", attrName="aecopd_5_2_1", label="全身使用糖皮质激素药物的选择"),
		@Column(includeEntity=DataEntity.class),
		@Column(name="aecopd_5_2_1_1", attrName="aecopd_5_2_1_1", label="其他使用糖皮质激素药物"),
		@Column(name="aecopd_5_2_2", attrName="aecopd_5_2_2", label="全身使用糖皮质激素药物起始日期"),
		@Column(name="aecopd_5_2_3", attrName="aecopd_5_2_3", label="全身使用糖皮质激素药物终止日期"),
		@Column(name="aecopd_6_1_1", attrName="aecopd_6_1_1", label="是否有有心功不全"),
		@Column(name="aecopd_6_1_2", attrName="aecopd_6_1_2", label="首位处置项目"),
		@Column(name="aecopd_6_1_2_1", attrName="aecopd_6_1_2_1", label="有心功不全时,其他处置项目"),
		@Column(name="aecopd_6_2_1", attrName="aecopd_6_2_1", label="是否有有肺动脉高压和右心功能不全"),
		@Column(name="aecopd_6_2_2", attrName="aecopd_6_2_2", label="使用血管扩张剂", comment="使用血管扩张剂（无禁忌症）的选择"),
		@Column(name="aecopd_6_2_2_1", attrName="aecopd_6_2_2_1", label="有肺动脉高压和右心功能不全时,使用其他血管扩张剂"),
		@Column(name="aecopd_6_3_1", attrName="aecopd_6_3_1", label="是否有血栓形成高危因素"),
		@Column(name="aecopd_6_3_2", attrName="aecopd_6_3_2", label="首位处置项目"),
		@Column(name="aecopd_6_3_2_1", attrName="aecopd_6_3_2_1", label="有血栓形成高危因素时,其他处置项目"),
		@Column(name="aecopd_6_4_1", attrName="aecopd_6_4_1", label="是否有呼吸功能不全"),
		@Column(name="aecopd_6_4_2", attrName="aecopd_6_4_2", label="首位处置项目"),
		@Column(name="aecopd_6_4_2_1", attrName="aecopd_6_4_2_1", label="有呼吸功能不全时,其他处置项目"),
		@Column(name="aecopd_6_5_1", attrName="aecopd_6_5_1", label="是否有气胸"),
		@Column(name="aecopd_6_5_2", attrName="aecopd_6_5_2", label="首位处置项目"),
		@Column(name="aecopd_6_5_2_1", attrName="aecopd_6_5_2_1", label="有气胸时,其他处置项目"),
		@Column(name="aecopd_7_1_1", attrName="aecopd_7_1_1", label="是否实施无创正压通气", comment="是否实施无创正压通气（NIV）"),
		@Column(name="aecopd_7_1_2", attrName="aecopd_7_1_2", label="无创正压通气的应用指征"),
		@Column(name="aecopd_7_1_3_1", attrName="aecopd_7_1_3_1", label="NIV相对禁忌证"),
		@Column(name="aecopd_7_1_6", attrName="aecopd_7_1_6", label="患者无创正压通气起始日期时间"),
		@Column(name="aecopd_7_1_7", attrName="aecopd_7_1_7", label="患者无创正压通气终止日期时间"),
		@Column(name="aecopd_7_1_8", attrName="aecopd_7_1_8", label="无创正压通气疗程", comment="无创正压通气疗程（小时）"),
		@Column(name="aecopd_7_2_1", attrName="aecopd_7_2_1", label="是否实施有创机械通气"),
		@Column(name="aecopd_7_2_2", attrName="aecopd_7_2_2", label="有创机械通气指征"),
		@Column(name="aecopd_7_2_5_1", attrName="aecopd_7_2_5_1", label="患者有机械通气起始日期时间"),
		@Column(name="aecopd_7_2_6", attrName="aecopd_7_2_6", label="患者有机械通气终止日期时间"),
		@Column(name="aecopd_7_2_7", attrName="aecopd_7_2_7", label="有机械通气疗程", comment="有机械通气疗程（小时）"),
		@Column(name="aecopd_7_3_1", attrName="aecopd_7_3_1", label="是否实施有创-无创序贯通气疗法"),
		@Column(name="aecopd_8_1_1", attrName="aecopd_8_1_1", label="有无吸烟史"),
		@Column(name="aecopd_8_2", attrName="aecopd_8_2", label="吸烟程度评估有记录"),
		@Column(name="aecopd_8_3", attrName="aecopd_8_3", label="接受戒烟的建议或者戒烟治疗有记录"),
		@Column(name="cm_7_2_1", attrName="cm_7_2_1", label="交与患者“出院小结”的副本告知患者出院时风险因素"),
		@Column(name="cm_7_2_2", attrName="cm_7_2_2", label="出院带药"),
		@Column(name="cm_7_2_4", attrName="cm_7_2_4", label="告知发生紧急意外情况或者疾病复发如何救治及前途经"),
		@Column(name="cm_7_2_5", attrName="cm_7_2_5", label="出院时教育与随访"),
		@Column(name="cm_7_2_3", attrName="cm_7_2_3", label="告知何为发生紧急意外情况或者疾病复发"),
		@Column(name="aecopd_9_1_1", attrName="aecopd_9_1_1", label="符合出院标准"),
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
	}, orderBy="a.update_date DESC"
)
public class QualityAecopd extends DataEntity<QualityAecopd> {
	
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
	private String cm_0_1_4_2;		// 主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称
	private String cm_0_1_5;		// 是否出院后31天内重复住院
	private Date cm_0_2_1_1;		// 出生日期
	private String cm_0_2_1_2;		// 患者性别
	private Double cm_0_2_1_3;		// 患者体重（kg）
	private Double cm_0_2_1_5;		// 患者身高（cm）
	private Date cm_0_2_4_1;		// 入院日期时间
	private Date cm_0_2_4_2;		// 出院日期时间
	private Date cm_0_2_5_1;		// 入住CCU日期时间
	private Date cm_0_2_5_2;		// 离开CCU日期时间
	private String cm_0_3_1;		// 费用支付方式
	private String cm_0_3_2;		// 收入住院途径
	private String cm_0_3_3;		// 到院交通工具
	private String aecopd_1_1_1;		// 入院后是否实施首次病情严重程度评估
	private String aecopd_1_1_2;		// 评价结果
	private String aecopd_1_2_1;		// 入院后是否实施首次氧合评估（首次）
	private String aecopd_1_2_2;		// 实施首次氧合评估时是否吸氧
	private String aecopd_1_2_3;		// 动脉血气分析/指氧仪检查
	private Double aecopd_1_2_3_3;		// 动脉血气分析（mmHg）
	private Double aecopd_1_2_3_4;		// 指氧仪检查（%）
	private String aecopd_1_2_4;		// 入院后首次氧合评估结论的判定
	private String aecopd_1_3_1;		// 入院后是否实施首次胸部影像学检查
	private String aecopd_1_3_2;		// 首次胸部影像学检查模式
	private String aecopd_1_3_3;		// 胸部影像学检查评估
	private String aecopd_1_3_3_1;		// 其它胸部影像学检查评估
	private String aecopd_1_4_1;		// 入院后是否实施首次心电图检查评估
	private String aecopd_1_4_2;		// 心电图检查评估
	private String aecopd_1_4_2_1;		// 其它心电图检查评估
	private String aecopd_1_5_1;		// 入院后是否实施首次实验室检查评估
	private String aecopd_1_5_2;		// 实验室检查评估
	private String aecopd_1_5_2_1;		// 其它实验室检查评估
	private String aecopd_2_1_1;		// 是否入住ICU
	private String aecopd_2_1_2;		// 收住ICU符合指征的选择
	private String aecopd_2_1_3;		// 入住ICU时机
	private String aecopd_2_2_1;		// 选择AECOPD治疗的分级
	private String aecopd_3_1_1;		// 氧疗方法
	private String aecopd_3_2_1;		// 氧疗 30min 后是否复查动脉血气
	private String aecopd_4_1_1;		// 用药前病情判定分层
	private String aecopd_4_1_2_1;		// 轻度及中度COPD急性加重
	private String aecopd_4_1_2_1_1;		// 其他轻度及中度COPD急性加重抗菌药物
	private String aecopd_4_1_2_3;		// 重度及极重度COPD急性加重，无铜绿假单孢菌感染危险因素患者抗菌药物选择
	private String aecopd_4_1_2_4;		// 其他重度及极重度COPD急性加重，无铜绿假单孢菌感染危险因素患者抗菌药物
	private String aecopd_4_1_2_5;		// 重度及极重度COPD急性加重，有铜绿假单孢菌感染危险因素患者抗菌药物选择
	private String aecopd_4_1_2_6;		// 其他重度及极重度COPD急性加重，有铜绿假单孢菌感染危险因素患者抗菌药物
	private String aecopd_4_1_3;		// 患者接受首剂抗菌药物治疗（注射剂输入/注射）日期时间
	private String aecopd_4_1_4;		// 接受首剂抗菌药物使用时机的分层
	private String aecopd_4_1_5;		// 患者停止使用抗菌药物日期
	private String aecopd_5_1_1;		// 支气管舒张剂、吸入糖皮质激素使用的选择
	private String aecopd_5_1_1_1;		// 其他支气管舒张剂、吸入糖皮质激素使用
	private String aecopd_5_1_2;		// 是否实施血清茶碱浓度监测
	private String aecopd_5_2_1;		// 全身使用糖皮质激素药物的选择
	private String aecopd_5_2_1_1;		// 其他使用糖皮质激素药物
	private String aecopd_5_2_2;		// 全身使用糖皮质激素药物起始日期
	private String aecopd_5_2_3;		// 全身使用糖皮质激素药物终止日期
	private String aecopd_6_1_1;		// 是否有有心功不全
	private String aecopd_6_1_2;		// 首位处置项目
	private String aecopd_6_1_2_1;		// 有心功不全时,其他处置项目
	private String aecopd_6_2_1;		// 是否有有肺动脉高压和右心功能不全
	private String aecopd_6_2_2;		// 使用血管扩张剂（无禁忌症）的选择
	private String aecopd_6_2_2_1;		// 有肺动脉高压和右心功能不全时,使用其他血管扩张剂
	private String aecopd_6_3_1;		// 是否有血栓形成高危因素
	private String aecopd_6_3_2;		// 首位处置项目
	private String aecopd_6_3_2_1;		// 有血栓形成高危因素时,其他处置项目
	private String aecopd_6_4_1;		// 是否有呼吸功能不全
	private String aecopd_6_4_2;		// 首位处置项目
	private String aecopd_6_4_2_1;		// 有呼吸功能不全时,其他处置项目
	private String aecopd_6_5_1;		// 是否有气胸
	private String aecopd_6_5_2;		// 首位处置项目
	private String aecopd_6_5_2_1;		// 有气胸时,其他处置项目
	private String aecopd_7_1_1;		// 是否实施无创正压通气（NIV）
	private String aecopd_7_1_2;		// 无创正压通气的应用指征
	private String aecopd_7_1_3_1;		// NIV相对禁忌证
	private String aecopd_7_1_6;		// 患者无创正压通气起始日期时间
	private String aecopd_7_1_7;		// 患者无创正压通气终止日期时间
	private Double aecopd_7_1_8;		// 无创正压通气疗程（小时）
	private String aecopd_7_2_1;		// 是否实施有创机械通气
	private String aecopd_7_2_2;		// 有创机械通气指征
	private String aecopd_7_2_5_1;		// 患者有机械通气起始日期时间
	private String aecopd_7_2_6;		// 患者有机械通气终止日期时间
	private Double aecopd_7_2_7;		// 有机械通气疗程（小时）
	private String aecopd_7_3_1;		// 是否实施有创-无创序贯通气疗法
	private String aecopd_8_1_1;		// 有无吸烟史
	private String aecopd_8_2;		// 吸烟程度评估有记录
	private String aecopd_8_3;		// 接受戒烟的建议或者戒烟治疗有记录
	private String cm_7_2_1;		// 交与患者“出院小结”的副本告知患者出院时风险因素
	private String cm_7_2_2;		// 出院带药
	private String cm_7_2_4;		// 告知发生紧急意外情况或者疾病复发如何救治及前途经
	private String cm_7_2_5;		// 出院时教育与随访
	private String cm_7_2_3;		// 告知何为发生紧急意外情况或者疾病复发
	private String aecopd_9_1_1;		// 符合出院标准
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
	
	public QualityAecopd() {
		this(null);
	}

	public QualityAecopd(String id){
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
	
	@Length(min=0, max=32, message="主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称长度不能超过 32 个字符")
	public String getCm_0_1_4_2() {
		return cm_0_1_4_2;
	}

	public void setCm_0_1_4_2(String cm_0_1_4_2) {
		this.cm_0_1_4_2 = cm_0_1_4_2;
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
	public Date getCm_0_2_5_1() {
		return cm_0_2_5_1;
	}

	public void setCm_0_2_5_1(Date cm_0_2_5_1) {
		this.cm_0_2_5_1 = cm_0_2_5_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCm_0_2_5_2() {
		return cm_0_2_5_2;
	}

	public void setCm_0_2_5_2(Date cm_0_2_5_2) {
		this.cm_0_2_5_2 = cm_0_2_5_2;
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
	
	@Length(min=0, max=64, message="入院后是否实施首次病情严重程度评估长度不能超过 64 个字符")
	public String getAecopd_1_1_1() {
		return aecopd_1_1_1;
	}

	public void setAecopd_1_1_1(String aecopd_1_1_1) {
		this.aecopd_1_1_1 = aecopd_1_1_1;
	}
	
	@Length(min=0, max=64, message="评价结果长度不能超过 64 个字符")
	public String getAecopd_1_1_2() {
		return aecopd_1_1_2;
	}

	public void setAecopd_1_1_2(String aecopd_1_1_2) {
		this.aecopd_1_1_2 = aecopd_1_1_2;
	}
	
	@Length(min=0, max=64, message="入院后是否实施首次氧合评估长度不能超过 64 个字符")
	public String getAecopd_1_2_1() {
		return aecopd_1_2_1;
	}

	public void setAecopd_1_2_1(String aecopd_1_2_1) {
		this.aecopd_1_2_1 = aecopd_1_2_1;
	}
	
	@Length(min=0, max=64, message="实施首次氧合评估时是否吸氧长度不能超过 64 个字符")
	public String getAecopd_1_2_2() {
		return aecopd_1_2_2;
	}

	public void setAecopd_1_2_2(String aecopd_1_2_2) {
		this.aecopd_1_2_2 = aecopd_1_2_2;
	}
	
	@Length(min=0, max=64, message="动脉血气分析/指氧仪检查长度不能超过 64 个字符")
	public String getAecopd_1_2_3() {
		return aecopd_1_2_3;
	}

	public void setAecopd_1_2_3(String aecopd_1_2_3) {
		this.aecopd_1_2_3 = aecopd_1_2_3;
	}
	
	public Double getAecopd_1_2_3_3() {
		return aecopd_1_2_3_3;
	}

	public void setAecopd_1_2_3_3(Double aecopd_1_2_3_3) {
		this.aecopd_1_2_3_3 = aecopd_1_2_3_3;
	}
	
	public Double getAecopd_1_2_3_4() {
		return aecopd_1_2_3_4;
	}

	public void setAecopd_1_2_3_4(Double aecopd_1_2_3_4) {
		this.aecopd_1_2_3_4 = aecopd_1_2_3_4;
	}
	
	@Length(min=0, max=64, message="入院后首次氧合评估结论的判定长度不能超过 64 个字符")
	public String getAecopd_1_2_4() {
		return aecopd_1_2_4;
	}

	public void setAecopd_1_2_4(String aecopd_1_2_4) {
		this.aecopd_1_2_4 = aecopd_1_2_4;
	}
	
	@Length(min=0, max=64, message="入院后是否实施首次胸部影像学检查长度不能超过 64 个字符")
	public String getAecopd_1_3_1() {
		return aecopd_1_3_1;
	}

	public void setAecopd_1_3_1(String aecopd_1_3_1) {
		this.aecopd_1_3_1 = aecopd_1_3_1;
	}
	
	@Length(min=0, max=64, message="首次胸部影像学检查模式长度不能超过 64 个字符")
	public String getAecopd_1_3_2() {
		return aecopd_1_3_2;
	}

	public void setAecopd_1_3_2(String aecopd_1_3_2) {
		this.aecopd_1_3_2 = aecopd_1_3_2;
	}
	
	@Length(min=0, max=64, message="胸部影像学检查评估长度不能超过 64 个字符")
	public String getAecopd_1_3_3() {
		return aecopd_1_3_3;
	}

	public void setAecopd_1_3_3(String aecopd_1_3_3) {
		this.aecopd_1_3_3 = aecopd_1_3_3;
	}
	
	@Length(min=0, max=64, message="其它胸部影像学检查评估长度不能超过 64 个字符")
	public String getAecopd_1_3_3_1() {
		return aecopd_1_3_3_1;
	}

	public void setAecopd_1_3_3_1(String aecopd_1_3_3_1) {
		this.aecopd_1_3_3_1 = aecopd_1_3_3_1;
	}
	
	@Length(min=0, max=64, message="入院后是否实施首次心电图检查评估长度不能超过 64 个字符")
	public String getAecopd_1_4_1() {
		return aecopd_1_4_1;
	}

	public void setAecopd_1_4_1(String aecopd_1_4_1) {
		this.aecopd_1_4_1 = aecopd_1_4_1;
	}
	
	@Length(min=0, max=64, message="心电图检查评估长度不能超过 64 个字符")
	public String getAecopd_1_4_2() {
		return aecopd_1_4_2;
	}

	public void setAecopd_1_4_2(String aecopd_1_4_2) {
		this.aecopd_1_4_2 = aecopd_1_4_2;
	}
	
	@Length(min=0, max=64, message="其它心电图检查评估长度不能超过 64 个字符")
	public String getAecopd_1_4_2_1() {
		return aecopd_1_4_2_1;
	}

	public void setAecopd_1_4_2_1(String aecopd_1_4_2_1) {
		this.aecopd_1_4_2_1 = aecopd_1_4_2_1;
	}
	
	@Length(min=0, max=64, message="入院后是否实施首次实验室检查评估长度不能超过 64 个字符")
	public String getAecopd_1_5_1() {
		return aecopd_1_5_1;
	}

	public void setAecopd_1_5_1(String aecopd_1_5_1) {
		this.aecopd_1_5_1 = aecopd_1_5_1;
	}
	
	@Length(min=0, max=64, message="实验室检查评估长度不能超过 64 个字符")
	public String getAecopd_1_5_2() {
		return aecopd_1_5_2;
	}

	public void setAecopd_1_5_2(String aecopd_1_5_2) {
		this.aecopd_1_5_2 = aecopd_1_5_2;
	}
	
	@Length(min=0, max=64, message="其它实验室检查评估长度不能超过 64 个字符")
	public String getAecopd_1_5_2_1() {
		return aecopd_1_5_2_1;
	}

	public void setAecopd_1_5_2_1(String aecopd_1_5_2_1) {
		this.aecopd_1_5_2_1 = aecopd_1_5_2_1;
	}
	
	@Length(min=0, max=64, message="是否入住ICU长度不能超过 64 个字符")
	public String getAecopd_2_1_1() {
		return aecopd_2_1_1;
	}

	public void setAecopd_2_1_1(String aecopd_2_1_1) {
		this.aecopd_2_1_1 = aecopd_2_1_1;
	}
	
	@Length(min=0, max=64, message="收住ICU符合指征的选择长度不能超过 64 个字符")
	public String getAecopd_2_1_2() {
		return aecopd_2_1_2;
	}

	public void setAecopd_2_1_2(String aecopd_2_1_2) {
		this.aecopd_2_1_2 = aecopd_2_1_2;
	}
	
	@Length(min=0, max=64, message="入住ICU时机长度不能超过 64 个字符")
	public String getAecopd_2_1_3() {
		return aecopd_2_1_3;
	}

	public void setAecopd_2_1_3(String aecopd_2_1_3) {
		this.aecopd_2_1_3 = aecopd_2_1_3;
	}
	
	@Length(min=0, max=64, message="选择AECOPD治疗的分级长度不能超过 64 个字符")
	public String getAecopd_2_2_1() {
		return aecopd_2_2_1;
	}

	public void setAecopd_2_2_1(String aecopd_2_2_1) {
		this.aecopd_2_2_1 = aecopd_2_2_1;
	}
	
	@Length(min=0, max=64, message="氧疗方法长度不能超过 64 个字符")
	public String getAecopd_3_1_1() {
		return aecopd_3_1_1;
	}

	public void setAecopd_3_1_1(String aecopd_3_1_1) {
		this.aecopd_3_1_1 = aecopd_3_1_1;
	}
	
	@Length(min=0, max=64, message="氧疗 30min 后是否复查动脉血气长度不能超过 64 个字符")
	public String getAecopd_3_2_1() {
		return aecopd_3_2_1;
	}

	public void setAecopd_3_2_1(String aecopd_3_2_1) {
		this.aecopd_3_2_1 = aecopd_3_2_1;
	}
	
	@Length(min=0, max=64, message="用药前病情判定分层长度不能超过 64 个字符")
	public String getAecopd_4_1_1() {
		return aecopd_4_1_1;
	}

	public void setAecopd_4_1_1(String aecopd_4_1_1) {
		this.aecopd_4_1_1 = aecopd_4_1_1;
	}
	
	@Length(min=0, max=64, message="轻度及中度COPD急性加重长度不能超过 64 个字符")
	public String getAecopd_4_1_2_1() {
		return aecopd_4_1_2_1;
	}

	public void setAecopd_4_1_2_1(String aecopd_4_1_2_1) {
		this.aecopd_4_1_2_1 = aecopd_4_1_2_1;
	}
	
	@Length(min=0, max=64, message="其他轻度及中度COPD急性加重抗菌药物长度不能超过 64 个字符")
	public String getAecopd_4_1_2_1_1() {
		return aecopd_4_1_2_1_1;
	}

	public void setAecopd_4_1_2_1_1(String aecopd_4_1_2_1_1) {
		this.aecopd_4_1_2_1_1 = aecopd_4_1_2_1_1;
	}
	
	@Length(min=0, max=64, message="重度及极重度COPD急性加重，无铜绿假单孢菌感染危险因素患者抗菌药物选择长度不能超过 64 个字符")
	public String getAecopd_4_1_2_3() {
		return aecopd_4_1_2_3;
	}

	public void setAecopd_4_1_2_3(String aecopd_4_1_2_3) {
		this.aecopd_4_1_2_3 = aecopd_4_1_2_3;
	}
	
	@Length(min=0, max=64, message="其他重度及极重度COPD急性加重，无铜绿假单孢菌感染危险因素患者抗菌药物长度不能超过 64 个字符")
	public String getAecopd_4_1_2_4() {
		return aecopd_4_1_2_4;
	}

	public void setAecopd_4_1_2_4(String aecopd_4_1_2_4) {
		this.aecopd_4_1_2_4 = aecopd_4_1_2_4;
	}
	
	@Length(min=0, max=64, message="重度及极重度COPD急性加重，有铜绿假单孢菌感染危险因素患者抗菌药物选择长度不能超过 64 个字符")
	public String getAecopd_4_1_2_5() {
		return aecopd_4_1_2_5;
	}

	public void setAecopd_4_1_2_5(String aecopd_4_1_2_5) {
		this.aecopd_4_1_2_5 = aecopd_4_1_2_5;
	}
	
	@Length(min=0, max=64, message="其他重度及极重度COPD急性加重，有铜绿假单孢菌感染危险因素患者抗菌药物长度不能超过 64 个字符")
	public String getAecopd_4_1_2_6() {
		return aecopd_4_1_2_6;
	}

	public void setAecopd_4_1_2_6(String aecopd_4_1_2_6) {
		this.aecopd_4_1_2_6 = aecopd_4_1_2_6;
	}
	
	@Length(min=0, max=64, message="患者接受首剂抗菌药物治疗长度不能超过 64 个字符")
	public String getAecopd_4_1_3() {
		return aecopd_4_1_3;
	}

	public void setAecopd_4_1_3(String aecopd_4_1_3) {
		this.aecopd_4_1_3 = aecopd_4_1_3;
	}
	
	@Length(min=0, max=64, message="接受首剂抗菌药物使用时机的分层长度不能超过 64 个字符")
	public String getAecopd_4_1_4() {
		return aecopd_4_1_4;
	}

	public void setAecopd_4_1_4(String aecopd_4_1_4) {
		this.aecopd_4_1_4 = aecopd_4_1_4;
	}
	
	@Length(min=0, max=64, message="患者停止使用抗菌药物日期长度不能超过 64 个字符")
	public String getAecopd_4_1_5() {
		return aecopd_4_1_5;
	}

	public void setAecopd_4_1_5(String aecopd_4_1_5) {
		this.aecopd_4_1_5 = aecopd_4_1_5;
	}
	
	@Length(min=0, max=64, message="支气管舒张剂、吸入糖皮质激素使用的选择长度不能超过 64 个字符")
	public String getAecopd_5_1_1() {
		return aecopd_5_1_1;
	}

	public void setAecopd_5_1_1(String aecopd_5_1_1) {
		this.aecopd_5_1_1 = aecopd_5_1_1;
	}
	
	@Length(min=0, max=64, message="其他支气管舒张剂、吸入糖皮质激素使用长度不能超过 64 个字符")
	public String getAecopd_5_1_1_1() {
		return aecopd_5_1_1_1;
	}

	public void setAecopd_5_1_1_1(String aecopd_5_1_1_1) {
		this.aecopd_5_1_1_1 = aecopd_5_1_1_1;
	}
	
	@Length(min=0, max=64, message="是否实施血清茶碱浓度监测长度不能超过 64 个字符")
	public String getAecopd_5_1_2() {
		return aecopd_5_1_2;
	}

	public void setAecopd_5_1_2(String aecopd_5_1_2) {
		this.aecopd_5_1_2 = aecopd_5_1_2;
	}
	
	@Length(min=0, max=64, message="全身使用糖皮质激素药物的选择长度不能超过 64 个字符")
	public String getAecopd_5_2_1() {
		return aecopd_5_2_1;
	}

	public void setAecopd_5_2_1(String aecopd_5_2_1) {
		this.aecopd_5_2_1 = aecopd_5_2_1;
	}
	
	@Length(min=0, max=64, message="其他使用糖皮质激素药物长度不能超过 64 个字符")
	public String getAecopd_5_2_1_1() {
		return aecopd_5_2_1_1;
	}

	public void setAecopd_5_2_1_1(String aecopd_5_2_1_1) {
		this.aecopd_5_2_1_1 = aecopd_5_2_1_1;
	}
	
	@Length(min=0, max=64, message="全身使用糖皮质激素药物起始日期长度不能超过 64 个字符")
	public String getAecopd_5_2_2() {
		return aecopd_5_2_2;
	}

	public void setAecopd_5_2_2(String aecopd_5_2_2) {
		this.aecopd_5_2_2 = aecopd_5_2_2;
	}
	
	@Length(min=0, max=64, message="全身使用糖皮质激素药物终止日期长度不能超过 64 个字符")
	public String getAecopd_5_2_3() {
		return aecopd_5_2_3;
	}

	public void setAecopd_5_2_3(String aecopd_5_2_3) {
		this.aecopd_5_2_3 = aecopd_5_2_3;
	}
	
	@Length(min=0, max=64, message="是否有有心功不全长度不能超过 64 个字符")
	public String getAecopd_6_1_1() {
		return aecopd_6_1_1;
	}

	public void setAecopd_6_1_1(String aecopd_6_1_1) {
		this.aecopd_6_1_1 = aecopd_6_1_1;
	}
	
	@Length(min=0, max=64, message="首位处置项目长度不能超过 64 个字符")
	public String getAecopd_6_1_2() {
		return aecopd_6_1_2;
	}

	public void setAecopd_6_1_2(String aecopd_6_1_2) {
		this.aecopd_6_1_2 = aecopd_6_1_2;
	}
	
	@Length(min=0, max=64, message="有心功不全时,其他处置项目长度不能超过 64 个字符")
	public String getAecopd_6_1_2_1() {
		return aecopd_6_1_2_1;
	}

	public void setAecopd_6_1_2_1(String aecopd_6_1_2_1) {
		this.aecopd_6_1_2_1 = aecopd_6_1_2_1;
	}
	
	@Length(min=0, max=64, message="是否有有肺动脉高压和右心功能不全长度不能超过 64 个字符")
	public String getAecopd_6_2_1() {
		return aecopd_6_2_1;
	}

	public void setAecopd_6_2_1(String aecopd_6_2_1) {
		this.aecopd_6_2_1 = aecopd_6_2_1;
	}
	
	@Length(min=0, max=64, message="使用血管扩张剂长度不能超过 64 个字符")
	public String getAecopd_6_2_2() {
		return aecopd_6_2_2;
	}

	public void setAecopd_6_2_2(String aecopd_6_2_2) {
		this.aecopd_6_2_2 = aecopd_6_2_2;
	}
	
	@Length(min=0, max=64, message="有肺动脉高压和右心功能不全时,使用其他血管扩张剂长度不能超过 64 个字符")
	public String getAecopd_6_2_2_1() {
		return aecopd_6_2_2_1;
	}

	public void setAecopd_6_2_2_1(String aecopd_6_2_2_1) {
		this.aecopd_6_2_2_1 = aecopd_6_2_2_1;
	}
	
	@Length(min=0, max=64, message="是否有血栓形成高危因素长度不能超过 64 个字符")
	public String getAecopd_6_3_1() {
		return aecopd_6_3_1;
	}

	public void setAecopd_6_3_1(String aecopd_6_3_1) {
		this.aecopd_6_3_1 = aecopd_6_3_1;
	}
	
	@Length(min=0, max=64, message="首位处置项目长度不能超过 64 个字符")
	public String getAecopd_6_3_2() {
		return aecopd_6_3_2;
	}

	public void setAecopd_6_3_2(String aecopd_6_3_2) {
		this.aecopd_6_3_2 = aecopd_6_3_2;
	}
	
	@Length(min=0, max=64, message="有血栓形成高危因素时,其他处置项目长度不能超过 64 个字符")
	public String getAecopd_6_3_2_1() {
		return aecopd_6_3_2_1;
	}

	public void setAecopd_6_3_2_1(String aecopd_6_3_2_1) {
		this.aecopd_6_3_2_1 = aecopd_6_3_2_1;
	}
	
	@Length(min=0, max=64, message="是否有呼吸功能不全长度不能超过 64 个字符")
	public String getAecopd_6_4_1() {
		return aecopd_6_4_1;
	}

	public void setAecopd_6_4_1(String aecopd_6_4_1) {
		this.aecopd_6_4_1 = aecopd_6_4_1;
	}
	
	@Length(min=0, max=64, message="首位处置项目长度不能超过 64 个字符")
	public String getAecopd_6_4_2() {
		return aecopd_6_4_2;
	}

	public void setAecopd_6_4_2(String aecopd_6_4_2) {
		this.aecopd_6_4_2 = aecopd_6_4_2;
	}
	
	@Length(min=0, max=64, message="有呼吸功能不全时,其他处置项目长度不能超过 64 个字符")
	public String getAecopd_6_4_2_1() {
		return aecopd_6_4_2_1;
	}

	public void setAecopd_6_4_2_1(String aecopd_6_4_2_1) {
		this.aecopd_6_4_2_1 = aecopd_6_4_2_1;
	}
	
	@Length(min=0, max=64, message="是否有气胸长度不能超过 64 个字符")
	public String getAecopd_6_5_1() {
		return aecopd_6_5_1;
	}

	public void setAecopd_6_5_1(String aecopd_6_5_1) {
		this.aecopd_6_5_1 = aecopd_6_5_1;
	}
	
	@Length(min=0, max=64, message="首位处置项目长度不能超过 64 个字符")
	public String getAecopd_6_5_2() {
		return aecopd_6_5_2;
	}

	public void setAecopd_6_5_2(String aecopd_6_5_2) {
		this.aecopd_6_5_2 = aecopd_6_5_2;
	}
	
	@Length(min=0, max=64, message="有气胸时,其他处置项目长度不能超过 64 个字符")
	public String getAecopd_6_5_2_1() {
		return aecopd_6_5_2_1;
	}

	public void setAecopd_6_5_2_1(String aecopd_6_5_2_1) {
		this.aecopd_6_5_2_1 = aecopd_6_5_2_1;
	}
	
	@Length(min=0, max=64, message="是否实施无创正压通气长度不能超过 64 个字符")
	public String getAecopd_7_1_1() {
		return aecopd_7_1_1;
	}

	public void setAecopd_7_1_1(String aecopd_7_1_1) {
		this.aecopd_7_1_1 = aecopd_7_1_1;
	}
	
	@Length(min=0, max=64, message="无创正压通气的应用指征长度不能超过 64 个字符")
	public String getAecopd_7_1_2() {
		return aecopd_7_1_2;
	}

	public void setAecopd_7_1_2(String aecopd_7_1_2) {
		this.aecopd_7_1_2 = aecopd_7_1_2;
	}
	
	@Length(min=0, max=64, message="NIV相对禁忌证长度不能超过 64 个字符")
	public String getAecopd_7_1_3_1() {
		return aecopd_7_1_3_1;
	}

	public void setAecopd_7_1_3_1(String aecopd_7_1_3_1) {
		this.aecopd_7_1_3_1 = aecopd_7_1_3_1;
	}
	
	@Length(min=0, max=64, message="患者无创正压通气起始日期时间长度不能超过 64 个字符")
	public String getAecopd_7_1_6() {
		return aecopd_7_1_6;
	}

	public void setAecopd_7_1_6(String aecopd_7_1_6) {
		this.aecopd_7_1_6 = aecopd_7_1_6;
	}
	
	@Length(min=0, max=64, message="患者无创正压通气终止日期时间长度不能超过 64 个字符")
	public String getAecopd_7_1_7() {
		return aecopd_7_1_7;
	}

	public void setAecopd_7_1_7(String aecopd_7_1_7) {
		this.aecopd_7_1_7 = aecopd_7_1_7;
	}
	
	public Double getAecopd_7_1_8() {
		return aecopd_7_1_8;
	}

	public void setAecopd_7_1_8(Double aecopd_7_1_8) {
		this.aecopd_7_1_8 = aecopd_7_1_8;
	}
	
	@Length(min=0, max=64, message="是否实施有创机械通气长度不能超过 64 个字符")
	public String getAecopd_7_2_1() {
		return aecopd_7_2_1;
	}

	public void setAecopd_7_2_1(String aecopd_7_2_1) {
		this.aecopd_7_2_1 = aecopd_7_2_1;
	}
	
	@Length(min=0, max=64, message="有创机械通气指征长度不能超过 64 个字符")
	public String getAecopd_7_2_2() {
		return aecopd_7_2_2;
	}

	public void setAecopd_7_2_2(String aecopd_7_2_2) {
		this.aecopd_7_2_2 = aecopd_7_2_2;
	}
	
	@Length(min=0, max=64, message="患者有机械通气起始日期时间长度不能超过 64 个字符")
	public String getAecopd_7_2_5_1() {
		return aecopd_7_2_5_1;
	}

	public void setAecopd_7_2_5_1(String aecopd_7_2_5_1) {
		this.aecopd_7_2_5_1 = aecopd_7_2_5_1;
	}
	
	@Length(min=0, max=64, message="患者有机械通气终止日期时间长度不能超过 64 个字符")
	public String getAecopd_7_2_6() {
		return aecopd_7_2_6;
	}

	public void setAecopd_7_2_6(String aecopd_7_2_6) {
		this.aecopd_7_2_6 = aecopd_7_2_6;
	}
	
	public Double getAecopd_7_2_7() {
		return aecopd_7_2_7;
	}

	public void setAecopd_7_2_7(Double aecopd_7_2_7) {
		this.aecopd_7_2_7 = aecopd_7_2_7;
	}
	
	@Length(min=0, max=64, message="是否实施有创-无创序贯通气疗法长度不能超过 64 个字符")
	public String getAecopd_7_3_1() {
		return aecopd_7_3_1;
	}

	public void setAecopd_7_3_1(String aecopd_7_3_1) {
		this.aecopd_7_3_1 = aecopd_7_3_1;
	}
	
	@Length(min=0, max=64, message="有无吸烟史长度不能超过 64 个字符")
	public String getAecopd_8_1_1() {
		return aecopd_8_1_1;
	}

	public void setAecopd_8_1_1(String aecopd_8_1_1) {
		this.aecopd_8_1_1 = aecopd_8_1_1;
	}
	
	@Length(min=0, max=64, message="吸烟程度评估有记录长度不能超过 64 个字符")
	public String getAecopd_8_2() {
		return aecopd_8_2;
	}

	public void setAecopd_8_2(String aecopd_8_2) {
		this.aecopd_8_2 = aecopd_8_2;
	}
	
	@Length(min=0, max=64, message="接受戒烟的建议或者戒烟治疗有记录长度不能超过 64 个字符")
	public String getAecopd_8_3() {
		return aecopd_8_3;
	}

	public void setAecopd_8_3(String aecopd_8_3) {
		this.aecopd_8_3 = aecopd_8_3;
	}
	
	@Length(min=0, max=64, message="交与患者“出院小结”的副本告知患者出院时风险因素长度不能超过 64 个字符")
	public String getCm_7_2_1() {
		return cm_7_2_1;
	}

	public void setCm_7_2_1(String cm_7_2_1) {
		this.cm_7_2_1 = cm_7_2_1;
	}
	
	@Length(min=0, max=64, message="出院带药长度不能超过 64 个字符")
	public String getCm_7_2_2() {
		return cm_7_2_2;
	}

	public void setCm_7_2_2(String cm_7_2_2) {
		this.cm_7_2_2 = cm_7_2_2;
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
	
	@Length(min=0, max=64, message="告知何为发生紧急意外情况或者疾病复发长度不能超过 64 个字符")
	public String getCm_7_2_3() {
		return cm_7_2_3;
	}

	public void setCm_7_2_3(String cm_7_2_3) {
		this.cm_7_2_3 = cm_7_2_3;
	}
	
	@Length(min=0, max=64, message="符合出院标准长度不能超过 64 个字符")
	public String getAecopd_9_1_1() {
		return aecopd_9_1_1;
	}

	public void setAecopd_9_1_1(String aecopd_9_1_1) {
		this.aecopd_9_1_1 = aecopd_9_1_1;
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