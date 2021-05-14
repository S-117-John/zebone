/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.cap.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.cap.entity.QualityCap;
import com.zebone.quality.modules.cap.dao.QualityCapDao;

/**
 * Cap社区获得性肺炎（儿童，首次住院）Service
 * @author 卡卡西
 * @version 2021-02-06
 */
@Service
@Transactional(readOnly=true)
public class QualityCapService extends CrudService<QualityCapDao, QualityCap> {

    public Map<String,Object> findById(String id) {
        Map<String, Object> result = dao.findById(id);
        return result;
    }
	
	/**
	 * 获取单条数据
	 * @param qualityCap
	 * @return
	 */
	@Override
	public QualityCap get(QualityCap qualityCap) {
		return super.get(qualityCap);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityCap
	 * @return
	 */
	@Override
	public Page<QualityCap> findPage(Page<QualityCap> page, QualityCap qualityCap) {
        qualityCap.setPage(page);
        List<Map<String,Object>> result = dao.findListMap(qualityCap);
        List<QualityCap> list = new ArrayList<>();
        result.forEach(a->{
            QualityCap bean = new QualityCap();
            try {
                BeanUtils.populate(bean,a);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            list.add(bean);
        });
        return page.setList(list);

	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityCap
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityCap qualityCap) {
		super.save(qualityCap);
	}
	
	/**
	 * 更新状态
	 * @param qualityCap
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityCap qualityCap) {
		super.updateStatus(qualityCap);
	}
	
	/**
	 * 删除数据
	 * @param qualityCap
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityCap qualityCap) {
		super.delete(qualityCap);
	}
	
}