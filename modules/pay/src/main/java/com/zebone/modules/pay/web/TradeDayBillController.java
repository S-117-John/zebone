/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.modules.pay.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alipay.api.AlipayApiException;
import com.jeesite.common.io.FileUtils;
import com.jeesite.common.lang.StringUtils;
import com.zebone.common.utils.CsvUtil;
import com.zebone.modules.ali.service.AliPayService;
import com.zebone.modules.pay.entity.TradeBillDetail;
import com.zebone.modules.pay.entity.TradeDayBillDetail;
import com.zebone.modules.pay.entity.TradeMonthBillDetail;
import com.zebone.modules.pay.service.TradeBillDetailService;
import com.zebone.modules.pay.service.TradeDayBillDetailService;
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
import com.zebone.modules.pay.entity.TradeDayBill;
import com.zebone.modules.pay.service.TradeDayBillService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 日账单Controller
 * @author lijin
 * @version 2020-12-09
 */
@Controller
@RequestMapping(value = "${adminPath}/pay/tradeDayBill")
public class TradeDayBillController extends BaseController {

	@Value("${billDayDir}")
	private String billDir;

	@Autowired
	private AliPayService aliPayService;


	@Autowired
	private TradeDayBillService tradeDayBillService;

	@Autowired
	private TradeDayBillDetailService tradeDayBillDetailService;

	@Autowired
	private TradeBillDetailService tradeBillDetailService;

	/**
	 * 获取数据
	 */
	@ModelAttribute
	public TradeDayBill get(String id, boolean isNewRecord) {
		return tradeDayBillService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("pay:tradeDayBill:view")
	@RequestMapping(value = {"list", ""})
	public String list(TradeDayBill tradeDayBill, Model model) {
		model.addAttribute("tradeDayBill", tradeDayBill);
		return "modules/pay/tradeDayBillList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("pay:tradeDayBill:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<TradeDayBill> listData(TradeDayBill tradeDayBill, HttpServletRequest request, HttpServletResponse response) {
		Page<TradeDayBill> page = tradeDayBillService.findPage(new Page<TradeDayBill>(request, response), tradeDayBill); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("pay:tradeDayBill:view")
	@RequestMapping(value = "form")
	public String form(TradeDayBill tradeDayBill, Model model) {
		model.addAttribute("tradeDayBill", tradeDayBill);
		return "modules/pay/tradeDayBillForm";
	}

	/**
	 * 保存日账单
	 */
	@RequiresPermissions("pay:tradeDayBill:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated TradeDayBill tradeDayBill) throws Exception {
		if("1".equalsIgnoreCase(tradeDayBill.getPayType())){
			//微信账单
		}else if("2".equalsIgnoreCase(tradeDayBill.getPayType())){
			SimpleDateFormat simpleDateFormatBill = new SimpleDateFormat("yyyy-MM-dd");
			//支付宝账单
			//获取支付宝账单地址
			String billUrl = aliPayService.downLoadAliBill(simpleDateFormatBill.format(tradeDayBill.getBillDate()),tradeDayBill.getAppId());
			//下载对账单
			String billName = FileUtils.downloadFromUrl(billUrl,billDir);
			//解压对账单
			List<String> fileNames = FileUtils.unZipBillFiles(billName,billDir);
			//读取csv文件
			for (String fileName : fileNames) {
				List<String[]> contentList = CsvUtil.CSVReadAll(fileName);
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
					tradeDayBill.setBillNo(billNo);
					tradeDayBill.setBillCount(billCount);
					tradeDayBill.setRefundCount(refundCount);
					tradeDayBill.setBillTotalAmount(billTotalAmount);
					tradeDayBill.setBillReceiptAmount(billReceiptAmount);
					try{
						tradeDayBillService.save(tradeDayBill);
					}catch (Exception e){

					}

				}else{
					SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					for (int i = 4; i < contentList.size()-4; i++) {
						//账号
						String billNo = StringUtils.substringBetween(contentList.get(0)[0],"[","]");
						//支付宝交易号
						String tradeNo = contentList.get(i)[0];
						//商户订单
						String outTradeNo = contentList.get(i)[1];
						//业务类型
						String bizType = contentList.get(i)[2];
						//商品名称
						String productName = contentList.get(i)[3];
						//交易创建时间
						Date tradeCreateTime = simpleDateFormat.parse(contentList.get(i)[4]);
						//交易完成时间
						Date tradeEndTime = simpleDateFormat.parse(contentList.get(i)[5]);
						//买家账户
						String buyerId = contentList.get(i)[10];
						//订单金额
						String billAmount = contentList.get(i)[11];
						//实收金额
						String receiptAmount = contentList.get(i)[12];
						//退款批次
						String refundBath = contentList.get(i)[21];

						TradeBillDetail tradeBillDetail = new TradeBillDetail();
						tradeBillDetail.setBillNo(billNo);
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
		return renderResult(Global.TRUE, text("保存日账单成功！"));
	}
	
	/**
	 * 停用日账单
	 */
	@RequiresPermissions("pay:tradeDayBill:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(TradeDayBill tradeDayBill) {
		tradeDayBill.setStatus(TradeDayBill.STATUS_DISABLE);
		tradeDayBillService.updateStatus(tradeDayBill);
		return renderResult(Global.TRUE, text("停用日账单成功"));
	}
	
	/**
	 * 启用日账单
	 */
	@RequiresPermissions("pay:tradeDayBill:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(TradeDayBill tradeDayBill) {
		tradeDayBill.setStatus(TradeDayBill.STATUS_NORMAL);
		tradeDayBillService.updateStatus(tradeDayBill);
		return renderResult(Global.TRUE, text("启用日账单成功"));
	}
	
	/**
	 * 删除日账单
	 */
	@RequiresPermissions("pay:tradeDayBill:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(TradeDayBill tradeDayBill) {
		tradeDayBillService.delete(tradeDayBill);
		return renderResult(Global.TRUE, text("删除日账单成功！"));
	}
	
}