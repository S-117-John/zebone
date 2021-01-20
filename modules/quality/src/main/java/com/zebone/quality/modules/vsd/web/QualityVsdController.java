/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.vsd.web;

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
import com.zebone.quality.modules.vsd.entity.QualityVsd;
import com.zebone.quality.modules.vsd.service.QualityVsdService;

/**
 * VSD室间隔缺损手术Controller
 * @author 卡卡西
 * @version 2021-01-20
 */
@Controller
@RequestMapping(value = "${adminPath}/vsd/qualityVsd")
public class QualityVsdController extends BaseController {

	@Autowired
	private QualityVsdService qualityVsdService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityVsd get(String id, boolean isNewRecord) {
		return qualityVsdService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("vsd:qualityVsd:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityVsd qualityVsd, Model model) {
		model.addAttribute("qualityVsd", qualityVsd);
		return "modules/vsd/qualityVsdList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("vsd:qualityVsd:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityVsd> listData(QualityVsd qualityVsd, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityVsd> page = qualityVsdService.findPage(new Page<QualityVsd>(request, response), qualityVsd); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("vsd:qualityVsd:view")
	@RequestMapping(value = "form")
	public String form(QualityVsd qualityVsd, Model model) {
		model.addAttribute("qualityVsd", qualityVsd);
		return "modules/vsd/qualityVsdForm";
	}

	/**
	 * 保存VSD室间隔缺损手术
	 */
	@RequiresPermissions("vsd:qualityVsd:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityVsd qualityVsd) {
		qualityVsdService.save(qualityVsd);
		return renderResult(Global.TRUE, text("保存VSD室间隔缺损手术成功！"));
	}
	
	/**
	 * 停用VSD室间隔缺损手术
	 */
	@RequiresPermissions("vsd:qualityVsd:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityVsd qualityVsd) {
		qualityVsd.setStatus(QualityVsd.STATUS_DISABLE);
		qualityVsdService.updateStatus(qualityVsd);
		return renderResult(Global.TRUE, text("停用VSD室间隔缺损手术成功"));
	}
	
	/**
	 * 启用VSD室间隔缺损手术
	 */
	@RequiresPermissions("vsd:qualityVsd:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityVsd qualityVsd) {
		qualityVsd.setStatus(QualityVsd.STATUS_NORMAL);
		qualityVsdService.updateStatus(qualityVsd);
		return renderResult(Global.TRUE, text("启用VSD室间隔缺损手术成功"));
	}
	
	/**
	 * 删除VSD室间隔缺损手术
	 */
	@RequiresPermissions("vsd:qualityVsd:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityVsd qualityVsd) {
		qualityVsdService.delete(qualityVsd);
		return renderResult(Global.TRUE, text("删除VSD室间隔缺损手术成功！"));
	}
	
}