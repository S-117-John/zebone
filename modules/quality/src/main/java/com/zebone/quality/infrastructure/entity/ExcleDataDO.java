package com.zebone.quality.infrastructure.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quality_excle_data")
public class ExcleDataDO {

    @Id
    private String id;

    private String tableName;

    /**
     * 序号
     */
    private Integer sortNo;


    private String columnName;

    private String columnLabel;



}
