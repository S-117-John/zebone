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
 * @version 2021-01-13
 */
@Table(name="quality_stemi", alias="a", columns={
		@Column(name="cm_0_1_1_1", attrName="cm0111", label="质控医师"),
		@Column(name="cm_0_1_1_2", attrName="cm0112", label="质控护士"),
		@Column(name="cm_0_1_1_3", attrName="cm0113", label="主治医师"),
		@Column(name="cm_0_1_1_4", attrName="cm0114", label="责任护士"),
		@Column(name="cm_0_1_1_5", attrName="cm0115", label="上报科室"),
		@Column(name="case_id", attrName="caseId", label="患者病案号"),
		@Column(name="cm_0_1_3_1", attrName="cm0131", label="主要诊断ICD-10四位亚目编码与名称"),
		@Column(name="cm_0_1_3_2", attrName="cm0132", label="主要诊断ICD-10六位临床扩展编码与名称"),
		@Column(name="cm_0_1_4_1", attrName="cm0141", label="主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称"),
		@Column(name="cm_0_1_4_2", attrName="cm0142", label="主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称"),
		@Column(name="cm_0_1_5", attrName="cm015", label="是否出院后31天内重复住院"),
		@Column(name="cm_0_2_1_1", attrName="cm0211", label="出生日期"),
		@Column(name="cm_0_2_1_2", attrName="cm0212", label="患者性别"),
		@Column(name="cm_0_2_1_3", attrName="cm0213", label="患者体重", comment="患者体重（kg）"),
		@Column(name="cm_0_2_1_5", attrName="cm0215", label="患者身高", comment="患者身高（cm）"),
		@Column(name="cm_0_2_2_1", attrName="cm0221", label="发病日期时间是否无法确定或无记录"),
		@Column(name="cm_0_2_2_2", attrName="cm0222", label="发病日期时间"),
		@Column(name="cm_0_2_3_2", attrName="cm0232", label="到达本院急诊或者门诊日期时间"),
		@Column(name="cm_0_2_4_1", attrName="cm0241", label="入院日期时间"),
		@Column(name="cm_0_2_4_2", attrName="cm0242", label="出院日期时间"),
		@Column(name="cm_0_2_5_1", attrName="cm0251", label="入住CCU日期时间"),
		@Column(name="cm_0_2_5_2", attrName="cm0252", label="离开CCU日期时间"),
		@Column(name="cm_0_3_1", attrName="cm031", label="费用支付方式"),
		@Column(name="cm_0_3_2", attrName="cm032", label="收入住院途径"),
		@Column(name="cm_0_3_3", attrName="cm033", label="到院交通工具"),
		@Column(name="stemi_0_4_6", attrName="stemi046", label="救护车类型"),
		@Column(name="stemi_0_4_1", attrName="stemi041", label="是否现场评估生命体征，施行急救"),
		@Column(name="stemi_0_4_2", attrName="stemi042", label="到达现场后10分钟内是否完成心电图检查"),
		@Column(name="stemi_0_4_3", attrName="stemi043", label="现场急救维持生命体征稳定措施选择"),
		@Column(name="stemi_0_4_4", attrName="stemi044", label="对持续胸痛＞15分钟和心电图ST段抬高，且无“阿斯匹林”禁忌症的患者用药"),
		@Column(name="stemi_0_4_5", attrName="stemi045", label="是否利用救护车中车载信息系统、微信、彩信等多种形式传输心电图等院前信息至目标医院"),
		@Column(name="stemi_0_4_7", attrName="stemi047", label="是否入院前在救护车上开始溶栓治疗"),
		@Column(name="stemi_1_1_4", attrName="stemi114", label="是否有症状和病史"),
		@Column(name="stemi_1_1_5", attrName="stemi115", label="症状和体征选择"),
		@Column(name="stemi_1_1_6", attrName="stemi116", label="是否实施首次采用Killip分级法评估心功能"),
		@Column(name="stemi_1_1_7", attrName="stemi117", label="Killip分级，症状及体征选择"),
		@Column(name="stemi_1_1_1", attrName="stemi111", label="是否实施首次心电图检查"),
		@Column(name="stemi_1_1_2_1", attrName="stemi1121", label="心电图检查结果确诊STEMI报告日期时间"),
		@Column(name="stemi_1_1_3", attrName="stemi113", label="心电图检查结果，具有STEMI特征性诊断标准的选择"),
		@Column(name="stemi_1_1_3_1", attrName="stemi1131", label="其他心电图检查结果填写"),
		@Column(name="stemi_1_2_1", attrName="stemi121", label="是否有P2Y12受体拮抗剂禁忌证"),
		@Column(name="stemi_1_2_2", attrName="stemi122", label="P2Y12受体拮抗剂禁忌证"),
		@Column(name="stemi_1_2_2_1", attrName="stemi1221", label="其他P2Y12受体拮抗剂禁忌证填写"),
		@Column(name="stemi_1_2_3", attrName="stemi123", label="首剂给予双联抗血小板药负荷剂量"),
		@Column(name="stemi_1_2_3_1", attrName="stemi1231", label="其他抗血小板药物填写"),
		@Column(name="stemi_1_2_4_1", attrName="stemi1241", label="用药日期时间"),
		@Column(name="stemi_1_3_1_1", attrName="stemi1311", label="是否实施首次心脏标志物检测"),
		@Column(name="stemi_1_3_1_2_1", attrName="stemi13121", label="首次心脏标志物检测结果报告日期时间"),
		@Column(name="stemi_1_3_2", attrName="stemi132", label="首次心脏标志物检测选项和数值"),
		@Column(name="stemi_1_4_1_1", attrName="stemi1411", label="肌钙蛋白T检测选项"),
		@Column(name="stemi_1_3_2_1", attrName="stemi1321", label="肌钙蛋白T检测值", comment="肌钙蛋白T检测值(ng/Ml)"),
		@Column(name="stemi_1_4_1_2", attrName="stemi1412", label="肌钙蛋白T定性检测选择"),
		@Column(name="stemi_1_4_2_1", attrName="stemi1421", label="肌钙蛋白I检测选项"),
		@Column(name="stemi_1_3_2_2", attrName="stemi1322", label="肌钙蛋白I检测值", comment="肌钙蛋白I检测值(ng/mL)"),
		@Column(name="stemi_1_4_2_2", attrName="stemi1422", label="肌钙蛋白I定性检测选择"),
		@Column(name="stemi_1_4_3_1", attrName="stemi1431", label="肌酸激酶同工酶检测选项"),
		@Column(name="stemi_1_3_2_3", attrName="stemi1323", label="肌酸激酶同工酶检测值", comment="肌酸激酶同工酶检测值(ng/mL)"),
		@Column(name="stemi_1_4_3_2", attrName="stemi1432", label="肌酸激酶同工酶定性检测选择"),
		@Column(name="stemi_1_4_4_1", attrName="stemi1441", label="心肌肌红蛋白检测选项"),
		@Column(name="stemi_1_3_2_4", attrName="stemi1324", label="心肌肌红蛋白检测值", comment="心肌肌红蛋白检测值(ng/mL)"),
		@Column(name="stemi_1_4_4_2", attrName="stemi1442", label="心肌肌红蛋白定性检测选择"),
		@Column(name="stemi_1_4_5_1", attrName="stemi1451", label="B型钠尿肽检测选项"),
		@Column(name="stemi_1_3_2_5", attrName="stemi1325", label="B型钠尿肽检测值", comment="B型钠尿肽检测值(ng/L)"),
		@Column(name="stemi_1_4_5_2", attrName="stemi1452", label="B型钠尿肽定性检测选择"),
		@Column(name="stemi_1_4_6_1", attrName="stemi1461", label="N端B型钠尿肽前体检测选项"),
		@Column(name="stemi_1_3_2_6", attrName="stemi1326", label="N端B型钠尿肽前体检测值", comment="N端B型钠尿肽前体检测值(ng/L)"),
		@Column(name="stemi_1_4_6_2", attrName="stemi1462", label="N端B型钠尿肽前体定性检测选择"),
		@Column(name="stemi_2_1_1", attrName="stemi211", label="是否实施首次X线胸片检查"),
		@Column(name="stemi_2_1_2_1", attrName="stemi2121", label="首次X线胸片检查报告日期时间"),
		@Column(name="stemi_2_1_3", attrName="stemi213", label="是否有肺淤血或肺水肿"),
		@Column(name="stemi_2_2_1", attrName="stemi221", label="是否实施首次超声心动图", comment="是否实施首次超声心动图(CDFA)检查"),
		@Column(name="stemi_2_2_2_1", attrName="stemi2221", label="报告日期时间"),
		@Column(name="stemi_2_2_3_1", attrName="stemi2231", label="左室射血分（LVEF）测量值", comment="左室射血分（LVEF）测量值(%)"),
		@Column(name="stemi_2_2_3_3_1", attrName="stemi22331", label="左室舒张末径（LVEDd）数值", comment="左室舒张末径（LVEDd）数值(mm)"),
		@Column(name="stemi_2_2_3_4", attrName="stemi2234", label="是否有左室室壁瘤"),
		@Column(name="stemi_2_3_1_1", attrName="stemi2311", label="是否实施GRACE危险评分评估"),
		@Column(name="stemi_2_3_1_2_1", attrName="stemi23121", label="评估日期时间"),
		@Column(name="stemi_2_3_1_3_1", attrName="stemi23131", label="实施首次GRACE危险评分值"),
		@Column(name="stemi_2_3_1_4", attrName="stemi2314", label="GRACE危险评估分层的选择"),
		@Column(name="stemi_2_3_2_1", attrName="stemi2321", label="是否实施TIMI危险分层评估"),
		@Column(name="stemi_2_3_2_2_1", attrName="stemi23221", label="评估日期时间"),
		@Column(name="stemi_2_3_2_3_1", attrName="stemi23231", label="实施首次TIMI危险分层分值"),
		@Column(name="stemi_2_3_2_4", attrName="stemi2324", label="TIMI危险分层的选择"),
		@Column(name="stemi_2_3_3_1", attrName="stemi2331", label="是否实施CRUSADE出血风险评分"),
		@Column(name="stemi_2_3_3_2_1", attrName="stemi23321", label="评估日期时间"),
		@Column(name="stemi_2_3_3_3_1", attrName="stemi23331", label="实施首次CRUSADE出血风险评分值"),
		@Column(name="stemi_2_3_3_4", attrName="stemi2334", label="CRUSADE出血风险评分分层的选择"),
		@Column(name="stemi_3_0_2", attrName="stemi302", label="实施再灌注治疗的模式"),
		@Column(name="stemi_3_1_1", attrName="stemi311", label="STEMI溶栓适应证"),
		@Column(name="stemi_3_1_2_1", attrName="stemi3121", label="是否有溶栓治疗禁忌症"),
		@Column(name="stemi_3_1_2_2", attrName="stemi3122", label="绝对禁忌证选择"),
		@Column(name="stemi_3_1_2_3", attrName="stemi3123", label="相对禁忌证选择"),
		@Column(name="stemi_3_1_3", attrName="stemi313", label="是否实施溶栓治疗"),
		@Column(name="stemi_3_1_4", attrName="stemi314", label="溶栓药物选择"),
		@Column(name="stemi_3_1_4_1", attrName="stemi3141", label="其他溶栓药物"),
		@Column(name="stemi_3_1_5_1", attrName="stemi3151", label="输注开始日期时间"),
		@Column(name="stemi_3_1_6_1", attrName="stemi3161", label="输注完成日期时间"),
		@Column(name="stemi_3_1_7_1", attrName="stemi3171", label="到达医院STEMI确诊报告日期与时间至溶栓时间", comment="到达医院STEMI确诊报告日期与时间至溶栓时间（D2N）"),
		@Column(name="stemi_3_1_8", attrName="stemi318", label="临床评估溶栓成功", comment="临床评估溶栓成功(60~90 min)"),
		@Column(name="stemi_3_1_9", attrName="stemi319", label="溶栓治疗并发症的选择"),
		@Column(name="stemi_3_1_10", attrName="stemi3110", label="溶栓治疗延迟原因"),
		@Column(name="stemi_3_2_1", attrName="stemi321", label="是否实施PCI治疗"),
		@Column(name="stemi_3_2_2_1_3", attrName="stemi32213", label="PCI适应证"),
		@Column(name="stemi_3_2_2_1_1", attrName="stemi32211", label="直接PCI适应证"),
		@Column(name="stemi_3_2_2_1_1_1", attrName="stemi322111", label="直接PCI适应证填写"),
		@Column(name="stemi_3_2_2_1_2", attrName="stemi32212", label="溶栓后PCI适应证"),
		@Column(name="stemi_3_2_2", attrName="stemi322", label="是否有PCI禁忌证"),
		@Column(name="stemi_3_2_2_1", attrName="stemi3221", label="PCI禁忌证选择"),
		@Column(name="stemi_3_2_2_2_1", attrName="stemi32221", label="PCI导丝通过梗死相关动脉日期时间"),
		@Column(name="stemi_3_2_2_3_1", attrName="stemi32231", label="完成时间"),
		@Column(name="stemi_3_2_2_4_1", attrName="stemi32241", label="确诊STEMI至PCI导丝通过梗死相关动脉", comment="确诊STEMI至PCI导丝通过梗死相关动脉（D2B）时间（分钟）"),
		@Column(name="stemi_3_2_2_5", attrName="stemi3225", label="治疗延迟原因选择"),
		@Column(name="stemi_3_2_3_1", attrName="stemi3231", label="主要病变血管"),
		@Column(name="stemi_3_2_3_2_1", attrName="stemi32321", label="LAD-冠状动脉狭窄程度分级"),
		@Column(name="stemi_3_2_3_2_5", attrName="stemi32325", label="LAD-术前主要靶血管TIMI血流分级的选择"),
		@Column(name="stemi_3_2_3_2_2", attrName="stemi32322", label="LCX-冠状动脉狭窄程度分级"),
		@Column(name="stemi_3_2_3_2_6", attrName="stemi32326", label="LCX-术前主要靶血管TIMI血流分级的选择"),
		@Column(name="stemi_3_2_3_2_3", attrName="stemi32323", label="RCA-冠状动脉狭窄程度分级"),
		@Column(name="stemi_3_2_3_2_7", attrName="stemi32327", label="RCA-术前主要靶血管TIMI血流分级的选择"),
		@Column(name="stemi_3_2_3_2_4", attrName="stemi32324", label="LM-冠状动脉狭窄程度分级"),
		@Column(name="stemi_3_2_3_2_8", attrName="stemi32328", label="LM-术前主要靶血管TIMI血流分级的选择"),
		@Column(name="stemi_3_2_3_3", attrName="stemi3233", label="PCI治疗主要靶血管"),
		@Column(name="stemi_3_2_3_3_1", attrName="stemi32331", label="LM-PCI术后即刻主要靶血管TIMI血流分级的选择"),
		@Column(name="stemi_3_2_3_3_2", attrName="stemi32332", label="LM-置入冠状动脉支架选择"),
		@Column(name="stemi_3_2_3_3_2_1", attrName="stemi323321", label="LM-置入冠状动脉支架填写"),
		@Column(name="stemi_3_2_3_3_3", attrName="stemi32333", label="LAD-PCI术后即刻主要靶血管TIMI血流分级的选择"),
		@Column(name="stemi_3_2_3_3_4", attrName="stemi32334", label="LAD-置入冠状动脉支架选择"),
		@Column(name="stemi_3_2_3_3_4_1", attrName="stemi323341", label="LAD-置入冠状动脉支架填写"),
		@Column(name="stemi_3_2_3_3_5", attrName="stemi32335", label="LCX-PCI术后即刻主要靶血管TIMI血流分级的选择"),
		@Column(name="stemi_3_2_3_3_6", attrName="stemi32336", label="LCX-置入冠状动脉支架选择"),
		@Column(name="stemi_3_2_3_3_6_1", attrName="stemi323361", label="LCX-置入冠状动脉支架填写"),
		@Column(name="stemi_3_2_3_3_7", attrName="stemi32337", label="LM-LAD-PCI术后即刻主要靶血管TIMI血流分级的选择"),
		@Column(name="stemi_3_2_3_3_8", attrName="stemi32338", label="LM-LAD-置入冠状动脉支架选择"),
		@Column(name="stemi_3_2_3_3_8_1", attrName="stemi323381", label="LM-LAD-置入冠状动脉支架填写"),
		@Column(name="stemi_3_2_3_9_1", attrName="stemi32391", label="LM-LCX-PCI术后即刻主要靶血管TIMI血流分级的选择"),
		@Column(name="stemi_3_2_3_3_10", attrName="stemi323310", label="LM-LCX-置入冠状动脉支架选择"),
		@Column(name="stemi_3_2_3_3_10_1", attrName="stemi3233101", label="LM-LCX-置入冠状动脉支架填写"),
		@Column(name="stemi_3_2_3_3_11", attrName="stemi323311", label="RCA-PCI术后即刻主要靶血管TIMI血流分级的选择"),
		@Column(name="stemi_3_2_3_3_12", attrName="stemi323312", label="RCA-置入冠状动脉支架选择"),
		@Column(name="stemi_3_2_3_3_12_1", attrName="stemi3233121", label="RCA-置入冠状动脉支架填写"),
		@Column(name="stemi_3_2_3_3_13", attrName="stemi323313", label="LM-中间支-PCI术后即刻主要靶血管TIMI血流分级的选择"),
		@Column(name="stemi_3_2_3_3_14", attrName="stemi323314", label="LM-中间支-置入冠状动脉支架选择"),
		@Column(name="stemi_3_2_3_3_14_1", attrName="stemi3233141", label="LM-中间支-置入冠状动脉支架填写"),
		@Column(name="stemi_3_2_3_15_1", attrName="stemi323151", label="中间支-PCI术后即刻主要靶血管TIMI血流分级的选择"),
		@Column(name="stemi_3_2_3_3_16", attrName="stemi323316", label="中间支-置入冠状动脉支架选择"),
		@Column(name="stemi_3_2_3_3_16_1", attrName="stemi3233161", label="中间支-置入冠状动脉支架填写"),
		@Column(name="stemi_3_2_4_1", attrName="stemi3241", label="ICD-9-CM-3编码与名称"),
		@Column(name="stemi_3_2_4_2", attrName="stemi3242", label="治疗血管的数量的选择"),
		@Column(name="stemi_3_2_4_3", attrName="stemi3243", label="置入血管支架的数量现在"),
		@Column(name="stemi_3_2_4_4", attrName="stemi3244", label="心脏团队讨论决策模式的选择"),
		@Column(name="stemi_3_2_5_1", attrName="stemi3251", label="近期主要并发症的选择"),
		@Column(name="stemi_3_2_5_1_1", attrName="stemi32511", label="其他近期主要并发症"),
		@Column(name="stemi_3_2_5_2", attrName="stemi3252", label="近期并发症治疗主要措施的选择"),
		@Column(name="stemi_3_2_5_2_1", attrName="stemi32521", label="其他近期并发症治疗主要措施"),
		@Column(name="stemi_3_2_6_1", attrName="stemi3261", label="是否实施CathPCI风险评估"),
		@Column(name="stemi_3_2_6_2_1_1", attrName="stemi326211", label="总分值"),
		@Column(name="stemi_3_2_6_2_2", attrName="stemi32622", label="院内患者死亡风险", comment="院内患者死亡风险(%)"),
		@Column(name="stemi_3_2_7_1", attrName="stemi3271", label="是否实施围术期抗凝治疗"),
		@Column(name="stemi_3_2_7_2", attrName="stemi3272", label="肠外抗凝药物选择"),
		@Column(name="stemi_3_2_7_3", attrName="stemi3273", label="其他肠外抗凝药物"),
		@Column(name="stemi_3_3_0", attrName="stemi330", label="", comment="（本院）无条件实施时，是否将患者转往有条件行PCI的医院"),
		@Column(name="stemi_3_3_1_1", attrName="stemi3311", label="医院自身原因"),
		@Column(name="stemi_3_3_1_1_1", attrName="stemi33111", label="其他医院自身原因"),
		@Column(name="stemi_3_3_1_2", attrName="stemi3312", label="患者自身原因转院"),
		@Column(name="stemi_3_3_1_2_1", attrName="stemi33121", label="其他患者自身原因"),
		@Column(name="stemi_3_3_2", attrName="stemi332", label="转院类型及适应症"),
		@Column(name="stemi_3_3_3_1", attrName="stemi3331", label="转院日期时间"),
		@Column(name="stemi_3_3_4_1", attrName="stemi3341", label="到医院就诊至转出时间", comment="到医院就诊至转出时间（分钟）"),
		@Column(name="stemi_3_4", attrName="stemi34", label="医院是否具备接受外院“转院PCI”患者的能力"),
		@Column(name="stemi_3_4_1_1", attrName="stemi3411", label="患者从不具备实施PCI能力医院转运到本院急诊或门诊日期"),
		@Column(name="stemi_3_4_2_1", attrName="stemi3421", label="PCI导丝通过梗死相关动脉的时间"),
		@Column(name="stemi_3_4_3_1", attrName="stemi3431", label="医院转出时间至PCI导丝通过梗死相关动脉", comment="医院转出时间至PCI导丝通过梗死相关动脉（D2B1）时间（分钟）"),
		@Column(name="stemi_3_4_4", attrName="stemi344", label="治疗延迟原因选择"),
		@Column(name="stemi_4_1_1", attrName="stemi411", label="是否有β-受体阻滞剂禁忌证"),
		@Column(name="stemi_4_1_2_1", attrName="stemi4121", label="β-受体阻滞剂禁忌症"),
		@Column(name="stemi_4_1_2_1_1", attrName="stemi41211", label="其他β-受体阻滞剂禁忌症"),
		@Column(name="stemi_4_1_2_2", attrName="stemi4122", label="β-受体阻滞剂相对禁忌症"),
		@Column(name="stemi_4_1_2_2_1", attrName="stemi41221", label="其他β-受体阻滞剂相对禁忌症"),
		@Column(name="stemi_4_2", attrName="stemi42", label="使用首剂β-受体阻滞剂"),
		@Column(name="stemi_4_3_1", attrName="stemi431", label="首剂用药日期时间"),
		@Column(name="stemi_5_1_1", attrName="stemi511", label="双联抗血小板药物是否有用药长期医嘱"),
		@Column(name="stemi_5_1_2", attrName="stemi512", label="双联抗血小板药物品名的选择"),
		@Column(name="stemi_5_1_2_1", attrName="stemi5121", label="双联抗血小板药物品名填写"),
		@Column(name="stemi_5_2_1", attrName="stemi521", label="β阻滞剂是否有用药长期医嘱"),
		@Column(name="stemi_5_2_2", attrName="stemi522", label="长期医嘱中使用β-受体阻滞剂品名的选择"),
		@Column(name="stemi_5_3_1", attrName="stemi531", label="是否有ACEI抑制剂/ARB类药物禁忌症"),
		@Column(name="stemi_5_3_2", attrName="stemi532", label="ACE抑制剂/ARB类药物禁忌症的选择"),
		@Column(name="stemi_5_3_3", attrName="stemi533", label="是否有ACEI抑制剂/ARB类药物长期医嘱"),
		@Column(name="stemi_5_3_4_a", attrName="stemi534A", label="使用ACE抑制剂药物名称的选择"),
		@Column(name="stemi_5_3_4_a_1", attrName="stemi534A1", label="其他ACE抑制剂药物"),
		@Column(name="stemi_5_3_4_b", attrName="stemi534B", label="使用ARB类药物名称的选择"),
		@Column(name="stemi_5_3_4_b_1", attrName="stemi534B1", label="其他ARB类药物"),
		@Column(name="stemi_5_4_1", attrName="stemi541", label="是否有他汀类药禁忌证"),
		@Column(name="stemi_5_4_2", attrName="stemi542", label="他汀类药物禁忌证的选择"),
		@Column(name="stemi_5_4_3", attrName="stemi543", label="是否有用药长期医嘱"),
		@Column(name="stemi_5_4_4", attrName="stemi544", label="给予他汀类药物名称的选择"),
		@Column(name="stemi_5_4_4_1", attrName="stemi5441", label="其他其他降脂药物"),
		@Column(name="stemi_6_1", attrName="stemi61", label="是否有出院带药医嘱-抗血小板药物"),
		@Column(name="stemi_6_1_2", attrName="stemi612", label="双联抗血小板药物品名的选择"),
		@Column(name="stemi_6_1_2_1", attrName="stemi6121", label="其他双联抗血小板药物品"),
		@Column(name="stemi_6_2", attrName="stemi62", label="是否有β阻滞剂出院带药医嘱"),
		@Column(name="stemi_6_2_2", attrName="stemi622", label="使用β-受体阻滞剂品名的选择"),
		@Column(name="stemi_6_3", attrName="stemi63", label="是否有出院带药医嘱-ACEI抑制剂/ARB类药物医嘱"),
		@Column(name="stemi_6_3_2", attrName="stemi632", label="使用ACEI抑制剂或者ARB类药物"),
		@Column(name="stemi_6_3_2_a", attrName="stemi632A", label="使用ACE抑制剂药物名称的选择"),
		@Column(name="stemi_6_3_2_a_1", attrName="stemi632A1", label="其他ACE抑制剂药物"),
		@Column(name="stemi_6_3_2_b", attrName="stemi632B", label="使用ARB类药物名称的选择"),
		@Column(name="stemi_6_3_2_b_1", attrName="stemi632B1", label="其他ARB类药物"),
		@Column(name="stemi_6_4", attrName="stemi64", label="是否有出院带药医嘱-他汀类药物医嘱"),
		@Column(name="stemi_6_4_2", attrName="stemi642", label="给予他汀类药物名称的选择"),
		@Column(name="stemi_6_4_2_1", attrName="stemi6421", label="其他降脂药物"),
		@Column(name="stemi_6_5_1", attrName="stemi651", label="是否有醛固酮受体拮抗剂药物禁忌证"),
		@Column(name="stemi_6_5_2", attrName="stemi652", label="醛固酮受体拮抗剂药物禁忌证的选择"),
		@Column(name="stemi_6_5_2_1", attrName="stemi6521", label="醛固酮受体拮抗剂药物禁忌证填写"),
		@Column(name="stemi_6_5_3", attrName="stemi653", label="是否有醛固酮受体拮抗剂药物适应证"),
		@Column(name="stemi_6_5_4", attrName="stemi654", label="醛固酮受体拮抗剂药物适应证的选择"),
		@Column(name="stemi_6_5_5", attrName="stemi655", label="是否有出院带药医嘱-醛固酮受体拮抗剂"),
		@Column(name="stemi_6_5_6", attrName="stemi656", label="出院带药医嘱中使用醛固酮受体拮抗剂品名的选择"),
		@Column(name="stemi_6_5_6_1", attrName="stemi6561", label="其他醛固酮受体拮抗剂品名"),
		@Column(name="stemi_7_1", attrName="stemi71", label="血脂评价时间"),
		@Column(name="stemi_7_2", attrName="stemi72", label="血脂评价结果"),
		@Column(name="stemi_7_3_1", attrName="stemi731", label="是否有他汀药物禁忌症"),
		@Column(name="stemi_7_3_2", attrName="stemi732", label="他汀类药物禁忌证的选择"),
		@Column(name="stemi_7_4", attrName="stemi74", label="是否有他汀类药物长期医嘱"),
		@Column(name="stemi_7_5", attrName="stemi75", label="是否有他汀类药物出院带药医嘱"),
		@Column(name="stemi_8_1_1", attrName="stemi811", label="吸烟史"),
		@Column(name="stemi_8_1_2", attrName="stemi812", label="吸烟程度评估有记录"),
		@Column(name="stemi_8_1_3", attrName="stemi813", label="接受戒烟的建议或者戒烟治疗有记录"),
		@Column(name="stemi_8_2_1", attrName="stemi821", label="", comment="（主要）危险因素的评估"),
		@Column(name="stemi_8_2_2", attrName="stemi822", label="实施针对控制危险因素评估结果的教育"),
		@Column(name="stemi_8_3", attrName="stemi83", label="二级预防"),
		@Column(name="stemi_8_4_1", attrName="stemi841", label="交与患者“出院小结”的副本告知患者出院时风险因素"),
		@Column(name="stemi_8_4_2", attrName="stemi842", label="出院带药"),
		@Column(name="stemi_8_4_3", attrName="stemi843", label="告知发生紧急情况时求援救治途径"),
		@Column(name="stemi_8_4_4", attrName="stemi844", label="出院时教育与随访"),
		@Column(name="stemi_8_4_5", attrName="stemi845", label="告知何为风险因素与紧急情况"),
		@Column(name="stemi_9_2_1", attrName="stemi921", label="出院时状态评估结果"),
		@Column(name="stemi_9_2_1_1", attrName="stemi9211", label="其他出院时状态填写"),
		@Column(name="stemi_9_2_2_a_2", attrName="stemi922A2", label="末次GRACE危险评估是否有记录"),
		@Column(name="stemi_9_2_2_a_1_1", attrName="stemi922A11", label="末次GRACE危险评估"),
		@Column(name="stemi_9_2_2_a_3", attrName="stemi922A3", label="GRACE危险评估分层的选择"),
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
		@Column(name="id", attrName="id", label="id", isPK=true),
	}, orderBy="a.id DESC"
)
public class QualityStemi extends DataEntity<QualityStemi> {
	
	private static final long serialVersionUID = 1L;
	private String cm0111;		// 质控医师
	private String cm0112;		// 质控护士
	private String cm0113;		// 主治医师
	private String cm0114;		// 责任护士
	private String cm0115;		// 上报科室
	private String caseId;		// 患者病案号
	private String cm0131;		// 主要诊断ICD-10四位亚目编码与名称
	private String cm0132;		// 主要诊断ICD-10六位临床扩展编码与名称
	private String cm0141;		// 主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称
	private String cm0142;		// 主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称
	private String cm015;		// 是否出院后31天内重复住院
	private Date cm0211;		// 出生日期
	private String cm0212;		// 患者性别
	private Double cm0213;		// 患者体重（kg）
	private Double cm0215;		// 患者身高（cm）
	private String cm0221;		// 发病日期时间是否无法确定或无记录
	private Date cm0222;		// 发病日期时间
	private Date cm0232;		// 到达本院急诊或者门诊日期时间
	private Date cm0241;		// 入院日期时间
	private Date cm0242;		// 出院日期时间
	private Date cm0251;		// 入住CCU日期时间
	private Date cm0252;		// 离开CCU日期时间
	private String cm031;		// 费用支付方式
	private String cm032;		// 收入住院途径
	private String cm033;		// 到院交通工具
	private String stemi046;		// 救护车类型
	private String stemi041;		// 是否现场评估生命体征，施行急救
	private String stemi042;		// 到达现场后10分钟内是否完成心电图检查
	private String stemi043;		// 现场急救维持生命体征稳定措施选择
	private String stemi044;		// 对持续胸痛＞15分钟和心电图ST段抬高，且无“阿斯匹林”禁忌症的患者用药
	private String stemi045;		// 是否利用救护车中车载信息系统、微信、彩信等多种形式传输心电图等院前信息至目标医院
	private String stemi047;		// 是否入院前在救护车上开始溶栓治疗
	private String stemi114;		// 是否有症状和病史
	private String stemi115;		// 症状和体征选择
	private String stemi116;		// 是否实施首次采用Killip分级法评估心功能
	private String stemi117;		// Killip分级，症状及体征选择
	private String stemi111;		// 是否实施首次心电图检查
	private Date stemi1121;		// 心电图检查结果确诊STEMI报告日期时间
	private String stemi113;		// 心电图检查结果，具有STEMI特征性诊断标准的选择
	private String stemi1131;		// 其他心电图检查结果填写
	private String stemi121;		// 是否有P2Y12受体拮抗剂禁忌证
	private String stemi122;		// P2Y12受体拮抗剂禁忌证
	private String stemi1221;		// 其他P2Y12受体拮抗剂禁忌证填写
	private String stemi123;		// 首剂给予双联抗血小板药负荷剂量
	private String stemi1231;		// 其他抗血小板药物填写
	private Date stemi1241;		// 用药日期时间
	private String stemi1311;		// 是否实施首次心脏标志物检测
	private Date stemi13121;		// 首次心脏标志物检测结果报告日期时间
	private String stemi132;		// 首次心脏标志物检测选项和数值
	private String stemi1411;		// 肌钙蛋白T检测选项
	private Long stemi1321;		// 肌钙蛋白T检测值(ng/Ml)
	private String stemi1412;		// 肌钙蛋白T定性检测选择
	private String stemi1421;		// 肌钙蛋白I检测选项
	private Long stemi1322;		// 肌钙蛋白I检测值(ng/mL)
	private String stemi1422;		// 肌钙蛋白I定性检测选择
	private String stemi1431;		// 肌酸激酶同工酶检测选项
	private Long stemi1323;		// 肌酸激酶同工酶检测值(ng/mL)
	private String stemi1432;		// 肌酸激酶同工酶定性检测选择
	private String stemi1441;		// 心肌肌红蛋白检测选项
	private Long stemi1324;		// 心肌肌红蛋白检测值(ng/mL)
	private String stemi1442;		// 心肌肌红蛋白定性检测选择
	private String stemi1451;		// B型钠尿肽检测选项
	private Long stemi1325;		// B型钠尿肽检测值(ng/L)
	private String stemi1452;		// B型钠尿肽定性检测选择
	private String stemi1461;		// N端B型钠尿肽前体检测选项
	private Long stemi1326;		// N端B型钠尿肽前体检测值(ng/L)
	private String stemi1462;		// N端B型钠尿肽前体定性检测选择
	private String stemi211;		// 是否实施首次X线胸片检查
	private Date stemi2121;		// 首次X线胸片检查报告日期时间
	private String stemi213;		// 是否有肺淤血或肺水肿
	private String stemi221;		// 是否实施首次超声心动图(CDFA)检查
	private Date stemi2221;		// 报告日期时间
	private Long stemi2231;		// 左室射血分（LVEF）测量值(%)
	private Long stemi22331;		// 左室舒张末径（LVEDd）数值(mm)
	private String stemi2234;		// 是否有左室室壁瘤
	private String stemi2311;		// 是否实施GRACE危险评分评估
	private Date stemi23121;		// 评估日期时间
	private Long stemi23131;		// 实施首次GRACE危险评分值
	private String stemi2314;		// GRACE危险评估分层的选择
	private String stemi2321;		// 是否实施TIMI危险分层评估
	private Date stemi23221;		// 评估日期时间
	private Long stemi23231;		// 实施首次TIMI危险分层分值
	private String stemi2324;		// TIMI危险分层的选择
	private String stemi2331;		// 是否实施CRUSADE出血风险评分
	private Date stemi23321;		// 评估日期时间
	private Long stemi23331;		// 实施首次CRUSADE出血风险评分值
	private String stemi2334;		// CRUSADE出血风险评分分层的选择
	private String stemi302;		// 实施再灌注治疗的模式
	private String stemi311;		// STEMI溶栓适应证
	private String stemi3121;		// 是否有溶栓治疗禁忌症
	private String stemi3122;		// 绝对禁忌证选择
	private String stemi3123;		// 相对禁忌证选择
	private String stemi313;		// 是否实施溶栓治疗
	private String stemi314;		// 溶栓药物选择
	private String stemi3141;		// 其他溶栓药物
	private Date stemi3151;		// 输注开始日期时间
	private Date stemi3161;		// 输注完成日期时间
	private Long stemi3171;		// 到达医院STEMI确诊报告日期与时间至溶栓时间（D2N）
	private String stemi318;		// 临床评估溶栓成功(60~90 min)
	private String stemi319;		// 溶栓治疗并发症的选择
	private String stemi3110;		// 溶栓治疗延迟原因
	private String stemi321;		// 是否实施PCI治疗
	private String stemi32213;		// PCI适应证
	private String stemi32211;		// 直接PCI适应证
	private String stemi322111;		// 直接PCI适应证填写
	private String stemi32212;		// 溶栓后PCI适应证
	private String stemi322;		// 是否有PCI禁忌证
	private String stemi3221;		// PCI禁忌证选择
	private Date stemi32221;		// PCI导丝通过梗死相关动脉日期时间
	private Date stemi32231;		// 完成时间
	private String stemi32241;		// 确诊STEMI至PCI导丝通过梗死相关动脉（D2B）时间（分钟）
	private String stemi3225;		// 治疗延迟原因选择
	private String stemi3231;		// 主要病变血管
	private String stemi32321;		// LAD-冠状动脉狭窄程度分级
	private String stemi32325;		// LAD-术前主要靶血管TIMI血流分级的选择
	private String stemi32322;		// LCX-冠状动脉狭窄程度分级
	private String stemi32326;		// LCX-术前主要靶血管TIMI血流分级的选择
	private String stemi32323;		// RCA-冠状动脉狭窄程度分级
	private String stemi32327;		// RCA-术前主要靶血管TIMI血流分级的选择
	private String stemi32324;		// LM-冠状动脉狭窄程度分级
	private String stemi32328;		// LM-术前主要靶血管TIMI血流分级的选择
	private String stemi3233;		// PCI治疗主要靶血管
	private String stemi32331;		// LM-PCI术后即刻主要靶血管TIMI血流分级的选择
	private String stemi32332;		// LM-置入冠状动脉支架选择
	private String stemi323321;		// LM-置入冠状动脉支架填写
	private String stemi32333;		// LAD-PCI术后即刻主要靶血管TIMI血流分级的选择
	private String stemi32334;		// LAD-置入冠状动脉支架选择
	private String stemi323341;		// LAD-置入冠状动脉支架填写
	private String stemi32335;		// LCX-PCI术后即刻主要靶血管TIMI血流分级的选择
	private String stemi32336;		// LCX-置入冠状动脉支架选择
	private String stemi323361;		// LCX-置入冠状动脉支架填写
	private String stemi32337;		// LM-LAD-PCI术后即刻主要靶血管TIMI血流分级的选择
	private String stemi32338;		// LM-LAD-置入冠状动脉支架选择
	private String stemi323381;		// LM-LAD-置入冠状动脉支架填写
	private String stemi32391;		// LM-LCX-PCI术后即刻主要靶血管TIMI血流分级的选择
	private String stemi323310;		// LM-LCX-置入冠状动脉支架选择
	private String stemi3233101;		// LM-LCX-置入冠状动脉支架填写
	private String stemi323311;		// RCA-PCI术后即刻主要靶血管TIMI血流分级的选择
	private String stemi323312;		// RCA-置入冠状动脉支架选择
	private String stemi3233121;		// RCA-置入冠状动脉支架填写
	private String stemi323313;		// LM-中间支-PCI术后即刻主要靶血管TIMI血流分级的选择
	private String stemi323314;		// LM-中间支-置入冠状动脉支架选择
	private String stemi3233141;		// LM-中间支-置入冠状动脉支架填写
	private String stemi323151;		// 中间支-PCI术后即刻主要靶血管TIMI血流分级的选择
	private String stemi323316;		// 中间支-置入冠状动脉支架选择
	private String stemi3233161;		// 中间支-置入冠状动脉支架填写
	private String stemi3241;		// ICD-9-CM-3编码与名称
	private String stemi3242;		// 治疗血管的数量的选择
	private String stemi3243;		// 置入血管支架的数量现在
	private String stemi3244;		// 心脏团队讨论决策模式的选择
	private String stemi3251;		// 近期主要并发症的选择
	private String stemi32511;		// 其他近期主要并发症
	private String stemi3252;		// 近期并发症治疗主要措施的选择
	private String stemi32521;		// 其他近期并发症治疗主要措施
	private String stemi3261;		// 是否实施CathPCI风险评估
	private Long stemi326211;		// 总分值
	private Long stemi32622;		// 院内患者死亡风险(%)
	private String stemi3271;		// 是否实施围术期抗凝治疗
	private String stemi3272;		// 肠外抗凝药物选择
	private String stemi3273;		// 其他肠外抗凝药物
	private String stemi330;		// （本院）无条件实施时，是否将患者转往有条件行PCI的医院
	private String stemi3311;		// 医院自身原因
	private String stemi33111;		// 其他医院自身原因
	private String stemi3312;		// 患者自身原因转院
	private String stemi33121;		// 其他患者自身原因
	private String stemi332;		// 转院类型及适应症
	private Date stemi3331;		// 转院日期时间
	private Long stemi3341;		// 到医院就诊至转出时间（分钟）
	private String stemi34;		// 医院是否具备接受外院“转院PCI”患者的能力
	private Date stemi3411;		// 患者从不具备实施PCI能力医院转运到本院急诊或门诊日期
	private Date stemi3421;		// PCI导丝通过梗死相关动脉的时间
	private Long stemi3431;		// 医院转出时间至PCI导丝通过梗死相关动脉（D2B1）时间（分钟）
	private String stemi344;		// 治疗延迟原因选择
	private String stemi411;		// 是否有β-受体阻滞剂禁忌证
	private String stemi4121;		// β-受体阻滞剂禁忌症
	private String stemi41211;		// 其他β-受体阻滞剂禁忌症
	private String stemi4122;		// β-受体阻滞剂相对禁忌症
	private String stemi41221;		// 其他β-受体阻滞剂相对禁忌症
	private String stemi42;		// 使用首剂β-受体阻滞剂
	private Date stemi431;		// 首剂用药日期时间
	private String stemi511;		// 双联抗血小板药物是否有用药长期医嘱
	private String stemi512;		// 双联抗血小板药物品名的选择
	private String stemi5121;		// 双联抗血小板药物品名填写
	private String stemi521;		// β阻滞剂是否有用药长期医嘱
	private String stemi522;		// 长期医嘱中使用β-受体阻滞剂品名的选择
	private String stemi531;		// 是否有ACEI抑制剂/ARB类药物禁忌症
	private String stemi532;		// ACE抑制剂/ARB类药物禁忌症的选择
	private String stemi533;		// 是否有ACEI抑制剂/ARB类药物长期医嘱
	private String stemi534A;		// 使用ACE抑制剂药物名称的选择
	private String stemi534A1;		// 其他ACE抑制剂药物
	private String stemi534B;		// 使用ARB类药物名称的选择
	private String stemi534B1;		// 其他ARB类药物
	private String stemi541;		// 是否有他汀类药禁忌证
	private String stemi542;		// 他汀类药物禁忌证的选择
	private String stemi543;		// 是否有用药长期医嘱
	private String stemi544;		// 给予他汀类药物名称的选择
	private String stemi5441;		// 其他其他降脂药物
	private String stemi61;		// 是否有出院带药医嘱-抗血小板药物
	private String stemi612;		// 双联抗血小板药物品名的选择
	private String stemi6121;		// 其他双联抗血小板药物品
	private String stemi62;		// 是否有β阻滞剂出院带药医嘱
	private String stemi622;		// 使用β-受体阻滞剂品名的选择
	private String stemi63;		// 是否有出院带药医嘱-ACEI抑制剂/ARB类药物医嘱
	private String stemi632;		// 使用ACEI抑制剂或者ARB类药物
	private String stemi632A;		// 使用ACE抑制剂药物名称的选择
	private String stemi632A1;		// 其他ACE抑制剂药物
	private String stemi632B;		// 使用ARB类药物名称的选择
	private String stemi632B1;		// 其他ARB类药物
	private String stemi64;		// 是否有出院带药医嘱-他汀类药物医嘱
	private String stemi642;		// 给予他汀类药物名称的选择
	private String stemi6421;		// 其他降脂药物
	private String stemi651;		// 是否有醛固酮受体拮抗剂药物禁忌证
	private String stemi652;		// 醛固酮受体拮抗剂药物禁忌证的选择
	private String stemi6521;		// 醛固酮受体拮抗剂药物禁忌证填写
	private String stemi653;		// 是否有醛固酮受体拮抗剂药物适应证
	private String stemi654;		// 醛固酮受体拮抗剂药物适应证的选择
	private String stemi655;		// 是否有出院带药医嘱-醛固酮受体拮抗剂
	private String stemi656;		// 出院带药医嘱中使用醛固酮受体拮抗剂品名的选择
	private String stemi6561;		// 其他醛固酮受体拮抗剂品名
	private String stemi71;		// 血脂评价时间
	private String stemi72;		// 血脂评价结果
	private String stemi731;		// 是否有他汀药物禁忌症
	private String stemi732;		// 他汀类药物禁忌证的选择
	private String stemi74;		// 是否有他汀类药物长期医嘱
	private String stemi75;		// 是否有他汀类药物出院带药医嘱
	private String stemi811;		// 吸烟史
	private String stemi812;		// 吸烟程度评估有记录
	private String stemi813;		// 接受戒烟的建议或者戒烟治疗有记录
	private String stemi821;		// （主要）危险因素的评估
	private String stemi822;		// 实施针对控制危险因素评估结果的教育
	private String stemi83;		// 二级预防
	private String stemi841;		// 交与患者“出院小结”的副本告知患者出院时风险因素
	private String stemi842;		// 出院带药
	private String stemi843;		// 告知发生紧急情况时求援救治途径
	private String stemi844;		// 出院时教育与随访
	private String stemi845;		// 告知何为风险因素与紧急情况
	private String stemi921;		// 出院时状态评估结果
	private String stemi9211;		// 其他出院时状态填写
	private String stemi922A2;		// 末次GRACE危险评估是否有记录
	private String stemi922A11;		// 末次GRACE危险评估
	private String stemi922A3;		// GRACE危险评估分层的选择
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
	
	public QualityStemi() {
		this(null);
	}

	public QualityStemi(String id){
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
	
	@Length(min=0, max=32, message="主要诊断ICD-10四位亚目编码与名称长度不能超过 32 个字符")
	public String getCm0131() {
		return cm0131;
	}

	public void setCm0131(String cm0131) {
		this.cm0131 = cm0131;
	}
	
	@Length(min=0, max=32, message="主要诊断ICD-10六位临床扩展编码与名称长度不能超过 32 个字符")
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
	
	@Length(min=0, max=32, message="主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称长度不能超过 32 个字符")
	public String getCm0142() {
		return cm0142;
	}

	public void setCm0142(String cm0142) {
		this.cm0142 = cm0142;
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
	
	@Length(min=0, max=32, message="救护车类型长度不能超过 32 个字符")
	public String getStemi046() {
		return stemi046;
	}

	public void setStemi046(String stemi046) {
		this.stemi046 = stemi046;
	}
	
	@Length(min=0, max=32, message="是否现场评估生命体征，施行急救长度不能超过 32 个字符")
	public String getStemi041() {
		return stemi041;
	}

	public void setStemi041(String stemi041) {
		this.stemi041 = stemi041;
	}
	
	@Length(min=0, max=32, message="到达现场后10分钟内是否完成心电图检查长度不能超过 32 个字符")
	public String getStemi042() {
		return stemi042;
	}

	public void setStemi042(String stemi042) {
		this.stemi042 = stemi042;
	}
	
	@Length(min=0, max=32, message="现场急救维持生命体征稳定措施选择长度不能超过 32 个字符")
	public String getStemi043() {
		return stemi043;
	}

	public void setStemi043(String stemi043) {
		this.stemi043 = stemi043;
	}
	
	@Length(min=0, max=32, message="对持续胸痛＞15分钟和心电图ST段抬高，且无“阿斯匹林”禁忌症的患者用药长度不能超过 32 个字符")
	public String getStemi044() {
		return stemi044;
	}

	public void setStemi044(String stemi044) {
		this.stemi044 = stemi044;
	}
	
	@Length(min=0, max=32, message="是否利用救护车中车载信息系统、微信、彩信等多种形式传输心电图等院前信息至目标医院长度不能超过 32 个字符")
	public String getStemi045() {
		return stemi045;
	}

	public void setStemi045(String stemi045) {
		this.stemi045 = stemi045;
	}
	
	@Length(min=0, max=32, message="是否入院前在救护车上开始溶栓治疗长度不能超过 32 个字符")
	public String getStemi047() {
		return stemi047;
	}

	public void setStemi047(String stemi047) {
		this.stemi047 = stemi047;
	}
	
	@Length(min=0, max=32, message="是否有症状和病史长度不能超过 32 个字符")
	public String getStemi114() {
		return stemi114;
	}

	public void setStemi114(String stemi114) {
		this.stemi114 = stemi114;
	}
	
	@Length(min=0, max=32, message="症状和体征选择长度不能超过 32 个字符")
	public String getStemi115() {
		return stemi115;
	}

	public void setStemi115(String stemi115) {
		this.stemi115 = stemi115;
	}
	
	@Length(min=0, max=32, message="是否实施首次采用Killip分级法评估心功能长度不能超过 32 个字符")
	public String getStemi116() {
		return stemi116;
	}

	public void setStemi116(String stemi116) {
		this.stemi116 = stemi116;
	}
	
	@Length(min=0, max=32, message="Killip分级，症状及体征选择长度不能超过 32 个字符")
	public String getStemi117() {
		return stemi117;
	}

	public void setStemi117(String stemi117) {
		this.stemi117 = stemi117;
	}
	
	@Length(min=0, max=32, message="是否实施首次心电图检查长度不能超过 32 个字符")
	public String getStemi111() {
		return stemi111;
	}

	public void setStemi111(String stemi111) {
		this.stemi111 = stemi111;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi1121() {
		return stemi1121;
	}

	public void setStemi1121(Date stemi1121) {
		this.stemi1121 = stemi1121;
	}
	
	@Length(min=0, max=32, message="心电图检查结果，具有STEMI特征性诊断标准的选择长度不能超过 32 个字符")
	public String getStemi113() {
		return stemi113;
	}

	public void setStemi113(String stemi113) {
		this.stemi113 = stemi113;
	}
	
	@Length(min=0, max=32, message="其他心电图检查结果填写长度不能超过 32 个字符")
	public String getStemi1131() {
		return stemi1131;
	}

	public void setStemi1131(String stemi1131) {
		this.stemi1131 = stemi1131;
	}
	
	@Length(min=0, max=32, message="是否有P2Y12受体拮抗剂禁忌证长度不能超过 32 个字符")
	public String getStemi121() {
		return stemi121;
	}

	public void setStemi121(String stemi121) {
		this.stemi121 = stemi121;
	}
	
	@Length(min=0, max=32, message="P2Y12受体拮抗剂禁忌证长度不能超过 32 个字符")
	public String getStemi122() {
		return stemi122;
	}

	public void setStemi122(String stemi122) {
		this.stemi122 = stemi122;
	}
	
	@Length(min=0, max=32, message="其他P2Y12受体拮抗剂禁忌证填写长度不能超过 32 个字符")
	public String getStemi1221() {
		return stemi1221;
	}

	public void setStemi1221(String stemi1221) {
		this.stemi1221 = stemi1221;
	}
	
	@Length(min=0, max=32, message="首剂给予双联抗血小板药负荷剂量长度不能超过 32 个字符")
	public String getStemi123() {
		return stemi123;
	}

	public void setStemi123(String stemi123) {
		this.stemi123 = stemi123;
	}
	
	@Length(min=0, max=32, message="其他抗血小板药物填写长度不能超过 32 个字符")
	public String getStemi1231() {
		return stemi1231;
	}

	public void setStemi1231(String stemi1231) {
		this.stemi1231 = stemi1231;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi1241() {
		return stemi1241;
	}

	public void setStemi1241(Date stemi1241) {
		this.stemi1241 = stemi1241;
	}
	
	@Length(min=0, max=32, message="是否实施首次心脏标志物检测长度不能超过 32 个字符")
	public String getStemi1311() {
		return stemi1311;
	}

	public void setStemi1311(String stemi1311) {
		this.stemi1311 = stemi1311;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi13121() {
		return stemi13121;
	}

	public void setStemi13121(Date stemi13121) {
		this.stemi13121 = stemi13121;
	}
	
	@Length(min=0, max=32, message="首次心脏标志物检测选项和数值长度不能超过 32 个字符")
	public String getStemi132() {
		return stemi132;
	}

	public void setStemi132(String stemi132) {
		this.stemi132 = stemi132;
	}
	
	@Length(min=0, max=32, message="肌钙蛋白T检测选项长度不能超过 32 个字符")
	public String getStemi1411() {
		return stemi1411;
	}

	public void setStemi1411(String stemi1411) {
		this.stemi1411 = stemi1411;
	}
	
	public Long getStemi1321() {
		return stemi1321;
	}

	public void setStemi1321(Long stemi1321) {
		this.stemi1321 = stemi1321;
	}
	
	@Length(min=0, max=32, message="肌钙蛋白T定性检测选择长度不能超过 32 个字符")
	public String getStemi1412() {
		return stemi1412;
	}

	public void setStemi1412(String stemi1412) {
		this.stemi1412 = stemi1412;
	}
	
	@Length(min=0, max=32, message="肌钙蛋白I检测选项长度不能超过 32 个字符")
	public String getStemi1421() {
		return stemi1421;
	}

	public void setStemi1421(String stemi1421) {
		this.stemi1421 = stemi1421;
	}
	
	public Long getStemi1322() {
		return stemi1322;
	}

	public void setStemi1322(Long stemi1322) {
		this.stemi1322 = stemi1322;
	}
	
	@Length(min=0, max=32, message="肌钙蛋白I定性检测选择长度不能超过 32 个字符")
	public String getStemi1422() {
		return stemi1422;
	}

	public void setStemi1422(String stemi1422) {
		this.stemi1422 = stemi1422;
	}
	
	@Length(min=0, max=32, message="肌酸激酶同工酶检测选项长度不能超过 32 个字符")
	public String getStemi1431() {
		return stemi1431;
	}

	public void setStemi1431(String stemi1431) {
		this.stemi1431 = stemi1431;
	}
	
	public Long getStemi1323() {
		return stemi1323;
	}

	public void setStemi1323(Long stemi1323) {
		this.stemi1323 = stemi1323;
	}
	
	@Length(min=0, max=32, message="肌酸激酶同工酶定性检测选择长度不能超过 32 个字符")
	public String getStemi1432() {
		return stemi1432;
	}

	public void setStemi1432(String stemi1432) {
		this.stemi1432 = stemi1432;
	}
	
	@Length(min=0, max=32, message="心肌肌红蛋白检测选项长度不能超过 32 个字符")
	public String getStemi1441() {
		return stemi1441;
	}

	public void setStemi1441(String stemi1441) {
		this.stemi1441 = stemi1441;
	}
	
	public Long getStemi1324() {
		return stemi1324;
	}

	public void setStemi1324(Long stemi1324) {
		this.stemi1324 = stemi1324;
	}
	
	@Length(min=0, max=32, message="心肌肌红蛋白定性检测选择长度不能超过 32 个字符")
	public String getStemi1442() {
		return stemi1442;
	}

	public void setStemi1442(String stemi1442) {
		this.stemi1442 = stemi1442;
	}
	
	@Length(min=0, max=32, message="B型钠尿肽检测选项长度不能超过 32 个字符")
	public String getStemi1451() {
		return stemi1451;
	}

	public void setStemi1451(String stemi1451) {
		this.stemi1451 = stemi1451;
	}
	
	public Long getStemi1325() {
		return stemi1325;
	}

	public void setStemi1325(Long stemi1325) {
		this.stemi1325 = stemi1325;
	}
	
	@Length(min=0, max=32, message="B型钠尿肽定性检测选择长度不能超过 32 个字符")
	public String getStemi1452() {
		return stemi1452;
	}

	public void setStemi1452(String stemi1452) {
		this.stemi1452 = stemi1452;
	}
	
	@Length(min=0, max=32, message="N端B型钠尿肽前体检测选项长度不能超过 32 个字符")
	public String getStemi1461() {
		return stemi1461;
	}

	public void setStemi1461(String stemi1461) {
		this.stemi1461 = stemi1461;
	}
	
	public Long getStemi1326() {
		return stemi1326;
	}

	public void setStemi1326(Long stemi1326) {
		this.stemi1326 = stemi1326;
	}
	
	@Length(min=0, max=32, message="N端B型钠尿肽前体定性检测选择长度不能超过 32 个字符")
	public String getStemi1462() {
		return stemi1462;
	}

	public void setStemi1462(String stemi1462) {
		this.stemi1462 = stemi1462;
	}
	
	@Length(min=0, max=32, message="是否实施首次X线胸片检查长度不能超过 32 个字符")
	public String getStemi211() {
		return stemi211;
	}

	public void setStemi211(String stemi211) {
		this.stemi211 = stemi211;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi2121() {
		return stemi2121;
	}

	public void setStemi2121(Date stemi2121) {
		this.stemi2121 = stemi2121;
	}
	
	@Length(min=0, max=32, message="是否有肺淤血或肺水肿长度不能超过 32 个字符")
	public String getStemi213() {
		return stemi213;
	}

	public void setStemi213(String stemi213) {
		this.stemi213 = stemi213;
	}
	
	@Length(min=0, max=32, message="是否实施首次超声心动图长度不能超过 32 个字符")
	public String getStemi221() {
		return stemi221;
	}

	public void setStemi221(String stemi221) {
		this.stemi221 = stemi221;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi2221() {
		return stemi2221;
	}

	public void setStemi2221(Date stemi2221) {
		this.stemi2221 = stemi2221;
	}
	
	public Long getStemi2231() {
		return stemi2231;
	}

	public void setStemi2231(Long stemi2231) {
		this.stemi2231 = stemi2231;
	}
	
	public Long getStemi22331() {
		return stemi22331;
	}

	public void setStemi22331(Long stemi22331) {
		this.stemi22331 = stemi22331;
	}
	
	@Length(min=0, max=32, message="是否有左室室壁瘤长度不能超过 32 个字符")
	public String getStemi2234() {
		return stemi2234;
	}

	public void setStemi2234(String stemi2234) {
		this.stemi2234 = stemi2234;
	}
	
	@Length(min=0, max=32, message="是否实施GRACE危险评分评估长度不能超过 32 个字符")
	public String getStemi2311() {
		return stemi2311;
	}

	public void setStemi2311(String stemi2311) {
		this.stemi2311 = stemi2311;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi23121() {
		return stemi23121;
	}

	public void setStemi23121(Date stemi23121) {
		this.stemi23121 = stemi23121;
	}
	
	public Long getStemi23131() {
		return stemi23131;
	}

	public void setStemi23131(Long stemi23131) {
		this.stemi23131 = stemi23131;
	}
	
	@Length(min=0, max=32, message="GRACE危险评估分层的选择长度不能超过 32 个字符")
	public String getStemi2314() {
		return stemi2314;
	}

	public void setStemi2314(String stemi2314) {
		this.stemi2314 = stemi2314;
	}
	
	@Length(min=0, max=32, message="是否实施TIMI危险分层评估长度不能超过 32 个字符")
	public String getStemi2321() {
		return stemi2321;
	}

	public void setStemi2321(String stemi2321) {
		this.stemi2321 = stemi2321;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi23221() {
		return stemi23221;
	}

	public void setStemi23221(Date stemi23221) {
		this.stemi23221 = stemi23221;
	}
	
	public Long getStemi23231() {
		return stemi23231;
	}

	public void setStemi23231(Long stemi23231) {
		this.stemi23231 = stemi23231;
	}
	
	@Length(min=0, max=32, message="TIMI危险分层的选择长度不能超过 32 个字符")
	public String getStemi2324() {
		return stemi2324;
	}

	public void setStemi2324(String stemi2324) {
		this.stemi2324 = stemi2324;
	}
	
	@Length(min=0, max=32, message="是否实施CRUSADE出血风险评分长度不能超过 32 个字符")
	public String getStemi2331() {
		return stemi2331;
	}

	public void setStemi2331(String stemi2331) {
		this.stemi2331 = stemi2331;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi23321() {
		return stemi23321;
	}

	public void setStemi23321(Date stemi23321) {
		this.stemi23321 = stemi23321;
	}
	
	public Long getStemi23331() {
		return stemi23331;
	}

	public void setStemi23331(Long stemi23331) {
		this.stemi23331 = stemi23331;
	}
	
	@Length(min=0, max=32, message="CRUSADE出血风险评分分层的选择长度不能超过 32 个字符")
	public String getStemi2334() {
		return stemi2334;
	}

	public void setStemi2334(String stemi2334) {
		this.stemi2334 = stemi2334;
	}
	
	@Length(min=0, max=32, message="实施再灌注治疗的模式长度不能超过 32 个字符")
	public String getStemi302() {
		return stemi302;
	}

	public void setStemi302(String stemi302) {
		this.stemi302 = stemi302;
	}
	
	@Length(min=0, max=32, message="STEMI溶栓适应证长度不能超过 32 个字符")
	public String getStemi311() {
		return stemi311;
	}

	public void setStemi311(String stemi311) {
		this.stemi311 = stemi311;
	}
	
	@Length(min=0, max=32, message="是否有溶栓治疗禁忌症长度不能超过 32 个字符")
	public String getStemi3121() {
		return stemi3121;
	}

	public void setStemi3121(String stemi3121) {
		this.stemi3121 = stemi3121;
	}
	
	@Length(min=0, max=32, message="绝对禁忌证选择长度不能超过 32 个字符")
	public String getStemi3122() {
		return stemi3122;
	}

	public void setStemi3122(String stemi3122) {
		this.stemi3122 = stemi3122;
	}
	
	@Length(min=0, max=32, message="相对禁忌证选择长度不能超过 32 个字符")
	public String getStemi3123() {
		return stemi3123;
	}

	public void setStemi3123(String stemi3123) {
		this.stemi3123 = stemi3123;
	}
	
	@Length(min=0, max=32, message="是否实施溶栓治疗长度不能超过 32 个字符")
	public String getStemi313() {
		return stemi313;
	}

	public void setStemi313(String stemi313) {
		this.stemi313 = stemi313;
	}
	
	@Length(min=0, max=32, message="溶栓药物选择长度不能超过 32 个字符")
	public String getStemi314() {
		return stemi314;
	}

	public void setStemi314(String stemi314) {
		this.stemi314 = stemi314;
	}
	
	@Length(min=0, max=32, message="其他溶栓药物长度不能超过 32 个字符")
	public String getStemi3141() {
		return stemi3141;
	}

	public void setStemi3141(String stemi3141) {
		this.stemi3141 = stemi3141;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi3151() {
		return stemi3151;
	}

	public void setStemi3151(Date stemi3151) {
		this.stemi3151 = stemi3151;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi3161() {
		return stemi3161;
	}

	public void setStemi3161(Date stemi3161) {
		this.stemi3161 = stemi3161;
	}
	
	public Long getStemi3171() {
		return stemi3171;
	}

	public void setStemi3171(Long stemi3171) {
		this.stemi3171 = stemi3171;
	}
	
	@Length(min=0, max=32, message="临床评估溶栓成功长度不能超过 32 个字符")
	public String getStemi318() {
		return stemi318;
	}

	public void setStemi318(String stemi318) {
		this.stemi318 = stemi318;
	}
	
	@Length(min=0, max=32, message="溶栓治疗并发症的选择长度不能超过 32 个字符")
	public String getStemi319() {
		return stemi319;
	}

	public void setStemi319(String stemi319) {
		this.stemi319 = stemi319;
	}
	
	@Length(min=0, max=32, message="溶栓治疗延迟原因长度不能超过 32 个字符")
	public String getStemi3110() {
		return stemi3110;
	}

	public void setStemi3110(String stemi3110) {
		this.stemi3110 = stemi3110;
	}
	
	@Length(min=0, max=32, message="是否实施PCI治疗长度不能超过 32 个字符")
	public String getStemi321() {
		return stemi321;
	}

	public void setStemi321(String stemi321) {
		this.stemi321 = stemi321;
	}
	
	@Length(min=0, max=32, message="PCI适应证长度不能超过 32 个字符")
	public String getStemi32213() {
		return stemi32213;
	}

	public void setStemi32213(String stemi32213) {
		this.stemi32213 = stemi32213;
	}
	
	@Length(min=0, max=32, message="直接PCI适应证长度不能超过 32 个字符")
	public String getStemi32211() {
		return stemi32211;
	}

	public void setStemi32211(String stemi32211) {
		this.stemi32211 = stemi32211;
	}
	
	@Length(min=0, max=32, message="直接PCI适应证填写长度不能超过 32 个字符")
	public String getStemi322111() {
		return stemi322111;
	}

	public void setStemi322111(String stemi322111) {
		this.stemi322111 = stemi322111;
	}
	
	@Length(min=0, max=32, message="溶栓后PCI适应证长度不能超过 32 个字符")
	public String getStemi32212() {
		return stemi32212;
	}

	public void setStemi32212(String stemi32212) {
		this.stemi32212 = stemi32212;
	}
	
	@Length(min=0, max=32, message="是否有PCI禁忌证长度不能超过 32 个字符")
	public String getStemi322() {
		return stemi322;
	}

	public void setStemi322(String stemi322) {
		this.stemi322 = stemi322;
	}
	
	@Length(min=0, max=32, message="PCI禁忌证选择长度不能超过 32 个字符")
	public String getStemi3221() {
		return stemi3221;
	}

	public void setStemi3221(String stemi3221) {
		this.stemi3221 = stemi3221;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi32221() {
		return stemi32221;
	}

	public void setStemi32221(Date stemi32221) {
		this.stemi32221 = stemi32221;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi32231() {
		return stemi32231;
	}

	public void setStemi32231(Date stemi32231) {
		this.stemi32231 = stemi32231;
	}
	
	@Length(min=0, max=32, message="确诊STEMI至PCI导丝通过梗死相关动脉长度不能超过 32 个字符")
	public String getStemi32241() {
		return stemi32241;
	}

	public void setStemi32241(String stemi32241) {
		this.stemi32241 = stemi32241;
	}
	
	@Length(min=0, max=32, message="治疗延迟原因选择长度不能超过 32 个字符")
	public String getStemi3225() {
		return stemi3225;
	}

	public void setStemi3225(String stemi3225) {
		this.stemi3225 = stemi3225;
	}
	
	@Length(min=0, max=32, message="主要病变血管长度不能超过 32 个字符")
	public String getStemi3231() {
		return stemi3231;
	}

	public void setStemi3231(String stemi3231) {
		this.stemi3231 = stemi3231;
	}
	
	@Length(min=0, max=32, message="LAD-冠状动脉狭窄程度分级长度不能超过 32 个字符")
	public String getStemi32321() {
		return stemi32321;
	}

	public void setStemi32321(String stemi32321) {
		this.stemi32321 = stemi32321;
	}
	
	@Length(min=0, max=32, message="LAD-术前主要靶血管TIMI血流分级的选择长度不能超过 32 个字符")
	public String getStemi32325() {
		return stemi32325;
	}

	public void setStemi32325(String stemi32325) {
		this.stemi32325 = stemi32325;
	}
	
	@Length(min=0, max=32, message="LCX-冠状动脉狭窄程度分级长度不能超过 32 个字符")
	public String getStemi32322() {
		return stemi32322;
	}

	public void setStemi32322(String stemi32322) {
		this.stemi32322 = stemi32322;
	}
	
	@Length(min=0, max=32, message="LCX-术前主要靶血管TIMI血流分级的选择长度不能超过 32 个字符")
	public String getStemi32326() {
		return stemi32326;
	}

	public void setStemi32326(String stemi32326) {
		this.stemi32326 = stemi32326;
	}
	
	@Length(min=0, max=32, message="RCA-冠状动脉狭窄程度分级长度不能超过 32 个字符")
	public String getStemi32323() {
		return stemi32323;
	}

	public void setStemi32323(String stemi32323) {
		this.stemi32323 = stemi32323;
	}
	
	@Length(min=0, max=32, message="RCA-术前主要靶血管TIMI血流分级的选择长度不能超过 32 个字符")
	public String getStemi32327() {
		return stemi32327;
	}

	public void setStemi32327(String stemi32327) {
		this.stemi32327 = stemi32327;
	}
	
	@Length(min=0, max=32, message="LM-冠状动脉狭窄程度分级长度不能超过 32 个字符")
	public String getStemi32324() {
		return stemi32324;
	}

	public void setStemi32324(String stemi32324) {
		this.stemi32324 = stemi32324;
	}
	
	@Length(min=0, max=32, message="LM-术前主要靶血管TIMI血流分级的选择长度不能超过 32 个字符")
	public String getStemi32328() {
		return stemi32328;
	}

	public void setStemi32328(String stemi32328) {
		this.stemi32328 = stemi32328;
	}
	
	@Length(min=0, max=32, message="PCI治疗主要靶血管长度不能超过 32 个字符")
	public String getStemi3233() {
		return stemi3233;
	}

	public void setStemi3233(String stemi3233) {
		this.stemi3233 = stemi3233;
	}
	
	@Length(min=0, max=32, message="LM-PCI术后即刻主要靶血管TIMI血流分级的选择长度不能超过 32 个字符")
	public String getStemi32331() {
		return stemi32331;
	}

	public void setStemi32331(String stemi32331) {
		this.stemi32331 = stemi32331;
	}
	
	@Length(min=0, max=32, message="LM-置入冠状动脉支架选择长度不能超过 32 个字符")
	public String getStemi32332() {
		return stemi32332;
	}

	public void setStemi32332(String stemi32332) {
		this.stemi32332 = stemi32332;
	}
	
	@Length(min=0, max=32, message="LM-置入冠状动脉支架填写长度不能超过 32 个字符")
	public String getStemi323321() {
		return stemi323321;
	}

	public void setStemi323321(String stemi323321) {
		this.stemi323321 = stemi323321;
	}
	
	@Length(min=0, max=32, message="LAD-PCI术后即刻主要靶血管TIMI血流分级的选择长度不能超过 32 个字符")
	public String getStemi32333() {
		return stemi32333;
	}

	public void setStemi32333(String stemi32333) {
		this.stemi32333 = stemi32333;
	}
	
	@Length(min=0, max=32, message="LAD-置入冠状动脉支架选择长度不能超过 32 个字符")
	public String getStemi32334() {
		return stemi32334;
	}

	public void setStemi32334(String stemi32334) {
		this.stemi32334 = stemi32334;
	}
	
	@Length(min=0, max=32, message="LAD-置入冠状动脉支架填写长度不能超过 32 个字符")
	public String getStemi323341() {
		return stemi323341;
	}

	public void setStemi323341(String stemi323341) {
		this.stemi323341 = stemi323341;
	}
	
	@Length(min=0, max=32, message="LCX-PCI术后即刻主要靶血管TIMI血流分级的选择长度不能超过 32 个字符")
	public String getStemi32335() {
		return stemi32335;
	}

	public void setStemi32335(String stemi32335) {
		this.stemi32335 = stemi32335;
	}
	
	@Length(min=0, max=32, message="LCX-置入冠状动脉支架选择长度不能超过 32 个字符")
	public String getStemi32336() {
		return stemi32336;
	}

	public void setStemi32336(String stemi32336) {
		this.stemi32336 = stemi32336;
	}
	
	@Length(min=0, max=32, message="LCX-置入冠状动脉支架填写长度不能超过 32 个字符")
	public String getStemi323361() {
		return stemi323361;
	}

	public void setStemi323361(String stemi323361) {
		this.stemi323361 = stemi323361;
	}
	
	@Length(min=0, max=32, message="LM-LAD-PCI术后即刻主要靶血管TIMI血流分级的选择长度不能超过 32 个字符")
	public String getStemi32337() {
		return stemi32337;
	}

	public void setStemi32337(String stemi32337) {
		this.stemi32337 = stemi32337;
	}
	
	@Length(min=0, max=32, message="LM-LAD-置入冠状动脉支架选择长度不能超过 32 个字符")
	public String getStemi32338() {
		return stemi32338;
	}

	public void setStemi32338(String stemi32338) {
		this.stemi32338 = stemi32338;
	}
	
	@Length(min=0, max=32, message="LM-LAD-置入冠状动脉支架填写长度不能超过 32 个字符")
	public String getStemi323381() {
		return stemi323381;
	}

	public void setStemi323381(String stemi323381) {
		this.stemi323381 = stemi323381;
	}
	
	@Length(min=0, max=32, message="LM-LCX-PCI术后即刻主要靶血管TIMI血流分级的选择长度不能超过 32 个字符")
	public String getStemi32391() {
		return stemi32391;
	}

	public void setStemi32391(String stemi32391) {
		this.stemi32391 = stemi32391;
	}
	
	@Length(min=0, max=32, message="LM-LCX-置入冠状动脉支架选择长度不能超过 32 个字符")
	public String getStemi323310() {
		return stemi323310;
	}

	public void setStemi323310(String stemi323310) {
		this.stemi323310 = stemi323310;
	}
	
	@Length(min=0, max=32, message="LM-LCX-置入冠状动脉支架填写长度不能超过 32 个字符")
	public String getStemi3233101() {
		return stemi3233101;
	}

	public void setStemi3233101(String stemi3233101) {
		this.stemi3233101 = stemi3233101;
	}
	
	@Length(min=0, max=32, message="RCA-PCI术后即刻主要靶血管TIMI血流分级的选择长度不能超过 32 个字符")
	public String getStemi323311() {
		return stemi323311;
	}

	public void setStemi323311(String stemi323311) {
		this.stemi323311 = stemi323311;
	}
	
	@Length(min=0, max=32, message="RCA-置入冠状动脉支架选择长度不能超过 32 个字符")
	public String getStemi323312() {
		return stemi323312;
	}

	public void setStemi323312(String stemi323312) {
		this.stemi323312 = stemi323312;
	}
	
	@Length(min=0, max=32, message="RCA-置入冠状动脉支架填写长度不能超过 32 个字符")
	public String getStemi3233121() {
		return stemi3233121;
	}

	public void setStemi3233121(String stemi3233121) {
		this.stemi3233121 = stemi3233121;
	}
	
	@Length(min=0, max=32, message="LM-中间支-PCI术后即刻主要靶血管TIMI血流分级的选择长度不能超过 32 个字符")
	public String getStemi323313() {
		return stemi323313;
	}

	public void setStemi323313(String stemi323313) {
		this.stemi323313 = stemi323313;
	}
	
	@Length(min=0, max=32, message="LM-中间支-置入冠状动脉支架选择长度不能超过 32 个字符")
	public String getStemi323314() {
		return stemi323314;
	}

	public void setStemi323314(String stemi323314) {
		this.stemi323314 = stemi323314;
	}
	
	@Length(min=0, max=32, message="LM-中间支-置入冠状动脉支架填写长度不能超过 32 个字符")
	public String getStemi3233141() {
		return stemi3233141;
	}

	public void setStemi3233141(String stemi3233141) {
		this.stemi3233141 = stemi3233141;
	}
	
	@Length(min=0, max=32, message="中间支-PCI术后即刻主要靶血管TIMI血流分级的选择长度不能超过 32 个字符")
	public String getStemi323151() {
		return stemi323151;
	}

	public void setStemi323151(String stemi323151) {
		this.stemi323151 = stemi323151;
	}
	
	@Length(min=0, max=32, message="中间支-置入冠状动脉支架选择长度不能超过 32 个字符")
	public String getStemi323316() {
		return stemi323316;
	}

	public void setStemi323316(String stemi323316) {
		this.stemi323316 = stemi323316;
	}
	
	@Length(min=0, max=32, message="中间支-置入冠状动脉支架填写长度不能超过 32 个字符")
	public String getStemi3233161() {
		return stemi3233161;
	}

	public void setStemi3233161(String stemi3233161) {
		this.stemi3233161 = stemi3233161;
	}
	
	@Length(min=0, max=32, message="ICD-9-CM-3编码与名称长度不能超过 32 个字符")
	public String getStemi3241() {
		return stemi3241;
	}

	public void setStemi3241(String stemi3241) {
		this.stemi3241 = stemi3241;
	}
	
	@Length(min=0, max=32, message="治疗血管的数量的选择长度不能超过 32 个字符")
	public String getStemi3242() {
		return stemi3242;
	}

	public void setStemi3242(String stemi3242) {
		this.stemi3242 = stemi3242;
	}
	
	@Length(min=0, max=32, message="置入血管支架的数量现在长度不能超过 32 个字符")
	public String getStemi3243() {
		return stemi3243;
	}

	public void setStemi3243(String stemi3243) {
		this.stemi3243 = stemi3243;
	}
	
	@Length(min=0, max=32, message="心脏团队讨论决策模式的选择长度不能超过 32 个字符")
	public String getStemi3244() {
		return stemi3244;
	}

	public void setStemi3244(String stemi3244) {
		this.stemi3244 = stemi3244;
	}
	
	@Length(min=0, max=32, message="近期主要并发症的选择长度不能超过 32 个字符")
	public String getStemi3251() {
		return stemi3251;
	}

	public void setStemi3251(String stemi3251) {
		this.stemi3251 = stemi3251;
	}
	
	@Length(min=0, max=32, message="其他近期主要并发症长度不能超过 32 个字符")
	public String getStemi32511() {
		return stemi32511;
	}

	public void setStemi32511(String stemi32511) {
		this.stemi32511 = stemi32511;
	}
	
	@Length(min=0, max=32, message="近期并发症治疗主要措施的选择长度不能超过 32 个字符")
	public String getStemi3252() {
		return stemi3252;
	}

	public void setStemi3252(String stemi3252) {
		this.stemi3252 = stemi3252;
	}
	
	@Length(min=0, max=32, message="其他近期并发症治疗主要措施长度不能超过 32 个字符")
	public String getStemi32521() {
		return stemi32521;
	}

	public void setStemi32521(String stemi32521) {
		this.stemi32521 = stemi32521;
	}
	
	@Length(min=0, max=32, message="是否实施CathPCI风险评估长度不能超过 32 个字符")
	public String getStemi3261() {
		return stemi3261;
	}

	public void setStemi3261(String stemi3261) {
		this.stemi3261 = stemi3261;
	}
	
	public Long getStemi326211() {
		return stemi326211;
	}

	public void setStemi326211(Long stemi326211) {
		this.stemi326211 = stemi326211;
	}
	
	public Long getStemi32622() {
		return stemi32622;
	}

	public void setStemi32622(Long stemi32622) {
		this.stemi32622 = stemi32622;
	}
	
	@Length(min=0, max=32, message="是否实施围术期抗凝治疗长度不能超过 32 个字符")
	public String getStemi3271() {
		return stemi3271;
	}

	public void setStemi3271(String stemi3271) {
		this.stemi3271 = stemi3271;
	}
	
	@Length(min=0, max=32, message="肠外抗凝药物选择长度不能超过 32 个字符")
	public String getStemi3272() {
		return stemi3272;
	}

	public void setStemi3272(String stemi3272) {
		this.stemi3272 = stemi3272;
	}
	
	@Length(min=0, max=32, message="其他肠外抗凝药物长度不能超过 32 个字符")
	public String getStemi3273() {
		return stemi3273;
	}

	public void setStemi3273(String stemi3273) {
		this.stemi3273 = stemi3273;
	}
	
	@Length(min=0, max=32, message="长度不能超过 32 个字符")
	public String getStemi330() {
		return stemi330;
	}

	public void setStemi330(String stemi330) {
		this.stemi330 = stemi330;
	}
	
	@Length(min=0, max=32, message="医院自身原因长度不能超过 32 个字符")
	public String getStemi3311() {
		return stemi3311;
	}

	public void setStemi3311(String stemi3311) {
		this.stemi3311 = stemi3311;
	}
	
	@Length(min=0, max=32, message="其他医院自身原因长度不能超过 32 个字符")
	public String getStemi33111() {
		return stemi33111;
	}

	public void setStemi33111(String stemi33111) {
		this.stemi33111 = stemi33111;
	}
	
	@Length(min=0, max=32, message="患者自身原因转院长度不能超过 32 个字符")
	public String getStemi3312() {
		return stemi3312;
	}

	public void setStemi3312(String stemi3312) {
		this.stemi3312 = stemi3312;
	}
	
	@Length(min=0, max=32, message="其他患者自身原因长度不能超过 32 个字符")
	public String getStemi33121() {
		return stemi33121;
	}

	public void setStemi33121(String stemi33121) {
		this.stemi33121 = stemi33121;
	}
	
	@Length(min=0, max=32, message="转院类型及适应症长度不能超过 32 个字符")
	public String getStemi332() {
		return stemi332;
	}

	public void setStemi332(String stemi332) {
		this.stemi332 = stemi332;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi3331() {
		return stemi3331;
	}

	public void setStemi3331(Date stemi3331) {
		this.stemi3331 = stemi3331;
	}
	
	public Long getStemi3341() {
		return stemi3341;
	}

	public void setStemi3341(Long stemi3341) {
		this.stemi3341 = stemi3341;
	}
	
	@Length(min=0, max=32, message="医院是否具备接受外院“转院PCI”患者的能力长度不能超过 32 个字符")
	public String getStemi34() {
		return stemi34;
	}

	public void setStemi34(String stemi34) {
		this.stemi34 = stemi34;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi3411() {
		return stemi3411;
	}

	public void setStemi3411(Date stemi3411) {
		this.stemi3411 = stemi3411;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi3421() {
		return stemi3421;
	}

	public void setStemi3421(Date stemi3421) {
		this.stemi3421 = stemi3421;
	}
	
	public Long getStemi3431() {
		return stemi3431;
	}

	public void setStemi3431(Long stemi3431) {
		this.stemi3431 = stemi3431;
	}
	
	@Length(min=0, max=32, message="治疗延迟原因选择长度不能超过 32 个字符")
	public String getStemi344() {
		return stemi344;
	}

	public void setStemi344(String stemi344) {
		this.stemi344 = stemi344;
	}
	
	@Length(min=0, max=32, message="是否有β-受体阻滞剂禁忌证长度不能超过 32 个字符")
	public String getStemi411() {
		return stemi411;
	}

	public void setStemi411(String stemi411) {
		this.stemi411 = stemi411;
	}
	
	@Length(min=0, max=32, message="β-受体阻滞剂禁忌症长度不能超过 32 个字符")
	public String getStemi4121() {
		return stemi4121;
	}

	public void setStemi4121(String stemi4121) {
		this.stemi4121 = stemi4121;
	}
	
	@Length(min=0, max=32, message="其他β-受体阻滞剂禁忌症长度不能超过 32 个字符")
	public String getStemi41211() {
		return stemi41211;
	}

	public void setStemi41211(String stemi41211) {
		this.stemi41211 = stemi41211;
	}
	
	@Length(min=0, max=32, message="β-受体阻滞剂相对禁忌症长度不能超过 32 个字符")
	public String getStemi4122() {
		return stemi4122;
	}

	public void setStemi4122(String stemi4122) {
		this.stemi4122 = stemi4122;
	}
	
	@Length(min=0, max=32, message="其他β-受体阻滞剂相对禁忌症长度不能超过 32 个字符")
	public String getStemi41221() {
		return stemi41221;
	}

	public void setStemi41221(String stemi41221) {
		this.stemi41221 = stemi41221;
	}
	
	@Length(min=0, max=32, message="使用首剂β-受体阻滞剂长度不能超过 32 个字符")
	public String getStemi42() {
		return stemi42;
	}

	public void setStemi42(String stemi42) {
		this.stemi42 = stemi42;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStemi431() {
		return stemi431;
	}

	public void setStemi431(Date stemi431) {
		this.stemi431 = stemi431;
	}
	
	@Length(min=0, max=32, message="双联抗血小板药物是否有用药长期医嘱长度不能超过 32 个字符")
	public String getStemi511() {
		return stemi511;
	}

	public void setStemi511(String stemi511) {
		this.stemi511 = stemi511;
	}
	
	@Length(min=0, max=32, message="双联抗血小板药物品名的选择长度不能超过 32 个字符")
	public String getStemi512() {
		return stemi512;
	}

	public void setStemi512(String stemi512) {
		this.stemi512 = stemi512;
	}
	
	@Length(min=0, max=32, message="双联抗血小板药物品名填写长度不能超过 32 个字符")
	public String getStemi5121() {
		return stemi5121;
	}

	public void setStemi5121(String stemi5121) {
		this.stemi5121 = stemi5121;
	}
	
	@Length(min=0, max=32, message="β阻滞剂是否有用药长期医嘱长度不能超过 32 个字符")
	public String getStemi521() {
		return stemi521;
	}

	public void setStemi521(String stemi521) {
		this.stemi521 = stemi521;
	}
	
	@Length(min=0, max=32, message="长期医嘱中使用β-受体阻滞剂品名的选择长度不能超过 32 个字符")
	public String getStemi522() {
		return stemi522;
	}

	public void setStemi522(String stemi522) {
		this.stemi522 = stemi522;
	}
	
	@Length(min=0, max=32, message="是否有ACEI抑制剂/ARB类药物禁忌症长度不能超过 32 个字符")
	public String getStemi531() {
		return stemi531;
	}

	public void setStemi531(String stemi531) {
		this.stemi531 = stemi531;
	}
	
	@Length(min=0, max=32, message="ACE抑制剂/ARB类药物禁忌症的选择长度不能超过 32 个字符")
	public String getStemi532() {
		return stemi532;
	}

	public void setStemi532(String stemi532) {
		this.stemi532 = stemi532;
	}
	
	@Length(min=0, max=32, message="是否有ACEI抑制剂/ARB类药物长期医嘱长度不能超过 32 个字符")
	public String getStemi533() {
		return stemi533;
	}

	public void setStemi533(String stemi533) {
		this.stemi533 = stemi533;
	}
	
	@Length(min=0, max=32, message="使用ACE抑制剂药物名称的选择长度不能超过 32 个字符")
	public String getStemi534A() {
		return stemi534A;
	}

	public void setStemi534A(String stemi534A) {
		this.stemi534A = stemi534A;
	}
	
	@Length(min=0, max=32, message="其他ACE抑制剂药物长度不能超过 32 个字符")
	public String getStemi534A1() {
		return stemi534A1;
	}

	public void setStemi534A1(String stemi534A1) {
		this.stemi534A1 = stemi534A1;
	}
	
	@Length(min=0, max=32, message="使用ARB类药物名称的选择长度不能超过 32 个字符")
	public String getStemi534B() {
		return stemi534B;
	}

	public void setStemi534B(String stemi534B) {
		this.stemi534B = stemi534B;
	}
	
	@Length(min=0, max=32, message="其他ARB类药物长度不能超过 32 个字符")
	public String getStemi534B1() {
		return stemi534B1;
	}

	public void setStemi534B1(String stemi534B1) {
		this.stemi534B1 = stemi534B1;
	}
	
	@Length(min=0, max=32, message="是否有他汀类药禁忌证长度不能超过 32 个字符")
	public String getStemi541() {
		return stemi541;
	}

	public void setStemi541(String stemi541) {
		this.stemi541 = stemi541;
	}
	
	@Length(min=0, max=32, message="他汀类药物禁忌证的选择长度不能超过 32 个字符")
	public String getStemi542() {
		return stemi542;
	}

	public void setStemi542(String stemi542) {
		this.stemi542 = stemi542;
	}
	
	@Length(min=0, max=32, message="是否有用药长期医嘱长度不能超过 32 个字符")
	public String getStemi543() {
		return stemi543;
	}

	public void setStemi543(String stemi543) {
		this.stemi543 = stemi543;
	}
	
	@Length(min=0, max=32, message="给予他汀类药物名称的选择长度不能超过 32 个字符")
	public String getStemi544() {
		return stemi544;
	}

	public void setStemi544(String stemi544) {
		this.stemi544 = stemi544;
	}
	
	@Length(min=0, max=32, message="其他其他降脂药物长度不能超过 32 个字符")
	public String getStemi5441() {
		return stemi5441;
	}

	public void setStemi5441(String stemi5441) {
		this.stemi5441 = stemi5441;
	}
	
	@Length(min=0, max=32, message="是否有出院带药医嘱-抗血小板药物长度不能超过 32 个字符")
	public String getStemi61() {
		return stemi61;
	}

	public void setStemi61(String stemi61) {
		this.stemi61 = stemi61;
	}
	
	@Length(min=0, max=32, message="双联抗血小板药物品名的选择长度不能超过 32 个字符")
	public String getStemi612() {
		return stemi612;
	}

	public void setStemi612(String stemi612) {
		this.stemi612 = stemi612;
	}
	
	@Length(min=0, max=32, message="其他双联抗血小板药物品长度不能超过 32 个字符")
	public String getStemi6121() {
		return stemi6121;
	}

	public void setStemi6121(String stemi6121) {
		this.stemi6121 = stemi6121;
	}
	
	@Length(min=0, max=32, message="是否有β阻滞剂出院带药医嘱长度不能超过 32 个字符")
	public String getStemi62() {
		return stemi62;
	}

	public void setStemi62(String stemi62) {
		this.stemi62 = stemi62;
	}
	
	@Length(min=0, max=32, message="使用β-受体阻滞剂品名的选择长度不能超过 32 个字符")
	public String getStemi622() {
		return stemi622;
	}

	public void setStemi622(String stemi622) {
		this.stemi622 = stemi622;
	}
	
	@Length(min=0, max=32, message="是否有出院带药医嘱-ACEI抑制剂/ARB类药物医嘱长度不能超过 32 个字符")
	public String getStemi63() {
		return stemi63;
	}

	public void setStemi63(String stemi63) {
		this.stemi63 = stemi63;
	}
	
	@Length(min=0, max=32, message="使用ACEI抑制剂或者ARB类药物长度不能超过 32 个字符")
	public String getStemi632() {
		return stemi632;
	}

	public void setStemi632(String stemi632) {
		this.stemi632 = stemi632;
	}
	
	@Length(min=0, max=32, message="使用ACE抑制剂药物名称的选择长度不能超过 32 个字符")
	public String getStemi632A() {
		return stemi632A;
	}

	public void setStemi632A(String stemi632A) {
		this.stemi632A = stemi632A;
	}
	
	@Length(min=0, max=32, message="其他ACE抑制剂药物长度不能超过 32 个字符")
	public String getStemi632A1() {
		return stemi632A1;
	}

	public void setStemi632A1(String stemi632A1) {
		this.stemi632A1 = stemi632A1;
	}
	
	@Length(min=0, max=32, message="使用ARB类药物名称的选择长度不能超过 32 个字符")
	public String getStemi632B() {
		return stemi632B;
	}

	public void setStemi632B(String stemi632B) {
		this.stemi632B = stemi632B;
	}
	
	@Length(min=0, max=32, message="其他ARB类药物长度不能超过 32 个字符")
	public String getStemi632B1() {
		return stemi632B1;
	}

	public void setStemi632B1(String stemi632B1) {
		this.stemi632B1 = stemi632B1;
	}
	
	@Length(min=0, max=32, message="是否有出院带药医嘱-他汀类药物医嘱长度不能超过 32 个字符")
	public String getStemi64() {
		return stemi64;
	}

	public void setStemi64(String stemi64) {
		this.stemi64 = stemi64;
	}
	
	@Length(min=0, max=32, message="给予他汀类药物名称的选择长度不能超过 32 个字符")
	public String getStemi642() {
		return stemi642;
	}

	public void setStemi642(String stemi642) {
		this.stemi642 = stemi642;
	}
	
	@Length(min=0, max=32, message="其他降脂药物长度不能超过 32 个字符")
	public String getStemi6421() {
		return stemi6421;
	}

	public void setStemi6421(String stemi6421) {
		this.stemi6421 = stemi6421;
	}
	
	@Length(min=0, max=32, message="是否有醛固酮受体拮抗剂药物禁忌证长度不能超过 32 个字符")
	public String getStemi651() {
		return stemi651;
	}

	public void setStemi651(String stemi651) {
		this.stemi651 = stemi651;
	}
	
	@Length(min=0, max=32, message="醛固酮受体拮抗剂药物禁忌证的选择长度不能超过 32 个字符")
	public String getStemi652() {
		return stemi652;
	}

	public void setStemi652(String stemi652) {
		this.stemi652 = stemi652;
	}
	
	@Length(min=0, max=32, message="醛固酮受体拮抗剂药物禁忌证填写长度不能超过 32 个字符")
	public String getStemi6521() {
		return stemi6521;
	}

	public void setStemi6521(String stemi6521) {
		this.stemi6521 = stemi6521;
	}
	
	@Length(min=0, max=32, message="是否有醛固酮受体拮抗剂药物适应证长度不能超过 32 个字符")
	public String getStemi653() {
		return stemi653;
	}

	public void setStemi653(String stemi653) {
		this.stemi653 = stemi653;
	}
	
	@Length(min=0, max=32, message="醛固酮受体拮抗剂药物适应证的选择长度不能超过 32 个字符")
	public String getStemi654() {
		return stemi654;
	}

	public void setStemi654(String stemi654) {
		this.stemi654 = stemi654;
	}
	
	@Length(min=0, max=32, message="是否有出院带药医嘱-醛固酮受体拮抗剂长度不能超过 32 个字符")
	public String getStemi655() {
		return stemi655;
	}

	public void setStemi655(String stemi655) {
		this.stemi655 = stemi655;
	}
	
	@Length(min=0, max=32, message="出院带药医嘱中使用醛固酮受体拮抗剂品名的选择长度不能超过 32 个字符")
	public String getStemi656() {
		return stemi656;
	}

	public void setStemi656(String stemi656) {
		this.stemi656 = stemi656;
	}
	
	@Length(min=0, max=32, message="其他醛固酮受体拮抗剂品名长度不能超过 32 个字符")
	public String getStemi6561() {
		return stemi6561;
	}

	public void setStemi6561(String stemi6561) {
		this.stemi6561 = stemi6561;
	}
	
	@Length(min=0, max=32, message="血脂评价时间长度不能超过 32 个字符")
	public String getStemi71() {
		return stemi71;
	}

	public void setStemi71(String stemi71) {
		this.stemi71 = stemi71;
	}
	
	@Length(min=0, max=32, message="血脂评价结果长度不能超过 32 个字符")
	public String getStemi72() {
		return stemi72;
	}

	public void setStemi72(String stemi72) {
		this.stemi72 = stemi72;
	}
	
	@Length(min=0, max=32, message="是否有他汀药物禁忌症长度不能超过 32 个字符")
	public String getStemi731() {
		return stemi731;
	}

	public void setStemi731(String stemi731) {
		this.stemi731 = stemi731;
	}
	
	@Length(min=0, max=32, message="他汀类药物禁忌证的选择长度不能超过 32 个字符")
	public String getStemi732() {
		return stemi732;
	}

	public void setStemi732(String stemi732) {
		this.stemi732 = stemi732;
	}
	
	@Length(min=0, max=32, message="是否有他汀类药物长期医嘱长度不能超过 32 个字符")
	public String getStemi74() {
		return stemi74;
	}

	public void setStemi74(String stemi74) {
		this.stemi74 = stemi74;
	}
	
	@Length(min=0, max=32, message="是否有他汀类药物出院带药医嘱长度不能超过 32 个字符")
	public String getStemi75() {
		return stemi75;
	}

	public void setStemi75(String stemi75) {
		this.stemi75 = stemi75;
	}
	
	@Length(min=0, max=32, message="吸烟史长度不能超过 32 个字符")
	public String getStemi811() {
		return stemi811;
	}

	public void setStemi811(String stemi811) {
		this.stemi811 = stemi811;
	}
	
	@Length(min=0, max=32, message="吸烟程度评估有记录长度不能超过 32 个字符")
	public String getStemi812() {
		return stemi812;
	}

	public void setStemi812(String stemi812) {
		this.stemi812 = stemi812;
	}
	
	@Length(min=0, max=32, message="接受戒烟的建议或者戒烟治疗有记录长度不能超过 32 个字符")
	public String getStemi813() {
		return stemi813;
	}

	public void setStemi813(String stemi813) {
		this.stemi813 = stemi813;
	}
	
	@Length(min=0, max=32, message="长度不能超过 32 个字符")
	public String getStemi821() {
		return stemi821;
	}

	public void setStemi821(String stemi821) {
		this.stemi821 = stemi821;
	}
	
	@Length(min=0, max=32, message="实施针对控制危险因素评估结果的教育长度不能超过 32 个字符")
	public String getStemi822() {
		return stemi822;
	}

	public void setStemi822(String stemi822) {
		this.stemi822 = stemi822;
	}
	
	@Length(min=0, max=32, message="二级预防长度不能超过 32 个字符")
	public String getStemi83() {
		return stemi83;
	}

	public void setStemi83(String stemi83) {
		this.stemi83 = stemi83;
	}
	
	@Length(min=0, max=32, message="交与患者“出院小结”的副本告知患者出院时风险因素长度不能超过 32 个字符")
	public String getStemi841() {
		return stemi841;
	}

	public void setStemi841(String stemi841) {
		this.stemi841 = stemi841;
	}
	
	@Length(min=0, max=32, message="出院带药长度不能超过 32 个字符")
	public String getStemi842() {
		return stemi842;
	}

	public void setStemi842(String stemi842) {
		this.stemi842 = stemi842;
	}
	
	@Length(min=0, max=32, message="告知发生紧急情况时求援救治途径长度不能超过 32 个字符")
	public String getStemi843() {
		return stemi843;
	}

	public void setStemi843(String stemi843) {
		this.stemi843 = stemi843;
	}
	
	@Length(min=0, max=32, message="出院时教育与随访长度不能超过 32 个字符")
	public String getStemi844() {
		return stemi844;
	}

	public void setStemi844(String stemi844) {
		this.stemi844 = stemi844;
	}
	
	@Length(min=0, max=32, message="告知何为风险因素与紧急情况长度不能超过 32 个字符")
	public String getStemi845() {
		return stemi845;
	}

	public void setStemi845(String stemi845) {
		this.stemi845 = stemi845;
	}
	
	@Length(min=0, max=32, message="出院时状态评估结果长度不能超过 32 个字符")
	public String getStemi921() {
		return stemi921;
	}

	public void setStemi921(String stemi921) {
		this.stemi921 = stemi921;
	}
	
	@Length(min=0, max=32, message="其他出院时状态填写长度不能超过 32 个字符")
	public String getStemi9211() {
		return stemi9211;
	}

	public void setStemi9211(String stemi9211) {
		this.stemi9211 = stemi9211;
	}
	
	@Length(min=0, max=32, message="末次GRACE危险评估是否有记录长度不能超过 32 个字符")
	public String getStemi922A2() {
		return stemi922A2;
	}

	public void setStemi922A2(String stemi922A2) {
		this.stemi922A2 = stemi922A2;
	}
	
	@Length(min=0, max=32, message="末次GRACE危险评估长度不能超过 32 个字符")
	public String getStemi922A11() {
		return stemi922A11;
	}

	public void setStemi922A11(String stemi922A11) {
		this.stemi922A11 = stemi922A11;
	}
	
	@Length(min=0, max=32, message="GRACE危险评估分层的选择长度不能超过 32 个字符")
	public String getStemi922A3() {
		return stemi922A3;
	}

	public void setStemi922A3(String stemi922A3) {
		this.stemi922A3 = stemi922A3;
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
	
}