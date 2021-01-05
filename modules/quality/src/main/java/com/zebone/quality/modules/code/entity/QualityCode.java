/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.code.entity;

import com.jeesite.common.utils.excel.annotation.ExcelField;
import com.jeesite.common.utils.excel.fieldtype.OfficeType;
import org.hibernate.validator.constraints.Length;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 编码对照Entity
 * @author lijin
 * @version 2020-12-31
 */
@Table(name="quality_code", alias="a", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="code_key", attrName="codeKey", label="编码key"),
		@Column(name="code_value", attrName="codeValue", label="编码value"),
		@Column(name="name", attrName="name", label="编码名称", queryType=QueryType.LIKE),
	}, orderBy="a.id DESC"
)
public class QualityCode extends DataEntity<QualityCode> {
	
	private static final long serialVersionUID = 1L;

	@ExcelField(title="编码键", attrName="codeKey", align= ExcelField.Align.CENTER, sort=10)
	private String codeKey;		// 编码key

	@ExcelField(title="编码值", attrName="codeValue", align= ExcelField.Align.CENTER, sort=20)
	private String codeValue;		// 编码value

	@ExcelField(title="编码名称", attrName="name", align= ExcelField.Align.CENTER, sort=30)
	private String name;		// 编码名称
	
	public QualityCode() {
		this(null);
	}

	public QualityCode(String id){
		super(id);
	}
	
	@Length(min=0, max=255, message="编码key长度不能超过 255 个字符")
	public String getCodeKey() {
		return codeKey;
	}

	public void setCodeKey(String codeKey) {
		this.codeKey = codeKey;
	}
	
	@Length(min=0, max=255, message="编码value长度不能超过 255 个字符")
	public String getCodeValue() {
		return codeValue;
	}

	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}
	
	@Length(min=0, max=255, message="编码名称长度不能超过 255 个字符")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}