package com.example.userservice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    public User(){}
    @Id
    @GeneratedValue
    private int uid;
    private String name;
    private String email;
    private String telephone;
    private String job;
    private int age;

    public int getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getJob() {
        return job;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
