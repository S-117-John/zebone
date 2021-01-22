package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "QUALITY_CAP")
@Data
public class CapDO extends DataEntity{


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
    @Column(columnDefinition = "varchar(64) COMMENT '患儿病案号'")
    private String caseid;
    @Column(columnDefinition = "varchar(64) COMMENT '主要诊断ICD-10四位亚目编码与名称'")
    private String cm_0_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要诊断ICD-10六位临床扩展编码与名称'")
    private String cm_0_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称'")
    private String cm_0_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要手术操作ICD-9-CM-3四位亚目编码与名称'")
    private String cap_0_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称'")
    private String cm_0_1_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要手术操作ICD-9-CM-3六位临床扩展编码与名称'")
    private String cap_0_1_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否出院后31天内重复住院'")
    private String cm_0_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '出生日期'")
    private Date cm_0_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患儿性别'")
    private String cm_0_2_1_2;
    @Column(columnDefinition = "double COMMENT '患儿体重（kg）'")
    private Double cm_0_2_1_3;
    @Column(columnDefinition = "double COMMENT '患儿身高（cm）'")
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
    @Column(columnDefinition = "varchar(64) COMMENT '入住ICU/RCU日期时间'")
    private Date cm_0_2_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '离开ICU/RCU日期时间'")
    private Date cm_0_2_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '费用支付方式'")
    private String cm_0_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '收入住院途径'")
    private String cm_0_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '到院交通工具'")
    private String cm_0_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有重症肺炎的高危因素'")
    private String cap_1_1_0;
    @Column(columnDefinition = "varchar(64) COMMENT '重症肺炎的高危因素'")
    private String cap_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '符合重症肺炎'")
    private String cap_1_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '符合以下情况之一,需住院'")
    private String cap_1_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否符合重症'")
    private String cap_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '重度肺炎表现'")
    private String cap_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '符合重症住院及住ICU/RCU标准'")
    private String cap_1_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否接种肺炎链球菌疫苗和（或）流感疫苗的'")
    private String cap_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '实施首次氧合评估（首次）'")
    private String cap_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '实施首次氧合评估时段'")
    private String cap_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '实施首次氧合评估时是否吸氧（FiO₂）'")
    private String cap_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '动脉血气分析/指氧仪检查'")
    private String cap_2_4;
    @Column(columnDefinition = "double COMMENT '动脉血气分析值(mmHg)'")
    private Double cap_2_4_3;
    @Column(columnDefinition = "double COMMENT '指氧仪检查值(%)'")
    private Double cap_2_4_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否为重症并收入ICU/RCU的患儿'")
    private String cap_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否入院之前已经经接受抗菌药物治疗'")
    private String cap_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '实施首次采集标本时段'")
    private String cap_3_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '实施首次采集什么标本'")
    private String cap_3_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '采集标本日期时间'")
    private Date cap_3_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '细菌学检查项目的选择'")
    private String cap_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他细菌学检查项目'")
    private String cap_3_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '病毒学检查项目的选择'")
    private String cap_3_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他病毒学检查项目'")
    private String cap_3_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '肺炎支原体检查项目的选择'")
    private String cap_3_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他肺炎支原体检查项目'")
    private String cap_3_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行实验室检查'")
    private String cap_3_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '临床实验室检查项目的选择'")
    private String cap_3_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他临床实验室检查项目'")
    private String cap_3_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '病原学检测结果'")
    private String cap_3_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他病原学检测结果'")
    private String cap_3_5_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '获得病原学诊断报告结果的日期时间'")
    private Date cap_3_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '患儿有无接受抗菌药物治疗'")
    private String cap_4_0;
    @Column(columnDefinition = "varchar(64) COMMENT '患儿入院后接受首剂抗菌药物治疗（注射剂输入/注射）时间'")
    private Date cap_4_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '接受入院后首剂抗菌药物使用时机 DTN'")
    private String cap_4_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '使用首剂抗菌药物治疗途径'")
    private String cap_4_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '抗菌药物注射剂输入/注射治疗终止日期与时间'")
    private Date cap_4_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否抗菌药物注射剂改口服'")
    private String cap_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '抗菌药物注射剂改口服日期与时间'")
    private Date cap_4_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '拟诊需抗感染治疗肺炎缘由'")
    private String cap_5_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他类型肺炎'")
    private String cap_5_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否需进行抗感染治疗'")
    private String cap_5_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '抗感染治疗药物选择'")
    private String cap_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '青霉素类抗感染药物'")
    private String cap_5_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其它青霉素抗菌药'")
    private String cap_5_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '头孢菌素类抗感染药物'")
    private String cap_5_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其它头孢菌素抗菌药'")
    private String cap_5_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '大环内酯类抗感染药物'")
    private String cap_5_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其它大环内酯抗菌药'")
    private String cap_5_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '神经氨酸抑制剂'")
    private String cap_5_2_6;
    @Column(columnDefinition = "varchar(64) COMMENT '神经氨酸抑制剂'")
    private String cap_5_2_6_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他类抗感染药物'")
    private String cap_5_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '其他类抗菌药'")
    private String cap_5_2_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '初始治疗72小时后是否进行评价'")
    private String cap_6_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '评价结论'")
    private String cap_6_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '初始治疗72小时后评价有效者下一步治疗方案'")
    private String cap_6_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行重复病原学检查'")
    private String cap_6_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '初始治疗72小时后无效常见原因'")
    private String cap_6_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '其它原因'")
    private String cap_6_1_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '病原学检查项目选择'")
    private String cap_6_1_6;
    @Column(columnDefinition = "varchar(64) COMMENT '其它检查'")
    private String cap_6_1_6_1;
    @Column(columnDefinition = "varchar(64) COMMENT '重复病原学诊断结果选择'")
    private String cap_6_1_7;
    @Column(columnDefinition = "varchar(64) COMMENT '其它重复病原学诊断结果'")
    private String cap_6_1_7_1;
    @Column(columnDefinition = "varchar(64) COMMENT '获得病原学诊断报告结果的日期时间'")
    private Date cap_6_1_8;
    @Column(columnDefinition = "varchar(64) COMMENT '病原针对性治疗情况'")
    private String cap_6_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '抗感染治疗药物选择'")
    private String cap_6_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '青霉素类抗感染药物'")
    private String cap_6_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其它青霉素抗菌药'")
    private String cap_6_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '头孢菌素类抗感染药物'")
    private String cap_6_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其它头孢菌素抗菌药'")
    private String cap_6_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '大环内酯类抗感染药物'")
    private String cap_6_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '其它大环内酯抗菌药'")
    private String cap_6_2_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他类抗感染药物'")
    private String cap_6_2_6;
    @Column(columnDefinition = "varchar(64) COMMENT '其他类抗菌药'")
    private String cap_6_2_6_1;
    @Column(columnDefinition = "varchar(64) COMMENT '神经氨酸抑制剂'")
    private String cap_6_2_7;
    @Column(columnDefinition = "varchar(64) COMMENT '神经氨酸抑制剂'")
    private String cap_6_2_7_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用氧疗与呼吸支持治疗'")
    private String cap_7_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用普通氧疗'")
    private String cap_7_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '普通氧疗指征'")
    private String cap_7_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '给予氧疗医嘱'")
    private String cap_7_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '普通氧疗起始日期与时间'")
    private Date cap_7_2_6;
    @Column(columnDefinition = "varchar(64) COMMENT '普通氧疗终止日期与时间'")
    private Date cap_7_2_7;
    @Column(columnDefinition = "double COMMENT '使用普通氧疗治疗天数'")
    private Double cap_7_2_8;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用无创通气'")
    private String cap_7_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '无创通气指征'")
    private String cap_7_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '无创通气治疗起始日期与时间'")
    private Date cap_7_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '无创通气治疗终止日期与时间'")
    private Date cap_7_3_4;
    @Column(columnDefinition = "double COMMENT '使用无创通气治疗小时数'")
    private Double cap_7_3_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用有创机械通气'")
    private String cap_7_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '机械通气指征'")
    private String cap_7_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '有创机械通气治疗起始日期与时间'")
    private Date cap_7_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '有创机械通气治疗终止日期与时间'")
    private Date cap_7_4_4;
    @Column(columnDefinition = "double COMMENT '使用有创机械通气治疗小时数'")
    private Double cap_7_4_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用体外膜肺'")
    private String cap_7_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'ECMO指征'")
    private String cap_7_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '体外膜肺治疗起始日期与时间'")
    private Date cap_7_5_3;
    @Column(columnDefinition = "varchar(64) COMMENT '体外膜肺治疗终止日期与时间'")
    private Date cap_7_5_4;
    @Column(columnDefinition = "double COMMENT '使用体外膜肺治疗小时数'")
    private Double cap_7_5_5;
    @Column(columnDefinition = "varchar(64) COMMENT '交与患儿/患儿家长“出院小结”的副本告知出院时风险因素'")
    private String cm_7_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药'")
    private String cm_7_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '告知何为发生紧急意外情况或者疾病复发'")
    private String cm_7_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '告知发生紧急意外情况或者疾病复发如何救治及前途经'")
    private String cm_7_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时教育与随访'")
    private String cm_7_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '经有效治疗后，患儿病情明显好转,可以出院'")
    private String cap_9_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院前末次氧合评估'")
    private String cap_9_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '末次氧合评估项目'")
    private String cap_9_2_2;
    @Column(columnDefinition = "double COMMENT '测定值(%)'")
    private Double cap_9_2_2_1;
    @Column(columnDefinition = "double COMMENT '测定值(mmHg)'")
    private Double cap_9_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '离院方式选择'")
    private String cm_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '非医嘱离院可能涉及因素'")
    private String cm_4_5;
    @Column(columnDefinition = "varchar(64) COMMENT '其他非医嘱离院因素填写'")
    private String cm_4_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '死亡可能涉及因素'")
    private String cm_4_6;
    @Column(columnDefinition = "varchar(64) COMMENT '患儿家长对服务的体验与评价'")
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
    @Column(columnDefinition = "varchar(64) COMMENT '患儿接受首剂抗菌药物治疗注射剂输入/注射日期时间'")
    private Date cap_11_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患儿接受未剂抗菌药物治疗注射剂输入/注射日期时间'")
    private Date cap_11_1_2;
    @Column(columnDefinition = "double COMMENT '注射剂输入/注射抗菌药物疗程（天数）'")
    private Double cap_11_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否抗菌药物注射剂改口服'")
    private String cap_11_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '改用抗菌药物口服剂首剂日期与时间'")
    private Date cap_11_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '末剂抗菌药物口服剂或出院日期与时间'")
    private Date cap_11_2_3;
    @Column(columnDefinition = "double COMMENT '口服剂抗菌药物疗程（天数）'")
    private Double cap_11_2_4;
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
