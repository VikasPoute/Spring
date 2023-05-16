package com.spring.search.entities;

import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String name;
    private Long id;
    private Date date;
    private ArrayList<String> courses;
    private String gender;
    private String type;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + ", date=" + date + ", courses=" + courses + ", gender=" + gender
                + ", type=" + type + ", address=" + address + "]";
    }

}
