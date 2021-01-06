/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.emr.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.emr.entity.EmrHomePage;

/**
 * 病案DAO接口
 * @author lijin
 * @version 2021-01-04
 */
@MyBatisDao(dataSourceName="ds2")
public interface EmrHomePageDao extends CrudDao<EmrHomePage> {
	
}