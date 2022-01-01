package com.dnydys.model;

/**
 * @Classname Persion
 * @Description TODO
 * @Date 2022/1/1 14:30
 * @Created by hasee
 */
public class Persion {
    private String name;
    private String sex;
    private int age;
    private String maritalStatus;


    public Persion(String name, String sex, int age, String maritalStatus) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}
