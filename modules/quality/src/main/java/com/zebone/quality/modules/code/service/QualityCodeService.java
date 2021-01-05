/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.code.service;

import java.util.List;

import com.jeesite.common.service.ServiceException;
import com.jeesite.common.utils.excel.ExcelImport;
import com.jeesite.common.validator.ValidatorUtils;
import com.jeesite.modules.sys.entity.EmpUser;
import com.jeesite.modules.sys.entity.User;
import com.jeesite.modules.sys.utils.UserUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.zebone.quality.modules.code.entity.QualityCode;
import com.zebone.quality.modules.code.dao.QualityCodeDao;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.ConstraintViolationException;

/**
 * 编码对照Service
 * @author lijin
 * @version 2020-12-31
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

	/**
	 * 导入用户数据
	 * @param file 导入的用户数据文件
	 * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
	 */
	@Transactional(readOnly=false)
	public String importData(MultipartFile file, Boolean isUpdateSupport) {
		if (file == null){
			throw new ServiceException("请选择导入的数据文件！");
		}
		int successNum = 0; int failureNum = 0;
		StringBuilder successMsg = new StringBuilder();
		StringBuilder failureMsg = new StringBuilder();
		try(ExcelImport ei = new ExcelImport(file, 2, 0)){
			List<QualityCode> list = ei.getDataList(QualityCode.class);
			for (QualityCode qualityCode : list) {
				try{
					this.save(qualityCode);
					successNum++;
					successMsg.append("<br/>" + successNum + "、 更新成功 ");
				} catch (Exception e) {
					failureNum++;
					String msg = "<br/>" + failureNum + "、导入失败 " ;
					if (e instanceof ConstraintViolationException){
						List<String> messageList = ValidatorUtils.extractPropertyAndMessageAsList((ConstraintViolationException)e, ": ");
						for (String message : messageList) {
							msg += message + "; ";
						}
					}else{
						msg += e.getMessage();
					}
					failureMsg.append(msg);
					logger.error(msg, e);
				}
			}
		} catch (Exception e) {
			failureMsg.append(e.getMessage());
			logger.error(e.getMessage(), e);
		}
		if (failureNum > 0) {
			failureMsg.insert(0, "很抱歉，导入失败！共 " + failureNum + " 条数据格式不正确，错误如下：");
			throw new ServiceException(failureMsg.toString());
		}else{
			successMsg.insert(0, "恭喜您，数据已全部导入成功！共 " + successNum + " 条，数据如下：");
		}
		return successMsg.toString();
	}
}