/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.code.web;

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
import com.zebone.quality.modules.code.entity.QualityCode;
import com.zebone.quality.modules.code.service.QualityCodeService;

/**
 * 编码对照Controller
 * @author lijin
 * @version 2021-01-05
 */
@Controller
@RequestMapping(value = "${adminPath}/code/qualityCode")
public class QualityCodeController extends BaseController {

	@Autowired
	private QualityCodeService qualityCodeService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityCode get(String id, boolean isNewRecord) {
		return qualityCodeService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("code:qualityCode:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityCode qualityCode, Model model) {
		model.addAttribute("qualityCode", qualityCode);
		return "modules/code/qualityCodeList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("code:qualityCode:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityCode> listData(QualityCode qualityCode, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityCode> page = qualityCodeService.findPage(new Page<QualityCode>(request, response), qualityCode); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("code:qualityCode:view")
	@RequestMapping(value = "form")
	public String form(QualityCode qualityCode, Model model) {
		model.addAttribute("qualityCode", qualityCode);
		return "modules/code/qualityCodeForm";
	}

	/**
	 * 保存编码对照
	 */
	@RequiresPermissions("code:qualityCode:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityCode qualityCode) {
		qualityCodeService.save(qualityCode);
		return renderResult(Global.TRUE, text("保存编码对照成功！"));
	}
	
	/**
	 * 停用编码对照
	 */
	@RequiresPermissions("code:qualityCode:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityCode qualityCode) {
		qualityCode.setStatus(QualityCode.STATUS_DISABLE);
		qualityCodeService.updateStatus(qualityCode);
		return renderResult(Global.TRUE, text("停用编码对照成功"));
	}
	
	/**
	 * 启用编码对照
	 */
	@RequiresPermissions("code:qualityCode:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityCode qualityCode) {
		qualityCode.setStatus(QualityCode.STATUS_NORMAL);
		qualityCodeService.updateStatus(qualityCode);
		return renderResult(Global.TRUE, text("启用编码对照成功"));
	}
	
	/**
	 * 删除编码对照
	 */
	@RequiresPermissions("code:qualityCode:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityCode qualityCode) {
		qualityCodeService.delete(qualityCode);
		return renderResult(Global.TRUE, text("删除编码对照成功！"));
	}
	
}