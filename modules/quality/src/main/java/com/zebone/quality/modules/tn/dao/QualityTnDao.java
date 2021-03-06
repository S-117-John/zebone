/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.tn.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.tn.entity.QualityTn;

/**
 * TN甲状腺结节（手术治疗）DAO接口
 * @author 卡卡西
 * @version 2021-02-19
 */
@MyBatisDao
public interface QualityTnDao extends CrudDao<QualityTn> {
	
}