package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author 卡卡西
 */
@Entity
@Table(name = "QUALITY_AF")
@Data
public class AfDO extends DataEntity{



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
    @Column(columnDefinition = "varchar(64) COMMENT '第一诊断或第二诊断ICD-10四位亚目编码与名称'")
    private String cm_0_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '第一诊断或第二诊断ICD-10六位临床扩展编码与名称'")
    private String cm_0_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称'")
    private String cm_0_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他ICD-9-CM-3四位亚目编码与名称'")
    private String cm_0_1_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称'")
    private String cm_0_1_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他ICD-9-CM-3六位临床扩展编码与名称'")
    private String cm_0_1_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否出院后31天内重复住院'")
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
    @Column(columnDefinition = "varchar(64) COMMENT '实施相关检查'")
    private String af_1_1_0;
    @Column(columnDefinition = "varchar(64) COMMENT '其他实施相关检查'")
    private String af_1_1_0_1;
    @Column(columnDefinition = "varchar(64) COMMENT '症状严重程度（EHRA评分）评估'")
    private String af_1_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否为血流动力学不稳定性房颤'")
    private String af_1_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '血流动力学不稳定的临床表现'")
    private String af_1_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '房颤患者脑卒中风险评估工具'")
    private String af_1_2_1;
    @Column(columnDefinition = "double COMMENT '使用CHADS₂评分工具的房颤患者脑卒中风险评估分值'")
    private Double af_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'CHADS₂评分风险评估分层'")
    private String af_1_2_3;
    @Column(columnDefinition = "double COMMENT '使用CHA₂DS₂-VASc评分工具的房颤患者脑卒中风险评估分值'")
    private Double af_1_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '房颤患者脑卒中风险评估分层'")
    private String af_1_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否首次房颤患者 出血风险评估(HAS-BLED 评分)'")
    private String af_1_3_1;
    @Column(columnDefinition = "double COMMENT '首次房颤患者 出血风险评估分值'")
    private Double af_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'HAS-BLED评分≥3者视为高危患者'")
    private String af_1_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否为CHA₂DS₂-VASc评分≥2的男性或≥3的女性房颤患者'")
    private String af_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '肌酐清除率(ml／min)'")
    private String af_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否接受抗凝治疗'")
    private String af_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '抗凝药选择'")
    private String af_2_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他非维生素K拮抗剂口服抗凝药物'")
    private String af_2_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '华法林治疗后是否测定INR值'")
    private String af_2_4_1;
    @Column(columnDefinition = "double COMMENT 'INR值'")
    private Double af_2_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否接受抗心律失常药物治疗'")
    private String af_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '抗心律失常药物'")
    private String af_3_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'Ⅰa类药物选择'")
    private String af_3_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'Ⅰb类药物选择'")
    private String af_3_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'Ⅰc类药物选择'")
    private String af_3_1_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT 'Ⅱ类药物选择'")
    private String af_3_1_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT 'Ⅲ类药物选择'")
    private String af_3_1_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT 'Ⅳ类药物选择'")
    private String af_3_1_2_6;
    @Column(columnDefinition = "varchar(64) COMMENT '其他常用使用抗心律失常药物'")
    private String af_3_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有ACEI/ARB用药长期医嘱'")
    private String af_4_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '长期医嘱药物的选择(ACEI/ARB)'")
    private String af_4_1_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'ACEI抑制剂药物的选择'")
    private String af_4_1_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他ACEI 药物名称'")
    private String af_4_1_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用ARB类药物的选择'")
    private String af_4_1_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他ARB 药物名称'")
    private String af_4_1_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有β受体阻滞剂用药长期医嘱'")
    private String af_4_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用首剂β-受体阻滞剂药物的选择'")
    private String af_4_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他β-受体阻滞剂药物名称'")
    private String af_4_1_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有固酮拮抗剂药物用药长期医嘱'")
    private String af_4_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用醛固酮受体拮抗剂的选择'")
    private String af_4_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他醛固酮受体拮抗剂类药物名称'")
    private String af_4_1_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药医嘱中有继续使用ACEI或ARB药物记录医嘱'")
    private String af_4_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药医嘱药物的选择(ACEI/ARB)'")
    private String af_4_2_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'ACEI抑制剂药物的选择'")
    private String af_4_2_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他ACEI 药物名称'")
    private String af_4_2_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用ARB类药物的选择'")
    private String af_4_2_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他ARB 药物名称'")
    private String af_4_2_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药医嘱中有继续使用β受体阻滞剂药物医嘱'")
    private String af_4_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用首剂β-受体阻滞剂药物的选择'")
    private String af_4_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他β-受体阻滞剂药物名称'")
    private String af_4_2_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药医嘱中有继续使用醛固酮拮抗剂药物医嘱'")
    private String af_4_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用醛固酮受体拮抗剂的选择'")
    private String af_4_2_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他醛固酮受体拮抗剂类药物名称'")
    private String af_4_2_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行房颤导管消融治疗'")
    private String af_5_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '适应证'")
    private String af_5_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '消融治疗入路'")
    private String af_5_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '消融治疗方法'")
    private String af_5_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他消融治疗方法'")
    private String af_5_1_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '房颤导管消融常用术式和终点'")
    private String af_5_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他消融术'")
    private String af_5_1_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有治疗并发症'")
    private String af_5_1_4_0;
    @Column(columnDefinition = "varchar(64) COMMENT '治疗并发症'")
    private String af_5_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他治疗并发症'")
    private String af_5_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '影响程度的选择'")
    private String af_5_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行左心耳封堵治疗'")
    private String af_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '应用LAAC预防NVAF血栓事件的适合性评估情况'")
    private String af_5_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他应用LAAC预防NVAF血栓事件的适合性评估情'")
    private String af_5_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否LAAC术中使用TEE监测'")
    private String af_5_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'TEE在LAAC术中监测'")
    private String af_5_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有治疗并发症'")
    private String af_5_2_4_0;
    @Column(columnDefinition = "varchar(64) COMMENT '治疗并发症'")
    private String af_5_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他治疗并发症'")
    private String af_5_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '影响程度的选择'")
    private String af_5_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '手术野皮肤准备常用方法的选择'")
    private String cm_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用含抗菌剂（三氯生）缝线'")
    private String cm_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他含抗菌剂缝线填写'")
    private String cm_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术切口类别的选择'")
    private String cm_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '手术切口愈合情况的选择'")
    private String cm_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '新型口服抗凝药（NOAC）or华法林'")
    private String af_6_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他非维生素K拮抗剂口服抗凝药物'")
    private String af_6_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '常見危险因素'")
    private String af_7_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他危险因素'")
    private String af_7_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用新型口服抗凝药（NOAC）or华法林药物治疗的健康教育'")
    private String af_7_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用抗心律失常药物治疗的健康教育'")
    private String af_7_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '房颤导管消融治疗（含冷冻球囊）的健康教育'")
    private String af_7_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '左心耳封堵治疗的健康教育左心耳封堵治疗'")
    private String af_7_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '交与患者“出院小结”的副本告知患者出院时风险因素'")
    private String af_7_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药'")
    private String af_7_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '告知何为风险因素与紧急情况'")
    private String af_7_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '告知发生紧急情况时求援救治途径'")
    private String af_7_4_4;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时教育与随访'")
    private String af_7_4_5;
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
