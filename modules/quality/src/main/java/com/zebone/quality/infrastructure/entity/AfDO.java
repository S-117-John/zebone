package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author 卡卡西
 */
@Entity
@Table(name = "QUALITY_AF")
@Data
public class AfDO extends BaseEntity{

    @Column(columnDefinition = "varchar(32) COMMENT '实施相关检查'")
    private String AF_1_1_0;

    @Column(columnDefinition = "varchar(32) COMMENT '其他实施相关检查'")
    private String AF_1_1_0_1;

    @Column(columnDefinition = "varchar(32) COMMENT '症状严重程度（EHRA评分）评估'")
    private String AF_1_1_2;

    @Column(columnDefinition = "varchar(32) COMMENT '是否为血流动力学不稳定性房颤'")
    private String AF_1_1_3;

    @Column(columnDefinition = "varchar(32) COMMENT '血流动力学不稳定的临床表现'")
    private String AF_1_1_4;

    @Column(columnDefinition = "varchar(32) COMMENT '房颤患者脑卒中风险评估工具'")
    private String AF_1_2_1;

    @Column(columnDefinition = "int COMMENT '使用CHADS₂评分工具的房颤患者脑卒中风险评估分值'")
    private Integer AF_1_2_2;

    @Column(columnDefinition = "varchar(32) COMMENT 'CHADS₂评分风险评估分层'")
    private String AF_1_2_3;

    @Column(columnDefinition = "int COMMENT '使用CHA₂DS₂-VASc评分工具的房颤患者脑卒中风险评估分值'")
    private Integer AF_1_2_4;

    @Column(columnDefinition = "varchar(32) COMMENT '房颤患者脑卒中风险评估分层'")
    private String AF_1_2_5;

    @Column(columnDefinition = "varchar(32) COMMENT '是否首次房颤患者 出血风险评估(HAS-BLED 评分)'")
    private String AF_1_3_1;

    @Column(columnDefinition = "int COMMENT '首次房颤患者 出血风险评估分值'")
    private Integer AF_1_3_2;

    @Column(columnDefinition = "varchar(32) COMMENT 'HAS-BLED评分≥3者视为高危患者'")
    private String AF_1_3_4;

    @Column(columnDefinition = "varchar(32) COMMENT '是否为CHA₂DS₂-VASc评分≥2的男性或≥3的女性房颤患者'")
    private String AF_2_1_1;

    @Column(columnDefinition = "varchar(32) COMMENT '肌酐清除率(ml／min)'")
    private String AF_2_2_1;

    @Column(columnDefinition = "varchar(32) COMMENT '是否接受抗凝治疗'")
    private String AF_2_3_1;

    @Column(columnDefinition = "varchar(32) COMMENT '抗凝药选择'")
    private String AF_2_3_2;

    @Column(columnDefinition = "varchar(32) COMMENT '其他非维生素K拮抗剂口服抗凝药物'")
    private String AF_2_3_2_1;

    @Column(columnDefinition = "varchar(32) COMMENT '华法林治疗后是否测定INR值'")
    private String AF_2_4_1;

    @Column(columnDefinition = "double COMMENT 'INR值'")
    private Double AF_2_4_2;

    @Column(columnDefinition = "varchar(32) COMMENT '是否接受抗心律失常药物治疗'")
    private String AF_3_1_1;

    @Column(columnDefinition = "varchar(32) COMMENT '抗心律失常药物'")
    private String AF_3_1_2;

    @Column(columnDefinition = "varchar(32) COMMENT 'Ⅰa类药物选择'")
    private String AF_3_1_2_1;

    @Column(columnDefinition = "varchar(32) COMMENT 'Ⅰb类药物选择'")
    private String AF_3_1_2_2;

    @Column(columnDefinition = "varchar(32) COMMENT 'Ⅰc类药物选择'")
    private String AF_3_1_2_3;

    @Column(columnDefinition = "varchar(32) COMMENT 'Ⅱ类药物选择'")
    private String AF_3_1_2_4;

    @Column(columnDefinition = "varchar(32) COMMENT 'Ⅲ类药物选择'")
    private String AF_3_1_2_5;

    @Column(columnDefinition = "varchar(32) COMMENT 'Ⅳ类药物选择'")
    private String AF_3_1_2_6;

    @Column(columnDefinition = "varchar(32) COMMENT '其他常用使用抗心律失常药物'")
    private String AF_3_1_3;

    @Column(columnDefinition = "varchar(32) COMMENT '是否有ACEI/ARB用药长期医嘱'")
    private String AF_4_1_1_1;

    @Column(columnDefinition = "varchar(32) COMMENT '长期医嘱药物的选择(ACEI/ARB)'")
    private String AF_4_1_1_2;

    @Column(columnDefinition = "varchar(32) COMMENT 'ACEI抑制剂药物的选择'")
    private String AF_4_1_1_3;

    @Column(columnDefinition = "varchar(32) COMMENT '其他ACEI 药物名称'")
    private String AF_4_1_1_3_1;

    @Column(columnDefinition = "varchar(32) COMMENT '使用ARB类药物的选择'")
    private String AF_4_1_1_4;

    @Column(columnDefinition = "varchar(32) COMMENT '其他ARB 药物名称'")
    private String AF_4_1_1_4_1;

    @Column(columnDefinition = "varchar(32) COMMENT '是否有β受体阻滞剂用药长期医嘱'")
    private String AF_4_1_2_1;

    @Column(columnDefinition = "varchar(32) COMMENT '使用首剂β-受体阻滞剂药物的选择'")
    private String AF_4_1_2_2;

    @Column(columnDefinition = "varchar(32) COMMENT '其他β-受体阻滞剂药物名称'")
    private String AF_4_1_2_2_1;

    @Column(columnDefinition = "varchar(32) COMMENT '是否有固酮拮抗剂药物用药长期医嘱'")
    private String AF_4_1_3_1;

    @Column(columnDefinition = "varchar(32) COMMENT '使用醛固酮受体拮抗剂的选择'")
    private String AF_4_1_3_2;

    @Column(columnDefinition = "varchar(32) COMMENT '其他醛固酮受体拮抗剂类药物名称'")
    private String AF_4_1_3_2_1;

    @Column(columnDefinition = "varchar(32) COMMENT '出院带药医嘱中有继续使用ACEI或ARB药物记录医嘱'")
    private String AF_4_2_1_1;

    @Column(columnDefinition = "varchar(32) COMMENT '出院带药医嘱药物的选择(ACEI/ARB)'")
    private String AF_4_2_1_2;

    @Column(columnDefinition = "varchar(32) COMMENT 'ACEI抑制剂药物的选择'")
    private String AF_4_2_1_3;

    @Column(columnDefinition = "varchar(32) COMMENT '其他ACEI 药物名称'")
    private String AF_4_2_1_3_1;

    @Column(columnDefinition = "varchar(32) COMMENT '使用ARB类药物的选择'")
    private String AF_4_2_1_4;

    @Column(columnDefinition = "varchar(32) COMMENT '其他ARB 药物名称'")
    private String AF_4_2_1_4_1;

    @Column(columnDefinition = "varchar(32) COMMENT '出院带药医嘱中有继续使用β受体阻滞剂药物医嘱'")
    private String AF_4_2_2_1;

    @Column(columnDefinition = "varchar(32) COMMENT '使用首剂β-受体阻滞剂药物的选择'")
    private String AF_4_2_2_2;

    @Column(columnDefinition = "varchar(32) COMMENT '其他β-受体阻滞剂药物名称'")
    private String AF_4_2_2_2_1;

    @Column(columnDefinition = "varchar(32) COMMENT '出院带药医嘱中有继续使用醛固酮拮抗剂药物医嘱'")
    private String AF_4_2_3_1;

    @Column(columnDefinition = "varchar(32) COMMENT '使用醛固酮受体拮抗剂的选择'")
    private String AF_4_2_3_2;

    @Column(columnDefinition = "varchar(32) COMMENT '其他醛固酮受体拮抗剂类药物名称'")
    private String AF_4_2_3_2_1;

    @Column(columnDefinition = "varchar(32) COMMENT '是否进行房颤导管消融治疗'")
    private String AF_5_1_1;

    @Column(columnDefinition = "varchar(32) COMMENT '适应证'")
    private String AF_5_1_2;

    @Column(columnDefinition = "varchar(32) COMMENT '消融治疗入路'")
    private String AF_5_1_3_1;

    @Column(columnDefinition = "varchar(32) COMMENT '消融治疗方法'")
    private String AF_5_1_3_2;

    @Column(columnDefinition = "varchar(32) COMMENT '其他消融治疗方法'")
    private String AF_5_1_3_3;

    @Column(columnDefinition = "varchar(32) COMMENT '房颤导管消融常用术式和终点'")
    private String AF_5_1_3;

    @Column(columnDefinition = "varchar(32) COMMENT '其他消融术'")
    private String AF_5_1_3_4;

    @Column(columnDefinition = "varchar(32) COMMENT '是否有治疗并发症'")
    private String AF_5_1_4_0;

    @Column(columnDefinition = "varchar(32) COMMENT '治疗并发症'")
    private String AF_5_1_4;

    @Column(columnDefinition = "varchar(32) COMMENT '其他治疗并发症'")
    private String AF_5_1_4_1;

    @Column(columnDefinition = "varchar(32) COMMENT '影响程度的选择'")
    private String AF_5_1_5;

    @Column(columnDefinition = "varchar(32) COMMENT '是否进行左心耳封堵治疗'")
    private String AF_5_2_1;

    @Column(columnDefinition = "varchar(32) COMMENT '应用LAAC预防NVAF血栓事件的适合性评估情况'")
    private String AF_5_2_2;

    @Column(columnDefinition = "varchar(32) COMMENT '其他应用LAAC预防NVAF血栓事件的适合性评估情'")
    private String AF_5_2_2_1;

    @Column(columnDefinition = "varchar(32) COMMENT '是否LAAC术中使用TEE监测'")
    private String AF_5_3_1;

    @Column(columnDefinition = "varchar(32) COMMENT 'TEE在LAAC术中监测'")
    private String AF_5_2_4	;

    @Column(columnDefinition = "varchar(32) COMMENT '是否有治疗并发症'")
    private String AF_5_2_4_0;

    @Column(columnDefinition = "varchar(32) COMMENT '治疗并发症'")
    private String AF_5_2_3;

    @Column(columnDefinition = "varchar(32) COMMENT '其他治疗并发症'")
    private String AF_5_2_3_1;

    @Column(columnDefinition = "varchar(32) COMMENT '影响程度的选择'")
    private String AF_5_2_5;

    @Column(columnDefinition = "varchar(32) COMMENT '新型口服抗凝药（NOAC）or华法林'")
    private String AF_6_1_1;

    @Column(columnDefinition = "varchar(32) COMMENT '其他非维生素K拮抗剂口服抗凝药物'")
    private String AF_6_1_1_1;

    @Column(columnDefinition = "varchar(32) COMMENT '常見危险因素'")
    private String AF_7_1_1;

    @Column(columnDefinition = "varchar(32) COMMENT '其他危险因素'")
    private String AF_7_1_1_1;

    @Column(columnDefinition = "varchar(32) COMMENT '使用新型口服抗凝药（NOAC）or华法林药物治疗的健康教育'")
    private String AF_7_2_1;

    @Column(columnDefinition = "varchar(32) COMMENT '使用抗心律失常药物治疗的健康教育'")
    private String AF_7_2_2;

    @Column(columnDefinition = "varchar(32) COMMENT '房颤导管消融治疗（含冷冻球囊）的健康教育'")
    private String AF_7_3_1;

    @Column(columnDefinition = "varchar(32) COMMENT '左心耳封堵治疗的健康教育左心耳封堵治疗'")
    private String AF_7_3_2;

    @Column(columnDefinition = "varchar(32) COMMENT '交与患者“出院小结”的副本告知患者出院时风险因素'")
    private String AF_7_4_1;

    @Column(columnDefinition = "varchar(32) COMMENT '出院带药'")
    private String AF_7_4_2;

    @Column(columnDefinition = "varchar(32) COMMENT '告知何为风险因素与紧急情况'")
    private String AF_7_4_3;

    @Column(columnDefinition = "varchar(32) COMMENT '告知发生紧急情况时求援救治途径'")
    private String AF_7_4_4;


    @Column(columnDefinition = "varchar(32) COMMENT '出院时教育与随访'")
    private String AF_7_4_5;




}
