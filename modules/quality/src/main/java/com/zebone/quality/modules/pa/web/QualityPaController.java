/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.pa.web;

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
import com.zebone.quality.modules.pa.entity.QualityPa;
import com.zebone.quality.modules.pa.service.QualityPaService;

/**
 * PA垂体腺瘤（初发，手术治疗）Controller
 * @author 卡卡西
 * @version 2021-01-21
 */
@Controller
@RequestMapping(value = "${adminPath}/pa/qualityPa")
public class QualityPaController extends BaseController {

	@Autowired
	private QualityPaService qualityPaService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityPa get(String id, boolean isNewRecord) {
		return qualityPaService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("pa:qualityPa:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityPa qualityPa, Model model) {
		model.addAttribute("qualityPa", qualityPa);
		return "modules/pa/qualityPaList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("pa:qualityPa:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityPa> listData(QualityPa qualityPa, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityPa> page = qualityPaService.findPage(new Page<QualityPa>(request, response), qualityPa); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("pa:qualityPa:view")
	@RequestMapping(value = "form")
	public String form(QualityPa qualityPa, Model model) {
		model.addAttribute("qualityPa", qualityPa);
		return "modules/pa/qualityPaForm";
	}

	/**
	 * 保存PA垂体腺瘤（初发，手术治疗）
	 */
	@RequiresPermissions("pa:qualityPa:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityPa qualityPa) {
		qualityPaService.save(qualityPa);
		return renderResult(Global.TRUE, text("保存PA垂体腺瘤（初发，手术治疗）成功！"));
	}
	
	/**
	 * 停用PA垂体腺瘤（初发，手术治疗）
	 */
	@RequiresPermissions("pa:qualityPa:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityPa qualityPa) {
		qualityPa.setStatus(QualityPa.STATUS_DISABLE);
		qualityPaService.updateStatus(qualityPa);
		return renderResult(Global.TRUE, text("停用PA垂体腺瘤（初发，手术治疗）成功"));
	}
	
	/**
	 * 启用PA垂体腺瘤（初发，手术治疗）
	 */
	@RequiresPermissions("pa:qualityPa:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityPa qualityPa) {
		qualityPa.setStatus(QualityPa.STATUS_NORMAL);
		qualityPaService.updateStatus(qualityPa);
		return renderResult(Global.TRUE, text("启用PA垂体腺瘤（初发，手术治疗）成功"));
	}
	
	/**
	 * 删除PA垂体腺瘤（初发，手术治疗）
	 */
	@RequiresPermissions("pa:qualityPa:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityPa qualityPa) {
		qualityPaService.delete(qualityPa);
		return renderResult(Global.TRUE, text("删除PA垂体腺瘤（初发，手术治疗）成功！"));
	}
	
}