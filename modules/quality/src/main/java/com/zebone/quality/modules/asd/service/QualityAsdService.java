/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.asd.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.asd.entity.QualityAsd;
import com.zebone.quality.modules.asd.dao.QualityAsdDao;

/**
 * ASD房间隔缺损手术Service
 * @author 卡卡西
 * @version 2021-02-19
 */
@Service
@Transactional(readOnly=true)
public class QualityAsdService extends CrudService<QualityAsdDao, QualityAsd> {
	
	/**
	 * 获取单条数据
	 * @param qualityAsd
	 * @return
	 */
	@Override
	public QualityAsd get(QualityAsd qualityAsd) {
		return super.get(qualityAsd);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityAsd
	 * @return
	 */
	@Override
	public Page<QualityAsd> findPage(Page<QualityAsd> page, QualityAsd qualityAsd) {
		return super.findPage(page, qualityAsd);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityAsd
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityAsd qualityAsd) {
		super.save(qualityAsd);
	}
	
	/**
	 * 更新状态
	 * @param qualityAsd
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityAsd qualityAsd) {
		super.updateStatus(qualityAsd);
	}
	
	/**
	 * 删除数据
	 * @param qualityAsd
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityAsd qualityAsd) {
		super.delete(qualityAsd);
	}
	
}