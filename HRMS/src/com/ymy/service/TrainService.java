package com.ymy.service;

import com.ymy.model.Train;

import java.util.List;

public interface TrainService {
    List<Train> queryAllTrains();//管理员查询所有培训信息
    Train queryByDepart(int d_id);//员工查询自己是否参加培训
    boolean addTrain(Train train);//添加培训信息
    boolean deleteTrain(int tn_id);//删除培训信息
    boolean updateTrain(Train train);//管理员选择部门后更新培训信息
}
