package com.ymy.controller;

import com.ymy.model.Department;
import com.ymy.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class DepartController {
    @Autowired
    private DepartService departService;
    @RequestMapping(value = "/toShowDeparts")
    public String toShowDeparts(){
        return "showDeparts";
    }
    @RequestMapping(value = "/showDeparts")
    public String showDeparts(HttpSession session){
        List<Department> departs=departService.queryAllDepart();
        session.setAttribute("departs",departs);
        return "showDeparts";
    }
    @RequestMapping(value = "/toAddDepart")
    public String toAddDepart(){
        return "addDepart";
    }
    @RequestMapping(value = "/addDepart")
    public String addDepart(@RequestParam(value = "d_name")String d_name,HttpSession session){
        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yy-MM-dd hh:mm:ss");
        String d_createTime=dateFormat.format(date);
        Department depart=new Department(d_name,d_createTime);
        if(departService.addDepart(depart)){
            List<Department> departs=departService.queryAllDepart();
            session.setAttribute("departs",departs);
            return "showDeparts";
        }
        return "fail";
    }
    @RequestMapping(value = "/deleteDepart")
    public String deleteDepart(@RequestParam(value = "d_id")int d_id,HttpSession session){
        if(departService.deleteDepart(d_id)){
            List<Department> departs=departService.queryAllDepart();
            session.setAttribute("departs",departs);
            return "showDeparts";
        }
        return "fail";
    }
}
