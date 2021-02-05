/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.af.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.af.entity.QualityAf;

/**
 * AF房颤DAO接口
 * @author kakaxi
 * @version 2021-02-03
 */
@MyBatisDao
public interface QualityAfDao extends CrudDao<QualityAf> {
	
}