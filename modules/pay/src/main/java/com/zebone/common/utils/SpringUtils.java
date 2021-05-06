package com.zebone.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author 卡卡西
 */
public class SpringUtils{

    private static Logger logger = LoggerFactory.getLogger(SpringUtils.class);
    private static ApplicationContext applicationContext;

    public static <T> T getBean(String name) {

        return (T) SpringUtils.applicationContext.getBean(name);
    }

    public static <T> T getBean(Class<T> requiredType) {
        return SpringUtils.applicationContext.getBean(requiredType);
    }

    public static ApplicationContext getApplicationContext() {
        return SpringUtils.applicationContext;
    }


    public static void setApplicationContext(ApplicationContext applicationContext){
        SpringUtils.applicationContext = applicationContext;
    }
}
