package com.ymy.controller;

import com.ymy.model.Department;
import com.ymy.model.Position;
import com.ymy.model.Recruit;
import com.ymy.service.DepartService;
import com.ymy.service.PositionService;
import com.ymy.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class RecruitController {
    @Autowired
    private RecruitService recruitService;
    @Autowired
    private DepartService departService;
    @RequestMapping(value = "/toAddRecruit")
    public String toAddRecruit(HttpSession session){
        List<Department> departs=departService.queryAllDepart();
        session.setAttribute("departs",departs);
        return "addRecruit";
    }
    @RequestMapping(value = "/toManager")
    public String toManager(){
        return "manager";
    }

    @RequestMapping(value = "/addRecruit")
    public String addRecruit(@RequestParam(value = "d_id")int d_id,
                            @RequestParam(value = "p_id")int p_id,
                            Recruit recruit){
        Department department=new Department();
        department.setD_id(d_id);
        Position position=new Position();
        position.setP_id(p_id);
        recruit.setDepartment(department);
        recruit.setPosition(position);
        if(recruitService.addRecruit(recruit)){
            return "manager";
        }
        return "fail";
    }
    @RequestMapping(value = "/queryAllRecruits")
    public String queryAllRecruits(HttpServletRequest request){
        List<Recruit> recruits=recruitService.queryAll();
        if(null!=recruits){
            request.getSession().setAttribute("recruits",recruits);
            return "showRecruit";
        }
        return "fail";
    }
    @RequestMapping(value = "/deleteRecruit")
    public String deleteRecruit(@RequestParam(value = "id")int id){
        System.out.println(id);
        Recruit recruit=new Recruit();
        recruit.setRc_id(id);
        if(recruitService.deleteRecruit(recruit)){
            return "manager";
        }
        return "fail";
    }
}
