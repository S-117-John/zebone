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
import com.zebone.common.utils.MyFileUtils;
import com.zebone.modules.ali.service.AliPayService;
import com.zebone.modules.entity.DayBillDO;
import com.zebone.modules.pay.entity.TradeBillDetail;
import com.zebone.modules.pay.entity.TradeDayBillDetail;
import com.zebone.modules.pay.entity.TradeMonthBillDetail;
import com.zebone.modules.pay.service.TradeBillDetailService;
import com.zebone.modules.pay.service.TradeDayBillDetailService;
import com.zebone.modules.repository.DayBillRepository;
import com.zebone.modules.wx.config.MyWxConfig;
import com.zebone.modules.wx.entity.WxConfig;
import com.zebone.modules.wx.sdk.WXPay;
import com.zebone.modules.wx.service.WxConfigService;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
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
import java.util.*;

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
	private TradeBillDetailService tradeBillDetailService;

	@Autowired
	private DayBillRepository dayBillRepository;

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
	@Autowired
	private WxConfigService wxConfigService;
	/**
	 * 保存日账单
	 */
	@RequiresPermissions("pay:tradeDayBill:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated TradeDayBill tradeDayBill) throws Exception {
		List<DayBillDO> dayBillList = dayBillRepository.findByAppId(tradeDayBill.getAppId());
		if(dayBillList.stream().anyMatch(a->DateUtils.isSameDay(tradeDayBill.getBillDate(),a.getBillDate()))){
			return renderResult(Global.FALSE, text("账单已存在"));
		}
		if("1".equalsIgnoreCase(tradeDayBill.getPayType())){
			SimpleDateFormat simpleDateFormatBill = new SimpleDateFormat("yyyyMMdd");
			//微信账单
			MyWxConfig config = new MyWxConfig();
			WxConfig wxConfig = new WxConfig();
			wxConfig.setAppId(tradeDayBill.getAppId());
			List<WxConfig> wxConfigList = wxConfigService.findList(wxConfig);
			wxConfig = wxConfigList.stream().findFirst().orElseThrow(()->new Exception("未查询到微信支付信息"));
			config.setApiKey(wxConfig.getPaySignKey());
			config.setAppId(tradeDayBill.getAppId());
			config.setMchId(wxConfig.getMchId());
			WXPay wxpay = new WXPay(config);
			Map<String, String> data = new HashMap<String, String>();

			data.put("bill_date", simpleDateFormatBill.format(DateUtils.addDays(tradeDayBill.getBillDate(),-1)));
			data.put("bill_type", "ALL");
			Map<String, String> resp = wxpay.downloadBill(data);
			String result = MapUtils.getString(resp,"data");
			String tradeMsg = result.substring(result.indexOf("`"));
			SimpleDateFormat billSimple = new SimpleDateFormat("yyyy-MM-dd");
			String tradeInfo = tradeMsg.substring(0, tradeMsg.indexOf("总交易单数")).replaceFirst(billSimple.format(DateUtils.addDays(tradeDayBill.getBillDate(),-1)), "").replaceAll("`", "");// 去掉汇总数据

			String totalTemp = result.substring(result.indexOf("总交易单数")).replaceAll("总交易单数,总交易额,总退款金额,总企业红包退款金额,手续费总金额","");
			String totalMsg = totalTemp.replaceAll("`","").trim();

			tradeDayBill.setBillCount(totalMsg.split(",")[0]);

//			tradeDayBill.setRefundCount(totalMsg.split(",")[0]);
			tradeDayBill.setBillTotalAmount(totalMsg.split(",")[1]);
			tradeDayBill.setBillReceiptAmount(totalMsg.split(",")[1]);
			try{
				tradeDayBillService.save(tradeDayBill);
			}catch (Exception e){

			}
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String[] tradeArray = tradeInfo.split(billSimple.format(DateUtils.addDays(new Date(),-1))); //通过交易时间分隔   订单数
			for (String s : tradeArray) {
				System.out.println("交易信息："+s);
				//23:06:31,wx0402a678abdc05c8,1250397401,0,,4200001000202104251354651391,W1250397401716FC7A0C2E2C69E5EDCE,ods6wuMe6PWoYyAuTnpU_16LxEMA,JSAPI,SUCCESS,OTHERS,CNY,3.50,0.00,0,0,0.00,0.00,,,『粤TUB281』中山市人民医院临停缴费,webpay,0.00000,0.00%
				TradeBillDetail tradeBillDetail = new TradeBillDetail();
//				tradeBillDetail.setBillNo(s.split(",")[5]);
				tradeBillDetail.setTradeNo(s.split(",")[5]);
				tradeBillDetail.setOutTradeNo(s.split(",")[6]);
				tradeBillDetail.setBizType(s.split(",")[8]);
				tradeBillDetail.setProductName(s.split(",")[20]);
//				tradeBillDetail.setTradeCreateTime(tradeCreateTime);
				String tradeTimeStr = simpleDateFormatBill.format(tradeDayBill.getBillDate())+s.split(",")[0];

				tradeBillDetail.setTradeEndTime(simpleDateFormat.parse(tradeTimeStr));
				tradeBillDetail.setBuyerId(s.split(",")[7]);
//				tradeBillDetail.setBillAmount(billAmount);
//				tradeBillDetail.setReceiptAmount(receiptAmount);
//				tradeBillDetail.setRefundBatchNo(refundBath);
			}
		}else if("2".equalsIgnoreCase(tradeDayBill.getPayType())){
			SimpleDateFormat simpleDateFormatBill = new SimpleDateFormat("yyyy-MM-dd");
			//支付宝账单
			//获取支付宝账单地址
			String billUrl = aliPayService.downLoadAliBill(simpleDateFormatBill.format(tradeDayBill.getBillDate()),tradeDayBill.getAppId());
			//下载对账单
			String billName = MyFileUtils.downloadFromUrl(billUrl,billDir);
			//解压对账单
//			List<String> fileNames = new ArrayList<>();
			List<String> fileNames = MyFileUtils.unZipBillFiles(billName,billDir);
			String dateStr = DateFormatUtils.format(tradeDayBill.getBillDate(),"yyyyMMdd");
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
					tradeDayBill.setBillNo(billNo+"_"+dateStr);
					tradeDayBill.setBillCount(billCount);
					tradeDayBill.setRefundCount(refundCount);
					tradeDayBill.setBillTotalAmount(billTotalAmount);
					tradeDayBill.setBillReceiptAmount(billReceiptAmount);
					try{
						tradeDayBillService.save(tradeDayBill);
					}catch (Exception e){
						e.printStackTrace();
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