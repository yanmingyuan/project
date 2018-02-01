package com.ymy.service.impl;

import com.ymy.dao.UserMapper;
import com.ymy.model.User;
import com.ymy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public User queryUser(User user) {
        return userMapper.queryUser(user);
    }

    @Override
    public boolean addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public User queryObject(User user) {
        return userMapper.queryObject(user);
    }

    @Override
    public boolean updateUser(User user) {
        return userMapper.updateUser(user);
    }
}
