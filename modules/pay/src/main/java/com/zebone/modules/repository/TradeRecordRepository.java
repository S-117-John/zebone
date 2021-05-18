package com.zebone.modules.repository;

import com.zebone.modules.entity.TradeRecordDO;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TradeRecordRepository extends JpaRepository<TradeRecordDO,String> {

    List<TradeRecordDO> findAll(Specification<TradeRecordDO> specification);

    TradeRecordDO findByTradeNoAndTradeStatus(String tradeNo,String tradeStatus);
}
