package com.ymy.dao;

import com.ymy.model.Attend;

import java.util.List;

public interface AttendMapper {
    List<Attend> queryByMonthAndEmp(Attend attend);//员工查询自己本月的考勤情况
    Attend queryByDateAndEmp(Attend attend);//根据日期和员工查
    boolean addAttend(Attend attend);//添加打卡记录
    boolean updateAttend(Attend attend);//更新打卡记录
}
