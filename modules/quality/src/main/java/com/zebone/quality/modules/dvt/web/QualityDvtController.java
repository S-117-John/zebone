/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.dvt.web;

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
import com.zebone.quality.modules.dvt.entity.QualityDvt;
import com.zebone.quality.modules.dvt.service.QualityDvtService;

/**
 * DVT围手术期预防深静脉血栓栓塞Controller
 * @author 卡卡西
 * @version 2021-01-19
 */
@Controller
@RequestMapping(value = "${adminPath}/dvt/qualityDvt")
public class QualityDvtController extends BaseController {

	@Autowired
	private QualityDvtService qualityDvtService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityDvt get(String id, boolean isNewRecord) {
		return qualityDvtService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("dvt:qualityDvt:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityDvt qualityDvt, Model model) {
		model.addAttribute("qualityDvt", qualityDvt);
		return "modules/dvt/qualityDvtList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("dvt:qualityDvt:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityDvt> listData(QualityDvt qualityDvt, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityDvt> page = qualityDvtService.findPage(new Page<QualityDvt>(request, response), qualityDvt); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("dvt:qualityDvt:view")
	@RequestMapping(value = "form")
	public String form(QualityDvt qualityDvt, Model model) {
		model.addAttribute("qualityDvt", qualityDvt);
		return "modules/dvt/qualityDvtForm";
	}

	/**
	 * 保存DVT围手术期预防深静脉血栓栓塞
	 */
	@RequiresPermissions("dvt:qualityDvt:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityDvt qualityDvt) {
		qualityDvtService.save(qualityDvt);
		return renderResult(Global.TRUE, text("保存DVT围手术期预防深静脉血栓栓塞成功！"));
	}
	
	/**
	 * 停用DVT围手术期预防深静脉血栓栓塞
	 */
	@RequiresPermissions("dvt:qualityDvt:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityDvt qualityDvt) {
		qualityDvt.setStatus(QualityDvt.STATUS_DISABLE);
		qualityDvtService.updateStatus(qualityDvt);
		return renderResult(Global.TRUE, text("停用DVT围手术期预防深静脉血栓栓塞成功"));
	}
	
	/**
	 * 启用DVT围手术期预防深静脉血栓栓塞
	 */
	@RequiresPermissions("dvt:qualityDvt:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityDvt qualityDvt) {
		qualityDvt.setStatus(QualityDvt.STATUS_NORMAL);
		qualityDvtService.updateStatus(qualityDvt);
		return renderResult(Global.TRUE, text("启用DVT围手术期预防深静脉血栓栓塞成功"));
	}
	
	/**
	 * 删除DVT围手术期预防深静脉血栓栓塞
	 */
	@RequiresPermissions("dvt:qualityDvt:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityDvt qualityDvt) {
		qualityDvtService.delete(qualityDvt);
		return renderResult(Global.TRUE, text("删除DVT围手术期预防深静脉血栓栓塞成功！"));
	}
	
}