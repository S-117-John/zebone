package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * @author 卡卡西
 */
@MappedSuperclass
@Data
public class BaseEntity extends DataEntity{



    /**
     * 质控医师
     */
    @Column(columnDefinition = "varchar(32) COMMENT '质控医师'")
    private String cm_0_1_1_1;

    /**
     * 质控护士
     */
    @Column(columnDefinition = "varchar(32) COMMENT '质控护士'")
    private String cm_0_1_1_2;

    /**
     * 主治医师
     */
    @Column(columnDefinition = "varchar(32) COMMENT '主治医师'")
    private String cm_0_1_1_3;

    /**
     * 责任护士
     */
    @Column(columnDefinition = "varchar(32) COMMENT '责任护士'")
    private String cm_0_1_1_4;

    /**
     * 上报科室
     */
    @Column(columnDefinition = "varchar(32) COMMENT '上报科室'")
    private String cm_0_1_1_5;

    /**
     * 患者病案号
     */
    @Column(columnDefinition = "varchar(32) COMMENT '患者病案号'")
    private String caseId;

    /**
     * 出院诊断ICD-10四位亚目编码与名称
     */
    @Column(columnDefinition = "varchar(32) COMMENT '主要诊断ICD-10四位亚目编码与名称'")
    private String cm_0_1_3_1;

    /**
     * 出院诊断ICD-10六位临床扩展编码与名称
     */
    @Column(columnDefinition = "varchar(32) COMMENT '主要诊断ICD-10六位临床扩展编码与名称'")
    private String cm_0_1_3_2;

    /**
     *主要手术操作国家临床版ICD-9.CM-3编码与手术名称
     */
    @Column(columnDefinition = "varchar(32) COMMENT '主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称'")
    private String cm_0_1_4_1;

    /**
     * 其他ICD-9-CM-3四位亚目编码与名称
     */
    @Column(columnDefinition = "varchar(32) COMMENT '其他ICD-9-CM-3四位亚目编码与名称'")
    private String cm_0_1_4_1_1;

    /**
     * 主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称
     */
    @Column(columnDefinition = "varchar(32) COMMENT '主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称'")
    private String cm_0_1_4_2;

    /**
     * 其他ICD-9-CM-3六位临床扩展编码与名称
     */
    @Column(columnDefinition = "varchar(32) COMMENT '其他ICD-9-CM-3六位临床扩展编码与名称'")
    private String cm_0_1_4_2_1;

    /**
     * 是否出院后31天内重复住院
     */
    @Column(columnDefinition = "varchar(32) COMMENT '是否出院后31天内重复住院'")
    private String cm_0_1_5;


    /**
     * 出生日期
     */
    @Column(columnDefinition = "datetime COMMENT '出生日期'")
    private Date cm_0_2_1_1;

    /**
     * 患者性别
     */
    @Column(columnDefinition = "varchar(32) COMMENT '患者性别'")
    private String cm_0_2_1_2;

    /**
     * 患者体重（kg）
     */
    @Column(columnDefinition = "double COMMENT '患者体重（kg）'")
    private Double cm_0_2_1_3;

    /**
     * 患者身高（cm）
     */
    @Column(columnDefinition = "double COMMENT '患者身高（cm）'")
    private Double cm_0_2_1_5;

    /**
     * 发病日期时间是否无法确定或无记录
     */
    @Column(columnDefinition = "varchar(32) COMMENT '发病日期时间是否无法确定或无记录'")
    private String cm_0_2_2_1;

    /**
     * 发病日期时间
     */
    @Column(columnDefinition = "datetime COMMENT '发病日期时间'")
    private Date cm_0_2_2_2;


    /**
     * 到达本院急诊或者门诊日期时间是否确定
     */
    @Column(columnDefinition = "varchar(32) COMMENT '到达本院急诊或者门诊日期时间是否无法确定或无记录'")
    private String cm_0_2_3_1;


    /**
     * 到达本院急诊或者门诊日期时间：
     */
    @Column(columnDefinition = "datetime COMMENT '到达本院急诊或者门诊日期时间'")
    private Date cm_0_2_3_2;

    /**
     * 入院日期时间：
     */
    @Column(columnDefinition = "datetime COMMENT '入院日期时间'")
    private Date cm_0_2_4_1;

    /**
     * 出院日期时间
     */
    @Column(columnDefinition = "datetime COMMENT '出院日期时间'")
    private Date cm_0_2_4_2;


    /**
     * 手术开始（切皮）日期时间：
     */
    @Column(columnDefinition = "datetime COMMENT '手术开始（切皮）日期时间'")
    private Date cm_0_2_6_1;

    /**
     * 手术结束（缝皮结束）日期时间：
     */
    @Column(columnDefinition = "datetime COMMENT '手术结束（缝皮结束）日期时间'")
    private Date cm_0_2_6_2;




    /**
     * 入住CCU日期时间
     */
    @Column(columnDefinition = "datetime COMMENT '入住CCU日期时间'")
    private Date cm_0_2_5_1;


    /**
     * 离开CCU日期时间
     */
    @Column(columnDefinition = "datetime COMMENT '离开CCU日期时间'")
    private Date cm_0_2_5_2;

    /**
     * 费用支付方式：
     */
    @Column(columnDefinition = "varchar(32) COMMENT '费用支付方式'")
    private String cm_0_3_1;

    /**
     * 收入住院途径：
     */
    @Column(columnDefinition = "varchar(32) COMMENT '收入住院途径'")
    private String cm_0_3_2;

    /**
     * 到院交通工具：
     */
    @Column(columnDefinition = "varchar(32) COMMENT '到院交通工具'")
    private String cm_0_3_3;


    /**
     * 手术野皮肤准备常用方法的选择
     */
    @Column(columnDefinition = "varchar(32) COMMENT '手术野皮肤准备常用方法的选择'")
    private String cm_3_1;

    /**
     * 使用含抗菌剂（三氯生）缝线
     */
    @Column(columnDefinition = "varchar(32) COMMENT '使用含抗菌剂（三氯生）缝线'")
    private String cm_3_2;

    /**
     * 其他含抗菌剂缝线填写
     */
    @Column(columnDefinition = "varchar(32) COMMENT '其他含抗菌剂缝线填写'")
    private String cm_3_2_1;


    /**
     * 手术切口类别的选择
     */
    @Column(columnDefinition = "varchar(32) COMMENT '手术切口类别的选择'")
    private String cm_3_3;

    /**
     * 手术切口愈合情况的选择
     */
    @Column(columnDefinition = "varchar(32) COMMENT '手术切口愈合情况的选择'")
    private String cm_3_4;



    /**
     * 离院方式选择
     */
    @Column(columnDefinition = "varchar(32) COMMENT '离院方式选择'")
    private String cm_4_3;


    /**
     * 非医嘱离院可能涉及因素
     */
    @Column(columnDefinition = "varchar(32) COMMENT '非医嘱离院可能涉及因素'")
    private String cm_4_5;


    /**
     * 其他非医嘱离院因素填写
     */
    @Column(columnDefinition = "varchar(32) COMMENT '其他非医嘱离院因素填写'")
    private String cm_4_4_1;

    /**
     * 死亡可能涉及因素
     */
    @Column(columnDefinition = "varchar(32) COMMENT '死亡可能涉及因素'")
    private String cm_4_6;

    /**
     * 患者是否对服务的体验与评价
     */
    @Column(columnDefinition = "varchar(32) COMMENT '患者是否对服务的体验与评价'")
    private String cm_5_1;

    /**
     * 医院整体评级
     */
    @Column(columnDefinition = "varchar(32) COMMENT '整体医院评级'")
    private String cm_5_2_1;

    /**
     * 患者推荐
     */
    @Column(columnDefinition = "varchar(32) COMMENT '患者推荐'")
    private String cm_5_2_2;

    /**
     * 病房、床单元和卫生间清洁度
     */
    @Column(columnDefinition = "varchar(32) COMMENT '病房、床单元和卫生间清洁度'")
    private String cm_5_2_3;
    /**
     * 病房与周边噪音
     */
    @Column(columnDefinition = "varchar(32) COMMENT '病房与周边噪音'")
    private String cm_5_2_5;

    /**
     * 医生沟通
     */
    @Column(columnDefinition = "varchar(32) COMMENT '医生沟通'")
    private String cm_5_2_6;

    /**
     * 护士沟通
     */
    @Column(columnDefinition = "varchar(32) COMMENT '护士沟通'")
    private String cm_5_2_7;

    /**
     * 药师沟通
     */
    @Column(columnDefinition = "varchar(32) COMMENT '药师沟通'")
    private String cm_5_2_8;

    /**
     * 康复计划
     */
    @Column(columnDefinition = "varchar(32) COMMENT '康复计划'")
    private String cm_5_2_9;

    /**
     * 出院时的知情告知
     */
    @Column(columnDefinition = "varchar(32) COMMENT '出院时的知情告知'")
    private String cm_5_2_10;

    /**
     * 膳食评价
     */
    @Column(columnDefinition = "varchar(32) COMMENT '膳食评价'")
    private String cm_5_2_11;

    /**
     *住院总费用
     */
    @Column(columnDefinition = "double COMMENT '住院总费用'")
    private Double cm_6_1;

    /**
     * 住院总费用其中自付金额
     */
    @Column(columnDefinition = "double COMMENT '住院总费用其中自付金额'")
    private Double cm_6_2;
    /**
     *一般医疗服务费
     */
    @Column(columnDefinition = "double COMMENT '一般医疗服务费'")
    private Double cm_6_3;
    /**
     * 一般治疗操作费
     */
    @Column(columnDefinition = "double COMMENT '一般治疗操作费'")
    private Double cm_6_4;

    /**
     * 护理费
     */
    @Column(columnDefinition = "double COMMENT '护理费'")
    private Double cm_6_5;

    /**
     * 综合医疗服务类其他费用
     */
    @Column(columnDefinition = "double COMMENT '综合医疗服务类其他费用'")
    private Double cm_6_6;

    /**
     * 病理诊断费
     */
    @Column(columnDefinition = "double COMMENT '病理诊断费'")
    private Double cm_6_7;

    /**
     * 实验室诊断费
     */
    @Column(columnDefinition = "double COMMENT '实验室诊断费'")
    private Double cm_6_8;

    /**
     * 影像学诊断费
     */
    @Column(columnDefinition = "double COMMENT '影像学诊断费'")
    private Double cm_6_9;

    /**
     * 临床诊断项目费
     */
    @Column(columnDefinition = "double COMMENT '临床诊断项目费'")
    private Double cm_6_10;

    /**
     * 非手术治疗项目费
     */
    @Column(columnDefinition = "double COMMENT '非手术治疗项目费'")
    private Double cm_6_11;

    /**
     * 其中：临床物理治疗费
     */
    @Column(columnDefinition = "double COMMENT '其中：临床物理治疗费'")
    private Double cm_6_12;

    /**
     * 手术治疗费
     */
    @Column(columnDefinition = "double COMMENT '手术治疗费'")
    private Double cm_6_13;

    /**
     * 其中：麻醉费
     */
    @Column(columnDefinition = "double COMMENT '其中：麻醉费'")
    private Double cm_6_14;

    /**
     * 其中：手术费
     */
    @Column(columnDefinition = "double COMMENT '其中：手术费'")
    private Double cm_6_15;

    /**
     * 康复费
     */
    @Column(columnDefinition = "double COMMENT '康复费'")
    private Double cm_6_16;

    /**
     * 中医治疗费
     */
    @Column(columnDefinition = "double COMMENT '中医治疗费'")
    private Double cm_6_17;

    /**
     * 西药费
     */
    @Column(columnDefinition = "double COMMENT '西药费'")
    private Double cm_6_18;

    /**
     * 其中：抗菌药物费
     */
    @Column(columnDefinition = "double COMMENT '其中：抗菌药物费'")
    private Double cm_6_19;

    /**
     * 中成药费
     */
    @Column(columnDefinition = "double COMMENT '中成药费'")
    private Double cm_6_20;

    /**
     * 中草药费
     */
    @Column(columnDefinition = "double COMMENT '中草药费'")
    private Double cm_6_21;

    /**
     * 血费
     */
    @Column(columnDefinition = "double COMMENT '血费'")
    private Double cm_6_22;

    /**
     * 白蛋白类制品费
     */
    @Column(columnDefinition = "double COMMENT '白蛋白类制品费'")
    private Double cm_6_23;

    /**
     * 球蛋白类制品费
     */
    @Column(columnDefinition = "double COMMENT '球蛋白类制品费'")
    private Double cm_6_24;

    /**
     *凝血因子类制品费
     */
    @Column(columnDefinition = "double COMMENT '凝血因子类制品费'")
    private Double cm_6_25;

    /**
     * 细胞因子类制品费
     */
    @Column(columnDefinition = "double COMMENT '细胞因子类制品费'")
    private Double cm_6_26;

    /**
     * 检查用一次性医用材料费
     */
    @Column(columnDefinition = "double COMMENT '检查用一次性医用材料费'")
    private Double cm_6_27;

    /**
     * 治疗用一次性医用材料费
     */
    @Column(columnDefinition = "double COMMENT '治疗用一次性医用材料费'")
    private Double cm_6_28;


    /**
     * 手术用一次性医用材料费
     */
    @Column(columnDefinition = "double COMMENT '手术用一次性医用材料费'")
    private Double cm_6_29;

    /**
     * 其他费
     */
    @Column(columnDefinition = "double COMMENT '其他费'")
    private Double cm_6_30;

}
