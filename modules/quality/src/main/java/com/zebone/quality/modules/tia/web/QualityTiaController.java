/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.tia.web;

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
import com.zebone.quality.modules.tia.entity.QualityTia;
import com.zebone.quality.modules.tia.service.QualityTiaService;

/**
 * TIA短暂性脑缺血发作Controller
 * @author 卡卡西
 * @version 2021-02-19
 */
@Controller
@RequestMapping(value = "${adminPath}/tia/qualityTia")
public class QualityTiaController extends BaseController {

	@Autowired
	private QualityTiaService qualityTiaService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityTia get(String id, boolean isNewRecord) {
		return qualityTiaService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("tia:qualityTia:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityTia qualityTia, Model model) {
		model.addAttribute("qualityTia", qualityTia);
		return "modules/tia/qualityTiaList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("tia:qualityTia:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityTia> listData(QualityTia qualityTia, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityTia> page = qualityTiaService.findPage(new Page<QualityTia>(request, response), qualityTia); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("tia:qualityTia:view")
	@RequestMapping(value = "form")
	public String form(QualityTia qualityTia, Model model) {
		model.addAttribute("qualityTia", qualityTia);
		return "modules/tia/qualityTiaForm";
	}

	/**
	 * 保存TIA短暂性脑缺血发作
	 */
	@RequiresPermissions("tia:qualityTia:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityTia qualityTia) {
		qualityTiaService.save(qualityTia);
		return renderResult(Global.TRUE, text("保存TIA短暂性脑缺血发作成功！"));
	}
	
	/**
	 * 停用TIA短暂性脑缺血发作
	 */
	@RequiresPermissions("tia:qualityTia:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityTia qualityTia) {
		qualityTia.setStatus(QualityTia.STATUS_DISABLE);
		qualityTiaService.updateStatus(qualityTia);
		return renderResult(Global.TRUE, text("停用TIA短暂性脑缺血发作成功"));
	}
	
	/**
	 * 启用TIA短暂性脑缺血发作
	 */
	@RequiresPermissions("tia:qualityTia:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityTia qualityTia) {
		qualityTia.setStatus(QualityTia.STATUS_NORMAL);
		qualityTiaService.updateStatus(qualityTia);
		return renderResult(Global.TRUE, text("启用TIA短暂性脑缺血发作成功"));
	}
	
	/**
	 * 删除TIA短暂性脑缺血发作
	 */
	@RequiresPermissions("tia:qualityTia:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityTia qualityTia) {
		qualityTiaService.delete(qualityTia);
		return renderResult(Global.TRUE, text("删除TIA短暂性脑缺血发作成功！"));
	}
	
}