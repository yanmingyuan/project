package com.ymy.service.impl;

import com.ymy.dao.SalaryMapper;
import com.ymy.model.Salary;
import com.ymy.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryServiceImpl implements SalaryService{
    @Autowired
    private SalaryMapper salaryMapper;
    @Override
    public Salary queryByEmp(Salary salary) {
        return salaryMapper.queryByEmp(salary);
    }

    @Override
    public boolean addSalary(Salary salary) {
        return salaryMapper.addSalary(salary);
    }
}
