/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.hf.entity;

import org.hibernate.validator.constraints.Length;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * HF心力衰竭Entity
 * @author 卡卡西
 * @version 2021-01-27
 */
@Table(name="quality_hf", alias="a", columns={
		@Column(name="cm_0_1_1_1", attrName="cm_0_1_1_1", label="质控医师"),
		@Column(name="cm_0_1_1_2", attrName="cm_0_1_1_2", label="质控护士"),
		@Column(name="cm_0_1_1_3", attrName="cm_0_1_1_3", label="主治医师"),
		@Column(name="cm_0_1_1_4", attrName="cm_0_1_1_4", label="责任护士"),
		@Column(name="cm_0_1_1_5", attrName="cm_0_1_1_5", label="上报科室"),
		@Column(name="caseid", attrName="caseid", label="患者病案号"),
		@Column(name="cm_0_1_3_1", attrName="cm_0_1_3_1", label="主要诊断或其他诊断ICD-10四位亚目编码与名称"),
		@Column(name="cm_0_1_3_2", attrName="cm_0_1_3_2", label="主要诊断或其他诊断ICD-10六位临床扩展编码与名称"),
		@Column(name="hf_0_1_4_1", attrName="hf_0_1_4_1", label="第一诊断或第二诊断对应的原发疾病ICD-10的三位类亚目编码与名称"),
		@Column(name="hf_0_1_4_2", attrName="hf_0_1_4_2", label="第一诊断或第二诊断对应的原发疾病ICD-10的三位类目编码与名称"),
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
		@Column(name="cm_0_2_4_1", attrName="cm_0_2_4_1", label="入院日期时间"),
		@Column(name="cm_0_2_4_2", attrName="cm_0_2_4_2", label="出院日期时间"),
		@Column(name="cm_0_2_5_1", attrName="cm_0_2_5_1", label="入住CCU日期时间"),
		@Column(name="cm_0_2_5_2", attrName="cm_0_2_5_2", label="离开CCU日期时间"),
		@Column(name="cm_0_2_6_1", attrName="cm_0_2_6_1", label="手术开始", comment="手术开始（切皮）日期时间"),
		@Column(name="cm_0_2_6_2", attrName="cm_0_2_6_2", label="手术结束", comment="手术结束（缝皮结束）日期时间"),
		@Column(name="cm_0_3_1", attrName="cm_0_3_1", label="费用支付方式"),
		@Column(name="cm_0_3_2", attrName="cm_0_3_2", label="收入住院途径"),
		@Column(name="cm_0_3_3", attrName="cm_0_3_3", label="到院交通工具"),
		@Column(name="hf_1_1_1", attrName="hf_1_1_1", label="是否实施首次X线胸片检查"),
		@Column(name="hf_1_1_2", attrName="hf_1_1_2", label="首次X线胸片检查报告日期时间"),
		@Column(name="hf_1_1_3", attrName="hf_1_1_3", label="首次X线胸片检查报告是否有肺淤血或肺水肿"),
		@Column(name="hf_1_2_1", attrName="hf_1_2_1", label="是否实施首次超声心动图", comment="是否实施首次超声心动图(CDFA)检查"),
		@Column(name="hf_1_2_2", attrName="hf_1_2_2", label="报告日期时间"),
		@Column(name="hf_1_2_3_4", attrName="hf_1_2_3_4", label="左室舒张末内径（LVEDD）", comment="左室舒张末内径（LVEDD）(mm)"),
		@Column(name="hf_1_2_3_1", attrName="hf_1_2_3_1", label="左室射血分（LVEF）测量值", comment="左室射血分（LVEF）测量值(%)"),
		@Column(name="hf_1_2_3_2", attrName="hf_1_2_3_2", label="左室射血分数评估结论"),
		@Column(name="hf_1_2_3_3", attrName="hf_1_2_3_3", label="是否有左心室室壁瘤"),
		@Column(name="hf_1_3_1", attrName="hf_1_3_1", label="实施首次评估患者的危险程度"),
		@Column(name="hf_1_3_3", attrName="hf_1_3_3", label="Killip分级评估结果的选择"),
		@Column(name="hf_1_3_2", attrName="hf_1_3_2", label="NYHA分级结果的选择"),
		@Column(name="hf_1_3_5", attrName="hf_1_3_5", label="是否为非瓣膜性房颤/房扑患者"),
		@Column(name="hf_1_3_6_1", attrName="hf_1_3_6_1", label="是否实施房颤患者风险评估"),
		@Column(name="hf_1_3_6_2", attrName="hf_1_3_6_2", label="房颤患者脑险评估分值"),
		@Column(name="hf_1_3_6_3", attrName="hf_1_3_6_3", label="CHA2DS2-VASc评分大于2分"),
		@Column(name="hf_1_4_1", attrName="hf_1_4_1", label="急诊或入院后是否首次心电图", comment="急诊或入院后是否首次心电图（ECG）检查"),
		@Column(name="hf_1_4_2", attrName="hf_1_4_2", label="报告日期时间"),
		@Column(name="hf_1_4_3", attrName="hf_1_4_3", label="QRS宽度", comment="QRS宽度(ms)"),
		@Column(name="hf_1_4_4", attrName="hf_1_4_4", label="心电图", comment="心电图（ECG）检查结果选择"),
		@Column(name="hf_1_4_4_1", attrName="hf_1_4_4_1", label="其他心电图检查结果"),
		@Column(name="hf_1_5_1_1", attrName="hf_1_5_1_1", label="是否实施首次检测"),
		@Column(name="hf_1_5_1_2", attrName="hf_1_5_1_2", label="首次检测结果报告日期"),
		@Column(name="hf_1_5_3", attrName="hf_1_5_3", label="首次检测选择"),
		@Column(name="hf_1_5_2_1", attrName="hf_1_5_2_1", label="肌钙蛋白T（TnT）检测值", comment="肌钙蛋白T（TnT）检测值(ng/mL)"),
		@Column(name="hf_1_5_2_2", attrName="hf_1_5_2_2", label="肌钙蛋白I（TnI）检测值", comment="肌钙蛋白I（TnI）检测值(ng/mL)"),
		@Column(name="hf_1_5_2_3", attrName="hf_1_5_2_3", label="肌酸激酶同工酶（CK-MB）检测值", comment="肌酸激酶同工酶（CK-MB）检测值(ng/mL)"),
		@Column(name="hf_1_5_2_4", attrName="hf_1_5_2_4", label="心肌肌红蛋白（Myo）检测值", comment="心肌肌红蛋白（Myo）检测值(ng/mL)"),
		@Column(name="hf_1_5_2_5", attrName="hf_1_5_2_5", label="B型钠尿肽（BNP）检测值", comment="B型钠尿肽（BNP）检测值(ng/L)"),
		@Column(name="hf_1_5_2_6", attrName="hf_1_5_2_6", label="N端B型钠尿肽前体（NT-ProBNP）检测值", comment="N端B型钠尿肽前体（NT-ProBNP）检测值(ng/L)"),
		@Column(name="hf_2_1_a", attrName="hf_2_1_a", label="是否有利尿剂的禁忌证"),
		@Column(name="hf_2_1", attrName="hf_2_1", label="使用利尿剂的禁忌证选择"),
		@Column(name="hf_2_1_1", attrName="hf_2_1_1", label="其他使用利尿剂的禁忌证"),
		@Column(name="hf_2_2", attrName="hf_2_2", label="首剂用药日期时间"),
		@Column(name="hf_2_3", attrName="hf_2_3", label="常用利尿剂药物"),
		@Column(name="hf_2_3_1", attrName="hf_2_3_1", label="其他利尿剂药物填写"),
		@Column(name="hf_2_5", attrName="hf_2_5", label="入院至使用首剂利尿剂时间大于24小时"),
		@Column(name="hf_2_4", attrName="hf_2_4", label="延迟治疗原因的选择"),
		@Column(name="hf_2_4_1", attrName="hf_2_4_1", label="其他延迟治疗原因"),
		@Column(name="hf_3_1", attrName="hf_3_1", label="左心室收缩功能障碍"),
		@Column(name="hf_3_2_a", attrName="hf_3_2_a", label="是否有ACEI抑制剂类药物禁忌证"),
		@Column(name="hf_3_2_1", attrName="hf_3_2_1", label="ACEI抑制剂类药物禁忌证与须慎用的情况"),
		@Column(name="hf_3_4_a", attrName="hf_3_4_a", label="ACE抑制剂药物"),
		@Column(name="hf_3_4_a_1", attrName="hf_3_4_a_1", label="其他ACEI药物"),
		@Column(name="hf_3_4_b", attrName="hf_3_4_b", label="ARB类药物"),
		@Column(name="hf_3_4_b_1", attrName="hf_3_4_b_1", label="其他ARB类药物填写"),
		@Column(name="hf_3_2_b", attrName="hf_3_2_b", label="是否有ARNI类药物禁忌证"),
		@Column(name="hf_3_2_2", attrName="hf_3_2_2", label="ARNI类药物禁忌证与须慎用的情况"),
		@Column(name="hf_3_4_c", attrName="hf_3_4_c", label="使用血管紧张素受体脑啡肽酶抑制剂", comment="使用血管紧张素受体脑啡肽酶抑制剂（ARNI）类药物的选择"),
		@Column(name="hf_3_4_c_1", attrName="hf_3_4_c_1", label="其他使用血管紧张素受体脑啡肽酶抑制剂", comment="其他使用血管紧张素受体脑啡肽酶抑制剂（ARNI）类药物"),
		@Column(name="hf_3_3_1", attrName="hf_3_3_1", label="首剂用药日期是否未确定"),
		@Column(name="hf_3_3", attrName="hf_3_3", label="首剂用药日期时间"),
		@Column(name="hf_3_6", attrName="hf_3_6", label="入院至使用首剂ACEI/ARB类药物时间大于24小时"),
		@Column(name="hf_3_5", attrName="hf_3_5", label="延迟治疗原因"),
		@Column(name="hf_3_5_1", attrName="hf_3_5_1", label="其他延迟治疗原因"),
		@Column(name="hf_4_1_1", attrName="hf_4_1_1", label="是否有禁忌证与须慎用的情况"),
		@Column(name="hf_4_1_2", attrName="hf_4_1_2", label="β-受体阻滞剂禁忌证选择"),
		@Column(name="hf_4_3", attrName="hf_4_3", label="使用首剂β-受体阻滞剂药物"),
		@Column(name="hf_4_3_1", attrName="hf_4_3_1", label="其他β-受体阻滞剂药物"),
		@Column(name="hf_4_2_1", attrName="hf_4_2_1", label="首剂用药日期是否未确定"),
		@Column(name="hf_4_2", attrName="hf_4_2", label="首剂用药日期时间"),
		@Column(name="hf_4_5", attrName="hf_4_5", label="入院至使用首剂β-受体阻滞剂时间大于24小时"),
		@Column(name="hf_4_4", attrName="hf_4_4", label="延迟治疗原因"),
		@Column(name="hf_4_4_1", attrName="hf_4_4_1", label="其他延迟治疗原因"),
		@Column(name="hf_5_1_1", attrName="hf_5_1_1", label="是否有醛固酮受体拮抗剂的禁忌证"),
		@Column(name="hf_5_1_2", attrName="hf_5_1_2", label="醛固酮受体拮抗剂的禁忌证"),
		@Column(name="hf_5_2", attrName="hf_5_2", label="重度心衰使用醛固酮受体拮抗剂适用症"),
		@Column(name="hf_5_2_1_1", attrName="hf_5_2_1_1", label="其他重度心衰使用醛固酮受体拮抗剂适用症"),
		@Column(name="hf_5_3_1", attrName="hf_5_3_1", label="首剂用药日期是否未确定"),
		@Column(name="hf_5_3", attrName="hf_5_3", label="首剂用药日期时间"),
		@Column(name="hf_5_6", attrName="hf_5_6", label="入院至使用首剂醛固酮受体拮抗剂时间大于24小时"),
		@Column(name="hf_5_4", attrName="hf_5_4", label="使用醛固酮受体拮抗剂"),
		@Column(name="hf_5_4_1", attrName="hf_5_4_1", label="其他醛固酮受体拮抗剂类药物"),
		@Column(name="hf_5_5", attrName="hf_5_5", label="延迟治疗原因"),
		@Column(name="hf_5_5_1", attrName="hf_5_5_1", label="其他延迟治疗原因"),
		@Column(name="hf_6_1_1", attrName="hf_6_1_1", label="是否有用药长期医嘱"),
		@Column(name="hf_6_1_2", attrName="hf_6_1_2", label="常用利尿剂药物的选择"),
		@Column(name="hf_6_1_2_1", attrName="hf_6_1_2_1", label="其他常用利尿剂"),
		@Column(name="hf_6_2_1", attrName="hf_6_2_1", label="是否有ACEI或ARB药物长期医嘱"),
		@Column(name="hf_6_2_2", attrName="hf_6_2_2", label="使用ACEI抑制剂或者ARB或者ARNI类药物选择"),
		@Column(name="hf_6_2_2_a", attrName="hf_6_2_2_a", label="ACE抑制剂药物"),
		@Column(name="hf_6_2_2_a_1", attrName="hf_6_2_2_a_1", label="其他ACEI药物填写"),
		@Column(name="hf_6_2_2_b", attrName="hf_6_2_2_b", label="ARB类药物"),
		@Column(name="hf_6_2_2_b_1", attrName="hf_6_2_2_b_1", label="其他ARB药物填写"),
		@Column(name="hf_6_2_2_c", attrName="hf_6_2_2_c", label="使用血管紧张素受体脑啡肽酶抑制剂", comment="使用血管紧张素受体脑啡肽酶抑制剂（ARNI）类药物的选择"),
		@Column(name="hf_6_2_2_c_1", attrName="hf_6_2_2_c_1", label="其他使用血管紧张素受体脑啡肽酶抑制剂", comment="其他使用血管紧张素受体脑啡肽酶抑制剂（ARNI）类药物"),
		@Column(name="hf_6_3_1", attrName="hf_6_3_1", label="是否有β受体阻滞剂药物医嘱"),
		@Column(name="hf_6_3_2", attrName="hf_6_3_2", label="使用首剂β-受体阻滞剂药物"),
		@Column(name="hf_6_3_2_1", attrName="hf_6_3_2_1", label="其他β-受体阻滞剂药物填写"),
		@Column(name="hf_6_4_1", attrName="hf_6_4_1", label="是否有醛固酮拮抗剂药物医嘱"),
		@Column(name="hf_6_4_2", attrName="hf_6_4_2", label="使用醛固酮受体拮抗剂"),
		@Column(name="hf_6_4_2_1", attrName="hf_6_4_2_1", label="其他醛固酮受体拮抗剂类药物填写"),
		@Column(name="hf_6_5_1", attrName="hf_6_5_1", label="是否常用抗凝药物"),
		@Column(name="hf_6_5_2", attrName="hf_6_5_2", label="选择抗凝药物"),
		@Column(name="hf_6_5_2_1", attrName="hf_6_5_2_1", label="其他抗凝药物"),
		@Column(name="hf_7_1_1", attrName="hf_7_1_1", label="出院带药医嘱中是否有继续使用利尿剂记录医嘱"),
		@Column(name="hf_7_1_2", attrName="hf_7_1_2", label="常用利尿剂药物"),
		@Column(name="hf_7_1_2_1", attrName="hf_7_1_2_1", label="其他常用利尿剂"),
		@Column(name="hf_7_2_1", attrName="hf_7_2_1", label="出院带药医嘱中是否有继续使用ACEI或ARB药物记录医嘱"),
		@Column(name="hf_7_2_2", attrName="hf_7_2_2", label="使用ACEI抑制剂或者ARB或者ARNI类药物选择"),
		@Column(name="hf_7_2_2_a", attrName="hf_7_2_2_a", label="ACE抑制剂药物"),
		@Column(name="hf_7_2_2_a_1", attrName="hf_7_2_2_a_1", label="其他ACEI药物"),
		@Column(name="hf_7_2_2_b", attrName="hf_7_2_2_b", label="ARB类药物"),
		@Column(name="hf_7_2_2_b_1", attrName="hf_7_2_2_b_1", label="其他ARB药物填写"),
		@Column(name="hf_7_2_2_c", attrName="hf_7_2_2_c", label="使用血管紧张素受体脑啡肽酶抑制剂", comment="使用血管紧张素受体脑啡肽酶抑制剂（ARNI）类药物的选择"),
		@Column(name="hf_7_2_2_c_1", attrName="hf_7_2_2_c_1", label="其他使用血管紧张素受体脑啡肽酶抑制剂", comment="其他使用血管紧张素受体脑啡肽酶抑制剂（ARNI）类药物"),
		@Column(name="hf_7_3_1", attrName="hf_7_3_1", label="出院带药医嘱中是否有继续使用β受体阻滞剂药物医嘱"),
		@Column(name="hf_7_3_2", attrName="hf_7_3_2", label="使用首剂β-受体阻滞剂药物"),
		@Column(name="hf_7_3_2_1", attrName="hf_7_3_2_1", label="其他β-受体阻滞剂药物填写"),
		@Column(name="hf_7_4_1", attrName="hf_7_4_1", label="出院带药医嘱中是否有继续使用醛固酮拮抗剂药物医嘱"),
		@Column(name="hf_7_4_2", attrName="hf_7_4_2", label="使用醛固酮受体拮抗剂"),
		@Column(name="hf_7_4_2_1", attrName="hf_7_4_2_1", label="其他醛固酮受体拮抗剂"),
		@Column(name="hf_7_5_1", attrName="hf_7_5_1", label="出院带药医嘱中是否有继续使用使用抗凝药物医嘱"),
		@Column(name="hf_7_5_2", attrName="hf_7_5_2", label="选择抗凝药物"),
		@Column(name="hf_7_5_2_1", attrName="hf_7_5_2_1", label="其他抗凝药物"),
		@Column(name="cm_4_3", attrName="cm_4_3", label="离院方式选择"),
		@Column(name="cm_4_5", attrName="cm_4_5", label="非医嘱离院可能涉及因素"),
		@Column(name="cm_4_4_1", attrName="cm_4_4_1", label="其他非医嘱离院因素填写"),
		@Column(name="cm_4_6", attrName="cm_4_6", label="死亡可能涉及因素"),
		@Column(name="hf_8_1_1", attrName="hf_8_1_1", label="是否有吸烟史"),
		@Column(name="hf_8_1_2", attrName="hf_8_1_2", label="吸烟程度评估有记录"),
		@Column(name="hf_8_1_3", attrName="hf_8_1_3", label="接受戒烟的建议或者戒烟治疗有记录"),
		@Column(name="hf_8_2_1_a", attrName="hf_8_2_1_a", label="心衰原发疾病评估与教育"),
		@Column(name="hf_8_2_1_b", attrName="hf_8_2_1_b", label="实施控制主要危险因素评估与教育"),
		@Column(name="hf_8_2_2", attrName="hf_8_2_2", label="对控制危险因素评估的结果进行针对性的教育"),
		@Column(name="hf_8_3", attrName="hf_8_3", label="二级预防"),
		@Column(name="hf_8_4_1", attrName="hf_8_4_1", label="交与患者“出院小结”的副本告知患者出院时风险因素"),
		@Column(name="hf_8_4_2", attrName="hf_8_4_2", label="出院带药"),
		@Column(name="hf_8_4_3", attrName="hf_8_4_3", label="告知发生紧急情况时求援救治途径"),
		@Column(name="hf_8_4_4", attrName="hf_8_4_4", label="出院时教育与随访"),
		@Column(name="hf_8_4_5", attrName="hf_8_4_5", label="告知何为风险因素与紧急情况"),
		@Column(name="hf_9_2_1_1", attrName="hf_9_2_1_1", label="实施末次X线胸片检查"),
		@Column(name="hf_9_2_1_2", attrName="hf_9_2_1_2", label="是否有肺淤血或肺水肿"),
		@Column(name="hf_9_2_2_1", attrName="hf_9_2_2_1", label="是否实施末次超声心动图", comment="是否实施末次超声心动图(CDFA)检查"),
		@Column(name="hf_9_2_2_2_4", attrName="hf_9_2_2_2_4", label="QRS宽度", comment="QRS宽度(ms)"),
		@Column(name="hf_9_2_2_2_1", attrName="hf_9_2_2_2_1", label="左室射血分（LVEF）测量值", comment="左室射血分（LVEF）测量值(%)"),
		@Column(name="hf_9_2_2_2_2", attrName="hf_9_2_2_2_2", label="左室射血分数评估结论"),
		@Column(name="hf_9_2_2_2_3", attrName="hf_9_2_2_2_3", label="是否有左心室室壁瘤"),
		@Column(name="hf_9_2_3_1", attrName="hf_9_2_3_1", label="实施末次风险程度评估"),
		@Column(name="hf_9_2_3_2_ab", attrName="hf_9_2_3_2_ab", label="末次风险程度评估"),
		@Column(name="hf_9_2_3_2", attrName="hf_9_2_3_2", label="NYHA分级结果"),
		@Column(name="hf_9_2_3_3", attrName="hf_9_2_3_3", label="Killip分级评估结果"),
		@Column(name="hf_9_2_4_1", attrName="hf_9_2_4_1", label="实施末次检测"),
		@Column(name="hf_9_2_4_2", attrName="hf_9_2_4_2", label="末次检测选择"),
		@Column(name="hf_9_2_4_2_1", attrName="hf_9_2_4_2_1", label="肌钙蛋白T（TnT）检测值", comment="肌钙蛋白T（TnT）检测值(ng/mL)"),
		@Column(name="hf_9_2_4_2_2", attrName="hf_9_2_4_2_2", label="肌钙蛋白I（TnI）检测值", comment="肌钙蛋白I（TnI）检测值(ng/mL)"),
		@Column(name="hf_9_2_4_2_3", attrName="hf_9_2_4_2_3", label="肌酸激酶同工酶（CK-MB）检测值", comment="肌酸激酶同工酶（CK-MB）检测值(ng/mL)"),
		@Column(name="hf_9_2_4_2_4", attrName="hf_9_2_4_2_4", label="心肌肌红蛋白（Myo）检测值", comment="心肌肌红蛋白（Myo）检测值(ng/mL)"),
		@Column(name="hf_9_2_4_2_5", attrName="hf_9_2_4_2_5", label="B型钠尿肽（BNP）检测值", comment="B型钠尿肽（BNP）检测值(ng/L)"),
		@Column(name="hf_9_2_4_2_6", attrName="hf_9_2_4_2_6", label="N端B型钠尿肽前体（NT-ProBNP）检测值", comment="N端B型钠尿肽前体（NT-ProBNP）检测值(ng/L)"),
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
		@Column(name="hf_11_4_1", attrName="hf_11_4_1", label="心脏再同步化临床应用符合适应症"),
		@Column(name="hf_11_1_1", attrName="hf_11_1_1", label="CRT临床应用的适应证", comment="CRT临床应用的适应证（Ⅰ类）选择"),
		@Column(name="hf_11_1_2", attrName="hf_11_1_2", label="安装心脏再同步治疗", comment="安装心脏再同步治疗（CRT）装置"),
		@Column(name="hf_11_1_3", attrName="hf_11_1_3", label="安装日期时间"),
		@Column(name="hf_11_1_4_1", attrName="hf_11_1_4_1", label="心脏再同步治疗", comment="心脏再同步治疗（CRT）装置生产企业"),
		@Column(name="hf_11_1_4_2", attrName="hf_11_1_4_2", label="心脏再同步治疗", comment="心脏再同步治疗（CRT）装置型号"),
		@Column(name="hf_11_1_4_3", attrName="hf_11_1_4_3", label="心脏再同步治疗（CRT）装置的费用", comment="心脏再同步治疗（CRT）装置的费用(元)"),
		@Column(name="hf_11_5_1", attrName="hf_11_5_1", label="是否有在药物优化治疗超过3个月后实施埋藏式心律转复除颤器", comment="是否有在药物优化治疗超过3个月后实施埋藏式心律转复除颤器（ICD）的记录"),
		@Column(name="hf_11_5_2", attrName="hf_11_5_2", label="心衰患者植入ICD适应证"),
		@Column(name="hf_11_5_4", attrName="hf_11_5_4", label="二级预防适应证"),
		@Column(name="hf_11_5_3", attrName="hf_11_5_3", label="一级预防适应证"),
		@Column(name="hf_11_5_3_1", attrName="hf_11_5_3_1", label="缺血性心脏病患者"),
		@Column(name="hf_11_5_3_2", attrName="hf_11_5_3_2", label="非缺血性心衰患者"),
		@Column(name="hf_11_2_2", attrName="hf_11_2_2", label="是否安装埋藏式心律转复除颤器", comment="是否安装埋藏式心律转复除颤器（ICD）装置"),
		@Column(name="hf_11_2_3", attrName="hf_11_2_3", label="安装日期时间"),
		@Column(name="hf_11_2_4_1", attrName="hf_11_2_4_1", label="埋藏式心律转复除颤器", comment="埋藏式心律转复除颤器（ICD）装置生产企业"),
		@Column(name="hf_11_2_4_2", attrName="hf_11_2_4_2", label="埋藏式心律转复除颤器", comment="埋藏式心律转复除颤器（ICD）装置型号"),
		@Column(name="hf_11_2_5", attrName="hf_11_2_5", label="埋藏式心律转复除颤器（ICD）装置的费用", comment="埋藏式心律转复除颤器（ICD）装置的费用(元)"),
		@Column(name="hf_11_3_1", attrName="hf_11_3_1", label="通过优化流程实现从医院到社区的无缝衔接"),
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
public class QualityHf extends DataEntity<QualityHf> {
	
	private static final long serialVersionUID = 1L;
	private String cm_0_1_1_1;		// 质控医师
	private String cm_0_1_1_2;		// 质控护士
	private String cm_0_1_1_3;		// 主治医师
	private String cm_0_1_1_4;		// 责任护士
	private String cm_0_1_1_5;		// 上报科室
	private String caseid;		// 患者病案号
	private String cm_0_1_3_1;		// 主要诊断或其他诊断ICD-10四位亚目编码与名称
	private String cm_0_1_3_2;		// 主要诊断或其他诊断ICD-10六位临床扩展编码与名称
	private String hf_0_1_4_1;		// 第一诊断或第二诊断对应的原发疾病ICD-10的三位类亚目编码与名称
	private String hf_0_1_4_2;		// 第一诊断或第二诊断对应的原发疾病ICD-10的三位类目编码与名称
	private String cm_0_1_4_1;		// 主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称
	private String cm_0_1_4_2;		// 主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称
	private String cm_0_1_5;		// 是否出院后31天内重复住院
	private String cm_0_2_1_1;		// 出生日期
	private String cm_0_2_1_2;		// 患者性别
	private Double cm_0_2_1_3;		// 患者体重（kg）
	private Double cm_0_2_1_5;		// 患者身高（cm）
	private String cm_0_2_2_1;		// 发病日期时间是否无法确定或无记录
	private String cm_0_2_2_2;		// 发病日期时间
	private String cm_0_2_3_1;		// 到达本院急诊或者门诊日期时间是否无法确定或无记录
	private String cm_0_2_3_2;		// 到达本院急诊或者门诊日期时间
	private String cm_0_2_4_1;		// 入院日期时间
	private String cm_0_2_4_2;		// 出院日期时间
	private String cm_0_2_5_1;		// 入住CCU日期时间
	private String cm_0_2_5_2;		// 离开CCU日期时间
	private String cm_0_2_6_1;		// 手术开始（切皮）日期时间
	private String cm_0_2_6_2;		// 手术结束（缝皮结束）日期时间
	private String cm_0_3_1;		// 费用支付方式
	private String cm_0_3_2;		// 收入住院途径
	private String cm_0_3_3;		// 到院交通工具
	private String hf_1_1_1;		// 是否实施首次X线胸片检查
	private String hf_1_1_2;		// 首次X线胸片检查报告日期时间
	private String hf_1_1_3;		// 首次X线胸片检查报告是否有肺淤血或肺水肿
	private String hf_1_2_1;		// 是否实施首次超声心动图(CDFA)检查
	private String hf_1_2_2;		// 报告日期时间
	private Double hf_1_2_3_4;		// 左室舒张末内径（LVEDD）(mm)
	private Double hf_1_2_3_1;		// 左室射血分（LVEF）测量值(%)
	private String hf_1_2_3_2;		// 左室射血分数评估结论
	private String hf_1_2_3_3;		// 是否有左心室室壁瘤
	private String hf_1_3_1;		// 实施首次评估患者的危险程度
	private String hf_1_3_3;		// Killip分级评估结果的选择
	private String hf_1_3_2;		// NYHA分级结果的选择
	private String hf_1_3_5;		// 是否为非瓣膜性房颤/房扑患者
	private String hf_1_3_6_1;		// 是否实施房颤患者风险评估
	private Double hf_1_3_6_2;		// 房颤患者脑险评估分值
	private String hf_1_3_6_3;		// CHA2DS2-VASc评分大于2分
	private String hf_1_4_1;		// 急诊或入院后是否首次心电图（ECG）检查
	private String hf_1_4_2;		// 报告日期时间
	private Double hf_1_4_3;		// QRS宽度(ms)
	private String hf_1_4_4;		// 心电图（ECG）检查结果选择
	private String hf_1_4_4_1;		// 其他心电图检查结果
	private String hf_1_5_1_1;		// 是否实施首次检测
	private String hf_1_5_1_2;		// 首次检测结果报告日期
	private String hf_1_5_3;		// 首次检测选择
	private Double hf_1_5_2_1;		// 肌钙蛋白T（TnT）检测值(ng/mL)
	private Double hf_1_5_2_2;		// 肌钙蛋白I（TnI）检测值(ng/mL)
	private Double hf_1_5_2_3;		// 肌酸激酶同工酶（CK-MB）检测值(ng/mL)
	private Double hf_1_5_2_4;		// 心肌肌红蛋白（Myo）检测值(ng/mL)
	private Double hf_1_5_2_5;		// B型钠尿肽（BNP）检测值(ng/L)
	private Double hf_1_5_2_6;		// N端B型钠尿肽前体（NT-ProBNP）检测值(ng/L)
	private String hf_2_1_a;		// 是否有利尿剂的禁忌证
	private String hf_2_1;		// 使用利尿剂的禁忌证选择
	private String hf_2_1_1;		// 其他使用利尿剂的禁忌证
	private String hf_2_2;		// 首剂用药日期时间
	private String hf_2_3;		// 常用利尿剂药物
	private String hf_2_3_1;		// 其他利尿剂药物填写
	private String hf_2_5;		// 入院至使用首剂利尿剂时间大于24小时
	private String hf_2_4;		// 延迟治疗原因的选择
	private String hf_2_4_1;		// 其他延迟治疗原因
	private String hf_3_1;		// 左心室收缩功能障碍
	private String hf_3_2_a;		// 是否有ACEI抑制剂类药物禁忌证
	private String hf_3_2_1;		// ACEI抑制剂类药物禁忌证与须慎用的情况
	private String hf_3_4_a;		// ACE抑制剂药物
	private String hf_3_4_a_1;		// 其他ACEI药物
	private String hf_3_4_b;		// ARB类药物
	private String hf_3_4_b_1;		// 其他ARB类药物填写
	private String hf_3_2_b;		// 是否有ARNI类药物禁忌证
	private String hf_3_2_2;		// ARNI类药物禁忌证与须慎用的情况
	private String hf_3_4_c;		// 使用血管紧张素受体脑啡肽酶抑制剂（ARNI）类药物的选择
	private String hf_3_4_c_1;		// 其他使用血管紧张素受体脑啡肽酶抑制剂（ARNI）类药物
	private String hf_3_3_1;		// 首剂用药日期是否未确定
	private String hf_3_3;		// 首剂用药日期时间
	private String hf_3_6;		// 入院至使用首剂ACEI/ARB类药物时间大于24小时
	private String hf_3_5;		// 延迟治疗原因
	private String hf_3_5_1;		// 其他延迟治疗原因
	private String hf_4_1_1;		// 是否有禁忌证与须慎用的情况
	private String hf_4_1_2;		// β-受体阻滞剂禁忌证选择
	private String hf_4_3;		// 使用首剂β-受体阻滞剂药物
	private String hf_4_3_1;		// 其他β-受体阻滞剂药物
	private String hf_4_2_1;		// 首剂用药日期是否未确定
	private String hf_4_2;		// 首剂用药日期时间
	private String hf_4_5;		// 入院至使用首剂β-受体阻滞剂时间大于24小时
	private String hf_4_4;		// 延迟治疗原因
	private String hf_4_4_1;		// 其他延迟治疗原因
	private String hf_5_1_1;		// 是否有醛固酮受体拮抗剂的禁忌证
	private String hf_5_1_2;		// 醛固酮受体拮抗剂的禁忌证
	private String hf_5_2;		// 重度心衰使用醛固酮受体拮抗剂适用症
	private String hf_5_2_1_1;		// 其他重度心衰使用醛固酮受体拮抗剂适用症
	private String hf_5_3_1;		// 首剂用药日期是否未确定
	private String hf_5_3;		// 首剂用药日期时间
	private String hf_5_6;		// 入院至使用首剂醛固酮受体拮抗剂时间大于24小时
	private String hf_5_4;		// 使用醛固酮受体拮抗剂
	private String hf_5_4_1;		// 其他醛固酮受体拮抗剂类药物
	private String hf_5_5;		// 延迟治疗原因
	private String hf_5_5_1;		// 其他延迟治疗原因
	private String hf_6_1_1;		// 是否有用药长期医嘱
	private String hf_6_1_2;		// 常用利尿剂药物的选择
	private String hf_6_1_2_1;		// 其他常用利尿剂
	private String hf_6_2_1;		// 是否有ACEI或ARB药物长期医嘱
	private String hf_6_2_2;		// 使用ACEI抑制剂或者ARB或者ARNI类药物选择
	private String hf_6_2_2_a;		// ACE抑制剂药物
	private String hf_6_2_2_a_1;		// 其他ACEI药物填写
	private String hf_6_2_2_b;		// ARB类药物
	private String hf_6_2_2_b_1;		// 其他ARB药物填写
	private String hf_6_2_2_c;		// 使用血管紧张素受体脑啡肽酶抑制剂（ARNI）类药物的选择
	private String hf_6_2_2_c_1;		// 其他使用血管紧张素受体脑啡肽酶抑制剂（ARNI）类药物
	private String hf_6_3_1;		// 是否有β受体阻滞剂药物医嘱
	private String hf_6_3_2;		// 使用首剂β-受体阻滞剂药物
	private String hf_6_3_2_1;		// 其他β-受体阻滞剂药物填写
	private String hf_6_4_1;		// 是否有醛固酮拮抗剂药物医嘱
	private String hf_6_4_2;		// 使用醛固酮受体拮抗剂
	private String hf_6_4_2_1;		// 其他醛固酮受体拮抗剂类药物填写
	private String hf_6_5_1;		// 是否常用抗凝药物
	private String hf_6_5_2;		// 选择抗凝药物
	private String hf_6_5_2_1;		// 其他抗凝药物
	private String hf_7_1_1;		// 出院带药医嘱中是否有继续使用利尿剂记录医嘱
	private String hf_7_1_2;		// 常用利尿剂药物
	private String hf_7_1_2_1;		// 其他常用利尿剂
	private String hf_7_2_1;		// 出院带药医嘱中是否有继续使用ACEI或ARB药物记录医嘱
	private String hf_7_2_2;		// 使用ACEI抑制剂或者ARB或者ARNI类药物选择
	private String hf_7_2_2_a;		// ACE抑制剂药物
	private String hf_7_2_2_a_1;		// 其他ACEI药物
	private String hf_7_2_2_b;		// ARB类药物
	private String hf_7_2_2_b_1;		// 其他ARB药物填写
	private String hf_7_2_2_c;		// 使用血管紧张素受体脑啡肽酶抑制剂（ARNI）类药物的选择
	private String hf_7_2_2_c_1;		// 其他使用血管紧张素受体脑啡肽酶抑制剂（ARNI）类药物
	private String hf_7_3_1;		// 出院带药医嘱中是否有继续使用β受体阻滞剂药物医嘱
	private String hf_7_3_2;		// 使用首剂β-受体阻滞剂药物
	private String hf_7_3_2_1;		// 其他β-受体阻滞剂药物填写
	private String hf_7_4_1;		// 出院带药医嘱中是否有继续使用醛固酮拮抗剂药物医嘱
	private String hf_7_4_2;		// 使用醛固酮受体拮抗剂
	private String hf_7_4_2_1;		// 其他醛固酮受体拮抗剂
	private String hf_7_5_1;		// 出院带药医嘱中是否有继续使用使用抗凝药物医嘱
	private String hf_7_5_2;		// 选择抗凝药物
	private String hf_7_5_2_1;		// 其他抗凝药物
	private String cm_4_3;		// 离院方式选择
	private String cm_4_5;		// 非医嘱离院可能涉及因素
	private String cm_4_4_1;		// 其他非医嘱离院因素填写
	private String cm_4_6;		// 死亡可能涉及因素
	private String hf_8_1_1;		// 是否有吸烟史
	private String hf_8_1_2;		// 吸烟程度评估有记录
	private String hf_8_1_3;		// 接受戒烟的建议或者戒烟治疗有记录
	private String hf_8_2_1_a;		// 心衰原发疾病评估与教育
	private String hf_8_2_1_b;		// 实施控制主要危险因素评估与教育
	private String hf_8_2_2;		// 对控制危险因素评估的结果进行针对性的教育
	private String hf_8_3;		// 二级预防
	private String hf_8_4_1;		// 交与患者“出院小结”的副本告知患者出院时风险因素
	private String hf_8_4_2;		// 出院带药
	private String hf_8_4_3;		// 告知发生紧急情况时求援救治途径
	private String hf_8_4_4;		// 出院时教育与随访
	private String hf_8_4_5;		// 告知何为风险因素与紧急情况
	private String hf_9_2_1_1;		// 实施末次X线胸片检查
	private String hf_9_2_1_2;		// 是否有肺淤血或肺水肿
	private String hf_9_2_2_1;		// 是否实施末次超声心动图(CDFA)检查
	private Double hf_9_2_2_2_4;		// QRS宽度(ms)
	private Double hf_9_2_2_2_1;		// 左室射血分（LVEF）测量值(%)
	private String hf_9_2_2_2_2;		// 左室射血分数评估结论
	private String hf_9_2_2_2_3;		// 是否有左心室室壁瘤
	private String hf_9_2_3_1;		// 实施末次风险程度评估
	private String hf_9_2_3_2_ab;		// 末次风险程度评估
	private String hf_9_2_3_2;		// NYHA分级结果
	private String hf_9_2_3_3;		// Killip分级评估结果
	private String hf_9_2_4_1;		// 实施末次检测
	private String hf_9_2_4_2;		// 末次检测选择
	private Double hf_9_2_4_2_1;		// 肌钙蛋白T（TnT）检测值(ng/mL)
	private Double hf_9_2_4_2_2;		// 肌钙蛋白I（TnI）检测值(ng/mL)
	private Double hf_9_2_4_2_3;		// 肌酸激酶同工酶（CK-MB）检测值(ng/mL)
	private Double hf_9_2_4_2_4;		// 心肌肌红蛋白（Myo）检测值(ng/mL)
	private Double hf_9_2_4_2_5;		// B型钠尿肽（BNP）检测值(ng/L)
	private Double hf_9_2_4_2_6;		// N端B型钠尿肽前体（NT-ProBNP）检测值(ng/L)
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
	private String hf_11_4_1;		// 心脏再同步化临床应用符合适应症
	private String hf_11_1_1;		// CRT临床应用的适应证（Ⅰ类）选择
	private String hf_11_1_2;		// 安装心脏再同步治疗（CRT）装置
	private String hf_11_1_3;		// 安装日期时间
	private String hf_11_1_4_1;		// 心脏再同步治疗（CRT）装置生产企业
	private String hf_11_1_4_2;		// 心脏再同步治疗（CRT）装置型号
	private Double hf_11_1_4_3;		// 心脏再同步治疗（CRT）装置的费用(元)
	private String hf_11_5_1;		// 是否有在药物优化治疗超过3个月后实施埋藏式心律转复除颤器（ICD）的记录
	private String hf_11_5_2;		// 心衰患者植入ICD适应证
	private String hf_11_5_4;		// 二级预防适应证
	private String hf_11_5_3;		// 一级预防适应证
	private String hf_11_5_3_1;		// 缺血性心脏病患者
	private String hf_11_5_3_2;		// 非缺血性心衰患者
	private String hf_11_2_2;		// 是否安装埋藏式心律转复除颤器（ICD）装置
	private String hf_11_2_3;		// 安装日期时间
	private String hf_11_2_4_1;		// 埋藏式心律转复除颤器（ICD）装置生产企业
	private String hf_11_2_4_2;		// 埋藏式心律转复除颤器（ICD）装置型号
	private Double hf_11_2_5;		// 埋藏式心律转复除颤器（ICD）装置的费用(元)
	private String hf_11_3_1;		// 通过优化流程实现从医院到社区的无缝衔接
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
	
	public QualityHf() {
		this(null);
	}

	public QualityHf(String id){
		super(id);
	}
	
	@Length(min=0, max=64, message="质控医师长度不能超过 64 个字符")
	public String getCm_0_1_1_1() {
		return cm_0_1_1_1;
	}

	public void setCm_0_1_1_1(String cm_0_1_1_1) {
		this.cm_0_1_1_1 = cm_0_1_1_1;
	}
	
	@Length(min=0, max=64, message="质控护士长度不能超过 64 个字符")
	public String getCm_0_1_1_2() {
		return cm_0_1_1_2;
	}

	public void setCm_0_1_1_2(String cm_0_1_1_2) {
		this.cm_0_1_1_2 = cm_0_1_1_2;
	}
	
	@Length(min=0, max=64, message="主治医师长度不能超过 64 个字符")
	public String getCm_0_1_1_3() {
		return cm_0_1_1_3;
	}

	public void setCm_0_1_1_3(String cm_0_1_1_3) {
		this.cm_0_1_1_3 = cm_0_1_1_3;
	}
	
	@Length(min=0, max=64, message="责任护士长度不能超过 64 个字符")
	public String getCm_0_1_1_4() {
		return cm_0_1_1_4;
	}

	public void setCm_0_1_1_4(String cm_0_1_1_4) {
		this.cm_0_1_1_4 = cm_0_1_1_4;
	}
	
	@Length(min=0, max=64, message="上报科室长度不能超过 64 个字符")
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
	
	@Length(min=0, max=64, message="主要诊断或其他诊断ICD-10四位亚目编码与名称长度不能超过 64 个字符")
	public String getCm_0_1_3_1() {
		return cm_0_1_3_1;
	}

	public void setCm_0_1_3_1(String cm_0_1_3_1) {
		this.cm_0_1_3_1 = cm_0_1_3_1;
	}
	
	@Length(min=0, max=64, message="主要诊断或其他诊断ICD-10六位临床扩展编码与名称长度不能超过 64 个字符")
	public String getCm_0_1_3_2() {
		return cm_0_1_3_2;
	}

	public void setCm_0_1_3_2(String cm_0_1_3_2) {
		this.cm_0_1_3_2 = cm_0_1_3_2;
	}
	
	@Length(min=0, max=64, message="第一诊断或第二诊断对应的原发疾病ICD-10的三位类亚目编码与名称长度不能超过 64 个字符")
	public String getHf_0_1_4_1() {
		return hf_0_1_4_1;
	}

	public void setHf_0_1_4_1(String hf_0_1_4_1) {
		this.hf_0_1_4_1 = hf_0_1_4_1;
	}
	
	@Length(min=0, max=64, message="第一诊断或第二诊断对应的原发疾病ICD-10的三位类目编码与名称长度不能超过 64 个字符")
	public String getHf_0_1_4_2() {
		return hf_0_1_4_2;
	}

	public void setHf_0_1_4_2(String hf_0_1_4_2) {
		this.hf_0_1_4_2 = hf_0_1_4_2;
	}
	
	@Length(min=0, max=64, message="主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称长度不能超过 64 个字符")
	public String getCm_0_1_4_1() {
		return cm_0_1_4_1;
	}

	public void setCm_0_1_4_1(String cm_0_1_4_1) {
		this.cm_0_1_4_1 = cm_0_1_4_1;
	}
	
	@Length(min=0, max=64, message="主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称长度不能超过 64 个字符")
	public String getCm_0_1_4_2() {
		return cm_0_1_4_2;
	}

	public void setCm_0_1_4_2(String cm_0_1_4_2) {
		this.cm_0_1_4_2 = cm_0_1_4_2;
	}
	
	@Length(min=0, max=64, message="是否出院后31天内重复住院长度不能超过 64 个字符")
	public String getCm_0_1_5() {
		return cm_0_1_5;
	}

	public void setCm_0_1_5(String cm_0_1_5) {
		this.cm_0_1_5 = cm_0_1_5;
	}
	
	@Length(min=0, max=64, message="出生日期长度不能超过 64 个字符")
	public String getCm_0_2_1_1() {
		return cm_0_2_1_1;
	}

	public void setCm_0_2_1_1(String cm_0_2_1_1) {
		this.cm_0_2_1_1 = cm_0_2_1_1;
	}
	
	@Length(min=0, max=64, message="患者性别长度不能超过 64 个字符")
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
	
	@Length(min=0, max=64, message="发病日期时间是否无法确定或无记录长度不能超过 64 个字符")
	public String getCm_0_2_2_1() {
		return cm_0_2_2_1;
	}

	public void setCm_0_2_2_1(String cm_0_2_2_1) {
		this.cm_0_2_2_1 = cm_0_2_2_1;
	}
	
	@Length(min=0, max=64, message="发病日期时间长度不能超过 64 个字符")
	public String getCm_0_2_2_2() {
		return cm_0_2_2_2;
	}

	public void setCm_0_2_2_2(String cm_0_2_2_2) {
		this.cm_0_2_2_2 = cm_0_2_2_2;
	}
	
	@Length(min=0, max=64, message="到达本院急诊或者门诊日期时间是否无法确定或无记录长度不能超过 64 个字符")
	public String getCm_0_2_3_1() {
		return cm_0_2_3_1;
	}

	public void setCm_0_2_3_1(String cm_0_2_3_1) {
		this.cm_0_2_3_1 = cm_0_2_3_1;
	}
	
	@Length(min=0, max=64, message="到达本院急诊或者门诊日期时间长度不能超过 64 个字符")
	public String getCm_0_2_3_2() {
		return cm_0_2_3_2;
	}

	public void setCm_0_2_3_2(String cm_0_2_3_2) {
		this.cm_0_2_3_2 = cm_0_2_3_2;
	}
	
	@Length(min=0, max=64, message="入院日期时间长度不能超过 64 个字符")
	public String getCm_0_2_4_1() {
		return cm_0_2_4_1;
	}

	public void setCm_0_2_4_1(String cm_0_2_4_1) {
		this.cm_0_2_4_1 = cm_0_2_4_1;
	}
	
	@Length(min=0, max=64, message="出院日期时间长度不能超过 64 个字符")
	public String getCm_0_2_4_2() {
		return cm_0_2_4_2;
	}

	public void setCm_0_2_4_2(String cm_0_2_4_2) {
		this.cm_0_2_4_2 = cm_0_2_4_2;
	}
	
	@Length(min=0, max=64, message="入住CCU日期时间长度不能超过 64 个字符")
	public String getCm_0_2_5_1() {
		return cm_0_2_5_1;
	}

	public void setCm_0_2_5_1(String cm_0_2_5_1) {
		this.cm_0_2_5_1 = cm_0_2_5_1;
	}
	
	@Length(min=0, max=64, message="离开CCU日期时间长度不能超过 64 个字符")
	public String getCm_0_2_5_2() {
		return cm_0_2_5_2;
	}

	public void setCm_0_2_5_2(String cm_0_2_5_2) {
		this.cm_0_2_5_2 = cm_0_2_5_2;
	}
	
	@Length(min=0, max=64, message="手术开始长度不能超过 64 个字符")
	public String getCm_0_2_6_1() {
		return cm_0_2_6_1;
	}

	public void setCm_0_2_6_1(String cm_0_2_6_1) {
		this.cm_0_2_6_1 = cm_0_2_6_1;
	}
	
	@Length(min=0, max=64, message="手术结束长度不能超过 64 个字符")
	public String getCm_0_2_6_2() {
		return cm_0_2_6_2;
	}

	public void setCm_0_2_6_2(String cm_0_2_6_2) {
		this.cm_0_2_6_2 = cm_0_2_6_2;
	}
	
	@Length(min=0, max=64, message="费用支付方式长度不能超过 64 个字符")
	public String getCm_0_3_1() {
		return cm_0_3_1;
	}

	public void setCm_0_3_1(String cm_0_3_1) {
		this.cm_0_3_1 = cm_0_3_1;
	}
	
	@Length(min=0, max=64, message="收入住院途径长度不能超过 64 个字符")
	public String getCm_0_3_2() {
		return cm_0_3_2;
	}

	public void setCm_0_3_2(String cm_0_3_2) {
		this.cm_0_3_2 = cm_0_3_2;
	}
	
	@Length(min=0, max=64, message="到院交通工具长度不能超过 64 个字符")
	public String getCm_0_3_3() {
		return cm_0_3_3;
	}

	public void setCm_0_3_3(String cm_0_3_3) {
		this.cm_0_3_3 = cm_0_3_3;
	}
	
	@Length(min=0, max=64, message="是否实施首次X线胸片检查长度不能超过 64 个字符")
	public String getHf_1_1_1() {
		return hf_1_1_1;
	}

	public void setHf_1_1_1(String hf_1_1_1) {
		this.hf_1_1_1 = hf_1_1_1;
	}
	
	@Length(min=0, max=64, message="首次X线胸片检查报告日期时间长度不能超过 64 个字符")
	public String getHf_1_1_2() {
		return hf_1_1_2;
	}

	public void setHf_1_1_2(String hf_1_1_2) {
		this.hf_1_1_2 = hf_1_1_2;
	}
	
	@Length(min=0, max=64, message="首次X线胸片检查报告是否有肺淤血或肺水肿长度不能超过 64 个字符")
	public String getHf_1_1_3() {
		return hf_1_1_3;
	}

	public void setHf_1_1_3(String hf_1_1_3) {
		this.hf_1_1_3 = hf_1_1_3;
	}
	
	@Length(min=0, max=64, message="是否实施首次超声心动图长度不能超过 64 个字符")
	public String getHf_1_2_1() {
		return hf_1_2_1;
	}

	public void setHf_1_2_1(String hf_1_2_1) {
		this.hf_1_2_1 = hf_1_2_1;
	}
	
	@Length(min=0, max=64, message="报告日期时间长度不能超过 64 个字符")
	public String getHf_1_2_2() {
		return hf_1_2_2;
	}

	public void setHf_1_2_2(String hf_1_2_2) {
		this.hf_1_2_2 = hf_1_2_2;
	}
	
	public Double getHf_1_2_3_4() {
		return hf_1_2_3_4;
	}

	public void setHf_1_2_3_4(Double hf_1_2_3_4) {
		this.hf_1_2_3_4 = hf_1_2_3_4;
	}
	
	public Double getHf_1_2_3_1() {
		return hf_1_2_3_1;
	}

	public void setHf_1_2_3_1(Double hf_1_2_3_1) {
		this.hf_1_2_3_1 = hf_1_2_3_1;
	}
	
	@Length(min=0, max=64, message="左室射血分数评估结论长度不能超过 64 个字符")
	public String getHf_1_2_3_2() {
		return hf_1_2_3_2;
	}

	public void setHf_1_2_3_2(String hf_1_2_3_2) {
		this.hf_1_2_3_2 = hf_1_2_3_2;
	}
	
	@Length(min=0, max=64, message="是否有左心室室壁瘤长度不能超过 64 个字符")
	public String getHf_1_2_3_3() {
		return hf_1_2_3_3;
	}

	public void setHf_1_2_3_3(String hf_1_2_3_3) {
		this.hf_1_2_3_3 = hf_1_2_3_3;
	}
	
	@Length(min=0, max=64, message="实施首次评估患者的危险程度长度不能超过 64 个字符")
	public String getHf_1_3_1() {
		return hf_1_3_1;
	}

	public void setHf_1_3_1(String hf_1_3_1) {
		this.hf_1_3_1 = hf_1_3_1;
	}
	
	@Length(min=0, max=64, message="Killip分级评估结果的选择长度不能超过 64 个字符")
	public String getHf_1_3_3() {
		return hf_1_3_3;
	}

	public void setHf_1_3_3(String hf_1_3_3) {
		this.hf_1_3_3 = hf_1_3_3;
	}
	
	@Length(min=0, max=64, message="NYHA分级结果的选择长度不能超过 64 个字符")
	public String getHf_1_3_2() {
		return hf_1_3_2;
	}

	public void setHf_1_3_2(String hf_1_3_2) {
		this.hf_1_3_2 = hf_1_3_2;
	}
	
	@Length(min=0, max=64, message="是否为非瓣膜性房颤/房扑患者长度不能超过 64 个字符")
	public String getHf_1_3_5() {
		return hf_1_3_5;
	}

	public void setHf_1_3_5(String hf_1_3_5) {
		this.hf_1_3_5 = hf_1_3_5;
	}
	
	@Length(min=0, max=64, message="是否实施房颤患者风险评估长度不能超过 64 个字符")
	public String getHf_1_3_6_1() {
		return hf_1_3_6_1;
	}

	public void setHf_1_3_6_1(String hf_1_3_6_1) {
		this.hf_1_3_6_1 = hf_1_3_6_1;
	}
	
	public Double getHf_1_3_6_2() {
		return hf_1_3_6_2;
	}

	public void setHf_1_3_6_2(Double hf_1_3_6_2) {
		this.hf_1_3_6_2 = hf_1_3_6_2;
	}
	
	@Length(min=0, max=64, message="CHA2DS2-VASc评分大于2分长度不能超过 64 个字符")
	public String getHf_1_3_6_3() {
		return hf_1_3_6_3;
	}

	public void setHf_1_3_6_3(String hf_1_3_6_3) {
		this.hf_1_3_6_3 = hf_1_3_6_3;
	}
	
	@Length(min=0, max=64, message="急诊或入院后是否首次心电图长度不能超过 64 个字符")
	public String getHf_1_4_1() {
		return hf_1_4_1;
	}

	public void setHf_1_4_1(String hf_1_4_1) {
		this.hf_1_4_1 = hf_1_4_1;
	}
	
	@Length(min=0, max=64, message="报告日期时间长度不能超过 64 个字符")
	public String getHf_1_4_2() {
		return hf_1_4_2;
	}

	public void setHf_1_4_2(String hf_1_4_2) {
		this.hf_1_4_2 = hf_1_4_2;
	}
	
	public Double getHf_1_4_3() {
		return hf_1_4_3;
	}

	public void setHf_1_4_3(Double hf_1_4_3) {
		this.hf_1_4_3 = hf_1_4_3;
	}
	
	@Length(min=0, max=64, message="心电图长度不能超过 64 个字符")
	public String getHf_1_4_4() {
		return hf_1_4_4;
	}

	public void setHf_1_4_4(String hf_1_4_4) {
		this.hf_1_4_4 = hf_1_4_4;
	}
	
	@Length(min=0, max=64, message="其他心电图检查结果长度不能超过 64 个字符")
	public String getHf_1_4_4_1() {
		return hf_1_4_4_1;
	}

	public void setHf_1_4_4_1(String hf_1_4_4_1) {
		this.hf_1_4_4_1 = hf_1_4_4_1;
	}
	
	@Length(min=0, max=64, message="是否实施首次检测长度不能超过 64 个字符")
	public String getHf_1_5_1_1() {
		return hf_1_5_1_1;
	}

	public void setHf_1_5_1_1(String hf_1_5_1_1) {
		this.hf_1_5_1_1 = hf_1_5_1_1;
	}
	
	@Length(min=0, max=64, message="首次检测结果报告日期长度不能超过 64 个字符")
	public String getHf_1_5_1_2() {
		return hf_1_5_1_2;
	}

	public void setHf_1_5_1_2(String hf_1_5_1_2) {
		this.hf_1_5_1_2 = hf_1_5_1_2;
	}
	
	@Length(min=0, max=64, message="首次检测选择长度不能超过 64 个字符")
	public String getHf_1_5_3() {
		return hf_1_5_3;
	}

	public void setHf_1_5_3(String hf_1_5_3) {
		this.hf_1_5_3 = hf_1_5_3;
	}
	
	public Double getHf_1_5_2_1() {
		return hf_1_5_2_1;
	}

	public void setHf_1_5_2_1(Double hf_1_5_2_1) {
		this.hf_1_5_2_1 = hf_1_5_2_1;
	}
	
	public Double getHf_1_5_2_2() {
		return hf_1_5_2_2;
	}

	public void setHf_1_5_2_2(Double hf_1_5_2_2) {
		this.hf_1_5_2_2 = hf_1_5_2_2;
	}
	
	public Double getHf_1_5_2_3() {
		return hf_1_5_2_3;
	}

	public void setHf_1_5_2_3(Double hf_1_5_2_3) {
		this.hf_1_5_2_3 = hf_1_5_2_3;
	}
	
	public Double getHf_1_5_2_4() {
		return hf_1_5_2_4;
	}

	public void setHf_1_5_2_4(Double hf_1_5_2_4) {
		this.hf_1_5_2_4 = hf_1_5_2_4;
	}
	
	public Double getHf_1_5_2_5() {
		return hf_1_5_2_5;
	}

	public void setHf_1_5_2_5(Double hf_1_5_2_5) {
		this.hf_1_5_2_5 = hf_1_5_2_5;
	}
	
	public Double getHf_1_5_2_6() {
		return hf_1_5_2_6;
	}

	public void setHf_1_5_2_6(Double hf_1_5_2_6) {
		this.hf_1_5_2_6 = hf_1_5_2_6;
	}
	
	@Length(min=0, max=64, message="是否有利尿剂的禁忌证长度不能超过 64 个字符")
	public String getHf_2_1_a() {
		return hf_2_1_a;
	}

	public void setHf_2_1_a(String hf_2_1_a) {
		this.hf_2_1_a = hf_2_1_a;
	}
	
	@Length(min=0, max=64, message="使用利尿剂的禁忌证选择长度不能超过 64 个字符")
	public String getHf_2_1() {
		return hf_2_1;
	}

	public void setHf_2_1(String hf_2_1) {
		this.hf_2_1 = hf_2_1;
	}
	
	@Length(min=0, max=64, message="其他使用利尿剂的禁忌证长度不能超过 64 个字符")
	public String getHf_2_1_1() {
		return hf_2_1_1;
	}

	public void setHf_2_1_1(String hf_2_1_1) {
		this.hf_2_1_1 = hf_2_1_1;
	}
	
	@Length(min=0, max=64, message="首剂用药日期时间长度不能超过 64 个字符")
	public String getHf_2_2() {
		return hf_2_2;
	}

	public void setHf_2_2(String hf_2_2) {
		this.hf_2_2 = hf_2_2;
	}
	
	@Length(min=0, max=64, message="常用利尿剂药物长度不能超过 64 个字符")
	public String getHf_2_3() {
		return hf_2_3;
	}

	public void setHf_2_3(String hf_2_3) {
		this.hf_2_3 = hf_2_3;
	}
	
	@Length(min=0, max=64, message="其他利尿剂药物填写长度不能超过 64 个字符")
	public String getHf_2_3_1() {
		return hf_2_3_1;
	}

	public void setHf_2_3_1(String hf_2_3_1) {
		this.hf_2_3_1 = hf_2_3_1;
	}
	
	@Length(min=0, max=64, message="入院至使用首剂利尿剂时间大于24小时长度不能超过 64 个字符")
	public String getHf_2_5() {
		return hf_2_5;
	}

	public void setHf_2_5(String hf_2_5) {
		this.hf_2_5 = hf_2_5;
	}
	
	@Length(min=0, max=64, message="延迟治疗原因的选择长度不能超过 64 个字符")
	public String getHf_2_4() {
		return hf_2_4;
	}

	public void setHf_2_4(String hf_2_4) {
		this.hf_2_4 = hf_2_4;
	}
	
	@Length(min=0, max=64, message="其他延迟治疗原因长度不能超过 64 个字符")
	public String getHf_2_4_1() {
		return hf_2_4_1;
	}

	public void setHf_2_4_1(String hf_2_4_1) {
		this.hf_2_4_1 = hf_2_4_1;
	}
	
	@Length(min=0, max=64, message="左心室收缩功能障碍长度不能超过 64 个字符")
	public String getHf_3_1() {
		return hf_3_1;
	}

	public void setHf_3_1(String hf_3_1) {
		this.hf_3_1 = hf_3_1;
	}
	
	@Length(min=0, max=64, message="是否有ACEI抑制剂类药物禁忌证长度不能超过 64 个字符")
	public String getHf_3_2_a() {
		return hf_3_2_a;
	}

	public void setHf_3_2_a(String hf_3_2_a) {
		this.hf_3_2_a = hf_3_2_a;
	}
	
	@Length(min=0, max=64, message="ACEI抑制剂类药物禁忌证与须慎用的情况长度不能超过 64 个字符")
	public String getHf_3_2_1() {
		return hf_3_2_1;
	}

	public void setHf_3_2_1(String hf_3_2_1) {
		this.hf_3_2_1 = hf_3_2_1;
	}
	
	@Length(min=0, max=64, message="ACE抑制剂药物长度不能超过 64 个字符")
	public String getHf_3_4_a() {
		return hf_3_4_a;
	}

	public void setHf_3_4_a(String hf_3_4_a) {
		this.hf_3_4_a = hf_3_4_a;
	}
	
	@Length(min=0, max=64, message="其他ACEI药物长度不能超过 64 个字符")
	public String getHf_3_4_a_1() {
		return hf_3_4_a_1;
	}

	public void setHf_3_4_a_1(String hf_3_4_a_1) {
		this.hf_3_4_a_1 = hf_3_4_a_1;
	}
	
	@Length(min=0, max=64, message="ARB类药物长度不能超过 64 个字符")
	public String getHf_3_4_b() {
		return hf_3_4_b;
	}

	public void setHf_3_4_b(String hf_3_4_b) {
		this.hf_3_4_b = hf_3_4_b;
	}
	
	@Length(min=0, max=64, message="其他ARB类药物填写长度不能超过 64 个字符")
	public String getHf_3_4_b_1() {
		return hf_3_4_b_1;
	}

	public void setHf_3_4_b_1(String hf_3_4_b_1) {
		this.hf_3_4_b_1 = hf_3_4_b_1;
	}
	
	@Length(min=0, max=64, message="是否有ARNI类药物禁忌证长度不能超过 64 个字符")
	public String getHf_3_2_b() {
		return hf_3_2_b;
	}

	public void setHf_3_2_b(String hf_3_2_b) {
		this.hf_3_2_b = hf_3_2_b;
	}
	
	@Length(min=0, max=64, message="ARNI类药物禁忌证与须慎用的情况长度不能超过 64 个字符")
	public String getHf_3_2_2() {
		return hf_3_2_2;
	}

	public void setHf_3_2_2(String hf_3_2_2) {
		this.hf_3_2_2 = hf_3_2_2;
	}
	
	@Length(min=0, max=64, message="使用血管紧张素受体脑啡肽酶抑制剂长度不能超过 64 个字符")
	public String getHf_3_4_c() {
		return hf_3_4_c;
	}

	public void setHf_3_4_c(String hf_3_4_c) {
		this.hf_3_4_c = hf_3_4_c;
	}
	
	@Length(min=0, max=64, message="其他使用血管紧张素受体脑啡肽酶抑制剂长度不能超过 64 个字符")
	public String getHf_3_4_c_1() {
		return hf_3_4_c_1;
	}

	public void setHf_3_4_c_1(String hf_3_4_c_1) {
		this.hf_3_4_c_1 = hf_3_4_c_1;
	}
	
	@Length(min=0, max=64, message="首剂用药日期是否未确定长度不能超过 64 个字符")
	public String getHf_3_3_1() {
		return hf_3_3_1;
	}

	public void setHf_3_3_1(String hf_3_3_1) {
		this.hf_3_3_1 = hf_3_3_1;
	}
	
	@Length(min=0, max=64, message="首剂用药日期时间长度不能超过 64 个字符")
	public String getHf_3_3() {
		return hf_3_3;
	}

	public void setHf_3_3(String hf_3_3) {
		this.hf_3_3 = hf_3_3;
	}
	
	@Length(min=0, max=64, message="入院至使用首剂ACEI/ARB类药物时间大于24小时长度不能超过 64 个字符")
	public String getHf_3_6() {
		return hf_3_6;
	}

	public void setHf_3_6(String hf_3_6) {
		this.hf_3_6 = hf_3_6;
	}
	
	@Length(min=0, max=64, message="延迟治疗原因长度不能超过 64 个字符")
	public String getHf_3_5() {
		return hf_3_5;
	}

	public void setHf_3_5(String hf_3_5) {
		this.hf_3_5 = hf_3_5;
	}
	
	@Length(min=0, max=64, message="其他延迟治疗原因长度不能超过 64 个字符")
	public String getHf_3_5_1() {
		return hf_3_5_1;
	}

	public void setHf_3_5_1(String hf_3_5_1) {
		this.hf_3_5_1 = hf_3_5_1;
	}
	
	@Length(min=0, max=64, message="是否有禁忌证与须慎用的情况长度不能超过 64 个字符")
	public String getHf_4_1_1() {
		return hf_4_1_1;
	}

	public void setHf_4_1_1(String hf_4_1_1) {
		this.hf_4_1_1 = hf_4_1_1;
	}
	
	@Length(min=0, max=64, message="β-受体阻滞剂禁忌证选择长度不能超过 64 个字符")
	public String getHf_4_1_2() {
		return hf_4_1_2;
	}

	public void setHf_4_1_2(String hf_4_1_2) {
		this.hf_4_1_2 = hf_4_1_2;
	}
	
	@Length(min=0, max=64, message="使用首剂β-受体阻滞剂药物长度不能超过 64 个字符")
	public String getHf_4_3() {
		return hf_4_3;
	}

	public void setHf_4_3(String hf_4_3) {
		this.hf_4_3 = hf_4_3;
	}
	
	@Length(min=0, max=64, message="其他β-受体阻滞剂药物长度不能超过 64 个字符")
	public String getHf_4_3_1() {
		return hf_4_3_1;
	}

	public void setHf_4_3_1(String hf_4_3_1) {
		this.hf_4_3_1 = hf_4_3_1;
	}
	
	@Length(min=0, max=64, message="首剂用药日期是否未确定长度不能超过 64 个字符")
	public String getHf_4_2_1() {
		return hf_4_2_1;
	}

	public void setHf_4_2_1(String hf_4_2_1) {
		this.hf_4_2_1 = hf_4_2_1;
	}
	
	@Length(min=0, max=64, message="首剂用药日期时间长度不能超过 64 个字符")
	public String getHf_4_2() {
		return hf_4_2;
	}

	public void setHf_4_2(String hf_4_2) {
		this.hf_4_2 = hf_4_2;
	}
	
	@Length(min=0, max=64, message="入院至使用首剂β-受体阻滞剂时间大于24小时长度不能超过 64 个字符")
	public String getHf_4_5() {
		return hf_4_5;
	}

	public void setHf_4_5(String hf_4_5) {
		this.hf_4_5 = hf_4_5;
	}
	
	@Length(min=0, max=64, message="延迟治疗原因长度不能超过 64 个字符")
	public String getHf_4_4() {
		return hf_4_4;
	}

	public void setHf_4_4(String hf_4_4) {
		this.hf_4_4 = hf_4_4;
	}
	
	@Length(min=0, max=64, message="其他延迟治疗原因长度不能超过 64 个字符")
	public String getHf_4_4_1() {
		return hf_4_4_1;
	}

	public void setHf_4_4_1(String hf_4_4_1) {
		this.hf_4_4_1 = hf_4_4_1;
	}
	
	@Length(min=0, max=64, message="是否有醛固酮受体拮抗剂的禁忌证长度不能超过 64 个字符")
	public String getHf_5_1_1() {
		return hf_5_1_1;
	}

	public void setHf_5_1_1(String hf_5_1_1) {
		this.hf_5_1_1 = hf_5_1_1;
	}
	
	@Length(min=0, max=64, message="醛固酮受体拮抗剂的禁忌证长度不能超过 64 个字符")
	public String getHf_5_1_2() {
		return hf_5_1_2;
	}

	public void setHf_5_1_2(String hf_5_1_2) {
		this.hf_5_1_2 = hf_5_1_2;
	}
	
	@Length(min=0, max=64, message="重度心衰使用醛固酮受体拮抗剂适用症长度不能超过 64 个字符")
	public String getHf_5_2() {
		return hf_5_2;
	}

	public void setHf_5_2(String hf_5_2) {
		this.hf_5_2 = hf_5_2;
	}
	
	@Length(min=0, max=64, message="其他重度心衰使用醛固酮受体拮抗剂适用症长度不能超过 64 个字符")
	public String getHf_5_2_1_1() {
		return hf_5_2_1_1;
	}

	public void setHf_5_2_1_1(String hf_5_2_1_1) {
		this.hf_5_2_1_1 = hf_5_2_1_1;
	}
	
	@Length(min=0, max=64, message="首剂用药日期是否未确定长度不能超过 64 个字符")
	public String getHf_5_3_1() {
		return hf_5_3_1;
	}

	public void setHf_5_3_1(String hf_5_3_1) {
		this.hf_5_3_1 = hf_5_3_1;
	}
	
	@Length(min=0, max=64, message="首剂用药日期时间长度不能超过 64 个字符")
	public String getHf_5_3() {
		return hf_5_3;
	}

	public void setHf_5_3(String hf_5_3) {
		this.hf_5_3 = hf_5_3;
	}
	
	@Length(min=0, max=64, message="入院至使用首剂醛固酮受体拮抗剂时间大于24小时长度不能超过 64 个字符")
	public String getHf_5_6() {
		return hf_5_6;
	}

	public void setHf_5_6(String hf_5_6) {
		this.hf_5_6 = hf_5_6;
	}
	
	@Length(min=0, max=64, message="使用醛固酮受体拮抗剂长度不能超过 64 个字符")
	public String getHf_5_4() {
		return hf_5_4;
	}

	public void setHf_5_4(String hf_5_4) {
		this.hf_5_4 = hf_5_4;
	}
	
	@Length(min=0, max=64, message="其他醛固酮受体拮抗剂类药物长度不能超过 64 个字符")
	public String getHf_5_4_1() {
		return hf_5_4_1;
	}

	public void setHf_5_4_1(String hf_5_4_1) {
		this.hf_5_4_1 = hf_5_4_1;
	}
	
	@Length(min=0, max=64, message="延迟治疗原因长度不能超过 64 个字符")
	public String getHf_5_5() {
		return hf_5_5;
	}

	public void setHf_5_5(String hf_5_5) {
		this.hf_5_5 = hf_5_5;
	}
	
	@Length(min=0, max=64, message="其他延迟治疗原因长度不能超过 64 个字符")
	public String getHf_5_5_1() {
		return hf_5_5_1;
	}

	public void setHf_5_5_1(String hf_5_5_1) {
		this.hf_5_5_1 = hf_5_5_1;
	}
	
	@Length(min=0, max=64, message="是否有用药长期医嘱长度不能超过 64 个字符")
	public String getHf_6_1_1() {
		return hf_6_1_1;
	}

	public void setHf_6_1_1(String hf_6_1_1) {
		this.hf_6_1_1 = hf_6_1_1;
	}
	
	@Length(min=0, max=64, message="常用利尿剂药物的选择长度不能超过 64 个字符")
	public String getHf_6_1_2() {
		return hf_6_1_2;
	}

	public void setHf_6_1_2(String hf_6_1_2) {
		this.hf_6_1_2 = hf_6_1_2;
	}
	
	@Length(min=0, max=64, message="其他常用利尿剂长度不能超过 64 个字符")
	public String getHf_6_1_2_1() {
		return hf_6_1_2_1;
	}

	public void setHf_6_1_2_1(String hf_6_1_2_1) {
		this.hf_6_1_2_1 = hf_6_1_2_1;
	}
	
	@Length(min=0, max=64, message="是否有ACEI或ARB药物长期医嘱长度不能超过 64 个字符")
	public String getHf_6_2_1() {
		return hf_6_2_1;
	}

	public void setHf_6_2_1(String hf_6_2_1) {
		this.hf_6_2_1 = hf_6_2_1;
	}
	
	@Length(min=0, max=64, message="使用ACEI抑制剂或者ARB或者ARNI类药物选择长度不能超过 64 个字符")
	public String getHf_6_2_2() {
		return hf_6_2_2;
	}

	public void setHf_6_2_2(String hf_6_2_2) {
		this.hf_6_2_2 = hf_6_2_2;
	}
	
	@Length(min=0, max=64, message="ACE抑制剂药物长度不能超过 64 个字符")
	public String getHf_6_2_2_a() {
		return hf_6_2_2_a;
	}

	public void setHf_6_2_2_a(String hf_6_2_2_a) {
		this.hf_6_2_2_a = hf_6_2_2_a;
	}
	
	@Length(min=0, max=64, message="其他ACEI药物填写长度不能超过 64 个字符")
	public String getHf_6_2_2_a_1() {
		return hf_6_2_2_a_1;
	}

	public void setHf_6_2_2_a_1(String hf_6_2_2_a_1) {
		this.hf_6_2_2_a_1 = hf_6_2_2_a_1;
	}
	
	@Length(min=0, max=64, message="ARB类药物长度不能超过 64 个字符")
	public String getHf_6_2_2_b() {
		return hf_6_2_2_b;
	}

	public void setHf_6_2_2_b(String hf_6_2_2_b) {
		this.hf_6_2_2_b = hf_6_2_2_b;
	}
	
	@Length(min=0, max=64, message="其他ARB药物填写长度不能超过 64 个字符")
	public String getHf_6_2_2_b_1() {
		return hf_6_2_2_b_1;
	}

	public void setHf_6_2_2_b_1(String hf_6_2_2_b_1) {
		this.hf_6_2_2_b_1 = hf_6_2_2_b_1;
	}
	
	@Length(min=0, max=64, message="使用血管紧张素受体脑啡肽酶抑制剂长度不能超过 64 个字符")
	public String getHf_6_2_2_c() {
		return hf_6_2_2_c;
	}

	public void setHf_6_2_2_c(String hf_6_2_2_c) {
		this.hf_6_2_2_c = hf_6_2_2_c;
	}
	
	@Length(min=0, max=64, message="其他使用血管紧张素受体脑啡肽酶抑制剂长度不能超过 64 个字符")
	public String getHf_6_2_2_c_1() {
		return hf_6_2_2_c_1;
	}

	public void setHf_6_2_2_c_1(String hf_6_2_2_c_1) {
		this.hf_6_2_2_c_1 = hf_6_2_2_c_1;
	}
	
	@Length(min=0, max=64, message="是否有β受体阻滞剂药物医嘱长度不能超过 64 个字符")
	public String getHf_6_3_1() {
		return hf_6_3_1;
	}

	public void setHf_6_3_1(String hf_6_3_1) {
		this.hf_6_3_1 = hf_6_3_1;
	}
	
	@Length(min=0, max=64, message="使用首剂β-受体阻滞剂药物长度不能超过 64 个字符")
	public String getHf_6_3_2() {
		return hf_6_3_2;
	}

	public void setHf_6_3_2(String hf_6_3_2) {
		this.hf_6_3_2 = hf_6_3_2;
	}
	
	@Length(min=0, max=64, message="其他β-受体阻滞剂药物填写长度不能超过 64 个字符")
	public String getHf_6_3_2_1() {
		return hf_6_3_2_1;
	}

	public void setHf_6_3_2_1(String hf_6_3_2_1) {
		this.hf_6_3_2_1 = hf_6_3_2_1;
	}
	
	@Length(min=0, max=64, message="是否有醛固酮拮抗剂药物医嘱长度不能超过 64 个字符")
	public String getHf_6_4_1() {
		return hf_6_4_1;
	}

	public void setHf_6_4_1(String hf_6_4_1) {
		this.hf_6_4_1 = hf_6_4_1;
	}
	
	@Length(min=0, max=64, message="使用醛固酮受体拮抗剂长度不能超过 64 个字符")
	public String getHf_6_4_2() {
		return hf_6_4_2;
	}

	public void setHf_6_4_2(String hf_6_4_2) {
		this.hf_6_4_2 = hf_6_4_2;
	}
	
	@Length(min=0, max=64, message="其他醛固酮受体拮抗剂类药物填写长度不能超过 64 个字符")
	public String getHf_6_4_2_1() {
		return hf_6_4_2_1;
	}

	public void setHf_6_4_2_1(String hf_6_4_2_1) {
		this.hf_6_4_2_1 = hf_6_4_2_1;
	}
	
	@Length(min=0, max=64, message="是否常用抗凝药物长度不能超过 64 个字符")
	public String getHf_6_5_1() {
		return hf_6_5_1;
	}

	public void setHf_6_5_1(String hf_6_5_1) {
		this.hf_6_5_1 = hf_6_5_1;
	}
	
	@Length(min=0, max=64, message="选择抗凝药物长度不能超过 64 个字符")
	public String getHf_6_5_2() {
		return hf_6_5_2;
	}

	public void setHf_6_5_2(String hf_6_5_2) {
		this.hf_6_5_2 = hf_6_5_2;
	}
	
	@Length(min=0, max=64, message="其他抗凝药物长度不能超过 64 个字符")
	public String getHf_6_5_2_1() {
		return hf_6_5_2_1;
	}

	public void setHf_6_5_2_1(String hf_6_5_2_1) {
		this.hf_6_5_2_1 = hf_6_5_2_1;
	}
	
	@Length(min=0, max=64, message="出院带药医嘱中是否有继续使用利尿剂记录医嘱长度不能超过 64 个字符")
	public String getHf_7_1_1() {
		return hf_7_1_1;
	}

	public void setHf_7_1_1(String hf_7_1_1) {
		this.hf_7_1_1 = hf_7_1_1;
	}
	
	@Length(min=0, max=64, message="常用利尿剂药物长度不能超过 64 个字符")
	public String getHf_7_1_2() {
		return hf_7_1_2;
	}

	public void setHf_7_1_2(String hf_7_1_2) {
		this.hf_7_1_2 = hf_7_1_2;
	}
	
	@Length(min=0, max=64, message="其他常用利尿剂长度不能超过 64 个字符")
	public String getHf_7_1_2_1() {
		return hf_7_1_2_1;
	}

	public void setHf_7_1_2_1(String hf_7_1_2_1) {
		this.hf_7_1_2_1 = hf_7_1_2_1;
	}
	
	@Length(min=0, max=64, message="出院带药医嘱中是否有继续使用ACEI或ARB药物记录医嘱长度不能超过 64 个字符")
	public String getHf_7_2_1() {
		return hf_7_2_1;
	}

	public void setHf_7_2_1(String hf_7_2_1) {
		this.hf_7_2_1 = hf_7_2_1;
	}
	
	@Length(min=0, max=64, message="使用ACEI抑制剂或者ARB或者ARNI类药物选择长度不能超过 64 个字符")
	public String getHf_7_2_2() {
		return hf_7_2_2;
	}

	public void setHf_7_2_2(String hf_7_2_2) {
		this.hf_7_2_2 = hf_7_2_2;
	}
	
	@Length(min=0, max=64, message="ACE抑制剂药物长度不能超过 64 个字符")
	public String getHf_7_2_2_a() {
		return hf_7_2_2_a;
	}

	public void setHf_7_2_2_a(String hf_7_2_2_a) {
		this.hf_7_2_2_a = hf_7_2_2_a;
	}
	
	@Length(min=0, max=64, message="其他ACEI药物长度不能超过 64 个字符")
	public String getHf_7_2_2_a_1() {
		return hf_7_2_2_a_1;
	}

	public void setHf_7_2_2_a_1(String hf_7_2_2_a_1) {
		this.hf_7_2_2_a_1 = hf_7_2_2_a_1;
	}
	
	@Length(min=0, max=64, message="ARB类药物长度不能超过 64 个字符")
	public String getHf_7_2_2_b() {
		return hf_7_2_2_b;
	}

	public void setHf_7_2_2_b(String hf_7_2_2_b) {
		this.hf_7_2_2_b = hf_7_2_2_b;
	}
	
	@Length(min=0, max=64, message="其他ARB药物填写长度不能超过 64 个字符")
	public String getHf_7_2_2_b_1() {
		return hf_7_2_2_b_1;
	}

	public void setHf_7_2_2_b_1(String hf_7_2_2_b_1) {
		this.hf_7_2_2_b_1 = hf_7_2_2_b_1;
	}
	
	@Length(min=0, max=64, message="使用血管紧张素受体脑啡肽酶抑制剂长度不能超过 64 个字符")
	public String getHf_7_2_2_c() {
		return hf_7_2_2_c;
	}

	public void setHf_7_2_2_c(String hf_7_2_2_c) {
		this.hf_7_2_2_c = hf_7_2_2_c;
	}
	
	@Length(min=0, max=64, message="其他使用血管紧张素受体脑啡肽酶抑制剂长度不能超过 64 个字符")
	public String getHf_7_2_2_c_1() {
		return hf_7_2_2_c_1;
	}

	public void setHf_7_2_2_c_1(String hf_7_2_2_c_1) {
		this.hf_7_2_2_c_1 = hf_7_2_2_c_1;
	}
	
	@Length(min=0, max=64, message="出院带药医嘱中是否有继续使用β受体阻滞剂药物医嘱长度不能超过 64 个字符")
	public String getHf_7_3_1() {
		return hf_7_3_1;
	}

	public void setHf_7_3_1(String hf_7_3_1) {
		this.hf_7_3_1 = hf_7_3_1;
	}
	
	@Length(min=0, max=64, message="使用首剂β-受体阻滞剂药物长度不能超过 64 个字符")
	public String getHf_7_3_2() {
		return hf_7_3_2;
	}

	public void setHf_7_3_2(String hf_7_3_2) {
		this.hf_7_3_2 = hf_7_3_2;
	}
	
	@Length(min=0, max=64, message="其他β-受体阻滞剂药物填写长度不能超过 64 个字符")
	public String getHf_7_3_2_1() {
		return hf_7_3_2_1;
	}

	public void setHf_7_3_2_1(String hf_7_3_2_1) {
		this.hf_7_3_2_1 = hf_7_3_2_1;
	}
	
	@Length(min=0, max=64, message="出院带药医嘱中是否有继续使用醛固酮拮抗剂药物医嘱长度不能超过 64 个字符")
	public String getHf_7_4_1() {
		return hf_7_4_1;
	}

	public void setHf_7_4_1(String hf_7_4_1) {
		this.hf_7_4_1 = hf_7_4_1;
	}
	
	@Length(min=0, max=64, message="使用醛固酮受体拮抗剂长度不能超过 64 个字符")
	public String getHf_7_4_2() {
		return hf_7_4_2;
	}

	public void setHf_7_4_2(String hf_7_4_2) {
		this.hf_7_4_2 = hf_7_4_2;
	}
	
	@Length(min=0, max=64, message="其他醛固酮受体拮抗剂长度不能超过 64 个字符")
	public String getHf_7_4_2_1() {
		return hf_7_4_2_1;
	}

	public void setHf_7_4_2_1(String hf_7_4_2_1) {
		this.hf_7_4_2_1 = hf_7_4_2_1;
	}
	
	@Length(min=0, max=64, message="出院带药医嘱中是否有继续使用使用抗凝药物医嘱长度不能超过 64 个字符")
	public String getHf_7_5_1() {
		return hf_7_5_1;
	}

	public void setHf_7_5_1(String hf_7_5_1) {
		this.hf_7_5_1 = hf_7_5_1;
	}
	
	@Length(min=0, max=64, message="选择抗凝药物长度不能超过 64 个字符")
	public String getHf_7_5_2() {
		return hf_7_5_2;
	}

	public void setHf_7_5_2(String hf_7_5_2) {
		this.hf_7_5_2 = hf_7_5_2;
	}
	
	@Length(min=0, max=64, message="其他抗凝药物长度不能超过 64 个字符")
	public String getHf_7_5_2_1() {
		return hf_7_5_2_1;
	}

	public void setHf_7_5_2_1(String hf_7_5_2_1) {
		this.hf_7_5_2_1 = hf_7_5_2_1;
	}
	
	@Length(min=0, max=64, message="离院方式选择长度不能超过 64 个字符")
	public String getCm_4_3() {
		return cm_4_3;
	}

	public void setCm_4_3(String cm_4_3) {
		this.cm_4_3 = cm_4_3;
	}
	
	@Length(min=0, max=64, message="非医嘱离院可能涉及因素长度不能超过 64 个字符")
	public String getCm_4_5() {
		return cm_4_5;
	}

	public void setCm_4_5(String cm_4_5) {
		this.cm_4_5 = cm_4_5;
	}
	
	@Length(min=0, max=64, message="其他非医嘱离院因素填写长度不能超过 64 个字符")
	public String getCm_4_4_1() {
		return cm_4_4_1;
	}

	public void setCm_4_4_1(String cm_4_4_1) {
		this.cm_4_4_1 = cm_4_4_1;
	}
	
	@Length(min=0, max=64, message="死亡可能涉及因素长度不能超过 64 个字符")
	public String getCm_4_6() {
		return cm_4_6;
	}

	public void setCm_4_6(String cm_4_6) {
		this.cm_4_6 = cm_4_6;
	}
	
	@Length(min=0, max=64, message="是否有吸烟史长度不能超过 64 个字符")
	public String getHf_8_1_1() {
		return hf_8_1_1;
	}

	public void setHf_8_1_1(String hf_8_1_1) {
		this.hf_8_1_1 = hf_8_1_1;
	}
	
	@Length(min=0, max=64, message="吸烟程度评估有记录长度不能超过 64 个字符")
	public String getHf_8_1_2() {
		return hf_8_1_2;
	}

	public void setHf_8_1_2(String hf_8_1_2) {
		this.hf_8_1_2 = hf_8_1_2;
	}
	
	@Length(min=0, max=64, message="接受戒烟的建议或者戒烟治疗有记录长度不能超过 64 个字符")
	public String getHf_8_1_3() {
		return hf_8_1_3;
	}

	public void setHf_8_1_3(String hf_8_1_3) {
		this.hf_8_1_3 = hf_8_1_3;
	}
	
	@Length(min=0, max=64, message="心衰原发疾病评估与教育长度不能超过 64 个字符")
	public String getHf_8_2_1_a() {
		return hf_8_2_1_a;
	}

	public void setHf_8_2_1_a(String hf_8_2_1_a) {
		this.hf_8_2_1_a = hf_8_2_1_a;
	}
	
	@Length(min=0, max=64, message="实施控制主要危险因素评估与教育长度不能超过 64 个字符")
	public String getHf_8_2_1_b() {
		return hf_8_2_1_b;
	}

	public void setHf_8_2_1_b(String hf_8_2_1_b) {
		this.hf_8_2_1_b = hf_8_2_1_b;
	}
	
	@Length(min=0, max=64, message="对控制危险因素评估的结果进行针对性的教育长度不能超过 64 个字符")
	public String getHf_8_2_2() {
		return hf_8_2_2;
	}

	public void setHf_8_2_2(String hf_8_2_2) {
		this.hf_8_2_2 = hf_8_2_2;
	}
	
	@Length(min=0, max=64, message="二级预防长度不能超过 64 个字符")
	public String getHf_8_3() {
		return hf_8_3;
	}

	public void setHf_8_3(String hf_8_3) {
		this.hf_8_3 = hf_8_3;
	}
	
	@Length(min=0, max=64, message="交与患者“出院小结”的副本告知患者出院时风险因素长度不能超过 64 个字符")
	public String getHf_8_4_1() {
		return hf_8_4_1;
	}

	public void setHf_8_4_1(String hf_8_4_1) {
		this.hf_8_4_1 = hf_8_4_1;
	}
	
	@Length(min=0, max=64, message="出院带药长度不能超过 64 个字符")
	public String getHf_8_4_2() {
		return hf_8_4_2;
	}

	public void setHf_8_4_2(String hf_8_4_2) {
		this.hf_8_4_2 = hf_8_4_2;
	}
	
	@Length(min=0, max=64, message="告知发生紧急情况时求援救治途径长度不能超过 64 个字符")
	public String getHf_8_4_3() {
		return hf_8_4_3;
	}

	public void setHf_8_4_3(String hf_8_4_3) {
		this.hf_8_4_3 = hf_8_4_3;
	}
	
	@Length(min=0, max=64, message="出院时教育与随访长度不能超过 64 个字符")
	public String getHf_8_4_4() {
		return hf_8_4_4;
	}

	public void setHf_8_4_4(String hf_8_4_4) {
		this.hf_8_4_4 = hf_8_4_4;
	}
	
	@Length(min=0, max=64, message="告知何为风险因素与紧急情况长度不能超过 64 个字符")
	public String getHf_8_4_5() {
		return hf_8_4_5;
	}

	public void setHf_8_4_5(String hf_8_4_5) {
		this.hf_8_4_5 = hf_8_4_5;
	}
	
	@Length(min=0, max=64, message="实施末次X线胸片检查长度不能超过 64 个字符")
	public String getHf_9_2_1_1() {
		return hf_9_2_1_1;
	}

	public void setHf_9_2_1_1(String hf_9_2_1_1) {
		this.hf_9_2_1_1 = hf_9_2_1_1;
	}
	
	@Length(min=0, max=64, message="是否有肺淤血或肺水肿长度不能超过 64 个字符")
	public String getHf_9_2_1_2() {
		return hf_9_2_1_2;
	}

	public void setHf_9_2_1_2(String hf_9_2_1_2) {
		this.hf_9_2_1_2 = hf_9_2_1_2;
	}
	
	@Length(min=0, max=64, message="是否实施末次超声心动图长度不能超过 64 个字符")
	public String getHf_9_2_2_1() {
		return hf_9_2_2_1;
	}

	public void setHf_9_2_2_1(String hf_9_2_2_1) {
		this.hf_9_2_2_1 = hf_9_2_2_1;
	}
	
	public Double getHf_9_2_2_2_4() {
		return hf_9_2_2_2_4;
	}

	public void setHf_9_2_2_2_4(Double hf_9_2_2_2_4) {
		this.hf_9_2_2_2_4 = hf_9_2_2_2_4;
	}
	
	public Double getHf_9_2_2_2_1() {
		return hf_9_2_2_2_1;
	}

	public void setHf_9_2_2_2_1(Double hf_9_2_2_2_1) {
		this.hf_9_2_2_2_1 = hf_9_2_2_2_1;
	}
	
	@Length(min=0, max=64, message="左室射血分数评估结论长度不能超过 64 个字符")
	public String getHf_9_2_2_2_2() {
		return hf_9_2_2_2_2;
	}

	public void setHf_9_2_2_2_2(String hf_9_2_2_2_2) {
		this.hf_9_2_2_2_2 = hf_9_2_2_2_2;
	}
	
	@Length(min=0, max=64, message="是否有左心室室壁瘤长度不能超过 64 个字符")
	public String getHf_9_2_2_2_3() {
		return hf_9_2_2_2_3;
	}

	public void setHf_9_2_2_2_3(String hf_9_2_2_2_3) {
		this.hf_9_2_2_2_3 = hf_9_2_2_2_3;
	}
	
	@Length(min=0, max=64, message="实施末次风险程度评估长度不能超过 64 个字符")
	public String getHf_9_2_3_1() {
		return hf_9_2_3_1;
	}

	public void setHf_9_2_3_1(String hf_9_2_3_1) {
		this.hf_9_2_3_1 = hf_9_2_3_1;
	}
	
	@Length(min=0, max=64, message="末次风险程度评估长度不能超过 64 个字符")
	public String getHf_9_2_3_2_ab() {
		return hf_9_2_3_2_ab;
	}

	public void setHf_9_2_3_2_ab(String hf_9_2_3_2_ab) {
		this.hf_9_2_3_2_ab = hf_9_2_3_2_ab;
	}
	
	@Length(min=0, max=64, message="NYHA分级结果长度不能超过 64 个字符")
	public String getHf_9_2_3_2() {
		return hf_9_2_3_2;
	}

	public void setHf_9_2_3_2(String hf_9_2_3_2) {
		this.hf_9_2_3_2 = hf_9_2_3_2;
	}
	
	@Length(min=0, max=64, message="Killip分级评估结果长度不能超过 64 个字符")
	public String getHf_9_2_3_3() {
		return hf_9_2_3_3;
	}

	public void setHf_9_2_3_3(String hf_9_2_3_3) {
		this.hf_9_2_3_3 = hf_9_2_3_3;
	}
	
	@Length(min=0, max=64, message="实施末次检测长度不能超过 64 个字符")
	public String getHf_9_2_4_1() {
		return hf_9_2_4_1;
	}

	public void setHf_9_2_4_1(String hf_9_2_4_1) {
		this.hf_9_2_4_1 = hf_9_2_4_1;
	}
	
	@Length(min=0, max=64, message="末次检测选择长度不能超过 64 个字符")
	public String getHf_9_2_4_2() {
		return hf_9_2_4_2;
	}

	public void setHf_9_2_4_2(String hf_9_2_4_2) {
		this.hf_9_2_4_2 = hf_9_2_4_2;
	}
	
	public Double getHf_9_2_4_2_1() {
		return hf_9_2_4_2_1;
	}

	public void setHf_9_2_4_2_1(Double hf_9_2_4_2_1) {
		this.hf_9_2_4_2_1 = hf_9_2_4_2_1;
	}
	
	public Double getHf_9_2_4_2_2() {
		return hf_9_2_4_2_2;
	}

	public void setHf_9_2_4_2_2(Double hf_9_2_4_2_2) {
		this.hf_9_2_4_2_2 = hf_9_2_4_2_2;
	}
	
	public Double getHf_9_2_4_2_3() {
		return hf_9_2_4_2_3;
	}

	public void setHf_9_2_4_2_3(Double hf_9_2_4_2_3) {
		this.hf_9_2_4_2_3 = hf_9_2_4_2_3;
	}
	
	public Double getHf_9_2_4_2_4() {
		return hf_9_2_4_2_4;
	}

	public void setHf_9_2_4_2_4(Double hf_9_2_4_2_4) {
		this.hf_9_2_4_2_4 = hf_9_2_4_2_4;
	}
	
	public Double getHf_9_2_4_2_5() {
		return hf_9_2_4_2_5;
	}

	public void setHf_9_2_4_2_5(Double hf_9_2_4_2_5) {
		this.hf_9_2_4_2_5 = hf_9_2_4_2_5;
	}
	
	public Double getHf_9_2_4_2_6() {
		return hf_9_2_4_2_6;
	}

	public void setHf_9_2_4_2_6(Double hf_9_2_4_2_6) {
		this.hf_9_2_4_2_6 = hf_9_2_4_2_6;
	}
	
	@Length(min=0, max=64, message="患者是否对服务的体验与评价长度不能超过 64 个字符")
	public String getCm_5_1() {
		return cm_5_1;
	}

	public void setCm_5_1(String cm_5_1) {
		this.cm_5_1 = cm_5_1;
	}
	
	@Length(min=0, max=64, message="整体医院评级长度不能超过 64 个字符")
	public String getCm_5_2_1() {
		return cm_5_2_1;
	}

	public void setCm_5_2_1(String cm_5_2_1) {
		this.cm_5_2_1 = cm_5_2_1;
	}
	
	@Length(min=0, max=64, message="患者推荐长度不能超过 64 个字符")
	public String getCm_5_2_2() {
		return cm_5_2_2;
	}

	public void setCm_5_2_2(String cm_5_2_2) {
		this.cm_5_2_2 = cm_5_2_2;
	}
	
	@Length(min=0, max=64, message="病房、床单元和卫生间清洁度长度不能超过 64 个字符")
	public String getCm_5_2_3() {
		return cm_5_2_3;
	}

	public void setCm_5_2_3(String cm_5_2_3) {
		this.cm_5_2_3 = cm_5_2_3;
	}
	
	@Length(min=0, max=64, message="病房与周边噪音长度不能超过 64 个字符")
	public String getCm_5_2_5() {
		return cm_5_2_5;
	}

	public void setCm_5_2_5(String cm_5_2_5) {
		this.cm_5_2_5 = cm_5_2_5;
	}
	
	@Length(min=0, max=64, message="医生沟通长度不能超过 64 个字符")
	public String getCm_5_2_6() {
		return cm_5_2_6;
	}

	public void setCm_5_2_6(String cm_5_2_6) {
		this.cm_5_2_6 = cm_5_2_6;
	}
	
	@Length(min=0, max=64, message="护士沟通长度不能超过 64 个字符")
	public String getCm_5_2_7() {
		return cm_5_2_7;
	}

	public void setCm_5_2_7(String cm_5_2_7) {
		this.cm_5_2_7 = cm_5_2_7;
	}
	
	@Length(min=0, max=64, message="药师沟通长度不能超过 64 个字符")
	public String getCm_5_2_8() {
		return cm_5_2_8;
	}

	public void setCm_5_2_8(String cm_5_2_8) {
		this.cm_5_2_8 = cm_5_2_8;
	}
	
	@Length(min=0, max=64, message="康复计划长度不能超过 64 个字符")
	public String getCm_5_2_9() {
		return cm_5_2_9;
	}

	public void setCm_5_2_9(String cm_5_2_9) {
		this.cm_5_2_9 = cm_5_2_9;
	}
	
	@Length(min=0, max=64, message="出院时的知情告知长度不能超过 64 个字符")
	public String getCm_5_2_10() {
		return cm_5_2_10;
	}

	public void setCm_5_2_10(String cm_5_2_10) {
		this.cm_5_2_10 = cm_5_2_10;
	}
	
	@Length(min=0, max=64, message="膳食评价长度不能超过 64 个字符")
	public String getCm_5_2_11() {
		return cm_5_2_11;
	}

	public void setCm_5_2_11(String cm_5_2_11) {
		this.cm_5_2_11 = cm_5_2_11;
	}
	
	@Length(min=0, max=64, message="心脏再同步化临床应用符合适应症长度不能超过 64 个字符")
	public String getHf_11_4_1() {
		return hf_11_4_1;
	}

	public void setHf_11_4_1(String hf_11_4_1) {
		this.hf_11_4_1 = hf_11_4_1;
	}
	
	@Length(min=0, max=64, message="CRT临床应用的适应证长度不能超过 64 个字符")
	public String getHf_11_1_1() {
		return hf_11_1_1;
	}

	public void setHf_11_1_1(String hf_11_1_1) {
		this.hf_11_1_1 = hf_11_1_1;
	}
	
	@Length(min=0, max=64, message="安装心脏再同步治疗长度不能超过 64 个字符")
	public String getHf_11_1_2() {
		return hf_11_1_2;
	}

	public void setHf_11_1_2(String hf_11_1_2) {
		this.hf_11_1_2 = hf_11_1_2;
	}
	
	@Length(min=0, max=64, message="安装日期时间长度不能超过 64 个字符")
	public String getHf_11_1_3() {
		return hf_11_1_3;
	}

	public void setHf_11_1_3(String hf_11_1_3) {
		this.hf_11_1_3 = hf_11_1_3;
	}
	
	@Length(min=0, max=64, message="心脏再同步治疗长度不能超过 64 个字符")
	public String getHf_11_1_4_1() {
		return hf_11_1_4_1;
	}

	public void setHf_11_1_4_1(String hf_11_1_4_1) {
		this.hf_11_1_4_1 = hf_11_1_4_1;
	}
	
	@Length(min=0, max=64, message="心脏再同步治疗长度不能超过 64 个字符")
	public String getHf_11_1_4_2() {
		return hf_11_1_4_2;
	}

	public void setHf_11_1_4_2(String hf_11_1_4_2) {
		this.hf_11_1_4_2 = hf_11_1_4_2;
	}
	
	public Double getHf_11_1_4_3() {
		return hf_11_1_4_3;
	}

	public void setHf_11_1_4_3(Double hf_11_1_4_3) {
		this.hf_11_1_4_3 = hf_11_1_4_3;
	}
	
	@Length(min=0, max=64, message="是否有在药物优化治疗超过3个月后实施埋藏式心律转复除颤器长度不能超过 64 个字符")
	public String getHf_11_5_1() {
		return hf_11_5_1;
	}

	public void setHf_11_5_1(String hf_11_5_1) {
		this.hf_11_5_1 = hf_11_5_1;
	}
	
	@Length(min=0, max=64, message="心衰患者植入ICD适应证长度不能超过 64 个字符")
	public String getHf_11_5_2() {
		return hf_11_5_2;
	}

	public void setHf_11_5_2(String hf_11_5_2) {
		this.hf_11_5_2 = hf_11_5_2;
	}
	
	@Length(min=0, max=64, message="二级预防适应证长度不能超过 64 个字符")
	public String getHf_11_5_4() {
		return hf_11_5_4;
	}

	public void setHf_11_5_4(String hf_11_5_4) {
		this.hf_11_5_4 = hf_11_5_4;
	}
	
	@Length(min=0, max=64, message="一级预防适应证长度不能超过 64 个字符")
	public String getHf_11_5_3() {
		return hf_11_5_3;
	}

	public void setHf_11_5_3(String hf_11_5_3) {
		this.hf_11_5_3 = hf_11_5_3;
	}
	
	@Length(min=0, max=64, message="缺血性心脏病患者长度不能超过 64 个字符")
	public String getHf_11_5_3_1() {
		return hf_11_5_3_1;
	}

	public void setHf_11_5_3_1(String hf_11_5_3_1) {
		this.hf_11_5_3_1 = hf_11_5_3_1;
	}
	
	@Length(min=0, max=64, message="非缺血性心衰患者长度不能超过 64 个字符")
	public String getHf_11_5_3_2() {
		return hf_11_5_3_2;
	}

	public void setHf_11_5_3_2(String hf_11_5_3_2) {
		this.hf_11_5_3_2 = hf_11_5_3_2;
	}
	
	@Length(min=0, max=64, message="是否安装埋藏式心律转复除颤器长度不能超过 64 个字符")
	public String getHf_11_2_2() {
		return hf_11_2_2;
	}

	public void setHf_11_2_2(String hf_11_2_2) {
		this.hf_11_2_2 = hf_11_2_2;
	}
	
	@Length(min=0, max=64, message="安装日期时间长度不能超过 64 个字符")
	public String getHf_11_2_3() {
		return hf_11_2_3;
	}

	public void setHf_11_2_3(String hf_11_2_3) {
		this.hf_11_2_3 = hf_11_2_3;
	}
	
	@Length(min=0, max=64, message="埋藏式心律转复除颤器长度不能超过 64 个字符")
	public String getHf_11_2_4_1() {
		return hf_11_2_4_1;
	}

	public void setHf_11_2_4_1(String hf_11_2_4_1) {
		this.hf_11_2_4_1 = hf_11_2_4_1;
	}
	
	@Length(min=0, max=64, message="埋藏式心律转复除颤器长度不能超过 64 个字符")
	public String getHf_11_2_4_2() {
		return hf_11_2_4_2;
	}

	public void setHf_11_2_4_2(String hf_11_2_4_2) {
		this.hf_11_2_4_2 = hf_11_2_4_2;
	}
	
	public Double getHf_11_2_5() {
		return hf_11_2_5;
	}

	public void setHf_11_2_5(Double hf_11_2_5) {
		this.hf_11_2_5 = hf_11_2_5;
	}
	
	@Length(min=0, max=64, message="通过优化流程实现从医院到社区的无缝衔接长度不能超过 64 个字符")
	public String getHf_11_3_1() {
		return hf_11_3_1;
	}

	public void setHf_11_3_1(String hf_11_3_1) {
		this.hf_11_3_1 = hf_11_3_1;
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