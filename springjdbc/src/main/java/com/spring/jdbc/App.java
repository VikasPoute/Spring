package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entity.Student;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        System.out.println("My application is running.......");
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);

        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        Student student = new Student();

        // // INSERT Student
        // student.setId(1004);
        // student.setName("Sandy");
        // student.setCity("Pune");

        // studentDao.insert(student);
        // System.out.println("Student inserted successfully");

        // // UPDATE Student
        // student.setId(1004);
        // student.setName("Shankar");
        // student.setCity("Jat");

        // studentDao.update(student);
        // System.out.println("Student updated successfully");

        // // DELETE Student
        // studentDao.delete(1003);
        // System.out.println("Student deleted successfully");

        // // Get student
        // student = studentDao.getStudent(1002);
        // System.out.println(student);

        // Get all students
        List<Student> students = studentDao.getStudents();
        for (Student st : students) {
            System.out.println(st);
        }
    }
}