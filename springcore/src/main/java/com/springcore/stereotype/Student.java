package com.springcore.stereotype;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("Vikas Poute")
    private String studentName;

    @Value("Pune")
    private String city;

    @Value("#{cities}")
    ArrayList<String> addresses = new ArrayList<String>();

    public ArrayList<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<String> addresses) {
        this.addresses = addresses;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student [studentName=" + studentName + ", city=" + city + "]";
    }
}
