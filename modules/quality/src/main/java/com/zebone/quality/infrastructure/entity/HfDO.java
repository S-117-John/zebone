package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

//@Entity
//@Table(name = "QUALITY_HF")
@Data
public class HfDO extends DataEntity{


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
    @Column(columnDefinition = "varchar(64) COMMENT '第一诊断或第二诊断对应的原发疾病ICD-10的三位类亚目编码与名称'")
    private String hf_0_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '第一诊断或第二诊断对应的原发疾病ICD-10的三位类目编码与名称'")
    private String hf_0_1_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称'")
    private String cm_0_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称'")
    private String cm_0_1_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否出院后31天内重复住院'")
    private String cm_0_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '出生日期'")
    private Date cm_0_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者性别'")
    private String cm_0_2_1_2;
    @Column(columnDefinition = "double COMMENT '患者体重（kg）'")
    private Double cm_0_2_1_3;
    @Column(columnDefinition = "double COMMENT '患者身高（cm）'")
    private Double cm_0_2_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '发病日期时间是否无法确定或无记录'")
    private String cm_0_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '发病日期时间'")
    private Date cm_0_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '到达本院急诊或者门诊日期时间是否无法确定或无记录'")
    private String cm_0_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '到达本院急诊或者门诊日期时间'")
    private Date cm_0_2_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '入院日期时间'")
    private Date cm_0_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院日期时间'")
    private Date cm_0_2_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '入住CCU日期时间'")
    private Date cm_0_2_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '离开CCU日期时间'")
    private Date cm_0_2_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '手术开始（切皮）日期时间'")
    private Date cm_0_2_6_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术结束（缝皮结束）日期时间'")
    private Date cm_0_2_6_2;
    @Column(columnDefinition = "varchar(64) COMMENT '费用支付方式'")
    private String cm_0_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '收入住院途径'")
    private String cm_0_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '到院交通工具'")
    private String cm_0_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施首次X线胸片检查'")
    private String hf_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '首次X线胸片检查报告日期时间'")
    private Date hf_1_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '首次X线胸片检查报告是否有肺淤血或肺水肿'")
    private String hf_1_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施首次超声心动图(CDFA)检查'")
    private String hf_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '报告日期时间'")
    private Date hf_1_2_2;
    @Column(columnDefinition = "double COMMENT '左室舒张末内径（LVEDD）(mm)'")
    private Double hf_1_2_3_4;
    @Column(columnDefinition = "double COMMENT '左室射血分（LVEF）测量值(%)'")
    private Double hf_1_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '左室射血分数评估结论'")
    private String hf_1_2_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有左心室室壁瘤'")
    private String hf_1_2_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '实施首次评估患者的危险程度'")
    private String hf_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'Killip分级评估结果的选择'")
    private String hf_1_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT 'NYHA分级结果的选择'")
    private String hf_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否为非瓣膜性房颤/房扑患者'")
    private String hf_1_3_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施房颤患者风险评估'")
    private String hf_1_3_6_1;
    @Column(columnDefinition = "double COMMENT '房颤患者脑险评估分值'")
    private Double hf_1_3_6_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'CHA2DS2-VASc评分大于2分'")
    private String hf_1_3_6_3;
    @Column(columnDefinition = "varchar(64) COMMENT '急诊或入院后是否首次心电图（ECG）检查'")
    private String hf_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '报告日期时间'")
    private Date hf_1_4_2;
    @Column(columnDefinition = "double COMMENT 'QRS宽度(ms)'")
    private Double hf_1_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '心电图（ECG）检查结果选择'")
    private String hf_1_4_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他心电图检查结果'")
    private String hf_1_4_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施首次检测'")
    private String hf_1_5_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '首次检测结果报告日期'")
    private Date hf_1_5_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '首次检测选择'")
    private String hf_1_5_3;
    @Column(columnDefinition = "double COMMENT '肌钙蛋白T（TnT）检测值(ng/mL)'")
    private Double hf_1_5_2_1;
    @Column(columnDefinition = "double COMMENT '肌钙蛋白I（TnI）检测值(ng/mL)'")
    private Double hf_1_5_2_2;
    @Column(columnDefinition = "double COMMENT '肌酸激酶同工酶（CK-MB）检测值(ng/mL)'")
    private Double hf_1_5_2_3;
    @Column(columnDefinition = "double COMMENT '心肌肌红蛋白（Myo）检测值(ng/mL)'")
    private Double hf_1_5_2_4;
    @Column(columnDefinition = "double COMMENT 'B型钠尿肽（BNP）检测值(ng/L)'")
    private Double hf_1_5_2_5;
    @Column(columnDefinition = "double COMMENT 'N端B型钠尿肽前体（NT-ProBNP）检测值(ng/L)'")
    private Double hf_1_5_2_6;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有利尿剂的禁忌证'")
    private String hf_2_1_a;
    @Column(columnDefinition = "varchar(64) COMMENT '使用利尿剂的禁忌证选择'")
    private String hf_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他使用利尿剂的禁忌证'")
    private String hf_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '首剂用药日期时间'")
    private Date hf_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '常用利尿剂药物'")
    private String hf_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他利尿剂药物填写'")
    private String hf_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '入院至使用首剂利尿剂时间大于24小时'")
    private String hf_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '延迟治疗原因的选择'")
    private String hf_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他延迟治疗原因'")
    private String hf_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '左心室收缩功能障碍'")
    private String hf_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有ACEI抑制剂类药物禁忌证'")
    private String hf_3_2_a;
    @Column(columnDefinition = "varchar(64) COMMENT 'ACEI抑制剂类药物禁忌证与须慎用的情况'")
    private String hf_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'ACE抑制剂药物'")
    private String hf_3_4_a;
    @Column(columnDefinition = "varchar(64) COMMENT '其他ACEI药物'")
    private String hf_3_4_a_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'ARB类药物'")
    private String hf_3_4_b;
    @Column(columnDefinition = "varchar(64) COMMENT '其他ARB类药物填写'")
    private String hf_3_4_b_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有ARNI类药物禁忌证'")
    private String hf_3_2_b;
    @Column(columnDefinition = "varchar(64) COMMENT 'ARNI类药物禁忌证与须慎用的情况'")
    private String hf_3_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '使用血管紧张素受体脑啡肽酶抑制剂（ARNI）类药物的选择'")
    private String hf_3_4_c;
    @Column(columnDefinition = "varchar(64) COMMENT '其他使用血管紧张素受体脑啡肽酶抑制剂（ARNI）类药物'")
    private String hf_3_4_c_1;
    @Column(columnDefinition = "varchar(64) COMMENT '首剂用药日期是否未确定'")
    private String hf_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '首剂用药日期时间'")
    private Date hf_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '入院至使用首剂ACEI/ARB类药物时间大于24小时'")
    private String hf_3_6;
    @Column(columnDefinition = "varchar(64) COMMENT '延迟治疗原因'")
    private String hf_3_5;
    @Column(columnDefinition = "varchar(64) COMMENT '其他延迟治疗原因'")
    private String hf_3_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有禁忌证与须慎用的情况'")
    private String hf_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'β-受体阻滞剂禁忌证选择'")
    private String hf_4_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '使用首剂β-受体阻滞剂药物'")
    private String hf_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他β-受体阻滞剂药物'")
    private String hf_4_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '首剂用药日期是否未确定'")
    private String hf_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '首剂用药日期时间'")
    private Date hf_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '入院至使用首剂β-受体阻滞剂时间大于24小时'")
    private String hf_4_5;
    @Column(columnDefinition = "varchar(64) COMMENT '延迟治疗原因'")
    private String hf_4_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他延迟治疗原因'")
    private String hf_4_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有醛固酮受体拮抗剂的禁忌证'")
    private String hf_5_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '醛固酮受体拮抗剂的禁忌证'")
    private String hf_5_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '重度心衰使用醛固酮受体拮抗剂适用症'")
    private String hf_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他重度心衰使用醛固酮受体拮抗剂适用症'")
    private String hf_5_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '首剂用药日期是否未确定'")
    private String hf_5_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '首剂用药日期时间'")
    private Date hf_5_3;
    @Column(columnDefinition = "varchar(64) COMMENT '入院至使用首剂醛固酮受体拮抗剂时间大于24小时'")
    private String hf_5_6;
    @Column(columnDefinition = "varchar(64) COMMENT '使用醛固酮受体拮抗剂'")
    private String hf_5_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他醛固酮受体拮抗剂类药物'")
    private String hf_5_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '延迟治疗原因'")
    private String hf_5_5;
    @Column(columnDefinition = "varchar(64) COMMENT '其他延迟治疗原因'")
    private String hf_5_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有用药长期医嘱'")
    private String hf_6_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '常用利尿剂药物的选择'")
    private String hf_6_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他常用利尿剂'")
    private String hf_6_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有ACEI或ARB药物长期医嘱'")
    private String hf_6_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用ACEI抑制剂或者ARB或者ARNI类药物选择'")
    private String hf_6_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'ACE抑制剂药物'")
    private String hf_6_2_2_a;
    @Column(columnDefinition = "varchar(64) COMMENT '其他ACEI药物填写'")
    private String hf_6_2_2_a_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'ARB类药物'")
    private String hf_6_2_2_b;
    @Column(columnDefinition = "varchar(64) COMMENT '其他ARB药物填写'")
    private String hf_6_2_2_b_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用血管紧张素受体脑啡肽酶抑制剂（ARNI）类药物的选择'")
    private String hf_6_2_2_c;
    @Column(columnDefinition = "varchar(64) COMMENT '其他使用血管紧张素受体脑啡肽酶抑制剂（ARNI）类药物'")
    private String hf_6_2_2_c_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有β受体阻滞剂药物医嘱'")
    private String hf_6_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用首剂β-受体阻滞剂药物'")
    private String hf_6_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他β-受体阻滞剂药物填写'")
    private String hf_6_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有醛固酮拮抗剂药物医嘱'")
    private String hf_6_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用醛固酮受体拮抗剂'")
    private String hf_6_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他醛固酮受体拮抗剂类药物填写'")
    private String hf_6_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否常用抗凝药物'")
    private String hf_6_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '选择抗凝药物'")
    private String hf_6_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他抗凝药物'")
    private String hf_6_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药医嘱中是否有继续使用利尿剂记录医嘱'")
    private String hf_7_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '常用利尿剂药物'")
    private String hf_7_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他常用利尿剂'")
    private String hf_7_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药医嘱中是否有继续使用ACEI或ARB药物记录医嘱'")
    private String hf_7_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用ACEI抑制剂或者ARB或者ARNI类药物选择'")
    private String hf_7_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'ACE抑制剂药物'")
    private String hf_7_2_2_a;
    @Column(columnDefinition = "varchar(64) COMMENT '其他ACEI药物'")
    private String hf_7_2_2_a_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'ARB类药物'")
    private String hf_7_2_2_b;
    @Column(columnDefinition = "varchar(64) COMMENT '其他ARB药物填写'")
    private String hf_7_2_2_b_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用血管紧张素受体脑啡肽酶抑制剂（ARNI）类药物的选择'")
    private String hf_7_2_2_c;
    @Column(columnDefinition = "varchar(64) COMMENT '其他使用血管紧张素受体脑啡肽酶抑制剂（ARNI）类药物'")
    private String hf_7_2_2_c_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药医嘱中是否有继续使用β受体阻滞剂药物医嘱'")
    private String hf_7_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用首剂β-受体阻滞剂药物'")
    private String hf_7_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他β-受体阻滞剂药物填写'")
    private String hf_7_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药医嘱中是否有继续使用醛固酮拮抗剂药物医嘱'")
    private String hf_7_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用醛固酮受体拮抗剂'")
    private String hf_7_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他醛固酮受体拮抗剂'")
    private String hf_7_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药医嘱中是否有继续使用使用抗凝药物医嘱'")
    private String hf_7_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '选择抗凝药物'")
    private String hf_7_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他抗凝药物'")
    private String hf_7_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '离院方式选择'")
    private String cm_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '非医嘱离院可能涉及因素'")
    private String cm_4_5;
    @Column(columnDefinition = "varchar(64) COMMENT '其他非医嘱离院因素填写'")
    private String cm_4_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '死亡可能涉及因素'")
    private String cm_4_6;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有吸烟史'")
    private String hf_8_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '吸烟程度评估有记录'")
    private String hf_8_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '接受戒烟的建议或者戒烟治疗有记录'")
    private String hf_8_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '心衰原发疾病评估与教育'")
    private String hf_8_2_1_a;
    @Column(columnDefinition = "varchar(64) COMMENT '实施控制主要危险因素评估与教育'")
    private String hf_8_2_1_b;
    @Column(columnDefinition = "varchar(64) COMMENT '对控制危险因素评估的结果进行针对性的教育'")
    private String hf_8_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '二级预防'")
    private String hf_8_3;
    @Column(columnDefinition = "varchar(64) COMMENT '交与患者“出院小结”的副本告知患者出院时风险因素'")
    private String hf_8_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药'")
    private String hf_8_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '告知发生紧急情况时求援救治途径'")
    private String hf_8_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时教育与随访'")
    private String hf_8_4_4;
    @Column(columnDefinition = "varchar(64) COMMENT '告知何为风险因素与紧急情况'")
    private String hf_8_4_5;
    @Column(columnDefinition = "varchar(64) COMMENT '实施末次X线胸片检查'")
    private String hf_9_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有肺淤血或肺水肿'")
    private String hf_9_2_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施末次超声心动图(CDFA)检查'")
    private String hf_9_2_2_1;
    @Column(columnDefinition = "double COMMENT 'QRS宽度(ms)'")
    private Double hf_9_2_2_2_4;
    @Column(columnDefinition = "double COMMENT '左室射血分（LVEF）测量值(%)'")
    private Double hf_9_2_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '左室射血分数评估结论'")
    private String hf_9_2_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有左心室室壁瘤'")
    private String hf_9_2_2_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '实施末次风险程度评估'")
    private String hf_9_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '末次风险程度评估'")
    private String hf_9_2_3_2_ab;
    @Column(columnDefinition = "varchar(64) COMMENT 'NYHA分级结果'")
    private String hf_9_2_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'Killip分级评估结果'")
    private String hf_9_2_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '实施末次检测'")
    private String hf_9_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '末次检测选择'")
    private String hf_9_2_4_2;
    @Column(columnDefinition = "double COMMENT '肌钙蛋白T（TnT）检测值(ng/mL)'")
    private Double hf_9_2_4_2_1;
    @Column(columnDefinition = "double COMMENT '肌钙蛋白I（TnI）检测值(ng/mL)'")
    private Double hf_9_2_4_2_2;
    @Column(columnDefinition = "double COMMENT '肌酸激酶同工酶（CK-MB）检测值(ng/mL)'")
    private Double hf_9_2_4_2_3;
    @Column(columnDefinition = "double COMMENT '心肌肌红蛋白（Myo）检测值(ng/mL)'")
    private Double hf_9_2_4_2_4;
    @Column(columnDefinition = "double COMMENT 'B型钠尿肽（BNP）检测值(ng/L)'")
    private Double hf_9_2_4_2_5;
    @Column(columnDefinition = "double COMMENT 'N端B型钠尿肽前体（NT-ProBNP）检测值(ng/L)'")
    private Double hf_9_2_4_2_6;
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
    @Column(columnDefinition = "varchar(64) COMMENT '心脏再同步化临床应用符合适应症'")
    private String hf_11_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'CRT临床应用的适应证（Ⅰ类）选择'")
    private String hf_11_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '安装心脏再同步治疗（CRT）装置'")
    private String hf_11_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '安装日期时间'")
    private Date hf_11_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '心脏再同步治疗（CRT）装置生产企业'")
    private String hf_11_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '心脏再同步治疗（CRT）装置型号'")
    private String hf_11_1_4_2;
    @Column(columnDefinition = "double COMMENT '心脏再同步治疗（CRT）装置的费用(元)'")
    private Double hf_11_1_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有在药物优化治疗超过3个月后实施埋藏式心律转复除颤器（ICD）的记录'")
    private String hf_11_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '心衰患者植入ICD适应证'")
    private String hf_11_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '二级预防适应证'")
    private String hf_11_5_4;
    @Column(columnDefinition = "varchar(64) COMMENT '一级预防适应证'")
    private String hf_11_5_3;
    @Column(columnDefinition = "varchar(64) COMMENT '缺血性心脏病患者'")
    private String hf_11_5_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '非缺血性心衰患者'")
    private String hf_11_5_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否安装埋藏式心律转复除颤器（ICD）装置'")
    private String hf_11_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '安装日期时间'")
    private Date hf_11_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '埋藏式心律转复除颤器（ICD）装置生产企业'")
    private String hf_11_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '埋藏式心律转复除颤器（ICD）装置型号'")
    private String hf_11_2_4_2;
    @Column(columnDefinition = "double COMMENT '埋藏式心律转复除颤器（ICD）装置的费用(元)'")
    private Double hf_11_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '通过优化流程实现从医院到社区的无缝衔接'")
    private String hf_11_3_1;
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
