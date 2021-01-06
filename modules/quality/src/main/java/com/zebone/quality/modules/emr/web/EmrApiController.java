package com.zebone.quality.modules.emr.web;

import com.jeesite.common.entity.Page;
import com.zebone.quality.modules.cesarean.entity.QualityCesareanSection;
import com.zebone.quality.modules.cesarean.service.QualityCesareanSectionService;
import com.zebone.quality.modules.code.service.QualityCodeService;
import com.zebone.quality.modules.common.CodeControlType;
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
    private QualityCodeService qualityCodeService;

    @Autowired
    private QualityCesareanSectionService qualityCesareanSectionService;

    @RequestMapping(value = "data")
    public String listData(EmrHomePage emrHomePage, HttpServletRequest request, HttpServletResponse response) {
        List<EmrHomePage> result = emrHomePageService.findList(emrHomePage);
        if(result.size()>0){

            QualityCesareanSection qualityCesareanSection = new QualityCesareanSection();
            emrHomePage = result.get(0);
            qualityCesareanSection.setCaseId(emrHomePage.getPatNo());
            List<QualityCesareanSection> qualityCesareanSectionList = qualityCesareanSectionService.findList(qualityCesareanSection);
            if(qualityCesareanSectionList.size()>0){
                qualityCesareanSection.setId(qualityCesareanSectionList.get(0).getId());
            }
            qualityCesareanSection.setCm0111(emrHomePage.getQcDocName());
            qualityCesareanSection.setCm0112(emrHomePage.getQcNurseName());
            qualityCesareanSection.setCm0113(emrHomePage.getConsultName());
            qualityCesareanSection.setCm0114(emrHomePage.getNurseName());
            if("1".equals(emrHomePage.getFlagReadmit())){
                qualityCesareanSection.setCm015("y");
            }else {
                qualityCesareanSection.setCm015("n");
            }

            //出生日期
            qualityCesareanSection.setCm0211(emrHomePage.getBirthDate());

            //支付方式
            qualityCesareanSection.setCm031(qualityCodeService.getDictValue(CodeControlType.CM_0_3_1,emrHomePage.getMedPayMode()));

            qualityCesareanSectionService.save(qualityCesareanSection);
            String id = qualityCesareanSection.getId();
            return id;
        }else {
            return null;
        }
    }
}
