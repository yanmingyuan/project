package com.ymy.service.impl;

import com.ymy.dao.PositionMapper;
import com.ymy.model.Department;
import com.ymy.model.Position;
import com.ymy.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionMapper positionMapper;
    @Override
    public List<Position> queryAllDepart() {
        return positionMapper.queryAllDepart();
    }

    @Override
    public List<Position> queryByDepart(Department department) {
        return positionMapper.queryByDepart(department);
    }

    @Override
    public boolean addPosition(Position position) {
        return positionMapper.addPosition(position);
    }

    @Override
    public boolean deletePosition(int p_id) {
        return positionMapper.deletePosition(p_id);
    }

    @Override
    public boolean updatePosition(Position position) {
        return positionMapper.updatePosition(position);
    }
}
