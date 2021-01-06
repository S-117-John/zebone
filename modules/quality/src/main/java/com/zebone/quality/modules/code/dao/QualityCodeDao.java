/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.code.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.code.entity.QualityCode;

/**
 * 编码对照DAO接口
 * @author lijin
 * @version 2021-01-05
 */
@MyBatisDao
public interface QualityCodeDao extends CrudDao<QualityCode> {
	
}