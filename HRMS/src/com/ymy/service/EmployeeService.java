package com.ymy.service;

import com.ymy.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> queryAll();
    Employee queryById(int e_id);//根据id查询员工
    Employee queryEmp(Employee employee);
    List<Employee> queryByDept(int d_id);
    List<Employee> queryByPs(int p_id);
    boolean addEmployee(Employee employee);
    boolean deleteEmployee(int e_id);
    boolean updateEmployee(Employee employee);
}
