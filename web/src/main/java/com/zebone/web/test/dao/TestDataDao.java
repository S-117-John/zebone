/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.web.test.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.web.test.entity.TestData;

import java.util.List;
import java.util.Map;

/**
 * 测试数据DAO接口
 * @author ThinkGem
 * @version 2018-04-22
 */
@MyBatisDao
public interface TestDataDao extends CrudDao<TestData> {
	
	/**
	 * 演示Map参数和返回值，支持分页
	 */
	public List<Map<String, Object>> findListForMap(Map<String, Object> params);
	
}