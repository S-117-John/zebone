package com.zebone.modules.repository;

import com.zebone.modules.entity.ApiLogDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApiLogRepository extends JpaRepository<ApiLogDO,String> {
}
