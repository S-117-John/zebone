/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.hf.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import com.google.gson.Gson;
import com.jeesite.common.codec.EncodeUtils;
import com.jeesite.common.lang.DateUtils;
import com.jeesite.common.mapper.JsonMapper;
import com.jeesite.modules.sys.entity.EmpUser;
import com.zebone.quality.common.entity.Patient;
import com.zebone.quality.common.utils.QualityUtil;
import com.zebone.quality.common.utils.TaskUtil;
import com.zebone.quality.domain.UploadService;
import com.zebone.quality.modules.base.entity.QualityDisease;
import com.zebone.quality.modules.base.service.QualityDiseaseService;
import com.zebone.quality.modules.common.UploadResult;
import com.zebone.quality.modules.emr.service.EmrDataService;
import com.zebone.quality.modules.hf.dao.QualityHfPatientDao;
import com.zebone.quality.modules.hf.entity.Hf;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;

import org.flowable.engine.HistoryService;
import org.flowable.engine.RuntimeService;
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
import com.zebone.quality.modules.hf.entity.QualityHf;
import com.zebone.quality.modules.hf.service.QualityHfService;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * HF心力衰竭Controller
 * @author 卡卡西
 * @version 2021-01-28
 */
@Controller
@RequestMapping(value = "${adminPath}/hf/qualityHf")
public class QualityHfController extends BaseController {

	@Autowired
	private QualityHfService qualityHfService;

	@Autowired
	private UploadService uploadService;

    @Autowired
    private EmrDataService emrDataService;

	@Autowired
	private RuntimeService runtimeService;

	@Autowired
	private TaskService taskService;

	@Autowired
	private HistoryService historyService;

    @Autowired
    private QualityDiseaseService qualityDiseaseService;

    @Autowired
    private QualityHfPatientDao qualityHfPatientDao;

	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityHf get(String id, boolean isNewRecord) throws InvocationTargetException, IllegalAccessException {
		if(!StringUtils.isEmpty(id)&&!isNewRecord){
			Map<String,Object> result = qualityHfService.findById(id);
			QualityHf qualityHf = new QualityHf();
			BeanUtils.populate(qualityHf,result);
			return qualityHf;
		}else {
			return qualityHfService.get(id, isNewRecord);
		}
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("hf:qualityHf:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityHf qualityHf, Model model) {
		model.addAttribute("qualityHf", qualityHf);
		return "modules/hf/qualityHfList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("hf:qualityHf:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityHf> listData(QualityHf qualityHf, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityHf> page = qualityHfService.findPage(new Page<QualityHf>(request, response), qualityHf); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("hf:qualityHf:view")
	@RequestMapping(value = "form")
	public String form(QualityHf qualityHf, Model model) {

        if(StringUtils.isEmpty(qualityHf.getId())){
            qualityHf.setCm_5_1("y");
            qualityHf.setCm_5_2_1("a");
            qualityHf.setCm_5_2_2("a");
            qualityHf.setCm_5_2_3("a");
            qualityHf.setCm_5_2_5("a");
            qualityHf.setCm_5_2_6("a");
            qualityHf.setCm_5_2_7("a");
            qualityHf.setCm_5_2_8("a");
            qualityHf.setCm_5_2_9("a");
            qualityHf.setCm_5_2_10("a");
            qualityHf.setCm_5_2_11("a");


            //默认费用
            qualityHf.setCm_6_1(0.0);
            qualityHf.setCm_6_2(0.0);
            qualityHf.setCm_6_3(0.0);
            qualityHf.setCm_6_4(0.0);
            qualityHf.setCm_6_5(0.0);
            qualityHf.setCm_6_6(0.0);
            qualityHf.setCm_6_7(0.0);
            qualityHf.setCm_6_8(0.0);
            qualityHf.setCm_6_9(0.0);
            qualityHf.setCm_6_10(0.0);
            qualityHf.setCm_6_11(0.0);
            qualityHf.setCm_6_12(0.0);
            qualityHf.setCm_6_13(0.0);
            qualityHf.setCm_6_14(0.0);
            qualityHf.setCm_6_15(0.0);
            qualityHf.setCm_6_16(0.0);
            qualityHf.setCm_6_17(0.0);
            qualityHf.setCm_6_18(0.0);
            qualityHf.setCm_6_19(0.0);
            qualityHf.setCm_6_20(0.0);
            qualityHf.setCm_6_21(0.0);
            qualityHf.setCm_6_22(0.0);
            qualityHf.setCm_6_23(0.0);
            qualityHf.setCm_6_24(0.0);
            qualityHf.setCm_6_25(0.0);
            qualityHf.setCm_6_26(0.0);
            qualityHf.setCm_6_27(0.0);
            qualityHf.setCm_6_28(0.0);
            qualityHf.setCm_6_29(0.0);
            qualityHf.setCm_6_30(0.0);
        }
		model.addAttribute("qualityHf", qualityHf);
		return "modules/hf/qualityHfForm";
	}
	/**
	 * 审核表单
	 */
	@RequiresPermissions("hf:qualityHf:view")
	@RequestMapping(value = "view")
	public String viewForm(String id,String taskId, Model model) {
		model.addAttribute("qualityHf", qualityHfService.get(id, false));
		model.addAttribute("taskId",taskId);
		return "modules/hf/qualityHfViewForm";
	}


	/**
	 * 保存HF心力衰竭
	 */
	@RequiresPermissions("hf:qualityHf:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityHf qualityHf) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		if(qualityHf.getIsNewRecord()){
			qualityHfService.save(qualityHf);
			TaskUtil.startTask("hf",qualityHf.getId());
		}else {
			qualityHfService.updateHf(qualityHf);
		}

		String result = uploadService.upload(qualityHf,new Hf(),"HF");
		Gson gson = new Gson();
		UploadResult uploadResult = gson.fromJson(result, UploadResult.class);
		Integer resultCode = Optional.ofNullable(uploadResult).map(a->a.getCode()).orElse(null);
		if(resultCode==1000){
			String errorMessage = Optional.ofNullable(uploadResult).map(a->a.getMessage()).orElse("上传失败");
			return renderResult(Global.FALSE, text(errorMessage));
		}

		return renderResult(Global.TRUE, text("保存HF心力衰竭成功！"));
	}
	
	/**
	 * 停用HF心力衰竭
	 */
	@RequiresPermissions("hf:qualityHf:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityHf qualityHf) {
		qualityHf.setStatus(QualityHf.STATUS_DISABLE);
		qualityHfService.updateStatus(qualityHf);
		return renderResult(Global.TRUE, text("停用HF心力衰竭成功"));
	}
	
	/**
	 * 启用HF心力衰竭
	 */
	@RequiresPermissions("hf:qualityHf:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityHf qualityHf) {
		qualityHf.setStatus(QualityHf.STATUS_NORMAL);
		qualityHfService.updateStatus(qualityHf);
		return renderResult(Global.TRUE, text("启用HF心力衰竭成功"));
	}
	
	/**
	 * 删除HF心力衰竭
	 */
	@RequiresPermissions("hf:qualityHf:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityHf qualityHf) {
		qualityHfService.delete(qualityHf);
		return renderResult(Global.TRUE, text("删除HF心力衰竭成功！"));
	}

	@RequiresPermissions("hf:qualityHf:edit")
	@PostMapping(value = "review")
	@ResponseBody
	public String review(QualityHf qualityHf,String taskId) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

		Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
		if (task == null) {
			return renderResult(Global.FALSE, text("流程不存在"));
		}
		//通过审核
		HashMap<String, Object> map = new HashMap<>(16);
		map.put("approve", true);
		taskService.complete(taskId, map);


		String result = uploadService.upload(qualityHf,new Hf(),"HF");
		Gson gson = new Gson();
		UploadResult uploadResult = gson.fromJson(result, UploadResult.class);
		Integer resultCode = Optional.ofNullable(uploadResult).map(a->a.getCode()).orElse(null);
		if(resultCode==1000){
			String errorMessage = Optional.ofNullable(uploadResult).map(a->a.getMessage()).orElse("上传失败");
			return renderResult(Global.FALSE, text(errorMessage));
		}

		return renderResult(Global.TRUE, text("流程审核通过！"));
	}

    /**
     * 导入患者信息
     * @param patNo
     * @param type
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "commonData")
    public String commonData(String patNo,String type, HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Map<String,Object>> result = emrDataService.getCommonData(patNo);
        Map<String,Object> mapResult = result.stream().findFirst().orElseThrow(()->new Exception("未查询到患者病案信息"));
        String idNo = MapUtils.getString(mapResult,"ID_NO","");
        mapResult.put("idcard",idNo);
        mapResult.put("cm_0_1_5","0".equals(MapUtils.getString(mapResult,"cm_0_1_5"))?"n":"y");
        Gson gson = new Gson();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //患者身高,如果为0则默认为1
        mapResult.put("cm_0_2_1_5",MapUtils.getDouble(mapResult,"cm_0_2_1_5") == 0?"":MapUtils.getDouble(mapResult,"cm_0_2_1_5"));
        mapResult.put("cm_0_2_1_1", DateUtils.formatDate((Date) MapUtils.getObject(mapResult,"cm_0_2_1_1"),"yyyy-MM-dd"));
        mapResult.put("cm_0_2_4_1",DateUtils.formatDate((Date) MapUtils.getObject(mapResult,"admit_time"),"yyyy-MM-dd HH:mm"));
        mapResult.put("cm_0_2_4_2",DateUtils.formatDate((Date) MapUtils.getObject(mapResult,"dis_time"),"yyyy-MM-dd HH:mm"));
        //获取价格
        String pkPage = MapUtils.getString(mapResult,"PK_PAGE");
        if(!StringUtils.isEmpty(pkPage)){
            List<Map<String,Object>> chargeList = emrDataService.chargeList(pkPage);
            for (Map<String, Object> map : chargeList) {
                String itemCode = MapUtils.getString(map,"ITEM_CODE");
                //住院总费用
                if("0".equals(itemCode)){
                    mapResult.put("cm_6_1",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }
                //自负金额
                if("99".equals(itemCode)){
                    mapResult.put("cm_6_2",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }
                //一般医疗服务费
                if("1".equals(itemCode)){
                    mapResult.put("cm_6_3",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //一般医疗操作费
                if("2".equals(itemCode)){
                    mapResult.put("cm_6_4",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //护理费
                if("3".equals(itemCode)){
                    mapResult.put("cm_6_5",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //综合医疗服务类其他费用
                if("4".equals(itemCode)){
                    mapResult.put("cm_6_6",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //病理诊断费
                if("5".equals(itemCode)){
                    mapResult.put("cm_6_7",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //实验室诊断费
                if("6".equals(itemCode)){
                    mapResult.put("cm_6_8",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //影像学诊断费
                if("7".equals(itemCode)){
                    mapResult.put("cm_6_9", MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //临床诊断项目费
                if("8".equals(itemCode)){
                    mapResult.put("cm_6_10",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //非手术治疗项目费
                if("9".equals(itemCode)){
                    mapResult.put("cm_6_11",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //非手术治疗项目费
                if("9".equals(itemCode)){
                    mapResult.put("cm_6_11",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //其中：临床物理治疗费
                if("901".equals(itemCode)){
                    mapResult.put("cm_6_12",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //手术治疗费
                if("10".equals(itemCode)){
                    mapResult.put("cm_6_13",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //其中：麻醉费
                if("1001".equals(itemCode)){
                    mapResult.put("cm_6_14",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //其中：手术费
                if("1002".equals(itemCode)){
                    mapResult.put("cm_6_15",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //康复费
                if("11".equals(itemCode)){
                    mapResult.put("cm_6_16",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //中医治疗费
                if("12".equals(itemCode)){
                    mapResult.put("cm_6_17",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //西药费
                if("13".equals(itemCode)){
                    mapResult.put("cm_6_18",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //其中：抗菌药物费
                if("1301".equals(itemCode)){
                    mapResult.put("cm_6_19",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //中成药费
                if("14".equals(itemCode)){
                    mapResult.put("cm_6_20",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //中成药费
                if("15".equals(itemCode)){
                    mapResult.put("cm_6_21",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //血费
                if("16".equals(itemCode)){
                    mapResult.put("cm_6_22",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //白蛋白类制品费
                if("17".equals(itemCode)){
                    mapResult.put("cm_6_23",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //球蛋白类制品费
                if("18".equals(itemCode)){
                    mapResult.put("cm_6_24",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //凝血因子类制品费
                if("19".equals(itemCode)){
                    mapResult.put("cm_6_25",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //细胞因子类制品费
                if("20".equals(itemCode)){
                    mapResult.put("cm_6_26",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //检查用一次性医用材料费
                if("21".equals(itemCode)){
                    mapResult.put("cm_6_27",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //治疗用一次性医用材料费
                if("22".equals(itemCode)){
                    mapResult.put("cm_6_28",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //手术用一次性医用材料费
                if("23".equals(itemCode)){
                    mapResult.put("cm_6_29",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

                //其他费
                if("24".equals(itemCode)){
                    mapResult.put("cm_6_30",MapUtils.getObject(map,"ITEM_AMOUNT",0));
                }

            }
        }

        String jsonResult =  gson.toJson(mapResult);
        return jsonResult;
    }

    /**
     * 选择员工对话框
     */
    @RequestMapping(value = "patientSelect")
    public String empUserSelect(EmpUser empUser, String selectData, String checkbox, Model model) {
        String selectDataJson = EncodeUtils.decodeUrl(selectData);
        if (JsonMapper.fromJson(selectDataJson, Map.class) != null){
            model.addAttribute("selectData", selectDataJson);
        }
        model.addAttribute("checkbox", checkbox); // 是否显示复选框，支持多选
        model.addAttribute("empUser", empUser); // ModelAttribute
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());  //当前时间
        c.add(Calendar.MONTH,-1);  //上一个月
        model.addAttribute("startTime",c.getTime());
        model.addAttribute("endTime",new Date());
        return "modules/hf/patientSelect";
    }

    /**
     * 新增上报时，查询符合条件的病人
     * @param patientParam
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "patientListData")
    @ResponseBody
    public List<Patient> patientListData(Patient patientParam,HttpServletRequest request, HttpServletResponse response) {
        //1、获取配置条件
        //2、mssql数据源中查询对应结果集
        Map<String,Object> param = new HashMap<>(16);
        QualityDisease qualityDisease = new QualityDisease();
        qualityDisease.setCode("HF");
        List<QualityDisease> qualityDiseaseList = qualityDiseaseService.findList(qualityDisease);
        //icd9条件
        qualityDisease = qualityDiseaseList.stream().findFirst().orElseThrow(()->new RuntimeException("未找到病种设置条件"));
        String icd10 = qualityDisease.getIcd10();
        String dayCondition = qualityDisease.getDayCondition();
        String day = qualityDisease.getDay();
        String ageCondition = qualityDisease.getAgeCondition();
        String age = qualityDisease.getAge();
        param.put("icd10",icd10.split(","));
        param.put("patNo",patientParam.getPatNo());
        param.put("name",patientParam.getName());
        //增加出院起止时间
        param.put("startTime",patientParam.getStartTime());
        param.put("endTime",patientParam.getEndTime());

        List<Patient> patients = qualityHfPatientDao.list(param);
        patients = patients.stream().filter(patient -> icd10.contains(patient.getOpCode())).collect(Collectors.toList());
        if(!StringUtils.isEmpty(dayCondition)&&!StringUtils.isEmpty(day)){
            switch (dayCondition){
                case "大于":
                    patients = patients.stream().filter(patient -> Integer.parseInt(patient.getInHosDays())>Integer.parseInt(day)).collect(Collectors.toList());
                    break;
                case "大于等于":
                    patients = patients.stream().filter(patient -> Integer.parseInt(patient.getInHosDays())>=Integer.parseInt(day)).collect(Collectors.toList());
                    break;
                case "小于":
                    patients = patients.stream().filter(patient -> Integer.parseInt(patient.getInHosDays())<Integer.parseInt(day)).collect(Collectors.toList());
                    break;
                case "小于等于":
                    patients = patients.stream().filter(patient -> Integer.parseInt(patient.getInHosDays())<=Integer.parseInt(day)).collect(Collectors.toList());
                    break;
            }
        }

        if(!StringUtils.isEmpty(ageCondition)&&!StringUtils.isEmpty(age)){
            switch (ageCondition){
                case "大于":
                    patients = patients.stream().filter(patient -> QualityUtil.getAgeByBirth(patient.getBirth()) >Integer.parseInt(age)).collect(Collectors.toList());
                    break;
                case "大于等于":
                    patients = patients.stream().filter(patient -> QualityUtil.getAgeByBirth(patient.getBirth())>=Integer.parseInt(age)).collect(Collectors.toList());
                    break;
                case "小于":
                    patients = patients.stream().filter(patient -> QualityUtil.getAgeByBirth(patient.getBirth())<Integer.parseInt(age)).collect(Collectors.toList());
                    break;
                case "小于等于":
                    patients = patients.stream().filter(patient -> QualityUtil.getAgeByBirth(patient.getBirth())<=Integer.parseInt(age)).collect(Collectors.toList());
                    break;
            }
        }


        return patients;
    }

}