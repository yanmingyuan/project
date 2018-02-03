package com.ymy.dao;

import com.ymy.model.Recruit;

import java.util.List;

public interface RecruitMapper {
    List<Recruit> queryAll();//返回所有招聘人数大于一的招聘信息
    Recruit queryRcById(int rc_id);
    boolean addRecruit(Recruit recruit);
    boolean deleteRecruit(Recruit recruit);
    boolean updateRecruit(Recruit recruit);
}
