/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.cap.entity;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.jeesite.common.mybatis.annotation.JoinTable;
import com.jeesite.common.mybatis.annotation.JoinTable.Type;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.constraints.NotNull;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * Cap社区获得性肺炎（儿童，首次住院）Entity
 * @author 卡卡西
 * @version 2021-02-06
 */
@Table(name="quality_cap", alias="a", columns={
		@Column(name="cm_0_1_1_1", attrName="cm_0_1_1_1", label="质控医师"),
		@Column(name="cm_0_1_1_2", attrName="cm_0_1_1_2", label="质控护士"),
		@Column(name="cm_0_1_1_3", attrName="cm_0_1_1_3", label="主治医师"),
		@Column(name="cm_0_1_1_4", attrName="cm_0_1_1_4", label="责任护士"),
		@Column(name="cm_0_1_1_5", attrName="cm_0_1_1_5", label="上报科室"),
		@Column(name="caseid", attrName="caseid", label="患儿病案号"),
		@Column(name="cm_0_1_3_1", attrName="cm_0_1_3_1", label="主要诊断ICD-10四位亚目编码与名称"),
		@Column(name="cm_0_1_3_2", attrName="cm_0_1_3_2", label="主要诊断ICD-10六位临床扩展编码与名称"),
		@Column(name="cm_0_1_4_1", attrName="cm_0_1_4_1", label="主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称"),
		@Column(name="cap_0_1_4_1", attrName="cap_0_1_4_1", label="其他主要手术操作ICD-9-CM-3四位亚目编码与名称"),
		@Column(name="cm_0_1_4_2", attrName="cm_0_1_4_2", label="主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称"),
		@Column(name="cap_0_1_5_1", attrName="cap_0_1_5_1", label="其他主要手术操作ICD-9-CM-3六位临床扩展编码与名称"),
		@Column(name="cm_0_1_5", attrName="cm_0_1_5", label="是否出院后31天内重复住院"),
		@Column(name="cm_0_2_1_1", attrName="cm_0_2_1_1", label="出生日期"),
		@Column(name="cm_0_2_1_2", attrName="cm_0_2_1_2", label="患儿性别"),
		@Column(name="cm_0_2_1_3", attrName="cm_0_2_1_3", label="患儿体重", comment="患儿体重（kg）"),
		@Column(name="cm_0_2_1_5", attrName="cm_0_2_1_5", label="患儿身高", comment="患儿身高（cm）"),
		@Column(name="cm_0_2_2_1", attrName="cm_0_2_2_1", label="发病日期时间是否无法确定或无记录"),
		@Column(name="cm_0_2_2_2", attrName="cm_0_2_2_2", label="发病日期时间"),
		@Column(name="cm_0_2_3_1", attrName="cm_0_2_3_1", label="到达本院急诊或者门诊日期时间是否无法确定或无记录"),
		@Column(name="cm_0_2_3_2", attrName="cm_0_2_3_2", label="到达本院急诊或者门诊日期时间"),
		@Column(name="cm_0_2_4_1", attrName="cm_0_2_4_1", label="入院日期时间"),
		@Column(name="cm_0_2_4_2", attrName="cm_0_2_4_2", label="出院日期时间"),
		@Column(name="cm_0_2_5_1", attrName="cm_0_2_5_1", label="入住ICU/RCU日期时间"),
		@Column(name="cm_0_2_5_2", attrName="cm_0_2_5_2", label="离开ICU/RCU日期时间"),
		@Column(name="cm_0_3_1", attrName="cm_0_3_1", label="费用支付方式"),
		@Column(name="cm_0_3_2", attrName="cm_0_3_2", label="收入住院途径"),
		@Column(name="cm_0_3_3", attrName="cm_0_3_3", label="到院交通工具"),
		@Column(name="cap_1_1_0", attrName="cap_1_1_0", label="是否有重症肺炎的高危因素"),
		@Column(name="cap_1_1_1", attrName="cap_1_1_1", label="重症肺炎的高危因素"),
        @Column(name = "cap_1_1_1_1",attrName = "cap_1_1_1_1",label = "其他高危因素"),
		@Column(name="cap_1_1_2", attrName="cap_1_1_2", label="符合重症肺炎"),
		@Column(name="cap_1_1_3", attrName="cap_1_1_3", label="符合以下情况之一,需住院"),
		@Column(name="cap_1_2_1", attrName="cap_1_2_1", label="是否符合重症"),
		@Column(name="cap_1_2_2", attrName="cap_1_2_2", label="重度肺炎表现"),
		@Column(name="cap_1_2_3", attrName="cap_1_2_3", label="符合重症住院及住ICU/RCU标准"),
		@Column(name="cap_1_3_1", attrName="cap_1_3_1", label="是否接种肺炎链球菌疫苗和", comment="是否接种肺炎链球菌疫苗和（或）流感疫苗的"),
		@Column(name="cap_2_1", attrName="cap_2_1", label="实施首次氧合评估", comment="实施首次氧合评估（首次）"),
		@Column(name="cap_2_2", attrName="cap_2_2", label="实施首次氧合评估时段"),
		@Column(name="cap_2_3", attrName="cap_2_3", label="实施首次氧合评估时是否吸氧", comment="实施首次氧合评估时是否吸氧（FiO₂）"),
		@Column(name="cap_2_4", attrName="cap_2_4", label="动脉血气分析/指氧仪检查"),
		@Column(name="cap_2_4_3", attrName="cap_2_4_3", label="动脉血气分析值", comment="动脉血气分析值(mmHg)"),
		@Column(name="cap_2_4_4", attrName="cap_2_4_4", label="指氧仪检查值", comment="指氧仪检查值(%)"),
		@Column(name="cap_3_1_1", attrName="cap_3_1_1", label="是否为重症并收入ICU/RCU的患儿"),
		@Column(name="cap_3_2_1", attrName="cap_3_2_1", label="是否入院之前已经经接受抗菌药物治疗"),
		@Column(name="cap_3_2_2", attrName="cap_3_2_2", label="实施首次采集标本时段"),
		@Column(name="cap_3_2_3", attrName="cap_3_2_3", label="实施首次采集什么标本"),
		@Column(name="cap_3_2_4", attrName="cap_3_2_4", label="采集标本日期时间"),
		@Column(name="cap_3_3_1", attrName="cap_3_3_1", label="细菌学检查项目的选择"),
		@Column(name="cap_3_3_1_1", attrName="cap_3_3_1_1", label="其他细菌学检查项目"),
		@Column(name="cap_3_3_2", attrName="cap_3_3_2", label="病毒学检查项目的选择"),
		@Column(name="cap_3_3_2_1", attrName="cap_3_3_2_1", label="其他病毒学检查项目"),
		@Column(name="cap_3_3_3", attrName="cap_3_3_3", label="肺炎支原体检查项目的选择"),
		@Column(name="cap_3_3_3_1", attrName="cap_3_3_3_1", label="其他肺炎支原体检查项目"),
		@Column(name="cap_3_4_4", attrName="cap_3_4_4", label="是否进行实验室检查"),
		@Column(name="cap_3_4_2", attrName="cap_3_4_2", label="临床实验室检查项目的选择"),
		@Column(name="cap_3_4_2_1", attrName="cap_3_4_2_1", label="其他临床实验室检查项目"),
		@Column(name="cap_3_5_1", attrName="cap_3_5_1", label="病原学检测结果"),
		@Column(name="cap_3_5_1_1", attrName="cap_3_5_1_1", label="其他病原学检测结果"),
		@Column(name="cap_3_5_2", attrName="cap_3_5_2", label="获得病原学诊断报告结果的日期时间"),
		@Column(name="cap_4_0", attrName="cap_4_0", label="患儿有无接受抗菌药物治疗"),
		@Column(name="cap_4_1_2", attrName="cap_4_1_2", label="患儿入院后接受首剂抗菌药物治疗", comment="患儿入院后接受首剂抗菌药物治疗（注射剂输入/注射）时间"),
		@Column(name="cap_4_1_3", attrName="cap_4_1_3", label="接受入院后首剂抗菌药物使用时机 DTN"),
		@Column(name="cap_4_1_4", attrName="cap_4_1_4", label="使用首剂抗菌药物治疗途径"),
		@Column(name="cap_4_1_5", attrName="cap_4_1_5", label="抗菌药物注射剂输入/注射治疗终止日期与时间"),
		@Column(name="cap_4_2_1", attrName="cap_4_2_1", label="是否抗菌药物注射剂改口服"),
		@Column(name="cap_4_2_2", attrName="cap_4_2_2", label="抗菌药物注射剂改口服日期与时间"),
		@Column(name="cap_5_1_1", attrName="cap_5_1_1", label="拟诊需抗感染治疗肺炎缘由"),
		@Column(name="cap_5_1_1_1", attrName="cap_5_1_1_1", label="其他类型肺炎"),
		@Column(name="cap_5_1_2", attrName="cap_5_1_2", label="是否需进行抗感染治疗"),
		@Column(name="cap_5_2_1", attrName="cap_5_2_1", label="抗感染治疗药物选择"),
		@Column(name="cap_5_2_2", attrName="cap_5_2_2", label="青霉素类抗感染药物"),
		@Column(name="cap_5_2_2_1", attrName="cap_5_2_2_1", label="其它青霉素抗菌药"),
		@Column(name="cap_5_2_3", attrName="cap_5_2_3", label="头孢菌素类抗感染药物"),
		@Column(name="cap_5_2_3_1", attrName="cap_5_2_3_1", label="其它头孢菌素抗菌药"),
		@Column(name="cap_5_2_4", attrName="cap_5_2_4", label="大环内酯类抗感染药物"),
		@Column(name="cap_5_2_4_1", attrName="cap_5_2_4_1", label="其它大环内酯抗菌药"),
		@Column(name="cap_5_2_6", attrName="cap_5_2_6", label="神经氨酸抑制剂"),
		@Column(name="cap_5_2_6_1", attrName="cap_5_2_6_1", label="神经氨酸抑制剂"),
		@Column(name="cap_5_2_5", attrName="cap_5_2_5", label="其他类抗感染药物"),
		@Column(name="cap_5_2_5_1", attrName="cap_5_2_5_1", label="其他类抗菌药"),
		@Column(name="cap_6_1_1", attrName="cap_6_1_1", label="初始治疗72小时后是否进行评价"),
		@Column(name="cap_6_1_2", attrName="cap_6_1_2", label="评价结论"),
		@Column(name="cap_6_1_3", attrName="cap_6_1_3", label="初始治疗72小时后评价有效者下一步治疗方案"),
		@Column(name="cap_6_1_4", attrName="cap_6_1_4", label="是否进行重复病原学检查"),
		@Column(name="cap_6_1_5", attrName="cap_6_1_5", label="初始治疗72小时后无效常见原因"),
		@Column(name="cap_6_1_5_1", attrName="cap_6_1_5_1", label="其它原因"),
		@Column(name="cap_6_1_6", attrName="cap_6_1_6", label="病原学检查项目选择"),
		@Column(name="cap_6_1_6_1", attrName="cap_6_1_6_1", label="其它检查"),
		@Column(name="cap_6_1_7", attrName="cap_6_1_7", label="重复病原学诊断结果选择"),
		@Column(name="cap_6_1_7_1", attrName="cap_6_1_7_1", label="其它重复病原学诊断结果"),
		@Column(name="cap_6_1_8", attrName="cap_6_1_8", label="获得病原学诊断报告结果的日期时间"),
		@Column(name="cap_6_2_1", attrName="cap_6_2_1", label="病原针对性治疗情况"),
		@Column(name="cap_6_2_2", attrName="cap_6_2_2", label="抗感染治疗药物选择"),
		@Column(name="cap_6_2_3", attrName="cap_6_2_3", label="青霉素类抗感染药物"),
		@Column(name="cap_6_2_3_1", attrName="cap_6_2_3_1", label="其它青霉素抗菌药"),
		@Column(name="cap_6_2_4", attrName="cap_6_2_4", label="头孢菌素类抗感染药物"),
		@Column(name="cap_6_2_4_1", attrName="cap_6_2_4_1", label="其它头孢菌素抗菌药"),
		@Column(name="cap_6_2_5", attrName="cap_6_2_5", label="大环内酯类抗感染药物"),
		@Column(name="cap_6_2_5_1", attrName="cap_6_2_5_1", label="其它大环内酯抗菌药"),
		@Column(name="cap_6_2_6", attrName="cap_6_2_6", label="其他类抗感染药物"),
		@Column(name="cap_6_2_6_1", attrName="cap_6_2_6_1", label="其他类抗菌药"),
		@Column(name="cap_6_2_7", attrName="cap_6_2_7", label="神经氨酸抑制剂"),
		@Column(name="cap_6_2_7_1", attrName="cap_6_2_7_1", label="神经氨酸抑制剂"),
		@Column(name="cap_7_1_1", attrName="cap_7_1_1", label="是否使用氧疗与呼吸支持治疗"),
		@Column(name="cap_7_2_1", attrName="cap_7_2_1", label="是否使用普通氧疗"),
		@Column(name="cap_7_2_2", attrName="cap_7_2_2", label="普通氧疗指征"),
		@Column(name="cap_7_2_5", attrName="cap_7_2_5", label="给予氧疗医嘱"),
		@Column(name="cap_7_2_6", attrName="cap_7_2_6", label="普通氧疗起始日期与时间"),
		@Column(name="cap_7_2_7", attrName="cap_7_2_7", label="普通氧疗终止日期与时间"),
		@Column(name="cap_7_2_8", attrName="cap_7_2_8", label="使用普通氧疗治疗天数"),
		@Column(name="cap_7_3_1", attrName="cap_7_3_1", label="是否使用无创通气"),
		@Column(name="cap_7_3_2", attrName="cap_7_3_2", label="无创通气指征"),
		@Column(name="cap_7_3_3", attrName="cap_7_3_3", label="无创通气治疗起始日期与时间"),
		@Column(name="cap_7_3_4", attrName="cap_7_3_4", label="无创通气治疗终止日期与时间"),
		@Column(name="cap_7_3_5", attrName="cap_7_3_5", label="使用无创通气治疗小时数"),
		@Column(name="cap_7_4_1", attrName="cap_7_4_1", label="是否使用有创机械通气"),
		@Column(name="cap_7_4_2", attrName="cap_7_4_2", label="机械通气指征"),
		@Column(name="cap_7_4_3", attrName="cap_7_4_3", label="有创机械通气治疗起始日期与时间"),
		@Column(name="cap_7_4_4", attrName="cap_7_4_4", label="有创机械通气治疗终止日期与时间"),
		@Column(name="cap_7_4_5", attrName="cap_7_4_5", label="使用有创机械通气治疗小时数"),
		@Column(name="cap_7_5_1", attrName="cap_7_5_1", label="是否使用体外膜肺"),
		@Column(name="cap_7_5_2", attrName="cap_7_5_2", label="ECMO指征"),
		@Column(name="cap_7_5_3", attrName="cap_7_5_3", label="体外膜肺治疗起始日期与时间"),
		@Column(name="cap_7_5_4", attrName="cap_7_5_4", label="体外膜肺治疗终止日期与时间"),
		@Column(name="cap_7_5_5", attrName="cap_7_5_5", label="使用体外膜肺治疗小时数"),
		@Column(name="cm_7_2_1", attrName="cm_7_2_1", label="交与患儿/患儿家长“出院小结”的副本告知出院时风险因素"),
		@Column(name="cm_7_2_2", attrName="cm_7_2_2", label="出院带药"),
		@Column(name="cm_7_2_3", attrName="cm_7_2_3", label="告知何为发生紧急意外情况或者疾病复发"),
		@Column(name="cm_7_2_4", attrName="cm_7_2_4", label="告知发生紧急意外情况或者疾病复发如何救治及前途经"),
		@Column(name="cm_7_2_5", attrName="cm_7_2_5", label="出院时教育与随访"),
		@Column(name="cap_9_1_1_1", attrName="cap_9_1_1_1", label="经有效治疗后，患儿病情明显好转,可以出院"),
        @Column(name = "cap_9_1_1_2", attrName = "cap_9_1_1_2", label = "其他出院评估"),
		@Column(name="cap_9_2_1", attrName="cap_9_2_1", label="出院前末次氧合评估"),
		@Column(name="cap_9_2_2", attrName="cap_9_2_2", label="末次氧合评估项目"),
		@Column(name="cap_9_2_2_1", attrName="cap_9_2_2_1", label="测定值", comment="测定值(%)"),
		@Column(name="cap_9_2_2_2", attrName="cap_9_2_2_2", label="测定值", comment="测定值(mmHg)"),
		@Column(name="cm_4_3", attrName="cm_4_3", label="离院方式选择"),
		@Column(name="cm_4_5", attrName="cm_4_5", label="非医嘱离院可能涉及因素"),
		@Column(name="cm_4_4_1", attrName="cm_4_4_1", label="其他非医嘱离院因素填写"),
		@Column(name="cm_4_6", attrName="cm_4_6", label="死亡可能涉及因素"),
		@Column(name="cm_5_1", attrName="cm_5_1", label="患儿家长对服务的体验与评价"),
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
		@Column(name="cap_11_1_1", attrName="cap_11_1_1", label="患儿接受首剂抗菌药物治疗注射剂输入/注射日期时间"),
		@Column(name="cap_11_1_2", attrName="cap_11_1_2", label="患儿接受未剂抗菌药物治疗注射剂输入/注射日期时间"),
		@Column(name="cap_11_1_3", attrName="cap_11_1_3", label="注射剂输入/注射抗菌药物疗程", comment="注射剂输入/注射抗菌药物疗程（天数）"),
		@Column(name="cap_11_2_1", attrName="cap_11_2_1", label="是否抗菌药物注射剂改口服"),
		@Column(name="cap_11_2_2", attrName="cap_11_2_2", label="改用抗菌药物口服剂首剂日期与时间"),
		@Column(name="cap_11_2_3", attrName="cap_11_2_3", label="末剂抗菌药物口服剂或出院日期与时间"),
		@Column(name="cap_11_2_4", attrName="cap_11_2_4", label="口服剂抗菌药物疗程", comment="口服剂抗菌药物疗程（天数）"),
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
public class QualityCap extends DataEntity<QualityCap> {
	
	private static final long serialVersionUID = 1L;
	private String cm_0_1_1_1;		// 质控医师
	private String cm_0_1_1_2;		// 质控护士
	private String cm_0_1_1_3;		// 主治医师
	private String cm_0_1_1_4;		// 责任护士
	private String cm_0_1_1_5;		// 上报科室
	private String caseid;		    // 患儿病案号
	private String cm_0_1_3_1;		// 主要诊断ICD-10四位亚目编码与名称
	private String cm_0_1_3_2;		// 主要诊断ICD-10六位临床扩展编码与名称
	private String cm_0_1_4_1;		// 主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称
	private String cap_0_1_4_1;		// 其他主要手术操作ICD-9-CM-3四位亚目编码与名称
	private String cm_0_1_4_2;		// 主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称
	private String cap_0_1_5_1;		// 其他主要手术操作ICD-9-CM-3六位临床扩展编码与名称
	private String cm_0_1_5;		// 是否出院后31天内重复住院
	private Date cm_0_2_1_1;		// 出生日期
	private String cm_0_2_1_2;		// 患儿性别
	private Double cm_0_2_1_3;		// 患儿体重（kg）
	private Double cm_0_2_1_5;		// 患儿身高（cm）
	private String cm_0_2_2_1;		// 发病日期时间是否无法确定或无记录
	private Date cm_0_2_2_2;		// 发病日期时间
	private String cm_0_2_3_1;		// 到达本院急诊或者门诊日期时间是否无法确定或无记录
	private Date cm_0_2_3_2;		// 到达本院急诊或者门诊日期时间
	private Date cm_0_2_4_1;		// 入院日期时间
    private Date cm_0_2_4_2;		// 出院日期时间
	private Date cm_0_2_5_1;		// 入住ICU/RCU日期时间
	private Date cm_0_2_5_2;		// 离开ICU/RCU日期时间
	private String cm_0_3_1;		// 费用支付方式
	private String cm_0_3_2;		// 收入住院途径
	private String cm_0_3_3;		// 到院交通工具
	private String cap_1_1_0;		// 是否有重症肺炎的高危因素
	private String cap_1_1_1;		// 重症肺炎的高危因素
    private String cap_1_1_1_1;     //其他高危因素
	private String cap_1_1_2;		// 符合重症肺炎
	private String cap_1_1_3;		// 符合以下情况之一,需住院
	private String cap_1_2_1;		// 是否符合重症
	private String cap_1_2_2;		// 重度肺炎表现
	private String cap_1_2_3;		// 符合重症住院及住ICU/RCU标准
	private String cap_1_3_1;		// 是否接种肺炎链球菌疫苗和（或）流感疫苗的
	private String cap_2_1;		// 实施首次氧合评估（首次）
	private String cap_2_2;		// 实施首次氧合评估时段
	private String cap_2_3;		// 实施首次氧合评估时是否吸氧（FiO₂）
	private String cap_2_4;		// 动脉血气分析/指氧仪检查
	private Double cap_2_4_3;		// 动脉血气分析值(mmHg)
	private Double cap_2_4_4;		// 指氧仪检查值(%)
	private String cap_3_1_1;		// 是否为重症并收入ICU/RCU的患儿
	private String cap_3_2_1;		// 是否入院之前已经经接受抗菌药物治疗
	private String cap_3_2_2;		// 实施首次采集标本时段
	private String cap_3_2_3;		// 实施首次采集什么标本
	private Date cap_3_2_4;		// 采集标本日期时间
	private String cap_3_3_1;		// 细菌学检查项目的选择
	private String cap_3_3_1_1;		// 其他细菌学检查项目
	private String cap_3_3_2;		// 病毒学检查项目的选择
	private String cap_3_3_2_1;		// 其他病毒学检查项目
	private String cap_3_3_3;		// 肺炎支原体检查项目的选择
	private String cap_3_3_3_1;		// 其他肺炎支原体检查项目
	private String cap_3_4_4;		// 是否进行实验室检查
	private String cap_3_4_2;		// 临床实验室检查项目的选择
	private String cap_3_4_2_1;		// 其他临床实验室检查项目
	private String cap_3_5_1;		// 病原学检测结果
	private String cap_3_5_1_1;		// 其他病原学检测结果
	private Date cap_3_5_2;		// 获得病原学诊断报告结果的日期时间
	private String cap_4_0;		// 患儿有无接受抗菌药物治疗
	private Date cap_4_1_2;		// 患儿入院后接受首剂抗菌药物治疗（注射剂输入/注射）时间
	private String cap_4_1_3;		// 接受入院后首剂抗菌药物使用时机 DTN
	private String cap_4_1_4;		// 使用首剂抗菌药物治疗途径
	private Date cap_4_1_5;		// 抗菌药物注射剂输入/注射治疗终止日期与时间
	private String cap_4_2_1;		// 是否抗菌药物注射剂改口服
	private Date cap_4_2_2;		// 抗菌药物注射剂改口服日期与时间
	private String cap_5_1_1;		// 拟诊需抗感染治疗肺炎缘由
	private String cap_5_1_1_1;		// 其他类型肺炎
	private String cap_5_1_2;		// 是否需进行抗感染治疗
	private String cap_5_2_1;		// 抗感染治疗药物选择
	private String cap_5_2_2;		// 青霉素类抗感染药物
	private String cap_5_2_2_1;		// 其它青霉素抗菌药
	private String cap_5_2_3;		// 头孢菌素类抗感染药物
	private String cap_5_2_3_1;		// 其它头孢菌素抗菌药
	private String cap_5_2_4;		// 大环内酯类抗感染药物
	private String cap_5_2_4_1;		// 其它大环内酯抗菌药
	private String cap_5_2_6;		// 神经氨酸抑制剂
	private String cap_5_2_6_1;		// 神经氨酸抑制剂
	private String cap_5_2_5;		// 其他类抗感染药物
	private String cap_5_2_5_1;		// 其他类抗菌药
	private String cap_6_1_1;		// 初始治疗72小时后是否进行评价
	private String cap_6_1_2;		// 评价结论
	private String cap_6_1_3;		// 初始治疗72小时后评价有效者下一步治疗方案
	private String cap_6_1_4;		// 是否进行重复病原学检查
	private String cap_6_1_5;		// 初始治疗72小时后无效常见原因
	private String cap_6_1_5_1;		// 其它原因
	private String cap_6_1_6;		// 病原学检查项目选择
	private String cap_6_1_6_1;		// 其它检查
	private String cap_6_1_7;		// 重复病原学诊断结果选择
	private String cap_6_1_7_1;		// 其它重复病原学诊断结果
	private Date cap_6_1_8;		// 获得病原学诊断报告结果的日期时间
	private String cap_6_2_1;		// 病原针对性治疗情况
	private String cap_6_2_2;		// 抗感染治疗药物选择
	private String cap_6_2_3;		// 青霉素类抗感染药物
	private String cap_6_2_3_1;		// 其它青霉素抗菌药
	private String cap_6_2_4;		// 头孢菌素类抗感染药物
	private String cap_6_2_4_1;		// 其它头孢菌素抗菌药
	private String cap_6_2_5;		// 大环内酯类抗感染药物
	private String cap_6_2_5_1;		// 其它大环内酯抗菌药
	private String cap_6_2_6;		// 其他类抗感染药物
	private String cap_6_2_6_1;		// 其他类抗菌药
	private String cap_6_2_7;		// 神经氨酸抑制剂
	private String cap_6_2_7_1;		// 神经氨酸抑制剂
	private String cap_7_1_1;		// 是否使用氧疗与呼吸支持治疗
	private String cap_7_2_1;		// 是否使用普通氧疗
	private String cap_7_2_2;		// 普通氧疗指征
	private String cap_7_2_5;		// 给予氧疗医嘱
	private Date cap_7_2_6;		// 普通氧疗起始日期与时间
	private Date cap_7_2_7;		// 普通氧疗终止日期与时间
	private Double cap_7_2_8;		// 使用普通氧疗治疗天数
	private String cap_7_3_1;		// 是否使用无创通气
	private String cap_7_3_2;		// 无创通气指征
	private Date cap_7_3_3;		// 无创通气治疗起始日期与时间
	private Date cap_7_3_4;		// 无创通气治疗终止日期与时间
	private Double cap_7_3_5;		// 使用无创通气治疗小时数
	private String cap_7_4_1;		// 是否使用有创机械通气
	private String cap_7_4_2;		// 机械通气指征
	private Date cap_7_4_3;		// 有创机械通气治疗起始日期与时间
	private Date cap_7_4_4;		// 有创机械通气治疗终止日期与时间
	private Double cap_7_4_5;		// 使用有创机械通气治疗小时数
	private String cap_7_5_1;		// 是否使用体外膜肺
	private String cap_7_5_2;		// ECMO指征
	private Date cap_7_5_3;		// 体外膜肺治疗起始日期与时间
	private Date cap_7_5_4;		// 体外膜肺治疗终止日期与时间
	private Double cap_7_5_5;		// 使用体外膜肺治疗小时数
	private String cm_7_2_1;		// 交与患儿/患儿家长“出院小结”的副本告知出院时风险因素
	private String cm_7_2_2;		// 出院带药
	private String cm_7_2_3;		// 告知何为发生紧急意外情况或者疾病复发
	private String cm_7_2_4;		// 告知发生紧急意外情况或者疾病复发如何救治及前途经
	private String cm_7_2_5;		// 出院时教育与随访
	private String cap_9_1_1_1;		// 经有效治疗后，患儿病情明显好转,可以出院
    private String cap_9_1_1_2;     // 其他出院评估
	private String cap_9_2_1;		// 出院前末次氧合评估
	private String cap_9_2_2;		// 末次氧合评估项目
	private Double cap_9_2_2_1;		// 测定值(%)
	private Double cap_9_2_2_2;		// 测定值(mmHg)
	private String cm_4_3;		// 离院方式选择
	private String cm_4_5;		// 非医嘱离院可能涉及因素
	private String cm_4_4_1;		// 其他非医嘱离院因素填写
	private String cm_4_6;		// 死亡可能涉及因素
	private String cm_5_1;		// 患儿家长对服务的体验与评价
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
	private Date cap_11_1_1;		// 患儿接受首剂抗菌药物治疗注射剂输入/注射日期时间
	private Date cap_11_1_2;		// 患儿接受未剂抗菌药物治疗注射剂输入/注射日期时间
	private Double cap_11_1_3;		// 注射剂输入/注射抗菌药物疗程（天数）
	private String cap_11_2_1;		// 是否抗菌药物注射剂改口服
	private Date cap_11_2_2;		// 改用抗菌药物口服剂首剂日期与时间
	private Date cap_11_2_3;		// 末剂抗菌药物口服剂或出院日期与时间
	private Double cap_11_2_4;		// 口服剂抗菌药物疗程（天数）
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
	
	public QualityCap() {
		this(null);
	}

	public QualityCap(String id){
		super(id);
	}
	
	@NotBlank(message="质控医师不能为空")
	@Length(min=0, max=64, message="质控医师长度不能超过 64 个字符")
	public String getCm_0_1_1_1() {
		return cm_0_1_1_1;
	}

	public void setCm_0_1_1_1(String cm_0_1_1_1) {
		this.cm_0_1_1_1 = cm_0_1_1_1;
	}
	
	@NotBlank(message="质控护士不能为空")
	@Length(min=0, max=64, message="质控护士长度不能超过 64 个字符")
	public String getCm_0_1_1_2() {
		return cm_0_1_1_2;
	}

	public void setCm_0_1_1_2(String cm_0_1_1_2) {
		this.cm_0_1_1_2 = cm_0_1_1_2;
	}
	
	@NotBlank(message="主治医师不能为空")
	@Length(min=0, max=64, message="主治医师长度不能超过 64 个字符")
	public String getCm_0_1_1_3() {
		return cm_0_1_1_3;
	}

	public void setCm_0_1_1_3(String cm_0_1_1_3) {
		this.cm_0_1_1_3 = cm_0_1_1_3;
	}
	
	@NotBlank(message="责任护士不能为空")
	@Length(min=0, max=64, message="责任护士长度不能超过 64 个字符")
	public String getCm_0_1_1_4() {
		return cm_0_1_1_4;
	}

	public void setCm_0_1_1_4(String cm_0_1_1_4) {
		this.cm_0_1_1_4 = cm_0_1_1_4;
	}
	
	@NotBlank(message="上报科室不能为空")
	@Length(min=0, max=64, message="上报科室长度不能超过 64 个字符")
	public String getCm_0_1_1_5() {
		return cm_0_1_1_5;
	}

	public void setCm_0_1_1_5(String cm_0_1_1_5) {
		this.cm_0_1_1_5 = cm_0_1_1_5;
	}
	
	@NotBlank(message="患儿病案号不能为空")
	@Length(min=0, max=64, message="患儿病案号长度不能超过 64 个字符")
	public String getCaseid() {
		return caseid;
	}

	public void setCaseid(String caseid) {
		this.caseid = caseid;
	}
	
	@NotBlank(message="主要诊断ICD-10四位亚目编码与名称不能为空")
	@Length(min=0, max=64, message="主要诊断ICD-10四位亚目编码与名称长度不能超过 64 个字符")
	public String getCm_0_1_3_1() {
		return cm_0_1_3_1;
	}

	public void setCm_0_1_3_1(String cm_0_1_3_1) {
		this.cm_0_1_3_1 = cm_0_1_3_1;
	}
	
	@NotBlank(message="主要诊断ICD-10六位临床扩展编码与名称不能为空")
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
	
	@Length(min=0, max=64, message="其他主要手术操作ICD-9-CM-3四位亚目编码与名称长度不能超过 64 个字符")
	public String getCap_0_1_4_1() {
		return cap_0_1_4_1;
	}

	public void setCap_0_1_4_1(String cap_0_1_4_1) {
		this.cap_0_1_4_1 = cap_0_1_4_1;
	}
	
	@Length(min=0, max=64, message="主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称长度不能超过 64 个字符")
	public String getCm_0_1_4_2() {
		return cm_0_1_4_2;
	}

	public void setCm_0_1_4_2(String cm_0_1_4_2) {
		this.cm_0_1_4_2 = cm_0_1_4_2;
	}
	
	@Length(min=0, max=64, message="其他主要手术操作ICD-9-CM-3六位临床扩展编码与名称长度不能超过 64 个字符")
	public String getCap_0_1_5_1() {
		return cap_0_1_5_1;
	}

	public void setCap_0_1_5_1(String cap_0_1_5_1) {
		this.cap_0_1_5_1 = cap_0_1_5_1;
	}
	
	@NotBlank(message="是否出院后31天内重复住院不能为空")
	@Length(min=0, max=64, message="是否出院后31天内重复住院长度不能超过 64 个字符")
	public String getCm_0_1_5() {
		return cm_0_1_5;
	}

	public void setCm_0_1_5(String cm_0_1_5) {
		this.cm_0_1_5 = cm_0_1_5;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="出生日期不能为空")
	public Date getCm_0_2_1_1() {
		return cm_0_2_1_1;
	}

	public void setCm_0_2_1_1(Date cm_0_2_1_1) {
		this.cm_0_2_1_1 = cm_0_2_1_1;
	}
	
	@NotBlank(message="患儿性别不能为空")
	@Length(min=0, max=64, message="患儿性别长度不能超过 64 个字符")
	public String getCm_0_2_1_2() {
		return cm_0_2_1_2;
	}

	public void setCm_0_2_1_2(String cm_0_2_1_2) {
		this.cm_0_2_1_2 = cm_0_2_1_2;
	}
	
	@NotNull(message="患儿体重不能为空")
	public Double getCm_0_2_1_3() {
		return cm_0_2_1_3;
	}

	public void setCm_0_2_1_3(Double cm_0_2_1_3) {
		this.cm_0_2_1_3 = cm_0_2_1_3;
	}
	
	@NotNull(message="患儿身高不能为空")
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
	@NotNull(message="入院日期时间不能为空")
	public Date getCm_0_2_4_1() {
		return cm_0_2_4_1;
	}

	public void setCm_0_2_4_1(Date cm_0_2_4_1) {
		this.cm_0_2_4_1 = cm_0_2_4_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="出院日期时间不能为空")
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
	
	@NotBlank(message="费用支付方式不能为空")
	@Length(min=0, max=64, message="费用支付方式长度不能超过 64 个字符")
	public String getCm_0_3_1() {
		return cm_0_3_1;
	}

	public void setCm_0_3_1(String cm_0_3_1) {
		this.cm_0_3_1 = cm_0_3_1;
	}
	
	@NotBlank(message="收入住院途径不能为空")
	@Length(min=0, max=64, message="收入住院途径长度不能超过 64 个字符")
	public String getCm_0_3_2() {
		return cm_0_3_2;
	}

	public void setCm_0_3_2(String cm_0_3_2) {
		this.cm_0_3_2 = cm_0_3_2;
	}
	
	@NotBlank(message="到院交通工具不能为空")
	@Length(min=0, max=64, message="到院交通工具长度不能超过 64 个字符")
	public String getCm_0_3_3() {
		return cm_0_3_3;
	}

	public void setCm_0_3_3(String cm_0_3_3) {
		this.cm_0_3_3 = cm_0_3_3;
	}
	
	@NotBlank(message="是否有重症肺炎的高危因素不能为空")
	@Length(min=0, max=64, message="是否有重症肺炎的高危因素长度不能超过 64 个字符")
	public String getCap_1_1_0() {
		return cap_1_1_0;
	}

	public void setCap_1_1_0(String cap_1_1_0) {
		this.cap_1_1_0 = cap_1_1_0;
	}
	
	@Length(min=0, max=64, message="重症肺炎的高危因素长度不能超过 64 个字符")
	public String getCap_1_1_1() {
		return cap_1_1_1;
	}

	public void setCap_1_1_1(String cap_1_1_1) {
		this.cap_1_1_1 = cap_1_1_1;
	}
	
	@Length(min=0, max=64, message="符合重症肺炎长度不能超过 64 个字符")
	public String getCap_1_1_2() {
		return cap_1_1_2;
	}

	public void setCap_1_1_2(String cap_1_1_2) {
		this.cap_1_1_2 = cap_1_1_2;
	}
	
	@Length(min=0, max=64, message="符合以下情况之一,需住院长度不能超过 64 个字符")
	public String getCap_1_1_3() {
		return cap_1_1_3;
	}

	public void setCap_1_1_3(String cap_1_1_3) {
		this.cap_1_1_3 = cap_1_1_3;
	}
	
	@Length(min=0, max=64, message="是否符合重症长度不能超过 64 个字符")
	public String getCap_1_2_1() {
		return cap_1_2_1;
	}

	public void setCap_1_2_1(String cap_1_2_1) {
		this.cap_1_2_1 = cap_1_2_1;
	}
	
	@Length(min=0, max=64, message="重度肺炎表现长度不能超过 64 个字符")
	public String getCap_1_2_2() {
		return cap_1_2_2;
	}

	public void setCap_1_2_2(String cap_1_2_2) {
		this.cap_1_2_2 = cap_1_2_2;
	}
	
	@Length(min=0, max=64, message="符合重症住院及住ICU/RCU标准长度不能超过 64 个字符")
	public String getCap_1_2_3() {
		return cap_1_2_3;
	}

	public void setCap_1_2_3(String cap_1_2_3) {
		this.cap_1_2_3 = cap_1_2_3;
	}
	
	@Length(min=0, max=64, message="是否接种肺炎链球菌疫苗和长度不能超过 64 个字符")
	public String getCap_1_3_1() {
		return cap_1_3_1;
	}

	public void setCap_1_3_1(String cap_1_3_1) {
		this.cap_1_3_1 = cap_1_3_1;
	}
	
	@NotBlank(message="实施首次氧合评估不能为空")
	@Length(min=0, max=64, message="实施首次氧合评估长度不能超过 64 个字符")
	public String getCap_2_1() {
		return cap_2_1;
	}

	public void setCap_2_1(String cap_2_1) {
		this.cap_2_1 = cap_2_1;
	}
	
	@Length(min=0, max=64, message="实施首次氧合评估时段长度不能超过 64 个字符")
	public String getCap_2_2() {
		return cap_2_2;
	}

	public void setCap_2_2(String cap_2_2) {
		this.cap_2_2 = cap_2_2;
	}
	
	@Length(min=0, max=64, message="实施首次氧合评估时是否吸氧长度不能超过 64 个字符")
	public String getCap_2_3() {
		return cap_2_3;
	}

	public void setCap_2_3(String cap_2_3) {
		this.cap_2_3 = cap_2_3;
	}
	
	@Length(min=0, max=64, message="动脉血气分析/指氧仪检查长度不能超过 64 个字符")
	public String getCap_2_4() {
		return cap_2_4;
	}

	public void setCap_2_4(String cap_2_4) {
		this.cap_2_4 = cap_2_4;
	}
	
	public Double getCap_2_4_3() {
		return cap_2_4_3;
	}

	public void setCap_2_4_3(Double cap_2_4_3) {
		this.cap_2_4_3 = cap_2_4_3;
	}
	
	public Double getCap_2_4_4() {
		return cap_2_4_4;
	}

	public void setCap_2_4_4(Double cap_2_4_4) {
		this.cap_2_4_4 = cap_2_4_4;
	}
	
	@NotBlank(message="是否为重症并收入ICU/RCU的患儿不能为空")
	@Length(min=0, max=64, message="是否为重症并收入ICU/RCU的患儿长度不能超过 64 个字符")
	public String getCap_3_1_1() {
		return cap_3_1_1;
	}

	public void setCap_3_1_1(String cap_3_1_1) {
		this.cap_3_1_1 = cap_3_1_1;
	}
	
	@NotBlank(message="是否入院之前已经经接受抗菌药物治疗不能为空")
	@Length(min=0, max=64, message="是否入院之前已经经接受抗菌药物治疗长度不能超过 64 个字符")
	public String getCap_3_2_1() {
		return cap_3_2_1;
	}

	public void setCap_3_2_1(String cap_3_2_1) {
		this.cap_3_2_1 = cap_3_2_1;
	}
	
	@NotBlank(message="实施首次采集标本时段不能为空")
	@Length(min=0, max=64, message="实施首次采集标本时段长度不能超过 64 个字符")
	public String getCap_3_2_2() {
		return cap_3_2_2;
	}

	public void setCap_3_2_2(String cap_3_2_2) {
		this.cap_3_2_2 = cap_3_2_2;
	}
	
	@NotBlank(message="实施首次采集什么标本不能为空")
	@Length(min=0, max=64, message="实施首次采集什么标本长度不能超过 64 个字符")
	public String getCap_3_2_3() {
		return cap_3_2_3;
	}

	public void setCap_3_2_3(String cap_3_2_3) {
		this.cap_3_2_3 = cap_3_2_3;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="采集标本日期时间不能为空")
	public Date getCap_3_2_4() {
		return cap_3_2_4;
	}

	public void setCap_3_2_4(Date cap_3_2_4) {
		this.cap_3_2_4 = cap_3_2_4;
	}
	
	@Length(min=0, max=64, message="细菌学检查项目的选择长度不能超过 64 个字符")
	public String getCap_3_3_1() {
		return cap_3_3_1;
	}

	public void setCap_3_3_1(String cap_3_3_1) {
		this.cap_3_3_1 = cap_3_3_1;
	}
	
	@Length(min=0, max=64, message="其他细菌学检查项目长度不能超过 64 个字符")
	public String getCap_3_3_1_1() {
		return cap_3_3_1_1;
	}

	public void setCap_3_3_1_1(String cap_3_3_1_1) {
		this.cap_3_3_1_1 = cap_3_3_1_1;
	}
	
	@NotBlank(message="病毒学检查项目的选择不能为空")
	@Length(min=0, max=64, message="病毒学检查项目的选择长度不能超过 64 个字符")
	public String getCap_3_3_2() {
		return cap_3_3_2;
	}

	public void setCap_3_3_2(String cap_3_3_2) {
		this.cap_3_3_2 = cap_3_3_2;
	}
	
	@Length(min=0, max=64, message="其他病毒学检查项目长度不能超过 64 个字符")
	public String getCap_3_3_2_1() {
		return cap_3_3_2_1;
	}

	public void setCap_3_3_2_1(String cap_3_3_2_1) {
		this.cap_3_3_2_1 = cap_3_3_2_1;
	}
	
	@NotBlank(message="肺炎支原体检查项目的选择不能为空")
	@Length(min=0, max=64, message="肺炎支原体检查项目的选择长度不能超过 64 个字符")
	public String getCap_3_3_3() {
		return cap_3_3_3;
	}

	public void setCap_3_3_3(String cap_3_3_3) {
		this.cap_3_3_3 = cap_3_3_3;
	}
	
	@Length(min=0, max=64, message="其他肺炎支原体检查项目长度不能超过 64 个字符")
	public String getCap_3_3_3_1() {
		return cap_3_3_3_1;
	}

	public void setCap_3_3_3_1(String cap_3_3_3_1) {
		this.cap_3_3_3_1 = cap_3_3_3_1;
	}
	
	@NotBlank(message="是否进行实验室检查不能为空")
	@Length(min=0, max=64, message="是否进行实验室检查长度不能超过 64 个字符")
	public String getCap_3_4_4() {
		return cap_3_4_4;
	}

	public void setCap_3_4_4(String cap_3_4_4) {
		this.cap_3_4_4 = cap_3_4_4;
	}
	
	@Length(min=0, max=64, message="临床实验室检查项目的选择长度不能超过 64 个字符")
	public String getCap_3_4_2() {
		return cap_3_4_2;
	}

	public void setCap_3_4_2(String cap_3_4_2) {
		this.cap_3_4_2 = cap_3_4_2;
	}
	
	@Length(min=0, max=64, message="其他临床实验室检查项目长度不能超过 64 个字符")
	public String getCap_3_4_2_1() {
		return cap_3_4_2_1;
	}

	public void setCap_3_4_2_1(String cap_3_4_2_1) {
		this.cap_3_4_2_1 = cap_3_4_2_1;
	}
	
	@Length(min=0, max=64, message="病原学检测结果长度不能超过 64 个字符")
	public String getCap_3_5_1() {
		return cap_3_5_1;
	}

	public void setCap_3_5_1(String cap_3_5_1) {
		this.cap_3_5_1 = cap_3_5_1;
	}
	
	@Length(min=0, max=64, message="其他病原学检测结果长度不能超过 64 个字符")
	public String getCap_3_5_1_1() {
		return cap_3_5_1_1;
	}

	public void setCap_3_5_1_1(String cap_3_5_1_1) {
		this.cap_3_5_1_1 = cap_3_5_1_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCap_3_5_2() {
		return cap_3_5_2;
	}

	public void setCap_3_5_2(Date cap_3_5_2) {
		this.cap_3_5_2 = cap_3_5_2;
	}
	
	@NotBlank(message="患儿有无接受抗菌药物治疗不能为空")
	@Length(min=0, max=64, message="患儿有无接受抗菌药物治疗长度不能超过 64 个字符")
	public String getCap_4_0() {
		return cap_4_0;
	}

	public void setCap_4_0(String cap_4_0) {
		this.cap_4_0 = cap_4_0;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCap_4_1_2() {
		return cap_4_1_2;
	}

	public void setCap_4_1_2(Date cap_4_1_2) {
		this.cap_4_1_2 = cap_4_1_2;
	}
	
	@Length(min=0, max=64, message="接受入院后首剂抗菌药物使用时机 DTN长度不能超过 64 个字符")
	public String getCap_4_1_3() {
		return cap_4_1_3;
	}

	public void setCap_4_1_3(String cap_4_1_3) {
		this.cap_4_1_3 = cap_4_1_3;
	}
	
	@Length(min=0, max=64, message="使用首剂抗菌药物治疗途径长度不能超过 64 个字符")
	public String getCap_4_1_4() {
		return cap_4_1_4;
	}

	public void setCap_4_1_4(String cap_4_1_4) {
		this.cap_4_1_4 = cap_4_1_4;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCap_4_1_5() {
		return cap_4_1_5;
	}

	public void setCap_4_1_5(Date cap_4_1_5) {
		this.cap_4_1_5 = cap_4_1_5;
	}
	
	@Length(min=0, max=64, message="是否抗菌药物注射剂改口服长度不能超过 64 个字符")
	public String getCap_4_2_1() {
		return cap_4_2_1;
	}

	public void setCap_4_2_1(String cap_4_2_1) {
		this.cap_4_2_1 = cap_4_2_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCap_4_2_2() {
		return cap_4_2_2;
	}

	public void setCap_4_2_2(Date cap_4_2_2) {
		this.cap_4_2_2 = cap_4_2_2;
	}
	
	@NotBlank(message="拟诊需抗感染治疗肺炎缘由不能为空")
	@Length(min=0, max=64, message="拟诊需抗感染治疗肺炎缘由长度不能超过 64 个字符")
	public String getCap_5_1_1() {
		return cap_5_1_1;
	}

	public void setCap_5_1_1(String cap_5_1_1) {
		this.cap_5_1_1 = cap_5_1_1;
	}
	
	@Length(min=0, max=64, message="其他类型肺炎长度不能超过 64 个字符")
	public String getCap_5_1_1_1() {
		return cap_5_1_1_1;
	}

	public void setCap_5_1_1_1(String cap_5_1_1_1) {
		this.cap_5_1_1_1 = cap_5_1_1_1;
	}
	
	@NotBlank(message="是否需进行抗感染治疗不能为空")
	@Length(min=0, max=64, message="是否需进行抗感染治疗长度不能超过 64 个字符")
	public String getCap_5_1_2() {
		return cap_5_1_2;
	}

	public void setCap_5_1_2(String cap_5_1_2) {
		this.cap_5_1_2 = cap_5_1_2;
	}
	
	@NotBlank(message="抗感染治疗药物选择不能为空")
	@Length(min=0, max=64, message="抗感染治疗药物选择长度不能超过 64 个字符")
	public String getCap_5_2_1() {
		return cap_5_2_1;
	}

	public void setCap_5_2_1(String cap_5_2_1) {
		this.cap_5_2_1 = cap_5_2_1;
	}
	
	@Length(min=0, max=64, message="青霉素类抗感染药物长度不能超过 64 个字符")
	public String getCap_5_2_2() {
		return cap_5_2_2;
	}

	public void setCap_5_2_2(String cap_5_2_2) {
		this.cap_5_2_2 = cap_5_2_2;
	}
	
	@Length(min=0, max=64, message="其它青霉素抗菌药长度不能超过 64 个字符")
	public String getCap_5_2_2_1() {
		return cap_5_2_2_1;
	}

	public void setCap_5_2_2_1(String cap_5_2_2_1) {
		this.cap_5_2_2_1 = cap_5_2_2_1;
	}
	
	@Length(min=0, max=64, message="头孢菌素类抗感染药物长度不能超过 64 个字符")
	public String getCap_5_2_3() {
		return cap_5_2_3;
	}

	public void setCap_5_2_3(String cap_5_2_3) {
		this.cap_5_2_3 = cap_5_2_3;
	}
	
	@Length(min=0, max=64, message="其它头孢菌素抗菌药长度不能超过 64 个字符")
	public String getCap_5_2_3_1() {
		return cap_5_2_3_1;
	}

	public void setCap_5_2_3_1(String cap_5_2_3_1) {
		this.cap_5_2_3_1 = cap_5_2_3_1;
	}
	
	@Length(min=0, max=64, message="大环内酯类抗感染药物长度不能超过 64 个字符")
	public String getCap_5_2_4() {
		return cap_5_2_4;
	}

	public void setCap_5_2_4(String cap_5_2_4) {
		this.cap_5_2_4 = cap_5_2_4;
	}
	
	@Length(min=0, max=64, message="其它大环内酯抗菌药长度不能超过 64 个字符")
	public String getCap_5_2_4_1() {
		return cap_5_2_4_1;
	}

	public void setCap_5_2_4_1(String cap_5_2_4_1) {
		this.cap_5_2_4_1 = cap_5_2_4_1;
	}
	
	@Length(min=0, max=64, message="神经氨酸抑制剂长度不能超过 64 个字符")
	public String getCap_5_2_6() {
		return cap_5_2_6;
	}

	public void setCap_5_2_6(String cap_5_2_6) {
		this.cap_5_2_6 = cap_5_2_6;
	}
	
	@Length(min=0, max=64, message="神经氨酸抑制剂长度不能超过 64 个字符")
	public String getCap_5_2_6_1() {
		return cap_5_2_6_1;
	}

	public void setCap_5_2_6_1(String cap_5_2_6_1) {
		this.cap_5_2_6_1 = cap_5_2_6_1;
	}
	
	@Length(min=0, max=64, message="其他类抗感染药物长度不能超过 64 个字符")
	public String getCap_5_2_5() {
		return cap_5_2_5;
	}

	public void setCap_5_2_5(String cap_5_2_5) {
		this.cap_5_2_5 = cap_5_2_5;
	}
	
	@Length(min=0, max=64, message="其他类抗菌药长度不能超过 64 个字符")
	public String getCap_5_2_5_1() {
		return cap_5_2_5_1;
	}

	public void setCap_5_2_5_1(String cap_5_2_5_1) {
		this.cap_5_2_5_1 = cap_5_2_5_1;
	}
	
	@NotBlank(message="初始治疗72小时后是否进行评价不能为空")
	@Length(min=0, max=64, message="初始治疗72小时后是否进行评价长度不能超过 64 个字符")
	public String getCap_6_1_1() {
		return cap_6_1_1;
	}

	public void setCap_6_1_1(String cap_6_1_1) {
		this.cap_6_1_1 = cap_6_1_1;
	}
	
	@Length(min=0, max=64, message="评价结论长度不能超过 64 个字符")
	public String getCap_6_1_2() {
		return cap_6_1_2;
	}

	public void setCap_6_1_2(String cap_6_1_2) {
		this.cap_6_1_2 = cap_6_1_2;
	}
	
	@Length(min=0, max=64, message="初始治疗72小时后评价有效者下一步治疗方案长度不能超过 64 个字符")
	public String getCap_6_1_3() {
		return cap_6_1_3;
	}

	public void setCap_6_1_3(String cap_6_1_3) {
		this.cap_6_1_3 = cap_6_1_3;
	}
	
	@Length(min=0, max=64, message="是否进行重复病原学检查长度不能超过 64 个字符")
	public String getCap_6_1_4() {
		return cap_6_1_4;
	}

	public void setCap_6_1_4(String cap_6_1_4) {
		this.cap_6_1_4 = cap_6_1_4;
	}
	
	@Length(min=0, max=64, message="初始治疗72小时后无效常见原因长度不能超过 64 个字符")
	public String getCap_6_1_5() {
		return cap_6_1_5;
	}

	public void setCap_6_1_5(String cap_6_1_5) {
		this.cap_6_1_5 = cap_6_1_5;
	}
	
	@Length(min=0, max=64, message="其它原因长度不能超过 64 个字符")
	public String getCap_6_1_5_1() {
		return cap_6_1_5_1;
	}

	public void setCap_6_1_5_1(String cap_6_1_5_1) {
		this.cap_6_1_5_1 = cap_6_1_5_1;
	}
	
	@Length(min=0, max=64, message="病原学检查项目选择长度不能超过 64 个字符")
	public String getCap_6_1_6() {
		return cap_6_1_6;
	}

	public void setCap_6_1_6(String cap_6_1_6) {
		this.cap_6_1_6 = cap_6_1_6;
	}
	
	@Length(min=0, max=64, message="其它检查长度不能超过 64 个字符")
	public String getCap_6_1_6_1() {
		return cap_6_1_6_1;
	}

	public void setCap_6_1_6_1(String cap_6_1_6_1) {
		this.cap_6_1_6_1 = cap_6_1_6_1;
	}
	
	@Length(min=0, max=64, message="重复病原学诊断结果选择长度不能超过 64 个字符")
	public String getCap_6_1_7() {
		return cap_6_1_7;
	}

	public void setCap_6_1_7(String cap_6_1_7) {
		this.cap_6_1_7 = cap_6_1_7;
	}
	
	@Length(min=0, max=64, message="其它重复病原学诊断结果长度不能超过 64 个字符")
	public String getCap_6_1_7_1() {
		return cap_6_1_7_1;
	}

	public void setCap_6_1_7_1(String cap_6_1_7_1) {
		this.cap_6_1_7_1 = cap_6_1_7_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCap_6_1_8() {
		return cap_6_1_8;
	}

	public void setCap_6_1_8(Date cap_6_1_8) {
		this.cap_6_1_8 = cap_6_1_8;
	}
	
	@Length(min=0, max=64, message="病原针对性治疗情况长度不能超过 64 个字符")
	public String getCap_6_2_1() {
		return cap_6_2_1;
	}

	public void setCap_6_2_1(String cap_6_2_1) {
		this.cap_6_2_1 = cap_6_2_1;
	}
	
	@Length(min=0, max=64, message="抗感染治疗药物选择长度不能超过 64 个字符")
	public String getCap_6_2_2() {
		return cap_6_2_2;
	}

	public void setCap_6_2_2(String cap_6_2_2) {
		this.cap_6_2_2 = cap_6_2_2;
	}
	
	@Length(min=0, max=64, message="青霉素类抗感染药物长度不能超过 64 个字符")
	public String getCap_6_2_3() {
		return cap_6_2_3;
	}

	public void setCap_6_2_3(String cap_6_2_3) {
		this.cap_6_2_3 = cap_6_2_3;
	}
	
	@Length(min=0, max=64, message="其它青霉素抗菌药长度不能超过 64 个字符")
	public String getCap_6_2_3_1() {
		return cap_6_2_3_1;
	}

	public void setCap_6_2_3_1(String cap_6_2_3_1) {
		this.cap_6_2_3_1 = cap_6_2_3_1;
	}
	
	@Length(min=0, max=64, message="头孢菌素类抗感染药物长度不能超过 64 个字符")
	public String getCap_6_2_4() {
		return cap_6_2_4;
	}

	public void setCap_6_2_4(String cap_6_2_4) {
		this.cap_6_2_4 = cap_6_2_4;
	}
	
	@Length(min=0, max=64, message="其它头孢菌素抗菌药长度不能超过 64 个字符")
	public String getCap_6_2_4_1() {
		return cap_6_2_4_1;
	}

	public void setCap_6_2_4_1(String cap_6_2_4_1) {
		this.cap_6_2_4_1 = cap_6_2_4_1;
	}
	
	@Length(min=0, max=64, message="大环内酯类抗感染药物长度不能超过 64 个字符")
	public String getCap_6_2_5() {
		return cap_6_2_5;
	}

	public void setCap_6_2_5(String cap_6_2_5) {
		this.cap_6_2_5 = cap_6_2_5;
	}
	
	@Length(min=0, max=64, message="其它大环内酯抗菌药长度不能超过 64 个字符")
	public String getCap_6_2_5_1() {
		return cap_6_2_5_1;
	}

	public void setCap_6_2_5_1(String cap_6_2_5_1) {
		this.cap_6_2_5_1 = cap_6_2_5_1;
	}
	
	@Length(min=0, max=64, message="其他类抗感染药物长度不能超过 64 个字符")
	public String getCap_6_2_6() {
		return cap_6_2_6;
	}

	public void setCap_6_2_6(String cap_6_2_6) {
		this.cap_6_2_6 = cap_6_2_6;
	}
	
	@Length(min=0, max=64, message="其他类抗菌药长度不能超过 64 个字符")
	public String getCap_6_2_6_1() {
		return cap_6_2_6_1;
	}

	public void setCap_6_2_6_1(String cap_6_2_6_1) {
		this.cap_6_2_6_1 = cap_6_2_6_1;
	}
	
	@Length(min=0, max=64, message="神经氨酸抑制剂长度不能超过 64 个字符")
	public String getCap_6_2_7() {
		return cap_6_2_7;
	}

	public void setCap_6_2_7(String cap_6_2_7) {
		this.cap_6_2_7 = cap_6_2_7;
	}
	
	@Length(min=0, max=64, message="神经氨酸抑制剂长度不能超过 64 个字符")
	public String getCap_6_2_7_1() {
		return cap_6_2_7_1;
	}

	public void setCap_6_2_7_1(String cap_6_2_7_1) {
		this.cap_6_2_7_1 = cap_6_2_7_1;
	}
	
	@NotBlank(message="是否使用氧疗与呼吸支持治疗不能为空")
	@Length(min=0, max=64, message="是否使用氧疗与呼吸支持治疗长度不能超过 64 个字符")
	public String getCap_7_1_1() {
		return cap_7_1_1;
	}

	public void setCap_7_1_1(String cap_7_1_1) {
		this.cap_7_1_1 = cap_7_1_1;
	}
	
	@Length(min=0, max=64, message="是否使用普通氧疗长度不能超过 64 个字符")
	public String getCap_7_2_1() {
		return cap_7_2_1;
	}

	public void setCap_7_2_1(String cap_7_2_1) {
		this.cap_7_2_1 = cap_7_2_1;
	}
	
	@Length(min=0, max=64, message="普通氧疗指征长度不能超过 64 个字符")
	public String getCap_7_2_2() {
		return cap_7_2_2;
	}

	public void setCap_7_2_2(String cap_7_2_2) {
		this.cap_7_2_2 = cap_7_2_2;
	}
	
	@Length(min=0, max=64, message="给予氧疗医嘱长度不能超过 64 个字符")
	public String getCap_7_2_5() {
		return cap_7_2_5;
	}

	public void setCap_7_2_5(String cap_7_2_5) {
		this.cap_7_2_5 = cap_7_2_5;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCap_7_2_6() {
		return cap_7_2_6;
	}

	public void setCap_7_2_6(Date cap_7_2_6) {
		this.cap_7_2_6 = cap_7_2_6;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCap_7_2_7() {
		return cap_7_2_7;
	}

	public void setCap_7_2_7(Date cap_7_2_7) {
		this.cap_7_2_7 = cap_7_2_7;
	}
	
	public Double getCap_7_2_8() {
		return cap_7_2_8;
	}

	public void setCap_7_2_8(Double cap_7_2_8) {
		this.cap_7_2_8 = cap_7_2_8;
	}
	
	@Length(min=0, max=64, message="是否使用无创通气长度不能超过 64 个字符")
	public String getCap_7_3_1() {
		return cap_7_3_1;
	}

	public void setCap_7_3_1(String cap_7_3_1) {
		this.cap_7_3_1 = cap_7_3_1;
	}
	
	@Length(min=0, max=64, message="无创通气指征长度不能超过 64 个字符")
	public String getCap_7_3_2() {
		return cap_7_3_2;
	}

	public void setCap_7_3_2(String cap_7_3_2) {
		this.cap_7_3_2 = cap_7_3_2;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCap_7_3_3() {
		return cap_7_3_3;
	}

	public void setCap_7_3_3(Date cap_7_3_3) {
		this.cap_7_3_3 = cap_7_3_3;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCap_7_3_4() {
		return cap_7_3_4;
	}

	public void setCap_7_3_4(Date cap_7_3_4) {
		this.cap_7_3_4 = cap_7_3_4;
	}
	
	public Double getCap_7_3_5() {
		return cap_7_3_5;
	}

	public void setCap_7_3_5(Double cap_7_3_5) {
		this.cap_7_3_5 = cap_7_3_5;
	}
	
	@Length(min=0, max=64, message="是否使用有创机械通气长度不能超过 64 个字符")
	public String getCap_7_4_1() {
		return cap_7_4_1;
	}

	public void setCap_7_4_1(String cap_7_4_1) {
		this.cap_7_4_1 = cap_7_4_1;
	}
	
	@Length(min=0, max=64, message="机械通气指征长度不能超过 64 个字符")
	public String getCap_7_4_2() {
		return cap_7_4_2;
	}

	public void setCap_7_4_2(String cap_7_4_2) {
		this.cap_7_4_2 = cap_7_4_2;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCap_7_4_3() {
		return cap_7_4_3;
	}

	public void setCap_7_4_3(Date cap_7_4_3) {
		this.cap_7_4_3 = cap_7_4_3;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCap_7_4_4() {
		return cap_7_4_4;
	}

	public void setCap_7_4_4(Date cap_7_4_4) {
		this.cap_7_4_4 = cap_7_4_4;
	}
	
	public Double getCap_7_4_5() {
		return cap_7_4_5;
	}

	public void setCap_7_4_5(Double cap_7_4_5) {
		this.cap_7_4_5 = cap_7_4_5;
	}
	
	@Length(min=0, max=64, message="是否使用体外膜肺长度不能超过 64 个字符")
	public String getCap_7_5_1() {
		return cap_7_5_1;
	}

	public void setCap_7_5_1(String cap_7_5_1) {
		this.cap_7_5_1 = cap_7_5_1;
	}
	
	@Length(min=0, max=64, message="ECMO指征长度不能超过 64 个字符")
	public String getCap_7_5_2() {
		return cap_7_5_2;
	}

	public void setCap_7_5_2(String cap_7_5_2) {
		this.cap_7_5_2 = cap_7_5_2;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCap_7_5_3() {
		return cap_7_5_3;
	}

	public void setCap_7_5_3(Date cap_7_5_3) {
		this.cap_7_5_3 = cap_7_5_3;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCap_7_5_4() {
		return cap_7_5_4;
	}

	public void setCap_7_5_4(Date cap_7_5_4) {
		this.cap_7_5_4 = cap_7_5_4;
	}
	
	public Double getCap_7_5_5() {
		return cap_7_5_5;
	}

	public void setCap_7_5_5(Double cap_7_5_5) {
		this.cap_7_5_5 = cap_7_5_5;
	}
	
	@Length(min=0, max=64, message="交与患儿/患儿家长“出院小结”的副本告知出院时风险因素长度不能超过 64 个字符")
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
	
	@Length(min=0, max=64, message="告知何为发生紧急意外情况或者疾病复发长度不能超过 64 个字符")
	public String getCm_7_2_3() {
		return cm_7_2_3;
	}

	public void setCm_7_2_3(String cm_7_2_3) {
		this.cm_7_2_3 = cm_7_2_3;
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
	
	@NotBlank(message="经有效治疗后，患儿病情明显好转,可以出院不能为空")
	@Length(min=0, max=64, message="经有效治疗后，患儿病情明显好转,可以出院长度不能超过 64 个字符")
	public String getCap_9_1_1_1() {
		return cap_9_1_1_1;
	}

	public void setCap_9_1_1_1(String cap_9_1_1_1) {
		this.cap_9_1_1_1 = cap_9_1_1_1;
	}
	
	@NotBlank(message="出院前末次氧合评估不能为空")
	@Length(min=0, max=64, message="出院前末次氧合评估长度不能超过 64 个字符")
	public String getCap_9_2_1() {
		return cap_9_2_1;
	}

	public void setCap_9_2_1(String cap_9_2_1) {
		this.cap_9_2_1 = cap_9_2_1;
	}
	
	@Length(min=0, max=64, message="末次氧合评估项目长度不能超过 64 个字符")
	public String getCap_9_2_2() {
		return cap_9_2_2;
	}

	public void setCap_9_2_2(String cap_9_2_2) {
		this.cap_9_2_2 = cap_9_2_2;
	}
	
	public Double getCap_9_2_2_1() {
		return cap_9_2_2_1;
	}

	public void setCap_9_2_2_1(Double cap_9_2_2_1) {
		this.cap_9_2_2_1 = cap_9_2_2_1;
	}
	
	public Double getCap_9_2_2_2() {
		return cap_9_2_2_2;
	}

	public void setCap_9_2_2_2(Double cap_9_2_2_2) {
		this.cap_9_2_2_2 = cap_9_2_2_2;
	}
	
	@NotBlank(message="离院方式选择不能为空")
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
	
	@NotBlank(message="患儿家长对服务的体验与评价不能为空")
	@Length(min=0, max=64, message="患儿家长对服务的体验与评价长度不能超过 64 个字符")
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
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="患儿接受首剂抗菌药物治疗注射剂输入/注射日期时间不能为空")
	public Date getCap_11_1_1() {
		return cap_11_1_1;
	}

	public void setCap_11_1_1(Date cap_11_1_1) {
		this.cap_11_1_1 = cap_11_1_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="患儿接受未剂抗菌药物治疗注射剂输入/注射日期时间不能为空")
	public Date getCap_11_1_2() {
		return cap_11_1_2;
	}

	public void setCap_11_1_2(Date cap_11_1_2) {
		this.cap_11_1_2 = cap_11_1_2;
	}
	
	public Double getCap_11_1_3() {
		return cap_11_1_3;
	}

	public void setCap_11_1_3(Double cap_11_1_3) {
		this.cap_11_1_3 = cap_11_1_3;
	}
	
	@Length(min=0, max=64, message="是否抗菌药物注射剂改口服长度不能超过 64 个字符")
	public String getCap_11_2_1() {
		return cap_11_2_1;
	}

	public void setCap_11_2_1(String cap_11_2_1) {
		this.cap_11_2_1 = cap_11_2_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCap_11_2_2() {
		return cap_11_2_2;
	}

	public void setCap_11_2_2(Date cap_11_2_2) {
		this.cap_11_2_2 = cap_11_2_2;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCap_11_2_3() {
		return cap_11_2_3;
	}

	public void setCap_11_2_3(Date cap_11_2_3) {
		this.cap_11_2_3 = cap_11_2_3;
	}
	
	public Double getCap_11_2_4() {
		return cap_11_2_4;
	}

	public void setCap_11_2_4(Double cap_11_2_4) {
		this.cap_11_2_4 = cap_11_2_4;
	}
	
	@NotNull(message="住院总费用不能为空")
	public Double getCm_6_1() {
		return cm_6_1;
	}

	public void setCm_6_1(Double cm_6_1) {
		this.cm_6_1 = cm_6_1;
	}
	
	@NotNull(message="住院总费用其中自付金额不能为空")
	public Double getCm_6_2() {
		return cm_6_2;
	}

	public void setCm_6_2(Double cm_6_2) {
		this.cm_6_2 = cm_6_2;
	}
	
	@NotNull(message="一般医疗服务费不能为空")
	public Double getCm_6_3() {
		return cm_6_3;
	}

	public void setCm_6_3(Double cm_6_3) {
		this.cm_6_3 = cm_6_3;
	}
	
	@NotNull(message="一般治疗操作费不能为空")
	public Double getCm_6_4() {
		return cm_6_4;
	}

	public void setCm_6_4(Double cm_6_4) {
		this.cm_6_4 = cm_6_4;
	}
	
	@NotNull(message="护理费不能为空")
	public Double getCm_6_5() {
		return cm_6_5;
	}

	public void setCm_6_5(Double cm_6_5) {
		this.cm_6_5 = cm_6_5;
	}
	
	@NotNull(message="综合医疗服务类其他费用不能为空")
	public Double getCm_6_6() {
		return cm_6_6;
	}

	public void setCm_6_6(Double cm_6_6) {
		this.cm_6_6 = cm_6_6;
	}
	
	@NotNull(message="病理诊断费不能为空")
	public Double getCm_6_7() {
		return cm_6_7;
	}

	public void setCm_6_7(Double cm_6_7) {
		this.cm_6_7 = cm_6_7;
	}
	
	@NotNull(message="实验室诊断费不能为空")
	public Double getCm_6_8() {
		return cm_6_8;
	}

	public void setCm_6_8(Double cm_6_8) {
		this.cm_6_8 = cm_6_8;
	}
	
	@NotNull(message="影像学诊断费不能为空")
	public Double getCm_6_9() {
		return cm_6_9;
	}

	public void setCm_6_9(Double cm_6_9) {
		this.cm_6_9 = cm_6_9;
	}
	
	@NotNull(message="临床诊断项目费不能为空")
	public Double getCm_6_10() {
		return cm_6_10;
	}

	public void setCm_6_10(Double cm_6_10) {
		this.cm_6_10 = cm_6_10;
	}
	
	@NotNull(message="非手术治疗项目费不能为空")
	public Double getCm_6_11() {
		return cm_6_11;
	}

	public void setCm_6_11(Double cm_6_11) {
		this.cm_6_11 = cm_6_11;
	}
	
	@NotNull(message="其中不能为空")
	public Double getCm_6_12() {
		return cm_6_12;
	}

	public void setCm_6_12(Double cm_6_12) {
		this.cm_6_12 = cm_6_12;
	}
	
	@NotNull(message="手术治疗费不能为空")
	public Double getCm_6_13() {
		return cm_6_13;
	}

	public void setCm_6_13(Double cm_6_13) {
		this.cm_6_13 = cm_6_13;
	}
	
	@NotNull(message="其中不能为空")
	public Double getCm_6_14() {
		return cm_6_14;
	}

	public void setCm_6_14(Double cm_6_14) {
		this.cm_6_14 = cm_6_14;
	}
	
	@NotNull(message="其中不能为空")
	public Double getCm_6_15() {
		return cm_6_15;
	}

	public void setCm_6_15(Double cm_6_15) {
		this.cm_6_15 = cm_6_15;
	}
	
	@NotNull(message="康复费不能为空")
	public Double getCm_6_16() {
		return cm_6_16;
	}

	public void setCm_6_16(Double cm_6_16) {
		this.cm_6_16 = cm_6_16;
	}
	
	@NotNull(message="中医治疗费不能为空")
	public Double getCm_6_17() {
		return cm_6_17;
	}

	public void setCm_6_17(Double cm_6_17) {
		this.cm_6_17 = cm_6_17;
	}
	
	@NotNull(message="西药费不能为空")
	public Double getCm_6_18() {
		return cm_6_18;
	}

	public void setCm_6_18(Double cm_6_18) {
		this.cm_6_18 = cm_6_18;
	}
	
	@NotNull(message="其中不能为空")
	public Double getCm_6_19() {
		return cm_6_19;
	}

	public void setCm_6_19(Double cm_6_19) {
		this.cm_6_19 = cm_6_19;
	}
	
	@NotNull(message="中成药费不能为空")
	public Double getCm_6_20() {
		return cm_6_20;
	}

	public void setCm_6_20(Double cm_6_20) {
		this.cm_6_20 = cm_6_20;
	}
	
	@NotNull(message="中草药费不能为空")
	public Double getCm_6_21() {
		return cm_6_21;
	}

	public void setCm_6_21(Double cm_6_21) {
		this.cm_6_21 = cm_6_21;
	}
	
	@NotNull(message="血费不能为空")
	public Double getCm_6_22() {
		return cm_6_22;
	}

	public void setCm_6_22(Double cm_6_22) {
		this.cm_6_22 = cm_6_22;
	}
	
	@NotNull(message="白蛋白类制品费不能为空")
	public Double getCm_6_23() {
		return cm_6_23;
	}

	public void setCm_6_23(Double cm_6_23) {
		this.cm_6_23 = cm_6_23;
	}
	
	@NotNull(message="球蛋白类制品费不能为空")
	public Double getCm_6_24() {
		return cm_6_24;
	}

	public void setCm_6_24(Double cm_6_24) {
		this.cm_6_24 = cm_6_24;
	}
	
	@NotNull(message="凝血因子类制品费不能为空")
	public Double getCm_6_25() {
		return cm_6_25;
	}

	public void setCm_6_25(Double cm_6_25) {
		this.cm_6_25 = cm_6_25;
	}
	
	@NotNull(message="细胞因子类制品费不能为空")
	public Double getCm_6_26() {
		return cm_6_26;
	}

	public void setCm_6_26(Double cm_6_26) {
		this.cm_6_26 = cm_6_26;
	}
	
	@NotNull(message="检查用一次性医用材料费不能为空")
	public Double getCm_6_27() {
		return cm_6_27;
	}

	public void setCm_6_27(Double cm_6_27) {
		this.cm_6_27 = cm_6_27;
	}
	
	@NotNull(message="治疗用一次性医用材料费不能为空")
	public Double getCm_6_28() {
		return cm_6_28;
	}

	public void setCm_6_28(Double cm_6_28) {
		this.cm_6_28 = cm_6_28;
	}
	
	@NotNull(message="手术用一次性医用材料费不能为空")
	public Double getCm_6_29() {
		return cm_6_29;
	}

	public void setCm_6_29(Double cm_6_29) {
		this.cm_6_29 = cm_6_29;
	}
	
	@NotNull(message="其他费不能为空")
	public Double getCm_6_30() {
		return cm_6_30;
	}

	public void setCm_6_30(Double cm_6_30) {
		this.cm_6_30 = cm_6_30;
	}

    public String getCap_1_1_1_1() {
        return cap_1_1_1_1;
    }

    public void setCap_1_1_1_1(String cap_1_1_1_1) {
        this.cap_1_1_1_1 = cap_1_1_1_1;
    }
}