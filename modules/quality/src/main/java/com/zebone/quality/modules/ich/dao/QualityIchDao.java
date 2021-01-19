/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.ich.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.ich.entity.QualityIch;

/**
 * ICH脑出血DAO接口
 * @author 卡卡西
 * @version 2021-01-18
 */
@MyBatisDao
public interface QualityIchDao extends CrudDao<QualityIch> {
	
}