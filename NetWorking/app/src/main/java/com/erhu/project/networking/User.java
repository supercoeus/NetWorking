package com.erhu.project.networking;

public class User {
    private int id;
    private boolean invalid;
    private int status;
    private long createdDatetime;
    private long updatedDatetime;
    private int orderTag;
    private String name;
    private String phone;
    private String password;
    private String slogan;
    private String imagpath;
    private int userid;
    private int sex;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isInvalid() {
        return invalid;
    }

    public void setInvalid(boolean invalid) {
        this.invalid = invalid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(long createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public long getUpdatedDatetime() {
        return updatedDatetime;
    }

    public void setUpdatedDatetime(long updatedDatetime) {
        this.updatedDatetime = updatedDatetime;
    }

    public int getOrderTag() {
        return orderTag;
    }

    public void setOrderTag(int orderTag) {
        this.orderTag = orderTag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getImagpath() {
        return imagpath;
    }

    public void setImagpath(String imagpath) {
        this.imagpath = imagpath;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
