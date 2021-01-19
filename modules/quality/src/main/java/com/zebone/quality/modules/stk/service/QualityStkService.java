/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.stk.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.stk.entity.QualityStk;
import com.zebone.quality.modules.stk.dao.QualityStkDao;

/**
 * STK脑梗死（首次住院）Service
 * @author 卡卡西
 * @version 2021-01-15
 */
@Service
@Transactional(readOnly=true)
public class QualityStkService extends CrudService<QualityStkDao, QualityStk> {
	
	/**
	 * 获取单条数据
	 * @param qualityStk
	 * @return
	 */
	@Override
	public QualityStk get(QualityStk qualityStk) {
		return super.get(qualityStk);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityStk
	 * @return
	 */
	@Override
	public Page<QualityStk> findPage(Page<QualityStk> page, QualityStk qualityStk) {
		return super.findPage(page, qualityStk);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityStk
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityStk qualityStk) {
		super.save(qualityStk);
	}
	
	/**
	 * 更新状态
	 * @param qualityStk
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityStk qualityStk) {
		super.updateStatus(qualityStk);
	}
	
	/**
	 * 删除数据
	 * @param qualityStk
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityStk qualityStk) {
		super.delete(qualityStk);
	}
	
}