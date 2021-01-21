/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.pa.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.pa.entity.QualityPa;
import com.zebone.quality.modules.pa.dao.QualityPaDao;

/**
 * PA垂体腺瘤（初发，手术治疗）Service
 * @author 卡卡西
 * @version 2021-01-21
 */
@Service
@Transactional(readOnly=true)
public class QualityPaService extends CrudService<QualityPaDao, QualityPa> {
	
	/**
	 * 获取单条数据
	 * @param qualityPa
	 * @return
	 */
	@Override
	public QualityPa get(QualityPa qualityPa) {
		return super.get(qualityPa);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityPa
	 * @return
	 */
	@Override
	public Page<QualityPa> findPage(Page<QualityPa> page, QualityPa qualityPa) {
		return super.findPage(page, qualityPa);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityPa
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityPa qualityPa) {
		super.save(qualityPa);
	}
	
	/**
	 * 更新状态
	 * @param qualityPa
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityPa qualityPa) {
		super.updateStatus(qualityPa);
	}
	
	/**
	 * 删除数据
	 * @param qualityPa
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityPa qualityPa) {
		super.delete(qualityPa);
	}
	
}