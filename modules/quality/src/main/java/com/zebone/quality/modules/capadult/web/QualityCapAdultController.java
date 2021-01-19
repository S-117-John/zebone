/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.capadult.web;

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
import com.zebone.quality.modules.capadult.entity.QualityCapAdult;
import com.zebone.quality.modules.capadult.service.QualityCapAdultService;

/**
 * Cap-Adult社区获得性肺炎（成人，首次住院）Controller
 * @author 卡卡西
 * @version 2021-01-18
 */
@Controller
@RequestMapping(value = "${adminPath}/capadult/qualityCapAdult")
public class QualityCapAdultController extends BaseController {

	@Autowired
	private QualityCapAdultService qualityCapAdultService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityCapAdult get(String id, boolean isNewRecord) {
		return qualityCapAdultService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("capadult:qualityCapAdult:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityCapAdult qualityCapAdult, Model model) {
		model.addAttribute("qualityCapAdult", qualityCapAdult);
		return "modules/capadult/qualityCapAdultList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("capadult:qualityCapAdult:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityCapAdult> listData(QualityCapAdult qualityCapAdult, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityCapAdult> page = qualityCapAdultService.findPage(new Page<QualityCapAdult>(request, response), qualityCapAdult); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("capadult:qualityCapAdult:view")
	@RequestMapping(value = "form")
	public String form(QualityCapAdult qualityCapAdult, Model model) {
		model.addAttribute("qualityCapAdult", qualityCapAdult);
		return "modules/capadult/qualityCapAdultForm";
	}

	/**
	 * 保存Cap-Adult社区获得性肺炎（成人，首次住院）
	 */
	@RequiresPermissions("capadult:qualityCapAdult:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityCapAdult qualityCapAdult) {
		qualityCapAdultService.save(qualityCapAdult);
		return renderResult(Global.TRUE, text("保存Cap-Adult社区获得性肺炎（成人，首次住院）成功！"));
	}
	
	/**
	 * 停用Cap-Adult社区获得性肺炎（成人，首次住院）
	 */
	@RequiresPermissions("capadult:qualityCapAdult:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityCapAdult qualityCapAdult) {
		qualityCapAdult.setStatus(QualityCapAdult.STATUS_DISABLE);
		qualityCapAdultService.updateStatus(qualityCapAdult);
		return renderResult(Global.TRUE, text("停用Cap-Adult社区获得性肺炎（成人，首次住院）成功"));
	}
	
	/**
	 * 启用Cap-Adult社区获得性肺炎（成人，首次住院）
	 */
	@RequiresPermissions("capadult:qualityCapAdult:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityCapAdult qualityCapAdult) {
		qualityCapAdult.setStatus(QualityCapAdult.STATUS_NORMAL);
		qualityCapAdultService.updateStatus(qualityCapAdult);
		return renderResult(Global.TRUE, text("启用Cap-Adult社区获得性肺炎（成人，首次住院）成功"));
	}
	
	/**
	 * 删除Cap-Adult社区获得性肺炎（成人，首次住院）
	 */
	@RequiresPermissions("capadult:qualityCapAdult:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityCapAdult qualityCapAdult) {
		qualityCapAdultService.delete(qualityCapAdult);
		return renderResult(Global.TRUE, text("删除Cap-Adult社区获得性肺炎（成人，首次住院）成功！"));
	}
	
}