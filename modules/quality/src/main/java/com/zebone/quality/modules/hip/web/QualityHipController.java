/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.hip.web;

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
import com.zebone.quality.modules.hip.entity.QualityHip;
import com.zebone.quality.modules.hip.service.QualityHipService;

/**
 * Hip髋关节置换术Controller
 * @author 卡卡西
 * @version 2021-01-21
 */
@Controller
@RequestMapping(value = "${adminPath}/hip/qualityHip")
public class QualityHipController extends BaseController {

	@Autowired
	private QualityHipService qualityHipService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityHip get(String id, boolean isNewRecord) {
		return qualityHipService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("hip:qualityHip:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityHip qualityHip, Model model) {
		model.addAttribute("qualityHip", qualityHip);
		return "modules/hip/qualityHipList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("hip:qualityHip:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityHip> listData(QualityHip qualityHip, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityHip> page = qualityHipService.findPage(new Page<QualityHip>(request, response), qualityHip); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("hip:qualityHip:view")
	@RequestMapping(value = "form")
	public String form(QualityHip qualityHip, Model model) {
		model.addAttribute("qualityHip", qualityHip);
		return "modules/hip/qualityHipForm";
	}

	/**
	 * 保存Hip髋关节置换术
	 */
	@RequiresPermissions("hip:qualityHip:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityHip qualityHip) {
		qualityHipService.save(qualityHip);
		return renderResult(Global.TRUE, text("保存Hip髋关节置换术成功！"));
	}
	
	/**
	 * 停用Hip髋关节置换术
	 */
	@RequiresPermissions("hip:qualityHip:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityHip qualityHip) {
		qualityHip.setStatus(QualityHip.STATUS_DISABLE);
		qualityHipService.updateStatus(qualityHip);
		return renderResult(Global.TRUE, text("停用Hip髋关节置换术成功"));
	}
	
	/**
	 * 启用Hip髋关节置换术
	 */
	@RequiresPermissions("hip:qualityHip:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityHip qualityHip) {
		qualityHip.setStatus(QualityHip.STATUS_NORMAL);
		qualityHipService.updateStatus(qualityHip);
		return renderResult(Global.TRUE, text("启用Hip髋关节置换术成功"));
	}
	
	/**
	 * 删除Hip髋关节置换术
	 */
	@RequiresPermissions("hip:qualityHip:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityHip qualityHip) {
		qualityHipService.delete(qualityHip);
		return renderResult(Global.TRUE, text("删除Hip髋关节置换术成功！"));
	}
	
}