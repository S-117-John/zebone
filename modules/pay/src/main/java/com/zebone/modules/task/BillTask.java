package com.zebone.modules.task;

import com.zebone.modules.pay.entity.TradeBillDetail;
import com.zebone.modules.pay.entity.TradeDayBill;
import com.zebone.modules.pay.entity.TradeDayBillDetail;
import com.zebone.modules.pay.service.TradeDayBillDetailService;
import com.zebone.modules.pay.service.TradeDayBillService;
import com.zebone.modules.wx.config.MyWxConfig;
import com.zebone.modules.wx.entity.WxConfig;
import com.zebone.modules.wx.sdk.WXPay;
import com.zebone.modules.wx.service.WxConfigService;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BillTask {

    @Autowired
    private WxConfigService wxConfigService;

    @Autowired
    private TradeDayBillService tradeDayBillService;

    @Autowired
    private TradeDayBillDetailService tradeBillDetailService;

    public void wxDayBill(String appId){

        try{
            SimpleDateFormat simpleDateFormatBill = new SimpleDateFormat("yyyyMMdd");
            //微信账单
            MyWxConfig config = new MyWxConfig();
            WxConfig wxConfig = new WxConfig();
            wxConfig.setAppId(appId);
            List<WxConfig> wxConfigList = wxConfigService.findList(wxConfig);
            wxConfig = wxConfigList.stream().findFirst().orElseThrow(()->new Exception("未查询到微信支付信息"));
            config.setApiKey(wxConfig.getPaySignKey());
            config.setAppId(appId);
            config.setMchId(wxConfig.getMchId());
            WXPay wxpay = new WXPay(config);
            Map<String, String> data = new HashMap<String, String>();

            data.put("bill_date", simpleDateFormatBill.format(DateUtils.addDays(new Date(),-1)));
            data.put("bill_type", "ALL");
            Map<String, String> resp = wxpay.downloadBill(data);
            String result = MapUtils.getString(resp,"data");
            String tradeMsg = result.substring(result.indexOf("`"));
            SimpleDateFormat billSimple = new SimpleDateFormat("yyyy-MM-dd");
            String tradeInfo = tradeMsg.substring(0, tradeMsg.indexOf("总交易单数")).replaceFirst(billSimple.format(DateUtils.addDays(new Date(),-1)), "").replaceAll("`", "");// 去掉汇总数据

            String totalTemp = result.substring(result.indexOf("总交易单数")).replaceAll("总交易单数,总交易额,总退款金额,总企业红包退款金额,手续费总金额","");
            String totalMsg = totalTemp.replaceAll("`","").trim();

            TradeDayBill tradeDayBill = new TradeDayBill();
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
                TradeDayBillDetail tradeBillDetail = new TradeDayBillDetail();
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
                tradeBillDetailService.save(tradeBillDetail);
            }
        }catch (Exception e){

        }
    }
}
