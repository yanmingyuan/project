package com.ymy.service;

import com.ymy.model.Reward;

import java.util.List;

public interface RewardService {
    List<Reward> queryAllByMonth(Reward reward);
    Reward queryByDSAndEmp(Reward reward);
    boolean addReward(Reward reward);
    boolean deleteReward(int rw_id);
    boolean updateReward(Reward reward);
}
