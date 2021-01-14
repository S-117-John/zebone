/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.base.entity;

import org.hibernate.validator.constraints.Length;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 病种设置Entity
 * @author lijin
 * @version 2021-01-14
 */
@Table(name="quality_disease", alias="a", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="code", attrName="code", label="编码"),
		@Column(name="name", attrName="name", label="名称", queryType=QueryType.LIKE),
		@Column(name="interface_url", attrName="interfaceUrl", label="上传接口url"),
		@Column(name="image_path", attrName="imagePath", label="图标"),
		@Column(name="type", attrName="type", label="病种分类"),
		@Column(name="form_url", attrName="formUrl", label="表单Url"),
	}, orderBy="a.id DESC"
)
public class QualityDisease extends DataEntity<QualityDisease> {
	
	private static final long serialVersionUID = 1L;
	private String code;		// 编码
	private String name;		// 名称
	private String interfaceUrl;		// 上传接口url
	private String imagePath;		// 图标
	private String type;		// 病种分类
	private String formUrl;		// 表单Url
	
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
	
	@Length(min=0, max=255, message="名称长度不能超过 255 个字符")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Length(min=0, max=255, message="上传接口url长度不能超过 255 个字符")
	public String getInterfaceUrl() {
		return interfaceUrl;
	}

	public void setInterfaceUrl(String interfaceUrl) {
		this.interfaceUrl = interfaceUrl;
	}
	
	@Length(min=0, max=1000, message="图标长度不能超过 1000 个字符")
	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	@Length(min=0, max=32, message="病种分类长度不能超过 32 个字符")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Length(min=0, max=64, message="表单Url长度不能超过 64 个字符")
	public String getFormUrl() {
		return formUrl;
	}

	public void setFormUrl(String formUrl) {
		this.formUrl = formUrl;
	}
	
}