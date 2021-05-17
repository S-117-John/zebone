/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.um.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.um.entity.QualityUm;

import java.util.List;
import java.util.Map;

/**
 * UM子宫肌瘤（手术治疗）DAO接口
 * @author 卡卡西
 * @version 2021-02-06
 */
@MyBatisDao
public interface QualityUmDao extends CrudDao<QualityUm> {

    Map<String,Object> findById(String id);

    List<Map<String, Object>> findListMap(QualityUm qualityUm);
	
}