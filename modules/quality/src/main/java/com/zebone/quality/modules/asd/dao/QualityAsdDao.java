/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.asd.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.asd.entity.QualityAsd;

/**
 * ASD房间隔缺损手术DAO接口
 * @author 卡卡西
 * @version 2021-02-19
 */
@MyBatisDao
public interface QualityAsdDao extends CrudDao<QualityAsd> {
	
}