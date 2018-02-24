package com.ymy.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Train implements Serializable {
    private int tn_id;
    private String tn_title;
    private String tn_time;
    private String tn_place;
    private String tn_content;
    private Department department;

    public Train() {
    }

    public Train(int tn_id, String tn_title, String tn_time, String tn_place, String tn_content, Department department) {
        this.tn_id = tn_id;
        this.tn_title = tn_title;
        this.tn_time = tn_time;
        this.tn_place = tn_place;
        this.tn_content = tn_content;
        this.department = department;
    }

    public int getTn_id() {
        return tn_id;
    }

    public void setTn_id(int tn_id) {
        this.tn_id = tn_id;
    }

    public String getTn_title() {
        return tn_title;
    }

    public void setTn_title(String tn_title) {
        this.tn_title = tn_title;
    }

    public String getTn_time() {
        return tn_time;
    }

    public void setTn_time(String tn_time) {
        this.tn_time = tn_time;
    }

    public String getTn_place() {
        return tn_place;
    }

    public void setTn_place(String tn_place) {
        this.tn_place = tn_place;
    }

    public String getTn_content() {
        return tn_content;
    }

    public void setTn_content(String tn_content) {
        this.tn_content = tn_content;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Train{" +
                "tn_id=" + tn_id +
                ", tn_title='" + tn_title + '\'' +
                ", tn_time='" + tn_time + '\'' +
                ", tn_place='" + tn_place + '\'' +
                ", tn_content='" + tn_content + '\'' +
                ", department=" + department +
                '}';
    }
}
