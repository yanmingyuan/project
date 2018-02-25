package com.ymy.service.impl;

import com.ymy.dao.SalaryMapper;
import com.ymy.model.Salary;
import com.ymy.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService{
    @Autowired
    private SalaryMapper salaryMapper;
    @Override
    public List<Salary> queryByEmp(int e_id) {
        return salaryMapper.queryByEmp(e_id);
    }

    @Override
    public boolean addSalary(Salary salary) {
        return salaryMapper.addSalary(salary);
    }
}
