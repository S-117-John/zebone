/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.cac.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.cac.entity.QualityCac;
import com.zebone.quality.modules.cac.dao.QualityCacDao;

/**
 * CAC哮喘（成人，急性发作，住院）Service
 * @author 卡卡西
 * @version 2021-02-07
 */
@Service
@Transactional(readOnly=true)
public class QualityCacService extends CrudService<QualityCacDao, QualityCac> {
	
	/**
	 * 获取单条数据
	 * @param qualityCac
	 * @return
	 */
	@Override
	public QualityCac get(QualityCac qualityCac) {
		return super.get(qualityCac);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityCac
	 * @return
	 */
	@Override
	public Page<QualityCac> findPage(Page<QualityCac> page, QualityCac qualityCac) {
		return super.findPage(page, qualityCac);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityCac
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityCac qualityCac) {
		super.save(qualityCac);
	}
	
	/**
	 * 更新状态
	 * @param qualityCac
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityCac qualityCac) {
		super.updateStatus(qualityCac);
	}
	
	/**
	 * 删除数据
	 * @param qualityCac
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityCac qualityCac) {
		super.delete(qualityCac);
	}
	
}