package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author 卡卡西
 */
@MappedSuperclass
@Data
public class BaseEntity {

    @Id
    private String id;

    /**
     * 质控医师
     */
    private String qualityPhysician;

    /**
     * 质控护士
     */
    private String qualityNurse;

    /**
     * 主治医师
     */
    private String attendingPhysician;

    /**
     * 责任护士
     */
    private String rsponsibleNurse;

    /**
     * 上报科室
     */
    private String reportDept;

    /**
     * 患者病案号
     */
    private String patientCaseNumber;

    /**
     * 出院诊断ICD-10四位亚目编码与名称
     */
    private String suborderCode;

    /**
     * 临床扩展编码
     */
    private String clinicalExtCode;

    /**
     *主要手术操作 国家临床版ICD-9.CM-3编码与手术名称
     */
    private String mainOperation;

    /**
     * 是否出院后31天内重复住院
     */
    private String repeatHospital;
}
