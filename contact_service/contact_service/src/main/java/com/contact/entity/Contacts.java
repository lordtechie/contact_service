package com.contact.entity;

public class Contacts {

    private Long cId;
    private String email;
    private String phone;
    private Long userId;

    public Contacts(Long cId, String email, String phone, Long userId) {
        this.cId = cId;
        this.email = email;
        this.phone = phone;
        this.userId = userId;
    }

    public Contacts() {
    }

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
