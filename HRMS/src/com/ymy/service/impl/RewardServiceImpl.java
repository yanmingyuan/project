package com.ymy.service.impl;

import com.ymy.dao.RewardMapper;
import com.ymy.model.Reward;
import com.ymy.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RewardServiceImpl implements RewardService {
    @Autowired
    private RewardMapper rewardMapper;
    @Override
    public List<Reward> queryAllByMonth(Reward reward) {
        return rewardMapper.queryAllByMonth(reward);
    }

    @Override
    public Reward queryByDSAndEmp(Reward reward) {
        return rewardMapper.queryByDSAndEmp(reward);
    }

    @Override
    public boolean addReward(Reward reward) {
        return rewardMapper.addReward(reward);
    }

    @Override
    public boolean deleteReward(int rw_id) {
        return rewardMapper.deleteReward(rw_id);
    }

    @Override
    public boolean updateReward(Reward reward) {
        return rewardMapper.updateReward(reward);
    }
}
