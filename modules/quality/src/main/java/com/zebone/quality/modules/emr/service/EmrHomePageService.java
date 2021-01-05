/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.emr.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.emr.entity.EmrHomePage;
import com.zebone.quality.modules.emr.dao.EmrHomePageDao;

/**
 * 病案Service
 * @author lijin
 * @version 2021-01-04
 */
@Service
@Transactional(readOnly=true)
public class EmrHomePageService extends CrudService<EmrHomePageDao, EmrHomePage> {
	
	/**
	 * 获取单条数据
	 * @param emrHomePage
	 * @return
	 */
	@Override
	public EmrHomePage get(EmrHomePage emrHomePage) {
		return super.get(emrHomePage);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param emrHomePage
	 * @return
	 */
	@Override
	public Page<EmrHomePage> findPage(Page<EmrHomePage> page, EmrHomePage emrHomePage) {
		return super.findPage(page, emrHomePage);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param emrHomePage
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(EmrHomePage emrHomePage) {
		super.save(emrHomePage);
	}
	
	/**
	 * 更新状态
	 * @param emrHomePage
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(EmrHomePage emrHomePage) {
		super.updateStatus(emrHomePage);
	}
	
	/**
	 * 删除数据
	 * @param emrHomePage
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(EmrHomePage emrHomePage) {
		super.delete(emrHomePage);
	}
	
}