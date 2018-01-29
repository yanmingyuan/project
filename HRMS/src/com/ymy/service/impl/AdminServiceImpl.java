package com.ymy.service.impl;

import com.ymy.dao.AdminMapper;
import com.ymy.model.Admin;
import com.ymy.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public Admin queryObject(Admin admin) {
        return adminMapper.queryObject(admin);
    }

    @Override
    public boolean addAdmin(Admin admin) {
        return adminMapper.addAdmin(admin);
    }

    @Override
    public boolean deleteAdmin(Admin admin) {
        return adminMapper.deleteAdmin(admin);
    }

    @Override
    public boolean updateAdmin(Admin admin) {
        return adminMapper.updateAdmin(admin);
    }
}
