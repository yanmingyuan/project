package com.ymy.dao;

import com.ymy.model.Department;

import java.util.List;

public interface DepartMapper {
    List<Department> queryAllDepart();
    Department queryDepart(int d_id);
    boolean addDepart(Department department);
    boolean deleteDepart(int d_id);
    boolean updateDepart(Department department);
}
