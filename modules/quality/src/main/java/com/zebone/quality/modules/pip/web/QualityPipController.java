/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.pip.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.zebone.quality.domain.UploadService;
import com.zebone.quality.modules.common.UploadResult;
import com.zebone.quality.modules.gli.entity.Gli;
import com.zebone.quality.modules.pip.entity.Pip;
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
import com.zebone.quality.modules.pip.entity.QualityPip;
import com.zebone.quality.modules.pip.service.QualityPipService;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

/**
 * PIP围手术期预防感染Controller
 * @author 卡卡西
 * @version 2021-02-20
 */
@Controller
@RequestMapping(value = "${adminPath}/pip/qualityPip")
public class QualityPipController extends BaseController {

	@Autowired
	private QualityPipService qualityPipService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityPip get(String id, boolean isNewRecord) {
		return qualityPipService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("pip:qualityPip:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityPip qualityPip, Model model) {
		model.addAttribute("qualityPip", qualityPip);
		return "modules/pip/qualityPipList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("pip:qualityPip:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityPip> listData(QualityPip qualityPip, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityPip> page = qualityPipService.findPage(new Page<QualityPip>(request, response), qualityPip); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("pip:qualityPip:view")
	@RequestMapping(value = "form")
	public String form(QualityPip qualityPip, Model model) {
		model.addAttribute("qualityPip", qualityPip);
		return "modules/pip/qualityPipForm";
	}

	@Autowired
	private UploadService uploadService;
	/**
	 * 保存PIP围手术期预防感染
	 */
	@RequiresPermissions("pip:qualityPip:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityPip qualityPip) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		qualityPipService.save(qualityPip);

		String result = uploadService.upload(qualityPip,new Pip(),"PIP");
		Gson gson = new Gson();
		UploadResult uploadResult = gson.fromJson(result, UploadResult.class);
		Integer resultCode = Optional.ofNullable(uploadResult).map(a->a.getCode()).orElse(null);
		if(resultCode==1000){
			String errorMessage = Optional.ofNullable(uploadResult).map(a->a.getMessage()).orElse("上传失败");
			return renderResult(Global.FALSE, text(errorMessage));
		}



		return renderResult(Global.TRUE, text("保存PIP围手术期预防感染成功！"));
	}
	
	/**
	 * 停用PIP围手术期预防感染
	 */
	@RequiresPermissions("pip:qualityPip:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityPip qualityPip) {
		qualityPip.setStatus(QualityPip.STATUS_DISABLE);
		qualityPipService.updateStatus(qualityPip);
		return renderResult(Global.TRUE, text("停用PIP围手术期预防感染成功"));
	}
	
	/**
	 * 启用PIP围手术期预防感染
	 */
	@RequiresPermissions("pip:qualityPip:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityPip qualityPip) {
		qualityPip.setStatus(QualityPip.STATUS_NORMAL);
		qualityPipService.updateStatus(qualityPip);
		return renderResult(Global.TRUE, text("启用PIP围手术期预防感染成功"));
	}
	
	/**
	 * 删除PIP围手术期预防感染
	 */
	@RequiresPermissions("pip:qualityPip:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityPip qualityPip) {
		qualityPipService.delete(qualityPip);
		return renderResult(Global.TRUE, text("删除PIP围手术期预防感染成功！"));
	}
	
}