/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.base.web;

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
import com.zebone.quality.modules.base.entity.QualityDisease;
import com.zebone.quality.modules.base.service.QualityDiseaseService;

import java.util.List;

/**
 * 病种设置Controller
 * @author lijin
 * @version 2021-01-14
 */
@Controller
@RequestMapping(value = "${adminPath}/base/qualityDisease")
public class QualityDiseaseController extends BaseController {

	@Autowired
	private QualityDiseaseService qualityDiseaseService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityDisease get(String id, boolean isNewRecord) {
		return qualityDiseaseService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("base:qualityDisease:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityDisease qualityDisease, Model model) {
		model.addAttribute("qualityDisease", qualityDisease);
		return "modules/base/qualityDiseaseList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("base:qualityDisease:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityDisease> listData(QualityDisease qualityDisease, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityDisease> page = qualityDiseaseService.findPage(new Page<QualityDisease>(request, response), qualityDisease);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("base:qualityDisease:view")
	@RequestMapping(value = "form")
	public String form(QualityDisease qualityDisease, Model model) {
		model.addAttribute("qualityDisease", qualityDisease);
		return "modules/base/qualityDiseaseForm";
	}

	/**
	 * 保存病种设置
	 */
	@RequiresPermissions("base:qualityDisease:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityDisease qualityDisease) {
		qualityDiseaseService.save(qualityDisease);
		return renderResult(Global.TRUE, text("保存病种设置成功！"));
	}
	
	/**
	 * 停用病种设置
	 */
	@RequiresPermissions("base:qualityDisease:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityDisease qualityDisease) {
		qualityDisease.setStatus(QualityDisease.STATUS_DISABLE);
		qualityDiseaseService.updateStatus(qualityDisease);
		return renderResult(Global.TRUE, text("停用病种设置成功"));
	}
	
	/**
	 * 启用病种设置
	 */
	@RequiresPermissions("base:qualityDisease:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityDisease qualityDisease) {
		qualityDisease.setStatus(QualityDisease.STATUS_NORMAL);
		qualityDiseaseService.updateStatus(qualityDisease);
		return renderResult(Global.TRUE, text("启用病种设置成功"));
	}
	
	/**
	 * 删除病种设置
	 */
	@RequiresPermissions("base:qualityDisease:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityDisease qualityDisease) {
		qualityDiseaseService.delete(qualityDisease);
		return renderResult(Global.TRUE, text("删除病种设置成功！"));
	}

	@ResponseBody
	@RequestMapping(value = "api")
	public List<QualityDisease> dataList(QualityDisease qualityDisease){
		return qualityDiseaseService.findList(qualityDisease);
	}

}