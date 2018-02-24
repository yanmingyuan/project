package com.ymy.dao;

import com.ymy.model.Department;
import com.ymy.model.Position;

import java.util.List;

public interface PositionMapper {
    List<Position> queryAllDepart();//查询所有职位
    List<Position> queryByDepart(Department department);//根据部门查询职位
    boolean addPosition(Position position);//添加职位
    boolean deletePosition(int p_id);//根据职位id删除职位
    boolean updatePosition(Position position);//更新职位名称
}
