package com.ymy.controller;

import com.ymy.model.Resume;
import com.ymy.model.User;
import com.ymy.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ResumeController {
    @Autowired
    private ResumeService resumeService;
    @RequestMapping(value = "/toAddResume")
    public String toAddResume(HttpServletRequest request){
        User user= (User) request.getSession().getAttribute("user");
        Resume resume1=resumeService.queryObject(user);
        if(resume1!=null){
            return "fail";
        }
        return "addResume";
    }
    @RequestMapping(value = "/queryAll")
    public String queryAll(HttpServletRequest request){
        List<Resume> resumes=resumeService.queryAll();
        if(resumes.size()!=0||resumes!=null){
            request.getSession().setAttribute("resumes",resumes);
            return "showResumes";
        }
        return "fail";
    }
    @RequestMapping(value = "/queryObject")
    public String queryObject(User user,HttpServletRequest request){
        Resume resume=resumeService.queryObject(user);
        if(resume!=null){
            request.getSession().setAttribute("resume",resume);
            return "showResume";
        }
        return "fail";
    }
    @RequestMapping(value = "/addResume")
    public String addResume(Resume resume,HttpServletRequest request){
        if(resumeService.addResume(resume)){
            User user= (User) request.getSession().getAttribute("user");
            Resume resume1=resumeService.queryObject(user);
            request.getSession().setAttribute("resume",resume1);
           return "showRecruitToVisitor";
        }
        return "fail";
    }
    @RequestMapping(value = "deleteResume")
    public String deleteResume(HttpServletRequest request){
        Resume resume= (Resume) request.getSession().getAttribute("resume");
        if(resumeService.deleteResume(resume)){
            return "showRecruitToVisitor";
        }
        return "fail";
    }
}
