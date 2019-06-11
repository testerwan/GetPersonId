package com.zhongan.entity;


public class User {

    private String idNo;
    private String name;
    private String created_time;

    public User() {
    }

    public User(String idNo, String name, String created_time) {
        this.idNo = idNo;
        this.name = name;
        this.created_time = created_time;
    }



    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    @Override
    public String toString() {
        return "User{" +
                "idNo='" + idNo + '\'' +
                ", name='" + name + '\'' +
                ", created_time='" + created_time + '\'' +
                '}';
    }
}
