package com.zebone.payment.repository;

import com.zebone.payment.entity.WxConfigDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WxConfigRepository extends JpaRepository<WxConfigDO,String> {

    WxConfigDO findByAppId(String appId);
}
