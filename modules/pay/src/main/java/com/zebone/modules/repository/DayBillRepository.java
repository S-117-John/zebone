package com.zebone.modules.repository;

import com.zebone.modules.entity.DayBillDO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DayBillRepository extends JpaRepository<DayBillDO,String> {

    List<DayBillDO> findByAppId(String appId);
}
