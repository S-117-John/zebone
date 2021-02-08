/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.cs.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.cs.entity.QualityCs;

import java.util.List;
import java.util.Map;

/**
 * cs剖宫产DAO接口
 * @author 卡卡西
 * @version 2021-02-05
 */
@MyBatisDao
public interface QualityCsDao extends CrudDao<QualityCs> {

    Map<String,Object> findById(String id);

    List<Map<String, Object>> findListMap(QualityCs qualityCs);
}