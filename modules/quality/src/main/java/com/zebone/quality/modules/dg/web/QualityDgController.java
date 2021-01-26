/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.dg.web;

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
import com.zebone.quality.modules.dg.entity.QualityDg;
import com.zebone.quality.modules.dg.service.QualityDgService;

/**
 * DG异位妊娠（手术治疗）Controller
 * @author 卡卡西
 * @version 2021-01-22
 */
@Controller
@RequestMapping(value = "${adminPath}/dg/qualityDg")
public class QualityDgController extends BaseController {

	@Autowired
	private QualityDgService qualityDgService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityDg get(String id, boolean isNewRecord) {
		return qualityDgService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("dg:qualityDg:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityDg qualityDg, Model model) {
		model.addAttribute("qualityDg", qualityDg);
		return "modules/dg/qualityDgList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("dg:qualityDg:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityDg> listData(QualityDg qualityDg, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityDg> page = qualityDgService.findPage(new Page<QualityDg>(request, response), qualityDg); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("dg:qualityDg:view")
	@RequestMapping(value = "form")
	public String form(QualityDg qualityDg, Model model) {
		model.addAttribute("qualityDg", qualityDg);
		return "modules/dg/qualityDgForm";
	}

	/**
	 * 保存DG异位妊娠（手术治疗）
	 */
	@RequiresPermissions("dg:qualityDg:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityDg qualityDg) {
		qualityDgService.save(qualityDg);
		return renderResult(Global.TRUE, text("保存DG异位妊娠（手术治疗）成功！"));
	}
	
	/**
	 * 停用DG异位妊娠（手术治疗）
	 */
	@RequiresPermissions("dg:qualityDg:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityDg qualityDg) {
		qualityDg.setStatus(QualityDg.STATUS_DISABLE);
		qualityDgService.updateStatus(qualityDg);
		return renderResult(Global.TRUE, text("停用DG异位妊娠（手术治疗）成功"));
	}
	
	/**
	 * 启用DG异位妊娠（手术治疗）
	 */
	@RequiresPermissions("dg:qualityDg:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityDg qualityDg) {
		qualityDg.setStatus(QualityDg.STATUS_NORMAL);
		qualityDgService.updateStatus(qualityDg);
		return renderResult(Global.TRUE, text("启用DG异位妊娠（手术治疗）成功"));
	}
	
	/**
	 * 删除DG异位妊娠（手术治疗）
	 */
	@RequiresPermissions("dg:qualityDg:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityDg qualityDg) {
		qualityDgService.delete(qualityDg);
		return renderResult(Global.TRUE, text("删除DG异位妊娠（手术治疗）成功！"));
	}
	
}