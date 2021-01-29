/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.base.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.base.entity.QualityDisease;
import com.zebone.quality.modules.base.dao.QualityDiseaseDao;
import com.jeesite.modules.file.utils.FileUploadUtils;

/**
 * 病种设置Service
 * @author lijin
 * @version 2021-01-14
 */
@Service
@Transactional(readOnly=true)
public class QualityDiseaseService extends CrudService<QualityDiseaseDao, QualityDisease> {
	
	/**
	 * 获取单条数据
	 * @param qualityDisease
	 * @return
	 */
	@Override
	public QualityDisease get(QualityDisease qualityDisease) {
		return super.get(qualityDisease);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param qualityDisease
	 * @return
	 */
	@Override
	public Page<QualityDisease> findPage(Page<QualityDisease> page, QualityDisease qualityDisease) {
		qualityDisease.setPage(page);
		System.out.println(qualityDisease.getSqlMap().getWhere().toSql());
		List<QualityDisease> list = dao.findList(qualityDisease);
		return page.setList(list);
//		return super.findPage(page, qualityDisease);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param qualityDisease
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(QualityDisease qualityDisease) {
		super.save(qualityDisease);
		// 保存上传图片
		FileUploadUtils.saveFileUpload(qualityDisease.getId(), "qualityDisease_image");
	}
	
	/**
	 * 更新状态
	 * @param qualityDisease
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(QualityDisease qualityDisease) {
		super.updateStatus(qualityDisease);
	}
	
	/**
	 * 删除数据
	 * @param qualityDisease
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(QualityDisease qualityDisease) {
		super.delete(qualityDisease);
	}
	
}