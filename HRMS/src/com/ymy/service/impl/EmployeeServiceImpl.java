package com.ymy.service.impl;

import com.ymy.dao.EmployeeMapper;
import com.ymy.model.Employee;
import com.ymy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> queryAll() {
        return employeeMapper.queryAll();
    }

    @Override
    public Employee queryEmp(Employee employee) {
        return employeeMapper.queryEmp(employee);
    }

    @Override
    public List<Employee> queryByDept(int d_id) {
        return employeeMapper.queryByDept(d_id);
    }

    @Override
    public List<Employee> queryByPs(int p_id) {
        return employeeMapper.queryByPs(p_id);
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return employeeMapper.addEmployee(employee);
    }

    @Override
    public boolean deleteEmployee(int e_id) {
        return employeeMapper.deleteEmployee(e_id);
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        return employeeMapper.updateEmployee(employee);
    }
}
