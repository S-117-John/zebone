/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.pd.entity;

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
 * PD帕金森病Entity
 * @author 卡卡西
 * @version 2021-01-16
 */
@Table(name="quality_pd", alias="a", columns={
		@Column(name="cm_0_1_1_1", attrName="cm_0_1_1_1", label="质控医师"),
		@Column(name="cm_0_1_1_2", attrName="cm_0_1_1_2", label="质控护士"),
		@Column(name="cm_0_1_1_3", attrName="cm_0_1_1_3", label="主治医师"),
		@Column(name="cm_0_1_1_4", attrName="cm_0_1_1_4", label="责任护士"),
		@Column(name="cm_0_1_1_5", attrName="cm_0_1_1_5", label="上报科室"),
		@Column(name="case_id", attrName="caseId", label="患者病案号"),
		@Column(name="cm_0_1_3_2", attrName="cm_0_1_3_2", label="主要诊断ICD-10六位临床扩展编码与名称"),
		@Column(name="cm_0_1_4_1", attrName="cm_0_1_4_1", label="主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称"),
		@Column(name="pd_0_1_4_1", attrName="pd_0_1_4_1", label="其他主要手术操作ICD-9-CM-3四位亚目编码与名称"),
		@Column(name="cm_0_1_4_2", attrName="cm_0_1_4_2", label="主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称"),
		@Column(name="pd_0_1_4_2", attrName="pd_0_1_4_2", label="其他主要手术操作ICD-9-CM-3六位临床扩展编码与名称"),
		@Column(name="cm_0_1_5", attrName="cm_0_1_5", label="是否出院后31天内重复住院"),
		@Column(name="cm_0_2_1_1", attrName="cm_0_2_1_1", label="出生日期"),
		@Column(name="cm_0_2_1_2", attrName="cm_0_2_1_2", label="患者性别"),
		@Column(name="cm_0_2_1_3", attrName="cm_0_2_1_3", label="患者体重", comment="患者体重（kg）"),
		@Column(name="cm_0_2_1_5", attrName="cm_0_2_1_5", label="患者身高", comment="患者身高（cm）"),
		@Column(name="cm_0_2_2_1", attrName="cm_0_2_2_1", label="发病日期时间是否无法确定或无记录"),
		@Column(name="cm_0_2_2_2", attrName="cm_0_2_2_2", label="发病日期时间"),
		@Column(name="cm_0_2_4_1", attrName="cm_0_2_4_1", label="入院日期时间"),
		@Column(name="cm_0_2_4_2", attrName="cm_0_2_4_2", label="出院日期时间"),
		@Column(includeEntity=DataEntity.class),
		@Column(name="cm_0_2_6_1", attrName="cm_0_2_6_1", label="手术开始", comment="手术开始（切皮）日期时间"),
		@Column(name="cm_0_2_6_2", attrName="cm_0_2_6_2", label="手术结束", comment="手术结束（缝皮结束）日期时间"),
		@Column(name="cm_0_3_1", attrName="cm_0_3_1", label="费用支付方式"),
		@Column(name="cm_0_3_2", attrName="cm_0_3_2", label="收入住院途径"),
		@Column(name="cm_0_3_3", attrName="cm_0_3_3", label="到院交通工具"),
		@Column(name="pd_1_1_1", attrName="pd_1_1_1", label="绝对排除标准"),
		@Column(name="pd_1_2_1", attrName="pd_1_2_1", label="是否在发病 5 年内出现快速进展的步态障碍，且需要规律使用轮椅"),
		@Column(name="pd_1_2_2", attrName="pd_1_2_2", label="是否发病 5 年或 5 年以上，"),
		@Column(name="pd_1_2_3", attrName="pd_1_2_3", label="是否早期出现的球部功能障碍"),
		@Column(name="pd_1_2_4", attrName="pd_1_2_4", label="是否有吸气性呼吸功能障碍", comment="是否有吸气性呼吸功能障碍：出现白天或夜间吸气性喘鸣或者频繁的吸气性叹息"),
		@Column(name="pd_1_2_5", attrName="pd_1_2_5", label="是否在发病 5 年内出现严重的自主神经功能障碍"),
		@Column(name="pd_1_2_5_1", attrName="pd_1_2_5_1", label="出现严重的自主神经功能障碍具体表现为"),
		@Column(name="pd_1_2_6", attrName="pd_1_2_6", label="是否在发病 3 年内由于平衡损害导致的反复", comment="是否在发病 3 年内由于平衡损害导致的反复（&gt;1 次 / 年）摔倒"),
		@Column(name="pd_1_2_7", attrName="pd_1_2_7", label="是否在发病 10 年内出现不成比例地颈部前倾", comment="是否在发病 10 年内出现不成比例地颈部前倾（肌张力障碍）或手足挛缩"),
		@Column(name="pd_1_2_8", attrName="pd_1_2_8", label="是否是病程到了 5 年也不出现任何一种常见的非运动症状"),
		@Column(name="pd_1_2_9", attrName="pd_1_2_9", label="是否有其他原因不能解释的锥体束征，"),
		@Column(name="pd_1_2_10", attrName="pd_1_2_10", label="是否是双侧对称性的帕金森综合征。"),
		@Column(name="pd_1_3_1", attrName="pd_1_3_1", label="是否对多巴胺药物治疗具有明确且显著的有效应答"),
		@Column(name="pd_1_3_1_1", attrName="pd_1_3_1_1", label="初始治疗显著应答表现为"),
		@Column(name="pd_1_3_2", attrName="pd_1_3_2", label="是否出现左旋多巴诱导的异动症"),
		@Column(name="pd_1_3_3", attrName="pd_1_3_3", label="临床体格检查记录的单个肢体静止性震颤", comment="临床体格检查记录的单个肢体静止性震颤（既往或本次检查）"),
		@Column(name="pd_1_3_4", attrName="pd_1_3_4", label="存在嗅觉丧失或心脏 MIBG 闪烁显像法显示存在心脏去交感神经支配"),
		@Column(name="pd_1_4_1", attrName="pd_1_4_1", label="帕金森病标准选择"),
		@Column(name="pd_1_4_2", attrName="pd_1_4_2", label="患者确诊帕金森病", comment="患者确诊帕金森病（PD）的主要依据"),
		@Column(name="pd_1_4_3", attrName="pd_1_4_3", label="患者诊断为可能帕金森病", comment="患者诊断为可能帕金森病（PD）的主要依据"),
		@Column(name="pd_2_1_1", attrName="pd_2_1_1", label="是否实施头部MRI检查"),
		@Column(name="pd_2_1_2", attrName="pd_2_1_2", label="完成MRI序列"),
		@Column(name="pd_2_1_3", attrName="pd_2_1_3", label="是否实施头部CT检查"),
		@Column(name="pd_2_1_4", attrName="pd_2_1_4", label="报告日期时间"),
		@Column(name="pd_2_2_1", attrName="pd_2_2_1", label="是否实施黑质超声检查"),
		@Column(name="pd_2_2_2", attrName="pd_2_2_2", label="报告日期时间"),
		@Column(name="pd_2_3_1", attrName="pd_2_3_1", label="是否实施震颤分析检查"),
		@Column(name="pd_2_3_2", attrName="pd_2_3_2", label="报告日期时间"),
		@Column(name="pd_2_4_1", attrName="pd_2_4_1", label="是否实施肛门括约肌肌电图检查"),
		@Column(name="pd_2_4_2", attrName="pd_2_4_2", label="报告日期时间"),
		@Column(name="pd_2_5_1", attrName="pd_2_5_1", label="是否实施头PET检查"),
		@Column(name="pd_2_5_2", attrName="pd_2_5_2", label="完成头PET项目"),
		@Column(name="pd_2_5_2_1", attrName="pd_2_5_2_1", label="其他头PET项目"),
		@Column(name="pd_2_5_3", attrName="pd_2_5_3", label="报告日期时间"),
		@Column(name="pd_3_1_1", attrName="pd_3_1_1", label="是否进行多巴胺能反应性评测"),
		@Column(name="pd_3_1_2", attrName="pd_3_1_2", label="评测适应症的选择"),
		@Column(name="pd_3_2_1", attrName="pd_3_2_1", label="是否有被选择评测药物的禁忌症"),
		@Column(name="pd_3_2_2", attrName="pd_3_2_2", label="评测药物的禁忌症"),
		@Column(name="pd_3_2_2_1", attrName="pd_3_2_2_1", label="多巴丝肼片", comment="多巴丝肼片（美多芭）禁忌症的选择"),
		@Column(name="pd_3_2_2_2", attrName="pd_3_2_2_2", label="其他多巴丝肼片", comment="其他多巴丝肼片（美多芭）禁忌症"),
		@Column(name="pd_3_2_2_3", attrName="pd_3_2_2_3", label="卡左双多巴", comment="卡左双多巴（息宁）禁忌症的选择"),
		@Column(name="pd_3_2_2_4", attrName="pd_3_2_2_4", label="其他卡左双多巴", comment="其他卡左双多巴（息宁）禁忌症"),
		@Column(name="pd_3_2_3", attrName="pd_3_2_3", label="盐酸苯海索", comment="盐酸苯海索（安坦）禁忌症的选择"),
		@Column(name="pd_3_2_3_1", attrName="pd_3_2_3_1", label="其他盐酸苯海索", comment="其他盐酸苯海索（安坦）禁忌症"),
		@Column(name="pd_3_2_4", attrName="pd_3_2_4", label="盐酸阿罗洛尔", comment="盐酸阿罗洛尔（阿尔马尔）禁忌症的选择"),
		@Column(name="pd_3_2_4_1", attrName="pd_3_2_4_1", label="其他盐酸阿罗洛尔", comment="其他盐酸阿罗洛尔（阿尔马尔）禁忌症"),
		@Column(name="pd_3_2_5", attrName="pd_3_2_5", label="盐酸普拉克索", comment="盐酸普拉克索（森福罗）禁忌症的选择"),
		@Column(name="pd_3_2_5_1", attrName="pd_3_2_5_1", label="其他盐酸普拉克索", comment="其他盐酸普拉克索（森福罗）禁忌症"),
		@Column(name="pd_3_2_6", attrName="pd_3_2_6", label="盐酸金刚烷胺禁忌症的选择"),
		@Column(name="pd_3_2_6_1", attrName="pd_3_2_6_1", label="其他盐酸金刚烷胺禁忌症"),
		@Column(name="pd_3_2_7", attrName="pd_3_2_7", label="恩他卡朋禁忌症的选择"),
		@Column(name="pd_3_2_7_1", attrName="pd_3_2_7_1", label="其他恩他卡朋禁忌症"),
		@Column(name="pd_3_2_8", attrName="pd_3_2_8", label="雷沙吉兰禁忌症的选择"),
		@Column(name="pd_3_2_8_1", attrName="pd_3_2_8_1", label="其他雷沙吉兰禁忌症"),
		@Column(name="pd_3_2_9", attrName="pd_3_2_9", label="盐酸罗匹尼罗禁忌症的选择"),
		@Column(name="pd_3_2_9_1", attrName="pd_3_2_9_1", label="其他盐酸罗匹尼罗禁忌症"),
		@Column(name="pd_3_2_10", attrName="pd_3_2_10", label="司来吉兰禁忌症的选择"),
		@Column(name="pd_3_2_10_1", attrName="pd_3_2_10_1", label="其他司来吉兰禁忌症"),
		@Column(name="pd_3_3_3", attrName="pd_3_3_3", label="运动检查 "),
		@Column(name="pd_3_3_1_1", attrName="pd_3_3_1_1", label="基线值", comment="基线值（关期)"),
		@Column(name="pd_3_3_1_2", attrName="pd_3_3_1_2", label="最佳改善值", comment="最佳改善值（开期）"),
		@Column(name="pd_3_4_1", attrName="pd_3_4_1", label="疗效反应结论的选择"),
		@Column(name="pd_3_5_1", attrName="pd_3_5_1", label="不良反应风险的选择"),
		@Column(name="pd_3_6_1", attrName="pd_3_6_1", label="完成日期时间"),
		@Column(name="pd_4_1_1", attrName="pd_4_1_1", label="是否在入院24小时进行帕金森病Hoehn-Yahr分期评估"),
		@Column(name="pd_4_1_2", attrName="pd_4_1_2", label="临床分期依据一", comment="临床分期依据一: 主要有那些临床表现及体征"),
		@Column(name="pd_4_1_3", attrName="pd_4_1_3", label="H-Y分期结论"),
		@Column(name="pd_4_1_4", attrName="pd_4_1_4", label="完成日期时间"),
		@Column(name="pd_5_1_1", attrName="pd_5_1_1", label="是否进行神经功能缺损评估"),
		@Column(name="pd_5_1_2", attrName="pd_5_1_2", label="第一部分", comment="第一部分：日常生活非运动症状体验"),
		@Column(name="pd_5_1_3", attrName="pd_5_1_3", label="第二部分", comment="第二部分：日常生活运动症状体验"),
		@Column(name="pd_5_1_4", attrName="pd_5_1_4", label="第三部分", comment="第三部分：运动功能检查"),
		@Column(name="pd_5_1_5", attrName="pd_5_1_5", label="第四部分", comment="第四部分：运动并发症"),
		@Column(name="pd_5_1_6", attrName="pd_5_1_6", label="日常分值合计"),
		@Column(name="pd_5_1_7", attrName="pd_5_1_7", label="完成日期时间"),
		@Column(name="pd_6_1_1", attrName="pd_6_1_1", label="运动并发症类型"),
		@Column(name="pd_6_1_2", attrName="pd_6_1_2", label="剂末现象的筛查"),
		@Column(name="pd_6_1_2_1", attrName="pd_6_1_2_1", label="其他剂末现象"),
		@Column(name="pd_6_1_3", attrName="pd_6_1_3", label="剂末现象的处理"),
		@Column(name="pd_6_1_3_1", attrName="pd_6_1_3_1", label="其他剂末现象处理"),
		@Column(name="pd_6_1_4", attrName="pd_6_1_4", label="异动症类型"),
		@Column(name="pd_6_1_4_1", attrName="pd_6_1_4_1", label="剂峰异动症处理"),
		@Column(name="pd_6_1_4_1_1", attrName="pd_6_1_4_1_1", label="其他剂峰异动处理"),
		@Column(name="pd_6_1_4_2", attrName="pd_6_1_4_2", label="剂末异动症处理"),
		@Column(name="pd_6_1_4_2_1", attrName="pd_6_1_4_2_1", label="其他剂末异动处理"),
		@Column(name="pd_6_1_4_3", attrName="pd_6_1_4_3", label="双相异动症处理"),
		@Column(name="pd_6_1_4_3_1", attrName="pd_6_1_4_3_1", label="其他双相异动处理"),
		@Column(name="pd_6_1_5", attrName="pd_6_1_5", label="筛查完成日期时间"),
		@Column(name="pd_6_2_1", attrName="pd_6_2_1", label="是否实施筛查认知功能障碍评估"),
		@Column(name="pd_6_2_2", attrName="pd_6_2_2", label="进行认知功能筛查类型的选择"),
		@Column(name="pd_6_2_3_1", attrName="pd_6_2_3_1", label="定向力筛查结果"),
		@Column(name="pd_6_2_3_2", attrName="pd_6_2_3_2", label="记忆力筛查结果"),
		@Column(name="pd_6_2_3_3", attrName="pd_6_2_3_3", label="注意力和计算力筛查结果"),
		@Column(name="pd_6_2_3_4", attrName="pd_6_2_3_4", label="回忆能力筛查结果"),
		@Column(name="pd_6_2_3_5", attrName="pd_6_2_3_5", label="语言能力筛查结果"),
		@Column(name="pd_6_2_3", attrName="pd_6_2_3", label="入院1周完成筛查认知功能障碍", comment="入院1周完成筛查认知功能障碍（MMSE）评估分值"),
		@Column(name="pd_6_2_4", attrName="pd_6_2_4", label="痴呆严重程度分级"),
		@Column(name="pd_6_2_5", attrName="pd_6_2_5", label="认知功能障碍类型"),
		@Column(name="pd_6_2_6", attrName="pd_6_2_6", label="完成日期时间"),
		@Column(name="pd_6_2_2_1", attrName="pd_6_2_2_1", label="其他进行认知功能筛查类型"),
		@Column(name="pd_6_2_7", attrName="pd_6_2_7", label="Moca量表评分值"),
		@Column(name="pd_6_2_8", attrName="pd_6_2_8", label="痴呆严重程度分层"),
		@Column(name="pd_6_2_9", attrName="pd_6_2_9", label="是否实施认知功能障碍治疗"),
		@Column(name="pd_6_2_10", attrName="pd_6_2_10", label="认知功能障碍治疗措施的选择"),
		@Column(name="pd_6_2_10_1", attrName="pd_6_2_10_1", label="其他认知功能障碍治疗措施"),
		@Column(name="pd_6_2_11", attrName="pd_6_2_11", label="治疗医嘱执行日期时间"),
		@Column(name="pd_6_3_1", attrName="pd_6_3_1", label="是否实施心理状况的筛查"),
		@Column(name="pd_6_3_2", attrName="pd_6_3_2", label="进行心理状况筛查的项目"),
		@Column(name="pd_6_3_3", attrName="pd_6_3_3", label="完成日期时间"),
		@Column(name="pd_6_4_1", attrName="pd_6_4_1", label="是否实施睡眠状况的筛查"),
		@Column(name="pd_6_4_2", attrName="pd_6_4_2", label="进行睡眠状况筛查的项目"),
		@Column(name="pd_6_4_2_1", attrName="pd_6_4_2_1", label="其他睡眠状况筛查的项目"),
		@Column(name="pd_6_4_3", attrName="pd_6_4_3", label="完成日期时间"),
		@Column(name="pd_6_5_1", attrName="pd_6_5_1", label="入院查体时是否实施卧立位血压的检测"),
		@Column(name="pd_6_5_2_1", attrName="pd_6_5_2_1", label="卧位血压-收缩压", comment="卧位血压-收缩压(mmHg)"),
		@Column(name="cm_0_1_3_1", attrName="cm0131", label="主要诊断ICD-10四位亚目编码与名称"),
		@Column(name="pd_6_5_2_2", attrName="pd_6_5_2_2", label="卧位血压-舒张压", comment="卧位血压-舒张压(mmHg)"),
		@Column(name="pd_6_5_3_1", attrName="pd_6_5_3_1", label="立位即刻血压-收缩压", comment="立位即刻血压-收缩压(mmHg)"),
		@Column(name="pd_6_5_3_2", attrName="pd_6_5_3_2", label="立位即刻血压-舒张压", comment="立位即刻血压-舒张压(mmHg)"),
		@Column(name="pd_6_5_4_1", attrName="pd_6_5_4_1", label="立位1min血压-收缩压", comment="立位1min血压-收缩压(mmHg)"),
		@Column(name="pd_6_5_4_2", attrName="pd_6_5_4_2", label="立位1min血压-舒张压", comment="立位1min血压-舒张压(mmHg)"),
		@Column(name="pd_6_5_5_1", attrName="pd_6_5_5_1", label="立位3min血压-收缩压", comment="立位3min血压-收缩压(mmHg)"),
		@Column(name="pd_6_5_5_2", attrName="pd_6_5_5_2", label="立位3min血压-舒张压", comment="立位3min血压-舒张压(mmHg)"),
		@Column(name="pd_6_5_6_1", attrName="pd_6_5_6_1", label="立位大于3min血压-收缩压", comment="立位大于3min血压-收缩压(mmHg)"),
		@Column(name="pd_6_5_6_2", attrName="pd_6_5_6_2", label="立位大于3min血压-舒张压", comment="立位大于3min血压-舒张压(mmHg)"),
		@Column(name="pd_6_5_7", attrName="pd_6_5_7", label="完成日期时间"),
		@Column(name="pd_6_5_8", attrName="pd_6_5_8", label="告知患者,体位性低血压干预措施有记录"),
		@Column(name="pd_6_5_8_1", attrName="pd_6_5_8_1", label="其他体位性低血压干预措施记录"),
		@Column(name="pd_7_1_1", attrName="pd_7_1_1", label="是否为合并运动并发症的患者"),
		@Column(name="pd_7_1_2_1", attrName="pd_7_1_2_1", label="是否为原发性PD"),
		@Column(name="pd_7_1_2_2", attrName="pd_7_1_2_2", label="优化药物治疗后，仍存在下列情况之一者"),
		@Column(name="pd_7_1_2_3", attrName="pd_7_1_2_3", label="急性左旋多巴药物反应良好，存在下列情况之一者"),
		@Column(name="pd_7_1_2_4", attrName="pd_7_1_2_4", label="病程"),
		@Column(name="pd_7_1_2_5", attrName="pd_7_1_2_5", label="年龄", comment="年龄：符合一条"),
		@Column(name="pd_7_1_3", attrName="pd_7_1_3", label="手术禁忌证的选择"),
		@Column(name="pd_7_1_4", attrName="pd_7_1_4", label="完成日期时间"),
		@Column(name="pd_7_2_1", attrName="pd_7_2_1", label="是否进行脑深部电刺激手术", comment="是否进行脑深部电刺激手术（DBS）"),
		@Column(name="pd_7_2_2", attrName="pd_7_2_2", label="实施脑深部电刺激手术", comment="实施脑深部电刺激手术（DBS）的ICD-9-CM-3四位亚目编码及名称的选择"),
		@Column(name="pd_7_2_2_1", attrName="pd_7_2_2_1", label="实施脑深部电刺激其他手术"),
		@Column(name="pd_7_2_3", attrName="pd_7_2_3", label="DBS手术完成日期"),
		@Column(name="cm_0_1_4_1_1", attrName="cm01411", label="其他ICD-9-CM-3四位亚目编码与名称"),
		@Column(name="pd_7_3_3", attrName="pd_7_3_3", label="神经系统手术并发症"),
		@Column(name="pd_7_3_3_1", attrName="pd_7_3_3_1", label="其他术后并发症"),
		@Column(name="pd_8_1_1", attrName="pd_8_1_1", label="是否有冻结步态"),
		@Column(name="pd_8_1_2", attrName="pd_8_1_2", label="是否有冻结步态量表", comment="是否有冻结步态量表（FOG-Q）评分"),
		@Column(name="pd_8_1_3_1", attrName="pd_8_1_3_1", label="", comment="(FOG-Q）评分值是否确定"),
		@Column(name="pd_8_1_3", attrName="pd_8_1_3", label="冻结步态量表", comment="冻结步态量表（FOG-Q）评分值"),
		@Column(name="pd_8_1_4", attrName="pd_8_1_4", label="评估日期时间"),
		@Column(name="pd_8_2_1", attrName="pd_8_2_1", label="康复方式选择"),
		@Column(name="pd_8_2_2", attrName="pd_8_2_2", label="康复实施日期", comment="康复实施日期(首次)"),
		@Column(name="pd_8_2_3", attrName="pd_8_2_3", label="未能进行康复原因"),
		@Column(name="cm_0_1_4_2_1", attrName="cm01421", label="其他ICD-9-CM-3六位临床扩展编码与名称"),
		@Column(name="pd_9_1_1", attrName="pd_9_1_1", label="入院时是否进行重点护理评估且有记录"),
		@Column(name="pd_9_1_1_1", attrName="pd_9_1_1_1", label="行走评估结果"),
		@Column(name="pd_9_1_2", attrName="pd_9_1_2", label="跌倒/坠床评估"),
		@Column(name="pd_9_1_3", attrName="pd_9_1_3", label="饮食评估结果"),
		@Column(name="pd_9_1_4", attrName="pd_9_1_4", label="吞咽评估结果"),
		@Column(name="pd_9_1_5", attrName="pd_9_1_5", label="误吸"),
		@Column(name="pd_9_1_5_1", attrName="pd_9_1_5_1", label="压疮评估是否无法确定或无记录"),
		@Column(name="pd_9_1_6", attrName="pd_9_1_6", label="压疮评估", comment="压疮评估（Braden评分值）分值"),
		@Column(name="pd_9_1_6_1", attrName="pd_9_1_6_1", label="压疮评估结果选择"),
		@Column(name="pd_9_1_6_2", attrName="pd_9_1_6_2", label="预防压疮是否告知"),
		@Column(name="pd_9_1_7", attrName="pd_9_1_7", label="Wells深静脉血栓风险评分"),
		@Column(name="pd_9_1_8", attrName="pd_9_1_8", label="尿失禁评估"),
		@Column(name="pd_9_1_9", attrName="pd_9_1_9", label="疼痛评估"),
		@Column(name="pd_9_1_2_1", attrName="pd_9_1_2_1", label="DBS前、后是否实施健康教育有记录"),
		@Column(name="pd_9_1_2_2", attrName="pd_9_1_2_2", label="手术", comment="手术（DBS）前健康教育有记录"),
		@Column(name="pd_9_1_3_3", attrName="pd_9_1_3_3", label="手术", comment="手术（DBS）后健康教育有记录"),
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
		@Column(name="cm_0_2_3_1", attrName="cm0231", label="到达本院急诊或者门诊日期时间是否无法确定或无记录"),
		@Column(name="cm_0_2_3_2", attrName="cm0232", label="到达本院急诊或者门诊日期时间"),
		@Column(name="cm_0_2_5_1", attrName="cm0251", label="入住CCU日期时间"),
		@Column(name="cm_0_2_5_2", attrName="cm0252", label="离开CCU日期时间"),
		@Column(name="cm_3_1", attrName="cm31", label="手术野皮肤准备常用方法的选择"),
		@Column(name="cm_3_2", attrName="cm32", label="使用含抗菌剂", comment="使用含抗菌剂（三氯生）缝线"),
		@Column(name="cm_3_2_1", attrName="cm321", label="其他含抗菌剂缝线填写"),
		@Column(name="cm_3_3", attrName="cm33", label="手术切口类别的选择"),
		@Column(name="cm_3_4", attrName="cm34", label="手术切口愈合情况的选择"),
		@Column(name="id", attrName="id", label="id", isPK=true),
	}, orderBy="a.update_date DESC"
)
public class QualityPd extends DataEntity<QualityPd> {
	
	private static final long serialVersionUID = 1L;
	private String cm_0_1_1_1;		// 质控医师
	private String cm_0_1_1_2;		// 质控护士
	private String cm_0_1_1_3;		// 主治医师
	private String cm_0_1_1_4;		// 责任护士
	private String cm_0_1_1_5;		// 上报科室
	private String caseId;		// 患者病案号
	private String cm_0_1_3_2;		// 主要诊断ICD-10六位临床扩展编码与名称
	private String cm_0_1_4_1;		// 主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称
	private String pd_0_1_4_1;		// 其他主要手术操作ICD-9-CM-3四位亚目编码与名称
	private String cm_0_1_4_2;		// 主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称
	private String pd_0_1_4_2;		// 其他主要手术操作ICD-9-CM-3六位临床扩展编码与名称
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
	private String pd_1_1_1;		// 绝对排除标准
	private String pd_1_2_1;		// 是否在发病 5 年内出现快速进展的步态障碍，且需要规律使用轮椅
	private String pd_1_2_2;		// 是否发病 5 年或 5 年以上，
	private String pd_1_2_3;		// 是否早期出现的球部功能障碍
	private String pd_1_2_4;		// 是否有吸气性呼吸功能障碍：出现白天或夜间吸气性喘鸣或者频繁的吸气性叹息
	private String pd_1_2_5;		// 是否在发病 5 年内出现严重的自主神经功能障碍
	private String pd_1_2_5_1;		// 出现严重的自主神经功能障碍具体表现为
	private String pd_1_2_6;		// 是否在发病 3 年内由于平衡损害导致的反复（&gt;1 次 / 年）摔倒
	private String pd_1_2_7;		// 是否在发病 10 年内出现不成比例地颈部前倾（肌张力障碍）或手足挛缩
	private String pd_1_2_8;		// 是否是病程到了 5 年也不出现任何一种常见的非运动症状
	private String pd_1_2_9;		// 是否有其他原因不能解释的锥体束征，
	private String pd_1_2_10;		// 是否是双侧对称性的帕金森综合征。
	private String pd_1_3_1;		// 是否对多巴胺药物治疗具有明确且显著的有效应答
	private String pd_1_3_1_1;		// 初始治疗显著应答表现为
	private String pd_1_3_2;		// 是否出现左旋多巴诱导的异动症
	private String pd_1_3_3;		// 临床体格检查记录的单个肢体静止性震颤（既往或本次检查）
	private String pd_1_3_4;		// 存在嗅觉丧失或心脏 MIBG 闪烁显像法显示存在心脏去交感神经支配
	private String pd_1_4_1;		// 帕金森病标准选择
	private String pd_1_4_2;		// 患者确诊帕金森病（PD）的主要依据
	private String pd_1_4_3;		// 患者诊断为可能帕金森病（PD）的主要依据
	private String pd_2_1_1;		// 是否实施头部MRI检查
	private String pd_2_1_2;		// 完成MRI序列
	private String pd_2_1_3;		// 是否实施头部CT检查
	private String pd_2_1_4;		// 报告日期时间
	private String pd_2_2_1;		// 是否实施黑质超声检查
	private String pd_2_2_2;		// 报告日期时间
	private String pd_2_3_1;		// 是否实施震颤分析检查
	private String pd_2_3_2;		// 报告日期时间
	private String pd_2_4_1;		// 是否实施肛门括约肌肌电图检查
	private String pd_2_4_2;		// 报告日期时间
	private String pd_2_5_1;		// 是否实施头PET检查
	private String pd_2_5_2;		// 完成头PET项目
	private String pd_2_5_2_1;		// 其他头PET项目
	private String pd_2_5_3;		// 报告日期时间
	private String pd_3_1_1;		// 是否进行多巴胺能反应性评测
	private String pd_3_1_2;		// 评测适应症的选择
	private String pd_3_2_1;		// 是否有被选择评测药物的禁忌症
	private String pd_3_2_2;		// 评测药物的禁忌症
	private String pd_3_2_2_1;		// 多巴丝肼片（美多芭）禁忌症的选择
	private String pd_3_2_2_2;		// 其他多巴丝肼片（美多芭）禁忌症
	private String pd_3_2_2_3;		// 卡左双多巴（息宁）禁忌症的选择
	private String pd_3_2_2_4;		// 其他卡左双多巴（息宁）禁忌症
	private String pd_3_2_3;		// 盐酸苯海索（安坦）禁忌症的选择
	private String pd_3_2_3_1;		// 其他盐酸苯海索（安坦）禁忌症
	private String pd_3_2_4;		// 盐酸阿罗洛尔（阿尔马尔）禁忌症的选择
	private String pd_3_2_4_1;		// 其他盐酸阿罗洛尔（阿尔马尔）禁忌症
	private String pd_3_2_5;		// 盐酸普拉克索（森福罗）禁忌症的选择
	private String pd_3_2_5_1;		// 其他盐酸普拉克索（森福罗）禁忌症
	private String pd_3_2_6;		// 盐酸金刚烷胺禁忌症的选择
	private String pd_3_2_6_1;		// 其他盐酸金刚烷胺禁忌症
	private String pd_3_2_7;		// 恩他卡朋禁忌症的选择
	private String pd_3_2_7_1;		// 其他恩他卡朋禁忌症
	private String pd_3_2_8;		// 雷沙吉兰禁忌症的选择
	private String pd_3_2_8_1;		// 其他雷沙吉兰禁忌症
	private String pd_3_2_9;		// 盐酸罗匹尼罗禁忌症的选择
	private String pd_3_2_9_1;		// 其他盐酸罗匹尼罗禁忌症
	private String pd_3_2_10;		// 司来吉兰禁忌症的选择
	private String pd_3_2_10_1;		// 其他司来吉兰禁忌症
	private String pd_3_3_3;		// 运动检查 
	private Double pd_3_3_1_1;		// 基线值（关期)
	private Double pd_3_3_1_2;		// 最佳改善值（开期）
	private String pd_3_4_1;		// 疗效反应结论的选择
	private String pd_3_5_1;		// 不良反应风险的选择
	private String pd_3_6_1;		// 完成日期时间
	private String pd_4_1_1;		// 是否在入院24小时进行帕金森病Hoehn-Yahr分期评估
	private String pd_4_1_2;		// 临床分期依据一: 主要有那些临床表现及体征
	private String pd_4_1_3;		// H-Y分期结论
	private String pd_4_1_4;		// 完成日期时间
	private String pd_5_1_1;		// 是否进行神经功能缺损评估
	private Double pd_5_1_2;		// 第一部分：日常生活非运动症状体验
	private Double pd_5_1_3;		// 第二部分：日常生活运动症状体验
	private Double pd_5_1_4;		// 第三部分：运动功能检查
	private Double pd_5_1_5;		// 第四部分：运动并发症
	private Double pd_5_1_6;		// 日常分值合计
	private String pd_5_1_7;		// 完成日期时间
	private String pd_6_1_1;		// 运动并发症类型
	private String pd_6_1_2;		// 剂末现象的筛查
	private String pd_6_1_2_1;		// 其他剂末现象
	private String pd_6_1_3;		// 剂末现象的处理
	private String pd_6_1_3_1;		// 其他剂末现象处理
	private String pd_6_1_4;		// 异动症类型
	private String pd_6_1_4_1;		// 剂峰异动症处理
	private String pd_6_1_4_1_1;		// 其他剂峰异动处理
	private String pd_6_1_4_2;		// 剂末异动症处理
	private String pd_6_1_4_2_1;		// 其他剂末异动处理
	private String pd_6_1_4_3;		// 双相异动症处理
	private String pd_6_1_4_3_1;		// 其他双相异动处理
	private String pd_6_1_5;		// 筛查完成日期时间
	private String pd_6_2_1;		// 是否实施筛查认知功能障碍评估
	private String pd_6_2_2;		// 进行认知功能筛查类型的选择
	private Double pd_6_2_3_1;		// 定向力筛查结果
	private Double pd_6_2_3_2;		// 记忆力筛查结果
	private Double pd_6_2_3_3;		// 注意力和计算力筛查结果
	private Double pd_6_2_3_4;		// 回忆能力筛查结果
	private Double pd_6_2_3_5;		// 语言能力筛查结果
	private Double pd_6_2_3;		// 入院1周完成筛查认知功能障碍（MMSE）评估分值
	private String pd_6_2_4;		// 痴呆严重程度分级
	private String pd_6_2_5;		// 认知功能障碍类型
	private String pd_6_2_6;		// 完成日期时间
	private String pd_6_2_2_1;		// 其他进行认知功能筛查类型
	private Double pd_6_2_7;		// Moca量表评分值
	private String pd_6_2_8;		// 痴呆严重程度分层
	private String pd_6_2_9;		// 是否实施认知功能障碍治疗
	private String pd_6_2_10;		// 认知功能障碍治疗措施的选择
	private String pd_6_2_10_1;		// 其他认知功能障碍治疗措施
	private String pd_6_2_11;		// 治疗医嘱执行日期时间
	private String pd_6_3_1;		// 是否实施心理状况的筛查
	private String pd_6_3_2;		// 进行心理状况筛查的项目
	private String pd_6_3_3;		// 完成日期时间
	private String pd_6_4_1;		// 是否实施睡眠状况的筛查
	private String pd_6_4_2;		// 进行睡眠状况筛查的项目
	private String pd_6_4_2_1;		// 其他睡眠状况筛查的项目
	private String pd_6_4_3;		// 完成日期时间
	private String pd_6_5_1;		// 入院查体时是否实施卧立位血压的检测
	private Double pd_6_5_2_1;		// 卧位血压-收缩压(mmHg)
	private String cm0131;		// 主要诊断ICD-10四位亚目编码与名称
	private Double pd_6_5_2_2;		// 卧位血压-舒张压(mmHg)
	private Double pd_6_5_3_1;		// 立位即刻血压-收缩压(mmHg)
	private Double pd_6_5_3_2;		// 立位即刻血压-舒张压(mmHg)
	private Double pd_6_5_4_1;		// 立位1min血压-收缩压(mmHg)
	private Double pd_6_5_4_2;		// 立位1min血压-舒张压(mmHg)
	private Double pd_6_5_5_1;		// 立位3min血压-收缩压(mmHg)
	private Double pd_6_5_5_2;		// 立位3min血压-舒张压(mmHg)
	private Double pd_6_5_6_1;		// 立位大于3min血压-收缩压(mmHg)
	private Double pd_6_5_6_2;		// 立位大于3min血压-舒张压(mmHg)
	private String pd_6_5_7;		// 完成日期时间
	private String pd_6_5_8;		// 告知患者,体位性低血压干预措施有记录
	private String pd_6_5_8_1;		// 其他体位性低血压干预措施记录
	private String pd_7_1_1;		// 是否为合并运动并发症的患者
	private String pd_7_1_2_1;		// 是否为原发性PD
	private String pd_7_1_2_2;		// 优化药物治疗后，仍存在下列情况之一者
	private String pd_7_1_2_3;		// 急性左旋多巴药物反应良好，存在下列情况之一者
	private String pd_7_1_2_4;		// 病程
	private String pd_7_1_2_5;		// 年龄：符合一条
	private String pd_7_1_3;		// 手术禁忌证的选择
	private String pd_7_1_4;		// 完成日期时间
	private String pd_7_2_1;		// 是否进行脑深部电刺激手术（DBS）
	private String pd_7_2_2;		// 实施脑深部电刺激手术（DBS）的ICD-9-CM-3四位亚目编码及名称的选择
	private String pd_7_2_2_1;		// 实施脑深部电刺激其他手术
	private String pd_7_2_3;		// DBS手术完成日期
	private String cm01411;		// 其他ICD-9-CM-3四位亚目编码与名称
	private String pd_7_3_3;		// 神经系统手术并发症
	private String pd_7_3_3_1;		// 其他术后并发症
	private String pd_8_1_1;		// 是否有冻结步态
	private String pd_8_1_2;		// 是否有冻结步态量表（FOG-Q）评分
	private String pd_8_1_3_1;		// (FOG-Q）评分值是否确定
	private Double pd_8_1_3;		// 冻结步态量表（FOG-Q）评分值
	private String pd_8_1_4;		// 评估日期时间
	private String pd_8_2_1;		// 康复方式选择
	private String pd_8_2_2;		// 康复实施日期(首次)
	private String pd_8_2_3;		// 未能进行康复原因
	private String cm01421;		// 其他ICD-9-CM-3六位临床扩展编码与名称
	private String pd_9_1_1;		// 入院时是否进行重点护理评估且有记录
	private String pd_9_1_1_1;		// 行走评估结果
	private String pd_9_1_2;		// 跌倒/坠床评估
	private String pd_9_1_3;		// 饮食评估结果
	private String pd_9_1_4;		// 吞咽评估结果
	private String pd_9_1_5;		// 误吸
	private String pd_9_1_5_1;		// 压疮评估是否无法确定或无记录
	private Double pd_9_1_6;		// 压疮评估（Braden评分值）分值
	private String pd_9_1_6_1;		// 压疮评估结果选择
	private String pd_9_1_6_2;		// 预防压疮是否告知
	private String pd_9_1_7;		// Wells深静脉血栓风险评分
	private String pd_9_1_8;		// 尿失禁评估
	private String pd_9_1_9;		// 疼痛评估
	private String pd_9_1_2_1;		// DBS前、后是否实施健康教育有记录
	private String pd_9_1_2_2;		// 手术（DBS）前健康教育有记录
	private String pd_9_1_3_3;		// 手术（DBS）后健康教育有记录
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
	private String cm0231;		// 到达本院急诊或者门诊日期时间是否无法确定或无记录
	private Date cm0232;		// 到达本院急诊或者门诊日期时间
	private Date cm0251;		// 入住CCU日期时间
	private Date cm0252;		// 离开CCU日期时间
	private String cm31;		// 手术野皮肤准备常用方法的选择
	private String cm32;		// 使用含抗菌剂（三氯生）缝线
	private String cm321;		// 其他含抗菌剂缝线填写
	private String cm33;		// 手术切口类别的选择
	private String cm34;		// 手术切口愈合情况的选择
	
	public QualityPd() {
		this(null);
	}

	public QualityPd(String id){
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
	
	@Length(min=0, max=64, message="其他主要手术操作ICD-9-CM-3四位亚目编码与名称长度不能超过 64 个字符")
	public String getPd_0_1_4_1() {
		return pd_0_1_4_1;
	}

	public void setPd_0_1_4_1(String pd_0_1_4_1) {
		this.pd_0_1_4_1 = pd_0_1_4_1;
	}
	
	@Length(min=0, max=32, message="主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称长度不能超过 32 个字符")
	public String getCm_0_1_4_2() {
		return cm_0_1_4_2;
	}

	public void setCm_0_1_4_2(String cm_0_1_4_2) {
		this.cm_0_1_4_2 = cm_0_1_4_2;
	}
	
	@Length(min=0, max=64, message="其他主要手术操作ICD-9-CM-3六位临床扩展编码与名称长度不能超过 64 个字符")
	public String getPd_0_1_4_2() {
		return pd_0_1_4_2;
	}

	public void setPd_0_1_4_2(String pd_0_1_4_2) {
		this.pd_0_1_4_2 = pd_0_1_4_2;
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
	
	@Length(min=0, max=64, message="绝对排除标准长度不能超过 64 个字符")
	public String getPd_1_1_1() {
		return pd_1_1_1;
	}

	public void setPd_1_1_1(String pd_1_1_1) {
		this.pd_1_1_1 = pd_1_1_1;
	}
	
	@Length(min=0, max=64, message="是否在发病 5 年内出现快速进展的步态障碍，且需要规律使用轮椅长度不能超过 64 个字符")
	public String getPd_1_2_1() {
		return pd_1_2_1;
	}

	public void setPd_1_2_1(String pd_1_2_1) {
		this.pd_1_2_1 = pd_1_2_1;
	}
	
	@Length(min=0, max=64, message="是否发病 5 年或 5 年以上，长度不能超过 64 个字符")
	public String getPd_1_2_2() {
		return pd_1_2_2;
	}

	public void setPd_1_2_2(String pd_1_2_2) {
		this.pd_1_2_2 = pd_1_2_2;
	}
	
	@Length(min=0, max=64, message="是否早期出现的球部功能障碍长度不能超过 64 个字符")
	public String getPd_1_2_3() {
		return pd_1_2_3;
	}

	public void setPd_1_2_3(String pd_1_2_3) {
		this.pd_1_2_3 = pd_1_2_3;
	}
	
	@Length(min=0, max=64, message="是否有吸气性呼吸功能障碍长度不能超过 64 个字符")
	public String getPd_1_2_4() {
		return pd_1_2_4;
	}

	public void setPd_1_2_4(String pd_1_2_4) {
		this.pd_1_2_4 = pd_1_2_4;
	}
	
	@Length(min=0, max=64, message="是否在发病 5 年内出现严重的自主神经功能障碍长度不能超过 64 个字符")
	public String getPd_1_2_5() {
		return pd_1_2_5;
	}

	public void setPd_1_2_5(String pd_1_2_5) {
		this.pd_1_2_5 = pd_1_2_5;
	}
	
	@Length(min=0, max=64, message="出现严重的自主神经功能障碍具体表现为长度不能超过 64 个字符")
	public String getPd_1_2_5_1() {
		return pd_1_2_5_1;
	}

	public void setPd_1_2_5_1(String pd_1_2_5_1) {
		this.pd_1_2_5_1 = pd_1_2_5_1;
	}
	
	@Length(min=0, max=64, message="是否在发病 3 年内由于平衡损害导致的反复长度不能超过 64 个字符")
	public String getPd_1_2_6() {
		return pd_1_2_6;
	}

	public void setPd_1_2_6(String pd_1_2_6) {
		this.pd_1_2_6 = pd_1_2_6;
	}
	
	@Length(min=0, max=64, message="是否在发病 10 年内出现不成比例地颈部前倾长度不能超过 64 个字符")
	public String getPd_1_2_7() {
		return pd_1_2_7;
	}

	public void setPd_1_2_7(String pd_1_2_7) {
		this.pd_1_2_7 = pd_1_2_7;
	}
	
	@Length(min=0, max=64, message="是否是病程到了 5 年也不出现任何一种常见的非运动症状长度不能超过 64 个字符")
	public String getPd_1_2_8() {
		return pd_1_2_8;
	}

	public void setPd_1_2_8(String pd_1_2_8) {
		this.pd_1_2_8 = pd_1_2_8;
	}
	
	@Length(min=0, max=64, message="是否有其他原因不能解释的锥体束征，长度不能超过 64 个字符")
	public String getPd_1_2_9() {
		return pd_1_2_9;
	}

	public void setPd_1_2_9(String pd_1_2_9) {
		this.pd_1_2_9 = pd_1_2_9;
	}
	
	@Length(min=0, max=64, message="是否是双侧对称性的帕金森综合征。长度不能超过 64 个字符")
	public String getPd_1_2_10() {
		return pd_1_2_10;
	}

	public void setPd_1_2_10(String pd_1_2_10) {
		this.pd_1_2_10 = pd_1_2_10;
	}
	
	@Length(min=0, max=64, message="是否对多巴胺药物治疗具有明确且显著的有效应答长度不能超过 64 个字符")
	public String getPd_1_3_1() {
		return pd_1_3_1;
	}

	public void setPd_1_3_1(String pd_1_3_1) {
		this.pd_1_3_1 = pd_1_3_1;
	}
	
	@Length(min=0, max=64, message="初始治疗显著应答表现为长度不能超过 64 个字符")
	public String getPd_1_3_1_1() {
		return pd_1_3_1_1;
	}

	public void setPd_1_3_1_1(String pd_1_3_1_1) {
		this.pd_1_3_1_1 = pd_1_3_1_1;
	}
	
	@Length(min=0, max=64, message="是否出现左旋多巴诱导的异动症长度不能超过 64 个字符")
	public String getPd_1_3_2() {
		return pd_1_3_2;
	}

	public void setPd_1_3_2(String pd_1_3_2) {
		this.pd_1_3_2 = pd_1_3_2;
	}
	
	@Length(min=0, max=64, message="临床体格检查记录的单个肢体静止性震颤长度不能超过 64 个字符")
	public String getPd_1_3_3() {
		return pd_1_3_3;
	}

	public void setPd_1_3_3(String pd_1_3_3) {
		this.pd_1_3_3 = pd_1_3_3;
	}
	
	@Length(min=0, max=64, message="存在嗅觉丧失或心脏 MIBG 闪烁显像法显示存在心脏去交感神经支配长度不能超过 64 个字符")
	public String getPd_1_3_4() {
		return pd_1_3_4;
	}

	public void setPd_1_3_4(String pd_1_3_4) {
		this.pd_1_3_4 = pd_1_3_4;
	}
	
	@Length(min=0, max=64, message="帕金森病标准选择长度不能超过 64 个字符")
	public String getPd_1_4_1() {
		return pd_1_4_1;
	}

	public void setPd_1_4_1(String pd_1_4_1) {
		this.pd_1_4_1 = pd_1_4_1;
	}
	
	@Length(min=0, max=64, message="患者确诊帕金森病长度不能超过 64 个字符")
	public String getPd_1_4_2() {
		return pd_1_4_2;
	}

	public void setPd_1_4_2(String pd_1_4_2) {
		this.pd_1_4_2 = pd_1_4_2;
	}
	
	@Length(min=0, max=64, message="患者诊断为可能帕金森病长度不能超过 64 个字符")
	public String getPd_1_4_3() {
		return pd_1_4_3;
	}

	public void setPd_1_4_3(String pd_1_4_3) {
		this.pd_1_4_3 = pd_1_4_3;
	}
	
	@Length(min=0, max=64, message="是否实施头部MRI检查长度不能超过 64 个字符")
	public String getPd_2_1_1() {
		return pd_2_1_1;
	}

	public void setPd_2_1_1(String pd_2_1_1) {
		this.pd_2_1_1 = pd_2_1_1;
	}
	
	@Length(min=0, max=64, message="完成MRI序列长度不能超过 64 个字符")
	public String getPd_2_1_2() {
		return pd_2_1_2;
	}

	public void setPd_2_1_2(String pd_2_1_2) {
		this.pd_2_1_2 = pd_2_1_2;
	}
	
	@Length(min=0, max=64, message="是否实施头部CT检查长度不能超过 64 个字符")
	public String getPd_2_1_3() {
		return pd_2_1_3;
	}

	public void setPd_2_1_3(String pd_2_1_3) {
		this.pd_2_1_3 = pd_2_1_3;
	}
	
	@Length(min=0, max=64, message="报告日期时间长度不能超过 64 个字符")
	public String getPd_2_1_4() {
		return pd_2_1_4;
	}

	public void setPd_2_1_4(String pd_2_1_4) {
		this.pd_2_1_4 = pd_2_1_4;
	}
	
	@Length(min=0, max=64, message="是否实施黑质超声检查长度不能超过 64 个字符")
	public String getPd_2_2_1() {
		return pd_2_2_1;
	}

	public void setPd_2_2_1(String pd_2_2_1) {
		this.pd_2_2_1 = pd_2_2_1;
	}
	
	@Length(min=0, max=64, message="报告日期时间长度不能超过 64 个字符")
	public String getPd_2_2_2() {
		return pd_2_2_2;
	}

	public void setPd_2_2_2(String pd_2_2_2) {
		this.pd_2_2_2 = pd_2_2_2;
	}
	
	@Length(min=0, max=64, message="是否实施震颤分析检查长度不能超过 64 个字符")
	public String getPd_2_3_1() {
		return pd_2_3_1;
	}

	public void setPd_2_3_1(String pd_2_3_1) {
		this.pd_2_3_1 = pd_2_3_1;
	}
	
	@Length(min=0, max=64, message="报告日期时间长度不能超过 64 个字符")
	public String getPd_2_3_2() {
		return pd_2_3_2;
	}

	public void setPd_2_3_2(String pd_2_3_2) {
		this.pd_2_3_2 = pd_2_3_2;
	}
	
	@Length(min=0, max=64, message="是否实施肛门括约肌肌电图检查长度不能超过 64 个字符")
	public String getPd_2_4_1() {
		return pd_2_4_1;
	}

	public void setPd_2_4_1(String pd_2_4_1) {
		this.pd_2_4_1 = pd_2_4_1;
	}
	
	@Length(min=0, max=64, message="报告日期时间长度不能超过 64 个字符")
	public String getPd_2_4_2() {
		return pd_2_4_2;
	}

	public void setPd_2_4_2(String pd_2_4_2) {
		this.pd_2_4_2 = pd_2_4_2;
	}
	
	@Length(min=0, max=64, message="是否实施头PET检查长度不能超过 64 个字符")
	public String getPd_2_5_1() {
		return pd_2_5_1;
	}

	public void setPd_2_5_1(String pd_2_5_1) {
		this.pd_2_5_1 = pd_2_5_1;
	}
	
	@Length(min=0, max=64, message="完成头PET项目长度不能超过 64 个字符")
	public String getPd_2_5_2() {
		return pd_2_5_2;
	}

	public void setPd_2_5_2(String pd_2_5_2) {
		this.pd_2_5_2 = pd_2_5_2;
	}
	
	@Length(min=0, max=64, message="其他头PET项目长度不能超过 64 个字符")
	public String getPd_2_5_2_1() {
		return pd_2_5_2_1;
	}

	public void setPd_2_5_2_1(String pd_2_5_2_1) {
		this.pd_2_5_2_1 = pd_2_5_2_1;
	}
	
	@Length(min=0, max=64, message="报告日期时间长度不能超过 64 个字符")
	public String getPd_2_5_3() {
		return pd_2_5_3;
	}

	public void setPd_2_5_3(String pd_2_5_3) {
		this.pd_2_5_3 = pd_2_5_3;
	}
	
	@Length(min=0, max=64, message="是否进行多巴胺能反应性评测长度不能超过 64 个字符")
	public String getPd_3_1_1() {
		return pd_3_1_1;
	}

	public void setPd_3_1_1(String pd_3_1_1) {
		this.pd_3_1_1 = pd_3_1_1;
	}
	
	@Length(min=0, max=64, message="评测适应症的选择长度不能超过 64 个字符")
	public String getPd_3_1_2() {
		return pd_3_1_2;
	}

	public void setPd_3_1_2(String pd_3_1_2) {
		this.pd_3_1_2 = pd_3_1_2;
	}
	
	@Length(min=0, max=64, message="是否有被选择评测药物的禁忌症长度不能超过 64 个字符")
	public String getPd_3_2_1() {
		return pd_3_2_1;
	}

	public void setPd_3_2_1(String pd_3_2_1) {
		this.pd_3_2_1 = pd_3_2_1;
	}
	
	@Length(min=0, max=64, message="评测药物的禁忌症长度不能超过 64 个字符")
	public String getPd_3_2_2() {
		return pd_3_2_2;
	}

	public void setPd_3_2_2(String pd_3_2_2) {
		this.pd_3_2_2 = pd_3_2_2;
	}
	
	@Length(min=0, max=64, message="多巴丝肼片长度不能超过 64 个字符")
	public String getPd_3_2_2_1() {
		return pd_3_2_2_1;
	}

	public void setPd_3_2_2_1(String pd_3_2_2_1) {
		this.pd_3_2_2_1 = pd_3_2_2_1;
	}
	
	@Length(min=0, max=64, message="其他多巴丝肼片长度不能超过 64 个字符")
	public String getPd_3_2_2_2() {
		return pd_3_2_2_2;
	}

	public void setPd_3_2_2_2(String pd_3_2_2_2) {
		this.pd_3_2_2_2 = pd_3_2_2_2;
	}
	
	@Length(min=0, max=64, message="卡左双多巴长度不能超过 64 个字符")
	public String getPd_3_2_2_3() {
		return pd_3_2_2_3;
	}

	public void setPd_3_2_2_3(String pd_3_2_2_3) {
		this.pd_3_2_2_3 = pd_3_2_2_3;
	}
	
	@Length(min=0, max=64, message="其他卡左双多巴长度不能超过 64 个字符")
	public String getPd_3_2_2_4() {
		return pd_3_2_2_4;
	}

	public void setPd_3_2_2_4(String pd_3_2_2_4) {
		this.pd_3_2_2_4 = pd_3_2_2_4;
	}
	
	@Length(min=0, max=64, message="盐酸苯海索长度不能超过 64 个字符")
	public String getPd_3_2_3() {
		return pd_3_2_3;
	}

	public void setPd_3_2_3(String pd_3_2_3) {
		this.pd_3_2_3 = pd_3_2_3;
	}
	
	@Length(min=0, max=64, message="其他盐酸苯海索长度不能超过 64 个字符")
	public String getPd_3_2_3_1() {
		return pd_3_2_3_1;
	}

	public void setPd_3_2_3_1(String pd_3_2_3_1) {
		this.pd_3_2_3_1 = pd_3_2_3_1;
	}
	
	@Length(min=0, max=64, message="盐酸阿罗洛尔长度不能超过 64 个字符")
	public String getPd_3_2_4() {
		return pd_3_2_4;
	}

	public void setPd_3_2_4(String pd_3_2_4) {
		this.pd_3_2_4 = pd_3_2_4;
	}
	
	@Length(min=0, max=64, message="其他盐酸阿罗洛尔长度不能超过 64 个字符")
	public String getPd_3_2_4_1() {
		return pd_3_2_4_1;
	}

	public void setPd_3_2_4_1(String pd_3_2_4_1) {
		this.pd_3_2_4_1 = pd_3_2_4_1;
	}
	
	@Length(min=0, max=64, message="盐酸普拉克索长度不能超过 64 个字符")
	public String getPd_3_2_5() {
		return pd_3_2_5;
	}

	public void setPd_3_2_5(String pd_3_2_5) {
		this.pd_3_2_5 = pd_3_2_5;
	}
	
	@Length(min=0, max=64, message="其他盐酸普拉克索长度不能超过 64 个字符")
	public String getPd_3_2_5_1() {
		return pd_3_2_5_1;
	}

	public void setPd_3_2_5_1(String pd_3_2_5_1) {
		this.pd_3_2_5_1 = pd_3_2_5_1;
	}
	
	@Length(min=0, max=64, message="盐酸金刚烷胺禁忌症的选择长度不能超过 64 个字符")
	public String getPd_3_2_6() {
		return pd_3_2_6;
	}

	public void setPd_3_2_6(String pd_3_2_6) {
		this.pd_3_2_6 = pd_3_2_6;
	}
	
	@Length(min=0, max=64, message="其他盐酸金刚烷胺禁忌症长度不能超过 64 个字符")
	public String getPd_3_2_6_1() {
		return pd_3_2_6_1;
	}

	public void setPd_3_2_6_1(String pd_3_2_6_1) {
		this.pd_3_2_6_1 = pd_3_2_6_1;
	}
	
	@Length(min=0, max=64, message="恩他卡朋禁忌症的选择长度不能超过 64 个字符")
	public String getPd_3_2_7() {
		return pd_3_2_7;
	}

	public void setPd_3_2_7(String pd_3_2_7) {
		this.pd_3_2_7 = pd_3_2_7;
	}
	
	@Length(min=0, max=64, message="其他恩他卡朋禁忌症长度不能超过 64 个字符")
	public String getPd_3_2_7_1() {
		return pd_3_2_7_1;
	}

	public void setPd_3_2_7_1(String pd_3_2_7_1) {
		this.pd_3_2_7_1 = pd_3_2_7_1;
	}
	
	@Length(min=0, max=64, message="雷沙吉兰禁忌症的选择长度不能超过 64 个字符")
	public String getPd_3_2_8() {
		return pd_3_2_8;
	}

	public void setPd_3_2_8(String pd_3_2_8) {
		this.pd_3_2_8 = pd_3_2_8;
	}
	
	@Length(min=0, max=64, message="其他雷沙吉兰禁忌症长度不能超过 64 个字符")
	public String getPd_3_2_8_1() {
		return pd_3_2_8_1;
	}

	public void setPd_3_2_8_1(String pd_3_2_8_1) {
		this.pd_3_2_8_1 = pd_3_2_8_1;
	}
	
	@Length(min=0, max=64, message="盐酸罗匹尼罗禁忌症的选择长度不能超过 64 个字符")
	public String getPd_3_2_9() {
		return pd_3_2_9;
	}

	public void setPd_3_2_9(String pd_3_2_9) {
		this.pd_3_2_9 = pd_3_2_9;
	}
	
	@Length(min=0, max=64, message="其他盐酸罗匹尼罗禁忌症长度不能超过 64 个字符")
	public String getPd_3_2_9_1() {
		return pd_3_2_9_1;
	}

	public void setPd_3_2_9_1(String pd_3_2_9_1) {
		this.pd_3_2_9_1 = pd_3_2_9_1;
	}
	
	@Length(min=0, max=64, message="司来吉兰禁忌症的选择长度不能超过 64 个字符")
	public String getPd_3_2_10() {
		return pd_3_2_10;
	}

	public void setPd_3_2_10(String pd_3_2_10) {
		this.pd_3_2_10 = pd_3_2_10;
	}
	
	@Length(min=0, max=64, message="其他司来吉兰禁忌症长度不能超过 64 个字符")
	public String getPd_3_2_10_1() {
		return pd_3_2_10_1;
	}

	public void setPd_3_2_10_1(String pd_3_2_10_1) {
		this.pd_3_2_10_1 = pd_3_2_10_1;
	}
	
	@Length(min=0, max=64, message="运动检查 长度不能超过 64 个字符")
	public String getPd_3_3_3() {
		return pd_3_3_3;
	}

	public void setPd_3_3_3(String pd_3_3_3) {
		this.pd_3_3_3 = pd_3_3_3;
	}
	
	public Double getPd_3_3_1_1() {
		return pd_3_3_1_1;
	}

	public void setPd_3_3_1_1(Double pd_3_3_1_1) {
		this.pd_3_3_1_1 = pd_3_3_1_1;
	}
	
	public Double getPd_3_3_1_2() {
		return pd_3_3_1_2;
	}

	public void setPd_3_3_1_2(Double pd_3_3_1_2) {
		this.pd_3_3_1_2 = pd_3_3_1_2;
	}
	
	@Length(min=0, max=64, message="疗效反应结论的选择长度不能超过 64 个字符")
	public String getPd_3_4_1() {
		return pd_3_4_1;
	}

	public void setPd_3_4_1(String pd_3_4_1) {
		this.pd_3_4_1 = pd_3_4_1;
	}
	
	@Length(min=0, max=64, message="不良反应风险的选择长度不能超过 64 个字符")
	public String getPd_3_5_1() {
		return pd_3_5_1;
	}

	public void setPd_3_5_1(String pd_3_5_1) {
		this.pd_3_5_1 = pd_3_5_1;
	}
	
	@Length(min=0, max=64, message="完成日期时间长度不能超过 64 个字符")
	public String getPd_3_6_1() {
		return pd_3_6_1;
	}

	public void setPd_3_6_1(String pd_3_6_1) {
		this.pd_3_6_1 = pd_3_6_1;
	}
	
	@Length(min=0, max=64, message="是否在入院24小时进行帕金森病Hoehn-Yahr分期评估长度不能超过 64 个字符")
	public String getPd_4_1_1() {
		return pd_4_1_1;
	}

	public void setPd_4_1_1(String pd_4_1_1) {
		this.pd_4_1_1 = pd_4_1_1;
	}
	
	@Length(min=0, max=64, message="临床分期依据一长度不能超过 64 个字符")
	public String getPd_4_1_2() {
		return pd_4_1_2;
	}

	public void setPd_4_1_2(String pd_4_1_2) {
		this.pd_4_1_2 = pd_4_1_2;
	}
	
	@Length(min=0, max=64, message="H-Y分期结论长度不能超过 64 个字符")
	public String getPd_4_1_3() {
		return pd_4_1_3;
	}

	public void setPd_4_1_3(String pd_4_1_3) {
		this.pd_4_1_3 = pd_4_1_3;
	}
	
	@Length(min=0, max=64, message="完成日期时间长度不能超过 64 个字符")
	public String getPd_4_1_4() {
		return pd_4_1_4;
	}

	public void setPd_4_1_4(String pd_4_1_4) {
		this.pd_4_1_4 = pd_4_1_4;
	}
	
	@Length(min=0, max=64, message="是否进行神经功能缺损评估长度不能超过 64 个字符")
	public String getPd_5_1_1() {
		return pd_5_1_1;
	}

	public void setPd_5_1_1(String pd_5_1_1) {
		this.pd_5_1_1 = pd_5_1_1;
	}
	
	public Double getPd_5_1_2() {
		return pd_5_1_2;
	}

	public void setPd_5_1_2(Double pd_5_1_2) {
		this.pd_5_1_2 = pd_5_1_2;
	}
	
	public Double getPd_5_1_3() {
		return pd_5_1_3;
	}

	public void setPd_5_1_3(Double pd_5_1_3) {
		this.pd_5_1_3 = pd_5_1_3;
	}
	
	public Double getPd_5_1_4() {
		return pd_5_1_4;
	}

	public void setPd_5_1_4(Double pd_5_1_4) {
		this.pd_5_1_4 = pd_5_1_4;
	}
	
	public Double getPd_5_1_5() {
		return pd_5_1_5;
	}

	public void setPd_5_1_5(Double pd_5_1_5) {
		this.pd_5_1_5 = pd_5_1_5;
	}
	
	public Double getPd_5_1_6() {
		return pd_5_1_6;
	}

	public void setPd_5_1_6(Double pd_5_1_6) {
		this.pd_5_1_6 = pd_5_1_6;
	}
	
	@Length(min=0, max=64, message="完成日期时间长度不能超过 64 个字符")
	public String getPd_5_1_7() {
		return pd_5_1_7;
	}

	public void setPd_5_1_7(String pd_5_1_7) {
		this.pd_5_1_7 = pd_5_1_7;
	}
	
	@Length(min=0, max=64, message="运动并发症类型长度不能超过 64 个字符")
	public String getPd_6_1_1() {
		return pd_6_1_1;
	}

	public void setPd_6_1_1(String pd_6_1_1) {
		this.pd_6_1_1 = pd_6_1_1;
	}
	
	@Length(min=0, max=64, message="剂末现象的筛查长度不能超过 64 个字符")
	public String getPd_6_1_2() {
		return pd_6_1_2;
	}

	public void setPd_6_1_2(String pd_6_1_2) {
		this.pd_6_1_2 = pd_6_1_2;
	}
	
	@Length(min=0, max=64, message="其他剂末现象长度不能超过 64 个字符")
	public String getPd_6_1_2_1() {
		return pd_6_1_2_1;
	}

	public void setPd_6_1_2_1(String pd_6_1_2_1) {
		this.pd_6_1_2_1 = pd_6_1_2_1;
	}
	
	@Length(min=0, max=64, message="剂末现象的处理长度不能超过 64 个字符")
	public String getPd_6_1_3() {
		return pd_6_1_3;
	}

	public void setPd_6_1_3(String pd_6_1_3) {
		this.pd_6_1_3 = pd_6_1_3;
	}
	
	@Length(min=0, max=64, message="其他剂末现象处理长度不能超过 64 个字符")
	public String getPd_6_1_3_1() {
		return pd_6_1_3_1;
	}

	public void setPd_6_1_3_1(String pd_6_1_3_1) {
		this.pd_6_1_3_1 = pd_6_1_3_1;
	}
	
	@Length(min=0, max=64, message="异动症类型长度不能超过 64 个字符")
	public String getPd_6_1_4() {
		return pd_6_1_4;
	}

	public void setPd_6_1_4(String pd_6_1_4) {
		this.pd_6_1_4 = pd_6_1_4;
	}
	
	@Length(min=0, max=64, message="剂峰异动症处理长度不能超过 64 个字符")
	public String getPd_6_1_4_1() {
		return pd_6_1_4_1;
	}

	public void setPd_6_1_4_1(String pd_6_1_4_1) {
		this.pd_6_1_4_1 = pd_6_1_4_1;
	}
	
	@Length(min=0, max=64, message="其他剂峰异动处理长度不能超过 64 个字符")
	public String getPd_6_1_4_1_1() {
		return pd_6_1_4_1_1;
	}

	public void setPd_6_1_4_1_1(String pd_6_1_4_1_1) {
		this.pd_6_1_4_1_1 = pd_6_1_4_1_1;
	}
	
	@Length(min=0, max=64, message="剂末异动症处理长度不能超过 64 个字符")
	public String getPd_6_1_4_2() {
		return pd_6_1_4_2;
	}

	public void setPd_6_1_4_2(String pd_6_1_4_2) {
		this.pd_6_1_4_2 = pd_6_1_4_2;
	}
	
	@Length(min=0, max=64, message="其他剂末异动处理长度不能超过 64 个字符")
	public String getPd_6_1_4_2_1() {
		return pd_6_1_4_2_1;
	}

	public void setPd_6_1_4_2_1(String pd_6_1_4_2_1) {
		this.pd_6_1_4_2_1 = pd_6_1_4_2_1;
	}
	
	@Length(min=0, max=64, message="双相异动症处理长度不能超过 64 个字符")
	public String getPd_6_1_4_3() {
		return pd_6_1_4_3;
	}

	public void setPd_6_1_4_3(String pd_6_1_4_3) {
		this.pd_6_1_4_3 = pd_6_1_4_3;
	}
	
	@Length(min=0, max=64, message="其他双相异动处理长度不能超过 64 个字符")
	public String getPd_6_1_4_3_1() {
		return pd_6_1_4_3_1;
	}

	public void setPd_6_1_4_3_1(String pd_6_1_4_3_1) {
		this.pd_6_1_4_3_1 = pd_6_1_4_3_1;
	}
	
	@Length(min=0, max=64, message="筛查完成日期时间长度不能超过 64 个字符")
	public String getPd_6_1_5() {
		return pd_6_1_5;
	}

	public void setPd_6_1_5(String pd_6_1_5) {
		this.pd_6_1_5 = pd_6_1_5;
	}
	
	@Length(min=0, max=64, message="是否实施筛查认知功能障碍评估长度不能超过 64 个字符")
	public String getPd_6_2_1() {
		return pd_6_2_1;
	}

	public void setPd_6_2_1(String pd_6_2_1) {
		this.pd_6_2_1 = pd_6_2_1;
	}
	
	@Length(min=0, max=64, message="进行认知功能筛查类型的选择长度不能超过 64 个字符")
	public String getPd_6_2_2() {
		return pd_6_2_2;
	}

	public void setPd_6_2_2(String pd_6_2_2) {
		this.pd_6_2_2 = pd_6_2_2;
	}
	
	public Double getPd_6_2_3_1() {
		return pd_6_2_3_1;
	}

	public void setPd_6_2_3_1(Double pd_6_2_3_1) {
		this.pd_6_2_3_1 = pd_6_2_3_1;
	}
	
	public Double getPd_6_2_3_2() {
		return pd_6_2_3_2;
	}

	public void setPd_6_2_3_2(Double pd_6_2_3_2) {
		this.pd_6_2_3_2 = pd_6_2_3_2;
	}
	
	public Double getPd_6_2_3_3() {
		return pd_6_2_3_3;
	}

	public void setPd_6_2_3_3(Double pd_6_2_3_3) {
		this.pd_6_2_3_3 = pd_6_2_3_3;
	}
	
	public Double getPd_6_2_3_4() {
		return pd_6_2_3_4;
	}

	public void setPd_6_2_3_4(Double pd_6_2_3_4) {
		this.pd_6_2_3_4 = pd_6_2_3_4;
	}
	
	public Double getPd_6_2_3_5() {
		return pd_6_2_3_5;
	}

	public void setPd_6_2_3_5(Double pd_6_2_3_5) {
		this.pd_6_2_3_5 = pd_6_2_3_5;
	}
	
	public Double getPd_6_2_3() {
		return pd_6_2_3;
	}

	public void setPd_6_2_3(Double pd_6_2_3) {
		this.pd_6_2_3 = pd_6_2_3;
	}
	
	@Length(min=0, max=64, message="痴呆严重程度分级长度不能超过 64 个字符")
	public String getPd_6_2_4() {
		return pd_6_2_4;
	}

	public void setPd_6_2_4(String pd_6_2_4) {
		this.pd_6_2_4 = pd_6_2_4;
	}
	
	@Length(min=0, max=64, message="认知功能障碍类型长度不能超过 64 个字符")
	public String getPd_6_2_5() {
		return pd_6_2_5;
	}

	public void setPd_6_2_5(String pd_6_2_5) {
		this.pd_6_2_5 = pd_6_2_5;
	}
	
	@Length(min=0, max=64, message="完成日期时间长度不能超过 64 个字符")
	public String getPd_6_2_6() {
		return pd_6_2_6;
	}

	public void setPd_6_2_6(String pd_6_2_6) {
		this.pd_6_2_6 = pd_6_2_6;
	}
	
	@Length(min=0, max=64, message="其他进行认知功能筛查类型长度不能超过 64 个字符")
	public String getPd_6_2_2_1() {
		return pd_6_2_2_1;
	}

	public void setPd_6_2_2_1(String pd_6_2_2_1) {
		this.pd_6_2_2_1 = pd_6_2_2_1;
	}
	
	public Double getPd_6_2_7() {
		return pd_6_2_7;
	}

	public void setPd_6_2_7(Double pd_6_2_7) {
		this.pd_6_2_7 = pd_6_2_7;
	}
	
	@Length(min=0, max=64, message="痴呆严重程度分层长度不能超过 64 个字符")
	public String getPd_6_2_8() {
		return pd_6_2_8;
	}

	public void setPd_6_2_8(String pd_6_2_8) {
		this.pd_6_2_8 = pd_6_2_8;
	}
	
	@Length(min=0, max=64, message="是否实施认知功能障碍治疗长度不能超过 64 个字符")
	public String getPd_6_2_9() {
		return pd_6_2_9;
	}

	public void setPd_6_2_9(String pd_6_2_9) {
		this.pd_6_2_9 = pd_6_2_9;
	}
	
	@Length(min=0, max=64, message="认知功能障碍治疗措施的选择长度不能超过 64 个字符")
	public String getPd_6_2_10() {
		return pd_6_2_10;
	}

	public void setPd_6_2_10(String pd_6_2_10) {
		this.pd_6_2_10 = pd_6_2_10;
	}
	
	@Length(min=0, max=64, message="其他认知功能障碍治疗措施长度不能超过 64 个字符")
	public String getPd_6_2_10_1() {
		return pd_6_2_10_1;
	}

	public void setPd_6_2_10_1(String pd_6_2_10_1) {
		this.pd_6_2_10_1 = pd_6_2_10_1;
	}
	
	@Length(min=0, max=64, message="治疗医嘱执行日期时间长度不能超过 64 个字符")
	public String getPd_6_2_11() {
		return pd_6_2_11;
	}

	public void setPd_6_2_11(String pd_6_2_11) {
		this.pd_6_2_11 = pd_6_2_11;
	}
	
	@Length(min=0, max=64, message="是否实施心理状况的筛查长度不能超过 64 个字符")
	public String getPd_6_3_1() {
		return pd_6_3_1;
	}

	public void setPd_6_3_1(String pd_6_3_1) {
		this.pd_6_3_1 = pd_6_3_1;
	}
	
	@Length(min=0, max=64, message="进行心理状况筛查的项目长度不能超过 64 个字符")
	public String getPd_6_3_2() {
		return pd_6_3_2;
	}

	public void setPd_6_3_2(String pd_6_3_2) {
		this.pd_6_3_2 = pd_6_3_2;
	}
	
	@Length(min=0, max=64, message="完成日期时间长度不能超过 64 个字符")
	public String getPd_6_3_3() {
		return pd_6_3_3;
	}

	public void setPd_6_3_3(String pd_6_3_3) {
		this.pd_6_3_3 = pd_6_3_3;
	}
	
	@Length(min=0, max=64, message="是否实施睡眠状况的筛查长度不能超过 64 个字符")
	public String getPd_6_4_1() {
		return pd_6_4_1;
	}

	public void setPd_6_4_1(String pd_6_4_1) {
		this.pd_6_4_1 = pd_6_4_1;
	}
	
	@Length(min=0, max=64, message="进行睡眠状况筛查的项目长度不能超过 64 个字符")
	public String getPd_6_4_2() {
		return pd_6_4_2;
	}

	public void setPd_6_4_2(String pd_6_4_2) {
		this.pd_6_4_2 = pd_6_4_2;
	}
	
	@Length(min=0, max=64, message="其他睡眠状况筛查的项目长度不能超过 64 个字符")
	public String getPd_6_4_2_1() {
		return pd_6_4_2_1;
	}

	public void setPd_6_4_2_1(String pd_6_4_2_1) {
		this.pd_6_4_2_1 = pd_6_4_2_1;
	}
	
	@Length(min=0, max=64, message="完成日期时间长度不能超过 64 个字符")
	public String getPd_6_4_3() {
		return pd_6_4_3;
	}

	public void setPd_6_4_3(String pd_6_4_3) {
		this.pd_6_4_3 = pd_6_4_3;
	}
	
	@Length(min=0, max=64, message="入院查体时是否实施卧立位血压的检测长度不能超过 64 个字符")
	public String getPd_6_5_1() {
		return pd_6_5_1;
	}

	public void setPd_6_5_1(String pd_6_5_1) {
		this.pd_6_5_1 = pd_6_5_1;
	}
	
	public Double getPd_6_5_2_1() {
		return pd_6_5_2_1;
	}

	public void setPd_6_5_2_1(Double pd_6_5_2_1) {
		this.pd_6_5_2_1 = pd_6_5_2_1;
	}
	
	@Length(min=0, max=32, message="主要诊断ICD-10四位亚目编码与名称长度不能超过 32 个字符")
	public String getCm0131() {
		return cm0131;
	}

	public void setCm0131(String cm0131) {
		this.cm0131 = cm0131;
	}
	
	public Double getPd_6_5_2_2() {
		return pd_6_5_2_2;
	}

	public void setPd_6_5_2_2(Double pd_6_5_2_2) {
		this.pd_6_5_2_2 = pd_6_5_2_2;
	}
	
	public Double getPd_6_5_3_1() {
		return pd_6_5_3_1;
	}

	public void setPd_6_5_3_1(Double pd_6_5_3_1) {
		this.pd_6_5_3_1 = pd_6_5_3_1;
	}
	
	public Double getPd_6_5_3_2() {
		return pd_6_5_3_2;
	}

	public void setPd_6_5_3_2(Double pd_6_5_3_2) {
		this.pd_6_5_3_2 = pd_6_5_3_2;
	}
	
	public Double getPd_6_5_4_1() {
		return pd_6_5_4_1;
	}

	public void setPd_6_5_4_1(Double pd_6_5_4_1) {
		this.pd_6_5_4_1 = pd_6_5_4_1;
	}
	
	public Double getPd_6_5_4_2() {
		return pd_6_5_4_2;
	}

	public void setPd_6_5_4_2(Double pd_6_5_4_2) {
		this.pd_6_5_4_2 = pd_6_5_4_2;
	}
	
	public Double getPd_6_5_5_1() {
		return pd_6_5_5_1;
	}

	public void setPd_6_5_5_1(Double pd_6_5_5_1) {
		this.pd_6_5_5_1 = pd_6_5_5_1;
	}
	
	public Double getPd_6_5_5_2() {
		return pd_6_5_5_2;
	}

	public void setPd_6_5_5_2(Double pd_6_5_5_2) {
		this.pd_6_5_5_2 = pd_6_5_5_2;
	}
	
	public Double getPd_6_5_6_1() {
		return pd_6_5_6_1;
	}

	public void setPd_6_5_6_1(Double pd_6_5_6_1) {
		this.pd_6_5_6_1 = pd_6_5_6_1;
	}
	
	public Double getPd_6_5_6_2() {
		return pd_6_5_6_2;
	}

	public void setPd_6_5_6_2(Double pd_6_5_6_2) {
		this.pd_6_5_6_2 = pd_6_5_6_2;
	}
	
	@Length(min=0, max=64, message="完成日期时间长度不能超过 64 个字符")
	public String getPd_6_5_7() {
		return pd_6_5_7;
	}

	public void setPd_6_5_7(String pd_6_5_7) {
		this.pd_6_5_7 = pd_6_5_7;
	}
	
	@Length(min=0, max=64, message="告知患者,体位性低血压干预措施有记录长度不能超过 64 个字符")
	public String getPd_6_5_8() {
		return pd_6_5_8;
	}

	public void setPd_6_5_8(String pd_6_5_8) {
		this.pd_6_5_8 = pd_6_5_8;
	}
	
	@Length(min=0, max=64, message="其他体位性低血压干预措施记录长度不能超过 64 个字符")
	public String getPd_6_5_8_1() {
		return pd_6_5_8_1;
	}

	public void setPd_6_5_8_1(String pd_6_5_8_1) {
		this.pd_6_5_8_1 = pd_6_5_8_1;
	}
	
	@Length(min=0, max=64, message="是否为合并运动并发症的患者长度不能超过 64 个字符")
	public String getPd_7_1_1() {
		return pd_7_1_1;
	}

	public void setPd_7_1_1(String pd_7_1_1) {
		this.pd_7_1_1 = pd_7_1_1;
	}
	
	@Length(min=0, max=64, message="是否为原发性PD长度不能超过 64 个字符")
	public String getPd_7_1_2_1() {
		return pd_7_1_2_1;
	}

	public void setPd_7_1_2_1(String pd_7_1_2_1) {
		this.pd_7_1_2_1 = pd_7_1_2_1;
	}
	
	@Length(min=0, max=64, message="优化药物治疗后，仍存在下列情况之一者长度不能超过 64 个字符")
	public String getPd_7_1_2_2() {
		return pd_7_1_2_2;
	}

	public void setPd_7_1_2_2(String pd_7_1_2_2) {
		this.pd_7_1_2_2 = pd_7_1_2_2;
	}
	
	@Length(min=0, max=64, message="急性左旋多巴药物反应良好，存在下列情况之一者长度不能超过 64 个字符")
	public String getPd_7_1_2_3() {
		return pd_7_1_2_3;
	}

	public void setPd_7_1_2_3(String pd_7_1_2_3) {
		this.pd_7_1_2_3 = pd_7_1_2_3;
	}
	
	@Length(min=0, max=64, message="病程长度不能超过 64 个字符")
	public String getPd_7_1_2_4() {
		return pd_7_1_2_4;
	}

	public void setPd_7_1_2_4(String pd_7_1_2_4) {
		this.pd_7_1_2_4 = pd_7_1_2_4;
	}
	
	@Length(min=0, max=64, message="年龄长度不能超过 64 个字符")
	public String getPd_7_1_2_5() {
		return pd_7_1_2_5;
	}

	public void setPd_7_1_2_5(String pd_7_1_2_5) {
		this.pd_7_1_2_5 = pd_7_1_2_5;
	}
	
	@Length(min=0, max=64, message="手术禁忌证的选择长度不能超过 64 个字符")
	public String getPd_7_1_3() {
		return pd_7_1_3;
	}

	public void setPd_7_1_3(String pd_7_1_3) {
		this.pd_7_1_3 = pd_7_1_3;
	}
	
	@Length(min=0, max=64, message="完成日期时间长度不能超过 64 个字符")
	public String getPd_7_1_4() {
		return pd_7_1_4;
	}

	public void setPd_7_1_4(String pd_7_1_4) {
		this.pd_7_1_4 = pd_7_1_4;
	}
	
	@Length(min=0, max=64, message="是否进行脑深部电刺激手术长度不能超过 64 个字符")
	public String getPd_7_2_1() {
		return pd_7_2_1;
	}

	public void setPd_7_2_1(String pd_7_2_1) {
		this.pd_7_2_1 = pd_7_2_1;
	}
	
	@Length(min=0, max=64, message="实施脑深部电刺激手术长度不能超过 64 个字符")
	public String getPd_7_2_2() {
		return pd_7_2_2;
	}

	public void setPd_7_2_2(String pd_7_2_2) {
		this.pd_7_2_2 = pd_7_2_2;
	}
	
	@Length(min=0, max=64, message="实施脑深部电刺激其他手术长度不能超过 64 个字符")
	public String getPd_7_2_2_1() {
		return pd_7_2_2_1;
	}

	public void setPd_7_2_2_1(String pd_7_2_2_1) {
		this.pd_7_2_2_1 = pd_7_2_2_1;
	}
	
	@Length(min=0, max=64, message="DBS手术完成日期长度不能超过 64 个字符")
	public String getPd_7_2_3() {
		return pd_7_2_3;
	}

	public void setPd_7_2_3(String pd_7_2_3) {
		this.pd_7_2_3 = pd_7_2_3;
	}
	
	@Length(min=0, max=32, message="其他ICD-9-CM-3四位亚目编码与名称长度不能超过 32 个字符")
	public String getCm01411() {
		return cm01411;
	}

	public void setCm01411(String cm01411) {
		this.cm01411 = cm01411;
	}
	
	@Length(min=0, max=64, message="神经系统手术并发症长度不能超过 64 个字符")
	public String getPd_7_3_3() {
		return pd_7_3_3;
	}

	public void setPd_7_3_3(String pd_7_3_3) {
		this.pd_7_3_3 = pd_7_3_3;
	}
	
	@Length(min=0, max=64, message="其他术后并发症长度不能超过 64 个字符")
	public String getPd_7_3_3_1() {
		return pd_7_3_3_1;
	}

	public void setPd_7_3_3_1(String pd_7_3_3_1) {
		this.pd_7_3_3_1 = pd_7_3_3_1;
	}
	
	@Length(min=0, max=64, message="是否有冻结步态长度不能超过 64 个字符")
	public String getPd_8_1_1() {
		return pd_8_1_1;
	}

	public void setPd_8_1_1(String pd_8_1_1) {
		this.pd_8_1_1 = pd_8_1_1;
	}
	
	@Length(min=0, max=64, message="是否有冻结步态量表长度不能超过 64 个字符")
	public String getPd_8_1_2() {
		return pd_8_1_2;
	}

	public void setPd_8_1_2(String pd_8_1_2) {
		this.pd_8_1_2 = pd_8_1_2;
	}
	
	@Length(min=0, max=64, message="长度不能超过 64 个字符")
	public String getPd_8_1_3_1() {
		return pd_8_1_3_1;
	}

	public void setPd_8_1_3_1(String pd_8_1_3_1) {
		this.pd_8_1_3_1 = pd_8_1_3_1;
	}
	
	public Double getPd_8_1_3() {
		return pd_8_1_3;
	}

	public void setPd_8_1_3(Double pd_8_1_3) {
		this.pd_8_1_3 = pd_8_1_3;
	}
	
	@Length(min=0, max=64, message="评估日期时间长度不能超过 64 个字符")
	public String getPd_8_1_4() {
		return pd_8_1_4;
	}

	public void setPd_8_1_4(String pd_8_1_4) {
		this.pd_8_1_4 = pd_8_1_4;
	}
	
	@Length(min=0, max=64, message="康复方式选择长度不能超过 64 个字符")
	public String getPd_8_2_1() {
		return pd_8_2_1;
	}

	public void setPd_8_2_1(String pd_8_2_1) {
		this.pd_8_2_1 = pd_8_2_1;
	}
	
	@Length(min=0, max=64, message="康复实施日期长度不能超过 64 个字符")
	public String getPd_8_2_2() {
		return pd_8_2_2;
	}

	public void setPd_8_2_2(String pd_8_2_2) {
		this.pd_8_2_2 = pd_8_2_2;
	}
	
	@Length(min=0, max=64, message="未能进行康复原因长度不能超过 64 个字符")
	public String getPd_8_2_3() {
		return pd_8_2_3;
	}

	public void setPd_8_2_3(String pd_8_2_3) {
		this.pd_8_2_3 = pd_8_2_3;
	}
	
	@Length(min=0, max=32, message="其他ICD-9-CM-3六位临床扩展编码与名称长度不能超过 32 个字符")
	public String getCm01421() {
		return cm01421;
	}

	public void setCm01421(String cm01421) {
		this.cm01421 = cm01421;
	}
	
	@Length(min=0, max=64, message="入院时是否进行重点护理评估且有记录长度不能超过 64 个字符")
	public String getPd_9_1_1() {
		return pd_9_1_1;
	}

	public void setPd_9_1_1(String pd_9_1_1) {
		this.pd_9_1_1 = pd_9_1_1;
	}
	
	@Length(min=0, max=64, message="行走评估结果长度不能超过 64 个字符")
	public String getPd_9_1_1_1() {
		return pd_9_1_1_1;
	}

	public void setPd_9_1_1_1(String pd_9_1_1_1) {
		this.pd_9_1_1_1 = pd_9_1_1_1;
	}
	
	@Length(min=0, max=64, message="跌倒/坠床评估长度不能超过 64 个字符")
	public String getPd_9_1_2() {
		return pd_9_1_2;
	}

	public void setPd_9_1_2(String pd_9_1_2) {
		this.pd_9_1_2 = pd_9_1_2;
	}
	
	@Length(min=0, max=64, message="饮食评估结果长度不能超过 64 个字符")
	public String getPd_9_1_3() {
		return pd_9_1_3;
	}

	public void setPd_9_1_3(String pd_9_1_3) {
		this.pd_9_1_3 = pd_9_1_3;
	}
	
	@Length(min=0, max=64, message="吞咽评估结果长度不能超过 64 个字符")
	public String getPd_9_1_4() {
		return pd_9_1_4;
	}

	public void setPd_9_1_4(String pd_9_1_4) {
		this.pd_9_1_4 = pd_9_1_4;
	}
	
	@Length(min=0, max=64, message="误吸长度不能超过 64 个字符")
	public String getPd_9_1_5() {
		return pd_9_1_5;
	}

	public void setPd_9_1_5(String pd_9_1_5) {
		this.pd_9_1_5 = pd_9_1_5;
	}
	
	@Length(min=0, max=64, message="压疮评估是否无法确定或无记录长度不能超过 64 个字符")
	public String getPd_9_1_5_1() {
		return pd_9_1_5_1;
	}

	public void setPd_9_1_5_1(String pd_9_1_5_1) {
		this.pd_9_1_5_1 = pd_9_1_5_1;
	}
	
	public Double getPd_9_1_6() {
		return pd_9_1_6;
	}

	public void setPd_9_1_6(Double pd_9_1_6) {
		this.pd_9_1_6 = pd_9_1_6;
	}
	
	@Length(min=0, max=64, message="压疮评估结果选择长度不能超过 64 个字符")
	public String getPd_9_1_6_1() {
		return pd_9_1_6_1;
	}

	public void setPd_9_1_6_1(String pd_9_1_6_1) {
		this.pd_9_1_6_1 = pd_9_1_6_1;
	}
	
	@Length(min=0, max=64, message="预防压疮是否告知长度不能超过 64 个字符")
	public String getPd_9_1_6_2() {
		return pd_9_1_6_2;
	}

	public void setPd_9_1_6_2(String pd_9_1_6_2) {
		this.pd_9_1_6_2 = pd_9_1_6_2;
	}
	
	@Length(min=0, max=64, message="Wells深静脉血栓风险评分长度不能超过 64 个字符")
	public String getPd_9_1_7() {
		return pd_9_1_7;
	}

	public void setPd_9_1_7(String pd_9_1_7) {
		this.pd_9_1_7 = pd_9_1_7;
	}
	
	@Length(min=0, max=64, message="尿失禁评估长度不能超过 64 个字符")
	public String getPd_9_1_8() {
		return pd_9_1_8;
	}

	public void setPd_9_1_8(String pd_9_1_8) {
		this.pd_9_1_8 = pd_9_1_8;
	}
	
	@Length(min=0, max=64, message="疼痛评估长度不能超过 64 个字符")
	public String getPd_9_1_9() {
		return pd_9_1_9;
	}

	public void setPd_9_1_9(String pd_9_1_9) {
		this.pd_9_1_9 = pd_9_1_9;
	}
	
	@Length(min=0, max=64, message="DBS前、后是否实施健康教育有记录长度不能超过 64 个字符")
	public String getPd_9_1_2_1() {
		return pd_9_1_2_1;
	}

	public void setPd_9_1_2_1(String pd_9_1_2_1) {
		this.pd_9_1_2_1 = pd_9_1_2_1;
	}
	
	@Length(min=0, max=64, message="手术长度不能超过 64 个字符")
	public String getPd_9_1_2_2() {
		return pd_9_1_2_2;
	}

	public void setPd_9_1_2_2(String pd_9_1_2_2) {
		this.pd_9_1_2_2 = pd_9_1_2_2;
	}
	
	@Length(min=0, max=64, message="手术长度不能超过 64 个字符")
	public String getPd_9_1_3_3() {
		return pd_9_1_3_3;
	}

	public void setPd_9_1_3_3(String pd_9_1_3_3) {
		this.pd_9_1_3_3 = pd_9_1_3_3;
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