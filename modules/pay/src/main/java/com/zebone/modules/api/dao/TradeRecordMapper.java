package com.zebone.modules.api.dao;

import com.jeesite.common.dao.TreeDao;
import com.jeesite.common.datasource.DataSourceHolder;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.zebone.modules.api.dto.PayRecordParam;
import com.zebone.modules.api.dto.PayRecordResponse;
import com.zebone.modules.pay.entity.TradeRecord;


import java.util.List;

@MyBatisDao(dataSourceName= DataSourceHolder.DEFAULT)
public interface TradeRecordMapper extends TreeDao<TradeRecord> {
    List<PayRecordResponse> getPayRecord(PayRecordParam payRecordParam);
}
