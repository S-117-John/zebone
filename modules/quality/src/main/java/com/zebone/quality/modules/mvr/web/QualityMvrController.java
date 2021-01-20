/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.mvr.web;

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
import com.zebone.quality.modules.mvr.entity.QualityMvr;
import com.zebone.quality.modules.mvr.service.QualityMvrService;

/**
 * MVR二尖瓣置换术Controller
 * @author 卡卡西
 * @version 2021-01-20
 */
@Controller
@RequestMapping(value = "${adminPath}/mvr/qualityMvr")
public class QualityMvrController extends BaseController {

	@Autowired
	private QualityMvrService qualityMvrService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityMvr get(String id, boolean isNewRecord) {
		return qualityMvrService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("mvr:qualityMvr:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityMvr qualityMvr, Model model) {
		model.addAttribute("qualityMvr", qualityMvr);
		return "modules/mvr/qualityMvrList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("mvr:qualityMvr:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityMvr> listData(QualityMvr qualityMvr, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityMvr> page = qualityMvrService.findPage(new Page<QualityMvr>(request, response), qualityMvr); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("mvr:qualityMvr:view")
	@RequestMapping(value = "form")
	public String form(QualityMvr qualityMvr, Model model) {
		model.addAttribute("qualityMvr", qualityMvr);
		return "modules/mvr/qualityMvrForm";
	}

	/**
	 * 保存MVR二尖瓣置换术
	 */
	@RequiresPermissions("mvr:qualityMvr:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityMvr qualityMvr) {
		qualityMvrService.save(qualityMvr);
		return renderResult(Global.TRUE, text("保存MVR二尖瓣置换术成功！"));
	}
	
	/**
	 * 停用MVR二尖瓣置换术
	 */
	@RequiresPermissions("mvr:qualityMvr:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityMvr qualityMvr) {
		qualityMvr.setStatus(QualityMvr.STATUS_DISABLE);
		qualityMvrService.updateStatus(qualityMvr);
		return renderResult(Global.TRUE, text("停用MVR二尖瓣置换术成功"));
	}
	
	/**
	 * 启用MVR二尖瓣置换术
	 */
	@RequiresPermissions("mvr:qualityMvr:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityMvr qualityMvr) {
		qualityMvr.setStatus(QualityMvr.STATUS_NORMAL);
		qualityMvrService.updateStatus(qualityMvr);
		return renderResult(Global.TRUE, text("启用MVR二尖瓣置换术成功"));
	}
	
	/**
	 * 删除MVR二尖瓣置换术
	 */
	@RequiresPermissions("mvr:qualityMvr:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityMvr qualityMvr) {
		qualityMvrService.delete(qualityMvr);
		return renderResult(Global.TRUE, text("删除MVR二尖瓣置换术成功！"));
	}
	
}