/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.um.entity;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotNull;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * UM子宫肌瘤（手术治疗）Entity
 * @author 卡卡西
 * @version 2021-02-06
 */
@Table(name="quality_um", alias="a", columns={
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
		@Column(name="cm_0_1_5", attrName="cm_0_1_5", label="是否UM出院后31天内重复住院"),
		@Column(name="cm_0_2_1_1", attrName="cm_0_2_1_1", label="出生日期"),
		@Column(name="cm_0_2_1_2", attrName="cm_0_2_1_2", label="患者性别"),
		@Column(name="cm_0_2_1_3", attrName="cm_0_2_1_3", label="患者体重", comment="患者体重（kg）"),
		@Column(name="cm_0_2_1_5", attrName="cm_0_2_1_5", label="患者身高", comment="患者身高（cm）"),
		@Column(name="cm_0_2_2_1", attrName="cm_0_2_2_1", label="发病日期时间是否无法确定或无记录"),
		@Column(name="cm_0_2_2_2", attrName="cm_0_2_2_2", label="发病日期时间"),
		@Column(name="cm_0_2_4_1", attrName="cm_0_2_4_1", label="入院日期时间"),
		@Column(name="cm_0_2_4_2", attrName="cm_0_2_4_2", label="出院日期时间"),
		@Column(name="cm_0_2_6_1", attrName="cm_0_2_6_1", label="手术开始", comment="手术开始（切皮）日期时间"),
		@Column(name="cm_0_2_6_2", attrName="cm_0_2_6_2", label="手术结束", comment="手术结束（缝皮结束）日期时间"),
		@Column(name="cm_0_3_1", attrName="cm_0_3_1", label="费用支付方式"),
		@Column(name="cm_0_3_2", attrName="cm_0_3_2", label="收入住院途径"),
		@Column(name="cm_0_3_3", attrName="cm_0_3_3", label="到院交通工具"),
		@Column(name="um_1_1_1", attrName="um_1_1_1", label="患者评估与知情同意"),
		@Column(name="um_1_1_1_1", attrName="um_1_1_1_1", label="其他患者评估与知情同意"),
		@Column(name="um_1_1_2", attrName="um_1_1_2", label="影像学检查评估"),
		@Column(name="um_1_1_2_1", attrName="um_1_1_2_1", label="其他影像学检查评估"),
		@Column(name="um_1_1_3", attrName="um_1_1_3", label="肌瘤数目"),
		@Column(name="um_1_1_4", attrName="um_1_1_4", label="子宫大小"),
		@Column(name="um_1_1_5", attrName="um_1_1_5", label="肌瘤大小"),
		@Column(name="um_1_2_1", attrName="um_1_2_1", label="按生长部位"),
		@Column(name="um_1_2_1_1", attrName="um_1_2_1_1", label="其他生长部位"),
		@Column(name="um_1_2_3", attrName="um_1_2_3", label="子宫肌瘤的分型", comment="子宫肌瘤的分型（国际妇产科联盟（FIGO）"),
		@Column(name="um_1_3_2", attrName="um_1_3_2", label="是否伴发有全身系统性疾病"),
		@Column(name="um_1_3_1", attrName="um_1_3_1", label="全身系统性疾病"),
		@Column(name="um_1_3_1_1", attrName="um_1_3_1_1", label="其他全身系统性疾病名称"),
		@Column(name="um_2_1_1", attrName="um_2_1_1", label="手术治疗符合适应证"),
		@Column(name="um_2_1_1_1", attrName="um_2_1_1_1", label="手术适应证选择"),
		@Column(name="um_2_1_1_2", attrName="um_2_1_1_2", label="其他手术适应证"),
		@Column(name="um_2_1_1_3", attrName="um_2_1_1_3", label="宫腔镜手术适应证选择"),
		@Column(name="um_2_1_1_4", attrName="um_2_1_1_4", label="其他宫腔镜手术适应证"),
		@Column(name="um_2_1_2_1", attrName="um_2_1_2_1", label="是否有手术禁忌证"),
		@Column(name="um_2_1_2", attrName="um_2_1_2", label="手术禁忌证"),
		@Column(name="um_2_1_3_2", attrName="um_2_1_3_2", label="是否有术前预处理"),
		@Column(name="um_2_1_3", attrName="um_2_1_3", label="术前预处理选择"),
		@Column(name="um_2_1_3_1", attrName="um_2_1_3_1", label="其他术前预处理"),
		@Column(name="um_2_1_4", attrName="um_2_1_4", label="手术途径选择"),
		@Column(name="um_2_1_4_1", attrName="um_2_1_4_1", label="其他手术途径"),
		@Column(name="um_2_1_5_2", attrName="um_2_1_5_2", label="是否有术中出血，避免粉碎肌瘤播散的措施"),
		@Column(name="um_2_1_5", attrName="um_2_1_5", label="减少术中出血，避免粉碎肌瘤播散的措施"),
		@Column(name="um_2_1_5_1", attrName="um_2_1_5_1", label="其他减少术中出血，避免粉碎肌瘤播散的措施"),
		@Column(name="um_2_1_6_2", attrName="um_2_1_6_2", label="是否有术中实施其他治疗性操作"),
		@Column(name="um_2_1_6", attrName="um_2_1_6", label="是否实施其他治疗性操作"),
		@Column(name="um_2_1_6_1", attrName="um_2_1_6_1", label="实施其他治疗性操作"),
		@Column(name="um_2_2_1_2", attrName="um_2_2_1_2", label="是否有药物治疗适应症"),
		@Column(name="um_2_2_1", attrName="um_2_2_1", label="适应证选择"),
		@Column(name="um_2_2_1_1", attrName="um_2_2_1_1", label="其他适应证"),
		@Column(name="um_2_2_2", attrName="um_2_2_2", label="治疗药物选择"),
		@Column(name="um_2_2_2_1", attrName="um_2_2_2_1", label="其他治疗药物"),
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
		@Column(name="cm_1_6_3", attrName="cm_1_6_3", label="术后72小时之后继续使用的原因"),
		@Column(name="um_4_1_1", attrName="um_4_1_1", label="术中腹腔内出血量", comment="术中腹腔内出血量(ml)"),
		@Column(name="um_4_1_2", attrName="um_4_1_2", label="是否实施输血"),
		@Column(name="um_4_1_3", attrName="um_4_1_3", label="是否实施回收式自体输血"),
		@Column(name="um_4_1_4", attrName="um_4_1_4", label="用血类别的选择"),
		@Column(name="um_4_1_2_1", attrName="um_4_1_2_1", label="输血量", comment="输血量(ml)"),
		@Column(name="um_4_1_3_1", attrName="um_4_1_3_1", label="其中：回收式自体输血量", comment="其中：回收式自体输血量(ml)"),
		@Column(name="um_4_2_1", attrName="um_4_2_1", label="是否实施储存式自体输血"),
		@Column(name="um_4_2_1_1", attrName="um_4_2_1_1", label="其中：储存式自体输血量", comment="其中：储存式自体输血量(ml)"),
		@Column(name="cm_2_1", attrName="cm_2_1", label="是否有治疗中、治疗后并发症"),
		@Column(name="cm_2_2", attrName="cm_2_2", label="手术后并发症类别及ICD-10四位亚目的选择"),
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
		@Column(name="um_5_1", attrName="um_5_1", label="栓塞、高强度聚焦超声消融技术与热疗技术等治疗后并发症"),
		@Column(name="cm_2_4", attrName="cm_2_4", label="影响程度的选择"),
		@Column(name="um_5_3_1", attrName="um_5_3_1", label="是否再手术"),
		@Column(name="um_6_1_1", attrName="um_6_1_1", label="术前", comment="术前：健康辅导"),
		@Column(name="um_6_1_2", attrName="um_6_1_2", label="术后", comment="术后：健康辅导"),
		@Column(name="um_6_2_1", attrName="um_6_2_1", label="交与患者“出院小结”的副本告知患者出院时风险因素"),
		@Column(name="um_6_2_2", attrName="um_6_2_2", label="出院带药"),
		@Column(name="um_6_2_3", attrName="um_6_2_3", label="告知发生紧急情况时求援救治途径"),
		@Column(name="um_6_2_4", attrName="um_6_2_4", label="出院时教育与随访"),
		@Column(name="um_6_2_5", attrName="um_6_2_5", label="告知何为风险因素与紧急情况"),
		@Column(name="cm_3_1", attrName="cm_3_1", label="手术野皮肤准备常用方法的选择"),
		@Column(name="cm_3_2", attrName="cm_3_2", label="使用含抗菌剂", comment="使用含抗菌剂（三氯生）缝线"),
		@Column(name="cm_3_2_1", attrName="cm_3_2_1", label="其他含抗菌剂缝线填写"),
		@Column(name="cm_3_3", attrName="cm_3_3", label="手术切口类别的选择"),
		@Column(name="cm_3_4", attrName="cm_3_4", label="手术切口愈合情况的选择"),
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
public class QualityUm extends DataEntity<QualityUm> {
	
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
	private String cm_0_1_5;		// 是否UM出院后31天内重复住院
	private String cm_0_2_1_1;		// 出生日期
	private String cm_0_2_1_2;		// 患者性别
	private Double cm_0_2_1_3;		// 患者体重（kg）
	private Double cm_0_2_1_5;		// 患者身高（cm）
	private String cm_0_2_2_1;		// 发病日期时间是否无法确定或无记录
	private String cm_0_2_2_2;		// 发病日期时间
	private String cm_0_2_4_1;		// 入院日期时间
	private String cm_0_2_4_2;		// 出院日期时间
	private String cm_0_2_6_1;		// 手术开始（切皮）日期时间
	private String cm_0_2_6_2;		// 手术结束（缝皮结束）日期时间
	private String cm_0_3_1;		// 费用支付方式
	private String cm_0_3_2;		// 收入住院途径
	private String cm_0_3_3;		// 到院交通工具
	private String um_1_1_1;		// 患者评估与知情同意
	private String um_1_1_1_1;		// 其他患者评估与知情同意
	private String um_1_1_2;		// 影像学检查评估
	private String um_1_1_2_1;		// 其他影像学检查评估
	private String um_1_1_3;		// 肌瘤数目
	private String um_1_1_4;		// 子宫大小
	private String um_1_1_5;		// 肌瘤大小
	private String um_1_2_1;		// 按生长部位
	private String um_1_2_1_1;		// 其他生长部位
	private String um_1_2_3;		// 子宫肌瘤的分型（国际妇产科联盟（FIGO）
	private String um_1_3_2;		// 是否伴发有全身系统性疾病
	private String um_1_3_1;		// 全身系统性疾病
	private String um_1_3_1_1;		// 其他全身系统性疾病名称
	private String um_2_1_1;		// 手术治疗符合适应证
	private String um_2_1_1_1;		// 手术适应证选择
	private String um_2_1_1_2;		// 其他手术适应证
	private String um_2_1_1_3;		// 宫腔镜手术适应证选择
	private String um_2_1_1_4;		// 其他宫腔镜手术适应证
	private String um_2_1_2_1;		// 是否有手术禁忌证
	private String um_2_1_2;		// 手术禁忌证
	private String um_2_1_3_2;		// 是否有术前预处理
	private String um_2_1_3;		// 术前预处理选择
	private String um_2_1_3_1;		// 其他术前预处理
	private String um_2_1_4;		// 手术途径选择
	private String um_2_1_4_1;		// 其他手术途径
	private String um_2_1_5_2;		// 是否有术中出血，避免粉碎肌瘤播散的措施
	private String um_2_1_5;		// 减少术中出血，避免粉碎肌瘤播散的措施
	private String um_2_1_5_1;		// 其他减少术中出血，避免粉碎肌瘤播散的措施
	private String um_2_1_6_2;		// 是否有术中实施其他治疗性操作
	private String um_2_1_6;		// 是否实施其他治疗性操作
	private String um_2_1_6_1;		// 实施其他治疗性操作
	private String um_2_2_1_2;		// 是否有药物治疗适应症
	private String um_2_2_1;		// 适应证选择
	private String um_2_2_1_1;		// 其他适应证
	private String um_2_2_2;		// 治疗药物选择
	private String um_2_2_2_1;		// 其他治疗药物
	private String cm_1_1_1;		// 是否使用预防性抗菌药物
	private String cm_1_2_1_2;		// 预防性抗菌药物选择
	private String cm_1_2_2_2;		// 选择碳青霉烯类及替加环素等特殊使用级抗菌药物
	private String cm_1_2_2_1;		// 其他特殊使用级抗菌药物名称
	private String cm_1_3_1_2;		// 选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素
	private String cm_1_3_1_1;		// 选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素填写
	private String cm_1_4_1;		// 使用首剂抗菌药物起始时间
	private String cm_1_5_1;		// 手术时间是否≥3小时
	private String cm_1_5_2;		// 是否术中追加抗菌药物
	private String cm_1_5_3;		// 术中出血量是否≥1500ml
	private String cm_1_5_4;		// 是否术中追加抗菌药物
	private String cm_1_6_1;		// 术后抗菌药物停止使用时间
	private String cm_1_6_2;		// 使用抗菌药物时间使用时间分层
	private String cm_1_6_3;		// 术后72小时之后继续使用的原因
	private Double um_4_1_1;		// 术中腹腔内出血量(ml)
	private String um_4_1_2;		// 是否实施输血
	private String um_4_1_3;		// 是否实施回收式自体输血
	private String um_4_1_4;		// 用血类别的选择
	private Double um_4_1_2_1;		// 输血量(ml)
	private Double um_4_1_3_1;		// 其中：回收式自体输血量(ml)
	private String um_4_2_1;		// 是否实施储存式自体输血
	private Double um_4_2_1_1;		// 其中：储存式自体输血量(ml)
	private String cm_2_1;		// 是否有治疗中、治疗后并发症
	private String cm_2_2;		// 手术后并发症类别及ICD-10四位亚目的选择
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
	private String um_5_1;		// 栓塞、高强度聚焦超声消融技术与热疗技术等治疗后并发症
	private String cm_2_4;		// 影响程度的选择
	private String um_5_3_1;		// 是否再手术
	private String um_6_1_1;		// 术前：健康辅导
	private String um_6_1_2;		// 术后：健康辅导
	private String um_6_2_1;		// 交与患者“出院小结”的副本告知患者出院时风险因素
	private String um_6_2_2;		// 出院带药
	private String um_6_2_3;		// 告知发生紧急情况时求援救治途径
	private String um_6_2_4;		// 出院时教育与随访
	private String um_6_2_5;		// 告知何为风险因素与紧急情况
	private String cm_3_1;		// 手术野皮肤准备常用方法的选择
	private String cm_3_2;		// 使用含抗菌剂（三氯生）缝线
	private String cm_3_2_1;		// 其他含抗菌剂缝线填写
	private String cm_3_3;		// 手术切口类别的选择
	private String cm_3_4;		// 手术切口愈合情况的选择
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
	
	public QualityUm() {
		this(null);
	}

	public QualityUm(String id){
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
	
	@NotBlank(message="患者病案号不能为空")
	@Length(min=0, max=64, message="患者病案号长度不能超过 64 个字符")
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
	
	@NotBlank(message="主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称不能为空")
	@Length(min=0, max=64, message="主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称长度不能超过 64 个字符")
	public String getCm_0_1_4_1() {
		return cm_0_1_4_1;
	}

	public void setCm_0_1_4_1(String cm_0_1_4_1) {
		this.cm_0_1_4_1 = cm_0_1_4_1;
	}
	
	@NotBlank(message="主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称不能为空")
	@Length(min=0, max=64, message="主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称长度不能超过 64 个字符")
	public String getCm_0_1_4_2() {
		return cm_0_1_4_2;
	}

	public void setCm_0_1_4_2(String cm_0_1_4_2) {
		this.cm_0_1_4_2 = cm_0_1_4_2;
	}
	
	@NotBlank(message="是否UM出院后31天内重复住院不能为空")
	@Length(min=0, max=64, message="是否UM出院后31天内重复住院长度不能超过 64 个字符")
	public String getCm_0_1_5() {
		return cm_0_1_5;
	}

	public void setCm_0_1_5(String cm_0_1_5) {
		this.cm_0_1_5 = cm_0_1_5;
	}
	
	@NotBlank(message="出生日期不能为空")
	@Length(min=0, max=64, message="出生日期长度不能超过 64 个字符")
	public String getCm_0_2_1_1() {
		return cm_0_2_1_1;
	}

	public void setCm_0_2_1_1(String cm_0_2_1_1) {
		this.cm_0_2_1_1 = cm_0_2_1_1;
	}
	
	@NotBlank(message="患者性别不能为空")
	@Length(min=0, max=64, message="患者性别长度不能超过 64 个字符")
	public String getCm_0_2_1_2() {
		return cm_0_2_1_2;
	}

	public void setCm_0_2_1_2(String cm_0_2_1_2) {
		this.cm_0_2_1_2 = cm_0_2_1_2;
	}
	
	@NotNull(message="患者体重不能为空")
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
	
	@NotBlank(message="入院日期时间不能为空")
	@Length(min=0, max=64, message="入院日期时间长度不能超过 64 个字符")
	public String getCm_0_2_4_1() {
		return cm_0_2_4_1;
	}

	public void setCm_0_2_4_1(String cm_0_2_4_1) {
		this.cm_0_2_4_1 = cm_0_2_4_1;
	}
	
	@NotBlank(message="出院日期时间不能为空")
	@Length(min=0, max=64, message="出院日期时间长度不能超过 64 个字符")
	public String getCm_0_2_4_2() {
		return cm_0_2_4_2;
	}

	public void setCm_0_2_4_2(String cm_0_2_4_2) {
		this.cm_0_2_4_2 = cm_0_2_4_2;
	}
	
	@NotBlank(message="手术开始不能为空")
	@Length(min=0, max=64, message="手术开始长度不能超过 64 个字符")
	public String getCm_0_2_6_1() {
		return cm_0_2_6_1;
	}

	public void setCm_0_2_6_1(String cm_0_2_6_1) {
		this.cm_0_2_6_1 = cm_0_2_6_1;
	}
	
	@NotBlank(message="手术结束不能为空")
	@Length(min=0, max=64, message="手术结束长度不能超过 64 个字符")
	public String getCm_0_2_6_2() {
		return cm_0_2_6_2;
	}

	public void setCm_0_2_6_2(String cm_0_2_6_2) {
		this.cm_0_2_6_2 = cm_0_2_6_2;
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
	
	@NotBlank(message="患者评估与知情同意不能为空")
	@Length(min=0, max=64, message="患者评估与知情同意长度不能超过 64 个字符")
	public String getUm_1_1_1() {
		return um_1_1_1;
	}

	public void setUm_1_1_1(String um_1_1_1) {
		this.um_1_1_1 = um_1_1_1;
	}
	
	@Length(min=0, max=64, message="其他患者评估与知情同意长度不能超过 64 个字符")
	public String getUm_1_1_1_1() {
		return um_1_1_1_1;
	}

	public void setUm_1_1_1_1(String um_1_1_1_1) {
		this.um_1_1_1_1 = um_1_1_1_1;
	}
	
	@NotBlank(message="影像学检查评估不能为空")
	@Length(min=0, max=64, message="影像学检查评估长度不能超过 64 个字符")
	public String getUm_1_1_2() {
		return um_1_1_2;
	}

	public void setUm_1_1_2(String um_1_1_2) {
		this.um_1_1_2 = um_1_1_2;
	}
	
	@Length(min=0, max=64, message="其他影像学检查评估长度不能超过 64 个字符")
	public String getUm_1_1_2_1() {
		return um_1_1_2_1;
	}

	public void setUm_1_1_2_1(String um_1_1_2_1) {
		this.um_1_1_2_1 = um_1_1_2_1;
	}
	
	@NotBlank(message="肌瘤数目不能为空")
	@Length(min=0, max=64, message="肌瘤数目长度不能超过 64 个字符")
	public String getUm_1_1_3() {
		return um_1_1_3;
	}

	public void setUm_1_1_3(String um_1_1_3) {
		this.um_1_1_3 = um_1_1_3;
	}
	
	@NotBlank(message="子宫大小不能为空")
	@Length(min=0, max=64, message="子宫大小长度不能超过 64 个字符")
	public String getUm_1_1_4() {
		return um_1_1_4;
	}

	public void setUm_1_1_4(String um_1_1_4) {
		this.um_1_1_4 = um_1_1_4;
	}
	
	@NotBlank(message="肌瘤大小不能为空")
	@Length(min=0, max=64, message="肌瘤大小长度不能超过 64 个字符")
	public String getUm_1_1_5() {
		return um_1_1_5;
	}

	public void setUm_1_1_5(String um_1_1_5) {
		this.um_1_1_5 = um_1_1_5;
	}
	
	@NotBlank(message="按生长部位不能为空")
	@Length(min=0, max=64, message="按生长部位长度不能超过 64 个字符")
	public String getUm_1_2_1() {
		return um_1_2_1;
	}

	public void setUm_1_2_1(String um_1_2_1) {
		this.um_1_2_1 = um_1_2_1;
	}
	
	@Length(min=0, max=64, message="其他生长部位长度不能超过 64 个字符")
	public String getUm_1_2_1_1() {
		return um_1_2_1_1;
	}

	public void setUm_1_2_1_1(String um_1_2_1_1) {
		this.um_1_2_1_1 = um_1_2_1_1;
	}
	
	@NotBlank(message="子宫肌瘤的分型不能为空")
	@Length(min=0, max=64, message="子宫肌瘤的分型长度不能超过 64 个字符")
	public String getUm_1_2_3() {
		return um_1_2_3;
	}

	public void setUm_1_2_3(String um_1_2_3) {
		this.um_1_2_3 = um_1_2_3;
	}
	
	@NotBlank(message="是否伴发有全身系统性疾病不能为空")
	@Length(min=0, max=64, message="是否伴发有全身系统性疾病长度不能超过 64 个字符")
	public String getUm_1_3_2() {
		return um_1_3_2;
	}

	public void setUm_1_3_2(String um_1_3_2) {
		this.um_1_3_2 = um_1_3_2;
	}
	
	@Length(min=0, max=64, message="全身系统性疾病长度不能超过 64 个字符")
	public String getUm_1_3_1() {
		return um_1_3_1;
	}

	public void setUm_1_3_1(String um_1_3_1) {
		this.um_1_3_1 = um_1_3_1;
	}
	
	@Length(min=0, max=64, message="其他全身系统性疾病名称长度不能超过 64 个字符")
	public String getUm_1_3_1_1() {
		return um_1_3_1_1;
	}

	public void setUm_1_3_1_1(String um_1_3_1_1) {
		this.um_1_3_1_1 = um_1_3_1_1;
	}
	
	@NotBlank(message="手术治疗符合适应证不能为空")
	@Length(min=0, max=64, message="手术治疗符合适应证长度不能超过 64 个字符")
	public String getUm_2_1_1() {
		return um_2_1_1;
	}

	public void setUm_2_1_1(String um_2_1_1) {
		this.um_2_1_1 = um_2_1_1;
	}
	
	@Length(min=0, max=64, message="手术适应证选择长度不能超过 64 个字符")
	public String getUm_2_1_1_1() {
		return um_2_1_1_1;
	}

	public void setUm_2_1_1_1(String um_2_1_1_1) {
		this.um_2_1_1_1 = um_2_1_1_1;
	}
	
	@Length(min=0, max=64, message="其他手术适应证长度不能超过 64 个字符")
	public String getUm_2_1_1_2() {
		return um_2_1_1_2;
	}

	public void setUm_2_1_1_2(String um_2_1_1_2) {
		this.um_2_1_1_2 = um_2_1_1_2;
	}
	
	@Length(min=0, max=64, message="宫腔镜手术适应证选择长度不能超过 64 个字符")
	public String getUm_2_1_1_3() {
		return um_2_1_1_3;
	}

	public void setUm_2_1_1_3(String um_2_1_1_3) {
		this.um_2_1_1_3 = um_2_1_1_3;
	}
	
	@Length(min=0, max=64, message="其他宫腔镜手术适应证长度不能超过 64 个字符")
	public String getUm_2_1_1_4() {
		return um_2_1_1_4;
	}

	public void setUm_2_1_1_4(String um_2_1_1_4) {
		this.um_2_1_1_4 = um_2_1_1_4;
	}
	
	@NotBlank(message="是否有手术禁忌证不能为空")
	@Length(min=0, max=64, message="是否有手术禁忌证长度不能超过 64 个字符")
	public String getUm_2_1_2_1() {
		return um_2_1_2_1;
	}

	public void setUm_2_1_2_1(String um_2_1_2_1) {
		this.um_2_1_2_1 = um_2_1_2_1;
	}
	
	@Length(min=0, max=64, message="手术禁忌证长度不能超过 64 个字符")
	public String getUm_2_1_2() {
		return um_2_1_2;
	}

	public void setUm_2_1_2(String um_2_1_2) {
		this.um_2_1_2 = um_2_1_2;
	}
	
	@NotBlank(message="是否有术前预处理不能为空")
	@Length(min=0, max=64, message="是否有术前预处理长度不能超过 64 个字符")
	public String getUm_2_1_3_2() {
		return um_2_1_3_2;
	}

	public void setUm_2_1_3_2(String um_2_1_3_2) {
		this.um_2_1_3_2 = um_2_1_3_2;
	}
	
	@Length(min=0, max=64, message="术前预处理选择长度不能超过 64 个字符")
	public String getUm_2_1_3() {
		return um_2_1_3;
	}

	public void setUm_2_1_3(String um_2_1_3) {
		this.um_2_1_3 = um_2_1_3;
	}
	
	@Length(min=0, max=64, message="其他术前预处理长度不能超过 64 个字符")
	public String getUm_2_1_3_1() {
		return um_2_1_3_1;
	}

	public void setUm_2_1_3_1(String um_2_1_3_1) {
		this.um_2_1_3_1 = um_2_1_3_1;
	}
	
	@NotBlank(message="手术途径选择不能为空")
	@Length(min=0, max=64, message="手术途径选择长度不能超过 64 个字符")
	public String getUm_2_1_4() {
		return um_2_1_4;
	}

	public void setUm_2_1_4(String um_2_1_4) {
		this.um_2_1_4 = um_2_1_4;
	}
	
	@Length(min=0, max=64, message="其他手术途径长度不能超过 64 个字符")
	public String getUm_2_1_4_1() {
		return um_2_1_4_1;
	}

	public void setUm_2_1_4_1(String um_2_1_4_1) {
		this.um_2_1_4_1 = um_2_1_4_1;
	}
	
	@Length(min=0, max=64, message="是否有术中出血，避免粉碎肌瘤播散的措施长度不能超过 64 个字符")
	public String getUm_2_1_5_2() {
		return um_2_1_5_2;
	}

	public void setUm_2_1_5_2(String um_2_1_5_2) {
		this.um_2_1_5_2 = um_2_1_5_2;
	}
	
	@Length(min=0, max=64, message="减少术中出血，避免粉碎肌瘤播散的措施长度不能超过 64 个字符")
	public String getUm_2_1_5() {
		return um_2_1_5;
	}

	public void setUm_2_1_5(String um_2_1_5) {
		this.um_2_1_5 = um_2_1_5;
	}
	
	@Length(min=0, max=64, message="其他减少术中出血，避免粉碎肌瘤播散的措施长度不能超过 64 个字符")
	public String getUm_2_1_5_1() {
		return um_2_1_5_1;
	}

	public void setUm_2_1_5_1(String um_2_1_5_1) {
		this.um_2_1_5_1 = um_2_1_5_1;
	}
	
	@Length(min=0, max=64, message="是否有术中实施其他治疗性操作长度不能超过 64 个字符")
	public String getUm_2_1_6_2() {
		return um_2_1_6_2;
	}

	public void setUm_2_1_6_2(String um_2_1_6_2) {
		this.um_2_1_6_2 = um_2_1_6_2;
	}
	
	@Length(min=0, max=64, message="是否实施其他治疗性操作长度不能超过 64 个字符")
	public String getUm_2_1_6() {
		return um_2_1_6;
	}

	public void setUm_2_1_6(String um_2_1_6) {
		this.um_2_1_6 = um_2_1_6;
	}
	
	@Length(min=0, max=64, message="实施其他治疗性操作长度不能超过 64 个字符")
	public String getUm_2_1_6_1() {
		return um_2_1_6_1;
	}

	public void setUm_2_1_6_1(String um_2_1_6_1) {
		this.um_2_1_6_1 = um_2_1_6_1;
	}
	
	@Length(min=0, max=64, message="是否有药物治疗适应症长度不能超过 64 个字符")
	public String getUm_2_2_1_2() {
		return um_2_2_1_2;
	}

	public void setUm_2_2_1_2(String um_2_2_1_2) {
		this.um_2_2_1_2 = um_2_2_1_2;
	}
	
	@Length(min=0, max=64, message="适应证选择长度不能超过 64 个字符")
	public String getUm_2_2_1() {
		return um_2_2_1;
	}

	public void setUm_2_2_1(String um_2_2_1) {
		this.um_2_2_1 = um_2_2_1;
	}
	
	@Length(min=0, max=64, message="其他适应证长度不能超过 64 个字符")
	public String getUm_2_2_1_1() {
		return um_2_2_1_1;
	}

	public void setUm_2_2_1_1(String um_2_2_1_1) {
		this.um_2_2_1_1 = um_2_2_1_1;
	}
	
	@Length(min=0, max=64, message="治疗药物选择长度不能超过 64 个字符")
	public String getUm_2_2_2() {
		return um_2_2_2;
	}

	public void setUm_2_2_2(String um_2_2_2) {
		this.um_2_2_2 = um_2_2_2;
	}
	
	@Length(min=0, max=64, message="其他治疗药物长度不能超过 64 个字符")
	public String getUm_2_2_2_1() {
		return um_2_2_2_1;
	}

	public void setUm_2_2_2_1(String um_2_2_2_1) {
		this.um_2_2_2_1 = um_2_2_2_1;
	}
	
	@NotBlank(message="是否使用预防性抗菌药物不能为空")
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
	
	@Length(min=0, max=64, message="使用首剂抗菌药物起始时间长度不能超过 64 个字符")
	public String getCm_1_4_1() {
		return cm_1_4_1;
	}

	public void setCm_1_4_1(String cm_1_4_1) {
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
	
	@Length(min=0, max=64, message="术后抗菌药物停止使用时间长度不能超过 64 个字符")
	public String getCm_1_6_1() {
		return cm_1_6_1;
	}

	public void setCm_1_6_1(String cm_1_6_1) {
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
	public String getCm_1_6_3() {
		return cm_1_6_3;
	}

	public void setCm_1_6_3(String cm_1_6_3) {
		this.cm_1_6_3 = cm_1_6_3;
	}
	
	@NotNull(message="术中腹腔内出血量不能为空")
	public Double getUm_4_1_1() {
		return um_4_1_1;
	}

	public void setUm_4_1_1(Double um_4_1_1) {
		this.um_4_1_1 = um_4_1_1;
	}
	
	@NotBlank(message="是否实施输血不能为空")
	@Length(min=0, max=64, message="是否实施输血长度不能超过 64 个字符")
	public String getUm_4_1_2() {
		return um_4_1_2;
	}

	public void setUm_4_1_2(String um_4_1_2) {
		this.um_4_1_2 = um_4_1_2;
	}
	
	@Length(min=0, max=64, message="是否实施回收式自体输血长度不能超过 64 个字符")
	public String getUm_4_1_3() {
		return um_4_1_3;
	}

	public void setUm_4_1_3(String um_4_1_3) {
		this.um_4_1_3 = um_4_1_3;
	}
	
	@Length(min=0, max=64, message="用血类别的选择长度不能超过 64 个字符")
	public String getUm_4_1_4() {
		return um_4_1_4;
	}

	public void setUm_4_1_4(String um_4_1_4) {
		this.um_4_1_4 = um_4_1_4;
	}
	
	public Double getUm_4_1_2_1() {
		return um_4_1_2_1;
	}

	public void setUm_4_1_2_1(Double um_4_1_2_1) {
		this.um_4_1_2_1 = um_4_1_2_1;
	}
	
	public Double getUm_4_1_3_1() {
		return um_4_1_3_1;
	}

	public void setUm_4_1_3_1(Double um_4_1_3_1) {
		this.um_4_1_3_1 = um_4_1_3_1;
	}
	
	@Length(min=0, max=64, message="是否实施储存式自体输血长度不能超过 64 个字符")
	public String getUm_4_2_1() {
		return um_4_2_1;
	}

	public void setUm_4_2_1(String um_4_2_1) {
		this.um_4_2_1 = um_4_2_1;
	}
	
	public Double getUm_4_2_1_1() {
		return um_4_2_1_1;
	}

	public void setUm_4_2_1_1(Double um_4_2_1_1) {
		this.um_4_2_1_1 = um_4_2_1_1;
	}
	
	@NotBlank(message="是否有治疗中、治疗后并发症不能为空")
	@Length(min=0, max=64, message="是否有治疗中、治疗后并发症长度不能超过 64 个字符")
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
	
	@Length(min=0, max=64, message="栓塞、高强度聚焦超声消融技术与热疗技术等治疗后并发症长度不能超过 64 个字符")
	public String getUm_5_1() {
		return um_5_1;
	}

	public void setUm_5_1(String um_5_1) {
		this.um_5_1 = um_5_1;
	}
	
	@Length(min=0, max=64, message="影响程度的选择长度不能超过 64 个字符")
	public String getCm_2_4() {
		return cm_2_4;
	}

	public void setCm_2_4(String cm_2_4) {
		this.cm_2_4 = cm_2_4;
	}
	
	@Length(min=0, max=64, message="是否再手术长度不能超过 64 个字符")
	public String getUm_5_3_1() {
		return um_5_3_1;
	}

	public void setUm_5_3_1(String um_5_3_1) {
		this.um_5_3_1 = um_5_3_1;
	}
	
	@NotBlank(message="术前不能为空")
	@Length(min=0, max=64, message="术前长度不能超过 64 个字符")
	public String getUm_6_1_1() {
		return um_6_1_1;
	}

	public void setUm_6_1_1(String um_6_1_1) {
		this.um_6_1_1 = um_6_1_1;
	}
	
	@NotBlank(message="术后不能为空")
	@Length(min=0, max=64, message="术后长度不能超过 64 个字符")
	public String getUm_6_1_2() {
		return um_6_1_2;
	}

	public void setUm_6_1_2(String um_6_1_2) {
		this.um_6_1_2 = um_6_1_2;
	}
	
	@NotBlank(message="交与患者“出院小结”的副本告知患者出院时风险因素不能为空")
	@Length(min=0, max=64, message="交与患者“出院小结”的副本告知患者出院时风险因素长度不能超过 64 个字符")
	public String getUm_6_2_1() {
		return um_6_2_1;
	}

	public void setUm_6_2_1(String um_6_2_1) {
		this.um_6_2_1 = um_6_2_1;
	}
	
	@NotBlank(message="出院带药不能为空")
	@Length(min=0, max=64, message="出院带药长度不能超过 64 个字符")
	public String getUm_6_2_2() {
		return um_6_2_2;
	}

	public void setUm_6_2_2(String um_6_2_2) {
		this.um_6_2_2 = um_6_2_2;
	}
	
	@NotBlank(message="告知发生紧急情况时求援救治途径不能为空")
	@Length(min=0, max=64, message="告知发生紧急情况时求援救治途径长度不能超过 64 个字符")
	public String getUm_6_2_3() {
		return um_6_2_3;
	}

	public void setUm_6_2_3(String um_6_2_3) {
		this.um_6_2_3 = um_6_2_3;
	}
	
	@NotBlank(message="出院时教育与随访不能为空")
	@Length(min=0, max=64, message="出院时教育与随访长度不能超过 64 个字符")
	public String getUm_6_2_4() {
		return um_6_2_4;
	}

	public void setUm_6_2_4(String um_6_2_4) {
		this.um_6_2_4 = um_6_2_4;
	}
	
	@NotBlank(message="告知何为风险因素与紧急情况不能为空")
	@Length(min=0, max=64, message="告知何为风险因素与紧急情况长度不能超过 64 个字符")
	public String getUm_6_2_5() {
		return um_6_2_5;
	}

	public void setUm_6_2_5(String um_6_2_5) {
		this.um_6_2_5 = um_6_2_5;
	}
	
	@NotBlank(message="手术野皮肤准备常用方法的选择不能为空")
	@Length(min=0, max=64, message="手术野皮肤准备常用方法的选择长度不能超过 64 个字符")
	public String getCm_3_1() {
		return cm_3_1;
	}

	public void setCm_3_1(String cm_3_1) {
		this.cm_3_1 = cm_3_1;
	}
	
	@NotBlank(message="使用含抗菌剂不能为空")
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
	
	@NotBlank(message="手术切口类别的选择不能为空")
	@Length(min=0, max=64, message="手术切口类别的选择长度不能超过 64 个字符")
	public String getCm_3_3() {
		return cm_3_3;
	}

	public void setCm_3_3(String cm_3_3) {
		this.cm_3_3 = cm_3_3;
	}
	
	@NotBlank(message="手术切口愈合情况的选择不能为空")
	@Length(min=0, max=64, message="手术切口愈合情况的选择长度不能超过 64 个字符")
	public String getCm_3_4() {
		return cm_3_4;
	}

	public void setCm_3_4(String cm_3_4) {
		this.cm_3_4 = cm_3_4;
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
	
	@NotBlank(message="患者是否对服务的体验与评价不能为空")
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
	
}