/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.men.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.men.entity.QualityMen;
import com.zebone.quality.modules.men.dao.QualityMenDao;

/**
 * MEN脑膜瘤（初发手术治疗）Service
 * @author 卡卡西
 * @version 2021-02-20
 */
@Service
@Transactional(readOnly=true)
public class QualityMenService extends CrudService<QualityMenDao, QualityMen> {
	
	/**
	 * 获取单条数据
	 * @param qualityMen
	 * @return
	 */
	@Override
	public QualityMen get(QualityMen qualityMen) {
		return super.get(qualityMen);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityMen
	 * @return
	 */
	@Override
	public Page<QualityMen> findPage(Page<QualityMen> page, QualityMen qualityMen) {
		return super.findPage(page, qualityMen);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityMen
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityMen qualityMen) {
		super.save(qualityMen);
	}
	
	/**
	 * 更新状态
	 * @param qualityMen
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityMen qualityMen) {
		super.updateStatus(qualityMen);
	}
	
	/**
	 * 删除数据
	 * @param qualityMen
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityMen qualityMen) {
		super.delete(qualityMen);
	}
	
}