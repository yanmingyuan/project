package com.ymy.dao;

import com.ymy.model.User;

public interface UserMapper {
    User queryObject(User user);
    boolean addUser(User user);
}
