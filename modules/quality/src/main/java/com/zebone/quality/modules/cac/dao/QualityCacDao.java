/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.cac.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.cac.entity.QualityCac;

/**
 * CAC哮喘（成人，急性发作，住院）DAO接口
 * @author 卡卡西
 * @version 2021-02-07
 */
@MyBatisDao
public interface QualityCacDao extends CrudDao<QualityCac> {
	
}