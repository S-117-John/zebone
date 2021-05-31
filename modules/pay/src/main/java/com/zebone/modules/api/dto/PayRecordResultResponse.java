package com.zebone.modules.api.dto;

import com.zebone.modules.pay.entity.TradeRecord;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 刘旋
 * @date 2021/05/31 11:52
 **/
@Data
public class PayRecordResultResponse {
    static PayRecordResultResponse payRecordResultResponse=new PayRecordResultResponse();
    private static final String SUCCESS ="success";
    private static final String ERROR ="error";
    @ApiModelProperty(value = "状态",required = true)
    private String state;

    @ApiModelProperty(value = "异常信息",required = false)
    private String msg;

    @ApiModelProperty(value = "响应数据",required = true)
    private List<PayRecordResponse> data;

    public static PayRecordResultResponse success(List<PayRecordResponse> object){
        payRecordResultResponse=new PayRecordResultResponse();
        payRecordResultResponse.state=SUCCESS;
        payRecordResultResponse.data=object;
        return payRecordResultResponse;
    }
    public static PayRecordResultResponse success(){
        payRecordResultResponse=new PayRecordResultResponse();
        payRecordResultResponse.state=SUCCESS;
        return payRecordResultResponse;
    }
    public static PayRecordResultResponse error(String msg){
        payRecordResultResponse=new PayRecordResultResponse();
        payRecordResultResponse.state=ERROR;
        payRecordResultResponse.msg=msg;
        return payRecordResultResponse;
    }

}
