package com.zebone.common.utils;

import java.lang.reflect.Field;

/**
 * @author 刘旋
 * @date 2021/05/31 10:22
 **/
public class ClassUtil {
    /**
     * 判断一个类的所有属性是否为null
     * 不为null返回false
     */
    public static boolean isAllFieldNull(Object obj) throws Exception{
        Class stuCla = (Class) obj.getClass();
        Field[] fs = stuCla.getDeclaredFields();
        boolean flag = true;
        for (Field f : fs) {
            f.setAccessible(true);
            Object val = f.get(obj);
            if(val!=null&&val!="") {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
