/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.modules.pay.service;

import java.util.List;

import com.zebone.modules.pay.entity.TradeRecord;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.modules.pay.entity.TradeBillDetail;
import com.zebone.modules.pay.dao.TradeBillDetailDao;

/**
 * 账单明细Service
 * @author lijin
 * @version 2020-12-09
 */
@Service
@Transactional(readOnly=true)
public class TradeBillDetailService extends CrudService<TradeBillDetailDao, TradeBillDetail> {
	
	/**
	 * 获取单条数据
	 * @param tradeBillDetail
	 * @return
	 */
	@Override
	public TradeBillDetail get(TradeBillDetail tradeBillDetail) {
		return super.get(tradeBillDetail);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param tradeBillDetail
	 * @return
	 */
	@Override
	public Page<TradeBillDetail> findPage(Page<TradeBillDetail> page, TradeBillDetail tradeBillDetail) {
		return super.findPage(page, tradeBillDetail);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param tradeBillDetail
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(TradeBillDetail tradeBillDetail) {
		super.save(tradeBillDetail);
	}
	
	/**
	 * 更新状态
	 * @param tradeBillDetail
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(TradeBillDetail tradeBillDetail) {
		super.updateStatus(tradeBillDetail);
	}
	
	/**
	 * 删除数据
	 * @param tradeBillDetail
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(TradeBillDetail tradeBillDetail) {
		super.delete(tradeBillDetail);
	}

	/**
	 * @author 刘旋
	 * @param tradeBillDetail
	 * @Description 条件查询
	 */
	@Override
	public List<TradeBillDetail> findList(TradeBillDetail tradeBillDetail){
		return super.findList(tradeBillDetail);
	}

}