/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.stemi.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityStemi get(String id, boolean isNewRecord) {
		return qualityStemiService.get(id, isNewRecord);
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
	 * 保存STEMI急性心肌梗死（ST 段抬高型，首次住院）
	 */
	@RequiresPermissions("stemi:qualityStemi:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityStemi qualityStemi) {
		qualityStemiService.save(qualityStemi);
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
	
}