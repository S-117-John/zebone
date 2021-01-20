/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.cabg.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.cabg.entity.QualityCabg;
import com.zebone.quality.modules.cabg.dao.QualityCabgDao;

/**
 * CABG冠状动脉旁路移植术Service
 * @author 卡卡西
 * @version 2021-01-20
 */
@Service
@Transactional(readOnly=true)
public class QualityCabgService extends CrudService<QualityCabgDao, QualityCabg> {
	
	/**
	 * 获取单条数据
	 * @param qualityCabg
	 * @return
	 */
	@Override
	public QualityCabg get(QualityCabg qualityCabg) {
		return super.get(qualityCabg);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityCabg
	 * @return
	 */
	@Override
	public Page<QualityCabg> findPage(Page<QualityCabg> page, QualityCabg qualityCabg) {
		return super.findPage(page, qualityCabg);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityCabg
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityCabg qualityCabg) {
		super.save(qualityCabg);
	}
	
	/**
	 * 更新状态
	 * @param qualityCabg
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityCabg qualityCabg) {
		super.updateStatus(qualityCabg);
	}
	
	/**
	 * 删除数据
	 * @param qualityCabg
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityCabg qualityCabg) {
		super.delete(qualityCabg);
	}
	
}