/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.vsd.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.vsd.entity.QualityVsd;

/**
 * VSD室间隔缺损手术DAO接口
 * @author 卡卡西
 * @version 2021-01-20
 */
@MyBatisDao
public interface QualityVsdDao extends CrudDao<QualityVsd> {
	
}