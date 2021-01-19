/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.gc.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.gc.entity.QualityGc;

/**
 * GC胃癌（手术治疗）DAO接口
 * @author 卡卡西
 * @version 2021-01-19
 */
@MyBatisDao
public interface QualityGcDao extends CrudDao<QualityGc> {
	
}