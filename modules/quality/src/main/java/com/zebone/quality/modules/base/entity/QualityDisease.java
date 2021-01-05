/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.base.entity;

import org.hibernate.validator.constraints.Length;
import com.jeesite.modules.sys.entity.Office;
import com.jeesite.common.mybatis.annotation.JoinTable;
import com.jeesite.common.mybatis.annotation.JoinTable.Type;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 病种设置Entity
 * @author lijin
 * @version 2020-12-30
 */
@Table(name="quality_disease", alias="a", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="code", attrName="code", label="编码"),
		@Column(name="main_diagnosis", attrName="mainDiagnosis", label="主诊断"),
		@Column(name="dept", attrName="dept.officeCode", label="出院科室"),
		@Column(name="max_age", attrName="maxAge", label="最大年龄", queryType=QueryType.LT),
		@Column(name="max_day", attrName="maxDay", label="最大住院天数", queryType=QueryType.LT),
		@Column(name="min_age", attrName="minAge", label="最小年龄", queryType=QueryType.GT),
		@Column(name="min_day", attrName="minDay", label="最小出院天数", queryType=QueryType.GT),
		@Column(name="name", attrName="name", label="名称", queryType=QueryType.LIKE),
		@Column(name="surgical_code", attrName="surgicalCode", label="手术编码"),
	}, joinTable={
		@JoinTable(type=Type.LEFT_JOIN, entity=Office.class, attrName="dept", alias="u4",
			on="u4.office_code = a.dept", columns={
				@Column(name="office_code", label="机构编码", isPK=true),
				@Column(name="office_name", label="机构名称", isQuery=false),
		}),
	}, orderBy="a.id DESC"
)
public class QualityDisease extends DataEntity<QualityDisease> {
	
	private static final long serialVersionUID = 1L;
	private String code;		// 编码
	private String mainDiagnosis;		// 主诊断
	private Office dept;		// 出院科室
	private Long maxAge;		// 最大年龄
	private Long maxDay;		// 最大住院天数
	private Long minAge;		// 最小年龄
	private Long minDay;		// 最小出院天数
	private String name;		// 名称
	private String surgicalCode;		// 手术编码
	
	public QualityDisease() {
		this(null);
	}

	public QualityDisease(String id){
		super(id);
	}
	
	@Length(min=0, max=255, message="编码长度不能超过 255 个字符")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	@Length(min=0, max=255, message="主诊断长度不能超过 255 个字符")
	public String getMainDiagnosis() {
		return mainDiagnosis;
	}

	public void setMainDiagnosis(String mainDiagnosis) {
		this.mainDiagnosis = mainDiagnosis;
	}
	
	public Office getDept() {
		return dept;
	}

	public void setDept(Office dept) {
		this.dept = dept;
	}
	
	public Long getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(Long maxAge) {
		this.maxAge = maxAge;
	}
	
	public Long getMaxDay() {
		return maxDay;
	}

	public void setMaxDay(Long maxDay) {
		this.maxDay = maxDay;
	}
	
	public Long getMinAge() {
		return minAge;
	}

	public void setMinAge(Long minAge) {
		this.minAge = minAge;
	}
	
	public Long getMinDay() {
		return minDay;
	}

	public void setMinDay(Long minDay) {
		this.minDay = minDay;
	}
	
	@Length(min=0, max=255, message="名称长度不能超过 255 个字符")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Length(min=0, max=255, message="手术编码长度不能超过 255 个字符")
	public String getSurgicalCode() {
		return surgicalCode;
	}

	public void setSurgicalCode(String surgicalCode) {
		this.surgicalCode = surgicalCode;
	}
	
}