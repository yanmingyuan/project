package com.ymy.service;

import com.ymy.model.Recruit;

import java.util.List;

public interface RecruitService {
    List<Recruit> queryAll();
    Recruit queryRcById(int rc_id);
    boolean addRecruit(Recruit recruit);
    boolean deleteRecruit(Recruit recruit);
    boolean updateRecruit(Recruit recruit);
}
