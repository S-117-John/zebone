package com.zebone.quality.modules.emr.service;


import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.emr.dao.EmrDataDao;
import com.zebone.quality.modules.emr.entity.EmrData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author 卡卡西
 */
@Service
@Transactional(readOnly=true)
public class EmrDataService extends CrudService<EmrDataDao, EmrData> {

    public List<EmrData> getCaesareanSectionData(String caseId){
        return dao.getCaesareanSectionData(caseId);
    }

    public List<Map<String,Object>> getCommonData(String caseId){
        return dao.getCommonData(caseId);
    }

    public List<Map<String,Object>> chargeList(String pkPage){
        return dao.chargeList(pkPage);
    }
}
