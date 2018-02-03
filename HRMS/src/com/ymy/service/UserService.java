package com.ymy.service;

import com.ymy.model.User;

public interface UserService {
    User queryUser(User user);
    boolean addUser(User user);
    boolean updateUser(User user);
}
