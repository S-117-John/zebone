/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.bc.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.zebone.quality.domain.UploadService;
import com.zebone.quality.modules.bc.entity.Bc;
import com.zebone.quality.modules.cac.entity.Cac;
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
import com.zebone.quality.modules.bc.entity.QualityBc;
import com.zebone.quality.modules.bc.service.QualityBcService;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

/**
 * BC乳腺癌（手术治疗）Controller
 * @author 卡卡西
 * @version 2021-02-19
 */
@Controller
@RequestMapping(value = "${adminPath}/bc/qualityBc")
public class QualityBcController extends BaseController {

	@Autowired
	private QualityBcService qualityBcService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityBc get(String id, boolean isNewRecord) {
		return qualityBcService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("bc:qualityBc:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityBc qualityBc, Model model) {
		model.addAttribute("qualityBc", qualityBc);
		return "modules/bc/qualityBcList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("bc:qualityBc:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityBc> listData(QualityBc qualityBc, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityBc> page = qualityBcService.findPage(new Page<QualityBc>(request, response), qualityBc); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("bc:qualityBc:view")
	@RequestMapping(value = "form")
	public String form(QualityBc qualityBc, Model model) {
		model.addAttribute("qualityBc", qualityBc);
		return "modules/bc/qualityBcForm";
	}

	@Autowired
	private UploadService uploadService;

	/**
	 * 保存BC乳腺癌（手术治疗）
	 */
	@RequiresPermissions("bc:qualityBc:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityBc qualityBc) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		qualityBcService.save(qualityBc);

		String result = uploadService.upload(qualityBc,new Bc(),"BC");
		Gson gson = new Gson();
		UploadResult uploadResult = gson.fromJson(result, UploadResult.class);
		Integer resultCode = Optional.ofNullable(uploadResult).map(a->a.getCode()).orElse(null);
		if(resultCode==1000){
			String errorMessage = Optional.ofNullable(uploadResult).map(a->a.getMessage()).orElse("上传失败");
			return renderResult(Global.FALSE, text(errorMessage));
		}

		return renderResult(Global.TRUE, text("保存BC乳腺癌（手术治疗）成功！"));
	}
	
	/**
	 * 删除BC乳腺癌（手术治疗）
	 */
	@RequiresPermissions("bc:qualityBc:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityBc qualityBc) {
		qualityBcService.delete(qualityBc);
		return renderResult(Global.TRUE, text("删除BC乳腺癌（手术治疗）成功！"));
	}
	
}