/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.af.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.af.entity.QualityAf;
import com.zebone.quality.modules.af.dao.QualityAfDao;

/**
 * AF房颤Service
 * @author kakaxi
 * @version 2021-01-14
 */
@Service
@Transactional(readOnly=true)
public class QualityAfService extends CrudService<QualityAfDao, QualityAf> {
	
	/**
	 * 获取单条数据
	 * @param qualityAf
	 * @return
	 */
	@Override
	public QualityAf get(QualityAf qualityAf) {
		return super.get(qualityAf);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityAf
	 * @return
	 */
	@Override
	public Page<QualityAf> findPage(Page<QualityAf> page, QualityAf qualityAf) {
		return super.findPage(page, qualityAf);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityAf
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityAf qualityAf) {
		super.save(qualityAf);
	}
	
	/**
	 * 更新状态
	 * @param qualityAf
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityAf qualityAf) {
		super.updateStatus(qualityAf);
	}
	
	/**
	 * 删除数据
	 * @param qualityAf
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityAf qualityAf) {
		super.delete(qualityAf);
	}
	
}