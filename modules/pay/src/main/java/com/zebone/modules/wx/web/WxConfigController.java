/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.modules.wx.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zebone.modules.merchant.entity.PayMerchant;
import com.zebone.modules.merchant.service.PayMerchantService;
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
import com.zebone.modules.wx.entity.WxConfig;
import com.zebone.modules.wx.service.WxConfigService;

import java.util.List;

/**
 * 微信配置Controller
 * @author lijin
 * @version 2020-12-08
 */
@Controller
@RequestMapping(value = "${adminPath}/wx/wxConfig")
public class WxConfigController extends BaseController {

	@Autowired
	private WxConfigService wxConfigService;

	@Autowired
	private PayMerchantService payMerchantService;

	/**
	 * 获取数据
	 */
	@ModelAttribute
	public WxConfig get(String id, boolean isNewRecord) {
		return wxConfigService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("wx:wxConfig:view")
	@RequestMapping(value = {"list", ""})
	public String list(WxConfig wxConfig, Model model) {
		model.addAttribute("wxConfig", wxConfig);
		return "modules/wx/wxConfigList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("wx:wxConfig:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<WxConfig> listData(WxConfig wxConfig, HttpServletRequest request, HttpServletResponse response) {
		Page<WxConfig> page = wxConfigService.findPage(new Page<WxConfig>(request, response), wxConfig); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("wx:wxConfig:view")
	@RequestMapping(value = "form")
	public String form(WxConfig wxConfig, Model model) {
		model.addAttribute("wxConfig", wxConfig);
		List<PayMerchant> merchantList = payMerchantService.findList(new PayMerchant());
		model.addAttribute("merchantList", merchantList);
		return "modules/wx/wxConfigForm";
	}

	/**
	 * 保存微信配置
	 */
	@RequiresPermissions("wx:wxConfig:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated WxConfig wxConfig) {
		wxConfigService.save(wxConfig);
		return renderResult(Global.TRUE, text("保存微信配置成功！"));
	}
	
	/**
	 * 停用微信配置
	 */
	@RequiresPermissions("wx:wxConfig:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(WxConfig wxConfig) {
		wxConfig.setStatus(WxConfig.STATUS_DISABLE);
		wxConfigService.updateStatus(wxConfig);
		return renderResult(Global.TRUE, text("停用微信配置成功"));
	}
	
	/**
	 * 启用微信配置
	 */
	@RequiresPermissions("wx:wxConfig:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(WxConfig wxConfig) {
		wxConfig.setStatus(WxConfig.STATUS_NORMAL);
		wxConfigService.updateStatus(wxConfig);
		return renderResult(Global.TRUE, text("启用微信配置成功"));
	}
	
	/**
	 * 删除微信配置
	 */
	@RequiresPermissions("wx:wxConfig:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(WxConfig wxConfig) {
		wxConfigService.delete(wxConfig);
		return renderResult(Global.TRUE, text("删除微信配置成功！"));
	}


}