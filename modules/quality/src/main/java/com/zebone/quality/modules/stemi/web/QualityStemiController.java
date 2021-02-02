/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.stemi.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import com.zebone.quality.common.utils.TaskUtil;
import com.zebone.quality.domain.UploadService;
import com.zebone.quality.modules.common.UploadResult;
import com.zebone.quality.modules.stemi.entity.Stemi;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.jeesite.common.config.Global;
import com.jeesite.common.entity.Page;
import com.jeesite.common.web.BaseController;
import com.zebone.quality.modules.stemi.entity.QualityStemi;
import com.zebone.quality.modules.stemi.service.QualityStemiService;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * STEMI急性心肌梗死（ST 段抬高型，首次住院）Controller
 * @author lijin
 * @version 2021-01-28
 */
@Controller
@RequestMapping(value = "${adminPath}/stemi/qualityStemi")
public class QualityStemiController extends BaseController {

	@Autowired
	private QualityStemiService qualityStemiService;
	@Autowired
	private UploadService uploadService;
	@Autowired
	private TaskService taskService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityStemi get(String id, boolean isNewRecord)  throws InvocationTargetException, IllegalAccessException {
        if(!StringUtils.isEmpty(id)&&!isNewRecord){
            Map<String,Object> result = qualityStemiService.findById(id);
            QualityStemi qualityStemi = new QualityStemi();
            BeanUtils.populate(qualityStemi,result);
            return qualityStemi;
        }else {
			QualityStemi qualityStemi = new QualityStemi();
			qualityStemi =qualityStemiService.get(id, isNewRecord);
            return qualityStemi;
        }
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("stemi:qualityStemi:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityStemi qualityStemi, Model model) {
		model.addAttribute("qualityStemi", qualityStemi);
		return "modules/stemi/qualityStemiList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("stemi:qualityStemi:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityStemi> listData(QualityStemi qualityStemi, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityStemi> page = qualityStemiService.findPage(new Page<QualityStemi>(request, response), qualityStemi); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("stemi:qualityStemi:view")
	@RequestMapping(value = "form")
	public String form(QualityStemi qualityStemi, Model model) {
		model.addAttribute("qualityStemi", qualityStemi);
		return "modules/stemi/qualityStemiForm";
	}

	/**
	 * 查看审核表单
	 */
	@RequiresPermissions("stemi:qualityStemi:view")
	@RequestMapping(value = "view")
	public String viewForm(String id,String taskId, Model model) throws InvocationTargetException, IllegalAccessException{
		Map<String,Object> result = qualityStemiService.findById(id);
		QualityStemi qualityStemi = new QualityStemi();
		BeanUtils.populate(qualityStemi,result);
		model.addAttribute("qualityStemi", qualityStemi);
		model.addAttribute("taskId",taskId);
		return "modules/stemi/qualityStemiViewForm";
	}

	/**
	 * 保存STEMI急性心肌梗死（ST 段抬高型，首次住院）
	 */
	@RequiresPermissions("stemi:qualityStemi:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityStemi qualityStemi) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

		if(qualityStemi.getIsNewRecord()){
			qualityStemiService.save(qualityStemi);
			TaskUtil.startTask("stemi",qualityStemi.getId());
		}else{
			qualityStemiService.save(qualityStemi);
		}

		String result = uploadService.upload(qualityStemi,new Stemi(),"STEMI");
		Gson gson = new Gson();
		UploadResult uploadResult = gson.fromJson(result, UploadResult.class);
		Integer resultCode = Optional.ofNullable(uploadResult).map(a->a.getCode()).orElse(null);
		if(resultCode==1000){
			String errorMessage = Optional.ofNullable(uploadResult).map(a->a.getMessage()).orElse("上传失败");
			return renderResult(Global.FALSE, text(errorMessage));
		}

		return renderResult(Global.TRUE, text("保存STEMI急性心肌梗死（ST 段抬高型，首次住院）成功！"));
	}
	
	/**
	 * 停用STEMI急性心肌梗死（ST 段抬高型，首次住院）
	 */
	@RequiresPermissions("stemi:qualityStemi:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityStemi qualityStemi) {
		qualityStemi.setStatus(QualityStemi.STATUS_DISABLE);
		qualityStemiService.updateStatus(qualityStemi);
		return renderResult(Global.TRUE, text("停用STEMI急性心肌梗死（ST 段抬高型，首次住院）成功"));
	}
	
	/**
	 * 启用STEMI急性心肌梗死（ST 段抬高型，首次住院）
	 */
	@RequiresPermissions("stemi:qualityStemi:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityStemi qualityStemi) {
		qualityStemi.setStatus(QualityStemi.STATUS_NORMAL);
		qualityStemiService.updateStatus(qualityStemi);
		return renderResult(Global.TRUE, text("启用STEMI急性心肌梗死（ST 段抬高型，首次住院）成功"));
	}
	
	/**
	 * 删除STEMI急性心肌梗死（ST 段抬高型，首次住院）
	 */
	@RequiresPermissions("stemi:qualityStemi:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityStemi qualityStemi) {
		qualityStemiService.delete(qualityStemi);
		return renderResult(Global.TRUE, text("删除STEMI急性心肌梗死（ST 段抬高型，首次住院）成功！"));
	}

	@RequiresPermissions("stemi:qualityStemi:edit")
	@PostMapping(value = "review")
	@ResponseBody
	public String review(QualityStemi qualityStemi,String taskId) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

		Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
		if (task == null) {
			return renderResult(Global.FALSE, text("流程不存在"));
		}
		//通过审核
		HashMap<String, Object> map = new HashMap<>(16);
		map.put("approve", true);
		taskService.complete(taskId, map);

		String result = uploadService.upload(qualityStemi,new Stemi(),"STEMI");
		Gson gson = new Gson();
		UploadResult uploadResult = gson.fromJson(result, UploadResult.class);
		Integer resultCode = Optional.ofNullable(uploadResult).map(a->a.getCode()).orElse(null);
		if(resultCode==1000){
			String errorMessage = Optional.ofNullable(uploadResult).map(a->a.getMessage()).orElse("上传失败");
			return renderResult(Global.FALSE, text(errorMessage));
		}

		return renderResult(Global.TRUE, text("流程审核通过！"));
	}
}