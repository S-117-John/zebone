/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.modules.pay.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.modules.pay.entity.TradeDayBill;
import com.zebone.modules.pay.dao.TradeDayBillDao;

/**
 * 日账单Service
 * @author lijin
 * @version 2020-12-09
 */
@Service
@Transactional(readOnly=true)
public class TradeDayBillService extends CrudService<TradeDayBillDao, TradeDayBill> {
	
	/**
	 * 获取单条数据
	 * @param tradeDayBill
	 * @return
	 */
	@Override
	public TradeDayBill get(TradeDayBill tradeDayBill) {
		return super.get(tradeDayBill);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param tradeDayBill
	 * @return
	 */
	@Override
	public Page<TradeDayBill> findPage(Page<TradeDayBill> page, TradeDayBill tradeDayBill) {
		return super.findPage(page, tradeDayBill);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param tradeDayBill
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(TradeDayBill tradeDayBill) {
		super.save(tradeDayBill);
	}
	
	/**
	 * 更新状态
	 * @param tradeDayBill
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(TradeDayBill tradeDayBill) {
		super.updateStatus(tradeDayBill);
	}
	
	/**
	 * 删除数据
	 * @param tradeDayBill
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(TradeDayBill tradeDayBill) {
		super.delete(tradeDayBill);
	}
	
}