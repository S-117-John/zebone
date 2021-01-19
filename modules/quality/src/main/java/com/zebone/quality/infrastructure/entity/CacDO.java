package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "QUALITY_CAC")
@Data
public class CacDO extends BaseEntity{

    @Column(columnDefinition = "varchar(64) COMMENT '入院后是否实施首次病情严重程度评估'")
    private String cac_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '哮喘患者病情严重程度分级'")
    private String cac_1_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '哮喘急性发作时,是否有病情严重程度的分级评估'")
    private String cac_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '哮喘急性发作时病情严重程度的分级评估结果'")
    private String cac_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否对具有急性发作风险的高危患者评估'")
    private String cac_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '具有急性发作风险的高危患者评估'")
    private String cac_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否入住ICU/RICU'")
    private String cac_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '收住ICU/RICU符合指征'")
    private String cac_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '入住ICU/RICU时机'")
    private String cac_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否给予氧疗'")
    private String cac_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '氧疗方法'")
    private String cac_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '氧疗30min后是否评估氧合状态'")
    private String cac_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '氧合状态评估方法'")
    private String cac_3_3_2;
    @Column(columnDefinition = "double COMMENT '外周氧饱和度值(%)'")
    private Double cac_3_3_2_1;
    @Column(columnDefinition = "double COMMENT '动脉氧分压(mmHg)'")
    private Double cac_3_3_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否吸入支气管舒张剂'")
    private String cac_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '吸入支气管舒张剂种类'")
    private String cac_4_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其它支气管舒张剂'")
    private String cac_4_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否吸入糖皮质激素'")
    private String cac_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '吸入糖皮质激素种类'")
    private String cac_4_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他吸入糖皮质激素'")
    private String cac_4_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用全身糖皮质激素'")
    private String cac_5_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '糖皮质激素选择'")
    private String cac_5_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他糖皮质激素治疗途径'")
    private String cac_5_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '全身糖皮质激素使用医嘱起始日期时间'")
    private Date cac_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '全身糖皮质激素使用医嘱终止日期'")
    private Date cac_5_2_2;
    @Column(columnDefinition = "double COMMENT '全身糖皮质激素使用天数'")
    private Double cac_5_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '患者病情稳定出院前是否开始应用控制性药物'")
    private String cac_6_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '控制药物使用情况'")
    private String cac_6_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他控制药物使用情况'")
    private String cac_6_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用静脉茶碱'")
    private String cac_7_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '茶碱制剂种类'")
    private String cac_7_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他茶碱制剂'")
    private String cac_7_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '用药途径'")
    private String cac_7_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否监测茶碱血药浓度'")
    private String cac_7_1_4;
    @Column(columnDefinition = "double COMMENT '茶碱血药浓度(μg/ml)'")
    private Double cac_7_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否入院后实施首次实验室检查评估'")
    private String cac_8_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '实验室检查评估'")
    private String cac_8_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他实验室检查评估'")
    private String cac_8_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否入院后实施首次胸部影像学检查'")
    private String cac_8_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '胸部影像学检查评估'")
    private String cac_8_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他胸部影像学检查评估'")
    private String cac_8_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否入院24小时内是否应用抗菌药物'")
    private String cac_8_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者接受首剂抗菌药物治疗（注射剂输入/注射）时间'")
    private Date cac_8_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '接受首剂抗菌药物使用时机'")
    private String cac_8_2_3;
    @Column(columnDefinition = "double COMMENT 'nan'")
    private Double cac_8_2_3_r;
    @Column(columnDefinition = "varchar(64) COMMENT '入院后是否进行首次病原学检测'")
    private String cac_8_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '病原学诊断结果选择'")
    private String cac_8_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '依据病原学诊断结果，选择目标抗感染药物'")
    private String cac_8_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '使用抗感染药物种类'")
    private String cac_8_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '青霉素类抗感染药物'")
    private String cac_8_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其它青霉素类抗感染药物名称'")
    private String cac_8_3_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '头孢菌素类抗感染药物'")
    private String cac_8_3_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其它头孢菌素类抗感染药物名称'")
    private String cac_8_3_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '大环内酯类抗感染药物'")
    private String cac_8_3_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其它大环内酯类抗感染药物名称'")
    private String cac_8_3_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '喹诺酮类抗感染药物'")
    private String cac_8_3_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其它喹诺酮类抗感染药物名称'")
    private String cac_8_3_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他类抗感染药物'")
    private String cac_8_3_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '其他类其它抗感染药物名称'")
    private String cac_8_3_2_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '抗真菌药物'")
    private String cac_8_3_2_6;
    @Column(columnDefinition = "varchar(64) COMMENT '其它抗真菌药物名称'")
    private String cac_8_3_2_6_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施机械通气'")
    private String cac_9_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '机械通气应用指征'")
    private String cac_9_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他机械通气应用指征'")
    private String cac_9_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者机械通气起始日期时间'")
    private Date cac_9_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '患者机械通气终止日期时间'")
    private Date cac_9_1_4;
    @Column(columnDefinition = "double COMMENT '机械通气疗程（小时）'")
    private Double cac_9_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有肺动脉高压和右心功能不全'")
    private String cac_10_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '首次处置血管扩张剂（无禁忌症）的选择'")
    private String cac_10_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他首次处置血管扩张剂'")
    private String cac_10_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有气胸'")
    private String cac_10_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '首位处置项目的选择'")
    private String cac_10_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他首位处置项目'")
    private String cac_10_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有胃食管反流病'")
    private String cac_10_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '首位处置项目的选择'")
    private String cac_10_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其它首位处置项目'")
    private String cac_10_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '住院期间是否为患者提供健康教育'")
    private String cac_11_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '告知患者进入慢性持续期和临床缓解期，需要进一步控制治疗'")
    private String cac_11_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '告知患者哮喘教育管理途径'")
    private String cac_11_2_5;

}
