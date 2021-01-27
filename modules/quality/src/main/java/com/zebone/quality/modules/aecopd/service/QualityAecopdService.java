/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.aecopd.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.aecopd.entity.QualityAecopd;
import com.zebone.quality.modules.aecopd.dao.QualityAecopdDao;

/**
 * AECOPD慢性阻塞性肺疾病急性发作（住院）Service
 * @author 卡卡西
 * @version 2021-01-27
 */
@Service
@Transactional(readOnly=true)
public class QualityAecopdService extends CrudService<QualityAecopdDao, QualityAecopd> {
	
	/**
	 * 获取单条数据
	 * @param qualityAecopd
	 * @return
	 */
	@Override
	public QualityAecopd get(QualityAecopd qualityAecopd) {
		return super.get(qualityAecopd);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityAecopd
	 * @return
	 */
	@Override
	public Page<QualityAecopd> findPage(Page<QualityAecopd> page, QualityAecopd qualityAecopd) {
		return super.findPage(page, qualityAecopd);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityAecopd
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityAecopd qualityAecopd) {
		super.save(qualityAecopd);
	}
	
	/**
	 * 更新状态
	 * @param qualityAecopd
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityAecopd qualityAecopd) {
		super.updateStatus(qualityAecopd);
	}
	
	/**
	 * 删除数据
	 * @param qualityAecopd
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityAecopd qualityAecopd) {
		super.delete(qualityAecopd);
	}
	
}