package com.ymy.dao;

import com.ymy.model.Salary;

public interface SalaryMapper {
    Salary queryByEmp(Salary salary);//员工根据月份查询自己的工资
    boolean addSalary(Salary salary);//管理员结算工资
}
