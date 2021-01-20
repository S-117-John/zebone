package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "QUALITY_BC")
public class BcDO extends BaseEntity{


    @Column(columnDefinition = "varchar(64) COMMENT '非手术治疗ICD-9-CM-3编码与名称'")
    private String bc_0_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '其它非手术治疗主要诊断编码与名称'")
    private String bc_0_1_5_1;
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
    @Column(columnDefinition = "varchar(64) COMMENT '乳腺癌手术特指并发症'")
    private String bc_6_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '非计划二次手术'")
    private String bc_6_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '手术起始(切皮)日期'")
    private Date bc_6_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '手术结束(切口闭合)日期'")
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
    @Column(columnDefinition = "varchar(64) COMMENT '出院健康教育与告知'")
    private String bc_10_1_2;

}
