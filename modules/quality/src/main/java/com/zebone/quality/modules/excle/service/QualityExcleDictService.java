/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.excle.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.excle.entity.QualityExcleDict;
import com.zebone.quality.modules.excle.dao.QualityExcleDictDao;

/**
 * 病种数据编码字典Service
 * @author 卡卡西
 * @version 2021-01-15
 */
@Service
@Transactional(readOnly=true)
public class QualityExcleDictService extends CrudService<QualityExcleDictDao, QualityExcleDict> {
	
	/**
	 * 获取单条数据
	 * @param qualityExcleDict
	 * @return
	 */
	@Override
	public QualityExcleDict get(QualityExcleDict qualityExcleDict) {
		return super.get(qualityExcleDict);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityExcleDict
	 * @return
	 */
	@Override
	public Page<QualityExcleDict> findPage(Page<QualityExcleDict> page, QualityExcleDict qualityExcleDict) {
		return super.findPage(page, qualityExcleDict);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityExcleDict
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityExcleDict qualityExcleDict) {
		super.save(qualityExcleDict);
	}
	
	/**
	 * 更新状态
	 * @param qualityExcleDict
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityExcleDict qualityExcleDict) {
		super.updateStatus(qualityExcleDict);
	}
	
	/**
	 * 删除数据
	 * @param qualityExcleDict
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityExcleDict qualityExcleDict) {
		super.delete(qualityExcleDict);
	}
	
}