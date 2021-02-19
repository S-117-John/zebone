/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.tc.web;

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
import com.zebone.quality.modules.tc.entity.QualityTc;
import com.zebone.quality.modules.tc.service.QualityTcService;

/**
 * TC甲状腺癌（手术治疗）Controller
 * @author 卡卡西
 * @version 2021-02-19
 */
@Controller
@RequestMapping(value = "${adminPath}/tc/qualityTc")
public class QualityTcController extends BaseController {

	@Autowired
	private QualityTcService qualityTcService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityTc get(String id, boolean isNewRecord) {
		return qualityTcService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("tc:qualityTc:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityTc qualityTc, Model model) {
		model.addAttribute("qualityTc", qualityTc);
		return "modules/tc/qualityTcList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("tc:qualityTc:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityTc> listData(QualityTc qualityTc, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityTc> page = qualityTcService.findPage(new Page<QualityTc>(request, response), qualityTc); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("tc:qualityTc:view")
	@RequestMapping(value = "form")
	public String form(QualityTc qualityTc, Model model) {
		model.addAttribute("qualityTc", qualityTc);
		return "modules/tc/qualityTcForm";
	}

	/**
	 * 保存TC甲状腺癌（手术治疗）
	 */
	@RequiresPermissions("tc:qualityTc:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityTc qualityTc) {
		qualityTcService.save(qualityTc);
		return renderResult(Global.TRUE, text("保存TC甲状腺癌（手术治疗）成功！"));
	}
	
	/**
	 * 停用TC甲状腺癌（手术治疗）
	 */
	@RequiresPermissions("tc:qualityTc:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityTc qualityTc) {
		qualityTc.setStatus(QualityTc.STATUS_DISABLE);
		qualityTcService.updateStatus(qualityTc);
		return renderResult(Global.TRUE, text("停用TC甲状腺癌（手术治疗）成功"));
	}
	
	/**
	 * 启用TC甲状腺癌（手术治疗）
	 */
	@RequiresPermissions("tc:qualityTc:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityTc qualityTc) {
		qualityTc.setStatus(QualityTc.STATUS_NORMAL);
		qualityTcService.updateStatus(qualityTc);
		return renderResult(Global.TRUE, text("启用TC甲状腺癌（手术治疗）成功"));
	}
	
	/**
	 * 删除TC甲状腺癌（手术治疗）
	 */
	@RequiresPermissions("tc:qualityTc:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityTc qualityTc) {
		qualityTcService.delete(qualityTc);
		return renderResult(Global.TRUE, text("删除TC甲状腺癌（手术治疗）成功！"));
	}
	
}