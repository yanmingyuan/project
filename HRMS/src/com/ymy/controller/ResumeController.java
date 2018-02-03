package com.ymy.controller;

import com.ymy.model.Recruit;
import com.ymy.model.Resume;
import com.ymy.model.User;
import com.ymy.service.ResumeService;
import com.ymy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ResumeController {
    @Autowired
    private ResumeService resumeService;
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/toAddResume")
    public String toAddResume(HttpServletRequest request){
        User user= (User) request.getSession().getAttribute("user");
        Resume resume1=resumeService.queryObject(user);
        if(resume1!=null){
            return "fail";
        }
        return "addResume";
    }
    @RequestMapping(value = "/queryAllResumes")
    public String queryAllResumes(HttpServletRequest request){
        List<Resume> resumes=resumeService.queryAll();
        if(resumes.size()!=0||resumes!=null){
            request.getSession().setAttribute("resumes",resumes);
            return "showResumes";
        }
        return "fail";
    }
    @RequestMapping(value = "/queryResume")
    public String queryResume(HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        Resume resume=resumeService.queryObject(user);
        if(resume!=null){
            request.getSession().setAttribute("resume",resume);
            return "showResume";
        }
        return "fail";
    }
    @RequestMapping(value = "/addResume")
    public String addResume(Resume resume,HttpServletRequest request){
        User user= (User) request.getSession().getAttribute("user");
        resume.setUser(user);
        if(resumeService.addResume(resume)){
            Resume resume1=resumeService.queryObject(user);
            request.getSession().setAttribute("resume",resume1);
           return "showRecruitToVisitor";
        }
        return "fail";
    }
    @RequestMapping(value = "deleteResume")
    public String deleteResume(HttpServletRequest request){
        User user= (User) request.getSession().getAttribute("user");
        Resume resume=resumeService.queryObject(user);
        if(resume!=null){
            if(resume.getR_state()!=1){
                return "fail";
            }
            if(resumeService.deleteResume(resume)){
                return "showRecruitToVisitor";
            }
        }
        return "fail";
    }
    @RequestMapping(value = "/toUpdateResume")
    public String toUpdateResume(HttpServletRequest request){
        Resume resume= (Resume) request.getSession().getAttribute("resume");
        if(resume==null){
            return "fail";
        }
        if(1==resume.getR_state()) {
            return "updateResume";
        }
        return "fail";
    }
    @RequestMapping(value = "/updateResume")
    public String updateResume(Resume resume,HttpServletRequest request){
        Resume resume1= (Resume) request.getSession().getAttribute("resume");
        resume.setR_id(resume1.getR_id());
        if(resumeService.updateResume(resume)){
            return "showRecruitToVisitor";
        }
        return "fail";
    }
    @RequestMapping(value="/sendResume")
    public String sendResume(@RequestParam(value = "rc_id")int rc_id,HttpServletRequest request){
        Resume resume= (Resume) request.getSession().getAttribute("resume");
        User user= (User) request.getSession().getAttribute("user");
        Recruit recruit=new Recruit();
        recruit.setRc_id(rc_id);
        user.setRecruit(recruit);
        userService.updateUser(user);
        resume.setR_state(2);
        resumeService.updateResume(resume);
        return "showRecruitToVisitor";
    }
    @RequestMapping(value = "/scanResumes")
    public String scanResumes(HttpSession session){
        List<Resume> resumes=resumeService.queryAll();
        session.setAttribute("resumes",resumes);
        return "showResumesToAdmin";
    }
    @RequestMapping("/lookupResume")
    public String lookupResume(@RequestParam(value = "r_id")int r_id, HttpSession session){
        Resume resume=resumeService.queryById(r_id);
        resume.setR_state(3);
        resumeService.updateResume(resume);
        session.setAttribute("resume",resume);
        return "showResumeToAdmin";
    }
    @RequestMapping(value = "/toShowResumes")
    public String toShowResumes(HttpSession session){
        List<Resume> resumes=resumeService.queryAll();
        session.setAttribute("resumes",resumes);
        return "showResumesToAdmin";
    }
}
