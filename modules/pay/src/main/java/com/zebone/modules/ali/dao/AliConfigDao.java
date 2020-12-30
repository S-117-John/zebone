/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.modules.ali.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.modules.ali.entity.AliConfig;

/**
 * 支付宝配置DAO接口
 * @author lijin
 * @version 2020-12-08
 */
@MyBatisDao
public interface AliConfigDao extends CrudDao<AliConfig> {
	
}