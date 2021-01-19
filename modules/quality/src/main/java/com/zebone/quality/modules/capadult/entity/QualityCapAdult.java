/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.capadult.entity;

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
 * Cap-Adult社区获得性肺炎（成人，首次住院）Entity
 * @author 卡卡西
 * @version 2021-01-18
 */
@Table(name="quality_cap_adult", alias="a", columns={
		@Column(name="cm_0_1_1_1", attrName="cm_0_1_1_1", label="质控医师"),
		@Column(name="cm_0_1_1_2", attrName="cm_0_1_1_2", label="质控护士"),
		@Column(name="cm_0_1_1_3", attrName="cm_0_1_1_3", label="主治医师"),
		@Column(name="cm_0_1_1_4", attrName="cm_0_1_1_4", label="责任护士"),
		@Column(name="cm_0_1_1_5", attrName="cm_0_1_1_5", label="上报科室"),
		@Column(name="case_id", attrName="caseId", label="患者病案号"),
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
		@Column(name="cm_0_2_3_1", attrName="cm_0_2_3_1", label="到达本院急诊或者门诊日期时间是否无法确定或无记录"),
		@Column(name="cm_0_2_3_2", attrName="cm_0_2_3_2", label="到达本院急诊或者门诊日期时间"),
		@Column(includeEntity=DataEntity.class),
		@Column(name="cm_0_2_4_1", attrName="cm_0_2_4_1", label="入院日期时间"),
		@Column(name="cm_0_2_4_2", attrName="cm_0_2_4_2", label="出院日期时间"),
		@Column(name="cm_0_2_5_1", attrName="cm_0_2_5_1", label="入住CCU日期时间"),
		@Column(name="cm_0_2_5_2", attrName="cm_0_2_5_2", label="离开CCU日期时间"),
		@Column(name="cm_0_3_1", attrName="cm_0_3_1", label="费用支付方式"),
		@Column(name="cm_0_3_2", attrName="cm_0_3_2", label="收入住院途径"),
		@Column(name="cm_0_3_3", attrName="cm_0_3_3", label="到院交通工具"),
		@Column(name="cap_adult_1_1", attrName="cap_adult_1_1", label="是否实施CAP病情严重程度的评价"),
		@Column(name="cap_adult_1", attrName="cap_adult_1", label="病情严重程度的评价"),
		@Column(name="cap_adult_1_1_1", attrName="cap_adult_1_1_1", label="首次CURB-65评分数值"),
		@Column(name="cap_adult_1_1_1_1", attrName="cap_adult_1_1_1_1", label="风险程度评估"),
		@Column(name="cap_adult_1_1_2", attrName="cap_adult_1_1_2", label="首次PSI评分数值"),
		@Column(name="cap_adult_1_1_2_1", attrName="cap_adult_1_1_2_1", label="风险程度评估"),
		@Column(name="cap_adult_1_1_3", attrName="cap_adult_1_1_3", label="CRB-65 评分数值"),
		@Column(name="cap_adult_1_1_3_1", attrName="cap_adult_1_1_3_1", label="风险程度评估"),
		@Column(name="cap_adult_1_1_4", attrName="cap_adult_1_1_4", label="SMART-COP评分数值"),
		@Column(name="cap_adult_1_1_4_1", attrName="cap_adult_1_1_4_1", label="风险程度评估"),
		@Column(name="cap_adult_1_2_1", attrName="cap_adult_1_2_1", label="是否重症肺炎诊断"),
		@Column(name="cap_adult_1_2_2", attrName="cap_adult_1_2_2", label="重症肺炎诊断主要标准"),
		@Column(name="cap_adult_1_2_3", attrName="cap_adult_1_2_3", label="重症肺炎诊断次要标准"),
		@Column(name="cap_adult_2_1", attrName="cap_adult_2_1", label="是否实施首次氧合评估", comment="是否实施首次氧合评估（首次）"),
		@Column(name="cap_adult_2_2", attrName="cap_adult_2_2", label="实施首次氧合评估时段"),
		@Column(name="cap_adult_2_3", attrName="cap_adult_2_3", label="实施首次氧合评估时是否吸氧", comment="实施首次氧合评估时是否吸氧（FiO2）"),
		@Column(name="cap_adult_2_4", attrName="cap_adult_2_4", label="动脉血气分析/指氧仪检查"),
		@Column(name="cap_adult_2_4_3", attrName="cap_adult_2_4_3", label="动脉血气分析值", comment="动脉血气分析值(mmhg)"),
		@Column(name="cap_adult_2_4_4", attrName="cap_adult_2_4_4", label="指氧仪检查值", comment="指氧仪检查值(%)"),
		@Column(name="cap_adult_3_1_1", attrName="cap_adult_3_1_1", label="住院的患者, 是否实施病原学诊断"),
		@Column(name="cap_adult_3_1_2", attrName="cap_adult_3_1_2", label="实施首次采集标本时段"),
		@Column(name="cap_adult_3_1_3", attrName="cap_adult_3_1_3", label="实施首次采集什么标本"),
		@Column(name="cap_adult_3_1_3_1", attrName="cap_adult_3_1_3_1", label="其他首次采集标本"),
		@Column(name="cap_adult_3_2_1", attrName="cap_adult_3_2_1", label="是否重症 CAP伴有特定临床情况"),
		@Column(name="cap_adult_3_2_2", attrName="cap_adult_3_2_2", label="特定临床情况选项"),
		@Column(name="cap_adult_3_3_1", attrName="cap_adult_3_3_1", label="是否进行侵入性病原学检测"),
		@Column(name="cap_adult_3_3_2", attrName="cap_adult_3_3_2", label="实施侵入性病原学检测", comment="实施侵入性病原学检测(ⅢB)的理由"),
		@Column(name="cap_adult_3_3_3", attrName="cap_adult_3_3_3", label="侵入性病原学检测送检标本来源"),
		@Column(name="cap_adult_3_3_3_1", attrName="cap_adult_3_3_3_1", label="其它侵入性病原学检测送检标本来源"),
		@Column(name="cap_adult_3_4_1", attrName="cap_adult_3_4_1", label="是否送检病原学标本"),
		@Column(name="cap_adult_3_4_2", attrName="cap_adult_3_4_2", label="送检病原学检测项目选择"),
		@Column(name="cap_adult_3_4_2_1", attrName="cap_adult_3_4_2_1", label="其它送检病原学检测项目"),
		@Column(name="cap_adult_3_5_1", attrName="cap_adult_3_5_1", label="病原学检测结果的选择"),
		@Column(name="cap_adult_3_5_1_1", attrName="cap_adult_3_5_1_1", label="其它病原学检测结果"),
		@Column(name="cap_adult_4_1", attrName="cap_adult_4_1", label="患者有无接受抗菌药物治疗"),
		@Column(name="cap_adult_4_1_3", attrName="cap_adult_4_1_3", label="注射剂输入/注射起始日期"),
		@Column(name="cap_adult_4_2", attrName="cap_adult_4_2", label="接受首剂抗菌药物使用时机"),
		@Column(name="cap_adult_4_3", attrName="cap_adult_4_3", label="治疗途径"),
		@Column(name="cap_adult_4_4", attrName="cap_adult_4_4", label="注射剂输入/注射终止日期"),
		@Column(name="cap_adult_4_2_3", attrName="cap_adult_4_2_3", label="入院后使用抗菌药物", comment="入院后使用抗菌药物（口服剂）首剂日期与时间"),
		@Column(name="cap_adult_4_2_4", attrName="cap_adult_4_2_4", label="末剂抗菌药物", comment="末剂抗菌药物（口服剂）或出院日期与时间"),
		@Column(name="cap_adult_4_2_5", attrName="cap_adult_4_2_5", label="口服剂抗菌药物疗程", comment="口服剂抗菌药物疗程（天数）"),
		@Column(name="cap_adult_5_1", attrName="cap_adult_5_1", label="用药前病情判定分层"),
		@Column(name="cap_adult_5_2", attrName="cap_adult_5_2", label="经验性经验性抗感染药物的选择"),
		@Column(name="cap_adult_5_2_1", attrName="cap_adult_5_2_1", label="一代头孢菌素选择"),
		@Column(name="cap_adult_5_2_2", attrName="cap_adult_5_2_2", label="二代头孢菌素选择"),
		@Column(name="cap_adult_5_2_3", attrName="cap_adult_5_2_3", label="三代头孢菌素选择"),
		@Column(name="cap_adult_5_2_4", attrName="cap_adult_5_2_4", label="头霉素类选择"),
		@Column(name="cap_adult_5_2_5", attrName="cap_adult_5_2_5", label="呼吸喹诺酮类选择"),
		@Column(name="cap_adult_5_2_6", attrName="cap_adult_5_2_6", label="氨基青霉素选择"),
		@Column(name="cap_adult_5_2_7", attrName="cap_adult_5_2_7", label="青霉素类/酶抑制剂受合物选择"),
		@Column(name="cap_adult_5_2_8", attrName="cap_adult_5_2_8", label="大环内酯类选择"),
		@Column(name="cap_adult_5_2_9", attrName="cap_adult_5_2_9", label="有抗假单胞菌活性的喹诺酮类选择"),
		@Column(name="cap_adult_5_2_10", attrName="cap_adult_5_2_10", label="有抗假单胞菌活性的-内酰胺类选择"),
		@Column(name="cap_adult_5_2_11", attrName="cap_adult_5_2_11", label="氧头孢类选择"),
		@Column(name="cap_adult_5_2_12", attrName="cap_adult_5_2_12", label="氨基糖苷类选择"),
		@Column(name="cap_adult_5_2_13", attrName="cap_adult_5_2_13", label="四环类选择"),
		@Column(name="cap_adult_5_2_14", attrName="cap_adult_5_2_14", label="神经氨酸抑制剂选择"),
		@Column(name="cap_adult_5_2_15", attrName="cap_adult_5_2_15", label="经验性用药选用特殊类使用种抗菌药物药物选择"),
		@Column(name="cap_adult_5_2_16", attrName="cap_adult_5_2_16", label="其他抗菌药物"),
		@Column(name="cap_adult_6_1_1", attrName="cap_adult_6_1_1", label="是否初始治疗72小时后进行评价"),
		@Column(name="cap_adult_6_1_2", attrName="cap_adult_6_1_2", label="评价结论"),
		@Column(name="cap_adult_6_5_1", attrName="cap_adult_6_5_1", label="初始治疗72小时后评价有效"),
		@Column(name="cap_adult_6_2_1", attrName="cap_adult_6_2_1", label="重复病原学检查"),
		@Column(name="cap_adult_6_2_2", attrName="cap_adult_6_2_2", label="常见原因"),
		@Column(name="cap_adult_6_2_2_1", attrName="cap_adult_6_2_2_1", label="其它原因和处理"),
		@Column(name="cap_adult_6_2_3", attrName="cap_adult_6_2_3", label="病原学检查项目"),
		@Column(name="cap_adult_6_2_3_1", attrName="cap_adult_6_2_3_1", label="其它病原学检查项目"),
		@Column(name="cap_adult_6_3_1", attrName="cap_adult_6_3_1", label="重复病原学诊断结果选择"),
		@Column(name="cap_adult_6_3_1_1", attrName="cap_adult_6_3_1_1", label="其它重复病原学诊断结果"),
		@Column(name="cap_adult_6_4", attrName="cap_adult_6_4", label="目标抗感染药物的选择"),
		@Column(name="cap_adult_6_4_1", attrName="cap_adult_6_4_1", label="其他目标抗感染药物"),
		@Column(name="cap_adult_7_1_1_1", attrName="cap_adult_7_1_1_1", label="是否实施氧疗"),
		@Column(name="cap_adult_7_1_2_1", attrName="cap_adult_7_1_2_1", label="氧疗方法"),
		@Column(name="cap_adult_7_1_3_1", attrName="cap_adult_7_1_3_1", label="氧疗 30min 后是否复查动脉血气"),
		@Column(name="cap_adult_7_2_1_1", attrName="cap_adult_7_2_1_1", label="是否实施无创正压通气", comment="是否实施无创正压通气（NIV）"),
		@Column(name="cap_adult_7_2_2_0", attrName="cap_adult_7_2_2_0", label="无创正压通气的应用指征"),
		@Column(name="cap_adult_7_2_2_1", attrName="cap_adult_7_2_2_1", label="其它无创正压通气的应用指征"),
		@Column(name="cap_adult_6_2_5_1", attrName="cap_adult_6_2_5_1", label="患者无创正压通气起始日期时间"),
		@Column(name="cap_adult_6_2_4_2", attrName="cap_adult_6_2_4_2", label="患者无创正压通气终止日期时间"),
		@Column(name="cap_adult_6_2_5", attrName="cap_adult_6_2_5", label="无创正压通气疗程", comment="无创正压通气疗程（小时）"),
		@Column(name="cap_adult_7_3_1", attrName="cap_adult_7_3_1", label="是否实施有创机械通气"),
		@Column(name="cap_adult_7_3_2", attrName="cap_adult_7_3_2", label="有创机械通气的具体应用指征"),
		@Column(name="cap_adult_7_3_2_1", attrName="cap_adult_7_3_2_1", label="其它有创机械通气的具体应用指征"),
		@Column(name="cap_adult_6_3_4_1", attrName="cap_adult_6_3_4_1", label="患者有机械通气起始日期时间"),
		@Column(name="cap_adult_6_3_4_2", attrName="cap_adult_6_3_4_2", label="患者有机械通气终止日期时间"),
		@Column(name="cap_adult_6_3_5", attrName="cap_adult_6_3_5", label="有机械通气疗程", comment="有机械通气疗程（小时）"),
		@Column(name="cap_adult_7_4_1", attrName="cap_adult_7_4_1", label="是否实施体外膜肺氧合ECMO"),
		@Column(name="cap_adult_7_4_2", attrName="cap_adult_7_4_2", label="体外膜肺氧合应用指征"),
		@Column(name="cap_adult_7_4_2_1", attrName="cap_adult_7_4_2_1", label="其它体外膜肺氧合应用指征"),
		@Column(name="cap_adult_6_4_4_1", attrName="cap_adult_6_4_4_1", label="患者体外膜肺氧合起始日期时间"),
		@Column(name="cap_adult_6_4_4_2", attrName="cap_adult_6_4_4_2", label="患者体外膜肺氧合终止日期时间"),
		@Column(name="cap_adult_6_4_5", attrName="cap_adult_6_4_5", label="体外膜肺氧合疗程", comment="体外膜肺氧合疗程（小时）"),
		@Column(name="cap_adult_8_1", attrName="cap_adult_8_1", label="吸烟史"),
		@Column(name="cap_adult_8_2", attrName="cap_adult_8_2", label="吸烟程度评估有记录"),
		@Column(name="cap_adult_8_3", attrName="cap_adult_8_3", label="接受戒烟的建议或者戒烟治疗有记录"),
		@Column(name="cap_adult_8_2_1", attrName="cap_adult_8_2_1", label="是否接种肺炎链球菌疫苗"),
		@Column(name="cap_adult_8_2_2", attrName="cap_adult_8_2_2", label="患者接受肺炎链球菌疫苗接种的缘由"),
		@Column(name="cap_adult_8_3_1", attrName="cap_adult_8_3_1", label="是否接种流感疫苗"),
		@Column(name="cap_adult_8_3_2", attrName="cap_adult_8_3_2", label="患者接受流感疫苗接种的缘由"),
		@Column(name="cap_adult_9_3_1", attrName="cap_adult_9_3_1", label="交与患者“出院小结”的副本告知患者出院时风险因素"),
		@Column(name="cap_adult_9_3_2", attrName="cap_adult_9_3_2", label="出院带药"),
		@Column(name="cap_adult_9_3_5", attrName="cap_adult_9_3_5", label="告知何为发生紧急意外情况或者疾病复发"),
		@Column(name="cap_adult_9_3_3", attrName="cap_adult_9_3_3", label="告知发生紧急意外情况或者疾病复发如何救治及前途经"),
		@Column(name="cap_adult_9_3_4", attrName="cap_adult_9_3_4", label="出院时教育与随访"),
		@Column(name="cm_4_3", attrName="cm_4_3", label="离院方式选择"),
		@Column(name="cm_4_5", attrName="cm_4_5", label="非医嘱离院可能涉及因素"),
		@Column(name="cm_4_4_1", attrName="cm_4_4_1", label="其他非医嘱离院因素填写"),
		@Column(name="cap_adult_9_1", attrName="cap_adult_9_1", label="出院标准"),
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
		@Column(name="cm_0_1_4_1_1", attrName="cm01411", label="其他ICD-9-CM-3四位亚目编码与名称"),
		@Column(name="cm_6_23", attrName="cm_6_23", label="白蛋白类制品费"),
		@Column(name="cm_6_24", attrName="cm_6_24", label="球蛋白类制品费"),
		@Column(name="cm_6_25", attrName="cm_6_25", label="凝血因子类制品费"),
		@Column(name="cm_6_26", attrName="cm_6_26", label="细胞因子类制品费"),
		@Column(name="cm_6_27", attrName="cm_6_27", label="检查用一次性医用材料费"),
		@Column(name="cm_6_28", attrName="cm_6_28", label="治疗用一次性医用材料费"),
		@Column(name="cm_6_29", attrName="cm_6_29", label="手术用一次性医用材料费"),
		@Column(name="cm_6_30", attrName="cm_6_30", label="其他费"),
		@Column(name="cm_0_1_4_2_1", attrName="cm01421", label="其他ICD-9-CM-3六位临床扩展编码与名称"),
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
public class QualityCapAdult extends DataEntity<QualityCapAdult> {
	
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
	private String cm_0_1_4_2;		// 主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称
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
	private String cm_0_3_1;		// 费用支付方式
	private String cm_0_3_2;		// 收入住院途径
	private String cm_0_3_3;		// 到院交通工具
	private String cap_adult_1_1;		// 是否实施CAP病情严重程度的评价
	private String cap_adult_1;		// 病情严重程度的评价
	private Double cap_adult_1_1_1;		// 首次CURB-65评分数值
	private String cap_adult_1_1_1_1;		// 风险程度评估
	private Double cap_adult_1_1_2;		// 首次PSI评分数值
	private String cap_adult_1_1_2_1;		// 风险程度评估
	private Double cap_adult_1_1_3;		// CRB-65 评分数值
	private String cap_adult_1_1_3_1;		// 风险程度评估
	private Double cap_adult_1_1_4;		// SMART-COP评分数值
	private String cap_adult_1_1_4_1;		// 风险程度评估
	private String cap_adult_1_2_1;		// 是否重症肺炎诊断
	private String cap_adult_1_2_2;		// 重症肺炎诊断主要标准
	private String cap_adult_1_2_3;		// 重症肺炎诊断次要标准
	private String cap_adult_2_1;		// 是否实施首次氧合评估（首次）
	private String cap_adult_2_2;		// 实施首次氧合评估时段
	private String cap_adult_2_3;		// 实施首次氧合评估时是否吸氧（FiO2）
	private String cap_adult_2_4;		// 动脉血气分析/指氧仪检查
	private Double cap_adult_2_4_3;		// 动脉血气分析值(mmhg)
	private Double cap_adult_2_4_4;		// 指氧仪检查值(%)
	private String cap_adult_3_1_1;		// 住院的患者, 是否实施病原学诊断
	private String cap_adult_3_1_2;		// 实施首次采集标本时段
	private String cap_adult_3_1_3;		// 实施首次采集什么标本
	private String cap_adult_3_1_3_1;		// 其他首次采集标本
	private String cap_adult_3_2_1;		// 是否重症 CAP伴有特定临床情况
	private String cap_adult_3_2_2;		// 特定临床情况选项
	private String cap_adult_3_3_1;		// 是否进行侵入性病原学检测
	private String cap_adult_3_3_2;		// 实施侵入性病原学检测(ⅢB)的理由
	private String cap_adult_3_3_3;		// 侵入性病原学检测送检标本来源
	private String cap_adult_3_3_3_1;		// 其它侵入性病原学检测送检标本来源
	private String cap_adult_3_4_1;		// 是否送检病原学标本
	private String cap_adult_3_4_2;		// 送检病原学检测项目选择
	private String cap_adult_3_4_2_1;		// 其它送检病原学检测项目
	private String cap_adult_3_5_1;		// 病原学检测结果的选择
	private String cap_adult_3_5_1_1;		// 其它病原学检测结果
	private String cap_adult_4_1;		// 患者有无接受抗菌药物治疗
	private String cap_adult_4_1_3;		// 注射剂输入/注射起始日期
	private String cap_adult_4_2;		// 接受首剂抗菌药物使用时机
	private String cap_adult_4_3;		// 治疗途径
	private String cap_adult_4_4;		// 注射剂输入/注射终止日期
	private String cap_adult_4_2_3;		// 入院后使用抗菌药物（口服剂）首剂日期与时间
	private String cap_adult_4_2_4;		// 末剂抗菌药物（口服剂）或出院日期与时间
	private Double cap_adult_4_2_5;		// 口服剂抗菌药物疗程（天数）
	private String cap_adult_5_1;		// 用药前病情判定分层
	private String cap_adult_5_2;		// 经验性经验性抗感染药物的选择
	private String cap_adult_5_2_1;		// 一代头孢菌素选择
	private String cap_adult_5_2_2;		// 二代头孢菌素选择
	private String cap_adult_5_2_3;		// 三代头孢菌素选择
	private String cap_adult_5_2_4;		// 头霉素类选择
	private String cap_adult_5_2_5;		// 呼吸喹诺酮类选择
	private String cap_adult_5_2_6;		// 氨基青霉素选择
	private String cap_adult_5_2_7;		// 青霉素类/酶抑制剂受合物选择
	private String cap_adult_5_2_8;		// 大环内酯类选择
	private String cap_adult_5_2_9;		// 有抗假单胞菌活性的喹诺酮类选择
	private String cap_adult_5_2_10;		// 有抗假单胞菌活性的-内酰胺类选择
	private String cap_adult_5_2_11;		// 氧头孢类选择
	private String cap_adult_5_2_12;		// 氨基糖苷类选择
	private String cap_adult_5_2_13;		// 四环类选择
	private String cap_adult_5_2_14;		// 神经氨酸抑制剂选择
	private String cap_adult_5_2_15;		// 经验性用药选用特殊类使用种抗菌药物药物选择
	private String cap_adult_5_2_16;		// 其他抗菌药物
	private String cap_adult_6_1_1;		// 是否初始治疗72小时后进行评价
	private String cap_adult_6_1_2;		// 评价结论
	private String cap_adult_6_5_1;		// 初始治疗72小时后评价有效
	private String cap_adult_6_2_1;		// 重复病原学检查
	private String cap_adult_6_2_2;		// 常见原因
	private String cap_adult_6_2_2_1;		// 其它原因和处理
	private String cap_adult_6_2_3;		// 病原学检查项目
	private String cap_adult_6_2_3_1;		// 其它病原学检查项目
	private String cap_adult_6_3_1;		// 重复病原学诊断结果选择
	private String cap_adult_6_3_1_1;		// 其它重复病原学诊断结果
	private String cap_adult_6_4;		// 目标抗感染药物的选择
	private String cap_adult_6_4_1;		// 其他目标抗感染药物
	private String cap_adult_7_1_1_1;		// 是否实施氧疗
	private String cap_adult_7_1_2_1;		// 氧疗方法
	private String cap_adult_7_1_3_1;		// 氧疗 30min 后是否复查动脉血气
	private String cap_adult_7_2_1_1;		// 是否实施无创正压通气（NIV）
	private String cap_adult_7_2_2_0;		// 无创正压通气的应用指征
	private String cap_adult_7_2_2_1;		// 其它无创正压通气的应用指征
	private String cap_adult_6_2_5_1;		// 患者无创正压通气起始日期时间
	private String cap_adult_6_2_4_2;		// 患者无创正压通气终止日期时间
	private Double cap_adult_6_2_5;		// 无创正压通气疗程（小时）
	private String cap_adult_7_3_1;		// 是否实施有创机械通气
	private String cap_adult_7_3_2;		// 有创机械通气的具体应用指征
	private String cap_adult_7_3_2_1;		// 其它有创机械通气的具体应用指征
	private String cap_adult_6_3_4_1;		// 患者有机械通气起始日期时间
	private String cap_adult_6_3_4_2;		// 患者有机械通气终止日期时间
	private Double cap_adult_6_3_5;		// 有机械通气疗程（小时）
	private String cap_adult_7_4_1;		// 是否实施体外膜肺氧合ECMO
	private String cap_adult_7_4_2;		// 体外膜肺氧合应用指征
	private String cap_adult_7_4_2_1;		// 其它体外膜肺氧合应用指征
	private String cap_adult_6_4_4_1;		// 患者体外膜肺氧合起始日期时间
	private String cap_adult_6_4_4_2;		// 患者体外膜肺氧合终止日期时间
	private Double cap_adult_6_4_5;		// 体外膜肺氧合疗程（小时）
	private String cap_adult_8_1;		// 吸烟史
	private String cap_adult_8_2;		// 吸烟程度评估有记录
	private String cap_adult_8_3;		// 接受戒烟的建议或者戒烟治疗有记录
	private String cap_adult_8_2_1;		// 是否接种肺炎链球菌疫苗
	private String cap_adult_8_2_2;		// 患者接受肺炎链球菌疫苗接种的缘由
	private String cap_adult_8_3_1;		// 是否接种流感疫苗
	private String cap_adult_8_3_2;		// 患者接受流感疫苗接种的缘由
	private String cap_adult_9_3_1;		// 交与患者“出院小结”的副本告知患者出院时风险因素
	private String cap_adult_9_3_2;		// 出院带药
	private String cap_adult_9_3_5;		// 告知何为发生紧急意外情况或者疾病复发
	private String cap_adult_9_3_3;		// 告知发生紧急意外情况或者疾病复发如何救治及前途经
	private String cap_adult_9_3_4;		// 出院时教育与随访
	private String cm_4_3;		// 离院方式选择
	private String cm_4_5;		// 非医嘱离院可能涉及因素
	private String cm_4_4_1;		// 其他非医嘱离院因素填写
	private String cap_adult_9_1;		// 出院标准
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
	private String cm01411;		// 其他ICD-9-CM-3四位亚目编码与名称
	private Double cm_6_23;		// 白蛋白类制品费
	private Double cm_6_24;		// 球蛋白类制品费
	private Double cm_6_25;		// 凝血因子类制品费
	private Double cm_6_26;		// 细胞因子类制品费
	private Double cm_6_27;		// 检查用一次性医用材料费
	private Double cm_6_28;		// 治疗用一次性医用材料费
	private Double cm_6_29;		// 手术用一次性医用材料费
	private Double cm_6_30;		// 其他费
	private String cm01421;		// 其他ICD-9-CM-3六位临床扩展编码与名称
	private Date cm0261;		// 手术开始（切皮）日期时间
	private Date cm0262;		// 手术结束（缝皮结束）日期时间
	private String cm31;		// 手术野皮肤准备常用方法的选择
	private String cm32;		// 使用含抗菌剂（三氯生）缝线
	private String cm321;		// 其他含抗菌剂缝线填写
	private String cm33;		// 手术切口类别的选择
	private String cm34;		// 手术切口愈合情况的选择
	
	public QualityCapAdult() {
		this(null);
	}

	public QualityCapAdult(String id){
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
	
	@Length(min=0, max=64, message="是否实施CAP病情严重程度的评价长度不能超过 64 个字符")
	public String getCap_adult_1_1() {
		return cap_adult_1_1;
	}

	public void setCap_adult_1_1(String cap_adult_1_1) {
		this.cap_adult_1_1 = cap_adult_1_1;
	}
	
	@Length(min=0, max=64, message="病情严重程度的评价长度不能超过 64 个字符")
	public String getCap_adult_1() {
		return cap_adult_1;
	}

	public void setCap_adult_1(String cap_adult_1) {
		this.cap_adult_1 = cap_adult_1;
	}
	
	public Double getCap_adult_1_1_1() {
		return cap_adult_1_1_1;
	}

	public void setCap_adult_1_1_1(Double cap_adult_1_1_1) {
		this.cap_adult_1_1_1 = cap_adult_1_1_1;
	}
	
	@Length(min=0, max=64, message="风险程度评估长度不能超过 64 个字符")
	public String getCap_adult_1_1_1_1() {
		return cap_adult_1_1_1_1;
	}

	public void setCap_adult_1_1_1_1(String cap_adult_1_1_1_1) {
		this.cap_adult_1_1_1_1 = cap_adult_1_1_1_1;
	}
	
	public Double getCap_adult_1_1_2() {
		return cap_adult_1_1_2;
	}

	public void setCap_adult_1_1_2(Double cap_adult_1_1_2) {
		this.cap_adult_1_1_2 = cap_adult_1_1_2;
	}
	
	@Length(min=0, max=64, message="风险程度评估长度不能超过 64 个字符")
	public String getCap_adult_1_1_2_1() {
		return cap_adult_1_1_2_1;
	}

	public void setCap_adult_1_1_2_1(String cap_adult_1_1_2_1) {
		this.cap_adult_1_1_2_1 = cap_adult_1_1_2_1;
	}
	
	public Double getCap_adult_1_1_3() {
		return cap_adult_1_1_3;
	}

	public void setCap_adult_1_1_3(Double cap_adult_1_1_3) {
		this.cap_adult_1_1_3 = cap_adult_1_1_3;
	}
	
	@Length(min=0, max=64, message="风险程度评估长度不能超过 64 个字符")
	public String getCap_adult_1_1_3_1() {
		return cap_adult_1_1_3_1;
	}

	public void setCap_adult_1_1_3_1(String cap_adult_1_1_3_1) {
		this.cap_adult_1_1_3_1 = cap_adult_1_1_3_1;
	}
	
	public Double getCap_adult_1_1_4() {
		return cap_adult_1_1_4;
	}

	public void setCap_adult_1_1_4(Double cap_adult_1_1_4) {
		this.cap_adult_1_1_4 = cap_adult_1_1_4;
	}
	
	@Length(min=0, max=64, message="风险程度评估长度不能超过 64 个字符")
	public String getCap_adult_1_1_4_1() {
		return cap_adult_1_1_4_1;
	}

	public void setCap_adult_1_1_4_1(String cap_adult_1_1_4_1) {
		this.cap_adult_1_1_4_1 = cap_adult_1_1_4_1;
	}
	
	@Length(min=0, max=64, message="是否重症肺炎诊断长度不能超过 64 个字符")
	public String getCap_adult_1_2_1() {
		return cap_adult_1_2_1;
	}

	public void setCap_adult_1_2_1(String cap_adult_1_2_1) {
		this.cap_adult_1_2_1 = cap_adult_1_2_1;
	}
	
	@Length(min=0, max=64, message="重症肺炎诊断主要标准长度不能超过 64 个字符")
	public String getCap_adult_1_2_2() {
		return cap_adult_1_2_2;
	}

	public void setCap_adult_1_2_2(String cap_adult_1_2_2) {
		this.cap_adult_1_2_2 = cap_adult_1_2_2;
	}
	
	@Length(min=0, max=64, message="重症肺炎诊断次要标准长度不能超过 64 个字符")
	public String getCap_adult_1_2_3() {
		return cap_adult_1_2_3;
	}

	public void setCap_adult_1_2_3(String cap_adult_1_2_3) {
		this.cap_adult_1_2_3 = cap_adult_1_2_3;
	}
	
	@Length(min=0, max=64, message="是否实施首次氧合评估长度不能超过 64 个字符")
	public String getCap_adult_2_1() {
		return cap_adult_2_1;
	}

	public void setCap_adult_2_1(String cap_adult_2_1) {
		this.cap_adult_2_1 = cap_adult_2_1;
	}
	
	@Length(min=0, max=64, message="实施首次氧合评估时段长度不能超过 64 个字符")
	public String getCap_adult_2_2() {
		return cap_adult_2_2;
	}

	public void setCap_adult_2_2(String cap_adult_2_2) {
		this.cap_adult_2_2 = cap_adult_2_2;
	}
	
	@Length(min=0, max=64, message="实施首次氧合评估时是否吸氧长度不能超过 64 个字符")
	public String getCap_adult_2_3() {
		return cap_adult_2_3;
	}

	public void setCap_adult_2_3(String cap_adult_2_3) {
		this.cap_adult_2_3 = cap_adult_2_3;
	}
	
	@Length(min=0, max=64, message="动脉血气分析/指氧仪检查长度不能超过 64 个字符")
	public String getCap_adult_2_4() {
		return cap_adult_2_4;
	}

	public void setCap_adult_2_4(String cap_adult_2_4) {
		this.cap_adult_2_4 = cap_adult_2_4;
	}
	
	public Double getCap_adult_2_4_3() {
		return cap_adult_2_4_3;
	}

	public void setCap_adult_2_4_3(Double cap_adult_2_4_3) {
		this.cap_adult_2_4_3 = cap_adult_2_4_3;
	}
	
	public Double getCap_adult_2_4_4() {
		return cap_adult_2_4_4;
	}

	public void setCap_adult_2_4_4(Double cap_adult_2_4_4) {
		this.cap_adult_2_4_4 = cap_adult_2_4_4;
	}
	
	@Length(min=0, max=64, message="住院的患者, 是否实施病原学诊断长度不能超过 64 个字符")
	public String getCap_adult_3_1_1() {
		return cap_adult_3_1_1;
	}

	public void setCap_adult_3_1_1(String cap_adult_3_1_1) {
		this.cap_adult_3_1_1 = cap_adult_3_1_1;
	}
	
	@Length(min=0, max=64, message="实施首次采集标本时段长度不能超过 64 个字符")
	public String getCap_adult_3_1_2() {
		return cap_adult_3_1_2;
	}

	public void setCap_adult_3_1_2(String cap_adult_3_1_2) {
		this.cap_adult_3_1_2 = cap_adult_3_1_2;
	}
	
	@Length(min=0, max=64, message="实施首次采集什么标本长度不能超过 64 个字符")
	public String getCap_adult_3_1_3() {
		return cap_adult_3_1_3;
	}

	public void setCap_adult_3_1_3(String cap_adult_3_1_3) {
		this.cap_adult_3_1_3 = cap_adult_3_1_3;
	}
	
	@Length(min=0, max=64, message="其他首次采集标本长度不能超过 64 个字符")
	public String getCap_adult_3_1_3_1() {
		return cap_adult_3_1_3_1;
	}

	public void setCap_adult_3_1_3_1(String cap_adult_3_1_3_1) {
		this.cap_adult_3_1_3_1 = cap_adult_3_1_3_1;
	}
	
	@Length(min=0, max=64, message="是否重症 CAP伴有特定临床情况长度不能超过 64 个字符")
	public String getCap_adult_3_2_1() {
		return cap_adult_3_2_1;
	}

	public void setCap_adult_3_2_1(String cap_adult_3_2_1) {
		this.cap_adult_3_2_1 = cap_adult_3_2_1;
	}
	
	@Length(min=0, max=64, message="特定临床情况选项长度不能超过 64 个字符")
	public String getCap_adult_3_2_2() {
		return cap_adult_3_2_2;
	}

	public void setCap_adult_3_2_2(String cap_adult_3_2_2) {
		this.cap_adult_3_2_2 = cap_adult_3_2_2;
	}
	
	@Length(min=0, max=64, message="是否进行侵入性病原学检测长度不能超过 64 个字符")
	public String getCap_adult_3_3_1() {
		return cap_adult_3_3_1;
	}

	public void setCap_adult_3_3_1(String cap_adult_3_3_1) {
		this.cap_adult_3_3_1 = cap_adult_3_3_1;
	}
	
	@Length(min=0, max=64, message="实施侵入性病原学检测长度不能超过 64 个字符")
	public String getCap_adult_3_3_2() {
		return cap_adult_3_3_2;
	}

	public void setCap_adult_3_3_2(String cap_adult_3_3_2) {
		this.cap_adult_3_3_2 = cap_adult_3_3_2;
	}
	
	@Length(min=0, max=64, message="侵入性病原学检测送检标本来源长度不能超过 64 个字符")
	public String getCap_adult_3_3_3() {
		return cap_adult_3_3_3;
	}

	public void setCap_adult_3_3_3(String cap_adult_3_3_3) {
		this.cap_adult_3_3_3 = cap_adult_3_3_3;
	}
	
	@Length(min=0, max=64, message="其它侵入性病原学检测送检标本来源长度不能超过 64 个字符")
	public String getCap_adult_3_3_3_1() {
		return cap_adult_3_3_3_1;
	}

	public void setCap_adult_3_3_3_1(String cap_adult_3_3_3_1) {
		this.cap_adult_3_3_3_1 = cap_adult_3_3_3_1;
	}
	
	@Length(min=0, max=64, message="是否送检病原学标本长度不能超过 64 个字符")
	public String getCap_adult_3_4_1() {
		return cap_adult_3_4_1;
	}

	public void setCap_adult_3_4_1(String cap_adult_3_4_1) {
		this.cap_adult_3_4_1 = cap_adult_3_4_1;
	}
	
	@Length(min=0, max=64, message="送检病原学检测项目选择长度不能超过 64 个字符")
	public String getCap_adult_3_4_2() {
		return cap_adult_3_4_2;
	}

	public void setCap_adult_3_4_2(String cap_adult_3_4_2) {
		this.cap_adult_3_4_2 = cap_adult_3_4_2;
	}
	
	@Length(min=0, max=64, message="其它送检病原学检测项目长度不能超过 64 个字符")
	public String getCap_adult_3_4_2_1() {
		return cap_adult_3_4_2_1;
	}

	public void setCap_adult_3_4_2_1(String cap_adult_3_4_2_1) {
		this.cap_adult_3_4_2_1 = cap_adult_3_4_2_1;
	}
	
	@Length(min=0, max=64, message="病原学检测结果的选择长度不能超过 64 个字符")
	public String getCap_adult_3_5_1() {
		return cap_adult_3_5_1;
	}

	public void setCap_adult_3_5_1(String cap_adult_3_5_1) {
		this.cap_adult_3_5_1 = cap_adult_3_5_1;
	}
	
	@Length(min=0, max=64, message="其它病原学检测结果长度不能超过 64 个字符")
	public String getCap_adult_3_5_1_1() {
		return cap_adult_3_5_1_1;
	}

	public void setCap_adult_3_5_1_1(String cap_adult_3_5_1_1) {
		this.cap_adult_3_5_1_1 = cap_adult_3_5_1_1;
	}
	
	@Length(min=0, max=64, message="患者有无接受抗菌药物治疗长度不能超过 64 个字符")
	public String getCap_adult_4_1() {
		return cap_adult_4_1;
	}

	public void setCap_adult_4_1(String cap_adult_4_1) {
		this.cap_adult_4_1 = cap_adult_4_1;
	}
	
	@Length(min=0, max=64, message="注射剂输入/注射起始日期长度不能超过 64 个字符")
	public String getCap_adult_4_1_3() {
		return cap_adult_4_1_3;
	}

	public void setCap_adult_4_1_3(String cap_adult_4_1_3) {
		this.cap_adult_4_1_3 = cap_adult_4_1_3;
	}
	
	@Length(min=0, max=64, message="接受首剂抗菌药物使用时机长度不能超过 64 个字符")
	public String getCap_adult_4_2() {
		return cap_adult_4_2;
	}

	public void setCap_adult_4_2(String cap_adult_4_2) {
		this.cap_adult_4_2 = cap_adult_4_2;
	}
	
	@Length(min=0, max=64, message="治疗途径长度不能超过 64 个字符")
	public String getCap_adult_4_3() {
		return cap_adult_4_3;
	}

	public void setCap_adult_4_3(String cap_adult_4_3) {
		this.cap_adult_4_3 = cap_adult_4_3;
	}
	
	@Length(min=0, max=64, message="注射剂输入/注射终止日期长度不能超过 64 个字符")
	public String getCap_adult_4_4() {
		return cap_adult_4_4;
	}

	public void setCap_adult_4_4(String cap_adult_4_4) {
		this.cap_adult_4_4 = cap_adult_4_4;
	}
	
	@Length(min=0, max=64, message="入院后使用抗菌药物长度不能超过 64 个字符")
	public String getCap_adult_4_2_3() {
		return cap_adult_4_2_3;
	}

	public void setCap_adult_4_2_3(String cap_adult_4_2_3) {
		this.cap_adult_4_2_3 = cap_adult_4_2_3;
	}
	
	@Length(min=0, max=64, message="末剂抗菌药物长度不能超过 64 个字符")
	public String getCap_adult_4_2_4() {
		return cap_adult_4_2_4;
	}

	public void setCap_adult_4_2_4(String cap_adult_4_2_4) {
		this.cap_adult_4_2_4 = cap_adult_4_2_4;
	}
	
	public Double getCap_adult_4_2_5() {
		return cap_adult_4_2_5;
	}

	public void setCap_adult_4_2_5(Double cap_adult_4_2_5) {
		this.cap_adult_4_2_5 = cap_adult_4_2_5;
	}
	
	@Length(min=0, max=64, message="用药前病情判定分层长度不能超过 64 个字符")
	public String getCap_adult_5_1() {
		return cap_adult_5_1;
	}

	public void setCap_adult_5_1(String cap_adult_5_1) {
		this.cap_adult_5_1 = cap_adult_5_1;
	}
	
	@Length(min=0, max=64, message="经验性经验性抗感染药物的选择长度不能超过 64 个字符")
	public String getCap_adult_5_2() {
		return cap_adult_5_2;
	}

	public void setCap_adult_5_2(String cap_adult_5_2) {
		this.cap_adult_5_2 = cap_adult_5_2;
	}
	
	@Length(min=0, max=64, message="一代头孢菌素选择长度不能超过 64 个字符")
	public String getCap_adult_5_2_1() {
		return cap_adult_5_2_1;
	}

	public void setCap_adult_5_2_1(String cap_adult_5_2_1) {
		this.cap_adult_5_2_1 = cap_adult_5_2_1;
	}
	
	@Length(min=0, max=64, message="二代头孢菌素选择长度不能超过 64 个字符")
	public String getCap_adult_5_2_2() {
		return cap_adult_5_2_2;
	}

	public void setCap_adult_5_2_2(String cap_adult_5_2_2) {
		this.cap_adult_5_2_2 = cap_adult_5_2_2;
	}
	
	@Length(min=0, max=64, message="三代头孢菌素选择长度不能超过 64 个字符")
	public String getCap_adult_5_2_3() {
		return cap_adult_5_2_3;
	}

	public void setCap_adult_5_2_3(String cap_adult_5_2_3) {
		this.cap_adult_5_2_3 = cap_adult_5_2_3;
	}
	
	@Length(min=0, max=64, message="头霉素类选择长度不能超过 64 个字符")
	public String getCap_adult_5_2_4() {
		return cap_adult_5_2_4;
	}

	public void setCap_adult_5_2_4(String cap_adult_5_2_4) {
		this.cap_adult_5_2_4 = cap_adult_5_2_4;
	}
	
	@Length(min=0, max=64, message="呼吸喹诺酮类选择长度不能超过 64 个字符")
	public String getCap_adult_5_2_5() {
		return cap_adult_5_2_5;
	}

	public void setCap_adult_5_2_5(String cap_adult_5_2_5) {
		this.cap_adult_5_2_5 = cap_adult_5_2_5;
	}
	
	@Length(min=0, max=64, message="氨基青霉素选择长度不能超过 64 个字符")
	public String getCap_adult_5_2_6() {
		return cap_adult_5_2_6;
	}

	public void setCap_adult_5_2_6(String cap_adult_5_2_6) {
		this.cap_adult_5_2_6 = cap_adult_5_2_6;
	}
	
	@Length(min=0, max=64, message="青霉素类/酶抑制剂受合物选择长度不能超过 64 个字符")
	public String getCap_adult_5_2_7() {
		return cap_adult_5_2_7;
	}

	public void setCap_adult_5_2_7(String cap_adult_5_2_7) {
		this.cap_adult_5_2_7 = cap_adult_5_2_7;
	}
	
	@Length(min=0, max=64, message="大环内酯类选择长度不能超过 64 个字符")
	public String getCap_adult_5_2_8() {
		return cap_adult_5_2_8;
	}

	public void setCap_adult_5_2_8(String cap_adult_5_2_8) {
		this.cap_adult_5_2_8 = cap_adult_5_2_8;
	}
	
	@Length(min=0, max=64, message="有抗假单胞菌活性的喹诺酮类选择长度不能超过 64 个字符")
	public String getCap_adult_5_2_9() {
		return cap_adult_5_2_9;
	}

	public void setCap_adult_5_2_9(String cap_adult_5_2_9) {
		this.cap_adult_5_2_9 = cap_adult_5_2_9;
	}
	
	@Length(min=0, max=64, message="有抗假单胞菌活性的-内酰胺类选择长度不能超过 64 个字符")
	public String getCap_adult_5_2_10() {
		return cap_adult_5_2_10;
	}

	public void setCap_adult_5_2_10(String cap_adult_5_2_10) {
		this.cap_adult_5_2_10 = cap_adult_5_2_10;
	}
	
	@Length(min=0, max=64, message="氧头孢类选择长度不能超过 64 个字符")
	public String getCap_adult_5_2_11() {
		return cap_adult_5_2_11;
	}

	public void setCap_adult_5_2_11(String cap_adult_5_2_11) {
		this.cap_adult_5_2_11 = cap_adult_5_2_11;
	}
	
	@Length(min=0, max=64, message="氨基糖苷类选择长度不能超过 64 个字符")
	public String getCap_adult_5_2_12() {
		return cap_adult_5_2_12;
	}

	public void setCap_adult_5_2_12(String cap_adult_5_2_12) {
		this.cap_adult_5_2_12 = cap_adult_5_2_12;
	}
	
	@Length(min=0, max=64, message="四环类选择长度不能超过 64 个字符")
	public String getCap_adult_5_2_13() {
		return cap_adult_5_2_13;
	}

	public void setCap_adult_5_2_13(String cap_adult_5_2_13) {
		this.cap_adult_5_2_13 = cap_adult_5_2_13;
	}
	
	@Length(min=0, max=64, message="神经氨酸抑制剂选择长度不能超过 64 个字符")
	public String getCap_adult_5_2_14() {
		return cap_adult_5_2_14;
	}

	public void setCap_adult_5_2_14(String cap_adult_5_2_14) {
		this.cap_adult_5_2_14 = cap_adult_5_2_14;
	}
	
	@Length(min=0, max=64, message="经验性用药选用特殊类使用种抗菌药物药物选择长度不能超过 64 个字符")
	public String getCap_adult_5_2_15() {
		return cap_adult_5_2_15;
	}

	public void setCap_adult_5_2_15(String cap_adult_5_2_15) {
		this.cap_adult_5_2_15 = cap_adult_5_2_15;
	}
	
	@Length(min=0, max=64, message="其他抗菌药物长度不能超过 64 个字符")
	public String getCap_adult_5_2_16() {
		return cap_adult_5_2_16;
	}

	public void setCap_adult_5_2_16(String cap_adult_5_2_16) {
		this.cap_adult_5_2_16 = cap_adult_5_2_16;
	}
	
	@Length(min=0, max=64, message="是否初始治疗72小时后进行评价长度不能超过 64 个字符")
	public String getCap_adult_6_1_1() {
		return cap_adult_6_1_1;
	}

	public void setCap_adult_6_1_1(String cap_adult_6_1_1) {
		this.cap_adult_6_1_1 = cap_adult_6_1_1;
	}
	
	@Length(min=0, max=64, message="评价结论长度不能超过 64 个字符")
	public String getCap_adult_6_1_2() {
		return cap_adult_6_1_2;
	}

	public void setCap_adult_6_1_2(String cap_adult_6_1_2) {
		this.cap_adult_6_1_2 = cap_adult_6_1_2;
	}
	
	@Length(min=0, max=64, message="初始治疗72小时后评价有效长度不能超过 64 个字符")
	public String getCap_adult_6_5_1() {
		return cap_adult_6_5_1;
	}

	public void setCap_adult_6_5_1(String cap_adult_6_5_1) {
		this.cap_adult_6_5_1 = cap_adult_6_5_1;
	}
	
	@Length(min=0, max=64, message="重复病原学检查长度不能超过 64 个字符")
	public String getCap_adult_6_2_1() {
		return cap_adult_6_2_1;
	}

	public void setCap_adult_6_2_1(String cap_adult_6_2_1) {
		this.cap_adult_6_2_1 = cap_adult_6_2_1;
	}
	
	@Length(min=0, max=64, message="常见原因长度不能超过 64 个字符")
	public String getCap_adult_6_2_2() {
		return cap_adult_6_2_2;
	}

	public void setCap_adult_6_2_2(String cap_adult_6_2_2) {
		this.cap_adult_6_2_2 = cap_adult_6_2_2;
	}
	
	@Length(min=0, max=64, message="其它原因和处理长度不能超过 64 个字符")
	public String getCap_adult_6_2_2_1() {
		return cap_adult_6_2_2_1;
	}

	public void setCap_adult_6_2_2_1(String cap_adult_6_2_2_1) {
		this.cap_adult_6_2_2_1 = cap_adult_6_2_2_1;
	}
	
	@Length(min=0, max=64, message="病原学检查项目长度不能超过 64 个字符")
	public String getCap_adult_6_2_3() {
		return cap_adult_6_2_3;
	}

	public void setCap_adult_6_2_3(String cap_adult_6_2_3) {
		this.cap_adult_6_2_3 = cap_adult_6_2_3;
	}
	
	@Length(min=0, max=64, message="其它病原学检查项目长度不能超过 64 个字符")
	public String getCap_adult_6_2_3_1() {
		return cap_adult_6_2_3_1;
	}

	public void setCap_adult_6_2_3_1(String cap_adult_6_2_3_1) {
		this.cap_adult_6_2_3_1 = cap_adult_6_2_3_1;
	}
	
	@Length(min=0, max=64, message="重复病原学诊断结果选择长度不能超过 64 个字符")
	public String getCap_adult_6_3_1() {
		return cap_adult_6_3_1;
	}

	public void setCap_adult_6_3_1(String cap_adult_6_3_1) {
		this.cap_adult_6_3_1 = cap_adult_6_3_1;
	}
	
	@Length(min=0, max=64, message="其它重复病原学诊断结果长度不能超过 64 个字符")
	public String getCap_adult_6_3_1_1() {
		return cap_adult_6_3_1_1;
	}

	public void setCap_adult_6_3_1_1(String cap_adult_6_3_1_1) {
		this.cap_adult_6_3_1_1 = cap_adult_6_3_1_1;
	}
	
	@Length(min=0, max=64, message="目标抗感染药物的选择长度不能超过 64 个字符")
	public String getCap_adult_6_4() {
		return cap_adult_6_4;
	}

	public void setCap_adult_6_4(String cap_adult_6_4) {
		this.cap_adult_6_4 = cap_adult_6_4;
	}
	
	@Length(min=0, max=64, message="其他目标抗感染药物长度不能超过 64 个字符")
	public String getCap_adult_6_4_1() {
		return cap_adult_6_4_1;
	}

	public void setCap_adult_6_4_1(String cap_adult_6_4_1) {
		this.cap_adult_6_4_1 = cap_adult_6_4_1;
	}
	
	@Length(min=0, max=64, message="是否实施氧疗长度不能超过 64 个字符")
	public String getCap_adult_7_1_1_1() {
		return cap_adult_7_1_1_1;
	}

	public void setCap_adult_7_1_1_1(String cap_adult_7_1_1_1) {
		this.cap_adult_7_1_1_1 = cap_adult_7_1_1_1;
	}
	
	@Length(min=0, max=64, message="氧疗方法长度不能超过 64 个字符")
	public String getCap_adult_7_1_2_1() {
		return cap_adult_7_1_2_1;
	}

	public void setCap_adult_7_1_2_1(String cap_adult_7_1_2_1) {
		this.cap_adult_7_1_2_1 = cap_adult_7_1_2_1;
	}
	
	@Length(min=0, max=64, message="氧疗 30min 后是否复查动脉血气长度不能超过 64 个字符")
	public String getCap_adult_7_1_3_1() {
		return cap_adult_7_1_3_1;
	}

	public void setCap_adult_7_1_3_1(String cap_adult_7_1_3_1) {
		this.cap_adult_7_1_3_1 = cap_adult_7_1_3_1;
	}
	
	@Length(min=0, max=64, message="是否实施无创正压通气长度不能超过 64 个字符")
	public String getCap_adult_7_2_1_1() {
		return cap_adult_7_2_1_1;
	}

	public void setCap_adult_7_2_1_1(String cap_adult_7_2_1_1) {
		this.cap_adult_7_2_1_1 = cap_adult_7_2_1_1;
	}
	
	@Length(min=0, max=64, message="无创正压通气的应用指征长度不能超过 64 个字符")
	public String getCap_adult_7_2_2_0() {
		return cap_adult_7_2_2_0;
	}

	public void setCap_adult_7_2_2_0(String cap_adult_7_2_2_0) {
		this.cap_adult_7_2_2_0 = cap_adult_7_2_2_0;
	}
	
	@Length(min=0, max=64, message="其它无创正压通气的应用指征长度不能超过 64 个字符")
	public String getCap_adult_7_2_2_1() {
		return cap_adult_7_2_2_1;
	}

	public void setCap_adult_7_2_2_1(String cap_adult_7_2_2_1) {
		this.cap_adult_7_2_2_1 = cap_adult_7_2_2_1;
	}
	
	@Length(min=0, max=64, message="患者无创正压通气起始日期时间长度不能超过 64 个字符")
	public String getCap_adult_6_2_5_1() {
		return cap_adult_6_2_5_1;
	}

	public void setCap_adult_6_2_5_1(String cap_adult_6_2_5_1) {
		this.cap_adult_6_2_5_1 = cap_adult_6_2_5_1;
	}
	
	@Length(min=0, max=64, message="患者无创正压通气终止日期时间长度不能超过 64 个字符")
	public String getCap_adult_6_2_4_2() {
		return cap_adult_6_2_4_2;
	}

	public void setCap_adult_6_2_4_2(String cap_adult_6_2_4_2) {
		this.cap_adult_6_2_4_2 = cap_adult_6_2_4_2;
	}
	
	public Double getCap_adult_6_2_5() {
		return cap_adult_6_2_5;
	}

	public void setCap_adult_6_2_5(Double cap_adult_6_2_5) {
		this.cap_adult_6_2_5 = cap_adult_6_2_5;
	}
	
	@Length(min=0, max=64, message="是否实施有创机械通气长度不能超过 64 个字符")
	public String getCap_adult_7_3_1() {
		return cap_adult_7_3_1;
	}

	public void setCap_adult_7_3_1(String cap_adult_7_3_1) {
		this.cap_adult_7_3_1 = cap_adult_7_3_1;
	}
	
	@Length(min=0, max=64, message="有创机械通气的具体应用指征长度不能超过 64 个字符")
	public String getCap_adult_7_3_2() {
		return cap_adult_7_3_2;
	}

	public void setCap_adult_7_3_2(String cap_adult_7_3_2) {
		this.cap_adult_7_3_2 = cap_adult_7_3_2;
	}
	
	@Length(min=0, max=64, message="其它有创机械通气的具体应用指征长度不能超过 64 个字符")
	public String getCap_adult_7_3_2_1() {
		return cap_adult_7_3_2_1;
	}

	public void setCap_adult_7_3_2_1(String cap_adult_7_3_2_1) {
		this.cap_adult_7_3_2_1 = cap_adult_7_3_2_1;
	}
	
	@Length(min=0, max=64, message="患者有机械通气起始日期时间长度不能超过 64 个字符")
	public String getCap_adult_6_3_4_1() {
		return cap_adult_6_3_4_1;
	}

	public void setCap_adult_6_3_4_1(String cap_adult_6_3_4_1) {
		this.cap_adult_6_3_4_1 = cap_adult_6_3_4_1;
	}
	
	@Length(min=0, max=64, message="患者有机械通气终止日期时间长度不能超过 64 个字符")
	public String getCap_adult_6_3_4_2() {
		return cap_adult_6_3_4_2;
	}

	public void setCap_adult_6_3_4_2(String cap_adult_6_3_4_2) {
		this.cap_adult_6_3_4_2 = cap_adult_6_3_4_2;
	}
	
	public Double getCap_adult_6_3_5() {
		return cap_adult_6_3_5;
	}

	public void setCap_adult_6_3_5(Double cap_adult_6_3_5) {
		this.cap_adult_6_3_5 = cap_adult_6_3_5;
	}
	
	@Length(min=0, max=64, message="是否实施体外膜肺氧合ECMO长度不能超过 64 个字符")
	public String getCap_adult_7_4_1() {
		return cap_adult_7_4_1;
	}

	public void setCap_adult_7_4_1(String cap_adult_7_4_1) {
		this.cap_adult_7_4_1 = cap_adult_7_4_1;
	}
	
	@Length(min=0, max=64, message="体外膜肺氧合应用指征长度不能超过 64 个字符")
	public String getCap_adult_7_4_2() {
		return cap_adult_7_4_2;
	}

	public void setCap_adult_7_4_2(String cap_adult_7_4_2) {
		this.cap_adult_7_4_2 = cap_adult_7_4_2;
	}
	
	@Length(min=0, max=64, message="其它体外膜肺氧合应用指征长度不能超过 64 个字符")
	public String getCap_adult_7_4_2_1() {
		return cap_adult_7_4_2_1;
	}

	public void setCap_adult_7_4_2_1(String cap_adult_7_4_2_1) {
		this.cap_adult_7_4_2_1 = cap_adult_7_4_2_1;
	}
	
	@Length(min=0, max=64, message="患者体外膜肺氧合起始日期时间长度不能超过 64 个字符")
	public String getCap_adult_6_4_4_1() {
		return cap_adult_6_4_4_1;
	}

	public void setCap_adult_6_4_4_1(String cap_adult_6_4_4_1) {
		this.cap_adult_6_4_4_1 = cap_adult_6_4_4_1;
	}
	
	@Length(min=0, max=64, message="患者体外膜肺氧合终止日期时间长度不能超过 64 个字符")
	public String getCap_adult_6_4_4_2() {
		return cap_adult_6_4_4_2;
	}

	public void setCap_adult_6_4_4_2(String cap_adult_6_4_4_2) {
		this.cap_adult_6_4_4_2 = cap_adult_6_4_4_2;
	}
	
	public Double getCap_adult_6_4_5() {
		return cap_adult_6_4_5;
	}

	public void setCap_adult_6_4_5(Double cap_adult_6_4_5) {
		this.cap_adult_6_4_5 = cap_adult_6_4_5;
	}
	
	@Length(min=0, max=64, message="吸烟史长度不能超过 64 个字符")
	public String getCap_adult_8_1() {
		return cap_adult_8_1;
	}

	public void setCap_adult_8_1(String cap_adult_8_1) {
		this.cap_adult_8_1 = cap_adult_8_1;
	}
	
	@Length(min=0, max=64, message="吸烟程度评估有记录长度不能超过 64 个字符")
	public String getCap_adult_8_2() {
		return cap_adult_8_2;
	}

	public void setCap_adult_8_2(String cap_adult_8_2) {
		this.cap_adult_8_2 = cap_adult_8_2;
	}
	
	@Length(min=0, max=64, message="接受戒烟的建议或者戒烟治疗有记录长度不能超过 64 个字符")
	public String getCap_adult_8_3() {
		return cap_adult_8_3;
	}

	public void setCap_adult_8_3(String cap_adult_8_3) {
		this.cap_adult_8_3 = cap_adult_8_3;
	}
	
	@Length(min=0, max=64, message="是否接种肺炎链球菌疫苗长度不能超过 64 个字符")
	public String getCap_adult_8_2_1() {
		return cap_adult_8_2_1;
	}

	public void setCap_adult_8_2_1(String cap_adult_8_2_1) {
		this.cap_adult_8_2_1 = cap_adult_8_2_1;
	}
	
	@Length(min=0, max=64, message="患者接受肺炎链球菌疫苗接种的缘由长度不能超过 64 个字符")
	public String getCap_adult_8_2_2() {
		return cap_adult_8_2_2;
	}

	public void setCap_adult_8_2_2(String cap_adult_8_2_2) {
		this.cap_adult_8_2_2 = cap_adult_8_2_2;
	}
	
	@Length(min=0, max=64, message="是否接种流感疫苗长度不能超过 64 个字符")
	public String getCap_adult_8_3_1() {
		return cap_adult_8_3_1;
	}

	public void setCap_adult_8_3_1(String cap_adult_8_3_1) {
		this.cap_adult_8_3_1 = cap_adult_8_3_1;
	}
	
	@Length(min=0, max=64, message="患者接受流感疫苗接种的缘由长度不能超过 64 个字符")
	public String getCap_adult_8_3_2() {
		return cap_adult_8_3_2;
	}

	public void setCap_adult_8_3_2(String cap_adult_8_3_2) {
		this.cap_adult_8_3_2 = cap_adult_8_3_2;
	}
	
	@Length(min=0, max=64, message="交与患者“出院小结”的副本告知患者出院时风险因素长度不能超过 64 个字符")
	public String getCap_adult_9_3_1() {
		return cap_adult_9_3_1;
	}

	public void setCap_adult_9_3_1(String cap_adult_9_3_1) {
		this.cap_adult_9_3_1 = cap_adult_9_3_1;
	}
	
	@Length(min=0, max=64, message="出院带药长度不能超过 64 个字符")
	public String getCap_adult_9_3_2() {
		return cap_adult_9_3_2;
	}

	public void setCap_adult_9_3_2(String cap_adult_9_3_2) {
		this.cap_adult_9_3_2 = cap_adult_9_3_2;
	}
	
	@Length(min=0, max=64, message="告知何为发生紧急意外情况或者疾病复发长度不能超过 64 个字符")
	public String getCap_adult_9_3_5() {
		return cap_adult_9_3_5;
	}

	public void setCap_adult_9_3_5(String cap_adult_9_3_5) {
		this.cap_adult_9_3_5 = cap_adult_9_3_5;
	}
	
	@Length(min=0, max=64, message="告知发生紧急意外情况或者疾病复发如何救治及前途经长度不能超过 64 个字符")
	public String getCap_adult_9_3_3() {
		return cap_adult_9_3_3;
	}

	public void setCap_adult_9_3_3(String cap_adult_9_3_3) {
		this.cap_adult_9_3_3 = cap_adult_9_3_3;
	}
	
	@Length(min=0, max=64, message="出院时教育与随访长度不能超过 64 个字符")
	public String getCap_adult_9_3_4() {
		return cap_adult_9_3_4;
	}

	public void setCap_adult_9_3_4(String cap_adult_9_3_4) {
		this.cap_adult_9_3_4 = cap_adult_9_3_4;
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
	
	@Length(min=0, max=64, message="出院标准长度不能超过 64 个字符")
	public String getCap_adult_9_1() {
		return cap_adult_9_1;
	}

	public void setCap_adult_9_1(String cap_adult_9_1) {
		this.cap_adult_9_1 = cap_adult_9_1;
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
	
	@Length(min=0, max=32, message="其他ICD-9-CM-3四位亚目编码与名称长度不能超过 32 个字符")
	public String getCm01411() {
		return cm01411;
	}

	public void setCm01411(String cm01411) {
		this.cm01411 = cm01411;
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