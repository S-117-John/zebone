package com.zebone.modules.api;

import com.zebone.common.utils.ClassUtil;
import com.zebone.modules.api.dao.TradeRecordMapper;
import com.zebone.modules.api.dto.PayRecordParam;
import com.zebone.modules.api.dto.PayRecordResponse;
import com.zebone.modules.api.dto.PayRecordResultResponse;
import com.zebone.modules.api.dto.TradeBillDetailParam;
import com.zebone.modules.pay.entity.TradeBillDetail;
import com.zebone.modules.pay.entity.TradeRecord;
import com.zebone.modules.pay.service.TradeBillDetailService;
import com.zebone.modules.pay.service.TradeRecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 刘旋
 **/
@RestController
@RequestMapping(value = "/api/tradeBillDetail")

@Api(value = "账单记录明细接口",tags = "账单记录明细接口")
public class TradeBillDetailApiController {

    @Resource
    TradeBillDetailService tradeBillDetailService;

    @Resource
    TradeRecordService tradeRecordService;

    @Resource
    TradeRecordMapper tradeRecordMapper;
    Map<String,Object> map=new LinkedHashMap<>();

    @ApiOperation(httpMethod = "POST",value = "查询账单明细",notes = "条件查询账单明细根据交易号或商户订单号")
    @RequestMapping("/findList")
    public Map<String,Object> findList(@RequestBody TradeBillDetailParam tradeBillDetailParam){
        map.clear();
        TradeBillDetail tradeBillDetail=new TradeBillDetail();
        if (!StringUtils.hasText(tradeBillDetailParam.getOutTradeNo()) && !StringUtils.hasText(tradeBillDetailParam.getTradeNo())){
            map.put("state","error");
            map.put("data","请至少传入一项参数进行筛选");
            return map;
        }
        tradeBillDetail.setTradeNo(tradeBillDetailParam.getTradeNo());
        tradeBillDetail.setOutTradeNo(tradeBillDetailParam.getOutTradeNo());
        List<TradeBillDetail> result = tradeBillDetailService.findList(tradeBillDetail);
        map.put("state","success");
        map.put("data",result);
        return map;
    }

    @ApiOperation(httpMethod = "POST",value = "查询交易记录",notes = "支付平台的交易记录与his的对账接口对接")
    @RequestMapping("/getPayRecord")
    public PayRecordResultResponse getPayRecord(@RequestBody PayRecordParam payRecordParam){
        map.clear();
        //处理参数，筛选条件不能全部为空
        try {
            boolean allFieldNull = ClassUtil.isAllFieldNull(payRecordParam);
            if (allFieldNull){
                return PayRecordResultResponse.error("至少有一个条件进行筛选");
            }
        }catch (Exception e){
            e.printStackTrace();
            return PayRecordResultResponse.error("参数异常");
        }
        List<PayRecordResponse> payRecord = tradeRecordMapper.getPayRecord(payRecordParam);
        return PayRecordResultResponse.success(payRecord);
    }
}
