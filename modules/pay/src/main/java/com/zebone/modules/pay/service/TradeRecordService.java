/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.modules.pay.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.modules.pay.entity.TradeRecord;
import com.zebone.modules.pay.dao.TradeRecordDao;

/**
 * 交易记录Service
 * @author lijin
 * @version 2020-12-08
 */
@Service
@Transactional(readOnly=true)
public class TradeRecordService extends CrudService<TradeRecordDao, TradeRecord> {
	
	/**
	 * 获取单条数据
	 * @param tradeRecord
	 * @return
	 */
	@Override
	public TradeRecord get(TradeRecord tradeRecord) {
		return super.get(tradeRecord);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param tradeRecord
	 * @return
	 */
	@Override
	public Page<TradeRecord> findPage(Page<TradeRecord> page, TradeRecord tradeRecord) {
		return super.findPage(page, tradeRecord);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param tradeRecord
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(TradeRecord tradeRecord) {
		super.save(tradeRecord);
	}
	
	/**
	 * 更新状态
	 * @param tradeRecord
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(TradeRecord tradeRecord) {
		super.updateStatus(tradeRecord);
	}
	
	/**
	 * 删除数据
	 * @param tradeRecord
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(TradeRecord tradeRecord) {
		super.delete(tradeRecord);
	}
	
}