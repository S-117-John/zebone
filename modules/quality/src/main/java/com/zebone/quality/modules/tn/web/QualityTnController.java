/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.tn.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.zebone.quality.domain.UploadService;
import com.zebone.quality.modules.cac.entity.Cac;
import com.zebone.quality.modules.common.UploadResult;
import com.zebone.quality.modules.tn.entity.Tn;
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
import com.zebone.quality.modules.tn.entity.QualityTn;
import com.zebone.quality.modules.tn.service.QualityTnService;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

/**
 * TN甲状腺结节（手术治疗）Controller
 * @author 卡卡西
 * @version 2021-02-19
 */
@Controller
@RequestMapping(value = "${adminPath}/tn/qualityTn")
public class QualityTnController extends BaseController {

	@Autowired
	private QualityTnService qualityTnService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityTn get(String id, boolean isNewRecord) {
		return qualityTnService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("tn:qualityTn:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityTn qualityTn, Model model) {
		model.addAttribute("qualityTn", qualityTn);
		return "modules/tn/qualityTnList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("tn:qualityTn:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityTn> listData(QualityTn qualityTn, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityTn> page = qualityTnService.findPage(new Page<QualityTn>(request, response), qualityTn); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("tn:qualityTn:view")
	@RequestMapping(value = "form")
	public String form(QualityTn qualityTn, Model model) {
		model.addAttribute("qualityTn", qualityTn);
		return "modules/tn/qualityTnForm";
	}

	@Autowired
	private UploadService uploadService;

	/**
	 * 保存TN甲状腺结节（手术治疗）
	 */
	@RequiresPermissions("tn:qualityTn:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityTn qualityTn) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		qualityTnService.save(qualityTn);


		String result = uploadService.upload(qualityTn,new Tn(),"TN");
		Gson gson = new Gson();
		UploadResult uploadResult = gson.fromJson(result, UploadResult.class);
		Integer resultCode = Optional.ofNullable(uploadResult).map(a->a.getCode()).orElse(null);
		if(resultCode==1000){
			String errorMessage = Optional.ofNullable(uploadResult).map(a->a.getMessage()).orElse("上传失败");
			return renderResult(Global.FALSE, text(errorMessage));
		}



		return renderResult(Global.TRUE, text("保存TN甲状腺结节（手术治疗）成功！"));
	}
	
	/**
	 * 停用TN甲状腺结节（手术治疗）
	 */
	@RequiresPermissions("tn:qualityTn:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityTn qualityTn) {
		qualityTn.setStatus(QualityTn.STATUS_DISABLE);
		qualityTnService.updateStatus(qualityTn);
		return renderResult(Global.TRUE, text("停用TN甲状腺结节（手术治疗）成功"));
	}
	
	/**
	 * 启用TN甲状腺结节（手术治疗）
	 */
	@RequiresPermissions("tn:qualityTn:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityTn qualityTn) {
		qualityTn.setStatus(QualityTn.STATUS_NORMAL);
		qualityTnService.updateStatus(qualityTn);
		return renderResult(Global.TRUE, text("启用TN甲状腺结节（手术治疗）成功"));
	}
	
	/**
	 * 删除TN甲状腺结节（手术治疗）
	 */
	@RequiresPermissions("tn:qualityTn:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityTn qualityTn) {
		qualityTnService.delete(qualityTn);
		return renderResult(Global.TRUE, text("删除TN甲状腺结节（手术治疗）成功！"));
	}
	
}