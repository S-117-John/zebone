/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.bc.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.bc.entity.QualityBc;

/**
 * BC乳腺癌（手术治疗）DAO接口
 * @author 卡卡西
 * @version 2021-01-20
 */
@MyBatisDao
public interface QualityBcDao extends CrudDao<QualityBc> {
	
}