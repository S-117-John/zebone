package com.zebone.common;

import com.jeesite.common.idgen.IdWorker;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

/**
 * @author 卡卡西
 */
public class SnowflakeId implements IdentifierGenerator {

    private static com.jeesite.common.idgen.IdWorker idWorker = new IdWorker(-1, -1);

    @Override
    public Serializable generate(SessionImplementor sessionImplementor, Object o) throws HibernateException {
        return idWorker.nextId();
    }
}
