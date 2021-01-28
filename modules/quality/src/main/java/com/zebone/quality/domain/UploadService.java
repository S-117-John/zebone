package com.zebone.quality.domain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jeesite.common.config.Global;
import com.zebone.quality.common.utils.RestTemplateUtil;
import com.zebone.quality.modules.base.entity.QualityDisease;
import com.zebone.quality.modules.base.service.QualityDiseaseService;
import com.zebone.quality.modules.cesarean.entity.CesareanSection;
import com.zebone.quality.modules.common.UploadResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UploadService {

    @Autowired
    private QualityDiseaseService qualityDiseaseService;

    public String upload(Object object,Object target,String code){
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm").create();
        BeanUtils.copyProperties(object,target);
        String json = gson.toJson(target);
        QualityDisease qualityDisease = new QualityDisease();
        qualityDisease.setCode(code);
        List<QualityDisease> list = qualityDiseaseService.findList(qualityDisease);
        String apiUrl = list.get(0).getInterfaceUrl();
        String result = RestTemplateUtil.getInstance().postForString(json, Global.getConfig("quality.url")+apiUrl);

        return result;
    }

}
