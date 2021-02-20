/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.gli.entity;

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
 * GLI胶质瘤（初发，手术治疗）Entity
 * @author 卡卡西
 * @version 2021-02-20
 */
@Table(name="quality_gli", alias="a", columns={
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
		@Column(name="cm_0_1_4_3", attrName="cm_0_1_4_3", label="其它ICD-9-CM-3编码与名称"),
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
		@Column(name="cm_0_2_5_1", attrName="cm_0_2_5_1", label="入住ICU日期时间"),
		@Column(name="cm_0_2_5_2", attrName="cm_0_2_5_2", label="离开ICU日期时间"),
		@Column(name="cm_0_2_6_1", attrName="cm_0_2_6_1", label="手术开始", comment="手术开始（切皮）日期时间"),
		@Column(name="cm_0_2_6_2", attrName="cm_0_2_6_2", label="手术结束", comment="手术结束（缝皮结束）日期时间"),
		@Column(name="cm_0_3_1", attrName="cm_0_3_1", label="费用支付方式"),
		@Column(name="cm_0_3_2", attrName="cm_0_3_2", label="收入住院途径"),
		@Column(name="cm_0_3_3", attrName="cm_0_3_3", label="到院交通工具"),
		@Column(name="gli_1_1_1", attrName="gli_1_1_1", label="是否实施首次头部影像学检查"),
		@Column(name="gli_1_1_2", attrName="gli_1_1_2", label="实施头部影像学检查项目"),
		@Column(name="gli_1_1_3", attrName="gli_1_1_3", label="完成头部影像学检查报告日期时间"),
		@Column(name="gli_2_1_1_2", attrName="gli_2_1_1_2", label="是否进行手术前影像学评估"),
		@Column(name="gli_2_1_1", attrName="gli_2_1_1", label="手术前影像学评估方法"),
		@Column(name="gli_2_1_1_1", attrName="gli_2_1_1_1", label="其它影像学评估"),
		@Column(name="gli_2_1_2_2", attrName="gli_2_1_2_2", label="是否实施手术前神经功能评估"),
		@Column(name="gli_2_1_2", attrName="gli_2_1_2", label="手术前神经功能评估的方法"),
		@Column(name="gli_2_1_2_1", attrName="gli_2_1_2_1", label="其它神经功能评估"),
		@Column(name="gli_2_1_3_2", attrName="gli_2_1_3_2", label="是否实施手术前癫痫评估"),
		@Column(name="gli_2_1_3", attrName="gli_2_1_3", label="术前癫痫评估"),
		@Column(name="gli_2_1_3_1", attrName="gli_2_1_3_1", label="其它癫痫评估"),
		@Column(name="gli_2_1_4", attrName="gli_2_1_4", label="是否告知患者或者家属，手术必要性及原在相关风险的知情同意"),
		@Column(name="gli_3_1_1", attrName="gli_3_1_1", label="手术治疗方式选择"),
		@Column(name="gli_3_2_1", attrName="gli_3_2_1", label="肿瘤切除手术适应证"),
		@Column(name="gli_3_2_2", attrName="gli_3_2_2", label="是否有开颅手术的禁忌证"),
		@Column(name="gli_3_2_3", attrName="gli_3_2_3", label="禁忌证"),
		@Column(name="gli_3_3_1", attrName="gli_3_3_1", label="病理活检术适应证"),
		@Column(name="gli_3_3_2", attrName="gli_3_3_2", label="是否有病理活检手术的禁忌证"),
		@Column(name="gli_3_3_3", attrName="gli_3_3_3", label="禁忌证的选择"),
		@Column(name="gli_3_3_4", attrName="gli_3_3_4", label="病理活检手术方式"),
		@Column(name="cm_1_1_1", attrName="cm_1_1_1", label="是否使用预防性抗菌药物"),
		@Column(name="cm_1_2_1_2", attrName="cm_1_2_1_2", label="预防性抗菌药物选择"),
		@Column(name="cm_1_2_2_2", attrName="cm_1_2_2_2", label="选择碳青霉烯类及替加环素等特殊使用级抗菌药物"),
		@Column(name="cm_1_2_2_1", attrName="cm_1_2_2_1", label="其他特殊使用级抗菌药物名称"),
		@Column(name="cm_1_3_1_2", attrName="cm_1_3_1_2", label="选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素"),
		@Column(name="cm_1_3_1_1", attrName="cm_1_3_1_1", label="选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素填写"),
		@Column(name="cm_1_4_1", attrName="cm_1_4_1", label="使用首剂抗菌药物起始时间"),
		@Column(name="cm_1_5_1", attrName="cm_1_5_1", label="手术时间是否≥3小时"),
		@Column(name="cm_1_5_2", attrName="cm_1_5_2", label="是否术中追加抗菌药物"),
		@Column(name="cm_1_5_3", attrName="cm_1_5_3", label="术中出血量是否≥1500ml"),
		@Column(name="cm_1_5_4", attrName="cm_1_5_4", label="是否术中追加抗菌药物"),
		@Column(name="cm_1_6_1", attrName="cm_1_6_1", label="术后抗菌药物停止使用时间"),
		@Column(name="cm_1_6_2", attrName="cm_1_6_2", label="使用抗菌药物时间使用时间分层"),
		@Column(name="cm_1_6_3_2", attrName="cm_1_6_3_2", label="术后72小时之后继续使用的原因"),
		@Column(name="gli_5_1_1_1", attrName="gli_5_1_1_1", label="术中是否实施神经功能保护措施"),
		@Column(name="gli_5_1_1", attrName="gli_5_1_1", label="哪种类型脑肿瘤需要术中使用的神经功能保护措施"),
		@Column(name="gli_5_1_2", attrName="gli_5_1_2", label="术中使用的神经功能保护措施"),
		@Column(name="gli_5_1_4", attrName="gli_5_1_4", label="是否进行术中肿瘤切除率评估"),
		@Column(name="gli_5_1_3", attrName="gli_5_1_3", label="术中肿瘤切除情况"),
		@Column(name="gli_6_1_1", attrName="gli_6_1_1", label="手术中出血量 ", comment="手术中出血量 (ml)"),
		@Column(name="gli_6_1_2", attrName="gli_6_1_2", label="手术中输血量 ", comment="手术中输血量 (ml)"),
		@Column(name="gli_6_1_3", attrName="gli_6_1_3", label="手术后出血量 ", comment="手术后出血量 (ml)"),
		@Column(name="gli_6_1_4", attrName="gli_6_1_4", label="手术后输血量 ", comment="手术后输血量 (ml)"),
		@Column(name="gli_6_2_1", attrName="gli_6_2_1", label="全血 ", comment="全血 (ml)"),
		@Column(name="gli_6_2_2", attrName="gli_6_2_2", label="成份血 ", comment="成份血 (ml)"),
		@Column(name="gli_6_2_3", attrName="gli_6_2_3", label="血浆 ", comment="血浆 (ml)"),
		@Column(name="cm_2_1", attrName="cm_2_1", label="是否有手术后并发症"),
		@Column(name="cm_2_2", attrName="cm_2_2", label="手术后并发症类别及ICD-10四位亚目的选择"),
		@Column(name="cm_2_3_1_1", attrName="cm_2_3_1_1", label="其他手术后并发症类别及ICD-10四位亚目和名称填写"),
		@Column(name="cm_2_3_1", attrName="cm_2_3_1", label="介入操作与手术其他并发症"),
		@Column(name="cm_2_3_2", attrName="cm_2_3_2", label="手术患者手术后肺栓塞"),
		@Column(name="cm_2_3_3", attrName="cm_2_3_3", label="手术患者手术后深静脉血栓"),
		@Column(name="cm_2_3_4", attrName="cm_2_3_4", label="手术患者手术后败血症"),
		@Column(name="cm_2_3_5", attrName="cm_2_3_5", label="手术患者手术后出血或血肿"),
		@Column(name="cm_2_3_6", attrName="cm_2_3_6", label="手术患者手术伤口裂开"),
		@Column(name="cm_2_3_7", attrName="cm_2_3_7", label="手术患者猝死"),
		@Column(name="cm_2_3_8", attrName="cm_2_3_8", label="手术患者手术后呼吸道并发症"),
		@Column(name="cm_2_3_9", attrName="cm_2_3_9", label="手术患者手术后生理/代谢紊乱"),
		@Column(name="cm_2_3_10", attrName="cm_2_3_10", label="与手术/操作相关感染"),
		@Column(name="cm_2_3_11", attrName="cm_2_3_11", label="手术过程中异物遗留"),
		@Column(name="cm_2_3_12", attrName="cm_2_3_12", label="麻醉并发症"),
		@Column(name="cm_2_3_13", attrName="cm_2_3_13", label="输注、输血反应"),
		@Column(name="cm_2_3_14", attrName="cm_2_3_14", label="住院患者发生压疮"),
		@Column(name="cm_2_3_15", attrName="cm_2_3_15", label="术后急性肾功能损害"),
		@Column(name="cm_2_5", attrName="cm_2_5", label="GLI术后特指并发症"),
		@Column(name="cm_2_4", attrName="cm_2_4", label="影响程度的选择"),
		@Column(name="cm_2_6", attrName="cm_2_6", label="是否为手术后再手术"),
		@Column(name="gli_8_1_1", attrName="gli_8_1_1", label="是否进行复查头颅平扫CT"),
		@Column(name="gli_8_1_2", attrName="gli_8_1_2", label="评估日期时间"),
		@Column(name="gli_8_1_3", attrName="gli_8_1_3", label="评估结果"),
		@Column(name="gli_8_1_3_1", attrName="gli_8_1_3_1", label="其他评估结果"),
		@Column(name="gli_8_1_4", attrName="gli_8_1_4", label="是否需要二次手术"),
		@Column(name="gli_8_2_1", attrName="gli_8_2_1", label="是否实施MRI T1/T2加权平扫+ FLAIR+DWI+增强扫描影像学评估"),
		@Column(name="gli_8_2_2", attrName="gli_8_2_2", label="影像学评估日期时间"),
		@Column(name="gli_8_2_3", attrName="gli_8_2_3", label="影像学检测复查评估"),
		@Column(name="gli_8_2_3_1_1", attrName="gli_8_2_3_1_1", label="肿瘤全切率", comment="肿瘤全切率(%)"),
		@Column(name="gli_8_2_3_1_2", attrName="gli_8_2_3_1_2", label="高级别胶质瘤评估标准"),
		@Column(name="gli_8_2_3_2_1", attrName="gli_8_2_3_2_1", label="肿瘤全切率 ", comment="肿瘤全切率 (%)"),
		@Column(name="gli_8_2_3_2_2", attrName="gli_8_2_3_2_2", label="低级别胶质瘤评估标准"),
		@Column(name="gli_9_1_1", attrName="gli_9_1_1", label="病理诊断报告基本内容"),
		@Column(name="gli_9_1_1_1", attrName="gli_9_1_1_1", label="其它诊断报告基本内容"),
		@Column(name="gli_9_1_4", attrName="gli_9_1_4", label="病理诊断报告日期时间"),
		@Column(name="gli_9_1_2", attrName="gli_9_1_2", label="病理诊断是否按照2016 CNS WHO肿瘤分类标准的名称"),
		@Column(name="gli_9_1_3", attrName="gli_9_1_3", label="病理诊断名称符合2016 CNS WHO肿瘤分类标准"),
		@Column(name="gli_9_1_3_1", attrName="gli_9_1_3_1", label="弥漫性星形细胞和少突胶质细胞肿瘤"),
		@Column(name="gli_9_1_3_2", attrName="gli_9_1_3_2", label="其他星形细胞肿瘤"),
		@Column(name="gli_9_1_3_3", attrName="gli_9_1_3_3", label="室管膜肿瘤"),
		@Column(name="gli_9_1_3_4", attrName="gli_9_1_3_4", label="其它胶质瘤"),
		@Column(name="gli_9_1_3_5", attrName="gli_9_1_3_5", label="脉络丛肿瘤"),
		@Column(name="gli_9_1_3_6", attrName="gli_9_1_3_6", label="其它病理诊断分级名称"),
		@Column(name="cm_3_1", attrName="cm_3_1", label="手术野皮肤准备常用方法的选择"),
		@Column(name="cm_3_2", attrName="cm_3_2", label="使用含抗菌剂", comment="使用含抗菌剂（三氯生）缝线"),
		@Column(name="cm_3_2_1", attrName="cm_3_2_1", label="其他含抗菌剂缝线填写"),
		@Column(name="cm_3_3", attrName="cm_3_3", label="手术切口类别的选择"),
		@Column(name="cm_3_4", attrName="cm_3_4", label="手术切口愈合情况的选择"),
		@Column(name="gli_11_1_1", attrName="gli_11_1_1", label="是否为Ⅱ级以上", comment="是否为Ⅱ级以上（含WHOⅡ级）肿瘤"),
		@Column(name="gli_11_1_2", attrName="gli_11_1_2", label="是否进行免疫组化检测"),
		@Column(name="gli_11_1_3", attrName="gli_11_1_3", label="是否进行分子病理学检测"),
		@Column(name="gli_11_1_4", attrName="gli_11_1_4", label="检测内容"),
		@Column(name="gli_12_1_1", attrName="gli_12_1_1", label="出院前存在功能残损"),
		@Column(name="gli_12_1_1_1", attrName="gli_12_1_1_1", label="其它功能残损"),
		@Column(name="gli_12_1_2", attrName="gli_12_1_2", label="出院前是否完成KPS评分"),
		@Column(name="gli_12_1_3", attrName="gli_12_1_3", label="KPS评分要素"),
		@Column(name="gli_13_1_2_1", attrName="gli_13_1_2_1", label="行走评估结果"),
		@Column(name="gli_13_1_2_2", attrName="gli_13_1_2_2", label="呼吸评估结果"),
		@Column(name="gli_13_1_2_3", attrName="gli_13_1_2_3", label="饮食评估结果"),
		@Column(name="gli_13_1_2_4", attrName="gli_13_1_2_4", label="吞咽评估结果"),
		@Column(name="gli_13_1_2_5_3", attrName="gli_13_1_2_5_3", label="压疮评估无法确定或无记录"),
		@Column(name="gli_13_1_2_5", attrName="gli_13_1_2_5", label="压疮评估", comment="压疮评估（Braden评分值）分值"),
		@Column(name="gli_13_1_2_5_1", attrName="gli_13_1_2_5_1", label="压疮评估结果选择"),
		@Column(name="gli_13_1_2_5_2", attrName="gli_13_1_2_5_2", label="是否进行预防压疮告知"),
		@Column(name="gli_13_1_6", attrName="gli_13_1_6", label="神经系统评估"),
		@Column(name="gli_13_1_3_2", attrName="gli_13_1_3_2", label="实施术前健康教育有记录"),
		@Column(name="gli_13_1_3_2_1", attrName="gli_13_1_3_2_1", label="其它术前健康教育记录"),
		@Column(name="gli_13_1_3_3", attrName="gli_13_1_3_3", label="实施术后健康教育有记录"),
		@Column(name="gli_13_1_3_3_1", attrName="gli_13_1_3_3_1", label="其它术后健康教育记录"),
		@Column(name="gli_13_2_2_1", attrName="gli_13_2_2_1", label="交与患者“出院小结”的副本，并告知患者出院时风险因素"),
		@Column(name="gli_13_2_2_2", attrName="gli_13_2_2_2", label="出院带药"),
		@Column(name="gli_13_2_2_3", attrName="gli_13_2_2_3", label="告知发生紧急情况时求援救治途径"),
		@Column(name="gli_13_2_2_4", attrName="gli_13_2_2_4", label="出院时教育与随访"),
		@Column(name="gli_13_2_2_5", attrName="gli_13_2_2_5", label="告知何为风险因素与紧急情况"),
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
		@Column(includeEntity=DataEntity.class),
	}, orderBy="a.update_date DESC"
)
public class QualityGli extends DataEntity<QualityGli> {
	
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
	private String cm_0_1_4_3;		// 其它ICD-9-CM-3编码与名称
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
	private Date cm_0_2_5_1;		// 入住ICU日期时间
	private Date cm_0_2_5_2;		// 离开ICU日期时间
	private Date cm_0_2_6_1;		// 手术开始（切皮）日期时间
	private Date cm_0_2_6_2;		// 手术结束（缝皮结束）日期时间
	private String cm_0_3_1;		// 费用支付方式
	private String cm_0_3_2;		// 收入住院途径
	private String cm_0_3_3;		// 到院交通工具
	private String gli_1_1_1;		// 是否实施首次头部影像学检查
	private String gli_1_1_2;		// 实施头部影像学检查项目
	private Date gli_1_1_3;		// 完成头部影像学检查报告日期时间
	private String gli_2_1_1_2;		// 是否进行手术前影像学评估
	private String gli_2_1_1;		// 手术前影像学评估方法
	private String gli_2_1_1_1;		// 其它影像学评估
	private String gli_2_1_2_2;		// 是否实施手术前神经功能评估
	private String gli_2_1_2;		// 手术前神经功能评估的方法
	private String gli_2_1_2_1;		// 其它神经功能评估
	private String gli_2_1_3_2;		// 是否实施手术前癫痫评估
	private String gli_2_1_3;		// 术前癫痫评估
	private String gli_2_1_3_1;		// 其它癫痫评估
	private String gli_2_1_4;		// 是否告知患者或者家属，手术必要性及原在相关风险的知情同意
	private String gli_3_1_1;		// 手术治疗方式选择
	private String gli_3_2_1;		// 肿瘤切除手术适应证
	private String gli_3_2_2;		// 是否有开颅手术的禁忌证
	private String gli_3_2_3;		// 禁忌证
	private String gli_3_3_1;		// 病理活检术适应证
	private String gli_3_3_2;		// 是否有病理活检手术的禁忌证
	private String gli_3_3_3;		// 禁忌证的选择
	private String gli_3_3_4;		// 病理活检手术方式
	private String cm_1_1_1;		// 是否使用预防性抗菌药物
	private String cm_1_2_1_2;		// 预防性抗菌药物选择
	private String cm_1_2_2_2;		// 选择碳青霉烯类及替加环素等特殊使用级抗菌药物
	private String cm_1_2_2_1;		// 其他特殊使用级抗菌药物名称
	private String cm_1_3_1_2;		// 选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素
	private String cm_1_3_1_1;		// 选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素填写
	private Date cm_1_4_1;		// 使用首剂抗菌药物起始时间
	private String cm_1_5_1;		// 手术时间是否≥3小时
	private String cm_1_5_2;		// 是否术中追加抗菌药物
	private String cm_1_5_3;		// 术中出血量是否≥1500ml
	private String cm_1_5_4;		// 是否术中追加抗菌药物
	private Date cm_1_6_1;		// 术后抗菌药物停止使用时间
	private String cm_1_6_2;		// 使用抗菌药物时间使用时间分层
	private String cm_1_6_3_2;		// 术后72小时之后继续使用的原因
	private String gli_5_1_1_1;		// 术中是否实施神经功能保护措施
	private String gli_5_1_1;		// 哪种类型脑肿瘤需要术中使用的神经功能保护措施
	private String gli_5_1_2;		// 术中使用的神经功能保护措施
	private String gli_5_1_4;		// 是否进行术中肿瘤切除率评估
	private String gli_5_1_3;		// 术中肿瘤切除情况
	private Double gli_6_1_1;		// 手术中出血量 (ml)
	private Double gli_6_1_2;		// 手术中输血量 (ml)
	private Double gli_6_1_3;		// 手术后出血量 (ml)
	private Double gli_6_1_4;		// 手术后输血量 (ml)
	private Double gli_6_2_1;		// 全血 (ml)
	private Double gli_6_2_2;		// 成份血 (ml)
	private Double gli_6_2_3;		// 血浆 (ml)
	private String cm_2_1;		// 是否有手术后并发症
	private String cm_2_2;		// 手术后并发症类别及ICD-10四位亚目的选择
	private String cm_2_3_1_1;		// 其他手术后并发症类别及ICD-10四位亚目和名称填写
	private String cm_2_3_1;		// 介入操作与手术其他并发症
	private String cm_2_3_2;		// 手术患者手术后肺栓塞
	private String cm_2_3_3;		// 手术患者手术后深静脉血栓
	private String cm_2_3_4;		// 手术患者手术后败血症
	private String cm_2_3_5;		// 手术患者手术后出血或血肿
	private String cm_2_3_6;		// 手术患者手术伤口裂开
	private String cm_2_3_7;		// 手术患者猝死
	private String cm_2_3_8;		// 手术患者手术后呼吸道并发症
	private String cm_2_3_9;		// 手术患者手术后生理/代谢紊乱
	private String cm_2_3_10;		// 与手术/操作相关感染
	private String cm_2_3_11;		// 手术过程中异物遗留
	private String cm_2_3_12;		// 麻醉并发症
	private String cm_2_3_13;		// 输注、输血反应
	private String cm_2_3_14;		// 住院患者发生压疮
	private String cm_2_3_15;		// 术后急性肾功能损害
	private String cm_2_5;		// GLI术后特指并发症
	private String cm_2_4;		// 影响程度的选择
	private String cm_2_6;		// 是否为手术后再手术
	private String gli_8_1_1;		// 是否进行复查头颅平扫CT
	private Date gli_8_1_2;		// 评估日期时间
	private String gli_8_1_3;		// 评估结果
	private String gli_8_1_3_1;		// 其他评估结果
	private String gli_8_1_4;		// 是否需要二次手术
	private String gli_8_2_1;		// 是否实施MRI T1/T2加权平扫+ FLAIR+DWI+增强扫描影像学评估
	private Date gli_8_2_2;		// 影像学评估日期时间
	private String gli_8_2_3;		// 影像学检测复查评估
	private Double gli_8_2_3_1_1;		// 肿瘤全切率(%)
	private String gli_8_2_3_1_2;		// 高级别胶质瘤评估标准
	private Double gli_8_2_3_2_1;		// 肿瘤全切率 (%)
	private String gli_8_2_3_2_2;		// 低级别胶质瘤评估标准
	private String gli_9_1_1;		// 病理诊断报告基本内容
	private String gli_9_1_1_1;		// 其它诊断报告基本内容
	private Date gli_9_1_4;		// 病理诊断报告日期时间
	private String gli_9_1_2;		// 病理诊断是否按照2016 CNS WHO肿瘤分类标准的名称
	private String gli_9_1_3;		// 病理诊断名称符合2016 CNS WHO肿瘤分类标准
	private String gli_9_1_3_1;		// 弥漫性星形细胞和少突胶质细胞肿瘤
	private String gli_9_1_3_2;		// 其他星形细胞肿瘤
	private String gli_9_1_3_3;		// 室管膜肿瘤
	private String gli_9_1_3_4;		// 其它胶质瘤
	private String gli_9_1_3_5;		// 脉络丛肿瘤
	private String gli_9_1_3_6;		// 其它病理诊断分级名称
	private String cm_3_1;		// 手术野皮肤准备常用方法的选择
	private String cm_3_2;		// 使用含抗菌剂（三氯生）缝线
	private String cm_3_2_1;		// 其他含抗菌剂缝线填写
	private String cm_3_3;		// 手术切口类别的选择
	private String cm_3_4;		// 手术切口愈合情况的选择
	private String gli_11_1_1;		// 是否为Ⅱ级以上（含WHOⅡ级）肿瘤
	private String gli_11_1_2;		// 是否进行免疫组化检测
	private String gli_11_1_3;		// 是否进行分子病理学检测
	private String gli_11_1_4;		// 检测内容
	private String gli_12_1_1;		// 出院前存在功能残损
	private String gli_12_1_1_1;		// 其它功能残损
	private String gli_12_1_2;		// 出院前是否完成KPS评分
	private String gli_12_1_3;		// KPS评分要素
	private String gli_13_1_2_1;		// 行走评估结果
	private String gli_13_1_2_2;		// 呼吸评估结果
	private String gli_13_1_2_3;		// 饮食评估结果
	private String gli_13_1_2_4;		// 吞咽评估结果
	private String gli_13_1_2_5_3;		// 压疮评估无法确定或无记录
	private Double gli_13_1_2_5;		// 压疮评估（Braden评分值）分值
	private String gli_13_1_2_5_1;		// 压疮评估结果选择
	private String gli_13_1_2_5_2;		// 是否进行预防压疮告知
	private String gli_13_1_6;		// 神经系统评估
	private String gli_13_1_3_2;		// 实施术前健康教育有记录
	private String gli_13_1_3_2_1;		// 其它术前健康教育记录
	private String gli_13_1_3_3;		// 实施术后健康教育有记录
	private String gli_13_1_3_3_1;		// 其它术后健康教育记录
	private String gli_13_2_2_1;		// 交与患者“出院小结”的副本，并告知患者出院时风险因素
	private String gli_13_2_2_2;		// 出院带药
	private String gli_13_2_2_3;		// 告知发生紧急情况时求援救治途径
	private String gli_13_2_2_4;		// 出院时教育与随访
	private String gli_13_2_2_5;		// 告知何为风险因素与紧急情况
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
	
	public QualityGli() {
		this(null);
	}

	public QualityGli(String id){
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
	
	@Length(min=0, max=64, message="主要诊断ICD-10四位亚目编码与名称长度不能超过 64 个字符")
	public String getCm_0_1_3_1() {
		return cm_0_1_3_1;
	}

	public void setCm_0_1_3_1(String cm_0_1_3_1) {
		this.cm_0_1_3_1 = cm_0_1_3_1;
	}
	
	@Length(min=0, max=64, message="主要诊断ICD-10六位临床扩展编码与名称长度不能超过 64 个字符")
	public String getCm_0_1_3_2() {
		return cm_0_1_3_2;
	}

	public void setCm_0_1_3_2(String cm_0_1_3_2) {
		this.cm_0_1_3_2 = cm_0_1_3_2;
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
	
	@Length(min=0, max=64, message="其它ICD-9-CM-3编码与名称长度不能超过 64 个字符")
	public String getCm_0_1_4_3() {
		return cm_0_1_4_3;
	}

	public void setCm_0_1_4_3(String cm_0_1_4_3) {
		this.cm_0_1_4_3 = cm_0_1_4_3;
	}
	
	@Length(min=0, max=64, message="是否出院后31天内重复住院长度不能超过 64 个字符")
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
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCm_0_2_2_2() {
		return cm_0_2_2_2;
	}

	public void setCm_0_2_2_2(Date cm_0_2_2_2) {
		this.cm_0_2_2_2 = cm_0_2_2_2;
	}
	
	@Length(min=0, max=64, message="到达本院急诊或者门诊日期时间是否无法确定或无记录长度不能超过 64 个字符")
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
	
	@Length(min=0, max=64, message="是否实施首次头部影像学检查长度不能超过 64 个字符")
	public String getGli_1_1_1() {
		return gli_1_1_1;
	}

	public void setGli_1_1_1(String gli_1_1_1) {
		this.gli_1_1_1 = gli_1_1_1;
	}
	
	@Length(min=0, max=64, message="实施头部影像学检查项目长度不能超过 64 个字符")
	public String getGli_1_1_2() {
		return gli_1_1_2;
	}

	public void setGli_1_1_2(String gli_1_1_2) {
		this.gli_1_1_2 = gli_1_1_2;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getGli_1_1_3() {
		return gli_1_1_3;
	}

	public void setGli_1_1_3(Date gli_1_1_3) {
		this.gli_1_1_3 = gli_1_1_3;
	}
	
	@Length(min=0, max=64, message="是否进行手术前影像学评估长度不能超过 64 个字符")
	public String getGli_2_1_1_2() {
		return gli_2_1_1_2;
	}

	public void setGli_2_1_1_2(String gli_2_1_1_2) {
		this.gli_2_1_1_2 = gli_2_1_1_2;
	}
	
	@Length(min=0, max=64, message="手术前影像学评估方法长度不能超过 64 个字符")
	public String getGli_2_1_1() {
		return gli_2_1_1;
	}

	public void setGli_2_1_1(String gli_2_1_1) {
		this.gli_2_1_1 = gli_2_1_1;
	}
	
	@Length(min=0, max=64, message="其它影像学评估长度不能超过 64 个字符")
	public String getGli_2_1_1_1() {
		return gli_2_1_1_1;
	}

	public void setGli_2_1_1_1(String gli_2_1_1_1) {
		this.gli_2_1_1_1 = gli_2_1_1_1;
	}
	
	@Length(min=0, max=64, message="是否实施手术前神经功能评估长度不能超过 64 个字符")
	public String getGli_2_1_2_2() {
		return gli_2_1_2_2;
	}

	public void setGli_2_1_2_2(String gli_2_1_2_2) {
		this.gli_2_1_2_2 = gli_2_1_2_2;
	}
	
	@Length(min=0, max=64, message="手术前神经功能评估的方法长度不能超过 64 个字符")
	public String getGli_2_1_2() {
		return gli_2_1_2;
	}

	public void setGli_2_1_2(String gli_2_1_2) {
		this.gli_2_1_2 = gli_2_1_2;
	}
	
	@Length(min=0, max=64, message="其它神经功能评估长度不能超过 64 个字符")
	public String getGli_2_1_2_1() {
		return gli_2_1_2_1;
	}

	public void setGli_2_1_2_1(String gli_2_1_2_1) {
		this.gli_2_1_2_1 = gli_2_1_2_1;
	}
	
	@Length(min=0, max=64, message="是否实施手术前癫痫评估长度不能超过 64 个字符")
	public String getGli_2_1_3_2() {
		return gli_2_1_3_2;
	}

	public void setGli_2_1_3_2(String gli_2_1_3_2) {
		this.gli_2_1_3_2 = gli_2_1_3_2;
	}
	
	@Length(min=0, max=64, message="术前癫痫评估长度不能超过 64 个字符")
	public String getGli_2_1_3() {
		return gli_2_1_3;
	}

	public void setGli_2_1_3(String gli_2_1_3) {
		this.gli_2_1_3 = gli_2_1_3;
	}
	
	@Length(min=0, max=64, message="其它癫痫评估长度不能超过 64 个字符")
	public String getGli_2_1_3_1() {
		return gli_2_1_3_1;
	}

	public void setGli_2_1_3_1(String gli_2_1_3_1) {
		this.gli_2_1_3_1 = gli_2_1_3_1;
	}
	
	@Length(min=0, max=64, message="是否告知患者或者家属，手术必要性及原在相关风险的知情同意长度不能超过 64 个字符")
	public String getGli_2_1_4() {
		return gli_2_1_4;
	}

	public void setGli_2_1_4(String gli_2_1_4) {
		this.gli_2_1_4 = gli_2_1_4;
	}
	
	@Length(min=0, max=64, message="手术治疗方式选择长度不能超过 64 个字符")
	public String getGli_3_1_1() {
		return gli_3_1_1;
	}

	public void setGli_3_1_1(String gli_3_1_1) {
		this.gli_3_1_1 = gli_3_1_1;
	}
	
	@Length(min=0, max=64, message="肿瘤切除手术适应证长度不能超过 64 个字符")
	public String getGli_3_2_1() {
		return gli_3_2_1;
	}

	public void setGli_3_2_1(String gli_3_2_1) {
		this.gli_3_2_1 = gli_3_2_1;
	}
	
	@Length(min=0, max=64, message="是否有开颅手术的禁忌证长度不能超过 64 个字符")
	public String getGli_3_2_2() {
		return gli_3_2_2;
	}

	public void setGli_3_2_2(String gli_3_2_2) {
		this.gli_3_2_2 = gli_3_2_2;
	}
	
	@Length(min=0, max=64, message="禁忌证长度不能超过 64 个字符")
	public String getGli_3_2_3() {
		return gli_3_2_3;
	}

	public void setGli_3_2_3(String gli_3_2_3) {
		this.gli_3_2_3 = gli_3_2_3;
	}
	
	@Length(min=0, max=64, message="病理活检术适应证长度不能超过 64 个字符")
	public String getGli_3_3_1() {
		return gli_3_3_1;
	}

	public void setGli_3_3_1(String gli_3_3_1) {
		this.gli_3_3_1 = gli_3_3_1;
	}
	
	@Length(min=0, max=64, message="是否有病理活检手术的禁忌证长度不能超过 64 个字符")
	public String getGli_3_3_2() {
		return gli_3_3_2;
	}

	public void setGli_3_3_2(String gli_3_3_2) {
		this.gli_3_3_2 = gli_3_3_2;
	}
	
	@Length(min=0, max=64, message="禁忌证的选择长度不能超过 64 个字符")
	public String getGli_3_3_3() {
		return gli_3_3_3;
	}

	public void setGli_3_3_3(String gli_3_3_3) {
		this.gli_3_3_3 = gli_3_3_3;
	}
	
	@Length(min=0, max=64, message="病理活检手术方式长度不能超过 64 个字符")
	public String getGli_3_3_4() {
		return gli_3_3_4;
	}

	public void setGli_3_3_4(String gli_3_3_4) {
		this.gli_3_3_4 = gli_3_3_4;
	}
	
	@Length(min=0, max=64, message="是否使用预防性抗菌药物长度不能超过 64 个字符")
	public String getCm_1_1_1() {
		return cm_1_1_1;
	}

	public void setCm_1_1_1(String cm_1_1_1) {
		this.cm_1_1_1 = cm_1_1_1;
	}
	
	@Length(min=0, max=64, message="预防性抗菌药物选择长度不能超过 64 个字符")
	public String getCm_1_2_1_2() {
		return cm_1_2_1_2;
	}

	public void setCm_1_2_1_2(String cm_1_2_1_2) {
		this.cm_1_2_1_2 = cm_1_2_1_2;
	}
	
	@Length(min=0, max=64, message="选择碳青霉烯类及替加环素等特殊使用级抗菌药物长度不能超过 64 个字符")
	public String getCm_1_2_2_2() {
		return cm_1_2_2_2;
	}

	public void setCm_1_2_2_2(String cm_1_2_2_2) {
		this.cm_1_2_2_2 = cm_1_2_2_2;
	}
	
	@Length(min=0, max=64, message="其他特殊使用级抗菌药物名称长度不能超过 64 个字符")
	public String getCm_1_2_2_1() {
		return cm_1_2_2_1;
	}

	public void setCm_1_2_2_1(String cm_1_2_2_1) {
		this.cm_1_2_2_1 = cm_1_2_2_1;
	}
	
	@Length(min=0, max=64, message="选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素长度不能超过 64 个字符")
	public String getCm_1_3_1_2() {
		return cm_1_3_1_2;
	}

	public void setCm_1_3_1_2(String cm_1_3_1_2) {
		this.cm_1_3_1_2 = cm_1_3_1_2;
	}
	
	@Length(min=0, max=64, message="选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素填写长度不能超过 64 个字符")
	public String getCm_1_3_1_1() {
		return cm_1_3_1_1;
	}

	public void setCm_1_3_1_1(String cm_1_3_1_1) {
		this.cm_1_3_1_1 = cm_1_3_1_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCm_1_4_1() {
		return cm_1_4_1;
	}

	public void setCm_1_4_1(Date cm_1_4_1) {
		this.cm_1_4_1 = cm_1_4_1;
	}
	
	@Length(min=0, max=64, message="手术时间是否≥3小时长度不能超过 64 个字符")
	public String getCm_1_5_1() {
		return cm_1_5_1;
	}

	public void setCm_1_5_1(String cm_1_5_1) {
		this.cm_1_5_1 = cm_1_5_1;
	}
	
	@Length(min=0, max=64, message="是否术中追加抗菌药物长度不能超过 64 个字符")
	public String getCm_1_5_2() {
		return cm_1_5_2;
	}

	public void setCm_1_5_2(String cm_1_5_2) {
		this.cm_1_5_2 = cm_1_5_2;
	}
	
	@Length(min=0, max=64, message="术中出血量是否≥1500ml长度不能超过 64 个字符")
	public String getCm_1_5_3() {
		return cm_1_5_3;
	}

	public void setCm_1_5_3(String cm_1_5_3) {
		this.cm_1_5_3 = cm_1_5_3;
	}
	
	@Length(min=0, max=64, message="是否术中追加抗菌药物长度不能超过 64 个字符")
	public String getCm_1_5_4() {
		return cm_1_5_4;
	}

	public void setCm_1_5_4(String cm_1_5_4) {
		this.cm_1_5_4 = cm_1_5_4;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCm_1_6_1() {
		return cm_1_6_1;
	}

	public void setCm_1_6_1(Date cm_1_6_1) {
		this.cm_1_6_1 = cm_1_6_1;
	}
	
	@Length(min=0, max=64, message="使用抗菌药物时间使用时间分层长度不能超过 64 个字符")
	public String getCm_1_6_2() {
		return cm_1_6_2;
	}

	public void setCm_1_6_2(String cm_1_6_2) {
		this.cm_1_6_2 = cm_1_6_2;
	}
	
	@Length(min=0, max=64, message="术后72小时之后继续使用的原因长度不能超过 64 个字符")
	public String getCm_1_6_3_2() {
		return cm_1_6_3_2;
	}

	public void setCm_1_6_3_2(String cm_1_6_3_2) {
		this.cm_1_6_3_2 = cm_1_6_3_2;
	}
	
	@Length(min=0, max=64, message="术中是否实施神经功能保护措施长度不能超过 64 个字符")
	public String getGli_5_1_1_1() {
		return gli_5_1_1_1;
	}

	public void setGli_5_1_1_1(String gli_5_1_1_1) {
		this.gli_5_1_1_1 = gli_5_1_1_1;
	}
	
	@Length(min=0, max=64, message="哪种类型脑肿瘤需要术中使用的神经功能保护措施长度不能超过 64 个字符")
	public String getGli_5_1_1() {
		return gli_5_1_1;
	}

	public void setGli_5_1_1(String gli_5_1_1) {
		this.gli_5_1_1 = gli_5_1_1;
	}
	
	@Length(min=0, max=64, message="术中使用的神经功能保护措施长度不能超过 64 个字符")
	public String getGli_5_1_2() {
		return gli_5_1_2;
	}

	public void setGli_5_1_2(String gli_5_1_2) {
		this.gli_5_1_2 = gli_5_1_2;
	}
	
	@Length(min=0, max=64, message="是否进行术中肿瘤切除率评估长度不能超过 64 个字符")
	public String getGli_5_1_4() {
		return gli_5_1_4;
	}

	public void setGli_5_1_4(String gli_5_1_4) {
		this.gli_5_1_4 = gli_5_1_4;
	}
	
	@Length(min=0, max=64, message="术中肿瘤切除情况长度不能超过 64 个字符")
	public String getGli_5_1_3() {
		return gli_5_1_3;
	}

	public void setGli_5_1_3(String gli_5_1_3) {
		this.gli_5_1_3 = gli_5_1_3;
	}
	
	public Double getGli_6_1_1() {
		return gli_6_1_1;
	}

	public void setGli_6_1_1(Double gli_6_1_1) {
		this.gli_6_1_1 = gli_6_1_1;
	}
	
	public Double getGli_6_1_2() {
		return gli_6_1_2;
	}

	public void setGli_6_1_2(Double gli_6_1_2) {
		this.gli_6_1_2 = gli_6_1_2;
	}
	
	public Double getGli_6_1_3() {
		return gli_6_1_3;
	}

	public void setGli_6_1_3(Double gli_6_1_3) {
		this.gli_6_1_3 = gli_6_1_3;
	}
	
	public Double getGli_6_1_4() {
		return gli_6_1_4;
	}

	public void setGli_6_1_4(Double gli_6_1_4) {
		this.gli_6_1_4 = gli_6_1_4;
	}
	
	public Double getGli_6_2_1() {
		return gli_6_2_1;
	}

	public void setGli_6_2_1(Double gli_6_2_1) {
		this.gli_6_2_1 = gli_6_2_1;
	}
	
	public Double getGli_6_2_2() {
		return gli_6_2_2;
	}

	public void setGli_6_2_2(Double gli_6_2_2) {
		this.gli_6_2_2 = gli_6_2_2;
	}
	
	public Double getGli_6_2_3() {
		return gli_6_2_3;
	}

	public void setGli_6_2_3(Double gli_6_2_3) {
		this.gli_6_2_3 = gli_6_2_3;
	}
	
	@Length(min=0, max=64, message="是否有手术后并发症长度不能超过 64 个字符")
	public String getCm_2_1() {
		return cm_2_1;
	}

	public void setCm_2_1(String cm_2_1) {
		this.cm_2_1 = cm_2_1;
	}
	
	@Length(min=0, max=64, message="手术后并发症类别及ICD-10四位亚目的选择长度不能超过 64 个字符")
	public String getCm_2_2() {
		return cm_2_2;
	}

	public void setCm_2_2(String cm_2_2) {
		this.cm_2_2 = cm_2_2;
	}
	
	@Length(min=0, max=64, message="其他手术后并发症类别及ICD-10四位亚目和名称填写长度不能超过 64 个字符")
	public String getCm_2_3_1_1() {
		return cm_2_3_1_1;
	}

	public void setCm_2_3_1_1(String cm_2_3_1_1) {
		this.cm_2_3_1_1 = cm_2_3_1_1;
	}
	
	@Length(min=0, max=64, message="介入操作与手术其他并发症长度不能超过 64 个字符")
	public String getCm_2_3_1() {
		return cm_2_3_1;
	}

	public void setCm_2_3_1(String cm_2_3_1) {
		this.cm_2_3_1 = cm_2_3_1;
	}
	
	@Length(min=0, max=64, message="手术患者手术后肺栓塞长度不能超过 64 个字符")
	public String getCm_2_3_2() {
		return cm_2_3_2;
	}

	public void setCm_2_3_2(String cm_2_3_2) {
		this.cm_2_3_2 = cm_2_3_2;
	}
	
	@Length(min=0, max=64, message="手术患者手术后深静脉血栓长度不能超过 64 个字符")
	public String getCm_2_3_3() {
		return cm_2_3_3;
	}

	public void setCm_2_3_3(String cm_2_3_3) {
		this.cm_2_3_3 = cm_2_3_3;
	}
	
	@Length(min=0, max=64, message="手术患者手术后败血症长度不能超过 64 个字符")
	public String getCm_2_3_4() {
		return cm_2_3_4;
	}

	public void setCm_2_3_4(String cm_2_3_4) {
		this.cm_2_3_4 = cm_2_3_4;
	}
	
	@Length(min=0, max=64, message="手术患者手术后出血或血肿长度不能超过 64 个字符")
	public String getCm_2_3_5() {
		return cm_2_3_5;
	}

	public void setCm_2_3_5(String cm_2_3_5) {
		this.cm_2_3_5 = cm_2_3_5;
	}
	
	@Length(min=0, max=64, message="手术患者手术伤口裂开长度不能超过 64 个字符")
	public String getCm_2_3_6() {
		return cm_2_3_6;
	}

	public void setCm_2_3_6(String cm_2_3_6) {
		this.cm_2_3_6 = cm_2_3_6;
	}
	
	@Length(min=0, max=64, message="手术患者猝死长度不能超过 64 个字符")
	public String getCm_2_3_7() {
		return cm_2_3_7;
	}

	public void setCm_2_3_7(String cm_2_3_7) {
		this.cm_2_3_7 = cm_2_3_7;
	}
	
	@Length(min=0, max=64, message="手术患者手术后呼吸道并发症长度不能超过 64 个字符")
	public String getCm_2_3_8() {
		return cm_2_3_8;
	}

	public void setCm_2_3_8(String cm_2_3_8) {
		this.cm_2_3_8 = cm_2_3_8;
	}
	
	@Length(min=0, max=64, message="手术患者手术后生理/代谢紊乱长度不能超过 64 个字符")
	public String getCm_2_3_9() {
		return cm_2_3_9;
	}

	public void setCm_2_3_9(String cm_2_3_9) {
		this.cm_2_3_9 = cm_2_3_9;
	}
	
	@Length(min=0, max=64, message="与手术/操作相关感染长度不能超过 64 个字符")
	public String getCm_2_3_10() {
		return cm_2_3_10;
	}

	public void setCm_2_3_10(String cm_2_3_10) {
		this.cm_2_3_10 = cm_2_3_10;
	}
	
	@Length(min=0, max=64, message="手术过程中异物遗留长度不能超过 64 个字符")
	public String getCm_2_3_11() {
		return cm_2_3_11;
	}

	public void setCm_2_3_11(String cm_2_3_11) {
		this.cm_2_3_11 = cm_2_3_11;
	}
	
	@Length(min=0, max=64, message="麻醉并发症长度不能超过 64 个字符")
	public String getCm_2_3_12() {
		return cm_2_3_12;
	}

	public void setCm_2_3_12(String cm_2_3_12) {
		this.cm_2_3_12 = cm_2_3_12;
	}
	
	@Length(min=0, max=64, message="输注、输血反应长度不能超过 64 个字符")
	public String getCm_2_3_13() {
		return cm_2_3_13;
	}

	public void setCm_2_3_13(String cm_2_3_13) {
		this.cm_2_3_13 = cm_2_3_13;
	}
	
	@Length(min=0, max=64, message="住院患者发生压疮长度不能超过 64 个字符")
	public String getCm_2_3_14() {
		return cm_2_3_14;
	}

	public void setCm_2_3_14(String cm_2_3_14) {
		this.cm_2_3_14 = cm_2_3_14;
	}
	
	@Length(min=0, max=64, message="术后急性肾功能损害长度不能超过 64 个字符")
	public String getCm_2_3_15() {
		return cm_2_3_15;
	}

	public void setCm_2_3_15(String cm_2_3_15) {
		this.cm_2_3_15 = cm_2_3_15;
	}
	
	@Length(min=0, max=64, message="GLI术后特指并发症长度不能超过 64 个字符")
	public String getCm_2_5() {
		return cm_2_5;
	}

	public void setCm_2_5(String cm_2_5) {
		this.cm_2_5 = cm_2_5;
	}
	
	@Length(min=0, max=64, message="影响程度的选择长度不能超过 64 个字符")
	public String getCm_2_4() {
		return cm_2_4;
	}

	public void setCm_2_4(String cm_2_4) {
		this.cm_2_4 = cm_2_4;
	}
	
	@Length(min=0, max=64, message="是否为手术后再手术长度不能超过 64 个字符")
	public String getCm_2_6() {
		return cm_2_6;
	}

	public void setCm_2_6(String cm_2_6) {
		this.cm_2_6 = cm_2_6;
	}
	
	@Length(min=0, max=64, message="是否进行复查头颅平扫CT长度不能超过 64 个字符")
	public String getGli_8_1_1() {
		return gli_8_1_1;
	}

	public void setGli_8_1_1(String gli_8_1_1) {
		this.gli_8_1_1 = gli_8_1_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getGli_8_1_2() {
		return gli_8_1_2;
	}

	public void setGli_8_1_2(Date gli_8_1_2) {
		this.gli_8_1_2 = gli_8_1_2;
	}
	
	@Length(min=0, max=64, message="评估结果长度不能超过 64 个字符")
	public String getGli_8_1_3() {
		return gli_8_1_3;
	}

	public void setGli_8_1_3(String gli_8_1_3) {
		this.gli_8_1_3 = gli_8_1_3;
	}
	
	@Length(min=0, max=64, message="其他评估结果长度不能超过 64 个字符")
	public String getGli_8_1_3_1() {
		return gli_8_1_3_1;
	}

	public void setGli_8_1_3_1(String gli_8_1_3_1) {
		this.gli_8_1_3_1 = gli_8_1_3_1;
	}
	
	@Length(min=0, max=64, message="是否需要二次手术长度不能超过 64 个字符")
	public String getGli_8_1_4() {
		return gli_8_1_4;
	}

	public void setGli_8_1_4(String gli_8_1_4) {
		this.gli_8_1_4 = gli_8_1_4;
	}
	
	@Length(min=0, max=64, message="是否实施MRI T1/T2加权平扫+ FLAIR+DWI+增强扫描影像学评估长度不能超过 64 个字符")
	public String getGli_8_2_1() {
		return gli_8_2_1;
	}

	public void setGli_8_2_1(String gli_8_2_1) {
		this.gli_8_2_1 = gli_8_2_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getGli_8_2_2() {
		return gli_8_2_2;
	}

	public void setGli_8_2_2(Date gli_8_2_2) {
		this.gli_8_2_2 = gli_8_2_2;
	}
	
	@Length(min=0, max=64, message="影像学检测复查评估长度不能超过 64 个字符")
	public String getGli_8_2_3() {
		return gli_8_2_3;
	}

	public void setGli_8_2_3(String gli_8_2_3) {
		this.gli_8_2_3 = gli_8_2_3;
	}
	
	public Double getGli_8_2_3_1_1() {
		return gli_8_2_3_1_1;
	}

	public void setGli_8_2_3_1_1(Double gli_8_2_3_1_1) {
		this.gli_8_2_3_1_1 = gli_8_2_3_1_1;
	}
	
	@Length(min=0, max=64, message="高级别胶质瘤评估标准长度不能超过 64 个字符")
	public String getGli_8_2_3_1_2() {
		return gli_8_2_3_1_2;
	}

	public void setGli_8_2_3_1_2(String gli_8_2_3_1_2) {
		this.gli_8_2_3_1_2 = gli_8_2_3_1_2;
	}
	
	public Double getGli_8_2_3_2_1() {
		return gli_8_2_3_2_1;
	}

	public void setGli_8_2_3_2_1(Double gli_8_2_3_2_1) {
		this.gli_8_2_3_2_1 = gli_8_2_3_2_1;
	}
	
	@Length(min=0, max=64, message="低级别胶质瘤评估标准长度不能超过 64 个字符")
	public String getGli_8_2_3_2_2() {
		return gli_8_2_3_2_2;
	}

	public void setGli_8_2_3_2_2(String gli_8_2_3_2_2) {
		this.gli_8_2_3_2_2 = gli_8_2_3_2_2;
	}
	
	@Length(min=0, max=64, message="病理诊断报告基本内容长度不能超过 64 个字符")
	public String getGli_9_1_1() {
		return gli_9_1_1;
	}

	public void setGli_9_1_1(String gli_9_1_1) {
		this.gli_9_1_1 = gli_9_1_1;
	}
	
	@Length(min=0, max=64, message="其它诊断报告基本内容长度不能超过 64 个字符")
	public String getGli_9_1_1_1() {
		return gli_9_1_1_1;
	}

	public void setGli_9_1_1_1(String gli_9_1_1_1) {
		this.gli_9_1_1_1 = gli_9_1_1_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getGli_9_1_4() {
		return gli_9_1_4;
	}

	public void setGli_9_1_4(Date gli_9_1_4) {
		this.gli_9_1_4 = gli_9_1_4;
	}
	
	@Length(min=0, max=64, message="病理诊断是否按照2016 CNS WHO肿瘤分类标准的名称长度不能超过 64 个字符")
	public String getGli_9_1_2() {
		return gli_9_1_2;
	}

	public void setGli_9_1_2(String gli_9_1_2) {
		this.gli_9_1_2 = gli_9_1_2;
	}
	
	@Length(min=0, max=64, message="病理诊断名称符合2016 CNS WHO肿瘤分类标准长度不能超过 64 个字符")
	public String getGli_9_1_3() {
		return gli_9_1_3;
	}

	public void setGli_9_1_3(String gli_9_1_3) {
		this.gli_9_1_3 = gli_9_1_3;
	}
	
	@Length(min=0, max=64, message="弥漫性星形细胞和少突胶质细胞肿瘤长度不能超过 64 个字符")
	public String getGli_9_1_3_1() {
		return gli_9_1_3_1;
	}

	public void setGli_9_1_3_1(String gli_9_1_3_1) {
		this.gli_9_1_3_1 = gli_9_1_3_1;
	}
	
	@Length(min=0, max=64, message="其他星形细胞肿瘤长度不能超过 64 个字符")
	public String getGli_9_1_3_2() {
		return gli_9_1_3_2;
	}

	public void setGli_9_1_3_2(String gli_9_1_3_2) {
		this.gli_9_1_3_2 = gli_9_1_3_2;
	}
	
	@Length(min=0, max=64, message="室管膜肿瘤长度不能超过 64 个字符")
	public String getGli_9_1_3_3() {
		return gli_9_1_3_3;
	}

	public void setGli_9_1_3_3(String gli_9_1_3_3) {
		this.gli_9_1_3_3 = gli_9_1_3_3;
	}
	
	@Length(min=0, max=64, message="其它胶质瘤长度不能超过 64 个字符")
	public String getGli_9_1_3_4() {
		return gli_9_1_3_4;
	}

	public void setGli_9_1_3_4(String gli_9_1_3_4) {
		this.gli_9_1_3_4 = gli_9_1_3_4;
	}
	
	@Length(min=0, max=64, message="脉络丛肿瘤长度不能超过 64 个字符")
	public String getGli_9_1_3_5() {
		return gli_9_1_3_5;
	}

	public void setGli_9_1_3_5(String gli_9_1_3_5) {
		this.gli_9_1_3_5 = gli_9_1_3_5;
	}
	
	@Length(min=0, max=64, message="其它病理诊断分级名称长度不能超过 64 个字符")
	public String getGli_9_1_3_6() {
		return gli_9_1_3_6;
	}

	public void setGli_9_1_3_6(String gli_9_1_3_6) {
		this.gli_9_1_3_6 = gli_9_1_3_6;
	}
	
	@Length(min=0, max=64, message="手术野皮肤准备常用方法的选择长度不能超过 64 个字符")
	public String getCm_3_1() {
		return cm_3_1;
	}

	public void setCm_3_1(String cm_3_1) {
		this.cm_3_1 = cm_3_1;
	}
	
	@Length(min=0, max=64, message="使用含抗菌剂长度不能超过 64 个字符")
	public String getCm_3_2() {
		return cm_3_2;
	}

	public void setCm_3_2(String cm_3_2) {
		this.cm_3_2 = cm_3_2;
	}
	
	@Length(min=0, max=64, message="其他含抗菌剂缝线填写长度不能超过 64 个字符")
	public String getCm_3_2_1() {
		return cm_3_2_1;
	}

	public void setCm_3_2_1(String cm_3_2_1) {
		this.cm_3_2_1 = cm_3_2_1;
	}
	
	@Length(min=0, max=64, message="手术切口类别的选择长度不能超过 64 个字符")
	public String getCm_3_3() {
		return cm_3_3;
	}

	public void setCm_3_3(String cm_3_3) {
		this.cm_3_3 = cm_3_3;
	}
	
	@Length(min=0, max=64, message="手术切口愈合情况的选择长度不能超过 64 个字符")
	public String getCm_3_4() {
		return cm_3_4;
	}

	public void setCm_3_4(String cm_3_4) {
		this.cm_3_4 = cm_3_4;
	}
	
	@Length(min=0, max=64, message="是否为Ⅱ级以上长度不能超过 64 个字符")
	public String getGli_11_1_1() {
		return gli_11_1_1;
	}

	public void setGli_11_1_1(String gli_11_1_1) {
		this.gli_11_1_1 = gli_11_1_1;
	}
	
	@Length(min=0, max=64, message="是否进行免疫组化检测长度不能超过 64 个字符")
	public String getGli_11_1_2() {
		return gli_11_1_2;
	}

	public void setGli_11_1_2(String gli_11_1_2) {
		this.gli_11_1_2 = gli_11_1_2;
	}
	
	@Length(min=0, max=64, message="是否进行分子病理学检测长度不能超过 64 个字符")
	public String getGli_11_1_3() {
		return gli_11_1_3;
	}

	public void setGli_11_1_3(String gli_11_1_3) {
		this.gli_11_1_3 = gli_11_1_3;
	}
	
	@Length(min=0, max=64, message="检测内容长度不能超过 64 个字符")
	public String getGli_11_1_4() {
		return gli_11_1_4;
	}

	public void setGli_11_1_4(String gli_11_1_4) {
		this.gli_11_1_4 = gli_11_1_4;
	}
	
	@Length(min=0, max=64, message="出院前存在功能残损长度不能超过 64 个字符")
	public String getGli_12_1_1() {
		return gli_12_1_1;
	}

	public void setGli_12_1_1(String gli_12_1_1) {
		this.gli_12_1_1 = gli_12_1_1;
	}
	
	@Length(min=0, max=64, message="其它功能残损长度不能超过 64 个字符")
	public String getGli_12_1_1_1() {
		return gli_12_1_1_1;
	}

	public void setGli_12_1_1_1(String gli_12_1_1_1) {
		this.gli_12_1_1_1 = gli_12_1_1_1;
	}
	
	@Length(min=0, max=64, message="出院前是否完成KPS评分长度不能超过 64 个字符")
	public String getGli_12_1_2() {
		return gli_12_1_2;
	}

	public void setGli_12_1_2(String gli_12_1_2) {
		this.gli_12_1_2 = gli_12_1_2;
	}
	
	@Length(min=0, max=64, message="KPS评分要素长度不能超过 64 个字符")
	public String getGli_12_1_3() {
		return gli_12_1_3;
	}

	public void setGli_12_1_3(String gli_12_1_3) {
		this.gli_12_1_3 = gli_12_1_3;
	}
	
	@Length(min=0, max=64, message="行走评估结果长度不能超过 64 个字符")
	public String getGli_13_1_2_1() {
		return gli_13_1_2_1;
	}

	public void setGli_13_1_2_1(String gli_13_1_2_1) {
		this.gli_13_1_2_1 = gli_13_1_2_1;
	}
	
	@Length(min=0, max=64, message="呼吸评估结果长度不能超过 64 个字符")
	public String getGli_13_1_2_2() {
		return gli_13_1_2_2;
	}

	public void setGli_13_1_2_2(String gli_13_1_2_2) {
		this.gli_13_1_2_2 = gli_13_1_2_2;
	}
	
	@Length(min=0, max=64, message="饮食评估结果长度不能超过 64 个字符")
	public String getGli_13_1_2_3() {
		return gli_13_1_2_3;
	}

	public void setGli_13_1_2_3(String gli_13_1_2_3) {
		this.gli_13_1_2_3 = gli_13_1_2_3;
	}
	
	@Length(min=0, max=64, message="吞咽评估结果长度不能超过 64 个字符")
	public String getGli_13_1_2_4() {
		return gli_13_1_2_4;
	}

	public void setGli_13_1_2_4(String gli_13_1_2_4) {
		this.gli_13_1_2_4 = gli_13_1_2_4;
	}
	
	@Length(min=0, max=64, message="压疮评估无法确定或无记录长度不能超过 64 个字符")
	public String getGli_13_1_2_5_3() {
		return gli_13_1_2_5_3;
	}

	public void setGli_13_1_2_5_3(String gli_13_1_2_5_3) {
		this.gli_13_1_2_5_3 = gli_13_1_2_5_3;
	}
	
	public Double getGli_13_1_2_5() {
		return gli_13_1_2_5;
	}

	public void setGli_13_1_2_5(Double gli_13_1_2_5) {
		this.gli_13_1_2_5 = gli_13_1_2_5;
	}
	
	@Length(min=0, max=64, message="压疮评估结果选择长度不能超过 64 个字符")
	public String getGli_13_1_2_5_1() {
		return gli_13_1_2_5_1;
	}

	public void setGli_13_1_2_5_1(String gli_13_1_2_5_1) {
		this.gli_13_1_2_5_1 = gli_13_1_2_5_1;
	}
	
	@Length(min=0, max=64, message="是否进行预防压疮告知长度不能超过 64 个字符")
	public String getGli_13_1_2_5_2() {
		return gli_13_1_2_5_2;
	}

	public void setGli_13_1_2_5_2(String gli_13_1_2_5_2) {
		this.gli_13_1_2_5_2 = gli_13_1_2_5_2;
	}
	
	@Length(min=0, max=64, message="神经系统评估长度不能超过 64 个字符")
	public String getGli_13_1_6() {
		return gli_13_1_6;
	}

	public void setGli_13_1_6(String gli_13_1_6) {
		this.gli_13_1_6 = gli_13_1_6;
	}
	
	@Length(min=0, max=64, message="实施术前健康教育有记录长度不能超过 64 个字符")
	public String getGli_13_1_3_2() {
		return gli_13_1_3_2;
	}

	public void setGli_13_1_3_2(String gli_13_1_3_2) {
		this.gli_13_1_3_2 = gli_13_1_3_2;
	}
	
	@Length(min=0, max=64, message="其它术前健康教育记录长度不能超过 64 个字符")
	public String getGli_13_1_3_2_1() {
		return gli_13_1_3_2_1;
	}

	public void setGli_13_1_3_2_1(String gli_13_1_3_2_1) {
		this.gli_13_1_3_2_1 = gli_13_1_3_2_1;
	}
	
	@Length(min=0, max=64, message="实施术后健康教育有记录长度不能超过 64 个字符")
	public String getGli_13_1_3_3() {
		return gli_13_1_3_3;
	}

	public void setGli_13_1_3_3(String gli_13_1_3_3) {
		this.gli_13_1_3_3 = gli_13_1_3_3;
	}
	
	@Length(min=0, max=64, message="其它术后健康教育记录长度不能超过 64 个字符")
	public String getGli_13_1_3_3_1() {
		return gli_13_1_3_3_1;
	}

	public void setGli_13_1_3_3_1(String gli_13_1_3_3_1) {
		this.gli_13_1_3_3_1 = gli_13_1_3_3_1;
	}
	
	@Length(min=0, max=64, message="交与患者“出院小结”的副本，并告知患者出院时风险因素长度不能超过 64 个字符")
	public String getGli_13_2_2_1() {
		return gli_13_2_2_1;
	}

	public void setGli_13_2_2_1(String gli_13_2_2_1) {
		this.gli_13_2_2_1 = gli_13_2_2_1;
	}
	
	@Length(min=0, max=64, message="出院带药长度不能超过 64 个字符")
	public String getGli_13_2_2_2() {
		return gli_13_2_2_2;
	}

	public void setGli_13_2_2_2(String gli_13_2_2_2) {
		this.gli_13_2_2_2 = gli_13_2_2_2;
	}
	
	@Length(min=0, max=64, message="告知发生紧急情况时求援救治途径长度不能超过 64 个字符")
	public String getGli_13_2_2_3() {
		return gli_13_2_2_3;
	}

	public void setGli_13_2_2_3(String gli_13_2_2_3) {
		this.gli_13_2_2_3 = gli_13_2_2_3;
	}
	
	@Length(min=0, max=64, message="出院时教育与随访长度不能超过 64 个字符")
	public String getGli_13_2_2_4() {
		return gli_13_2_2_4;
	}

	public void setGli_13_2_2_4(String gli_13_2_2_4) {
		this.gli_13_2_2_4 = gli_13_2_2_4;
	}
	
	@Length(min=0, max=64, message="告知何为风险因素与紧急情况长度不能超过 64 个字符")
	public String getGli_13_2_2_5() {
		return gli_13_2_2_5;
	}

	public void setGli_13_2_2_5(String gli_13_2_2_5) {
		this.gli_13_2_2_5 = gli_13_2_2_5;
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