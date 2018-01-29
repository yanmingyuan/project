package com.ymy.dao;

import com.ymy.model.User;

public interface UserMapper {
    User queryObject();
    boolean addUser(User user);
}
