/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.modules.wx.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.modules.wx.entity.WxConfig;
import com.zebone.modules.wx.dao.WxConfigDao;
import com.jeesite.modules.file.utils.FileUploadUtils;

/**
 * 微信配置Service
 * @author lijin
 * @version 2020-12-08
 */
@Service
@Transactional(readOnly=true)
public class WxConfigService extends CrudService<WxConfigDao, WxConfig> {
	
	/**
	 * 获取单条数据
	 * @param wxConfig
	 * @return
	 */
	@Override
	public WxConfig get(WxConfig wxConfig) {
		return super.get(wxConfig);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param wxConfig
	 * @return
	 */
	@Override
	public Page<WxConfig> findPage(Page<WxConfig> page, WxConfig wxConfig) {
		return super.findPage(page, wxConfig);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param wxConfig
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(WxConfig wxConfig) {
		super.save(wxConfig);
		// 保存上传附件
		FileUploadUtils.saveFileUpload(wxConfig.getId(), "wxConfig_file");
	}
	
	/**
	 * 更新状态
	 * @param wxConfig
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(WxConfig wxConfig) {
		super.updateStatus(wxConfig);
	}
	
	/**
	 * 删除数据
	 * @param wxConfig
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(WxConfig wxConfig) {
		super.delete(wxConfig);
	}
	
}