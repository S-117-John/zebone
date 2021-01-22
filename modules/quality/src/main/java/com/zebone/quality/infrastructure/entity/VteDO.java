package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

//@Entity
//@Table(name = "quality_vte")
//@Data
public class VteDO extends DataEntity{


    @Column(columnDefinition = "varchar(64) COMMENT 'VTE风险评估'")
    private String vte_0_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他临床科室的其他中高风险患者的科室名称'")
    private String vte_0_1_2_1;
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
    @Column(columnDefinition = "varchar(64) COMMENT '中高风险患者和入住ICU的患者的主要风险项选择'")
    private String vte_0_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '严重创伤 (累及身体多个部位损伤)'")
    private String vte_0_1_1_t;
    @Column(columnDefinition = "varchar(64) COMMENT '脓毒症ICD-10亚目编码'")
    private String vte_0_1_1_d;
    @Column(columnDefinition = "varchar(64) COMMENT '累及身体多个部位损伤ICD-10类目编码'")
    private String vte_0_1_1_e;
    @Column(columnDefinition = "varchar(64) COMMENT '制动选择'")
    private String vte_0_1_1_i;
    @Column(columnDefinition = "varchar(64) COMMENT '机械通气ICD-9-CM-3亚目编码'")
    private String vte_0_1_1_j;
    @Column(columnDefinition = "varchar(64) COMMENT '留置中心静脉导管ICD-9-CM-3亚目编码'")
    private String vte_0_1_1_k;
    @Column(columnDefinition = "varchar(64) COMMENT '血液净化治疗ICD-9-CM-3亚目编码'")
    private String vte_0_1_1_l;
    @Column(columnDefinition = "varchar(64) COMMENT '使用肌肉松弛和镇静药物选择'")
    private String vte_0_1_1_m;
    @Column(columnDefinition = "varchar(64) COMMENT '应用收缩血管药物选择'")
    private String vte_0_1_1_n;
    @Column(columnDefinition = "varchar(64) COMMENT '医师认为需评估的其他中高风险患者--高危孕产妇记录'")
    private String vte_0_1_1_q;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时主要诊断ICD-10编码及名称'")
    private String vte_0_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时其他诊断ICD-10编码及名称'")
    private String vte_0_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时主要手术及操作ICD-9-CM-3编码及名称'")
    private String vte_0_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时其他手术及操作ICD-9-CM-3编码及名称'")
    private String vte_0_1_6;
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
    @Column(columnDefinition = "varchar(64) COMMENT '入院日期时间'")
    private Date cm_0_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院日期时间'")
    private Date cm_0_2_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '入住ICU日期时间'")
    private Date cm_0_2_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '离开ICU日期时间'")
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
    @Column(columnDefinition = "varchar(64) COMMENT '实施血栓风险因素评估工具选择'")
    private String vte_1_1_1;
    @Column(columnDefinition = "double COMMENT 'Caprini评估分值'")
    private Double vte_1_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '风险分层'")
    private String vte_1_1_3;
    @Column(columnDefinition = "double COMMENT 'Padua评分分值'")
    private Double vte_1_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '风险分层'")
    private String vte_1_1_5;
    @Column(columnDefinition = "double COMMENT '呼吸(次/分)'")
    private Double vte_1_2_1;
    @Column(columnDefinition = "double COMMENT '脉搏(次/分)'")
    private Double vte_1_2_2;
    @Column(columnDefinition = "double COMMENT '收缩压(mmHg)'")
    private Double vte_1_2_3;
    @Column(columnDefinition = "double COMMENT '舒张压(mmHg)'")
    private Double vte_1_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '实施实施下肢静脉血管多普勒超声检查评估'")
    private String vte_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '实施多普勒超声检查评估日期时间'")
    private Date vte_2_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '有无多普勒超声检查阳性发现'")
    private String vte_2_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '实施D⁃二聚体检测评估'")
    private String vte_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'D⁃二聚体检测评估日期时间'")
    private Date vte_2_2_2;
    @Column(columnDefinition = "double COMMENT 'D⁃二聚体检测值(μg／L)'")
    private Double vte_2_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT 'D⁃二聚体检测评估结论'")
    private String vte_2_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施氧合评估'")
    private String vte_2_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '氧合评估'")
    private String vte_2_2_6;
    @Column(columnDefinition = "double COMMENT '动脉血气分析值(mmHg)'")
    private Double vte_2_2_6_1;
    @Column(columnDefinition = "double COMMENT '指氧仪检查值(%)'")
    private Double vte_2_2_6_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施心脏生物学标志物检测'")
    private String vte_2_2_7;
    @Column(columnDefinition = "varchar(64) COMMENT '心脏生物学标志物检测项目'")
    private String vte_2_2_8;
    @Column(columnDefinition = "double COMMENT '肌钙蛋白T（TnT）检测值'")
    private Double vte_2_2_8_1;
    @Column(columnDefinition = "double COMMENT '肌钙蛋白I（TnI）检测值'")
    private Double vte_2_2_8_2;
    @Column(columnDefinition = "double COMMENT '肌酸激酶同工酶（CK-MB）检测值'")
    private Double vte_2_2_8_3;
    @Column(columnDefinition = "double COMMENT '心肌肌红蛋白（Myo）检测值'")
    private Double vte_2_2_8_4;
    @Column(columnDefinition = "double COMMENT 'B型钠尿肽（BNP）检测值'")
    private Double vte_2_2_8_5;
    @Column(columnDefinition = "double COMMENT 'N端B型钠尿肽前体（NT-ProBNP）检测值'")
    private Double vte_2_2_8_6;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施凝血功能检测'")
    private String vte_2_2_9;
    @Column(columnDefinition = "varchar(64) COMMENT '凝血功能检测项目'")
    private String vte_2_2_10;
    @Column(columnDefinition = "double COMMENT '血浆凝血酶原时间（PT）检测值'")
    private Double vte_2_2_10_1;
    @Column(columnDefinition = "double COMMENT '纤维蛋白原（FIB）检测值'")
    private Double vte_2_2_10_2;
    @Column(columnDefinition = "double COMMENT '活化部分凝血活酶时间（APTT）检测值'")
    private Double vte_2_2_10_3;
    @Column(columnDefinition = "double COMMENT '血浆凝血酶时间（TT）检测值'")
    private Double vte_2_2_10_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否行CT肺动脉造影（CTPA）检查评估'")
    private String vte_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '实施行CT肺动脉造影（CTPA）检查日期时间'")
    private Date vte_2_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'CT肺动脉造影（CTPA）检查阳性发现'")
    private String vte_2_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '有无履行VTE预防相关的患者/家属知情同意'")
    private String vte_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'VTE预防相关的患者/家属知情同意'")
    private String vte_3_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '有无实施出血风险和其他可能影响预防的因素评估'")
    private String vte_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '实施出血风险和其他可能影响预防的因素评估'")
    private String vte_3_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '患者因素选择'")
    private String vte_3_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '基础疾病'")
    private String vte_3_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '合并用药'")
    private String vte_3_2_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '侵入性操作'")
    private String vte_3_2_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他实施出血风险和其他可能影响预防的因素评估'")
    private String vte_3_2_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '物理性预防措施应用禁忌'")
    private String vte_3_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否需要三级预防深静脉栓塞'")
    private String vte_3_3_0;
    @Column(columnDefinition = "varchar(64) COMMENT '三级预防深静脉栓塞措施选择'")
    private String vte_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '基本预防措施的选择'")
    private String vte_3_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他基本预防措施'")
    private String vte_3_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '医嘱执行起始日期'")
    private Date vte_3_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '机械预防措施的选择'")
    private String vte_3_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他机械预防措施'")
    private String vte_3_3_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '医嘱执行日期'")
    private Date vte_3_3_5;
    @Column(columnDefinition = "varchar(64) COMMENT '预防性地药物的选择'")
    private String vte_3_3_6;
    @Column(columnDefinition = "varchar(64) COMMENT '其他预防性地药物'")
    private String vte_3_3_6_1;
    @Column(columnDefinition = "varchar(64) COMMENT '医嘱执行日期'")
    private Date vte_3_2_7;
    @Column(columnDefinition = "varchar(64) COMMENT '出院后继续使用抗凝药'")
    private String vte_3_3_8;
    @Column(columnDefinition = "varchar(64) COMMENT '其他出院后继续使用抗凝药'")
    private String vte_3_3_8_1;
    @Column(columnDefinition = "varchar(64) COMMENT '预防依从性评估'")
    private String vte_3_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '预防安全性主要监测项目'")
    private String vte_3_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他预防安全性主要监测项目'")
    private String vte_3_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行预防效果评估'")
    private String vte_3_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '预防效果评估及相关不良事件'")
    private String vte_3_4_4;
    @Column(columnDefinition = "varchar(64) COMMENT '与预防相关的不良事件'")
    private String vte_3_4_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '与预防不相关的不良事件'")
    private String vte_3_4_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他预防效果评估及相关不良事件'")
    private String vte_3_4_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否为临床高度拟诊VTE的患者'")
    private String vte_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'DVT临床高度可疑患者的识别检查项目'")
    private String vte_4_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他DVT临床高度可疑患者的识别检查项目'")
    private String vte_4_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '急性PTE临床高度可疑患者的识别检查项目'")
    private String vte_4_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他急性PTE临床高度可疑患者的识别检查项目'")
    private String vte_4_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出现首个VTE的临床表现时间'")
    private Date vte_4_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否经MDT制定VTE 针对性紧急处理方案'")
    private String vte_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '临床高度可疑为VTE后,针对性紧急处理的方法'")
    private String vte_4_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他临床高度可疑为VTE后,针对性紧急处理的方法'")
    private String vte_4_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '抗凝重叠治疗医嘱的执行起始的时间选择'")
    private String vte_4_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '溶栓剂（rt-PA+尿激酶）治疗医嘱的执行起始的时间'")
    private Date vte_4_5_1_a;
    @Column(columnDefinition = "varchar(64) COMMENT '溶栓剂（rt-PA使用普通肝素（UFH）治疗医嘱的执行起始的时间+尿激酶）治疗医嘱的执行起始的时间'")
    private Date vte_4_5_1_b;
    @Column(columnDefinition = "varchar(64) COMMENT '低分子肝素钙（LMWH）治疗医嘱的执行起始的时间'")
    private Date vte_4_5_1_c;
    @Column(columnDefinition = "varchar(64) COMMENT '维生素K拮抗剂（VKA）治疗医嘱的执行起始的时间'")
    private Date vte_4_5_1_d;
    @Column(columnDefinition = "varchar(64) COMMENT '华法林（Warfarin）治疗医嘱的执行起始的时间'")
    private Date vte_4_5_1_e;
    @Column(columnDefinition = "varchar(64) COMMENT '其他抗凝剂治疗医嘱的执行起始的时间'")
    private Date vte_4_5_1_f;
    @Column(columnDefinition = "varchar(64) COMMENT '放置静脉滤器（IVCF）预防PTE的执行起始的时间'")
    private Date vte_4_6_1;
    @Column(columnDefinition = "varchar(64) COMMENT '放置静脉滤器（IVCF）预防PTE的术式'")
    private String vte_4_6_2;
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
