/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.stk.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.stk.entity.QualityStk;

/**
 * STK脑梗死（首次住院）DAO接口
 * @author 卡卡西
 * @version 2021-02-07
 */
@MyBatisDao
public interface QualityStkDao extends CrudDao<QualityStk> {
	
}