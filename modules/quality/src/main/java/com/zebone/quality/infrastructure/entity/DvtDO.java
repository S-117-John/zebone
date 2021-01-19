package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "QUALITY_DVT")
@Data
public class DvtDO extends BaseEntity{




    @Column(columnDefinition = "varchar(64) COMMENT '实施首次血栓风险因素评估选择'")
    private String dvt_2_1_1;
    @Column(columnDefinition = "double COMMENT '评估分值'")
    private Double dvt_2_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'DVT发生风险分层'")
    private String dvt_2_1_3;
    @Column(columnDefinition = "double COMMENT '评估分值'")
    private Double dvt_2_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT 'DVT发生风险分层'")
    private String dvt_2_1_5;
    @Column(columnDefinition = "double COMMENT '评估分值'")
    private Double dvt_2_1_6;
    @Column(columnDefinition = "varchar(64) COMMENT 'DVT发生风险分层'")
    private String dvt_2_1_7;
    @Column(columnDefinition = "varchar(64) COMMENT '临床常用检测方法'")
    private String dvt_2_1_8;
    @Column(columnDefinition = "varchar(64) COMMENT '术后可能诱发危险因素'")
    private String dvt_2_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他术后可能诱发危险因素'")
    private String dvt_2_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有实施预防术后深静脉血栓措施的禁忌'")
    private String dvt_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '实施药物预防措施应用禁忌'")
    private String dvt_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '实施机械预防措施应用禁忌'")
    private String dvt_2_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施基本预防措施'")
    private String dvt_2_6_1;
    @Column(columnDefinition = "varchar(64) COMMENT '基本预防措施的选择'")
    private String dvt_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他基本预防措施'")
    private String dvt_2_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '基本预防措施医嘱执行日期'")
    private Date dvt_2_4_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施机械预防措施'")
    private String dvt_2_6_2;
    @Column(columnDefinition = "varchar(64) COMMENT '机械预防措施的选择'")
    private String dvt_2_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他机械预防措施的选择'")
    private String dvt_2_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '机械预防措施医嘱执行起始日期'")
    private Date dvt_2_4_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施药物预防措施'")
    private String dvt_2_6_3;
    @Column(columnDefinition = "varchar(64) COMMENT '预防性地药物的选择'")
    private String dvt_2_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他预防性地药物'")
    private String dvt_2_4_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '预防性地药物医嘱执行日期'")
    private Date dvt_2_4_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '出院后继续使用抗凝药'")
    private String dvt_2_4_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他出院后使用的抗凝药'")
    private String dvt_2_4_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术前、术后、出院时为患者提供针对性健康教育服务'")
    private String dvt_2_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术前伴随内科疾患'")
    private String dvt_3_1_1;

}
