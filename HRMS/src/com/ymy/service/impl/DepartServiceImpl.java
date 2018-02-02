package com.ymy.service.impl;

import com.ymy.dao.DepartMapper;
import com.ymy.model.Department;
import com.ymy.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartServiceImpl implements DepartService {
    @Autowired
    private DepartMapper departMapper;
    @Override
    public List<Department> queryAllDepart() {
        return departMapper.queryAllDepart();
    }

    @Override
    public Department queryDepart(int d_id) {
        return departMapper.queryDepart(d_id);
    }

    @Override
    public boolean addDepart(Department department) {
        return departMapper.addDepart(department);
    }

    @Override
    public boolean deleteDepart(int d_id) {
        return departMapper.deleteDepart(d_id);
    }

    @Override
    public boolean updateDepart(Department department) {
        return departMapper.updateDepart(department);
    }
}
