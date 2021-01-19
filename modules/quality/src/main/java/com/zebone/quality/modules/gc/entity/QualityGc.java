/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.gc.entity;

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
 * GC胃癌（手术治疗）Entity
 * @author 卡卡西
 * @version 2021-01-19
 */
@Table(name="quality_gc", alias="a", columns={
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
		@Column(name="cm_0_2_4_1", attrName="cm_0_2_4_1", label="入院日期时间"),
		@Column(name="cm_0_2_4_2", attrName="cm_0_2_4_2", label="出院日期时间"),
		@Column(name="cm_0_2_6_1", attrName="cm_0_2_6_1", label="手术开始", comment="手术开始（切皮）日期时间"),
		@Column(name="cm_0_2_6_2", attrName="cm_0_2_6_2", label="手术结束", comment="手术结束（缝皮结束）日期时间"),
		@Column(name="cm_0_3_1", attrName="cm_0_3_1", label="费用支付方式"),
		@Column(name="cm_0_3_2", attrName="cm_0_3_2", label="收入住院途径"),
		@Column(name="cm_0_3_3", attrName="cm_0_3_3", label="到院交通工具"),
		@Column(name="gc_1_1_1", attrName="gc_1_1_1", label="临床TNM分期前主要检查项目"),
		@Column(name="gc_1_2_1", attrName="gc_1_2_1", label="治疗前是否完成临床 TNM分期"),
		@Column(name="gc_1_2_2", attrName="gc_1_2_2", label="原发肿瘤", comment="原发肿瘤（T）分期"),
		@Column(name="gc_1_2_3", attrName="gc_1_2_3", label="区域淋巴结", comment="区域淋巴结（N）分期"),
		@Column(name="gc_1_2_4", attrName="gc_1_2_4", label="远处转移", comment="远处转移（M）分期"),
		@Column(name="gc_1_2_5", attrName="gc_1_2_5", label="胃癌治疗前 cTNM 分期结论"),
		@Column(name="gc_1_3_1_1", attrName="gc_1_3_1_1", label="治疗前是否完成胃癌CT分期"),
		@Column(name="gc_1_3_1", attrName="gc_1_3_1", label="cT分期病理学定义"),
		@Column(name="gc_1_4_1_1", attrName="gc_1_4_1_1", label="治疗前是否完成胃癌超声内镜", comment="治疗前是否完成胃癌超声内镜（EUS）分期"),
		@Column(name="gc_1_4_1", attrName="gc_1_4_1", label="uT分期病理学定义"),
		@Column(name="gc_1_5_1", attrName="gc_1_5_1", label="是否是治疗前接受过2个或以上治疗科室会诊的患者"),
		@Column(name="gc_2_2_1", attrName="gc_2_2_1", label="治疗前是否有病理组织形态学/细胞学诊断报告"),
		@Column(name="gc_2_2_2", attrName="gc_2_2_2", label="采集组织或细胞学标本来源途径"),
		@Column(name="gc_2_2_2_1", attrName="gc_2_2_2_1", label="其他细胞学标本来源途径"),
		@Column(name="gc_2_2_3", attrName="gc_2_2_3", label="是否有pTNM 临床分期结论"),
		@Column(name="gc_2_2_4", attrName="gc_2_2_4", label="pTNM 临床分期结论"),
		@Column(name="gc_2_2_4_2", attrName="gc_2_2_4_2", label="病理组织形态学/细胞学诊断报告单pTNM 临床分期结论距本次治疗前的时限"),
		@Column(name="gc_3_1_1_1", attrName="gc_3_1_1_1", label="手术路径的选择"),
		@Column(name="gc_3_1_1_2", attrName="gc_3_1_1_2", label="术中探及胃癌病变涉及的范围"),
		@Column(name="gc_3_1_2", attrName="gc_3_1_2", label="手术治疗符合原则规范"),
		@Column(name="gc_3_2_1", attrName="gc_3_2_1", label="实施的胃癌根治性术式的选择"),
		@Column(name="gc_3_2_2", attrName="gc_3_2_2", label="术后消化道重建的方式的选择"),
		@Column(name="gc_3_2_2_1", attrName="gc_3_2_2_1", label="其他术后消化道重建的方式"),
		@Column(name="gc_3_3_1", attrName="gc_3_3_1", label="胃癌手术中达到安全切缘是否有证实措施"),
		@Column(name="gc_3_3_2", attrName="gc_3_3_2", label="记入手术记录中安全切缘证实措施的选择"),
		@Column(name="gc_3_4_1", attrName="gc_3_4_1", label="是否使用各种吻合器"),
		@Column(name="gc_4_2_1", attrName="gc_4_2_1", label="是否进行手术淋巴结清扫"),
		@Column(name="gc_4_2_2", attrName="gc_4_2_2", label="淋巴结清扫组别"),
		@Column(name="gc_4_2_3", attrName="gc_4_2_3", label="淋巴结清除结果"),
		@Column(name="gc_5_1_1", attrName="gc_5_1_1", label="是否有病理学诊断"),
		@Column(name="gc_5_1_2", attrName="gc_5_1_2", label="采集组织或细胞学标本途经的选择"),
		@Column(name="gc_5_1_3", attrName="gc_5_1_3", label="合格的病理报告包括以下主要内容"),
		@Column(name="gc_5_1_3_1", attrName="gc_5_1_3_1", label="其他合格的病理报告"),
		@Column(name="gc_5_2_1", attrName="gc_5_2_1", label="是否有胃癌病理pTNM分期"),
		@Column(name="gc_5_2_2", attrName="gc_5_2_2", label="pTNM 分期结论"),
		@Column(name="gc_5_3_1", attrName="gc_5_3_1", label="是否有组织学分级", comment="是否有组织学分级（G）"),
		@Column(name="gc_5_3_2", attrName="gc_5_3_2", label="组织学分级", comment="组织学分级（G）"),
		@Column(name="gc_6_1_1", attrName="gc_6_1_1", label="是否有术前评估"),
		@Column(name="gc_6_1_2", attrName="gc_6_1_2", label="术前评估内容"),
		@Column(name="gc_6_1_3", attrName="gc_6_1_3", label="治疗的适应证"),
		@Column(name="gc_6_2_1", attrName="gc_6_2_1", label="是否有内镜治疗禁忌证"),
		@Column(name="gc_6_2_2", attrName="gc_6_2_2", label="治疗禁忌证"),
		@Column(name="gc_6_2_2_1", attrName="gc_6_2_2_1", label="其他治疗禁忌证"),
		@Column(name="gc_6_3_1", attrName="gc_6_3_1", label="术式选择"),
		@Column(name="gc_6_3_1_1", attrName="gc_6_3_1_1", label="其他术式选择"),
		@Column(name="gc_8_2_1", attrName="gc_8_2_1", label="是否是非计划二次手术"),
		@Column(name="gc_8_2_2", attrName="gc_8_2_2", label="非计划二次手术主要原因的选择"),
		@Column(name="gc_8_2_2_1", attrName="gc_8_2_2_1", label="其他非计划二次手术主要原因"),
		@Column(name="gc_8_2_3", attrName="gc_8_2_3", label="二次手术开始", comment="二次手术开始（切皮）日期时间"),
		@Column(name="gc_8_2_4", attrName="gc_8_2_4", label="二次手术结束", comment="二次手术结束（缝皮结束）日期时间"),
		@Column(name="gc_8_3_1", attrName="gc_8_3_1", label="内镜治疗术后并发症"),
		@Column(name="gc_8_3_2", attrName="gc_8_3_2", label="并发症"),
		@Column(name="gc_8_3_2_1", attrName="gc_8_3_2_1", label="其他并发症"),
		@Column(name="gc_8_3_3", attrName="gc_8_3_3", label="术后并发症处理"),
		@Column(name="gc_8_3_3_1", attrName="gc_8_3_3_1", label="其他术后并发症处理"),
		@Column(name="gc_9_1_1", attrName="gc_9_1_1", label="术前是否进行营养评估"),
		@Column(name="gc_9_1_2", attrName="gc_9_1_2", label="NRS-2002评估分值"),
		@Column(name="gc_9_1_3", attrName="gc_9_1_3", label="PG-SGA评估分级"),
		@Column(name="gc_9_1_4", attrName="gc_9_1_4", label="NUTRIC Score评估分值"),
		@Column(name="gc_9_2_1", attrName="gc_9_2_1", label="术前是否给予营养支持"),
		@Column(name="gc_9_2_2", attrName="gc_9_2_2", label="术前给予营养支持符合原则规范"),
		@Column(name="gc_9_2_3", attrName="gc_9_2_3", label="其他术前给予营养支持符合原则规范"),
		@Column(name="gc_9_3_1", attrName="gc_9_3_1", label="是否给予补充性肠外营养", comment="是否给予补充性肠外营养（SPN）"),
		@Column(name="gc_9_3_2", attrName="gc_9_3_2", label="补充性肠外营养", comment="补充性肠外营养（SPN）给予条件"),
		@Column(name="gc_9_3_3", attrName="gc_9_3_3", label="其他补充性肠外营养", comment="其他补充性肠外营养（SPN）给予条件"),
		@Column(name="gc_10_1_1", attrName="gc_10_1_1", label="是否进行术后辅助放疗"),
		@Column(name="gc_10_1_2", attrName="gc_10_1_2", label="术后辅助放疗指征的选择"),
		@Column(name="gc_10_2_1", attrName="gc_10_2_1", label="精确放疗技术的选择"),
		@Column(name="gc_11_1_7", attrName="gc_11_1_7", label="是否有关于放疗总剂量的记录"),
		@Column(name="gc_11_1_2", attrName="gc_11_1_2", label="是否有关于剂量分割方式的记录"),
		@Column(name="gc_11_1_3", attrName="gc_11_1_3", label="是否明确记录肿瘤区", comment="是否明确记录肿瘤区（GTV）"),
		@Column(name="gc_11_1_4", attrName="gc_11_1_4", label="是否有临床靶区", comment="是否有临床靶区（CTV）的记录"),
		@Column(name="gc_11_1_5", attrName="gc_11_1_5", label="是否有计划靶区", comment="是否有计划靶区（PTV）的记录"),
		@Column(name="gc_11_1_6", attrName="gc_11_1_6", label="常规二维放疗的放疗靶区范围是否明确记录了放疗野范围"),
		@Column(name="gc_12_1_1", attrName="gc_12_1_1", label="是否为临床或病理分期为M1的胃癌病例"),
		@Column(name="gc_12_1_2", attrName="gc_12_1_2", label="是否为胃癌初次化疗"),
		@Column(name="gc_12_1_3", attrName="gc_12_1_3", label="胃癌初次化疗采用方案"),
		@Column(name="gc_12_1_3_2", attrName="gc_12_1_3_2", label="顺铂＋氟尿嘧啶类"),
		@Column(name="gc_12_1_3_3", attrName="gc_12_1_3_3", label="奥沙利铂＋氟尿嘧啶类"),
		@Column(name="gc_12_1_3_4", attrName="gc_12_1_3_4", label="三药联合方案"),
		@Column(name="gc_12_1_3_5", attrName="gc_12_1_3_5", label="单药方案"),
		@Column(name="gc_12_1_3_1", attrName="gc_12_1_3_1", label="其他胃癌初次化疗采用方案"),
		@Column(name="gc_12_2_1", attrName="gc_12_2_1", label="手术后是否使用靶向治疗药物"),
		@Column(name="gc_12_2_2", attrName="gc_12_2_2", label="胃癌常用靶向治疗药物"),
		@Column(name="gc_12_2_2_1", attrName="gc_12_2_2_1", label="其他靶向治疗药物"),
		@Column(name="gc_13_1_1", attrName="gc_13_1_1", label="抗肿瘤药物疗效的选择"),
		@Column(name="gc_13_1_1_1", attrName="gc_13_1_1_1", label="其它抗肿瘤药物疗效"),
		@Column(name="gc_13_2_1", attrName="gc_13_2_1", label="目标病灶的评价"),
		@Column(name="gc_13_2_2", attrName="gc_13_2_2", label="非目标病灶的评价"),
		@Column(name="gc_13_2_3", attrName="gc_13_2_3", label="新病灶"),
		@Column(name="gc_13_2_4", attrName="gc_13_2_4", label="总疗效"),
		@Column(name="gc_13_3_1", attrName="gc_13_3_1", label="免疫治疗", comment="免疫治疗(iRECIST)--靶病灶"),
		@Column(name="gc_13_3_2", attrName="gc_13_3_2", label="免疫治疗", comment="免疫治疗(iRECIST)--非靶病灶"),
		@Column(name="gc_14_1_1", attrName="gc_14_1_1", label="是否使用了抗癌药的药物"),
		@Column(name="gc_14_1_2", attrName="gc_14_1_2", label="有无抗癌药的药物不良反应"),
		@Column(name="gc_14_1_3", attrName="gc_14_1_3", label="抗癌药的药物不良反应"),
		@Column(name="gc_14_1_3_1", attrName="gc_14_1_3_1", label="其它抗癌药的药物不良反应"),
		@Column(name="gc_14_2_1", attrName="gc_14_2_1", label="不良反应定级"),
		@Column(name="gc_15_1_1", attrName="gc_15_1_1", label="胃癌患者履行出院知情告知"),
		@Column(name="gc_15_1_2_1", attrName="gc_15_1_2_1", label="交与患者“出院小结”的副本告知患者出院时风险因素"),
		@Column(name="gc_15_1_2_2", attrName="gc_15_1_2_2", label="告知出院时的病情风险情况"),
		@Column(name="gc_15_1_2_3", attrName="gc_15_1_2_3", label="出院后合理的进餐制度和正确的进餐方式预防合并症"),
		@Column(name="gc_15_1_2_4", attrName="gc_15_1_2_4", label="告知胃癌术后常见并发症的应对措施"),
		@Column(name="gc_15_1_2_5", attrName="gc_15_1_2_5", label="出院时教育与随访"),
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
		@Column(name="cm_0_1_4_1_1", attrName="cm01411", label="其他ICD-9-CM-3四位亚目编码与名称"),
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
		@Column(name="cm_0_1_4_2_1", attrName="cm01421", label="其他ICD-9-CM-3六位临床扩展编码与名称"),
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
		@Column(name="cm_0_2_3_1", attrName="cm0231", label="到达本院急诊或者门诊日期时间是否无法确定或无记录"),
		@Column(name="cm_0_2_3_2", attrName="cm0232", label="到达本院急诊或者门诊日期时间"),
		@Column(name="cm_0_2_5_1", attrName="cm0251", label="入住CCU日期时间"),
		@Column(name="cm_0_2_5_2", attrName="cm0252", label="离开CCU日期时间"),
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(includeEntity=DataEntity.class),
	}, orderBy="a.update_date DESC"
)
public class QualityGc extends DataEntity<QualityGc> {
	
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
	private Date cm_0_2_4_1;		// 入院日期时间
	private Date cm_0_2_4_2;		// 出院日期时间
	private Date cm_0_2_6_1;		// 手术开始（切皮）日期时间
	private Date cm_0_2_6_2;		// 手术结束（缝皮结束）日期时间
	private String cm_0_3_1;		// 费用支付方式
	private String cm_0_3_2;		// 收入住院途径
	private String cm_0_3_3;		// 到院交通工具
	private String gc_1_1_1;		// 临床TNM分期前主要检查项目
	private String gc_1_2_1;		// 治疗前是否完成临床 TNM分期
	private String gc_1_2_2;		// 原发肿瘤（T）分期
	private String gc_1_2_3;		// 区域淋巴结（N）分期
	private String gc_1_2_4;		// 远处转移（M）分期
	private String gc_1_2_5;		// 胃癌治疗前 cTNM 分期结论
	private String gc_1_3_1_1;		// 治疗前是否完成胃癌CT分期
	private String gc_1_3_1;		// cT分期病理学定义
	private String gc_1_4_1_1;		// 治疗前是否完成胃癌超声内镜（EUS）分期
	private String gc_1_4_1;		// uT分期病理学定义
	private String gc_1_5_1;		// 是否是治疗前接受过2个或以上治疗科室会诊的患者
	private String gc_2_2_1;		// 治疗前是否有病理组织形态学/细胞学诊断报告
	private String gc_2_2_2;		// 采集组织或细胞学标本来源途径
	private String gc_2_2_2_1;		// 其他细胞学标本来源途径
	private String gc_2_2_3;		// 是否有pTNM 临床分期结论
	private String gc_2_2_4;		// pTNM 临床分期结论
	private String gc_2_2_4_2;		// 病理组织形态学/细胞学诊断报告单pTNM 临床分期结论距本次治疗前的时限
	private String gc_3_1_1_1;		// 手术路径的选择
	private String gc_3_1_1_2;		// 术中探及胃癌病变涉及的范围
	private String gc_3_1_2;		// 手术治疗符合原则规范
	private String gc_3_2_1;		// 实施的胃癌根治性术式的选择
	private String gc_3_2_2;		// 术后消化道重建的方式的选择
	private String gc_3_2_2_1;		// 其他术后消化道重建的方式
	private String gc_3_3_1;		// 胃癌手术中达到安全切缘是否有证实措施
	private String gc_3_3_2;		// 记入手术记录中安全切缘证实措施的选择
	private String gc_3_4_1;		// 是否使用各种吻合器
	private String gc_4_2_1;		// 是否进行手术淋巴结清扫
	private String gc_4_2_2;		// 淋巴结清扫组别
	private String gc_4_2_3;		// 淋巴结清除结果
	private String gc_5_1_1;		// 是否有病理学诊断
	private String gc_5_1_2;		// 采集组织或细胞学标本途经的选择
	private String gc_5_1_3;		// 合格的病理报告包括以下主要内容
	private String gc_5_1_3_1;		// 其他合格的病理报告
	private String gc_5_2_1;		// 是否有胃癌病理pTNM分期
	private String gc_5_2_2;		// pTNM 分期结论
	private String gc_5_3_1;		// 是否有组织学分级（G）
	private String gc_5_3_2;		// 组织学分级（G）
	private String gc_6_1_1;		// 是否有术前评估
	private String gc_6_1_2;		// 术前评估内容
	private String gc_6_1_3;		// 治疗的适应证
	private String gc_6_2_1;		// 是否有内镜治疗禁忌证
	private String gc_6_2_2;		// 治疗禁忌证
	private String gc_6_2_2_1;		// 其他治疗禁忌证
	private String gc_6_3_1;		// 术式选择
	private String gc_6_3_1_1;		// 其他术式选择
	private String gc_8_2_1;		// 是否是非计划二次手术
	private String gc_8_2_2;		// 非计划二次手术主要原因的选择
	private String gc_8_2_2_1;		// 其他非计划二次手术主要原因
	private String gc_8_2_3;		// 二次手术开始（切皮）日期时间
	private String gc_8_2_4;		// 二次手术结束（缝皮结束）日期时间
	private String gc_8_3_1;		// 内镜治疗术后并发症
	private String gc_8_3_2;		// 并发症
	private String gc_8_3_2_1;		// 其他并发症
	private String gc_8_3_3;		// 术后并发症处理
	private String gc_8_3_3_1;		// 其他术后并发症处理
	private String gc_9_1_1;		// 术前是否进行营养评估
	private Double gc_9_1_2;		// NRS-2002评估分值
	private String gc_9_1_3;		// PG-SGA评估分级
	private Double gc_9_1_4;		// NUTRIC Score评估分值
	private String gc_9_2_1;		// 术前是否给予营养支持
	private String gc_9_2_2;		// 术前给予营养支持符合原则规范
	private String gc_9_2_3;		// 其他术前给予营养支持符合原则规范
	private String gc_9_3_1;		// 是否给予补充性肠外营养（SPN）
	private String gc_9_3_2;		// 补充性肠外营养（SPN）给予条件
	private String gc_9_3_3;		// 其他补充性肠外营养（SPN）给予条件
	private String gc_10_1_1;		// 是否进行术后辅助放疗
	private String gc_10_1_2;		// 术后辅助放疗指征的选择
	private String gc_10_2_1;		// 精确放疗技术的选择
	private String gc_11_1_7;		// 是否有关于放疗总剂量的记录
	private String gc_11_1_2;		// 是否有关于剂量分割方式的记录
	private String gc_11_1_3;		// 是否明确记录肿瘤区（GTV）
	private String gc_11_1_4;		// 是否有临床靶区（CTV）的记录
	private String gc_11_1_5;		// 是否有计划靶区（PTV）的记录
	private String gc_11_1_6;		// 常规二维放疗的放疗靶区范围是否明确记录了放疗野范围
	private String gc_12_1_1;		// 是否为临床或病理分期为M1的胃癌病例
	private String gc_12_1_2;		// 是否为胃癌初次化疗
	private String gc_12_1_3;		// 胃癌初次化疗采用方案
	private String gc_12_1_3_2;		// 顺铂＋氟尿嘧啶类
	private String gc_12_1_3_3;		// 奥沙利铂＋氟尿嘧啶类
	private String gc_12_1_3_4;		// 三药联合方案
	private String gc_12_1_3_5;		// 单药方案
	private String gc_12_1_3_1;		// 其他胃癌初次化疗采用方案
	private String gc_12_2_1;		// 手术后是否使用靶向治疗药物
	private String gc_12_2_2;		// 胃癌常用靶向治疗药物
	private String gc_12_2_2_1;		// 其他靶向治疗药物
	private String gc_13_1_1;		// 抗肿瘤药物疗效的选择
	private String gc_13_1_1_1;		// 其它抗肿瘤药物疗效
	private String gc_13_2_1;		// 目标病灶的评价
	private String gc_13_2_2;		// 非目标病灶的评价
	private String gc_13_2_3;		// 新病灶
	private String gc_13_2_4;		// 总疗效
	private String gc_13_3_1;		// 免疫治疗(iRECIST)--靶病灶
	private String gc_13_3_2;		// 免疫治疗(iRECIST)--非靶病灶
	private String gc_14_1_1;		// 是否使用了抗癌药的药物
	private String gc_14_1_2;		// 有无抗癌药的药物不良反应
	private String gc_14_1_3;		// 抗癌药的药物不良反应
	private String gc_14_1_3_1;		// 其它抗癌药的药物不良反应
	private String gc_14_2_1;		// 不良反应定级
	private String gc_15_1_1;		// 胃癌患者履行出院知情告知
	private String gc_15_1_2_1;		// 交与患者“出院小结”的副本告知患者出院时风险因素
	private String gc_15_1_2_2;		// 告知出院时的病情风险情况
	private String gc_15_1_2_3;		// 出院后合理的进餐制度和正确的进餐方式预防合并症
	private String gc_15_1_2_4;		// 告知胃癌术后常见并发症的应对措施
	private String gc_15_1_2_5;		// 出院时教育与随访
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
	private String cm01411;		// 其他ICD-9-CM-3四位亚目编码与名称
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
	private String cm01421;		// 其他ICD-9-CM-3六位临床扩展编码与名称
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
	private String cm0231;		// 到达本院急诊或者门诊日期时间是否无法确定或无记录
	private Date cm0232;		// 到达本院急诊或者门诊日期时间
	private Date cm0251;		// 入住CCU日期时间
	private Date cm0252;		// 离开CCU日期时间
	
	public QualityGc() {
		this(null);
	}

	public QualityGc(String id){
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
	
	@Length(min=0, max=64, message="临床TNM分期前主要检查项目长度不能超过 64 个字符")
	public String getGc_1_1_1() {
		return gc_1_1_1;
	}

	public void setGc_1_1_1(String gc_1_1_1) {
		this.gc_1_1_1 = gc_1_1_1;
	}
	
	@Length(min=0, max=64, message="治疗前是否完成临床 TNM分期长度不能超过 64 个字符")
	public String getGc_1_2_1() {
		return gc_1_2_1;
	}

	public void setGc_1_2_1(String gc_1_2_1) {
		this.gc_1_2_1 = gc_1_2_1;
	}
	
	@Length(min=0, max=64, message="原发肿瘤长度不能超过 64 个字符")
	public String getGc_1_2_2() {
		return gc_1_2_2;
	}

	public void setGc_1_2_2(String gc_1_2_2) {
		this.gc_1_2_2 = gc_1_2_2;
	}
	
	@Length(min=0, max=64, message="区域淋巴结长度不能超过 64 个字符")
	public String getGc_1_2_3() {
		return gc_1_2_3;
	}

	public void setGc_1_2_3(String gc_1_2_3) {
		this.gc_1_2_3 = gc_1_2_3;
	}
	
	@Length(min=0, max=64, message="远处转移长度不能超过 64 个字符")
	public String getGc_1_2_4() {
		return gc_1_2_4;
	}

	public void setGc_1_2_4(String gc_1_2_4) {
		this.gc_1_2_4 = gc_1_2_4;
	}
	
	@Length(min=0, max=64, message="胃癌治疗前 cTNM 分期结论长度不能超过 64 个字符")
	public String getGc_1_2_5() {
		return gc_1_2_5;
	}

	public void setGc_1_2_5(String gc_1_2_5) {
		this.gc_1_2_5 = gc_1_2_5;
	}
	
	@Length(min=0, max=64, message="治疗前是否完成胃癌CT分期长度不能超过 64 个字符")
	public String getGc_1_3_1_1() {
		return gc_1_3_1_1;
	}

	public void setGc_1_3_1_1(String gc_1_3_1_1) {
		this.gc_1_3_1_1 = gc_1_3_1_1;
	}
	
	@Length(min=0, max=64, message="cT分期病理学定义长度不能超过 64 个字符")
	public String getGc_1_3_1() {
		return gc_1_3_1;
	}

	public void setGc_1_3_1(String gc_1_3_1) {
		this.gc_1_3_1 = gc_1_3_1;
	}
	
	@Length(min=0, max=64, message="治疗前是否完成胃癌超声内镜长度不能超过 64 个字符")
	public String getGc_1_4_1_1() {
		return gc_1_4_1_1;
	}

	public void setGc_1_4_1_1(String gc_1_4_1_1) {
		this.gc_1_4_1_1 = gc_1_4_1_1;
	}
	
	@Length(min=0, max=64, message="uT分期病理学定义长度不能超过 64 个字符")
	public String getGc_1_4_1() {
		return gc_1_4_1;
	}

	public void setGc_1_4_1(String gc_1_4_1) {
		this.gc_1_4_1 = gc_1_4_1;
	}
	
	@Length(min=0, max=64, message="是否是治疗前接受过2个或以上治疗科室会诊的患者长度不能超过 64 个字符")
	public String getGc_1_5_1() {
		return gc_1_5_1;
	}

	public void setGc_1_5_1(String gc_1_5_1) {
		this.gc_1_5_1 = gc_1_5_1;
	}
	
	@Length(min=0, max=64, message="治疗前是否有病理组织形态学/细胞学诊断报告长度不能超过 64 个字符")
	public String getGc_2_2_1() {
		return gc_2_2_1;
	}

	public void setGc_2_2_1(String gc_2_2_1) {
		this.gc_2_2_1 = gc_2_2_1;
	}
	
	@Length(min=0, max=64, message="采集组织或细胞学标本来源途径长度不能超过 64 个字符")
	public String getGc_2_2_2() {
		return gc_2_2_2;
	}

	public void setGc_2_2_2(String gc_2_2_2) {
		this.gc_2_2_2 = gc_2_2_2;
	}
	
	@Length(min=0, max=64, message="其他细胞学标本来源途径长度不能超过 64 个字符")
	public String getGc_2_2_2_1() {
		return gc_2_2_2_1;
	}

	public void setGc_2_2_2_1(String gc_2_2_2_1) {
		this.gc_2_2_2_1 = gc_2_2_2_1;
	}
	
	@Length(min=0, max=64, message="是否有pTNM 临床分期结论长度不能超过 64 个字符")
	public String getGc_2_2_3() {
		return gc_2_2_3;
	}

	public void setGc_2_2_3(String gc_2_2_3) {
		this.gc_2_2_3 = gc_2_2_3;
	}
	
	@Length(min=0, max=64, message="pTNM 临床分期结论长度不能超过 64 个字符")
	public String getGc_2_2_4() {
		return gc_2_2_4;
	}

	public void setGc_2_2_4(String gc_2_2_4) {
		this.gc_2_2_4 = gc_2_2_4;
	}
	
	@Length(min=0, max=64, message="病理组织形态学/细胞学诊断报告单pTNM 临床分期结论距本次治疗前的时限长度不能超过 64 个字符")
	public String getGc_2_2_4_2() {
		return gc_2_2_4_2;
	}

	public void setGc_2_2_4_2(String gc_2_2_4_2) {
		this.gc_2_2_4_2 = gc_2_2_4_2;
	}
	
	@Length(min=0, max=64, message="手术路径的选择长度不能超过 64 个字符")
	public String getGc_3_1_1_1() {
		return gc_3_1_1_1;
	}

	public void setGc_3_1_1_1(String gc_3_1_1_1) {
		this.gc_3_1_1_1 = gc_3_1_1_1;
	}
	
	@Length(min=0, max=64, message="术中探及胃癌病变涉及的范围长度不能超过 64 个字符")
	public String getGc_3_1_1_2() {
		return gc_3_1_1_2;
	}

	public void setGc_3_1_1_2(String gc_3_1_1_2) {
		this.gc_3_1_1_2 = gc_3_1_1_2;
	}
	
	@Length(min=0, max=64, message="手术治疗符合原则规范长度不能超过 64 个字符")
	public String getGc_3_1_2() {
		return gc_3_1_2;
	}

	public void setGc_3_1_2(String gc_3_1_2) {
		this.gc_3_1_2 = gc_3_1_2;
	}
	
	@Length(min=0, max=64, message="实施的胃癌根治性术式的选择长度不能超过 64 个字符")
	public String getGc_3_2_1() {
		return gc_3_2_1;
	}

	public void setGc_3_2_1(String gc_3_2_1) {
		this.gc_3_2_1 = gc_3_2_1;
	}
	
	@Length(min=0, max=64, message="术后消化道重建的方式的选择长度不能超过 64 个字符")
	public String getGc_3_2_2() {
		return gc_3_2_2;
	}

	public void setGc_3_2_2(String gc_3_2_2) {
		this.gc_3_2_2 = gc_3_2_2;
	}
	
	@Length(min=0, max=64, message="其他术后消化道重建的方式长度不能超过 64 个字符")
	public String getGc_3_2_2_1() {
		return gc_3_2_2_1;
	}

	public void setGc_3_2_2_1(String gc_3_2_2_1) {
		this.gc_3_2_2_1 = gc_3_2_2_1;
	}
	
	@Length(min=0, max=64, message="胃癌手术中达到安全切缘是否有证实措施长度不能超过 64 个字符")
	public String getGc_3_3_1() {
		return gc_3_3_1;
	}

	public void setGc_3_3_1(String gc_3_3_1) {
		this.gc_3_3_1 = gc_3_3_1;
	}
	
	@Length(min=0, max=64, message="记入手术记录中安全切缘证实措施的选择长度不能超过 64 个字符")
	public String getGc_3_3_2() {
		return gc_3_3_2;
	}

	public void setGc_3_3_2(String gc_3_3_2) {
		this.gc_3_3_2 = gc_3_3_2;
	}
	
	@Length(min=0, max=64, message="是否使用各种吻合器长度不能超过 64 个字符")
	public String getGc_3_4_1() {
		return gc_3_4_1;
	}

	public void setGc_3_4_1(String gc_3_4_1) {
		this.gc_3_4_1 = gc_3_4_1;
	}
	
	@Length(min=0, max=64, message="是否进行手术淋巴结清扫长度不能超过 64 个字符")
	public String getGc_4_2_1() {
		return gc_4_2_1;
	}

	public void setGc_4_2_1(String gc_4_2_1) {
		this.gc_4_2_1 = gc_4_2_1;
	}
	
	@Length(min=0, max=64, message="淋巴结清扫组别长度不能超过 64 个字符")
	public String getGc_4_2_2() {
		return gc_4_2_2;
	}

	public void setGc_4_2_2(String gc_4_2_2) {
		this.gc_4_2_2 = gc_4_2_2;
	}
	
	@Length(min=0, max=64, message="淋巴结清除结果长度不能超过 64 个字符")
	public String getGc_4_2_3() {
		return gc_4_2_3;
	}

	public void setGc_4_2_3(String gc_4_2_3) {
		this.gc_4_2_3 = gc_4_2_3;
	}
	
	@Length(min=0, max=64, message="是否有病理学诊断长度不能超过 64 个字符")
	public String getGc_5_1_1() {
		return gc_5_1_1;
	}

	public void setGc_5_1_1(String gc_5_1_1) {
		this.gc_5_1_1 = gc_5_1_1;
	}
	
	@Length(min=0, max=64, message="采集组织或细胞学标本途经的选择长度不能超过 64 个字符")
	public String getGc_5_1_2() {
		return gc_5_1_2;
	}

	public void setGc_5_1_2(String gc_5_1_2) {
		this.gc_5_1_2 = gc_5_1_2;
	}
	
	@Length(min=0, max=64, message="合格的病理报告包括以下主要内容长度不能超过 64 个字符")
	public String getGc_5_1_3() {
		return gc_5_1_3;
	}

	public void setGc_5_1_3(String gc_5_1_3) {
		this.gc_5_1_3 = gc_5_1_3;
	}
	
	@Length(min=0, max=64, message="其他合格的病理报告长度不能超过 64 个字符")
	public String getGc_5_1_3_1() {
		return gc_5_1_3_1;
	}

	public void setGc_5_1_3_1(String gc_5_1_3_1) {
		this.gc_5_1_3_1 = gc_5_1_3_1;
	}
	
	@Length(min=0, max=64, message="是否有胃癌病理pTNM分期长度不能超过 64 个字符")
	public String getGc_5_2_1() {
		return gc_5_2_1;
	}

	public void setGc_5_2_1(String gc_5_2_1) {
		this.gc_5_2_1 = gc_5_2_1;
	}
	
	@Length(min=0, max=64, message="pTNM 分期结论长度不能超过 64 个字符")
	public String getGc_5_2_2() {
		return gc_5_2_2;
	}

	public void setGc_5_2_2(String gc_5_2_2) {
		this.gc_5_2_2 = gc_5_2_2;
	}
	
	@Length(min=0, max=64, message="是否有组织学分级长度不能超过 64 个字符")
	public String getGc_5_3_1() {
		return gc_5_3_1;
	}

	public void setGc_5_3_1(String gc_5_3_1) {
		this.gc_5_3_1 = gc_5_3_1;
	}
	
	@Length(min=0, max=64, message="组织学分级长度不能超过 64 个字符")
	public String getGc_5_3_2() {
		return gc_5_3_2;
	}

	public void setGc_5_3_2(String gc_5_3_2) {
		this.gc_5_3_2 = gc_5_3_2;
	}
	
	@Length(min=0, max=64, message="是否有术前评估长度不能超过 64 个字符")
	public String getGc_6_1_1() {
		return gc_6_1_1;
	}

	public void setGc_6_1_1(String gc_6_1_1) {
		this.gc_6_1_1 = gc_6_1_1;
	}
	
	@Length(min=0, max=64, message="术前评估内容长度不能超过 64 个字符")
	public String getGc_6_1_2() {
		return gc_6_1_2;
	}

	public void setGc_6_1_2(String gc_6_1_2) {
		this.gc_6_1_2 = gc_6_1_2;
	}
	
	@Length(min=0, max=64, message="治疗的适应证长度不能超过 64 个字符")
	public String getGc_6_1_3() {
		return gc_6_1_3;
	}

	public void setGc_6_1_3(String gc_6_1_3) {
		this.gc_6_1_3 = gc_6_1_3;
	}
	
	@Length(min=0, max=64, message="是否有内镜治疗禁忌证长度不能超过 64 个字符")
	public String getGc_6_2_1() {
		return gc_6_2_1;
	}

	public void setGc_6_2_1(String gc_6_2_1) {
		this.gc_6_2_1 = gc_6_2_1;
	}
	
	@Length(min=0, max=64, message="治疗禁忌证长度不能超过 64 个字符")
	public String getGc_6_2_2() {
		return gc_6_2_2;
	}

	public void setGc_6_2_2(String gc_6_2_2) {
		this.gc_6_2_2 = gc_6_2_2;
	}
	
	@Length(min=0, max=64, message="其他治疗禁忌证长度不能超过 64 个字符")
	public String getGc_6_2_2_1() {
		return gc_6_2_2_1;
	}

	public void setGc_6_2_2_1(String gc_6_2_2_1) {
		this.gc_6_2_2_1 = gc_6_2_2_1;
	}
	
	@Length(min=0, max=64, message="术式选择长度不能超过 64 个字符")
	public String getGc_6_3_1() {
		return gc_6_3_1;
	}

	public void setGc_6_3_1(String gc_6_3_1) {
		this.gc_6_3_1 = gc_6_3_1;
	}
	
	@Length(min=0, max=64, message="其他术式选择长度不能超过 64 个字符")
	public String getGc_6_3_1_1() {
		return gc_6_3_1_1;
	}

	public void setGc_6_3_1_1(String gc_6_3_1_1) {
		this.gc_6_3_1_1 = gc_6_3_1_1;
	}
	
	@Length(min=0, max=64, message="是否是非计划二次手术长度不能超过 64 个字符")
	public String getGc_8_2_1() {
		return gc_8_2_1;
	}

	public void setGc_8_2_1(String gc_8_2_1) {
		this.gc_8_2_1 = gc_8_2_1;
	}
	
	@Length(min=0, max=64, message="非计划二次手术主要原因的选择长度不能超过 64 个字符")
	public String getGc_8_2_2() {
		return gc_8_2_2;
	}

	public void setGc_8_2_2(String gc_8_2_2) {
		this.gc_8_2_2 = gc_8_2_2;
	}
	
	@Length(min=0, max=64, message="其他非计划二次手术主要原因长度不能超过 64 个字符")
	public String getGc_8_2_2_1() {
		return gc_8_2_2_1;
	}

	public void setGc_8_2_2_1(String gc_8_2_2_1) {
		this.gc_8_2_2_1 = gc_8_2_2_1;
	}
	
	@Length(min=0, max=64, message="二次手术开始长度不能超过 64 个字符")
	public String getGc_8_2_3() {
		return gc_8_2_3;
	}

	public void setGc_8_2_3(String gc_8_2_3) {
		this.gc_8_2_3 = gc_8_2_3;
	}
	
	@Length(min=0, max=64, message="二次手术结束长度不能超过 64 个字符")
	public String getGc_8_2_4() {
		return gc_8_2_4;
	}

	public void setGc_8_2_4(String gc_8_2_4) {
		this.gc_8_2_4 = gc_8_2_4;
	}
	
	@Length(min=0, max=64, message="内镜治疗术后并发症长度不能超过 64 个字符")
	public String getGc_8_3_1() {
		return gc_8_3_1;
	}

	public void setGc_8_3_1(String gc_8_3_1) {
		this.gc_8_3_1 = gc_8_3_1;
	}
	
	@Length(min=0, max=64, message="并发症长度不能超过 64 个字符")
	public String getGc_8_3_2() {
		return gc_8_3_2;
	}

	public void setGc_8_3_2(String gc_8_3_2) {
		this.gc_8_3_2 = gc_8_3_2;
	}
	
	@Length(min=0, max=64, message="其他并发症长度不能超过 64 个字符")
	public String getGc_8_3_2_1() {
		return gc_8_3_2_1;
	}

	public void setGc_8_3_2_1(String gc_8_3_2_1) {
		this.gc_8_3_2_1 = gc_8_3_2_1;
	}
	
	@Length(min=0, max=64, message="术后并发症处理长度不能超过 64 个字符")
	public String getGc_8_3_3() {
		return gc_8_3_3;
	}

	public void setGc_8_3_3(String gc_8_3_3) {
		this.gc_8_3_3 = gc_8_3_3;
	}
	
	@Length(min=0, max=64, message="其他术后并发症处理长度不能超过 64 个字符")
	public String getGc_8_3_3_1() {
		return gc_8_3_3_1;
	}

	public void setGc_8_3_3_1(String gc_8_3_3_1) {
		this.gc_8_3_3_1 = gc_8_3_3_1;
	}
	
	@Length(min=0, max=64, message="术前是否进行营养评估长度不能超过 64 个字符")
	public String getGc_9_1_1() {
		return gc_9_1_1;
	}

	public void setGc_9_1_1(String gc_9_1_1) {
		this.gc_9_1_1 = gc_9_1_1;
	}
	
	public Double getGc_9_1_2() {
		return gc_9_1_2;
	}

	public void setGc_9_1_2(Double gc_9_1_2) {
		this.gc_9_1_2 = gc_9_1_2;
	}
	
	@Length(min=0, max=64, message="PG-SGA评估分级长度不能超过 64 个字符")
	public String getGc_9_1_3() {
		return gc_9_1_3;
	}

	public void setGc_9_1_3(String gc_9_1_3) {
		this.gc_9_1_3 = gc_9_1_3;
	}
	
	public Double getGc_9_1_4() {
		return gc_9_1_4;
	}

	public void setGc_9_1_4(Double gc_9_1_4) {
		this.gc_9_1_4 = gc_9_1_4;
	}
	
	@Length(min=0, max=64, message="术前是否给予营养支持长度不能超过 64 个字符")
	public String getGc_9_2_1() {
		return gc_9_2_1;
	}

	public void setGc_9_2_1(String gc_9_2_1) {
		this.gc_9_2_1 = gc_9_2_1;
	}
	
	@Length(min=0, max=64, message="术前给予营养支持符合原则规范长度不能超过 64 个字符")
	public String getGc_9_2_2() {
		return gc_9_2_2;
	}

	public void setGc_9_2_2(String gc_9_2_2) {
		this.gc_9_2_2 = gc_9_2_2;
	}
	
	@Length(min=0, max=64, message="其他术前给予营养支持符合原则规范长度不能超过 64 个字符")
	public String getGc_9_2_3() {
		return gc_9_2_3;
	}

	public void setGc_9_2_3(String gc_9_2_3) {
		this.gc_9_2_3 = gc_9_2_3;
	}
	
	@Length(min=0, max=64, message="是否给予补充性肠外营养长度不能超过 64 个字符")
	public String getGc_9_3_1() {
		return gc_9_3_1;
	}

	public void setGc_9_3_1(String gc_9_3_1) {
		this.gc_9_3_1 = gc_9_3_1;
	}
	
	@Length(min=0, max=64, message="补充性肠外营养长度不能超过 64 个字符")
	public String getGc_9_3_2() {
		return gc_9_3_2;
	}

	public void setGc_9_3_2(String gc_9_3_2) {
		this.gc_9_3_2 = gc_9_3_2;
	}
	
	@Length(min=0, max=64, message="其他补充性肠外营养长度不能超过 64 个字符")
	public String getGc_9_3_3() {
		return gc_9_3_3;
	}

	public void setGc_9_3_3(String gc_9_3_3) {
		this.gc_9_3_3 = gc_9_3_3;
	}
	
	@Length(min=0, max=64, message="是否进行术后辅助放疗长度不能超过 64 个字符")
	public String getGc_10_1_1() {
		return gc_10_1_1;
	}

	public void setGc_10_1_1(String gc_10_1_1) {
		this.gc_10_1_1 = gc_10_1_1;
	}
	
	@Length(min=0, max=64, message="术后辅助放疗指征的选择长度不能超过 64 个字符")
	public String getGc_10_1_2() {
		return gc_10_1_2;
	}

	public void setGc_10_1_2(String gc_10_1_2) {
		this.gc_10_1_2 = gc_10_1_2;
	}
	
	@Length(min=0, max=64, message="精确放疗技术的选择长度不能超过 64 个字符")
	public String getGc_10_2_1() {
		return gc_10_2_1;
	}

	public void setGc_10_2_1(String gc_10_2_1) {
		this.gc_10_2_1 = gc_10_2_1;
	}
	
	@Length(min=0, max=64, message="是否有关于放疗总剂量的记录长度不能超过 64 个字符")
	public String getGc_11_1_7() {
		return gc_11_1_7;
	}

	public void setGc_11_1_7(String gc_11_1_7) {
		this.gc_11_1_7 = gc_11_1_7;
	}
	
	@Length(min=0, max=64, message="是否有关于剂量分割方式的记录长度不能超过 64 个字符")
	public String getGc_11_1_2() {
		return gc_11_1_2;
	}

	public void setGc_11_1_2(String gc_11_1_2) {
		this.gc_11_1_2 = gc_11_1_2;
	}
	
	@Length(min=0, max=64, message="是否明确记录肿瘤区长度不能超过 64 个字符")
	public String getGc_11_1_3() {
		return gc_11_1_3;
	}

	public void setGc_11_1_3(String gc_11_1_3) {
		this.gc_11_1_3 = gc_11_1_3;
	}
	
	@Length(min=0, max=64, message="是否有临床靶区长度不能超过 64 个字符")
	public String getGc_11_1_4() {
		return gc_11_1_4;
	}

	public void setGc_11_1_4(String gc_11_1_4) {
		this.gc_11_1_4 = gc_11_1_4;
	}
	
	@Length(min=0, max=64, message="是否有计划靶区长度不能超过 64 个字符")
	public String getGc_11_1_5() {
		return gc_11_1_5;
	}

	public void setGc_11_1_5(String gc_11_1_5) {
		this.gc_11_1_5 = gc_11_1_5;
	}
	
	@Length(min=0, max=64, message="常规二维放疗的放疗靶区范围是否明确记录了放疗野范围长度不能超过 64 个字符")
	public String getGc_11_1_6() {
		return gc_11_1_6;
	}

	public void setGc_11_1_6(String gc_11_1_6) {
		this.gc_11_1_6 = gc_11_1_6;
	}
	
	@Length(min=0, max=64, message="是否为临床或病理分期为M1的胃癌病例长度不能超过 64 个字符")
	public String getGc_12_1_1() {
		return gc_12_1_1;
	}

	public void setGc_12_1_1(String gc_12_1_1) {
		this.gc_12_1_1 = gc_12_1_1;
	}
	
	@Length(min=0, max=64, message="是否为胃癌初次化疗长度不能超过 64 个字符")
	public String getGc_12_1_2() {
		return gc_12_1_2;
	}

	public void setGc_12_1_2(String gc_12_1_2) {
		this.gc_12_1_2 = gc_12_1_2;
	}
	
	@Length(min=0, max=64, message="胃癌初次化疗采用方案长度不能超过 64 个字符")
	public String getGc_12_1_3() {
		return gc_12_1_3;
	}

	public void setGc_12_1_3(String gc_12_1_3) {
		this.gc_12_1_3 = gc_12_1_3;
	}
	
	@Length(min=0, max=64, message="顺铂＋氟尿嘧啶类长度不能超过 64 个字符")
	public String getGc_12_1_3_2() {
		return gc_12_1_3_2;
	}

	public void setGc_12_1_3_2(String gc_12_1_3_2) {
		this.gc_12_1_3_2 = gc_12_1_3_2;
	}
	
	@Length(min=0, max=64, message="奥沙利铂＋氟尿嘧啶类长度不能超过 64 个字符")
	public String getGc_12_1_3_3() {
		return gc_12_1_3_3;
	}

	public void setGc_12_1_3_3(String gc_12_1_3_3) {
		this.gc_12_1_3_3 = gc_12_1_3_3;
	}
	
	@Length(min=0, max=64, message="三药联合方案长度不能超过 64 个字符")
	public String getGc_12_1_3_4() {
		return gc_12_1_3_4;
	}

	public void setGc_12_1_3_4(String gc_12_1_3_4) {
		this.gc_12_1_3_4 = gc_12_1_3_4;
	}
	
	@Length(min=0, max=64, message="单药方案长度不能超过 64 个字符")
	public String getGc_12_1_3_5() {
		return gc_12_1_3_5;
	}

	public void setGc_12_1_3_5(String gc_12_1_3_5) {
		this.gc_12_1_3_5 = gc_12_1_3_5;
	}
	
	@Length(min=0, max=64, message="其他胃癌初次化疗采用方案长度不能超过 64 个字符")
	public String getGc_12_1_3_1() {
		return gc_12_1_3_1;
	}

	public void setGc_12_1_3_1(String gc_12_1_3_1) {
		this.gc_12_1_3_1 = gc_12_1_3_1;
	}
	
	@Length(min=0, max=64, message="手术后是否使用靶向治疗药物长度不能超过 64 个字符")
	public String getGc_12_2_1() {
		return gc_12_2_1;
	}

	public void setGc_12_2_1(String gc_12_2_1) {
		this.gc_12_2_1 = gc_12_2_1;
	}
	
	@Length(min=0, max=64, message="胃癌常用靶向治疗药物长度不能超过 64 个字符")
	public String getGc_12_2_2() {
		return gc_12_2_2;
	}

	public void setGc_12_2_2(String gc_12_2_2) {
		this.gc_12_2_2 = gc_12_2_2;
	}
	
	@Length(min=0, max=64, message="其他靶向治疗药物长度不能超过 64 个字符")
	public String getGc_12_2_2_1() {
		return gc_12_2_2_1;
	}

	public void setGc_12_2_2_1(String gc_12_2_2_1) {
		this.gc_12_2_2_1 = gc_12_2_2_1;
	}
	
	@Length(min=0, max=64, message="抗肿瘤药物疗效的选择长度不能超过 64 个字符")
	public String getGc_13_1_1() {
		return gc_13_1_1;
	}

	public void setGc_13_1_1(String gc_13_1_1) {
		this.gc_13_1_1 = gc_13_1_1;
	}
	
	@Length(min=0, max=64, message="其它抗肿瘤药物疗效长度不能超过 64 个字符")
	public String getGc_13_1_1_1() {
		return gc_13_1_1_1;
	}

	public void setGc_13_1_1_1(String gc_13_1_1_1) {
		this.gc_13_1_1_1 = gc_13_1_1_1;
	}
	
	@Length(min=0, max=64, message="目标病灶的评价长度不能超过 64 个字符")
	public String getGc_13_2_1() {
		return gc_13_2_1;
	}

	public void setGc_13_2_1(String gc_13_2_1) {
		this.gc_13_2_1 = gc_13_2_1;
	}
	
	@Length(min=0, max=64, message="非目标病灶的评价长度不能超过 64 个字符")
	public String getGc_13_2_2() {
		return gc_13_2_2;
	}

	public void setGc_13_2_2(String gc_13_2_2) {
		this.gc_13_2_2 = gc_13_2_2;
	}
	
	@Length(min=0, max=64, message="新病灶长度不能超过 64 个字符")
	public String getGc_13_2_3() {
		return gc_13_2_3;
	}

	public void setGc_13_2_3(String gc_13_2_3) {
		this.gc_13_2_3 = gc_13_2_3;
	}
	
	@Length(min=0, max=64, message="总疗效长度不能超过 64 个字符")
	public String getGc_13_2_4() {
		return gc_13_2_4;
	}

	public void setGc_13_2_4(String gc_13_2_4) {
		this.gc_13_2_4 = gc_13_2_4;
	}
	
	@Length(min=0, max=64, message="免疫治疗长度不能超过 64 个字符")
	public String getGc_13_3_1() {
		return gc_13_3_1;
	}

	public void setGc_13_3_1(String gc_13_3_1) {
		this.gc_13_3_1 = gc_13_3_1;
	}
	
	@Length(min=0, max=64, message="免疫治疗长度不能超过 64 个字符")
	public String getGc_13_3_2() {
		return gc_13_3_2;
	}

	public void setGc_13_3_2(String gc_13_3_2) {
		this.gc_13_3_2 = gc_13_3_2;
	}
	
	@Length(min=0, max=64, message="是否使用了抗癌药的药物长度不能超过 64 个字符")
	public String getGc_14_1_1() {
		return gc_14_1_1;
	}

	public void setGc_14_1_1(String gc_14_1_1) {
		this.gc_14_1_1 = gc_14_1_1;
	}
	
	@Length(min=0, max=64, message="有无抗癌药的药物不良反应长度不能超过 64 个字符")
	public String getGc_14_1_2() {
		return gc_14_1_2;
	}

	public void setGc_14_1_2(String gc_14_1_2) {
		this.gc_14_1_2 = gc_14_1_2;
	}
	
	@Length(min=0, max=64, message="抗癌药的药物不良反应长度不能超过 64 个字符")
	public String getGc_14_1_3() {
		return gc_14_1_3;
	}

	public void setGc_14_1_3(String gc_14_1_3) {
		this.gc_14_1_3 = gc_14_1_3;
	}
	
	@Length(min=0, max=64, message="其它抗癌药的药物不良反应长度不能超过 64 个字符")
	public String getGc_14_1_3_1() {
		return gc_14_1_3_1;
	}

	public void setGc_14_1_3_1(String gc_14_1_3_1) {
		this.gc_14_1_3_1 = gc_14_1_3_1;
	}
	
	@Length(min=0, max=64, message="不良反应定级长度不能超过 64 个字符")
	public String getGc_14_2_1() {
		return gc_14_2_1;
	}

	public void setGc_14_2_1(String gc_14_2_1) {
		this.gc_14_2_1 = gc_14_2_1;
	}
	
	@Length(min=0, max=64, message="胃癌患者履行出院知情告知长度不能超过 64 个字符")
	public String getGc_15_1_1() {
		return gc_15_1_1;
	}

	public void setGc_15_1_1(String gc_15_1_1) {
		this.gc_15_1_1 = gc_15_1_1;
	}
	
	@Length(min=0, max=64, message="交与患者“出院小结”的副本告知患者出院时风险因素长度不能超过 64 个字符")
	public String getGc_15_1_2_1() {
		return gc_15_1_2_1;
	}

	public void setGc_15_1_2_1(String gc_15_1_2_1) {
		this.gc_15_1_2_1 = gc_15_1_2_1;
	}
	
	@Length(min=0, max=64, message="告知出院时的病情风险情况长度不能超过 64 个字符")
	public String getGc_15_1_2_2() {
		return gc_15_1_2_2;
	}

	public void setGc_15_1_2_2(String gc_15_1_2_2) {
		this.gc_15_1_2_2 = gc_15_1_2_2;
	}
	
	@Length(min=0, max=64, message="出院后合理的进餐制度和正确的进餐方式预防合并症长度不能超过 64 个字符")
	public String getGc_15_1_2_3() {
		return gc_15_1_2_3;
	}

	public void setGc_15_1_2_3(String gc_15_1_2_3) {
		this.gc_15_1_2_3 = gc_15_1_2_3;
	}
	
	@Length(min=0, max=64, message="告知胃癌术后常见并发症的应对措施长度不能超过 64 个字符")
	public String getGc_15_1_2_4() {
		return gc_15_1_2_4;
	}

	public void setGc_15_1_2_4(String gc_15_1_2_4) {
		this.gc_15_1_2_4 = gc_15_1_2_4;
	}
	
	@Length(min=0, max=64, message="出院时教育与随访长度不能超过 64 个字符")
	public String getGc_15_1_2_5() {
		return gc_15_1_2_5;
	}

	public void setGc_15_1_2_5(String gc_15_1_2_5) {
		this.gc_15_1_2_5 = gc_15_1_2_5;
	}
	
	@Length(min=0, max=32, message="手术野皮肤准备常用方法的选择长度不能超过 32 个字符")
	public String getCm_3_1() {
		return cm_3_1;
	}

	public void setCm_3_1(String cm_3_1) {
		this.cm_3_1 = cm_3_1;
	}
	
	@Length(min=0, max=32, message="使用含抗菌剂长度不能超过 32 个字符")
	public String getCm_3_2() {
		return cm_3_2;
	}

	public void setCm_3_2(String cm_3_2) {
		this.cm_3_2 = cm_3_2;
	}
	
	@Length(min=0, max=32, message="其他含抗菌剂缝线填写长度不能超过 32 个字符")
	public String getCm_3_2_1() {
		return cm_3_2_1;
	}

	public void setCm_3_2_1(String cm_3_2_1) {
		this.cm_3_2_1 = cm_3_2_1;
	}
	
	@Length(min=0, max=32, message="手术切口类别的选择长度不能超过 32 个字符")
	public String getCm_3_3() {
		return cm_3_3;
	}

	public void setCm_3_3(String cm_3_3) {
		this.cm_3_3 = cm_3_3;
	}
	
	@Length(min=0, max=32, message="手术切口愈合情况的选择长度不能超过 32 个字符")
	public String getCm_3_4() {
		return cm_3_4;
	}

	public void setCm_3_4(String cm_3_4) {
		this.cm_3_4 = cm_3_4;
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
	
	@Length(min=0, max=32, message="其他ICD-9-CM-3四位亚目编码与名称长度不能超过 32 个字符")
	public String getCm01411() {
		return cm01411;
	}

	public void setCm01411(String cm01411) {
		this.cm01411 = cm01411;
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
	
	@Length(min=0, max=32, message="其他ICD-9-CM-3六位临床扩展编码与名称长度不能超过 32 个字符")
	public String getCm01421() {
		return cm01421;
	}

	public void setCm01421(String cm01421) {
		this.cm01421 = cm01421;
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
	
	@Length(min=0, max=32, message="到达本院急诊或者门诊日期时间是否无法确定或无记录长度不能超过 32 个字符")
	public String getCm0231() {
		return cm0231;
	}

	public void setCm0231(String cm0231) {
		this.cm0231 = cm0231;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCm0232() {
		return cm0232;
	}

	public void setCm0232(Date cm0232) {
		this.cm0232 = cm0232;
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
	
}