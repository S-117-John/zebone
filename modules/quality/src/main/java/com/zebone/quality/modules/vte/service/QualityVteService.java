/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.vte.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.vte.entity.QualityVte;
import com.zebone.quality.modules.vte.dao.QualityVteDao;

/**
 * VTE中高危风险患者预防静脉血栓栓塞症Service
 * @author 卡卡西
 * @version 2021-01-22
 */
@Service
@Transactional(readOnly=true)
public class QualityVteService extends CrudService<QualityVteDao, QualityVte> {
	
	/**
	 * 获取单条数据
	 * @param qualityVte
	 * @return
	 */
	@Override
	public QualityVte get(QualityVte qualityVte) {
		return super.get(qualityVte);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityVte
	 * @return
	 */
	@Override
	public Page<QualityVte> findPage(Page<QualityVte> page, QualityVte qualityVte) {
		return super.findPage(page, qualityVte);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityVte
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityVte qualityVte) {
		super.save(qualityVte);
	}
	
	/**
	 * 更新状态
	 * @param qualityVte
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityVte qualityVte) {
		super.updateStatus(qualityVte);
	}
	
	/**
	 * 删除数据
	 * @param qualityVte
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityVte qualityVte) {
		super.delete(qualityVte);
	}
	
}