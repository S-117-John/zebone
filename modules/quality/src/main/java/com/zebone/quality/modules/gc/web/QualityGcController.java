/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.gc.web;

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
import com.zebone.quality.modules.gc.entity.QualityGc;
import com.zebone.quality.modules.gc.service.QualityGcService;

/**
 * GC胃癌（手术治疗）Controller
 * @author 卡卡西
 * @version 2021-01-19
 */
@Controller
@RequestMapping(value = "${adminPath}/gc/qualityGc")
public class QualityGcController extends BaseController {

	@Autowired
	private QualityGcService qualityGcService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityGc get(String id, boolean isNewRecord) {
		return qualityGcService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("gc:qualityGc:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityGc qualityGc, Model model) {
		model.addAttribute("qualityGc", qualityGc);
		return "modules/gc/qualityGcList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("gc:qualityGc:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityGc> listData(QualityGc qualityGc, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityGc> page = qualityGcService.findPage(new Page<QualityGc>(request, response), qualityGc); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("gc:qualityGc:view")
	@RequestMapping(value = "form")
	public String form(QualityGc qualityGc, Model model) {
		model.addAttribute("qualityGc", qualityGc);
		return "modules/gc/qualityGcForm";
	}

	/**
	 * 保存GC胃癌（手术治疗）
	 */
	@RequiresPermissions("gc:qualityGc:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityGc qualityGc) {
		qualityGcService.save(qualityGc);
		return renderResult(Global.TRUE, text("保存GC胃癌（手术治疗）成功！"));
	}
	
	/**
	 * 停用GC胃癌（手术治疗）
	 */
	@RequiresPermissions("gc:qualityGc:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityGc qualityGc) {
		qualityGc.setStatus(QualityGc.STATUS_DISABLE);
		qualityGcService.updateStatus(qualityGc);
		return renderResult(Global.TRUE, text("停用GC胃癌（手术治疗）成功"));
	}
	
	/**
	 * 启用GC胃癌（手术治疗）
	 */
	@RequiresPermissions("gc:qualityGc:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityGc qualityGc) {
		qualityGc.setStatus(QualityGc.STATUS_NORMAL);
		qualityGcService.updateStatus(qualityGc);
		return renderResult(Global.TRUE, text("启用GC胃癌（手术治疗）成功"));
	}
	
	/**
	 * 删除GC胃癌（手术治疗）
	 */
	@RequiresPermissions("gc:qualityGc:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityGc qualityGc) {
		qualityGcService.delete(qualityGc);
		return renderResult(Global.TRUE, text("删除GC胃癌（手术治疗）成功！"));
	}
	
}