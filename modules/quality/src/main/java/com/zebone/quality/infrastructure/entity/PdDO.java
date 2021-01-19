package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "QUALITY_PD")
@Data
public class PdDO extends BaseEntity{


    @Column(columnDefinition = "varchar(64) COMMENT '其他主要手术操作ICD-9-CM-3四位亚目编码与名称'")
    private String pd_0_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要手术操作ICD-9-CM-3六位临床扩展编码与名称'")
    private String pd_0_1_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '绝对排除标准'")
    private String pd_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否在发病 5 年内出现快速进展的步态障碍，且需要规律使用轮椅'")
    private String pd_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否发病 5 年或 5 年以上，运动症状或体征完全没有进展；除非这种稳定是与治疗相关的'")
    private String pd_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否早期出现的球部功能障碍：发病 5 年内出现的严重的发音困难或构音障碍（大部分时候言语难以理解）或严重的吞咽困难（需要进食较软的食物，或鼻胃管、胃造瘘进食）'")
    private String pd_1_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有吸气性呼吸功能障碍：出现白天或夜间吸气性喘鸣或者频繁的吸气性叹息'")
    private String pd_1_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否在发病 5 年内出现严重的自主神经功能障碍'")
    private String pd_1_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '出现严重的自主神经功能障碍具体表现为'")
    private String pd_1_2_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否在发病 3 年内由于平衡损害导致的反复（>1 次 / 年）摔倒'")
    private String pd_1_2_6;
    @Column(columnDefinition = "varchar(64) COMMENT '是否在发病 10 年内出现不成比例地颈部前倾（肌张力障碍）或手足挛缩'")
    private String pd_1_2_7;
    @Column(columnDefinition = "varchar(64) COMMENT '是否是病程到了 5 年也不出现任何一种常见的非运动症状，包括睡眠障碍（保持睡眠障碍性失眠、日间过度嗜睡、快速眼动期睡眠行为障碍），自主神经功能障碍（便秘、日间尿急、症状性体位性低血压）、嗅觉减退、精神障碍（抑郁、焦虑、或幻觉）'")
    private String pd_1_2_8;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有其他原因不能解释的锥体束征，定义为锥体束性肢体无力或明确的病理性反射活跃（包括轻度的反射不对称以及孤立性的跖趾反应）'")
    private String pd_1_2_9;
    @Column(columnDefinition = "varchar(64) COMMENT '是否是双侧对称性的帕金森综合征。患者或看护者报告为双侧起病，没有任何侧别优势，且客观体格检查也没有观察到明显的侧别性'")
    private String pd_1_2_10;
    @Column(columnDefinition = "varchar(64) COMMENT '是否对多巴胺药物治疗具有明确且显著的有效应答'")
    private String pd_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '初始治疗显著应答表现为'")
    private String pd_1_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否出现左旋多巴诱导的异动症'")
    private String pd_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '临床体格检查记录的单个肢体静止性震颤（既往或本次检查）'")
    private String pd_1_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '存在嗅觉丧失或心脏 MIBG 闪烁显像法显示存在心脏去交感神经支配'")
    private String pd_1_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '帕金森病标准选择'")
    private String pd_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者确诊帕金森病（PD）的主要依据'")
    private String pd_1_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '患者诊断为可能帕金森病（PD）的主要依据'")
    private String pd_1_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施头部MRI检查'")
    private String pd_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '完成MRI序列'")
    private String pd_2_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施头部CT检查'")
    private String pd_2_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '报告日期时间'")
    private Date pd_2_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施黑质超声检查'")
    private String pd_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '报告日期时间'")
    private Date pd_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施震颤分析检查'")
    private String pd_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '报告日期时间'")
    private Date pd_2_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施肛门括约肌肌电图检查'")
    private String pd_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '报告日期时间'")
    private Date pd_2_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施头PET检查'")
    private String pd_2_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '完成头PET项目'")
    private String pd_2_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他头PET项目'")
    private String pd_2_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '报告日期时间'")
    private Date pd_2_5_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行多巴胺能反应性评测'")
    private String pd_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '评测适应症的选择'")
    private String pd_3_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有被选择评测药物的禁忌症'")
    private String pd_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '评测药物的禁忌症'")
    private String pd_3_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '多巴丝肼片（美多芭）禁忌症的选择'")
    private String pd_3_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他多巴丝肼片（美多芭）禁忌症'")
    private String pd_3_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '卡左双多巴（息宁）禁忌症的选择'")
    private String pd_3_2_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他卡左双多巴（息宁）禁忌症'")
    private String pd_3_2_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '盐酸苯海索（安坦）禁忌症的选择'")
    private String pd_3_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他盐酸苯海索（安坦）禁忌症'")
    private String pd_3_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '盐酸阿罗洛尔（阿尔马尔）禁忌症的选择'")
    private String pd_3_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他盐酸阿罗洛尔（阿尔马尔）禁忌症'")
    private String pd_3_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '盐酸普拉克索（森福罗）禁忌症的选择'")
    private String pd_3_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '其他盐酸普拉克索（森福罗）禁忌症'")
    private String pd_3_2_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '盐酸金刚烷胺禁忌症的选择'")
    private String pd_3_2_6;
    @Column(columnDefinition = "varchar(64) COMMENT '其他盐酸金刚烷胺禁忌症'")
    private String pd_3_2_6_1;
    @Column(columnDefinition = "varchar(64) COMMENT '恩他卡朋禁忌症的选择'")
    private String pd_3_2_7;
    @Column(columnDefinition = "varchar(64) COMMENT '其他恩他卡朋禁忌症'")
    private String pd_3_2_7_1;
    @Column(columnDefinition = "varchar(64) COMMENT '雷沙吉兰禁忌症的选择'")
    private String pd_3_2_8;
    @Column(columnDefinition = "varchar(64) COMMENT '其他雷沙吉兰禁忌症'")
    private String pd_3_2_8_1;
    @Column(columnDefinition = "varchar(64) COMMENT '盐酸罗匹尼罗禁忌症的选择'")
    private String pd_3_2_9;
    @Column(columnDefinition = "varchar(64) COMMENT '其他盐酸罗匹尼罗禁忌症'")
    private String pd_3_2_9_1;
    @Column(columnDefinition = "varchar(64) COMMENT '司来吉兰禁忌症的选择'")
    private String pd_3_2_10;
    @Column(columnDefinition = "varchar(64) COMMENT '其他司来吉兰禁忌症'")
    private String pd_3_2_10_1;
    @Column(columnDefinition = "varchar(64) COMMENT '运动检查 '")
    private String pd_3_3_3;
    @Column(columnDefinition = "double COMMENT '基线值（关期)'")
    private Double pd_3_3_1_1;
    @Column(columnDefinition = "double COMMENT '最佳改善值（开期）'")
    private Double pd_3_3_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '疗效反应结论的选择'")
    private String pd_3_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '不良反应风险的选择'")
    private String pd_3_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '完成日期时间'")
    private Date pd_3_6_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否在入院24小时进行帕金森病Hoehn-Yahr分期评估'")
    private String pd_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '临床分期依据一: 主要有那些临床表现及体征'")
    private String pd_4_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'H-Y分期结论'")
    private String pd_4_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '完成日期时间'")
    private Date pd_4_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行神经功能缺损评估'")
    private String pd_5_1_1;
    @Column(columnDefinition = "double COMMENT '第一部分：日常生活非运动症状体验'")
    private Double pd_5_1_2;
    @Column(columnDefinition = "double COMMENT '第二部分：日常生活运动症状体验'")
    private Double pd_5_1_3;
    @Column(columnDefinition = "double COMMENT '第三部分：运动功能检查'")
    private Double pd_5_1_4;
    @Column(columnDefinition = "double COMMENT '第四部分：运动并发症'")
    private Double pd_5_1_5;
    @Column(columnDefinition = "double COMMENT '日常分值合计'")
    private Double pd_5_1_6;
    @Column(columnDefinition = "varchar(64) COMMENT '完成日期时间'")
    private Date pd_5_1_7;
    @Column(columnDefinition = "varchar(64) COMMENT '运动并发症类型'")
    private String pd_6_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '剂末现象的筛查'")
    private String pd_6_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他剂末现象'")
    private String pd_6_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '剂末现象的处理'")
    private String pd_6_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他剂末现象处理'")
    private String pd_6_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '异动症类型'")
    private String pd_6_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '剂峰异动症处理'")
    private String pd_6_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他剂峰异动处理'")
    private String pd_6_1_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '剂末异动症处理'")
    private String pd_6_1_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他剂末异动处理'")
    private String pd_6_1_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '双相异动症处理'")
    private String pd_6_1_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他双相异动处理'")
    private String pd_6_1_4_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '筛查完成日期时间'")
    private Date pd_6_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施筛查认知功能障碍评估'")
    private String pd_6_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '进行认知功能筛查类型的选择'")
    private String pd_6_2_2;
    @Column(columnDefinition = "double COMMENT '定向力筛查结果'")
    private Double pd_6_2_3_1;
    @Column(columnDefinition = "double COMMENT '记忆力筛查结果'")
    private Double pd_6_2_3_2;
    @Column(columnDefinition = "double COMMENT '注意力和计算力筛查结果'")
    private Double pd_6_2_3_3;
    @Column(columnDefinition = "double COMMENT '回忆能力筛查结果'")
    private Double pd_6_2_3_4;
    @Column(columnDefinition = "double COMMENT '语言能力筛查结果'")
    private Double pd_6_2_3_5;
    @Column(columnDefinition = "double COMMENT '入院1周完成筛查认知功能障碍（MMSE）评估分值'")
    private Double pd_6_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '痴呆严重程度分级'")
    private String pd_6_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '认知功能障碍类型'")
    private String pd_6_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '完成日期时间'")
    private Date pd_6_2_6;
    @Column(columnDefinition = "varchar(64) COMMENT '其他进行认知功能筛查类型'")
    private String pd_6_2_2_1;
    @Column(columnDefinition = "double COMMENT 'Moca量表评分值'")
    private Double pd_6_2_7;
    @Column(columnDefinition = "varchar(64) COMMENT '痴呆严重程度分层'")
    private String pd_6_2_8;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施认知功能障碍治疗'")
    private String pd_6_2_9;
    @Column(columnDefinition = "varchar(64) COMMENT '认知功能障碍治疗措施的选择'")
    private String pd_6_2_10;
    @Column(columnDefinition = "varchar(64) COMMENT '其他认知功能障碍治疗措施'")
    private String pd_6_2_10_1;
    @Column(columnDefinition = "varchar(64) COMMENT '治疗医嘱执行日期时间'")
    private Date pd_6_2_11;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施心理状况的筛查'")
    private String pd_6_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '进行心理状况筛查的项目'")
    private String pd_6_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '完成日期时间'")
    private Date pd_6_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施睡眠状况的筛查'")
    private String pd_6_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '进行睡眠状况筛查的项目'")
    private String pd_6_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他睡眠状况筛查的项目'")
    private String pd_6_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '完成日期时间'")
    private Date pd_6_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '入院查体时是否实施卧立位血压的检测'")
    private String pd_6_5_1;
    @Column(columnDefinition = "double COMMENT '卧位血压-收缩压(mmHg)'")
    private Double pd_6_5_2_1;
    @Column(columnDefinition = "double COMMENT '卧位血压-舒张压(mmHg)'")
    private Double pd_6_5_2_2;
    @Column(columnDefinition = "double COMMENT '立位即刻血压-收缩压(mmHg)'")
    private Double pd_6_5_3_1;
    @Column(columnDefinition = "double COMMENT '立位即刻血压-舒张压(mmHg)'")
    private Double pd_6_5_3_2;
    @Column(columnDefinition = "double COMMENT '立位1min血压-收缩压(mmHg)'")
    private Double pd_6_5_4_1;
    @Column(columnDefinition = "double COMMENT '立位1min血压-舒张压(mmHg)'")
    private Double pd_6_5_4_2;
    @Column(columnDefinition = "double COMMENT '立位3min血压-收缩压(mmHg)'")
    private Double pd_6_5_5_1;
    @Column(columnDefinition = "double COMMENT '立位3min血压-舒张压(mmHg)'")
    private Double pd_6_5_5_2;
    @Column(columnDefinition = "double COMMENT '立位大于3min血压-收缩压(mmHg)'")
    private Double pd_6_5_6_1;
    @Column(columnDefinition = "double COMMENT '立位大于3min血压-舒张压(mmHg)'")
    private Double pd_6_5_6_2;
    @Column(columnDefinition = "varchar(64) COMMENT '完成日期时间'")
    private Date pd_6_5_7;
    @Column(columnDefinition = "varchar(64) COMMENT '告知患者,体位性低血压干预措施有记录'")
    private String pd_6_5_8;
    @Column(columnDefinition = "varchar(64) COMMENT '其他体位性低血压干预措施记录'")
    private String pd_6_5_8_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否为合并运动并发症的患者'")
    private String pd_7_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否为原发性PD'")
    private String pd_7_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '优化药物治疗后，仍存在下列情况之一者'")
    private String pd_7_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '急性左旋多巴药物反应良好，存在下列情况之一者'")
    private String pd_7_1_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '病程'")
    private String pd_7_1_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '年龄：符合一条'")
    private String pd_7_1_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '手术禁忌证的选择'")
    private String pd_7_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '完成日期时间'")
    private Date pd_7_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行脑深部电刺激手术（DBS）'")
    private String pd_7_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '实施脑深部电刺激手术（DBS）的ICD-9-CM-3四位亚目编码及名称的选择'")
    private String pd_7_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '实施脑深部电刺激其他手术'")
    private String pd_7_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'DBS手术完成日期'")
    private Date pd_7_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '神经系统手术并发症'")
    private String pd_7_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他术后并发症'")
    private String pd_7_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有冻结步态'")
    private String pd_8_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有冻结步态量表（FOG-Q）评分'")
    private String pd_8_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '(FOG-Q）评分值是否确定'")
    private String pd_8_1_3_1;
    @Column(columnDefinition = "double COMMENT '冻结步态量表（FOG-Q）评分值'")
    private Double pd_8_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '评估日期时间'")
    private Date pd_8_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '康复方式选择'")
    private String pd_8_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '康复实施日期(首次)'")
    private Date pd_8_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '未能进行康复原因'")
    private String pd_8_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '入院时是否进行重点护理评估且有记录'")
    private String pd_9_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '行走评估结果'")
    private String pd_9_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '跌倒/坠床评估'")
    private String pd_9_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '饮食评估结果'")
    private String pd_9_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '吞咽评估结果'")
    private String pd_9_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '误吸'")
    private String pd_9_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '压疮评估是否无法确定或无记录'")
    private String pd_9_1_5_1;
    @Column(columnDefinition = "double COMMENT '压疮评估（Braden评分值）分值'")
    private Double pd_9_1_6;
    @Column(columnDefinition = "varchar(64) COMMENT '压疮评估结果选择'")
    private String pd_9_1_6_1;
    @Column(columnDefinition = "varchar(64) COMMENT '预防压疮是否告知'")
    private String pd_9_1_6_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'Wells深静脉血栓风险评分'")
    private String pd_9_1_7;
    @Column(columnDefinition = "varchar(64) COMMENT '尿失禁评估'")
    private String pd_9_1_8;
    @Column(columnDefinition = "varchar(64) COMMENT '疼痛评估'")
    private String pd_9_1_9;
    @Column(columnDefinition = "varchar(64) COMMENT 'DBS前、后是否实施健康教育有记录'")
    private String pd_9_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术（DBS）前健康教育有记录'")
    private String pd_9_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '手术（DBS）后健康教育有记录'")
    private String pd_9_1_3_3;
}
