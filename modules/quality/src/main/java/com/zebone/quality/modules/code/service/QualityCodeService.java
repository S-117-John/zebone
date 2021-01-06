/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.code.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.code.entity.QualityCode;
import com.zebone.quality.modules.code.dao.QualityCodeDao;

/**
 * 编码对照Service
 * @author lijin
 * @version 2021-01-05
 */
@Service
@Transactional(readOnly=true)
public class QualityCodeService extends CrudService<QualityCodeDao, QualityCode> {
	
	/**
	 * 获取单条数据
	 * @param qualityCode
	 * @return
	 */
	@Override
	public QualityCode get(QualityCode qualityCode) {
		return super.get(qualityCode);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityCode
	 * @return
	 */
	@Override
	public Page<QualityCode> findPage(Page<QualityCode> page, QualityCode qualityCode) {
		return super.findPage(page, qualityCode);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityCode
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityCode qualityCode) {
		super.save(qualityCode);
	}
	
	/**
	 * 更新状态
	 * @param qualityCode
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityCode qualityCode) {
		super.updateStatus(qualityCode);
	}
	
	/**
	 * 删除数据
	 * @param qualityCode
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityCode qualityCode) {
		super.delete(qualityCode);
	}



	public String getDictValue(String dictType,String hisCode){
		QualityCode qualityCode = new QualityCode();
		qualityCode.setDictType(dictType);
		qualityCode.setHisCode(hisCode);
		List<QualityCode> qualityCodeList = this.findList(qualityCode);
		if(qualityCodeList.size()>0){
			return qualityCodeList.get(0).getDictValue();
		}else {
			return null;
		}
	}

}