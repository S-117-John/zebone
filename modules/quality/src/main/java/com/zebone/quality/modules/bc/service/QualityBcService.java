/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.bc.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.bc.entity.QualityBc;
import com.zebone.quality.modules.bc.dao.QualityBcDao;

/**
 * BC乳腺癌（手术治疗）Service
 * @author 卡卡西
 * @version 2021-02-19
 */
@Service
@Transactional(readOnly=true)
public class QualityBcService extends CrudService<QualityBcDao, QualityBc> {
	
	/**
	 * 获取单条数据
	 * @param qualityBc
	 * @return
	 */
	@Override
	public QualityBc get(QualityBc qualityBc) {
		return super.get(qualityBc);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityBc
	 * @return
	 */
	@Override
	public Page<QualityBc> findPage(Page<QualityBc> page, QualityBc qualityBc) {
		return super.findPage(page, qualityBc);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityBc
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityBc qualityBc) {
		super.save(qualityBc);
	}
	
	/**
	 * 更新状态
	 * @param qualityBc
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityBc qualityBc) {
		super.updateStatus(qualityBc);
	}
	
	/**
	 * 删除数据
	 * @param qualityBc
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityBc qualityBc) {
		super.delete(qualityBc);
	}
	
}