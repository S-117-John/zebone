/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.excle.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jeesite.modules.sys.entity.DictData;
import com.jeesite.modules.sys.entity.DictType;
import com.jeesite.modules.sys.service.DictDataService;
import com.jeesite.modules.sys.service.DictTypeService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jeesite.common.config.Global;
import com.jeesite.common.entity.Page;
import com.jeesite.common.web.BaseController;
import com.zebone.quality.modules.excle.entity.QualityExcleDict;
import com.zebone.quality.modules.excle.service.QualityExcleDictService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 病种数据编码字典Controller
 *
 * @author 卡卡西
 * @version 2021-01-15
 */
@Controller
@RequestMapping(value = "${adminPath}/excle/qualityExcleDict")
public class QualityExcleDictController extends BaseController {

    @Autowired
    private QualityExcleDictService qualityExcleDictService;

    @Autowired
    private DictTypeService dictTypeService;

    @Autowired
    private DictDataService dictDataService;

    /**
     * 获取数据
     */
    @ModelAttribute
    public QualityExcleDict get(String dictId, boolean isNewRecord) {
        return qualityExcleDictService.get(dictId, isNewRecord);
    }

    /**
     * 查询列表
     */
    @RequiresPermissions("excle:qualityExcleDict:view")
    @RequestMapping(value = {"list", ""})
    public String list(QualityExcleDict qualityExcleDict, Model model) {
        model.addAttribute("qualityExcleDict", qualityExcleDict);
        return "modules/excle/qualityExcleDictList";
    }

    /**
     * 查询列表数据
     */
    @RequiresPermissions("excle:qualityExcleDict:view")
    @RequestMapping(value = "listData")
    @ResponseBody
    public Page<QualityExcleDict> listData(QualityExcleDict qualityExcleDict, HttpServletRequest request, HttpServletResponse response) {
        Page<QualityExcleDict> page = qualityExcleDictService.findPage(new Page<QualityExcleDict>(request, response), qualityExcleDict);
        return page;
    }

    /**
     * 查看编辑表单
     */
    @RequiresPermissions("excle:qualityExcleDict:view")
    @RequestMapping(value = "form")
    public String form(QualityExcleDict qualityExcleDict, Model model) {
        model.addAttribute("qualityExcleDict", qualityExcleDict);
        return "modules/excle/qualityExcleDictForm";
    }

    /**
     * 保存病种数据编码字典
     */
    @RequiresPermissions("excle:qualityExcleDict:edit")
    @PostMapping(value = "save")
    @ResponseBody
    public String save(@Validated QualityExcleDict qualityExcleDict) {
        qualityExcleDictService.save(qualityExcleDict);
        return renderResult(Global.TRUE, text("保存病种数据编码字典成功！"));
    }

    /**
     * 删除病种数据编码字典
     */
    @RequiresPermissions("excle:qualityExcleDict:edit")
    @RequestMapping(value = "delete")
    @ResponseBody
    public String delete(QualityExcleDict qualityExcleDict) {
        qualityExcleDictService.delete(qualityExcleDict);
        return renderResult(Global.TRUE, text("删除病种数据编码字典成功！"));
    }


    /**
     * 删除病种数据编码字典
     */
    @RequiresPermissions("excle:qualityExcleDict:edit")
    @RequestMapping(value = "import/type")
    @ResponseBody
    public String importType() {
        List<QualityExcleDict> qualityExcleDicts = qualityExcleDictService.findList(new QualityExcleDict());
        Set<String> codeList = new HashSet<>();
        qualityExcleDicts.forEach(a -> {
			codeList.add(a.getCode());
        });

		codeList.forEach(b->{
			DictType dictType = new DictType();
			dictType.setDictName(b);
			dictType.setDictType(b);
			dictType.setIsSys("0");
			dictTypeService.save(dictType);
		});


        return renderResult(Global.TRUE, text("导入成功！"));
    }


    /**
     * 删除病种数据编码字典
     */
    @RequiresPermissions("excle:qualityExcleDict:edit")
    @RequestMapping(value = "import/data")
    @ResponseBody
    public String importData() {
        List<QualityExcleDict> qualityExcleDicts = qualityExcleDictService.findList(new QualityExcleDict());

        qualityExcleDicts.forEach(a -> {
            DictData dictData = new DictData();
            dictData.setDictLabelOrig(a.getDictLabel());
            dictData.setDictValue(a.getDictValue());
            dictData.setDictType(a.getCode());
            dictData.setIsSys("0");
            dictDataService.save(dictData);

        });




        return renderResult(Global.TRUE, text("导入成功！"));
    }


}