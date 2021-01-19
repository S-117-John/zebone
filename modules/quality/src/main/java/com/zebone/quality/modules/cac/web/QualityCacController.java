/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.cac.web;

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
import com.zebone.quality.modules.cac.entity.QualityCac;
import com.zebone.quality.modules.cac.service.QualityCacService;

/**
 * quality_cacController
 * @author 卡卡西
 * @version 2021-01-19
 */
@Controller
@RequestMapping(value = "${adminPath}/cac/qualityCac")
public class QualityCacController extends BaseController {

	@Autowired
	private QualityCacService qualityCacService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityCac get(String id, boolean isNewRecord) {
		return qualityCacService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("cac:qualityCac:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityCac qualityCac, Model model) {
		model.addAttribute("qualityCac", qualityCac);
		return "modules/cac/qualityCacList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("cac:qualityCac:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityCac> listData(QualityCac qualityCac, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityCac> page = qualityCacService.findPage(new Page<QualityCac>(request, response), qualityCac); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("cac:qualityCac:view")
	@RequestMapping(value = "form")
	public String form(QualityCac qualityCac, Model model) {
		model.addAttribute("qualityCac", qualityCac);
		return "modules/cac/qualityCacForm";
	}

	/**
	 * 保存CAC哮喘（成人，急性发作，住院）
	 */
	@RequiresPermissions("cac:qualityCac:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityCac qualityCac) {
		qualityCacService.save(qualityCac);
		return renderResult(Global.TRUE, text("保存CAC哮喘（成人，急性发作，住院）成功！"));
	}
	
	/**
	 * 停用CAC哮喘（成人，急性发作，住院）
	 */
	@RequiresPermissions("cac:qualityCac:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityCac qualityCac) {
		qualityCac.setStatus(QualityCac.STATUS_DISABLE);
		qualityCacService.updateStatus(qualityCac);
		return renderResult(Global.TRUE, text("停用CAC哮喘（成人，急性发作，住院）成功"));
	}
	
	/**
	 * 启用CAC哮喘（成人，急性发作，住院）
	 */
	@RequiresPermissions("cac:qualityCac:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityCac qualityCac) {
		qualityCac.setStatus(QualityCac.STATUS_NORMAL);
		qualityCacService.updateStatus(qualityCac);
		return renderResult(Global.TRUE, text("启用CAC哮喘（成人，急性发作，住院）成功"));
	}
	
	/**
	 * 删除CAC哮喘（成人，急性发作，住院）
	 */
	@RequiresPermissions("cac:qualityCac:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityCac qualityCac) {
		qualityCacService.delete(qualityCac);
		return renderResult(Global.TRUE, text("删除CAC哮喘（成人，急性发作，住院）成功！"));
	}
	
}