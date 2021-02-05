package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
//
//@Entity
//@Table(name = "QUALITY_CAP_ADULT")
@Data
public class CapAdultDO extends BaseEntity{


    @Column(columnDefinition = "varchar(64) COMMENT '是否实施CAP病情严重程度的评价'")
    private String cap_adult_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '病情严重程度的评价'")
    private String cap_adult_1;
    @Column(columnDefinition = "double COMMENT '首次CURB-65评分数值'")
    private Double cap_adult_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '风险程度评估'")
    private String cap_adult_1_1_1_1;
    @Column(columnDefinition = "double COMMENT '首次PSI评分数值'")
    private Double cap_adult_1_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '风险程度评估'")
    private String cap_adult_1_1_2_1;
    @Column(columnDefinition = "double COMMENT 'CRB-65 评分数值'")
    private Double cap_adult_1_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '风险程度评估'")
    private String cap_adult_1_1_3_1;
    @Column(columnDefinition = "double COMMENT 'SMART-COP评分数值'")
    private Double cap_adult_1_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '风险程度评估'")
    private String cap_adult_1_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否重症肺炎诊断'")
    private String cap_adult_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '重症肺炎诊断主要标准'")
    private String cap_adult_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '重症肺炎诊断次要标准'")
    private String cap_adult_1_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施首次氧合评估（首次）'")
    private String cap_adult_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '实施首次氧合评估时段'")
    private String cap_adult_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '实施首次氧合评估时是否吸氧（FiO2）'")
    private String cap_adult_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '动脉血气分析/指氧仪检查'")
    private String cap_adult_2_4;
    @Column(columnDefinition = "double COMMENT '动脉血气分析值(mmhg)'")
    private Double cap_adult_2_4_3;
    @Column(columnDefinition = "double COMMENT '指氧仪检查值(%)'")
    private Double cap_adult_2_4_4;
    @Column(columnDefinition = "varchar(64) COMMENT '住院的患者, 是否实施病原学诊断'")
    private String cap_adult_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '实施首次采集标本时段'")
    private String cap_adult_3_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '实施首次采集什么标本'")
    private String cap_adult_3_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他首次采集标本'")
    private String cap_adult_3_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否重症 CAP伴有特定临床情况'")
    private String cap_adult_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '特定临床情况选项'")
    private String cap_adult_3_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行侵入性病原学检测'")
    private String cap_adult_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '实施侵入性病原学检测(ⅢB)的理由'")
    private String cap_adult_3_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '侵入性病原学检测送检标本来源'")
    private String cap_adult_3_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其它侵入性病原学检测送检标本来源'")
    private String cap_adult_3_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否送检病原学标本'")
    private String cap_adult_3_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '送检病原学检测项目选择'")
    private String cap_adult_3_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其它送检病原学检测项目'")
    private String cap_adult_3_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '病原学检测结果的选择'")
    private String cap_adult_3_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其它病原学检测结果'")
    private String cap_adult_3_5_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者有无接受抗菌药物治疗'")
    private String cap_adult_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '注射剂输入/注射起始日期'")
    private Date cap_adult_4_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '接受首剂抗菌药物使用时机'")
    private String cap_adult_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '治疗途径'")
    private String cap_adult_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '注射剂输入/注射终止日期'")
    private Date cap_adult_4_4;
    @Column(columnDefinition = "varchar(64) COMMENT '入院后使用抗菌药物（口服剂）首剂日期与时间'")
    private Date cap_adult_4_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '末剂抗菌药物（口服剂）或出院日期与时间'")
    private Date cap_adult_4_2_4;
    @Column(columnDefinition = "double COMMENT '口服剂抗菌药物疗程（天数）'")
    private Double cap_adult_4_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '用药前病情判定分层'")
    private String cap_adult_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '经验性经验性抗感染药物的选择'")
    private String cap_adult_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '一代头孢菌素选择'")
    private String cap_adult_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '二代头孢菌素选择'")
    private String cap_adult_5_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '三代头孢菌素选择'")
    private String cap_adult_5_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '头霉素类选择'")
    private String cap_adult_5_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '呼吸喹诺酮类选择'")
    private String cap_adult_5_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '氨基青霉素选择'")
    private String cap_adult_5_2_6;
    @Column(columnDefinition = "varchar(64) COMMENT '青霉素类/酶抑制剂受合物选择'")
    private String cap_adult_5_2_7;
    @Column(columnDefinition = "varchar(64) COMMENT '大环内酯类选择'")
    private String cap_adult_5_2_8;
    @Column(columnDefinition = "varchar(64) COMMENT '有抗假单胞菌活性的喹诺酮类选择'")
    private String cap_adult_5_2_9;
    @Column(columnDefinition = "varchar(64) COMMENT '有抗假单胞菌活性的-内酰胺类选择'")
    private String cap_adult_5_2_10;
    @Column(columnDefinition = "varchar(64) COMMENT '氧头孢类选择'")
    private String cap_adult_5_2_11;
    @Column(columnDefinition = "varchar(64) COMMENT '氨基糖苷类选择'")
    private String cap_adult_5_2_12;
    @Column(columnDefinition = "varchar(64) COMMENT '四环类选择'")
    private String cap_adult_5_2_13;
    @Column(columnDefinition = "varchar(64) COMMENT '神经氨酸抑制剂选择'")
    private String cap_adult_5_2_14;
    @Column(columnDefinition = "varchar(64) COMMENT '经验性用药选用特殊类使用种抗菌药物药物选择'")
    private String cap_adult_5_2_15;
    @Column(columnDefinition = "varchar(64) COMMENT '其他抗菌药物'")
    private String cap_adult_5_2_16;
    @Column(columnDefinition = "varchar(64) COMMENT '是否初始治疗72小时后进行评价'")
    private String cap_adult_6_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '评价结论'")
    private String cap_adult_6_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '初始治疗72小时后评价有效'")
    private String cap_adult_6_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '重复病原学检查'")
    private String cap_adult_6_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '常见原因'")
    private String cap_adult_6_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其它原因和处理'")
    private String cap_adult_6_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '病原学检查项目'")
    private String cap_adult_6_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其它病原学检查项目'")
    private String cap_adult_6_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '重复病原学诊断结果选择'")
    private String cap_adult_6_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其它重复病原学诊断结果'")
    private String cap_adult_6_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '目标抗感染药物的选择'")
    private String cap_adult_6_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他目标抗感染药物'")
    private String cap_adult_6_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施氧疗'")
    private String cap_adult_7_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '氧疗方法'")
    private String cap_adult_7_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '氧疗 30min 后是否复查动脉血气'")
    private String cap_adult_7_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施无创正压通气（NIV）'")
    private String cap_adult_7_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '无创正压通气的应用指征'")
    private String cap_adult_7_2_2_0;
    @Column(columnDefinition = "varchar(64) COMMENT '其它无创正压通气的应用指征'")
    private String cap_adult_7_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者无创正压通气起始日期时间'")
    private Date cap_adult_6_2_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者无创正压通气终止日期时间'")
    private Date cap_adult_6_2_4_2;
    @Column(columnDefinition = "double COMMENT '无创正压通气疗程（小时）'")
    private Double cap_adult_6_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施有创机械通气'")
    private String cap_adult_7_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '有创机械通气的具体应用指征'")
    private String cap_adult_7_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其它有创机械通气的具体应用指征'")
    private String cap_adult_7_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者有机械通气起始日期时间'")
    private Date cap_adult_6_3_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者有机械通气终止日期时间'")
    private Date cap_adult_6_3_4_2;
    @Column(columnDefinition = "double COMMENT '有机械通气疗程（小时）'")
    private Double cap_adult_6_3_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施体外膜肺氧合ECMO'")
    private String cap_adult_7_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '体外膜肺氧合应用指征'")
    private String cap_adult_7_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其它体外膜肺氧合应用指征'")
    private String cap_adult_7_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者体外膜肺氧合起始日期时间'")
    private Date cap_adult_6_4_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者体外膜肺氧合终止日期时间'")
    private Date cap_adult_6_4_4_2;
    @Column(columnDefinition = "double COMMENT '体外膜肺氧合疗程（小时）'")
    private Double cap_adult_6_4_5;
    @Column(columnDefinition = "varchar(64) COMMENT '吸烟史'")
    private String cap_adult_8_1;
    @Column(columnDefinition = "varchar(64) COMMENT '吸烟程度评估有记录'")
    private String cap_adult_8_2;
    @Column(columnDefinition = "varchar(64) COMMENT '接受戒烟的建议或者戒烟治疗有记录'")
    private String cap_adult_8_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否接种肺炎链球菌疫苗'")
    private String cap_adult_8_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者接受肺炎链球菌疫苗接种的缘由'")
    private String cap_adult_8_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否接种流感疫苗'")
    private String cap_adult_8_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者接受流感疫苗接种的缘由'")
    private String cap_adult_8_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '交与患者“出院小结”的副本告知患者出院时风险因素'")
    private String cap_adult_9_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药'")
    private String cap_adult_9_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '告知何为发生紧急意外情况或者疾病复发'")
    private String cap_adult_9_3_5;
    @Column(columnDefinition = "varchar(64) COMMENT '告知发生紧急意外情况或者疾病复发如何救治及前途经'")
    private String cap_adult_9_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时教育与随访'")
    private String cap_adult_9_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '出院标准'")
    private String cap_adult_9_1;

}
