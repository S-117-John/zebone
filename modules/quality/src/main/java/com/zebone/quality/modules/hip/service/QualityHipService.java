/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.hip.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.hip.entity.QualityHip;
import com.zebone.quality.modules.hip.dao.QualityHipDao;

/**
 * Hip髋关节置换术Service
 * @author 卡卡西
 * @version 2021-01-21
 */
@Service
@Transactional(readOnly=true)
public class QualityHipService extends CrudService<QualityHipDao, QualityHip> {
	
	/**
	 * 获取单条数据
	 * @param qualityHip
	 * @return
	 */
	@Override
	public QualityHip get(QualityHip qualityHip) {
		return super.get(qualityHip);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityHip
	 * @return
	 */
	@Override
	public Page<QualityHip> findPage(Page<QualityHip> page, QualityHip qualityHip) {
		return super.findPage(page, qualityHip);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityHip
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityHip qualityHip) {
		super.save(qualityHip);
	}
	
	/**
	 * 更新状态
	 * @param qualityHip
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityHip qualityHip) {
		super.updateStatus(qualityHip);
	}
	
	/**
	 * 删除数据
	 * @param qualityHip
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityHip qualityHip) {
		super.delete(qualityHip);
	}
	
}