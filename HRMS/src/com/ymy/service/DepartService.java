package com.ymy.service;

import com.ymy.model.Department;

import java.util.List;

public interface DepartService {
    List<Department> queryAllDepart();
    Department queryDepart(int d_id);
    boolean addDepart(Department department);
    boolean deleteDepart(int d_id);
    boolean updateDepart(Department department);
}
