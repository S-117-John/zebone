package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "QUALITY_CSE")
@Data
public class CseDO extends DataEntity{


    @Column(columnDefinition = "varchar(64) COMMENT '质控医师'")
    private String cm_0_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '质控护士'")
    private String cm_0_1_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '主治医师'")
    private String cm_0_1_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '责任护士'")
    private String cm_0_1_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '上报科室'")
    private String cm_0_1_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '患者病案号'")
    private String caseid;
    @Column(columnDefinition = "varchar(64) COMMENT '主要诊断或其他诊断ICD-10四位亚目编码与名称'")
    private String cm_0_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要诊断或其他诊断ICD-10六位临床扩展编码与名称'")
    private String cm_0_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称'")
    private String cm_0_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他ICD-9-CM-3四位亚目编码与名称'")
    private String cm_0_1_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称'")
    private String cm_0_1_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他ICD-9-CM-3六位临床扩展编码与名称'")
    private String cm_0_1_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'CSE出院后31天内是否重复住院'")
    private String cm_0_1_5;
    @Column(columnDefinition = "datetime COMMENT '出生日期'")
    private Date cm_0_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者性别'")
    private String cm_0_2_1_2;
    @Column(columnDefinition = "double COMMENT '患者体重（kg）'")
    private Double cm_0_2_1_3;
    @Column(columnDefinition = "double COMMENT '患者身高（cm）'")
    private Double cm_0_2_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '发病日期时间是否无法确定或无记录'")
    private String cm_0_2_2_1;
    @Column(columnDefinition = "datetime COMMENT '发病日期时间'")
    private Date cm_0_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '到达本院急诊或者门诊日期时间是否无法确定或无记录'")
    private String cm_0_2_3_1;
    @Column(columnDefinition = "datetime COMMENT '到达本院急诊或者门诊日期时间'")
    private Date cm_0_2_3_2;
    @Column(columnDefinition = "datetime COMMENT '入院日期时间'")
    private Date cm_0_2_4_1;
    @Column(columnDefinition = "datetime COMMENT '出院日期时间'")
    private Date cm_0_2_4_2;
    @Column(columnDefinition = "datetime COMMENT '入住ICU日期时间'")
    private Date cm_0_2_5_1;
    @Column(columnDefinition = "datetime COMMENT '离开ICU日期时间'")
    private Date cm_0_2_5_2;
    @Column(columnDefinition = "datetime COMMENT '手术开始（切皮）日期时间'")
    private Date cm_0_2_6_1;
    @Column(columnDefinition = "datetime COMMENT '手术结束（缝皮结束）日期时间'")
    private Date cm_0_2_6_2;
    @Column(columnDefinition = "varchar(64) COMMENT '费用支付方式'")
    private String cm_0_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '收入住院途径'")
    private String cm_0_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '到院交通工具'")
    private String cm_0_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否现场评估生命体征'")
    private String cse_0_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否现场记录发作开始时间'")
    private String cse_0_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '现场急救维持生命体征稳定'")
    private String cse_0_4_3;
    @Column(columnDefinition = "datetime COMMENT '本院首诊医师接诊日期时间'")
    private Date cse_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '既往诊断过癫痫'")
    private String cse_1_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否服用过抗癫痫药物'")
    private String cse_1_1_3;
    @Column(columnDefinition = "datetime COMMENT '评估发作起始日期'")
    private Date cse_1_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '绿色通道中观察期所采取的紧急救治措施'")
    private String cse_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其它绿色通道中观察期所可采取的紧急救治措施'")
    private String cse_1_2_1_1;
    @Column(columnDefinition = "datetime COMMENT '完成紧急救治措施的日期时间'")
    private Date cse_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '实施严重程度STESS评估'")
    private String cse_1_2_3;
    @Column(columnDefinition = "datetime COMMENT '完成评估日期时间'")
    private Date cse_1_2_4;
    @Column(columnDefinition = "double COMMENT '实施严重程度STESS评估分值'")
    private Double cse_1_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施EMSE评估'")
    private String cse_1_2_3_1;
    @Column(columnDefinition = "datetime COMMENT '完成评估日期时间'")
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
    @Column(columnDefinition = "datetime COMMENT '药物浓度筛查报告日期时间'")
    private Date cse_1_2_8;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行毒物筛查'")
    private String cse_1_2_9;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施首次心电图（ECG）检查'")
    private String cse_1_2_10;
    @Column(columnDefinition = "datetime COMMENT '报告日期时间'")
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
    @Column(columnDefinition = "datetime COMMENT '静脉注射时间'")
    private Date cse_2_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '无静脉通路:肌肉注射米达唑仑'")
    private String cse_2_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他无静脉通路'")
    private String cse_2_1_4_1;
    @Column(columnDefinition = "datetime COMMENT '肌肉注射时间'")
    private Date cse_2_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否达到终止标准'")
    private String cse_2_2_0;
    @Column(columnDefinition = "varchar(64) COMMENT '达到终止标准依据'")
    private String cse_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '脑电图（EEG）检查结果选择'")
    private String cse_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他脑电图（EEG）检查结果'")
    private String cse_2_2_2_1;
    @Column(columnDefinition = "datetime COMMENT '治疗后发作缓解时间'")
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
    @Column(columnDefinition = "datetime COMMENT '静脉治疗时间'")
    private Date cse_3_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否达到终止标准'")
    private String cse_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '脑电图（EEG）检查结果选择'")
    private String cse_3_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他脑电图（EEG）检查结果'")
    private String cse_3_2_2_1;
    @Column(columnDefinition = "datetime COMMENT '治疗后发作缓解时间'")
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
    @Column(columnDefinition = "datetime COMMENT '进入难治性癫痫持续状态RSE治疗时间'")
    private Date cse_4_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否达到终止标准'")
    private String cse_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '脑电图（EEG）检查结果选择'")
    private String cse_4_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他脑电图（EEG）检查结果'")
    private String cse_4_2_2_1;
    @Column(columnDefinition = "datetime COMMENT '治疗后发作缓解时间'")
    private Date cse_4_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT 'RSE终止发作后是否进行过渡治疗'")
    private String cse_4_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他RSE终止发作后是否进行过渡治疗'")
    private String cse_4_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进入ICU提供相应生命支持'")
    private String cse_5_1_1;
    @Column(columnDefinition = "datetime COMMENT '入住ICU日期时间'")
    private Date cse_5_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '提供相应生命支持'")
    private String cse_5_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他提供相应生命支持'")
    private String cse_5_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施无创正压通气（NIPPV）'")
    private String cse_5_2_1;
    @Column(columnDefinition = "datetime COMMENT '患者无创正压通气起始日期时间'")
    private Date cse_5_2_2;
    @Column(columnDefinition = "datetime COMMENT '患者无创正压通气终止日期时间'")
    private Date cse_5_2_3;
    @Column(columnDefinition = "double COMMENT '无创正压通气疗程（天数）'")
    private Double cse_5_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施有创机械通气'")
    private String cse_5_3_1;
    @Column(columnDefinition = "datetime COMMENT '患者有机械通气起始日期时间'")
    private Date cse_5_3_2;
    @Column(columnDefinition = "datetime COMMENT '患者有机械通气终止日期时间'")
    private Date cse_5_3_3;
    @Column(columnDefinition = "double COMMENT '有机械通气疗程（天数）'")
    private Double cse_5_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施首次头部影像学检查'")
    private String cse_6_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '头部影像学检查项目'")
    private String cse_6_1_2;
    @Column(columnDefinition = "datetime COMMENT '报告日期时间'")
    private Date cse_6_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '实施首次脑脊液检查'")
    private String cse_6_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '脑脊液检查项目'")
    private String cse_6_2_2;
    @Column(columnDefinition = "datetime COMMENT '报告日期时间'")
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
    @Column(columnDefinition = "datetime COMMENT '首次使用抗癫痫药物日期'")
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
    @Column(columnDefinition = "varchar(64) COMMENT '离院方式选择'")
    private String cm_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '非医嘱离院可能涉及因素'")
    private String cm_4_5;
    @Column(columnDefinition = "varchar(64) COMMENT '其他非医嘱离院因素填写'")
    private String cm_4_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '死亡可能涉及因素'")
    private String cm_4_6;
    @Column(columnDefinition = "varchar(64) COMMENT '患者是否对服务的体验与评价'")
    private String cm_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '整体医院评级'")
    private String cm_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者推荐'")
    private String cm_5_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '病房、床单元和卫生间清洁度'")
    private String cm_5_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '病房与周边噪音'")
    private String cm_5_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '医生沟通'")
    private String cm_5_2_6;
    @Column(columnDefinition = "varchar(64) COMMENT '护士沟通'")
    private String cm_5_2_7;
    @Column(columnDefinition = "varchar(64) COMMENT '药师沟通'")
    private String cm_5_2_8;
    @Column(columnDefinition = "varchar(64) COMMENT '康复计划'")
    private String cm_5_2_9;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时的知情告知'")
    private String cm_5_2_10;
    @Column(columnDefinition = "varchar(64) COMMENT '膳食评价'")
    private String cm_5_2_11;
    @Column(columnDefinition = "double COMMENT '住院总费用'")
    private Double cm_6_1;
    @Column(columnDefinition = "double COMMENT '住院总费用其中自付金额'")
    private Double cm_6_2;
    @Column(columnDefinition = "double COMMENT '一般医疗服务费'")
    private Double cm_6_3;
    @Column(columnDefinition = "double COMMENT '一般治疗操作费'")
    private Double cm_6_4;
    @Column(columnDefinition = "double COMMENT '护理费'")
    private Double cm_6_5;
    @Column(columnDefinition = "double COMMENT '综合医疗服务类其他费用'")
    private Double cm_6_6;
    @Column(columnDefinition = "double COMMENT '病理诊断费'")
    private Double cm_6_7;
    @Column(columnDefinition = "double COMMENT '实验室诊断费'")
    private Double cm_6_8;
    @Column(columnDefinition = "double COMMENT '影像学诊断费'")
    private Double cm_6_9;
    @Column(columnDefinition = "double COMMENT '临床诊断项目费'")
    private Double cm_6_10;
    @Column(columnDefinition = "double COMMENT '非手术治疗项目费'")
    private Double cm_6_11;
    @Column(columnDefinition = "double COMMENT '其中：临床物理治疗费'")
    private Double cm_6_12;
    @Column(columnDefinition = "double COMMENT '手术治疗费'")
    private Double cm_6_13;
    @Column(columnDefinition = "double COMMENT '其中：麻醉费'")
    private Double cm_6_14;
    @Column(columnDefinition = "double COMMENT '其中：手术费'")
    private Double cm_6_15;
    @Column(columnDefinition = "double COMMENT '康复费'")
    private Double cm_6_16;
    @Column(columnDefinition = "double COMMENT '中医治疗费'")
    private Double cm_6_17;
    @Column(columnDefinition = "double COMMENT '西药费'")
    private Double cm_6_18;
    @Column(columnDefinition = "double COMMENT '其中：抗菌药物费'")
    private Double cm_6_19;
    @Column(columnDefinition = "double COMMENT '中成药费'")
    private Double cm_6_20;
    @Column(columnDefinition = "double COMMENT '中草药费'")
    private Double cm_6_21;
    @Column(columnDefinition = "double COMMENT '血费'")
    private Double cm_6_22;
    @Column(columnDefinition = "double COMMENT '白蛋白类制品费'")
    private Double cm_6_23;
    @Column(columnDefinition = "double COMMENT '球蛋白类制品费'")
    private Double cm_6_24;
    @Column(columnDefinition = "double COMMENT '凝血因子类制品费'")
    private Double cm_6_25;
    @Column(columnDefinition = "double COMMENT '细胞因子类制品费'")
    private Double cm_6_26;
    @Column(columnDefinition = "double COMMENT '检查用一次性医用材料费'")
    private Double cm_6_27;
    @Column(columnDefinition = "double COMMENT '治疗用一次性医用材料费'")
    private Double cm_6_28;
    @Column(columnDefinition = "double COMMENT '手术用一次性医用材料费'")
    private Double cm_6_29;
    @Column(columnDefinition = "double COMMENT '其他费'")
    private Double cm_6_30;



}
