/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.modules.merchant.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.modules.merchant.entity.PayMerchant;
import com.zebone.modules.merchant.dao.PayMerchantDao;

/**
 * 商户信息Service
 * @author lijin
 * @version 2020-12-08
 */
@Service
@Transactional(readOnly=true)
public class PayMerchantService extends CrudService<PayMerchantDao, PayMerchant> {
	
	/**
	 * 获取单条数据
	 * @param payMerchant
	 * @return
	 */
	@Override
	public PayMerchant get(PayMerchant payMerchant) {
		return super.get(payMerchant);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param payMerchant
	 * @return
	 */
	@Override
	public Page<PayMerchant> findPage(Page<PayMerchant> page, PayMerchant payMerchant) {
		return super.findPage(page, payMerchant);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param payMerchant
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(PayMerchant payMerchant) {
		super.save(payMerchant);
	}
	
	/**
	 * 更新状态
	 * @param payMerchant
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(PayMerchant payMerchant) {
		super.updateStatus(payMerchant);
	}
	
	/**
	 * 删除数据
	 * @param payMerchant
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(PayMerchant payMerchant) {
		super.delete(payMerchant);
	}
	
}