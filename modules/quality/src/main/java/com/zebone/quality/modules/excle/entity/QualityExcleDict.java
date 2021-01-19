/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.excle.entity;


import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 病种数据编码字典Entity
 * @author 卡卡西
 * @version 2021-01-15
 */
@Table(name="quality_excle_dict", alias="a", columns={
		@Column(name="code", attrName="code", label="code"),
		@Column(name="dict_value", attrName="dictValue", label="dict_value"),
		@Column(name="dict_label", attrName="dictLabel", label="dict_label"),
		@Column(name="dict_id", attrName="dictId", label="dict_id", isPK=true),
		@Column(name="table_name", attrName="tableName", label="table_name", queryType=QueryType.LIKE),
	}, orderBy="a.dict_id DESC"
)
public class QualityExcleDict extends DataEntity<QualityExcleDict> {
	
	private static final long serialVersionUID = 1L;
	private String code;		// code
	private String dictValue;		// dict_value
	private String dictLabel;		// dict_label
	private String dictId;		// dict_id
	private String tableName;		// table_name
	
	public QualityExcleDict() {
		this(null);
	}

	public QualityExcleDict(String id){
		super(id);
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public String getDictValue() {
		return dictValue;
	}

	public void setDictValue(String dictValue) {
		this.dictValue = dictValue;
	}
	
	public String getDictLabel() {
		return dictLabel;
	}

	public void setDictLabel(String dictLabel) {
		this.dictLabel = dictLabel;
	}
	
	public String getDictId() {
		return dictId;
	}

	public void setDictId(String dictId) {
		this.dictId = dictId;
	}
	
	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
}