package com.zebone.quality.modules.um.dao;

import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.common.entity.Patient;

import java.util.List;
import java.util.Map;

@MyBatisDao(dataSourceName = "ds2")
public interface QualityUmPatientDao {

    List<Patient> list(Map<String, Object> param);
}
