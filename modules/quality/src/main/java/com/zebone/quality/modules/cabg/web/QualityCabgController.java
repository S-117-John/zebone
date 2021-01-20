/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.cabg.web;

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
import com.zebone.quality.modules.cabg.entity.QualityCabg;
import com.zebone.quality.modules.cabg.service.QualityCabgService;

/**
 * CABG冠状动脉旁路移植术Controller
 * @author 卡卡西
 * @version 2021-01-20
 */
@Controller
@RequestMapping(value = "${adminPath}/cabg/qualityCabg")
public class QualityCabgController extends BaseController {

	@Autowired
	private QualityCabgService qualityCabgService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityCabg get(String id, boolean isNewRecord) {
		return qualityCabgService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("cabg:qualityCabg:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityCabg qualityCabg, Model model) {
		model.addAttribute("qualityCabg", qualityCabg);
		return "modules/cabg/qualityCabgList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("cabg:qualityCabg:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityCabg> listData(QualityCabg qualityCabg, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityCabg> page = qualityCabgService.findPage(new Page<QualityCabg>(request, response), qualityCabg); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("cabg:qualityCabg:view")
	@RequestMapping(value = "form")
	public String form(QualityCabg qualityCabg, Model model) {
		model.addAttribute("qualityCabg", qualityCabg);
		return "modules/cabg/qualityCabgForm";
	}

	/**
	 * 保存CABG冠状动脉旁路移植术
	 */
	@RequiresPermissions("cabg:qualityCabg:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityCabg qualityCabg) {
		qualityCabgService.save(qualityCabg);
		return renderResult(Global.TRUE, text("保存CABG冠状动脉旁路移植术成功！"));
	}
	
	/**
	 * 停用CABG冠状动脉旁路移植术
	 */
	@RequiresPermissions("cabg:qualityCabg:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityCabg qualityCabg) {
		qualityCabg.setStatus(QualityCabg.STATUS_DISABLE);
		qualityCabgService.updateStatus(qualityCabg);
		return renderResult(Global.TRUE, text("停用CABG冠状动脉旁路移植术成功"));
	}
	
	/**
	 * 启用CABG冠状动脉旁路移植术
	 */
	@RequiresPermissions("cabg:qualityCabg:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityCabg qualityCabg) {
		qualityCabg.setStatus(QualityCabg.STATUS_NORMAL);
		qualityCabgService.updateStatus(qualityCabg);
		return renderResult(Global.TRUE, text("启用CABG冠状动脉旁路移植术成功"));
	}
	
	/**
	 * 删除CABG冠状动脉旁路移植术
	 */
	@RequiresPermissions("cabg:qualityCabg:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityCabg qualityCabg) {
		qualityCabgService.delete(qualityCabg);
		return renderResult(Global.TRUE, text("删除CABG冠状动脉旁路移植术成功！"));
	}
	
}