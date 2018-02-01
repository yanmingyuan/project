package com.ymy.dao;

import com.ymy.model.User;

public interface UserMapper {
    User queryUser(User user);
    User queryObject(User user);
    boolean addUser(User user);
    boolean updateUser(User user);
}
