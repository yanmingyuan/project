package com.ymy.dao;

import com.ymy.model.Department;
import com.ymy.model.Position;

import java.util.List;

public interface PositionMapper {
    List<Position> queryByDepart(Department department);
    boolean addPosition(Position position);
}
