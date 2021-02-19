/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.pd.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.zebone.quality.domain.UploadService;
import com.zebone.quality.modules.common.UploadResult;
import com.zebone.quality.modules.gc.entity.Gc;
import com.zebone.quality.modules.pd.entity.Pd;
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
import com.zebone.quality.modules.pd.entity.QualityPd;
import com.zebone.quality.modules.pd.service.QualityPdService;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

/**
 * PD帕金森病Controller
 * @author 卡卡西
 * @version 2021-02-19
 */
@Controller
@RequestMapping(value = "${adminPath}/pd/qualityPd")
public class QualityPdController extends BaseController {

	@Autowired
	private QualityPdService qualityPdService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityPd get(String id, boolean isNewRecord) {
		return qualityPdService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("pd:qualityPd:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityPd qualityPd, Model model) {
		model.addAttribute("qualityPd", qualityPd);
		return "modules/pd/qualityPdList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("pd:qualityPd:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityPd> listData(QualityPd qualityPd, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityPd> page = qualityPdService.findPage(new Page<QualityPd>(request, response), qualityPd); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("pd:qualityPd:view")
	@RequestMapping(value = "form")
	public String form(QualityPd qualityPd, Model model) {
		model.addAttribute("qualityPd", qualityPd);
		return "modules/pd/qualityPdForm";
	}

	@Autowired
	private UploadService uploadService;

	/**
	 * 保存PD帕金森病
	 */
	@RequiresPermissions("pd:qualityPd:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityPd qualityPd) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		qualityPdService.save(qualityPd);

		String result = uploadService.upload(qualityPd,new Pd(),"PD");
		Gson gson = new Gson();
		UploadResult uploadResult = gson.fromJson(result, UploadResult.class);
		Integer resultCode = Optional.ofNullable(uploadResult).map(a->a.getCode()).orElse(null);
		if(resultCode==1000){
			String errorMessage = Optional.ofNullable(uploadResult).map(a->a.getMessage()).orElse("上传失败");
			return renderResult(Global.FALSE, text(errorMessage));
		}

		return renderResult(Global.TRUE, text("保存PD帕金森病成功！"));
	}
	
	/**
	 * 停用PD帕金森病
	 */
	@RequiresPermissions("pd:qualityPd:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityPd qualityPd) {
		qualityPd.setStatus(QualityPd.STATUS_DISABLE);
		qualityPdService.updateStatus(qualityPd);
		return renderResult(Global.TRUE, text("停用PD帕金森病成功"));
	}
	
	/**
	 * 启用PD帕金森病
	 */
	@RequiresPermissions("pd:qualityPd:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityPd qualityPd) {
		qualityPd.setStatus(QualityPd.STATUS_NORMAL);
		qualityPdService.updateStatus(qualityPd);
		return renderResult(Global.TRUE, text("启用PD帕金森病成功"));
	}
	
	/**
	 * 删除PD帕金森病
	 */
	@RequiresPermissions("pd:qualityPd:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityPd qualityPd) {
		qualityPdService.delete(qualityPd);
		return renderResult(Global.TRUE, text("删除PD帕金森病成功！"));
	}
	
}