package com.ymy.model;

import java.io.Serializable;

public class User implements Serializable {
    private int u_id;
    private String u_name;
    private String u_pass;
    private int u_state;//1未投递简历，2已投递简历，3有面试，4面试成功待上班
    private Recruit recruit;

    public User() {
    }

    public User(int u_id, String u_name, String u_pass, int u_state, Recruit recruit) {
        this.u_id = u_id;
        this.u_name = u_name;
        this.u_pass = u_pass;
        this.u_state = u_state;
        this.recruit = recruit;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_pass() {
        return u_pass;
    }

    public void setU_pass(String u_pass) {
        this.u_pass = u_pass;
    }

    public int getU_state() {
        return u_state;
    }

    public void setU_state(int u_state) {
        this.u_state = u_state;
    }

    public Recruit getRecruit() {
        return recruit;
    }

    public void setRecruit(Recruit recruit) {
        this.recruit = recruit;
    }

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", u_name='" + u_name + '\'' +
                ", u_pass='" + u_pass + '\'' +
                ", u_state=" + u_state +
                ", recruit=" + recruit +
                '}';
    }
}
