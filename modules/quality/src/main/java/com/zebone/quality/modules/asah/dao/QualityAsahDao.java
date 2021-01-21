/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.asah.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.asah.entity.QualityAsah;

/**
 * aSAH急性动脉瘤性蛛网膜下腔出血（初发，手术治疗）DAO接口
 * @author 卡卡西
 * @version 2021-01-21
 */
@MyBatisDao
public interface QualityAsahDao extends CrudDao<QualityAsah> {
	
}