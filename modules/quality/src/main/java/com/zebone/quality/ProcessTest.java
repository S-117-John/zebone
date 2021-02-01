package com.zebone.quality;

import com.jeesite.modules.sys.utils.UserUtils;
import org.flowable.engine.ProcessEngine;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/peocess")
public class ProcessTest {


    @Autowired
    private TaskService taskService;



    /**
     * 获取审批管理列表
     */
    @RequestMapping(value = "/list")

    public Object list(String userId) {
        List<Task> tasks = taskService.createTaskQuery().taskAssignee("review").orderByTaskCreateTime().desc().list();
        for (Task task : tasks) {
            System.out.println(task.toString());

        }
        return tasks.toArray().toString();
    }
}
