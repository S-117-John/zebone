/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.hf.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zebone.quality.infrastructure.entity.HfDO;
import com.zebone.quality.modules.hf.repository.HfRepository;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jeesite.common.config.Global;
import com.jeesite.common.entity.Page;
import com.jeesite.common.web.BaseController;
import com.zebone.quality.modules.hf.entity.QualityHf;
import com.zebone.quality.modules.hf.service.QualityHfService;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/**
 * HF心力衰竭Controller
 * @author 卡卡西
 * @version 2021-01-28
 */
@Controller
@RequestMapping(value = "${adminPath}/hf/qualityHf")
public class QualityHfController extends BaseController {

	@Autowired
	private QualityHfService qualityHfService;

	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityHf get(String id, boolean isNewRecord) throws InvocationTargetException, IllegalAccessException {
		if(!StringUtils.isEmpty(id)&&!isNewRecord){
			Map<String,Object> result = qualityHfService.findById(id);
			QualityHf qualityHf = new QualityHf();
			BeanUtils.populate(qualityHf,result);
			return qualityHf;
		}else {
			return qualityHfService.get(id, isNewRecord);
		}
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("hf:qualityHf:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityHf qualityHf, Model model) {
		model.addAttribute("qualityHf", qualityHf);
		return "modules/hf/qualityHfList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("hf:qualityHf:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityHf> listData(QualityHf qualityHf, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityHf> page = qualityHfService.findPage(new Page<QualityHf>(request, response), qualityHf); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("hf:qualityHf:view")
	@RequestMapping(value = "form")
	public String form(QualityHf qualityHf, Model model) {
		model.addAttribute("qualityHf", qualityHf);
		return "modules/hf/qualityHfForm";
	}



	/**
	 * 保存HF心力衰竭
	 */
	@RequiresPermissions("hf:qualityHf:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityHf qualityHf) {
		qualityHfService.save(qualityHf);
		return renderResult(Global.TRUE, text("保存HF心力衰竭成功！"));
	}
	
	/**
	 * 停用HF心力衰竭
	 */
	@RequiresPermissions("hf:qualityHf:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityHf qualityHf) {
		qualityHf.setStatus(QualityHf.STATUS_DISABLE);
		qualityHfService.updateStatus(qualityHf);
		return renderResult(Global.TRUE, text("停用HF心力衰竭成功"));
	}
	
	/**
	 * 启用HF心力衰竭
	 */
	@RequiresPermissions("hf:qualityHf:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityHf qualityHf) {
		qualityHf.setStatus(QualityHf.STATUS_NORMAL);
		qualityHfService.updateStatus(qualityHf);
		return renderResult(Global.TRUE, text("启用HF心力衰竭成功"));
	}
	
	/**
	 * 删除HF心力衰竭
	 */
	@RequiresPermissions("hf:qualityHf:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityHf qualityHf) {
		qualityHfService.delete(qualityHf);
		return renderResult(Global.TRUE, text("删除HF心力衰竭成功！"));
	}
	
}