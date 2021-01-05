package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "QUALITY_CODE")
public class CodingReferenceDO {

    @Id
    private String id;

    private String name;

    private String codeKey;

    private String codeValue;
}
