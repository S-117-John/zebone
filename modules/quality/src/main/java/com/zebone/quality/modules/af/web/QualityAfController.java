/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.af.web;

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
import com.zebone.quality.modules.af.entity.QualityAf;
import com.zebone.quality.modules.af.service.QualityAfService;

/**
 * AF房颤Controller
 * @author kakaxi
 * @version 2021-01-14
 */
@Controller
@RequestMapping(value = "${adminPath}/af/qualityAf")
public class QualityAfController extends BaseController {

	@Autowired
	private QualityAfService qualityAfService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityAf get(String id, boolean isNewRecord) {
		return qualityAfService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("af:qualityAf:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityAf qualityAf, Model model) {
		model.addAttribute("qualityAf", qualityAf);
		return "modules/af/qualityAfList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("af:qualityAf:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityAf> listData(QualityAf qualityAf, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityAf> page = qualityAfService.findPage(new Page<QualityAf>(request, response), qualityAf); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("af:qualityAf:view")
	@RequestMapping(value = "form")
	public String form(QualityAf qualityAf, Model model) {
		model.addAttribute("qualityAf", qualityAf);
		return "modules/af/qualityAfForm";
	}

	/**
	 * 保存AF房颤
	 */
	@RequiresPermissions("af:qualityAf:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityAf qualityAf) {
		qualityAfService.save(qualityAf);
		return renderResult(Global.TRUE, text("保存AF房颤成功！"));
	}
	
	/**
	 * 停用AF房颤
	 */
	@RequiresPermissions("af:qualityAf:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityAf qualityAf) {
		qualityAf.setStatus(QualityAf.STATUS_DISABLE);
		qualityAfService.updateStatus(qualityAf);
		return renderResult(Global.TRUE, text("停用AF房颤成功"));
	}
	
	/**
	 * 启用AF房颤
	 */
	@RequiresPermissions("af:qualityAf:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityAf qualityAf) {
		qualityAf.setStatus(QualityAf.STATUS_NORMAL);
		qualityAfService.updateStatus(qualityAf);
		return renderResult(Global.TRUE, text("启用AF房颤成功"));
	}
	
	/**
	 * 删除AF房颤
	 */
	@RequiresPermissions("af:qualityAf:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityAf qualityAf) {
		qualityAfService.delete(qualityAf);
		return renderResult(Global.TRUE, text("删除AF房颤成功！"));
	}
	
}