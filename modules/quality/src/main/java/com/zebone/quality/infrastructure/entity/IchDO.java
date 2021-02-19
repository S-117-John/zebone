package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "QUALITY_ICH")
@Data
public class IchDO extends DataEntity{


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
    @Column(columnDefinition = "varchar(64) COMMENT '主要诊断ICD-10四位亚目编码与名称'")
    private String cm_0_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要诊断ICD-10四位亚目编码与名称'")
    private String ich_0_1_12_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要诊断ICD-10六位临床扩展编码与名称'")
    private String cm_0_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要诊断ICD-10六位临床扩展编码与名称'")
    private String ich_0_1_8_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称'")
    private String cm_0_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称'")
    private String ich_0_1_11_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称'")
    private String cm_0_1_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称'")
    private String ich_0_1_7_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否ICH出院后31天内重复住院'")
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
    @Column(columnDefinition = "double COMMENT '年龄'")
    private Double age;
    @Column(columnDefinition = "datetime COMMENT '出院日期时间'")
    private Date cm_0_2_4_2;
    @Column(columnDefinition = "datetime COMMENT '入住ICU/卒中中心日期时间'")
    private Date cm_0_2_5_1;
    @Column(columnDefinition = "datetime COMMENT '离开ICU/卒中中心日期时间'")
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
    @Column(columnDefinition = "datetime COMMENT '本院急诊医师接诊日期时间'")
    private Date ich_1_1_1;
    @Column(columnDefinition = "double COMMENT '身高(单位:厘米(cm))'")
    private Double ich_1_1_2_1;
    @Column(columnDefinition = "double COMMENT '体重(单位:公斤(kg))'")
    private Double ich_1_1_2_2;
    @Column(columnDefinition = "double COMMENT '呼吸(单位:次/分)'")
    private Double ich_1_1_2_3;
    @Column(columnDefinition = "double COMMENT '脉搏(单位:次/分)'")
    private Double ich_1_1_2_4;
    @Column(columnDefinition = "double COMMENT '收缩压(单位:mmHg)'")
    private Double ich_1_1_2_5;
    @Column(columnDefinition = "double COMMENT '舒张压(单位:mmHg)'")
    private Double ich_1_1_2_6;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施格拉斯哥昏迷评估'")
    private String ich_1_2_1;
    @Column(columnDefinition = "datetime COMMENT '评估日期时间'")
    private Date ich_1_2_2;
    @Column(columnDefinition = "double COMMENT '实施格拉斯哥昏迷评估分值'")
    private Double ich_1_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施神经功能缺损NIHSS评估'")
    private String ich_1_2_4;
    @Column(columnDefinition = "datetime COMMENT '评估日期时间'")
    private Date ich_1_2_5;
    @Column(columnDefinition = "double COMMENT '实施神经功能缺损NIHSS评估分值'")
    private Double ich_1_2_6;
    @Column(columnDefinition = "varchar(64) COMMENT '急诊是否实施首次头部影像学检查'")
    private String ich_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '急诊首次头部影像学检查项目'")
    private String ich_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '影像学检查确定血肿部位'")
    private String ich_1_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '基底节区出血'")
    private String ich_1_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '脑叶出血'")
    private String ich_1_3_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '脑干出血'")
    private String ich_1_3_3_4;
    @Column(columnDefinition = "double COMMENT '血肿量(ml)'")
    private Double ich_1_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否血肿破入脑室'")
    private String ich_1_3_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否血肿源自幕下'")
    private String ich_1_3_6;
    @Column(columnDefinition = "datetime COMMENT '报告日期时间'")
    private Date ich_1_3_7;
    @Column(columnDefinition = "varchar(64) COMMENT '是否急诊入住”卒中中心”'")
    private String ich_1_4_1;
    @Column(columnDefinition = "datetime COMMENT '入住”卒中中心”日期时间'")
    private Date ich_1_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否为高血压(收缩压大于180mmHg)患者'")
    private String ich_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否24小时内有血压监测与用药长期医嘱'")
    private String ich_2_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '选择降压药物'")
    private String ich_2_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他降压药物'")
    private String ich_2_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否为高血压(收缩压大于200mmHg)患者'")
    private String ich_2_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有使用静脉降压药医嘱'")
    private String ich_2_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '入院后病情判定'")
    private String ich_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否需要做预防DVT治疗'")
    private String ich_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '禁忌证选择'")
    private String ich_3_2_2;
    @Column(columnDefinition = "datetime COMMENT '预防DVT治疗医嘱执行日期与时间'")
    private Date ich_3_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '药物预防选择'")
    private String ich_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其它预防药物'")
    private String ich_3_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '物理预防选择'")
    private String ich_3_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他物理预防'")
    private String ich_3_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '基本预防'")
    private String ich_3_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他基本预防措施'")
    private String ich_3_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '入院时是否可以正常进食与饮水'")
    private String ich_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '入院24小时内是否进行吞咽评估'")
    private String ich_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '未进行吞咽困难评价原因'")
    private String ich_4_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他未进行吞咽困难评价原因'")
    private String ich_4_3_2_1;
    @Column(columnDefinition = "datetime COMMENT '评估日期时间'")
    private Date ich_4_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '评价方法选择'")
    private String ich_4_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他评价方法'")
    private String ich_4_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '住院48小时内是否接受影像学检测复查'")
    private String ich_5_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '接受影像学检测复查项目选择'")
    private String ich_5_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他接受影像学检测复查项目名称'")
    private String ich_5_1_2_1;
    @Column(columnDefinition = "datetime COMMENT '复查检测日期时间'")
    private Date ich_5_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否血肿扩大'")
    private String ich_5_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否血管畸形'")
    private String ich_5_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否动脉瘤'")
    private String ich_5_1_6;
    @Column(columnDefinition = "varchar(64) COMMENT '是否淀粉样病变'")
    private String ich_5_1_7;
    @Column(columnDefinition = "varchar(64) COMMENT '是否再出血风险'")
    private String ich_5_1_8;
    @Column(columnDefinition = "varchar(64) COMMENT '是否首次ICH评分'")
    private String ich_6_1_1;
    @Column(columnDefinition = "datetime COMMENT '评估日期时间'")
    private Date ich_6_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'GCS评分'")
    private String ich_6_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '血肿量'")
    private String ich_6_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否血肿破入脑室'")
    private String ich_6_1_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否血肿源自幕下'")
    private String ich_6_1_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '年龄'")
    private String ich_6_1_3_5;
    @Column(columnDefinition = "double COMMENT '首次ICH评估分值'")
    private Double ich_6_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有手术适应证'")
    private String ich_6_2_6;
    @Column(columnDefinition = "varchar(64) COMMENT '手术适应证选择'")
    private String ich_6_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '其他手术适应证'")
    private String ich_6_1_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '神经外科干预措施'")
    private String ich_6_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他神经外科干预措施'")
    private String ich_6_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有手术后并发症'")
    private String cm_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术后并发症类别及ICD-10四位亚目的选择'")
    private String cm_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他手术后并发症类别及ICD-10四位亚目和名称填写'")
    private String cm_2_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '介入操作与手术其他并发症'")
    private String cm_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术患者手术后肺栓塞例数'")
    private String cm_2_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '手术患者手术后深静脉血栓例数'")
    private String cm_2_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '手术患者手术后败血症例数'")
    private String cm_2_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '手术患者手术后出血或血肿例数'")
    private String cm_2_3_5;
    @Column(columnDefinition = "varchar(64) COMMENT '手术患者手术伤口裂开'")
    private String cm_2_3_6;
    @Column(columnDefinition = "varchar(64) COMMENT '手术患者猝死'")
    private String cm_2_3_7;
    @Column(columnDefinition = "varchar(64) COMMENT '手术患者手术后呼吸道并发症'")
    private String cm_2_3_8;
    @Column(columnDefinition = "varchar(64) COMMENT '手术患者手术后生理/代谢紊乱'")
    private String cm_2_3_9;
    @Column(columnDefinition = "varchar(64) COMMENT '与手术/操作相关感染'")
    private String cm_2_3_10;
    @Column(columnDefinition = "varchar(64) COMMENT '手术过程中异物遗留'")
    private String cm_2_3_11;
    @Column(columnDefinition = "varchar(64) COMMENT '麻醉并发症'")
    private String cm_2_3_12;
    @Column(columnDefinition = "varchar(64) COMMENT '输注、输血反应'")
    private String cm_2_3_13;
    @Column(columnDefinition = "varchar(64) COMMENT '住院患者发生压疮'")
    private String cm_2_3_14;
    @Column(columnDefinition = "varchar(64) COMMENT 'ICH术后特指并发症'")
    private String ich_6_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '对腰椎穿刺的其他反应'")
    private String ich_6_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '神经系统的其他操作后疾患'")
    private String ich_6_2_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '影响程度的选择'")
    private String cm_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否手术后再手术'")
    private String ich_6_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否高血压(收缩压大于180mmHg)患者'")
    private String ich_7_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院医嘱中有血压监测与用药长期医嘱'")
    private String ich_7_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '选择降压药物'")
    private String ich_7_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他降压药物'")
    private String ich_7_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '原发性'")
    private String ich_8_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '继发性'")
    private String ich_8_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有重点护理评估'")
    private String ich_9_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '行走评估结果'")
    private String ich_9_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '呼吸评估结果'")
    private String ich_9_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '饮食评估结果'")
    private String ich_9_1_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '吞咽评估结果'")
    private String ich_9_1_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '压疮评估（Braden评分值）分值是否确定'")
    private String ich_9_1_2_5_3;
    @Column(columnDefinition = "double COMMENT '压疮评估（Braden评分值）分值'")
    private Double ich_9_1_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '压疮评估结果选择'")
    private String ich_9_1_2_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '预防压疮告知'")
    private String ich_9_1_2_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施卒中健康教育，且有记录'")
    private String ich_9_1_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '实施卒中健康教育有记录'")
    private String ich_9_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '吸烟史'")
    private String ich_9_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '吸烟程度评估'")
    private String ich_9_1_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '接受戒烟的建议或者戒烟治疗'")
    private String ich_9_1_3_5;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时是否风险评分'")
    private String ich_9_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时风险评分选择'")
    private String ich_9_2_1_1;
    @Column(columnDefinition = "double COMMENT 'Essen卒中风险评分值'")
    private Double ich_9_2_1_2;
    @Column(columnDefinition = "double COMMENT '实施ICH评分评估分值'")
    private Double ich_9_2_1_3;
    @Column(columnDefinition = "double COMMENT '实施格拉斯哥昏迷评估分值'")
    private Double ich_9_2_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '交与患者“出院小结”的副本，并告知患者出院时风险因素'")
    private String ich_9_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药'")
    private String ich_9_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '告知发生紧急情况时求援救治途径'")
    private String ich_9_2_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时教育与随访'")
    private String ich_9_2_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '告知何为风险因素与紧急情况'")
    private String ich_9_2_2_5;
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
