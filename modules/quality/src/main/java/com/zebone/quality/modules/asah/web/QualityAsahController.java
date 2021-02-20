/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.asah.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.zebone.quality.domain.UploadService;
import com.zebone.quality.modules.common.UploadResult;
import com.zebone.quality.modules.gli.entity.Gli;
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
import com.zebone.quality.modules.asah.entity.QualityAsah;
import com.zebone.quality.modules.asah.service.QualityAsahService;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

/**
 * aSAH急性动脉瘤性蛛网膜下腔出血（初发，手术治疗）Controller
 * @author 卡卡西
 * @version 2021-02-20
 */
@Controller
@RequestMapping(value = "${adminPath}/asah/qualityAsah")
public class QualityAsahController extends BaseController {

	@Autowired
	private QualityAsahService qualityAsahService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityAsah get(String id, boolean isNewRecord) {
		return qualityAsahService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("asah:qualityAsah:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityAsah qualityAsah, Model model) {
		model.addAttribute("qualityAsah", qualityAsah);
		return "modules/asah/qualityAsahList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("asah:qualityAsah:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityAsah> listData(QualityAsah qualityAsah, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityAsah> page = qualityAsahService.findPage(new Page<QualityAsah>(request, response), qualityAsah); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("asah:qualityAsah:view")
	@RequestMapping(value = "form")
	public String form(QualityAsah qualityAsah, Model model) {
		model.addAttribute("qualityAsah", qualityAsah);
		return "modules/asah/qualityAsahForm";
	}

	@Autowired
	private UploadService uploadService;

	/**
	 * 保存aSAH急性动脉瘤性蛛网膜下腔出血（初发，手术治疗）
	 */
	@RequiresPermissions("asah:qualityAsah:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityAsah qualityAsah) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		qualityAsahService.save(qualityAsah);

		String result = uploadService.upload(qualityAsah,new Gli(),"ASAH");
		Gson gson = new Gson();
		UploadResult uploadResult = gson.fromJson(result, UploadResult.class);
		Integer resultCode = Optional.ofNullable(uploadResult).map(a->a.getCode()).orElse(null);
		if(resultCode==1000){
			String errorMessage = Optional.ofNullable(uploadResult).map(a->a.getMessage()).orElse("上传失败");
			return renderResult(Global.FALSE, text(errorMessage));
		}


		return renderResult(Global.TRUE, text("保存aSAH急性动脉瘤性蛛网膜下腔出血（初发，手术治疗）成功！"));
	}
	
	/**
	 * 停用aSAH急性动脉瘤性蛛网膜下腔出血（初发，手术治疗）
	 */
	@RequiresPermissions("asah:qualityAsah:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityAsah qualityAsah) {
		qualityAsah.setStatus(QualityAsah.STATUS_DISABLE);
		qualityAsahService.updateStatus(qualityAsah);
		return renderResult(Global.TRUE, text("停用aSAH急性动脉瘤性蛛网膜下腔出血（初发，手术治疗）成功"));
	}
	
	/**
	 * 启用aSAH急性动脉瘤性蛛网膜下腔出血（初发，手术治疗）
	 */
	@RequiresPermissions("asah:qualityAsah:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityAsah qualityAsah) {
		qualityAsah.setStatus(QualityAsah.STATUS_NORMAL);
		qualityAsahService.updateStatus(qualityAsah);
		return renderResult(Global.TRUE, text("启用aSAH急性动脉瘤性蛛网膜下腔出血（初发，手术治疗）成功"));
	}
	
	/**
	 * 删除aSAH急性动脉瘤性蛛网膜下腔出血（初发，手术治疗）
	 */
	@RequiresPermissions("asah:qualityAsah:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityAsah qualityAsah) {
		qualityAsahService.delete(qualityAsah);
		return renderResult(Global.TRUE, text("删除aSAH急性动脉瘤性蛛网膜下腔出血（初发，手术治疗）成功！"));
	}
	
}