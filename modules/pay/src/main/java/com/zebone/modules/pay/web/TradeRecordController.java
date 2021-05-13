/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.modules.pay.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jeesite.common.lang.DateUtils;
import com.jeesite.common.utils.excel.ExcelExport;
import com.jeesite.modules.sys.entity.EmpUser;
import com.jeesite.modules.sys.entity.UserDataScope;
import com.zebone.modules.entity.ExcelRecord;
import com.zebone.modules.pay.entity.TradeMonthBillDetail;
import com.zebone.modules.repository.TradeRecordRepository;
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
import com.zebone.modules.pay.entity.TradeRecord;
import com.zebone.modules.pay.service.TradeRecordService;

import java.util.ArrayList;
import java.util.List;

/**
 * 交易记录Controller
 * @author lijin
 * @version 2020-12-08
 */
@Controller
@RequestMapping(value = "${adminPath}/pay/tradeRecord")
public class TradeRecordController extends BaseController {

	@Autowired
	private TradeRecordService tradeRecordService;

	@Autowired
	private TradeRecordRepository tradeRecordRepository;

	/**
	 * 获取数据
	 */
	@ModelAttribute
	public TradeRecord get(String id, boolean isNewRecord) {
		return tradeRecordService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("pay:tradeRecord:view")
	@RequestMapping(value = {"list", ""})
	public String list(TradeRecord tradeRecord, Model model) {
		model.addAttribute("tradeRecord", tradeRecord);
		return "modules/pay/tradeRecordList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("pay:tradeRecord:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<TradeRecord> listData(TradeRecord tradeRecord, HttpServletRequest request, HttpServletResponse response) {
		Page<TradeRecord> page = tradeRecordService.findPage(new Page<TradeRecord>(request, response), tradeRecord); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("pay:tradeRecord:view")
	@RequestMapping(value = "form")
	public String form(TradeRecord tradeRecord, Model model) {
		model.addAttribute("tradeRecord", tradeRecord);
		return "modules/pay/tradeRecordForm";
	}

	/**
	 * 保存交易记录
	 */
	@RequiresPermissions("pay:tradeRecord:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated TradeRecord tradeRecord) {
		tradeRecordService.save(tradeRecord);
		return renderResult(Global.TRUE, text("保存交易记录成功！"));
	}
	
	/**
	 * 停用交易记录
	 */
	@RequiresPermissions("pay:tradeRecord:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(TradeRecord tradeRecord) {
		tradeRecord.setStatus(TradeRecord.STATUS_DISABLE);
		tradeRecordService.updateStatus(tradeRecord);
		return renderResult(Global.TRUE, text("停用交易记录成功"));
	}
	
	/**
	 * 启用交易记录
	 */
	@RequiresPermissions("pay:tradeRecord:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(TradeRecord tradeRecord) {
		tradeRecord.setStatus(TradeRecord.STATUS_NORMAL);
		tradeRecordService.updateStatus(tradeRecord);
		return renderResult(Global.TRUE, text("启用交易记录成功"));
	}
	
	/**
	 * 删除交易记录
	 */
	@RequiresPermissions("pay:tradeRecord:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(TradeRecord tradeRecord) {
//		tradeRecordService.delete(tradeRecord);
		tradeRecordRepository.delete(tradeRecord.getId());
		return renderResult(Global.TRUE, text("删除交易记录成功！"));
	}


	/**
	 * 导出用户数据
	 */
	@RequiresPermissions("pay:tradeRecord:view")
	@RequestMapping(value = "exportData")
	public void exportData(TradeRecord tradeRecord, HttpServletResponse response) {

		List<TradeRecord> list = tradeRecordService.findList(tradeRecord);
		String fileName = "交易记录数据" + DateUtils.getDate("yyyyMMddHHmmss") + ".xlsx";
		List<ExcelRecord> excelRecordList = new ArrayList<>();
		for (TradeRecord record : list) {
			ExcelRecord excelRecord = new ExcelRecord();
			BeanUtils.copyProperties(record,excelRecord);
			excelRecordList.add(excelRecord);
		}


		try(ExcelExport ee = new ExcelExport("交易记录数据", ExcelRecord.class)){
			ee.setDataList(excelRecordList).write(response, fileName);
		}
	}



}