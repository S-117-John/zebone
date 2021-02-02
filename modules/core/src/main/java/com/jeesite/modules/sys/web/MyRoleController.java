package com.jeesite.modules.sys.web;

import com.jeesite.common.collect.MapUtils;
import com.jeesite.common.web.BaseController;
import com.jeesite.modules.sys.entity.Role;
import com.jeesite.modules.sys.entity.User;
import com.jeesite.modules.sys.service.UserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.hyperic.sigar.SudoFileInputStream;
import org.hyperic.sigar.util.IteratorIterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;
import java.util.Map;

@Controller
@RequestMapping({"${adminPath}/sys/my/role"})
public class MyRoleController extends BaseController {

    @Autowired
    private UserService userService;

    @RequiresPermissions({"sys:role:view"})
    @RequestMapping({"list"})
    public String list(Role role, Model model) {
        return "modules/sys/myRoleList";
    }

    @RequiresPermissions({"sys:role:edit"})
    @RequestMapping({"formAuthUser"})
    public String formAuthUser(Role role, Model model, HttpServletRequest request) {
//        Map map = MapUtils.newHashMap();
        User user = new User(role);
//        Iterator var6;
//        Iterator var10000 = var6 = this.userService.findListByRoleCode(user).iterator();
//
//        while(var10000.hasNext()) {
//            User a = (User)var6.next();
//            var10000 = var6;
//            a.put(a.getUserCode(), a);
//        }
//
//        model.addAttribute(IteratorIterator.null("\u001e?\u000e?7?\n"), a);
        model.addAttribute("role", role);
        return "modules/sys/myRoleFormAuthUser";
    }
}
