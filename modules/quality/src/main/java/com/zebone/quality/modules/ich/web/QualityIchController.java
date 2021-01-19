/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.ich.web;

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
import com.zebone.quality.modules.ich.entity.QualityIch;
import com.zebone.quality.modules.ich.service.QualityIchService;

/**
 * ICH脑出血Controller
 * @author 卡卡西
 * @version 2021-01-18
 */
@Controller
@RequestMapping(value = "${adminPath}/ich/qualityIch")
public class QualityIchController extends BaseController {

	@Autowired
	private QualityIchService qualityIchService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityIch get(String id, boolean isNewRecord) {
		return qualityIchService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("ich:qualityIch:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityIch qualityIch, Model model) {
		model.addAttribute("qualityIch", qualityIch);
		return "modules/ich/qualityIchList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("ich:qualityIch:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityIch> listData(QualityIch qualityIch, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityIch> page = qualityIchService.findPage(new Page<QualityIch>(request, response), qualityIch); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("ich:qualityIch:view")
	@RequestMapping(value = "form")
	public String form(QualityIch qualityIch, Model model) {
		model.addAttribute("qualityIch", qualityIch);
		return "modules/ich/qualityIchForm";
	}

	/**
	 * 保存ICH脑出血
	 */
	@RequiresPermissions("ich:qualityIch:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityIch qualityIch) {
		qualityIchService.save(qualityIch);
		return renderResult(Global.TRUE, text("保存ICH脑出血成功！"));
	}
	
	/**
	 * 停用ICH脑出血
	 */
	@RequiresPermissions("ich:qualityIch:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityIch qualityIch) {
		qualityIch.setStatus(QualityIch.STATUS_DISABLE);
		qualityIchService.updateStatus(qualityIch);
		return renderResult(Global.TRUE, text("停用ICH脑出血成功"));
	}
	
	/**
	 * 启用ICH脑出血
	 */
	@RequiresPermissions("ich:qualityIch:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityIch qualityIch) {
		qualityIch.setStatus(QualityIch.STATUS_NORMAL);
		qualityIchService.updateStatus(qualityIch);
		return renderResult(Global.TRUE, text("启用ICH脑出血成功"));
	}
	
	/**
	 * 删除ICH脑出血
	 */
	@RequiresPermissions("ich:qualityIch:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityIch qualityIch) {
		qualityIchService.delete(qualityIch);
		return renderResult(Global.TRUE, text("删除ICH脑出血成功！"));
	}
	
}