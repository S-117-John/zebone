/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.gc.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.zebone.quality.domain.UploadService;
import com.zebone.quality.modules.cac.entity.Cac;
import com.zebone.quality.modules.common.UploadResult;
import com.zebone.quality.modules.gc.entity.Gc;
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
import com.zebone.quality.modules.gc.entity.QualityGc;
import com.zebone.quality.modules.gc.service.QualityGcService;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

/**
 * quality_gcController
 * @author 卡卡西
 * @version 2021-02-19
 */
@Controller
@RequestMapping(value = "${adminPath}/gc/qualityGc")
public class QualityGcController extends BaseController {

	@Autowired
	private QualityGcService qualityGcService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityGc get(String id, boolean isNewRecord) {
		return qualityGcService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("gc:qualityGc:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityGc qualityGc, Model model) {
		model.addAttribute("qualityGc", qualityGc);
		return "modules/gc/qualityGcList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("gc:qualityGc:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityGc> listData(QualityGc qualityGc, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityGc> page = qualityGcService.findPage(new Page<QualityGc>(request, response), qualityGc); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("gc:qualityGc:view")
	@RequestMapping(value = "form")
	public String form(QualityGc qualityGc, Model model) {
		model.addAttribute("qualityGc", qualityGc);
		return "modules/gc/qualityGcForm";
	}

	@Autowired
	private UploadService uploadService;
	/**
	 * 保存GC胃癌（手术治疗）
	 */
	@RequiresPermissions("gc:qualityGc:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityGc qualityGc) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		qualityGcService.save(qualityGc);

		String result = uploadService.upload(qualityGc,new Gc(),"GC");
		Gson gson = new Gson();
		UploadResult uploadResult = gson.fromJson(result, UploadResult.class);
		Integer resultCode = Optional.ofNullable(uploadResult).map(a->a.getCode()).orElse(null);
		if(resultCode==1000){
			String errorMessage = Optional.ofNullable(uploadResult).map(a->a.getMessage()).orElse("上传失败");
			return renderResult(Global.FALSE, text(errorMessage));
		}

		return renderResult(Global.TRUE, text("保存GC胃癌（手术治疗）成功！"));
	}
	
	/**
	 * 停用GC胃癌（手术治疗）
	 */
	@RequiresPermissions("gc:qualityGc:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityGc qualityGc) {
		qualityGc.setStatus(QualityGc.STATUS_DISABLE);
		qualityGcService.updateStatus(qualityGc);
		return renderResult(Global.TRUE, text("停用GC胃癌（手术治疗）成功"));
	}
	
	/**
	 * 启用GC胃癌（手术治疗）
	 */
	@RequiresPermissions("gc:qualityGc:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityGc qualityGc) {
		qualityGc.setStatus(QualityGc.STATUS_NORMAL);
		qualityGcService.updateStatus(qualityGc);
		return renderResult(Global.TRUE, text("启用GC胃癌（手术治疗）成功"));
	}
	
	/**
	 * 删除GC胃癌（手术治疗）
	 */
	@RequiresPermissions("gc:qualityGc:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityGc qualityGc) {
		qualityGcService.delete(qualityGc);
		return renderResult(Global.TRUE, text("删除GC胃癌（手术治疗）成功！"));
	}
	
}