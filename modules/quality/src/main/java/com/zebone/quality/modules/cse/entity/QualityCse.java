/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.cse.entity;

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
 * CSE惊厥性癫痫持续状态Entity
 * @author 卡卡西
 * @version 2021-01-18
 */
@Table(name="quality_cse", alias="a", columns={
		@Column(name="cm_0_1_1_1", attrName="cm_0_1_1_1", label="质控医师"),
		@Column(name="cm_0_1_1_2", attrName="cm_0_1_1_2", label="质控护士"),
		@Column(name="cm_0_1_1_3", attrName="cm_0_1_1_3", label="主治医师"),
		@Column(name="cm_0_1_1_4", attrName="cm_0_1_1_4", label="责任护士"),
		@Column(name="cm_0_1_1_5", attrName="cm_0_1_1_5", label="上报科室"),
		@Column(name="case_id", attrName="caseId", label="患者病案号"),
		@Column(name="cm_0_1_3_1", attrName="cm_0_1_3_1", label="主要诊断ICD-10四位亚目编码与名称"),
		@Column(name="cm_0_1_3_2", attrName="cm_0_1_3_2", label="主要诊断ICD-10六位临床扩展编码与名称"),
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
		@Column(includeEntity=DataEntity.class),
		@Column(name="cm_0_2_3_2", attrName="cm_0_2_3_2", label="到达本院急诊或者门诊日期时间"),
		@Column(name="cm_0_2_4_1", attrName="cm_0_2_4_1", label="入院日期时间"),
		@Column(name="cm_0_2_4_2", attrName="cm_0_2_4_2", label="出院日期时间"),
		@Column(name="cm_0_2_5_1", attrName="cm_0_2_5_1", label="入住CCU日期时间"),
		@Column(name="cm_0_2_5_2", attrName="cm_0_2_5_2", label="离开CCU日期时间"),
		@Column(name="cm_0_2_6_1", attrName="cm_0_2_6_1", label="手术开始", comment="手术开始（切皮）日期时间"),
		@Column(name="cm_0_2_6_2", attrName="cm_0_2_6_2", label="手术结束", comment="手术结束（缝皮结束）日期时间"),
		@Column(name="cm_0_3_1", attrName="cm_0_3_1", label="费用支付方式"),
		@Column(name="cm_0_3_2", attrName="cm_0_3_2", label="收入住院途径"),
		@Column(name="cm_0_3_3", attrName="cm_0_3_3", label="到院交通工具"),
		@Column(name="cse_0_4_1", attrName="cse_0_4_1", label="是否现场评估生命体征"),
		@Column(name="cse_0_4_2", attrName="cse_0_4_2", label="是否现场记录发作开始时间"),
		@Column(name="cse_0_4_3", attrName="cse_0_4_3", label="现场急救维持生命体征稳定"),
		@Column(name="cse_1_1_1", attrName="cse_1_1_1", label="本院首诊医师接诊日期时间"),
		@Column(name="cse_1_1_2", attrName="cse_1_1_2", label="既往诊断过癫痫"),
		@Column(name="cse_1_1_3", attrName="cse_1_1_3", label="是否服用过抗癫痫药物"),
		@Column(name="cse_1_1_4", attrName="cse_1_1_4", label="评估发作起始日期"),
		@Column(name="cse_1_2_1", attrName="cse_1_2_1", label="绿色通道中观察期所采取的紧急救治措施"),
		@Column(name="cse_1_2_1_1", attrName="cse_1_2_1_1", label="其它绿色通道中观察期所可采取的紧急救治措施"),
		@Column(name="cse_1_2_2", attrName="cse_1_2_2", label="完成紧急救治措施的日期时间"),
		@Column(name="cse_1_2_3", attrName="cse_1_2_3", label="实施严重程度STESS评估"),
		@Column(name="cse_1_2_4", attrName="cse_1_2_4", label="完成评估日期时间"),
		@Column(name="cse_1_2_5", attrName="cse_1_2_5", label="实施严重程度STESS评估分值"),
		@Column(name="cse_1_2_3_1", attrName="cse_1_2_3_1", label="是否实施EMSE评估"),
		@Column(name="cse_1_2_3_2", attrName="cse_1_2_3_2", label="完成评估日期时间"),
		@Column(name="cse_1_2_3_3", attrName="cse_1_2_3_3", label="实施严重程度EMSE评估分值"),
		@Column(name="cse_1_2_6_1", attrName="cse_1_2_6_1", label="呼吸", comment="呼吸(单位:次/分)"),
		@Column(name="cse_1_2_6_2", attrName="cse_1_2_6_2", label="脉搏", comment="脉搏(单位:次/分)"),
		@Column(name="cse_1_2_6_3", attrName="cse_1_2_6_3", label="收缩压", comment="收缩压(单位:mmHg)"),
		@Column(name="cse_1_2_6_4", attrName="cse_1_2_6_4", label="舒张压", comment="舒张压(单位:mmHg)"),
		@Column(name="cse_1_2_6_5", attrName="cse_1_2_6_5", label="身高", comment="身高(单位:厘米(cm))"),
		@Column(name="cse_1_2_6_6", attrName="cse_1_2_6_6", label="体重", comment="体重(单位:公斤(kg))"),
		@Column(name="cse_1_2_7", attrName="cse_1_2_7", label="是否进行血/尿药物浓度筛查"),
		@Column(name="cse_1_2_8_1", attrName="cse_1_2_8_1", label="药物浓度筛查报告日期时间是否确定"),
		@Column(name="cse_1_2_8", attrName="cse_1_2_8", label="药物浓度筛查报告日期时间"),
		@Column(name="cse_1_2_9", attrName="cse_1_2_9", label="是否进行毒物筛查"),
		@Column(name="cse_1_2_10", attrName="cse_1_2_10", label="是否实施首次心电图", comment="是否实施首次心电图（ECG）检查"),
		@Column(name="cse_1_2_11", attrName="cse_1_2_11", label="报告日期时间"),
		@Column(name="cse_1_2_12", attrName="cse_1_2_12", label="心电图", comment="心电图（ECG）检查结果选择"),
		@Column(name="cse_1_2_12_1", attrName="cse_1_2_12_1", label="其他心电图", comment="其他心电图（ECG）检查结果选择"),
		@Column(name="cse_2_1_1", attrName="cse_2_1_1", label="初始治疗选择"),
		@Column(name="cse_2_1_2", attrName="cse_2_1_2", label="有静脉通路", comment="有静脉通路：静脉注射地西泮"),
		@Column(name="cse_2_1_2_1", attrName="cse_2_1_2_1", label="其他有静脉通路"),
		@Column(name="cse_2_1_3", attrName="cse_2_1_3", label="静脉注射时间"),
		@Column(name="cse_2_1_4", attrName="cse_2_1_4", label="无静脉通路", comment="无静脉通路:肌肉注射米达唑仑"),
		@Column(name="cse_2_1_4_1", attrName="cse_2_1_4_1", label="其他无静脉通路"),
		@Column(name="cse_2_1_5", attrName="cse_2_1_5", label="肌肉注射时间"),
		@Column(name="cse_2_2_0", attrName="cse_2_2_0", label="是否达到终止标准"),
		@Column(name="cse_2_2_1", attrName="cse_2_2_1", label="达到终止标准依据"),
		@Column(name="cse_2_2_2", attrName="cse_2_2_2", label="脑电图", comment="脑电图（EEG）检查结果选择"),
		@Column(name="cse_2_2_2_1", attrName="cse_2_2_2_1", label="其他脑电图", comment="其他脑电图（EEG）检查结果"),
		@Column(name="cse_2_2_3", attrName="cse_2_2_3", label="治疗后发作缓解时间"),
		@Column(name="cse_2_2_4", attrName="cse_2_2_4", label="终止发作后是否进行过渡治疗"),
		@Column(name="cse_2_2_4_1", attrName="cse_2_2_4_1", label="其他终止发作后是否进行过渡治疗"),
		@Column(name="cse_3_1_1", attrName="cse_3_1_1", label="实施初始治疗失败"),
		@Column(name="cse_3_1_2", attrName="cse_3_1_2", label="给予第二阶段", comment="给予第二阶段（20-40min) 静脉治疗"),
		@Column(name="cse_3_1_2_1", attrName="cse_3_1_2_1", label="其他第二阶段", comment="其他第二阶段（20-40min) 静脉治疗"),
		@Column(name="cse_3_1_3", attrName="cse_3_1_3", label="静脉治疗时间"),
		@Column(name="cse_3_2_1", attrName="cse_3_2_1", label="是否达到终止标准"),
		@Column(name="cse_3_2_2", attrName="cse_3_2_2", label="脑电图", comment="脑电图（EEG）检查结果选择"),
		@Column(name="cse_3_2_2_1", attrName="cse_3_2_2_1", label="其他脑电图", comment="其他脑电图（EEG）检查结果"),
		@Column(name="cse_3_2_3", attrName="cse_3_2_3", label="治疗后发作缓解时间"),
		@Column(name="cse_3_2_4", attrName="cse_3_2_4", label="终止发作后是否进行过渡治疗"),
		@Column(name="cse_3_2_4_1", attrName="cse_3_2_4_1", label="其他终止发作后是否进行过渡治疗"),
		@Column(name="cse_4_1_1", attrName="cse_4_1_1", label="第二阶段静脉治疗失败"),
		@Column(name="cse_4_1_2", attrName="cse_4_1_2", label="给予第三阶段", comment="给予第三阶段（40-60min) 治疗"),
		@Column(name="cse_4_1_2_1", attrName="cse_4_1_2_1", label="其他第三阶段", comment="其他第三阶段（40-60min) 治疗"),
		@Column(name="cse_4_1_3", attrName="cse_4_1_3", label="super-RSE治疗"),
		@Column(name="cse_4_1_3_2", attrName="cse_4_1_3_2", label="外科手术"),
		@Column(name="cse_4_1_3_1", attrName="cse_4_1_3_1", label="其他super-RSE治疗"),
		@Column(name="cse_4_1_4", attrName="cse_4_1_4", label="进入难治性癫痫持续状态RSE治疗时间"),
		@Column(name="cse_4_2_1", attrName="cse_4_2_1", label="是否达到终止标准"),
		@Column(name="cse_4_2_2", attrName="cse_4_2_2", label="脑电图", comment="脑电图（EEG）检查结果选择"),
		@Column(name="cse_4_2_2_1", attrName="cse_4_2_2_1", label="其他脑电图", comment="其他脑电图（EEG）检查结果"),
		@Column(name="cse_4_2_3", attrName="cse_4_2_3", label="治疗后发作缓解时间"),
		@Column(name="cse_4_2_4", attrName="cse_4_2_4", label="RSE终止发作后是否进行过渡治疗"),
		@Column(name="cse_4_2_4_1", attrName="cse_4_2_4_1", label="其他RSE终止发作后是否进行过渡治疗"),
		@Column(name="cse_5_1_1", attrName="cse_5_1_1", label="是否进入ICU提供相应生命支持"),
		@Column(name="cse_5_1_2", attrName="cse_5_1_2", label="入住ICU日期时间"),
		@Column(name="cse_5_1_3", attrName="cse_5_1_3", label="提供相应生命支持"),
		@Column(name="cse_5_1_3_1", attrName="cse_5_1_3_1", label="其他提供相应生命支持"),
		@Column(name="cse_5_2_1", attrName="cse_5_2_1", label="是否实施无创正压通气", comment="是否实施无创正压通气（NIPPV）"),
		@Column(name="cse_5_2_2", attrName="cse_5_2_2", label="患者无创正压通气起始日期时间"),
		@Column(name="cse_5_2_3", attrName="cse_5_2_3", label="患者无创正压通气终止日期时间"),
		@Column(name="cse_5_2_4", attrName="cse_5_2_4", label="无创正压通气疗程", comment="无创正压通气疗程（天数）"),
		@Column(name="cse_5_3_1", attrName="cse_5_3_1", label="是否实施有创机械通气"),
		@Column(name="cse_5_3_2", attrName="cse_5_3_2", label="患者有机械通气起始日期时间"),
		@Column(name="cse_5_3_3", attrName="cse_5_3_3", label="患者有机械通气终止日期时间"),
		@Column(name="cse_5_3_4", attrName="cse_5_3_4", label="有机械通气疗程", comment="有机械通气疗程（天数）"),
		@Column(name="cse_6_1_1", attrName="cse_6_1_1", label="是否实施首次头部影像学检查"),
		@Column(name="cse_6_1_2", attrName="cse_6_1_2", label="头部影像学检查项目"),
		@Column(name="cse_6_1_3", attrName="cse_6_1_3", label="报告日期时间"),
		@Column(name="cse_6_2_1", attrName="cse_6_2_1", label="实施首次脑脊液检查"),
		@Column(name="cse_6_2_2", attrName="cse_6_2_2", label="脑脊液检查项目"),
		@Column(name="cse_6_2_3", attrName="cse_6_2_3", label="报告日期时间"),
		@Column(name="cse_6_3_1", attrName="cse_6_3_1", label="既往是否诊断癫痫"),
		@Column(name="cse_6_3_6", attrName="cse_6_3_6", label="近期发作情况为"),
		@Column(name="cse_6_3_7", attrName="cse_6_3_7", label="具体发作频率为"),
		@Column(name="cse_6_3_3", attrName="cse_6_3_3", label="发作是否为局灶起源"),
		@Column(name="cse_6_3_4", attrName="cse_6_3_4", label="发作是否伴知觉障碍"),
		@Column(name="cse_6_3_5", attrName="cse_6_3_5", label="发作是否以运动症状起病"),
		@Column(name="cse_6_3_8", attrName="cse_6_3_8", label="发作是否为全面起源"),
		@Column(name="cse_6_3_9", attrName="cse_6_3_9", label="发作包含何种表现"),
		@Column(name="cse_6_3_10", attrName="cse_6_3_10", label="发作是否为未知起源", comment="发作是否为未知起源（指发作起源被错过或掩盖）"),
		@Column(name="cse_6_3_11", attrName="cse_6_3_11", label="是否为不能分类的癫痫发作", comment="是否为不能分类的癫痫发作（根据现有信息无法分类的发作）"),
		@Column(name="cse_6_3_12", attrName="cse_6_3_12", label="是否服用过抗癫痫药物"),
		@Column(name="cse_6_3_2", attrName="cse_6_3_2", label="首次使用抗癫痫药物日期"),
		@Column(name="cse_6_3_13", attrName="cse_6_3_13", label="使用的抗癫痫药物种类"),
		@Column(name="cse_6_3_13_1", attrName="cse_6_3_13_1", label="其他抗癫痫药物种类"),
		@Column(name="cse_6_3_14", attrName="cse_6_3_14", label="是否目前正在使用此药，并且已连续规律使用三个月及以上"),
		@Column(name="cse_6_3_15", attrName="cse_6_3_15", label="既往或者现在使用此药期间是否有严重不良事件"),
		@Column(name="cse_7_1_0", attrName="cse_7_1_0", label="是否入院时进行重点护理评估且有记录"),
		@Column(name="cse_7_1_1", attrName="cse_7_1_1", label="行走评估结果"),
		@Column(name="cse_7_1_2", attrName="cse_7_1_2", label="呼吸评估结果"),
		@Column(name="cse_7_1_3", attrName="cse_7_1_3", label="饮食评估结果"),
		@Column(name="cse_7_1_4", attrName="cse_7_1_4", label="吞咽评估结果"),
		@Column(name="cse_7_1_5_0", attrName="cse_7_1_5_0", label="压疮评估", comment="压疮评估（Braden评分值）分值"),
		@Column(name="cse_7_1_5", attrName="cse_7_1_5", label="压疮评估", comment="压疮评估（Braden评分值）分值"),
		@Column(name="cse_7_1_5_1", attrName="cse_7_1_5_1", label="压疮评估结果选择"),
		@Column(name="cse_7_1_5_2", attrName="cse_7_1_5_2", label="预防压疮告知"),
		@Column(name="cse_7_1_6", attrName="cse_7_1_6", label="实施癫痫持续状态健康教育有记录"),
		@Column(name="cse_7_2_1", attrName="cse_7_2_1", label="出院时是否进行STESS评分"),
		@Column(name="cse_7_2_1_1", attrName="cse_7_2_1_1", label="STESS评分值"),
		@Column(name="cse_7_2_2_1", attrName="cse_7_2_2_1", label="交与患者“出院小结”的副本，并告知患者出院时风险因素"),
		@Column(name="cse_7_2_2_2", attrName="cse_7_2_2_2", label="出院带药"),
		@Column(name="cse_7_2_2_3", attrName="cse_7_2_2_3", label="告知发生紧急情况时求援救治途径"),
		@Column(name="cse_7_2_2_4", attrName="cse_7_2_2_4", label="出院时教育与随访"),
		@Column(name="cse_7_2_2_5", attrName="cse_7_2_2_5", label="告知何为风险因素与紧急情况"),
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
		@Column(name="cm_3_1", attrName="cm31", label="手术野皮肤准备常用方法的选择"),
		@Column(name="cm_3_2", attrName="cm32", label="使用含抗菌剂", comment="使用含抗菌剂（三氯生）缝线"),
		@Column(name="cm_3_2_1", attrName="cm321", label="其他含抗菌剂缝线填写"),
		@Column(name="cm_3_3", attrName="cm33", label="手术切口类别的选择"),
		@Column(name="cm_3_4", attrName="cm34", label="手术切口愈合情况的选择"),
		@Column(name="id", attrName="id", label="id", isPK=true),
	}, orderBy="a.update_date DESC"
)
public class QualityCse extends DataEntity<QualityCse> {
	
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
	private Date cm_0_2_5_1;		// 入住CCU日期时间
	private Date cm_0_2_5_2;		// 离开CCU日期时间
	private Date cm_0_2_6_1;		// 手术开始（切皮）日期时间
	private Date cm_0_2_6_2;		// 手术结束（缝皮结束）日期时间
	private String cm_0_3_1;		// 费用支付方式
	private String cm_0_3_2;		// 收入住院途径
	private String cm_0_3_3;		// 到院交通工具
	private String cse_0_4_1;		// 是否现场评估生命体征
	private String cse_0_4_2;		// 是否现场记录发作开始时间
	private String cse_0_4_3;		// 现场急救维持生命体征稳定
	private String cse_1_1_1;		// 本院首诊医师接诊日期时间
	private String cse_1_1_2;		// 既往诊断过癫痫
	private String cse_1_1_3;		// 是否服用过抗癫痫药物
	private String cse_1_1_4;		// 评估发作起始日期
	private String cse_1_2_1;		// 绿色通道中观察期所采取的紧急救治措施
	private String cse_1_2_1_1;		// 其它绿色通道中观察期所可采取的紧急救治措施
	private String cse_1_2_2;		// 完成紧急救治措施的日期时间
	private String cse_1_2_3;		// 实施严重程度STESS评估
	private String cse_1_2_4;		// 完成评估日期时间
	private Double cse_1_2_5;		// 实施严重程度STESS评估分值
	private String cse_1_2_3_1;		// 是否实施EMSE评估
	private String cse_1_2_3_2;		// 完成评估日期时间
	private Double cse_1_2_3_3;		// 实施严重程度EMSE评估分值
	private Double cse_1_2_6_1;		// 呼吸(单位:次/分)
	private Double cse_1_2_6_2;		// 脉搏(单位:次/分)
	private Double cse_1_2_6_3;		// 收缩压(单位:mmHg)
	private Double cse_1_2_6_4;		// 舒张压(单位:mmHg)
	private Double cse_1_2_6_5;		// 身高(单位:厘米(cm))
	private Double cse_1_2_6_6;		// 体重(单位:公斤(kg))
	private String cse_1_2_7;		// 是否进行血/尿药物浓度筛查
	private String cse_1_2_8_1;		// 药物浓度筛查报告日期时间是否确定
	private String cse_1_2_8;		// 药物浓度筛查报告日期时间
	private String cse_1_2_9;		// 是否进行毒物筛查
	private String cse_1_2_10;		// 是否实施首次心电图（ECG）检查
	private String cse_1_2_11;		// 报告日期时间
	private String cse_1_2_12;		// 心电图（ECG）检查结果选择
	private String cse_1_2_12_1;		// 其他心电图（ECG）检查结果选择
	private String cse_2_1_1;		// 初始治疗选择
	private String cse_2_1_2;		// 有静脉通路：静脉注射地西泮
	private String cse_2_1_2_1;		// 其他有静脉通路
	private String cse_2_1_3;		// 静脉注射时间
	private String cse_2_1_4;		// 无静脉通路:肌肉注射米达唑仑
	private String cse_2_1_4_1;		// 其他无静脉通路
	private String cse_2_1_5;		// 肌肉注射时间
	private String cse_2_2_0;		// 是否达到终止标准
	private String cse_2_2_1;		// 达到终止标准依据
	private String cse_2_2_2;		// 脑电图（EEG）检查结果选择
	private String cse_2_2_2_1;		// 其他脑电图（EEG）检查结果
	private String cse_2_2_3;		// 治疗后发作缓解时间
	private String cse_2_2_4;		// 终止发作后是否进行过渡治疗
	private String cse_2_2_4_1;		// 其他终止发作后是否进行过渡治疗
	private String cse_3_1_1;		// 实施初始治疗失败
	private String cse_3_1_2;		// 给予第二阶段（20-40min) 静脉治疗
	private String cse_3_1_2_1;		// 其他第二阶段（20-40min) 静脉治疗
	private String cse_3_1_3;		// 静脉治疗时间
	private String cse_3_2_1;		// 是否达到终止标准
	private String cse_3_2_2;		// 脑电图（EEG）检查结果选择
	private String cse_3_2_2_1;		// 其他脑电图（EEG）检查结果
	private String cse_3_2_3;		// 治疗后发作缓解时间
	private String cse_3_2_4;		// 终止发作后是否进行过渡治疗
	private String cse_3_2_4_1;		// 其他终止发作后是否进行过渡治疗
	private String cse_4_1_1;		// 第二阶段静脉治疗失败
	private String cse_4_1_2;		// 给予第三阶段（40-60min) 治疗
	private String cse_4_1_2_1;		// 其他第三阶段（40-60min) 治疗
	private String cse_4_1_3;		// super-RSE治疗
	private String cse_4_1_3_2;		// 外科手术
	private String cse_4_1_3_1;		// 其他super-RSE治疗
	private String cse_4_1_4;		// 进入难治性癫痫持续状态RSE治疗时间
	private String cse_4_2_1;		// 是否达到终止标准
	private String cse_4_2_2;		// 脑电图（EEG）检查结果选择
	private String cse_4_2_2_1;		// 其他脑电图（EEG）检查结果
	private String cse_4_2_3;		// 治疗后发作缓解时间
	private String cse_4_2_4;		// RSE终止发作后是否进行过渡治疗
	private String cse_4_2_4_1;		// 其他RSE终止发作后是否进行过渡治疗
	private String cse_5_1_1;		// 是否进入ICU提供相应生命支持
	private String cse_5_1_2;		// 入住ICU日期时间
	private String cse_5_1_3;		// 提供相应生命支持
	private String cse_5_1_3_1;		// 其他提供相应生命支持
	private String cse_5_2_1;		// 是否实施无创正压通气（NIPPV）
	private String cse_5_2_2;		// 患者无创正压通气起始日期时间
	private String cse_5_2_3;		// 患者无创正压通气终止日期时间
	private Double cse_5_2_4;		// 无创正压通气疗程（天数）
	private String cse_5_3_1;		// 是否实施有创机械通气
	private String cse_5_3_2;		// 患者有机械通气起始日期时间
	private String cse_5_3_3;		// 患者有机械通气终止日期时间
	private Double cse_5_3_4;		// 有机械通气疗程（天数）
	private String cse_6_1_1;		// 是否实施首次头部影像学检查
	private String cse_6_1_2;		// 头部影像学检查项目
	private String cse_6_1_3;		// 报告日期时间
	private String cse_6_2_1;		// 实施首次脑脊液检查
	private String cse_6_2_2;		// 脑脊液检查项目
	private String cse_6_2_3;		// 报告日期时间
	private String cse_6_3_1;		// 既往是否诊断癫痫
	private String cse_6_3_6;		// 近期发作情况为
	private String cse_6_3_7;		// 具体发作频率为
	private String cse_6_3_3;		// 发作是否为局灶起源
	private String cse_6_3_4;		// 发作是否伴知觉障碍
	private String cse_6_3_5;		// 发作是否以运动症状起病
	private String cse_6_3_8;		// 发作是否为全面起源
	private String cse_6_3_9;		// 发作包含何种表现
	private String cse_6_3_10;		// 发作是否为未知起源（指发作起源被错过或掩盖）
	private String cse_6_3_11;		// 是否为不能分类的癫痫发作（根据现有信息无法分类的发作）
	private String cse_6_3_12;		// 是否服用过抗癫痫药物
	private String cse_6_3_2;		// 首次使用抗癫痫药物日期
	private String cse_6_3_13;		// 使用的抗癫痫药物种类
	private String cse_6_3_13_1;		// 其他抗癫痫药物种类
	private String cse_6_3_14;		// 是否目前正在使用此药，并且已连续规律使用三个月及以上
	private String cse_6_3_15;		// 既往或者现在使用此药期间是否有严重不良事件
	private String cse_7_1_0;		// 是否入院时进行重点护理评估且有记录
	private String cse_7_1_1;		// 行走评估结果
	private String cse_7_1_2;		// 呼吸评估结果
	private String cse_7_1_3;		// 饮食评估结果
	private String cse_7_1_4;		// 吞咽评估结果
	private String cse_7_1_5_0;		// 压疮评估（Braden评分值）分值
	private Double cse_7_1_5;		// 压疮评估（Braden评分值）分值
	private String cse_7_1_5_1;		// 压疮评估结果选择
	private String cse_7_1_5_2;		// 预防压疮告知
	private String cse_7_1_6;		// 实施癫痫持续状态健康教育有记录
	private String cse_7_2_1;		// 出院时是否进行STESS评分
	private Double cse_7_2_1_1;		// STESS评分值
	private String cse_7_2_2_1;		// 交与患者“出院小结”的副本，并告知患者出院时风险因素
	private String cse_7_2_2_2;		// 出院带药
	private String cse_7_2_2_3;		// 告知发生紧急情况时求援救治途径
	private String cse_7_2_2_4;		// 出院时教育与随访
	private String cse_7_2_2_5;		// 告知何为风险因素与紧急情况
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
	private String cm31;		// 手术野皮肤准备常用方法的选择
	private String cm32;		// 使用含抗菌剂（三氯生）缝线
	private String cm321;		// 其他含抗菌剂缝线填写
	private String cm33;		// 手术切口类别的选择
	private String cm34;		// 手术切口愈合情况的选择
	
	public QualityCse() {
		this(null);
	}

	public QualityCse(String id){
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
	
	@Length(min=0, max=64, message="是否现场评估生命体征长度不能超过 64 个字符")
	public String getCse_0_4_1() {
		return cse_0_4_1;
	}

	public void setCse_0_4_1(String cse_0_4_1) {
		this.cse_0_4_1 = cse_0_4_1;
	}
	
	@Length(min=0, max=64, message="是否现场记录发作开始时间长度不能超过 64 个字符")
	public String getCse_0_4_2() {
		return cse_0_4_2;
	}

	public void setCse_0_4_2(String cse_0_4_2) {
		this.cse_0_4_2 = cse_0_4_2;
	}
	
	@Length(min=0, max=64, message="现场急救维持生命体征稳定长度不能超过 64 个字符")
	public String getCse_0_4_3() {
		return cse_0_4_3;
	}

	public void setCse_0_4_3(String cse_0_4_3) {
		this.cse_0_4_3 = cse_0_4_3;
	}
	
	@Length(min=0, max=64, message="本院首诊医师接诊日期时间长度不能超过 64 个字符")
	public String getCse_1_1_1() {
		return cse_1_1_1;
	}

	public void setCse_1_1_1(String cse_1_1_1) {
		this.cse_1_1_1 = cse_1_1_1;
	}
	
	@Length(min=0, max=64, message="既往诊断过癫痫长度不能超过 64 个字符")
	public String getCse_1_1_2() {
		return cse_1_1_2;
	}

	public void setCse_1_1_2(String cse_1_1_2) {
		this.cse_1_1_2 = cse_1_1_2;
	}
	
	@Length(min=0, max=64, message="是否服用过抗癫痫药物长度不能超过 64 个字符")
	public String getCse_1_1_3() {
		return cse_1_1_3;
	}

	public void setCse_1_1_3(String cse_1_1_3) {
		this.cse_1_1_3 = cse_1_1_3;
	}
	
	@Length(min=0, max=64, message="评估发作起始日期长度不能超过 64 个字符")
	public String getCse_1_1_4() {
		return cse_1_1_4;
	}

	public void setCse_1_1_4(String cse_1_1_4) {
		this.cse_1_1_4 = cse_1_1_4;
	}
	
	@Length(min=0, max=64, message="绿色通道中观察期所采取的紧急救治措施长度不能超过 64 个字符")
	public String getCse_1_2_1() {
		return cse_1_2_1;
	}

	public void setCse_1_2_1(String cse_1_2_1) {
		this.cse_1_2_1 = cse_1_2_1;
	}
	
	@Length(min=0, max=64, message="其它绿色通道中观察期所可采取的紧急救治措施长度不能超过 64 个字符")
	public String getCse_1_2_1_1() {
		return cse_1_2_1_1;
	}

	public void setCse_1_2_1_1(String cse_1_2_1_1) {
		this.cse_1_2_1_1 = cse_1_2_1_1;
	}
	
	@Length(min=0, max=64, message="完成紧急救治措施的日期时间长度不能超过 64 个字符")
	public String getCse_1_2_2() {
		return cse_1_2_2;
	}

	public void setCse_1_2_2(String cse_1_2_2) {
		this.cse_1_2_2 = cse_1_2_2;
	}
	
	@Length(min=0, max=64, message="实施严重程度STESS评估长度不能超过 64 个字符")
	public String getCse_1_2_3() {
		return cse_1_2_3;
	}

	public void setCse_1_2_3(String cse_1_2_3) {
		this.cse_1_2_3 = cse_1_2_3;
	}
	
	@Length(min=0, max=64, message="完成评估日期时间长度不能超过 64 个字符")
	public String getCse_1_2_4() {
		return cse_1_2_4;
	}

	public void setCse_1_2_4(String cse_1_2_4) {
		this.cse_1_2_4 = cse_1_2_4;
	}
	
	public Double getCse_1_2_5() {
		return cse_1_2_5;
	}

	public void setCse_1_2_5(Double cse_1_2_5) {
		this.cse_1_2_5 = cse_1_2_5;
	}
	
	@Length(min=0, max=64, message="是否实施EMSE评估长度不能超过 64 个字符")
	public String getCse_1_2_3_1() {
		return cse_1_2_3_1;
	}

	public void setCse_1_2_3_1(String cse_1_2_3_1) {
		this.cse_1_2_3_1 = cse_1_2_3_1;
	}
	
	@Length(min=0, max=64, message="完成评估日期时间长度不能超过 64 个字符")
	public String getCse_1_2_3_2() {
		return cse_1_2_3_2;
	}

	public void setCse_1_2_3_2(String cse_1_2_3_2) {
		this.cse_1_2_3_2 = cse_1_2_3_2;
	}
	
	public Double getCse_1_2_3_3() {
		return cse_1_2_3_3;
	}

	public void setCse_1_2_3_3(Double cse_1_2_3_3) {
		this.cse_1_2_3_3 = cse_1_2_3_3;
	}
	
	public Double getCse_1_2_6_1() {
		return cse_1_2_6_1;
	}

	public void setCse_1_2_6_1(Double cse_1_2_6_1) {
		this.cse_1_2_6_1 = cse_1_2_6_1;
	}
	
	public Double getCse_1_2_6_2() {
		return cse_1_2_6_2;
	}

	public void setCse_1_2_6_2(Double cse_1_2_6_2) {
		this.cse_1_2_6_2 = cse_1_2_6_2;
	}
	
	public Double getCse_1_2_6_3() {
		return cse_1_2_6_3;
	}

	public void setCse_1_2_6_3(Double cse_1_2_6_3) {
		this.cse_1_2_6_3 = cse_1_2_6_3;
	}
	
	public Double getCse_1_2_6_4() {
		return cse_1_2_6_4;
	}

	public void setCse_1_2_6_4(Double cse_1_2_6_4) {
		this.cse_1_2_6_4 = cse_1_2_6_4;
	}
	
	public Double getCse_1_2_6_5() {
		return cse_1_2_6_5;
	}

	public void setCse_1_2_6_5(Double cse_1_2_6_5) {
		this.cse_1_2_6_5 = cse_1_2_6_5;
	}
	
	public Double getCse_1_2_6_6() {
		return cse_1_2_6_6;
	}

	public void setCse_1_2_6_6(Double cse_1_2_6_6) {
		this.cse_1_2_6_6 = cse_1_2_6_6;
	}
	
	@Length(min=0, max=64, message="是否进行血/尿药物浓度筛查长度不能超过 64 个字符")
	public String getCse_1_2_7() {
		return cse_1_2_7;
	}

	public void setCse_1_2_7(String cse_1_2_7) {
		this.cse_1_2_7 = cse_1_2_7;
	}
	
	@Length(min=0, max=64, message="药物浓度筛查报告日期时间是否确定长度不能超过 64 个字符")
	public String getCse_1_2_8_1() {
		return cse_1_2_8_1;
	}

	public void setCse_1_2_8_1(String cse_1_2_8_1) {
		this.cse_1_2_8_1 = cse_1_2_8_1;
	}
	
	@Length(min=0, max=64, message="药物浓度筛查报告日期时间长度不能超过 64 个字符")
	public String getCse_1_2_8() {
		return cse_1_2_8;
	}

	public void setCse_1_2_8(String cse_1_2_8) {
		this.cse_1_2_8 = cse_1_2_8;
	}
	
	@Length(min=0, max=64, message="是否进行毒物筛查长度不能超过 64 个字符")
	public String getCse_1_2_9() {
		return cse_1_2_9;
	}

	public void setCse_1_2_9(String cse_1_2_9) {
		this.cse_1_2_9 = cse_1_2_9;
	}
	
	@Length(min=0, max=64, message="是否实施首次心电图长度不能超过 64 个字符")
	public String getCse_1_2_10() {
		return cse_1_2_10;
	}

	public void setCse_1_2_10(String cse_1_2_10) {
		this.cse_1_2_10 = cse_1_2_10;
	}
	
	@Length(min=0, max=64, message="报告日期时间长度不能超过 64 个字符")
	public String getCse_1_2_11() {
		return cse_1_2_11;
	}

	public void setCse_1_2_11(String cse_1_2_11) {
		this.cse_1_2_11 = cse_1_2_11;
	}
	
	@Length(min=0, max=64, message="心电图长度不能超过 64 个字符")
	public String getCse_1_2_12() {
		return cse_1_2_12;
	}

	public void setCse_1_2_12(String cse_1_2_12) {
		this.cse_1_2_12 = cse_1_2_12;
	}
	
	@Length(min=0, max=64, message="其他心电图长度不能超过 64 个字符")
	public String getCse_1_2_12_1() {
		return cse_1_2_12_1;
	}

	public void setCse_1_2_12_1(String cse_1_2_12_1) {
		this.cse_1_2_12_1 = cse_1_2_12_1;
	}
	
	@Length(min=0, max=64, message="初始治疗选择长度不能超过 64 个字符")
	public String getCse_2_1_1() {
		return cse_2_1_1;
	}

	public void setCse_2_1_1(String cse_2_1_1) {
		this.cse_2_1_1 = cse_2_1_1;
	}
	
	@Length(min=0, max=64, message="有静脉通路长度不能超过 64 个字符")
	public String getCse_2_1_2() {
		return cse_2_1_2;
	}

	public void setCse_2_1_2(String cse_2_1_2) {
		this.cse_2_1_2 = cse_2_1_2;
	}
	
	@Length(min=0, max=64, message="其他有静脉通路长度不能超过 64 个字符")
	public String getCse_2_1_2_1() {
		return cse_2_1_2_1;
	}

	public void setCse_2_1_2_1(String cse_2_1_2_1) {
		this.cse_2_1_2_1 = cse_2_1_2_1;
	}
	
	@Length(min=0, max=64, message="静脉注射时间长度不能超过 64 个字符")
	public String getCse_2_1_3() {
		return cse_2_1_3;
	}

	public void setCse_2_1_3(String cse_2_1_3) {
		this.cse_2_1_3 = cse_2_1_3;
	}
	
	@Length(min=0, max=64, message="无静脉通路长度不能超过 64 个字符")
	public String getCse_2_1_4() {
		return cse_2_1_4;
	}

	public void setCse_2_1_4(String cse_2_1_4) {
		this.cse_2_1_4 = cse_2_1_4;
	}
	
	@Length(min=0, max=64, message="其他无静脉通路长度不能超过 64 个字符")
	public String getCse_2_1_4_1() {
		return cse_2_1_4_1;
	}

	public void setCse_2_1_4_1(String cse_2_1_4_1) {
		this.cse_2_1_4_1 = cse_2_1_4_1;
	}
	
	@Length(min=0, max=64, message="肌肉注射时间长度不能超过 64 个字符")
	public String getCse_2_1_5() {
		return cse_2_1_5;
	}

	public void setCse_2_1_5(String cse_2_1_5) {
		this.cse_2_1_5 = cse_2_1_5;
	}
	
	@Length(min=0, max=64, message="是否达到终止标准长度不能超过 64 个字符")
	public String getCse_2_2_0() {
		return cse_2_2_0;
	}

	public void setCse_2_2_0(String cse_2_2_0) {
		this.cse_2_2_0 = cse_2_2_0;
	}
	
	@Length(min=0, max=64, message="达到终止标准依据长度不能超过 64 个字符")
	public String getCse_2_2_1() {
		return cse_2_2_1;
	}

	public void setCse_2_2_1(String cse_2_2_1) {
		this.cse_2_2_1 = cse_2_2_1;
	}
	
	@Length(min=0, max=64, message="脑电图长度不能超过 64 个字符")
	public String getCse_2_2_2() {
		return cse_2_2_2;
	}

	public void setCse_2_2_2(String cse_2_2_2) {
		this.cse_2_2_2 = cse_2_2_2;
	}
	
	@Length(min=0, max=64, message="其他脑电图长度不能超过 64 个字符")
	public String getCse_2_2_2_1() {
		return cse_2_2_2_1;
	}

	public void setCse_2_2_2_1(String cse_2_2_2_1) {
		this.cse_2_2_2_1 = cse_2_2_2_1;
	}
	
	@Length(min=0, max=64, message="治疗后发作缓解时间长度不能超过 64 个字符")
	public String getCse_2_2_3() {
		return cse_2_2_3;
	}

	public void setCse_2_2_3(String cse_2_2_3) {
		this.cse_2_2_3 = cse_2_2_3;
	}
	
	@Length(min=0, max=64, message="终止发作后是否进行过渡治疗长度不能超过 64 个字符")
	public String getCse_2_2_4() {
		return cse_2_2_4;
	}

	public void setCse_2_2_4(String cse_2_2_4) {
		this.cse_2_2_4 = cse_2_2_4;
	}
	
	@Length(min=0, max=64, message="其他终止发作后是否进行过渡治疗长度不能超过 64 个字符")
	public String getCse_2_2_4_1() {
		return cse_2_2_4_1;
	}

	public void setCse_2_2_4_1(String cse_2_2_4_1) {
		this.cse_2_2_4_1 = cse_2_2_4_1;
	}
	
	@Length(min=0, max=64, message="实施初始治疗失败长度不能超过 64 个字符")
	public String getCse_3_1_1() {
		return cse_3_1_1;
	}

	public void setCse_3_1_1(String cse_3_1_1) {
		this.cse_3_1_1 = cse_3_1_1;
	}
	
	@Length(min=0, max=64, message="给予第二阶段长度不能超过 64 个字符")
	public String getCse_3_1_2() {
		return cse_3_1_2;
	}

	public void setCse_3_1_2(String cse_3_1_2) {
		this.cse_3_1_2 = cse_3_1_2;
	}
	
	@Length(min=0, max=64, message="其他第二阶段长度不能超过 64 个字符")
	public String getCse_3_1_2_1() {
		return cse_3_1_2_1;
	}

	public void setCse_3_1_2_1(String cse_3_1_2_1) {
		this.cse_3_1_2_1 = cse_3_1_2_1;
	}
	
	@Length(min=0, max=64, message="静脉治疗时间长度不能超过 64 个字符")
	public String getCse_3_1_3() {
		return cse_3_1_3;
	}

	public void setCse_3_1_3(String cse_3_1_3) {
		this.cse_3_1_3 = cse_3_1_3;
	}
	
	@Length(min=0, max=64, message="是否达到终止标准长度不能超过 64 个字符")
	public String getCse_3_2_1() {
		return cse_3_2_1;
	}

	public void setCse_3_2_1(String cse_3_2_1) {
		this.cse_3_2_1 = cse_3_2_1;
	}
	
	@Length(min=0, max=64, message="脑电图长度不能超过 64 个字符")
	public String getCse_3_2_2() {
		return cse_3_2_2;
	}

	public void setCse_3_2_2(String cse_3_2_2) {
		this.cse_3_2_2 = cse_3_2_2;
	}
	
	@Length(min=0, max=64, message="其他脑电图长度不能超过 64 个字符")
	public String getCse_3_2_2_1() {
		return cse_3_2_2_1;
	}

	public void setCse_3_2_2_1(String cse_3_2_2_1) {
		this.cse_3_2_2_1 = cse_3_2_2_1;
	}
	
	@Length(min=0, max=64, message="治疗后发作缓解时间长度不能超过 64 个字符")
	public String getCse_3_2_3() {
		return cse_3_2_3;
	}

	public void setCse_3_2_3(String cse_3_2_3) {
		this.cse_3_2_3 = cse_3_2_3;
	}
	
	@Length(min=0, max=64, message="终止发作后是否进行过渡治疗长度不能超过 64 个字符")
	public String getCse_3_2_4() {
		return cse_3_2_4;
	}

	public void setCse_3_2_4(String cse_3_2_4) {
		this.cse_3_2_4 = cse_3_2_4;
	}
	
	@Length(min=0, max=64, message="其他终止发作后是否进行过渡治疗长度不能超过 64 个字符")
	public String getCse_3_2_4_1() {
		return cse_3_2_4_1;
	}

	public void setCse_3_2_4_1(String cse_3_2_4_1) {
		this.cse_3_2_4_1 = cse_3_2_4_1;
	}
	
	@Length(min=0, max=64, message="第二阶段静脉治疗失败长度不能超过 64 个字符")
	public String getCse_4_1_1() {
		return cse_4_1_1;
	}

	public void setCse_4_1_1(String cse_4_1_1) {
		this.cse_4_1_1 = cse_4_1_1;
	}
	
	@Length(min=0, max=64, message="给予第三阶段长度不能超过 64 个字符")
	public String getCse_4_1_2() {
		return cse_4_1_2;
	}

	public void setCse_4_1_2(String cse_4_1_2) {
		this.cse_4_1_2 = cse_4_1_2;
	}
	
	@Length(min=0, max=64, message="其他第三阶段长度不能超过 64 个字符")
	public String getCse_4_1_2_1() {
		return cse_4_1_2_1;
	}

	public void setCse_4_1_2_1(String cse_4_1_2_1) {
		this.cse_4_1_2_1 = cse_4_1_2_1;
	}
	
	@Length(min=0, max=64, message="super-RSE治疗长度不能超过 64 个字符")
	public String getCse_4_1_3() {
		return cse_4_1_3;
	}

	public void setCse_4_1_3(String cse_4_1_3) {
		this.cse_4_1_3 = cse_4_1_3;
	}
	
	@Length(min=0, max=64, message="外科手术长度不能超过 64 个字符")
	public String getCse_4_1_3_2() {
		return cse_4_1_3_2;
	}

	public void setCse_4_1_3_2(String cse_4_1_3_2) {
		this.cse_4_1_3_2 = cse_4_1_3_2;
	}
	
	@Length(min=0, max=64, message="其他super-RSE治疗长度不能超过 64 个字符")
	public String getCse_4_1_3_1() {
		return cse_4_1_3_1;
	}

	public void setCse_4_1_3_1(String cse_4_1_3_1) {
		this.cse_4_1_3_1 = cse_4_1_3_1;
	}
	
	@Length(min=0, max=64, message="进入难治性癫痫持续状态RSE治疗时间长度不能超过 64 个字符")
	public String getCse_4_1_4() {
		return cse_4_1_4;
	}

	public void setCse_4_1_4(String cse_4_1_4) {
		this.cse_4_1_4 = cse_4_1_4;
	}
	
	@Length(min=0, max=64, message="是否达到终止标准长度不能超过 64 个字符")
	public String getCse_4_2_1() {
		return cse_4_2_1;
	}

	public void setCse_4_2_1(String cse_4_2_1) {
		this.cse_4_2_1 = cse_4_2_1;
	}
	
	@Length(min=0, max=64, message="脑电图长度不能超过 64 个字符")
	public String getCse_4_2_2() {
		return cse_4_2_2;
	}

	public void setCse_4_2_2(String cse_4_2_2) {
		this.cse_4_2_2 = cse_4_2_2;
	}
	
	@Length(min=0, max=64, message="其他脑电图长度不能超过 64 个字符")
	public String getCse_4_2_2_1() {
		return cse_4_2_2_1;
	}

	public void setCse_4_2_2_1(String cse_4_2_2_1) {
		this.cse_4_2_2_1 = cse_4_2_2_1;
	}
	
	@Length(min=0, max=64, message="治疗后发作缓解时间长度不能超过 64 个字符")
	public String getCse_4_2_3() {
		return cse_4_2_3;
	}

	public void setCse_4_2_3(String cse_4_2_3) {
		this.cse_4_2_3 = cse_4_2_3;
	}
	
	@Length(min=0, max=64, message="RSE终止发作后是否进行过渡治疗长度不能超过 64 个字符")
	public String getCse_4_2_4() {
		return cse_4_2_4;
	}

	public void setCse_4_2_4(String cse_4_2_4) {
		this.cse_4_2_4 = cse_4_2_4;
	}
	
	@Length(min=0, max=64, message="其他RSE终止发作后是否进行过渡治疗长度不能超过 64 个字符")
	public String getCse_4_2_4_1() {
		return cse_4_2_4_1;
	}

	public void setCse_4_2_4_1(String cse_4_2_4_1) {
		this.cse_4_2_4_1 = cse_4_2_4_1;
	}
	
	@Length(min=0, max=64, message="是否进入ICU提供相应生命支持长度不能超过 64 个字符")
	public String getCse_5_1_1() {
		return cse_5_1_1;
	}

	public void setCse_5_1_1(String cse_5_1_1) {
		this.cse_5_1_1 = cse_5_1_1;
	}
	
	@Length(min=0, max=64, message="入住ICU日期时间长度不能超过 64 个字符")
	public String getCse_5_1_2() {
		return cse_5_1_2;
	}

	public void setCse_5_1_2(String cse_5_1_2) {
		this.cse_5_1_2 = cse_5_1_2;
	}
	
	@Length(min=0, max=64, message="提供相应生命支持长度不能超过 64 个字符")
	public String getCse_5_1_3() {
		return cse_5_1_3;
	}

	public void setCse_5_1_3(String cse_5_1_3) {
		this.cse_5_1_3 = cse_5_1_3;
	}
	
	@Length(min=0, max=64, message="其他提供相应生命支持长度不能超过 64 个字符")
	public String getCse_5_1_3_1() {
		return cse_5_1_3_1;
	}

	public void setCse_5_1_3_1(String cse_5_1_3_1) {
		this.cse_5_1_3_1 = cse_5_1_3_1;
	}
	
	@Length(min=0, max=64, message="是否实施无创正压通气长度不能超过 64 个字符")
	public String getCse_5_2_1() {
		return cse_5_2_1;
	}

	public void setCse_5_2_1(String cse_5_2_1) {
		this.cse_5_2_1 = cse_5_2_1;
	}
	
	@Length(min=0, max=64, message="患者无创正压通气起始日期时间长度不能超过 64 个字符")
	public String getCse_5_2_2() {
		return cse_5_2_2;
	}

	public void setCse_5_2_2(String cse_5_2_2) {
		this.cse_5_2_2 = cse_5_2_2;
	}
	
	@Length(min=0, max=64, message="患者无创正压通气终止日期时间长度不能超过 64 个字符")
	public String getCse_5_2_3() {
		return cse_5_2_3;
	}

	public void setCse_5_2_3(String cse_5_2_3) {
		this.cse_5_2_3 = cse_5_2_3;
	}
	
	public Double getCse_5_2_4() {
		return cse_5_2_4;
	}

	public void setCse_5_2_4(Double cse_5_2_4) {
		this.cse_5_2_4 = cse_5_2_4;
	}
	
	@Length(min=0, max=64, message="是否实施有创机械通气长度不能超过 64 个字符")
	public String getCse_5_3_1() {
		return cse_5_3_1;
	}

	public void setCse_5_3_1(String cse_5_3_1) {
		this.cse_5_3_1 = cse_5_3_1;
	}
	
	@Length(min=0, max=64, message="患者有机械通气起始日期时间长度不能超过 64 个字符")
	public String getCse_5_3_2() {
		return cse_5_3_2;
	}

	public void setCse_5_3_2(String cse_5_3_2) {
		this.cse_5_3_2 = cse_5_3_2;
	}
	
	@Length(min=0, max=64, message="患者有机械通气终止日期时间长度不能超过 64 个字符")
	public String getCse_5_3_3() {
		return cse_5_3_3;
	}

	public void setCse_5_3_3(String cse_5_3_3) {
		this.cse_5_3_3 = cse_5_3_3;
	}
	
	public Double getCse_5_3_4() {
		return cse_5_3_4;
	}

	public void setCse_5_3_4(Double cse_5_3_4) {
		this.cse_5_3_4 = cse_5_3_4;
	}
	
	@Length(min=0, max=64, message="是否实施首次头部影像学检查长度不能超过 64 个字符")
	public String getCse_6_1_1() {
		return cse_6_1_1;
	}

	public void setCse_6_1_1(String cse_6_1_1) {
		this.cse_6_1_1 = cse_6_1_1;
	}
	
	@Length(min=0, max=64, message="头部影像学检查项目长度不能超过 64 个字符")
	public String getCse_6_1_2() {
		return cse_6_1_2;
	}

	public void setCse_6_1_2(String cse_6_1_2) {
		this.cse_6_1_2 = cse_6_1_2;
	}
	
	@Length(min=0, max=64, message="报告日期时间长度不能超过 64 个字符")
	public String getCse_6_1_3() {
		return cse_6_1_3;
	}

	public void setCse_6_1_3(String cse_6_1_3) {
		this.cse_6_1_3 = cse_6_1_3;
	}
	
	@Length(min=0, max=64, message="实施首次脑脊液检查长度不能超过 64 个字符")
	public String getCse_6_2_1() {
		return cse_6_2_1;
	}

	public void setCse_6_2_1(String cse_6_2_1) {
		this.cse_6_2_1 = cse_6_2_1;
	}
	
	@Length(min=0, max=64, message="脑脊液检查项目长度不能超过 64 个字符")
	public String getCse_6_2_2() {
		return cse_6_2_2;
	}

	public void setCse_6_2_2(String cse_6_2_2) {
		this.cse_6_2_2 = cse_6_2_2;
	}
	
	@Length(min=0, max=64, message="报告日期时间长度不能超过 64 个字符")
	public String getCse_6_2_3() {
		return cse_6_2_3;
	}

	public void setCse_6_2_3(String cse_6_2_3) {
		this.cse_6_2_3 = cse_6_2_3;
	}
	
	@Length(min=0, max=64, message="既往是否诊断癫痫长度不能超过 64 个字符")
	public String getCse_6_3_1() {
		return cse_6_3_1;
	}

	public void setCse_6_3_1(String cse_6_3_1) {
		this.cse_6_3_1 = cse_6_3_1;
	}
	
	@Length(min=0, max=64, message="近期发作情况为长度不能超过 64 个字符")
	public String getCse_6_3_6() {
		return cse_6_3_6;
	}

	public void setCse_6_3_6(String cse_6_3_6) {
		this.cse_6_3_6 = cse_6_3_6;
	}
	
	@Length(min=0, max=64, message="具体发作频率为长度不能超过 64 个字符")
	public String getCse_6_3_7() {
		return cse_6_3_7;
	}

	public void setCse_6_3_7(String cse_6_3_7) {
		this.cse_6_3_7 = cse_6_3_7;
	}
	
	@Length(min=0, max=64, message="发作是否为局灶起源长度不能超过 64 个字符")
	public String getCse_6_3_3() {
		return cse_6_3_3;
	}

	public void setCse_6_3_3(String cse_6_3_3) {
		this.cse_6_3_3 = cse_6_3_3;
	}
	
	@Length(min=0, max=64, message="发作是否伴知觉障碍长度不能超过 64 个字符")
	public String getCse_6_3_4() {
		return cse_6_3_4;
	}

	public void setCse_6_3_4(String cse_6_3_4) {
		this.cse_6_3_4 = cse_6_3_4;
	}
	
	@Length(min=0, max=64, message="发作是否以运动症状起病长度不能超过 64 个字符")
	public String getCse_6_3_5() {
		return cse_6_3_5;
	}

	public void setCse_6_3_5(String cse_6_3_5) {
		this.cse_6_3_5 = cse_6_3_5;
	}
	
	@Length(min=0, max=64, message="发作是否为全面起源长度不能超过 64 个字符")
	public String getCse_6_3_8() {
		return cse_6_3_8;
	}

	public void setCse_6_3_8(String cse_6_3_8) {
		this.cse_6_3_8 = cse_6_3_8;
	}
	
	@Length(min=0, max=64, message="发作包含何种表现长度不能超过 64 个字符")
	public String getCse_6_3_9() {
		return cse_6_3_9;
	}

	public void setCse_6_3_9(String cse_6_3_9) {
		this.cse_6_3_9 = cse_6_3_9;
	}
	
	@Length(min=0, max=64, message="发作是否为未知起源长度不能超过 64 个字符")
	public String getCse_6_3_10() {
		return cse_6_3_10;
	}

	public void setCse_6_3_10(String cse_6_3_10) {
		this.cse_6_3_10 = cse_6_3_10;
	}
	
	@Length(min=0, max=64, message="是否为不能分类的癫痫发作长度不能超过 64 个字符")
	public String getCse_6_3_11() {
		return cse_6_3_11;
	}

	public void setCse_6_3_11(String cse_6_3_11) {
		this.cse_6_3_11 = cse_6_3_11;
	}
	
	@Length(min=0, max=64, message="是否服用过抗癫痫药物长度不能超过 64 个字符")
	public String getCse_6_3_12() {
		return cse_6_3_12;
	}

	public void setCse_6_3_12(String cse_6_3_12) {
		this.cse_6_3_12 = cse_6_3_12;
	}
	
	@Length(min=0, max=64, message="首次使用抗癫痫药物日期长度不能超过 64 个字符")
	public String getCse_6_3_2() {
		return cse_6_3_2;
	}

	public void setCse_6_3_2(String cse_6_3_2) {
		this.cse_6_3_2 = cse_6_3_2;
	}
	
	@Length(min=0, max=64, message="使用的抗癫痫药物种类长度不能超过 64 个字符")
	public String getCse_6_3_13() {
		return cse_6_3_13;
	}

	public void setCse_6_3_13(String cse_6_3_13) {
		this.cse_6_3_13 = cse_6_3_13;
	}
	
	@Length(min=0, max=64, message="其他抗癫痫药物种类长度不能超过 64 个字符")
	public String getCse_6_3_13_1() {
		return cse_6_3_13_1;
	}

	public void setCse_6_3_13_1(String cse_6_3_13_1) {
		this.cse_6_3_13_1 = cse_6_3_13_1;
	}
	
	@Length(min=0, max=64, message="是否目前正在使用此药，并且已连续规律使用三个月及以上长度不能超过 64 个字符")
	public String getCse_6_3_14() {
		return cse_6_3_14;
	}

	public void setCse_6_3_14(String cse_6_3_14) {
		this.cse_6_3_14 = cse_6_3_14;
	}
	
	@Length(min=0, max=64, message="既往或者现在使用此药期间是否有严重不良事件长度不能超过 64 个字符")
	public String getCse_6_3_15() {
		return cse_6_3_15;
	}

	public void setCse_6_3_15(String cse_6_3_15) {
		this.cse_6_3_15 = cse_6_3_15;
	}
	
	@Length(min=0, max=64, message="是否入院时进行重点护理评估且有记录长度不能超过 64 个字符")
	public String getCse_7_1_0() {
		return cse_7_1_0;
	}

	public void setCse_7_1_0(String cse_7_1_0) {
		this.cse_7_1_0 = cse_7_1_0;
	}
	
	@Length(min=0, max=64, message="行走评估结果长度不能超过 64 个字符")
	public String getCse_7_1_1() {
		return cse_7_1_1;
	}

	public void setCse_7_1_1(String cse_7_1_1) {
		this.cse_7_1_1 = cse_7_1_1;
	}
	
	@Length(min=0, max=64, message="呼吸评估结果长度不能超过 64 个字符")
	public String getCse_7_1_2() {
		return cse_7_1_2;
	}

	public void setCse_7_1_2(String cse_7_1_2) {
		this.cse_7_1_2 = cse_7_1_2;
	}
	
	@Length(min=0, max=64, message="饮食评估结果长度不能超过 64 个字符")
	public String getCse_7_1_3() {
		return cse_7_1_3;
	}

	public void setCse_7_1_3(String cse_7_1_3) {
		this.cse_7_1_3 = cse_7_1_3;
	}
	
	@Length(min=0, max=64, message="吞咽评估结果长度不能超过 64 个字符")
	public String getCse_7_1_4() {
		return cse_7_1_4;
	}

	public void setCse_7_1_4(String cse_7_1_4) {
		this.cse_7_1_4 = cse_7_1_4;
	}
	
	@Length(min=0, max=64, message="压疮评估长度不能超过 64 个字符")
	public String getCse_7_1_5_0() {
		return cse_7_1_5_0;
	}

	public void setCse_7_1_5_0(String cse_7_1_5_0) {
		this.cse_7_1_5_0 = cse_7_1_5_0;
	}
	
	public Double getCse_7_1_5() {
		return cse_7_1_5;
	}

	public void setCse_7_1_5(Double cse_7_1_5) {
		this.cse_7_1_5 = cse_7_1_5;
	}
	
	@Length(min=0, max=64, message="压疮评估结果选择长度不能超过 64 个字符")
	public String getCse_7_1_5_1() {
		return cse_7_1_5_1;
	}

	public void setCse_7_1_5_1(String cse_7_1_5_1) {
		this.cse_7_1_5_1 = cse_7_1_5_1;
	}
	
	@Length(min=0, max=64, message="预防压疮告知长度不能超过 64 个字符")
	public String getCse_7_1_5_2() {
		return cse_7_1_5_2;
	}

	public void setCse_7_1_5_2(String cse_7_1_5_2) {
		this.cse_7_1_5_2 = cse_7_1_5_2;
	}
	
	@Length(min=0, max=64, message="实施癫痫持续状态健康教育有记录长度不能超过 64 个字符")
	public String getCse_7_1_6() {
		return cse_7_1_6;
	}

	public void setCse_7_1_6(String cse_7_1_6) {
		this.cse_7_1_6 = cse_7_1_6;
	}
	
	@Length(min=0, max=64, message="出院时是否进行STESS评分长度不能超过 64 个字符")
	public String getCse_7_2_1() {
		return cse_7_2_1;
	}

	public void setCse_7_2_1(String cse_7_2_1) {
		this.cse_7_2_1 = cse_7_2_1;
	}
	
	public Double getCse_7_2_1_1() {
		return cse_7_2_1_1;
	}

	public void setCse_7_2_1_1(Double cse_7_2_1_1) {
		this.cse_7_2_1_1 = cse_7_2_1_1;
	}
	
	@Length(min=0, max=64, message="交与患者“出院小结”的副本，并告知患者出院时风险因素长度不能超过 64 个字符")
	public String getCse_7_2_2_1() {
		return cse_7_2_2_1;
	}

	public void setCse_7_2_2_1(String cse_7_2_2_1) {
		this.cse_7_2_2_1 = cse_7_2_2_1;
	}
	
	@Length(min=0, max=64, message="出院带药长度不能超过 64 个字符")
	public String getCse_7_2_2_2() {
		return cse_7_2_2_2;
	}

	public void setCse_7_2_2_2(String cse_7_2_2_2) {
		this.cse_7_2_2_2 = cse_7_2_2_2;
	}
	
	@Length(min=0, max=64, message="告知发生紧急情况时求援救治途径长度不能超过 64 个字符")
	public String getCse_7_2_2_3() {
		return cse_7_2_2_3;
	}

	public void setCse_7_2_2_3(String cse_7_2_2_3) {
		this.cse_7_2_2_3 = cse_7_2_2_3;
	}
	
	@Length(min=0, max=64, message="出院时教育与随访长度不能超过 64 个字符")
	public String getCse_7_2_2_4() {
		return cse_7_2_2_4;
	}

	public void setCse_7_2_2_4(String cse_7_2_2_4) {
		this.cse_7_2_2_4 = cse_7_2_2_4;
	}
	
	@Length(min=0, max=64, message="告知何为风险因素与紧急情况长度不能超过 64 个字符")
	public String getCse_7_2_2_5() {
		return cse_7_2_2_5;
	}

	public void setCse_7_2_2_5(String cse_7_2_2_5) {
		this.cse_7_2_2_5 = cse_7_2_2_5;
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