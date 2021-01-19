/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.stk.web;

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
import com.zebone.quality.modules.stk.entity.QualityStk;
import com.zebone.quality.modules.stk.service.QualityStkService;

/**
 * STK脑梗死（首次住院）Controller
 * @author 卡卡西
 * @version 2021-01-15
 */
@Controller
@RequestMapping(value = "${adminPath}/stk/qualityStk")
public class QualityStkController extends BaseController {

	@Autowired
	private QualityStkService qualityStkService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityStk get(String id, boolean isNewRecord) {
		return qualityStkService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("stk:qualityStk:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityStk qualityStk, Model model) {
		model.addAttribute("qualityStk", qualityStk);
		return "modules/stk/qualityStkList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("stk:qualityStk:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityStk> listData(QualityStk qualityStk, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityStk> page = qualityStkService.findPage(new Page<QualityStk>(request, response), qualityStk); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("stk:qualityStk:view")
	@RequestMapping(value = "form")
	public String form(QualityStk qualityStk, Model model) {
		model.addAttribute("qualityStk", qualityStk);
		return "modules/stk/qualityStkForm";
	}

	/**
	 * 保存STK脑梗死（首次住院）
	 */
	@RequiresPermissions("stk:qualityStk:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityStk qualityStk) {
		qualityStkService.save(qualityStk);
		return renderResult(Global.TRUE, text("保存STK脑梗死（首次住院）成功！"));
	}
	
	/**
	 * 停用STK脑梗死（首次住院）
	 */
	@RequiresPermissions("stk:qualityStk:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityStk qualityStk) {
		qualityStk.setStatus(QualityStk.STATUS_DISABLE);
		qualityStkService.updateStatus(qualityStk);
		return renderResult(Global.TRUE, text("停用STK脑梗死（首次住院）成功"));
	}
	
	/**
	 * 启用STK脑梗死（首次住院）
	 */
	@RequiresPermissions("stk:qualityStk:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityStk qualityStk) {
		qualityStk.setStatus(QualityStk.STATUS_NORMAL);
		qualityStkService.updateStatus(qualityStk);
		return renderResult(Global.TRUE, text("启用STK脑梗死（首次住院）成功"));
	}
	
	/**
	 * 删除STK脑梗死（首次住院）
	 */
	@RequiresPermissions("stk:qualityStk:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityStk qualityStk) {
		qualityStkService.delete(qualityStk);
		return renderResult(Global.TRUE, text("删除STK脑梗死（首次住院）成功！"));
	}
	
}