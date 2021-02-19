/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.asd.web;

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
import com.zebone.quality.modules.asd.entity.QualityAsd;
import com.zebone.quality.modules.asd.service.QualityAsdService;

/**
 * ASD房间隔缺损手术Controller
 * @author 卡卡西
 * @version 2021-02-19
 */
@Controller
@RequestMapping(value = "${adminPath}/asd/qualityAsd")
public class QualityAsdController extends BaseController {

	@Autowired
	private QualityAsdService qualityAsdService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityAsd get(String id, boolean isNewRecord) {
		return qualityAsdService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("asd:qualityAsd:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityAsd qualityAsd, Model model) {
		model.addAttribute("qualityAsd", qualityAsd);
		return "modules/asd/qualityAsdList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("asd:qualityAsd:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityAsd> listData(QualityAsd qualityAsd, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityAsd> page = qualityAsdService.findPage(new Page<QualityAsd>(request, response), qualityAsd); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("asd:qualityAsd:view")
	@RequestMapping(value = "form")
	public String form(QualityAsd qualityAsd, Model model) {
		model.addAttribute("qualityAsd", qualityAsd);
		return "modules/asd/qualityAsdForm";
	}

	/**
	 * 保存ASD房间隔缺损手术
	 */
	@RequiresPermissions("asd:qualityAsd:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityAsd qualityAsd) {
		qualityAsdService.save(qualityAsd);
		return renderResult(Global.TRUE, text("保存ASD房间隔缺损手术成功！"));
	}
	
	/**
	 * 停用ASD房间隔缺损手术
	 */
	@RequiresPermissions("asd:qualityAsd:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityAsd qualityAsd) {
		qualityAsd.setStatus(QualityAsd.STATUS_DISABLE);
		qualityAsdService.updateStatus(qualityAsd);
		return renderResult(Global.TRUE, text("停用ASD房间隔缺损手术成功"));
	}
	
	/**
	 * 启用ASD房间隔缺损手术
	 */
	@RequiresPermissions("asd:qualityAsd:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityAsd qualityAsd) {
		qualityAsd.setStatus(QualityAsd.STATUS_NORMAL);
		qualityAsdService.updateStatus(qualityAsd);
		return renderResult(Global.TRUE, text("启用ASD房间隔缺损手术成功"));
	}
	
	/**
	 * 删除ASD房间隔缺损手术
	 */
	@RequiresPermissions("asd:qualityAsd:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityAsd qualityAsd) {
		qualityAsdService.delete(qualityAsd);
		return renderResult(Global.TRUE, text("删除ASD房间隔缺损手术成功！"));
	}
	
}