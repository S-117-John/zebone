package com.zebone.quality.modules.dg.dao;

import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.common.entity.Patient;

import java.util.List;
import java.util.Map;

@MyBatisDao(dataSourceName = "ds2")
public interface QualityDgPatientDao {

    List<Patient> list(Map<String, Object> param);
}
