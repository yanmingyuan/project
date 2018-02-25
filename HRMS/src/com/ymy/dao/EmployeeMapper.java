package com.ymy.dao;

import com.ymy.model.Employee;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> queryAll();//查询所有员工
    Employee queryById(int e_id);//根据id查询员工
    Employee queryEmp(Employee employee);//登录返回员工个人信息
    List<Employee> queryByDept(int d_id);//根据部门查询员工
    List<Employee> queryByPs(int p_id);
    boolean addEmployee(Employee employee);//添加员工
    boolean deleteEmployee(int e_id);//炒鱿鱼
    boolean updateEmployee(Employee employee);//更新员工个人信息、譬如员工换职位/更新密码等操作
}
