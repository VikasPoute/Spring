package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        Student student = new Student(1004, "Vikas Poute", "Pune");
        int id = studentDao.insertStudent(student);
        System.out.println(id);
    }
}
