package com.ymy.model;

import java.io.Serializable;

public class Resume implements Serializable {
    private int r_id;
    private User user;
    private String r_realName;
    private String r_sex;
    private String r_birth;
    private String r_email;
    private String r_phone;
    private String r_livingPlace;
    private String r_address;
    private String r_school;
    private String r_education;
    private String r_experience;
    private int r_ismarriage=2;//1已婚，2未婚
    private String r_certificate;
    private String r_nation;
    private String r_evaluation;
    private int r_state=1;//1未投递，2已投递，3已阅读,4待面试,5已接受邀请

    public Resume() {
    }

    public Resume(int r_id, User user, String r_realName, String r_sex, String r_birth, String r_email, String r_phone, String r_livingPlace, String r_address, String r_school, String r_education, String r_experience, int r_ismarriage, String r_certificate, String r_nation, String r_evaluation, int r_state) {
        this.r_id = r_id;
        this.user = user;
        this.r_realName = r_realName;
        this.r_sex = r_sex;
        this.r_birth = r_birth;
        this.r_email = r_email;
        this.r_phone = r_phone;
        this.r_livingPlace = r_livingPlace;
        this.r_address = r_address;
        this.r_school = r_school;
        this.r_education = r_education;
        this.r_experience = r_experience;
        this.r_ismarriage = r_ismarriage;
        this.r_certificate = r_certificate;
        this.r_nation = r_nation;
        this.r_evaluation = r_evaluation;
        this.r_state = r_state;
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getR_realName() {
        return r_realName;
    }

    public void setR_realName(String r_realName) {
        this.r_realName = r_realName;
    }

    public String getR_sex() {
        return r_sex;
    }

    public void setR_sex(String r_sex) {
        this.r_sex = r_sex;
    }

    public String getR_birth() {
        return r_birth;
    }

    public void setR_birth(String r_birth) {
        this.r_birth = r_birth;
    }

    public String getR_email() {
        return r_email;
    }

    public void setR_email(String r_email) {
        this.r_email = r_email;
    }

    public String getR_phone() {
        return r_phone;
    }

    public void setR_phone(String r_phone) {
        this.r_phone = r_phone;
    }

    public String getR_livingPlace() {
        return r_livingPlace;
    }

    public void setR_livingPlace(String r_livingPlace) {
        this.r_livingPlace = r_livingPlace;
    }

    public String getR_address() {
        return r_address;
    }

    public void setR_address(String r_address) {
        this.r_address = r_address;
    }

    public String getR_school() {
        return r_school;
    }

    public void setR_school(String r_school) {
        this.r_school = r_school;
    }

    public String getR_education() {
        return r_education;
    }

    public void setR_education(String r_education) {
        this.r_education = r_education;
    }

    public String getR_experience() {
        return r_experience;
    }

    public void setR_experience(String r_experience) {
        this.r_experience = r_experience;
    }

    public int getR_ismarriage() {
        return r_ismarriage;
    }

    public void setR_ismarriage(int r_ismarriage) {
        this.r_ismarriage = r_ismarriage;
    }

    public String getR_certificate() {
        return r_certificate;
    }

    public void setR_certificate(String r_certificate) {
        this.r_certificate = r_certificate;
    }

    public String getR_nation() {
        return r_nation;
    }

    public void setR_nation(String r_nation) {
        this.r_nation = r_nation;
    }

    public String getR_evaluation() {
        return r_evaluation;
    }

    public void setR_evaluation(String r_evaluation) {
        this.r_evaluation = r_evaluation;
    }

    public int getR_state() {
        return r_state;
    }

    public void setR_state(int r_state) {
        this.r_state = r_state;
    }

    @Override
    public String toString() {
        return "简历：{" +
                ", 姓名：" + r_realName + '\'' +
                ", 性别：" + r_sex + '\'' +
                ", 出生日期：'" + r_birth + '\'' +
                ", 电子邮箱：" + r_email + '\'' +
                ", 手机号码：" + r_phone + '\'' +
                ", 现居：" + r_livingPlace + '\'' +
                ", 籍贯：" + r_address + '\'' +
                ", 学校：" + r_school + '\'' +
                ", 学历：" + r_education + '\'' +
                ", 经验：" + r_experience + '\'' +
                ", 婚配：" + r_ismarriage +
                ", 证书" + r_certificate + '\'' +
                ", 民族" + r_nation + '\'' +
                ", 自我评价" + r_evaluation + '\'' +
                '}';
    }
}
