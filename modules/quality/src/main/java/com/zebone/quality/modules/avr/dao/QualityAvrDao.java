/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.avr.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.avr.entity.QualityAvr;

/**
 * AVR主动脉瓣置换术DAO接口
 * @author 卡卡西
 * @version 2021-02-19
 */
@MyBatisDao
public interface QualityAvrDao extends CrudDao<QualityAvr> {
	
}