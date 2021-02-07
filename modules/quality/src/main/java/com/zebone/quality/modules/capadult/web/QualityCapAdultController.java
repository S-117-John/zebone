/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.capadult.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.zebone.quality.domain.UploadService;
import com.zebone.quality.modules.capadult.entity.CapAdult;
import com.zebone.quality.modules.common.UploadResult;
import com.zebone.quality.modules.hf.entity.Hf;
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
import com.zebone.quality.modules.capadult.entity.QualityCapAdult;
import com.zebone.quality.modules.capadult.service.QualityCapAdultService;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

/**
 * Cap-Adult社区获得性肺炎（成人，首次住院）Controller
 * @author 卡卡西
 * @version 2021-02-07
 */
@Controller
@RequestMapping(value = "${adminPath}/capadult/qualityCapAdult")
public class QualityCapAdultController extends BaseController {

	@Autowired
	private QualityCapAdultService qualityCapAdultService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityCapAdult get(String id, boolean isNewRecord) {
		return qualityCapAdultService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("capadult:qualityCapAdult:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityCapAdult qualityCapAdult, Model model) {
		model.addAttribute("qualityCapAdult", qualityCapAdult);
		return "modules/capadult/qualityCapAdultList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("capadult:qualityCapAdult:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityCapAdult> listData(QualityCapAdult qualityCapAdult, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityCapAdult> page = qualityCapAdultService.findPage(new Page<QualityCapAdult>(request, response), qualityCapAdult); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("capadult:qualityCapAdult:view")
	@RequestMapping(value = "form")
	public String form(QualityCapAdult qualityCapAdult, Model model) {
		model.addAttribute("qualityCapAdult", qualityCapAdult);
		return "modules/capadult/qualityCapAdultForm";
	}

	@Autowired
	private UploadService uploadService;

	/**
	 * 保存Cap-Adult社区获得性肺炎（成人，首次住院）
	 */
	@RequiresPermissions("capadult:qualityCapAdult:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityCapAdult qualityCapAdult) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		qualityCapAdultService.save(qualityCapAdult);

		String result = uploadService.upload(qualityCapAdult,new CapAdult(),"CAP_ADULT");
		Gson gson = new Gson();
		UploadResult uploadResult = gson.fromJson(result, UploadResult.class);
		Integer resultCode = Optional.ofNullable(uploadResult).map(a->a.getCode()).orElse(null);
		if(resultCode==1000){
			String errorMessage = Optional.ofNullable(uploadResult).map(a->a.getMessage()).orElse("上传失败");
			return renderResult(Global.FALSE, text(errorMessage));
		}

		return renderResult(Global.TRUE, text("保存Cap-Adult社区获得性肺炎（成人，首次住院）成功！"));
	}
	
	/**
	 * 停用Cap-Adult社区获得性肺炎（成人，首次住院）
	 */
	@RequiresPermissions("capadult:qualityCapAdult:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityCapAdult qualityCapAdult) {
		qualityCapAdult.setStatus(QualityCapAdult.STATUS_DISABLE);
		qualityCapAdultService.updateStatus(qualityCapAdult);
		return renderResult(Global.TRUE, text("停用Cap-Adult社区获得性肺炎（成人，首次住院）成功"));
	}
	
	/**
	 * 启用Cap-Adult社区获得性肺炎（成人，首次住院）
	 */
	@RequiresPermissions("capadult:qualityCapAdult:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityCapAdult qualityCapAdult) {
		qualityCapAdult.setStatus(QualityCapAdult.STATUS_NORMAL);
		qualityCapAdultService.updateStatus(qualityCapAdult);
		return renderResult(Global.TRUE, text("启用Cap-Adult社区获得性肺炎（成人，首次住院）成功"));
	}
	
	/**
	 * 删除Cap-Adult社区获得性肺炎（成人，首次住院）
	 */
	@RequiresPermissions("capadult:qualityCapAdult:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityCapAdult qualityCapAdult) {
		qualityCapAdultService.delete(qualityCapAdult);
		return renderResult(Global.TRUE, text("删除Cap-Adult社区获得性肺炎（成人，首次住院）成功！"));
	}
	
}