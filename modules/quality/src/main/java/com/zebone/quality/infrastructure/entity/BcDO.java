package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "QUALITY_BC")
public class BcDO extends DataEntity{



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
    @Column(columnDefinition = "varchar(64) COMMENT '非手术治疗ICD-9-CM-3编码与名称'")
    private String bc_0_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '其它非手术治疗主要诊断编码与名称'")
    private String bc_0_1_5_1;
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
    @Column(columnDefinition = "varchar(64) COMMENT '是否为T1-2,N0M0 乳腺癌'")
    private String bc_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否手术前接受乳房前哨淋巴结活检'")
    private String bc_1_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'ICD-9-CM-3编码与名称'")
    private String bc_1_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否乳腺 X 线摄影'")
    private String bc_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '乳腺 X 线摄影（BI-RADS分级）'")
    private String bc_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '治疗前接受过2个或以上治疗科室会诊的患者'")
    private String bc_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否乳腺癌治疗前 TNM 临床分期'")
    private String bc_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '临床分期依据一: 主要有哪些临床表现及体征'")
    private String bc_2_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '临床分期依据一: 其他临床表现及体征'")
    private String bc_2_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '临床分期依据二: 主要有哪些辅助检查'")
    private String bc_2_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '临床分期依据二: 其他辅助检查'")
    private String bc_2_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '临床分期依据三: 组织学与细胞学检查'")
    private String bc_2_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '临床分期依据三: 其他组织学与细胞学检查'")
    private String bc_2_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '临床TNM分期要素: 原发肿瘤（T）'")
    private String bc_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '临床TNM分期要素:区域淋巴结（N）'")
    private String bc_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '临床TNM分期要素:远处转移（M）'")
    private String bc_2_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '临床分期结论'")
    private String bc_2_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否乳腺癌手术治疗'")
    private String bc_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术方式'")
    private String bc_3_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他手术方式'")
    private String bc_3_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '有无禁忌行乳房再造的情况'")
    private String bc_3_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '禁忌行乳房再造的情况'")
    private String bc_3_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '保乳术适应证'")
    private String bc_3_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '其它保乳术适应证'")
    private String bc_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否术中接受腋窝淋巴结清扫'")
    private String bc_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术中接受腋窝淋巴结清扫手术方式'")
    private String bc_3_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '术中接受腋窝淋巴结清扫手术其它方式'")
    private String bc_3_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '接受清扫腋窝淋巴结范围'")
    private String bc_3_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '术后病理报告记录,是否有肿瘤大小、切缘、脉管浸润'")
    private String bc_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术后病理报告记录,是否侵犯皮肤和/或胸壁'")
    private String bc_4_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '术后病理报告记录,是否有检查淋巴结组数'")
    private String bc_4_1_3;
    @Column(columnDefinition = "double COMMENT '检查淋巴结组数(个)'")
    private Double bc_4_1_3_1;
    @Column(columnDefinition = "double COMMENT '淋巴结转移性癌数(个)'")
    private Double bc_4_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '术后病理报告记录,是否有免疫组化检测内容'")
    private String bc_4_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '免疫组化检测项目'")
    private String bc_4_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '免疫组化检测其他项目'")
    private String bc_4_1_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '术后病理报告记录,有无病理类型分级'")
    private String bc_4_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '病理分期要素: T(肿瘤)'")
    private String bc_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '病理分期要素: N(局部淋巴结)'")
    private String bc_4_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '病理分期要素: M(远处转移)'")
    private String bc_4_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '4个分期的选择'")
    private String bc_4_2_4;
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
    @Column(columnDefinition = "varchar(64) COMMENT '乳腺癌手术特指并发症'")
    private String bc_6_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他手术特指并发症'")
    private String cm_2_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '影响程度的选择'")
    private String cm_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '非计划二次手术'")
    private String bc_6_2_1;
    @Column(columnDefinition = "datetime COMMENT '手术起始(切皮)日期'")
    private Date bc_6_2_2;
    @Column(columnDefinition = "datetime COMMENT '手术结束(切口闭合)日期'")
    private Date bc_6_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '术后患者是否规范放疗'")
    private String bc_7_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术后规范放疗的患者选择'")
    private String bc_7_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其它术后规范放疗的患者'")
    private String bc_7_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '采用放疗技术的选择'")
    private String bc_7_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '采用放疗其他技术'")
    private String bc_7_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '放射治疗记录内容选择'")
    private String bc_7_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '放射治疗记录其他内容'")
    private String bc_7_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '雌激素受体ER的评价结果'")
    private String bc_8_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '乳腺癌术后是否辅助内分泌治疗'")
    private String bc_8_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'HER-2(受体蛋白) 的评价结果'")
    private String bc_9_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术后适合辅助曲妥珠单抗靶向治疗的患者选择'")
    private String bc_9_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他术后适合辅助曲妥珠单抗靶向治疗的患者'")
    private String bc_9_1_2_1;
    @Column(columnDefinition = "double COMMENT '左室射血分(LVEF)测量值(%)'")
    private Double bc_9_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '超声心动图左心室射血分数小于50%'")
    private String bc_9_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '术后接受曲妥珠单抗靶向治疗'")
    private String bc_9_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '交与患者“出院小结”的副本告知患者出院时风险因素'")
    private String cm_7_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院健康教育与告知'")
    private String bc_10_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时教育与随访'")
    private String cm_7_2_5;
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
