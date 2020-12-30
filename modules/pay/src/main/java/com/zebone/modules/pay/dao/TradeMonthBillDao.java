/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.modules.pay.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.modules.pay.entity.TradeMonthBill;

/**
 * 月账单DAO接口
 * @author lijin
 * @version 2020-12-09
 */
@MyBatisDao
public interface TradeMonthBillDao extends CrudDao<TradeMonthBill> {
	
}