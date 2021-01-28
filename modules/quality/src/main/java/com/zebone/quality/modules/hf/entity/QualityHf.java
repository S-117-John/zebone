/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.hf.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.Date;

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
@Data
public class QualityHf extends DataEntity<QualityHf> {
	
	private static final long serialVersionUID = 1L;


	/**
	 * 质控医师
	 */
	@NotBlank(message = "质控医师不能为空")
	private String cm_0_1_1_1;

	/**
	 * 质控医师
	 */
	@NotBlank(message = "质控护士不能为空")
	private String cm_0_1_1_2;

	/**
	 * 主治医师
	 */
	@NotBlank(message = "主治医师不能为空")
	private String cm_0_1_1_3;		// 主治医师

	/**
	 * 责任护士
	 */
	@NotBlank(message = "责任护士不能为空")
	private String cm_0_1_1_4;

	/**
	 * 上报科室
	 */
	@NotBlank(message = "上报科室不能为空")
	private String cm_0_1_1_5;		// 上报科室

	/**
	 * 患者病案号
	 */
	@NotBlank(message = "患者病案号不能为空")
	private String caseid;		// 患者病案号

	/**
	 * 患者病案号
	 */
	@NotBlank(message = "主要诊断或其他诊断ICD-10四位亚目编码与名称不能为空")
	private String cm_0_1_3_1;

	/**
	 * 患者病案号
	 */
	@NotBlank(message = "主要诊断或其他诊断ICD-10六位临床扩展编码与名称不能为空")
	private String cm_0_1_3_2;

	/**
	 * 患者病案号
	 */
	@NotBlank(message = "第一诊断或第二诊断对应的原发疾病ICD-10的三位类亚目编码与名称不能为空")
	private String hf_0_1_4_1;

	/**
	 * 患者病案号
	 */
	@NotBlank(message = "第一诊断或第二诊断对应的原发疾病ICD-10的三位类目编码与名称不能为空")
	private String hf_0_1_4_2;


	private String cm_0_1_4_1;		// 主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称
	private String cm_0_1_4_2;		// 主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称

	/**
	 * 患者病案号
	 */
	@NotBlank(message = "是否出院后31天内重复住院不能为空")
	private String cm_0_1_5;

	/**
	 * 出生日期
	 */
	@NotNull(message = "出生日期不能为空")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date cm_0_2_1_1;		// 出生日期

	/**
	 * 患者性别
	 */
	@NotBlank(message = "患者性别不能为空")
	private String cm_0_2_1_2;		// 患者性别

	/**
	 * 患者体重
	 */
	@NotBlank(message = "患者体重不能为空")
	private Double cm_0_2_1_3;

	/**
	 * 患者身高
	 */
	@NotBlank(message = "患者身高不能为空")
	private Double cm_0_2_1_5;



	private String cm_0_2_2_1;		// 发病日期时间是否无法确定或无记录
	private String cm_0_2_2_2;		// 发病日期时间
	private String cm_0_2_3_1;		// 到达本院急诊或者门诊日期时间是否无法确定或无记录
	private String cm_0_2_3_2;		// 到达本院急诊或者门诊日期时间

	/**
	 * 入院日期时间
	 */
	@NotBlank(message = "入院日期时间不能为空")
	private String cm_0_2_4_1;

	/**
	 * 出院日期时间
	 */
	@NotBlank(message = "出院日期时间不能为空")
	private String cm_0_2_4_2;


	private String cm_0_2_5_1;		// 入住CCU日期时间
	private String cm_0_2_5_2;		// 离开CCU日期时间
	private String cm_0_2_6_1;		// 手术开始（切皮）日期时间
	private String cm_0_2_6_2;		// 手术结束（缝皮结束）日期时间

	/**
	 * 费用支付方式
	 */
	@NotBlank(message = "费用支付方式不能为空")
	private String cm_0_3_1;

	/**
	 * 收入住院途径
	 */
	@NotBlank(message = "收入住院途径不能为空")
	private String cm_0_3_2;


	/**
	 * 到院交通工具
	 */
	@NotBlank(message = "到院交通工具不能为空")
	private String cm_0_3_3;

	/**
	 * 到院交通工具
	 */
	@NotBlank(message = "是否实施首次X线胸片检查不能为空")
	private String hf_1_1_1;



	private String hf_1_1_2;		// 首次X线胸片检查报告日期时间
	private String hf_1_1_3;		// 首次X线胸片检查报告是否有肺淤血或肺水肿

	/**
	 * 是否实施首次超声心动图(CDFA)检查
	 */
	@NotBlank(message = "是否实施首次超声心动图(CDFA)检查不能为空")
	private String hf_1_2_1;		// 是否实施首次超声心动图(CDFA)检查
	private String hf_1_2_2;		// 报告日期时间
	private Double hf_1_2_3_4;		// 左室舒张末内径（LVEDD）(mm)
	private Double hf_1_2_3_1;		// 左室射血分（LVEF）测量值(%)

	/**
	 * 左室射血分数评估结论
	 */
	private String hf_1_2_3_2;
	private String hf_1_2_3_3;		// 是否有左心室室壁瘤

	/**
	 * 实施首次评估患者的危险程度
	 */
	@NotBlank(message = "实施首次评估患者的危险程度不能为空")
	private String hf_1_3_1;


	private String hf_1_3_3;		// Killip分级评估结果的选择
	private String hf_1_3_2;		// NYHA分级结果的选择

	/**
	 * 是否为非瓣膜性房颤/房扑患者
	 */
	@NotBlank(message = "是否为非瓣膜性房颤/房扑患者不能为空")
	private String hf_1_3_5;
	private String hf_1_3_6_1;		// 是否实施房颤患者风险评估
	private Double hf_1_3_6_2;		// 房颤患者脑险评估分值
	private String hf_1_3_6_3;		// CHA2DS2-VASc评分大于2分

	/**
	 * 是急诊或入院后是否首次心电图（ECG）检查
	 */
	@NotBlank(message = "急诊或入院后是否首次心电图（ECG）检查不能为空")
	private String hf_1_4_1;


	private String hf_1_4_2;		// 报告日期时间
	private Double hf_1_4_3;		// QRS宽度(ms)
	private String hf_1_4_4;		// 心电图（ECG）检查结果选择
	private String hf_1_4_4_1;		// 其他心电图检查结果

	/**
	 * 是否实施首次检测
	 */
	@NotBlank(message = "是否实施首次检测不能为空")
	private String hf_1_5_1_1;



	private String hf_1_5_1_2;		// 首次检测结果报告日期
	private String hf_1_5_3;		// 首次检测选择
	private Double hf_1_5_2_1;		// 肌钙蛋白T（TnT）检测值(ng/mL)
	private Double hf_1_5_2_2;		// 肌钙蛋白I（TnI）检测值(ng/mL)
	private Double hf_1_5_2_3;		// 肌酸激酶同工酶（CK-MB）检测值(ng/mL)
	private Double hf_1_5_2_4;		// 心肌肌红蛋白（Myo）检测值(ng/mL)
	private Double hf_1_5_2_5;		// B型钠尿肽（BNP）检测值(ng/L)
	private Double hf_1_5_2_6;		// N端B型钠尿肽前体（NT-ProBNP）检测值(ng/L)

	/**
	 * 是否有利尿剂的禁忌证
	 */
	@NotBlank(message = "是否有利尿剂的禁忌证不能为空")
	private String hf_2_1_a;


	private String hf_2_1;		// 使用利尿剂的禁忌证选择
	private String hf_2_1_1;		// 其他使用利尿剂的禁忌证
	private String hf_2_2;		// 首剂用药日期时间
	private String hf_2_3;		// 常用利尿剂药物
	private String hf_2_3_1;		// 其他利尿剂药物填写
	private String hf_2_5;		// 入院至使用首剂利尿剂时间大于24小时
	private String hf_2_4;		// 延迟治疗原因的选择
	private String hf_2_4_1;		// 其他延迟治疗原因
	private String hf_3_1;		// 左心室收缩功能障碍

	/**
	 * 是否有ACEI抑制剂类药物禁忌证
	 */
	@NotBlank(message = "是否有ACEI抑制剂类药物禁忌证不能为空")
	private String hf_3_2_a;


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

	/**
	 * 入院至使用首剂ACEI/ARB类药物时间大于24小时
	 */
//	@NotBlank(message = "入院至使用首剂ACEI/ARB类药物时间大于24小时不能为空")
	private String hf_3_6;

	private String hf_3_5;		// 延迟治疗原因
	private String hf_3_5_1;		// 其他延迟治疗原因

	/**
	 * 是否有禁忌证与须慎用的情况
	 */
	@NotBlank(message = "是否有禁忌证与须慎用的情况不能为空")
	private String hf_4_1_1;


	private String hf_4_1_2;		// β-受体阻滞剂禁忌证选择
	private String hf_4_3;		// 使用首剂β-受体阻滞剂药物
	private String hf_4_3_1;		// 其他β-受体阻滞剂药物
	private String hf_4_2_1;		// 首剂用药日期是否未确定
	private String hf_4_2;		// 首剂用药日期时间
	private String hf_4_5;		// 入院至使用首剂β-受体阻滞剂时间大于24小时
	private String hf_4_4;		// 延迟治疗原因
	private String hf_4_4_1;		// 其他延迟治疗原因

	/**
	 * 是否有醛固酮受体拮抗剂的禁忌证
	 */
	@NotBlank(message = "是否有醛固酮受体拮抗剂的禁忌证不能为空")
	private String hf_5_1_1;


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

	/**
	 * 否有用药长期医嘱
	 */
	@NotBlank(message = "否有用药长期医嘱不能为空")
	private String hf_6_1_1;


	private String hf_6_1_2;		// 常用利尿剂药物的选择
	private String hf_6_1_2_1;		// 其他常用利尿剂

	/**
	 * 是否有ACEI或ARB药物长期医嘱
	 */
	@NotBlank(message = "是否有ACEI或ARB药物长期医嘱不能为空")
	private String hf_6_2_1;


	private String hf_6_2_2;		// 使用ACEI抑制剂或者ARB或者ARNI类药物选择
	private String hf_6_2_2_a;		// ACE抑制剂药物
	private String hf_6_2_2_a_1;		// 其他ACEI药物填写
	private String hf_6_2_2_b;		// ARB类药物
	private String hf_6_2_2_b_1;		// 其他ARB药物填写
	private String hf_6_2_2_c;		// 使用血管紧张素受体脑啡肽酶抑制剂（ARNI）类药物的选择
	private String hf_6_2_2_c_1;		// 其他使用血管紧张素受体脑啡肽酶抑制剂（ARNI）类药物

	/**
	 * 是否有β受体阻滞剂药物医嘱
	 */
	@NotBlank(message = "是否有β受体阻滞剂药物医嘱不能为空")
	private String hf_6_3_1;


	private String hf_6_3_2;		// 使用首剂β-受体阻滞剂药物
	private String hf_6_3_2_1;		// 其他β-受体阻滞剂药物填写

	/**
	 * 是否有醛固酮拮抗剂药物医嘱
	 */
	@NotBlank(message = "是否有醛固酮拮抗剂药物医嘱不能为空")
	private String hf_6_4_1;


	private String hf_6_4_2;		// 使用醛固酮受体拮抗剂
	private String hf_6_4_2_1;		// 其他醛固酮受体拮抗剂类药物填写

	/**
	 * 是否常用抗凝药物
	 */
	@NotBlank(message = "是否常用抗凝药物不能为空")
	private String hf_6_5_1;


	private String hf_6_5_2;		// 选择抗凝药物
	private String hf_6_5_2_1;		// 其他抗凝药物

	/**
	 * 出院带药医嘱中是否有继续使用利尿剂记录医嘱
	 */
	@NotBlank(message = "出院带药医嘱中是否有继续使用利尿剂记录医嘱不能为空")
	private String hf_7_1_1;


	private String hf_7_1_2;		// 常用利尿剂药物
	private String hf_7_1_2_1;		// 其他常用利尿剂

	/**
	 * 出院带药医嘱中是否有继续使用ACEI或ARB药物记录医嘱
	 */
	@NotBlank(message = "出院带药医嘱中是否有继续使用ACEI或ARB药物记录医嘱不能为空")
	private String hf_7_2_1;


	private String hf_7_2_2;		// 使用ACEI抑制剂或者ARB或者ARNI类药物选择
	private String hf_7_2_2_a;		// ACE抑制剂药物
	private String hf_7_2_2_a_1;		// 其他ACEI药物
	private String hf_7_2_2_b;		// ARB类药物
	private String hf_7_2_2_b_1;		// 其他ARB药物填写
	private String hf_7_2_2_c;		// 使用血管紧张素受体脑啡肽酶抑制剂（ARNI）类药物的选择
	private String hf_7_2_2_c_1;		// 其他使用血管紧张素受体脑啡肽酶抑制剂（ARNI）类药物

	/**
	 * 出院带药医嘱中是否有继续使用β受体阻滞剂药物医嘱
	 */
	@NotBlank(message = "出院带药医嘱中是否有继续使用β受体阻滞剂药物医嘱不能为空")
	private String hf_7_3_1;


	private String hf_7_3_2;		// 使用首剂β-受体阻滞剂药物
	private String hf_7_3_2_1;		// 其他β-受体阻滞剂药物填写

	/**
	 * 出院带药医嘱中是否有继续使用醛固酮拮抗剂药物医嘱
	 */
	@NotBlank(message = "出院带药医嘱中是否有继续使用醛固酮拮抗剂药物医嘱不能为空")
	private String hf_7_4_1;


	private String hf_7_4_2;		// 使用醛固酮受体拮抗剂
	private String hf_7_4_2_1;		// 其他醛固酮受体拮抗剂

	/**
	 * 出院带药医嘱中是否有继续使用使用抗凝药物医嘱
	 */
	@NotBlank(message = "出院带药医嘱中是否有继续使用使用抗凝药物医嘱不能为空")
	private String hf_7_5_1;


	private String hf_7_5_2;		// 选择抗凝药物
	private String hf_7_5_2_1;		// 其他抗凝药物

	/**
	 * 离院方式选择
	 */
	@NotBlank(message = "离院方式选择不能为空")
	private String cm_4_3;		// 离院方式选择
	private String cm_4_5;		// 非医嘱离院可能涉及因素
	private String cm_4_4_1;		// 其他非医嘱离院因素填写
	private String cm_4_6;		// 死亡可能涉及因素

	/**
	 * 是否有吸烟史
	 */
	@NotBlank(message = "是否有吸烟史不能为空")
	private String hf_8_1_1;


	private String hf_8_1_2;		// 吸烟程度评估有记录
	private String hf_8_1_3;		// 接受戒烟的建议或者戒烟治疗有记录

	/**
	 * 心衰原发疾病评估与教育
	 */
	@NotBlank(message = "心衰原发疾病评估与教育不能为空")
	private String hf_8_2_1_a;

	/**
	 * 实施控制主要危险因素评估与教育
	 */
	@NotBlank(message = "实施控制主要危险因素评估与教育不能为空")
	private String hf_8_2_1_b;

	/**
	 * 对控制危险因素评估的结果进行针对性的教育
	 */
	@NotBlank(message = "对控制危险因素评估的结果进行针对性的教育不能为空")
	private String hf_8_2_2;

	/**
	 * 二级预防
	 */
	@NotBlank(message = "二级预防不能为空")
	private String hf_8_3;

	/**
	 * 交与患者“出院小结”的副本告知患者出院时风险因素
	 */
	@NotBlank(message = "交与患者“出院小结”的副本告知患者出院时风险因素不能为空")
	private String hf_8_4_1;

	/**
	 * 出院带药
	 */
	@NotBlank(message = "出院带药不能为空")
	private String hf_8_4_2;


	private String hf_8_4_3;		// 告知发生紧急情况时求援救治途径

	/**
	 * 出院时教育与随访
	 */
	@NotBlank(message = "出院时教育与随访不能为空")
	private String hf_8_4_4;
	private String hf_8_4_5;		// 告知何为风险因素与紧急情况

	/**
	 * 实施末次X线胸片检查
	 */
	@NotBlank(message = "实施末次X线胸片检查不能为空")
	private String hf_9_2_1_1;
	private String hf_9_2_1_2;		// 是否有肺淤血或肺水肿

	/**
	 * 是否实施末次超声心动图(CDFA)检查
	 */
	@NotBlank(message = "是否实施末次超声心动图(CDFA)检查不能为空")
	private String hf_9_2_2_1;


	private Double hf_9_2_2_2_4;		// QRS宽度(ms)
	private Double hf_9_2_2_2_1;		// 左室射血分（LVEF）测量值(%)
	private String hf_9_2_2_2_2;		// 左室射血分数评估结论
	private String hf_9_2_2_2_3;		// 是否有左心室室壁瘤

	/**
	 * 是实施末次风险程度评估
	 */
	@NotBlank(message = "实施末次风险程度评估不能为空")
	private String hf_9_2_3_1;


	private String hf_9_2_3_2_ab;		// 末次风险程度评估
	private String hf_9_2_3_2;		// NYHA分级结果
	private String hf_9_2_3_3;		// Killip分级评估结果


	/**
	 * 实施末次检测
	 */
	@NotBlank(message = "实施末次检测不能为空")
	private String hf_9_2_4_1;



	private String hf_9_2_4_2;		// 末次检测选择
	private Double hf_9_2_4_2_1;		// 肌钙蛋白T（TnT）检测值(ng/mL)
	private Double hf_9_2_4_2_2;		// 肌钙蛋白I（TnI）检测值(ng/mL)
	private Double hf_9_2_4_2_3;		// 肌酸激酶同工酶（CK-MB）检测值(ng/mL)
	private Double hf_9_2_4_2_4;		// 心肌肌红蛋白（Myo）检测值(ng/mL)
	private Double hf_9_2_4_2_5;		// B型钠尿肽（BNP）检测值(ng/L)
	private Double hf_9_2_4_2_6;		// N端B型钠尿肽前体（NT-ProBNP）检测值(ng/L)


	/**
	 * 患者是否对服务的体验与评价
	 */
	@NotBlank(message = "患者是否对服务的体验与评价不能为空")
	private String cm_5_1;


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

	/**
	 * 住院总费用
	 */
	@NotNull(message = "住院总费用不能为空")
	private Double cm_6_1;

	/**
	 * 住院总费用其中自付金额
	 */
	@NotNull(message = "住院总费用其中自付金额不能为空")
	private Double cm_6_2;

	/**
	 * 一般医疗服务费
	 */
	@NotNull(message = "一般医疗服务费不能为空")
	private Double cm_6_3;

	/**
	 * 一般治疗操作费
	 */
	@NotNull(message = "一般治疗操作费不能为空")
	private Double cm_6_4;

	/**
	 * 护理费
	 */
	@NotNull(message = "护理费不能为空")
	private Double cm_6_5;

	/**
	 * 综合医疗服务类其他费用
	 */
	@NotNull(message = "综合医疗服务类其他费用不能为空")
	private Double cm_6_6;

	/**
	 * 病理诊断费
	 */
	@NotNull(message = "病理诊断费不能为空")
	private Double cm_6_7;

	/**
	 * 实验室诊断费
	 */
	@NotNull(message = "实验室诊断费不能为空")
	private Double cm_6_8;

	/**
	 * 影像学诊断费
	 */
	@NotNull(message = "影像学诊断费不能为空")
	private Double cm_6_9;

	/**
	 * 临床诊断项目费
	 */
	@NotNull(message = "临床诊断项目费不能为空")
	private Double cm_6_10;

	/**
	 * 非手术治疗项目费
	 */
	@NotNull(message = "非手术治疗项目费不能为空")
	private Double cm_6_11;

	/**
	 * 其中：临床物理治疗费
	 */
	@NotNull(message = "其中：临床物理治疗费不能为空")
	private Double cm_6_12;

	/**
	 * 手术治疗费
	 */
	@NotNull(message = "手术治疗费不能为空")
	private Double cm_6_13;

	/**
	 * 其中：麻醉费
	 */
	@NotNull(message = "其中：麻醉费不能为空")
	private Double cm_6_14;

	/**
	 * 其中：手术费
	 */
	@NotNull(message = "其中：手术费不能为空")
	private Double cm_6_15;

	/**
	 * 康复费
	 */
	@NotNull(message = "康复费不能为空")
	private Double cm_6_16;

	/**
	 * 中医治疗费
	 */
	@NotNull(message = "中医治疗费不能为空")
	private Double cm_6_17;

	/**
	 * 西药费
	 */
	@NotNull(message = "西药费不能为空")
	private Double cm_6_18;

	/**
	 * 其中：抗菌药物费
	 */
	@NotNull(message = "其中：抗菌药物费不能为空")
	private Double cm_6_19;

	/**
	 * 中成药费
	 */
	@NotNull(message = "中成药费不能为空")
	private Double cm_6_20;

	/**
	 * 中草药费
	 */
	@NotNull(message = "中草药费不能为空")
	private Double cm_6_21;



	/**
	 * 血费
	 */
	@NotNull(message = "血费不能为空")
	private Double cm_6_22;

	/**
	 * 白蛋白类制品费
	 */
	@NotNull(message = "白蛋白类制品费不能为空")
	private Double cm_6_23;

	/**
	 * 球蛋白类制品费
	 */
	@NotNull(message = "球蛋白类制品费不能为空")
	private Double cm_6_24;

	/**
	 * 凝血因子类制品费
	 */
	@NotNull(message = "凝血因子类制品费不能为空")
	private Double cm_6_25;

	/**
	 * 细胞因子类制品费
	 */
	@NotNull(message = "细胞因子类制品费不能为空")
	private Double cm_6_26;

	/**
	 * 检查用一次性医用材料费
	 */
	@NotNull(message = "检查用一次性医用材料费不能为空")
	private Double cm_6_27;

	/**
	 * 治疗用一次性医用材料费
	 */
	@NotNull(message = "治疗用一次性医用材料费不能为空")
	private Double cm_6_28;

	/**
	 * 手术用一次性医用材料费
	 */
	@NotNull(message = "手术用一次性医用材料费不能为空")
	private Double cm_6_29;

	/**
	 * 其他费
	 */
	@NotNull(message = "其他费不能为空")
	private Double cm_6_30;

	
	public QualityHf() {
		this(null);
	}

	public QualityHf(String id){
		super(id);
	}
	

	
}