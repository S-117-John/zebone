/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.modules.pay.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.modules.pay.entity.TradeMonthBillDetail;
import com.zebone.modules.pay.dao.TradeMonthBillDetailDao;

/**
 * 月账单详情Service
 * @author lijin
 * @version 2020-12-09
 */
@Service
@Transactional(readOnly=true)
public class TradeMonthBillDetailService extends CrudService<TradeMonthBillDetailDao, TradeMonthBillDetail> {
	
	/**
	 * 获取单条数据
	 * @param tradeMonthBillDetail
	 * @return
	 */
	@Override
	public TradeMonthBillDetail get(TradeMonthBillDetail tradeMonthBillDetail) {
		return super.get(tradeMonthBillDetail);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param tradeMonthBillDetail
	 * @return
	 */
	@Override
	public Page<TradeMonthBillDetail> findPage(Page<TradeMonthBillDetail> page, TradeMonthBillDetail tradeMonthBillDetail) {
		return super.findPage(page, tradeMonthBillDetail);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param tradeMonthBillDetail
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(TradeMonthBillDetail tradeMonthBillDetail) {
		super.save(tradeMonthBillDetail);
	}
	
	/**
	 * 更新状态
	 * @param tradeMonthBillDetail
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(TradeMonthBillDetail tradeMonthBillDetail) {
		super.updateStatus(tradeMonthBillDetail);
	}
	
	/**
	 * 删除数据
	 * @param tradeMonthBillDetail
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(TradeMonthBillDetail tradeMonthBillDetail) {
		super.delete(tradeMonthBillDetail);
	}
	
}