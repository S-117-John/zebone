/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.dvt.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.dvt.entity.QualityDvt;
import com.zebone.quality.modules.dvt.dao.QualityDvtDao;

/**
 * DVT围手术期预防深静脉血栓栓塞Service
 * @author 卡卡西
 * @version 2021-01-19
 */
@Service
@Transactional(readOnly=true)
public class QualityDvtService extends CrudService<QualityDvtDao, QualityDvt> {
	
	/**
	 * 获取单条数据
	 * @param qualityDvt
	 * @return
	 */
	@Override
	public QualityDvt get(QualityDvt qualityDvt) {
		return super.get(qualityDvt);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityDvt
	 * @return
	 */
	@Override
	public Page<QualityDvt> findPage(Page<QualityDvt> page, QualityDvt qualityDvt) {
		return super.findPage(page, qualityDvt);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityDvt
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityDvt qualityDvt) {
		super.save(qualityDvt);
	}
	
	/**
	 * 更新状态
	 * @param qualityDvt
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityDvt qualityDvt) {
		super.updateStatus(qualityDvt);
	}
	
	/**
	 * 删除数据
	 * @param qualityDvt
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityDvt qualityDvt) {
		super.delete(qualityDvt);
	}
	
}