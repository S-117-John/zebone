/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.gli.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.zebone.quality.domain.UploadService;
import com.zebone.quality.modules.common.UploadResult;
import com.zebone.quality.modules.gli.entity.Gli;
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
import com.zebone.quality.modules.gli.entity.QualityGli;
import com.zebone.quality.modules.gli.service.QualityGliService;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

/**
 * GLI胶质瘤（初发，手术治疗）Controller
 * @author 卡卡西
 * @version 2021-02-20
 */
@Controller
@RequestMapping(value = "${adminPath}/gli/qualityGli")
public class QualityGliController extends BaseController {

	@Autowired
	private QualityGliService qualityGliService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityGli get(String id, boolean isNewRecord) {
		return qualityGliService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("gli:qualityGli:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityGli qualityGli, Model model) {
		model.addAttribute("qualityGli", qualityGli);
		return "modules/gli/qualityGliList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("gli:qualityGli:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityGli> listData(QualityGli qualityGli, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityGli> page = qualityGliService.findPage(new Page<QualityGli>(request, response), qualityGli); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("gli:qualityGli:view")
	@RequestMapping(value = "form")
	public String form(QualityGli qualityGli, Model model) {
		model.addAttribute("qualityGli", qualityGli);
		return "modules/gli/qualityGliForm";
	}

	@Autowired
	private UploadService uploadService;
	/**
	 * 保存GLI胶质瘤（初发，手术治疗）
	 */
	@RequiresPermissions("gli:qualityGli:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityGli qualityGli) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		qualityGliService.save(qualityGli);

		String result = uploadService.upload(qualityGli,new Gli(),"GLI");
		Gson gson = new Gson();
		UploadResult uploadResult = gson.fromJson(result, UploadResult.class);
		Integer resultCode = Optional.ofNullable(uploadResult).map(a->a.getCode()).orElse(null);
		if(resultCode==1000){
			String errorMessage = Optional.ofNullable(uploadResult).map(a->a.getMessage()).orElse("上传失败");
			return renderResult(Global.FALSE, text(errorMessage));
		}



		return renderResult(Global.TRUE, text("保存GLI胶质瘤（初发，手术治疗）成功！"));
	}
	
	/**
	 * 停用GLI胶质瘤（初发，手术治疗）
	 */
	@RequiresPermissions("gli:qualityGli:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityGli qualityGli) {
		qualityGli.setStatus(QualityGli.STATUS_DISABLE);
		qualityGliService.updateStatus(qualityGli);
		return renderResult(Global.TRUE, text("停用GLI胶质瘤（初发，手术治疗）成功"));
	}
	
	/**
	 * 启用GLI胶质瘤（初发，手术治疗）
	 */
	@RequiresPermissions("gli:qualityGli:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityGli qualityGli) {
		qualityGli.setStatus(QualityGli.STATUS_NORMAL);
		qualityGliService.updateStatus(qualityGli);
		return renderResult(Global.TRUE, text("启用GLI胶质瘤（初发，手术治疗）成功"));
	}
	
	/**
	 * 删除GLI胶质瘤（初发，手术治疗）
	 */
	@RequiresPermissions("gli:qualityGli:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityGli qualityGli) {
		qualityGliService.delete(qualityGli);
		return renderResult(Global.TRUE, text("删除GLI胶质瘤（初发，手术治疗）成功！"));
	}
	
}