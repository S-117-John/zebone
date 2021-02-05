package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 编码对照
 */
//@Entity
@Data
//@Table(name = "QUALITY_CODE")
public class CodingReferenceDO {

    @Id
    private String id;

    /**
     * 编码名称
     */
    private String name;


    /**
     * 本系统字典名称
     */
    private String dictName;

    /**
     * 本系统字典类型
     */
    private String dictType;


    /**
     * 本系统字典值
     */
    private String dictValue;

    /**
     * HIS系统编码
     */
    private String hisCode;
}
