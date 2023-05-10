package com.spring.orm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_details")
public class Student {

    @Id
    @Column(name = "student_id")
    private int studentId;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "student_city")
    private String student_city;

    public Student() {
    }

    public Student(int studentId, String studentName, String student_city) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.student_city = student_city;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudent_city() {
        return student_city;
    }

    public void setStudent_city(String student_city) {
        this.student_city = student_city;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", student_city=" + student_city
                + "]";
    }

}
