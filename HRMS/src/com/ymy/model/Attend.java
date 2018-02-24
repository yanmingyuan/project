package com.ymy.model;

import java.io.Serializable;

public class Attend implements Serializable{
    private int at_id;
    private String at_arriveTime;
    private String at_leaveTime;
    private Employee employee;

    public Attend() {
    }

    public Attend(int at_id, String at_arriveTime, String at_leaveTime, Employee employee) {
        this.at_id = at_id;
        this.at_arriveTime = at_arriveTime;
        this.at_leaveTime = at_leaveTime;
        this.employee = employee;
    }

    public int getAt_id() {
        return at_id;
    }

    public void setAt_id(int at_id) {
        this.at_id = at_id;
    }

    public String getAt_arriveTime() {
        return at_arriveTime;
    }

    public void setAt_arriveTime(String at_arriveTime) {
        this.at_arriveTime = at_arriveTime;
    }

    public String getAt_leaveTime() {
        return at_leaveTime;
    }

    public void setAt_leaveTime(String at_leaveTime) {
        this.at_leaveTime = at_leaveTime;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Attend{" +
                "at_id=" + at_id +
                ", at_arriveTime='" + at_arriveTime + '\'' +
                ", at_leaveTime='" + at_leaveTime + '\'' +
                ", employee=" + employee +
                '}';
    }
}
