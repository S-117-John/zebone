/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.modules.pay.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.modules.pay.entity.TradeHisRecord;
import com.zebone.modules.pay.dao.TradeHisRecordDao;

/**
 * 院内交易记录Service
 * @author lijin
 * @version 2020-12-08
 */
@Service
@Transactional(readOnly=true)
public class TradeHisRecordService extends CrudService<TradeHisRecordDao, TradeHisRecord> {
	
	/**
	 * 获取单条数据
	 * @param tradeHisRecord
	 * @return
	 */
	@Override
	public TradeHisRecord get(TradeHisRecord tradeHisRecord) {
		return super.get(tradeHisRecord);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param tradeHisRecord
	 * @return
	 */
	@Override
	public Page<TradeHisRecord> findPage(Page<TradeHisRecord> page, TradeHisRecord tradeHisRecord) {
		return super.findPage(page, tradeHisRecord);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param tradeHisRecord
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(TradeHisRecord tradeHisRecord) {
		super.save(tradeHisRecord);
	}
	
	/**
	 * 更新状态
	 * @param tradeHisRecord
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(TradeHisRecord tradeHisRecord) {
		super.updateStatus(tradeHisRecord);
	}
	
	/**
	 * 删除数据
	 * @param tradeHisRecord
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(TradeHisRecord tradeHisRecord) {
		super.delete(tradeHisRecord);
	}
	
}