package com.zebone.quality.common.utils;

import com.jeesite.common.utils.SpringUtils;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.runtime.ProcessInstance;

import java.util.HashMap;

public class TaskUtil {

    public static void startTask(String formName,String formId){

        HashMap<String, Object> map = new HashMap<>();
        map.put("reviewUserId","review");
        map.put("formName",formName);
        map.put("formId",formId);

        RuntimeService runtimeService = SpringUtils.getBean(RuntimeService.class);
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("upload", map);
    }

}
