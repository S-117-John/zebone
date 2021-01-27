/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.stemi.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.stemi.entity.QualityStemi;

/**
 * STEMI急性心肌梗死（ST 段抬高型，首次住院）DAO接口
 * @author lijin
 * @version 2021-01-27
 */
@MyBatisDao
public interface QualityStemiDao extends CrudDao<QualityStemi> {
	
}