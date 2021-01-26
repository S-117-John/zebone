/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.dg.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.dg.entity.QualityDg;
import com.zebone.quality.modules.dg.dao.QualityDgDao;

/**
 * DG异位妊娠（手术治疗）Service
 * @author 卡卡西
 * @version 2021-01-22
 */
@Service
@Transactional(readOnly=true)
public class QualityDgService extends CrudService<QualityDgDao, QualityDg> {
	
	/**
	 * 获取单条数据
	 * @param qualityDg
	 * @return
	 */
	@Override
	public QualityDg get(QualityDg qualityDg) {
		return super.get(qualityDg);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityDg
	 * @return
	 */
	@Override
	public Page<QualityDg> findPage(Page<QualityDg> page, QualityDg qualityDg) {
		return super.findPage(page, qualityDg);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityDg
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityDg qualityDg) {
		super.save(qualityDg);
	}
	
	/**
	 * 更新状态
	 * @param qualityDg
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityDg qualityDg) {
		super.updateStatus(qualityDg);
	}
	
	/**
	 * 删除数据
	 * @param qualityDg
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityDg qualityDg) {
		super.delete(qualityDg);
	}
	
}