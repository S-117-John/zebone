package com.zebone.modules.api.service;

import com.zebone.common.utils.SpringUtils;
import com.zebone.modules.entity.ApiLogDO;
import com.zebone.modules.repository.ApiLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.persistence.EntityManagerFactory;

/**
 * @author 卡卡西
 */
@Service
public class ApiLogService {

    @Autowired
    private ApiLogRepository repository;

    public void insertLog(ApiLogDO log){
        JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
        EntityManagerFactory entityManagerFactory = SpringUtils.getBean(EntityManagerFactory.class);
        jpaTransactionManager.setEntityManagerFactory(entityManagerFactory);
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);//新发起一个事务
        TransactionStatus status = jpaTransactionManager.getTransaction(def);
        try {

            repository.save(log);
            jpaTransactionManager.commit(status);
        }catch (Exception e){
            jpaTransactionManager.rollback(status);
        }

    }
}
