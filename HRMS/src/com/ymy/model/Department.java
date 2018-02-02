package com.ymy.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Department implements Serializable{
    private int d_id;
    private String d_name;
    private String d_createTime;
    private Set<Position> positionSet=new HashSet<>();

    public Department() {
    }

    public Department(String d_name, String d_createTime) {
        this.d_name = d_name;
        this.d_createTime = d_createTime;
    }

    public Department(int d_id, String d_name, String d_createTime, Set<Position> positionSet) {
        this.d_id = d_id;
        this.d_name = d_name;
        this.d_createTime = d_createTime;
        this.positionSet = positionSet;
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public Set<Position> getPositionSet() {
        return positionSet;
    }

    public void setPositionSet(Set<Position> positionSet) {
        this.positionSet = positionSet;
    }

    public String getD_createTime() {
        return d_createTime;
    }

    public void setD_createTime(String d_createTime) {
        this.d_createTime = d_createTime;
    }

    @Override
    public String toString() {
        return "Department{" +
                "d_id=" + d_id +
                ", d_name='" + d_name + '\'' +
                ", d_createTime='" + d_createTime + '\'' +
                ", positionSet=" + positionSet +
                '}';
    }
}
