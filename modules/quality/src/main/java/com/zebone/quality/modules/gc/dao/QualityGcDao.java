/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.gc.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.gc.entity.QualityGc;

import java.util.List;
import java.util.Map;

/**
 * quality_gcDAO接口
 * @author 卡卡西
 * @version 2021-02-19
 */
@MyBatisDao
public interface QualityGcDao extends CrudDao<QualityGc> {

    Map<String,Object> findById(String id);

    List<Map<String, Object>> findListMap(QualityGc qualityGc);
}