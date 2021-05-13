package com.zebone.modules.repository;

import com.zebone.modules.entity.MonthBillDO;
import com.zebone.modules.pay.entity.TradeMonthBill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonthBillRepository extends JpaRepository<MonthBillDO,String> {
}
