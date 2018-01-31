package com.ymy.controller;

import com.ymy.model.Admin;
import com.ymy.model.Resume;
import com.ymy.service.AdminService;
import com.ymy.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private ResumeService resumeService;
    @RequestMapping("/toAdminPage")
    public String toAdminPage(){
        return "adminPage";
    }
    @RequestMapping("/toRegister")
    public String toRegister(){
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
            return "login";
        }
        return "fail";
    }
    @RequestMapping("/login")
    public String login(Admin admin, HttpServletRequest request){
        Admin admin1=adminService.queryObject(admin);
        if(admin1!=null){
            request.getSession().setAttribute("admin",admin);
            return "manager";
        }
        return "fail";
    }
    @RequestMapping(value = "/invite")
    public String invite(@RequestParam(value = "r_id")int r_id, HttpSession session){
        Resume resume=resumeService.queryById(r_id);
        resume.setR_state(4);
        resumeService.updateResume(resume);
        List<Resume> resumes= resumeService.queryAll();
        session.setAttribute("resumes",resumes);
        return "showResumesToAdmin";
    }
}
