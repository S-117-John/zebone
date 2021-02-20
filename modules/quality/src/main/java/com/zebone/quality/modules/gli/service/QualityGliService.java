/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.gli.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.gli.entity.QualityGli;
import com.zebone.quality.modules.gli.dao.QualityGliDao;

/**
 * GLI胶质瘤（初发，手术治疗）Service
 * @author 卡卡西
 * @version 2021-02-20
 */
@Service
@Transactional(readOnly=true)
public class QualityGliService extends CrudService<QualityGliDao, QualityGli> {
	
	/**
	 * 获取单条数据
	 * @param qualityGli
	 * @return
	 */
	@Override
	public QualityGli get(QualityGli qualityGli) {
		return super.get(qualityGli);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityGli
	 * @return
	 */
	@Override
	public Page<QualityGli> findPage(Page<QualityGli> page, QualityGli qualityGli) {
		return super.findPage(page, qualityGli);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityGli
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityGli qualityGli) {
		super.save(qualityGli);
	}
	
	/**
	 * 更新状态
	 * @param qualityGli
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityGli qualityGli) {
		super.updateStatus(qualityGli);
	}
	
	/**
	 * 删除数据
	 * @param qualityGli
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityGli qualityGli) {
		super.delete(qualityGli);
	}
	
}