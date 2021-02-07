/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.knee.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.knee.entity.QualityKnee;
import com.zebone.quality.modules.knee.dao.QualityKneeDao;

/**
 * Knee膝关节置换术Service
 * @author 卡卡西
 * @version 2021-02-07
 */
@Service
@Transactional(readOnly=true)
public class QualityKneeService extends CrudService<QualityKneeDao, QualityKnee> {
	
	/**
	 * 获取单条数据
	 * @param qualityKnee
	 * @return
	 */
	@Override
	public QualityKnee get(QualityKnee qualityKnee) {
		return super.get(qualityKnee);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityKnee
	 * @return
	 */
	@Override
	public Page<QualityKnee> findPage(Page<QualityKnee> page, QualityKnee qualityKnee) {
		return super.findPage(page, qualityKnee);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityKnee
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityKnee qualityKnee) {
		super.save(qualityKnee);
	}
	
	/**
	 * 更新状态
	 * @param qualityKnee
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityKnee qualityKnee) {
		super.updateStatus(qualityKnee);
	}
	
	/**
	 * 删除数据
	 * @param qualityKnee
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityKnee qualityKnee) {
		super.delete(qualityKnee);
	}
	
}