package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "QUALITY_ICH")
@Data
public class IchDO extends BaseEntity{


    @Column(columnDefinition = "varchar(64) COMMENT '其他主要诊断ICD-10四位亚目编码与名称'")
    private String ich_0_1_12_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要诊断ICD-10六位临床扩展编码与名称'")
    private String ich_0_1_8_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称'")
    private String ich_0_1_11_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称'")
    private String ich_0_1_7_1;
    @Column(columnDefinition = "double COMMENT '年龄'")
    private Double age;
    @Column(columnDefinition = "varchar(64) COMMENT '本院急诊医师接诊日期时间'")
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
    @Column(columnDefinition = "varchar(64) COMMENT '评估日期时间'")
    private Date ich_1_2_2;
    @Column(columnDefinition = "double COMMENT '实施格拉斯哥昏迷评估分值'")
    private Double ich_1_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施神经功能缺损NIHSS评估'")
    private String ich_1_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '评估日期时间'")
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
    @Column(columnDefinition = "varchar(64) COMMENT '报告日期时间'")
    private Date ich_1_3_7;
    @Column(columnDefinition = "varchar(64) COMMENT '是否急诊入住”卒中中心”'")
    private String ich_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '入住”卒中中心”日期时间'")
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
    @Column(columnDefinition = "varchar(64) COMMENT '预防DVT治疗医嘱执行日期与时间'")
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
    @Column(columnDefinition = "varchar(64) COMMENT '评估日期时间'")
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
    @Column(columnDefinition = "varchar(64) COMMENT '复查检测日期时间'")
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
    @Column(columnDefinition = "varchar(64) COMMENT '评估日期时间'")
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
    @Column(columnDefinition = "varchar(64) COMMENT 'ICH术后特指并发症'")
    private String ich_6_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '对腰椎穿刺的其他反应'")
    private String ich_6_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '神经系统的其他操作后疾患'")
    private String ich_6_2_4_2;
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

}
