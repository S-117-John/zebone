/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.tc.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.tc.entity.QualityTc;

/**
 * TC甲状腺癌（手术治疗）DAO接口
 * @author 卡卡西
 * @version 2021-02-19
 */
@MyBatisDao
public interface QualityTcDao extends CrudDao<QualityTc> {
	
}