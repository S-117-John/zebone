package com.zebone.quality.modules.emr.web;

import com.google.gson.Gson;
import com.zebone.quality.modules.cap.entity.Cap;
import com.zebone.quality.modules.cesarean.entity.QualityCesareanSection;
import com.zebone.quality.modules.cesarean.service.QualityCesareanSectionService;
import com.zebone.quality.modules.code.service.QualityCodeService;
import com.zebone.quality.modules.common.CodeControlType;
import com.zebone.quality.modules.emr.entity.EmrData;
import com.zebone.quality.modules.emr.entity.EmrHomePage;
import com.zebone.quality.modules.emr.entity.PvEncounter;
import com.zebone.quality.modules.emr.service.EmrDataService;
import com.zebone.quality.modules.hf.entity.Hf;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(value = "${adminPath}/api/emr/emrHomePage")
public class EmrApiController {


    @Autowired
    private QualityCodeService qualityCodeService;

    @Autowired
    private QualityCesareanSectionService qualityCesareanSectionService;

    @Autowired
    private EmrDataService emrDataService;

    @RequestMapping(value = "data")
    public String listData(String patNo,String type, HttpServletRequest request, HttpServletResponse response) {
        List<EmrData> result = emrDataService.getCaesareanSectionData(patNo);
        if(result.size()>0){
            QualityCesareanSection qualityCesareanSection = new QualityCesareanSection();
            EmrData emrData = result.get(0);
            qualityCesareanSection.setCaseId(emrData.getPatNo());
            List<QualityCesareanSection> qualityCesareanSectionList = qualityCesareanSectionService.findList(qualityCesareanSection);
            if(qualityCesareanSectionList.size()>0){
                qualityCesareanSection.setId(qualityCesareanSectionList.get(0).getId());
            }
            qualityCesareanSection.setCm0111(emrData.getQcDocName());
            qualityCesareanSection.setCm0112(emrData.getQcNurseName());
            qualityCesareanSection.setCm0113(emrData.getConsultName());
            qualityCesareanSection.setCm0114(emrData.getNurseName());
            if("1".equals(emrData.getFlagReadmit())){
                qualityCesareanSection.setCm015("y");
            }else {
                qualityCesareanSection.setCm015("n");
            }

            //出生日期
            qualityCesareanSection.setCm0211(emrData.getBirthDate());

            //支付方式
            qualityCesareanSection.setCm031(qualityCodeService.getDictValue(CodeControlType.CM_0_3_1,emrData.getMedPayMode()));
            //体重
            qualityCesareanSection.setCm0213(Optional.ofNullable(emrData).map(p->p.getWeight()).orElse(0.0));
            //身高
            qualityCesareanSection.setCm0215(Optional.ofNullable(emrData).map(p->p.getHeight()).orElse(0.0));
            //新生儿出生体重
            qualityCesareanSection.setCm0216(Optional.ofNullable(emrData).map(p->p.getInfWeight()).orElse(0.0));
            //末次月经日期
            qualityCesareanSection.setCs022(Optional.ofNullable(emrData).map(p->p.getDateLast()).orElse(null));
            //入院日期时间
            qualityCesareanSection.setCm0241(Optional.ofNullable(emrData).map(p->p.getCm0241()).orElse(null));
            //出院日期时间
            qualityCesareanSection.setCm0242(Optional.ofNullable(emrData).map(p->p.getCm0242()).orElse(null));
            //入院途径
            qualityCesareanSection.setCm032(qualityCodeService.getDictValue(CodeControlType.CM_0_3_2,emrData.getCm032()));
            //产次
            qualityCesareanSection.setCs111(qualityCodeService.getDictValue(CodeControlType.CS_1_1_1,emrData.getCs111()));
            //临产方式
            qualityCesareanSection.setCs111(qualityCodeService.getDictValue(CodeControlType.CS_1_1_3,emrData.getCs111()));
            //孕周
            qualityCesareanSection.setCs114(qualityCodeService.getDictValue(CodeControlType.CS_1_1_4,emrData.getCs114()));
            //胎位
            qualityCesareanSection.setCs115(qualityCodeService.getDictValue(CodeControlType.CS_1_1_4,emrData.getCs115()));
            //麻醉方式
            qualityCesareanSection.setCs124(qualityCodeService.getDictValue(CodeControlType.CS_1_1_4,emrData.getCs124()));


            qualityCesareanSectionService.save(qualityCesareanSection);





            String id = qualityCesareanSection.getId();
            return id;
        }else {
            return null;
        }
    }

    private static final HashMap<String, Object> map;

    static {

        map = new HashMap<>();
        map.put("hf", Hf.class);
        }

    @RequestMapping(value = "commonData")
    public String commonData(String patNo,String type, HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Map<String,Object>> result = emrDataService.getCommonData(patNo);
        Map<String,Object> mapResult = result.stream().findFirst().orElseThrow(()->new Exception("未查询到患者病案信息"));
        String icd = MapUtils.getString(mapResult,"DIAG_CODE_CLINIC_ICD");

        Gson gson = new Gson();
        String jsonResult =  gson.toJson(mapResult);
        return jsonResult;
    }
}
