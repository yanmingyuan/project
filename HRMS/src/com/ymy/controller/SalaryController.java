package com.ymy.controller;

import com.ymy.model.Attend;
import com.ymy.model.Employee;
import com.ymy.model.Reward;
import com.ymy.model.Salary;
import com.ymy.service.AttendService;
import com.ymy.service.EmployeeService;
import com.ymy.service.RewardService;
import com.ymy.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class SalaryController {
    @Autowired
    private SalaryService salaryService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private RewardService rewardService;
    @Autowired
    private AttendService attendService;
    /*
    * 结算员工工资（试用期为正式工资的8%），
    * 工资为上月工资，实际工资按上班天数和奖惩信息算
    * 结算工资时间为下个月的1日
    * 工资结算时根据员工的该月份的基本工资加上奖惩表里奖惩的金额以及其他金额
    * */
    @RequestMapping("/balance")
    public String balance(HttpSession session){
        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String time=dateFormat.format(date);
        //不是月份的第一天
        if(!time.endsWith("01")){
            return "fail";
        }
        String[] arr=time.split("-");
        String year=arr[0];
        String month=arr[1];
        //如果为1月份，则年数减一，工资月份为12；
        //如果不是1月份，则月份减一。
        String s_time=null;
        if(month.equals("01")){
            int yyyy=Integer.parseInt(year)-1;
            s_time=yyyy+"-12";
        }else{
            int mm=Integer.parseInt(month)-1;//上个月
            if(mm<=9){
                s_time=year+"-0"+mm;
            }else{
                s_time=year+"-"+mm;
            }
        }
        Reward reward=new Reward();
        reward.setRw_time(s_time);
        List<Employee> emps=employeeService.queryAll();
        for(Employee emp:emps){
            double s_basic=0;
            double s_reward=0;
            double s_security=0;
            Attend attend=new Attend();
            attend.setAt_arriveTime(s_time);
            attend.setEmployee(emp);
            List<Attend> attends=attendService.queryByMonthAndEmp(attend);
            System.out.println(attends);
            int num=0;//出勤天数
            if(attends!=null){
                num=attends.size();
            }
            if(emp.getE_state()==1){//试用期
                s_basic=emp.getE_salary()*0.8*num/22;
            }else if(emp.getE_state()==2){//正式员工
                s_basic=emp.getE_salary()*num/22;
            }
            reward.setEmployee(emp);
            List<Reward> rewards=rewardService.queryAllByMonth(reward);
            if(rewards!=null&&rewards.size()!=0){
                for(Reward reward1:rewards){
                    s_reward+=reward1.getRw_money();
                }
            }
            s_security=s_basic*0.08;
            Salary salary=new Salary();
            salary.setS_basic(s_basic);
            salary.setS_reward(s_reward);
            salary.setS_security(s_security);
            salary.setS_time(s_time);
            salary.setEmployee(emp);
            salaryService.addSalary(salary);
        }
        return "manager";
    }
    @RequestMapping(value = "/querySalarys")
    public String querySalarys(@RequestParam(value = "e_id")int e_id,
                               HttpSession session){
        List<Salary> salaries=salaryService.queryByEmp(e_id);
        session.setAttribute("salaries",salaries);
        return "empPage";
    }
}
