package com.ymy.service;

import com.ymy.model.Attend;

import java.util.List;

public interface AttendService {
    List<Attend> queryByMonthAndEmp(Attend attend);
    Attend queryByDateAndEmp(Attend attend);
    boolean addAttend(Attend attend);
    boolean updateAttend(Attend attend);
}
