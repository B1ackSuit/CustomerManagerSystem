package cn.ean.controller;

import cn.ean.pojo.User;
import cn.ean.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * FileName:UserController
 * Author:ean
 * Date:2021/8/5 11:13 下午
 **/
@Controller
public class UserController {
    private UserService userService;
    @Autowired
    private void setUserService(UserService userService){
        this.userService = userService;
    }

    //登录
    @RequestMapping(value = "/login.action", method = RequestMethod.POST)
    public String login(String usercode, String password, Model model, HttpSession httpSession){
        User user = userService.findUser(usercode, password);
        if (user != null){
            httpSession.setAttribute("USER_SESSION", user);
            return "customer";
        }
        model.addAttribute("msg", "账号或密码错误");
        return "login";
    }

    //跳转登录
    @RequestMapping(value = "/login.action", method = RequestMethod.GET)
    public String toLogin(){
        return "login";
    }

    //退登
    @RequestMapping("/logout.action")
    public String logout(HttpSession session){
        //清除Session
        session.invalidate();
        //重定向到登录页面
        return "redirect:login.action";
    }
}
