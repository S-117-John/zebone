/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.pip.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.pip.entity.QualityPip;

/**
 * PIP围手术期预防感染DAO接口
 * @author 卡卡西
 * @version 2021-02-20
 */
@MyBatisDao
public interface QualityPipDao extends CrudDao<QualityPip> {
	
}