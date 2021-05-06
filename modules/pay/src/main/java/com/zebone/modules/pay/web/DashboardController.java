package com.zebone.modules.pay.web;

import com.zebone.modules.entity.TradeRecordDO;
import com.zebone.modules.pay.entity.TradeRecord;
import com.zebone.modules.repository.TradeRecordRepository;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author 卡卡西
 */
@Controller
@RequestMapping(value = "${adminPath}/pay/dashboard")
public class DashboardController {


    @Autowired
    private TradeRecordRepository tradeRecordRepository;

    @RequiresPermissions("user")
    @RequestMapping("")
    public String index(Model model){
        Map<String,Object> map = new HashMap<>();
        TimeZone curTimeZone = TimeZone.getTimeZone("GMT+8");
        Calendar c = Calendar.getInstance(curTimeZone);
        Date d = new Date();
        c.setTime(d);
        int month =  c.get(Calendar.MONTH);
        c.set(Calendar.MONTH,month);
        int firstDay = c.getActualMinimum(Calendar.DAY_OF_MONTH);
        c.set(Calendar.DAY_OF_MONTH,firstDay);
        c.set(Calendar.HOUR_OF_DAY,0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        Date begin = c.getTime();
        int lastDay=0;
        if(month==2) {
            lastDay = c.getLeastMaximum(Calendar.DAY_OF_MONTH);
        }else {
            lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        }
        c.set(Calendar.DAY_OF_MONTH, lastDay);
        c.set(Calendar.HOUR_OF_DAY, 23);
        c.set(Calendar.MINUTE, 59);
        c.set(Calendar.SECOND, 59);
        Date end = c.getTime();
        Specification<TradeRecordDO> specification = new Specification<TradeRecordDO>() {
            List<Predicate> predicates = new ArrayList<>();


            @Override
            public Predicate toPredicate(Root<TradeRecordDO> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

                predicates.add(criteriaBuilder.between(root.get("gmtPayment"),begin,end));
                return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
        List<TradeRecordDO> result =  tradeRecordRepository.findAll(specification);
        long dayCount = result.stream().filter(a-> DateUtils.isSameDay(a.getGmtPayment(),new Date())&&"1".equals(a.getTradeStatus())).count();
        long monthCount = result.stream().filter(a-> "1".equals(a.getTradeStatus())).count();
        double dayMoney = result.stream().filter(a-> DateUtils.isSameDay(a.getGmtPayment(),new Date())&&"1".equals(a.getTradeStatus())).mapToDouble(a->Double.valueOf(a.getTotalAmount())).sum();
        double monthMoney = result.stream().filter(a-> "1".equals(a.getTradeStatus())).count();
        map.put("month",monthMoney);
        map.put("day",dayMoney);
        map.put("dayCount",dayCount);
        map.put("monthCount",monthCount);
        model.addAttribute("payInfo",map);
        return "modules/pay/dashboard";
    }
}
