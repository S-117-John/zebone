/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.avr.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.avr.entity.QualityAvr;
import com.zebone.quality.modules.avr.dao.QualityAvrDao;

/**
 * AVR主动脉瓣置换术Service
 * @author 卡卡西
 * @version 2021-02-19
 */
@Service
@Transactional(readOnly=true)
public class QualityAvrService extends CrudService<QualityAvrDao, QualityAvr> {
	
	/**
	 * 获取单条数据
	 * @param qualityAvr
	 * @return
	 */
	@Override
	public QualityAvr get(QualityAvr qualityAvr) {
		return super.get(qualityAvr);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityAvr
	 * @return
	 */
	@Override
	public Page<QualityAvr> findPage(Page<QualityAvr> page, QualityAvr qualityAvr) {
		return super.findPage(page, qualityAvr);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityAvr
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityAvr qualityAvr) {
		super.save(qualityAvr);
	}
	
	/**
	 * 更新状态
	 * @param qualityAvr
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityAvr qualityAvr) {
		super.updateStatus(qualityAvr);
	}
	
	/**
	 * 删除数据
	 * @param qualityAvr
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityAvr qualityAvr) {
		super.delete(qualityAvr);
	}
	
}