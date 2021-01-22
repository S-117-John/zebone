/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.knee.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.knee.entity.QualityKnee;

/**
 * Knee膝关节置换术DAO接口
 * @author 卡卡西
 * @version 2021-01-22
 */
@MyBatisDao
public interface QualityKneeDao extends CrudDao<QualityKnee> {
	
}