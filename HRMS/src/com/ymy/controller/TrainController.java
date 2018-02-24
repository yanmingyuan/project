package com.ymy.controller;

import com.ymy.model.Department;
import com.ymy.model.Train;
import com.ymy.service.DepartService;
import com.ymy.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class TrainController {
    @Autowired
    private TrainService trainService;
    @Autowired
    private DepartService departService;
    @RequestMapping("/toAddTrain")
    public String toAddTrain(){
        return "addTrain";
    }
    @RequestMapping("/queryAllTrains")
    public String queryAllTrains(HttpSession session){
        List<Train> trains=trainService.queryAllTrains();
        session.setAttribute("trains",trains);
        List<Department> departs=departService.queryAllDepart();
        session.setAttribute("departs",departs);
        return "showTrains";
    }
    @RequestMapping("/addTrain")
    public String updateTrain(Train train,
                              @RequestParam(value = "d_id")int d_id){
        Department department=new Department();
        department.setD_id(d_id);
        train.setDepartment(department);
        if(trainService.addTrain(train)){
            return "manager";
        }
        return "fail";
    }
}
