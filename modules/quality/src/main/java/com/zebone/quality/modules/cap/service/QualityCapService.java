/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.cap.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.cap.entity.QualityCap;
import com.zebone.quality.modules.cap.dao.QualityCapDao;

/**
 * Cap社区获得性肺炎（儿童，首次住院）Service
 * @author 卡卡西
 * @version 2021-01-22
 */
@Service
@Transactional(readOnly=true)
public class QualityCapService extends CrudService<QualityCapDao, QualityCap> {
	
	/**
	 * 获取单条数据
	 * @param qualityCap
	 * @return
	 */
	@Override
	public QualityCap get(QualityCap qualityCap) {
		return super.get(qualityCap);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityCap
	 * @return
	 */
	@Override
	public Page<QualityCap> findPage(Page<QualityCap> page, QualityCap qualityCap) {
		return super.findPage(page, qualityCap);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityCap
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityCap qualityCap) {
		super.save(qualityCap);
	}
	
	/**
	 * 更新状态
	 * @param qualityCap
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityCap qualityCap) {
		super.updateStatus(qualityCap);
	}
	
	/**
	 * 删除数据
	 * @param qualityCap
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityCap qualityCap) {
		super.delete(qualityCap);
	}
	
}