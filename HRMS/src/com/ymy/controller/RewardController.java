package com.ymy.controller;

import com.ymy.model.Employee;
import com.ymy.model.Reward;
import com.ymy.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class RewardController {
    @Autowired
    private RewardService rewardService;
    @RequestMapping(value = "/toRewardPage")
    public String toRewardPage(@RequestParam(value = "e_id")int e_id
                                ,HttpSession session){
        session.setAttribute("e_id",e_id);
        return "rewardPage";
    }
    @RequestMapping(value = "/addReward")
    public String addReward(Reward reward,HttpSession session){
        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm");
        String rw_time=dateFormat.format(date);
        reward.setRw_time(rw_time);
        int e_id= (int) session.getAttribute("e_id");
        Employee employee=new Employee();
        employee.setE_id(e_id);
        reward.setEmployee(employee);
        if(rewardService.addReward(reward)){
            return "showEmps";
        }
        return "fail";
    }
}
