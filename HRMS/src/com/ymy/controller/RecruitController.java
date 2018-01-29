package com.ymy.controller;

import com.ymy.model.Recruit;
import com.ymy.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class RecruitController {
    @Autowired
    private RecruitService recruitService;
    @RequestMapping(value = "/toAddRecruit")
    public String toAddRecruit(){
        return "addRecruit";
    }
    @RequestMapping(value = "/toManager")
    public String toManager(){
        return "manager";
    }
    @RequestMapping(value = "/addRecruit")
    public String addRecruit(Recruit recruit){
        if(recruitService.addRecruit(recruit)){
            return "manager";
        }
        return "fail";
    }
    @RequestMapping(value = "/queryAll")
    public String queryAll(HttpServletRequest request){
        List<Recruit> recruits=recruitService.queryAll();
        if(null!=recruits){
            request.getSession().setAttribute("recruits",recruits);
            return "showRecruit";
        }
        return "fail";
    }
    @RequestMapping(value = "/deleteRecruit")
    public String deleteRecruit(@RequestParam(value = "id")int id){
        Recruit recruit=new Recruit();
        recruit.setRc_id(id);
        if(recruitService.deleteRecruit(recruit)){
            return "manager";
        }
        return "fail";
    }
}
