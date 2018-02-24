package com.ymy.controller;

import com.ymy.model.Attend;
import com.ymy.model.Employee;
import com.ymy.model.Reward;
import com.ymy.service.AttendService;
import com.ymy.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class AttendController {
    @Autowired
    private AttendService attendService;
    @Autowired
    private RewardService rewardService;
    /*
    * 上班打卡
    * */
    @RequestMapping(value = "/clockForArrive")
    public String clockForArrive(HttpSession session) throws ParseException {
        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm");
        SimpleDateFormat dateFormat1=new SimpleDateFormat("yyyy-MM-dd");
        String mornTime=dateFormat1.format(date)+" 09:00";
        Date date1=dateFormat.parse(mornTime);
        String at_arriveTime=dateFormat.format(date);
        Employee employee= (Employee) session.getAttribute("employee");
        Attend attend=new Attend();
        attend.setAt_arriveTime(at_arriveTime);
        attend.setEmployee(employee);
        //迟到超过三小时，奖惩表添加惩罚信息
        if(date.getTime()-date1.getTime()>10800000){
            Reward reward=new Reward();
            reward.setRw_money(-(employee.getE_salary()/22));//一天的工资
            reward.setRw_time(at_arriveTime);
            reward.setRw_cause("3小时以外迟到，旷工");
            reward.setEmployee(employee);
            if(rewardService.addReward(reward)&&attendService.addAttend(attend)){
                Attend attend1= (Attend) attendService.queryByDateAndEmp(attend);
                session.setAttribute("attend",attend1);
                return "empPage";
            }
            return "fail";
        }else if(date.getTime()-date1.getTime()>0){
            //迟到在三小时以内
            Reward reward=new Reward();
            reward.setRw_money(-(employee.getE_salary()/22/6));//一天的工资的1/6
            reward.setRw_time(at_arriveTime);
            reward.setRw_cause("迟到");
            reward.setEmployee(employee);
            if(rewardService.addReward(reward)&&attendService.addAttend(attend)){
                Attend attend1= (Attend) attendService.queryByDateAndEmp(attend);
                session.setAttribute("attend",attend1);
                return "empPage";
            }
            return "fail";
        }else {
            //正常出勤，生成打卡记录
            if(attendService.addAttend(attend)){
                Attend attend1= (Attend) attendService.queryByDateAndEmp(attend);
                session.setAttribute("attend",attend1);
                return "empPage";
            }
            return "fail";
        }
    }
    /*
    * 下班打卡，更新当天打卡记录
    * */
    @RequestMapping(value = "/clockForLeave")
    public String clockForLeave(HttpSession session) throws ParseException {
        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm");
        SimpleDateFormat dateFormat1=new SimpleDateFormat("yyyy-MM-dd");
        String noonTime=dateFormat1.format(date)+" 17:30";
        String dayTime=dateFormat1.format(date);
        Date date1=dateFormat.parse(noonTime);
        String at_leaveTime=dateFormat.format(date);
        Employee employee= (Employee) session.getAttribute("employee");
        Attend attend=new Attend();
        attend.setAt_arriveTime(dayTime);
        attend.setEmployee(employee);
        Attend attend1= (Attend) attendService.queryByDateAndEmp(attend);
        attend1.setAt_leaveTime(at_leaveTime);
        System.out.println(attend1);
        //早退超三小时
        if(date1.getTime()-date.getTime()>10800000){
            Reward reward=new Reward();
            reward.setRw_money(-(employee.getE_salary()/22));//一天的工资
            reward.setRw_time(at_leaveTime);
            reward.setRw_cause("早退超3小时");
            reward.setEmployee(employee);
            if(attendService.updateAttend(attend1)){
                rewardService.addReward(reward);
                session.setAttribute("attend",attend1);
                return "empPage";
            }
            return "fail";
        //三小时以内早退
        }else if(date1.getTime()-date.getTime()>0){
            Reward reward=new Reward();
            reward.setRw_money(-(employee.getE_salary()/22/6));//一天的工资的1/6
            reward.setRw_time(at_leaveTime);
            reward.setRw_cause("3小时以内早退");
            reward.setEmployee(employee);
            if(rewardService.addReward(reward)&&attendService.updateAttend(attend1)){
                session.setAttribute("attend",attend1);
                return "empPage";
            }
            return "fail";
        //正常下班
        }else {
            if(attendService.updateAttend(attend1)){
                session.setAttribute("attend",attend1);
                return "empPage";
            }
            return "fail";
        }
    }
    /*
    * 查看当月考勤记录
    * */
    @RequestMapping("/queryByMonthAndEmp")
    public String queryByMonthAndEmp(HttpSession session){
        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM");
        String currentMonth=dateFormat.format(date);
        Attend attend=new Attend();
        attend.setAt_arriveTime(currentMonth);
        Employee employee= (Employee) session.getAttribute("employee");
        attend.setEmployee(employee);
        List<Attend> attends=attendService.queryByMonthAndEmp(attend);
        session.setAttribute("attends",attends);
        return "empPage";
    }
}

