/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.ich.entity;

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
 * ICH脑出血Entity
 * @author 卡卡西
 * @version 2021-01-18
 */
@Table(name="quality_ich", alias="a", columns={
		@Column(name="cm_0_1_1_1", attrName="cm_0_1_1_1", label="质控医师"),
		@Column(name="cm_0_1_1_2", attrName="cm_0_1_1_2", label="质控护士"),
		@Column(name="cm_0_1_1_3", attrName="cm_0_1_1_3", label="主治医师"),
		@Column(name="cm_0_1_1_4", attrName="cm_0_1_1_4", label="责任护士"),
		@Column(name="cm_0_1_1_5", attrName="cm_0_1_1_5", label="上报科室"),
		@Column(name="case_id", attrName="caseId", label="患者病案号"),
		@Column(name="cm_0_1_3_1", attrName="cm_0_1_3_1", label="主要诊断ICD-10四位亚目编码与名称"),
		@Column(name="ich_0_1_12_1", attrName="ich_0_1_12_1", label="其他主要诊断ICD-10四位亚目编码与名称"),
		@Column(name="cm_0_1_3_2", attrName="cm_0_1_3_2", label="主要诊断ICD-10六位临床扩展编码与名称"),
		@Column(name="ich_0_1_8_1", attrName="ich_0_1_8_1", label="其他主要诊断ICD-10六位临床扩展编码与名称"),
		@Column(name="cm_0_1_4_1", attrName="cm_0_1_4_1", label="主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称"),
		@Column(name="ich_0_1_11_1", attrName="ich_0_1_11_1", label="其他主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称"),
		@Column(name="cm_0_1_4_2", attrName="cm_0_1_4_2", label="主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称"),
		@Column(name="ich_0_1_7_1", attrName="ich_0_1_7_1", label="其他主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称"),
		@Column(name="cm_0_1_5", attrName="cm_0_1_5", label="是否出院后31天内重复住院"),
		@Column(name="cm_0_2_1_1", attrName="cm_0_2_1_1", label="出生日期"),
		@Column(name="cm_0_2_1_2", attrName="cm_0_2_1_2", label="患者性别"),
		@Column(name="cm_0_2_1_3", attrName="cm_0_2_1_3", label="患者体重", comment="患者体重（kg）"),
		@Column(name="cm_0_2_1_5", attrName="cm_0_2_1_5", label="患者身高", comment="患者身高（cm）"),
		@Column(name="cm_0_2_2_1", attrName="cm_0_2_2_1", label="发病日期时间是否无法确定或无记录"),
		@Column(includeEntity=DataEntity.class),
		@Column(name="cm_0_2_2_2", attrName="cm_0_2_2_2", label="发病日期时间"),
		@Column(name="cm_0_2_3_1", attrName="cm_0_2_3_1", label="到达本院急诊或者门诊日期时间是否无法确定或无记录"),
		@Column(name="cm_0_2_3_2", attrName="cm_0_2_3_2", label="到达本院急诊或者门诊日期时间"),
		@Column(name="cm_0_2_4_1", attrName="cm_0_2_4_1", label="入院日期时间"),
		@Column(name="age", attrName="age", label="年龄"),
		@Column(name="cm_0_2_4_2", attrName="cm_0_2_4_2", label="出院日期时间"),
		@Column(name="cm_0_2_5_1", attrName="cm_0_2_5_1", label="入住CCU日期时间"),
		@Column(name="cm_0_2_5_2", attrName="cm_0_2_5_2", label="离开CCU日期时间"),
		@Column(name="cm_0_2_6_1", attrName="cm_0_2_6_1", label="手术开始", comment="手术开始（切皮）日期时间"),
		@Column(name="cm_0_2_6_2", attrName="cm_0_2_6_2", label="手术结束", comment="手术结束（缝皮结束）日期时间"),
		@Column(name="cm_0_3_1", attrName="cm_0_3_1", label="费用支付方式"),
		@Column(name="cm_0_3_2", attrName="cm_0_3_2", label="收入住院途径"),
		@Column(name="cm_0_3_3", attrName="cm_0_3_3", label="到院交通工具"),
		@Column(name="ich_1_1_1", attrName="ich_1_1_1", label="本院急诊医师接诊日期时间"),
		@Column(name="ich_1_1_2_1", attrName="ich_1_1_2_1", label="身高", comment="身高(单位:厘米(cm))"),
		@Column(name="ich_1_1_2_2", attrName="ich_1_1_2_2", label="体重", comment="体重(单位:公斤(kg))"),
		@Column(name="ich_1_1_2_3", attrName="ich_1_1_2_3", label="呼吸", comment="呼吸(单位:次/分)"),
		@Column(name="ich_1_1_2_4", attrName="ich_1_1_2_4", label="脉搏", comment="脉搏(单位:次/分)"),
		@Column(name="ich_1_1_2_5", attrName="ich_1_1_2_5", label="收缩压", comment="收缩压(单位:mmHg)"),
		@Column(name="ich_1_1_2_6", attrName="ich_1_1_2_6", label="舒张压", comment="舒张压(单位:mmHg)"),
		@Column(name="ich_1_2_1", attrName="ich_1_2_1", label="是否实施格拉斯哥昏迷评估"),
		@Column(name="ich_1_2_2", attrName="ich_1_2_2", label="评估日期时间"),
		@Column(name="ich_1_2_3", attrName="ich_1_2_3", label="实施格拉斯哥昏迷评估分值"),
		@Column(name="ich_1_2_4", attrName="ich_1_2_4", label="是否实施神经功能缺损NIHSS评估"),
		@Column(name="ich_1_2_5", attrName="ich_1_2_5", label="评估日期时间"),
		@Column(name="ich_1_2_6", attrName="ich_1_2_6", label="实施神经功能缺损NIHSS评估分值"),
		@Column(name="ich_1_3_1", attrName="ich_1_3_1", label="急诊是否实施首次头部影像学检查"),
		@Column(name="ich_1_3_2", attrName="ich_1_3_2", label="急诊首次头部影像学检查项目"),
		@Column(name="ich_1_3_3", attrName="ich_1_3_3", label="影像学检查确定血肿部位"),
		@Column(name="ich_1_3_3_1", attrName="ich_1_3_3_1", label="基底节区出血"),
		@Column(name="ich_1_3_3_3", attrName="ich_1_3_3_3", label="脑叶出血"),
		@Column(name="ich_1_3_3_4", attrName="ich_1_3_3_4", label="脑干出血"),
		@Column(name="ich_1_3_4", attrName="ich_1_3_4", label="血肿量", comment="血肿量(ml)"),
		@Column(name="ich_1_3_5", attrName="ich_1_3_5", label="是否血肿破入脑室"),
		@Column(name="ich_1_3_6", attrName="ich_1_3_6", label="是否血肿源自幕下"),
		@Column(name="ich_1_3_7", attrName="ich_1_3_7", label="报告日期时间"),
		@Column(name="ich_1_4_1", attrName="ich_1_4_1", label="是否急诊入住”卒中中心”"),
		@Column(name="ich_1_4_2", attrName="ich_1_4_2", label="入住”卒中中心”日期时间"),
		@Column(name="ich_2_1_1", attrName="ich_2_1_1", label="是否为高血压", comment="是否为高血压(收缩压大于180mmHg)患者"),
		@Column(name="ich_2_1_2", attrName="ich_2_1_2", label="是否24小时内有血压监测与用药长期医嘱"),
		@Column(name="ich_2_1_3", attrName="ich_2_1_3", label="选择降压药物"),
		@Column(name="ich_2_1_3_1", attrName="ich_2_1_3_1", label="其他降压药物"),
		@Column(name="ich_2_1_4", attrName="ich_2_1_4", label="是否为高血压", comment="是否为高血压(收缩压大于200mmHg)患者"),
		@Column(name="ich_2_1_5", attrName="ich_2_1_5", label="是否有使用静脉降压药医嘱"),
		@Column(name="ich_3_1_1", attrName="ich_3_1_1", label="入院后病情判定"),
		@Column(name="ich_3_2_1", attrName="ich_3_2_1", label="是否需要做预防DVT治疗"),
		@Column(name="ich_3_2_2", attrName="ich_3_2_2", label="禁忌证选择"),
		@Column(name="ich_3_2_3", attrName="ich_3_2_3", label="预防DVT治疗医嘱执行日期与时间"),
		@Column(name="ich_3_3_1", attrName="ich_3_3_1", label="药物预防选择"),
		@Column(name="ich_3_3_1_1", attrName="ich_3_3_1_1", label="其它预防药物"),
		@Column(name="ich_3_3_2", attrName="ich_3_3_2", label="物理预防选择"),
		@Column(name="ich_3_3_2_1", attrName="ich_3_3_2_1", label="其他物理预防"),
		@Column(name="ich_3_3_3", attrName="ich_3_3_3", label="基本预防"),
		@Column(name="ich_3_3_3_1", attrName="ich_3_3_3_1", label="其他基本预防措施"),
		@Column(name="ich_4_1_1", attrName="ich_4_1_1", label="入院时是否可以正常进食与饮水"),
		@Column(name="ich_4_2_1", attrName="ich_4_2_1", label="入院24小时内是否进行吞咽评估"),
		@Column(name="ich_4_3_2", attrName="ich_4_3_2", label="未进行吞咽困难评价原因"),
		@Column(name="ich_4_3_2_1", attrName="ich_4_3_2_1", label="其他未进行吞咽困难评价原因"),
		@Column(name="ich_4_2_2", attrName="ich_4_2_2", label="评估日期时间"),
		@Column(name="ich_4_3_1", attrName="ich_4_3_1", label="评价方法选择"),
		@Column(name="ich_4_3_1_1", attrName="ich_4_3_1_1", label="其他评价方法"),
		@Column(name="ich_5_1_1", attrName="ich_5_1_1", label="住院48小时内是否接受影像学检测复查"),
		@Column(name="ich_5_1_2", attrName="ich_5_1_2", label="接受影像学检测复查项目选择"),
		@Column(name="ich_5_1_2_1", attrName="ich_5_1_2_1", label="其他接受影像学检测复查项目名称"),
		@Column(name="ich_5_1_3", attrName="ich_5_1_3", label="复查检测日期时间"),
		@Column(name="ich_5_1_4", attrName="ich_5_1_4", label="是否血肿扩大"),
		@Column(name="ich_5_1_5", attrName="ich_5_1_5", label="是否血管畸形"),
		@Column(name="ich_5_1_6", attrName="ich_5_1_6", label="是否动脉瘤"),
		@Column(name="ich_5_1_7", attrName="ich_5_1_7", label="是否淀粉样病变"),
		@Column(name="ich_5_1_8", attrName="ich_5_1_8", label="是否再出血风险"),
		@Column(name="ich_6_1_1", attrName="ich_6_1_1", label="是否首次ICH评分"),
		@Column(name="ich_6_1_2", attrName="ich_6_1_2", label="评估日期时间"),
		@Column(name="ich_6_1_3_1", attrName="ich_6_1_3_1", label="GCS评分"),
		@Column(name="ich_6_1_3_2", attrName="ich_6_1_3_2", label="血肿量"),
		@Column(name="ich_6_1_3_3", attrName="ich_6_1_3_3", label="是否血肿破入脑室"),
		@Column(name="ich_6_1_3_4", attrName="ich_6_1_3_4", label="是否血肿源自幕下"),
		@Column(name="ich_6_1_3_5", attrName="ich_6_1_3_5", label="年龄"),
		@Column(name="ich_6_1_4", attrName="ich_6_1_4", label="首次ICH评估分值"),
		@Column(name="ich_6_2_6", attrName="ich_6_2_6", label="是否有手术适应证"),
		@Column(name="ich_6_1_5", attrName="ich_6_1_5", label="手术适应证选择"),
		@Column(name="ich_6_1_5_1", attrName="ich_6_1_5_1", label="其他手术适应证"),
		@Column(name="ich_6_2_3", attrName="ich_6_2_3", label="神经外科干预措施"),
		@Column(name="ich_6_2_3_1", attrName="ich_6_2_3_1", label="其他神经外科干预措施"),
		@Column(name="ich_6_2_4", attrName="ich_6_2_4", label="ICH术后特指并发症"),
		@Column(name="ich_6_2_4_1", attrName="ich_6_2_4_1", label="对腰椎穿刺的其他反应"),
		@Column(name="ich_6_2_4_2", attrName="ich_6_2_4_2", label="神经系统的其他操作后疾患"),
		@Column(name="ich_6_2_5", attrName="ich_6_2_5", label="是否手术后再手术"),
		@Column(name="ich_7_1_1", attrName="ich_7_1_1", label="是否高血压", comment="是否高血压(收缩压大于180mmHg)患者"),
		@Column(name="ich_7_1_2", attrName="ich_7_1_2", label="出院医嘱中有血压监测与用药长期医嘱"),
		@Column(name="ich_7_1_3", attrName="ich_7_1_3", label="选择降压药物"),
		@Column(name="ich_7_1_3_1", attrName="ich_7_1_3_1", label="其他降压药物"),
		@Column(name="ich_8_1_1", attrName="ich_8_1_1", label="原发性"),
		@Column(name="ich_8_1_2", attrName="ich_8_1_2", label="继发性"),
		@Column(name="ich_9_1_1", attrName="ich_9_1_1", label="是否有重点护理评估"),
		@Column(name="ich_9_1_2_1", attrName="ich_9_1_2_1", label="行走评估结果"),
		@Column(name="ich_9_1_2_2", attrName="ich_9_1_2_2", label="呼吸评估结果"),
		@Column(name="ich_9_1_2_3", attrName="ich_9_1_2_3", label="饮食评估结果"),
		@Column(name="ich_9_1_2_4", attrName="ich_9_1_2_4", label="吞咽评估结果"),
		@Column(name="ich_9_1_2_5_3", attrName="ich_9_1_2_5_3", label="压疮评估", comment="压疮评估（Braden评分值）分值是否确定"),
		@Column(name="ich_9_1_2_5", attrName="ich_9_1_2_5", label="压疮评估", comment="压疮评估（Braden评分值）分值"),
		@Column(name="ich_9_1_2_5_1", attrName="ich_9_1_2_5_1", label="压疮评估结果选择"),
		@Column(name="ich_9_1_2_5_2", attrName="ich_9_1_2_5_2", label="预防压疮告知"),
		@Column(name="ich_9_1_3_1_1", attrName="ich_9_1_3_1_1", label="是否实施卒中健康教育，且有记录"),
		@Column(name="ich_9_1_3_1", attrName="ich_9_1_3_1", label="实施卒中健康教育有记录"),
		@Column(name="ich_9_1_3_2", attrName="ich_9_1_3_2", label="吸烟史"),
		@Column(name="ich_9_1_3_3", attrName="ich_9_1_3_3", label="吸烟程度评估"),
		@Column(name="ich_9_1_3_5", attrName="ich_9_1_3_5", label="接受戒烟的建议或者戒烟治疗"),
		@Column(name="ich_9_2_1", attrName="ich_9_2_1", label="出院时是否风险评分"),
		@Column(name="ich_9_2_1_1", attrName="ich_9_2_1_1", label="出院时风险评分选择"),
		@Column(name="ich_9_2_1_2", attrName="ich_9_2_1_2", label="Essen卒中风险评分值"),
		@Column(name="ich_9_2_1_3", attrName="ich_9_2_1_3", label="实施ICH评分评估分值"),
		@Column(name="ich_9_2_1_4", attrName="ich_9_2_1_4", label="实施格拉斯哥昏迷评估分值"),
		@Column(name="ich_9_2_2_1", attrName="ich_9_2_2_1", label="交与患者“出院小结”的副本，并告知患者出院时风险因素"),
		@Column(name="ich_9_2_2_2", attrName="ich_9_2_2_2", label="出院带药"),
		@Column(name="ich_9_2_2_3", attrName="ich_9_2_2_3", label="告知发生紧急情况时求援救治途径"),
		@Column(name="ich_9_2_2_4", attrName="ich_9_2_2_4", label="出院时教育与随访"),
		@Column(name="ich_9_2_2_5", attrName="ich_9_2_2_5", label="告知何为风险因素与紧急情况"),
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
		@Column(name="cm_0_1_4_1_1", attrName="cm01411", label="其他ICD-9-CM-3四位亚目编码与名称"),
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
		@Column(name="cm_0_1_4_2_1", attrName="cm01421", label="其他ICD-9-CM-3六位临床扩展编码与名称"),
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
public class QualityIch extends DataEntity<QualityIch> {
	
	private static final long serialVersionUID = 1L;
	private String cm_0_1_1_1;		// 质控医师
	private String cm_0_1_1_2;		// 质控护士
	private String cm_0_1_1_3;		// 主治医师
	private String cm_0_1_1_4;		// 责任护士
	private String cm_0_1_1_5;		// 上报科室
	private String caseId;		// 患者病案号
	private String cm_0_1_3_1;		// 主要诊断ICD-10四位亚目编码与名称
	private String ich_0_1_12_1;		// 其他主要诊断ICD-10四位亚目编码与名称
	private String cm_0_1_3_2;		// 主要诊断ICD-10六位临床扩展编码与名称
	private String ich_0_1_8_1;		// 其他主要诊断ICD-10六位临床扩展编码与名称
	private String cm_0_1_4_1;		// 主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称
	private String ich_0_1_11_1;		// 其他主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称
	private String cm_0_1_4_2;		// 主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称
	private String ich_0_1_7_1;		// 其他主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称
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
	private Double age;		// 年龄
	private Date cm_0_2_4_2;		// 出院日期时间
	private Date cm_0_2_5_1;		// 入住CCU日期时间
	private Date cm_0_2_5_2;		// 离开CCU日期时间
	private Date cm_0_2_6_1;		// 手术开始（切皮）日期时间
	private Date cm_0_2_6_2;		// 手术结束（缝皮结束）日期时间
	private String cm_0_3_1;		// 费用支付方式
	private String cm_0_3_2;		// 收入住院途径
	private String cm_0_3_3;		// 到院交通工具
	private String ich_1_1_1;		// 本院急诊医师接诊日期时间
	private Double ich_1_1_2_1;		// 身高(单位:厘米(cm))
	private Double ich_1_1_2_2;		// 体重(单位:公斤(kg))
	private Double ich_1_1_2_3;		// 呼吸(单位:次/分)
	private Double ich_1_1_2_4;		// 脉搏(单位:次/分)
	private Double ich_1_1_2_5;		// 收缩压(单位:mmHg)
	private Double ich_1_1_2_6;		// 舒张压(单位:mmHg)
	private String ich_1_2_1;		// 是否实施格拉斯哥昏迷评估
	private String ich_1_2_2;		// 评估日期时间
	private Double ich_1_2_3;		// 实施格拉斯哥昏迷评估分值
	private String ich_1_2_4;		// 是否实施神经功能缺损NIHSS评估
	private String ich_1_2_5;		// 评估日期时间
	private Double ich_1_2_6;		// 实施神经功能缺损NIHSS评估分值
	private String ich_1_3_1;		// 急诊是否实施首次头部影像学检查
	private String ich_1_3_2;		// 急诊首次头部影像学检查项目
	private String ich_1_3_3;		// 影像学检查确定血肿部位
	private String ich_1_3_3_1;		// 基底节区出血
	private String ich_1_3_3_3;		// 脑叶出血
	private String ich_1_3_3_4;		// 脑干出血
	private Double ich_1_3_4;		// 血肿量(ml)
	private String ich_1_3_5;		// 是否血肿破入脑室
	private String ich_1_3_6;		// 是否血肿源自幕下
	private String ich_1_3_7;		// 报告日期时间
	private String ich_1_4_1;		// 是否急诊入住”卒中中心”
	private String ich_1_4_2;		// 入住”卒中中心”日期时间
	private String ich_2_1_1;		// 是否为高血压(收缩压大于180mmHg)患者
	private String ich_2_1_2;		// 是否24小时内有血压监测与用药长期医嘱
	private String ich_2_1_3;		// 选择降压药物
	private String ich_2_1_3_1;		// 其他降压药物
	private String ich_2_1_4;		// 是否为高血压(收缩压大于200mmHg)患者
	private String ich_2_1_5;		// 是否有使用静脉降压药医嘱
	private String ich_3_1_1;		// 入院后病情判定
	private String ich_3_2_1;		// 是否需要做预防DVT治疗
	private String ich_3_2_2;		// 禁忌证选择
	private String ich_3_2_3;		// 预防DVT治疗医嘱执行日期与时间
	private String ich_3_3_1;		// 药物预防选择
	private String ich_3_3_1_1;		// 其它预防药物
	private String ich_3_3_2;		// 物理预防选择
	private String ich_3_3_2_1;		// 其他物理预防
	private String ich_3_3_3;		// 基本预防
	private String ich_3_3_3_1;		// 其他基本预防措施
	private String ich_4_1_1;		// 入院时是否可以正常进食与饮水
	private String ich_4_2_1;		// 入院24小时内是否进行吞咽评估
	private String ich_4_3_2;		// 未进行吞咽困难评价原因
	private String ich_4_3_2_1;		// 其他未进行吞咽困难评价原因
	private String ich_4_2_2;		// 评估日期时间
	private String ich_4_3_1;		// 评价方法选择
	private String ich_4_3_1_1;		// 其他评价方法
	private String ich_5_1_1;		// 住院48小时内是否接受影像学检测复查
	private String ich_5_1_2;		// 接受影像学检测复查项目选择
	private String ich_5_1_2_1;		// 其他接受影像学检测复查项目名称
	private String ich_5_1_3;		// 复查检测日期时间
	private String ich_5_1_4;		// 是否血肿扩大
	private String ich_5_1_5;		// 是否血管畸形
	private String ich_5_1_6;		// 是否动脉瘤
	private String ich_5_1_7;		// 是否淀粉样病变
	private String ich_5_1_8;		// 是否再出血风险
	private String ich_6_1_1;		// 是否首次ICH评分
	private String ich_6_1_2;		// 评估日期时间
	private String ich_6_1_3_1;		// GCS评分
	private String ich_6_1_3_2;		// 血肿量
	private String ich_6_1_3_3;		// 是否血肿破入脑室
	private String ich_6_1_3_4;		// 是否血肿源自幕下
	private String ich_6_1_3_5;		// 年龄
	private Double ich_6_1_4;		// 首次ICH评估分值
	private String ich_6_2_6;		// 是否有手术适应证
	private String ich_6_1_5;		// 手术适应证选择
	private String ich_6_1_5_1;		// 其他手术适应证
	private String ich_6_2_3;		// 神经外科干预措施
	private String ich_6_2_3_1;		// 其他神经外科干预措施
	private String ich_6_2_4;		// ICH术后特指并发症
	private String ich_6_2_4_1;		// 对腰椎穿刺的其他反应
	private String ich_6_2_4_2;		// 神经系统的其他操作后疾患
	private String ich_6_2_5;		// 是否手术后再手术
	private String ich_7_1_1;		// 是否高血压(收缩压大于180mmHg)患者
	private String ich_7_1_2;		// 出院医嘱中有血压监测与用药长期医嘱
	private String ich_7_1_3;		// 选择降压药物
	private String ich_7_1_3_1;		// 其他降压药物
	private String ich_8_1_1;		// 原发性
	private String ich_8_1_2;		// 继发性
	private String ich_9_1_1;		// 是否有重点护理评估
	private String ich_9_1_2_1;		// 行走评估结果
	private String ich_9_1_2_2;		// 呼吸评估结果
	private String ich_9_1_2_3;		// 饮食评估结果
	private String ich_9_1_2_4;		// 吞咽评估结果
	private String ich_9_1_2_5_3;		// 压疮评估（Braden评分值）分值是否确定
	private Double ich_9_1_2_5;		// 压疮评估（Braden评分值）分值
	private String ich_9_1_2_5_1;		// 压疮评估结果选择
	private String ich_9_1_2_5_2;		// 预防压疮告知
	private String ich_9_1_3_1_1;		// 是否实施卒中健康教育，且有记录
	private String ich_9_1_3_1;		// 实施卒中健康教育有记录
	private String ich_9_1_3_2;		// 吸烟史
	private String ich_9_1_3_3;		// 吸烟程度评估
	private String ich_9_1_3_5;		// 接受戒烟的建议或者戒烟治疗
	private String ich_9_2_1;		// 出院时是否风险评分
	private String ich_9_2_1_1;		// 出院时风险评分选择
	private Double ich_9_2_1_2;		// Essen卒中风险评分值
	private Double ich_9_2_1_3;		// 实施ICH评分评估分值
	private Double ich_9_2_1_4;		// 实施格拉斯哥昏迷评估分值
	private String ich_9_2_2_1;		// 交与患者“出院小结”的副本，并告知患者出院时风险因素
	private String ich_9_2_2_2;		// 出院带药
	private String ich_9_2_2_3;		// 告知发生紧急情况时求援救治途径
	private String ich_9_2_2_4;		// 出院时教育与随访
	private String ich_9_2_2_5;		// 告知何为风险因素与紧急情况
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
	private String cm01411;		// 其他ICD-9-CM-3四位亚目编码与名称
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
	private String cm01421;		// 其他ICD-9-CM-3六位临床扩展编码与名称
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
	
	public QualityIch() {
		this(null);
	}

	public QualityIch(String id){
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
	
	@Length(min=0, max=64, message="其他主要诊断ICD-10四位亚目编码与名称长度不能超过 64 个字符")
	public String getIch_0_1_12_1() {
		return ich_0_1_12_1;
	}

	public void setIch_0_1_12_1(String ich_0_1_12_1) {
		this.ich_0_1_12_1 = ich_0_1_12_1;
	}
	
	@Length(min=0, max=32, message="主要诊断ICD-10六位临床扩展编码与名称长度不能超过 32 个字符")
	public String getCm_0_1_3_2() {
		return cm_0_1_3_2;
	}

	public void setCm_0_1_3_2(String cm_0_1_3_2) {
		this.cm_0_1_3_2 = cm_0_1_3_2;
	}
	
	@Length(min=0, max=64, message="其他主要诊断ICD-10六位临床扩展编码与名称长度不能超过 64 个字符")
	public String getIch_0_1_8_1() {
		return ich_0_1_8_1;
	}

	public void setIch_0_1_8_1(String ich_0_1_8_1) {
		this.ich_0_1_8_1 = ich_0_1_8_1;
	}
	
	@Length(min=0, max=32, message="主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称长度不能超过 32 个字符")
	public String getCm_0_1_4_1() {
		return cm_0_1_4_1;
	}

	public void setCm_0_1_4_1(String cm_0_1_4_1) {
		this.cm_0_1_4_1 = cm_0_1_4_1;
	}
	
	@Length(min=0, max=64, message="其他主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称长度不能超过 64 个字符")
	public String getIch_0_1_11_1() {
		return ich_0_1_11_1;
	}

	public void setIch_0_1_11_1(String ich_0_1_11_1) {
		this.ich_0_1_11_1 = ich_0_1_11_1;
	}
	
	@Length(min=0, max=32, message="主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称长度不能超过 32 个字符")
	public String getCm_0_1_4_2() {
		return cm_0_1_4_2;
	}

	public void setCm_0_1_4_2(String cm_0_1_4_2) {
		this.cm_0_1_4_2 = cm_0_1_4_2;
	}
	
	@Length(min=0, max=64, message="其他主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称长度不能超过 64 个字符")
	public String getIch_0_1_7_1() {
		return ich_0_1_7_1;
	}

	public void setIch_0_1_7_1(String ich_0_1_7_1) {
		this.ich_0_1_7_1 = ich_0_1_7_1;
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
	
	public Double getAge() {
		return age;
	}

	public void setAge(Double age) {
		this.age = age;
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
	
	@Length(min=0, max=64, message="本院急诊医师接诊日期时间长度不能超过 64 个字符")
	public String getIch_1_1_1() {
		return ich_1_1_1;
	}

	public void setIch_1_1_1(String ich_1_1_1) {
		this.ich_1_1_1 = ich_1_1_1;
	}
	
	public Double getIch_1_1_2_1() {
		return ich_1_1_2_1;
	}

	public void setIch_1_1_2_1(Double ich_1_1_2_1) {
		this.ich_1_1_2_1 = ich_1_1_2_1;
	}
	
	public Double getIch_1_1_2_2() {
		return ich_1_1_2_2;
	}

	public void setIch_1_1_2_2(Double ich_1_1_2_2) {
		this.ich_1_1_2_2 = ich_1_1_2_2;
	}
	
	public Double getIch_1_1_2_3() {
		return ich_1_1_2_3;
	}

	public void setIch_1_1_2_3(Double ich_1_1_2_3) {
		this.ich_1_1_2_3 = ich_1_1_2_3;
	}
	
	public Double getIch_1_1_2_4() {
		return ich_1_1_2_4;
	}

	public void setIch_1_1_2_4(Double ich_1_1_2_4) {
		this.ich_1_1_2_4 = ich_1_1_2_4;
	}
	
	public Double getIch_1_1_2_5() {
		return ich_1_1_2_5;
	}

	public void setIch_1_1_2_5(Double ich_1_1_2_5) {
		this.ich_1_1_2_5 = ich_1_1_2_5;
	}
	
	public Double getIch_1_1_2_6() {
		return ich_1_1_2_6;
	}

	public void setIch_1_1_2_6(Double ich_1_1_2_6) {
		this.ich_1_1_2_6 = ich_1_1_2_6;
	}
	
	@Length(min=0, max=64, message="是否实施格拉斯哥昏迷评估长度不能超过 64 个字符")
	public String getIch_1_2_1() {
		return ich_1_2_1;
	}

	public void setIch_1_2_1(String ich_1_2_1) {
		this.ich_1_2_1 = ich_1_2_1;
	}
	
	@Length(min=0, max=64, message="评估日期时间长度不能超过 64 个字符")
	public String getIch_1_2_2() {
		return ich_1_2_2;
	}

	public void setIch_1_2_2(String ich_1_2_2) {
		this.ich_1_2_2 = ich_1_2_2;
	}
	
	public Double getIch_1_2_3() {
		return ich_1_2_3;
	}

	public void setIch_1_2_3(Double ich_1_2_3) {
		this.ich_1_2_3 = ich_1_2_3;
	}
	
	@Length(min=0, max=64, message="是否实施神经功能缺损NIHSS评估长度不能超过 64 个字符")
	public String getIch_1_2_4() {
		return ich_1_2_4;
	}

	public void setIch_1_2_4(String ich_1_2_4) {
		this.ich_1_2_4 = ich_1_2_4;
	}
	
	@Length(min=0, max=64, message="评估日期时间长度不能超过 64 个字符")
	public String getIch_1_2_5() {
		return ich_1_2_5;
	}

	public void setIch_1_2_5(String ich_1_2_5) {
		this.ich_1_2_5 = ich_1_2_5;
	}
	
	public Double getIch_1_2_6() {
		return ich_1_2_6;
	}

	public void setIch_1_2_6(Double ich_1_2_6) {
		this.ich_1_2_6 = ich_1_2_6;
	}
	
	@Length(min=0, max=64, message="急诊是否实施首次头部影像学检查长度不能超过 64 个字符")
	public String getIch_1_3_1() {
		return ich_1_3_1;
	}

	public void setIch_1_3_1(String ich_1_3_1) {
		this.ich_1_3_1 = ich_1_3_1;
	}
	
	@Length(min=0, max=64, message="急诊首次头部影像学检查项目长度不能超过 64 个字符")
	public String getIch_1_3_2() {
		return ich_1_3_2;
	}

	public void setIch_1_3_2(String ich_1_3_2) {
		this.ich_1_3_2 = ich_1_3_2;
	}
	
	@Length(min=0, max=64, message="影像学检查确定血肿部位长度不能超过 64 个字符")
	public String getIch_1_3_3() {
		return ich_1_3_3;
	}

	public void setIch_1_3_3(String ich_1_3_3) {
		this.ich_1_3_3 = ich_1_3_3;
	}
	
	@Length(min=0, max=64, message="基底节区出血长度不能超过 64 个字符")
	public String getIch_1_3_3_1() {
		return ich_1_3_3_1;
	}

	public void setIch_1_3_3_1(String ich_1_3_3_1) {
		this.ich_1_3_3_1 = ich_1_3_3_1;
	}
	
	@Length(min=0, max=64, message="脑叶出血长度不能超过 64 个字符")
	public String getIch_1_3_3_3() {
		return ich_1_3_3_3;
	}

	public void setIch_1_3_3_3(String ich_1_3_3_3) {
		this.ich_1_3_3_3 = ich_1_3_3_3;
	}
	
	@Length(min=0, max=64, message="脑干出血长度不能超过 64 个字符")
	public String getIch_1_3_3_4() {
		return ich_1_3_3_4;
	}

	public void setIch_1_3_3_4(String ich_1_3_3_4) {
		this.ich_1_3_3_4 = ich_1_3_3_4;
	}
	
	public Double getIch_1_3_4() {
		return ich_1_3_4;
	}

	public void setIch_1_3_4(Double ich_1_3_4) {
		this.ich_1_3_4 = ich_1_3_4;
	}
	
	@Length(min=0, max=64, message="是否血肿破入脑室长度不能超过 64 个字符")
	public String getIch_1_3_5() {
		return ich_1_3_5;
	}

	public void setIch_1_3_5(String ich_1_3_5) {
		this.ich_1_3_5 = ich_1_3_5;
	}
	
	@Length(min=0, max=64, message="是否血肿源自幕下长度不能超过 64 个字符")
	public String getIch_1_3_6() {
		return ich_1_3_6;
	}

	public void setIch_1_3_6(String ich_1_3_6) {
		this.ich_1_3_6 = ich_1_3_6;
	}
	
	@Length(min=0, max=64, message="报告日期时间长度不能超过 64 个字符")
	public String getIch_1_3_7() {
		return ich_1_3_7;
	}

	public void setIch_1_3_7(String ich_1_3_7) {
		this.ich_1_3_7 = ich_1_3_7;
	}
	
	@Length(min=0, max=64, message="是否急诊入住”卒中中心”长度不能超过 64 个字符")
	public String getIch_1_4_1() {
		return ich_1_4_1;
	}

	public void setIch_1_4_1(String ich_1_4_1) {
		this.ich_1_4_1 = ich_1_4_1;
	}
	
	@Length(min=0, max=64, message="入住”卒中中心”日期时间长度不能超过 64 个字符")
	public String getIch_1_4_2() {
		return ich_1_4_2;
	}

	public void setIch_1_4_2(String ich_1_4_2) {
		this.ich_1_4_2 = ich_1_4_2;
	}
	
	@Length(min=0, max=64, message="是否为高血压长度不能超过 64 个字符")
	public String getIch_2_1_1() {
		return ich_2_1_1;
	}

	public void setIch_2_1_1(String ich_2_1_1) {
		this.ich_2_1_1 = ich_2_1_1;
	}
	
	@Length(min=0, max=64, message="是否24小时内有血压监测与用药长期医嘱长度不能超过 64 个字符")
	public String getIch_2_1_2() {
		return ich_2_1_2;
	}

	public void setIch_2_1_2(String ich_2_1_2) {
		this.ich_2_1_2 = ich_2_1_2;
	}
	
	@Length(min=0, max=64, message="选择降压药物长度不能超过 64 个字符")
	public String getIch_2_1_3() {
		return ich_2_1_3;
	}

	public void setIch_2_1_3(String ich_2_1_3) {
		this.ich_2_1_3 = ich_2_1_3;
	}
	
	@Length(min=0, max=64, message="其他降压药物长度不能超过 64 个字符")
	public String getIch_2_1_3_1() {
		return ich_2_1_3_1;
	}

	public void setIch_2_1_3_1(String ich_2_1_3_1) {
		this.ich_2_1_3_1 = ich_2_1_3_1;
	}
	
	@Length(min=0, max=64, message="是否为高血压长度不能超过 64 个字符")
	public String getIch_2_1_4() {
		return ich_2_1_4;
	}

	public void setIch_2_1_4(String ich_2_1_4) {
		this.ich_2_1_4 = ich_2_1_4;
	}
	
	@Length(min=0, max=64, message="是否有使用静脉降压药医嘱长度不能超过 64 个字符")
	public String getIch_2_1_5() {
		return ich_2_1_5;
	}

	public void setIch_2_1_5(String ich_2_1_5) {
		this.ich_2_1_5 = ich_2_1_5;
	}
	
	@Length(min=0, max=64, message="入院后病情判定长度不能超过 64 个字符")
	public String getIch_3_1_1() {
		return ich_3_1_1;
	}

	public void setIch_3_1_1(String ich_3_1_1) {
		this.ich_3_1_1 = ich_3_1_1;
	}
	
	@Length(min=0, max=64, message="是否需要做预防DVT治疗长度不能超过 64 个字符")
	public String getIch_3_2_1() {
		return ich_3_2_1;
	}

	public void setIch_3_2_1(String ich_3_2_1) {
		this.ich_3_2_1 = ich_3_2_1;
	}
	
	@Length(min=0, max=64, message="禁忌证选择长度不能超过 64 个字符")
	public String getIch_3_2_2() {
		return ich_3_2_2;
	}

	public void setIch_3_2_2(String ich_3_2_2) {
		this.ich_3_2_2 = ich_3_2_2;
	}
	
	@Length(min=0, max=64, message="预防DVT治疗医嘱执行日期与时间长度不能超过 64 个字符")
	public String getIch_3_2_3() {
		return ich_3_2_3;
	}

	public void setIch_3_2_3(String ich_3_2_3) {
		this.ich_3_2_3 = ich_3_2_3;
	}
	
	@Length(min=0, max=64, message="药物预防选择长度不能超过 64 个字符")
	public String getIch_3_3_1() {
		return ich_3_3_1;
	}

	public void setIch_3_3_1(String ich_3_3_1) {
		this.ich_3_3_1 = ich_3_3_1;
	}
	
	@Length(min=0, max=64, message="其它预防药物长度不能超过 64 个字符")
	public String getIch_3_3_1_1() {
		return ich_3_3_1_1;
	}

	public void setIch_3_3_1_1(String ich_3_3_1_1) {
		this.ich_3_3_1_1 = ich_3_3_1_1;
	}
	
	@Length(min=0, max=64, message="物理预防选择长度不能超过 64 个字符")
	public String getIch_3_3_2() {
		return ich_3_3_2;
	}

	public void setIch_3_3_2(String ich_3_3_2) {
		this.ich_3_3_2 = ich_3_3_2;
	}
	
	@Length(min=0, max=64, message="其他物理预防长度不能超过 64 个字符")
	public String getIch_3_3_2_1() {
		return ich_3_3_2_1;
	}

	public void setIch_3_3_2_1(String ich_3_3_2_1) {
		this.ich_3_3_2_1 = ich_3_3_2_1;
	}
	
	@Length(min=0, max=64, message="基本预防长度不能超过 64 个字符")
	public String getIch_3_3_3() {
		return ich_3_3_3;
	}

	public void setIch_3_3_3(String ich_3_3_3) {
		this.ich_3_3_3 = ich_3_3_3;
	}
	
	@Length(min=0, max=64, message="其他基本预防措施长度不能超过 64 个字符")
	public String getIch_3_3_3_1() {
		return ich_3_3_3_1;
	}

	public void setIch_3_3_3_1(String ich_3_3_3_1) {
		this.ich_3_3_3_1 = ich_3_3_3_1;
	}
	
	@Length(min=0, max=64, message="入院时是否可以正常进食与饮水长度不能超过 64 个字符")
	public String getIch_4_1_1() {
		return ich_4_1_1;
	}

	public void setIch_4_1_1(String ich_4_1_1) {
		this.ich_4_1_1 = ich_4_1_1;
	}
	
	@Length(min=0, max=64, message="入院24小时内是否进行吞咽评估长度不能超过 64 个字符")
	public String getIch_4_2_1() {
		return ich_4_2_1;
	}

	public void setIch_4_2_1(String ich_4_2_1) {
		this.ich_4_2_1 = ich_4_2_1;
	}
	
	@Length(min=0, max=64, message="未进行吞咽困难评价原因长度不能超过 64 个字符")
	public String getIch_4_3_2() {
		return ich_4_3_2;
	}

	public void setIch_4_3_2(String ich_4_3_2) {
		this.ich_4_3_2 = ich_4_3_2;
	}
	
	@Length(min=0, max=64, message="其他未进行吞咽困难评价原因长度不能超过 64 个字符")
	public String getIch_4_3_2_1() {
		return ich_4_3_2_1;
	}

	public void setIch_4_3_2_1(String ich_4_3_2_1) {
		this.ich_4_3_2_1 = ich_4_3_2_1;
	}
	
	@Length(min=0, max=64, message="评估日期时间长度不能超过 64 个字符")
	public String getIch_4_2_2() {
		return ich_4_2_2;
	}

	public void setIch_4_2_2(String ich_4_2_2) {
		this.ich_4_2_2 = ich_4_2_2;
	}
	
	@Length(min=0, max=64, message="评价方法选择长度不能超过 64 个字符")
	public String getIch_4_3_1() {
		return ich_4_3_1;
	}

	public void setIch_4_3_1(String ich_4_3_1) {
		this.ich_4_3_1 = ich_4_3_1;
	}
	
	@Length(min=0, max=64, message="其他评价方法长度不能超过 64 个字符")
	public String getIch_4_3_1_1() {
		return ich_4_3_1_1;
	}

	public void setIch_4_3_1_1(String ich_4_3_1_1) {
		this.ich_4_3_1_1 = ich_4_3_1_1;
	}
	
	@Length(min=0, max=64, message="住院48小时内是否接受影像学检测复查长度不能超过 64 个字符")
	public String getIch_5_1_1() {
		return ich_5_1_1;
	}

	public void setIch_5_1_1(String ich_5_1_1) {
		this.ich_5_1_1 = ich_5_1_1;
	}
	
	@Length(min=0, max=64, message="接受影像学检测复查项目选择长度不能超过 64 个字符")
	public String getIch_5_1_2() {
		return ich_5_1_2;
	}

	public void setIch_5_1_2(String ich_5_1_2) {
		this.ich_5_1_2 = ich_5_1_2;
	}
	
	@Length(min=0, max=64, message="其他接受影像学检测复查项目名称长度不能超过 64 个字符")
	public String getIch_5_1_2_1() {
		return ich_5_1_2_1;
	}

	public void setIch_5_1_2_1(String ich_5_1_2_1) {
		this.ich_5_1_2_1 = ich_5_1_2_1;
	}
	
	@Length(min=0, max=64, message="复查检测日期时间长度不能超过 64 个字符")
	public String getIch_5_1_3() {
		return ich_5_1_3;
	}

	public void setIch_5_1_3(String ich_5_1_3) {
		this.ich_5_1_3 = ich_5_1_3;
	}
	
	@Length(min=0, max=64, message="是否血肿扩大长度不能超过 64 个字符")
	public String getIch_5_1_4() {
		return ich_5_1_4;
	}

	public void setIch_5_1_4(String ich_5_1_4) {
		this.ich_5_1_4 = ich_5_1_4;
	}
	
	@Length(min=0, max=64, message="是否血管畸形长度不能超过 64 个字符")
	public String getIch_5_1_5() {
		return ich_5_1_5;
	}

	public void setIch_5_1_5(String ich_5_1_5) {
		this.ich_5_1_5 = ich_5_1_5;
	}
	
	@Length(min=0, max=64, message="是否动脉瘤长度不能超过 64 个字符")
	public String getIch_5_1_6() {
		return ich_5_1_6;
	}

	public void setIch_5_1_6(String ich_5_1_6) {
		this.ich_5_1_6 = ich_5_1_6;
	}
	
	@Length(min=0, max=64, message="是否淀粉样病变长度不能超过 64 个字符")
	public String getIch_5_1_7() {
		return ich_5_1_7;
	}

	public void setIch_5_1_7(String ich_5_1_7) {
		this.ich_5_1_7 = ich_5_1_7;
	}
	
	@Length(min=0, max=64, message="是否再出血风险长度不能超过 64 个字符")
	public String getIch_5_1_8() {
		return ich_5_1_8;
	}

	public void setIch_5_1_8(String ich_5_1_8) {
		this.ich_5_1_8 = ich_5_1_8;
	}
	
	@Length(min=0, max=64, message="是否首次ICH评分长度不能超过 64 个字符")
	public String getIch_6_1_1() {
		return ich_6_1_1;
	}

	public void setIch_6_1_1(String ich_6_1_1) {
		this.ich_6_1_1 = ich_6_1_1;
	}
	
	@Length(min=0, max=64, message="评估日期时间长度不能超过 64 个字符")
	public String getIch_6_1_2() {
		return ich_6_1_2;
	}

	public void setIch_6_1_2(String ich_6_1_2) {
		this.ich_6_1_2 = ich_6_1_2;
	}
	
	@Length(min=0, max=64, message="GCS评分长度不能超过 64 个字符")
	public String getIch_6_1_3_1() {
		return ich_6_1_3_1;
	}

	public void setIch_6_1_3_1(String ich_6_1_3_1) {
		this.ich_6_1_3_1 = ich_6_1_3_1;
	}
	
	@Length(min=0, max=64, message="血肿量长度不能超过 64 个字符")
	public String getIch_6_1_3_2() {
		return ich_6_1_3_2;
	}

	public void setIch_6_1_3_2(String ich_6_1_3_2) {
		this.ich_6_1_3_2 = ich_6_1_3_2;
	}
	
	@Length(min=0, max=64, message="是否血肿破入脑室长度不能超过 64 个字符")
	public String getIch_6_1_3_3() {
		return ich_6_1_3_3;
	}

	public void setIch_6_1_3_3(String ich_6_1_3_3) {
		this.ich_6_1_3_3 = ich_6_1_3_3;
	}
	
	@Length(min=0, max=64, message="是否血肿源自幕下长度不能超过 64 个字符")
	public String getIch_6_1_3_4() {
		return ich_6_1_3_4;
	}

	public void setIch_6_1_3_4(String ich_6_1_3_4) {
		this.ich_6_1_3_4 = ich_6_1_3_4;
	}
	
	@Length(min=0, max=64, message="年龄长度不能超过 64 个字符")
	public String getIch_6_1_3_5() {
		return ich_6_1_3_5;
	}

	public void setIch_6_1_3_5(String ich_6_1_3_5) {
		this.ich_6_1_3_5 = ich_6_1_3_5;
	}
	
	public Double getIch_6_1_4() {
		return ich_6_1_4;
	}

	public void setIch_6_1_4(Double ich_6_1_4) {
		this.ich_6_1_4 = ich_6_1_4;
	}
	
	@Length(min=0, max=64, message="是否有手术适应证长度不能超过 64 个字符")
	public String getIch_6_2_6() {
		return ich_6_2_6;
	}

	public void setIch_6_2_6(String ich_6_2_6) {
		this.ich_6_2_6 = ich_6_2_6;
	}
	
	@Length(min=0, max=64, message="手术适应证选择长度不能超过 64 个字符")
	public String getIch_6_1_5() {
		return ich_6_1_5;
	}

	public void setIch_6_1_5(String ich_6_1_5) {
		this.ich_6_1_5 = ich_6_1_5;
	}
	
	@Length(min=0, max=64, message="其他手术适应证长度不能超过 64 个字符")
	public String getIch_6_1_5_1() {
		return ich_6_1_5_1;
	}

	public void setIch_6_1_5_1(String ich_6_1_5_1) {
		this.ich_6_1_5_1 = ich_6_1_5_1;
	}
	
	@Length(min=0, max=64, message="神经外科干预措施长度不能超过 64 个字符")
	public String getIch_6_2_3() {
		return ich_6_2_3;
	}

	public void setIch_6_2_3(String ich_6_2_3) {
		this.ich_6_2_3 = ich_6_2_3;
	}
	
	@Length(min=0, max=64, message="其他神经外科干预措施长度不能超过 64 个字符")
	public String getIch_6_2_3_1() {
		return ich_6_2_3_1;
	}

	public void setIch_6_2_3_1(String ich_6_2_3_1) {
		this.ich_6_2_3_1 = ich_6_2_3_1;
	}
	
	@Length(min=0, max=64, message="ICH术后特指并发症长度不能超过 64 个字符")
	public String getIch_6_2_4() {
		return ich_6_2_4;
	}

	public void setIch_6_2_4(String ich_6_2_4) {
		this.ich_6_2_4 = ich_6_2_4;
	}
	
	@Length(min=0, max=64, message="对腰椎穿刺的其他反应长度不能超过 64 个字符")
	public String getIch_6_2_4_1() {
		return ich_6_2_4_1;
	}

	public void setIch_6_2_4_1(String ich_6_2_4_1) {
		this.ich_6_2_4_1 = ich_6_2_4_1;
	}
	
	@Length(min=0, max=64, message="神经系统的其他操作后疾患长度不能超过 64 个字符")
	public String getIch_6_2_4_2() {
		return ich_6_2_4_2;
	}

	public void setIch_6_2_4_2(String ich_6_2_4_2) {
		this.ich_6_2_4_2 = ich_6_2_4_2;
	}
	
	@Length(min=0, max=64, message="是否手术后再手术长度不能超过 64 个字符")
	public String getIch_6_2_5() {
		return ich_6_2_5;
	}

	public void setIch_6_2_5(String ich_6_2_5) {
		this.ich_6_2_5 = ich_6_2_5;
	}
	
	@Length(min=0, max=64, message="是否高血压长度不能超过 64 个字符")
	public String getIch_7_1_1() {
		return ich_7_1_1;
	}

	public void setIch_7_1_1(String ich_7_1_1) {
		this.ich_7_1_1 = ich_7_1_1;
	}
	
	@Length(min=0, max=64, message="出院医嘱中有血压监测与用药长期医嘱长度不能超过 64 个字符")
	public String getIch_7_1_2() {
		return ich_7_1_2;
	}

	public void setIch_7_1_2(String ich_7_1_2) {
		this.ich_7_1_2 = ich_7_1_2;
	}
	
	@Length(min=0, max=64, message="选择降压药物长度不能超过 64 个字符")
	public String getIch_7_1_3() {
		return ich_7_1_3;
	}

	public void setIch_7_1_3(String ich_7_1_3) {
		this.ich_7_1_3 = ich_7_1_3;
	}
	
	@Length(min=0, max=64, message="其他降压药物长度不能超过 64 个字符")
	public String getIch_7_1_3_1() {
		return ich_7_1_3_1;
	}

	public void setIch_7_1_3_1(String ich_7_1_3_1) {
		this.ich_7_1_3_1 = ich_7_1_3_1;
	}
	
	@Length(min=0, max=64, message="原发性长度不能超过 64 个字符")
	public String getIch_8_1_1() {
		return ich_8_1_1;
	}

	public void setIch_8_1_1(String ich_8_1_1) {
		this.ich_8_1_1 = ich_8_1_1;
	}
	
	@Length(min=0, max=64, message="继发性长度不能超过 64 个字符")
	public String getIch_8_1_2() {
		return ich_8_1_2;
	}

	public void setIch_8_1_2(String ich_8_1_2) {
		this.ich_8_1_2 = ich_8_1_2;
	}
	
	@Length(min=0, max=64, message="是否有重点护理评估长度不能超过 64 个字符")
	public String getIch_9_1_1() {
		return ich_9_1_1;
	}

	public void setIch_9_1_1(String ich_9_1_1) {
		this.ich_9_1_1 = ich_9_1_1;
	}
	
	@Length(min=0, max=64, message="行走评估结果长度不能超过 64 个字符")
	public String getIch_9_1_2_1() {
		return ich_9_1_2_1;
	}

	public void setIch_9_1_2_1(String ich_9_1_2_1) {
		this.ich_9_1_2_1 = ich_9_1_2_1;
	}
	
	@Length(min=0, max=64, message="呼吸评估结果长度不能超过 64 个字符")
	public String getIch_9_1_2_2() {
		return ich_9_1_2_2;
	}

	public void setIch_9_1_2_2(String ich_9_1_2_2) {
		this.ich_9_1_2_2 = ich_9_1_2_2;
	}
	
	@Length(min=0, max=64, message="饮食评估结果长度不能超过 64 个字符")
	public String getIch_9_1_2_3() {
		return ich_9_1_2_3;
	}

	public void setIch_9_1_2_3(String ich_9_1_2_3) {
		this.ich_9_1_2_3 = ich_9_1_2_3;
	}
	
	@Length(min=0, max=64, message="吞咽评估结果长度不能超过 64 个字符")
	public String getIch_9_1_2_4() {
		return ich_9_1_2_4;
	}

	public void setIch_9_1_2_4(String ich_9_1_2_4) {
		this.ich_9_1_2_4 = ich_9_1_2_4;
	}
	
	@Length(min=0, max=64, message="压疮评估长度不能超过 64 个字符")
	public String getIch_9_1_2_5_3() {
		return ich_9_1_2_5_3;
	}

	public void setIch_9_1_2_5_3(String ich_9_1_2_5_3) {
		this.ich_9_1_2_5_3 = ich_9_1_2_5_3;
	}
	
	public Double getIch_9_1_2_5() {
		return ich_9_1_2_5;
	}

	public void setIch_9_1_2_5(Double ich_9_1_2_5) {
		this.ich_9_1_2_5 = ich_9_1_2_5;
	}
	
	@Length(min=0, max=64, message="压疮评估结果选择长度不能超过 64 个字符")
	public String getIch_9_1_2_5_1() {
		return ich_9_1_2_5_1;
	}

	public void setIch_9_1_2_5_1(String ich_9_1_2_5_1) {
		this.ich_9_1_2_5_1 = ich_9_1_2_5_1;
	}
	
	@Length(min=0, max=64, message="预防压疮告知长度不能超过 64 个字符")
	public String getIch_9_1_2_5_2() {
		return ich_9_1_2_5_2;
	}

	public void setIch_9_1_2_5_2(String ich_9_1_2_5_2) {
		this.ich_9_1_2_5_2 = ich_9_1_2_5_2;
	}
	
	@Length(min=0, max=64, message="是否实施卒中健康教育，且有记录长度不能超过 64 个字符")
	public String getIch_9_1_3_1_1() {
		return ich_9_1_3_1_1;
	}

	public void setIch_9_1_3_1_1(String ich_9_1_3_1_1) {
		this.ich_9_1_3_1_1 = ich_9_1_3_1_1;
	}
	
	@Length(min=0, max=64, message="实施卒中健康教育有记录长度不能超过 64 个字符")
	public String getIch_9_1_3_1() {
		return ich_9_1_3_1;
	}

	public void setIch_9_1_3_1(String ich_9_1_3_1) {
		this.ich_9_1_3_1 = ich_9_1_3_1;
	}
	
	@Length(min=0, max=64, message="吸烟史长度不能超过 64 个字符")
	public String getIch_9_1_3_2() {
		return ich_9_1_3_2;
	}

	public void setIch_9_1_3_2(String ich_9_1_3_2) {
		this.ich_9_1_3_2 = ich_9_1_3_2;
	}
	
	@Length(min=0, max=64, message="吸烟程度评估长度不能超过 64 个字符")
	public String getIch_9_1_3_3() {
		return ich_9_1_3_3;
	}

	public void setIch_9_1_3_3(String ich_9_1_3_3) {
		this.ich_9_1_3_3 = ich_9_1_3_3;
	}
	
	@Length(min=0, max=64, message="接受戒烟的建议或者戒烟治疗长度不能超过 64 个字符")
	public String getIch_9_1_3_5() {
		return ich_9_1_3_5;
	}

	public void setIch_9_1_3_5(String ich_9_1_3_5) {
		this.ich_9_1_3_5 = ich_9_1_3_5;
	}
	
	@Length(min=0, max=64, message="出院时是否风险评分长度不能超过 64 个字符")
	public String getIch_9_2_1() {
		return ich_9_2_1;
	}

	public void setIch_9_2_1(String ich_9_2_1) {
		this.ich_9_2_1 = ich_9_2_1;
	}
	
	@Length(min=0, max=64, message="出院时风险评分选择长度不能超过 64 个字符")
	public String getIch_9_2_1_1() {
		return ich_9_2_1_1;
	}

	public void setIch_9_2_1_1(String ich_9_2_1_1) {
		this.ich_9_2_1_1 = ich_9_2_1_1;
	}
	
	public Double getIch_9_2_1_2() {
		return ich_9_2_1_2;
	}

	public void setIch_9_2_1_2(Double ich_9_2_1_2) {
		this.ich_9_2_1_2 = ich_9_2_1_2;
	}
	
	public Double getIch_9_2_1_3() {
		return ich_9_2_1_3;
	}

	public void setIch_9_2_1_3(Double ich_9_2_1_3) {
		this.ich_9_2_1_3 = ich_9_2_1_3;
	}
	
	public Double getIch_9_2_1_4() {
		return ich_9_2_1_4;
	}

	public void setIch_9_2_1_4(Double ich_9_2_1_4) {
		this.ich_9_2_1_4 = ich_9_2_1_4;
	}
	
	@Length(min=0, max=64, message="交与患者“出院小结”的副本，并告知患者出院时风险因素长度不能超过 64 个字符")
	public String getIch_9_2_2_1() {
		return ich_9_2_2_1;
	}

	public void setIch_9_2_2_1(String ich_9_2_2_1) {
		this.ich_9_2_2_1 = ich_9_2_2_1;
	}
	
	@Length(min=0, max=64, message="出院带药长度不能超过 64 个字符")
	public String getIch_9_2_2_2() {
		return ich_9_2_2_2;
	}

	public void setIch_9_2_2_2(String ich_9_2_2_2) {
		this.ich_9_2_2_2 = ich_9_2_2_2;
	}
	
	@Length(min=0, max=64, message="告知发生紧急情况时求援救治途径长度不能超过 64 个字符")
	public String getIch_9_2_2_3() {
		return ich_9_2_2_3;
	}

	public void setIch_9_2_2_3(String ich_9_2_2_3) {
		this.ich_9_2_2_3 = ich_9_2_2_3;
	}
	
	@Length(min=0, max=64, message="出院时教育与随访长度不能超过 64 个字符")
	public String getIch_9_2_2_4() {
		return ich_9_2_2_4;
	}

	public void setIch_9_2_2_4(String ich_9_2_2_4) {
		this.ich_9_2_2_4 = ich_9_2_2_4;
	}
	
	@Length(min=0, max=64, message="告知何为风险因素与紧急情况长度不能超过 64 个字符")
	public String getIch_9_2_2_5() {
		return ich_9_2_2_5;
	}

	public void setIch_9_2_2_5(String ich_9_2_2_5) {
		this.ich_9_2_2_5 = ich_9_2_2_5;
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
	
	@Length(min=0, max=32, message="其他ICD-9-CM-3四位亚目编码与名称长度不能超过 32 个字符")
	public String getCm01411() {
		return cm01411;
	}

	public void setCm01411(String cm01411) {
		this.cm01411 = cm01411;
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
	
	@Length(min=0, max=32, message="其他ICD-9-CM-3六位临床扩展编码与名称长度不能超过 32 个字符")
	public String getCm01421() {
		return cm01421;
	}

	public void setCm01421(String cm01421) {
		this.cm01421 = cm01421;
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