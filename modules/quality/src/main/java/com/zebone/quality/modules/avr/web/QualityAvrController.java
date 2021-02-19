/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.avr.web;

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
import com.zebone.quality.modules.avr.entity.QualityAvr;
import com.zebone.quality.modules.avr.service.QualityAvrService;

/**
 * AVR主动脉瓣置换术Controller
 * @author 卡卡西
 * @version 2021-02-19
 */
@Controller
@RequestMapping(value = "${adminPath}/avr/qualityAvr")
public class QualityAvrController extends BaseController {

	@Autowired
	private QualityAvrService qualityAvrService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityAvr get(String id, boolean isNewRecord) {
		return qualityAvrService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("avr:qualityAvr:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityAvr qualityAvr, Model model) {
		model.addAttribute("qualityAvr", qualityAvr);
		return "modules/avr/qualityAvrList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("avr:qualityAvr:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityAvr> listData(QualityAvr qualityAvr, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityAvr> page = qualityAvrService.findPage(new Page<QualityAvr>(request, response), qualityAvr); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("avr:qualityAvr:view")
	@RequestMapping(value = "form")
	public String form(QualityAvr qualityAvr, Model model) {
		model.addAttribute("qualityAvr", qualityAvr);
		return "modules/avr/qualityAvrForm";
	}

	/**
	 * 保存AVR主动脉瓣置换术
	 */
	@RequiresPermissions("avr:qualityAvr:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityAvr qualityAvr) {
		qualityAvrService.save(qualityAvr);
		return renderResult(Global.TRUE, text("保存AVR主动脉瓣置换术成功！"));
	}
	
	/**
	 * 停用AVR主动脉瓣置换术
	 */
	@RequiresPermissions("avr:qualityAvr:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityAvr qualityAvr) {
		qualityAvr.setStatus(QualityAvr.STATUS_DISABLE);
		qualityAvrService.updateStatus(qualityAvr);
		return renderResult(Global.TRUE, text("停用AVR主动脉瓣置换术成功"));
	}
	
	/**
	 * 启用AVR主动脉瓣置换术
	 */
	@RequiresPermissions("avr:qualityAvr:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityAvr qualityAvr) {
		qualityAvr.setStatus(QualityAvr.STATUS_NORMAL);
		qualityAvrService.updateStatus(qualityAvr);
		return renderResult(Global.TRUE, text("启用AVR主动脉瓣置换术成功"));
	}
	
	/**
	 * 删除AVR主动脉瓣置换术
	 */
	@RequiresPermissions("avr:qualityAvr:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityAvr qualityAvr) {
		qualityAvrService.delete(qualityAvr);
		return renderResult(Global.TRUE, text("删除AVR主动脉瓣置换术成功！"));
	}
	
}