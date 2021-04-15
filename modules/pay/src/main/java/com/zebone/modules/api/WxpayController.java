package com.zebone.modules.api;


import com.zebone.modules.api.dto.WxpayParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/wx")
@Api(value = "微信支付接口",tags = "微信支付接口")
public class WxpayController {

    @ApiOperation(httpMethod = "POST",value = "付款码支付",notes = "收银员使用扫码设备读取微信用户付款码以后，二维码或条码信息会传送至商户收银台，由商户收银台或者商户后台调用该接口发起支付")
    @RequestMapping("micropay")
    public Object micropay(@RequestBody WxpayParam param){
        return null;
    }
}
