/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.cesarean.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.zebone.quality.modules.common.UploadResult;
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
import com.zebone.quality.modules.cesarean.entity.QualityCesareanSection;
import com.zebone.quality.modules.cesarean.service.QualityCesareanSectionService;

import java.util.Optional;

/**
 * 剖宫产Controller
 * @author lijin
 * @version 2021-01-04
 */
@Controller
@RequestMapping(value = "${adminPath}/cesarean/qualityCesareanSection")
public class QualityCesareanSectionController extends BaseController {

	@Autowired
	private QualityCesareanSectionService qualityCesareanSectionService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityCesareanSection get(String id, boolean isNewRecord) {
		return qualityCesareanSectionService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("cesarean:qualityCesareanSection:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityCesareanSection qualityCesareanSection, Model model) {
		model.addAttribute("qualityCesareanSection", qualityCesareanSection);
		return "modules/cesarean/qualityCesareanSectionList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("cesarean:qualityCesareanSection:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityCesareanSection> listData(QualityCesareanSection qualityCesareanSection, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityCesareanSection> page = qualityCesareanSectionService.findPage(new Page<QualityCesareanSection>(request, response), qualityCesareanSection); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("cesarean:qualityCesareanSection:view")
	@RequestMapping(value = "form")
	public String form(QualityCesareanSection qualityCesareanSection, Model model) {
		model.addAttribute("qualityCesareanSection", qualityCesareanSection);
		return "modules/cesarean/qualityCesareanSectionForm";
	}

	/**
	 * 保存剖宫产
	 */
	@RequiresPermissions("cesarean:qualityCesareanSection:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityCesareanSection qualityCesareanSection) {
		qualityCesareanSectionService.save(qualityCesareanSection);
		String result = qualityCesareanSectionService.upload(qualityCesareanSection);
		Gson gson = new Gson();

		UploadResult uploadResult = gson.fromJson(result, UploadResult.class);
		Integer resultCode = Optional.ofNullable(uploadResult).map(a->a.getCode()).orElse(null);
		if(resultCode==1000){
			String errorMessage = Optional.ofNullable(uploadResult).map(a->a.getMessage()).orElse("上传失败");
			return renderResult(Global.FALSE, text(errorMessage));
		}
		return renderResult(Global.TRUE, text("保存剖宫产成功！"));
	}
	
	/**
	 * 停用剖宫产
	 */
	@RequiresPermissions("cesarean:qualityCesareanSection:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityCesareanSection qualityCesareanSection) {
		qualityCesareanSection.setStatus(QualityCesareanSection.STATUS_DISABLE);
		qualityCesareanSectionService.updateStatus(qualityCesareanSection);
		return renderResult(Global.TRUE, text("停用剖宫产成功"));
	}
	
	/**
	 * 启用剖宫产
	 */
	@RequiresPermissions("cesarean:qualityCesareanSection:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityCesareanSection qualityCesareanSection) {
		qualityCesareanSection.setStatus(QualityCesareanSection.STATUS_NORMAL);
		qualityCesareanSectionService.updateStatus(qualityCesareanSection);
		return renderResult(Global.TRUE, text("启用剖宫产成功"));
	}
	
	/**
	 * 删除剖宫产
	 */
	@RequiresPermissions("cesarean:qualityCesareanSection:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityCesareanSection qualityCesareanSection) {
		qualityCesareanSectionService.delete(qualityCesareanSection);
		return renderResult(Global.TRUE, text("删除剖宫产成功！"));
	}
	
}