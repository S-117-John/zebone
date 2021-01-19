/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.capadult.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.capadult.entity.QualityCapAdult;
import com.zebone.quality.modules.capadult.dao.QualityCapAdultDao;

/**
 * Cap-Adult社区获得性肺炎（成人，首次住院）Service
 * @author 卡卡西
 * @version 2021-01-18
 */
@Service
@Transactional(readOnly=true)
public class QualityCapAdultService extends CrudService<QualityCapAdultDao, QualityCapAdult> {
	
	/**
	 * 获取单条数据
	 * @param qualityCapAdult
	 * @return
	 */
	@Override
	public QualityCapAdult get(QualityCapAdult qualityCapAdult) {
		return super.get(qualityCapAdult);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityCapAdult
	 * @return
	 */
	@Override
	public Page<QualityCapAdult> findPage(Page<QualityCapAdult> page, QualityCapAdult qualityCapAdult) {
		return super.findPage(page, qualityCapAdult);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityCapAdult
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityCapAdult qualityCapAdult) {
		super.save(qualityCapAdult);
	}
	
	/**
	 * 更新状态
	 * @param qualityCapAdult
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityCapAdult qualityCapAdult) {
		super.updateStatus(qualityCapAdult);
	}
	
	/**
	 * 删除数据
	 * @param qualityCapAdult
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityCapAdult qualityCapAdult) {
		super.delete(qualityCapAdult);
	}
	
}