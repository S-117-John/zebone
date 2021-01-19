/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.aecopd.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.aecopd.entity.QualityAecopd;

/**
 * AECOPD慢性阻塞性肺疾病急性发作（住院）DAO接口
 * @author 卡卡西
 * @version 2021-01-19
 */
@MyBatisDao
public interface QualityAecopdDao extends CrudDao<QualityAecopd> {
	
}