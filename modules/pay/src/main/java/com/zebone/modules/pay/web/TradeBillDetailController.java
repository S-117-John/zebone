/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.modules.pay.web;

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
import com.zebone.modules.pay.entity.TradeBillDetail;
import com.zebone.modules.pay.service.TradeBillDetailService;

/**
 * 账单明细Controller
 * @author lijin
 * @version 2020-12-09
 */
@Controller
@RequestMapping(value = "${adminPath}/pay/tradeBillDetail")
public class TradeBillDetailController extends BaseController {

	@Autowired
	private TradeBillDetailService tradeBillDetailService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public TradeBillDetail get(String id, boolean isNewRecord) {
		return tradeBillDetailService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("pay:tradeBillDetail:view")
	@RequestMapping(value = {"list", ""})
	public String list(TradeBillDetail tradeBillDetail, Model model) {
		model.addAttribute("tradeBillDetail", tradeBillDetail);
		return "modules/pay/tradeBillDetailList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("pay:tradeBillDetail:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<TradeBillDetail> listData(TradeBillDetail tradeBillDetail, HttpServletRequest request, HttpServletResponse response) {
		Page<TradeBillDetail> page = tradeBillDetailService.findPage(new Page<TradeBillDetail>(request, response), tradeBillDetail); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("pay:tradeBillDetail:view")
	@RequestMapping(value = "form")
	public String form(TradeBillDetail tradeBillDetail, Model model) {
		model.addAttribute("tradeBillDetail", tradeBillDetail);
		return "modules/pay/tradeBillDetailForm";
	}

	/**
	 * 保存账单明细
	 */
	@RequiresPermissions("pay:tradeBillDetail:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated TradeBillDetail tradeBillDetail) {
		tradeBillDetailService.save(tradeBillDetail);
		return renderResult(Global.TRUE, text("保存账单明细成功！"));
	}
	
	/**
	 * 停用账单明细
	 */
	@RequiresPermissions("pay:tradeBillDetail:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(TradeBillDetail tradeBillDetail) {
		tradeBillDetail.setStatus(TradeBillDetail.STATUS_DISABLE);
		tradeBillDetailService.updateStatus(tradeBillDetail);
		return renderResult(Global.TRUE, text("停用账单明细成功"));
	}
	
	/**
	 * 启用账单明细
	 */
	@RequiresPermissions("pay:tradeBillDetail:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(TradeBillDetail tradeBillDetail) {
		tradeBillDetail.setStatus(TradeBillDetail.STATUS_NORMAL);
		tradeBillDetailService.updateStatus(tradeBillDetail);
		return renderResult(Global.TRUE, text("启用账单明细成功"));
	}
	
	/**
	 * 删除账单明细
	 */
	@RequiresPermissions("pay:tradeBillDetail:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(TradeBillDetail tradeBillDetail) {
		tradeBillDetailService.delete(tradeBillDetail);
		return renderResult(Global.TRUE, text("删除账单明细成功！"));
	}
	
}