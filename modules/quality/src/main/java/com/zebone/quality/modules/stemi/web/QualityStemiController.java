/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.stemi.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import com.jeesite.common.lang.DateUtils;
import com.zebone.quality.common.utils.TaskUtil;
import com.zebone.quality.domain.UploadService;
import com.zebone.quality.modules.common.UploadResult;
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
import com.zebone.quality.modules.stemi.entity.QualityStemi;
import com.zebone.quality.modules.stemi.service.QualityStemiService;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * STEMI急性心肌梗死（ST 段抬高型，首次住院）Controller
 * @author lijin
 * @version 2021-01-28
 */
@Controller
@RequestMapping(value = "${adminPath}/stemi/qualityStemi")
public class QualityStemiController extends BaseController {

	@Autowired
	private QualityStemiService qualityStemiService;
	@Autowired
	private UploadService uploadService;
	@Autowired
	private TaskService taskService;
	@Autowired
    private EmrDataService emrDataService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public QualityStemi get(String id, boolean isNewRecord)  throws InvocationTargetException, IllegalAccessException {
        if(!StringUtils.isEmpty(id)&&!isNewRecord){
            Map<String,Object> result = qualityStemiService.findById(id);
            QualityStemi qualityStemi = new QualityStemi();
            BeanUtils.populate(qualityStemi,result);
            return qualityStemi;
        }else {
			QualityStemi qualityStemi = new QualityStemi();
			qualityStemi =qualityStemiService.get(id, isNewRecord);
            return qualityStemi;
        }
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("stemi:qualityStemi:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualityStemi qualityStemi, Model model) {
		model.addAttribute("qualityStemi", qualityStemi);
		return "modules/stemi/qualityStemiList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("stemi:qualityStemi:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<QualityStemi> listData(QualityStemi qualityStemi, HttpServletRequest request, HttpServletResponse response) {
		Page<QualityStemi> page = qualityStemiService.findPage(new Page<QualityStemi>(request, response), qualityStemi); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("stemi:qualityStemi:view")
	@RequestMapping(value = "form")
	public String form(QualityStemi qualityStemi, Model model) {
        if(StringUtils.isEmpty(qualityStemi.getId())){

            //默认费用
            qualityStemi.setCm_6_1(0.0);
            qualityStemi.setCm_6_2(0.0);
            qualityStemi.setCm_6_3(0.0);
            qualityStemi.setCm_6_4(0.0);
            qualityStemi.setCm_6_5(0.0);
            qualityStemi.setCm_6_6(0.0);
            qualityStemi.setCm_6_7(0.0);
            qualityStemi.setCm_6_8(0.0);
            qualityStemi.setCm_6_9(0.0);
            qualityStemi.setCm_6_10(0.0);
            qualityStemi.setCm_6_11(0.0);
            qualityStemi.setCm_6_12(0.0);
            qualityStemi.setCm_6_13(0.0);
            qualityStemi.setCm_6_14(0.0);
            qualityStemi.setCm_6_15(0.0);
            qualityStemi.setCm_6_16(0.0);
            qualityStemi.setCm_6_17(0.0);
            qualityStemi.setCm_6_18(0.0);
            qualityStemi.setCm_6_19(0.0);
            qualityStemi.setCm_6_20(0.0);
            qualityStemi.setCm_6_21(0.0);
            qualityStemi.setCm_6_22(0.0);
            qualityStemi.setCm_6_23(0.0);
            qualityStemi.setCm_6_24(0.0);
            qualityStemi.setCm_6_25(0.0);
            qualityStemi.setCm_6_26(0.0);
            qualityStemi.setCm_6_27(0.0);
            qualityStemi.setCm_6_28(0.0);
            qualityStemi.setCm_6_29(0.0);
            qualityStemi.setCm_6_30(0.0);
        }
		model.addAttribute("qualityStemi", qualityStemi);
		return "modules/stemi/qualityStemiForm";
	}

	/**
	 * 查看审核表单
	 */
	@RequiresPermissions("stemi:qualityStemi:view")
	@RequestMapping(value = "view")
	public String viewForm(String id,String taskId, Model model) throws InvocationTargetException, IllegalAccessException{
		Map<String,Object> result = qualityStemiService.findById(id);
		QualityStemi qualityStemi = new QualityStemi();
		BeanUtils.populate(qualityStemi,result);
		model.addAttribute("qualityStemi", qualityStemi);
		model.addAttribute("taskId",taskId);
		return "modules/stemi/qualityStemiViewForm";
	}

	/**
	 * 保存STEMI急性心肌梗死（ST 段抬高型，首次住院）
	 */
	@RequiresPermissions("stemi:qualityStemi:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated QualityStemi qualityStemi) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		if(qualityStemi.getIsNewRecord()){
			qualityStemiService.save(qualityStemi);
			TaskUtil.startTask("stemi",qualityStemi.getId());
		}else{
			qualityStemiService.save(qualityStemi);
		}

		String result = uploadService.upload(qualityStemi,new Stemi(),"STEMI");
		Gson gson = new Gson();
		UploadResult uploadResult = gson.fromJson(result, UploadResult.class);
		Integer resultCode = Optional.ofNullable(uploadResult).map(a->a.getCode()).orElse(null);
		if(resultCode==1000){
			String errorMessage = Optional.ofNullable(uploadResult).map(a->a.getMessage()).orElse("上传失败");
			return renderResult(Global.FALSE, text(errorMessage));
		}

		return renderResult(Global.TRUE, text("保存STEMI急性心肌梗死（ST 段抬高型，首次住院）成功！"));
	}
	
	/**
	 * 停用STEMI急性心肌梗死（ST 段抬高型，首次住院）
	 */
	@RequiresPermissions("stemi:qualityStemi:edit")
	@RequestMapping(value = "disable")
	@ResponseBody
	public String disable(QualityStemi qualityStemi) {
		qualityStemi.setStatus(QualityStemi.STATUS_DISABLE);
		qualityStemiService.updateStatus(qualityStemi);
		return renderResult(Global.TRUE, text("停用STEMI急性心肌梗死（ST 段抬高型，首次住院）成功"));
	}
	
	/**
	 * 启用STEMI急性心肌梗死（ST 段抬高型，首次住院）
	 */
	@RequiresPermissions("stemi:qualityStemi:edit")
	@RequestMapping(value = "enable")
	@ResponseBody
	public String enable(QualityStemi qualityStemi) {
		qualityStemi.setStatus(QualityStemi.STATUS_NORMAL);
		qualityStemiService.updateStatus(qualityStemi);
		return renderResult(Global.TRUE, text("启用STEMI急性心肌梗死（ST 段抬高型，首次住院）成功"));
	}
	
	/**
	 * 删除STEMI急性心肌梗死（ST 段抬高型，首次住院）
	 */
	@RequiresPermissions("stemi:qualityStemi:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(QualityStemi qualityStemi) {
		qualityStemiService.delete(qualityStemi);
		return renderResult(Global.TRUE, text("删除STEMI急性心肌梗死（ST 段抬高型，首次住院）成功！"));
	}

	@RequiresPermissions("stemi:qualityStemi:edit")
	@PostMapping(value = "review")
	@ResponseBody
	public String review(QualityStemi qualityStemi,String taskId) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

		Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
		if (task == null) {
			return renderResult(Global.FALSE, text("流程不存在"));
		}
		//通过审核
		HashMap<String, Object> map = new HashMap<>(16);
		map.put("approve", true);
		taskService.complete(taskId, map);

		String result = uploadService.upload(qualityStemi,new Stemi(),"STEMI");
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
        //String icd = MapUtils.getString(mapResult,"DIAG_CODE_CLINIC_ICD");
        String idNo = MapUtils.getString(mapResult,"ID_NO","");
       // mapResult.put("CM_0_1_3_1",MapUtils.getString(codeMap,icd,""));
        mapResult.put("idcard",idNo);
        mapResult.put("cm_0_1_5","0".equals(MapUtils.getString(mapResult,"cm_0_1_5"))?"n":"y");
        Gson gson = new Gson();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        /**
         *   cm_0_2_6_2：手术结束时间，cm_1_6_1:术后停药时间，使用抗菌药物时间使用时间分层（cm_1_6_2）=停药时间 - 手术结束时间
         *   a:术后24小时内结束使用；b:术后48小时内结束使用；c:术后48小时之后继续使用；def：请选择
         */
        //获取术后停药时间
        String cm_1_6_11 = MapUtils.getString(mapResult,"cm_1_6_1");
        String cm_0_2_6_21 = MapUtils.getString(mapResult,"cm_0_2_6_2");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        if (!StringUtils.isEmpty(cm_0_2_6_21) && !StringUtils.isEmpty(cm_1_6_11)){
            long cm_1_6_12 = sdf.parse(cm_1_6_11).getTime();
            long cm_0_2_6_22 = sdf.parse(cm_0_2_6_21).getTime();
            if (cm_0_2_6_22 != 0 && cm_1_6_12 !=0) {
                long hour = (cm_1_6_12 - cm_0_2_6_22)/(60*60*1000);
                if (0<=hour && hour<=24){
                    mapResult.put("cm_1_6_2","a");
                    mapResult.put("cm_1_6_2",MapUtils.getString(mapResult,"cm_1_6_2"));
                }
                if (hour>24 && hour<=48){
                    mapResult.put("cm_1_6_2","b");
                    mapResult.put("cm_1_6_2",MapUtils.getString(mapResult,"cm_1_6_2"));
                }
                if (hour>48){
                    mapResult.put("cm_1_6_2","c");
                    mapResult.put("cm_1_6_2",MapUtils.getString(mapResult,"cm_1_6_2"));
                }
            }else {
                mapResult.put("cm_1_6_2","UTD");
                mapResult.put("cm_1_6_2",MapUtils.getString(mapResult,"cm_1_6_2"));
            }
        }else {
            mapResult.put("cm_1_6_2","UTD");
            mapResult.put("cm_1_6_2",MapUtils.getString(mapResult,"cm_1_6_2"));
        }
        //患者身高,如果为0则默认为1
        // mapResult.put("cm_0_2_1_5",MapUtils.getDouble(mapResult,"cm_0_2_1_5") == 0?"":MapUtils.getDouble(mapResult,"cm_0_2_1_5"));
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
                    mapResult.put("cm_6_9",MapUtils.getObject(map,"ITEM_AMOUNT",0));
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
}