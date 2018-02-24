package com.ymy.dao;

import com.ymy.model.Department;

import java.util.List;

public interface DepartMapper {
    List<Department> queryAllDepart();//查询所有职位
    Department queryDepart(int d_id);//查询部门
    boolean addDepart(Department department);//添加部门
    boolean deleteDepart(int d_id);//删除部门
    boolean updateDepart(Department department);//更新部门
}
