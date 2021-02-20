/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.pip.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.pip.entity.QualityPip;
import com.zebone.quality.modules.pip.dao.QualityPipDao;

/**
 * PIP围手术期预防感染Service
 * @author 卡卡西
 * @version 2021-02-20
 */
@Service
@Transactional(readOnly=true)
public class QualityPipService extends CrudService<QualityPipDao, QualityPip> {
	
	/**
	 * 获取单条数据
	 * @param qualityPip
	 * @return
	 */
	@Override
	public QualityPip get(QualityPip qualityPip) {
		return super.get(qualityPip);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityPip
	 * @return
	 */
	@Override
	public Page<QualityPip> findPage(Page<QualityPip> page, QualityPip qualityPip) {
		return super.findPage(page, qualityPip);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityPip
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityPip qualityPip) {
		super.save(qualityPip);
	}
	
	/**
	 * 更新状态
	 * @param qualityPip
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityPip qualityPip) {
		super.updateStatus(qualityPip);
	}
	
	/**
	 * 删除数据
	 * @param qualityPip
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityPip qualityPip) {
		super.delete(qualityPip);
	}
	
}