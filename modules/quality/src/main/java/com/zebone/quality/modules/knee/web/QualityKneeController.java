/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.knee.web;

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
import com.zebone.quality.modules.knee.entity.QualityKnee;
import com.zebone.quality.modules.knee.service.QualityKneeService;

/**
 * Knee膝关节置换术Controller
 * @author 卡卡西
 * @version 2021-01-22
 */
@Controller
@RequestMapping(value = "${adminPath}/knee/qualityKnee")
public class QualityKneeController extends BaseController {

	@Autowired
	private QualityKneeService qualityKneeService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityKnee get(String id, boolean isNewRecord) {
		return qualityKneeService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("knee:qualityKnee:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityKnee qualityKnee, Model model) {
		model.addAttribute("qualityKnee", qualityKnee);
		return "modules/knee/qualityKneeList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("knee:qualityKnee:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityKnee> listData(QualityKnee qualityKnee, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityKnee> page = qualityKneeService.findPage(new Page<QualityKnee>(request, response), qualityKnee); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("knee:qualityKnee:view")
	@RequestMapping(value = "form")
	public String form(QualityKnee qualityKnee, Model model) {
		model.addAttribute("qualityKnee", qualityKnee);
		return "modules/knee/qualityKneeForm";
	}

	/**
	 * 保存Knee膝关节置换术
	 */
	@RequiresPermissions("knee:qualityKnee:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityKnee qualityKnee) {
		qualityKneeService.save(qualityKnee);
		return renderResult(Global.TRUE, text("保存Knee膝关节置换术成功！"));
	}
	
	/**
	 * 停用Knee膝关节置换术
	 */
	@RequiresPermissions("knee:qualityKnee:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityKnee qualityKnee) {
		qualityKnee.setStatus(QualityKnee.STATUS_DISABLE);
		qualityKneeService.updateStatus(qualityKnee);
		return renderResult(Global.TRUE, text("停用Knee膝关节置换术成功"));
	}
	
	/**
	 * 启用Knee膝关节置换术
	 */
	@RequiresPermissions("knee:qualityKnee:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityKnee qualityKnee) {
		qualityKnee.setStatus(QualityKnee.STATUS_NORMAL);
		qualityKneeService.updateStatus(qualityKnee);
		return renderResult(Global.TRUE, text("启用Knee膝关节置换术成功"));
	}
	
	/**
	 * 删除Knee膝关节置换术
	 */
	@RequiresPermissions("knee:qualityKnee:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityKnee qualityKnee) {
		qualityKneeService.delete(qualityKnee);
		return renderResult(Global.TRUE, text("删除Knee膝关节置换术成功！"));
	}
	
}