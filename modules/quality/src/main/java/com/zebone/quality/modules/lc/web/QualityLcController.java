/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.lc.web;

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
import com.zebone.quality.modules.lc.entity.QualityLc;
import com.zebone.quality.modules.lc.service.QualityLcService;

/**
 * LC肺癌（手术治疗）Controller
 * @author 卡卡西
 * @version 2021-01-21
 */
@Controller
@RequestMapping(value = "${adminPath}/lc/qualityLc")
public class QualityLcController extends BaseController {

	@Autowired
	private QualityLcService qualityLcService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityLc get(String id, boolean isNewRecord) {
		return qualityLcService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("lc:qualityLc:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityLc qualityLc, Model model) {
		model.addAttribute("qualityLc", qualityLc);
		return "modules/lc/qualityLcList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("lc:qualityLc:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityLc> listData(QualityLc qualityLc, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityLc> page = qualityLcService.findPage(new Page<QualityLc>(request, response), qualityLc); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("lc:qualityLc:view")
	@RequestMapping(value = "form")
	public String form(QualityLc qualityLc, Model model) {
		model.addAttribute("qualityLc", qualityLc);
		return "modules/lc/qualityLcForm";
	}

	/**
	 * 保存LC肺癌（手术治疗）
	 */
	@RequiresPermissions("lc:qualityLc:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityLc qualityLc) {
		qualityLcService.save(qualityLc);
		return renderResult(Global.TRUE, text("保存LC肺癌（手术治疗）成功！"));
	}
	
	/**
	 * 停用LC肺癌（手术治疗）
	 */
	@RequiresPermissions("lc:qualityLc:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityLc qualityLc) {
		qualityLc.setStatus(QualityLc.STATUS_DISABLE);
		qualityLcService.updateStatus(qualityLc);
		return renderResult(Global.TRUE, text("停用LC肺癌（手术治疗）成功"));
	}
	
	/**
	 * 启用LC肺癌（手术治疗）
	 */
	@RequiresPermissions("lc:qualityLc:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityLc qualityLc) {
		qualityLc.setStatus(QualityLc.STATUS_NORMAL);
		qualityLcService.updateStatus(qualityLc);
		return renderResult(Global.TRUE, text("启用LC肺癌（手术治疗）成功"));
	}
	
	/**
	 * 删除LC肺癌（手术治疗）
	 */
	@RequiresPermissions("lc:qualityLc:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityLc qualityLc) {
		qualityLcService.delete(qualityLc);
		return renderResult(Global.TRUE, text("删除LC肺癌（手术治疗）成功！"));
	}
	
}