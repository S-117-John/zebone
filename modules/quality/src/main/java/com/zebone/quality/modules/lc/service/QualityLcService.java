/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.lc.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.lc.entity.QualityLc;
import com.zebone.quality.modules.lc.dao.QualityLcDao;

/**
 * LC肺癌（手术治疗）Service
 * @author 卡卡西
 * @version 2021-01-21
 */
@Service
@Transactional(readOnly=true)
public class QualityLcService extends CrudService<QualityLcDao, QualityLc> {
	
	/**
	 * 获取单条数据
	 * @param qualityLc
	 * @return
	 */
	@Override
	public QualityLc get(QualityLc qualityLc) {
		return super.get(qualityLc);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityLc
	 * @return
	 */
	@Override
	public Page<QualityLc> findPage(Page<QualityLc> page, QualityLc qualityLc) {
		return super.findPage(page, qualityLc);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityLc
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityLc qualityLc) {
		super.save(qualityLc);
	}
	
	/**
	 * 更新状态
	 * @param qualityLc
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityLc qualityLc) {
		super.updateStatus(qualityLc);
	}
	
	/**
	 * 删除数据
	 * @param qualityLc
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityLc qualityLc) {
		super.delete(qualityLc);
	}
	
}