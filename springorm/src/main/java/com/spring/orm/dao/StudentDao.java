package com.spring.orm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Student;

@Component("studentDao")
public class StudentDao {

    @Autowired(required = true)
    private HibernateTemplate hibernateTemplate;

    // Save the current student
    @Transactional
    public int insert(Student student) {
        hibernateTemplate.save(student);
        return student.getStudentId();
    }

    // Get the one student
    public Student getStudent(int studentId) {
        return hibernateTemplate.get(Student.class, studentId);
    }

    // Get all students
    public List<Student> getAllStudents() {
        return hibernateTemplate.loadAll(Student.class);
    }

    // Delete the one student
    @Transactional
    public void deleteStudent(int studentId) {
        Student student = hibernateTemplate.get(Student.class, studentId);
        hibernateTemplate.delete(student);
    }

    // Update the one student
    @Transactional
    public void updateStudent(Student student) {
        hibernateTemplate.update(student);
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
