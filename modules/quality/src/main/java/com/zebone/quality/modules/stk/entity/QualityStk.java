/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.stk.entity;

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
 * STK脑梗死（首次住院）Entity
 * @author 卡卡西
 * @version 2021-02-05
 */
@Table(name="quality_stk", alias="a", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(includeEntity=DataEntity.class),
		@Column(name="cm_0_1_1_1", attrName="cm_0_1_1_1", label="质控医师"),
		@Column(name="cm_0_1_1_2", attrName="cm_0_1_1_2", label="质控护士"),
		@Column(name="cm_0_1_1_3", attrName="cm_0_1_1_3", label="主治医师"),
		@Column(name="cm_0_1_1_4", attrName="cm_0_1_1_4", label="责任护士"),
		@Column(name="cm_0_1_1_5", attrName="cm_0_1_1_5", label="上报科室"),
		@Column(name="cm_0_1_3_1", attrName="cm_0_1_3_1", label="主要诊断ICD-10四位亚目编码与名称"),
		@Column(name="cm_0_1_3_2", attrName="cm_0_1_3_2", label="主要诊断ICD-10六位临床扩展编码与名称"),
		@Column(name="cm_0_1_4_1", attrName="cm_0_1_4_1", label="主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称"),
		@Column(name="stk_0_1_3_1", attrName="stk_0_1_3_1", label="其他主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称"),
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
		@Column(name="stk_0_4_1", attrName="stk_0_4_1", label="现场评估生命体征，施行急救"),
		@Column(name="stk_0_4_2", attrName="stk_0_4_2", label="到达现场后10分钟内完成院前卒中评分"),
		@Column(name="stk_0_4_3", attrName="stk_0_4_3", label="现场急救维持生命体征稳定"),
		@Column(name="stk_0_4_4", attrName="stk_0_4_4", label="利用车载信息系统、微信、彩信等多种形式传输心电图等院前信息至目标医院"),
		@Column(name="stk_1_1_1_1", attrName="stk_1_1_1_1", label="急诊医师接诊日期时间是否确定"),
		@Column(name="stk_1_1_1_2", attrName="stk_1_1_1_2", label="急诊医师接诊日期时间"),
		@Column(name="stk_1_1_4", attrName="stk_1_1_4", label="呼吸", comment="呼吸(次/分)"),
		@Column(name="stk_1_1_5", attrName="stk_1_1_5", label="脉搏", comment="脉搏(次/分)"),
		@Column(name="stk_1_1_6", attrName="stk_1_1_6", label="收缩压", comment="收缩压(mmHg)"),
		@Column(name="stk_1_1_7", attrName="stk_1_1_7", label="舒张压", comment="舒张压(mmHg)"),
		@Column(name="stk_1_2_1", attrName="stk_1_2_1", label="急诊后首次评估还是入院后首次评估"),
		@Column(name="stk_1_2_1_1", attrName="stk_1_2_1_1", label="急诊首次实施神经功能缺损NIHSS评估"),
		@Column(name="stk_1_2_1_2_1", attrName="stk_1_2_1_2_1", label="急诊首次评估日期时间"),
		@Column(name="stk_1_2_1_3_1", attrName="stk_1_2_1_3_1", label="实施神经功能缺损NIHSS评估分值"),
		@Column(name="stk_1_2_2_1", attrName="stk_1_2_2_1", label="入院后首次实施神经功能缺损NIHSS评估"),
		@Column(name="stk_1_2_2_2_1", attrName="stk_1_2_2_2_1", label="入院后首次评估日期时间"),
		@Column(name="stk_1_2_2_3_1", attrName="stk_1_2_2_3_1", label="实施神经功能缺损NIHSS评估分值"),
		@Column(name="stk_1_3_1", attrName="stk_1_3_1", label="是否实施首次头部影像学检查"),
		@Column(name="stk_1_3_2", attrName="stk_1_3_2", label="头部影像学检查项目"),
		@Column(name="stk_1_3_3_1", attrName="stk_1_3_3_1", label="报告日期时间"),
		@Column(name="stk_2_1_3", attrName="stk_2_1_3", label="头部影像学检查评估的选择"),
		@Column(name="stk_2_1_3_1", attrName="stk_2_1_3_1", label="其他头部影像学检查"),
		@Column(name="stk_1_4_1", attrName="stk_1_4_1", label="全血细胞计数"),
		@Column(name="stk_1_4_1_3", attrName="stk_1_4_1_3", label="红血球计数RBC检测值"),
		@Column(name="stk_1_4_1_4", attrName="stk_1_4_1_4", label="白细胞计数WBC检测值"),
		@Column(name="stk_1_4_1_5", attrName="stk_1_4_1_5", label="血小板PLT检测值", comment="血小板PLT检测值(10E9/L)"),
		@Column(name="stk_1_4_1_2", attrName="stk_1_4_1_2", label="急诊或入院后首次全血细胞计数报告日期时间"),
		@Column(name="stk_1_4_1_1_1", attrName="stk_1_4_1_1_1", label="急诊或入院后首次全血细胞计数报告日期时间"),
		@Column(name="stk_1_4_2_1", attrName="stk_1_4_2_1", label="凝血功能检查项目"),
		@Column(name="stk_1_4_2_3", attrName="stk_1_4_2_3", label="报告日期时间是否确定"),
		@Column(name="stk_1_4_2_2_1", attrName="stk_1_4_2_2_1", label="报告日期时间"),
		@Column(name="stk_1_4_3_1", attrName="stk_1_4_3_1", label="生化检验项目"),
		@Column(name="stk_1_4_3_3", attrName="stk_1_4_3_3", label="报告日期时间是否确定"),
		@Column(name="stk_1_4_3_2_1", attrName="stk_1_4_3_2_1", label="报告日期时间"),
		@Column(name="stk_1_4_2", attrName="stk_1_4_2", label="急诊/入院后24小时内首次临床检验检查"),
		@Column(name="stk_1_4_2_4", attrName="stk_1_4_2_4", label="C-反应蛋白:检测值", comment="C-反应蛋白:检测值(mg/L)"),
		@Column(name="stk_1_4_2_5", attrName="stk_1_4_2_5", label="同型半胱氨酸（HCY）:检测值", comment="同型半胱氨酸（HCY）:检测值(μmol/L)"),
		@Column(name="stk_1_4_2_6", attrName="stk_1_4_2_6", label="空腹血糖:检测值", comment="空腹血糖:检测值(mmol/l)"),
		@Column(name="stk_1_4_2_7", attrName="stk_1_4_2_7", label="血清肌酐:检测值", comment="血清肌酐:检测值(μmol/l)"),
		@Column(name="stk_1_4_2_8", attrName="stk_1_4_2_8", label="血清尿素氮:检测值", comment="血清尿素氮:检测值(mmol/l)"),
		@Column(name="stk_1_4_2_9", attrName="stk_1_4_2_9", label="尿酸:检测值", comment="尿酸:检测值(μmol/l)"),
		@Column(name="stk_1_5_1", attrName="stk_1_5_1", label="急诊或入院后是否首次实施心电图", comment="急诊或入院后是否首次实施心电图（ECG）检查"),
		@Column(name="stk_1_5_2_1", attrName="stk_1_5_2_1", label="报告日期时间"),
		@Column(name="stk_1_5_3", attrName="stk_1_5_3", label="心电图", comment="心电图（ECG）检查结果"),
		@Column(name="stk_1_5_3_1", attrName="stk_1_5_3_1", label="其他心电图", comment="其他心电图（ECG）检查结果"),
		@Column(name="stk_2_1_1_1", attrName="stk_2_1_1_1", label="发病→到达急诊“绿色通道”时间是否确定"),
		@Column(name="stk_2_1_1_2", attrName="stk_2_1_1_2", label="发病→到达急诊“绿色通道”时间", comment="发病→到达急诊“绿色通道”时间(小时)"),
		@Column(name="stk_2_1_2", attrName="stk_2_1_2", label="发病→到达急诊“绿色通道”时间评估结论"),
		@Column(name="stk_2_2_1", attrName="stk_2_2_1", label="是否有溶栓禁忌症"),
		@Column(name="stk_2_2_2", attrName="stk_2_2_2", label="溶栓禁忌症选择"),
		@Column(name="stk_2_2_2_1", attrName="stk_2_2_2_1", label="其他临床医师认定的其他禁忌症"),
		@Column(name="stk_2_3_1_1", attrName="stk_2_3_1_1", label="发病时段适应证"),
		@Column(name="caseid", attrName="caseid", label="患者病案号"),
		@Column(name="stk_2_3_1_2", attrName="stk_2_3_1_2", label="溶栓适应证的选择"),
		@Column(name="stk_2_3_2", attrName="stk_2_3_2", label="溶栓的评估结论的选择"),
		@Column(name="stk_2_4_1_1_1", attrName="stk_2_4_1_1_1", label="溶栓开始日期时间"),
		@Column(name="stk_2_4_2_1_1", attrName="stk_2_4_2_1_1", label="溶栓终止日期时间"),
		@Column(name="stk_2_4_3", attrName="stk_2_4_3", label="溶栓药选择"),
		@Column(name="stk_2_4_4", attrName="stk_2_4_4", label="实施溶栓", comment="实施溶栓（治疗性操作）途径"),
		@Column(name="stk_2_4_5_1", attrName="stk_2_4_5_1", label="溶栓药物使用时机 DTN", comment="溶栓药物使用时机 DTN(Door-To-Needle)"),
		@Column(name="stk_15_1_0", attrName="stk_15_1_0", label="是否实施介入治疗	字"),
		@Column(name="stk_15_1_1_1", attrName="stk_15_1_1_1", label="介入治疗日期时间"),
		@Column(name="stk_15_2", attrName="stk_15_2", label="介入治疗时机"),
		@Column(name="stk_15_3", attrName="stk_15_3", label="决定适应证医师职称"),
		@Column(name="stk_15_4", attrName="stk_15_4", label="介入主刀医师职称"),
		@Column(name="stk_15_6", attrName="stk_15_6", label="大血管闭塞重症患者实施血管内适应证选择"),
		@Column(name="stk_15_6_1", attrName="stk_15_6_1", label="其它适应证"),
		@Column(name="stk_15_5_1", attrName="stk_15_5_1", label="血管内介入治疗术式选择"),
		@Column(name="stk_15_8", attrName="stk_15_8", label="血管内介入治疗完成时间 DTN时间", comment="血管内介入治疗完成时间 DTN时间（分）"),
		@Column(name="stk_2_6_1", attrName="stk_2_6_1", label="溶栓治疗院内延误时间超过1小时主要原因的选择"),
		@Column(name="stk_2_6_2", attrName="stk_2_6_2", label="溶栓治疗医嘱未能执行主要原因的"),
		@Column(name="stk_15_7", attrName="stk_15_7", label="是否实施影像学评估血管再通分级", comment="是否实施影像学评估血管再通分级（mTICI评分）"),
		@Column(name="stk_15_7_1", attrName="stk_15_7_1", label="血管再通分级", comment="血管再通分级（mTICI评分标准）"),
		@Column(name="stk_2_5_1_1", attrName="stk_2_5_1_1", label="是否实施溶栓后72小时NIHSS评估"),
		@Column(name="stk_2_5_1_2_1", attrName="stk_2_5_1_2_1", label="溶栓后2小时分值"),
		@Column(name="stk_2_5_1_3_1", attrName="stk_2_5_1_3_1", label="溶栓后24小时分值"),
		@Column(name="stk_2_5_1_4_1", attrName="stk_2_5_1_4_1", label="溶栓后48小时分值"),
		@Column(name="stk_2_5_1_5_1", attrName="stk_2_5_1_5_1", label="溶栓后72小时分值"),
		@Column(name="stk_2_5_2_1", attrName="stk_2_5_2_1", label="是否实施溶栓", comment="是否实施溶栓（治疗性操作）后72小时影像学复查评估"),
		@Column(name="stk_2_5_2_2", attrName="stk_2_5_2_2", label="溶栓后72小时影像学复查项目"),
		@Column(name="stk_2_5_3_1", attrName="stk_2_5_3_1", label="是否出现溶栓治疗并发症"),
		@Column(name="stk_2_5_3_2", attrName="stk_2_5_3_2", label="并发症严重程度"),
		@Column(name="stk_3_1_1_1", attrName="stk_3_1_1_1", label="是否为房颤患者脑卒中"),
		@Column(name="stk_3_1_1", attrName="stk_3_1_1", label="是否实施房颤患者脑卒中风险评估"),
		@Column(name="stk_3_1_2_1", attrName="stk_3_1_2_1", label="房颤患者脑卒中风险评估分值"),
		@Column(name="stk_3_1_3", attrName="stk_3_1_3", label="CHA2DS2-VASc评分大于2分"),
		@Column(name="stk_3_2_1", attrName="stk_3_2_1", label="是否有使用抗凝药物的禁忌证"),
		@Column(name="stk_3_2_2", attrName="stk_3_2_2", label="使用抗凝药物的禁忌症"),
		@Column(name="stk_3_3_1", attrName="stk_3_3_1", label="是否使用抗凝药物"),
		@Column(name="stk_3_3_2_1_1", attrName="stk_3_3_2_1_1", label="首剂用药日期时间"),
		@Column(name="stk_3_3_3", attrName="stk_3_3_3", label="抗凝药物选择"),
		@Column(name="stk_4_1_1", attrName="stk_4_1_1", label="是否使用阿司匹林禁忌证"),
		@Column(name="stk_4_1_2", attrName="stk_4_1_2", label="阿司匹林禁忌症"),
		@Column(name="stk_4_2_3", attrName="stk_4_2_3", label="患者类别选择"),
		@Column(name="stk_4_2_2_1", attrName="stk_4_2_2_1", label="首剂用药日期时间"),
		@Column(name="stk_4_3", attrName="stk_4_3", label="药物选择"),
		@Column(name="stk_4_3_1", attrName="stk_4_3_1", label="其他抗血小板药物"),
		@Column(name="stk_5_1", attrName="stk_5_1", label="血脂评价时间的选择"),
		@Column(name="stk_5_2", attrName="stk_5_2", label="血脂评价结果"),
		@Column(name="stk_5_3_1", attrName="stk_5_3_1", label="是否有他汀药物禁忌症"),
		@Column(name="stk_5_3_2", attrName="stk_5_3_2", label="他汀类药物禁忌证的选择"),
		@Column(name="stk_5_4", attrName="stk_5_4", label="是否有用药长期医嘱-他汀类药物"),
		@Column(name="stk_5_4_1", attrName="stk_5_4_1", label="他汀类常用药物选择"),
		@Column(name="stk_5_5_1", attrName="stk_5_5_1", label="是否糖尿病患者"),
		@Column(name="stk_5_5_2", attrName="stk_5_5_2", label="选择降糖药物的类别"),
		@Column(name="stk_5_5_2_1", attrName="stk_5_5_2_1", label="其他降糖药物"),
		@Column(name="stk_5_7_1", attrName="stk_5_7_1", label="是否高血压患者"),
		@Column(name="stk_5_7_2", attrName="stk_5_7_2", label="选择降压药物的类别"),
		@Column(name="stk_5_7_2_1", attrName="stk_5_7_2_1", label="其它降压药物"),
		@Column(name="stk_6_1", attrName="stk_6_1", label="入院时是否正常进食与饮水"),
		@Column(name="stk_6_2_0", attrName="stk_6_2_0", label="是否进行吞咽评估"),
		@Column(name="stk_6_2_1_1", attrName="stk_6_2_1_1", label="首次吞咽困难评估日期时间"),
		@Column(name="stk_6_3_1", attrName="stk_6_3_1", label="评价方法选择"),
		@Column(name="stk_6_3_1_1", attrName="stk_6_3_1_1", label="其他评价方法填写"),
		@Column(name="stk_6_3_2", attrName="stk_6_3_2", label="未进行吞咽困难评价的原因"),
		@Column(name="stk_6_3_2_1", attrName="stk_6_3_2_1", label="其它未进行吞咽困难评价的原因"),
		@Column(name="stk_7_1", attrName="stk_7_1", label="入院后病情判定"),
		@Column(name="stk_7_2_1", attrName="stk_7_2_1", label="是否需要做预防DVT治疗"),
		@Column(name="stk_7_2_2", attrName="stk_7_2_2", label="禁忌证选择"),
		@Column(name="stk_7_2_3_1_1", attrName="stk_7_2_3_1_1", label="预防DVT治疗医嘱下达日期时间"),
		@Column(name="stk_7_3_1_4", attrName="stk_7_3_1_4", label="预防DVT治疗方法"),
		@Column(name="stk_7_3_1_5", attrName="stk_7_3_1_5", label="其他预防DVT治疗药物"),
		@Column(name="stk_8_1", attrName="stk_8_1", label="出院时继续使用抗血小扳聚集治疗药物"),
		@Column(name="stk_8_1_1", attrName="stk_8_1_1", label="其他抗血小板聚集治疗药物"),
		@Column(name="stk_8_2", attrName="stk_8_2", label="出院时使用选择他汀类药物"),
		@Column(name="stk_8_3", attrName="stk_8_3", label="出院时使用抗凝药物"),
		@Column(name="stk_8_4", attrName="stk_8_4", label="出院时使用降糖药物的类别"),
		@Column(name="stk_8_4_1", attrName="stk_8_4_1", label="其他降糖药物"),
		@Column(name="stk_8_5_0", attrName="stk_8_5_0", label="是否出院时有高血压"),
		@Column(name="stk_8_5", attrName="stk_8_5", label="出院时有高血压患者选择降压药物的类别"),
		@Column(name="stk_8_5_1", attrName="stk_8_5_1", label="其他降压药物"),
		@Column(name="stk_9_1", attrName="stk_9_1", label="入院时是否有重点护理评估记录"),
		@Column(name="stk_9_1_1", attrName="stk_9_1_1", label="行走评估结果"),
		@Column(name="stk_9_1_2", attrName="stk_9_1_2", label="呼吸评估结果"),
		@Column(name="stk_9_1_3", attrName="stk_9_1_3", label="饮食评估结果"),
		@Column(name="stk_9_1_4", attrName="stk_9_1_4", label="吞咽评估结果"),
		@Column(name="stk_9_1_5_1", attrName="stk_9_1_5_1", label="压疮评估", comment="压疮评估（Braden评分值）分值"),
		@Column(name="stk_9_1_6", attrName="stk_9_1_6", label="压疮评估结果选择"),
		@Column(name="stk_9_1_7", attrName="stk_9_1_7", label="预防压疮告知"),
		@Column(name="stk_9_3_1", attrName="stk_9_3_1", label="吸烟史"),
		@Column(name="stk_9_3_2", attrName="stk_9_3_2", label="吸烟程度评估"),
		@Column(name="stk_9_3_3", attrName="stk_9_3_3", label="接受戒烟的建议或者戒烟治疗"),
		@Column(name="stk_13_1_1", attrName="stk_13_1_1", label="是否提供早期康复医疗服务"),
		@Column(name="stk_13_0", attrName="stk_13_0", label="是否有功能障碍"),
		@Column(name="stk_13_1", attrName="stk_13_1", label="功能障碍评价"),
		@Column(name="stk_13_2", attrName="stk_13_2", label="康复治疗适宜性评估结果"),
		@Column(name="stk_13_3", attrName="stk_13_3", label="康复实施人员资质选择"),
		@Column(name="stk_13_4_1", attrName="stk_13_4_1", label="首次实施康复治疗时间"),
		@Column(name="stk_13_5", attrName="stk_13_5", label="选择未能进行康复原因"),
		@Column(name="stk_10_1", attrName="stk_10_1", label="血管功能评估时间"),
		@Column(name="stk_10_2", attrName="stk_10_2", label="血管功能评估方法"),
		@Column(name="stk_12_1_3", attrName="stk_12_1_3", label="实施卒中健康教育有记录"),
		@Column(name="stk_12_1_1", attrName="stk_12_1_1", label="出院时Essen卒中风险评分"),
		@Column(name="stk_12_1_2_1", attrName="stk_12_1_2_1", label="Essen卒中风险评分值"),
		@Column(name="stk_12_2_1", attrName="stk_12_2_1", label="主要风险因素", comment="主要风险因素(住院病历既往史记录)评估"),
		@Column(name="stk_12_2_2", attrName="stk_12_2_2", label="其他风险因素", comment="其他风险因素(住院病历既往史记录)评估"),
		@Column(name="stk_12_4_1", attrName="stk_12_4_1", label="是否有出院时mRS评分"),
		@Column(name="stk_12_4_2", attrName="stk_12_4_2", label="出院时mRS评分"),
		@Column(name="stk_12_4_3", attrName="stk_12_4_3", label="出院时mRS评分"),
		@Column(name="stk_12_4_4", attrName="stk_12_4_4", label="发病的主要原因"),
		@Column(name="stk_12_4_4_1", attrName="stk_12_4_4_1", label="其他发病的主要原因"),
		@Column(name="stk_12_3_1", attrName="stk_12_3_1", label="交与患者“出院小结”的副本告知患者出院时风险因素"),
		@Column(name="stk_12_3_2", attrName="stk_12_3_2", label="出院带药"),
		@Column(name="stk_12_3_5", attrName="stk_12_3_5", label="告知何为风险因素与紧急情况"),
		@Column(name="stk_12_3_3", attrName="stk_12_3_3", label="告知发生紧急情况时求援救治途径"),
		@Column(name="stk_12_3_4", attrName="stk_12_3_4", label="出院时教育与随访"),
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
	}, orderBy="a.update_date DESC"
)
public class QualityStk extends DataEntity<QualityStk> {
	
	private static final long serialVersionUID = 1L;
	private String cm_0_1_1_1;		// 质控医师
	private String cm_0_1_1_2;		// 质控护士
	private String cm_0_1_1_3;		// 主治医师
	private String cm_0_1_1_4;		// 责任护士
	private String cm_0_1_1_5;		// 上报科室
	private String cm_0_1_3_1;		// 主要诊断ICD-10四位亚目编码与名称
	private String cm_0_1_3_2;		// 主要诊断ICD-10六位临床扩展编码与名称
	private String cm_0_1_4_1;		// 主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称
	private String stk_0_1_3_1;		// 其他主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称
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
	private Date cm_0_2_6_1;		// 手术开始（切皮）日期时间
	private Date cm_0_2_6_2;		// 手术结束（缝皮结束）日期时间
	private String cm_0_3_1;		// 费用支付方式
	private String cm_0_3_2;		// 收入住院途径
	private String cm_0_3_3;		// 到院交通工具
	private String stk_0_4_1;		// 现场评估生命体征，施行急救
	private String stk_0_4_2;		// 到达现场后10分钟内完成院前卒中评分
	private String stk_0_4_3;		// 现场急救维持生命体征稳定
	private String stk_0_4_4;		// 利用车载信息系统、微信、彩信等多种形式传输心电图等院前信息至目标医院
	private String stk_1_1_1_1;		// 急诊医师接诊日期时间是否确定
	private Date stk_1_1_1_2;		// 急诊医师接诊日期时间
	private Double stk_1_1_4;		// 呼吸(次/分)
	private Double stk_1_1_5;		// 脉搏(次/分)
	private Double stk_1_1_6;		// 收缩压(mmHg)
	private Double stk_1_1_7;		// 舒张压(mmHg)
	private String stk_1_2_1;		// 急诊后首次评估还是入院后首次评估
	private String stk_1_2_1_1;		// 急诊首次实施神经功能缺损NIHSS评估
	private Date stk_1_2_1_2_1;		// 急诊首次评估日期时间
	private Double stk_1_2_1_3_1;		// 实施神经功能缺损NIHSS评估分值
	private String stk_1_2_2_1;		// 入院后首次实施神经功能缺损NIHSS评估
	private Date stk_1_2_2_2_1;		// 入院后首次评估日期时间
	private Double stk_1_2_2_3_1;		// 实施神经功能缺损NIHSS评估分值
	private String stk_1_3_1;		// 是否实施首次头部影像学检查
	private String stk_1_3_2;		// 头部影像学检查项目
	private Date stk_1_3_3_1;		// 报告日期时间
	private String stk_2_1_3;		// 头部影像学检查评估的选择
	private String stk_2_1_3_1;		// 其他头部影像学检查
	private String stk_1_4_1;		// 全血细胞计数
	private Double stk_1_4_1_3;		// 红血球计数RBC检测值
	private Double stk_1_4_1_4;		// 白细胞计数WBC检测值
	private Double stk_1_4_1_5;		// 血小板PLT检测值(10E9/L)
	private Date stk_1_4_1_2;		// 急诊或入院后首次全血细胞计数报告日期时间
	private String stk_1_4_1_1_1;		// 急诊或入院后首次全血细胞计数报告日期时间
	private String stk_1_4_2_1;		// 凝血功能检查项目
	private String stk_1_4_2_3;		// 报告日期时间是否确定
	private Date stk_1_4_2_2_1;		// 报告日期时间
	private String stk_1_4_3_1;		// 生化检验项目
	private String stk_1_4_3_3;		// 报告日期时间是否确定
	private String stk_1_4_3_2_1;		// 报告日期时间
	private String stk_1_4_2;		// 急诊/入院后24小时内首次临床检验检查
	private Double stk_1_4_2_4;		// C-反应蛋白:检测值(mg/L)
	private Double stk_1_4_2_5;		// 同型半胱氨酸（HCY）:检测值(μmol/L)
	private Double stk_1_4_2_6;		// 空腹血糖:检测值(mmol/l)
	private Double stk_1_4_2_7;		// 血清肌酐:检测值(μmol/l)
	private Double stk_1_4_2_8;		// 血清尿素氮:检测值(mmol/l)
	private Double stk_1_4_2_9;		// 尿酸:检测值(μmol/l)
	private String stk_1_5_1;		// 急诊或入院后是否首次实施心电图（ECG）检查
	private Date stk_1_5_2_1;		// 报告日期时间
	private String stk_1_5_3;		// 心电图（ECG）检查结果
	private String stk_1_5_3_1;		// 其他心电图（ECG）检查结果
	private String stk_2_1_1_1;		// 发病→到达急诊“绿色通道”时间是否确定
	private Double stk_2_1_1_2;		// 发病→到达急诊“绿色通道”时间(小时)
	private String stk_2_1_2;		// 发病→到达急诊“绿色通道”时间评估结论
	private String stk_2_2_1;		// 是否有溶栓禁忌症
	private String stk_2_2_2;		// 溶栓禁忌症选择
	private String stk_2_2_2_1;		// 其他临床医师认定的其他禁忌症
	private String stk_2_3_1_1;		// 发病时段适应证
	private String caseid;		// 患者病案号
	private String stk_2_3_1_2;		// 溶栓适应证的选择
	private String stk_2_3_2;		// 溶栓的评估结论的选择
	private Date stk_2_4_1_1_1;		// 溶栓开始日期时间
	private Date stk_2_4_2_1_1;		// 溶栓终止日期时间
	private String stk_2_4_3;		// 溶栓药选择
	private String stk_2_4_4;		// 实施溶栓（治疗性操作）途径
	private Double stk_2_4_5_1;		// 溶栓药物使用时机 DTN(Door-To-Needle)
	private String stk_15_1_0;		// 是否实施介入治疗	字
	private Date stk_15_1_1_1;		// 介入治疗日期时间
	private String stk_15_2;		// 介入治疗时机
	private String stk_15_3;		// 决定适应证医师职称
	private String stk_15_4;		// 介入主刀医师职称
	private String stk_15_6;		// 大血管闭塞重症患者实施血管内适应证选择
	private String stk_15_6_1;		// 其它适应证
	private String stk_15_5_1;		// 血管内介入治疗术式选择
	private Double stk_15_8;		// 血管内介入治疗完成时间 DTN时间（分）
	private String stk_2_6_1;		// 溶栓治疗院内延误时间超过1小时主要原因的选择
	private String stk_2_6_2;		// 溶栓治疗医嘱未能执行主要原因的
	private String stk_15_7;		// 是否实施影像学评估血管再通分级（mTICI评分）
	private String stk_15_7_1;		// 血管再通分级（mTICI评分标准）
	private String stk_2_5_1_1;		// 是否实施溶栓后72小时NIHSS评估
	private Double stk_2_5_1_2_1;		// 溶栓后2小时分值
	private Double stk_2_5_1_3_1;		// 溶栓后24小时分值
	private Double stk_2_5_1_4_1;		// 溶栓后48小时分值
	private Double stk_2_5_1_5_1;		// 溶栓后72小时分值
	private String stk_2_5_2_1;		// 是否实施溶栓（治疗性操作）后72小时影像学复查评估
	private String stk_2_5_2_2;		// 溶栓后72小时影像学复查项目
	private String stk_2_5_3_1;		// 是否出现溶栓治疗并发症
	private String stk_2_5_3_2;		// 并发症严重程度
	private String stk_3_1_1_1;		// 是否为房颤患者脑卒中
	private String stk_3_1_1;		// 是否实施房颤患者脑卒中风险评估
	private Double stk_3_1_2_1;		// 房颤患者脑卒中风险评估分值
	private String stk_3_1_3;		// CHA2DS2-VASc评分大于2分
	private String stk_3_2_1;		// 是否有使用抗凝药物的禁忌证
	private String stk_3_2_2;		// 使用抗凝药物的禁忌症
	private String stk_3_3_1;		// 是否使用抗凝药物
	private Date stk_3_3_2_1_1;		// 首剂用药日期时间
	private String stk_3_3_3;		// 抗凝药物选择
	private String stk_4_1_1;		// 是否使用阿司匹林禁忌证
	private String stk_4_1_2;		// 阿司匹林禁忌症
	private String stk_4_2_3;		// 患者类别选择
	private Date stk_4_2_2_1;		// 首剂用药日期时间
	private String stk_4_3;		// 药物选择
	private String stk_4_3_1;		// 其他抗血小板药物
	private String stk_5_1;		// 血脂评价时间的选择
	private String stk_5_2;		// 血脂评价结果
	private String stk_5_3_1;		// 是否有他汀药物禁忌症
	private String stk_5_3_2;		// 他汀类药物禁忌证的选择
	private String stk_5_4;		// 是否有用药长期医嘱-他汀类药物
	private String stk_5_4_1;		// 他汀类常用药物选择
	private String stk_5_5_1;		// 是否糖尿病患者
	private String stk_5_5_2;		// 选择降糖药物的类别
	private String stk_5_5_2_1;		// 其他降糖药物
	private String stk_5_7_1;		// 是否高血压患者
	private String stk_5_7_2;		// 选择降压药物的类别
	private String stk_5_7_2_1;		// 其它降压药物
	private String stk_6_1;		// 入院时是否正常进食与饮水
	private String stk_6_2_0;		// 是否进行吞咽评估
	private Date stk_6_2_1_1;		// 首次吞咽困难评估日期时间
	private String stk_6_3_1;		// 评价方法选择
	private String stk_6_3_1_1;		// 其他评价方法填写
	private String stk_6_3_2;		// 未进行吞咽困难评价的原因
	private String stk_6_3_2_1;		// 其它未进行吞咽困难评价的原因
	private String stk_7_1;		// 入院后病情判定
	private String stk_7_2_1;		// 是否需要做预防DVT治疗
	private String stk_7_2_2;		// 禁忌证选择
	private Date stk_7_2_3_1_1;		// 预防DVT治疗医嘱下达日期时间
	private String stk_7_3_1_4;		// 预防DVT治疗方法
	private String stk_7_3_1_5;		// 其他预防DVT治疗药物
	private String stk_8_1;		// 出院时继续使用抗血小扳聚集治疗药物
	private String stk_8_1_1;		// 其他抗血小板聚集治疗药物
	private String stk_8_2;		// 出院时使用选择他汀类药物
	private String stk_8_3;		// 出院时使用抗凝药物
	private String stk_8_4;		// 出院时使用降糖药物的类别
	private String stk_8_4_1;		// 其他降糖药物
	private String stk_8_5_0;		// 是否出院时有高血压
	private String stk_8_5;		// 出院时有高血压患者选择降压药物的类别
	private String stk_8_5_1;		// 其他降压药物
	private String stk_9_1;		// 入院时是否有重点护理评估记录
	private String stk_9_1_1;		// 行走评估结果
	private String stk_9_1_2;		// 呼吸评估结果
	private String stk_9_1_3;		// 饮食评估结果
	private String stk_9_1_4;		// 吞咽评估结果
	private String stk_9_1_5_1;		// 压疮评估（Braden评分值）分值
	private String stk_9_1_6;		// 压疮评估结果选择
	private String stk_9_1_7;		// 预防压疮告知
	private String stk_9_3_1;		// 吸烟史
	private String stk_9_3_2;		// 吸烟程度评估
	private String stk_9_3_3;		// 接受戒烟的建议或者戒烟治疗
	private String stk_13_1_1;		// 是否提供早期康复医疗服务
	private String stk_13_0;		// 是否有功能障碍
	private String stk_13_1;		// 功能障碍评价
	private String stk_13_2;		// 康复治疗适宜性评估结果
	private String stk_13_3;		// 康复实施人员资质选择
	private Date stk_13_4_1;		// 首次实施康复治疗时间
	private String stk_13_5;		// 选择未能进行康复原因
	private String stk_10_1;		// 血管功能评估时间
	private String stk_10_2;		// 血管功能评估方法
	private String stk_12_1_3;		// 实施卒中健康教育有记录
	private String stk_12_1_1;		// 出院时Essen卒中风险评分
	private Double stk_12_1_2_1;		// Essen卒中风险评分值
	private String stk_12_2_1;		// 主要风险因素(住院病历既往史记录)评估
	private String stk_12_2_2;		// 其他风险因素(住院病历既往史记录)评估
	private String stk_12_4_1;		// 是否有出院时mRS评分
	private String stk_12_4_2;		// 出院时mRS评分
	private Double stk_12_4_3;		// 出院时mRS评分
	private String stk_12_4_4;		// 发病的主要原因
	private String stk_12_4_4_1;		// 其他发病的主要原因
	private String stk_12_3_1;		// 交与患者“出院小结”的副本告知患者出院时风险因素
	private String stk_12_3_2;		// 出院带药
	private String stk_12_3_5;		// 告知何为风险因素与紧急情况
	private String stk_12_3_3;		// 告知发生紧急情况时求援救治途径
	private String stk_12_3_4;		// 出院时教育与随访
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
	
	public QualityStk() {
		this(null);
	}

	public QualityStk(String id){
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
	
	@Length(min=0, max=32, message="其他主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称长度不能超过 32 个字符")
	public String getStk_0_1_3_1() {
		return stk_0_1_3_1;
	}

	public void setStk_0_1_3_1(String stk_0_1_3_1) {
		this.stk_0_1_3_1 = stk_0_1_3_1;
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
	
	@Length(min=0, max=32, message="现场评估生命体征，施行急救长度不能超过 32 个字符")
	public String getStk_0_4_1() {
		return stk_0_4_1;
	}

	public void setStk_0_4_1(String stk_0_4_1) {
		this.stk_0_4_1 = stk_0_4_1;
	}
	
	@Length(min=0, max=32, message="到达现场后10分钟内完成院前卒中评分长度不能超过 32 个字符")
	public String getStk_0_4_2() {
		return stk_0_4_2;
	}

	public void setStk_0_4_2(String stk_0_4_2) {
		this.stk_0_4_2 = stk_0_4_2;
	}
	
	@Length(min=0, max=32, message="现场急救维持生命体征稳定长度不能超过 32 个字符")
	public String getStk_0_4_3() {
		return stk_0_4_3;
	}

	public void setStk_0_4_3(String stk_0_4_3) {
		this.stk_0_4_3 = stk_0_4_3;
	}
	
	@Length(min=0, max=32, message="利用车载信息系统、微信、彩信等多种形式传输心电图等院前信息至目标医院长度不能超过 32 个字符")
	public String getStk_0_4_4() {
		return stk_0_4_4;
	}

	public void setStk_0_4_4(String stk_0_4_4) {
		this.stk_0_4_4 = stk_0_4_4;
	}
	
	@Length(min=0, max=32, message="急诊医师接诊日期时间是否确定长度不能超过 32 个字符")
	public String getStk_1_1_1_1() {
		return stk_1_1_1_1;
	}

	public void setStk_1_1_1_1(String stk_1_1_1_1) {
		this.stk_1_1_1_1 = stk_1_1_1_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStk_1_1_1_2() {
		return stk_1_1_1_2;
	}

	public void setStk_1_1_1_2(Date stk_1_1_1_2) {
		this.stk_1_1_1_2 = stk_1_1_1_2;
	}
	
	public Double getStk_1_1_4() {
		return stk_1_1_4;
	}

	public void setStk_1_1_4(Double stk_1_1_4) {
		this.stk_1_1_4 = stk_1_1_4;
	}
	
	public Double getStk_1_1_5() {
		return stk_1_1_5;
	}

	public void setStk_1_1_5(Double stk_1_1_5) {
		this.stk_1_1_5 = stk_1_1_5;
	}
	
	public Double getStk_1_1_6() {
		return stk_1_1_6;
	}

	public void setStk_1_1_6(Double stk_1_1_6) {
		this.stk_1_1_6 = stk_1_1_6;
	}
	
	public Double getStk_1_1_7() {
		return stk_1_1_7;
	}

	public void setStk_1_1_7(Double stk_1_1_7) {
		this.stk_1_1_7 = stk_1_1_7;
	}
	
	@Length(min=0, max=32, message="急诊后首次评估还是入院后首次评估长度不能超过 32 个字符")
	public String getStk_1_2_1() {
		return stk_1_2_1;
	}

	public void setStk_1_2_1(String stk_1_2_1) {
		this.stk_1_2_1 = stk_1_2_1;
	}
	
	@Length(min=0, max=32, message="急诊首次实施神经功能缺损NIHSS评估长度不能超过 32 个字符")
	public String getStk_1_2_1_1() {
		return stk_1_2_1_1;
	}

	public void setStk_1_2_1_1(String stk_1_2_1_1) {
		this.stk_1_2_1_1 = stk_1_2_1_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStk_1_2_1_2_1() {
		return stk_1_2_1_2_1;
	}

	public void setStk_1_2_1_2_1(Date stk_1_2_1_2_1) {
		this.stk_1_2_1_2_1 = stk_1_2_1_2_1;
	}
	
	public Double getStk_1_2_1_3_1() {
		return stk_1_2_1_3_1;
	}

	public void setStk_1_2_1_3_1(Double stk_1_2_1_3_1) {
		this.stk_1_2_1_3_1 = stk_1_2_1_3_1;
	}
	
	@Length(min=0, max=32, message="入院后首次实施神经功能缺损NIHSS评估长度不能超过 32 个字符")
	public String getStk_1_2_2_1() {
		return stk_1_2_2_1;
	}

	public void setStk_1_2_2_1(String stk_1_2_2_1) {
		this.stk_1_2_2_1 = stk_1_2_2_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStk_1_2_2_2_1() {
		return stk_1_2_2_2_1;
	}

	public void setStk_1_2_2_2_1(Date stk_1_2_2_2_1) {
		this.stk_1_2_2_2_1 = stk_1_2_2_2_1;
	}
	
	public Double getStk_1_2_2_3_1() {
		return stk_1_2_2_3_1;
	}

	public void setStk_1_2_2_3_1(Double stk_1_2_2_3_1) {
		this.stk_1_2_2_3_1 = stk_1_2_2_3_1;
	}
	
	@Length(min=0, max=32, message="是否实施首次头部影像学检查长度不能超过 32 个字符")
	public String getStk_1_3_1() {
		return stk_1_3_1;
	}

	public void setStk_1_3_1(String stk_1_3_1) {
		this.stk_1_3_1 = stk_1_3_1;
	}
	
	@Length(min=0, max=32, message="头部影像学检查项目长度不能超过 32 个字符")
	public String getStk_1_3_2() {
		return stk_1_3_2;
	}

	public void setStk_1_3_2(String stk_1_3_2) {
		this.stk_1_3_2 = stk_1_3_2;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStk_1_3_3_1() {
		return stk_1_3_3_1;
	}

	public void setStk_1_3_3_1(Date stk_1_3_3_1) {
		this.stk_1_3_3_1 = stk_1_3_3_1;
	}
	
	@Length(min=0, max=32, message="头部影像学检查评估的选择长度不能超过 32 个字符")
	public String getStk_2_1_3() {
		return stk_2_1_3;
	}

	public void setStk_2_1_3(String stk_2_1_3) {
		this.stk_2_1_3 = stk_2_1_3;
	}
	
	@Length(min=0, max=32, message="其他头部影像学检查长度不能超过 32 个字符")
	public String getStk_2_1_3_1() {
		return stk_2_1_3_1;
	}

	public void setStk_2_1_3_1(String stk_2_1_3_1) {
		this.stk_2_1_3_1 = stk_2_1_3_1;
	}
	
	@Length(min=0, max=32, message="全血细胞计数长度不能超过 32 个字符")
	public String getStk_1_4_1() {
		return stk_1_4_1;
	}

	public void setStk_1_4_1(String stk_1_4_1) {
		this.stk_1_4_1 = stk_1_4_1;
	}
	
	public Double getStk_1_4_1_3() {
		return stk_1_4_1_3;
	}

	public void setStk_1_4_1_3(Double stk_1_4_1_3) {
		this.stk_1_4_1_3 = stk_1_4_1_3;
	}
	
	public Double getStk_1_4_1_4() {
		return stk_1_4_1_4;
	}

	public void setStk_1_4_1_4(Double stk_1_4_1_4) {
		this.stk_1_4_1_4 = stk_1_4_1_4;
	}
	
	public Double getStk_1_4_1_5() {
		return stk_1_4_1_5;
	}

	public void setStk_1_4_1_5(Double stk_1_4_1_5) {
		this.stk_1_4_1_5 = stk_1_4_1_5;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStk_1_4_1_2() {
		return stk_1_4_1_2;
	}

	public void setStk_1_4_1_2(Date stk_1_4_1_2) {
		this.stk_1_4_1_2 = stk_1_4_1_2;
	}
	
	@Length(min=0, max=32, message="急诊或入院后首次全血细胞计数报告日期时间长度不能超过 32 个字符")
	public String getStk_1_4_1_1_1() {
		return stk_1_4_1_1_1;
	}

	public void setStk_1_4_1_1_1(String stk_1_4_1_1_1) {
		this.stk_1_4_1_1_1 = stk_1_4_1_1_1;
	}
	
	@Length(min=0, max=32, message="凝血功能检查项目长度不能超过 32 个字符")
	public String getStk_1_4_2_1() {
		return stk_1_4_2_1;
	}

	public void setStk_1_4_2_1(String stk_1_4_2_1) {
		this.stk_1_4_2_1 = stk_1_4_2_1;
	}
	
	@Length(min=0, max=32, message="报告日期时间是否确定长度不能超过 32 个字符")
	public String getStk_1_4_2_3() {
		return stk_1_4_2_3;
	}

	public void setStk_1_4_2_3(String stk_1_4_2_3) {
		this.stk_1_4_2_3 = stk_1_4_2_3;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStk_1_4_2_2_1() {
		return stk_1_4_2_2_1;
	}

	public void setStk_1_4_2_2_1(Date stk_1_4_2_2_1) {
		this.stk_1_4_2_2_1 = stk_1_4_2_2_1;
	}
	
	@Length(min=0, max=32, message="生化检验项目长度不能超过 32 个字符")
	public String getStk_1_4_3_1() {
		return stk_1_4_3_1;
	}

	public void setStk_1_4_3_1(String stk_1_4_3_1) {
		this.stk_1_4_3_1 = stk_1_4_3_1;
	}
	
	@Length(min=0, max=32, message="报告日期时间是否确定长度不能超过 32 个字符")
	public String getStk_1_4_3_3() {
		return stk_1_4_3_3;
	}

	public void setStk_1_4_3_3(String stk_1_4_3_3) {
		this.stk_1_4_3_3 = stk_1_4_3_3;
	}
	
	@Length(min=0, max=32, message="报告日期时间长度不能超过 32 个字符")
	public String getStk_1_4_3_2_1() {
		return stk_1_4_3_2_1;
	}

	public void setStk_1_4_3_2_1(String stk_1_4_3_2_1) {
		this.stk_1_4_3_2_1 = stk_1_4_3_2_1;
	}
	
	@Length(min=0, max=32, message="急诊/入院后24小时内首次临床检验检查长度不能超过 32 个字符")
	public String getStk_1_4_2() {
		return stk_1_4_2;
	}

	public void setStk_1_4_2(String stk_1_4_2) {
		this.stk_1_4_2 = stk_1_4_2;
	}
	
	public Double getStk_1_4_2_4() {
		return stk_1_4_2_4;
	}

	public void setStk_1_4_2_4(Double stk_1_4_2_4) {
		this.stk_1_4_2_4 = stk_1_4_2_4;
	}
	
	public Double getStk_1_4_2_5() {
		return stk_1_4_2_5;
	}

	public void setStk_1_4_2_5(Double stk_1_4_2_5) {
		this.stk_1_4_2_5 = stk_1_4_2_5;
	}
	
	public Double getStk_1_4_2_6() {
		return stk_1_4_2_6;
	}

	public void setStk_1_4_2_6(Double stk_1_4_2_6) {
		this.stk_1_4_2_6 = stk_1_4_2_6;
	}
	
	public Double getStk_1_4_2_7() {
		return stk_1_4_2_7;
	}

	public void setStk_1_4_2_7(Double stk_1_4_2_7) {
		this.stk_1_4_2_7 = stk_1_4_2_7;
	}
	
	public Double getStk_1_4_2_8() {
		return stk_1_4_2_8;
	}

	public void setStk_1_4_2_8(Double stk_1_4_2_8) {
		this.stk_1_4_2_8 = stk_1_4_2_8;
	}
	
	public Double getStk_1_4_2_9() {
		return stk_1_4_2_9;
	}

	public void setStk_1_4_2_9(Double stk_1_4_2_9) {
		this.stk_1_4_2_9 = stk_1_4_2_9;
	}
	
	@Length(min=0, max=32, message="急诊或入院后是否首次实施心电图长度不能超过 32 个字符")
	public String getStk_1_5_1() {
		return stk_1_5_1;
	}

	public void setStk_1_5_1(String stk_1_5_1) {
		this.stk_1_5_1 = stk_1_5_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStk_1_5_2_1() {
		return stk_1_5_2_1;
	}

	public void setStk_1_5_2_1(Date stk_1_5_2_1) {
		this.stk_1_5_2_1 = stk_1_5_2_1;
	}
	
	@Length(min=0, max=32, message="心电图长度不能超过 32 个字符")
	public String getStk_1_5_3() {
		return stk_1_5_3;
	}

	public void setStk_1_5_3(String stk_1_5_3) {
		this.stk_1_5_3 = stk_1_5_3;
	}
	
	@Length(min=0, max=32, message="其他心电图长度不能超过 32 个字符")
	public String getStk_1_5_3_1() {
		return stk_1_5_3_1;
	}

	public void setStk_1_5_3_1(String stk_1_5_3_1) {
		this.stk_1_5_3_1 = stk_1_5_3_1;
	}
	
	@Length(min=0, max=32, message="发病→到达急诊“绿色通道”时间是否确定长度不能超过 32 个字符")
	public String getStk_2_1_1_1() {
		return stk_2_1_1_1;
	}

	public void setStk_2_1_1_1(String stk_2_1_1_1) {
		this.stk_2_1_1_1 = stk_2_1_1_1;
	}
	
	public Double getStk_2_1_1_2() {
		return stk_2_1_1_2;
	}

	public void setStk_2_1_1_2(Double stk_2_1_1_2) {
		this.stk_2_1_1_2 = stk_2_1_1_2;
	}
	
	@Length(min=0, max=32, message="发病→到达急诊“绿色通道”时间评估结论长度不能超过 32 个字符")
	public String getStk_2_1_2() {
		return stk_2_1_2;
	}

	public void setStk_2_1_2(String stk_2_1_2) {
		this.stk_2_1_2 = stk_2_1_2;
	}
	
	@Length(min=0, max=32, message="是否有溶栓禁忌症长度不能超过 32 个字符")
	public String getStk_2_2_1() {
		return stk_2_2_1;
	}

	public void setStk_2_2_1(String stk_2_2_1) {
		this.stk_2_2_1 = stk_2_2_1;
	}
	
	@Length(min=0, max=32, message="溶栓禁忌症选择长度不能超过 32 个字符")
	public String getStk_2_2_2() {
		return stk_2_2_2;
	}

	public void setStk_2_2_2(String stk_2_2_2) {
		this.stk_2_2_2 = stk_2_2_2;
	}
	
	@Length(min=0, max=32, message="其他临床医师认定的其他禁忌症长度不能超过 32 个字符")
	public String getStk_2_2_2_1() {
		return stk_2_2_2_1;
	}

	public void setStk_2_2_2_1(String stk_2_2_2_1) {
		this.stk_2_2_2_1 = stk_2_2_2_1;
	}
	
	@Length(min=0, max=32, message="发病时段适应证长度不能超过 32 个字符")
	public String getStk_2_3_1_1() {
		return stk_2_3_1_1;
	}

	public void setStk_2_3_1_1(String stk_2_3_1_1) {
		this.stk_2_3_1_1 = stk_2_3_1_1;
	}
	
	@Length(min=0, max=64, message="患者病案号长度不能超过 64 个字符")
	public String getCaseid() {
		return caseid;
	}

	public void setCaseid(String caseid) {
		this.caseid = caseid;
	}
	
	@Length(min=0, max=32, message="溶栓适应证的选择长度不能超过 32 个字符")
	public String getStk_2_3_1_2() {
		return stk_2_3_1_2;
	}

	public void setStk_2_3_1_2(String stk_2_3_1_2) {
		this.stk_2_3_1_2 = stk_2_3_1_2;
	}
	
	@Length(min=0, max=32, message="溶栓的评估结论的选择长度不能超过 32 个字符")
	public String getStk_2_3_2() {
		return stk_2_3_2;
	}

	public void setStk_2_3_2(String stk_2_3_2) {
		this.stk_2_3_2 = stk_2_3_2;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStk_2_4_1_1_1() {
		return stk_2_4_1_1_1;
	}

	public void setStk_2_4_1_1_1(Date stk_2_4_1_1_1) {
		this.stk_2_4_1_1_1 = stk_2_4_1_1_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStk_2_4_2_1_1() {
		return stk_2_4_2_1_1;
	}

	public void setStk_2_4_2_1_1(Date stk_2_4_2_1_1) {
		this.stk_2_4_2_1_1 = stk_2_4_2_1_1;
	}
	
	@Length(min=0, max=32, message="溶栓药选择长度不能超过 32 个字符")
	public String getStk_2_4_3() {
		return stk_2_4_3;
	}

	public void setStk_2_4_3(String stk_2_4_3) {
		this.stk_2_4_3 = stk_2_4_3;
	}
	
	@Length(min=0, max=32, message="实施溶栓长度不能超过 32 个字符")
	public String getStk_2_4_4() {
		return stk_2_4_4;
	}

	public void setStk_2_4_4(String stk_2_4_4) {
		this.stk_2_4_4 = stk_2_4_4;
	}
	
	public Double getStk_2_4_5_1() {
		return stk_2_4_5_1;
	}

	public void setStk_2_4_5_1(Double stk_2_4_5_1) {
		this.stk_2_4_5_1 = stk_2_4_5_1;
	}
	
	@Length(min=0, max=32, message="是否实施介入治疗	字长度不能超过 32 个字符")
	public String getStk_15_1_0() {
		return stk_15_1_0;
	}

	public void setStk_15_1_0(String stk_15_1_0) {
		this.stk_15_1_0 = stk_15_1_0;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStk_15_1_1_1() {
		return stk_15_1_1_1;
	}

	public void setStk_15_1_1_1(Date stk_15_1_1_1) {
		this.stk_15_1_1_1 = stk_15_1_1_1;
	}
	
	@Length(min=0, max=32, message="介入治疗时机长度不能超过 32 个字符")
	public String getStk_15_2() {
		return stk_15_2;
	}

	public void setStk_15_2(String stk_15_2) {
		this.stk_15_2 = stk_15_2;
	}
	
	@Length(min=0, max=32, message="决定适应证医师职称长度不能超过 32 个字符")
	public String getStk_15_3() {
		return stk_15_3;
	}

	public void setStk_15_3(String stk_15_3) {
		this.stk_15_3 = stk_15_3;
	}
	
	@Length(min=0, max=32, message="介入主刀医师职称长度不能超过 32 个字符")
	public String getStk_15_4() {
		return stk_15_4;
	}

	public void setStk_15_4(String stk_15_4) {
		this.stk_15_4 = stk_15_4;
	}
	
	@Length(min=0, max=32, message="大血管闭塞重症患者实施血管内适应证选择长度不能超过 32 个字符")
	public String getStk_15_6() {
		return stk_15_6;
	}

	public void setStk_15_6(String stk_15_6) {
		this.stk_15_6 = stk_15_6;
	}
	
	@Length(min=0, max=32, message="其它适应证长度不能超过 32 个字符")
	public String getStk_15_6_1() {
		return stk_15_6_1;
	}

	public void setStk_15_6_1(String stk_15_6_1) {
		this.stk_15_6_1 = stk_15_6_1;
	}
	
	@Length(min=0, max=32, message="血管内介入治疗术式选择长度不能超过 32 个字符")
	public String getStk_15_5_1() {
		return stk_15_5_1;
	}

	public void setStk_15_5_1(String stk_15_5_1) {
		this.stk_15_5_1 = stk_15_5_1;
	}
	
	public Double getStk_15_8() {
		return stk_15_8;
	}

	public void setStk_15_8(Double stk_15_8) {
		this.stk_15_8 = stk_15_8;
	}
	
	@Length(min=0, max=32, message="溶栓治疗院内延误时间超过1小时主要原因的选择长度不能超过 32 个字符")
	public String getStk_2_6_1() {
		return stk_2_6_1;
	}

	public void setStk_2_6_1(String stk_2_6_1) {
		this.stk_2_6_1 = stk_2_6_1;
	}
	
	@Length(min=0, max=32, message="溶栓治疗医嘱未能执行主要原因的长度不能超过 32 个字符")
	public String getStk_2_6_2() {
		return stk_2_6_2;
	}

	public void setStk_2_6_2(String stk_2_6_2) {
		this.stk_2_6_2 = stk_2_6_2;
	}
	
	@Length(min=0, max=32, message="是否实施影像学评估血管再通分级长度不能超过 32 个字符")
	public String getStk_15_7() {
		return stk_15_7;
	}

	public void setStk_15_7(String stk_15_7) {
		this.stk_15_7 = stk_15_7;
	}
	
	@Length(min=0, max=32, message="血管再通分级长度不能超过 32 个字符")
	public String getStk_15_7_1() {
		return stk_15_7_1;
	}

	public void setStk_15_7_1(String stk_15_7_1) {
		this.stk_15_7_1 = stk_15_7_1;
	}
	
	@Length(min=0, max=32, message="是否实施溶栓后72小时NIHSS评估长度不能超过 32 个字符")
	public String getStk_2_5_1_1() {
		return stk_2_5_1_1;
	}

	public void setStk_2_5_1_1(String stk_2_5_1_1) {
		this.stk_2_5_1_1 = stk_2_5_1_1;
	}
	
	public Double getStk_2_5_1_2_1() {
		return stk_2_5_1_2_1;
	}

	public void setStk_2_5_1_2_1(Double stk_2_5_1_2_1) {
		this.stk_2_5_1_2_1 = stk_2_5_1_2_1;
	}
	
	public Double getStk_2_5_1_3_1() {
		return stk_2_5_1_3_1;
	}

	public void setStk_2_5_1_3_1(Double stk_2_5_1_3_1) {
		this.stk_2_5_1_3_1 = stk_2_5_1_3_1;
	}
	
	public Double getStk_2_5_1_4_1() {
		return stk_2_5_1_4_1;
	}

	public void setStk_2_5_1_4_1(Double stk_2_5_1_4_1) {
		this.stk_2_5_1_4_1 = stk_2_5_1_4_1;
	}
	
	public Double getStk_2_5_1_5_1() {
		return stk_2_5_1_5_1;
	}

	public void setStk_2_5_1_5_1(Double stk_2_5_1_5_1) {
		this.stk_2_5_1_5_1 = stk_2_5_1_5_1;
	}
	
	@Length(min=0, max=32, message="是否实施溶栓长度不能超过 32 个字符")
	public String getStk_2_5_2_1() {
		return stk_2_5_2_1;
	}

	public void setStk_2_5_2_1(String stk_2_5_2_1) {
		this.stk_2_5_2_1 = stk_2_5_2_1;
	}
	
	@Length(min=0, max=32, message="溶栓后72小时影像学复查项目长度不能超过 32 个字符")
	public String getStk_2_5_2_2() {
		return stk_2_5_2_2;
	}

	public void setStk_2_5_2_2(String stk_2_5_2_2) {
		this.stk_2_5_2_2 = stk_2_5_2_2;
	}
	
	@Length(min=0, max=32, message="是否出现溶栓治疗并发症长度不能超过 32 个字符")
	public String getStk_2_5_3_1() {
		return stk_2_5_3_1;
	}

	public void setStk_2_5_3_1(String stk_2_5_3_1) {
		this.stk_2_5_3_1 = stk_2_5_3_1;
	}
	
	@Length(min=0, max=32, message="并发症严重程度长度不能超过 32 个字符")
	public String getStk_2_5_3_2() {
		return stk_2_5_3_2;
	}

	public void setStk_2_5_3_2(String stk_2_5_3_2) {
		this.stk_2_5_3_2 = stk_2_5_3_2;
	}
	
	@Length(min=0, max=32, message="是否为房颤患者脑卒中长度不能超过 32 个字符")
	public String getStk_3_1_1_1() {
		return stk_3_1_1_1;
	}

	public void setStk_3_1_1_1(String stk_3_1_1_1) {
		this.stk_3_1_1_1 = stk_3_1_1_1;
	}
	
	@Length(min=0, max=32, message="是否实施房颤患者脑卒中风险评估长度不能超过 32 个字符")
	public String getStk_3_1_1() {
		return stk_3_1_1;
	}

	public void setStk_3_1_1(String stk_3_1_1) {
		this.stk_3_1_1 = stk_3_1_1;
	}
	
	public Double getStk_3_1_2_1() {
		return stk_3_1_2_1;
	}

	public void setStk_3_1_2_1(Double stk_3_1_2_1) {
		this.stk_3_1_2_1 = stk_3_1_2_1;
	}
	
	@Length(min=0, max=32, message="CHA2DS2-VASc评分大于2分长度不能超过 32 个字符")
	public String getStk_3_1_3() {
		return stk_3_1_3;
	}

	public void setStk_3_1_3(String stk_3_1_3) {
		this.stk_3_1_3 = stk_3_1_3;
	}
	
	@Length(min=0, max=32, message="是否有使用抗凝药物的禁忌证长度不能超过 32 个字符")
	public String getStk_3_2_1() {
		return stk_3_2_1;
	}

	public void setStk_3_2_1(String stk_3_2_1) {
		this.stk_3_2_1 = stk_3_2_1;
	}
	
	@Length(min=0, max=32, message="使用抗凝药物的禁忌症长度不能超过 32 个字符")
	public String getStk_3_2_2() {
		return stk_3_2_2;
	}

	public void setStk_3_2_2(String stk_3_2_2) {
		this.stk_3_2_2 = stk_3_2_2;
	}
	
	@Length(min=0, max=32, message="是否使用抗凝药物长度不能超过 32 个字符")
	public String getStk_3_3_1() {
		return stk_3_3_1;
	}

	public void setStk_3_3_1(String stk_3_3_1) {
		this.stk_3_3_1 = stk_3_3_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStk_3_3_2_1_1() {
		return stk_3_3_2_1_1;
	}

	public void setStk_3_3_2_1_1(Date stk_3_3_2_1_1) {
		this.stk_3_3_2_1_1 = stk_3_3_2_1_1;
	}
	
	@Length(min=0, max=32, message="抗凝药物选择长度不能超过 32 个字符")
	public String getStk_3_3_3() {
		return stk_3_3_3;
	}

	public void setStk_3_3_3(String stk_3_3_3) {
		this.stk_3_3_3 = stk_3_3_3;
	}
	
	@Length(min=0, max=32, message="是否使用阿司匹林禁忌证长度不能超过 32 个字符")
	public String getStk_4_1_1() {
		return stk_4_1_1;
	}

	public void setStk_4_1_1(String stk_4_1_1) {
		this.stk_4_1_1 = stk_4_1_1;
	}
	
	@Length(min=0, max=32, message="阿司匹林禁忌症长度不能超过 32 个字符")
	public String getStk_4_1_2() {
		return stk_4_1_2;
	}

	public void setStk_4_1_2(String stk_4_1_2) {
		this.stk_4_1_2 = stk_4_1_2;
	}
	
	@Length(min=0, max=32, message="患者类别选择长度不能超过 32 个字符")
	public String getStk_4_2_3() {
		return stk_4_2_3;
	}

	public void setStk_4_2_3(String stk_4_2_3) {
		this.stk_4_2_3 = stk_4_2_3;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStk_4_2_2_1() {
		return stk_4_2_2_1;
	}

	public void setStk_4_2_2_1(Date stk_4_2_2_1) {
		this.stk_4_2_2_1 = stk_4_2_2_1;
	}
	
	@Length(min=0, max=32, message="药物选择长度不能超过 32 个字符")
	public String getStk_4_3() {
		return stk_4_3;
	}

	public void setStk_4_3(String stk_4_3) {
		this.stk_4_3 = stk_4_3;
	}
	
	@Length(min=0, max=32, message="其他抗血小板药物长度不能超过 32 个字符")
	public String getStk_4_3_1() {
		return stk_4_3_1;
	}

	public void setStk_4_3_1(String stk_4_3_1) {
		this.stk_4_3_1 = stk_4_3_1;
	}
	
	@Length(min=0, max=32, message="血脂评价时间的选择长度不能超过 32 个字符")
	public String getStk_5_1() {
		return stk_5_1;
	}

	public void setStk_5_1(String stk_5_1) {
		this.stk_5_1 = stk_5_1;
	}
	
	@Length(min=0, max=32, message="血脂评价结果长度不能超过 32 个字符")
	public String getStk_5_2() {
		return stk_5_2;
	}

	public void setStk_5_2(String stk_5_2) {
		this.stk_5_2 = stk_5_2;
	}
	
	@Length(min=0, max=32, message="是否有他汀药物禁忌症长度不能超过 32 个字符")
	public String getStk_5_3_1() {
		return stk_5_3_1;
	}

	public void setStk_5_3_1(String stk_5_3_1) {
		this.stk_5_3_1 = stk_5_3_1;
	}
	
	@Length(min=0, max=32, message="他汀类药物禁忌证的选择长度不能超过 32 个字符")
	public String getStk_5_3_2() {
		return stk_5_3_2;
	}

	public void setStk_5_3_2(String stk_5_3_2) {
		this.stk_5_3_2 = stk_5_3_2;
	}
	
	@Length(min=0, max=32, message="是否有用药长期医嘱-他汀类药物长度不能超过 32 个字符")
	public String getStk_5_4() {
		return stk_5_4;
	}

	public void setStk_5_4(String stk_5_4) {
		this.stk_5_4 = stk_5_4;
	}
	
	@Length(min=0, max=32, message="他汀类常用药物选择长度不能超过 32 个字符")
	public String getStk_5_4_1() {
		return stk_5_4_1;
	}

	public void setStk_5_4_1(String stk_5_4_1) {
		this.stk_5_4_1 = stk_5_4_1;
	}
	
	@Length(min=0, max=32, message="是否糖尿病患者长度不能超过 32 个字符")
	public String getStk_5_5_1() {
		return stk_5_5_1;
	}

	public void setStk_5_5_1(String stk_5_5_1) {
		this.stk_5_5_1 = stk_5_5_1;
	}
	
	@Length(min=0, max=32, message="选择降糖药物的类别长度不能超过 32 个字符")
	public String getStk_5_5_2() {
		return stk_5_5_2;
	}

	public void setStk_5_5_2(String stk_5_5_2) {
		this.stk_5_5_2 = stk_5_5_2;
	}
	
	@Length(min=0, max=32, message="其他降糖药物长度不能超过 32 个字符")
	public String getStk_5_5_2_1() {
		return stk_5_5_2_1;
	}

	public void setStk_5_5_2_1(String stk_5_5_2_1) {
		this.stk_5_5_2_1 = stk_5_5_2_1;
	}
	
	@Length(min=0, max=32, message="是否高血压患者长度不能超过 32 个字符")
	public String getStk_5_7_1() {
		return stk_5_7_1;
	}

	public void setStk_5_7_1(String stk_5_7_1) {
		this.stk_5_7_1 = stk_5_7_1;
	}
	
	@Length(min=0, max=32, message="选择降压药物的类别长度不能超过 32 个字符")
	public String getStk_5_7_2() {
		return stk_5_7_2;
	}

	public void setStk_5_7_2(String stk_5_7_2) {
		this.stk_5_7_2 = stk_5_7_2;
	}
	
	@Length(min=0, max=32, message="其它降压药物长度不能超过 32 个字符")
	public String getStk_5_7_2_1() {
		return stk_5_7_2_1;
	}

	public void setStk_5_7_2_1(String stk_5_7_2_1) {
		this.stk_5_7_2_1 = stk_5_7_2_1;
	}
	
	@Length(min=0, max=32, message="入院时是否正常进食与饮水长度不能超过 32 个字符")
	public String getStk_6_1() {
		return stk_6_1;
	}

	public void setStk_6_1(String stk_6_1) {
		this.stk_6_1 = stk_6_1;
	}
	
	@Length(min=0, max=32, message="是否进行吞咽评估长度不能超过 32 个字符")
	public String getStk_6_2_0() {
		return stk_6_2_0;
	}

	public void setStk_6_2_0(String stk_6_2_0) {
		this.stk_6_2_0 = stk_6_2_0;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStk_6_2_1_1() {
		return stk_6_2_1_1;
	}

	public void setStk_6_2_1_1(Date stk_6_2_1_1) {
		this.stk_6_2_1_1 = stk_6_2_1_1;
	}
	
	@Length(min=0, max=32, message="评价方法选择长度不能超过 32 个字符")
	public String getStk_6_3_1() {
		return stk_6_3_1;
	}

	public void setStk_6_3_1(String stk_6_3_1) {
		this.stk_6_3_1 = stk_6_3_1;
	}
	
	@Length(min=0, max=32, message="其他评价方法填写长度不能超过 32 个字符")
	public String getStk_6_3_1_1() {
		return stk_6_3_1_1;
	}

	public void setStk_6_3_1_1(String stk_6_3_1_1) {
		this.stk_6_3_1_1 = stk_6_3_1_1;
	}
	
	@Length(min=0, max=32, message="未进行吞咽困难评价的原因长度不能超过 32 个字符")
	public String getStk_6_3_2() {
		return stk_6_3_2;
	}

	public void setStk_6_3_2(String stk_6_3_2) {
		this.stk_6_3_2 = stk_6_3_2;
	}
	
	@Length(min=0, max=32, message="其它未进行吞咽困难评价的原因长度不能超过 32 个字符")
	public String getStk_6_3_2_1() {
		return stk_6_3_2_1;
	}

	public void setStk_6_3_2_1(String stk_6_3_2_1) {
		this.stk_6_3_2_1 = stk_6_3_2_1;
	}
	
	@Length(min=0, max=32, message="入院后病情判定长度不能超过 32 个字符")
	public String getStk_7_1() {
		return stk_7_1;
	}

	public void setStk_7_1(String stk_7_1) {
		this.stk_7_1 = stk_7_1;
	}
	
	@Length(min=0, max=32, message="是否需要做预防DVT治疗长度不能超过 32 个字符")
	public String getStk_7_2_1() {
		return stk_7_2_1;
	}

	public void setStk_7_2_1(String stk_7_2_1) {
		this.stk_7_2_1 = stk_7_2_1;
	}
	
	@Length(min=0, max=32, message="禁忌证选择长度不能超过 32 个字符")
	public String getStk_7_2_2() {
		return stk_7_2_2;
	}

	public void setStk_7_2_2(String stk_7_2_2) {
		this.stk_7_2_2 = stk_7_2_2;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStk_7_2_3_1_1() {
		return stk_7_2_3_1_1;
	}

	public void setStk_7_2_3_1_1(Date stk_7_2_3_1_1) {
		this.stk_7_2_3_1_1 = stk_7_2_3_1_1;
	}
	
	@Length(min=0, max=32, message="预防DVT治疗方法长度不能超过 32 个字符")
	public String getStk_7_3_1_4() {
		return stk_7_3_1_4;
	}

	public void setStk_7_3_1_4(String stk_7_3_1_4) {
		this.stk_7_3_1_4 = stk_7_3_1_4;
	}
	
	@Length(min=0, max=32, message="其他预防DVT治疗药物长度不能超过 32 个字符")
	public String getStk_7_3_1_5() {
		return stk_7_3_1_5;
	}

	public void setStk_7_3_1_5(String stk_7_3_1_5) {
		this.stk_7_3_1_5 = stk_7_3_1_5;
	}
	
	@Length(min=0, max=32, message="出院时继续使用抗血小扳聚集治疗药物长度不能超过 32 个字符")
	public String getStk_8_1() {
		return stk_8_1;
	}

	public void setStk_8_1(String stk_8_1) {
		this.stk_8_1 = stk_8_1;
	}
	
	@Length(min=0, max=32, message="其他抗血小板聚集治疗药物长度不能超过 32 个字符")
	public String getStk_8_1_1() {
		return stk_8_1_1;
	}

	public void setStk_8_1_1(String stk_8_1_1) {
		this.stk_8_1_1 = stk_8_1_1;
	}
	
	@Length(min=0, max=32, message="出院时使用选择他汀类药物长度不能超过 32 个字符")
	public String getStk_8_2() {
		return stk_8_2;
	}

	public void setStk_8_2(String stk_8_2) {
		this.stk_8_2 = stk_8_2;
	}
	
	@Length(min=0, max=32, message="出院时使用抗凝药物长度不能超过 32 个字符")
	public String getStk_8_3() {
		return stk_8_3;
	}

	public void setStk_8_3(String stk_8_3) {
		this.stk_8_3 = stk_8_3;
	}
	
	@Length(min=0, max=32, message="出院时使用降糖药物的类别长度不能超过 32 个字符")
	public String getStk_8_4() {
		return stk_8_4;
	}

	public void setStk_8_4(String stk_8_4) {
		this.stk_8_4 = stk_8_4;
	}
	
	@Length(min=0, max=32, message="其他降糖药物长度不能超过 32 个字符")
	public String getStk_8_4_1() {
		return stk_8_4_1;
	}

	public void setStk_8_4_1(String stk_8_4_1) {
		this.stk_8_4_1 = stk_8_4_1;
	}
	
	@Length(min=0, max=32, message="是否出院时有高血压长度不能超过 32 个字符")
	public String getStk_8_5_0() {
		return stk_8_5_0;
	}

	public void setStk_8_5_0(String stk_8_5_0) {
		this.stk_8_5_0 = stk_8_5_0;
	}
	
	@Length(min=0, max=32, message="出院时有高血压患者选择降压药物的类别长度不能超过 32 个字符")
	public String getStk_8_5() {
		return stk_8_5;
	}

	public void setStk_8_5(String stk_8_5) {
		this.stk_8_5 = stk_8_5;
	}
	
	@Length(min=0, max=32, message="其他降压药物长度不能超过 32 个字符")
	public String getStk_8_5_1() {
		return stk_8_5_1;
	}

	public void setStk_8_5_1(String stk_8_5_1) {
		this.stk_8_5_1 = stk_8_5_1;
	}
	
	@Length(min=0, max=32, message="入院时是否有重点护理评估记录长度不能超过 32 个字符")
	public String getStk_9_1() {
		return stk_9_1;
	}

	public void setStk_9_1(String stk_9_1) {
		this.stk_9_1 = stk_9_1;
	}
	
	@Length(min=0, max=32, message="行走评估结果长度不能超过 32 个字符")
	public String getStk_9_1_1() {
		return stk_9_1_1;
	}

	public void setStk_9_1_1(String stk_9_1_1) {
		this.stk_9_1_1 = stk_9_1_1;
	}
	
	@Length(min=0, max=32, message="呼吸评估结果长度不能超过 32 个字符")
	public String getStk_9_1_2() {
		return stk_9_1_2;
	}

	public void setStk_9_1_2(String stk_9_1_2) {
		this.stk_9_1_2 = stk_9_1_2;
	}
	
	@Length(min=0, max=32, message="饮食评估结果长度不能超过 32 个字符")
	public String getStk_9_1_3() {
		return stk_9_1_3;
	}

	public void setStk_9_1_3(String stk_9_1_3) {
		this.stk_9_1_3 = stk_9_1_3;
	}
	
	@Length(min=0, max=32, message="吞咽评估结果长度不能超过 32 个字符")
	public String getStk_9_1_4() {
		return stk_9_1_4;
	}

	public void setStk_9_1_4(String stk_9_1_4) {
		this.stk_9_1_4 = stk_9_1_4;
	}
	
	@Length(min=0, max=32, message="压疮评估长度不能超过 32 个字符")
	public String getStk_9_1_5_1() {
		return stk_9_1_5_1;
	}

	public void setStk_9_1_5_1(String stk_9_1_5_1) {
		this.stk_9_1_5_1 = stk_9_1_5_1;
	}
	
	@Length(min=0, max=32, message="压疮评估结果选择长度不能超过 32 个字符")
	public String getStk_9_1_6() {
		return stk_9_1_6;
	}

	public void setStk_9_1_6(String stk_9_1_6) {
		this.stk_9_1_6 = stk_9_1_6;
	}
	
	@Length(min=0, max=32, message="预防压疮告知长度不能超过 32 个字符")
	public String getStk_9_1_7() {
		return stk_9_1_7;
	}

	public void setStk_9_1_7(String stk_9_1_7) {
		this.stk_9_1_7 = stk_9_1_7;
	}
	
	@Length(min=0, max=32, message="吸烟史长度不能超过 32 个字符")
	public String getStk_9_3_1() {
		return stk_9_3_1;
	}

	public void setStk_9_3_1(String stk_9_3_1) {
		this.stk_9_3_1 = stk_9_3_1;
	}
	
	@Length(min=0, max=32, message="吸烟程度评估长度不能超过 32 个字符")
	public String getStk_9_3_2() {
		return stk_9_3_2;
	}

	public void setStk_9_3_2(String stk_9_3_2) {
		this.stk_9_3_2 = stk_9_3_2;
	}
	
	@Length(min=0, max=32, message="接受戒烟的建议或者戒烟治疗长度不能超过 32 个字符")
	public String getStk_9_3_3() {
		return stk_9_3_3;
	}

	public void setStk_9_3_3(String stk_9_3_3) {
		this.stk_9_3_3 = stk_9_3_3;
	}
	
	@Length(min=0, max=32, message="是否提供早期康复医疗服务长度不能超过 32 个字符")
	public String getStk_13_1_1() {
		return stk_13_1_1;
	}

	public void setStk_13_1_1(String stk_13_1_1) {
		this.stk_13_1_1 = stk_13_1_1;
	}
	
	@Length(min=0, max=32, message="是否有功能障碍长度不能超过 32 个字符")
	public String getStk_13_0() {
		return stk_13_0;
	}

	public void setStk_13_0(String stk_13_0) {
		this.stk_13_0 = stk_13_0;
	}
	
	@Length(min=0, max=32, message="功能障碍评价长度不能超过 32 个字符")
	public String getStk_13_1() {
		return stk_13_1;
	}

	public void setStk_13_1(String stk_13_1) {
		this.stk_13_1 = stk_13_1;
	}
	
	@Length(min=0, max=32, message="康复治疗适宜性评估结果长度不能超过 32 个字符")
	public String getStk_13_2() {
		return stk_13_2;
	}

	public void setStk_13_2(String stk_13_2) {
		this.stk_13_2 = stk_13_2;
	}
	
	@Length(min=0, max=32, message="康复实施人员资质选择长度不能超过 32 个字符")
	public String getStk_13_3() {
		return stk_13_3;
	}

	public void setStk_13_3(String stk_13_3) {
		this.stk_13_3 = stk_13_3;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStk_13_4_1() {
		return stk_13_4_1;
	}

	public void setStk_13_4_1(Date stk_13_4_1) {
		this.stk_13_4_1 = stk_13_4_1;
	}
	
	@Length(min=0, max=32, message="选择未能进行康复原因长度不能超过 32 个字符")
	public String getStk_13_5() {
		return stk_13_5;
	}

	public void setStk_13_5(String stk_13_5) {
		this.stk_13_5 = stk_13_5;
	}
	
	@Length(min=0, max=32, message="血管功能评估时间长度不能超过 32 个字符")
	public String getStk_10_1() {
		return stk_10_1;
	}

	public void setStk_10_1(String stk_10_1) {
		this.stk_10_1 = stk_10_1;
	}
	
	@Length(min=0, max=32, message="血管功能评估方法长度不能超过 32 个字符")
	public String getStk_10_2() {
		return stk_10_2;
	}

	public void setStk_10_2(String stk_10_2) {
		this.stk_10_2 = stk_10_2;
	}
	
	@Length(min=0, max=32, message="实施卒中健康教育有记录长度不能超过 32 个字符")
	public String getStk_12_1_3() {
		return stk_12_1_3;
	}

	public void setStk_12_1_3(String stk_12_1_3) {
		this.stk_12_1_3 = stk_12_1_3;
	}
	
	@Length(min=0, max=32, message="出院时Essen卒中风险评分长度不能超过 32 个字符")
	public String getStk_12_1_1() {
		return stk_12_1_1;
	}

	public void setStk_12_1_1(String stk_12_1_1) {
		this.stk_12_1_1 = stk_12_1_1;
	}
	
	public Double getStk_12_1_2_1() {
		return stk_12_1_2_1;
	}

	public void setStk_12_1_2_1(Double stk_12_1_2_1) {
		this.stk_12_1_2_1 = stk_12_1_2_1;
	}
	
	@Length(min=0, max=32, message="主要风险因素长度不能超过 32 个字符")
	public String getStk_12_2_1() {
		return stk_12_2_1;
	}

	public void setStk_12_2_1(String stk_12_2_1) {
		this.stk_12_2_1 = stk_12_2_1;
	}
	
	@Length(min=0, max=32, message="其他风险因素长度不能超过 32 个字符")
	public String getStk_12_2_2() {
		return stk_12_2_2;
	}

	public void setStk_12_2_2(String stk_12_2_2) {
		this.stk_12_2_2 = stk_12_2_2;
	}
	
	@Length(min=0, max=32, message="是否有出院时mRS评分长度不能超过 32 个字符")
	public String getStk_12_4_1() {
		return stk_12_4_1;
	}

	public void setStk_12_4_1(String stk_12_4_1) {
		this.stk_12_4_1 = stk_12_4_1;
	}
	
	@Length(min=0, max=32, message="出院时mRS评分长度不能超过 32 个字符")
	public String getStk_12_4_2() {
		return stk_12_4_2;
	}

	public void setStk_12_4_2(String stk_12_4_2) {
		this.stk_12_4_2 = stk_12_4_2;
	}
	
	public Double getStk_12_4_3() {
		return stk_12_4_3;
	}

	public void setStk_12_4_3(Double stk_12_4_3) {
		this.stk_12_4_3 = stk_12_4_3;
	}
	
	@Length(min=0, max=32, message="发病的主要原因长度不能超过 32 个字符")
	public String getStk_12_4_4() {
		return stk_12_4_4;
	}

	public void setStk_12_4_4(String stk_12_4_4) {
		this.stk_12_4_4 = stk_12_4_4;
	}
	
	@Length(min=0, max=32, message="其他发病的主要原因长度不能超过 32 个字符")
	public String getStk_12_4_4_1() {
		return stk_12_4_4_1;
	}

	public void setStk_12_4_4_1(String stk_12_4_4_1) {
		this.stk_12_4_4_1 = stk_12_4_4_1;
	}
	
	@Length(min=0, max=32, message="交与患者“出院小结”的副本告知患者出院时风险因素长度不能超过 32 个字符")
	public String getStk_12_3_1() {
		return stk_12_3_1;
	}

	public void setStk_12_3_1(String stk_12_3_1) {
		this.stk_12_3_1 = stk_12_3_1;
	}
	
	@Length(min=0, max=32, message="出院带药长度不能超过 32 个字符")
	public String getStk_12_3_2() {
		return stk_12_3_2;
	}

	public void setStk_12_3_2(String stk_12_3_2) {
		this.stk_12_3_2 = stk_12_3_2;
	}
	
	@Length(min=0, max=32, message="告知何为风险因素与紧急情况长度不能超过 32 个字符")
	public String getStk_12_3_5() {
		return stk_12_3_5;
	}

	public void setStk_12_3_5(String stk_12_3_5) {
		this.stk_12_3_5 = stk_12_3_5;
	}
	
	@Length(min=0, max=32, message="告知发生紧急情况时求援救治途径长度不能超过 32 个字符")
	public String getStk_12_3_3() {
		return stk_12_3_3;
	}

	public void setStk_12_3_3(String stk_12_3_3) {
		this.stk_12_3_3 = stk_12_3_3;
	}
	
	@Length(min=0, max=32, message="出院时教育与随访长度不能超过 32 个字符")
	public String getStk_12_3_4() {
		return stk_12_3_4;
	}

	public void setStk_12_3_4(String stk_12_3_4) {
		this.stk_12_3_4 = stk_12_3_4;
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