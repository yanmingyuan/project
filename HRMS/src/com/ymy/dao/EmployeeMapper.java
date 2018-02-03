package com.ymy.dao;

import com.ymy.model.Department;
import com.ymy.model.Employee;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> queryAll();
    Employee queryEmp(Employee employee);
    List<Employee> queryByDept(int d_id);
    List<Employee> queryByPs(int p_id);
    boolean addEmployee(Employee employee);
    boolean deleteEmployee(int e_id);
    boolean updateEmployee(Employee employee);
}
