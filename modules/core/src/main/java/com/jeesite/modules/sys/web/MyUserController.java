package com.jeesite.modules.sys.web;

import com.jeesite.common.entity.Page;
import com.jeesite.common.web.BaseController;
import com.jeesite.modules.sys.entity.User;
import com.jeesite.modules.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
@RequestMapping({"${adminPath}/sys/my/user"})
public class MyUserController extends BaseController {

    @Autowired
    private UserService userService;

    @RequestMapping({"listData"})
    @ResponseBody
    public Page<User> listData(User user, HttpServletRequest request, HttpServletResponse response) {
        return "none".equals(user.getUserType()) ? new Page(request, response) : this.userService.findPage(new Page(request, response), user);
    }
}
