/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.excle.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.excle.entity.QualityExcleDict;

/**
 * 病种数据编码字典DAO接口
 * @author 卡卡西
 * @version 2021-01-15
 */
@MyBatisDao
public interface QualityExcleDictDao extends CrudDao<QualityExcleDict> {
	
}