/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.tia.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.tia.entity.QualityTia;
import com.zebone.quality.modules.tia.dao.QualityTiaDao;

/**
 * TIA短暂性脑缺血发作Service
 * @author 卡卡西
 * @version 2021-01-16
 */
@Service
@Transactional(readOnly=true)
public class QualityTiaService extends CrudService<QualityTiaDao, QualityTia> {
	
	/**
	 * 获取单条数据
	 * @param qualityTia
	 * @return
	 */
	@Override
	public QualityTia get(QualityTia qualityTia) {
		return super.get(qualityTia);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityTia
	 * @return
	 */
	@Override
	public Page<QualityTia> findPage(Page<QualityTia> page, QualityTia qualityTia) {
		return super.findPage(page, qualityTia);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityTia
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityTia qualityTia) {
		super.save(qualityTia);
	}
	
	/**
	 * 更新状态
	 * @param qualityTia
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityTia qualityTia) {
		super.updateStatus(qualityTia);
	}
	
	/**
	 * 删除数据
	 * @param qualityTia
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityTia qualityTia) {
		super.delete(qualityTia);
	}
	
}