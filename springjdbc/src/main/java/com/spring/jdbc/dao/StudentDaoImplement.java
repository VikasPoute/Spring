package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entity.Student;

@Component("studentDao")
public class StudentDaoImplement implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student student) {
        // Insert jdbc query
        String query = "insert into student(id, name, city) values(?, ?, ?)";
        return jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
    }

    @Override
    public int update(Student student) {
        // Update Student jdbc query
        String query = "update student set name=?, city=? where id=?";
        return jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
    }

    @Override
    public int delete(int studentId) {
        // Delete Student jdbc query
        String query = "delete from student where id=?";
        return jdbcTemplate.update(query, studentId);
    }

    @Override
    public Student getStudent(int studentId) {
        String query = "select * from student where id=?";
        Student student = (Student) jdbcTemplate.queryForObject(query, new RowMapperImpl(), studentId);

        return student;
    }

    @Override
    public List<Student> getStudents() {
        String query = "SELECT * FROM student";
        List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());

        return students;
    }

}
