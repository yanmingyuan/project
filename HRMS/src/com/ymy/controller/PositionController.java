package com.ymy.controller;

import com.ymy.model.Department;
import com.ymy.model.Employee;
import com.ymy.model.Position;
import com.ymy.service.EmployeeService;
import com.ymy.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class PositionController {
    @Autowired
    private PositionService positionService;
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping(value = "/showPositions")
    public String showPositions(@RequestParam(value = "d_id")int d_id, HttpSession session){
        session.setAttribute("d_id",d_id);
        Department department=new Department();
        department.setD_id(d_id);
        List<Position> positions=positionService.queryByDepart(department);
        session.setAttribute("positions",positions);
        return "showPositions";
    }
    @RequestMapping(value = "/queryPositions")
    public @ResponseBody List<Position> queryPositions(@RequestParam(value = "d_id")int d_id, HttpSession session){
        session.setAttribute("d_id",d_id);
        Department department=new Department();
        department.setD_id(d_id);
        List<Position> positions=positionService.queryByDepart(department);
        return positions;
    }
    @RequestMapping(value = "/toAddPosition")
    public String toAddPosition(@RequestParam(value = "d_id")int d_id,HttpSession session){
        session.setAttribute("d_id",d_id);
        return "addPosition";
    }
    @RequestMapping(value = "/addPosition")
    public String addPosition(@RequestParam(value = "p_name")String p_name,
                              HttpSession session){
        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yy-MM-dd hh:mm:ss");
        String p_createTime=dateFormat.format(date);
        Position position=new Position();
        Department department=new Department();
        int d_id= (int) session.getAttribute("d_id");
        department.setD_id(d_id);
        position.setP_name(p_name);
        position.setP_createTime(p_createTime);
        position.setDepartment(department);
        if(positionService.addPosition(position)){
            List<Position> positions=positionService.queryByDepart(department);
            session.setAttribute("positions",positions);
            return "showDeparts";
        }
        return "fail";
    }
    @RequestMapping(value = "/deletePosition")
    public String deletePosition(@RequestParam(value = "p_id")int p_id,
                                 HttpSession session){
        List<Employee> employees=employeeService.queryByPs(p_id);
        if(employees!=null){
            if(employees.size()!=0){
                return "fail";
            }
        }
        if(positionService.deletePosition(p_id)){
            int d_id= (int) session.getAttribute("d_id");
            Department department=new Department();
            department.setD_id(d_id);
            List<Position> positions=positionService.queryByDepart(department);
            session.setAttribute("positions",positions);
            return "showPositions";
        }
        return "fail";
    }
}
