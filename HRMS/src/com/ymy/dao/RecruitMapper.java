package com.ymy.dao;

import com.ymy.model.Recruit;

import java.util.List;

public interface RecruitMapper {
    List<Recruit> queryAll();
    boolean addRecruit(Recruit recruit);
    boolean deleteRecruit(Recruit recruit);
}
