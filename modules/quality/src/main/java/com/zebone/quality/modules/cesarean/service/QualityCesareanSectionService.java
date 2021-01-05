/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.cesarean.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.cesarean.entity.QualityCesareanSection;
import com.zebone.quality.modules.cesarean.dao.QualityCesareanSectionDao;

/**
 * 剖宫产Service
 * @author lijin
 * @version 2021-01-04
 */
@Service
@Transactional(readOnly=true)
public class QualityCesareanSectionService extends CrudService<QualityCesareanSectionDao, QualityCesareanSection> {
	
	/**
	 * 获取单条数据
	 * @param qualityCesareanSection
	 * @return
	 */
	@Override
	public QualityCesareanSection get(QualityCesareanSection qualityCesareanSection) {
		return super.get(qualityCesareanSection);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityCesareanSection
	 * @return
	 */
	@Override
	public Page<QualityCesareanSection> findPage(Page<QualityCesareanSection> page, QualityCesareanSection qualityCesareanSection) {
		return super.findPage(page, qualityCesareanSection);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityCesareanSection
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityCesareanSection qualityCesareanSection) {
		super.save(qualityCesareanSection);
	}
	
	/**
	 * 更新状态
	 * @param qualityCesareanSection
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityCesareanSection qualityCesareanSection) {
		super.updateStatus(qualityCesareanSection);
	}
	
	/**
	 * 删除数据
	 * @param qualityCesareanSection
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityCesareanSection qualityCesareanSection) {
		super.delete(qualityCesareanSection);
	}
	
}