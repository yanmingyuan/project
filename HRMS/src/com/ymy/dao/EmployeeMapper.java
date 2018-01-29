package com.ymy.dao;

import com.ymy.model.Employee;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> queryAll();
    Employee queryObject(Employee employee);
    boolean addEmployee(Employee employee);
    boolean deleteEmployee(Employee employee);
    boolean updateEmployee(Employee employee);
}
