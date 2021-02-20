package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "QUALITY_GLI")
@Data
public class GliDO extends DataEntity{



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
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称'")
    private String cm_0_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称'")
    private String cm_0_1_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其它ICD-9-CM-3编码与名称'")
    private String cm_0_1_4_3;
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
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施首次头部影像学检查'")
    private String gli_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '实施头部影像学检查项目'")
    private String gli_1_1_2;
    @Column(columnDefinition = "datetime COMMENT '完成头部影像学检查报告日期时间'")
    private Date gli_1_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行手术前影像学评估'")
    private String gli_2_1_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '手术前影像学评估方法'")
    private String gli_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其它影像学评估'")
    private String gli_2_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施手术前神经功能评估'")
    private String gli_2_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '手术前神经功能评估的方法'")
    private String gli_2_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其它神经功能评估'")
    private String gli_2_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施手术前癫痫评估'")
    private String gli_2_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '术前癫痫评估'")
    private String gli_2_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其它癫痫评估'")
    private String gli_2_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否告知患者或者家属，手术必要性及原在相关风险的知情同意'")
    private String gli_2_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '手术治疗方式选择'")
    private String gli_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '肿瘤切除手术适应证'")
    private String gli_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有开颅手术的禁忌证'")
    private String gli_3_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '禁忌证'")
    private String gli_3_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '病理活检术适应证'")
    private String gli_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有病理活检手术的禁忌证'")
    private String gli_3_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '禁忌证的选择'")
    private String gli_3_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '病理活检手术方式'")
    private String gli_3_3_4;
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
    @Column(columnDefinition = "varchar(64) COMMENT '术中是否实施神经功能保护措施'")
    private String gli_5_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '哪种类型脑肿瘤需要术中使用的神经功能保护措施'")
    private String gli_5_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术中使用的神经功能保护措施'")
    private String gli_5_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行术中肿瘤切除率评估'")
    private String gli_5_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '术中肿瘤切除情况'")
    private String gli_5_1_3;
    @Column(columnDefinition = "double COMMENT '手术中出血量 (ml)'")
    private Double gli_6_1_1;
    @Column(columnDefinition = "double COMMENT '手术中输血量 (ml)'")
    private Double gli_6_1_2;
    @Column(columnDefinition = "double COMMENT '手术后出血量 (ml)'")
    private Double gli_6_1_3;
    @Column(columnDefinition = "double COMMENT '手术后输血量 (ml)'")
    private Double gli_6_1_4;
    @Column(columnDefinition = "double COMMENT '全血 (ml)'")
    private Double gli_6_2_1;
    @Column(columnDefinition = "double COMMENT '成份血 (ml)'")
    private Double gli_6_2_2;
    @Column(columnDefinition = "double COMMENT '血浆 (ml)'")
    private Double gli_6_2_3;
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
    @Column(columnDefinition = "varchar(64) COMMENT '术后急性肾功能损害'")
    private String cm_2_3_15;
    @Column(columnDefinition = "varchar(64) COMMENT 'GLI术后特指并发症'")
    private String cm_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '影响程度的选择'")
    private String cm_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否为手术后再手术'")
    private String cm_2_6;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行复查头颅平扫CT'")
    private String gli_8_1_1;
    @Column(columnDefinition = "datetime COMMENT '评估日期时间'")
    private Date gli_8_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '评估结果'")
    private String gli_8_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他评估结果'")
    private String gli_8_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否需要二次手术'")
    private String gli_8_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施MRI T1/T2加权平扫+ FLAIR+DWI+增强扫描影像学评估'")
    private String gli_8_2_1;
    @Column(columnDefinition = "datetime COMMENT '影像学评估日期时间'")
    private Date gli_8_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '影像学检测复查评估'")
    private String gli_8_2_3;
    @Column(columnDefinition = "double COMMENT '肿瘤全切率(%)'")
    private Double gli_8_2_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '高级别胶质瘤评估标准'")
    private String gli_8_2_3_1_2;
    @Column(columnDefinition = "double COMMENT '肿瘤全切率 (%)'")
    private Double gli_8_2_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '低级别胶质瘤评估标准'")
    private String gli_8_2_3_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '病理诊断报告基本内容'")
    private String gli_9_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其它诊断报告基本内容'")
    private String gli_9_1_1_1;
    @Column(columnDefinition = "datetime COMMENT '病理诊断报告日期时间'")
    private Date gli_9_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '病理诊断是否按照2016 CNS WHO肿瘤分类标准的名称'")
    private String gli_9_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '病理诊断名称符合2016 CNS WHO肿瘤分类标准'")
    private String gli_9_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '弥漫性星形细胞和少突胶质细胞肿瘤'")
    private String gli_9_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他星形细胞肿瘤'")
    private String gli_9_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '室管膜肿瘤'")
    private String gli_9_1_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其它胶质瘤'")
    private String gli_9_1_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '脉络丛肿瘤'")
    private String gli_9_1_3_5;
    @Column(columnDefinition = "varchar(64) COMMENT '其它病理诊断分级名称'")
    private String gli_9_1_3_6;
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
    @Column(columnDefinition = "varchar(64) COMMENT '是否为Ⅱ级以上（含WHOⅡ级）肿瘤'")
    private String gli_11_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行免疫组化检测'")
    private String gli_11_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行分子病理学检测'")
    private String gli_11_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '检测内容'")
    private String gli_11_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '出院前存在功能残损'")
    private String gli_12_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其它功能残损'")
    private String gli_12_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院前是否完成KPS评分'")
    private String gli_12_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'KPS评分要素'")
    private String gli_12_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '行走评估结果'")
    private String gli_13_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '呼吸评估结果'")
    private String gli_13_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '饮食评估结果'")
    private String gli_13_1_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '吞咽评估结果'")
    private String gli_13_1_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '压疮评估无法确定或无记录'")
    private String gli_13_1_2_5_3;
    @Column(columnDefinition = "double COMMENT '压疮评估（Braden评分值）分值'")
    private Double gli_13_1_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '压疮评估结果选择'")
    private String gli_13_1_2_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行预防压疮告知'")
    private String gli_13_1_2_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '神经系统评估'")
    private String gli_13_1_6;
    @Column(columnDefinition = "varchar(64) COMMENT '实施术前健康教育有记录'")
    private String gli_13_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其它术前健康教育记录'")
    private String gli_13_1_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '实施术后健康教育有记录'")
    private String gli_13_1_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其它术后健康教育记录'")
    private String gli_13_1_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '交与患者“出院小结”的副本，并告知患者出院时风险因素'")
    private String gli_13_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药'")
    private String gli_13_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '告知发生紧急情况时求援救治途径'")
    private String gli_13_2_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时教育与随访'")
    private String gli_13_2_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '告知何为风险因素与紧急情况'")
    private String gli_13_2_2_5;
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
