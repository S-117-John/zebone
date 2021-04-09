package com.zebone.quality.modules.cs.dao;

import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.quality.common.entity.Patient;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@MyBatisDao(dataSourceName = "ds2")
public interface QualityCsPatientDao {

    List<Patient> list(Map<String,Object> param);
}
