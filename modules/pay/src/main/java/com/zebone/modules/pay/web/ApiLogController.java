package com.zebone.modules.pay.web;


import com.zebone.common.vo.PageVO;
import com.zebone.modules.entity.ApiLogDO;
import com.zebone.modules.pay.entity.TradeBillDetail;
import com.zebone.modules.repository.ApiLogRepository;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "${adminPath}/pay/apilog")
public class ApiLogController {

    @Autowired
    private ApiLogRepository apiLogRepository;

    @RequiresPermissions("pay:apilog:view")
    @RequestMapping(value = {"list", ""})
    public String list(ApiLogDO apiLog, Model model) {
        PageVO<ApiLogDO> pageVO = new PageVO<>();
        pageVO.setPageNo(1);
        pageVO.setPageSize(20);
        model.addAttribute("parameter", pageVO);
        model.addAttribute("log", apiLog);
        return "modules/pay/apiLogList";
    }

    /**
     * 查询列表数据
     */
    @RequiresPermissions("pay:apilog:view")
    @RequestMapping(value = "listData")
    @ResponseBody
    public PageVO<ApiLogDO> listData(ApiLogDO apiLog, HttpServletRequest request, HttpServletResponse response) {
        Pageable pageable = new PageRequest(apiLog.getPageNo()-1,apiLog.getPageSize());
        Page<ApiLogDO> page = apiLogRepository.findAll(pageable);

        PageVO<ApiLogDO> pageVO = new PageVO<>();
        pageVO.setPageNo(apiLog.getPageNo());
        pageVO.setPageSize(page.getSize());
        pageVO.setList(page.getContent());
        pageVO.setCount(page.getContent().size());
        pageVO.setLast(page.getTotalPages());
        pageVO.setFirst(1);
        pageVO.setNext(apiLog.getPageNo()+1);
        pageVO.setPrev(apiLog.getPageNo()-1);
        return pageVO;
    }
}
