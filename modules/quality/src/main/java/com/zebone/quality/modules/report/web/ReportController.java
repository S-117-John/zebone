/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.report.web;

import com.jeesite.common.collect.ListUtils;
import com.jeesite.common.config.Global;
import com.jeesite.common.entity.Page;
import com.jeesite.common.utils.excel.ExcelExport;
import com.jeesite.common.utils.excel.annotation.ExcelField;
import com.jeesite.common.web.BaseController;
import com.jeesite.modules.sys.entity.DictData;
import com.jeesite.modules.sys.entity.DictType;
import com.jeesite.modules.sys.utils.DictUtils;
import com.zebone.quality.modules.code.entity.QualityCode;
import com.zebone.quality.modules.code.service.QualityCodeService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *
 * @author lijin
 * @version 2020-12-31
 */
@Controller
@RequestMapping(value = "${adminPath}/report")
public class ReportController extends BaseController {



	
	/**
	 * 查询列表
	 */
	@RequestMapping(value = {"list", ""})
	public String list(Model model) {

		List<DictData> dictTypeList = DictUtils.getDictList("diseaseClassification");
		model.addAttribute("typeList",dictTypeList);
		return "modules/report/reportList";
	}
	


}