package com.ymy.controller;

import com.ymy.model.Recruit;
import com.ymy.model.Resume;
import com.ymy.model.User;
import com.ymy.service.RecruitService;
import com.ymy.service.ResumeService;
import com.ymy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RecruitService recruitService;
    @Autowired
    private ResumeService resumeService;

    @RequestMapping(value = "/toVisitorPage")
    public String toVisitorPage(){
        return "visitorPage";
    }
    @RequestMapping(value = "/toLoginVisitor")
    public String toLoginVisitor(){
        return "loginVisitor";
    }
    @RequestMapping(value = "/toRegisterVisitor")
    public String toRegisterVisitor(){
        return "registerVisitor";
    }
    @RequestMapping(value = "/visitorRegister")
    public String visitorRegister(User user){
        System.out.println(user);
        User user1=userService.queryObject(user);
        if(user1==null){
            user.setU_state(1);
            userService.addUser(user);
            return "loginVisitor";
        }
        return "fail";
    }
    @RequestMapping(value = "/visitorLogin")
    public String visitorLogin(User user, HttpServletRequest request){
        User user1=userService.queryObject(user);
        if(user1!=null){
            request.getSession().setAttribute("user",user1);
            List<Recruit> recruits=recruitService.queryAll();
            request.getSession().setAttribute("recruits",recruits);
            Resume resume1=resumeService.queryObject(user1);
            request.getSession().setAttribute("resume",resume1);
            return "showRecruitToVisitor";
        }
        return "fail";
    }
}
