package com.zebone.modules.repository;

import com.zebone.modules.entity.TradeRecordDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TradeRecordRepository extends JpaRepository<TradeRecordDO,String> {
}
