package com.ymy.service.impl;

import com.ymy.dao.AttendMapper;
import com.ymy.model.Attend;
import com.ymy.service.AttendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AttendServiceImpl implements AttendService {
    @Autowired
    private AttendMapper attendMapper;

    @Override
    public List<Attend> queryByMonthAndEmp(Attend attend) {
        return attendMapper.queryByMonthAndEmp(attend);
    }

    @Override
    public Attend queryByDateAndEmp(Attend attend) {
        return attendMapper.queryByDateAndEmp(attend);
    }

    @Override
    public boolean addAttend(Attend attend) {
        return attendMapper.addAttend(attend);
    }

    @Override
    public boolean updateAttend(Attend attend) {
        return attendMapper.updateAttend(attend);
    }
}
