/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.hf.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import org.apache.commons.beanutils.BeanUtils;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.hf.entity.QualityHf;
import com.zebone.quality.modules.hf.dao.QualityHfDao;

/**
 * HF心力衰竭Service
 * @author 卡卡西
 * @version 2021-01-28
 */
@Service
@Transactional(readOnly=true)
public class QualityHfService extends CrudService<QualityHfDao, QualityHf> {

	public Map<String,Object> findById(String id) {
		Map<String,Object> result = dao.findById(id);
		return result;
	}


	/**
	 * 获取单条数据
	 * @param qualityHf
	 * @return
	 */
	@Override
	public QualityHf get(QualityHf qualityHf) {
		return super.get(qualityHf);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityHf
	 * @return
	 */
	@Override
	public Page<QualityHf> findPage(Page<QualityHf> page, QualityHf qualityHf) {
		qualityHf.setPage(page);
		List<Map<String,Object>> result = dao.findListMap(qualityHf);
		List<QualityHf> list = new ArrayList<>();
		result.forEach(a->{
			QualityHf bean = new QualityHf();
			try {
				BeanUtils.populate(bean,a);
				list.add(bean);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		});
		return page.setList(list);
//		return super.findPage(page, qualityHf);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityHf
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityHf qualityHf) {
		super.save(qualityHf);
	}
	
	/**
	 * 更新状态
	 * @param qualityHf
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityHf qualityHf) {
		super.updateStatus(qualityHf);
	}
	
	/**
	 * 删除数据
	 * @param qualityHf
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityHf qualityHf) {
		super.delete(qualityHf);
	}

	@Transactional(readOnly=false)
	public int updateHf(QualityHf qualityHf){
		return dao.updateHf(qualityHf);
	}

	
}