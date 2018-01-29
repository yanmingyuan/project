package com.ymy.service;

import com.ymy.model.Recruit;

import java.util.List;

public interface RecruitService {
    List<Recruit> queryAll();
    boolean addRecruit(Recruit recruit);
    boolean deleteRecruit(Recruit recruit);
}
