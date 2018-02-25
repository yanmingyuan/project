package com.ymy.service.impl;

import com.ymy.dao.Trainmapper;
import com.ymy.model.Train;
import com.ymy.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TrainServiceImpl implements TrainService{
    @Autowired
    private Trainmapper trainmapper;
    @Override
    public List<Train> queryAllTrains() {
        return trainmapper.queryAllTrains();
    }

    @Override
    public List<Train> queryByDepart(int d_id) {
        return trainmapper.queryByDepart(d_id);
    }

    @Override
    public boolean addTrain(Train train) {
        return trainmapper.addTrain(train);
    }

    @Override
    public boolean deleteTrain(int tn_id) {
        return deleteTrain(tn_id);
    }

    @Override
    public boolean updateTrain(Train train) {
        return trainmapper.updateTrain(train);
    }
}
