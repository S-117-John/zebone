/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.pa.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.zebone.quality.domain.UploadService;
import com.zebone.quality.modules.common.UploadResult;
import com.zebone.quality.modules.lc.entity.Lc;
import com.zebone.quality.modules.pa.entity.Pa;
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
import com.zebone.quality.modules.pa.entity.QualityPa;
import com.zebone.quality.modules.pa.service.QualityPaService;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

/**
 * 垂体腺瘤（初发，手术治疗）Controller
 * @author 卡卡西
 * @version 2021-02-20
 */
@Controller
@RequestMapping(value = "${adminPath}/pa/qualityPa")
public class QualityPaController extends BaseController {

	@Autowired
	private QualityPaService qualityPaService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityPa get(String id, boolean isNewRecord) {
		return qualityPaService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("pa:qualityPa:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityPa qualityPa, Model model) {
		model.addAttribute("qualityPa", qualityPa);
		return "modules/pa/qualityPaList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("pa:qualityPa:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityPa> listData(QualityPa qualityPa, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityPa> page = qualityPaService.findPage(new Page<QualityPa>(request, response), qualityPa); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("pa:qualityPa:view")
	@RequestMapping(value = "form")
	public String form(QualityPa qualityPa, Model model) {
		model.addAttribute("qualityPa", qualityPa);
		return "modules/pa/qualityPaForm";
	}

	@Autowired
	private UploadService uploadService;
	/**
	 * 保存垂体腺瘤（初发，手术治疗）
	 */
	@RequiresPermissions("pa:qualityPa:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityPa qualityPa) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		qualityPaService.save(qualityPa);



		String result = uploadService.upload(qualityPa,new Pa(),"PA");
		Gson gson = new Gson();
		UploadResult uploadResult = gson.fromJson(result, UploadResult.class);
		Integer resultCode = Optional.ofNullable(uploadResult).map(a->a.getCode()).orElse(null);
		if(resultCode==1000){
			String errorMessage = Optional.ofNullable(uploadResult).map(a->a.getMessage()).orElse("上传失败");
			return renderResult(Global.FALSE, text(errorMessage));
		}

		return renderResult(Global.TRUE, text("保存垂体腺瘤（初发，手术治疗）成功！"));
	}
	
	/**
	 * 停用垂体腺瘤（初发，手术治疗）
	 */
	@RequiresPermissions("pa:qualityPa:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityPa qualityPa) {
		qualityPa.setStatus(QualityPa.STATUS_DISABLE);
		qualityPaService.updateStatus(qualityPa);
		return renderResult(Global.TRUE, text("停用垂体腺瘤（初发，手术治疗）成功"));
	}
	
	/**
	 * 启用垂体腺瘤（初发，手术治疗）
	 */
	@RequiresPermissions("pa:qualityPa:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityPa qualityPa) {
		qualityPa.setStatus(QualityPa.STATUS_NORMAL);
		qualityPaService.updateStatus(qualityPa);
		return renderResult(Global.TRUE, text("启用垂体腺瘤（初发，手术治疗）成功"));
	}
	
	/**
	 * 删除垂体腺瘤（初发，手术治疗）
	 */
	@RequiresPermissions("pa:qualityPa:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityPa qualityPa) {
		qualityPaService.delete(qualityPa);
		return renderResult(Global.TRUE, text("删除垂体腺瘤（初发，手术治疗）成功！"));
	}
	
}