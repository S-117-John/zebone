/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.modules.ali.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zebone.modules.ali.vo.AliConfigVO;
import com.zebone.modules.merchant.entity.PayMerchant;
import com.zebone.modules.merchant.service.PayMerchantService;
import com.zebone.modules.repository.AliConfigRepository;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.BeanUtils;
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
import com.zebone.modules.ali.entity.AliConfig;
import com.zebone.modules.ali.service.AliConfigService;

import java.util.ArrayList;
import java.util.List;

/**
 * 支付宝配置Controller
 * @author lijin
 * @version 2020-12-08
 */
@Controller
@RequestMapping(value = "${adminPath}/ali/aliConfig")
public class AliConfigController extends BaseController {

	@Autowired
	private AliConfigService aliConfigService;

	@Autowired
	private PayMerchantService payMerchantService;

	@Autowired
	private AliConfigRepository aliConfigRepository;

	/**
	 * 获取数据
	 */
	@ModelAttribute
	public AliConfig get(String id, boolean isNewRecord) {
		return aliConfigService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("ali:aliConfig:view")
	@RequestMapping(value = {"list", ""})
	public String list(AliConfig aliConfig, Model model) {
		model.addAttribute("aliConfig", aliConfig);
		return "modules/ali/aliConfigList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("ali:aliConfig:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<AliConfigVO> listData(AliConfig aliConfig, HttpServletRequest request, HttpServletResponse response) {
		Page<AliConfig> page = aliConfigService.findPage(new Page<AliConfig>(request, response), aliConfig);
		List<AliConfig> aliConfigList = page.getList();
		List<AliConfigVO> aliConfigVOList = new ArrayList<>();
		Page<AliConfigVO> voPage = new Page<>();
		BeanUtils.copyProperties(page,voPage);
		for (int i = 0; i < aliConfigList.size(); i++) {
			PayMerchant payMerchant = new PayMerchant();
			payMerchant.setId(aliConfigList.get(i).getMerchantId());
			payMerchant = payMerchantService.get(payMerchant);
			AliConfigVO aliConfigVO = new AliConfigVO();
			BeanUtils.copyProperties(aliConfigList.get(i),aliConfigVO);
			aliConfigVO.setMerchantName(payMerchant.getName());
			aliConfigVOList.add(aliConfigVO);
		}
		voPage.setList(aliConfigVOList);
		return voPage;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("ali:aliConfig:view")
	@RequestMapping(value = "form")
	public String form(AliConfig aliConfig, Model model) {
		model.addAttribute("aliConfig", aliConfig);
		List<PayMerchant> merchantList = payMerchantService.findList(new PayMerchant());
		model.addAttribute("merchantList", merchantList);
		return "modules/ali/aliConfigForm";
	}

	/**
	 * 保存支付宝配置
	 */
	@RequiresPermissions("ali:aliConfig:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated AliConfig aliConfig) {
		aliConfigService.save(aliConfig);
		return renderResult(Global.TRUE, text("保存支付宝配置成功！"));
	}
	
	/**
	 * 停用支付宝配置
	 */
	@RequiresPermissions("ali:aliConfig:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(AliConfig aliConfig) {
		aliConfig.setStatus(AliConfig.STATUS_DISABLE);
		aliConfigService.updateStatus(aliConfig);
		return renderResult(Global.TRUE, text("停用支付宝配置成功"));
	}
	
	/**
	 * 启用支付宝配置
	 */
	@RequiresPermissions("ali:aliConfig:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(AliConfig aliConfig) {
		aliConfig.setStatus(AliConfig.STATUS_NORMAL);
		aliConfigService.updateStatus(aliConfig);
		return renderResult(Global.TRUE, text("启用支付宝配置成功"));
	}
	
	/**
	 * 删除支付宝配置
	 */
	@RequiresPermissions("ali:aliConfig:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(AliConfig aliConfig) {
//		aliConfigService.delete(aliConfig);
		aliConfigRepository.delete(aliConfig.getId());
		return renderResult(Global.TRUE, text("删除支付宝配置成功！"));
	}
	
}