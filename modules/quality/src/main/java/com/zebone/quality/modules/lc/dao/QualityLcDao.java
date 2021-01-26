/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.lc.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.lc.entity.QualityLc;

/**
 * LC肺癌（手术治疗）DAO接口
 * @author 卡卡西
 * @version 2021-01-21
 */
@MyBatisDao
public interface QualityLcDao extends CrudDao<QualityLc> {
	
}