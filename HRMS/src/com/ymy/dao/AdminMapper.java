package com.ymy.dao;

import com.ymy.model.Admin;

public interface AdminMapper {
    Admin queryObject(Admin admin);//根据名字或账号密码登录
    boolean addAdmin(Admin admin);//注册的添加管理员
    boolean deleteAdmin(Admin admin);//注销此管理员
    boolean updateAdmin(Admin admin);
}
