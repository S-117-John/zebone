/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.base.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.base.entity.QualityDisease;

/**
 * 病种设置DAO接口
 * @author lijin
 * @version 2021-01-08
 */
@MyBatisDao
public interface QualityDiseaseDao extends CrudDao<QualityDisease> {
	
}