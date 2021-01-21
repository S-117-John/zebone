/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.pa.entity;

import org.hibernate.validator.constraints.Length;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * PA垂体腺瘤（初发，手术治疗）Entity
 * @author 卡卡西
 * @version 2021-01-21
 */
@Table(name="quality_pa", alias="a", columns={
		@Column(name="cm_0_1_1_1", attrName="cm_0_1_1_1", label="质控医师"),
		@Column(name="cm_0_1_1_2", attrName="cm_0_1_1_2", label="质控护士"),
		@Column(name="cm_0_1_1_3", attrName="cm_0_1_1_3", label="主治医师"),
		@Column(name="cm_0_1_1_4", attrName="cm_0_1_1_4", label="责任护士"),
		@Column(name="cm_0_1_1_5", attrName="cm_0_1_1_5", label="上报科室"),
		@Column(name="caseid", attrName="caseid", label="患者病案号"),
		@Column(name="cm_0_1_3_1", attrName="cm_0_1_3_1", label="主要诊断ICD-10四位亚目编码与名称"),
		@Column(name="pa_0_1_7_1", attrName="pa_0_1_7_1", label="其他主要诊断ICD-10四位亚目编码与名称"),
		@Column(name="cm_0_1_3_2", attrName="cm_0_1_3_2", label="主要诊断ICD-10六位临床扩展编码与名称"),
		@Column(name="pa_0_1_8_1", attrName="pa_0_1_8_1", label="其他主要诊断ICD-10六位临床扩展编码与名称"),
		@Column(name="cm_0_1_4_1", attrName="cm_0_1_4_1", label="主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称"),
		@Column(name="pa_0_1_9_1", attrName="pa_0_1_9_1", label="其他主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称"),
		@Column(name="cm_0_1_4_2", attrName="cm_0_1_4_2", label="主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称"),
		@Column(name="pa_0_1_10_1", attrName="pa_0_1_10_1", label="其他主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称"),
		@Column(name="cm_0_1_5", attrName="cm_0_1_5", label="PA出院后是否31天内重复住院"),
		@Column(name="cm_0_2_1_1", attrName="cm_0_2_1_1", label="出生日期"),
		@Column(name="cm_0_2_1_2", attrName="cm_0_2_1_2", label="患者性别"),
		@Column(name="cm_0_2_1_3", attrName="cm_0_2_1_3", label="患者体重", comment="患者体重（kg）"),
		@Column(name="cm_0_2_1_5", attrName="cm_0_2_1_5", label="患者身高", comment="患者身高（cm）"),
		@Column(name="cm_0_2_2_1", attrName="cm_0_2_2_1", label="发病日期时间是否无法确定或无记录"),
		@Column(name="cm_0_2_2_2", attrName="cm_0_2_2_2", label="发病日期时间"),
		@Column(name="cm_0_2_4_1", attrName="cm_0_2_4_1", label="入院日期时间"),
		@Column(name="cm_0_2_4_2", attrName="cm_0_2_4_2", label="出院日期时间"),
		@Column(name="cm_0_2_5_1", attrName="cm_0_2_5_1", label="入住ICU日期时间"),
		@Column(name="cm_0_2_5_2", attrName="cm_0_2_5_2", label="离开ICU日期时间"),
		@Column(name="cm_0_2_6_1", attrName="cm_0_2_6_1", label="手术开始", comment="手术开始（切皮）日期时间"),
		@Column(name="cm_0_2_6_2", attrName="cm_0_2_6_2", label="手术结束", comment="手术结束（缝皮结束）日期时间"),
		@Column(name="cm_0_3_1", attrName="cm_0_3_1", label="费用支付方式"),
		@Column(name="cm_0_3_2", attrName="cm_0_3_2", label="收入住院途径"),
		@Column(name="cm_0_3_3", attrName="cm_0_3_3", label="到院交通工具"),
		@Column(name="pa_1_1_1", attrName="pa_1_1_1", label="主要临床表现"),
		@Column(name="pa_1_2_1", attrName="pa_1_2_1", label="首次磁共振扫描"),
		@Column(name="pa_1_2_2_1", attrName="pa_1_2_2_1", label="获得首次磁共振检查报告的日期时间是否确定"),
		@Column(name="pa_1_2_2", attrName="pa_1_2_2", label="获得首次磁共振检查报告的日期时间"),
		@Column(name="pa_1_2_3", attrName="pa_1_2_3", label="首次磁共振扫描模式"),
		@Column(name="pa_1_2_4", attrName="pa_1_2_4", label="肿瘤大小"),
		@Column(name="pa_2_1_1", attrName="pa_2_1_1", label="是否进行术前双侧视力与视野评估"),
		@Column(name="pa_2_1_2", attrName="pa_2_1_2", label="左眼视力数值"),
		@Column(name="pa_2_1_3", attrName="pa_2_1_3", label="右眼视力数值"),
		@Column(name="pa_2_2_1", attrName="pa_2_2_1", label="是否进行术前内分泌检查", comment="是否进行术前内分泌检查（垂体激素）评估"),
		@Column(name="pa_2_2_1_1", attrName="pa_2_2_1_1", label="血清催乳素PRL", comment="血清催乳素PRL(ng/ml)"),
		@Column(name="pa_2_2_1_2", attrName="pa_2_2_1_2", label="黄体生成素LH", comment="黄体生成素LH(mIU/mL)"),
		@Column(name="pa_2_2_1_3", attrName="pa_2_2_1_3", label="促卵泡成熟激素FSH", comment="促卵泡成熟激素FSH(mIU/mL)"),
		@Column(name="pa_2_2_1_4", attrName="pa_2_2_1_4", label="雌二醇E2", comment="雌二醇E2(pg/ml)"),
		@Column(name="pa_2_2_1_5", attrName="pa_2_2_1_5", label="孕酮P4", comment="孕酮P4(ng/ml)"),
		@Column(name="pa_2_2_1_6", attrName="pa_2_2_1_6", label="生长激素HGH", comment="生长激素HGH(ng/ml)"),
		@Column(name="pa_2_2_1_7", attrName="pa_2_2_1_7", label="皮质醇COR", comment="皮质醇COR(ng/ml)"),
		@Column(name="pa_2_2_1_8", attrName="pa_2_2_1_8", label="睾酮T", comment="睾酮T(ng/ml)"),
		@Column(name="pa_2_3_1", attrName="pa_2_3_1", label="是否进行术前内分泌检查", comment="是否进行术前内分泌检查（甲状腺激素）评估"),
		@Column(name="pa_2_3_1_1", attrName="pa_2_3_1_1", label="促甲状腺激素（或超敏促甲状腺激素）TSH", comment="促甲状腺激素（或超敏促甲状腺激素）TSH(uIU/ml)"),
		@Column(name="pa_2_3_1_2", attrName="pa_2_3_1_2", label="三碘甲状腺原氨酸T3", comment="三碘甲状腺原氨酸T3(nmol/L)"),
		@Column(name="pa_2_3_1_3", attrName="pa_2_3_1_3", label="游离T3 FT3", comment="游离T3 FT3(pmol/L)"),
		@Column(name="pa_2_3_1_4", attrName="pa_2_3_1_4", label="甲状腺素T4", comment="甲状腺素T4(nmol/L)"),
		@Column(name="pa_2_3_1_5", attrName="pa_2_3_1_5", label="游离T4 FT4", comment="游离T4 FT4(pmol/L)"),
		@Column(name="pa_2_4_1", attrName="pa_2_4_1", label="是否进行术前内分泌检查", comment="是否进行术前内分泌检查（IGF-1）评估"),
		@Column(name="pa_2_4_2", attrName="pa_2_4_2", label="胰岛素生长因子IGF-1", comment="胰岛素生长因子IGF-1(ng/ml)"),
		@Column(name="pa_2_4_3", attrName="pa_2_4_3", label="术前评估肾上腺功能不全或显著的垂体功能低减的患者是否需给予激素替代治疗"),
		@Column(name="pa_2_4_4", attrName="pa_2_4_4", label="生长激素腺瘤是否评估心肺等功能"),
		@Column(name="pa_2_5_1", attrName="pa_2_5_1", label="是否进行术前多学科", comment="是否进行术前多学科（MDT）诊疗讨论"),
		@Column(name="pa_2_5_2", attrName="pa_2_5_2", label="讨论日期时间"),
		@Column(name="pa_2_5_3", attrName="pa_2_5_3", label="术前多学科", comment="术前多学科（MDT）诊疗讨论主要内容"),
		@Column(name="pa_2_5_3_1", attrName="pa_2_5_3_1", label="其他术前多学科", comment="其他术前多学科（MDT）诊疗讨论主要内容"),
		@Column(name="pa_2_5_4", attrName="pa_2_5_4", label="参加术前多学科", comment="参加术前多学科（MDT）诊疗讨论的科室"),
		@Column(name="pa_2_5_4_1", attrName="pa_2_5_4_1", label="其他参加术前多学科", comment="其他参加术前多学科（MDT）诊疗讨论的科室"),
		@Column(name="pa_3_1_1", attrName="pa_3_1_1", label="手术治疗适应证的选择因素"),
		@Column(name="pa_3_2_1", attrName="pa_3_2_1", label="是否有手术治疗禁忌证"),
		@Column(name="pa_3_2_2", attrName="pa_3_2_2", label="经鼻蝶人路手术治疗禁忌征的选择"),
		@Column(name="pa_3_2_3", attrName="pa_3_2_3", label="开颅垂体 腺瘤切除手术治疗禁忌征的选择"),
		@Column(name="pa_4_1_1", attrName="pa_4_1_1", label="是否有可能并发术中出血评估及安全处置预案"),
		@Column(name="pa_4_1_2", attrName="pa_4_1_2", label="是否有可能并发术中脑脊液漏评估及安全处置预案"),
		@Column(name="pa_4_1_3", attrName="pa_4_1_3", label="是否有可能并发额叶挫伤评估及安全处置预案"),
		@Column(name="pa_4_1_4", attrName="pa_4_1_4", label="是否有可能并发视神经损伤评估及安全处置预案"),
		@Column(name="pa_4_1_5", attrName="pa_4_1_5", label="是否有可能并发颈内动脉损伤评估及安全处置预案"),
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
		@Column(name="cm_2_3_15", attrName="cm_2_3_15", label="急性肾功能衰竭", comment="急性肾功能衰竭（手术后）"),
		@Column(name="cm_2_5", attrName="cm_2_5", label="PA术后特指并发症"),
		@Column(name="cm_2_4", attrName="cm_2_4", label="影响程度的选择"),
		@Column(name="pa_6_4_1", attrName="pa_6_4_1", label="是否有手术后再手术"),
		@Column(name="pa_6_4_2", attrName="pa_6_4_2", label="手术后再手术名称"),
		@Column(name="pa_6_4_3", attrName="pa_6_4_3", label="再手术日期时间"),
		@Column(name="pa_7_1_1", attrName="pa_7_1_1", label="是否有病理报告记录单"),
		@Column(name="pa_7_1_2", attrName="pa_7_1_2", label="病理报告记录单中基本内容"),
		@Column(name="pa_7_1_3", attrName="pa_7_1_3", label="垂体腺瘤免疫组化情况"),
		@Column(name="pa_7_2_1", attrName="pa_7_2_1", label="垂体瘤Ki-67阳性细胞比例是否确定"),
		@Column(name="pa_7_2_2", attrName="pa_7_2_2", label="垂体瘤Ki-67阳性细胞比例", comment="垂体瘤Ki-67阳性细胞比例(%)"),
		@Column(name="pa_8_1_1", attrName="pa_8_1_1", label="手术中出血量", comment="手术中出血量(ml)"),
		@Column(name="pa_8_1_2", attrName="pa_8_1_2", label="手术中输血量", comment="手术中输血量(ml)"),
		@Column(name="pa_8_1_3", attrName="pa_8_1_3", label="手术后出血量", comment="手术后出血量(ml)"),
		@Column(name="pa_8_1_4", attrName="pa_8_1_4", label="手术后输血量", comment="手术后输血量(ml)"),
		@Column(name="pa_8_2_1", attrName="pa_8_2_1", label="全血", comment="全血(ml)"),
		@Column(name="pa_8_2_2", attrName="pa_8_2_2", label="成份血", comment="成份血(ml)"),
		@Column(name="pa_8_2_3", attrName="pa_8_2_3", label="血浆", comment="血浆(ml)"),
		@Column(name="pa_9_1_1", attrName="pa_9_1_1", label="是否进行术后视力视野的复查及评估"),
		@Column(name="pa_9_1_2", attrName="pa_9_1_2", label="复查及评估结果是否确定"),
		@Column(name="pa_9_1_2_1", attrName="pa_9_1_2_1", label="术后左眼视力数值"),
		@Column(name="pa_9_1_2_2", attrName="pa_9_1_2_2", label="术后右眼视力数值"),
		@Column(name="pa_9_2_1", attrName="pa_9_2_1", label="术后2-3天,是否复查内分泌激素"),
		@Column(name="pa_9_2_1_1", attrName="pa_9_2_1_1", label="血清催乳素PRL", comment="血清催乳素PRL(ng/ml)"),
		@Column(name="pa_9_2_1_2", attrName="pa_9_2_1_2", label="黄体生成素LH", comment="黄体生成素LH(mIU/mL)"),
		@Column(name="pa_9_2_1_3", attrName="pa_9_2_1_3", label="促卵泡成熟激素FSH", comment="促卵泡成熟激素FSH(mIU/mL)"),
		@Column(name="pa_9_2_1_4", attrName="pa_9_2_1_4", label="雌二醇E2", comment="雌二醇E2(pg/ml)"),
		@Column(name="pa_9_2_1_5", attrName="pa_9_2_1_5", label="孕酮P4", comment="孕酮P4(ng/ml)"),
		@Column(name="pa_9_2_1_6", attrName="pa_9_2_1_6", label="生长激素HGH", comment="生长激素HGH(ng/ml)"),
		@Column(name="pa_9_2_1_7", attrName="pa_9_2_1_7", label="皮质醇COR", comment="皮质醇COR(ng/ml)"),
		@Column(name="pa_9_2_1_8", attrName="pa_9_2_1_8", label="睾酮T", comment="睾酮T(ng/ml)"),
		@Column(name="pa_9_2_1_9", attrName="pa_9_2_1_9", label="促甲状腺激素（或超敏促甲状腺激素）TSH", comment="促甲状腺激素（或超敏促甲状腺激素）TSH(uIU/ml)"),
		@Column(name="pa_9_2_1_10", attrName="pa_9_2_1_10", label="三碘甲状腺原氨酸T3", comment="三碘甲状腺原氨酸T3(nmol/L)"),
		@Column(name="pa_9_2_1_11", attrName="pa_9_2_1_11", label="游离三碘甲状腺原氨酸 FT3", comment="游离三碘甲状腺原氨酸 FT3(pmol/L)"),
		@Column(name="pa_9_2_1_12", attrName="pa_9_2_1_12", label="甲状腺素T4", comment="甲状腺素T4(nmol/L)"),
		@Column(name="pa_9_2_1_13", attrName="pa_9_2_1_13", label="游离甲状腺素 FT4", comment="游离甲状腺素 FT4(pmol/L)"),
		@Column(name="pa_9_3_1", attrName="pa_9_3_1", label="是否进行电解质水平监测"),
		@Column(name="pa_9_3_3", attrName="pa_9_3_3", label="电解质水平监测的时段"),
		@Column(name="pa_9_3_2", attrName="pa_9_3_2", label="电解质水平监测的时段"),
		@Column(name="pa_9_3_2_1", attrName="pa_9_3_2_1", label="钾离子", comment="钾离子(mmol/L)"),
		@Column(name="pa_9_3_2_2", attrName="pa_9_3_2_2", label="钠离子", comment="钠离子(mmol/L)"),
		@Column(name="pa_9_3_2_3", attrName="pa_9_3_2_3", label="氯离子", comment="氯离子(mmol/L)"),
		@Column(name="pa_10_1_1", attrName="pa_10_1_1", label="是否进行术后辅助放疗"),
		@Column(name="pa_10_1_2", attrName="pa_10_1_2", label="术后辅助放疗指征的选择"),
		@Column(name="pa_10_1_3", attrName="pa_10_1_3", label="术后辅助放疗模式的选择"),
		@Column(name="pa_10_2_1", attrName="pa_10_2_1", label="是否进行术后辅助药物治疗"),
		@Column(name="pa_10_2_2", attrName="pa_10_2_2", label="药物治疗符合指征"),
		@Column(name="pa_11_1_0", attrName="pa_11_1_0", label="是否入院时进行重点护理评估且有记录"),
		@Column(name="pa_11_1_1", attrName="pa_11_1_1", label="行走评估结果"),
		@Column(name="pa_11_1_2", attrName="pa_11_1_2", label="呼吸评估结果"),
		@Column(name="pa_11_1_3", attrName="pa_11_1_3", label="评估视力视野障碍对患者的影响"),
		@Column(name="pa_11_1_4", attrName="pa_11_1_4", label="入院后第一个24小时液体出入量"),
		@Column(name="pa_11_1_5", attrName="pa_11_1_5", label="其中，每小时液体出入量"),
		@Column(name="pa_11_1_6", attrName="pa_11_1_6", label="实施卒中健康教育记录内容"),
		@Column(name="pa_11_1_7", attrName="pa_11_1_7", label="经蝶手术患者强化鼻腔护理,减少术后脑脊液鼻漏并发症的护理措施"),
		@Column(name="pa_11_1_9", attrName="pa_11_1_9", label="尿量异常患者的长期护理"),
		@Column(name="pa_11_1_10", attrName="pa_11_1_10", label="饮食指导"),
		@Column(name="pa_11_1_11_3", attrName="pa_11_1_11_3", label="压疮评估分值是否确定"),
		@Column(name="pa_11_1_11", attrName="pa_11_1_11", label="压疮评估", comment="压疮评估（Braden评分值）分值"),
		@Column(name="pa_11_1_11_1", attrName="pa_11_1_11_1", label="压疮评估结果选择"),
		@Column(name="pa_11_1_11_2", attrName="pa_11_1_11_2", label="是否进行预防压疮告知"),
		@Column(name="pa_11_2_1", attrName="pa_11_2_1", label="是否实施手术前健康教育且有记录"),
		@Column(name="pa_11_1_3_1", attrName="pa_11_1_3_1", label="实施卒中健康教育记录内容"),
		@Column(name="pa_11_1_2_1", attrName="pa_11_1_2_1", label="其他实施卒中健康教育记录内容"),
		@Column(name="pa_11_1_3_4", attrName="pa_11_1_3_4", label="是否实施术后健康教育且有记录"),
		@Column(name="pa_11_1_3_2", attrName="pa_11_1_3_2", label="吸烟史"),
		@Column(name="pa_11_1_3_3", attrName="pa_11_1_3_3", label="吸烟程度评估"),
		@Column(name="pa_11_1_3_5", attrName="pa_11_1_3_5", label="接受戒烟的建议或者戒烟治疗"),
		@Column(name="pa_11_2_2_1", attrName="pa_11_2_2_1", label="交与患者“出院小结”的副本，并告知患者出院时风险因素"),
		@Column(name="pa_11_2_2_2", attrName="pa_11_2_2_2", label="出院带药"),
		@Column(name="pa_11_2_2_3", attrName="pa_11_2_2_3", label="告知发生紧急情况时求援救治途径"),
		@Column(name="pa_11_2_2_4", attrName="pa_11_2_2_4", label="出院时教育与随访"),
		@Column(name="pa_11_2_2_5", attrName="pa_11_2_2_5", label="告知何为风险因素与紧急情况"),
		@Column(name="pa_12_1_1", attrName="pa_12_1_1", label="符合治愈标准的选项"),
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
public class QualityPa extends DataEntity<QualityPa> {
	
	private static final long serialVersionUID = 1L;
	private String cm_0_1_1_1;		// 质控医师
	private String cm_0_1_1_2;		// 质控护士
	private String cm_0_1_1_3;		// 主治医师
	private String cm_0_1_1_4;		// 责任护士
	private String cm_0_1_1_5;		// 上报科室
	private String caseid;		// 患者病案号
	private String cm_0_1_3_1;		// 主要诊断ICD-10四位亚目编码与名称
	private String pa_0_1_7_1;		// 其他主要诊断ICD-10四位亚目编码与名称
	private String cm_0_1_3_2;		// 主要诊断ICD-10六位临床扩展编码与名称
	private String pa_0_1_8_1;		// 其他主要诊断ICD-10六位临床扩展编码与名称
	private String cm_0_1_4_1;		// 主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称
	private String pa_0_1_9_1;		// 其他主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称
	private String cm_0_1_4_2;		// 主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称
	private String pa_0_1_10_1;		// 其他主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称
	private String cm_0_1_5;		// PA出院后是否31天内重复住院
	private String cm_0_2_1_1;		// 出生日期
	private String cm_0_2_1_2;		// 患者性别
	private Double cm_0_2_1_3;		// 患者体重（kg）
	private Double cm_0_2_1_5;		// 患者身高（cm）
	private String cm_0_2_2_1;		// 发病日期时间是否无法确定或无记录
	private String cm_0_2_2_2;		// 发病日期时间
	private String cm_0_2_4_1;		// 入院日期时间
	private String cm_0_2_4_2;		// 出院日期时间
	private String cm_0_2_5_1;		// 入住ICU日期时间
	private String cm_0_2_5_2;		// 离开ICU日期时间
	private String cm_0_2_6_1;		// 手术开始（切皮）日期时间
	private String cm_0_2_6_2;		// 手术结束（缝皮结束）日期时间
	private String cm_0_3_1;		// 费用支付方式
	private String cm_0_3_2;		// 收入住院途径
	private String cm_0_3_3;		// 到院交通工具
	private String pa_1_1_1;		// 主要临床表现
	private String pa_1_2_1;		// 首次磁共振扫描
	private String pa_1_2_2_1;		// 获得首次磁共振检查报告的日期时间是否确定
	private String pa_1_2_2;		// 获得首次磁共振检查报告的日期时间
	private String pa_1_2_3;		// 首次磁共振扫描模式
	private String pa_1_2_4;		// 肿瘤大小
	private String pa_2_1_1;		// 是否进行术前双侧视力与视野评估
	private Double pa_2_1_2;		// 左眼视力数值
	private Double pa_2_1_3;		// 右眼视力数值
	private String pa_2_2_1;		// 是否进行术前内分泌检查（垂体激素）评估
	private Double pa_2_2_1_1;		// 血清催乳素PRL(ng/ml)
	private Double pa_2_2_1_2;		// 黄体生成素LH(mIU/mL)
	private Double pa_2_2_1_3;		// 促卵泡成熟激素FSH(mIU/mL)
	private Double pa_2_2_1_4;		// 雌二醇E2(pg/ml)
	private Double pa_2_2_1_5;		// 孕酮P4(ng/ml)
	private Double pa_2_2_1_6;		// 生长激素HGH(ng/ml)
	private Double pa_2_2_1_7;		// 皮质醇COR(ng/ml)
	private Double pa_2_2_1_8;		// 睾酮T(ng/ml)
	private String pa_2_3_1;		// 是否进行术前内分泌检查（甲状腺激素）评估
	private Double pa_2_3_1_1;		// 促甲状腺激素（或超敏促甲状腺激素）TSH(uIU/ml)
	private Double pa_2_3_1_2;		// 三碘甲状腺原氨酸T3(nmol/L)
	private Double pa_2_3_1_3;		// 游离T3 FT3(pmol/L)
	private Double pa_2_3_1_4;		// 甲状腺素T4(nmol/L)
	private Double pa_2_3_1_5;		// 游离T4 FT4(pmol/L)
	private String pa_2_4_1;		// 是否进行术前内分泌检查（IGF-1）评估
	private Double pa_2_4_2;		// 胰岛素生长因子IGF-1(ng/ml)
	private String pa_2_4_3;		// 术前评估肾上腺功能不全或显著的垂体功能低减的患者是否需给予激素替代治疗
	private String pa_2_4_4;		// 生长激素腺瘤是否评估心肺等功能
	private String pa_2_5_1;		// 是否进行术前多学科（MDT）诊疗讨论
	private String pa_2_5_2;		// 讨论日期时间
	private String pa_2_5_3;		// 术前多学科（MDT）诊疗讨论主要内容
	private String pa_2_5_3_1;		// 其他术前多学科（MDT）诊疗讨论主要内容
	private String pa_2_5_4;		// 参加术前多学科（MDT）诊疗讨论的科室
	private String pa_2_5_4_1;		// 其他参加术前多学科（MDT）诊疗讨论的科室
	private String pa_3_1_1;		// 手术治疗适应证的选择因素
	private String pa_3_2_1;		// 是否有手术治疗禁忌证
	private String pa_3_2_2;		// 经鼻蝶人路手术治疗禁忌征的选择
	private String pa_3_2_3;		// 开颅垂体 腺瘤切除手术治疗禁忌征的选择
	private String pa_4_1_1;		// 是否有可能并发术中出血评估及安全处置预案
	private String pa_4_1_2;		// 是否有可能并发术中脑脊液漏评估及安全处置预案
	private String pa_4_1_3;		// 是否有可能并发额叶挫伤评估及安全处置预案
	private String pa_4_1_4;		// 是否有可能并发视神经损伤评估及安全处置预案
	private String pa_4_1_5;		// 是否有可能并发颈内动脉损伤评估及安全处置预案
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
	private String cm_1_6_3_2;		// 术后72小时之后继续使用的原因
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
	private String cm_2_3_15;		// 急性肾功能衰竭（手术后）
	private String cm_2_5;		// PA术后特指并发症
	private String cm_2_4;		// 影响程度的选择
	private String pa_6_4_1;		// 是否有手术后再手术
	private String pa_6_4_2;		// 手术后再手术名称
	private String pa_6_4_3;		// 再手术日期时间
	private String pa_7_1_1;		// 是否有病理报告记录单
	private String pa_7_1_2;		// 病理报告记录单中基本内容
	private String pa_7_1_3;		// 垂体腺瘤免疫组化情况
	private String pa_7_2_1;		// 垂体瘤Ki-67阳性细胞比例是否确定
	private Double pa_7_2_2;		// 垂体瘤Ki-67阳性细胞比例(%)
	private Double pa_8_1_1;		// 手术中出血量(ml)
	private Double pa_8_1_2;		// 手术中输血量(ml)
	private Double pa_8_1_3;		// 手术后出血量(ml)
	private Double pa_8_1_4;		// 手术后输血量(ml)
	private Double pa_8_2_1;		// 全血(ml)
	private Double pa_8_2_2;		// 成份血(ml)
	private Double pa_8_2_3;		// 血浆(ml)
	private String pa_9_1_1;		// 是否进行术后视力视野的复查及评估
	private String pa_9_1_2;		// 复查及评估结果是否确定
	private Double pa_9_1_2_1;		// 术后左眼视力数值
	private Double pa_9_1_2_2;		// 术后右眼视力数值
	private String pa_9_2_1;		// 术后2-3天,是否复查内分泌激素
	private Double pa_9_2_1_1;		// 血清催乳素PRL(ng/ml)
	private Double pa_9_2_1_2;		// 黄体生成素LH(mIU/mL)
	private Double pa_9_2_1_3;		// 促卵泡成熟激素FSH(mIU/mL)
	private Double pa_9_2_1_4;		// 雌二醇E2(pg/ml)
	private Double pa_9_2_1_5;		// 孕酮P4(ng/ml)
	private Double pa_9_2_1_6;		// 生长激素HGH(ng/ml)
	private Double pa_9_2_1_7;		// 皮质醇COR(ng/ml)
	private Double pa_9_2_1_8;		// 睾酮T(ng/ml)
	private Double pa_9_2_1_9;		// 促甲状腺激素（或超敏促甲状腺激素）TSH(uIU/ml)
	private Double pa_9_2_1_10;		// 三碘甲状腺原氨酸T3(nmol/L)
	private Double pa_9_2_1_11;		// 游离三碘甲状腺原氨酸 FT3(pmol/L)
	private Double pa_9_2_1_12;		// 甲状腺素T4(nmol/L)
	private Double pa_9_2_1_13;		// 游离甲状腺素 FT4(pmol/L)
	private String pa_9_3_1;		// 是否进行电解质水平监测
	private String pa_9_3_3;		// 电解质水平监测的时段
	private String pa_9_3_2;		// 电解质水平监测的时段
	private Double pa_9_3_2_1;		// 钾离子(mmol/L)
	private Double pa_9_3_2_2;		// 钠离子(mmol/L)
	private Double pa_9_3_2_3;		// 氯离子(mmol/L)
	private String pa_10_1_1;		// 是否进行术后辅助放疗
	private String pa_10_1_2;		// 术后辅助放疗指征的选择
	private String pa_10_1_3;		// 术后辅助放疗模式的选择
	private String pa_10_2_1;		// 是否进行术后辅助药物治疗
	private String pa_10_2_2;		// 药物治疗符合指征
	private String pa_11_1_0;		// 是否入院时进行重点护理评估且有记录
	private String pa_11_1_1;		// 行走评估结果
	private String pa_11_1_2;		// 呼吸评估结果
	private String pa_11_1_3;		// 评估视力视野障碍对患者的影响
	private String pa_11_1_4;		// 入院后第一个24小时液体出入量
	private String pa_11_1_5;		// 其中，每小时液体出入量
	private String pa_11_1_6;		// 实施卒中健康教育记录内容
	private String pa_11_1_7;		// 经蝶手术患者强化鼻腔护理,减少术后脑脊液鼻漏并发症的护理措施
	private String pa_11_1_9;		// 尿量异常患者的长期护理
	private String pa_11_1_10;		// 饮食指导
	private String pa_11_1_11_3;		// 压疮评估分值是否确定
	private Double pa_11_1_11;		// 压疮评估（Braden评分值）分值
	private String pa_11_1_11_1;		// 压疮评估结果选择
	private String pa_11_1_11_2;		// 是否进行预防压疮告知
	private String pa_11_2_1;		// 是否实施手术前健康教育且有记录
	private String pa_11_1_3_1;		// 实施卒中健康教育记录内容
	private String pa_11_1_2_1;		// 其他实施卒中健康教育记录内容
	private String pa_11_1_3_4;		// 是否实施术后健康教育且有记录
	private String pa_11_1_3_2;		// 吸烟史
	private String pa_11_1_3_3;		// 吸烟程度评估
	private String pa_11_1_3_5;		// 接受戒烟的建议或者戒烟治疗
	private String pa_11_2_2_1;		// 交与患者“出院小结”的副本，并告知患者出院时风险因素
	private String pa_11_2_2_2;		// 出院带药
	private String pa_11_2_2_3;		// 告知发生紧急情况时求援救治途径
	private String pa_11_2_2_4;		// 出院时教育与随访
	private String pa_11_2_2_5;		// 告知何为风险因素与紧急情况
	private String pa_12_1_1;		// 符合治愈标准的选项
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
	
	public QualityPa() {
		this(null);
	}

	public QualityPa(String id){
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
	
	@Length(min=0, max=64, message="其他主要诊断ICD-10四位亚目编码与名称长度不能超过 64 个字符")
	public String getPa_0_1_7_1() {
		return pa_0_1_7_1;
	}

	public void setPa_0_1_7_1(String pa_0_1_7_1) {
		this.pa_0_1_7_1 = pa_0_1_7_1;
	}
	
	@Length(min=0, max=64, message="主要诊断ICD-10六位临床扩展编码与名称长度不能超过 64 个字符")
	public String getCm_0_1_3_2() {
		return cm_0_1_3_2;
	}

	public void setCm_0_1_3_2(String cm_0_1_3_2) {
		this.cm_0_1_3_2 = cm_0_1_3_2;
	}
	
	@Length(min=0, max=64, message="其他主要诊断ICD-10六位临床扩展编码与名称长度不能超过 64 个字符")
	public String getPa_0_1_8_1() {
		return pa_0_1_8_1;
	}

	public void setPa_0_1_8_1(String pa_0_1_8_1) {
		this.pa_0_1_8_1 = pa_0_1_8_1;
	}
	
	@Length(min=0, max=64, message="主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称长度不能超过 64 个字符")
	public String getCm_0_1_4_1() {
		return cm_0_1_4_1;
	}

	public void setCm_0_1_4_1(String cm_0_1_4_1) {
		this.cm_0_1_4_1 = cm_0_1_4_1;
	}
	
	@Length(min=0, max=64, message="其他主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称长度不能超过 64 个字符")
	public String getPa_0_1_9_1() {
		return pa_0_1_9_1;
	}

	public void setPa_0_1_9_1(String pa_0_1_9_1) {
		this.pa_0_1_9_1 = pa_0_1_9_1;
	}
	
	@Length(min=0, max=64, message="主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称长度不能超过 64 个字符")
	public String getCm_0_1_4_2() {
		return cm_0_1_4_2;
	}

	public void setCm_0_1_4_2(String cm_0_1_4_2) {
		this.cm_0_1_4_2 = cm_0_1_4_2;
	}
	
	@Length(min=0, max=64, message="其他主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称长度不能超过 64 个字符")
	public String getPa_0_1_10_1() {
		return pa_0_1_10_1;
	}

	public void setPa_0_1_10_1(String pa_0_1_10_1) {
		this.pa_0_1_10_1 = pa_0_1_10_1;
	}
	
	@Length(min=0, max=64, message="PA出院后是否31天内重复住院长度不能超过 64 个字符")
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
	
	@Length(min=0, max=64, message="入住ICU日期时间长度不能超过 64 个字符")
	public String getCm_0_2_5_1() {
		return cm_0_2_5_1;
	}

	public void setCm_0_2_5_1(String cm_0_2_5_1) {
		this.cm_0_2_5_1 = cm_0_2_5_1;
	}
	
	@Length(min=0, max=64, message="离开ICU日期时间长度不能超过 64 个字符")
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
	
	@Length(min=0, max=64, message="主要临床表现长度不能超过 64 个字符")
	public String getPa_1_1_1() {
		return pa_1_1_1;
	}

	public void setPa_1_1_1(String pa_1_1_1) {
		this.pa_1_1_1 = pa_1_1_1;
	}
	
	@Length(min=0, max=64, message="首次磁共振扫描长度不能超过 64 个字符")
	public String getPa_1_2_1() {
		return pa_1_2_1;
	}

	public void setPa_1_2_1(String pa_1_2_1) {
		this.pa_1_2_1 = pa_1_2_1;
	}
	
	@Length(min=0, max=64, message="获得首次磁共振检查报告的日期时间是否确定长度不能超过 64 个字符")
	public String getPa_1_2_2_1() {
		return pa_1_2_2_1;
	}

	public void setPa_1_2_2_1(String pa_1_2_2_1) {
		this.pa_1_2_2_1 = pa_1_2_2_1;
	}
	
	@Length(min=0, max=64, message="获得首次磁共振检查报告的日期时间长度不能超过 64 个字符")
	public String getPa_1_2_2() {
		return pa_1_2_2;
	}

	public void setPa_1_2_2(String pa_1_2_2) {
		this.pa_1_2_2 = pa_1_2_2;
	}
	
	@Length(min=0, max=64, message="首次磁共振扫描模式长度不能超过 64 个字符")
	public String getPa_1_2_3() {
		return pa_1_2_3;
	}

	public void setPa_1_2_3(String pa_1_2_3) {
		this.pa_1_2_3 = pa_1_2_3;
	}
	
	@Length(min=0, max=64, message="肿瘤大小长度不能超过 64 个字符")
	public String getPa_1_2_4() {
		return pa_1_2_4;
	}

	public void setPa_1_2_4(String pa_1_2_4) {
		this.pa_1_2_4 = pa_1_2_4;
	}
	
	@Length(min=0, max=64, message="是否进行术前双侧视力与视野评估长度不能超过 64 个字符")
	public String getPa_2_1_1() {
		return pa_2_1_1;
	}

	public void setPa_2_1_1(String pa_2_1_1) {
		this.pa_2_1_1 = pa_2_1_1;
	}
	
	public Double getPa_2_1_2() {
		return pa_2_1_2;
	}

	public void setPa_2_1_2(Double pa_2_1_2) {
		this.pa_2_1_2 = pa_2_1_2;
	}
	
	public Double getPa_2_1_3() {
		return pa_2_1_3;
	}

	public void setPa_2_1_3(Double pa_2_1_3) {
		this.pa_2_1_3 = pa_2_1_3;
	}
	
	@Length(min=0, max=64, message="是否进行术前内分泌检查长度不能超过 64 个字符")
	public String getPa_2_2_1() {
		return pa_2_2_1;
	}

	public void setPa_2_2_1(String pa_2_2_1) {
		this.pa_2_2_1 = pa_2_2_1;
	}
	
	public Double getPa_2_2_1_1() {
		return pa_2_2_1_1;
	}

	public void setPa_2_2_1_1(Double pa_2_2_1_1) {
		this.pa_2_2_1_1 = pa_2_2_1_1;
	}
	
	public Double getPa_2_2_1_2() {
		return pa_2_2_1_2;
	}

	public void setPa_2_2_1_2(Double pa_2_2_1_2) {
		this.pa_2_2_1_2 = pa_2_2_1_2;
	}
	
	public Double getPa_2_2_1_3() {
		return pa_2_2_1_3;
	}

	public void setPa_2_2_1_3(Double pa_2_2_1_3) {
		this.pa_2_2_1_3 = pa_2_2_1_3;
	}
	
	public Double getPa_2_2_1_4() {
		return pa_2_2_1_4;
	}

	public void setPa_2_2_1_4(Double pa_2_2_1_4) {
		this.pa_2_2_1_4 = pa_2_2_1_4;
	}
	
	public Double getPa_2_2_1_5() {
		return pa_2_2_1_5;
	}

	public void setPa_2_2_1_5(Double pa_2_2_1_5) {
		this.pa_2_2_1_5 = pa_2_2_1_5;
	}
	
	public Double getPa_2_2_1_6() {
		return pa_2_2_1_6;
	}

	public void setPa_2_2_1_6(Double pa_2_2_1_6) {
		this.pa_2_2_1_6 = pa_2_2_1_6;
	}
	
	public Double getPa_2_2_1_7() {
		return pa_2_2_1_7;
	}

	public void setPa_2_2_1_7(Double pa_2_2_1_7) {
		this.pa_2_2_1_7 = pa_2_2_1_7;
	}
	
	public Double getPa_2_2_1_8() {
		return pa_2_2_1_8;
	}

	public void setPa_2_2_1_8(Double pa_2_2_1_8) {
		this.pa_2_2_1_8 = pa_2_2_1_8;
	}
	
	@Length(min=0, max=64, message="是否进行术前内分泌检查长度不能超过 64 个字符")
	public String getPa_2_3_1() {
		return pa_2_3_1;
	}

	public void setPa_2_3_1(String pa_2_3_1) {
		this.pa_2_3_1 = pa_2_3_1;
	}
	
	public Double getPa_2_3_1_1() {
		return pa_2_3_1_1;
	}

	public void setPa_2_3_1_1(Double pa_2_3_1_1) {
		this.pa_2_3_1_1 = pa_2_3_1_1;
	}
	
	public Double getPa_2_3_1_2() {
		return pa_2_3_1_2;
	}

	public void setPa_2_3_1_2(Double pa_2_3_1_2) {
		this.pa_2_3_1_2 = pa_2_3_1_2;
	}
	
	public Double getPa_2_3_1_3() {
		return pa_2_3_1_3;
	}

	public void setPa_2_3_1_3(Double pa_2_3_1_3) {
		this.pa_2_3_1_3 = pa_2_3_1_3;
	}
	
	public Double getPa_2_3_1_4() {
		return pa_2_3_1_4;
	}

	public void setPa_2_3_1_4(Double pa_2_3_1_4) {
		this.pa_2_3_1_4 = pa_2_3_1_4;
	}
	
	public Double getPa_2_3_1_5() {
		return pa_2_3_1_5;
	}

	public void setPa_2_3_1_5(Double pa_2_3_1_5) {
		this.pa_2_3_1_5 = pa_2_3_1_5;
	}
	
	@Length(min=0, max=64, message="是否进行术前内分泌检查长度不能超过 64 个字符")
	public String getPa_2_4_1() {
		return pa_2_4_1;
	}

	public void setPa_2_4_1(String pa_2_4_1) {
		this.pa_2_4_1 = pa_2_4_1;
	}
	
	public Double getPa_2_4_2() {
		return pa_2_4_2;
	}

	public void setPa_2_4_2(Double pa_2_4_2) {
		this.pa_2_4_2 = pa_2_4_2;
	}
	
	@Length(min=0, max=64, message="术前评估肾上腺功能不全或显著的垂体功能低减的患者是否需给予激素替代治疗长度不能超过 64 个字符")
	public String getPa_2_4_3() {
		return pa_2_4_3;
	}

	public void setPa_2_4_3(String pa_2_4_3) {
		this.pa_2_4_3 = pa_2_4_3;
	}
	
	@Length(min=0, max=64, message="生长激素腺瘤是否评估心肺等功能长度不能超过 64 个字符")
	public String getPa_2_4_4() {
		return pa_2_4_4;
	}

	public void setPa_2_4_4(String pa_2_4_4) {
		this.pa_2_4_4 = pa_2_4_4;
	}
	
	@Length(min=0, max=64, message="是否进行术前多学科长度不能超过 64 个字符")
	public String getPa_2_5_1() {
		return pa_2_5_1;
	}

	public void setPa_2_5_1(String pa_2_5_1) {
		this.pa_2_5_1 = pa_2_5_1;
	}
	
	@Length(min=0, max=64, message="讨论日期时间长度不能超过 64 个字符")
	public String getPa_2_5_2() {
		return pa_2_5_2;
	}

	public void setPa_2_5_2(String pa_2_5_2) {
		this.pa_2_5_2 = pa_2_5_2;
	}
	
	@Length(min=0, max=64, message="术前多学科长度不能超过 64 个字符")
	public String getPa_2_5_3() {
		return pa_2_5_3;
	}

	public void setPa_2_5_3(String pa_2_5_3) {
		this.pa_2_5_3 = pa_2_5_3;
	}
	
	@Length(min=0, max=64, message="其他术前多学科长度不能超过 64 个字符")
	public String getPa_2_5_3_1() {
		return pa_2_5_3_1;
	}

	public void setPa_2_5_3_1(String pa_2_5_3_1) {
		this.pa_2_5_3_1 = pa_2_5_3_1;
	}
	
	@Length(min=0, max=64, message="参加术前多学科长度不能超过 64 个字符")
	public String getPa_2_5_4() {
		return pa_2_5_4;
	}

	public void setPa_2_5_4(String pa_2_5_4) {
		this.pa_2_5_4 = pa_2_5_4;
	}
	
	@Length(min=0, max=64, message="其他参加术前多学科长度不能超过 64 个字符")
	public String getPa_2_5_4_1() {
		return pa_2_5_4_1;
	}

	public void setPa_2_5_4_1(String pa_2_5_4_1) {
		this.pa_2_5_4_1 = pa_2_5_4_1;
	}
	
	@Length(min=0, max=64, message="手术治疗适应证的选择因素长度不能超过 64 个字符")
	public String getPa_3_1_1() {
		return pa_3_1_1;
	}

	public void setPa_3_1_1(String pa_3_1_1) {
		this.pa_3_1_1 = pa_3_1_1;
	}
	
	@Length(min=0, max=64, message="是否有手术治疗禁忌证长度不能超过 64 个字符")
	public String getPa_3_2_1() {
		return pa_3_2_1;
	}

	public void setPa_3_2_1(String pa_3_2_1) {
		this.pa_3_2_1 = pa_3_2_1;
	}
	
	@Length(min=0, max=64, message="经鼻蝶人路手术治疗禁忌征的选择长度不能超过 64 个字符")
	public String getPa_3_2_2() {
		return pa_3_2_2;
	}

	public void setPa_3_2_2(String pa_3_2_2) {
		this.pa_3_2_2 = pa_3_2_2;
	}
	
	@Length(min=0, max=64, message="开颅垂体 腺瘤切除手术治疗禁忌征的选择长度不能超过 64 个字符")
	public String getPa_3_2_3() {
		return pa_3_2_3;
	}

	public void setPa_3_2_3(String pa_3_2_3) {
		this.pa_3_2_3 = pa_3_2_3;
	}
	
	@Length(min=0, max=64, message="是否有可能并发术中出血评估及安全处置预案长度不能超过 64 个字符")
	public String getPa_4_1_1() {
		return pa_4_1_1;
	}

	public void setPa_4_1_1(String pa_4_1_1) {
		this.pa_4_1_1 = pa_4_1_1;
	}
	
	@Length(min=0, max=64, message="是否有可能并发术中脑脊液漏评估及安全处置预案长度不能超过 64 个字符")
	public String getPa_4_1_2() {
		return pa_4_1_2;
	}

	public void setPa_4_1_2(String pa_4_1_2) {
		this.pa_4_1_2 = pa_4_1_2;
	}
	
	@Length(min=0, max=64, message="是否有可能并发额叶挫伤评估及安全处置预案长度不能超过 64 个字符")
	public String getPa_4_1_3() {
		return pa_4_1_3;
	}

	public void setPa_4_1_3(String pa_4_1_3) {
		this.pa_4_1_3 = pa_4_1_3;
	}
	
	@Length(min=0, max=64, message="是否有可能并发视神经损伤评估及安全处置预案长度不能超过 64 个字符")
	public String getPa_4_1_4() {
		return pa_4_1_4;
	}

	public void setPa_4_1_4(String pa_4_1_4) {
		this.pa_4_1_4 = pa_4_1_4;
	}
	
	@Length(min=0, max=64, message="是否有可能并发颈内动脉损伤评估及安全处置预案长度不能超过 64 个字符")
	public String getPa_4_1_5() {
		return pa_4_1_5;
	}

	public void setPa_4_1_5(String pa_4_1_5) {
		this.pa_4_1_5 = pa_4_1_5;
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
	public String getCm_1_6_3_2() {
		return cm_1_6_3_2;
	}

	public void setCm_1_6_3_2(String cm_1_6_3_2) {
		this.cm_1_6_3_2 = cm_1_6_3_2;
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
	
	@Length(min=0, max=64, message="急性肾功能衰竭长度不能超过 64 个字符")
	public String getCm_2_3_15() {
		return cm_2_3_15;
	}

	public void setCm_2_3_15(String cm_2_3_15) {
		this.cm_2_3_15 = cm_2_3_15;
	}
	
	@Length(min=0, max=64, message="PA术后特指并发症长度不能超过 64 个字符")
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
	
	@Length(min=0, max=64, message="是否有手术后再手术长度不能超过 64 个字符")
	public String getPa_6_4_1() {
		return pa_6_4_1;
	}

	public void setPa_6_4_1(String pa_6_4_1) {
		this.pa_6_4_1 = pa_6_4_1;
	}
	
	@Length(min=0, max=64, message="手术后再手术名称长度不能超过 64 个字符")
	public String getPa_6_4_2() {
		return pa_6_4_2;
	}

	public void setPa_6_4_2(String pa_6_4_2) {
		this.pa_6_4_2 = pa_6_4_2;
	}
	
	@Length(min=0, max=64, message="再手术日期时间长度不能超过 64 个字符")
	public String getPa_6_4_3() {
		return pa_6_4_3;
	}

	public void setPa_6_4_3(String pa_6_4_3) {
		this.pa_6_4_3 = pa_6_4_3;
	}
	
	@Length(min=0, max=64, message="是否有病理报告记录单长度不能超过 64 个字符")
	public String getPa_7_1_1() {
		return pa_7_1_1;
	}

	public void setPa_7_1_1(String pa_7_1_1) {
		this.pa_7_1_1 = pa_7_1_1;
	}
	
	@Length(min=0, max=64, message="病理报告记录单中基本内容长度不能超过 64 个字符")
	public String getPa_7_1_2() {
		return pa_7_1_2;
	}

	public void setPa_7_1_2(String pa_7_1_2) {
		this.pa_7_1_2 = pa_7_1_2;
	}
	
	@Length(min=0, max=64, message="垂体腺瘤免疫组化情况长度不能超过 64 个字符")
	public String getPa_7_1_3() {
		return pa_7_1_3;
	}

	public void setPa_7_1_3(String pa_7_1_3) {
		this.pa_7_1_3 = pa_7_1_3;
	}
	
	@Length(min=0, max=64, message="垂体瘤Ki-67阳性细胞比例是否确定长度不能超过 64 个字符")
	public String getPa_7_2_1() {
		return pa_7_2_1;
	}

	public void setPa_7_2_1(String pa_7_2_1) {
		this.pa_7_2_1 = pa_7_2_1;
	}
	
	public Double getPa_7_2_2() {
		return pa_7_2_2;
	}

	public void setPa_7_2_2(Double pa_7_2_2) {
		this.pa_7_2_2 = pa_7_2_2;
	}
	
	public Double getPa_8_1_1() {
		return pa_8_1_1;
	}

	public void setPa_8_1_1(Double pa_8_1_1) {
		this.pa_8_1_1 = pa_8_1_1;
	}
	
	public Double getPa_8_1_2() {
		return pa_8_1_2;
	}

	public void setPa_8_1_2(Double pa_8_1_2) {
		this.pa_8_1_2 = pa_8_1_2;
	}
	
	public Double getPa_8_1_3() {
		return pa_8_1_3;
	}

	public void setPa_8_1_3(Double pa_8_1_3) {
		this.pa_8_1_3 = pa_8_1_3;
	}
	
	public Double getPa_8_1_4() {
		return pa_8_1_4;
	}

	public void setPa_8_1_4(Double pa_8_1_4) {
		this.pa_8_1_4 = pa_8_1_4;
	}
	
	public Double getPa_8_2_1() {
		return pa_8_2_1;
	}

	public void setPa_8_2_1(Double pa_8_2_1) {
		this.pa_8_2_1 = pa_8_2_1;
	}
	
	public Double getPa_8_2_2() {
		return pa_8_2_2;
	}

	public void setPa_8_2_2(Double pa_8_2_2) {
		this.pa_8_2_2 = pa_8_2_2;
	}
	
	public Double getPa_8_2_3() {
		return pa_8_2_3;
	}

	public void setPa_8_2_3(Double pa_8_2_3) {
		this.pa_8_2_3 = pa_8_2_3;
	}
	
	@Length(min=0, max=64, message="是否进行术后视力视野的复查及评估长度不能超过 64 个字符")
	public String getPa_9_1_1() {
		return pa_9_1_1;
	}

	public void setPa_9_1_1(String pa_9_1_1) {
		this.pa_9_1_1 = pa_9_1_1;
	}
	
	@Length(min=0, max=64, message="复查及评估结果是否确定长度不能超过 64 个字符")
	public String getPa_9_1_2() {
		return pa_9_1_2;
	}

	public void setPa_9_1_2(String pa_9_1_2) {
		this.pa_9_1_2 = pa_9_1_2;
	}
	
	public Double getPa_9_1_2_1() {
		return pa_9_1_2_1;
	}

	public void setPa_9_1_2_1(Double pa_9_1_2_1) {
		this.pa_9_1_2_1 = pa_9_1_2_1;
	}
	
	public Double getPa_9_1_2_2() {
		return pa_9_1_2_2;
	}

	public void setPa_9_1_2_2(Double pa_9_1_2_2) {
		this.pa_9_1_2_2 = pa_9_1_2_2;
	}
	
	@Length(min=0, max=64, message="术后2-3天,是否复查内分泌激素长度不能超过 64 个字符")
	public String getPa_9_2_1() {
		return pa_9_2_1;
	}

	public void setPa_9_2_1(String pa_9_2_1) {
		this.pa_9_2_1 = pa_9_2_1;
	}
	
	public Double getPa_9_2_1_1() {
		return pa_9_2_1_1;
	}

	public void setPa_9_2_1_1(Double pa_9_2_1_1) {
		this.pa_9_2_1_1 = pa_9_2_1_1;
	}
	
	public Double getPa_9_2_1_2() {
		return pa_9_2_1_2;
	}

	public void setPa_9_2_1_2(Double pa_9_2_1_2) {
		this.pa_9_2_1_2 = pa_9_2_1_2;
	}
	
	public Double getPa_9_2_1_3() {
		return pa_9_2_1_3;
	}

	public void setPa_9_2_1_3(Double pa_9_2_1_3) {
		this.pa_9_2_1_3 = pa_9_2_1_3;
	}
	
	public Double getPa_9_2_1_4() {
		return pa_9_2_1_4;
	}

	public void setPa_9_2_1_4(Double pa_9_2_1_4) {
		this.pa_9_2_1_4 = pa_9_2_1_4;
	}
	
	public Double getPa_9_2_1_5() {
		return pa_9_2_1_5;
	}

	public void setPa_9_2_1_5(Double pa_9_2_1_5) {
		this.pa_9_2_1_5 = pa_9_2_1_5;
	}
	
	public Double getPa_9_2_1_6() {
		return pa_9_2_1_6;
	}

	public void setPa_9_2_1_6(Double pa_9_2_1_6) {
		this.pa_9_2_1_6 = pa_9_2_1_6;
	}
	
	public Double getPa_9_2_1_7() {
		return pa_9_2_1_7;
	}

	public void setPa_9_2_1_7(Double pa_9_2_1_7) {
		this.pa_9_2_1_7 = pa_9_2_1_7;
	}
	
	public Double getPa_9_2_1_8() {
		return pa_9_2_1_8;
	}

	public void setPa_9_2_1_8(Double pa_9_2_1_8) {
		this.pa_9_2_1_8 = pa_9_2_1_8;
	}
	
	public Double getPa_9_2_1_9() {
		return pa_9_2_1_9;
	}

	public void setPa_9_2_1_9(Double pa_9_2_1_9) {
		this.pa_9_2_1_9 = pa_9_2_1_9;
	}
	
	public Double getPa_9_2_1_10() {
		return pa_9_2_1_10;
	}

	public void setPa_9_2_1_10(Double pa_9_2_1_10) {
		this.pa_9_2_1_10 = pa_9_2_1_10;
	}
	
	public Double getPa_9_2_1_11() {
		return pa_9_2_1_11;
	}

	public void setPa_9_2_1_11(Double pa_9_2_1_11) {
		this.pa_9_2_1_11 = pa_9_2_1_11;
	}
	
	public Double getPa_9_2_1_12() {
		return pa_9_2_1_12;
	}

	public void setPa_9_2_1_12(Double pa_9_2_1_12) {
		this.pa_9_2_1_12 = pa_9_2_1_12;
	}
	
	public Double getPa_9_2_1_13() {
		return pa_9_2_1_13;
	}

	public void setPa_9_2_1_13(Double pa_9_2_1_13) {
		this.pa_9_2_1_13 = pa_9_2_1_13;
	}
	
	@Length(min=0, max=64, message="是否进行电解质水平监测长度不能超过 64 个字符")
	public String getPa_9_3_1() {
		return pa_9_3_1;
	}

	public void setPa_9_3_1(String pa_9_3_1) {
		this.pa_9_3_1 = pa_9_3_1;
	}
	
	@Length(min=0, max=64, message="电解质水平监测的时段长度不能超过 64 个字符")
	public String getPa_9_3_3() {
		return pa_9_3_3;
	}

	public void setPa_9_3_3(String pa_9_3_3) {
		this.pa_9_3_3 = pa_9_3_3;
	}
	
	@Length(min=0, max=64, message="电解质水平监测的时段长度不能超过 64 个字符")
	public String getPa_9_3_2() {
		return pa_9_3_2;
	}

	public void setPa_9_3_2(String pa_9_3_2) {
		this.pa_9_3_2 = pa_9_3_2;
	}
	
	public Double getPa_9_3_2_1() {
		return pa_9_3_2_1;
	}

	public void setPa_9_3_2_1(Double pa_9_3_2_1) {
		this.pa_9_3_2_1 = pa_9_3_2_1;
	}
	
	public Double getPa_9_3_2_2() {
		return pa_9_3_2_2;
	}

	public void setPa_9_3_2_2(Double pa_9_3_2_2) {
		this.pa_9_3_2_2 = pa_9_3_2_2;
	}
	
	public Double getPa_9_3_2_3() {
		return pa_9_3_2_3;
	}

	public void setPa_9_3_2_3(Double pa_9_3_2_3) {
		this.pa_9_3_2_3 = pa_9_3_2_3;
	}
	
	@Length(min=0, max=64, message="是否进行术后辅助放疗长度不能超过 64 个字符")
	public String getPa_10_1_1() {
		return pa_10_1_1;
	}

	public void setPa_10_1_1(String pa_10_1_1) {
		this.pa_10_1_1 = pa_10_1_1;
	}
	
	@Length(min=0, max=64, message="术后辅助放疗指征的选择长度不能超过 64 个字符")
	public String getPa_10_1_2() {
		return pa_10_1_2;
	}

	public void setPa_10_1_2(String pa_10_1_2) {
		this.pa_10_1_2 = pa_10_1_2;
	}
	
	@Length(min=0, max=64, message="术后辅助放疗模式的选择长度不能超过 64 个字符")
	public String getPa_10_1_3() {
		return pa_10_1_3;
	}

	public void setPa_10_1_3(String pa_10_1_3) {
		this.pa_10_1_3 = pa_10_1_3;
	}
	
	@Length(min=0, max=64, message="是否进行术后辅助药物治疗长度不能超过 64 个字符")
	public String getPa_10_2_1() {
		return pa_10_2_1;
	}

	public void setPa_10_2_1(String pa_10_2_1) {
		this.pa_10_2_1 = pa_10_2_1;
	}
	
	@Length(min=0, max=64, message="药物治疗符合指征长度不能超过 64 个字符")
	public String getPa_10_2_2() {
		return pa_10_2_2;
	}

	public void setPa_10_2_2(String pa_10_2_2) {
		this.pa_10_2_2 = pa_10_2_2;
	}
	
	@Length(min=0, max=64, message="是否入院时进行重点护理评估且有记录长度不能超过 64 个字符")
	public String getPa_11_1_0() {
		return pa_11_1_0;
	}

	public void setPa_11_1_0(String pa_11_1_0) {
		this.pa_11_1_0 = pa_11_1_0;
	}
	
	@Length(min=0, max=64, message="行走评估结果长度不能超过 64 个字符")
	public String getPa_11_1_1() {
		return pa_11_1_1;
	}

	public void setPa_11_1_1(String pa_11_1_1) {
		this.pa_11_1_1 = pa_11_1_1;
	}
	
	@Length(min=0, max=64, message="呼吸评估结果长度不能超过 64 个字符")
	public String getPa_11_1_2() {
		return pa_11_1_2;
	}

	public void setPa_11_1_2(String pa_11_1_2) {
		this.pa_11_1_2 = pa_11_1_2;
	}
	
	@Length(min=0, max=64, message="评估视力视野障碍对患者的影响长度不能超过 64 个字符")
	public String getPa_11_1_3() {
		return pa_11_1_3;
	}

	public void setPa_11_1_3(String pa_11_1_3) {
		this.pa_11_1_3 = pa_11_1_3;
	}
	
	@Length(min=0, max=64, message="入院后第一个24小时液体出入量长度不能超过 64 个字符")
	public String getPa_11_1_4() {
		return pa_11_1_4;
	}

	public void setPa_11_1_4(String pa_11_1_4) {
		this.pa_11_1_4 = pa_11_1_4;
	}
	
	@Length(min=0, max=64, message="其中，每小时液体出入量长度不能超过 64 个字符")
	public String getPa_11_1_5() {
		return pa_11_1_5;
	}

	public void setPa_11_1_5(String pa_11_1_5) {
		this.pa_11_1_5 = pa_11_1_5;
	}
	
	@Length(min=0, max=64, message="实施卒中健康教育记录内容长度不能超过 64 个字符")
	public String getPa_11_1_6() {
		return pa_11_1_6;
	}

	public void setPa_11_1_6(String pa_11_1_6) {
		this.pa_11_1_6 = pa_11_1_6;
	}
	
	@Length(min=0, max=64, message="经蝶手术患者强化鼻腔护理,减少术后脑脊液鼻漏并发症的护理措施长度不能超过 64 个字符")
	public String getPa_11_1_7() {
		return pa_11_1_7;
	}

	public void setPa_11_1_7(String pa_11_1_7) {
		this.pa_11_1_7 = pa_11_1_7;
	}
	
	@Length(min=0, max=64, message="尿量异常患者的长期护理长度不能超过 64 个字符")
	public String getPa_11_1_9() {
		return pa_11_1_9;
	}

	public void setPa_11_1_9(String pa_11_1_9) {
		this.pa_11_1_9 = pa_11_1_9;
	}
	
	@Length(min=0, max=64, message="饮食指导长度不能超过 64 个字符")
	public String getPa_11_1_10() {
		return pa_11_1_10;
	}

	public void setPa_11_1_10(String pa_11_1_10) {
		this.pa_11_1_10 = pa_11_1_10;
	}
	
	@Length(min=0, max=64, message="压疮评估分值是否确定长度不能超过 64 个字符")
	public String getPa_11_1_11_3() {
		return pa_11_1_11_3;
	}

	public void setPa_11_1_11_3(String pa_11_1_11_3) {
		this.pa_11_1_11_3 = pa_11_1_11_3;
	}
	
	public Double getPa_11_1_11() {
		return pa_11_1_11;
	}

	public void setPa_11_1_11(Double pa_11_1_11) {
		this.pa_11_1_11 = pa_11_1_11;
	}
	
	@Length(min=0, max=64, message="压疮评估结果选择长度不能超过 64 个字符")
	public String getPa_11_1_11_1() {
		return pa_11_1_11_1;
	}

	public void setPa_11_1_11_1(String pa_11_1_11_1) {
		this.pa_11_1_11_1 = pa_11_1_11_1;
	}
	
	@Length(min=0, max=64, message="是否进行预防压疮告知长度不能超过 64 个字符")
	public String getPa_11_1_11_2() {
		return pa_11_1_11_2;
	}

	public void setPa_11_1_11_2(String pa_11_1_11_2) {
		this.pa_11_1_11_2 = pa_11_1_11_2;
	}
	
	@Length(min=0, max=64, message="是否实施手术前健康教育且有记录长度不能超过 64 个字符")
	public String getPa_11_2_1() {
		return pa_11_2_1;
	}

	public void setPa_11_2_1(String pa_11_2_1) {
		this.pa_11_2_1 = pa_11_2_1;
	}
	
	@Length(min=0, max=64, message="实施卒中健康教育记录内容长度不能超过 64 个字符")
	public String getPa_11_1_3_1() {
		return pa_11_1_3_1;
	}

	public void setPa_11_1_3_1(String pa_11_1_3_1) {
		this.pa_11_1_3_1 = pa_11_1_3_1;
	}
	
	@Length(min=0, max=64, message="其他实施卒中健康教育记录内容长度不能超过 64 个字符")
	public String getPa_11_1_2_1() {
		return pa_11_1_2_1;
	}

	public void setPa_11_1_2_1(String pa_11_1_2_1) {
		this.pa_11_1_2_1 = pa_11_1_2_1;
	}
	
	@Length(min=0, max=64, message="是否实施术后健康教育且有记录长度不能超过 64 个字符")
	public String getPa_11_1_3_4() {
		return pa_11_1_3_4;
	}

	public void setPa_11_1_3_4(String pa_11_1_3_4) {
		this.pa_11_1_3_4 = pa_11_1_3_4;
	}
	
	@Length(min=0, max=64, message="吸烟史长度不能超过 64 个字符")
	public String getPa_11_1_3_2() {
		return pa_11_1_3_2;
	}

	public void setPa_11_1_3_2(String pa_11_1_3_2) {
		this.pa_11_1_3_2 = pa_11_1_3_2;
	}
	
	@Length(min=0, max=64, message="吸烟程度评估长度不能超过 64 个字符")
	public String getPa_11_1_3_3() {
		return pa_11_1_3_3;
	}

	public void setPa_11_1_3_3(String pa_11_1_3_3) {
		this.pa_11_1_3_3 = pa_11_1_3_3;
	}
	
	@Length(min=0, max=64, message="接受戒烟的建议或者戒烟治疗长度不能超过 64 个字符")
	public String getPa_11_1_3_5() {
		return pa_11_1_3_5;
	}

	public void setPa_11_1_3_5(String pa_11_1_3_5) {
		this.pa_11_1_3_5 = pa_11_1_3_5;
	}
	
	@Length(min=0, max=64, message="交与患者“出院小结”的副本，并告知患者出院时风险因素长度不能超过 64 个字符")
	public String getPa_11_2_2_1() {
		return pa_11_2_2_1;
	}

	public void setPa_11_2_2_1(String pa_11_2_2_1) {
		this.pa_11_2_2_1 = pa_11_2_2_1;
	}
	
	@Length(min=0, max=64, message="出院带药长度不能超过 64 个字符")
	public String getPa_11_2_2_2() {
		return pa_11_2_2_2;
	}

	public void setPa_11_2_2_2(String pa_11_2_2_2) {
		this.pa_11_2_2_2 = pa_11_2_2_2;
	}
	
	@Length(min=0, max=64, message="告知发生紧急情况时求援救治途径长度不能超过 64 个字符")
	public String getPa_11_2_2_3() {
		return pa_11_2_2_3;
	}

	public void setPa_11_2_2_3(String pa_11_2_2_3) {
		this.pa_11_2_2_3 = pa_11_2_2_3;
	}
	
	@Length(min=0, max=64, message="出院时教育与随访长度不能超过 64 个字符")
	public String getPa_11_2_2_4() {
		return pa_11_2_2_4;
	}

	public void setPa_11_2_2_4(String pa_11_2_2_4) {
		this.pa_11_2_2_4 = pa_11_2_2_4;
	}
	
	@Length(min=0, max=64, message="告知何为风险因素与紧急情况长度不能超过 64 个字符")
	public String getPa_11_2_2_5() {
		return pa_11_2_2_5;
	}

	public void setPa_11_2_2_5(String pa_11_2_2_5) {
		this.pa_11_2_2_5 = pa_11_2_2_5;
	}
	
	@Length(min=0, max=64, message="符合治愈标准的选项长度不能超过 64 个字符")
	public String getPa_12_1_1() {
		return pa_12_1_1;
	}

	public void setPa_12_1_1(String pa_12_1_1) {
		this.pa_12_1_1 = pa_12_1_1;
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