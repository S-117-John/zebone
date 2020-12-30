/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.modules.pay.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.modules.pay.entity.TradeMonthBill;
import com.zebone.modules.pay.dao.TradeMonthBillDao;
import com.jeesite.modules.file.utils.FileUploadUtils;

/**
 * 月账单Service
 * @author lijin
 * @version 2020-12-09
 */
@Service
@Transactional(readOnly=true)
public class TradeMonthBillService extends CrudService<TradeMonthBillDao, TradeMonthBill> {
	
	/**
	 * 获取单条数据
	 * @param tradeMonthBill
	 * @return
	 */
	@Override
	public TradeMonthBill get(TradeMonthBill tradeMonthBill) {
		return super.get(tradeMonthBill);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param tradeMonthBill
	 * @return
	 */
	@Override
	public Page<TradeMonthBill> findPage(Page<TradeMonthBill> page, TradeMonthBill tradeMonthBill) {
		return super.findPage(page, tradeMonthBill);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param tradeMonthBill
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(TradeMonthBill tradeMonthBill) {
		super.save(tradeMonthBill);
		// 保存上传附件
		FileUploadUtils.saveFileUpload(tradeMonthBill.getId(), "tradeMonthBill_file");
	}
	
	/**
	 * 更新状态
	 * @param tradeMonthBill
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(TradeMonthBill tradeMonthBill) {
		super.updateStatus(tradeMonthBill);
	}
	
	/**
	 * 删除数据
	 * @param tradeMonthBill
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(TradeMonthBill tradeMonthBill) {
		super.delete(tradeMonthBill);
	}
	
}