/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.gc.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.gc.entity.QualityGc;
import com.zebone.quality.modules.gc.dao.QualityGcDao;

/**
 * quality_gcService
 * @author 卡卡西
 * @version 2021-02-19
 */
@Service
@Transactional(readOnly=true)
public class QualityGcService extends CrudService<QualityGcDao, QualityGc> {

    public Map<String,Object> findById(String id) {
        Map<String,Object> result = dao.findById(id);
        return result;
    }
	/**
	 * 获取单条数据
	 * @param qualityGc
	 * @return
	 */
	@Override
	public QualityGc get(QualityGc qualityGc) {
		return super.get(qualityGc);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityGc
	 * @return
	 */
	@Override
	public Page<QualityGc> findPage(Page<QualityGc> page, QualityGc qualityGc) {
//		return super.findPage(page, qualityGc);
        qualityGc.setPage(page);
        List<Map<String,Object>> result = dao.findListMap(qualityGc);
        List<QualityGc> list = new ArrayList<>();
        result.forEach(a->{
            QualityGc bean = new QualityGc();
            try {
                BeanUtils.populate(bean,a);
                list.add(bean);
            }catch (IllegalAccessException e){
                e.printStackTrace();
            } catch (InvocationTargetException e){
                e.printStackTrace();
            }
        });
        return page.setList(list);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityGc
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityGc qualityGc) {
		super.save(qualityGc);
	}
	
	/**
	 * 更新状态
	 * @param qualityGc
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityGc qualityGc) {
		super.updateStatus(qualityGc);
	}
	
	/**
	 * 删除数据
	 * @param qualityGc
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityGc qualityGc) {
		super.delete(qualityGc);
	}
	
}