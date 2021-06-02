/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.modules.pay.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import com.alipay.api.AlipayApiException;
import com.jeesite.common.io.FileUtils;
import com.jeesite.common.lang.StringUtils;
import com.zebone.common.utils.CsvUtil;
import com.zebone.common.utils.MyFileUtils;
import com.zebone.modules.ali.service.AliPayService;
import com.zebone.modules.entity.MonthBillDO;
import com.zebone.modules.pay.entity.TradeBillDetail;
import com.zebone.modules.pay.entity.TradeMonthBillDetail;
import com.zebone.modules.pay.service.TradeBillDetailService;
import com.zebone.modules.pay.service.TradeMonthBillDetailService;
import com.zebone.modules.repository.DetailBillRepository;
import com.zebone.modules.repository.MonthBillRepository;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
import com.zebone.modules.pay.entity.TradeMonthBill;
import com.zebone.modules.pay.service.TradeMonthBillService;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 月账单Controller
 * @author lijin
 * @version 2020-12-08
 */
@Controller
@RequestMapping(value = "${adminPath}/pay/tradeMonthBill")
public class TradeMonthBillController extends BaseController {

	@Value("${billMonthDir}")
	private String billDir;

	@Autowired
	private TradeMonthBillService tradeMonthBillService;


	@Autowired
	private AliPayService aliPayService;



	@Autowired
	private TradeBillDetailService tradeBillDetailService;

	@Autowired
	private MonthBillRepository billRepository;

	@Autowired
	private DetailBillRepository detailBillRepository;

	/**
	 * 获取数据
	 */
	@ModelAttribute
	public TradeMonthBill get(String id, boolean isNewRecord) {
		return tradeMonthBillService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("pay:tradeMonthBill:view")
	@RequestMapping(value = {"list", ""})
	public String list(TradeMonthBill tradeMonthBill, Model model) {
		model.addAttribute("tradeMonthBill", tradeMonthBill);
		return "modules/pay/tradeMonthBillList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("pay:tradeMonthBill:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<TradeMonthBill> listData(TradeMonthBill tradeMonthBill, HttpServletRequest request, HttpServletResponse response) {
		Page<TradeMonthBill> page = tradeMonthBillService.findPage(new Page<TradeMonthBill>(request, response), tradeMonthBill); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("pay:tradeMonthBill:view")
	@RequestMapping(value = "form")
	public String form(TradeMonthBill tradeMonthBill, Model model) {
		model.addAttribute("tradeMonthBill", tradeMonthBill);
		return "modules/pay/tradeMonthBillForm";
	}

	/**
	 * 生成月账单
	 */
	@RequiresPermissions("pay:tradeMonthBill:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated TradeMonthBill tradeMonthBill) throws Exception {
		if("1".equalsIgnoreCase(tradeMonthBill.getPayType())){
			//微信账单
		}else if("2".equalsIgnoreCase(tradeMonthBill.getPayType())){
			List<TradeMonthBill> record = tradeMonthBillService.findList(tradeMonthBill);
			if(record.size()>0){
				return renderResult(Global.FALSE, text("已存在该月账单"));
			}
			SimpleDateFormat simpleDateFormatBill = new SimpleDateFormat("yyyy-MM");
			//支付宝账单
			//获取支付宝账单地址
			String billUrl = aliPayService.downLoadAliBill(simpleDateFormatBill.format(tradeMonthBill.getBillDate()),tradeMonthBill.getAppId());
			//下载对账单
			String billName = MyFileUtils.downloadFromUrl(billUrl,billDir);
			//解压对账单
			List<String> fileNames = MyFileUtils.unZipBillFiles(billName,billDir);
			//读取csv文件

			for (String fileName : fileNames) {
				List<String[]> contentList = CsvUtil.CSVReadAll(fileName);
				String dateStr = fileName.split("_")[1];
				if(fileName.contains("汇总")){
					//账号
					String billNo = StringUtils.substringBetween(contentList.get(0)[0],"[","]");
					//订单笔数
					String billCount = contentList.get(4)[2];
					//退款笔数
					String refundCount = contentList.get(4)[3];
					//订单金额
					String billTotalAmount = contentList.get(4)[4];
					//实收金额
					String billReceiptAmount = contentList.get(4)[5];
					tradeMonthBill.setBillNo(billNo+"_"+dateStr);
					tradeMonthBill.setBillCount(billCount);
					tradeMonthBill.setRefundCount(refundCount);
					tradeMonthBill.setBillTotalAmount(billTotalAmount);
					tradeMonthBill.setBillReceiptAmount(billReceiptAmount);
					try{
						tradeMonthBillService.save(tradeMonthBill);
					}catch (Exception e){
						e.printStackTrace();
					}

				}else {
					SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					for (int i = 4; i < contentList.size()-4; i++) {
						//账号
						String billNo = StringUtils.substringBetween(contentList.get(0)[0],"[","]");
						//支付宝交易号
						String tradeNo = contentList.get(i)[0].replace("\t","");
						//商户订单
						String outTradeNo = contentList.get(i)[1].replace("\t","");
						//业务类型
						String bizType = contentList.get(i)[2].replace("\t","");
						//商品名称
						String productName = contentList.get(i)[3];
						//交易创建时间
						Date tradeCreateTime = simpleDateFormat.parse(contentList.get(i)[4]);
						//交易完成时间
						Date tradeEndTime = simpleDateFormat.parse(contentList.get(i)[5]);
						//买家账户
						String buyerId = contentList.get(i)[10].replace("\t","");
						//订单金额
						String billAmount = contentList.get(i)[11];
						//实收金额
						String receiptAmount = contentList.get(i)[12];
						//退款批次
						String refundBath = contentList.get(i)[21].replace("\t","");

						TradeBillDetail tradeBillDetail = new TradeBillDetail();
						tradeBillDetail.setBillNo(billNo+"_"+dateStr);
						tradeBillDetail.setTradeNo(tradeNo);
						tradeBillDetail.setOutTradeNo(outTradeNo);
						tradeBillDetail.setBizType(bizType);
						tradeBillDetail.setProductName(productName);
						tradeBillDetail.setTradeCreateTime(tradeCreateTime);
						tradeBillDetail.setTradeEndTime(tradeEndTime);
						tradeBillDetail.setBuyerId(buyerId);
						tradeBillDetail.setBillAmount(billAmount);
						tradeBillDetail.setReceiptAmount(receiptAmount);
						tradeBillDetail.setRefundBatchNo(refundBath);
						try{
							tradeBillDetailService.save(tradeBillDetail);
						}catch (Exception e){

						}
					}

				}


			}

		}

		return renderResult(Global.TRUE, text("生成月账单成功！"));
	}
	
	/**
	 * 停用月账单
	 */
	@RequiresPermissions("pay:tradeMonthBill:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(TradeMonthBill tradeMonthBill) {
		tradeMonthBill.setStatus(TradeMonthBill.STATUS_DISABLE);
		tradeMonthBillService.updateStatus(tradeMonthBill);
		return renderResult(Global.TRUE, text("停用月账单成功"));
	}
	
	/**
	 * 启用月账单
	 */
	@RequiresPermissions("pay:tradeMonthBill:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(TradeMonthBill tradeMonthBill) {
		tradeMonthBill.setStatus(TradeMonthBill.STATUS_NORMAL);
		tradeMonthBillService.updateStatus(tradeMonthBill);
		return renderResult(Global.TRUE, text("启用月账单成功"));
	}



	/**
	 * 删除月账单
	 */
	@RequiresPermissions("pay:tradeMonthBill:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	@Transactional
	public String delete(TradeMonthBill tradeMonthBill) {
		MonthBillDO monthBillDO = new MonthBillDO();
		monthBillDO.setId(tradeMonthBill.getId());
		billRepository.delete(monthBillDO);
		detailBillRepository.deleteByBillNo(tradeMonthBill.getBillNo());
		return renderResult(Global.TRUE, text("删除月账单成功！"));
	}
	
}