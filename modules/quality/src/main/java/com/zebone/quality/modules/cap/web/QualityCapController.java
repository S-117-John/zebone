/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.cap.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.zebone.quality.domain.UploadService;
import com.zebone.quality.modules.cap.entity.Cap;
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
import com.zebone.quality.modules.cap.entity.QualityCap;
import com.zebone.quality.modules.cap.service.QualityCapService;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

/**
 * Cap社区获得性肺炎（儿童，首次住院）Controller
 * @author 卡卡西
 * @version 2021-01-22
 */
@Controller
@RequestMapping(value = "${adminPath}/cap/qualityCap")
public class QualityCapController extends BaseController {

	@Autowired
	private QualityCapService qualityCapService;

	@Autowired
	private UploadService uploadService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityCap get(String id, boolean isNewRecord) {
		return qualityCapService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("cap:qualityCap:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityCap qualityCap, Model model) {
		model.addAttribute("qualityCap", qualityCap);
		return "modules/cap/qualityCapList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("cap:qualityCap:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityCap> listData(QualityCap qualityCap, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityCap> page = qualityCapService.findPage(new Page<QualityCap>(request, response), qualityCap); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("cap:qualityCap:view")
	@RequestMapping(value = "form")
	public String form(QualityCap qualityCap, Model model) {
		model.addAttribute("qualityCap", qualityCap);
		return "modules/cap/qualityCapForm";
	}

	/**
	 * 保存Cap社区获得性肺炎（儿童，首次住院）
	 */
	@RequiresPermissions("cap:qualityCap:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityCap qualityCap) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		qualityCapService.save(qualityCap);

		String result = uploadService.upload(qualityCap,new Cap(),"CAP");
		Gson gson = new Gson();
		UploadResult uploadResult = gson.fromJson(result, UploadResult.class);
		Integer resultCode = Optional.ofNullable(uploadResult).map(a->a.getCode()).orElse(null);
		if(resultCode==1000){
			String errorMessage = Optional.ofNullable(uploadResult).map(a->a.getMessage()).orElse("上传失败");
			return renderResult(Global.FALSE, text(errorMessage));
		}

		return renderResult(Global.TRUE, text("保存Cap社区获得性肺炎（儿童，首次住院）成功！"));
	}
	
	/**
	 * 停用Cap社区获得性肺炎（儿童，首次住院）
	 */
	@RequiresPermissions("cap:qualityCap:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityCap qualityCap) {
		qualityCap.setStatus(QualityCap.STATUS_DISABLE);
		qualityCapService.updateStatus(qualityCap);
		return renderResult(Global.TRUE, text("停用Cap社区获得性肺炎（儿童，首次住院）成功"));
	}
	
	/**
	 * 启用Cap社区获得性肺炎（儿童，首次住院）
	 */
	@RequiresPermissions("cap:qualityCap:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityCap qualityCap) {
		qualityCap.setStatus(QualityCap.STATUS_NORMAL);
		qualityCapService.updateStatus(qualityCap);
		return renderResult(Global.TRUE, text("启用Cap社区获得性肺炎（儿童，首次住院）成功"));
	}
	
	/**
	 * 删除Cap社区获得性肺炎（儿童，首次住院）
	 */
	@RequiresPermissions("cap:qualityCap:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityCap qualityCap) {
		qualityCapService.delete(qualityCap);
		return renderResult(Global.TRUE, text("删除Cap社区获得性肺炎（儿童，首次住院）成功！"));
	}
	
}