package com.ymy.model;

import java.io.Serializable;

public class Reward implements Serializable{
    private int rw_id;
    private String rw_time;
    private String rw_cause;
    private double rw_money;//正为赏，负为罚
    private Employee employee;

    public Reward() {
    }

    public Reward(int rw_id, String rw_time, String rw_cause, double rw_money, Employee employee) {
        this.rw_id = rw_id;
        this.rw_time = rw_time;
        this.rw_cause = rw_cause;
        this.rw_money = rw_money;
        this.employee = employee;
    }

    public int getRw_id() {
        return rw_id;
    }

    public void setRw_id(int rw_id) {
        this.rw_id = rw_id;
    }

    public String getRw_time() {
        return rw_time;
    }

    public void setRw_time(String rw_time) {
        this.rw_time = rw_time;
    }

    public String getRw_cause() {
        return rw_cause;
    }

    public void setRw_cause(String rw_cause) {
        this.rw_cause = rw_cause;
    }

    public double getRw_money() {
        return rw_money;
    }

    public void setRw_money(double rw_money) {
        this.rw_money = rw_money;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Reward{" +
                "rw_id=" + rw_id +
                ", rw_time='" + rw_time + '\'' +
                ", rw_cause='" + rw_cause + '\'' +
                ", rw_money=" + rw_money +
                ", employee=" + employee +
                '}';
    }
}
