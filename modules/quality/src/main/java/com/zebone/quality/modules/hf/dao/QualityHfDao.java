/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.hf.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.hf.entity.QualityHf;

import java.util.List;
import java.util.Map;

/**
 * HF心力衰竭DAO接口
 * @author 卡卡西
 * @version 2021-01-28
 */
@MyBatisDao
public interface QualityHfDao extends CrudDao<QualityHf> {

    Map<String,Object> findById(String id);

    List<Map<String,Object>> findListMap(QualityHf qualityHf);

    int updateHf(QualityHf qualityHf);
}