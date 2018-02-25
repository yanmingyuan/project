package com.ymy.model;

import java.io.Serializable;

public class Salary implements Serializable{
    private int s_id;
    private double s_basic;//基本工资
    private double s_reward;//奖金，绩效奖金，加班
    private double s_security;//社保，基本工资的8%
    private String s_time;//哪个月份的工资
    private Employee employee;

    public Salary() {
    }

    public Salary(int s_id, double s_basic, double s_reward, double s_security, String s_time, Employee employee) {
        this.s_id = s_id;
        this.s_basic = s_basic;
        this.s_reward = s_reward;
        this.s_security = s_security;
        this.s_time = s_time;
        this.employee = employee;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public double getS_basic() {
        return s_basic;
    }

    public void setS_basic(double s_basic) {
        this.s_basic = s_basic;
    }

    public double getS_reward() {
        return s_reward;
    }

    public void setS_reward(double s_reward) {
        this.s_reward = s_reward;
    }

    public double getS_security() {
        return s_security;
    }

    public void setS_security(double s_security) {
        this.s_security = s_security;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getS_time() {
        return s_time;
    }

    public void setS_time(String s_time) {
        this.s_time = s_time;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "s_id=" + s_id +
                ", s_basic=" + s_basic +
                ", s_reward=" + s_reward +
                ", s_security=" + s_security +
                ", s_time='" + s_time + '\'' +
                ", employee=" + employee +
                '}';
    }
}
