/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.modules.merchant.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.modules.merchant.entity.PayMerchant;

/**
 * 商户信息DAO接口
 * @author lijin
 * @version 2020-12-08
 */
@MyBatisDao
public interface PayMerchantDao extends CrudDao<PayMerchant> {
	
}