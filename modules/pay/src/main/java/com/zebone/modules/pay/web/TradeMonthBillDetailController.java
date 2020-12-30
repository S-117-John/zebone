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
import com.zebone.modules.pay.entity.TradeMonthBillDetail;
import com.zebone.modules.pay.service.TradeMonthBillDetailService;

/**
 * 月账单详情Controller
 * @author lijin
 * @version 2020-12-09
 */
@Controller
@RequestMapping(value = "${adminPath}/pay/tradeMonthBillDetail")
public class TradeMonthBillDetailController extends BaseController {

	@Autowired
	private TradeMonthBillDetailService tradeMonthBillDetailService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public TradeMonthBillDetail get(String id, boolean isNewRecord) {
		return tradeMonthBillDetailService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("pay:tradeMonthBillDetail:view")
	@RequestMapping(value = {"list", ""})
	public String list(TradeMonthBillDetail tradeMonthBillDetail, Model model) {
		model.addAttribute("tradeMonthBillDetail", tradeMonthBillDetail);
		return "modules/pay/tradeMonthBillDetailList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("pay:tradeMonthBillDetail:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<TradeMonthBillDetail> listData(TradeMonthBillDetail tradeMonthBillDetail, HttpServletRequest request, HttpServletResponse response) {
		Page<TradeMonthBillDetail> page = tradeMonthBillDetailService.findPage(new Page<TradeMonthBillDetail>(request, response), tradeMonthBillDetail); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("pay:tradeMonthBillDetail:view")
	@RequestMapping(value = "form")
	public String form(TradeMonthBillDetail tradeMonthBillDetail, Model model) {
		model.addAttribute("tradeMonthBillDetail", tradeMonthBillDetail);
		return "modules/pay/tradeMonthBillDetailForm";
	}

	/**
	 * 保存月账单详情
	 */
	@RequiresPermissions("pay:tradeMonthBillDetail:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated TradeMonthBillDetail tradeMonthBillDetail) {
		tradeMonthBillDetailService.save(tradeMonthBillDetail);
		return renderResult(Global.TRUE, text("保存月账单详情成功！"));
	}
	
	/**
	 * 停用月账单详情
	 */
	@RequiresPermissions("pay:tradeMonthBillDetail:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(TradeMonthBillDetail tradeMonthBillDetail) {
		tradeMonthBillDetail.setStatus(TradeMonthBillDetail.STATUS_DISABLE);
		tradeMonthBillDetailService.updateStatus(tradeMonthBillDetail);
		return renderResult(Global.TRUE, text("停用月账单详情成功"));
	}
	
	/**
	 * 启用月账单详情
	 */
	@RequiresPermissions("pay:tradeMonthBillDetail:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(TradeMonthBillDetail tradeMonthBillDetail) {
		tradeMonthBillDetail.setStatus(TradeMonthBillDetail.STATUS_NORMAL);
		tradeMonthBillDetailService.updateStatus(tradeMonthBillDetail);
		return renderResult(Global.TRUE, text("启用月账单详情成功"));
	}
	
	/**
	 * 删除月账单详情
	 */
	@RequiresPermissions("pay:tradeMonthBillDetail:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(TradeMonthBillDetail tradeMonthBillDetail) {
		tradeMonthBillDetailService.delete(tradeMonthBillDetail);
		return renderResult(Global.TRUE, text("删除月账单详情成功！"));
	}
	
}