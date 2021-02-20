package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "QUALITY_PA")
public class PaDO extends DataEntity{



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
    private String pa_0_1_7_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要诊断ICD-10六位临床扩展编码与名称'")
    private String cm_0_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要诊断ICD-10六位临床扩展编码与名称'")
    private String pa_0_1_8_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称'")
    private String cm_0_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称'")
    private String pa_0_1_9_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称'")
    private String cm_0_1_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称'")
    private String pa_0_1_10_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'PA出院后是否31天内重复住院'")
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
    @Column(columnDefinition = "varchar(64) COMMENT '主要临床表现'")
    private String pa_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '首次磁共振扫描'")
    private String pa_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '获得首次磁共振检查报告的日期时间是否确定'")
    private String pa_1_2_2_1;
    @Column(columnDefinition = "datetime COMMENT '获得首次磁共振检查报告的日期时间'")
    private Date pa_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '首次磁共振扫描模式'")
    private String pa_1_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '肿瘤大小'")
    private String pa_1_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行术前双侧视力与视野评估'")
    private String pa_2_1_1;
    @Column(columnDefinition = "double COMMENT '左眼视力数值'")
    private Double pa_2_1_2;
    @Column(columnDefinition = "double COMMENT '右眼视力数值'")
    private Double pa_2_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行术前内分泌检查（垂体激素）评估'")
    private String pa_2_2_1;
    @Column(columnDefinition = "double COMMENT '血清催乳素PRL(ng/ml)'")
    private Double pa_2_2_1_1;
    @Column(columnDefinition = "double COMMENT '黄体生成素LH(mIU/mL)'")
    private Double pa_2_2_1_2;
    @Column(columnDefinition = "double COMMENT '促卵泡成熟激素FSH(mIU/mL)'")
    private Double pa_2_2_1_3;
    @Column(columnDefinition = "double COMMENT '雌二醇E2(pg/ml)'")
    private Double pa_2_2_1_4;
    @Column(columnDefinition = "double COMMENT '孕酮P4(ng/ml)'")
    private Double pa_2_2_1_5;
    @Column(columnDefinition = "double COMMENT '生长激素HGH(ng/ml)'")
    private Double pa_2_2_1_6;
    @Column(columnDefinition = "double COMMENT '皮质醇COR(ng/ml)'")
    private Double pa_2_2_1_7;
    @Column(columnDefinition = "double COMMENT '睾酮T(ng/ml)'")
    private Double pa_2_2_1_8;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行术前内分泌检查（甲状腺激素）评估'")
    private String pa_2_3_1;
    @Column(columnDefinition = "double COMMENT '促甲状腺激素（或超敏促甲状腺激素）TSH(uIU/ml)'")
    private Double pa_2_3_1_1;
    @Column(columnDefinition = "double COMMENT '三碘甲状腺原氨酸T3(nmol/L)'")
    private Double pa_2_3_1_2;
    @Column(columnDefinition = "double COMMENT '游离T3 FT3(pmol/L)'")
    private Double pa_2_3_1_3;
    @Column(columnDefinition = "double COMMENT '甲状腺素T4(nmol/L)'")
    private Double pa_2_3_1_4;
    @Column(columnDefinition = "double COMMENT '游离T4 FT4(pmol/L)'")
    private Double pa_2_3_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行术前内分泌检查（IGF-1）评估'")
    private String pa_2_4_1;
    @Column(columnDefinition = "double COMMENT '胰岛素生长因子IGF-1(ng/ml)'")
    private Double pa_2_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '术前评估肾上腺功能不全或显著的垂体功能低减的患者是否需给予激素替代治疗'")
    private String pa_2_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '生长激素腺瘤是否评估心肺等功能'")
    private String pa_2_4_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行术前多学科（MDT）诊疗讨论'")
    private String pa_2_5_1;
    @Column(columnDefinition = "datetime COMMENT '讨论日期时间'")
    private Date pa_2_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '术前多学科（MDT）诊疗讨论主要内容'")
    private String pa_2_5_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他术前多学科（MDT）诊疗讨论主要内容'")
    private String pa_2_5_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '参加术前多学科（MDT）诊疗讨论的科室'")
    private String pa_2_5_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他参加术前多学科（MDT）诊疗讨论的科室'")
    private String pa_2_5_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术治疗适应证的选择因素'")
    private String pa_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有手术治疗禁忌证'")
    private String pa_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '经鼻蝶人路手术治疗禁忌征的选择'")
    private String pa_3_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '开颅垂体 腺瘤切除手术治疗禁忌征的选择'")
    private String pa_3_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有可能并发术中出血评估及安全处置预案'")
    private String pa_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有可能并发术中脑脊液漏评估及安全处置预案'")
    private String pa_4_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有可能并发额叶挫伤评估及安全处置预案'")
    private String pa_4_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有可能并发视神经损伤评估及安全处置预案'")
    private String pa_4_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有可能并发颈内动脉损伤评估及安全处置预案'")
    private String pa_4_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用预防性抗菌药物'")
    private String cm_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '预防性抗菌药物选择'")
    private String cm_1_2_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '选择碳青霉烯类及替加环素等特殊使用级抗菌药物'")
    private String cm_1_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他特殊使用级抗菌药物名称'")
    private String cm_1_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素'")
    private String cm_1_3_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素填写'")
    private String cm_1_3_1_1;
    @Column(columnDefinition = "datetime COMMENT '使用首剂抗菌药物起始时间'")
    private Date cm_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术时间是否≥3小时'")
    private String cm_1_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否术中追加抗菌药物'")
    private String cm_1_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '术中出血量是否≥1500ml'")
    private String cm_1_5_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否术中追加抗菌药物'")
    private String cm_1_5_4;
    @Column(columnDefinition = "datetime COMMENT '术后抗菌药物停止使用时间'")
    private Date cm_1_6_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用抗菌药物时间使用时间分层'")
    private String cm_1_6_2;
    @Column(columnDefinition = "varchar(64) COMMENT '术后72小时之后继续使用的原因'")
    private String cm_1_6_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有手术后并发症'")
    private String cm_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术后并发症类别及ICD-10四位亚目的选择'")
    private String cm_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他手术后并发症类别及ICD-10四位亚目和名称填写'")
    private String cm_2_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '介入操作与手术其他并发症'")
    private String cm_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术患者手术后肺栓塞'")
    private String cm_2_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '手术患者手术后深静脉血栓'")
    private String cm_2_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '手术患者手术后败血症'")
    private String cm_2_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '手术患者手术后出血或血肿'")
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
    @Column(columnDefinition = "varchar(64) COMMENT '急性肾功能衰竭（手术后）'")
    private String cm_2_3_15;
    @Column(columnDefinition = "varchar(64) COMMENT 'PA术后特指并发症'")
    private String cm_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '影响程度的选择'")
    private String cm_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有手术后再手术'")
    private String pa_6_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术后再手术名称'")
    private String pa_6_4_2;
    @Column(columnDefinition = "datetime COMMENT '再手术日期时间'")
    private Date pa_6_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有病理报告记录单'")
    private String pa_7_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '病理报告记录单中基本内容'")
    private String pa_7_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '垂体腺瘤免疫组化情况'")
    private String pa_7_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '垂体瘤Ki-67阳性细胞比例是否确定'")
    private String pa_7_2_1;
    @Column(columnDefinition = "double COMMENT '垂体瘤Ki-67阳性细胞比例(%)'")
    private Double pa_7_2_2;
    @Column(columnDefinition = "double COMMENT '手术中出血量(ml)'")
    private Double pa_8_1_1;
    @Column(columnDefinition = "double COMMENT '手术中输血量(ml)'")
    private Double pa_8_1_2;
    @Column(columnDefinition = "double COMMENT '手术后出血量(ml)'")
    private Double pa_8_1_3;
    @Column(columnDefinition = "double COMMENT '手术后输血量(ml)'")
    private Double pa_8_1_4;
    @Column(columnDefinition = "double COMMENT '全血(ml)'")
    private Double pa_8_2_1;
    @Column(columnDefinition = "double COMMENT '成份血(ml)'")
    private Double pa_8_2_2;
    @Column(columnDefinition = "double COMMENT '血浆(ml)'")
    private Double pa_8_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行术后视力视野的复查及评估'")
    private String pa_9_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '复查及评估结果是否确定'")
    private String pa_9_1_2;
    @Column(columnDefinition = "double COMMENT '术后左眼视力数值'")
    private Double pa_9_1_2_1;
    @Column(columnDefinition = "double COMMENT '术后右眼视力数值'")
    private Double pa_9_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '术后2-3天,是否复查内分泌激素'")
    private String pa_9_2_1;
    @Column(columnDefinition = "double COMMENT '血清催乳素PRL(ng/ml)'")
    private Double pa_9_2_1_1;
    @Column(columnDefinition = "double COMMENT '黄体生成素LH(mIU/mL)'")
    private Double pa_9_2_1_2;
    @Column(columnDefinition = "double COMMENT '促卵泡成熟激素FSH(mIU/mL)'")
    private Double pa_9_2_1_3;
    @Column(columnDefinition = "double COMMENT '雌二醇E2(pg/ml)'")
    private Double pa_9_2_1_4;
    @Column(columnDefinition = "double COMMENT '孕酮P4(ng/ml)'")
    private Double pa_9_2_1_5;
    @Column(columnDefinition = "double COMMENT '生长激素HGH(ng/ml)'")
    private Double pa_9_2_1_6;
    @Column(columnDefinition = "double COMMENT '皮质醇COR(ng/ml)'")
    private Double pa_9_2_1_7;
    @Column(columnDefinition = "double COMMENT '睾酮T(ng/ml)'")
    private Double pa_9_2_1_8;
    @Column(columnDefinition = "double COMMENT '促甲状腺激素（或超敏促甲状腺激素）TSH(uIU/ml)'")
    private Double pa_9_2_1_9;
    @Column(columnDefinition = "double COMMENT '三碘甲状腺原氨酸T3(nmol/L)'")
    private Double pa_9_2_1_10;
    @Column(columnDefinition = "double COMMENT '游离三碘甲状腺原氨酸 FT3(pmol/L)'")
    private Double pa_9_2_1_11;
    @Column(columnDefinition = "double COMMENT '甲状腺素T4(nmol/L)'")
    private Double pa_9_2_1_12;
    @Column(columnDefinition = "double COMMENT '游离甲状腺素 FT4(pmol/L)'")
    private Double pa_9_2_1_13;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行电解质水平监测'")
    private String pa_9_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '电解质水平监测的时段'")
    private String pa_9_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '电解质水平监测的时段'")
    private String pa_9_3_2;
    @Column(columnDefinition = "double COMMENT '钾离子(mmol/L)'")
    private Double pa_9_3_2_1;
    @Column(columnDefinition = "double COMMENT '钠离子(mmol/L)'")
    private Double pa_9_3_2_2;
    @Column(columnDefinition = "double COMMENT '氯离子(mmol/L)'")
    private Double pa_9_3_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行术后辅助放疗'")
    private String pa_10_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术后辅助放疗指征的选择'")
    private String pa_10_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '术后辅助放疗模式的选择'")
    private String pa_10_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行术后辅助药物治疗'")
    private String pa_10_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '药物治疗符合指征'")
    private String pa_10_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否入院时进行重点护理评估且有记录'")
    private String pa_11_1_0;
    @Column(columnDefinition = "varchar(64) COMMENT '行走评估结果'")
    private String pa_11_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '呼吸评估结果'")
    private String pa_11_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '评估视力视野障碍对患者的影响'")
    private String pa_11_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '入院后第一个24小时液体出入量'")
    private String pa_11_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其中，每小时液体出入量'")
    private String pa_11_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '实施卒中健康教育记录内容'")
    private String pa_11_1_6;
    @Column(columnDefinition = "varchar(64) COMMENT '经蝶手术患者强化鼻腔护理,减少术后脑脊液鼻漏并发症的护理措施'")
    private String pa_11_1_7;
    @Column(columnDefinition = "varchar(64) COMMENT '尿量异常患者的长期护理'")
    private String pa_11_1_9;
    @Column(columnDefinition = "varchar(64) COMMENT '饮食指导'")
    private String pa_11_1_10;
    @Column(columnDefinition = "varchar(64) COMMENT '压疮评估分值是否确定'")
    private String pa_11_1_11_3;
    @Column(columnDefinition = "double COMMENT '压疮评估（Braden评分值）分值'")
    private Double pa_11_1_11;
    @Column(columnDefinition = "varchar(64) COMMENT '压疮评估结果选择'")
    private String pa_11_1_11_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行预防压疮告知'")
    private String pa_11_1_11_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施手术前健康教育且有记录'")
    private String pa_11_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '实施卒中健康教育记录内容'")
    private String pa_11_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他实施卒中健康教育记录内容'")
    private String pa_11_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施术后健康教育且有记录'")
    private String pa_11_1_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '吸烟史'")
    private String pa_11_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '吸烟程度评估'")
    private String pa_11_1_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '接受戒烟的建议或者戒烟治疗'")
    private String pa_11_1_3_5;
    @Column(columnDefinition = "varchar(64) COMMENT '交与患者“出院小结”的副本，并告知患者出院时风险因素'")
    private String pa_11_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药'")
    private String pa_11_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '告知发生紧急情况时求援救治途径'")
    private String pa_11_2_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时教育与随访'")
    private String pa_11_2_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '告知何为风险因素与紧急情况'")
    private String pa_11_2_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '符合治愈标准的选项'")
    private String pa_12_1_1;
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
