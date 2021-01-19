/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.tn.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.tn.entity.QualityTn;
import com.zebone.quality.modules.tn.dao.QualityTnDao;

/**
 * quality_tnService
 * @author 卡卡西
 * @version 2021-01-19
 */
@Service
@Transactional(readOnly=true)
public class QualityTnService extends CrudService<QualityTnDao, QualityTn> {
	
	/**
	 * 获取单条数据
	 * @param qualityTn
	 * @return
	 */
	@Override
	public QualityTn get(QualityTn qualityTn) {
		return super.get(qualityTn);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityTn
	 * @return
	 */
	@Override
	public Page<QualityTn> findPage(Page<QualityTn> page, QualityTn qualityTn) {
		return super.findPage(page, qualityTn);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityTn
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityTn qualityTn) {
		super.save(qualityTn);
	}
	
	/**
	 * 更新状态
	 * @param qualityTn
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityTn qualityTn) {
		super.updateStatus(qualityTn);
	}
	
	/**
	 * 删除数据
	 * @param qualityTn
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityTn qualityTn) {
		super.delete(qualityTn);
	}
	
}