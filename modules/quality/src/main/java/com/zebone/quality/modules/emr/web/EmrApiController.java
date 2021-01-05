package com.zebone.quality.modules.emr.web;

import com.jeesite.common.entity.Page;
import com.zebone.quality.modules.cesarean.entity.QualityCesareanSection;
import com.zebone.quality.modules.cesarean.service.QualityCesareanSectionService;
import com.zebone.quality.modules.emr.entity.EmrHomePage;
import com.zebone.quality.modules.emr.service.EmrHomePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping(value = "${adminPath}/api/emr/emrHomePage")
public class EmrApiController {

    @Autowired
    private EmrHomePageService emrHomePageService;

    @Autowired
    private QualityCesareanSectionService qualityCesareanSectionService;

    @RequestMapping(value = "data")
    public String listData(EmrHomePage emrHomePage, HttpServletRequest request, HttpServletResponse response) {
        List<EmrHomePage> result = emrHomePageService.findList(emrHomePage);
        if(result.size()>0){

            QualityCesareanSection qualityCesareanSection = new QualityCesareanSection();
            emrHomePage = result.get(0);
            qualityCesareanSection.setPatientCaseNumber(emrHomePage.getPatNo());
            List<QualityCesareanSection> qualityCesareanSectionList = qualityCesareanSectionService.findList(qualityCesareanSection);
            if(qualityCesareanSectionList.size()>0){
                qualityCesareanSection.setId(qualityCesareanSectionList.get(0).getId());
            }
            qualityCesareanSection.setQualityPhysician(emrHomePage.getQcDocName());
            qualityCesareanSection.setQualityNurse(emrHomePage.getQcNurseName());
            qualityCesareanSection.setAttendingPhysician(emrHomePage.getConsultName());
            qualityCesareanSection.setRsponsibleNurse(emrHomePage.getNurseName());
            if("1".equals(emrHomePage.getFlagReadmit())){
                qualityCesareanSection.setRepeatHospital("y");
            }else {
                qualityCesareanSection.setRepeatHospital("n");
            }

            //出生日期
            qualityCesareanSection.setBirth(emrHomePage.getBirthDate());
            //体重
//            qualityCesareanSection.setWeight();
            //费用支付方式
//            qualityCesareanSection.setPaymentMethod(emrHomePage.);
            qualityCesareanSectionService.save(qualityCesareanSection);
            String id = qualityCesareanSection.getId();
            return id;
        }else {
            return null;
        }
    }
}
