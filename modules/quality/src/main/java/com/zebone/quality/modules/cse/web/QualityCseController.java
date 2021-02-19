/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.cse.web;

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
import com.zebone.quality.modules.cse.entity.QualityCse;
import com.zebone.quality.modules.cse.service.QualityCseService;

/**
 * CSE惊厥性癫痫持续状态Controller
 * @author 卡卡西
 * @version 2021-02-19
 */
@Controller
@RequestMapping(value = "${adminPath}/cse/qualityCse")
public class QualityCseController extends BaseController {

	@Autowired
	private QualityCseService qualityCseService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityCse get(String id, boolean isNewRecord) {
		return qualityCseService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("cse:qualityCse:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityCse qualityCse, Model model) {
		model.addAttribute("qualityCse", qualityCse);
		return "modules/cse/qualityCseList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("cse:qualityCse:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityCse> listData(QualityCse qualityCse, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityCse> page = qualityCseService.findPage(new Page<QualityCse>(request, response), qualityCse); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("cse:qualityCse:view")
	@RequestMapping(value = "form")
	public String form(QualityCse qualityCse, Model model) {
		model.addAttribute("qualityCse", qualityCse);
		return "modules/cse/qualityCseForm";
	}

	/**
	 * 保存CSE惊厥性癫痫持续状态
	 */
	@RequiresPermissions("cse:qualityCse:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityCse qualityCse) {
		qualityCseService.save(qualityCse);
		return renderResult(Global.TRUE, text("保存CSE惊厥性癫痫持续状态成功！"));
	}
	
	/**
	 * 停用CSE惊厥性癫痫持续状态
	 */
	@RequiresPermissions("cse:qualityCse:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityCse qualityCse) {
		qualityCse.setStatus(QualityCse.STATUS_DISABLE);
		qualityCseService.updateStatus(qualityCse);
		return renderResult(Global.TRUE, text("停用CSE惊厥性癫痫持续状态成功"));
	}
	
	/**
	 * 启用CSE惊厥性癫痫持续状态
	 */
	@RequiresPermissions("cse:qualityCse:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityCse qualityCse) {
		qualityCse.setStatus(QualityCse.STATUS_NORMAL);
		qualityCseService.updateStatus(qualityCse);
		return renderResult(Global.TRUE, text("启用CSE惊厥性癫痫持续状态成功"));
	}
	
	/**
	 * 删除CSE惊厥性癫痫持续状态
	 */
	@RequiresPermissions("cse:qualityCse:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityCse qualityCse) {
		qualityCseService.delete(qualityCse);
		return renderResult(Global.TRUE, text("删除CSE惊厥性癫痫持续状态成功！"));
	}
	
}