package com.lyq.controller;


import com.lyq.enity.User;
import com.lyq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;


@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(@RequestParam("username")String userName,
                        @RequestParam("password")String password,
                        HttpSession session,
                        Model model){
        User user = userService.selectPasswordByName(userName, password);
        if ( user != null){
            //登录成功后防止表单重复提交，使用重定向
            session.setAttribute("username",user.getUserName());
            System.out.println(session.getAttribute("username"));
            System.out.println("用户正确");
            return "redirect:/list.html";
        }else {
            //登录失败！存放错误信息
            model.addAttribute("msg","用户名或密码错误");
            System.out.println("用户不正确");
            return "index.html";
        }
    }


    @GetMapping("/user/loginOut")
    public String loginOut(HttpSession session){
        session.invalidate();
        return "redirect:/index.html";
    }
}
