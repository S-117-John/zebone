/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.mvr.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.mvr.entity.QualityMvr;
import com.zebone.quality.modules.mvr.dao.QualityMvrDao;

/**
 * quality_mvrService
 * @author 卡卡西
 * @version 2021-02-19
 */
@Service
@Transactional(readOnly=true)
public class QualityMvrService extends CrudService<QualityMvrDao, QualityMvr> {
	
	/**
	 * 获取单条数据
	 * @param qualityMvr
	 * @return
	 */
	@Override
	public QualityMvr get(QualityMvr qualityMvr) {
		return super.get(qualityMvr);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityMvr
	 * @return
	 */
	@Override
	public Page<QualityMvr> findPage(Page<QualityMvr> page, QualityMvr qualityMvr) {
		return super.findPage(page, qualityMvr);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityMvr
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityMvr qualityMvr) {
		super.save(qualityMvr);
	}
	
	/**
	 * 更新状态
	 * @param qualityMvr
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityMvr qualityMvr) {
		super.updateStatus(qualityMvr);
	}
	
	/**
	 * 删除数据
	 * @param qualityMvr
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityMvr qualityMvr) {
		super.delete(qualityMvr);
	}
	
}