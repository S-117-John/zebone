/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.vsd.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.vsd.entity.QualityVsd;
import com.zebone.quality.modules.vsd.dao.QualityVsdDao;

/**
 * VSD室间隔缺损手术Service
 * @author 卡卡西
 * @version 2021-01-20
 */
@Service
@Transactional(readOnly=true)
public class QualityVsdService extends CrudService<QualityVsdDao, QualityVsd> {
	
	/**
	 * 获取单条数据
	 * @param qualityVsd
	 * @return
	 */
	@Override
	public QualityVsd get(QualityVsd qualityVsd) {
		return super.get(qualityVsd);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityVsd
	 * @return
	 */
	@Override
	public Page<QualityVsd> findPage(Page<QualityVsd> page, QualityVsd qualityVsd) {
		return super.findPage(page, qualityVsd);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityVsd
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityVsd qualityVsd) {
		super.save(qualityVsd);
	}
	
	/**
	 * 更新状态
	 * @param qualityVsd
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityVsd qualityVsd) {
		super.updateStatus(qualityVsd);
	}
	
	/**
	 * 删除数据
	 * @param qualityVsd
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityVsd qualityVsd) {
		super.delete(qualityVsd);
	}
	
}