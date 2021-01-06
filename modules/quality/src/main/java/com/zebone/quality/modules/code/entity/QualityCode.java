/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.code.entity;

import org.hibernate.validator.constraints.Length;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 编码对照Entity
 * @author lijin
 * @version 2021-01-05
 */
@Table(name="quality_code", alias="a", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="dict_type", attrName="dictType", label="本系统字典类型"),
		@Column(name="dict_value", attrName="dictValue", label="本系统字典值"),
		@Column(name="name", attrName="name", label="编码名称", queryType=QueryType.LIKE),
		@Column(name="his_code", attrName="hisCode", label="HIS编码值"),
		@Column(name="dict_name", attrName="dictName", label="本系统字典名称", queryType=QueryType.LIKE),
	}, orderBy="a.id DESC"
)
public class QualityCode extends DataEntity<QualityCode> {
	
	private static final long serialVersionUID = 1L;
	private String dictType;		// 本系统字典类型
	private String dictValue;		// 本系统字典值
	private String name;		// 编码名称
	private String hisCode;		// HIS编码值
	private String dictName;		// 本系统字典名称
	
	public QualityCode() {
		this(null);
	}

	public QualityCode(String id){
		super(id);
	}
	
	@Length(min=0, max=255, message="本系统字典类型长度不能超过 255 个字符")
	public String getDictType() {
		return dictType;
	}

	public void setDictType(String dictType) {
		this.dictType = dictType;
	}
	
	@Length(min=0, max=255, message="本系统字典值长度不能超过 255 个字符")
	public String getDictValue() {
		return dictValue;
	}

	public void setDictValue(String dictValue) {
		this.dictValue = dictValue;
	}
	
	@Length(min=0, max=255, message="编码名称长度不能超过 255 个字符")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Length(min=0, max=255, message="HIS编码值长度不能超过 255 个字符")
	public String getHisCode() {
		return hisCode;
	}

	public void setHisCode(String hisCode) {
		this.hisCode = hisCode;
	}
	
	@Length(min=0, max=255, message="本系统字典名称长度不能超过 255 个字符")
	public String getDictName() {
		return dictName;
	}

	public void setDictName(String dictName) {
		this.dictName = dictName;
	}
	
}