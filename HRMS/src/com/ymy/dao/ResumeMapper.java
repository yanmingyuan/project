package com.ymy.dao;

import com.ymy.model.Resume;
import com.ymy.model.User;

import java.util.List;

public interface ResumeMapper {
    List<Resume> queryAll();//管理员查看所有简历
    Resume queryObject(User user);//游客查看自己的简历
    Resume queryById(int r_id);//根据简历id查询简历
    boolean addResume(Resume resume);//添加简历
    boolean deleteResume(Resume resume);//删除简历
    boolean updateResume(Resume resume);//更新简历信息
}
