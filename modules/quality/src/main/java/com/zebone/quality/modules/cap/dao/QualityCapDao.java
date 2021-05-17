/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.cap.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.cap.entity.QualityCap;

import java.util.List;
import java.util.Map;

/**
 * Cap社区获得性肺炎（儿童，首次住院）DAO接口
 * @author 卡卡西
 * @version 2021-02-06
 */
@MyBatisDao
public interface QualityCapDao extends CrudDao<QualityCap> {

    Map<String,Object> findById(String id);

    List<Map<String, Object>> findListMap(QualityCap qualityCap);
	
}