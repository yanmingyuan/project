package com.ymy.service.impl;

import com.ymy.dao.RecruitMapper;
import com.ymy.model.Recruit;
import com.ymy.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecruitServiceImpl implements RecruitService {
    @Autowired
    private RecruitMapper recruitMapper;
    @Override
    public List<Recruit> queryAll() {
        return recruitMapper.queryAll();
    }

    @Override
    public Recruit queryRcById(int rc_id) {
        return recruitMapper.queryRcById(rc_id);
    }

    @Override
    public boolean addRecruit(Recruit recruit) {
        return recruitMapper.addRecruit(recruit);
    }

    @Override
    public boolean deleteRecruit(Recruit recruit) {
        return recruitMapper.deleteRecruit(recruit);
    }

    @Override
    public boolean updateRecruit(Recruit recruit) {
        return recruitMapper.updateRecruit(recruit);
    }
}
