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
import com.zebone.modules.pay.entity.TradeHisRecord;
import com.zebone.modules.pay.service.TradeHisRecordService;

/**
 * 院内交易记录Controller
 * @author lijin
 * @version 2020-12-08
 */
@Controller
@RequestMapping(value = "${adminPath}/pay/tradeHisRecord")
public class TradeHisRecordController extends BaseController {

	@Autowired
	private TradeHisRecordService tradeHisRecordService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public TradeHisRecord get(String id, boolean isNewRecord) {
		return tradeHisRecordService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("pay:tradeHisRecord:view")
	@RequestMapping(value = {"list", ""})
	public String list(TradeHisRecord tradeHisRecord, Model model) {
		model.addAttribute("tradeHisRecord", tradeHisRecord);
		return "modules/pay/tradeHisRecordList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("pay:tradeHisRecord:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<TradeHisRecord> listData(TradeHisRecord tradeHisRecord, HttpServletRequest request, HttpServletResponse response) {
		Page<TradeHisRecord> page = tradeHisRecordService.findPage(new Page<TradeHisRecord>(request, response), tradeHisRecord); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("pay:tradeHisRecord:view")
	@RequestMapping(value = "form")
	public String form(TradeHisRecord tradeHisRecord, Model model) {
		model.addAttribute("tradeHisRecord", tradeHisRecord);
		return "modules/pay/tradeHisRecordForm";
	}

	/**
	 * 保存院内交易记录
	 */
	@RequiresPermissions("pay:tradeHisRecord:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated TradeHisRecord tradeHisRecord) {
		tradeHisRecordService.save(tradeHisRecord);
		return renderResult(Global.TRUE, text("保存院内交易记录成功！"));
	}
	
	/**
	 * 停用院内交易记录
	 */
	@RequiresPermissions("pay:tradeHisRecord:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(TradeHisRecord tradeHisRecord) {
		tradeHisRecord.setStatus(TradeHisRecord.STATUS_DISABLE);
		tradeHisRecordService.updateStatus(tradeHisRecord);
		return renderResult(Global.TRUE, text("停用院内交易记录成功"));
	}
	
	/**
	 * 启用院内交易记录
	 */
	@RequiresPermissions("pay:tradeHisRecord:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(TradeHisRecord tradeHisRecord) {
		tradeHisRecord.setStatus(TradeHisRecord.STATUS_NORMAL);
		tradeHisRecordService.updateStatus(tradeHisRecord);
		return renderResult(Global.TRUE, text("启用院内交易记录成功"));
	}
	
	/**
	 * 删除院内交易记录
	 */
	@RequiresPermissions("pay:tradeHisRecord:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(TradeHisRecord tradeHisRecord) {
		tradeHisRecordService.delete(tradeHisRecord);
		return renderResult(Global.TRUE, text("删除院内交易记录成功！"));
	}
	
}