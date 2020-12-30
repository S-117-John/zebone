/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.modules.pay.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.modules.pay.entity.TradeDayBillDetail;
import com.zebone.modules.pay.dao.TradeDayBillDetailDao;

/**
 * 日账单明细Service
 * @author lijin
 * @version 2020-12-09
 */
@Service
@Transactional(readOnly=true)
public class TradeDayBillDetailService extends CrudService<TradeDayBillDetailDao, TradeDayBillDetail> {
	
	/**
	 * 获取单条数据
	 * @param tradeDayBillDetail
	 * @return
	 */
	@Override
	public TradeDayBillDetail get(TradeDayBillDetail tradeDayBillDetail) {
		return super.get(tradeDayBillDetail);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param tradeDayBillDetail
	 * @return
	 */
	@Override
	public Page<TradeDayBillDetail> findPage(Page<TradeDayBillDetail> page, TradeDayBillDetail tradeDayBillDetail) {
		return super.findPage(page, tradeDayBillDetail);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param tradeDayBillDetail
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(TradeDayBillDetail tradeDayBillDetail) {
		super.save(tradeDayBillDetail);
	}
	
	/**
	 * 更新状态
	 * @param tradeDayBillDetail
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(TradeDayBillDetail tradeDayBillDetail) {
		super.updateStatus(tradeDayBillDetail);
	}
	
	/**
	 * 删除数据
	 * @param tradeDayBillDetail
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(TradeDayBillDetail tradeDayBillDetail) {
		super.delete(tradeDayBillDetail);
	}
	
}