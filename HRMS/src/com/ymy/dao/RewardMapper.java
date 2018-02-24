package com.ymy.dao;

import com.ymy.model.Reward;

import java.util.List;

public interface RewardMapper {
    /*
    * 根据月份查询员工的奖惩信息*/
    List<Reward> queryAllByMonth(Reward reward);
    /*根据日期、状态和员工查看此员工是否已经因为
    * 迟到或早退进行了处罚
    * */
    Reward queryByDSAndEmp(Reward reward);
    boolean addReward(Reward reward);
    boolean deleteReward(int rw_id);
    /*3小时迟到后又早退超过3小时，更新处罚信息*/
    boolean updateReward(Reward reward);
}
