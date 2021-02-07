package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "QUALITY_KNEE")
@Data
public class KneeDO extends DataEntity{

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
    @Column(columnDefinition = "varchar(64) COMMENT '主要诊断ICD-10六位临床扩展编码与名称'")
    private String cm_0_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他主耍诊断ICD-10六位临床扩展编码与名称'")
    private String knee_0_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称'")
    private String cm_0_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称'")
    private String cm_0_1_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要手术操作ICD-9-CM-3六位临床扩展编码与名称'")
    private String knee_0_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否出院后31天内重复住院'")
    private String cm_0_1_5;
    @Column(columnDefinition = "datetime COMMENT '出生日期'")
    private Date cm_0_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者性别'")
    private String cm_0_2_1_2;
    @Column(columnDefinition = "double COMMENT '患者体重（kg）'")
    private Double cm_0_2_1_3;
    @Column(columnDefinition = "double COMMENT '患者/患儿身高（cm）'")
    private Double cm_0_2_1_5;
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
    @Column(columnDefinition = "varchar(64) COMMENT '人工膝关节置换术适应证的选择'")
    private String knee_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他人工膝关节置换术适应证'")
    private String knee_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术病变侧别'")
    private String knee_1_2_2_0;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施膝关节功能评估'")
    private String knee_1_2_1;
    @Column(columnDefinition = "double COMMENT '左HSS评分值'")
    private Double knee_1_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '左评估结果'")
    private String knee_1_2_2_4;
    @Column(columnDefinition = "double COMMENT '右HSS评分值'")
    private Double knee_1_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '右评估结果'")
    private String knee_1_2_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '麻醉方式的选择'")
    private String knee_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术部位的选择'")
    private String knee_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '止血带使用时间的选择'")
    private String knee_1_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '决定手术方案的医师资质'")
    private String knee_1_4_1;
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
    @Column(columnDefinition = "varchar(64) COMMENT '术后48小时之后继续使用的原因'")
    private String cm_1_6_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '有无实施手术患者静脉血栓栓塞症风险评估'")
    private String knee_3_1_1;
    @Column(columnDefinition = "double COMMENT 'Caprini评估分值'")
    private Double knee_3_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'Caprini评估风险分层'")
    private String knee_3_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '临床常用检测方法'")
    private String knee_3_1_8;
    @Column(columnDefinition = "varchar(64) COMMENT '实施预防术后深静脉血栓措施是否有禁忌'")
    private String knee_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '实施机械预防措施应用禁忌'")
    private String knee_3_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '实施药物应用绝对禁忌证'")
    private String knee_3_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '实施药物应用相对禁忌证'")
    private String knee_3_2_4;
    @Column(columnDefinition = "datetime COMMENT '预防深静脉栓塞医嘱执行时间'")
    private Date knee_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '基本预防措施'")
    private String knee_3_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他基本预防措施'")
    private String knee_3_4_1_1;
    @Column(columnDefinition = "datetime COMMENT '基本预防措施医嘱执行日期'")
    private Date knee_3_4_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '机械预防措施'")
    private String knee_3_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他机械预防措施'")
    private String knee_3_4_2_1;
    @Column(columnDefinition = "datetime COMMENT '机械预防措施医嘱执行日期'")
    private Date knee_3_4_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '预防性地给予药物治疗'")
    private String knee_3_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '预防性地给予药物治疗填写'")
    private String knee_3_4_3_1;
    @Column(columnDefinition = "datetime COMMENT '预防性地给予药物医嘱执行日期'")
    private Date knee_3_4_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '出院后继续使用抗凝药'")
    private String knee_3_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他出院后使用的抗凝药'")
    private String knee_3_5_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施输血'")
    private String knee_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '用血类别的选择'")
    private String knee_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术输血侧别'")
    private String knee_4_2_1_1;
    @Column(columnDefinition = "double COMMENT '单侧手术术中输血量（ml）'")
    private Double knee_4_2_2_1;
    @Column(columnDefinition = "double COMMENT '单侧手术术后输血量（ml）'")
    private Double knee_4_2_2_2;
    @Column(columnDefinition = "double COMMENT '双侧手术术中输血量（ml）'")
    private Double knee_4_2_3_1;
    @Column(columnDefinition = "double COMMENT '双侧手术术后输血量（ml）'")
    private Double knee_4_2_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '康复治疗前是否评估'")
    private String knee_5_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '康复治疗适宜性评估结果'")
    private String knee_5_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '康复实施人员实施康复的方式'")
    private String knee_5_1_3;
    @Column(columnDefinition = "datetime COMMENT '康复实施日期(首次)'")
    private Date knee_5_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '选择未能进行康复原因'")
    private String knee_5_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行手术后镇痛治疗'")
    private String knee_5_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '疼痛强度评估方法的选择'")
    private String knee_5_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他疼痛强度评估方法'")
    private String knee_5_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '药物选择多模式的选择'")
    private String knee_5_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他药物选择多模式'")
    private String knee_5_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '镇痛用药多途径的选择'")
    private String knee_5_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '药物选择多模式填写'")
    private String knee_5_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有手术后并发症'")
    private String cm_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术后并发症类别及ICD-10四位亚目的选择'")
    private String cm_2_2;
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
    @Column(columnDefinition = "varchar(64) COMMENT '肌肉骨骼系统术后并发症'")
    private String cm_2_3_15;
    @Column(columnDefinition = "varchar(64) COMMENT '骨科植入物的并发症（不包括脓毒症）'")
    private String cm_2_3_16;
    @Column(columnDefinition = "varchar(64) COMMENT '是否伴有内科原有疾病治疗'")
    private String knee_6_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要的内科疾患'")
    private String knee_6_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '影响程度的选择'")
    private String cm_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '入院宣教选择'")
    private String knee_8_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术前一日的健康教育选择'")
    private String knee_8_2;
    @Column(columnDefinition = "varchar(64) COMMENT '术后六小时内的健康教育'")
    private String knee_8_3;
    @Column(columnDefinition = "varchar(64) COMMENT '术后六小时至二十四小时的健康教育'")
    private String knee_8_4;
    @Column(columnDefinition = "varchar(64) COMMENT '术后一周内健康教育'")
    private String knee_8_5;
    @Column(columnDefinition = "varchar(64) COMMENT '术后一周后健康教育'")
    private String knee_8_6;
    @Column(columnDefinition = "varchar(64) COMMENT '为患者提供出院前健康教育'")
    private String knee_8_7;
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
