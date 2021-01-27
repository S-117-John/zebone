/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.aecopd.web;

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
import com.zebone.quality.modules.aecopd.entity.QualityAecopd;
import com.zebone.quality.modules.aecopd.service.QualityAecopdService;

/**
 * AECOPD慢性阻塞性肺疾病急性发作（住院）Controller
 * @author 卡卡西
 * @version 2021-01-27
 */
@Controller
@RequestMapping(value = "${adminPath}/aecopd/qualityAecopd")
public class QualityAecopdController extends BaseController {

	@Autowired
	private QualityAecopdService qualityAecopdService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityAecopd get(String id, boolean isNewRecord) {
		return qualityAecopdService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("aecopd:qualityAecopd:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityAecopd qualityAecopd, Model model) {
		model.addAttribute("qualityAecopd", qualityAecopd);
		return "modules/aecopd/qualityAecopdList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("aecopd:qualityAecopd:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityAecopd> listData(QualityAecopd qualityAecopd, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityAecopd> page = qualityAecopdService.findPage(new Page<QualityAecopd>(request, response), qualityAecopd); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("aecopd:qualityAecopd:view")
	@RequestMapping(value = "form")
	public String form(QualityAecopd qualityAecopd, Model model) {
		model.addAttribute("qualityAecopd", qualityAecopd);
		return "modules/aecopd/qualityAecopdForm";
	}

	/**
	 * 保存AECOPD慢性阻塞性肺疾病急性发作（住院）
	 */
	@RequiresPermissions("aecopd:qualityAecopd:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityAecopd qualityAecopd) {
		qualityAecopdService.save(qualityAecopd);
		return renderResult(Global.TRUE, text("保存AECOPD慢性阻塞性肺疾病急性发作（住院）成功！"));
	}
	
	/**
	 * 停用AECOPD慢性阻塞性肺疾病急性发作（住院）
	 */
	@RequiresPermissions("aecopd:qualityAecopd:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityAecopd qualityAecopd) {
		qualityAecopd.setStatus(QualityAecopd.STATUS_DISABLE);
		qualityAecopdService.updateStatus(qualityAecopd);
		return renderResult(Global.TRUE, text("停用AECOPD慢性阻塞性肺疾病急性发作（住院）成功"));
	}
	
	/**
	 * 启用AECOPD慢性阻塞性肺疾病急性发作（住院）
	 */
	@RequiresPermissions("aecopd:qualityAecopd:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityAecopd qualityAecopd) {
		qualityAecopd.setStatus(QualityAecopd.STATUS_NORMAL);
		qualityAecopdService.updateStatus(qualityAecopd);
		return renderResult(Global.TRUE, text("启用AECOPD慢性阻塞性肺疾病急性发作（住院）成功"));
	}
	
	/**
	 * 删除AECOPD慢性阻塞性肺疾病急性发作（住院）
	 */
	@RequiresPermissions("aecopd:qualityAecopd:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityAecopd qualityAecopd) {
		qualityAecopdService.delete(qualityAecopd);
		return renderResult(Global.TRUE, text("删除AECOPD慢性阻塞性肺疾病急性发作（住院）成功！"));
	}
	
}