/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.pd.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.pd.entity.QualityPd;
import com.zebone.quality.modules.pd.dao.QualityPdDao;

/**
 * PD帕金森病Service
 * @author 卡卡西
 * @version 2021-01-16
 */
@Service
@Transactional(readOnly=true)
public class QualityPdService extends CrudService<QualityPdDao, QualityPd> {
	
	/**
	 * 获取单条数据
	 * @param qualityPd
	 * @return
	 */
	@Override
	public QualityPd get(QualityPd qualityPd) {
		return super.get(qualityPd);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityPd
	 * @return
	 */
	@Override
	public Page<QualityPd> findPage(Page<QualityPd> page, QualityPd qualityPd) {
		return super.findPage(page, qualityPd);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityPd
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityPd qualityPd) {
		super.save(qualityPd);
	}
	
	/**
	 * 更新状态
	 * @param qualityPd
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityPd qualityPd) {
		super.updateStatus(qualityPd);
	}
	
	/**
	 * 删除数据
	 * @param qualityPd
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityPd qualityPd) {
		super.delete(qualityPd);
	}
	
}