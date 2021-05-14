/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.um.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.um.entity.QualityUm;
import com.zebone.quality.modules.um.dao.QualityUmDao;

/**
 * UM子宫肌瘤（手术治疗）Service
 * @author 卡卡西
 * @version 2021-02-06
 */
@Service
@Transactional(readOnly=true)
public class QualityUmService extends CrudService<QualityUmDao, QualityUm> {

    public Map<String,Object> findById(String id) {
        Map<String,Object> result = dao.findById(id);
        return result;
    }
	
	/**
	 * 获取单条数据
	 * @param qualityUm
	 * @return
	 */
	@Override
	public QualityUm get(QualityUm qualityUm) {
		return super.get(qualityUm);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityUm
	 * @return
	 */
	@Override
	public Page<QualityUm> findPage(Page<QualityUm> page, QualityUm qualityUm) {
        qualityUm.setPage(page);
        List<Map<String,Object>> result = dao.findListMap(qualityUm);
        List<QualityUm> list = new ArrayList<>();
        result.forEach(a->{
            QualityUm bean = new QualityUm();
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
	 * @param qualityUm
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityUm qualityUm) {
		super.save(qualityUm);
	}
	
	/**
	 * 更新状态
	 * @param qualityUm
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityUm qualityUm) {
		super.updateStatus(qualityUm);
	}
	
	/**
	 * 删除数据
	 * @param qualityUm
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityUm qualityUm) {
		super.delete(qualityUm);
	}
	
}