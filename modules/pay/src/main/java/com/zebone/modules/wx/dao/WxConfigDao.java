/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.modules.wx.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.modules.wx.entity.WxConfig;

/**
 * 微信配置DAO接口
 * @author lijin
 * @version 2020-12-08
 */
@MyBatisDao
public interface WxConfigDao extends CrudDao<WxConfig> {
	
}