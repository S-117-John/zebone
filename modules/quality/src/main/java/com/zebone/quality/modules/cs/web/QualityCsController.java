/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.cs.web;

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
import com.zebone.quality.modules.cs.entity.QualityCs;
import com.zebone.quality.modules.cs.service.QualityCsService;

/**
 * cs剖宫产Controller
 * @author 卡卡西
 * @version 2021-02-05
 */
@Controller
@RequestMapping(value = "${adminPath}/cs/qualityCs")
public class QualityCsController extends BaseController {

	@Autowired
	private QualityCsService qualityCsService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityCs get(String id, boolean isNewRecord) {
		return qualityCsService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("cs:qualityCs:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityCs qualityCs, Model model) {
		model.addAttribute("qualityCs", qualityCs);
		return "modules/cs/qualityCsList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("cs:qualityCs:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityCs> listData(QualityCs qualityCs, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityCs> page = qualityCsService.findPage(new Page<QualityCs>(request, response), qualityCs); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("cs:qualityCs:view")
	@RequestMapping(value = "form")
	public String form(QualityCs qualityCs, Model model) {
		model.addAttribute("qualityCs", qualityCs);
		return "modules/cs/qualityCsForm";
	}

	/**
	 * 保存cs剖宫产
	 */
	@RequiresPermissions("cs:qualityCs:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityCs qualityCs) {
		qualityCsService.save(qualityCs);
		return renderResult(Global.TRUE, text("保存cs剖宫产成功！"));
	}
	
	/**
	 * 停用cs剖宫产
	 */
	@RequiresPermissions("cs:qualityCs:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityCs qualityCs) {
		qualityCs.setStatus(QualityCs.STATUS_DISABLE);
		qualityCsService.updateStatus(qualityCs);
		return renderResult(Global.TRUE, text("停用cs剖宫产成功"));
	}
	
	/**
	 * 启用cs剖宫产
	 */
	@RequiresPermissions("cs:qualityCs:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityCs qualityCs) {
		qualityCs.setStatus(QualityCs.STATUS_NORMAL);
		qualityCsService.updateStatus(qualityCs);
		return renderResult(Global.TRUE, text("启用cs剖宫产成功"));
	}
	
	/**
	 * 删除cs剖宫产
	 */
	@RequiresPermissions("cs:qualityCs:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityCs qualityCs) {
		qualityCsService.delete(qualityCs);
		return renderResult(Global.TRUE, text("删除cs剖宫产成功！"));
	}
	
}