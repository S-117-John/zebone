package com.zebone.modules.api;

import com.zebone.modules.api.dto.TradeBillDetailParam;
import com.zebone.modules.pay.entity.TradeBillDetail;
import com.zebone.modules.pay.service.TradeBillDetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 刘旋
 **/
@RestController
@RequestMapping(value = "/api/tradeBillDetail")

@Api(value = "账单明细接口",tags = "账单明细接口")
public class TradeBillDetailApiController {

    @Resource
    TradeBillDetailService tradeBillDetailService;

    Map<String,Object> map=new LinkedHashMap<>();

    @ApiOperation(httpMethod = "POST",value = "查询账单明细",notes = "条件查询账单明细根据交易号或商户订单号")
    @RequestMapping("/findList")
    public Map<String,Object> findList(@RequestBody TradeBillDetailParam tradeBillDetailParam){
        map.clear();
        TradeBillDetail tradeBillDetail=new TradeBillDetail();
        if (StringUtils.isEmpty(tradeBillDetailParam.getOutTradeNo()) && StringUtils.isEmpty(tradeBillDetailParam.getTradeNo())){
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
}
