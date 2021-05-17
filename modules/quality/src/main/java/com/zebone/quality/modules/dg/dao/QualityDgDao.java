/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.dg.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.dg.entity.QualityDg;

import java.util.List;
import java.util.Map;

/**
 * DG异位妊娠（手术治疗）DAO接口
 * @author 卡卡西
 * @version 2021-01-22
 */
@MyBatisDao
public interface QualityDgDao extends CrudDao<QualityDg> {

    Map<String,Object> findById(String id);

    List<Map<String, Object>> findListMap(QualityDg qualityDg);
}