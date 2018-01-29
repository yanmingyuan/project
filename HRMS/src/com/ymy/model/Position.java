package com.ymy.model;

import java.io.Serializable;

public class Position implements Serializable{
    private int p_id;
    private String p_name;
    private String p_createTime;
    private Department department;

    public Position() {
    }

    public Position(int p_id, String p_name, String p_createTime, Department department) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.p_createTime = p_createTime;
        this.department = department;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getP_createTime() {
        return p_createTime;
    }

    public void setP_createTime(String p_createTime) {
        this.p_createTime = p_createTime;
    }

    @Override
    public String toString() {
        return "Position{" +
                "p_id=" + p_id +
                ", p_name='" + p_name + '\'' +
                ", p_createTime='" + p_createTime + '\'' +
                '}';
    }
}
