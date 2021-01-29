package com.zebone.quality.common.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 卡卡西
 */
public class CommonBeanUtils {

    public static void StringToArray(Object source,Object target) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Field[] sourceFields=source.getClass().getDeclaredFields();
        Field[] targetFields=target.getClass().getDeclaredFields();
        for(int i=0;i<sourceFields.length;i++){
            String sourceFieldName = sourceFields[i].getName();
            if("serialVersionUID".equals(sourceFieldName)){
                continue;
            }
            for (int i1 = 0; i1 < targetFields.length; i1++) {
                String targetFieldName = targetFields[i1].getName();
                String targetPropClass = targetFields[i1].getGenericType().toString();

                if(sourceFieldName.equals(targetFieldName)&&("java.util.List<java.lang.String>".equals(targetPropClass))){
                    String sourceFirstLetter = sourceFieldName.substring(0, 1).toUpperCase();
                    String sourceGetter = "get" + sourceFirstLetter + sourceFieldName.substring(1);

                    Method sourceMethod = source.getClass().getMethod(sourceGetter, new Class[] {});
                    Object value = sourceMethod.invoke(source, new Object[] {});
                    String targetFirstLetter = targetFieldName.substring(0, 1).toUpperCase();
                    String targetGetter = "set" + targetFirstLetter + targetFieldName.substring(1);
                    Method targetMethod = target.getClass().getMethod(targetGetter, List.class);
                    String sourceValue = (String)value;
                    List<String> list = new ArrayList<>();

                    list = Arrays.asList(sourceValue.split(","));
                    targetMethod.invoke(target,list);
                }
            }


        }

    }


}
