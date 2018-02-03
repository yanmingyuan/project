package com.ymy.controller;

import com.ymy.model.Employee;
import com.ymy.model.Recruit;
import com.ymy.model.Resume;
import com.ymy.model.User;
import com.ymy.service.EmployeeService;
import com.ymy.service.RecruitService;
import com.ymy.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class EmpController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private ResumeService resumeService;
    @Autowired
    private RecruitService recruitService;
    @RequestMapping(value = "/confirm")
    public String confirm(HttpSession session){
        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yy-MM-dd hh:mm:ss");
        String entryTime=dateFormat.format(date);
        User user = (User) session.getAttribute("user");
        Resume resume=resumeService.queryObject(user);
        Recruit recruit=recruitService.queryRcById(user.getRecruit().getRc_id());
        Employee employee=new Employee();
        employee.setE_name(user.getU_name());
        employee.setE_pass(user.getU_pass());
        employee.setE_sex(resume.getR_sex());
        employee.setE_birth(resume.getR_birth());
        employee.setE_email(resume.getR_email());
        employee.setE_phone(resume.getR_phone());
        employee.setE_livingPlace(resume.getR_livingPlace());
        employee.setE_address(resume.getR_address());
        employee.setE_entryTime(entryTime);
        employee.setDepartment(recruit.getDepartment());
        employee.setPosition(recruit.getPosition());
        employee.setE_salary((recruit.getRc_maxsalary()+recruit.getRc_minsalary())/2);
        if(employeeService.addEmployee(employee)){
            resume.setR_state(5);
            resumeService.updateResume(resume);
            Resume resume1=resumeService.queryById(resume.getR_id());
            recruit.setRc_number(recruit.getRc_number()-1);
            recruitService.updateRecruit(recruit);
            List<Recruit> recruits= recruitService.queryAll();
            session.setAttribute("resume",resume1);
            session.setAttribute("recruits",recruits);
            return "showRecruitToVisitor";
        }
        return "fail";
    }
    @RequestMapping(value = "/toLoginEmp")
    public String toLoginEmp(){
        return "loginEmp";
    }
    @RequestMapping(value = "/loginEmp")
    public String loginEmp(Employee employee,HttpSession session){
        Employee employee1=employeeService.queryEmp(employee);
        System.out.println(employee1);
        session.setAttribute("employee",employee1);
        return "empPage";
    }
}