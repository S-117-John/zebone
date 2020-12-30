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
import com.zebone.modules.pay.entity.TradeDayBillDetail;
import com.zebone.modules.pay.service.TradeDayBillDetailService;

/**
 * 日账单明细Controller
 * @author lijin
 * @version 2020-12-09
 */
@Controller
@RequestMapping(value = "${adminPath}/pay/tradeDayBillDetail")
public class TradeDayBillDetailController extends BaseController {

	@Autowired
	private TradeDayBillDetailService tradeDayBillDetailService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public TradeDayBillDetail get(String id, boolean isNewRecord) {
		return tradeDayBillDetailService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("pay:tradeDayBillDetail:view")
	@RequestMapping(value = {"list", ""})
	public String list(TradeDayBillDetail tradeDayBillDetail, Model model) {
		model.addAttribute("tradeDayBillDetail", tradeDayBillDetail);
		return "modules/pay/tradeDayBillDetailList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("pay:tradeDayBillDetail:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<TradeDayBillDetail> listData(TradeDayBillDetail tradeDayBillDetail, HttpServletRequest request, HttpServletResponse response) {
		Page<TradeDayBillDetail> page = tradeDayBillDetailService.findPage(new Page<TradeDayBillDetail>(request, response), tradeDayBillDetail); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("pay:tradeDayBillDetail:view")
	@RequestMapping(value = "form")
	public String form(TradeDayBillDetail tradeDayBillDetail, Model model) {
		model.addAttribute("tradeDayBillDetail", tradeDayBillDetail);
		return "modules/pay/tradeDayBillDetailForm";
	}

	/**
	 * 保存日账单明细
	 */
	@RequiresPermissions("pay:tradeDayBillDetail:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated TradeDayBillDetail tradeDayBillDetail) {
		tradeDayBillDetailService.save(tradeDayBillDetail);
		return renderResult(Global.TRUE, text("保存日账单明细成功！"));
	}
	
	/**
	 * 停用日账单明细
	 */
	@RequiresPermissions("pay:tradeDayBillDetail:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(TradeDayBillDetail tradeDayBillDetail) {
		tradeDayBillDetail.setStatus(TradeDayBillDetail.STATUS_DISABLE);
		tradeDayBillDetailService.updateStatus(tradeDayBillDetail);
		return renderResult(Global.TRUE, text("停用日账单明细成功"));
	}
	
	/**
	 * 启用日账单明细
	 */
	@RequiresPermissions("pay:tradeDayBillDetail:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(TradeDayBillDetail tradeDayBillDetail) {
		tradeDayBillDetail.setStatus(TradeDayBillDetail.STATUS_NORMAL);
		tradeDayBillDetailService.updateStatus(tradeDayBillDetail);
		return renderResult(Global.TRUE, text("启用日账单明细成功"));
	}
	
	/**
	 * 删除日账单明细
	 */
	@RequiresPermissions("pay:tradeDayBillDetail:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(TradeDayBillDetail tradeDayBillDetail) {
		tradeDayBillDetailService.delete(tradeDayBillDetail);
		return renderResult(Global.TRUE, text("删除日账单明细成功！"));
	}
	
}