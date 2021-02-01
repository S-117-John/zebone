package com.zebone.quality.processes;


import com.jeesite.common.entity.Page;
import com.jeesite.common.utils.SpringUtils;
import com.zebone.quality.modules.hf.entity.QualityHf;
import org.apache.commons.collections.MapUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.flowable.engine.ProcessEngine;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "${adminPath}/process")
public class ProcessController {

    @Autowired
    private TaskService taskService;

    /**
     * 查询列表
     */
    @RequestMapping(value = {"list", ""})
    public String list(Model model) {

        return "processes/processesList";
    }


    /**
     * 获取审批管理列表
     */
    @RequestMapping(value = "/listData")
    @ResponseBody
    public List<UserTask> list(HttpServletRequest request, HttpServletResponse response) {
        List<Task> tasks = taskService.createTaskQuery().taskAssignee("review").orderByTaskCreateTime().desc().list();

        List<UserTask> userTaskList = new ArrayList<>();

        for (Task task : tasks) {

            UserTask userTask = new UserTask();
            userTask.setProcessInstanceId(task.getProcessInstanceId());
            userTask.setFormKey(task.getFormKey());
            userTask.setTaskId(task.getId());
            userTaskList.add(userTask);

            Map<String, Object> map = taskService.getVariables(task.getId());

            System.out.println(map);
        }
        return userTaskList;
    }

    private static Map<String,Object> mapForm;

    private static Map<String,Object> beanMap;

    static {
        mapForm = new HashMap<>(16);
        mapForm.put("hf","redirect:/a/hf/qualityHf/view");

    }




    /**
     * 审核表单
     */
    @RequestMapping(value = "view")
    public String viewForm(String taskId, Model model) {
        Map<String, Object> map = taskService.getVariables(taskId);
        String returnForm = (String) mapForm.get(MapUtils.getString(map,"formName"));
        String formId = MapUtils.getString(map,"formId");
        return returnForm+"?id="+formId+"&taskId="+taskId;
    }


    @RequestMapping(value = "review")
    @ResponseBody
    public String review(String taskId,boolean approve){
        Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
        if (task == null) {
            return "流程不存在";
        }
        //通过审核
        HashMap<String, Object> map = new HashMap<>(16);
        map.put("approve", true);
        taskService.complete(taskId, map);
        return "流程审核通过！";
    }
}
