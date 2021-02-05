/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.cs.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.cs.entity.QualityCs;
import com.zebone.quality.modules.cs.dao.QualityCsDao;

/**
 * cs剖宫产Service
 * @author 卡卡西
 * @version 2021-02-05
 */
@Service
@Transactional(readOnly=true)
public class QualityCsService extends CrudService<QualityCsDao, QualityCs> {
	
	/**
	 * 获取单条数据
	 * @param qualityCs
	 * @return
	 */
	@Override
	public QualityCs get(QualityCs qualityCs) {
		return super.get(qualityCs);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityCs
	 * @return
	 */
	@Override
	public Page<QualityCs> findPage(Page<QualityCs> page, QualityCs qualityCs) {
		return super.findPage(page, qualityCs);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityCs
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityCs qualityCs) {
		super.save(qualityCs);
	}
	
	/**
	 * 更新状态
	 * @param qualityCs
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityCs qualityCs) {
		super.updateStatus(qualityCs);
	}
	
	/**
	 * 删除数据
	 * @param qualityCs
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityCs qualityCs) {
		super.delete(qualityCs);
	}
	
}