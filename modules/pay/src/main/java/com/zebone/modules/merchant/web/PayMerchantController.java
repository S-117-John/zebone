/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.modules.merchant.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import com.zebone.modules.merchant.entity.PayMerchant;
import com.zebone.modules.merchant.service.PayMerchantService;

/**
 * 商户信息Controller
 * @author lijin
 * @version 2020-12-08
 */
@Controller
@RequestMapping(value = "${adminPath}/merchant/payMerchant")
public class PayMerchantController extends BaseController {

	@Autowired
	private PayMerchantService payMerchantService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public PayMerchant get(String id, boolean isNewRecord) {
		return payMerchantService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("merchant:payMerchant:view")
	@RequestMapping(value = {"list", ""})
	public String list(PayMerchant payMerchant, Model model) {
		model.addAttribute("payMerchant", payMerchant);
		return "modules/merchant/payMerchantList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("merchant:payMerchant:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<PayMerchant> listData(PayMerchant payMerchant, HttpServletRequest request, HttpServletResponse response) {
		Page<PayMerchant> page = payMerchantService.findPage(new Page<PayMerchant>(request, response), payMerchant); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("merchant:payMerchant:view")
	@RequestMapping(value = "form")
	public String form(PayMerchant payMerchant, Model model) {
		model.addAttribute("payMerchant", payMerchant);
		return "modules/merchant/payMerchantForm";
	}

	/**
	 * 保存商户信息
	 */
	@RequiresPermissions("merchant:payMerchant:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated PayMerchant payMerchant) {
		payMerchantService.save(payMerchant);
		return renderResult(Global.TRUE, text("保存商户信息成功！"));
	}
	
	/**
	 * 停用商户信息
	 */
	@RequiresPermissions("merchant:payMerchant:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(PayMerchant payMerchant) {
		payMerchant.setStatus(PayMerchant.STATUS_DISABLE);
		payMerchantService.updateStatus(payMerchant);
		return renderResult(Global.TRUE, text("停用商户信息成功"));
	}
	
	/**
	 * 启用商户信息
	 */
	@RequiresPermissions("merchant:payMerchant:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(PayMerchant payMerchant) {
		payMerchant.setStatus(PayMerchant.STATUS_NORMAL);
		payMerchantService.updateStatus(payMerchant);
		return renderResult(Global.TRUE, text("启用商户信息成功"));
	}
	
	/**
	 * 删除商户信息
	 */
	@RequiresPermissions("merchant:payMerchant:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(PayMerchant payMerchant) {
		payMerchantService.delete(payMerchant);
		return renderResult(Global.TRUE, text("删除商户信息成功！"));
	}
	
}