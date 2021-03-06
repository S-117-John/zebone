package com.zebone.quality.domain;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jeesite.common.config.Global;
import com.zebone.quality.common.utils.CommonBeanUtils;
import com.zebone.quality.common.utils.RestTemplateUtil;
import com.zebone.quality.modules.base.entity.QualityDisease;
import com.zebone.quality.modules.base.service.QualityDiseaseService;
import com.zebone.quality.modules.cesarean.entity.CesareanSection;
import com.zebone.quality.modules.common.UploadResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UploadService {

    @Autowired
    private QualityDiseaseService qualityDiseaseService;

    public String upload(Object object,Object target,String code) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm").create();
        BeanUtils.copyProperties(object,target);
        CommonBeanUtils.StringToArray(object,target);
        String json = JSON.toJSONString(target);
        QualityDisease qualityDisease = new QualityDisease();
        qualityDisease.setCode(code);
        List<QualityDisease> list = qualityDiseaseService.findList(qualityDisease);
        String apiUrl = list.stream().
                map(a->a.getInterfaceUrl()).
                collect(Collectors.toList()).
                stream().findFirst().
                get();
//        String apiUrl = list.get(0).getInterfaceUrl();
        String url = Global.getConfig("quality.url")+apiUrl;
        String result = RestTemplateUtil.getInstance().postForString(json, url);

        return result;
    }

}
