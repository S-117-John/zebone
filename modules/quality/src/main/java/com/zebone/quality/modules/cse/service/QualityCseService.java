/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.cse.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.cse.entity.QualityCse;
import com.zebone.quality.modules.cse.dao.QualityCseDao;

/**
 * CSE惊厥性癫痫持续状态Service
 * @author 卡卡西
 * @version 2021-02-19
 */
@Service
@Transactional(readOnly=true)
public class QualityCseService extends CrudService<QualityCseDao, QualityCse> {
	
	/**
	 * 获取单条数据
	 * @param qualityCse
	 * @return
	 */
	@Override
	public QualityCse get(QualityCse qualityCse) {
		return super.get(qualityCse);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityCse
	 * @return
	 */
	@Override
	public Page<QualityCse> findPage(Page<QualityCse> page, QualityCse qualityCse) {
		return super.findPage(page, qualityCse);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityCse
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityCse qualityCse) {
		super.save(qualityCse);
	}
	
	/**
	 * 更新状态
	 * @param qualityCse
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityCse qualityCse) {
		super.updateStatus(qualityCse);
	}
	
	/**
	 * 删除数据
	 * @param qualityCse
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityCse qualityCse) {
		super.delete(qualityCse);
	}
	
}