/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.pd.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.pd.entity.QualityPd;

/**
 * PD帕金森病DAO接口
 * @author 卡卡西
 * @version 2021-01-16
 */
@MyBatisDao
public interface QualityPdDao extends CrudDao<QualityPd> {
	
}