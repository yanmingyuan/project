package com.ymy.model;

import java.io.Serializable;

public class Employee implements Serializable {
    private int e_id;
    private String e_name;
    private String e_pass;
    private String e_sex;
    private String e_birth;
    private String e_email;
    private String e_phone;
    private String e_livingPlace;
    private String e_address;
    private String e_entryTime;
    private Department department;
    private Position position;
    private double e_salary;
    private int e_state;//1、试用期(80%工资)，2、在职，3、离职

    public Employee() {
    }

    public Employee(int e_id, String e_name, String e_pass, String e_sex, String e_birth, String e_email, String e_phone, String e_livingPlace, String e_address, String e_entryTime, Department department, Position position, double e_salary, int e_state) {
        this.e_id = e_id;
        this.e_name = e_name;
        this.e_pass = e_pass;
        this.e_sex = e_sex;
        this.e_birth = e_birth;
        this.e_email = e_email;
        this.e_phone = e_phone;
        this.e_livingPlace = e_livingPlace;
        this.e_address = e_address;
        this.e_entryTime = e_entryTime;
        this.department = department;
        this.position = position;
        this.e_salary = e_salary;
        this.e_state = e_state;
    }

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public String getE_pass() {
        return e_pass;
    }

    public void setE_pass(String e_pass) {
        this.e_pass = e_pass;
    }

    public String getE_sex() {
        return e_sex;
    }

    public void setE_sex(String e_sex) {
        this.e_sex = e_sex;
    }

    public String getE_birth() {
        return e_birth;
    }

    public void setE_birth(String e_birth) {
        this.e_birth = e_birth;
    }

    public String getE_email() {
        return e_email;
    }

    public void setE_email(String e_email) {
        this.e_email = e_email;
    }

    public String getE_phone() {
        return e_phone;
    }

    public void setE_phone(String e_phone) {
        this.e_phone = e_phone;
    }

    public String getE_livingPlace() {
        return e_livingPlace;
    }

    public void setE_livingPlace(String e_livingPlace) {
        this.e_livingPlace = e_livingPlace;
    }

    public String getE_address() {
        return e_address;
    }

    public void setE_address(String e_address) {
        this.e_address = e_address;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double getE_salary() {
        return e_salary;
    }

    public void setE_salary(double e_salary) {
        this.e_salary = e_salary;
    }

    public int getE_state() {
        return e_state;
    }

    public void setE_state(int e_state) {
        this.e_state = e_state;
    }

    public String getE_entryTime() {
        return e_entryTime;
    }

    public void setE_entryTime(String e_entryTime) {
        this.e_entryTime = e_entryTime;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "e_id=" + e_id +
                ", e_name='" + e_name + '\'' +
                ", e_pass='" + e_pass + '\'' +
                ", e_sex='" + e_sex + '\'' +
                ", e_birth='" + e_birth + '\'' +
                ", e_email='" + e_email + '\'' +
                ", e_phone='" + e_phone + '\'' +
                ", e_livingPlace='" + e_livingPlace + '\'' +
                ", e_address='" + e_address + '\'' +
                ", e_entryTime='" + e_entryTime + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", e_salary=" + e_salary +
                ", e_state=" + e_state +
                '}';
    }
}
