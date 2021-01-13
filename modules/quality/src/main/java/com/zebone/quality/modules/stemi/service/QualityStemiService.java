/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.stemi.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.stemi.entity.QualityStemi;
import com.zebone.quality.modules.stemi.dao.QualityStemiDao;

/**
 * STEMI急性心肌梗死（ST 段抬高型，首次住院）Service
 * @author lijin
 * @version 2021-01-13
 */
@Service
@Transactional(readOnly=true)
public class QualityStemiService extends CrudService<QualityStemiDao, QualityStemi> {
	
	/**
	 * 获取单条数据
	 * @param qualityStemi
	 * @return
	 */
	@Override
	public QualityStemi get(QualityStemi qualityStemi) {
		return super.get(qualityStemi);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityStemi
	 * @return
	 */
	@Override
	public Page<QualityStemi> findPage(Page<QualityStemi> page, QualityStemi qualityStemi) {
		return super.findPage(page, qualityStemi);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityStemi
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityStemi qualityStemi) {
		super.save(qualityStemi);
	}
	
	/**
	 * 更新状态
	 * @param qualityStemi
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityStemi qualityStemi) {
		super.updateStatus(qualityStemi);
	}
	
	/**
	 * 删除数据
	 * @param qualityStemi
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityStemi qualityStemi) {
		super.delete(qualityStemi);
	}
	
}