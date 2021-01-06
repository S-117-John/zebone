/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.emr.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zebone.quality.modules.cesarean.entity.QualityCesareanSection;
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
import com.zebone.quality.modules.emr.entity.EmrHomePage;
import com.zebone.quality.modules.emr.service.EmrHomePageService;

import java.util.List;

/**
 * 病案Controller
 * @author lijin
 * @version 2021-01-04
 */
@Controller
@RequestMapping(value = "${adminPath}/emr/emrHomePage")
public class EmrHomePageController extends BaseController {

	@Autowired
	private EmrHomePageService emrHomePageService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public EmrHomePage get(String pkPage, boolean isNewRecord) {
		return emrHomePageService.get(pkPage, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("emr:emrHomePage:view")
	@RequestMapping(value = {"list", ""})
	public String list(EmrHomePage emrHomePage, Model model) {
		model.addAttribute("emrHomePage", emrHomePage);
		return "modules/emr/emrHomePageList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("emr:emrHomePage:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<EmrHomePage> listData(EmrHomePage emrHomePage, HttpServletRequest request, HttpServletResponse response) {
		Page<EmrHomePage> page = emrHomePageService.findPage(new Page<EmrHomePage>(request, response), emrHomePage); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("emr:emrHomePage:view")
	@RequestMapping(value = "form")
	public String form(EmrHomePage emrHomePage, Model model) {
		model.addAttribute("emrHomePage", emrHomePage);
		return "modules/emr/emrHomePageForm";
	}

	/**
	 * 保存病案
	 */
	@RequiresPermissions("emr:emrHomePage:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated EmrHomePage emrHomePage) {
		emrHomePageService.save(emrHomePage);
		return renderResult(Global.TRUE, text("保存病案成功！"));
	}
	
	/**
	 * 删除病案
	 */
	@RequiresPermissions("emr:emrHomePage:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(EmrHomePage emrHomePage) {
		emrHomePageService.delete(emrHomePage);
		return renderResult(Global.TRUE, text("删除病案成功！"));
	}


	@RequestMapping(value = "data")
	public String data(EmrHomePage emrHomePage, Model model,HttpServletRequest request, HttpServletResponse response) {
		List<EmrHomePage> result = emrHomePageService.findList(emrHomePage);
		if(result.size()>0){
			QualityCesareanSection qualityCesareanSection = new QualityCesareanSection();
			emrHomePage = result.get(0);
			qualityCesareanSection.setCm0111(emrHomePage.getQcDocName());
			qualityCesareanSection.setCm0112(emrHomePage.getQcNurseName());
			qualityCesareanSection.setCm0113(emrHomePage.getConsultName());
			qualityCesareanSection.setCm0114(emrHomePage.getNurseName());
			qualityCesareanSection.setIsNewRecord(true);
			model.addAttribute("qualityCesareanSection", qualityCesareanSection);
		}else {

		}

		return "modules/cesarean/qualityCesareanSectionForm";
	}
}