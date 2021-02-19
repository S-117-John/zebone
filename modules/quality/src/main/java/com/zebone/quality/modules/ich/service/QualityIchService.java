/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.ich.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.ich.entity.QualityIch;
import com.zebone.quality.modules.ich.dao.QualityIchDao;

/**
 * ICH脑出血Service
 * @author 卡卡西
 * @version 2021-02-19
 */
@Service
@Transactional(readOnly=true)
public class QualityIchService extends CrudService<QualityIchDao, QualityIch> {
	
	/**
	 * 获取单条数据
	 * @param qualityIch
	 * @return
	 */
	@Override
	public QualityIch get(QualityIch qualityIch) {
		return super.get(qualityIch);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityIch
	 * @return
	 */
	@Override
	public Page<QualityIch> findPage(Page<QualityIch> page, QualityIch qualityIch) {
		return super.findPage(page, qualityIch);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityIch
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityIch qualityIch) {
		super.save(qualityIch);
	}
	
	/**
	 * 更新状态
	 * @param qualityIch
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityIch qualityIch) {
		super.updateStatus(qualityIch);
	}
	
	/**
	 * 删除数据
	 * @param qualityIch
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityIch qualityIch) {
		super.delete(qualityIch);
	}
	
}