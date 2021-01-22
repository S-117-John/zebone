/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.vte.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.vte.entity.QualityVte;

/**
 * VTE中高危风险患者预防静脉血栓栓塞症DAO接口
 * @author 卡卡西
 * @version 2021-01-22
 */
@MyBatisDao
public interface QualityVteDao extends CrudDao<QualityVte> {
	
}