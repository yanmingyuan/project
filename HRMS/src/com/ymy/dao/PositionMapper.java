package com.ymy.dao;

import com.ymy.model.Department;
import com.ymy.model.Position;

import java.util.List;

public interface PositionMapper {
    List<Position> queryAllDepart();
    List<Position> queryByDepart(Department department);
    boolean addPosition(Position position);
    boolean deletePosition(int p_id);
    boolean updatePosition(Position position);
}
