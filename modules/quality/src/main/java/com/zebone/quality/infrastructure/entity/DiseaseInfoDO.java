package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 卡卡西
 * 病种信息
 */
@Entity
@Table(name = "QUALITY_DISEASE")
@Data
public class DiseaseInfoDO{

    @Id
    private String id;

    /**
     * 编码
     */
    private String code;

    /**
     * 名称
     */
    private String name;


    /**
     * 主要诊断
     */
    private String mainDiagnosis;


    /**
     * 手术编码
     */
    private String surgicalCode;

    private Integer minAge;

    private Integer maxAge;

    /**
     * 最小住院天数
     */
    private Integer minDay;

    /**
     * 最大住院天数
     */
    private Integer maxDay;


    /**
     * 出院科室
     */
    private String dept;
}
