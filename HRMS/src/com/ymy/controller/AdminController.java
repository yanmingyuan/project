package com.ymy.controller;

import com.ymy.model.Admin;
import com.ymy.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping("/toRegisiter")
    public String toRegisiter(){
        return "regisiter";
    }
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("/register")
    public String regisiter(Admin admin){
        Admin admin1=adminService.queryObject(admin);
        if(admin1==null){
            adminService.addAdmin(admin);
            return "success";
        }
        return "fail";
    }
    @RequestMapping("/login")
    public String login(Admin admin, HttpServletRequest request){
        Admin admin1=adminService.queryObject(admin);
        if(admin1!=null){
            request.getSession().setAttribute("admin",admin);
            return "success";
        }
        return "fail";
    }
}
