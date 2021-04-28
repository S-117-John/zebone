package com.zebone.payment.repository;

import com.zebone.payment.entity.TradeDayBillDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TradeDayBillRepository extends JpaRepository<TradeDayBillDO,String> {
}
