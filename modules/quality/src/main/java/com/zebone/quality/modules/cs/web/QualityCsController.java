/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.cs.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.jeesite.common.shiro.realms.G;
import com.zebone.quality.common.utils.TaskUtil;
import com.zebone.quality.domain.UploadService;
import com.zebone.quality.modules.common.UploadResult;
import com.zebone.quality.modules.cs.entity.CsVo;
import com.zebone.quality.modules.emr.service.EmrDataService;
import com.zebone.quality.modules.stemi.entity.Stemi;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.jeesite.common.config.Global;
import com.jeesite.common.entity.Page;
import com.jeesite.common.web.BaseController;
import com.zebone.quality.modules.cs.entity.QualityCs;
import com.zebone.quality.modules.cs.service.QualityCsService;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;

/**
 * cs剖宫产Controller
 * @author 卡卡西
 * @version 2021-02-05
 */
@Controller
@RequestMapping(value = "${adminPath}/cs/qualityCs")
public class QualityCsController extends BaseController {

	@Autowired
	private QualityCsService qualityCsService;
	@Autowired
	private UploadService uploadService;
	@Autowired
	private TaskService taskService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityCs get(String id, boolean isNewRecord) throws InvocationTargetException, IllegalAccessException {
		if(!StringUtils.isEmpty(id)&&!isNewRecord){
			Map<String,Object> result = qualityCsService.findById(id);
			QualityCs qualityCs = new QualityCs();
			BeanUtils.populate(qualityCs,result);
			return qualityCs;
		}else {
			return qualityCsService.get(id, isNewRecord);
		}
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("cs:qualityCs:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityCs qualityCs, Model model) {
		model.addAttribute("qualityCs", qualityCs);
		return "modules/cs/qualityCsList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("cs:qualityCs:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityCs> listData(QualityCs qualityCs, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityCs> page = qualityCsService.findPage(new Page<QualityCs>(request, response), qualityCs); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("cs:qualityCs:view")
	@RequestMapping(value = "form")
	public String form(QualityCs qualityCs, Model model) {
		model.addAttribute("qualityCs", qualityCs);
		return "modules/cs/qualityCsForm";
	}

	/**
	 * 查看审核表单
	 */
	@RequiresPermissions("stemi:qualityCs:view")
	@RequestMapping(value = "view")
	public String viewForm(String id,String taskId, Model model) throws InvocationTargetException, IllegalAccessException{
		Map<String,Object> result = qualityCsService.findById(id);
		QualityCs qualityCs = new QualityCs();
		BeanUtils.populate(qualityCs,result);
		model.addAttribute("qualityCs", qualityCs);
		model.addAttribute("taskId",taskId);
		return "modules/stemi/qualityCsViewForm";
	}

	/**
	 * 保存cs剖宫产
	 */
	@RequiresPermissions("cs:qualityCs:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityCs qualityCs) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//		if(qualityCs.getIsNewRecord()){
//			qualityCsService.save(qualityCs);
//			TaskUtil.startTask("cs",qualityCs.getId());
//		}else{
//
//		}
		qualityCsService.save(qualityCs);

        String result = uploadService.upload(qualityCs, new CsVo(), "CS");
		Gson gson = new Gson();
		UploadResult uploadResult = gson.fromJson(result, UploadResult.class);
		Integer resultCode = Optional.ofNullable(uploadResult).map(a->a.getCode()).orElse(null);
		if(resultCode==1000){
			String errorMessage = Optional.ofNullable(uploadResult).map(a->a.getMessage()).orElse("上传失败");

			return renderResult(Global.FALSE, text(errorMessage));
		}
		return renderResult(Global.TRUE, text("保存cs剖宫产成功！"));
	}
	
	/**
	 * 停用cs剖宫产
	 */
	@RequiresPermissions("cs:qualityCs:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityCs qualityCs) {
		qualityCs.setStatus(QualityCs.STATUS_DISABLE);
		qualityCsService.updateStatus(qualityCs);
		return renderResult(Global.TRUE, text("停用cs剖宫产成功"));
	}
	
	/**
	 * 启用cs剖宫产
	 */
	@RequiresPermissions("cs:qualityCs:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityCs qualityCs) {
		qualityCs.setStatus(QualityCs.STATUS_NORMAL);
		qualityCsService.updateStatus(qualityCs);
		return renderResult(Global.TRUE, text("启用cs剖宫产成功"));
	}
	
	/**
	 * 删除cs剖宫产
	 */
	@RequiresPermissions("cs:qualityCs:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityCs qualityCs) {
		qualityCsService.delete(qualityCs);
		return renderResult(Global.TRUE, text("删除cs剖宫产成功！"));
	}

	@RequiresPermissions("stemi:qualityCs:edit")
	@PostMapping(value = "review")
	@ResponseBody
	public String review(QualityCs qualityCs,String taskId) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

		Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
		if (task == null) {
			return renderResult(Global.FALSE, text("流程不存在"));
		}
		//通过审核
		HashMap<String, Object> map = new HashMap<>(16);
		map.put("approve", true);
		taskService.complete(taskId, map);

		String result = uploadService.upload(qualityCs,new CsVo(),"CS");
		Gson gson = new Gson();
		UploadResult uploadResult = gson.fromJson(result, UploadResult.class);
		Integer resultCode = Optional.ofNullable(uploadResult).map(a->a.getCode()).orElse(null);
		if(resultCode==1000){
			String errorMessage = Optional.ofNullable(uploadResult).map(a->a.getMessage()).orElse("上传失败");
			return renderResult(Global.FALSE, text(errorMessage));
		}

		return renderResult(Global.TRUE, text("流程审核通过！"));
	}


	private static Map<String,Object> codeMap = new HashMap<>(16);
	static {
		codeMap.put("Z37.000","a");
		codeMap.put("Z37.100","b");
		codeMap.put("Z37.200","c");
		codeMap.put("Z37.300","d");
		codeMap.put("Z37.400","e");
		codeMap.put("Z37.500","f");
		codeMap.put("Z37.600","g");
		codeMap.put("Z37.700","h");
	}

	@Autowired
	private EmrDataService emrDataService;

	@ResponseBody
	@RequestMapping(value = "commonData")
	public String commonData(String patNo,String type, HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Map<String,Object>> result = emrDataService.getCommonData(patNo);
		Map<String,Object> mapResult = result.stream().findFirst().orElseThrow(()->new Exception("未查询到患者病案信息"));
		String icd = MapUtils.getString(mapResult,"DIAG_CODE_CLINIC_ICD");
		String idNo = MapUtils.getString(mapResult,"ID_NO","");
		mapResult.put("CM_0_1_3_1",MapUtils.getString(codeMap,icd,""));
		mapResult.put("idcard",idNo);
		mapResult.put("cm_0_1_5","0".equals(MapUtils.getString(mapResult,"cm_0_1_5"))?"n":"y");
		Gson gson = new Gson();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

		mapResult.put("cm_0_2_1_1",simpleDateFormat.format(MapUtils.getObject(mapResult,"cm_0_2_1_1")));
		mapResult.put("cm_0_2_4_1",simpleDateFormat.format(MapUtils.getObject(mapResult,"admit_time")));
		mapResult.put("cm_0_2_4_2",simpleDateFormat.format(MapUtils.getObject(mapResult,"dis_time")));
		String jsonResult =  gson.toJson(mapResult);
		return jsonResult;
	}
}