/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.vte.web;

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
import com.zebone.quality.modules.vte.entity.QualityVte;
import com.zebone.quality.modules.vte.service.QualityVteService;

/**
 * VTE中高危风险患者预防静脉血栓栓塞症Controller
 * @author 卡卡西
 * @version 2021-01-22
 */
@Controller
@RequestMapping(value = "${adminPath}/vte/qualityVte")
public class QualityVteController extends BaseController {

	@Autowired
	private QualityVteService qualityVteService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityVte get(String id, boolean isNewRecord) {
		return qualityVteService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("vte:qualityVte:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityVte qualityVte, Model model) {
		model.addAttribute("qualityVte", qualityVte);
		return "modules/vte/qualityVteList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("vte:qualityVte:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityVte> listData(QualityVte qualityVte, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityVte> page = qualityVteService.findPage(new Page<QualityVte>(request, response), qualityVte); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("vte:qualityVte:view")
	@RequestMapping(value = "form")
	public String form(QualityVte qualityVte, Model model) {
		model.addAttribute("qualityVte", qualityVte);
		return "modules/vte/qualityVteForm";
	}

	/**
	 * 保存VTE中高危风险患者预防静脉血栓栓塞症
	 */
	@RequiresPermissions("vte:qualityVte:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityVte qualityVte) {
		qualityVteService.save(qualityVte);
		return renderResult(Global.TRUE, text("保存VTE中高危风险患者预防静脉血栓栓塞症成功！"));
	}
	
	/**
	 * 停用VTE中高危风险患者预防静脉血栓栓塞症
	 */
	@RequiresPermissions("vte:qualityVte:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityVte qualityVte) {
		qualityVte.setStatus(QualityVte.STATUS_DISABLE);
		qualityVteService.updateStatus(qualityVte);
		return renderResult(Global.TRUE, text("停用VTE中高危风险患者预防静脉血栓栓塞症成功"));
	}
	
	/**
	 * 启用VTE中高危风险患者预防静脉血栓栓塞症
	 */
	@RequiresPermissions("vte:qualityVte:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityVte qualityVte) {
		qualityVte.setStatus(QualityVte.STATUS_NORMAL);
		qualityVteService.updateStatus(qualityVte);
		return renderResult(Global.TRUE, text("启用VTE中高危风险患者预防静脉血栓栓塞症成功"));
	}
	
	/**
	 * 删除VTE中高危风险患者预防静脉血栓栓塞症
	 */
	@RequiresPermissions("vte:qualityVte:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityVte qualityVte) {
		qualityVteService.delete(qualityVte);
		return renderResult(Global.TRUE, text("删除VTE中高危风险患者预防静脉血栓栓塞症成功！"));
	}
	
}