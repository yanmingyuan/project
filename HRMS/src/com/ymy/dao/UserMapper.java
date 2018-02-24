package com.ymy.dao;

import com.ymy.model.User;

public interface UserMapper {
    User queryUser(User user);//用户登录
    boolean addUser(User user);//用户注册
    boolean updateUser(User user);//用户更新个人信息
}
