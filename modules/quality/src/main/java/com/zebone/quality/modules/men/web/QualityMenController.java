/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.men.web;

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
import com.zebone.quality.modules.men.entity.QualityMen;
import com.zebone.quality.modules.men.service.QualityMenService;

/**
 * MEN脑膜瘤（初发手术治疗）Controller
 * @author 卡卡西
 * @version 2021-01-21
 */
@Controller
@RequestMapping(value = "${adminPath}/men/qualityMen")
public class QualityMenController extends BaseController {

	@Autowired
	private QualityMenService qualityMenService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityMen get(String id, boolean isNewRecord) {
		return qualityMenService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("men:qualityMen:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityMen qualityMen, Model model) {
		model.addAttribute("qualityMen", qualityMen);
		return "modules/men/qualityMenList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("men:qualityMen:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityMen> listData(QualityMen qualityMen, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityMen> page = qualityMenService.findPage(new Page<QualityMen>(request, response), qualityMen); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("men:qualityMen:view")
	@RequestMapping(value = "form")
	public String form(QualityMen qualityMen, Model model) {
		model.addAttribute("qualityMen", qualityMen);
		return "modules/men/qualityMenForm";
	}

	/**
	 * 保存MEN脑膜瘤（初发手术治疗）
	 */
	@RequiresPermissions("men:qualityMen:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityMen qualityMen) {
		qualityMenService.save(qualityMen);
		return renderResult(Global.TRUE, text("保存MEN脑膜瘤（初发手术治疗）成功！"));
	}
	
	/**
	 * 停用MEN脑膜瘤（初发手术治疗）
	 */
	@RequiresPermissions("men:qualityMen:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityMen qualityMen) {
		qualityMen.setStatus(QualityMen.STATUS_DISABLE);
		qualityMenService.updateStatus(qualityMen);
		return renderResult(Global.TRUE, text("停用MEN脑膜瘤（初发手术治疗）成功"));
	}
	
	/**
	 * 启用MEN脑膜瘤（初发手术治疗）
	 */
	@RequiresPermissions("men:qualityMen:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityMen qualityMen) {
		qualityMen.setStatus(QualityMen.STATUS_NORMAL);
		qualityMenService.updateStatus(qualityMen);
		return renderResult(Global.TRUE, text("启用MEN脑膜瘤（初发手术治疗）成功"));
	}
	
	/**
	 * 删除MEN脑膜瘤（初发手术治疗）
	 */
	@RequiresPermissions("men:qualityMen:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityMen qualityMen) {
		qualityMenService.delete(qualityMen);
		return renderResult(Global.TRUE, text("删除MEN脑膜瘤（初发手术治疗）成功！"));
	}
	
}