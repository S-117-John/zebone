/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.um.web;

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
import com.zebone.quality.modules.um.entity.QualityUm;
import com.zebone.quality.modules.um.service.QualityUmService;

/**
 * UM子宫肌瘤（手术治疗）Controller
 * @author 卡卡西
 * @version 2021-01-22
 */
@Controller
@RequestMapping(value = "${adminPath}/um/qualityUm")
public class QualityUmController extends BaseController {

	@Autowired
	private QualityUmService qualityUmService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityUm get(String id, boolean isNewRecord) {
		return qualityUmService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("um:qualityUm:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityUm qualityUm, Model model) {
		model.addAttribute("qualityUm", qualityUm);
		return "modules/um/qualityUmList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("um:qualityUm:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityUm> listData(QualityUm qualityUm, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityUm> page = qualityUmService.findPage(new Page<QualityUm>(request, response), qualityUm); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("um:qualityUm:view")
	@RequestMapping(value = "form")
	public String form(QualityUm qualityUm, Model model) {
		model.addAttribute("qualityUm", qualityUm);
		return "modules/um/qualityUmForm";
	}

	/**
	 * 保存UM子宫肌瘤（手术治疗）
	 */
	@RequiresPermissions("um:qualityUm:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityUm qualityUm) {
		qualityUmService.save(qualityUm);
		return renderResult(Global.TRUE, text("保存UM子宫肌瘤（手术治疗）成功！"));
	}
	
	/**
	 * 停用UM子宫肌瘤（手术治疗）
	 */
	@RequiresPermissions("um:qualityUm:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityUm qualityUm) {
		qualityUm.setStatus(QualityUm.STATUS_DISABLE);
		qualityUmService.updateStatus(qualityUm);
		return renderResult(Global.TRUE, text("停用UM子宫肌瘤（手术治疗）成功"));
	}
	
	/**
	 * 启用UM子宫肌瘤（手术治疗）
	 */
	@RequiresPermissions("um:qualityUm:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityUm qualityUm) {
		qualityUm.setStatus(QualityUm.STATUS_NORMAL);
		qualityUmService.updateStatus(qualityUm);
		return renderResult(Global.TRUE, text("启用UM子宫肌瘤（手术治疗）成功"));
	}
	
	/**
	 * 删除UM子宫肌瘤（手术治疗）
	 */
	@RequiresPermissions("um:qualityUm:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityUm qualityUm) {
		qualityUmService.delete(qualityUm);
		return renderResult(Global.TRUE, text("删除UM子宫肌瘤（手术治疗）成功！"));
	}
	
}