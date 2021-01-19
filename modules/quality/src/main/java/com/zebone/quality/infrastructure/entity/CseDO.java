package com.zebone.quality.infrastructure.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "QUALITY_CSE")
public class CseDO extends BaseEntity{


    @Column(columnDefinition = "varchar(64) COMMENT '是否现场评估生命体征'")
    private String cse_0_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否现场记录发作开始时间'")
    private String cse_0_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '现场急救维持生命体征稳定'")
    private String cse_0_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '本院首诊医师接诊日期时间'")
    private Date cse_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '既往诊断过癫痫'")
    private String cse_1_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否服用过抗癫痫药物'")
    private String cse_1_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '评估发作起始日期'")
    private Date cse_1_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '绿色通道中观察期所采取的紧急救治措施'")
    private String cse_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其它绿色通道中观察期所可采取的紧急救治措施'")
    private String cse_1_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '完成紧急救治措施的日期时间'")
    private Date cse_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '实施严重程度STESS评估'")
    private String cse_1_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '完成评估日期时间'")
    private Date cse_1_2_4;
    @Column(columnDefinition = "double COMMENT '实施严重程度STESS评估分值'")
    private Double cse_1_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施EMSE评估'")
    private String cse_1_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '完成评估日期时间'")
    private Date cse_1_2_3_2;
    @Column(columnDefinition = "double COMMENT '实施严重程度EMSE评估分值'")
    private Double cse_1_2_3_3;
    @Column(columnDefinition = "double COMMENT '呼吸(单位:次/分)'")
    private Double cse_1_2_6_1;
    @Column(columnDefinition = "double COMMENT '脉搏(单位:次/分)'")
    private Double cse_1_2_6_2;
    @Column(columnDefinition = "double COMMENT '收缩压(单位:mmHg)'")
    private Double cse_1_2_6_3;
    @Column(columnDefinition = "double COMMENT '舒张压(单位:mmHg)'")
    private Double cse_1_2_6_4;
    @Column(columnDefinition = "double COMMENT '身高(单位:厘米(cm))'")
    private Double cse_1_2_6_5;
    @Column(columnDefinition = "double COMMENT '体重(单位:公斤(kg))'")
    private Double cse_1_2_6_6;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行血/尿药物浓度筛查'")
    private String cse_1_2_7;
    @Column(columnDefinition = "varchar(64) COMMENT '药物浓度筛查报告日期时间是否确定'")
    private String cse_1_2_8_1;
    @Column(columnDefinition = "varchar(64) COMMENT '药物浓度筛查报告日期时间'")
    private Date cse_1_2_8;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行毒物筛查'")
    private String cse_1_2_9;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施首次心电图（ECG）检查'")
    private String cse_1_2_10;
    @Column(columnDefinition = "varchar(64) COMMENT '报告日期时间'")
    private Date cse_1_2_11;
    @Column(columnDefinition = "varchar(64) COMMENT '心电图（ECG）检查结果选择'")
    private String cse_1_2_12;
    @Column(columnDefinition = "varchar(64) COMMENT '其他心电图（ECG）检查结果选择'")
    private String cse_1_2_12_1;
    @Column(columnDefinition = "varchar(64) COMMENT '初始治疗选择'")
    private String cse_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '有静脉通路：静脉注射地西泮'")
    private String cse_2_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他有静脉通路'")
    private String cse_2_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '静脉注射时间'")
    private Date cse_2_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '无静脉通路:肌肉注射米达唑仑'")
    private String cse_2_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他无静脉通路'")
    private String cse_2_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '肌肉注射时间'")
    private Date cse_2_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否达到终止标准'")
    private String cse_2_2_0;
    @Column(columnDefinition = "varchar(64) COMMENT '达到终止标准依据'")
    private String cse_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '脑电图（EEG）检查结果选择'")
    private String cse_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他脑电图（EEG）检查结果'")
    private String cse_2_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '治疗后发作缓解时间'")
    private Date cse_2_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '终止发作后是否进行过渡治疗'")
    private String cse_2_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他终止发作后是否进行过渡治疗'")
    private String cse_2_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '实施初始治疗失败'")
    private String cse_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '给予第二阶段（20-40min) 静脉治疗'")
    private String cse_3_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他第二阶段（20-40min) 静脉治疗'")
    private String cse_3_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '静脉治疗时间'")
    private Date cse_3_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否达到终止标准'")
    private String cse_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '脑电图（EEG）检查结果选择'")
    private String cse_3_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他脑电图（EEG）检查结果'")
    private String cse_3_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '治疗后发作缓解时间'")
    private Date cse_3_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '终止发作后是否进行过渡治疗'")
    private String cse_3_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他终止发作后是否进行过渡治疗'")
    private String cse_3_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '第二阶段静脉治疗失败'")
    private String cse_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '给予第三阶段（40-60min) 治疗'")
    private String cse_4_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他第三阶段（40-60min) 治疗'")
    private String cse_4_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'super-RSE治疗'")
    private String cse_4_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '外科手术'")
    private String cse_4_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他super-RSE治疗'")
    private String cse_4_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '进入难治性癫痫持续状态RSE治疗时间'")
    private Date cse_4_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否达到终止标准'")
    private String cse_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '脑电图（EEG）检查结果选择'")
    private String cse_4_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他脑电图（EEG）检查结果'")
    private String cse_4_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '治疗后发作缓解时间'")
    private Date cse_4_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT 'RSE终止发作后是否进行过渡治疗'")
    private String cse_4_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他RSE终止发作后是否进行过渡治疗'")
    private String cse_4_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进入ICU提供相应生命支持'")
    private String cse_5_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '入住ICU日期时间'")
    private Date cse_5_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '提供相应生命支持'")
    private String cse_5_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他提供相应生命支持'")
    private String cse_5_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施无创正压通气（NIPPV）'")
    private String cse_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者无创正压通气起始日期时间'")
    private Date cse_5_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '患者无创正压通气终止日期时间'")
    private Date cse_5_2_3;
    @Column(columnDefinition = "double COMMENT '无创正压通气疗程（天数）'")
    private Double cse_5_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施有创机械通气'")
    private String cse_5_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者有机械通气起始日期时间'")
    private Date cse_5_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '患者有机械通气终止日期时间'")
    private Date cse_5_3_3;
    @Column(columnDefinition = "double COMMENT '有机械通气疗程（天数）'")
    private Double cse_5_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施首次头部影像学检查'")
    private String cse_6_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '头部影像学检查项目'")
    private String cse_6_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '报告日期时间'")
    private Date cse_6_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '实施首次脑脊液检查'")
    private String cse_6_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '脑脊液检查项目'")
    private String cse_6_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '报告日期时间'")
    private Date cse_6_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '既往是否诊断癫痫'")
    private String cse_6_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '近期发作情况为'")
    private String cse_6_3_6;
    @Column(columnDefinition = "varchar(64) COMMENT '具体发作频率为'")
    private String cse_6_3_7;
    @Column(columnDefinition = "varchar(64) COMMENT '发作是否为局灶起源'")
    private String cse_6_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '发作是否伴知觉障碍'")
    private String cse_6_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '发作是否以运动症状起病'")
    private String cse_6_3_5;
    @Column(columnDefinition = "varchar(64) COMMENT '发作是否为全面起源'")
    private String cse_6_3_8;
    @Column(columnDefinition = "varchar(64) COMMENT '发作包含何种表现'")
    private String cse_6_3_9;
    @Column(columnDefinition = "varchar(64) COMMENT '发作是否为未知起源（指发作起源被错过或掩盖）'")
    private String cse_6_3_10;
    @Column(columnDefinition = "varchar(64) COMMENT '是否为不能分类的癫痫发作（根据现有信息无法分类的发作）'")
    private String cse_6_3_11;
    @Column(columnDefinition = "varchar(64) COMMENT '是否服用过抗癫痫药物'")
    private String cse_6_3_12;
    @Column(columnDefinition = "varchar(64) COMMENT '首次使用抗癫痫药物日期'")
    private Date cse_6_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '使用的抗癫痫药物种类'")
    private String cse_6_3_13;
    @Column(columnDefinition = "varchar(64) COMMENT '其他抗癫痫药物种类'")
    private String cse_6_3_13_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否目前正在使用此药，并且已连续规律使用三个月及以上'")
    private String cse_6_3_14;
    @Column(columnDefinition = "varchar(64) COMMENT '既往或者现在使用此药期间是否有严重不良事件'")
    private String cse_6_3_15;
    @Column(columnDefinition = "varchar(64) COMMENT '是否入院时进行重点护理评估且有记录'")
    private String cse_7_1_0;
    @Column(columnDefinition = "varchar(64) COMMENT '行走评估结果'")
    private String cse_7_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '呼吸评估结果'")
    private String cse_7_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '饮食评估结果'")
    private String cse_7_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '吞咽评估结果'")
    private String cse_7_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '压疮评估（Braden评分值）分值'")
    private String cse_7_1_5_0;
    @Column(columnDefinition = "double COMMENT '压疮评估（Braden评分值）分值'")
    private Double cse_7_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '压疮评估结果选择'")
    private String cse_7_1_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '预防压疮告知'")
    private String cse_7_1_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '实施癫痫持续状态健康教育有记录'")
    private String cse_7_1_6;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时是否进行STESS评分'")
    private String cse_7_2_1;
    @Column(columnDefinition = "double COMMENT 'STESS评分值'")
    private Double cse_7_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '交与患者“出院小结”的副本，并告知患者出院时风险因素'")
    private String cse_7_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药'")
    private String cse_7_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '告知发生紧急情况时求援救治途径'")
    private String cse_7_2_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时教育与随访'")
    private String cse_7_2_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '告知何为风险因素与紧急情况'")
    private String cse_7_2_2_5;



}
