/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.asah.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.asah.entity.QualityAsah;
import com.zebone.quality.modules.asah.dao.QualityAsahDao;

/**
 * aSAH急性动脉瘤性蛛网膜下腔出血（初发，手术治疗）Service
 * @author 卡卡西
 * @version 2021-01-21
 */
@Service
@Transactional(readOnly=true)
public class QualityAsahService extends CrudService<QualityAsahDao, QualityAsah> {
	
	/**
	 * 获取单条数据
	 * @param qualityAsah
	 * @return
	 */
	@Override
	public QualityAsah get(QualityAsah qualityAsah) {
		return super.get(qualityAsah);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityAsah
	 * @return
	 */
	@Override
	public Page<QualityAsah> findPage(Page<QualityAsah> page, QualityAsah qualityAsah) {
		return super.findPage(page, qualityAsah);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityAsah
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityAsah qualityAsah) {
		super.save(qualityAsah);
	}
	
	/**
	 * 更新状态
	 * @param qualityAsah
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityAsah qualityAsah) {
		super.updateStatus(qualityAsah);
	}
	
	/**
	 * 删除数据
	 * @param qualityAsah
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityAsah qualityAsah) {
		super.delete(qualityAsah);
	}
	
}