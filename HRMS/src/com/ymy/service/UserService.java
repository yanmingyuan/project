package com.ymy.service;

import com.ymy.model.User;

public interface UserService {
    User queryObject(User user);
    boolean addUser(User user);
}
