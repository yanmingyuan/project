package com.ymy.dao;

import com.ymy.model.Salary;

import java.util.List;

public interface SalaryMapper {
    List<Salary> queryByEmp(int e_id);//员工根据月份查询自己的工资
    boolean addSalary(Salary salary);//管理员结算工资
}
