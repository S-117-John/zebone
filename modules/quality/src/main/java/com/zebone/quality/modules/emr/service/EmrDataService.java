package com.zebone.quality.modules.emr.service;


import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.emr.dao.EmrDataDao;
import com.zebone.quality.modules.emr.entity.EmrData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 卡卡西
 */
@Service
@Transactional(readOnly=true)
public class EmrDataService extends CrudService<EmrDataDao, EmrData> {

    public List<EmrData> getCaesareanSectionData(String caseId){
        return dao.getCaesareanSectionData(caseId);
    }
}
