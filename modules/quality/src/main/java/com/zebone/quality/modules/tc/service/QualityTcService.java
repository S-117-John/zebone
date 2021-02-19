/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.tc.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.tc.entity.QualityTc;
import com.zebone.quality.modules.tc.dao.QualityTcDao;

/**
 * TC甲状腺癌（手术治疗）Service
 * @author 卡卡西
 * @version 2021-02-19
 */
@Service
@Transactional(readOnly=true)
public class QualityTcService extends CrudService<QualityTcDao, QualityTc> {
	
	/**
	 * 获取单条数据
	 * @param qualityTc
	 * @return
	 */
	@Override
	public QualityTc get(QualityTc qualityTc) {
		return super.get(qualityTc);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityTc
	 * @return
	 */
	@Override
	public Page<QualityTc> findPage(Page<QualityTc> page, QualityTc qualityTc) {
		return super.findPage(page, qualityTc);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityTc
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityTc qualityTc) {
		super.save(qualityTc);
	}
	
	/**
	 * 更新状态
	 * @param qualityTc
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityTc qualityTc) {
		super.updateStatus(qualityTc);
	}
	
	/**
	 * 删除数据
	 * @param qualityTc
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityTc qualityTc) {
		super.delete(qualityTc);
	}
	
}