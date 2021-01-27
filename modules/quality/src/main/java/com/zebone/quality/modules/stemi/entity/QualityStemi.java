/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.stemi.entity;

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
 * STEMI急性心肌梗死（ST 段抬高型，首次住院）Entity
 * @author lijin
 * @version 2021-01-27
 */
@Table(name="quality_stemi", alias="a", columns={
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
		@Column(name="cm_0_2_2_1", attrName="cm_0_2_2_1", label="发病日期时间是否无法确定或无记录"),
		@Column(name="cm_0_2_2_2", attrName="cm_0_2_2_2", label="发病日期时间"),
		@Column(name="cm_0_2_3_2", attrName="cm_0_2_3_2", label="到达本院急诊或者门诊日期时间"),
		@Column(name="cm_0_2_4_1", attrName="cm_0_2_4_1", label="入院日期时间"),
		@Column(name="cm_0_2_4_2", attrName="cm_0_2_4_2", label="出院日期时间"),
		@Column(name="cm_0_2_5_1", attrName="cm_0_2_5_1", label="入住CCU日期时间"),
		@Column(includeEntity=DataEntity.class),
		@Column(name="cm_0_2_5_2", attrName="cm_0_2_5_2", label="离开CCU日期时间"),
		@Column(name="cm_0_3_1", attrName="cm_0_3_1", label="费用支付方式"),
		@Column(name="cm_0_3_2", attrName="cm_0_3_2", label="收入住院途径"),
		@Column(name="cm_0_3_3", attrName="cm_0_3_3", label="到院交通工具"),
		@Column(name="stemi_0_4_6", attrName="stemi_0_4_6", label="救护车类型"),
		@Column(name="stemi_0_4_1", attrName="stemi_0_4_1", label="是否现场评估生命体征，施行急救"),
		@Column(name="stemi_0_4_2", attrName="stemi_0_4_2", label="到达现场后10分钟内是否完成心电图检查"),
		@Column(name="stemi_0_4_3", attrName="stemi_0_4_3", label="现场急救维持生命体征稳定措施选择"),
		@Column(name="stemi_0_4_4", attrName="stemi_0_4_4", label="对持续胸痛＞15分钟和心电图ST段抬高，且无“阿斯匹林”禁忌症的患者用药"),
		@Column(name="stemi_0_4_5", attrName="stemi_0_4_5", label="是否利用救护车中车载信息系统、微信、彩信等多种形式传输心电图等院前信息至目标医院"),
		@Column(name="stemi_0_4_7", attrName="stemi_0_4_7", label="是否入院前在救护车上开始溶栓治疗"),
		@Column(name="stemi_1_1_4", attrName="stemi_1_1_4", label="是否有症状和病史"),
		@Column(name="stemi_1_1_5", attrName="stemi_1_1_5", label="症状和体征选择"),
		@Column(name="stemi_1_1_6", attrName="stemi_1_1_6", label="是否实施首次采用Killip分级法评估心功能"),
		@Column(name="stemi_1_1_7", attrName="stemi_1_1_7", label="Killip分级，症状及体征选择"),
		@Column(name="stemi_1_1_1", attrName="stemi_1_1_1", label="是否实施首次心电图检查"),
		@Column(name="stemi_1_1_2_1", attrName="stemi_1_1_2_1", label="心电图检查结果确诊STEMI报告日期时间"),
		@Column(name="stemi_1_1_3", attrName="stemi_1_1_3", label="心电图检查结果，具有STEMI特征性诊断标准的选择"),
		@Column(name="stemi_1_1_3_1", attrName="stemi_1_1_3_1", label="其他心电图检查结果填写"),
		@Column(name="stemi_1_2_1", attrName="stemi_1_2_1", label="是否有P2Y12受体拮抗剂禁忌证"),
		@Column(name="stemi_1_2_2", attrName="stemi_1_2_2", label="P2Y12受体拮抗剂禁忌证"),
		@Column(name="stemi_1_2_2_1", attrName="stemi_1_2_2_1", label="其他P2Y12受体拮抗剂禁忌证填写"),
		@Column(name="stemi_1_2_3", attrName="stemi_1_2_3", label="首剂给予双联抗血小板药负荷剂量"),
		@Column(name="stemi_1_2_3_1", attrName="stemi_1_2_3_1", label="其他抗血小板药物填写"),
		@Column(name="stemi_1_2_4_1", attrName="stemi_1_2_4_1", label="用药日期时间"),
		@Column(name="stemi_1_3_1_1", attrName="stemi_1_3_1_1", label="是否实施首次心脏标志物检测"),
		@Column(name="stemi_1_3_1_2_1", attrName="stemi_1_3_1_2_1", label="首次心脏标志物检测结果报告日期时间"),
		@Column(name="stemi_1_3_2", attrName="stemi_1_3_2", label="首次心脏标志物检测选项和数值"),
		@Column(name="stemi_1_4_1_1", attrName="stemi_1_4_1_1", label="肌钙蛋白T检测选项"),
		@Column(name="stemi_1_3_2_1", attrName="stemi_1_3_2_1", label="肌钙蛋白T检测值", comment="肌钙蛋白T检测值(ng/Ml)"),
		@Column(name="stemi_1_4_1_2", attrName="stemi_1_4_1_2", label="肌钙蛋白T定性检测选择"),
		@Column(name="stemi_1_4_2_1", attrName="stemi_1_4_2_1", label="肌钙蛋白I检测选项"),
		@Column(name="stemi_1_3_2_2", attrName="stemi_1_3_2_2", label="肌钙蛋白I检测值", comment="肌钙蛋白I检测值(ng/mL)"),
		@Column(name="stemi_1_4_2_2", attrName="stemi_1_4_2_2", label="肌钙蛋白I定性检测选择"),
		@Column(name="stemi_1_4_3_1", attrName="stemi_1_4_3_1", label="肌酸激酶同工酶检测选项"),
		@Column(name="stemi_1_3_2_3", attrName="stemi_1_3_2_3", label="肌酸激酶同工酶检测值", comment="肌酸激酶同工酶检测值(ng/mL)"),
		@Column(name="stemi_1_4_3_2", attrName="stemi_1_4_3_2", label="肌酸激酶同工酶定性检测选择"),
		@Column(name="stemi_1_4_4_1", attrName="stemi_1_4_4_1", label="心肌肌红蛋白检测选项"),
		@Column(name="stemi_1_3_2_4", attrName="stemi_1_3_2_4", label="心肌肌红蛋白检测值", comment="心肌肌红蛋白检测值(ng/mL)"),
		@Column(name="stemi_1_4_4_2", attrName="stemi_1_4_4_2", label="心肌肌红蛋白定性检测选择"),
		@Column(name="stemi_1_4_5_1", attrName="stemi_1_4_5_1", label="B型钠尿肽检测选项"),
		@Column(name="stemi_1_3_2_5", attrName="stemi_1_3_2_5", label="B型钠尿肽检测值", comment="B型钠尿肽检测值(ng/L)"),
		@Column(name="stemi_1_4_5_2", attrName="stemi_1_4_5_2", label="B型钠尿肽定性检测选择"),
		@Column(name="stemi_1_4_6_1", attrName="stemi_1_4_6_1", label="N端B型钠尿肽前体检测选项"),
		@Column(name="stemi_1_3_2_6", attrName="stemi_1_3_2_6", label="N端B型钠尿肽前体检测值", comment="N端B型钠尿肽前体检测值(ng/L)"),
		@Column(name="stemi_1_4_6_2", attrName="stemi_1_4_6_2", label="N端B型钠尿肽前体定性检测选择"),
		@Column(name="stemi_2_1_1", attrName="stemi_2_1_1", label="是否实施首次X线胸片检查"),
		@Column(name="stemi_2_1_2_1", attrName="stemi_2_1_2_1", label="首次X线胸片检查报告日期时间"),
		@Column(name="stemi_2_1_3", attrName="stemi_2_1_3", label="是否有肺淤血或肺水肿"),
		@Column(name="stemi_2_2_1", attrName="stemi_2_2_1", label="是否实施首次超声心动图", comment="是否实施首次超声心动图(CDFA)检查"),
		@Column(name="stemi_2_2_2_1", attrName="stemi_2_2_2_1", label="报告日期时间"),
		@Column(name="stemi_2_2_3_1", attrName="stemi_2_2_3_1", label="左室射血分（LVEF）测量值", comment="左室射血分（LVEF）测量值(%)"),
		@Column(name="stemi_2_2_3_3_1", attrName="stemi_2_2_3_3_1", label="左室舒张末径（LVEDd）数值", comment="左室舒张末径（LVEDd）数值(mm)"),
		@Column(name="stemi_2_2_3_4", attrName="stemi_2_2_3_4", label="是否有左室室壁瘤"),
		@Column(name="stemi_2_3_1_1", attrName="stemi_2_3_1_1", label="是否实施GRACE危险评分评估"),
		@Column(name="stemi_2_3_1_2_1", attrName="stemi_2_3_1_2_1", label="评估日期时间"),
		@Column(name="stemi_2_3_1_3_1", attrName="stemi_2_3_1_3_1", label="实施首次GRACE危险评分值"),
		@Column(name="stemi_2_3_1_4", attrName="stemi_2_3_1_4", label="GRACE危险评估分层的选择"),
		@Column(name="stemi_2_3_2_1", attrName="stemi_2_3_2_1", label="是否实施TIMI危险分层评估"),
		@Column(name="stemi_2_3_2_2_1", attrName="stemi_2_3_2_2_1", label="评估日期时间"),
		@Column(name="stemi_2_3_2_3_1", attrName="stemi_2_3_2_3_1", label="实施首次TIMI危险分层分值"),
		@Column(name="stemi_2_3_2_4", attrName="stemi_2_3_2_4", label="TIMI危险分层的选择"),
		@Column(name="stemi_2_3_3_1", attrName="stemi_2_3_3_1", label="是否实施CRUSADE出血风险评分"),
		@Column(name="stemi_2_3_3_2_1", attrName="stemi_2_3_3_2_1", label="评估日期时间"),
		@Column(name="stemi_2_3_3_3_1", attrName="stemi_2_3_3_3_1", label="实施首次CRUSADE出血风险评分值"),
		@Column(name="stemi_2_3_3_4", attrName="stemi_2_3_3_4", label="CRUSADE出血风险评分分层的选择"),
		@Column(name="stemi_3_0_2", attrName="stemi_3_0_2", label="实施再灌注治疗的模式"),
		@Column(name="stemi_3_1_1", attrName="stemi_3_1_1", label="STEMI溶栓适应证"),
		@Column(name="stemi_3_1_2_1", attrName="stemi_3_1_2_1", label="是否有溶栓治疗禁忌症"),
		@Column(name="stemi_3_1_2_2", attrName="stemi_3_1_2_2", label="绝对禁忌证选择"),
		@Column(name="stemi_3_1_2_3", attrName="stemi_3_1_2_3", label="相对禁忌证选择"),
		@Column(name="stemi_3_1_3", attrName="stemi_3_1_3", label="是否实施溶栓治疗"),
		@Column(name="stemi_3_1_4", attrName="stemi_3_1_4", label="溶栓药物选择"),
		@Column(name="stemi_3_1_4_1", attrName="stemi_3_1_4_1", label="其他溶栓药物"),
		@Column(name="stemi_3_1_5_1", attrName="stemi_3_1_5_1", label="输注开始日期时间"),
		@Column(name="stemi_3_1_6_1", attrName="stemi_3_1_6_1", label="输注完成日期时间"),
		@Column(name="stemi_3_1_7_1", attrName="stemi_3_1_7_1", label="到达医院STEMI确诊报告日期与时间至溶栓时间", comment="到达医院STEMI确诊报告日期与时间至溶栓时间（D2N）"),
		@Column(name="stemi_3_1_8", attrName="stemi_3_1_8", label="临床评估溶栓成功", comment="临床评估溶栓成功(60~90 min)"),
		@Column(name="stemi_3_1_9", attrName="stemi_3_1_9", label="溶栓治疗并发症的选择"),
		@Column(name="stemi_3_1_10", attrName="stemi_3_1_10", label="溶栓治疗延迟原因"),
		@Column(name="stemi_3_2_1", attrName="stemi_3_2_1", label="是否实施PCI治疗"),
		@Column(name="stemi_3_2_2_1_3", attrName="stemi_3_2_2_1_3", label="PCI适应证"),
		@Column(name="stemi_3_2_2_1_1", attrName="stemi_3_2_2_1_1", label="直接PCI适应证"),
		@Column(name="stemi_3_2_2_1_1_1", attrName="stemi_3_2_2_1_1_1", label="直接PCI适应证填写"),
		@Column(name="stemi_3_2_2_1_2", attrName="stemi_3_2_2_1_2", label="溶栓后PCI适应证"),
		@Column(name="stemi_3_2_2", attrName="stemi_3_2_2", label="是否有PCI禁忌证"),
		@Column(name="stemi_3_2_2_1", attrName="stemi_3_2_2_1", label="PCI禁忌证选择"),
		@Column(name="stemi_3_2_2_2_1", attrName="stemi_3_2_2_2_1", label="PCI导丝通过梗死相关动脉日期时间"),
		@Column(name="stemi_3_2_2_3_1", attrName="stemi_3_2_2_3_1", label="完成时间"),
		@Column(name="stemi_3_2_2_4_1", attrName="stemi_3_2_2_4_1", label="确诊STEMI至PCI导丝通过梗死相关动脉", comment="确诊STEMI至PCI导丝通过梗死相关动脉（D2B）时间（分钟）"),
		@Column(name="stemi_3_2_2_5", attrName="stemi_3_2_2_5", label="治疗延迟原因选择"),
		@Column(name="stemi_3_2_3_1", attrName="stemi_3_2_3_1", label="主要病变血管"),
		@Column(name="stemi_3_2_3_2_1", attrName="stemi_3_2_3_2_1", label="LAD-冠状动脉狭窄程度分级"),
		@Column(name="stemi_3_2_3_2_5", attrName="stemi_3_2_3_2_5", label="LAD-术前主要靶血管TIMI血流分级的选择"),
		@Column(name="stemi_3_2_3_2_2", attrName="stemi_3_2_3_2_2", label="LCX-冠状动脉狭窄程度分级"),
		@Column(name="stemi_3_2_3_2_6", attrName="stemi_3_2_3_2_6", label="LCX-术前主要靶血管TIMI血流分级的选择"),
		@Column(name="stemi_3_2_3_2_3", attrName="stemi_3_2_3_2_3", label="RCA-冠状动脉狭窄程度分级"),
		@Column(name="stemi_3_2_3_2_7", attrName="stemi_3_2_3_2_7", label="RCA-术前主要靶血管TIMI血流分级的选择"),
		@Column(name="stemi_3_2_3_2_4", attrName="stemi_3_2_3_2_4", label="LM-冠状动脉狭窄程度分级"),
		@Column(name="stemi_3_2_3_2_8", attrName="stemi_3_2_3_2_8", label="LM-术前主要靶血管TIMI血流分级的选择"),
		@Column(name="stemi_3_2_3_3", attrName="stemi_3_2_3_3", label="PCI治疗主要靶血管"),
		@Column(name="stemi_3_2_3_3_1", attrName="stemi_3_2_3_3_1", label="LM-PCI术后即刻主要靶血管TIMI血流分级的选择"),
		@Column(name="stemi_3_2_3_3_2", attrName="stemi_3_2_3_3_2", label="LM-置入冠状动脉支架选择"),
		@Column(name="stemi_3_2_3_3_2_1", attrName="stemi_3_2_3_3_2_1", label="LM-置入冠状动脉支架填写"),
		@Column(name="stemi_3_2_3_3_3", attrName="stemi_3_2_3_3_3", label="LAD-PCI术后即刻主要靶血管TIMI血流分级的选择"),
		@Column(name="stemi_3_2_3_3_4", attrName="stemi_3_2_3_3_4", label="LAD-置入冠状动脉支架选择"),
		@Column(name="stemi_3_2_3_3_4_1", attrName="stemi_3_2_3_3_4_1", label="LAD-置入冠状动脉支架填写"),
		@Column(name="stemi_3_2_3_3_5", attrName="stemi_3_2_3_3_5", label="LCX-PCI术后即刻主要靶血管TIMI血流分级的选择"),
		@Column(name="stemi_3_2_3_3_6", attrName="stemi_3_2_3_3_6", label="LCX-置入冠状动脉支架选择"),
		@Column(name="stemi_3_2_3_3_6_1", attrName="stemi_3_2_3_3_6_1", label="LCX-置入冠状动脉支架填写"),
		@Column(name="stemi_3_2_3_3_7", attrName="stemi_3_2_3_3_7", label="LM-LAD-PCI术后即刻主要靶血管TIMI血流分级的选择"),
		@Column(name="stemi_3_2_3_3_8", attrName="stemi_3_2_3_3_8", label="LM-LAD-置入冠状动脉支架选择"),
		@Column(name="stemi_3_2_3_3_8_1", attrName="stemi_3_2_3_3_8_1", label="LM-LAD-置入冠状动脉支架填写"),
		@Column(name="stemi_3_2_3_9_1", attrName="stemi_3_2_3_9_1", label="LM-LCX-PCI术后即刻主要靶血管TIMI血流分级的选择"),
		@Column(name="stemi_3_2_3_3_10", attrName="stemi_3_2_3_3_10", label="LM-LCX-置入冠状动脉支架选择"),
		@Column(name="stemi_3_2_3_3_10_1", attrName="stemi_3_2_3_3_10_1", label="LM-LCX-置入冠状动脉支架填写"),
		@Column(name="stemi_3_2_3_3_11", attrName="stemi_3_2_3_3_11", label="RCA-PCI术后即刻主要靶血管TIMI血流分级的选择"),
		@Column(name="stemi_3_2_3_3_12", attrName="stemi_3_2_3_3_12", label="RCA-置入冠状动脉支架选择"),
		@Column(name="stemi_3_2_3_3_12_1", attrName="stemi_3_2_3_3_12_1", label="RCA-置入冠状动脉支架填写"),
		@Column(name="stemi_3_2_3_3_13", attrName="stemi_3_2_3_3_13", label="LM-中间支-PCI术后即刻主要靶血管TIMI血流分级的选择"),
		@Column(name="stemi_3_2_3_3_14", attrName="stemi_3_2_3_3_14", label="LM-中间支-置入冠状动脉支架选择"),
		@Column(name="stemi_3_2_3_3_14_1", attrName="stemi_3_2_3_3_14_1", label="LM-中间支-置入冠状动脉支架填写"),
		@Column(name="stemi_3_2_3_15_1", attrName="stemi_3_2_3_15_1", label="中间支-PCI术后即刻主要靶血管TIMI血流分级的选择"),
		@Column(name="stemi_3_2_3_3_16", attrName="stemi_3_2_3_3_16", label="中间支-置入冠状动脉支架选择"),
		@Column(name="stemi_3_2_3_3_16_1", attrName="stemi_3_2_3_3_16_1", label="中间支-置入冠状动脉支架填写"),
		@Column(name="stemi_3_2_4_1", attrName="stemi_3_2_4_1", label="ICD-9-CM-3编码与名称"),
		@Column(name="stemi_3_2_4_2", attrName="stemi_3_2_4_2", label="治疗血管的数量的选择"),
		@Column(name="stemi_3_2_4_3", attrName="stemi_3_2_4_3", label="置入血管支架的数量现在"),
		@Column(name="stemi_3_2_4_4", attrName="stemi_3_2_4_4", label="心脏团队讨论决策模式的选择"),
		@Column(name="stemi_3_2_5_1", attrName="stemi_3_2_5_1", label="近期主要并发症的选择"),
		@Column(name="stemi_3_2_5_1_1", attrName="stemi_3_2_5_1_1", label="其他近期主要并发症"),
		@Column(name="stemi_3_2_5_2", attrName="stemi_3_2_5_2", label="近期并发症治疗主要措施的选择"),
		@Column(name="stemi_3_2_5_2_1", attrName="stemi_3_2_5_2_1", label="其他近期并发症治疗主要措施"),
		@Column(name="stemi_3_2_6_1", attrName="stemi_3_2_6_1", label="是否实施CathPCI风险评估"),
		@Column(name="stemi_3_2_6_2_1_1", attrName="stemi_3_2_6_2_1_1", label="总分值"),
		@Column(name="stemi_3_2_6_2_2", attrName="stemi_3_2_6_2_2", label="院内患者死亡风险", comment="院内患者死亡风险(%)"),
		@Column(name="stemi_3_2_7_1", attrName="stemi_3_2_7_1", label="是否实施围术期抗凝治疗"),
		@Column(name="stemi_3_2_7_2", attrName="stemi_3_2_7_2", label="肠外抗凝药物选择"),
		@Column(name="stemi_3_2_7_3", attrName="stemi_3_2_7_3", label="其他肠外抗凝药物"),
		@Column(name="stemi_3_3_0", attrName="stemi_3_3_0", label="", comment="（本院）无条件实施时，是否将患者转往有条件行PCI的医院"),
		@Column(name="stemi_3_3_1_1", attrName="stemi_3_3_1_1", label="医院自身原因"),
		@Column(name="stemi_3_3_1_1_1", attrName="stemi_3_3_1_1_1", label="其他医院自身原因"),
		@Column(name="stemi_3_3_1_2", attrName="stemi_3_3_1_2", label="患者自身原因转院"),
		@Column(name="stemi_3_3_1_2_1", attrName="stemi_3_3_1_2_1", label="其他患者自身原因"),
		@Column(name="stemi_3_3_2", attrName="stemi_3_3_2", label="转院类型及适应症"),
		@Column(name="stemi_3_3_3_1", attrName="stemi_3_3_3_1", label="转院日期时间"),
		@Column(name="stemi_3_3_4_1", attrName="stemi_3_3_4_1", label="到医院就诊至转出时间", comment="到医院就诊至转出时间（分钟）"),
		@Column(name="stemi_3_4", attrName="stemi_3_4", label="医院是否具备接受外院“转院PCI”患者的能力"),
		@Column(name="stemi_3_4_1_1", attrName="stemi_3_4_1_1", label="患者从不具备实施PCI能力医院转运到本院急诊或门诊日期"),
		@Column(name="stemi_3_4_2_1", attrName="stemi_3_4_2_1", label="PCI导丝通过梗死相关动脉的时间"),
		@Column(name="stemi_3_4_3_1", attrName="stemi_3_4_3_1", label="医院转出时间至PCI导丝通过梗死相关动脉", comment="医院转出时间至PCI导丝通过梗死相关动脉（D2B1）时间（分钟）"),
		@Column(name="stemi_3_4_4", attrName="stemi_3_4_4", label="治疗延迟原因选择"),
		@Column(name="stemi_4_1_1", attrName="stemi_4_1_1", label="是否有β-受体阻滞剂禁忌证"),
		@Column(name="stemi_4_1_2_1", attrName="stemi_4_1_2_1", label="β-受体阻滞剂禁忌症"),
		@Column(name="stemi_4_1_2_1_1", attrName="stemi_4_1_2_1_1", label="其他β-受体阻滞剂禁忌症"),
		@Column(name="stemi_4_1_2_2", attrName="stemi_4_1_2_2", label="β-受体阻滞剂相对禁忌症"),
		@Column(name="stemi_4_1_2_2_1", attrName="stemi_4_1_2_2_1", label="其他β-受体阻滞剂相对禁忌症"),
		@Column(name="stemi_4_2", attrName="stemi_4_2", label="使用首剂β-受体阻滞剂"),
		@Column(name="stemi_4_3_1", attrName="stemi_4_3_1", label="首剂用药日期时间"),
		@Column(name="stemi_5_1_1", attrName="stemi_5_1_1", label="双联抗血小板药物是否有用药长期医嘱"),
		@Column(name="stemi_5_1_2", attrName="stemi_5_1_2", label="双联抗血小板药物品名的选择"),
		@Column(name="stemi_5_1_2_1", attrName="stemi_5_1_2_1", label="双联抗血小板药物品名填写"),
		@Column(name="stemi_5_2_1", attrName="stemi_5_2_1", label="β阻滞剂是否有用药长期医嘱"),
		@Column(name="stemi_5_2_2", attrName="stemi_5_2_2", label="长期医嘱中使用β-受体阻滞剂品名的选择"),
		@Column(name="stemi_5_3_1", attrName="stemi_5_3_1", label="是否有ACEI抑制剂/ARB类药物禁忌症"),
		@Column(name="stemi_5_3_2", attrName="stemi_5_3_2", label="ACE抑制剂/ARB类药物禁忌症的选择"),
		@Column(name="stemi_5_3_3", attrName="stemi_5_3_3", label="是否有ACEI抑制剂/ARB类药物长期医嘱"),
		@Column(name="stemi_5_3_4_a", attrName="stemi_5_3_4_a", label="使用ACE抑制剂药物名称的选择"),
		@Column(name="stemi_5_3_4_a_1", attrName="stemi_5_3_4_a_1", label="其他ACE抑制剂药物"),
		@Column(name="stemi_5_3_4_b", attrName="stemi_5_3_4_b", label="使用ARB类药物名称的选择"),
		@Column(name="stemi_5_3_4_b_1", attrName="stemi_5_3_4_b_1", label="其他ARB类药物"),
		@Column(name="stemi_5_4_1", attrName="stemi_5_4_1", label="是否有他汀类药禁忌证"),
		@Column(name="stemi_5_4_2", attrName="stemi_5_4_2", label="他汀类药物禁忌证的选择"),
		@Column(name="stemi_5_4_3", attrName="stemi_5_4_3", label="是否有用药长期医嘱"),
		@Column(name="stemi_5_4_4", attrName="stemi_5_4_4", label="给予他汀类药物名称的选择"),
		@Column(name="stemi_5_4_4_1", attrName="stemi_5_4_4_1", label="其他其他降脂药物"),
		@Column(name="stemi_6_1", attrName="stemi_6_1", label="是否有出院带药医嘱-抗血小板药物"),
		@Column(name="stemi_6_1_2", attrName="stemi_6_1_2", label="双联抗血小板药物品名的选择"),
		@Column(name="stemi_6_1_2_1", attrName="stemi_6_1_2_1", label="其他双联抗血小板药物品"),
		@Column(name="stemi_6_2", attrName="stemi_6_2", label="是否有β阻滞剂出院带药医嘱"),
		@Column(name="stemi_6_2_2", attrName="stemi_6_2_2", label="使用β-受体阻滞剂品名的选择"),
		@Column(name="stemi_6_3", attrName="stemi_6_3", label="是否有出院带药医嘱-ACEI抑制剂/ARB类药物医嘱"),
		@Column(name="stemi_6_3_2", attrName="stemi_6_3_2", label="使用ACEI抑制剂或者ARB类药物"),
		@Column(name="stemi_6_3_2_a", attrName="stemi_6_3_2_a", label="使用ACE抑制剂药物名称的选择"),
		@Column(name="stemi_6_3_2_a_1", attrName="stemi_6_3_2_a_1", label="其他ACE抑制剂药物"),
		@Column(name="stemi_6_3_2_b", attrName="stemi_6_3_2_b", label="使用ARB类药物名称的选择"),
		@Column(name="stemi_6_3_2_b_1", attrName="stemi_6_3_2_b_1", label="其他ARB类药物"),
		@Column(name="stemi_6_4", attrName="stemi_6_4", label="是否有出院带药医嘱-他汀类药物医嘱"),
		@Column(name="stemi_6_4_2", attrName="stemi_6_4_2", label="给予他汀类药物名称的选择"),
		@Column(name="stemi_6_4_2_1", attrName="stemi_6_4_2_1", label="其他降脂药物"),
		@Column(name="stemi_6_5_1", attrName="stemi_6_5_1", label="是否有醛固酮受体拮抗剂药物禁忌证"),
		@Column(name="stemi_6_5_2", attrName="stemi_6_5_2", label="醛固酮受体拮抗剂药物禁忌证的选择"),
		@Column(name="stemi_6_5_2_1", attrName="stemi_6_5_2_1", label="醛固酮受体拮抗剂药物禁忌证填写"),
		@Column(name="stemi_6_5_3", attrName="stemi_6_5_3", label="是否有醛固酮受体拮抗剂药物适应证"),
		@Column(name="stemi_6_5_4", attrName="stemi_6_5_4", label="醛固酮受体拮抗剂药物适应证的选择"),
		@Column(name="stemi_6_5_5", attrName="stemi_6_5_5", label="是否有出院带药医嘱-醛固酮受体拮抗剂"),
		@Column(name="stemi_6_5_6", attrName="stemi_6_5_6", label="出院带药医嘱中使用醛固酮受体拮抗剂品名的选择"),
		@Column(name="stemi_6_5_6_1", attrName="stemi_6_5_6_1", label="其他醛固酮受体拮抗剂品名"),
		@Column(name="stemi_7_1", attrName="stemi_7_1", label="血脂评价时间"),
		@Column(name="stemi_7_2", attrName="stemi_7_2", label="血脂评价结果"),
		@Column(name="stemi_7_3_1", attrName="stemi_7_3_1", label="是否有他汀药物禁忌症"),
		@Column(name="stemi_7_3_2", attrName="stemi_7_3_2", label="他汀类药物禁忌证的选择"),
		@Column(name="stemi_7_4", attrName="stemi_7_4", label="是否有他汀类药物长期医嘱"),
		@Column(name="stemi_7_5", attrName="stemi_7_5", label="是否有他汀类药物出院带药医嘱"),
		@Column(name="stemi_8_1_1", attrName="stemi_8_1_1", label="吸烟史"),
		@Column(name="stemi_8_1_2", attrName="stemi_8_1_2", label="吸烟程度评估有记录"),
		@Column(name="stemi_8_1_3", attrName="stemi_8_1_3", label="接受戒烟的建议或者戒烟治疗有记录"),
		@Column(name="stemi_8_2_1", attrName="stemi_8_2_1", label="", comment="（主要）危险因素的评估"),
		@Column(name="stemi_8_2_2", attrName="stemi_8_2_2", label="实施针对控制危险因素评估结果的教育"),
		@Column(name="stemi_8_3", attrName="stemi_8_3", label="二级预防"),
		@Column(name="stemi_8_4_1", attrName="stemi_8_4_1", label="交与患者“出院小结”的副本告知患者出院时风险因素"),
		@Column(name="stemi_8_4_2", attrName="stemi_8_4_2", label="出院带药"),
		@Column(name="stemi_8_4_3", attrName="stemi_8_4_3", label="告知发生紧急情况时求援救治途径"),
		@Column(name="stemi_8_4_4", attrName="stemi_8_4_4", label="出院时教育与随访"),
		@Column(name="stemi_8_4_5", attrName="stemi_8_4_5", label="告知何为风险因素与紧急情况"),
		@Column(name="stemi_9_2_1", attrName="stemi_9_2_1", label="出院时状态评估结果"),
		@Column(name="stemi_9_2_1_1", attrName="stemi_9_2_1_1", label="其他出院时状态填写"),
		@Column(name="stemi_9_2_2_a_2", attrName="stemi_9_2_2_a_2", label="末次GRACE危险评估是否有记录"),
		@Column(name="stemi_9_2_2_a_1_1", attrName="stemi_9_2_2_a_1_1", label="末次GRACE危险评估"),
		@Column(name="stemi_9_2_2_a_3", attrName="stemi_9_2_2_a_3", label="GRACE危险评估分层的选择"),
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
public class QualityStemi extends DataEntity<QualityStemi> {
	
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
	private String cm_0_2_2_1;		// 发病日期时间是否无法确定或无记录
	private Date cm_0_2_2_2;		// 发病日期时间
	private Date cm_0_2_3_2;		// 到达本院急诊或者门诊日期时间
	private Date cm_0_2_4_1;		// 入院日期时间
	private Date cm_0_2_4_2;		// 出院日期时间
	private Date cm_0_2_5_1;		// 入住CCU日期时间
	private Date cm_0_2_5_2;		// 离开CCU日期时间
	private String cm_0_3_1;		// 费用支付方式
	private String cm_0_3_2;		// 收入住院途径
	private String cm_0_3_3;		// 到院交通工具
	private String stemi_0_4_6;		// 救护车类型
	private String stemi_0_4_1;		// 是否现场评估生命体征，施行急救
	private String stemi_0_4_2;		// 到达现场后10分钟内是否完成心电图检查
	private String stemi_0_4_3;		// 现场急救维持生命体征稳定措施选择
	private String stemi_0_4_4;		// 对持续胸痛＞15分钟和心电图ST段抬高，且无“阿斯匹林”禁忌症的患者用药
	private String stemi_0_4_5;		// 是否利用救护车中车载信息系统、微信、彩信等多种形式传输心电图等院前信息至目标医院
	private String stemi_0_4_7;		// 是否入院前在救护车上开始溶栓治疗
	private String stemi_1_1_4;		// 是否有症状和病史
	private String stemi_1_1_5;		// 症状和体征选择
	private String stemi_1_1_6;		// 是否实施首次采用Killip分级法评估心功能
	private String stemi_1_1_7;		// Killip分级，症状及体征选择
	private String stemi_1_1_1;		// 是否实施首次心电图检查
	private Date stemi_1_1_2_1;		// 心电图检查结果确诊STEMI报告日期时间
	private String stemi_1_1_3;		// 心电图检查结果，具有STEMI特征性诊断标准的选择
	private String stemi_1_1_3_1;		// 其他心电图检查结果填写
	private String stemi_1_2_1;		// 是否有P2Y12受体拮抗剂禁忌证
	private String stemi_1_2_2;		// P2Y12受体拮抗剂禁忌证
	private String stemi_1_2_2_1;		// 其他P2Y12受体拮抗剂禁忌证填写
	private String stemi_1_2_3;		// 首剂给予双联抗血小板药负荷剂量
	private String stemi_1_2_3_1;		// 其他抗血小板药物填写
	private Date stemi_1_2_4_1;		// 用药日期时间
	private String stemi_1_3_1_1;		// 是否实施首次心脏标志物检测
	private Date stemi_1_3_1_2_1;		// 首次心脏标志物检测结果报告日期时间
	private String stemi_1_3_2;		// 首次心脏标志物检测选项和数值
	private String stemi_1_4_1_1;		// 肌钙蛋白T检测选项
	private Long stemi_1_3_2_1;		// 肌钙蛋白T检测值(ng/Ml)
	private String stemi_1_4_1_2;		// 肌钙蛋白T定性检测选择
	private String stemi_1_4_2_1;		// 肌钙蛋白I检测选项
	private Long stemi_1_3_2_2;		// 肌钙蛋白I检测值(ng/mL)
	private String stemi_1_4_2_2;		// 肌钙蛋白I定性检测选择
	private String stemi_1_4_3_1;		// 肌酸激酶同工酶检测选项
	private Long stemi_1_3_2_3;		// 肌酸激酶同工酶检测值(ng/mL)
	private String stemi_1_4_3_2;		// 肌酸激酶同工酶定性检测选择
	private String stemi_1_4_4_1;		// 心肌肌红蛋白检测选项
	private Long stemi_1_3_2_4;		// 心肌肌红蛋白检测值(ng/mL)
	private String stemi_1_4_4_2;		// 心肌肌红蛋白定性检测选择
	private String stemi_1_4_5_1;		// B型钠尿肽检测选项
	private Long stemi_1_3_2_5;		// B型钠尿肽检测值(ng/L)
	private String stemi_1_4_5_2;		// B型钠尿肽定性检测选择
	private String stemi_1_4_6_1;		// N端B型钠尿肽前体检测选项
	private Long stemi_1_3_2_6;		// N端B型钠尿肽前体检测值(ng/L)
	private String stemi_1_4_6_2;		// N端B型钠尿肽前体定性检测选择
	private String stemi_2_1_1;		// 是否实施首次X线胸片检查
	private Date stemi_2_1_2_1;		// 首次X线胸片检查报告日期时间
	private String stemi_2_1_3;		// 是否有肺淤血或肺水肿
	private String stemi_2_2_1;		// 是否实施首次超声心动图(CDFA)检查
	private Date stemi_2_2_2_1;		// 报告日期时间
	private Long stemi_2_2_3_1;		// 左室射血分（LVEF）测量值(%)
	private Long stemi_2_2_3_3_1;		// 左室舒张末径（LVEDd）数值(mm)
	private String stemi_2_2_3_4;		// 是否有左室室壁瘤
	private String stemi_2_3_1_1;		// 是否实施GRACE危险评分评估
	private Date stemi_2_3_1_2_1;		// 评估日期时间
	private Long stemi_2_3_1_3_1;		// 实施首次GRACE危险评分值
	private String stemi_2_3_1_4;		// GRACE危险评估分层的选择
	private String stemi_2_3_2_1;		// 是否实施TIMI危险分层评估
	private Date stemi_2_3_2_2_1;		// 评估日期时间
	private Long stemi_2_3_2_3_1;		// 实施首次TIMI危险分层分值
	private String stemi_2_3_2_4;		// TIMI危险分层的选择
	private String stemi_2_3_3_1;		// 是否实施CRUSADE出血风险评分
	private Date stemi_2_3_3_2_1;		// 评估日期时间
	private Long stemi_2_3_3_3_1;		// 实施首次CRUSADE出血风险评分值
	private String stemi_2_3_3_4;		// CRUSADE出血风险评分分层的选择
	private String stemi_3_0_2;		// 实施再灌注治疗的模式
	private String stemi_3_1_1;		// STEMI溶栓适应证
	private String stemi_3_1_2_1;		// 是否有溶栓治疗禁忌症
	private String stemi_3_1_2_2;		// 绝对禁忌证选择
	private String stemi_3_1_2_3;		// 相对禁忌证选择
	private String stemi_3_1_3;		// 是否实施溶栓治疗
	private String stemi_3_1_4;		// 溶栓药物选择
	private String stemi_3_1_4_1;		// 其他溶栓药物
	private Date stemi_3_1_5_1;		// 输注开始日期时间
	private Date stemi_3_1_6_1;		// 输注完成日期时间
	private Long stemi_3_1_7_1;		// 到达医院STEMI确诊报告日期与时间至溶栓时间（D2N）
	private String stemi_3_1_8;		// 临床评估溶栓成功(60~90 min)
	private String stemi_3_1_9;		// 溶栓治疗并发症的选择
	private String stemi_3_1_10;		// 溶栓治疗延迟原因
	private String stemi_3_2_1;		// 是否实施PCI治疗
	private String stemi_3_2_2_1_3;		// PCI适应证
	private String stemi_3_2_2_1_1;		// 直接PCI适应证
	private String stemi_3_2_2_1_1_1;		// 直接PCI适应证填写
	private String stemi_3_2_2_1_2;		// 溶栓后PCI适应证
	private String stemi_3_2_2;		// 是否有PCI禁忌证
	private String stemi_3_2_2_1;		// PCI禁忌证选择
	private Date stemi_3_2_2_2_1;		// PCI导丝通过梗死相关动脉日期时间
	private Date stemi_3_2_2_3_1;		// 完成时间
	private String stemi_3_2_2_4_1;		// 确诊STEMI至PCI导丝通过梗死相关动脉（D2B）时间（分钟）
	private String stemi_3_2_2_5;		// 治疗延迟原因选择
	private String stemi_3_2_3_1;		// 主要病变血管
	private String stemi_3_2_3_2_1;		// LAD-冠状动脉狭窄程度分级
	private String stemi_3_2_3_2_5;		// LAD-术前主要靶血管TIMI血流分级的选择
	private String stemi_3_2_3_2_2;		// LCX-冠状动脉狭窄程度分级
	private String stemi_3_2_3_2_6;		// LCX-术前主要靶血管TIMI血流分级的选择
	private String stemi_3_2_3_2_3;		// RCA-冠状动脉狭窄程度分级
	private String stemi_3_2_3_2_7;		// RCA-术前主要靶血管TIMI血流分级的选择
	private String stemi_3_2_3_2_4;		// LM-冠状动脉狭窄程度分级
	private String stemi_3_2_3_2_8;		// LM-术前主要靶血管TIMI血流分级的选择
	private String stemi_3_2_3_3;		// PCI治疗主要靶血管
	private String stemi_3_2_3_3_1;		// LM-PCI术后即刻主要靶血管TIMI血流分级的选择
	private String stemi_3_2_3_3_2;		// LM-置入冠状动脉支架选择
	private String stemi_3_2_3_3_2_1;		// LM-置入冠状动脉支架填写
	private String stemi_3_2_3_3_3;		// LAD-PCI术后即刻主要靶血管TIMI血流分级的选择
	private String stemi_3_2_3_3_4;		// LAD-置入冠状动脉支架选择
	private String stemi_3_2_3_3_4_1;		// LAD-置入冠状动脉支架填写
	private String stemi_3_2_3_3_5;		// LCX-PCI术后即刻主要靶血管TIMI血流分级的选择
	private String stemi_3_2_3_3_6;		// LCX-置入冠状动脉支架选择
	private String stemi_3_2_3_3_6_1;		// LCX-置入冠状动脉支架填写
	private String stemi_3_2_3_3_7;		// LM-LAD-PCI术后即刻主要靶血管TIMI血流分级的选择
	private String stemi_3_2_3_3_8;		// LM-LAD-置入冠状动脉支架选择
	private String stemi_3_2_3_3_8_1;		// LM-LAD-置入冠状动脉支架填写
	private String stemi_3_2_3_9_1;		// LM-LCX-PCI术后即刻主要靶血管TIMI血流分级的选择
	private String stemi_3_2_3_3_10;		// LM-LCX-置入冠状动脉支架选择
	private String stemi_3_2_3_3_10_1;		// LM-LCX-置入冠状动脉支架填写
	private String stemi_3_2_3_3_11;		// RCA-PCI术后即刻主要靶血管TIMI血流分级的选择
	private String stemi_3_2_3_3_12;		// RCA-置入冠状动脉支架选择
	private String stemi_3_2_3_3_12_1;		// RCA-置入冠状动脉支架填写
	private String stemi_3_2_3_3_13;		// LM-中间支-PCI术后即刻主要靶血管TIMI血流分级的选择
	private String stemi_3_2_3_3_14;		// LM-中间支-置入冠状动脉支架选择
	private String stemi_3_2_3_3_14_1;		// LM-中间支-置入冠状动脉支架填写
	private String stemi_3_2_3_15_1;		// 中间支-PCI术后即刻主要靶血管TIMI血流分级的选择
	private String stemi_3_2_3_3_16;		// 中间支-置入冠状动脉支架选择
	private String stemi_3_2_3_3_16_1;		// 中间支-置入冠状动脉支架填写
	private String stemi_3_2_4_1;		// ICD-9-CM-3编码与名称
	private String stemi_3_2_4_2;		// 治疗血管的数量的选择
	private String stemi_3_2_4_3;		// 置入血管支架的数量现在
	private String stemi_3_2_4_4;		// 心脏团队讨论决策模式的选择
	private String stemi_3_2_5_1;		// 近期主要并发症的选择
	private String stemi_3_2_5_1_1;		// 其他近期主要并发症
	private String stemi_3_2_5_2;		// 近期并发症治疗主要措施的选择
	private String stemi_3_2_5_2_1;		// 其他近期并发症治疗主要措施
	private String stemi_3_2_6_1;		// 是否实施CathPCI风险评估
	private Long stemi_3_2_6_2_1_1;		// 总分值
	private Long stemi_3_2_6_2_2;		// 院内患者死亡风险(%)
	private String stemi_3_2_7_1;		// 是否实施围术期抗凝治疗
	private String stemi_3_2_7_2;		// 肠外抗凝药物选择
	private String stemi_3_2_7_3;		// 其他肠外抗凝药物
	private String stemi_3_3_0;		// （本院）无条件实施时，是否将患者转往有条件行PCI的医院
	private String stemi_3_3_1_1;		// 医院自身原因
	private String stemi_3_3_1_1_1;		// 其他医院自身原因
	private String stemi_3_3_1_2;		// 患者自身原因转院
	private String stemi_3_3_1_2_1;		// 其他患者自身原因
	private String stemi_3_3_2;		// 转院类型及适应症
	private Date stemi_3_3_3_1;		// 转院日期时间
	private Long stemi_3_3_4_1;		// 到医院就诊至转出时间（分钟）
	private String stemi_3_4;		// 医院是否具备接受外院“转院PCI”患者的能力
	private Date stemi_3_4_1_1;		// 患者从不具备实施PCI能力医院转运到本院急诊或门诊日期
	private Date stemi_3_4_2_1;		// PCI导丝通过梗死相关动脉的时间
	private Long stemi_3_4_3_1;		// 医院转出时间至PCI导丝通过梗死相关动脉（D2B1）时间（分钟）
	private String stemi_3_4_4;		// 治疗延迟原因选择
	private String stemi_4_1_1;		// 是否有β-受体阻滞剂禁忌证
	private String stemi_4_1_2_1;		// β-受体阻滞剂禁忌症
	private String stemi_4_1_2_1_1;		// 其他β-受体阻滞剂禁忌症
	private String stemi_4_1_2_2;		// β-受体阻滞剂相对禁忌症
	private String stemi_4_1_2_2_1;		// 其他β-受体阻滞剂相对禁忌症
	private String stemi_4_2;		// 使用首剂β-受体阻滞剂
	private Date stemi_4_3_1;		// 首剂用药日期时间
	private String stemi_5_1_1;		// 双联抗血小板药物是否有用药长期医嘱
	private String stemi_5_1_2;		// 双联抗血小板药物品名的选择
	private String stemi_5_1_2_1;		// 双联抗血小板药物品名填写
	private String stemi_5_2_1;		// β阻滞剂是否有用药长期医嘱
	private String stemi_5_2_2;		// 长期医嘱中使用β-受体阻滞剂品名的选择
	private String stemi_5_3_1;		// 是否有ACEI抑制剂/ARB类药物禁忌症
	private String stemi_5_3_2;		// ACE抑制剂/ARB类药物禁忌症的选择
	private String stemi_5_3_3;		// 是否有ACEI抑制剂/ARB类药物长期医嘱
	private String stemi_5_3_4_a;		// 使用ACE抑制剂药物名称的选择
	private String stemi_5_3_4_a_1;		// 其他ACE抑制剂药物
	private String stemi_5_3_4_b;		// 使用ARB类药物名称的选择
	private String stemi_5_3_4_b_1;		// 其他ARB类药物
	private String stemi_5_4_1;		// 是否有他汀类药禁忌证
	private String stemi_5_4_2;		// 他汀类药物禁忌证的选择
	private String stemi_5_4_3;		// 是否有用药长期医嘱
	private String stemi_5_4_4;		// 给予他汀类药物名称的选择
	private String stemi_5_4_4_1;		// 其他其他降脂药物
	private String stemi_6_1;		// 是否有出院带药医嘱-抗血小板药物
	private String stemi_6_1_2;		// 双联抗血小板药物品名的选择
	private String stemi_6_1_2_1;		// 其他双联抗血小板药物品
	private String stemi_6_2;		// 是否有β阻滞剂出院带药医嘱
	private String stemi_6_2_2;		// 使用β-受体阻滞剂品名的选择
	private String stemi_6_3;		// 是否有出院带药医嘱-ACEI抑制剂/ARB类药物医嘱
	private String stemi_6_3_2;		// 使用ACEI抑制剂或者ARB类药物
	private String stemi_6_3_2_a;		// 使用ACE抑制剂药物名称的选择
	private String stemi_6_3_2_a_1;		// 其他ACE抑制剂药物
	private String stemi_6_3_2_b;		// 使用ARB类药物名称的选择
	private String stemi_6_3_2_b_1;		// 其他ARB类药物
	private String stemi_6_4;		// 是否有出院带药医嘱-他汀类药物医嘱
	private String stemi_6_4_2;		// 给予他汀类药物名称的选择
	private String stemi_6_4_2_1;		// 其他降脂药物
	private String stemi_6_5_1;		// 是否有醛固酮受体拮抗剂药物禁忌证
	private String stemi_6_5_2;		// 醛固酮受体拮抗剂药物禁忌证的选择
	private String stemi_6_5_2_1;		// 醛固酮受体拮抗剂药物禁忌证填写
	private String stemi_6_5_3;		// 是否有醛固酮受体拮抗剂药物适应证
	private String stemi_6_5_4;		// 醛固酮受体拮抗剂药物适应证的选择
	private String stemi_6_5_5;		// 是否有出院带药医嘱-醛固酮受体拮抗剂
	private String stemi_6_5_6;		// 出院带药医嘱中使用醛固酮受体拮抗剂品名的选择
	private String stemi_6_5_6_1;		// 其他醛固酮受体拮抗剂品名
	private String stemi_7_1;		// 血脂评价时间
	private String stemi_7_2;		// 血脂评价结果
	private String stemi_7_3_1;		// 是否有他汀药物禁忌症
	private String stemi_7_3_2;		// 他汀类药物禁忌证的选择
	private String stemi_7_4;		// 是否有他汀类药物长期医嘱
	private String stemi_7_5;		// 是否有他汀类药物出院带药医嘱
	private String stemi_8_1_1;		// 吸烟史
	private String stemi_8_1_2;		// 吸烟程度评估有记录
	private String stemi_8_1_3;		// 接受戒烟的建议或者戒烟治疗有记录
	private String stemi_8_2_1;		// （主要）危险因素的评估
	private String stemi_8_2_2;		// 实施针对控制危险因素评估结果的教育
	private String stemi_8_3;		// 二级预防
	private String stemi_8_4_1;		// 交与患者“出院小结”的副本告知患者出院时风险因素
	private String stemi_8_4_2;		// 出院带药
	private String stemi_8_4_3;		// 告知发生紧急情况时求援救治途径
	private String stemi_8_4_4;		// 出院时教育与随访
	private String stemi_8_4_5;		// 告知何为风险因素与紧急情况
	private String stemi_9_2_1;		// 出院时状态评估结果
	private String stemi_9_2_1_1;		// 其他出院时状态填写
	private String stemi_9_2_2_a_2;		// 末次GRACE危险评估是否有记录
	private String stemi_9_2_2_a_1_1;		// 末次GRACE危险评估
	private String stemi_9_2_2_a_3;		// GRACE危险评估分层的选择
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
	
	public QualityStemi() {
		this(null);
	}

	public QualityStemi(String id){
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
	
	@Length(min=0, max=32, message="救护车类型长度不能超过 32 个字符")
	public String getStemi_0_4_6() {
		return stemi_0_4_6;
	}

	public void setStemi_0_4_6(String stemi_0_4_6) {
		this.stemi_0_4_6 = stemi_0_4_6;
	}
	
	@Length(min=0, max=32, message="是否现场评估生命体征，施行急救长度不能超过 32 个字符")
	public String getStemi_0_4_1() {
		return stemi_0_4_1;
	}

	public void setStemi_0_4_1(String stemi_0_4_1) {
		this.stemi_0_4_1 = stemi_0_4_1;
	}
	
	@Length(min=0, max=32, message="到达现场后10分钟内是否完成心电图检查长度不能超过 32 个字符")
	public String getStemi_0_4_2() {
		return stemi_0_4_2;
	}

	public void setStemi_0_4_2(String stemi_0_4_2) {
		this.stemi_0_4_2 = stemi_0_4_2;
	}
	
	@Length(min=0, max=32, message="现场急救维持生命体征稳定措施选择长度不能超过 32 个字符")
	public String getStemi_0_4_3() {
		return stemi_0_4_3;
	}

	public void setStemi_0_4_3(String stemi_0_4_3) {
		this.stemi_0_4_3 = stemi_0_4_3;
	}
	
	@Length(min=0, max=32, message="对持续胸痛＞15分钟和心电图ST段抬高，且无“阿斯匹林”禁忌症的患者用药长度不能超过 32 个字符")
	public String getStemi_0_4_4() {
		return stemi_0_4_4;
	}

	public void setStemi_0_4_4(String stemi_0_4_4) {
		this.stemi_0_4_4 = stemi_0_4_4;
	}
	
	@Length(min=0, max=32, message="是否利用救护车中车载信息系统、微信、彩信等多种形式传输心电图等院前信息至目标医院长度不能超过 32 个字符")
	public String getStemi_0_4_5() {
		return stemi_0_4_5;
	}

	public void setStemi_0_4_5(String stemi_0_4_5) {
		this.stemi_0_4_5 = stemi_0_4_5;
	}
	
	@Length(min=0, max=32, message="是否入院前在救护车上开始溶栓治疗长度不能超过 32 个字符")
	public String getStemi_0_4_7() {
		return stemi_0_4_7;
	}

	public void setStemi_0_4_7(String stemi_0_4_7) {
		this.stemi_0_4_7 = stemi_0_4_7;
	}
	
	@Length(min=0, max=32, message="是否有症状和病史长度不能超过 32 个字符")
	public String getStemi_1_1_4() {
		return stemi_1_1_4;
	}

	public void setStemi_1_1_4(String stemi_1_1_4) {
		this.stemi_1_1_4 = stemi_1_1_4;
	}
	
	@Length(min=0, max=32, message="症状和体征选择长度不能超过 32 个字符")
	public String getStemi_1_1_5() {
		return stemi_1_1_5;
	}

	public void setStemi_1_1_5(String stemi_1_1_5) {
		this.stemi_1_1_5 = stemi_1_1_5;
	}
	
	@Length(min=0, max=32, message="是否实施首次采用Killip分级法评估心功能长度不能超过 32 个字符")
	public String getStemi_1_1_6() {
		return stemi_1_1_6;
	}

	public void setStemi_1_1_6(String stemi_1_1_6) {
		this.stemi_1_1_6 = stemi_1_1_6;
	}
	
	@Length(min=0, max=32, message="Killip分级，症状及体征选择长度不能超过 32 个字符")
	public String getStemi_1_1_7() {
		return stemi_1_1_7;
	}

	public void setStemi_1_1_7(String stemi_1_1_7) {
		this.stemi_1_1_7 = stemi_1_1_7;
	}
	
	@Length(min=0, max=32, message="是否实施首次心电图检查长度不能超过 32 个字符")
	public String getStemi_1_1_1() {
		return stemi_1_1_1;
	}

	public void setStemi_1_1_1(String stemi_1_1_1) {
		this.stemi_1_1_1 = stemi_1_1_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi_1_1_2_1() {
		return stemi_1_1_2_1;
	}

	public void setStemi_1_1_2_1(Date stemi_1_1_2_1) {
		this.stemi_1_1_2_1 = stemi_1_1_2_1;
	}
	
	@Length(min=0, max=32, message="心电图检查结果，具有STEMI特征性诊断标准的选择长度不能超过 32 个字符")
	public String getStemi_1_1_3() {
		return stemi_1_1_3;
	}

	public void setStemi_1_1_3(String stemi_1_1_3) {
		this.stemi_1_1_3 = stemi_1_1_3;
	}
	
	@Length(min=0, max=32, message="其他心电图检查结果填写长度不能超过 32 个字符")
	public String getStemi_1_1_3_1() {
		return stemi_1_1_3_1;
	}

	public void setStemi_1_1_3_1(String stemi_1_1_3_1) {
		this.stemi_1_1_3_1 = stemi_1_1_3_1;
	}
	
	@Length(min=0, max=32, message="是否有P2Y12受体拮抗剂禁忌证长度不能超过 32 个字符")
	public String getStemi_1_2_1() {
		return stemi_1_2_1;
	}

	public void setStemi_1_2_1(String stemi_1_2_1) {
		this.stemi_1_2_1 = stemi_1_2_1;
	}
	
	@Length(min=0, max=32, message="P2Y12受体拮抗剂禁忌证长度不能超过 32 个字符")
	public String getStemi_1_2_2() {
		return stemi_1_2_2;
	}

	public void setStemi_1_2_2(String stemi_1_2_2) {
		this.stemi_1_2_2 = stemi_1_2_2;
	}
	
	@Length(min=0, max=32, message="其他P2Y12受体拮抗剂禁忌证填写长度不能超过 32 个字符")
	public String getStemi_1_2_2_1() {
		return stemi_1_2_2_1;
	}

	public void setStemi_1_2_2_1(String stemi_1_2_2_1) {
		this.stemi_1_2_2_1 = stemi_1_2_2_1;
	}
	
	@Length(min=0, max=32, message="首剂给予双联抗血小板药负荷剂量长度不能超过 32 个字符")
	public String getStemi_1_2_3() {
		return stemi_1_2_3;
	}

	public void setStemi_1_2_3(String stemi_1_2_3) {
		this.stemi_1_2_3 = stemi_1_2_3;
	}
	
	@Length(min=0, max=32, message="其他抗血小板药物填写长度不能超过 32 个字符")
	public String getStemi_1_2_3_1() {
		return stemi_1_2_3_1;
	}

	public void setStemi_1_2_3_1(String stemi_1_2_3_1) {
		this.stemi_1_2_3_1 = stemi_1_2_3_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi_1_2_4_1() {
		return stemi_1_2_4_1;
	}

	public void setStemi_1_2_4_1(Date stemi_1_2_4_1) {
		this.stemi_1_2_4_1 = stemi_1_2_4_1;
	}
	
	@Length(min=0, max=32, message="是否实施首次心脏标志物检测长度不能超过 32 个字符")
	public String getStemi_1_3_1_1() {
		return stemi_1_3_1_1;
	}

	public void setStemi_1_3_1_1(String stemi_1_3_1_1) {
		this.stemi_1_3_1_1 = stemi_1_3_1_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi_1_3_1_2_1() {
		return stemi_1_3_1_2_1;
	}

	public void setStemi_1_3_1_2_1(Date stemi_1_3_1_2_1) {
		this.stemi_1_3_1_2_1 = stemi_1_3_1_2_1;
	}
	
	@Length(min=0, max=32, message="首次心脏标志物检测选项和数值长度不能超过 32 个字符")
	public String getStemi_1_3_2() {
		return stemi_1_3_2;
	}

	public void setStemi_1_3_2(String stemi_1_3_2) {
		this.stemi_1_3_2 = stemi_1_3_2;
	}
	
	@Length(min=0, max=32, message="肌钙蛋白T检测选项长度不能超过 32 个字符")
	public String getStemi_1_4_1_1() {
		return stemi_1_4_1_1;
	}

	public void setStemi_1_4_1_1(String stemi_1_4_1_1) {
		this.stemi_1_4_1_1 = stemi_1_4_1_1;
	}
	
	public Long getStemi_1_3_2_1() {
		return stemi_1_3_2_1;
	}

	public void setStemi_1_3_2_1(Long stemi_1_3_2_1) {
		this.stemi_1_3_2_1 = stemi_1_3_2_1;
	}
	
	@Length(min=0, max=32, message="肌钙蛋白T定性检测选择长度不能超过 32 个字符")
	public String getStemi_1_4_1_2() {
		return stemi_1_4_1_2;
	}

	public void setStemi_1_4_1_2(String stemi_1_4_1_2) {
		this.stemi_1_4_1_2 = stemi_1_4_1_2;
	}
	
	@Length(min=0, max=32, message="肌钙蛋白I检测选项长度不能超过 32 个字符")
	public String getStemi_1_4_2_1() {
		return stemi_1_4_2_1;
	}

	public void setStemi_1_4_2_1(String stemi_1_4_2_1) {
		this.stemi_1_4_2_1 = stemi_1_4_2_1;
	}
	
	public Long getStemi_1_3_2_2() {
		return stemi_1_3_2_2;
	}

	public void setStemi_1_3_2_2(Long stemi_1_3_2_2) {
		this.stemi_1_3_2_2 = stemi_1_3_2_2;
	}
	
	@Length(min=0, max=32, message="肌钙蛋白I定性检测选择长度不能超过 32 个字符")
	public String getStemi_1_4_2_2() {
		return stemi_1_4_2_2;
	}

	public void setStemi_1_4_2_2(String stemi_1_4_2_2) {
		this.stemi_1_4_2_2 = stemi_1_4_2_2;
	}
	
	@Length(min=0, max=32, message="肌酸激酶同工酶检测选项长度不能超过 32 个字符")
	public String getStemi_1_4_3_1() {
		return stemi_1_4_3_1;
	}

	public void setStemi_1_4_3_1(String stemi_1_4_3_1) {
		this.stemi_1_4_3_1 = stemi_1_4_3_1;
	}
	
	public Long getStemi_1_3_2_3() {
		return stemi_1_3_2_3;
	}

	public void setStemi_1_3_2_3(Long stemi_1_3_2_3) {
		this.stemi_1_3_2_3 = stemi_1_3_2_3;
	}
	
	@Length(min=0, max=32, message="肌酸激酶同工酶定性检测选择长度不能超过 32 个字符")
	public String getStemi_1_4_3_2() {
		return stemi_1_4_3_2;
	}

	public void setStemi_1_4_3_2(String stemi_1_4_3_2) {
		this.stemi_1_4_3_2 = stemi_1_4_3_2;
	}
	
	@Length(min=0, max=32, message="心肌肌红蛋白检测选项长度不能超过 32 个字符")
	public String getStemi_1_4_4_1() {
		return stemi_1_4_4_1;
	}

	public void setStemi_1_4_4_1(String stemi_1_4_4_1) {
		this.stemi_1_4_4_1 = stemi_1_4_4_1;
	}
	
	public Long getStemi_1_3_2_4() {
		return stemi_1_3_2_4;
	}

	public void setStemi_1_3_2_4(Long stemi_1_3_2_4) {
		this.stemi_1_3_2_4 = stemi_1_3_2_4;
	}
	
	@Length(min=0, max=32, message="心肌肌红蛋白定性检测选择长度不能超过 32 个字符")
	public String getStemi_1_4_4_2() {
		return stemi_1_4_4_2;
	}

	public void setStemi_1_4_4_2(String stemi_1_4_4_2) {
		this.stemi_1_4_4_2 = stemi_1_4_4_2;
	}
	
	@Length(min=0, max=32, message="B型钠尿肽检测选项长度不能超过 32 个字符")
	public String getStemi_1_4_5_1() {
		return stemi_1_4_5_1;
	}

	public void setStemi_1_4_5_1(String stemi_1_4_5_1) {
		this.stemi_1_4_5_1 = stemi_1_4_5_1;
	}
	
	public Long getStemi_1_3_2_5() {
		return stemi_1_3_2_5;
	}

	public void setStemi_1_3_2_5(Long stemi_1_3_2_5) {
		this.stemi_1_3_2_5 = stemi_1_3_2_5;
	}
	
	@Length(min=0, max=32, message="B型钠尿肽定性检测选择长度不能超过 32 个字符")
	public String getStemi_1_4_5_2() {
		return stemi_1_4_5_2;
	}

	public void setStemi_1_4_5_2(String stemi_1_4_5_2) {
		this.stemi_1_4_5_2 = stemi_1_4_5_2;
	}
	
	@Length(min=0, max=32, message="N端B型钠尿肽前体检测选项长度不能超过 32 个字符")
	public String getStemi_1_4_6_1() {
		return stemi_1_4_6_1;
	}

	public void setStemi_1_4_6_1(String stemi_1_4_6_1) {
		this.stemi_1_4_6_1 = stemi_1_4_6_1;
	}
	
	public Long getStemi_1_3_2_6() {
		return stemi_1_3_2_6;
	}

	public void setStemi_1_3_2_6(Long stemi_1_3_2_6) {
		this.stemi_1_3_2_6 = stemi_1_3_2_6;
	}
	
	@Length(min=0, max=32, message="N端B型钠尿肽前体定性检测选择长度不能超过 32 个字符")
	public String getStemi_1_4_6_2() {
		return stemi_1_4_6_2;
	}

	public void setStemi_1_4_6_2(String stemi_1_4_6_2) {
		this.stemi_1_4_6_2 = stemi_1_4_6_2;
	}
	
	@Length(min=0, max=32, message="是否实施首次X线胸片检查长度不能超过 32 个字符")
	public String getStemi_2_1_1() {
		return stemi_2_1_1;
	}

	public void setStemi_2_1_1(String stemi_2_1_1) {
		this.stemi_2_1_1 = stemi_2_1_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi_2_1_2_1() {
		return stemi_2_1_2_1;
	}

	public void setStemi_2_1_2_1(Date stemi_2_1_2_1) {
		this.stemi_2_1_2_1 = stemi_2_1_2_1;
	}
	
	@Length(min=0, max=32, message="是否有肺淤血或肺水肿长度不能超过 32 个字符")
	public String getStemi_2_1_3() {
		return stemi_2_1_3;
	}

	public void setStemi_2_1_3(String stemi_2_1_3) {
		this.stemi_2_1_3 = stemi_2_1_3;
	}
	
	@Length(min=0, max=32, message="是否实施首次超声心动图长度不能超过 32 个字符")
	public String getStemi_2_2_1() {
		return stemi_2_2_1;
	}

	public void setStemi_2_2_1(String stemi_2_2_1) {
		this.stemi_2_2_1 = stemi_2_2_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi_2_2_2_1() {
		return stemi_2_2_2_1;
	}

	public void setStemi_2_2_2_1(Date stemi_2_2_2_1) {
		this.stemi_2_2_2_1 = stemi_2_2_2_1;
	}
	
	public Long getStemi_2_2_3_1() {
		return stemi_2_2_3_1;
	}

	public void setStemi_2_2_3_1(Long stemi_2_2_3_1) {
		this.stemi_2_2_3_1 = stemi_2_2_3_1;
	}
	
	public Long getStemi_2_2_3_3_1() {
		return stemi_2_2_3_3_1;
	}

	public void setStemi_2_2_3_3_1(Long stemi_2_2_3_3_1) {
		this.stemi_2_2_3_3_1 = stemi_2_2_3_3_1;
	}
	
	@Length(min=0, max=32, message="是否有左室室壁瘤长度不能超过 32 个字符")
	public String getStemi_2_2_3_4() {
		return stemi_2_2_3_4;
	}

	public void setStemi_2_2_3_4(String stemi_2_2_3_4) {
		this.stemi_2_2_3_4 = stemi_2_2_3_4;
	}
	
	@Length(min=0, max=32, message="是否实施GRACE危险评分评估长度不能超过 32 个字符")
	public String getStemi_2_3_1_1() {
		return stemi_2_3_1_1;
	}

	public void setStemi_2_3_1_1(String stemi_2_3_1_1) {
		this.stemi_2_3_1_1 = stemi_2_3_1_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi_2_3_1_2_1() {
		return stemi_2_3_1_2_1;
	}

	public void setStemi_2_3_1_2_1(Date stemi_2_3_1_2_1) {
		this.stemi_2_3_1_2_1 = stemi_2_3_1_2_1;
	}
	
	public Long getStemi_2_3_1_3_1() {
		return stemi_2_3_1_3_1;
	}

	public void setStemi_2_3_1_3_1(Long stemi_2_3_1_3_1) {
		this.stemi_2_3_1_3_1 = stemi_2_3_1_3_1;
	}
	
	@Length(min=0, max=32, message="GRACE危险评估分层的选择长度不能超过 32 个字符")
	public String getStemi_2_3_1_4() {
		return stemi_2_3_1_4;
	}

	public void setStemi_2_3_1_4(String stemi_2_3_1_4) {
		this.stemi_2_3_1_4 = stemi_2_3_1_4;
	}
	
	@Length(min=0, max=32, message="是否实施TIMI危险分层评估长度不能超过 32 个字符")
	public String getStemi_2_3_2_1() {
		return stemi_2_3_2_1;
	}

	public void setStemi_2_3_2_1(String stemi_2_3_2_1) {
		this.stemi_2_3_2_1 = stemi_2_3_2_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi_2_3_2_2_1() {
		return stemi_2_3_2_2_1;
	}

	public void setStemi_2_3_2_2_1(Date stemi_2_3_2_2_1) {
		this.stemi_2_3_2_2_1 = stemi_2_3_2_2_1;
	}
	
	public Long getStemi_2_3_2_3_1() {
		return stemi_2_3_2_3_1;
	}

	public void setStemi_2_3_2_3_1(Long stemi_2_3_2_3_1) {
		this.stemi_2_3_2_3_1 = stemi_2_3_2_3_1;
	}
	
	@Length(min=0, max=32, message="TIMI危险分层的选择长度不能超过 32 个字符")
	public String getStemi_2_3_2_4() {
		return stemi_2_3_2_4;
	}

	public void setStemi_2_3_2_4(String stemi_2_3_2_4) {
		this.stemi_2_3_2_4 = stemi_2_3_2_4;
	}
	
	@Length(min=0, max=32, message="是否实施CRUSADE出血风险评分长度不能超过 32 个字符")
	public String getStemi_2_3_3_1() {
		return stemi_2_3_3_1;
	}

	public void setStemi_2_3_3_1(String stemi_2_3_3_1) {
		this.stemi_2_3_3_1 = stemi_2_3_3_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi_2_3_3_2_1() {
		return stemi_2_3_3_2_1;
	}

	public void setStemi_2_3_3_2_1(Date stemi_2_3_3_2_1) {
		this.stemi_2_3_3_2_1 = stemi_2_3_3_2_1;
	}
	
	public Long getStemi_2_3_3_3_1() {
		return stemi_2_3_3_3_1;
	}

	public void setStemi_2_3_3_3_1(Long stemi_2_3_3_3_1) {
		this.stemi_2_3_3_3_1 = stemi_2_3_3_3_1;
	}
	
	@Length(min=0, max=32, message="CRUSADE出血风险评分分层的选择长度不能超过 32 个字符")
	public String getStemi_2_3_3_4() {
		return stemi_2_3_3_4;
	}

	public void setStemi_2_3_3_4(String stemi_2_3_3_4) {
		this.stemi_2_3_3_4 = stemi_2_3_3_4;
	}
	
	@Length(min=0, max=32, message="实施再灌注治疗的模式长度不能超过 32 个字符")
	public String getStemi_3_0_2() {
		return stemi_3_0_2;
	}

	public void setStemi_3_0_2(String stemi_3_0_2) {
		this.stemi_3_0_2 = stemi_3_0_2;
	}
	
	@Length(min=0, max=32, message="STEMI溶栓适应证长度不能超过 32 个字符")
	public String getStemi_3_1_1() {
		return stemi_3_1_1;
	}

	public void setStemi_3_1_1(String stemi_3_1_1) {
		this.stemi_3_1_1 = stemi_3_1_1;
	}
	
	@Length(min=0, max=32, message="是否有溶栓治疗禁忌症长度不能超过 32 个字符")
	public String getStemi_3_1_2_1() {
		return stemi_3_1_2_1;
	}

	public void setStemi_3_1_2_1(String stemi_3_1_2_1) {
		this.stemi_3_1_2_1 = stemi_3_1_2_1;
	}
	
	@Length(min=0, max=32, message="绝对禁忌证选择长度不能超过 32 个字符")
	public String getStemi_3_1_2_2() {
		return stemi_3_1_2_2;
	}

	public void setStemi_3_1_2_2(String stemi_3_1_2_2) {
		this.stemi_3_1_2_2 = stemi_3_1_2_2;
	}
	
	@Length(min=0, max=32, message="相对禁忌证选择长度不能超过 32 个字符")
	public String getStemi_3_1_2_3() {
		return stemi_3_1_2_3;
	}

	public void setStemi_3_1_2_3(String stemi_3_1_2_3) {
		this.stemi_3_1_2_3 = stemi_3_1_2_3;
	}
	
	@Length(min=0, max=32, message="是否实施溶栓治疗长度不能超过 32 个字符")
	public String getStemi_3_1_3() {
		return stemi_3_1_3;
	}

	public void setStemi_3_1_3(String stemi_3_1_3) {
		this.stemi_3_1_3 = stemi_3_1_3;
	}
	
	@Length(min=0, max=32, message="溶栓药物选择长度不能超过 32 个字符")
	public String getStemi_3_1_4() {
		return stemi_3_1_4;
	}

	public void setStemi_3_1_4(String stemi_3_1_4) {
		this.stemi_3_1_4 = stemi_3_1_4;
	}
	
	@Length(min=0, max=32, message="其他溶栓药物长度不能超过 32 个字符")
	public String getStemi_3_1_4_1() {
		return stemi_3_1_4_1;
	}

	public void setStemi_3_1_4_1(String stemi_3_1_4_1) {
		this.stemi_3_1_4_1 = stemi_3_1_4_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi_3_1_5_1() {
		return stemi_3_1_5_1;
	}

	public void setStemi_3_1_5_1(Date stemi_3_1_5_1) {
		this.stemi_3_1_5_1 = stemi_3_1_5_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi_3_1_6_1() {
		return stemi_3_1_6_1;
	}

	public void setStemi_3_1_6_1(Date stemi_3_1_6_1) {
		this.stemi_3_1_6_1 = stemi_3_1_6_1;
	}
	
	public Long getStemi_3_1_7_1() {
		return stemi_3_1_7_1;
	}

	public void setStemi_3_1_7_1(Long stemi_3_1_7_1) {
		this.stemi_3_1_7_1 = stemi_3_1_7_1;
	}
	
	@Length(min=0, max=32, message="临床评估溶栓成功长度不能超过 32 个字符")
	public String getStemi_3_1_8() {
		return stemi_3_1_8;
	}

	public void setStemi_3_1_8(String stemi_3_1_8) {
		this.stemi_3_1_8 = stemi_3_1_8;
	}
	
	@Length(min=0, max=32, message="溶栓治疗并发症的选择长度不能超过 32 个字符")
	public String getStemi_3_1_9() {
		return stemi_3_1_9;
	}

	public void setStemi_3_1_9(String stemi_3_1_9) {
		this.stemi_3_1_9 = stemi_3_1_9;
	}
	
	@Length(min=0, max=32, message="溶栓治疗延迟原因长度不能超过 32 个字符")
	public String getStemi_3_1_10() {
		return stemi_3_1_10;
	}

	public void setStemi_3_1_10(String stemi_3_1_10) {
		this.stemi_3_1_10 = stemi_3_1_10;
	}
	
	@Length(min=0, max=32, message="是否实施PCI治疗长度不能超过 32 个字符")
	public String getStemi_3_2_1() {
		return stemi_3_2_1;
	}

	public void setStemi_3_2_1(String stemi_3_2_1) {
		this.stemi_3_2_1 = stemi_3_2_1;
	}
	
	@Length(min=0, max=32, message="PCI适应证长度不能超过 32 个字符")
	public String getStemi_3_2_2_1_3() {
		return stemi_3_2_2_1_3;
	}

	public void setStemi_3_2_2_1_3(String stemi_3_2_2_1_3) {
		this.stemi_3_2_2_1_3 = stemi_3_2_2_1_3;
	}
	
	@Length(min=0, max=32, message="直接PCI适应证长度不能超过 32 个字符")
	public String getStemi_3_2_2_1_1() {
		return stemi_3_2_2_1_1;
	}

	public void setStemi_3_2_2_1_1(String stemi_3_2_2_1_1) {
		this.stemi_3_2_2_1_1 = stemi_3_2_2_1_1;
	}
	
	@Length(min=0, max=32, message="直接PCI适应证填写长度不能超过 32 个字符")
	public String getStemi_3_2_2_1_1_1() {
		return stemi_3_2_2_1_1_1;
	}

	public void setStemi_3_2_2_1_1_1(String stemi_3_2_2_1_1_1) {
		this.stemi_3_2_2_1_1_1 = stemi_3_2_2_1_1_1;
	}
	
	@Length(min=0, max=32, message="溶栓后PCI适应证长度不能超过 32 个字符")
	public String getStemi_3_2_2_1_2() {
		return stemi_3_2_2_1_2;
	}

	public void setStemi_3_2_2_1_2(String stemi_3_2_2_1_2) {
		this.stemi_3_2_2_1_2 = stemi_3_2_2_1_2;
	}
	
	@Length(min=0, max=32, message="是否有PCI禁忌证长度不能超过 32 个字符")
	public String getStemi_3_2_2() {
		return stemi_3_2_2;
	}

	public void setStemi_3_2_2(String stemi_3_2_2) {
		this.stemi_3_2_2 = stemi_3_2_2;
	}
	
	@Length(min=0, max=32, message="PCI禁忌证选择长度不能超过 32 个字符")
	public String getStemi_3_2_2_1() {
		return stemi_3_2_2_1;
	}

	public void setStemi_3_2_2_1(String stemi_3_2_2_1) {
		this.stemi_3_2_2_1 = stemi_3_2_2_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi_3_2_2_2_1() {
		return stemi_3_2_2_2_1;
	}

	public void setStemi_3_2_2_2_1(Date stemi_3_2_2_2_1) {
		this.stemi_3_2_2_2_1 = stemi_3_2_2_2_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi_3_2_2_3_1() {
		return stemi_3_2_2_3_1;
	}

	public void setStemi_3_2_2_3_1(Date stemi_3_2_2_3_1) {
		this.stemi_3_2_2_3_1 = stemi_3_2_2_3_1;
	}
	
	@Length(min=0, max=32, message="确诊STEMI至PCI导丝通过梗死相关动脉长度不能超过 32 个字符")
	public String getStemi_3_2_2_4_1() {
		return stemi_3_2_2_4_1;
	}

	public void setStemi_3_2_2_4_1(String stemi_3_2_2_4_1) {
		this.stemi_3_2_2_4_1 = stemi_3_2_2_4_1;
	}
	
	@Length(min=0, max=32, message="治疗延迟原因选择长度不能超过 32 个字符")
	public String getStemi_3_2_2_5() {
		return stemi_3_2_2_5;
	}

	public void setStemi_3_2_2_5(String stemi_3_2_2_5) {
		this.stemi_3_2_2_5 = stemi_3_2_2_5;
	}
	
	@Length(min=0, max=32, message="主要病变血管长度不能超过 32 个字符")
	public String getStemi_3_2_3_1() {
		return stemi_3_2_3_1;
	}

	public void setStemi_3_2_3_1(String stemi_3_2_3_1) {
		this.stemi_3_2_3_1 = stemi_3_2_3_1;
	}
	
	@Length(min=0, max=32, message="LAD-冠状动脉狭窄程度分级长度不能超过 32 个字符")
	public String getStemi_3_2_3_2_1() {
		return stemi_3_2_3_2_1;
	}

	public void setStemi_3_2_3_2_1(String stemi_3_2_3_2_1) {
		this.stemi_3_2_3_2_1 = stemi_3_2_3_2_1;
	}
	
	@Length(min=0, max=32, message="LAD-术前主要靶血管TIMI血流分级的选择长度不能超过 32 个字符")
	public String getStemi_3_2_3_2_5() {
		return stemi_3_2_3_2_5;
	}

	public void setStemi_3_2_3_2_5(String stemi_3_2_3_2_5) {
		this.stemi_3_2_3_2_5 = stemi_3_2_3_2_5;
	}
	
	@Length(min=0, max=32, message="LCX-冠状动脉狭窄程度分级长度不能超过 32 个字符")
	public String getStemi_3_2_3_2_2() {
		return stemi_3_2_3_2_2;
	}

	public void setStemi_3_2_3_2_2(String stemi_3_2_3_2_2) {
		this.stemi_3_2_3_2_2 = stemi_3_2_3_2_2;
	}
	
	@Length(min=0, max=32, message="LCX-术前主要靶血管TIMI血流分级的选择长度不能超过 32 个字符")
	public String getStemi_3_2_3_2_6() {
		return stemi_3_2_3_2_6;
	}

	public void setStemi_3_2_3_2_6(String stemi_3_2_3_2_6) {
		this.stemi_3_2_3_2_6 = stemi_3_2_3_2_6;
	}
	
	@Length(min=0, max=32, message="RCA-冠状动脉狭窄程度分级长度不能超过 32 个字符")
	public String getStemi_3_2_3_2_3() {
		return stemi_3_2_3_2_3;
	}

	public void setStemi_3_2_3_2_3(String stemi_3_2_3_2_3) {
		this.stemi_3_2_3_2_3 = stemi_3_2_3_2_3;
	}
	
	@Length(min=0, max=32, message="RCA-术前主要靶血管TIMI血流分级的选择长度不能超过 32 个字符")
	public String getStemi_3_2_3_2_7() {
		return stemi_3_2_3_2_7;
	}

	public void setStemi_3_2_3_2_7(String stemi_3_2_3_2_7) {
		this.stemi_3_2_3_2_7 = stemi_3_2_3_2_7;
	}
	
	@Length(min=0, max=32, message="LM-冠状动脉狭窄程度分级长度不能超过 32 个字符")
	public String getStemi_3_2_3_2_4() {
		return stemi_3_2_3_2_4;
	}

	public void setStemi_3_2_3_2_4(String stemi_3_2_3_2_4) {
		this.stemi_3_2_3_2_4 = stemi_3_2_3_2_4;
	}
	
	@Length(min=0, max=32, message="LM-术前主要靶血管TIMI血流分级的选择长度不能超过 32 个字符")
	public String getStemi_3_2_3_2_8() {
		return stemi_3_2_3_2_8;
	}

	public void setStemi_3_2_3_2_8(String stemi_3_2_3_2_8) {
		this.stemi_3_2_3_2_8 = stemi_3_2_3_2_8;
	}
	
	@Length(min=0, max=32, message="PCI治疗主要靶血管长度不能超过 32 个字符")
	public String getStemi_3_2_3_3() {
		return stemi_3_2_3_3;
	}

	public void setStemi_3_2_3_3(String stemi_3_2_3_3) {
		this.stemi_3_2_3_3 = stemi_3_2_3_3;
	}
	
	@Length(min=0, max=32, message="LM-PCI术后即刻主要靶血管TIMI血流分级的选择长度不能超过 32 个字符")
	public String getStemi_3_2_3_3_1() {
		return stemi_3_2_3_3_1;
	}

	public void setStemi_3_2_3_3_1(String stemi_3_2_3_3_1) {
		this.stemi_3_2_3_3_1 = stemi_3_2_3_3_1;
	}
	
	@Length(min=0, max=32, message="LM-置入冠状动脉支架选择长度不能超过 32 个字符")
	public String getStemi_3_2_3_3_2() {
		return stemi_3_2_3_3_2;
	}

	public void setStemi_3_2_3_3_2(String stemi_3_2_3_3_2) {
		this.stemi_3_2_3_3_2 = stemi_3_2_3_3_2;
	}
	
	@Length(min=0, max=32, message="LM-置入冠状动脉支架填写长度不能超过 32 个字符")
	public String getStemi_3_2_3_3_2_1() {
		return stemi_3_2_3_3_2_1;
	}

	public void setStemi_3_2_3_3_2_1(String stemi_3_2_3_3_2_1) {
		this.stemi_3_2_3_3_2_1 = stemi_3_2_3_3_2_1;
	}
	
	@Length(min=0, max=32, message="LAD-PCI术后即刻主要靶血管TIMI血流分级的选择长度不能超过 32 个字符")
	public String getStemi_3_2_3_3_3() {
		return stemi_3_2_3_3_3;
	}

	public void setStemi_3_2_3_3_3(String stemi_3_2_3_3_3) {
		this.stemi_3_2_3_3_3 = stemi_3_2_3_3_3;
	}
	
	@Length(min=0, max=32, message="LAD-置入冠状动脉支架选择长度不能超过 32 个字符")
	public String getStemi_3_2_3_3_4() {
		return stemi_3_2_3_3_4;
	}

	public void setStemi_3_2_3_3_4(String stemi_3_2_3_3_4) {
		this.stemi_3_2_3_3_4 = stemi_3_2_3_3_4;
	}
	
	@Length(min=0, max=32, message="LAD-置入冠状动脉支架填写长度不能超过 32 个字符")
	public String getStemi_3_2_3_3_4_1() {
		return stemi_3_2_3_3_4_1;
	}

	public void setStemi_3_2_3_3_4_1(String stemi_3_2_3_3_4_1) {
		this.stemi_3_2_3_3_4_1 = stemi_3_2_3_3_4_1;
	}
	
	@Length(min=0, max=32, message="LCX-PCI术后即刻主要靶血管TIMI血流分级的选择长度不能超过 32 个字符")
	public String getStemi_3_2_3_3_5() {
		return stemi_3_2_3_3_5;
	}

	public void setStemi_3_2_3_3_5(String stemi_3_2_3_3_5) {
		this.stemi_3_2_3_3_5 = stemi_3_2_3_3_5;
	}
	
	@Length(min=0, max=32, message="LCX-置入冠状动脉支架选择长度不能超过 32 个字符")
	public String getStemi_3_2_3_3_6() {
		return stemi_3_2_3_3_6;
	}

	public void setStemi_3_2_3_3_6(String stemi_3_2_3_3_6) {
		this.stemi_3_2_3_3_6 = stemi_3_2_3_3_6;
	}
	
	@Length(min=0, max=32, message="LCX-置入冠状动脉支架填写长度不能超过 32 个字符")
	public String getStemi_3_2_3_3_6_1() {
		return stemi_3_2_3_3_6_1;
	}

	public void setStemi_3_2_3_3_6_1(String stemi_3_2_3_3_6_1) {
		this.stemi_3_2_3_3_6_1 = stemi_3_2_3_3_6_1;
	}
	
	@Length(min=0, max=32, message="LM-LAD-PCI术后即刻主要靶血管TIMI血流分级的选择长度不能超过 32 个字符")
	public String getStemi_3_2_3_3_7() {
		return stemi_3_2_3_3_7;
	}

	public void setStemi_3_2_3_3_7(String stemi_3_2_3_3_7) {
		this.stemi_3_2_3_3_7 = stemi_3_2_3_3_7;
	}
	
	@Length(min=0, max=32, message="LM-LAD-置入冠状动脉支架选择长度不能超过 32 个字符")
	public String getStemi_3_2_3_3_8() {
		return stemi_3_2_3_3_8;
	}

	public void setStemi_3_2_3_3_8(String stemi_3_2_3_3_8) {
		this.stemi_3_2_3_3_8 = stemi_3_2_3_3_8;
	}
	
	@Length(min=0, max=32, message="LM-LAD-置入冠状动脉支架填写长度不能超过 32 个字符")
	public String getStemi_3_2_3_3_8_1() {
		return stemi_3_2_3_3_8_1;
	}

	public void setStemi_3_2_3_3_8_1(String stemi_3_2_3_3_8_1) {
		this.stemi_3_2_3_3_8_1 = stemi_3_2_3_3_8_1;
	}
	
	@Length(min=0, max=32, message="LM-LCX-PCI术后即刻主要靶血管TIMI血流分级的选择长度不能超过 32 个字符")
	public String getStemi_3_2_3_9_1() {
		return stemi_3_2_3_9_1;
	}

	public void setStemi_3_2_3_9_1(String stemi_3_2_3_9_1) {
		this.stemi_3_2_3_9_1 = stemi_3_2_3_9_1;
	}
	
	@Length(min=0, max=32, message="LM-LCX-置入冠状动脉支架选择长度不能超过 32 个字符")
	public String getStemi_3_2_3_3_10() {
		return stemi_3_2_3_3_10;
	}

	public void setStemi_3_2_3_3_10(String stemi_3_2_3_3_10) {
		this.stemi_3_2_3_3_10 = stemi_3_2_3_3_10;
	}
	
	@Length(min=0, max=32, message="LM-LCX-置入冠状动脉支架填写长度不能超过 32 个字符")
	public String getStemi_3_2_3_3_10_1() {
		return stemi_3_2_3_3_10_1;
	}

	public void setStemi_3_2_3_3_10_1(String stemi_3_2_3_3_10_1) {
		this.stemi_3_2_3_3_10_1 = stemi_3_2_3_3_10_1;
	}
	
	@Length(min=0, max=32, message="RCA-PCI术后即刻主要靶血管TIMI血流分级的选择长度不能超过 32 个字符")
	public String getStemi_3_2_3_3_11() {
		return stemi_3_2_3_3_11;
	}

	public void setStemi_3_2_3_3_11(String stemi_3_2_3_3_11) {
		this.stemi_3_2_3_3_11 = stemi_3_2_3_3_11;
	}
	
	@Length(min=0, max=32, message="RCA-置入冠状动脉支架选择长度不能超过 32 个字符")
	public String getStemi_3_2_3_3_12() {
		return stemi_3_2_3_3_12;
	}

	public void setStemi_3_2_3_3_12(String stemi_3_2_3_3_12) {
		this.stemi_3_2_3_3_12 = stemi_3_2_3_3_12;
	}
	
	@Length(min=0, max=32, message="RCA-置入冠状动脉支架填写长度不能超过 32 个字符")
	public String getStemi_3_2_3_3_12_1() {
		return stemi_3_2_3_3_12_1;
	}

	public void setStemi_3_2_3_3_12_1(String stemi_3_2_3_3_12_1) {
		this.stemi_3_2_3_3_12_1 = stemi_3_2_3_3_12_1;
	}
	
	@Length(min=0, max=32, message="LM-中间支-PCI术后即刻主要靶血管TIMI血流分级的选择长度不能超过 32 个字符")
	public String getStemi_3_2_3_3_13() {
		return stemi_3_2_3_3_13;
	}

	public void setStemi_3_2_3_3_13(String stemi_3_2_3_3_13) {
		this.stemi_3_2_3_3_13 = stemi_3_2_3_3_13;
	}
	
	@Length(min=0, max=32, message="LM-中间支-置入冠状动脉支架选择长度不能超过 32 个字符")
	public String getStemi_3_2_3_3_14() {
		return stemi_3_2_3_3_14;
	}

	public void setStemi_3_2_3_3_14(String stemi_3_2_3_3_14) {
		this.stemi_3_2_3_3_14 = stemi_3_2_3_3_14;
	}
	
	@Length(min=0, max=32, message="LM-中间支-置入冠状动脉支架填写长度不能超过 32 个字符")
	public String getStemi_3_2_3_3_14_1() {
		return stemi_3_2_3_3_14_1;
	}

	public void setStemi_3_2_3_3_14_1(String stemi_3_2_3_3_14_1) {
		this.stemi_3_2_3_3_14_1 = stemi_3_2_3_3_14_1;
	}
	
	@Length(min=0, max=32, message="中间支-PCI术后即刻主要靶血管TIMI血流分级的选择长度不能超过 32 个字符")
	public String getStemi_3_2_3_15_1() {
		return stemi_3_2_3_15_1;
	}

	public void setStemi_3_2_3_15_1(String stemi_3_2_3_15_1) {
		this.stemi_3_2_3_15_1 = stemi_3_2_3_15_1;
	}
	
	@Length(min=0, max=32, message="中间支-置入冠状动脉支架选择长度不能超过 32 个字符")
	public String getStemi_3_2_3_3_16() {
		return stemi_3_2_3_3_16;
	}

	public void setStemi_3_2_3_3_16(String stemi_3_2_3_3_16) {
		this.stemi_3_2_3_3_16 = stemi_3_2_3_3_16;
	}
	
	@Length(min=0, max=32, message="中间支-置入冠状动脉支架填写长度不能超过 32 个字符")
	public String getStemi_3_2_3_3_16_1() {
		return stemi_3_2_3_3_16_1;
	}

	public void setStemi_3_2_3_3_16_1(String stemi_3_2_3_3_16_1) {
		this.stemi_3_2_3_3_16_1 = stemi_3_2_3_3_16_1;
	}
	
	@Length(min=0, max=32, message="ICD-9-CM-3编码与名称长度不能超过 32 个字符")
	public String getStemi_3_2_4_1() {
		return stemi_3_2_4_1;
	}

	public void setStemi_3_2_4_1(String stemi_3_2_4_1) {
		this.stemi_3_2_4_1 = stemi_3_2_4_1;
	}
	
	@Length(min=0, max=32, message="治疗血管的数量的选择长度不能超过 32 个字符")
	public String getStemi_3_2_4_2() {
		return stemi_3_2_4_2;
	}

	public void setStemi_3_2_4_2(String stemi_3_2_4_2) {
		this.stemi_3_2_4_2 = stemi_3_2_4_2;
	}
	
	@Length(min=0, max=32, message="置入血管支架的数量现在长度不能超过 32 个字符")
	public String getStemi_3_2_4_3() {
		return stemi_3_2_4_3;
	}

	public void setStemi_3_2_4_3(String stemi_3_2_4_3) {
		this.stemi_3_2_4_3 = stemi_3_2_4_3;
	}
	
	@Length(min=0, max=32, message="心脏团队讨论决策模式的选择长度不能超过 32 个字符")
	public String getStemi_3_2_4_4() {
		return stemi_3_2_4_4;
	}

	public void setStemi_3_2_4_4(String stemi_3_2_4_4) {
		this.stemi_3_2_4_4 = stemi_3_2_4_4;
	}
	
	@Length(min=0, max=32, message="近期主要并发症的选择长度不能超过 32 个字符")
	public String getStemi_3_2_5_1() {
		return stemi_3_2_5_1;
	}

	public void setStemi_3_2_5_1(String stemi_3_2_5_1) {
		this.stemi_3_2_5_1 = stemi_3_2_5_1;
	}
	
	@Length(min=0, max=32, message="其他近期主要并发症长度不能超过 32 个字符")
	public String getStemi_3_2_5_1_1() {
		return stemi_3_2_5_1_1;
	}

	public void setStemi_3_2_5_1_1(String stemi_3_2_5_1_1) {
		this.stemi_3_2_5_1_1 = stemi_3_2_5_1_1;
	}
	
	@Length(min=0, max=32, message="近期并发症治疗主要措施的选择长度不能超过 32 个字符")
	public String getStemi_3_2_5_2() {
		return stemi_3_2_5_2;
	}

	public void setStemi_3_2_5_2(String stemi_3_2_5_2) {
		this.stemi_3_2_5_2 = stemi_3_2_5_2;
	}
	
	@Length(min=0, max=32, message="其他近期并发症治疗主要措施长度不能超过 32 个字符")
	public String getStemi_3_2_5_2_1() {
		return stemi_3_2_5_2_1;
	}

	public void setStemi_3_2_5_2_1(String stemi_3_2_5_2_1) {
		this.stemi_3_2_5_2_1 = stemi_3_2_5_2_1;
	}
	
	@Length(min=0, max=32, message="是否实施CathPCI风险评估长度不能超过 32 个字符")
	public String getStemi_3_2_6_1() {
		return stemi_3_2_6_1;
	}

	public void setStemi_3_2_6_1(String stemi_3_2_6_1) {
		this.stemi_3_2_6_1 = stemi_3_2_6_1;
	}
	
	public Long getStemi_3_2_6_2_1_1() {
		return stemi_3_2_6_2_1_1;
	}

	public void setStemi_3_2_6_2_1_1(Long stemi_3_2_6_2_1_1) {
		this.stemi_3_2_6_2_1_1 = stemi_3_2_6_2_1_1;
	}
	
	public Long getStemi_3_2_6_2_2() {
		return stemi_3_2_6_2_2;
	}

	public void setStemi_3_2_6_2_2(Long stemi_3_2_6_2_2) {
		this.stemi_3_2_6_2_2 = stemi_3_2_6_2_2;
	}
	
	@Length(min=0, max=32, message="是否实施围术期抗凝治疗长度不能超过 32 个字符")
	public String getStemi_3_2_7_1() {
		return stemi_3_2_7_1;
	}

	public void setStemi_3_2_7_1(String stemi_3_2_7_1) {
		this.stemi_3_2_7_1 = stemi_3_2_7_1;
	}
	
	@Length(min=0, max=32, message="肠外抗凝药物选择长度不能超过 32 个字符")
	public String getStemi_3_2_7_2() {
		return stemi_3_2_7_2;
	}

	public void setStemi_3_2_7_2(String stemi_3_2_7_2) {
		this.stemi_3_2_7_2 = stemi_3_2_7_2;
	}
	
	@Length(min=0, max=32, message="其他肠外抗凝药物长度不能超过 32 个字符")
	public String getStemi_3_2_7_3() {
		return stemi_3_2_7_3;
	}

	public void setStemi_3_2_7_3(String stemi_3_2_7_3) {
		this.stemi_3_2_7_3 = stemi_3_2_7_3;
	}
	
	@Length(min=0, max=32, message="长度不能超过 32 个字符")
	public String getStemi_3_3_0() {
		return stemi_3_3_0;
	}

	public void setStemi_3_3_0(String stemi_3_3_0) {
		this.stemi_3_3_0 = stemi_3_3_0;
	}
	
	@Length(min=0, max=32, message="医院自身原因长度不能超过 32 个字符")
	public String getStemi_3_3_1_1() {
		return stemi_3_3_1_1;
	}

	public void setStemi_3_3_1_1(String stemi_3_3_1_1) {
		this.stemi_3_3_1_1 = stemi_3_3_1_1;
	}
	
	@Length(min=0, max=32, message="其他医院自身原因长度不能超过 32 个字符")
	public String getStemi_3_3_1_1_1() {
		return stemi_3_3_1_1_1;
	}

	public void setStemi_3_3_1_1_1(String stemi_3_3_1_1_1) {
		this.stemi_3_3_1_1_1 = stemi_3_3_1_1_1;
	}
	
	@Length(min=0, max=32, message="患者自身原因转院长度不能超过 32 个字符")
	public String getStemi_3_3_1_2() {
		return stemi_3_3_1_2;
	}

	public void setStemi_3_3_1_2(String stemi_3_3_1_2) {
		this.stemi_3_3_1_2 = stemi_3_3_1_2;
	}
	
	@Length(min=0, max=32, message="其他患者自身原因长度不能超过 32 个字符")
	public String getStemi_3_3_1_2_1() {
		return stemi_3_3_1_2_1;
	}

	public void setStemi_3_3_1_2_1(String stemi_3_3_1_2_1) {
		this.stemi_3_3_1_2_1 = stemi_3_3_1_2_1;
	}
	
	@Length(min=0, max=32, message="转院类型及适应症长度不能超过 32 个字符")
	public String getStemi_3_3_2() {
		return stemi_3_3_2;
	}

	public void setStemi_3_3_2(String stemi_3_3_2) {
		this.stemi_3_3_2 = stemi_3_3_2;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi_3_3_3_1() {
		return stemi_3_3_3_1;
	}

	public void setStemi_3_3_3_1(Date stemi_3_3_3_1) {
		this.stemi_3_3_3_1 = stemi_3_3_3_1;
	}
	
	public Long getStemi_3_3_4_1() {
		return stemi_3_3_4_1;
	}

	public void setStemi_3_3_4_1(Long stemi_3_3_4_1) {
		this.stemi_3_3_4_1 = stemi_3_3_4_1;
	}
	
	@Length(min=0, max=32, message="医院是否具备接受外院“转院PCI”患者的能力长度不能超过 32 个字符")
	public String getStemi_3_4() {
		return stemi_3_4;
	}

	public void setStemi_3_4(String stemi_3_4) {
		this.stemi_3_4 = stemi_3_4;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi_3_4_1_1() {
		return stemi_3_4_1_1;
	}

	public void setStemi_3_4_1_1(Date stemi_3_4_1_1) {
		this.stemi_3_4_1_1 = stemi_3_4_1_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi_3_4_2_1() {
		return stemi_3_4_2_1;
	}

	public void setStemi_3_4_2_1(Date stemi_3_4_2_1) {
		this.stemi_3_4_2_1 = stemi_3_4_2_1;
	}
	
	public Long getStemi_3_4_3_1() {
		return stemi_3_4_3_1;
	}

	public void setStemi_3_4_3_1(Long stemi_3_4_3_1) {
		this.stemi_3_4_3_1 = stemi_3_4_3_1;
	}
	
	@Length(min=0, max=32, message="治疗延迟原因选择长度不能超过 32 个字符")
	public String getStemi_3_4_4() {
		return stemi_3_4_4;
	}

	public void setStemi_3_4_4(String stemi_3_4_4) {
		this.stemi_3_4_4 = stemi_3_4_4;
	}
	
	@Length(min=0, max=32, message="是否有β-受体阻滞剂禁忌证长度不能超过 32 个字符")
	public String getStemi_4_1_1() {
		return stemi_4_1_1;
	}

	public void setStemi_4_1_1(String stemi_4_1_1) {
		this.stemi_4_1_1 = stemi_4_1_1;
	}
	
	@Length(min=0, max=32, message="β-受体阻滞剂禁忌症长度不能超过 32 个字符")
	public String getStemi_4_1_2_1() {
		return stemi_4_1_2_1;
	}

	public void setStemi_4_1_2_1(String stemi_4_1_2_1) {
		this.stemi_4_1_2_1 = stemi_4_1_2_1;
	}
	
	@Length(min=0, max=32, message="其他β-受体阻滞剂禁忌症长度不能超过 32 个字符")
	public String getStemi_4_1_2_1_1() {
		return stemi_4_1_2_1_1;
	}

	public void setStemi_4_1_2_1_1(String stemi_4_1_2_1_1) {
		this.stemi_4_1_2_1_1 = stemi_4_1_2_1_1;
	}
	
	@Length(min=0, max=32, message="β-受体阻滞剂相对禁忌症长度不能超过 32 个字符")
	public String getStemi_4_1_2_2() {
		return stemi_4_1_2_2;
	}

	public void setStemi_4_1_2_2(String stemi_4_1_2_2) {
		this.stemi_4_1_2_2 = stemi_4_1_2_2;
	}
	
	@Length(min=0, max=32, message="其他β-受体阻滞剂相对禁忌症长度不能超过 32 个字符")
	public String getStemi_4_1_2_2_1() {
		return stemi_4_1_2_2_1;
	}

	public void setStemi_4_1_2_2_1(String stemi_4_1_2_2_1) {
		this.stemi_4_1_2_2_1 = stemi_4_1_2_2_1;
	}
	
	@Length(min=0, max=32, message="使用首剂β-受体阻滞剂长度不能超过 32 个字符")
	public String getStemi_4_2() {
		return stemi_4_2;
	}

	public void setStemi_4_2(String stemi_4_2) {
		this.stemi_4_2 = stemi_4_2;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi_4_3_1() {
		return stemi_4_3_1;
	}

	public void setStemi_4_3_1(Date stemi_4_3_1) {
		this.stemi_4_3_1 = stemi_4_3_1;
	}
	
	@Length(min=0, max=32, message="双联抗血小板药物是否有用药长期医嘱长度不能超过 32 个字符")
	public String getStemi_5_1_1() {
		return stemi_5_1_1;
	}

	public void setStemi_5_1_1(String stemi_5_1_1) {
		this.stemi_5_1_1 = stemi_5_1_1;
	}
	
	@Length(min=0, max=32, message="双联抗血小板药物品名的选择长度不能超过 32 个字符")
	public String getStemi_5_1_2() {
		return stemi_5_1_2;
	}

	public void setStemi_5_1_2(String stemi_5_1_2) {
		this.stemi_5_1_2 = stemi_5_1_2;
	}
	
	@Length(min=0, max=32, message="双联抗血小板药物品名填写长度不能超过 32 个字符")
	public String getStemi_5_1_2_1() {
		return stemi_5_1_2_1;
	}

	public void setStemi_5_1_2_1(String stemi_5_1_2_1) {
		this.stemi_5_1_2_1 = stemi_5_1_2_1;
	}
	
	@Length(min=0, max=32, message="β阻滞剂是否有用药长期医嘱长度不能超过 32 个字符")
	public String getStemi_5_2_1() {
		return stemi_5_2_1;
	}

	public void setStemi_5_2_1(String stemi_5_2_1) {
		this.stemi_5_2_1 = stemi_5_2_1;
	}
	
	@Length(min=0, max=32, message="长期医嘱中使用β-受体阻滞剂品名的选择长度不能超过 32 个字符")
	public String getStemi_5_2_2() {
		return stemi_5_2_2;
	}

	public void setStemi_5_2_2(String stemi_5_2_2) {
		this.stemi_5_2_2 = stemi_5_2_2;
	}
	
	@Length(min=0, max=32, message="是否有ACEI抑制剂/ARB类药物禁忌症长度不能超过 32 个字符")
	public String getStemi_5_3_1() {
		return stemi_5_3_1;
	}

	public void setStemi_5_3_1(String stemi_5_3_1) {
		this.stemi_5_3_1 = stemi_5_3_1;
	}
	
	@Length(min=0, max=32, message="ACE抑制剂/ARB类药物禁忌症的选择长度不能超过 32 个字符")
	public String getStemi_5_3_2() {
		return stemi_5_3_2;
	}

	public void setStemi_5_3_2(String stemi_5_3_2) {
		this.stemi_5_3_2 = stemi_5_3_2;
	}
	
	@Length(min=0, max=32, message="是否有ACEI抑制剂/ARB类药物长期医嘱长度不能超过 32 个字符")
	public String getStemi_5_3_3() {
		return stemi_5_3_3;
	}

	public void setStemi_5_3_3(String stemi_5_3_3) {
		this.stemi_5_3_3 = stemi_5_3_3;
	}
	
	@Length(min=0, max=32, message="使用ACE抑制剂药物名称的选择长度不能超过 32 个字符")
	public String getStemi_5_3_4_a() {
		return stemi_5_3_4_a;
	}

	public void setStemi_5_3_4_a(String stemi_5_3_4_a) {
		this.stemi_5_3_4_a = stemi_5_3_4_a;
	}
	
	@Length(min=0, max=32, message="其他ACE抑制剂药物长度不能超过 32 个字符")
	public String getStemi_5_3_4_a_1() {
		return stemi_5_3_4_a_1;
	}

	public void setStemi_5_3_4_a_1(String stemi_5_3_4_a_1) {
		this.stemi_5_3_4_a_1 = stemi_5_3_4_a_1;
	}
	
	@Length(min=0, max=32, message="使用ARB类药物名称的选择长度不能超过 32 个字符")
	public String getStemi_5_3_4_b() {
		return stemi_5_3_4_b;
	}

	public void setStemi_5_3_4_b(String stemi_5_3_4_b) {
		this.stemi_5_3_4_b = stemi_5_3_4_b;
	}
	
	@Length(min=0, max=32, message="其他ARB类药物长度不能超过 32 个字符")
	public String getStemi_5_3_4_b_1() {
		return stemi_5_3_4_b_1;
	}

	public void setStemi_5_3_4_b_1(String stemi_5_3_4_b_1) {
		this.stemi_5_3_4_b_1 = stemi_5_3_4_b_1;
	}
	
	@Length(min=0, max=32, message="是否有他汀类药禁忌证长度不能超过 32 个字符")
	public String getStemi_5_4_1() {
		return stemi_5_4_1;
	}

	public void setStemi_5_4_1(String stemi_5_4_1) {
		this.stemi_5_4_1 = stemi_5_4_1;
	}
	
	@Length(min=0, max=32, message="他汀类药物禁忌证的选择长度不能超过 32 个字符")
	public String getStemi_5_4_2() {
		return stemi_5_4_2;
	}

	public void setStemi_5_4_2(String stemi_5_4_2) {
		this.stemi_5_4_2 = stemi_5_4_2;
	}
	
	@Length(min=0, max=32, message="是否有用药长期医嘱长度不能超过 32 个字符")
	public String getStemi_5_4_3() {
		return stemi_5_4_3;
	}

	public void setStemi_5_4_3(String stemi_5_4_3) {
		this.stemi_5_4_3 = stemi_5_4_3;
	}
	
	@Length(min=0, max=32, message="给予他汀类药物名称的选择长度不能超过 32 个字符")
	public String getStemi_5_4_4() {
		return stemi_5_4_4;
	}

	public void setStemi_5_4_4(String stemi_5_4_4) {
		this.stemi_5_4_4 = stemi_5_4_4;
	}
	
	@Length(min=0, max=32, message="其他其他降脂药物长度不能超过 32 个字符")
	public String getStemi_5_4_4_1() {
		return stemi_5_4_4_1;
	}

	public void setStemi_5_4_4_1(String stemi_5_4_4_1) {
		this.stemi_5_4_4_1 = stemi_5_4_4_1;
	}
	
	@Length(min=0, max=32, message="是否有出院带药医嘱-抗血小板药物长度不能超过 32 个字符")
	public String getStemi_6_1() {
		return stemi_6_1;
	}

	public void setStemi_6_1(String stemi_6_1) {
		this.stemi_6_1 = stemi_6_1;
	}
	
	@Length(min=0, max=32, message="双联抗血小板药物品名的选择长度不能超过 32 个字符")
	public String getStemi_6_1_2() {
		return stemi_6_1_2;
	}

	public void setStemi_6_1_2(String stemi_6_1_2) {
		this.stemi_6_1_2 = stemi_6_1_2;
	}
	
	@Length(min=0, max=32, message="其他双联抗血小板药物品长度不能超过 32 个字符")
	public String getStemi_6_1_2_1() {
		return stemi_6_1_2_1;
	}

	public void setStemi_6_1_2_1(String stemi_6_1_2_1) {
		this.stemi_6_1_2_1 = stemi_6_1_2_1;
	}
	
	@Length(min=0, max=32, message="是否有β阻滞剂出院带药医嘱长度不能超过 32 个字符")
	public String getStemi_6_2() {
		return stemi_6_2;
	}

	public void setStemi_6_2(String stemi_6_2) {
		this.stemi_6_2 = stemi_6_2;
	}
	
	@Length(min=0, max=32, message="使用β-受体阻滞剂品名的选择长度不能超过 32 个字符")
	public String getStemi_6_2_2() {
		return stemi_6_2_2;
	}

	public void setStemi_6_2_2(String stemi_6_2_2) {
		this.stemi_6_2_2 = stemi_6_2_2;
	}
	
	@Length(min=0, max=32, message="是否有出院带药医嘱-ACEI抑制剂/ARB类药物医嘱长度不能超过 32 个字符")
	public String getStemi_6_3() {
		return stemi_6_3;
	}

	public void setStemi_6_3(String stemi_6_3) {
		this.stemi_6_3 = stemi_6_3;
	}
	
	@Length(min=0, max=32, message="使用ACEI抑制剂或者ARB类药物长度不能超过 32 个字符")
	public String getStemi_6_3_2() {
		return stemi_6_3_2;
	}

	public void setStemi_6_3_2(String stemi_6_3_2) {
		this.stemi_6_3_2 = stemi_6_3_2;
	}
	
	@Length(min=0, max=32, message="使用ACE抑制剂药物名称的选择长度不能超过 32 个字符")
	public String getStemi_6_3_2_a() {
		return stemi_6_3_2_a;
	}

	public void setStemi_6_3_2_a(String stemi_6_3_2_a) {
		this.stemi_6_3_2_a = stemi_6_3_2_a;
	}
	
	@Length(min=0, max=32, message="其他ACE抑制剂药物长度不能超过 32 个字符")
	public String getStemi_6_3_2_a_1() {
		return stemi_6_3_2_a_1;
	}

	public void setStemi_6_3_2_a_1(String stemi_6_3_2_a_1) {
		this.stemi_6_3_2_a_1 = stemi_6_3_2_a_1;
	}
	
	@Length(min=0, max=32, message="使用ARB类药物名称的选择长度不能超过 32 个字符")
	public String getStemi_6_3_2_b() {
		return stemi_6_3_2_b;
	}

	public void setStemi_6_3_2_b(String stemi_6_3_2_b) {
		this.stemi_6_3_2_b = stemi_6_3_2_b;
	}
	
	@Length(min=0, max=32, message="其他ARB类药物长度不能超过 32 个字符")
	public String getStemi_6_3_2_b_1() {
		return stemi_6_3_2_b_1;
	}

	public void setStemi_6_3_2_b_1(String stemi_6_3_2_b_1) {
		this.stemi_6_3_2_b_1 = stemi_6_3_2_b_1;
	}
	
	@Length(min=0, max=32, message="是否有出院带药医嘱-他汀类药物医嘱长度不能超过 32 个字符")
	public String getStemi_6_4() {
		return stemi_6_4;
	}

	public void setStemi_6_4(String stemi_6_4) {
		this.stemi_6_4 = stemi_6_4;
	}
	
	@Length(min=0, max=32, message="给予他汀类药物名称的选择长度不能超过 32 个字符")
	public String getStemi_6_4_2() {
		return stemi_6_4_2;
	}

	public void setStemi_6_4_2(String stemi_6_4_2) {
		this.stemi_6_4_2 = stemi_6_4_2;
	}
	
	@Length(min=0, max=32, message="其他降脂药物长度不能超过 32 个字符")
	public String getStemi_6_4_2_1() {
		return stemi_6_4_2_1;
	}

	public void setStemi_6_4_2_1(String stemi_6_4_2_1) {
		this.stemi_6_4_2_1 = stemi_6_4_2_1;
	}
	
	@Length(min=0, max=32, message="是否有醛固酮受体拮抗剂药物禁忌证长度不能超过 32 个字符")
	public String getStemi_6_5_1() {
		return stemi_6_5_1;
	}

	public void setStemi_6_5_1(String stemi_6_5_1) {
		this.stemi_6_5_1 = stemi_6_5_1;
	}
	
	@Length(min=0, max=32, message="醛固酮受体拮抗剂药物禁忌证的选择长度不能超过 32 个字符")
	public String getStemi_6_5_2() {
		return stemi_6_5_2;
	}

	public void setStemi_6_5_2(String stemi_6_5_2) {
		this.stemi_6_5_2 = stemi_6_5_2;
	}
	
	@Length(min=0, max=32, message="醛固酮受体拮抗剂药物禁忌证填写长度不能超过 32 个字符")
	public String getStemi_6_5_2_1() {
		return stemi_6_5_2_1;
	}

	public void setStemi_6_5_2_1(String stemi_6_5_2_1) {
		this.stemi_6_5_2_1 = stemi_6_5_2_1;
	}
	
	@Length(min=0, max=32, message="是否有醛固酮受体拮抗剂药物适应证长度不能超过 32 个字符")
	public String getStemi_6_5_3() {
		return stemi_6_5_3;
	}

	public void setStemi_6_5_3(String stemi_6_5_3) {
		this.stemi_6_5_3 = stemi_6_5_3;
	}
	
	@Length(min=0, max=32, message="醛固酮受体拮抗剂药物适应证的选择长度不能超过 32 个字符")
	public String getStemi_6_5_4() {
		return stemi_6_5_4;
	}

	public void setStemi_6_5_4(String stemi_6_5_4) {
		this.stemi_6_5_4 = stemi_6_5_4;
	}
	
	@Length(min=0, max=32, message="是否有出院带药医嘱-醛固酮受体拮抗剂长度不能超过 32 个字符")
	public String getStemi_6_5_5() {
		return stemi_6_5_5;
	}

	public void setStemi_6_5_5(String stemi_6_5_5) {
		this.stemi_6_5_5 = stemi_6_5_5;
	}
	
	@Length(min=0, max=32, message="出院带药医嘱中使用醛固酮受体拮抗剂品名的选择长度不能超过 32 个字符")
	public String getStemi_6_5_6() {
		return stemi_6_5_6;
	}

	public void setStemi_6_5_6(String stemi_6_5_6) {
		this.stemi_6_5_6 = stemi_6_5_6;
	}
	
	@Length(min=0, max=32, message="其他醛固酮受体拮抗剂品名长度不能超过 32 个字符")
	public String getStemi_6_5_6_1() {
		return stemi_6_5_6_1;
	}

	public void setStemi_6_5_6_1(String stemi_6_5_6_1) {
		this.stemi_6_5_6_1 = stemi_6_5_6_1;
	}
	
	@Length(min=0, max=32, message="血脂评价时间长度不能超过 32 个字符")
	public String getStemi_7_1() {
		return stemi_7_1;
	}

	public void setStemi_7_1(String stemi_7_1) {
		this.stemi_7_1 = stemi_7_1;
	}
	
	@Length(min=0, max=32, message="血脂评价结果长度不能超过 32 个字符")
	public String getStemi_7_2() {
		return stemi_7_2;
	}

	public void setStemi_7_2(String stemi_7_2) {
		this.stemi_7_2 = stemi_7_2;
	}
	
	@Length(min=0, max=32, message="是否有他汀药物禁忌症长度不能超过 32 个字符")
	public String getStemi_7_3_1() {
		return stemi_7_3_1;
	}

	public void setStemi_7_3_1(String stemi_7_3_1) {
		this.stemi_7_3_1 = stemi_7_3_1;
	}
	
	@Length(min=0, max=32, message="他汀类药物禁忌证的选择长度不能超过 32 个字符")
	public String getStemi_7_3_2() {
		return stemi_7_3_2;
	}

	public void setStemi_7_3_2(String stemi_7_3_2) {
		this.stemi_7_3_2 = stemi_7_3_2;
	}
	
	@Length(min=0, max=32, message="是否有他汀类药物长期医嘱长度不能超过 32 个字符")
	public String getStemi_7_4() {
		return stemi_7_4;
	}

	public void setStemi_7_4(String stemi_7_4) {
		this.stemi_7_4 = stemi_7_4;
	}
	
	@Length(min=0, max=32, message="是否有他汀类药物出院带药医嘱长度不能超过 32 个字符")
	public String getStemi_7_5() {
		return stemi_7_5;
	}

	public void setStemi_7_5(String stemi_7_5) {
		this.stemi_7_5 = stemi_7_5;
	}
	
	@Length(min=0, max=32, message="吸烟史长度不能超过 32 个字符")
	public String getStemi_8_1_1() {
		return stemi_8_1_1;
	}

	public void setStemi_8_1_1(String stemi_8_1_1) {
		this.stemi_8_1_1 = stemi_8_1_1;
	}
	
	@Length(min=0, max=32, message="吸烟程度评估有记录长度不能超过 32 个字符")
	public String getStemi_8_1_2() {
		return stemi_8_1_2;
	}

	public void setStemi_8_1_2(String stemi_8_1_2) {
		this.stemi_8_1_2 = stemi_8_1_2;
	}
	
	@Length(min=0, max=32, message="接受戒烟的建议或者戒烟治疗有记录长度不能超过 32 个字符")
	public String getStemi_8_1_3() {
		return stemi_8_1_3;
	}

	public void setStemi_8_1_3(String stemi_8_1_3) {
		this.stemi_8_1_3 = stemi_8_1_3;
	}
	
	@Length(min=0, max=32, message="长度不能超过 32 个字符")
	public String getStemi_8_2_1() {
		return stemi_8_2_1;
	}

	public void setStemi_8_2_1(String stemi_8_2_1) {
		this.stemi_8_2_1 = stemi_8_2_1;
	}
	
	@Length(min=0, max=32, message="实施针对控制危险因素评估结果的教育长度不能超过 32 个字符")
	public String getStemi_8_2_2() {
		return stemi_8_2_2;
	}

	public void setStemi_8_2_2(String stemi_8_2_2) {
		this.stemi_8_2_2 = stemi_8_2_2;
	}
	
	@Length(min=0, max=32, message="二级预防长度不能超过 32 个字符")
	public String getStemi_8_3() {
		return stemi_8_3;
	}

	public void setStemi_8_3(String stemi_8_3) {
		this.stemi_8_3 = stemi_8_3;
	}
	
	@Length(min=0, max=32, message="交与患者“出院小结”的副本告知患者出院时风险因素长度不能超过 32 个字符")
	public String getStemi_8_4_1() {
		return stemi_8_4_1;
	}

	public void setStemi_8_4_1(String stemi_8_4_1) {
		this.stemi_8_4_1 = stemi_8_4_1;
	}
	
	@Length(min=0, max=32, message="出院带药长度不能超过 32 个字符")
	public String getStemi_8_4_2() {
		return stemi_8_4_2;
	}

	public void setStemi_8_4_2(String stemi_8_4_2) {
		this.stemi_8_4_2 = stemi_8_4_2;
	}
	
	@Length(min=0, max=32, message="告知发生紧急情况时求援救治途径长度不能超过 32 个字符")
	public String getStemi_8_4_3() {
		return stemi_8_4_3;
	}

	public void setStemi_8_4_3(String stemi_8_4_3) {
		this.stemi_8_4_3 = stemi_8_4_3;
	}
	
	@Length(min=0, max=32, message="出院时教育与随访长度不能超过 32 个字符")
	public String getStemi_8_4_4() {
		return stemi_8_4_4;
	}

	public void setStemi_8_4_4(String stemi_8_4_4) {
		this.stemi_8_4_4 = stemi_8_4_4;
	}
	
	@Length(min=0, max=32, message="告知何为风险因素与紧急情况长度不能超过 32 个字符")
	public String getStemi_8_4_5() {
		return stemi_8_4_5;
	}

	public void setStemi_8_4_5(String stemi_8_4_5) {
		this.stemi_8_4_5 = stemi_8_4_5;
	}
	
	@Length(min=0, max=32, message="出院时状态评估结果长度不能超过 32 个字符")
	public String getStemi_9_2_1() {
		return stemi_9_2_1;
	}

	public void setStemi_9_2_1(String stemi_9_2_1) {
		this.stemi_9_2_1 = stemi_9_2_1;
	}
	
	@Length(min=0, max=32, message="其他出院时状态填写长度不能超过 32 个字符")
	public String getStemi_9_2_1_1() {
		return stemi_9_2_1_1;
	}

	public void setStemi_9_2_1_1(String stemi_9_2_1_1) {
		this.stemi_9_2_1_1 = stemi_9_2_1_1;
	}
	
	@Length(min=0, max=32, message="末次GRACE危险评估是否有记录长度不能超过 32 个字符")
	public String getStemi_9_2_2_a_2() {
		return stemi_9_2_2_a_2;
	}

	public void setStemi_9_2_2_a_2(String stemi_9_2_2_a_2) {
		this.stemi_9_2_2_a_2 = stemi_9_2_2_a_2;
	}
	
	@Length(min=0, max=32, message="末次GRACE危险评估长度不能超过 32 个字符")
	public String getStemi_9_2_2_a_1_1() {
		return stemi_9_2_2_a_1_1;
	}

	public void setStemi_9_2_2_a_1_1(String stemi_9_2_2_a_1_1) {
		this.stemi_9_2_2_a_1_1 = stemi_9_2_2_a_1_1;
	}
	
	@Length(min=0, max=32, message="GRACE危险评估分层的选择长度不能超过 32 个字符")
	public String getStemi_9_2_2_a_3() {
		return stemi_9_2_2_a_3;
	}

	public void setStemi_9_2_2_a_3(String stemi_9_2_2_a_3) {
		this.stemi_9_2_2_a_3 = stemi_9_2_2_a_3;
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