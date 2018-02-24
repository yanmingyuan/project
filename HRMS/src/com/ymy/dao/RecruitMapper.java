package com.ymy.dao;

import com.ymy.model.Recruit;

import java.util.List;

public interface RecruitMapper {
    List<Recruit> queryAll();//返回所有招聘人数大于一的招聘信息
    Recruit queryRcById(int rc_id);//根据招聘id查询招聘信息
    boolean addRecruit(Recruit recruit);//添加招聘
    boolean deleteRecruit(Recruit recruit);//删除此招聘
    boolean updateRecruit(Recruit recruit);//更新招聘信息
}
