package com.zebone.quality.modules.emr.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.modules.emr.entity.EmrData;

import java.util.List;
import java.util.Map;

@MyBatisDao(dataSourceName="ds2")
public interface EmrDataDao extends CrudDao<EmrData> {

    List<EmrData> getCaesareanSectionData(String caseId);

    List<Map<String,Object>> getCommonData(String caseId);

    List<Map<String,Object>> chargeList(String pkPage);

}
