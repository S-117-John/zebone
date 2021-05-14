package com.zebone.modules.repository;

import com.zebone.modules.entity.BillDetailDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailBillRepository extends JpaRepository<BillDetailDO,String> {

    void deleteByBillNo(String billNo);
}
