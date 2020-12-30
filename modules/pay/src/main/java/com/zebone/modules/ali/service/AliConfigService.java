/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.modules.ali.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.modules.ali.entity.AliConfig;
import com.zebone.modules.ali.dao.AliConfigDao;

/**
 * 支付宝配置Service
 * @author lijin
 * @version 2020-12-08
 */
@Service
@Transactional(readOnly=true)
public class AliConfigService extends CrudService<AliConfigDao, AliConfig> {
	
	/**
	 * 获取单条数据
	 * @param aliConfig
	 * @return
	 */
	@Override
	public AliConfig get(AliConfig aliConfig) {
		return super.get(aliConfig);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param aliConfig
	 * @return
	 */
	@Override
	public Page<AliConfig> findPage(Page<AliConfig> page, AliConfig aliConfig) {
		return super.findPage(page, aliConfig);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param aliConfig
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(AliConfig aliConfig) {
		super.save(aliConfig);
	}
	
	/**
	 * 更新状态
	 * @param aliConfig
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(AliConfig aliConfig) {
		super.updateStatus(aliConfig);
	}
	
	/**
	 * 删除数据
	 * @param aliConfig
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(AliConfig aliConfig) {
		super.delete(aliConfig);
	}
	
}