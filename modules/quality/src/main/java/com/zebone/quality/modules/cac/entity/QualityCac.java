/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.cac.entity;

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
 * CAC哮喘（成人，急性发作，住院）Entity
 * @author 卡卡西
 * @version 2021-02-07
 */
@Table(name="quality_cac", alias="a", columns={
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
		@Column(name="cm_0_2_3_1", attrName="cm_0_2_3_1", label="到达本院急诊或者门诊日期时间是否无法确定或无记录"),
		@Column(name="cm_0_2_3_2", attrName="cm_0_2_3_2", label="到达本院急诊或者门诊日期时间"),
		@Column(name="cm_0_2_4_1", attrName="cm_0_2_4_1", label="入院日期时间"),
		@Column(name="cm_0_2_4_2", attrName="cm_0_2_4_2", label="出院日期时间"),
		@Column(name="cm_0_2_5_1", attrName="cm_0_2_5_1", label="入住ICU/RICU日期时间"),
		@Column(name="cm_0_2_5_2", attrName="cm_0_2_5_2", label="离开ICU/RICU日期时间"),
		@Column(name="cm_0_3_1", attrName="cm_0_3_1", label="费用支付方式"),
		@Column(name="cm_0_3_2", attrName="cm_0_3_2", label="收入住院途径"),
		@Column(name="cm_0_3_3", attrName="cm_0_3_3", label="到院交通工具"),
		@Column(name="cac_1_1_1", attrName="cac_1_1_1", label="入院后是否实施首次病情严重程度评估"),
		@Column(name="cac_1_1_2", attrName="cac_1_1_2", label="哮喘患者病情严重程度分级"),
		@Column(name="cac_1_2_1", attrName="cac_1_2_1", label="哮喘急性发作时,是否有病情严重程度的分级评估"),
		@Column(name="cac_1_2_2", attrName="cac_1_2_2", label="哮喘急性发作时病情严重程度的分级评估结果"),
		@Column(name="cac_1_3_1", attrName="cac_1_3_1", label="是否对具有急性发作风险的高危患者评估"),
		@Column(name="cac_1_3_2", attrName="cac_1_3_2", label="具有急性发作风险的高危患者评估"),
		@Column(name="cac_2_1_1", attrName="cac_2_1_1", label="是否入住ICU/RICU"),
		@Column(name="cac_2_2_1", attrName="cac_2_2_1", label="收住ICU/RICU符合指征"),
		@Column(name="cac_2_2_2", attrName="cac_2_2_2", label="入住ICU/RICU时机"),
		@Column(name="cac_3_1_1", attrName="cac_3_1_1", label="是否给予氧疗"),
		@Column(name="cac_3_2_1", attrName="cac_3_2_1", label="氧疗方法"),
		@Column(name="cac_3_3_1", attrName="cac_3_3_1", label="氧疗30min后是否评估氧合状态"),
		@Column(name="cac_3_3_2", attrName="cac_3_3_2", label="氧合状态评估方法"),
		@Column(name="cac_3_3_2_1", attrName="cac_3_3_2_1", label="外周氧饱和度值", comment="外周氧饱和度值(%)"),
		@Column(name="cac_3_3_2_2", attrName="cac_3_3_2_2", label="动脉氧分压", comment="动脉氧分压(mmHg)"),
		@Column(name="cac_4_1_1", attrName="cac_4_1_1", label="是否吸入支气管舒张剂"),
		@Column(name="cac_4_1_2", attrName="cac_4_1_2", label="吸入支气管舒张剂种类"),
		@Column(name="cac_4_1_2_1", attrName="cac_4_1_2_1", label="其它支气管舒张剂"),
		@Column(name="cac_4_2_1", attrName="cac_4_2_1", label="是否吸入糖皮质激素"),
		@Column(name="cac_4_2_2", attrName="cac_4_2_2", label="吸入糖皮质激素种类"),
		@Column(name="cac_4_2_2_1", attrName="cac_4_2_2_1", label="其他吸入糖皮质激素"),
		@Column(name="cac_5_1_1", attrName="cac_5_1_1", label="是否使用全身糖皮质激素"),
		@Column(name="cac_5_1_2", attrName="cac_5_1_2", label="糖皮质激素选择"),
		@Column(name="cac_5_1_2_1", attrName="cac_5_1_2_1", label="其他糖皮质激素治疗途径"),
		@Column(name="cac_5_2_1", attrName="cac_5_2_1", label="全身糖皮质激素使用医嘱起始日期时间"),
		@Column(name="cac_5_2_2", attrName="cac_5_2_2", label="全身糖皮质激素使用医嘱终止日期"),
		@Column(name="cac_5_2_3", attrName="cac_5_2_3", label="全身糖皮质激素使用天数"),
		@Column(name="cac_6_1_1", attrName="cac_6_1_1", label="患者病情稳定出院前是否开始应用控制性药物"),
		@Column(name="cac_6_2_1", attrName="cac_6_2_1", label="控制药物使用情况"),
		@Column(name="cac_6_2_1_1", attrName="cac_6_2_1_1", label="其他控制药物使用情况"),
		@Column(name="cac_7_1_1", attrName="cac_7_1_1", label="是否使用静脉茶碱"),
		@Column(name="cac_7_1_2", attrName="cac_7_1_2", label="茶碱制剂种类"),
		@Column(name="cac_7_1_2_1", attrName="cac_7_1_2_1", label="其他茶碱制剂"),
		@Column(name="cac_7_1_3", attrName="cac_7_1_3", label="用药途径"),
		@Column(name="cac_7_1_4", attrName="cac_7_1_4", label="是否监测茶碱血药浓度"),
		@Column(name="cac_7_1_5", attrName="cac_7_1_5", label="茶碱血药浓度", comment="茶碱血药浓度(μg/ml)"),
		@Column(name="cac_8_1_1", attrName="cac_8_1_1", label="是否入院后实施首次实验室检查评估"),
		@Column(name="cac_8_1_2", attrName="cac_8_1_2", label="实验室检查评估"),
		@Column(name="cac_8_1_2_1", attrName="cac_8_1_2_1", label="其他实验室检查评估"),
		@Column(name="cac_8_1_3", attrName="cac_8_1_3", label="是否入院后实施首次胸部影像学检查"),
		@Column(name="cac_8_1_4", attrName="cac_8_1_4", label="胸部影像学检查评估"),
		@Column(name="cac_8_1_4_1", attrName="cac_8_1_4_1", label="其他胸部影像学检查评估"),
		@Column(name="cac_8_2_1", attrName="cac_8_2_1", label="是否入院24小时内是否应用抗菌药物"),
		@Column(name="cac_8_2_2", attrName="cac_8_2_2", label="患者接受首剂抗菌药物治疗", comment="患者接受首剂抗菌药物治疗（注射剂输入/注射）时间"),
		@Column(name="cac_8_2_3", attrName="cac_8_2_3", label="接受首剂抗菌药物使用时机"),
		@Column(name="cac_8_2_3_r", attrName="cac_8_2_3_r", label="nan"),
		@Column(name="cac_8_3_1", attrName="cac_8_3_1", label="入院后是否进行首次病原学检测"),
		@Column(name="cac_8_3_4", attrName="cac_8_3_4", label="病原学诊断结果选择"),
		@Column(name="cac_8_3_3", attrName="cac_8_3_3", label="依据病原学诊断结果，选择目标抗感染药物"),
		@Column(name="cac_8_3_2", attrName="cac_8_3_2", label="使用抗感染药物种类"),
		@Column(name="cac_8_3_2_1", attrName="cac_8_3_2_1", label="青霉素类抗感染药物"),
		@Column(name="cac_8_3_2_1_1", attrName="cac_8_3_2_1_1", label="其它青霉素类抗感染药物名称"),
		@Column(name="cac_8_3_2_2", attrName="cac_8_3_2_2", label="头孢菌素类抗感染药物"),
		@Column(name="cac_8_3_2_2_1", attrName="cac_8_3_2_2_1", label="其它头孢菌素类抗感染药物名称"),
		@Column(name="cac_8_3_2_3", attrName="cac_8_3_2_3", label="大环内酯类抗感染药物"),
		@Column(name="cac_8_3_2_3_1", attrName="cac_8_3_2_3_1", label="其它大环内酯类抗感染药物名称"),
		@Column(name="cac_8_3_2_4", attrName="cac_8_3_2_4", label="喹诺酮类抗感染药物"),
		@Column(name="cac_8_3_2_4_1", attrName="cac_8_3_2_4_1", label="其它喹诺酮类抗感染药物名称"),
		@Column(name="cac_8_3_2_5", attrName="cac_8_3_2_5", label="其他类抗感染药物"),
		@Column(name="cac_8_3_2_5_1", attrName="cac_8_3_2_5_1", label="其他类其它抗感染药物名称"),
		@Column(name="cac_8_3_2_6", attrName="cac_8_3_2_6", label="抗真菌药物"),
		@Column(name="cac_8_3_2_6_1", attrName="cac_8_3_2_6_1", label="其它抗真菌药物名称"),
		@Column(name="cac_9_1_1", attrName="cac_9_1_1", label="是否实施机械通气"),
		@Column(name="cac_9_1_2", attrName="cac_9_1_2", label="机械通气应用指征"),
		@Column(name="cac_9_1_2_1", attrName="cac_9_1_2_1", label="其他机械通气应用指征"),
		@Column(name="cac_9_1_3", attrName="cac_9_1_3", label="患者机械通气起始日期时间"),
		@Column(name="cac_9_1_4", attrName="cac_9_1_4", label="患者机械通气终止日期时间"),
		@Column(name="cac_9_1_5", attrName="cac_9_1_5", label="机械通气疗程", comment="机械通气疗程（小时）"),
		@Column(name="cac_10_1_1", attrName="cac_10_1_1", label="是否有肺动脉高压和右心功能不全"),
		@Column(name="cac_10_1_2", attrName="cac_10_1_2", label="首次处置血管扩张剂", comment="首次处置血管扩张剂（无禁忌症）的选择"),
		@Column(name="cac_10_1_2_1", attrName="cac_10_1_2_1", label="其他首次处置血管扩张剂"),
		@Column(name="cac_10_2_1", attrName="cac_10_2_1", label="是否有气胸"),
		@Column(name="cac_10_2_2", attrName="cac_10_2_2", label="首位处置项目的选择"),
		@Column(name="cac_10_2_2_1", attrName="cac_10_2_2_1", label="其他首位处置项目"),
		@Column(name="cac_10_3_1", attrName="cac_10_3_1", label="是否有胃食管反流病"),
		@Column(name="cac_10_3_2", attrName="cac_10_3_2", label="首位处置项目的选择"),
		@Column(name="cac_10_3_2_1", attrName="cac_10_3_2_1", label="其它首位处置项目"),
		@Column(name="cac_11_1_1", attrName="cac_11_1_1", label="住院期间是否为患者提供健康教育"),
		@Column(name="cm_7_2_1", attrName="cm_7_2_1", label="交与患者“出院小结”的副本告知患者出院时风险因素"),
		@Column(name="cm_7_2_2", attrName="cm_7_2_2", label="出院带药"),
		@Column(name="cm_7_2_4", attrName="cm_7_2_4", label="告知发生紧急意外情况或者疾病复发如何救治及前途经"),
		@Column(name="cac_11_2_4", attrName="cac_11_2_4", label="告知患者进入慢性持续期和临床缓解期，需要进一步控制治疗"),
		@Column(name="cac_11_2_5", attrName="cac_11_2_5", label="告知患者哮喘教育管理途径"),
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
public class QualityCac extends DataEntity<QualityCac> {
	
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
	private String cm_0_2_3_1;		// 到达本院急诊或者门诊日期时间是否无法确定或无记录
	private Date cm_0_2_3_2;		// 到达本院急诊或者门诊日期时间
	private Date cm_0_2_4_1;		// 入院日期时间
	private Date cm_0_2_4_2;		// 出院日期时间
	private Date cm_0_2_5_1;		// 入住ICU/RICU日期时间
	private Date cm_0_2_5_2;		// 离开ICU/RICU日期时间
	private String cm_0_3_1;		// 费用支付方式
	private String cm_0_3_2;		// 收入住院途径
	private String cm_0_3_3;		// 到院交通工具
	private String cac_1_1_1;		// 入院后是否实施首次病情严重程度评估
	private String cac_1_1_2;		// 哮喘患者病情严重程度分级
	private String cac_1_2_1;		// 哮喘急性发作时,是否有病情严重程度的分级评估
	private String cac_1_2_2;		// 哮喘急性发作时病情严重程度的分级评估结果
	private String cac_1_3_1;		// 是否对具有急性发作风险的高危患者评估
	private String cac_1_3_2;		// 具有急性发作风险的高危患者评估
	private String cac_2_1_1;		// 是否入住ICU/RICU
	private String cac_2_2_1;		// 收住ICU/RICU符合指征
	private String cac_2_2_2;		// 入住ICU/RICU时机
	private String cac_3_1_1;		// 是否给予氧疗
	private String cac_3_2_1;		// 氧疗方法
	private String cac_3_3_1;		// 氧疗30min后是否评估氧合状态
	private String cac_3_3_2;		// 氧合状态评估方法
	private Double cac_3_3_2_1;		// 外周氧饱和度值(%)
	private Double cac_3_3_2_2;		// 动脉氧分压(mmHg)
	private String cac_4_1_1;		// 是否吸入支气管舒张剂
	private String cac_4_1_2;		// 吸入支气管舒张剂种类
	private String cac_4_1_2_1;		// 其它支气管舒张剂
	private String cac_4_2_1;		// 是否吸入糖皮质激素
	private String cac_4_2_2;		// 吸入糖皮质激素种类
	private String cac_4_2_2_1;		// 其他吸入糖皮质激素
	private String cac_5_1_1;		// 是否使用全身糖皮质激素
	private String cac_5_1_2;		// 糖皮质激素选择
	private String cac_5_1_2_1;		// 其他糖皮质激素治疗途径
	private Date cac_5_2_1;		// 全身糖皮质激素使用医嘱起始日期时间
	private Date cac_5_2_2;		// 全身糖皮质激素使用医嘱终止日期
	private Double cac_5_2_3;		// 全身糖皮质激素使用天数
	private String cac_6_1_1;		// 患者病情稳定出院前是否开始应用控制性药物
	private String cac_6_2_1;		// 控制药物使用情况
	private String cac_6_2_1_1;		// 其他控制药物使用情况
	private String cac_7_1_1;		// 是否使用静脉茶碱
	private String cac_7_1_2;		// 茶碱制剂种类
	private String cac_7_1_2_1;		// 其他茶碱制剂
	private String cac_7_1_3;		// 用药途径
	private String cac_7_1_4;		// 是否监测茶碱血药浓度
	private Double cac_7_1_5;		// 茶碱血药浓度(μg/ml)
	private String cac_8_1_1;		// 是否入院后实施首次实验室检查评估
	private String cac_8_1_2;		// 实验室检查评估
	private String cac_8_1_2_1;		// 其他实验室检查评估
	private String cac_8_1_3;		// 是否入院后实施首次胸部影像学检查
	private String cac_8_1_4;		// 胸部影像学检查评估
	private String cac_8_1_4_1;		// 其他胸部影像学检查评估
	private String cac_8_2_1;		// 是否入院24小时内是否应用抗菌药物
	private Date cac_8_2_2;		// 患者接受首剂抗菌药物治疗（注射剂输入/注射）时间
	private String cac_8_2_3;		// 接受首剂抗菌药物使用时机
	private Double cac_8_2_3_r;		// nan
	private String cac_8_3_1;		// 入院后是否进行首次病原学检测
	private String cac_8_3_4;		// 病原学诊断结果选择
	private String cac_8_3_3;		// 依据病原学诊断结果，选择目标抗感染药物
	private String cac_8_3_2;		// 使用抗感染药物种类
	private String cac_8_3_2_1;		// 青霉素类抗感染药物
	private String cac_8_3_2_1_1;		// 其它青霉素类抗感染药物名称
	private String cac_8_3_2_2;		// 头孢菌素类抗感染药物
	private String cac_8_3_2_2_1;		// 其它头孢菌素类抗感染药物名称
	private String cac_8_3_2_3;		// 大环内酯类抗感染药物
	private String cac_8_3_2_3_1;		// 其它大环内酯类抗感染药物名称
	private String cac_8_3_2_4;		// 喹诺酮类抗感染药物
	private String cac_8_3_2_4_1;		// 其它喹诺酮类抗感染药物名称
	private String cac_8_3_2_5;		// 其他类抗感染药物
	private String cac_8_3_2_5_1;		// 其他类其它抗感染药物名称
	private String cac_8_3_2_6;		// 抗真菌药物
	private String cac_8_3_2_6_1;		// 其它抗真菌药物名称
	private String cac_9_1_1;		// 是否实施机械通气
	private String cac_9_1_2;		// 机械通气应用指征
	private String cac_9_1_2_1;		// 其他机械通气应用指征
	private Date cac_9_1_3;		// 患者机械通气起始日期时间
	private Date cac_9_1_4;		// 患者机械通气终止日期时间
	private Double cac_9_1_5;		// 机械通气疗程（小时）
	private String cac_10_1_1;		// 是否有肺动脉高压和右心功能不全
	private String cac_10_1_2;		// 首次处置血管扩张剂（无禁忌症）的选择
	private String cac_10_1_2_1;		// 其他首次处置血管扩张剂
	private String cac_10_2_1;		// 是否有气胸
	private String cac_10_2_2;		// 首位处置项目的选择
	private String cac_10_2_2_1;		// 其他首位处置项目
	private String cac_10_3_1;		// 是否有胃食管反流病
	private String cac_10_3_2;		// 首位处置项目的选择
	private String cac_10_3_2_1;		// 其它首位处置项目
	private String cac_11_1_1;		// 住院期间是否为患者提供健康教育
	private String cm_7_2_1;		// 交与患者“出院小结”的副本告知患者出院时风险因素
	private String cm_7_2_2;		// 出院带药
	private String cm_7_2_4;		// 告知发生紧急意外情况或者疾病复发如何救治及前途经
	private String cac_11_2_4;		// 告知患者进入慢性持续期和临床缓解期，需要进一步控制治疗
	private String cac_11_2_5;		// 告知患者哮喘教育管理途径
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
	
	public QualityCac() {
		this(null);
	}

	public QualityCac(String id){
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
	
	@Length(min=0, max=64, message="入院后是否实施首次病情严重程度评估长度不能超过 64 个字符")
	public String getCac_1_1_1() {
		return cac_1_1_1;
	}

	public void setCac_1_1_1(String cac_1_1_1) {
		this.cac_1_1_1 = cac_1_1_1;
	}
	
	@Length(min=0, max=64, message="哮喘患者病情严重程度分级长度不能超过 64 个字符")
	public String getCac_1_1_2() {
		return cac_1_1_2;
	}

	public void setCac_1_1_2(String cac_1_1_2) {
		this.cac_1_1_2 = cac_1_1_2;
	}
	
	@Length(min=0, max=64, message="哮喘急性发作时,是否有病情严重程度的分级评估长度不能超过 64 个字符")
	public String getCac_1_2_1() {
		return cac_1_2_1;
	}

	public void setCac_1_2_1(String cac_1_2_1) {
		this.cac_1_2_1 = cac_1_2_1;
	}
	
	@Length(min=0, max=64, message="哮喘急性发作时病情严重程度的分级评估结果长度不能超过 64 个字符")
	public String getCac_1_2_2() {
		return cac_1_2_2;
	}

	public void setCac_1_2_2(String cac_1_2_2) {
		this.cac_1_2_2 = cac_1_2_2;
	}
	
	@Length(min=0, max=64, message="是否对具有急性发作风险的高危患者评估长度不能超过 64 个字符")
	public String getCac_1_3_1() {
		return cac_1_3_1;
	}

	public void setCac_1_3_1(String cac_1_3_1) {
		this.cac_1_3_1 = cac_1_3_1;
	}
	
	@Length(min=0, max=64, message="具有急性发作风险的高危患者评估长度不能超过 64 个字符")
	public String getCac_1_3_2() {
		return cac_1_3_2;
	}

	public void setCac_1_3_2(String cac_1_3_2) {
		this.cac_1_3_2 = cac_1_3_2;
	}
	
	@Length(min=0, max=64, message="是否入住ICU/RICU长度不能超过 64 个字符")
	public String getCac_2_1_1() {
		return cac_2_1_1;
	}

	public void setCac_2_1_1(String cac_2_1_1) {
		this.cac_2_1_1 = cac_2_1_1;
	}
	
	@Length(min=0, max=64, message="收住ICU/RICU符合指征长度不能超过 64 个字符")
	public String getCac_2_2_1() {
		return cac_2_2_1;
	}

	public void setCac_2_2_1(String cac_2_2_1) {
		this.cac_2_2_1 = cac_2_2_1;
	}
	
	@Length(min=0, max=64, message="入住ICU/RICU时机长度不能超过 64 个字符")
	public String getCac_2_2_2() {
		return cac_2_2_2;
	}

	public void setCac_2_2_2(String cac_2_2_2) {
		this.cac_2_2_2 = cac_2_2_2;
	}
	
	@Length(min=0, max=64, message="是否给予氧疗长度不能超过 64 个字符")
	public String getCac_3_1_1() {
		return cac_3_1_1;
	}

	public void setCac_3_1_1(String cac_3_1_1) {
		this.cac_3_1_1 = cac_3_1_1;
	}
	
	@Length(min=0, max=64, message="氧疗方法长度不能超过 64 个字符")
	public String getCac_3_2_1() {
		return cac_3_2_1;
	}

	public void setCac_3_2_1(String cac_3_2_1) {
		this.cac_3_2_1 = cac_3_2_1;
	}
	
	@Length(min=0, max=64, message="氧疗30min后是否评估氧合状态长度不能超过 64 个字符")
	public String getCac_3_3_1() {
		return cac_3_3_1;
	}

	public void setCac_3_3_1(String cac_3_3_1) {
		this.cac_3_3_1 = cac_3_3_1;
	}
	
	@Length(min=0, max=64, message="氧合状态评估方法长度不能超过 64 个字符")
	public String getCac_3_3_2() {
		return cac_3_3_2;
	}

	public void setCac_3_3_2(String cac_3_3_2) {
		this.cac_3_3_2 = cac_3_3_2;
	}
	
	public Double getCac_3_3_2_1() {
		return cac_3_3_2_1;
	}

	public void setCac_3_3_2_1(Double cac_3_3_2_1) {
		this.cac_3_3_2_1 = cac_3_3_2_1;
	}
	
	public Double getCac_3_3_2_2() {
		return cac_3_3_2_2;
	}

	public void setCac_3_3_2_2(Double cac_3_3_2_2) {
		this.cac_3_3_2_2 = cac_3_3_2_2;
	}
	
	@Length(min=0, max=64, message="是否吸入支气管舒张剂长度不能超过 64 个字符")
	public String getCac_4_1_1() {
		return cac_4_1_1;
	}

	public void setCac_4_1_1(String cac_4_1_1) {
		this.cac_4_1_1 = cac_4_1_1;
	}
	
	@Length(min=0, max=64, message="吸入支气管舒张剂种类长度不能超过 64 个字符")
	public String getCac_4_1_2() {
		return cac_4_1_2;
	}

	public void setCac_4_1_2(String cac_4_1_2) {
		this.cac_4_1_2 = cac_4_1_2;
	}
	
	@Length(min=0, max=64, message="其它支气管舒张剂长度不能超过 64 个字符")
	public String getCac_4_1_2_1() {
		return cac_4_1_2_1;
	}

	public void setCac_4_1_2_1(String cac_4_1_2_1) {
		this.cac_4_1_2_1 = cac_4_1_2_1;
	}
	
	@Length(min=0, max=64, message="是否吸入糖皮质激素长度不能超过 64 个字符")
	public String getCac_4_2_1() {
		return cac_4_2_1;
	}

	public void setCac_4_2_1(String cac_4_2_1) {
		this.cac_4_2_1 = cac_4_2_1;
	}
	
	@Length(min=0, max=64, message="吸入糖皮质激素种类长度不能超过 64 个字符")
	public String getCac_4_2_2() {
		return cac_4_2_2;
	}

	public void setCac_4_2_2(String cac_4_2_2) {
		this.cac_4_2_2 = cac_4_2_2;
	}
	
	@Length(min=0, max=64, message="其他吸入糖皮质激素长度不能超过 64 个字符")
	public String getCac_4_2_2_1() {
		return cac_4_2_2_1;
	}

	public void setCac_4_2_2_1(String cac_4_2_2_1) {
		this.cac_4_2_2_1 = cac_4_2_2_1;
	}
	
	@Length(min=0, max=64, message="是否使用全身糖皮质激素长度不能超过 64 个字符")
	public String getCac_5_1_1() {
		return cac_5_1_1;
	}

	public void setCac_5_1_1(String cac_5_1_1) {
		this.cac_5_1_1 = cac_5_1_1;
	}
	
	@Length(min=0, max=64, message="糖皮质激素选择长度不能超过 64 个字符")
	public String getCac_5_1_2() {
		return cac_5_1_2;
	}

	public void setCac_5_1_2(String cac_5_1_2) {
		this.cac_5_1_2 = cac_5_1_2;
	}
	
	@Length(min=0, max=64, message="其他糖皮质激素治疗途径长度不能超过 64 个字符")
	public String getCac_5_1_2_1() {
		return cac_5_1_2_1;
	}

	public void setCac_5_1_2_1(String cac_5_1_2_1) {
		this.cac_5_1_2_1 = cac_5_1_2_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCac_5_2_1() {
		return cac_5_2_1;
	}

	public void setCac_5_2_1(Date cac_5_2_1) {
		this.cac_5_2_1 = cac_5_2_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCac_5_2_2() {
		return cac_5_2_2;
	}

	public void setCac_5_2_2(Date cac_5_2_2) {
		this.cac_5_2_2 = cac_5_2_2;
	}
	
	public Double getCac_5_2_3() {
		return cac_5_2_3;
	}

	public void setCac_5_2_3(Double cac_5_2_3) {
		this.cac_5_2_3 = cac_5_2_3;
	}
	
	@Length(min=0, max=64, message="患者病情稳定出院前是否开始应用控制性药物长度不能超过 64 个字符")
	public String getCac_6_1_1() {
		return cac_6_1_1;
	}

	public void setCac_6_1_1(String cac_6_1_1) {
		this.cac_6_1_1 = cac_6_1_1;
	}
	
	@Length(min=0, max=64, message="控制药物使用情况长度不能超过 64 个字符")
	public String getCac_6_2_1() {
		return cac_6_2_1;
	}

	public void setCac_6_2_1(String cac_6_2_1) {
		this.cac_6_2_1 = cac_6_2_1;
	}
	
	@Length(min=0, max=64, message="其他控制药物使用情况长度不能超过 64 个字符")
	public String getCac_6_2_1_1() {
		return cac_6_2_1_1;
	}

	public void setCac_6_2_1_1(String cac_6_2_1_1) {
		this.cac_6_2_1_1 = cac_6_2_1_1;
	}
	
	@Length(min=0, max=64, message="是否使用静脉茶碱长度不能超过 64 个字符")
	public String getCac_7_1_1() {
		return cac_7_1_1;
	}

	public void setCac_7_1_1(String cac_7_1_1) {
		this.cac_7_1_1 = cac_7_1_1;
	}
	
	@Length(min=0, max=64, message="茶碱制剂种类长度不能超过 64 个字符")
	public String getCac_7_1_2() {
		return cac_7_1_2;
	}

	public void setCac_7_1_2(String cac_7_1_2) {
		this.cac_7_1_2 = cac_7_1_2;
	}
	
	@Length(min=0, max=64, message="其他茶碱制剂长度不能超过 64 个字符")
	public String getCac_7_1_2_1() {
		return cac_7_1_2_1;
	}

	public void setCac_7_1_2_1(String cac_7_1_2_1) {
		this.cac_7_1_2_1 = cac_7_1_2_1;
	}
	
	@Length(min=0, max=64, message="用药途径长度不能超过 64 个字符")
	public String getCac_7_1_3() {
		return cac_7_1_3;
	}

	public void setCac_7_1_3(String cac_7_1_3) {
		this.cac_7_1_3 = cac_7_1_3;
	}
	
	@Length(min=0, max=64, message="是否监测茶碱血药浓度长度不能超过 64 个字符")
	public String getCac_7_1_4() {
		return cac_7_1_4;
	}

	public void setCac_7_1_4(String cac_7_1_4) {
		this.cac_7_1_4 = cac_7_1_4;
	}
	
	public Double getCac_7_1_5() {
		return cac_7_1_5;
	}

	public void setCac_7_1_5(Double cac_7_1_5) {
		this.cac_7_1_5 = cac_7_1_5;
	}
	
	@Length(min=0, max=64, message="是否入院后实施首次实验室检查评估长度不能超过 64 个字符")
	public String getCac_8_1_1() {
		return cac_8_1_1;
	}

	public void setCac_8_1_1(String cac_8_1_1) {
		this.cac_8_1_1 = cac_8_1_1;
	}
	
	@Length(min=0, max=64, message="实验室检查评估长度不能超过 64 个字符")
	public String getCac_8_1_2() {
		return cac_8_1_2;
	}

	public void setCac_8_1_2(String cac_8_1_2) {
		this.cac_8_1_2 = cac_8_1_2;
	}
	
	@Length(min=0, max=64, message="其他实验室检查评估长度不能超过 64 个字符")
	public String getCac_8_1_2_1() {
		return cac_8_1_2_1;
	}

	public void setCac_8_1_2_1(String cac_8_1_2_1) {
		this.cac_8_1_2_1 = cac_8_1_2_1;
	}
	
	@Length(min=0, max=64, message="是否入院后实施首次胸部影像学检查长度不能超过 64 个字符")
	public String getCac_8_1_3() {
		return cac_8_1_3;
	}

	public void setCac_8_1_3(String cac_8_1_3) {
		this.cac_8_1_3 = cac_8_1_3;
	}
	
	@Length(min=0, max=64, message="胸部影像学检查评估长度不能超过 64 个字符")
	public String getCac_8_1_4() {
		return cac_8_1_4;
	}

	public void setCac_8_1_4(String cac_8_1_4) {
		this.cac_8_1_4 = cac_8_1_4;
	}
	
	@Length(min=0, max=64, message="其他胸部影像学检查评估长度不能超过 64 个字符")
	public String getCac_8_1_4_1() {
		return cac_8_1_4_1;
	}

	public void setCac_8_1_4_1(String cac_8_1_4_1) {
		this.cac_8_1_4_1 = cac_8_1_4_1;
	}
	
	@Length(min=0, max=64, message="是否入院24小时内是否应用抗菌药物长度不能超过 64 个字符")
	public String getCac_8_2_1() {
		return cac_8_2_1;
	}

	public void setCac_8_2_1(String cac_8_2_1) {
		this.cac_8_2_1 = cac_8_2_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCac_8_2_2() {
		return cac_8_2_2;
	}

	public void setCac_8_2_2(Date cac_8_2_2) {
		this.cac_8_2_2 = cac_8_2_2;
	}
	
	@Length(min=0, max=64, message="接受首剂抗菌药物使用时机长度不能超过 64 个字符")
	public String getCac_8_2_3() {
		return cac_8_2_3;
	}

	public void setCac_8_2_3(String cac_8_2_3) {
		this.cac_8_2_3 = cac_8_2_3;
	}
	
	public Double getCac_8_2_3_r() {
		return cac_8_2_3_r;
	}

	public void setCac_8_2_3_r(Double cac_8_2_3_r) {
		this.cac_8_2_3_r = cac_8_2_3_r;
	}
	
	@Length(min=0, max=64, message="入院后是否进行首次病原学检测长度不能超过 64 个字符")
	public String getCac_8_3_1() {
		return cac_8_3_1;
	}

	public void setCac_8_3_1(String cac_8_3_1) {
		this.cac_8_3_1 = cac_8_3_1;
	}
	
	@Length(min=0, max=64, message="病原学诊断结果选择长度不能超过 64 个字符")
	public String getCac_8_3_4() {
		return cac_8_3_4;
	}

	public void setCac_8_3_4(String cac_8_3_4) {
		this.cac_8_3_4 = cac_8_3_4;
	}
	
	@Length(min=0, max=64, message="依据病原学诊断结果，选择目标抗感染药物长度不能超过 64 个字符")
	public String getCac_8_3_3() {
		return cac_8_3_3;
	}

	public void setCac_8_3_3(String cac_8_3_3) {
		this.cac_8_3_3 = cac_8_3_3;
	}
	
	@Length(min=0, max=64, message="使用抗感染药物种类长度不能超过 64 个字符")
	public String getCac_8_3_2() {
		return cac_8_3_2;
	}

	public void setCac_8_3_2(String cac_8_3_2) {
		this.cac_8_3_2 = cac_8_3_2;
	}
	
	@Length(min=0, max=64, message="青霉素类抗感染药物长度不能超过 64 个字符")
	public String getCac_8_3_2_1() {
		return cac_8_3_2_1;
	}

	public void setCac_8_3_2_1(String cac_8_3_2_1) {
		this.cac_8_3_2_1 = cac_8_3_2_1;
	}
	
	@Length(min=0, max=64, message="其它青霉素类抗感染药物名称长度不能超过 64 个字符")
	public String getCac_8_3_2_1_1() {
		return cac_8_3_2_1_1;
	}

	public void setCac_8_3_2_1_1(String cac_8_3_2_1_1) {
		this.cac_8_3_2_1_1 = cac_8_3_2_1_1;
	}
	
	@Length(min=0, max=64, message="头孢菌素类抗感染药物长度不能超过 64 个字符")
	public String getCac_8_3_2_2() {
		return cac_8_3_2_2;
	}

	public void setCac_8_3_2_2(String cac_8_3_2_2) {
		this.cac_8_3_2_2 = cac_8_3_2_2;
	}
	
	@Length(min=0, max=64, message="其它头孢菌素类抗感染药物名称长度不能超过 64 个字符")
	public String getCac_8_3_2_2_1() {
		return cac_8_3_2_2_1;
	}

	public void setCac_8_3_2_2_1(String cac_8_3_2_2_1) {
		this.cac_8_3_2_2_1 = cac_8_3_2_2_1;
	}
	
	@Length(min=0, max=64, message="大环内酯类抗感染药物长度不能超过 64 个字符")
	public String getCac_8_3_2_3() {
		return cac_8_3_2_3;
	}

	public void setCac_8_3_2_3(String cac_8_3_2_3) {
		this.cac_8_3_2_3 = cac_8_3_2_3;
	}
	
	@Length(min=0, max=64, message="其它大环内酯类抗感染药物名称长度不能超过 64 个字符")
	public String getCac_8_3_2_3_1() {
		return cac_8_3_2_3_1;
	}

	public void setCac_8_3_2_3_1(String cac_8_3_2_3_1) {
		this.cac_8_3_2_3_1 = cac_8_3_2_3_1;
	}
	
	@Length(min=0, max=64, message="喹诺酮类抗感染药物长度不能超过 64 个字符")
	public String getCac_8_3_2_4() {
		return cac_8_3_2_4;
	}

	public void setCac_8_3_2_4(String cac_8_3_2_4) {
		this.cac_8_3_2_4 = cac_8_3_2_4;
	}
	
	@Length(min=0, max=64, message="其它喹诺酮类抗感染药物名称长度不能超过 64 个字符")
	public String getCac_8_3_2_4_1() {
		return cac_8_3_2_4_1;
	}

	public void setCac_8_3_2_4_1(String cac_8_3_2_4_1) {
		this.cac_8_3_2_4_1 = cac_8_3_2_4_1;
	}
	
	@Length(min=0, max=64, message="其他类抗感染药物长度不能超过 64 个字符")
	public String getCac_8_3_2_5() {
		return cac_8_3_2_5;
	}

	public void setCac_8_3_2_5(String cac_8_3_2_5) {
		this.cac_8_3_2_5 = cac_8_3_2_5;
	}
	
	@Length(min=0, max=64, message="其他类其它抗感染药物名称长度不能超过 64 个字符")
	public String getCac_8_3_2_5_1() {
		return cac_8_3_2_5_1;
	}

	public void setCac_8_3_2_5_1(String cac_8_3_2_5_1) {
		this.cac_8_3_2_5_1 = cac_8_3_2_5_1;
	}
	
	@Length(min=0, max=64, message="抗真菌药物长度不能超过 64 个字符")
	public String getCac_8_3_2_6() {
		return cac_8_3_2_6;
	}

	public void setCac_8_3_2_6(String cac_8_3_2_6) {
		this.cac_8_3_2_6 = cac_8_3_2_6;
	}
	
	@Length(min=0, max=64, message="其它抗真菌药物名称长度不能超过 64 个字符")
	public String getCac_8_3_2_6_1() {
		return cac_8_3_2_6_1;
	}

	public void setCac_8_3_2_6_1(String cac_8_3_2_6_1) {
		this.cac_8_3_2_6_1 = cac_8_3_2_6_1;
	}
	
	@Length(min=0, max=64, message="是否实施机械通气长度不能超过 64 个字符")
	public String getCac_9_1_1() {
		return cac_9_1_1;
	}

	public void setCac_9_1_1(String cac_9_1_1) {
		this.cac_9_1_1 = cac_9_1_1;
	}
	
	@Length(min=0, max=64, message="机械通气应用指征长度不能超过 64 个字符")
	public String getCac_9_1_2() {
		return cac_9_1_2;
	}

	public void setCac_9_1_2(String cac_9_1_2) {
		this.cac_9_1_2 = cac_9_1_2;
	}
	
	@Length(min=0, max=64, message="其他机械通气应用指征长度不能超过 64 个字符")
	public String getCac_9_1_2_1() {
		return cac_9_1_2_1;
	}

	public void setCac_9_1_2_1(String cac_9_1_2_1) {
		this.cac_9_1_2_1 = cac_9_1_2_1;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCac_9_1_3() {
		return cac_9_1_3;
	}

	public void setCac_9_1_3(Date cac_9_1_3) {
		this.cac_9_1_3 = cac_9_1_3;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCac_9_1_4() {
		return cac_9_1_4;
	}

	public void setCac_9_1_4(Date cac_9_1_4) {
		this.cac_9_1_4 = cac_9_1_4;
	}
	
	public Double getCac_9_1_5() {
		return cac_9_1_5;
	}

	public void setCac_9_1_5(Double cac_9_1_5) {
		this.cac_9_1_5 = cac_9_1_5;
	}
	
	@Length(min=0, max=64, message="是否有肺动脉高压和右心功能不全长度不能超过 64 个字符")
	public String getCac_10_1_1() {
		return cac_10_1_1;
	}

	public void setCac_10_1_1(String cac_10_1_1) {
		this.cac_10_1_1 = cac_10_1_1;
	}
	
	@Length(min=0, max=64, message="首次处置血管扩张剂长度不能超过 64 个字符")
	public String getCac_10_1_2() {
		return cac_10_1_2;
	}

	public void setCac_10_1_2(String cac_10_1_2) {
		this.cac_10_1_2 = cac_10_1_2;
	}
	
	@Length(min=0, max=64, message="其他首次处置血管扩张剂长度不能超过 64 个字符")
	public String getCac_10_1_2_1() {
		return cac_10_1_2_1;
	}

	public void setCac_10_1_2_1(String cac_10_1_2_1) {
		this.cac_10_1_2_1 = cac_10_1_2_1;
	}
	
	@Length(min=0, max=64, message="是否有气胸长度不能超过 64 个字符")
	public String getCac_10_2_1() {
		return cac_10_2_1;
	}

	public void setCac_10_2_1(String cac_10_2_1) {
		this.cac_10_2_1 = cac_10_2_1;
	}
	
	@Length(min=0, max=64, message="首位处置项目的选择长度不能超过 64 个字符")
	public String getCac_10_2_2() {
		return cac_10_2_2;
	}

	public void setCac_10_2_2(String cac_10_2_2) {
		this.cac_10_2_2 = cac_10_2_2;
	}
	
	@Length(min=0, max=64, message="其他首位处置项目长度不能超过 64 个字符")
	public String getCac_10_2_2_1() {
		return cac_10_2_2_1;
	}

	public void setCac_10_2_2_1(String cac_10_2_2_1) {
		this.cac_10_2_2_1 = cac_10_2_2_1;
	}
	
	@Length(min=0, max=64, message="是否有胃食管反流病长度不能超过 64 个字符")
	public String getCac_10_3_1() {
		return cac_10_3_1;
	}

	public void setCac_10_3_1(String cac_10_3_1) {
		this.cac_10_3_1 = cac_10_3_1;
	}
	
	@Length(min=0, max=64, message="首位处置项目的选择长度不能超过 64 个字符")
	public String getCac_10_3_2() {
		return cac_10_3_2;
	}

	public void setCac_10_3_2(String cac_10_3_2) {
		this.cac_10_3_2 = cac_10_3_2;
	}
	
	@Length(min=0, max=64, message="其它首位处置项目长度不能超过 64 个字符")
	public String getCac_10_3_2_1() {
		return cac_10_3_2_1;
	}

	public void setCac_10_3_2_1(String cac_10_3_2_1) {
		this.cac_10_3_2_1 = cac_10_3_2_1;
	}
	
	@Length(min=0, max=64, message="住院期间是否为患者提供健康教育长度不能超过 64 个字符")
	public String getCac_11_1_1() {
		return cac_11_1_1;
	}

	public void setCac_11_1_1(String cac_11_1_1) {
		this.cac_11_1_1 = cac_11_1_1;
	}
	
	@Length(min=0, max=64, message="交与患者“出院小结”的副本告知患者出院时风险因素长度不能超过 64 个字符")
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
	
	@Length(min=0, max=64, message="告知发生紧急意外情况或者疾病复发如何救治及前途经长度不能超过 64 个字符")
	public String getCm_7_2_4() {
		return cm_7_2_4;
	}

	public void setCm_7_2_4(String cm_7_2_4) {
		this.cm_7_2_4 = cm_7_2_4;
	}
	
	@Length(min=0, max=64, message="告知患者进入慢性持续期和临床缓解期，需要进一步控制治疗长度不能超过 64 个字符")
	public String getCac_11_2_4() {
		return cac_11_2_4;
	}

	public void setCac_11_2_4(String cac_11_2_4) {
		this.cac_11_2_4 = cac_11_2_4;
	}
	
	@Length(min=0, max=64, message="告知患者哮喘教育管理途径长度不能超过 64 个字符")
	public String getCac_11_2_5() {
		return cac_11_2_5;
	}

	public void setCac_11_2_5(String cac_11_2_5) {
		this.cac_11_2_5 = cac_11_2_5;
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