package com.ymy.model;

import java.io.Serializable;

public class Recruit implements Serializable{
    private int rc_id;
    private String rc_required;//招聘要求如英语六级、日语三级、计算机二级等
    private String rc_position;//职位
    private double rc_minsalary;//最低薪资
    private double rc_maxsalary;//最高薪资
    private int rc_number;//招聘人数

    public Recruit() {
    }

    public Recruit(int rc_id, String rc_required, String rc_position, double rc_minsalary, double rc_maxsalary, int rc_number) {
        this.rc_id = rc_id;
        this.rc_required = rc_required;
        this.rc_position = rc_position;
        this.rc_minsalary = rc_minsalary;
        this.rc_maxsalary = rc_maxsalary;
        this.rc_number = rc_number;
    }

    public int getRc_id() {
        return rc_id;
    }

    public void setRc_id(int rc_id) {
        this.rc_id = rc_id;
    }

    public String getRc_required() {
        return rc_required;
    }

    public void setRc_required(String rc_required) {
        this.rc_required = rc_required;
    }

    public String getRc_position() {
        return rc_position;
    }

    public void setRc_position(String rc_position) {
        this.rc_position = rc_position;
    }

    public double getRc_minsalary() {
        return rc_minsalary;
    }

    public void setRc_minsalary(double rc_minsalary) {
        this.rc_minsalary = rc_minsalary;
    }

    public double getRc_maxsalary() {
        return rc_maxsalary;
    }

    public void setRc_maxsalary(double rc_maxsalary) {
        this.rc_maxsalary = rc_maxsalary;
    }

    public int getRc_number() {
        return rc_number;
    }

    public void setRc_number(int rc_number) {
        this.rc_number = rc_number;
    }

    @Override
    public String toString() {
        return "Recruit{" +
                "rc_id=" + rc_id +
                ", rc_required='" + rc_required + '\'' +
                ", rc_position='" + rc_position + '\'' +
                ", rc_minsalary=" + rc_minsalary +
                ", rc_maxsalary=" + rc_maxsalary +
                ", rc_number=" + rc_number +
                '}';
    }
}
