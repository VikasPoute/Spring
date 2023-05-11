package com.spring.orm;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // ApplicationContext context = new
        // ClassPathXmlApplicationContext("config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

        // Student student = new Student(1003, "Mahesh Sawant", "Pune");
        // studentDao.insert(student);
        // System.out.println("Student inserted successfully");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("PRESS 1 for add new student");
            System.out.println("PRESS 2 for display  all students");
            System.out.println("PRESS 3 for get detail of single student");
            System.out.println("PRESS 4 for update student");
            System.out.println("PRESS 5 for delete students");
            System.out.println("PRESS 6 for exit");

            try {

                System.out.print("Enter Your Choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        // Add new student
                        // taking inputs from users
                        System.out.print("Enter user id : ");
                        int uId = sc.nextInt();

                        sc = new Scanner(System.in);
                        System.out.print("Enter user name : ");
                        String uName = sc.nextLine();

                        System.out.print("Enter user city: ");
                        String uCity = sc.nextLine();

                        // creating student object and setting values
                        Student student = new Student();
                        student.setStudentId(uId);
                        student.setStudentName(uName);
                        student.setStudentCity(uCity);

                        // saving student object to database by calling insert of student dao
                        studentDao.insert(student);
                        System.out.println("Student id with " + student.getStudentId() + " inserted successfully");
                        System.out.println("***************************************");
                        System.out.println();

                        break;
                    case 2:
                        // Display all students
                        System.out.println("**************************************");
                        List<Student> allStudents = studentDao.getAllStudents();
                        for (Student st : allStudents) {
                            System.out.println("Id : " + st.getStudentId());
                            System.out.println("Name : " + st.getStudentName());
                            System.out.println("City : " + st.getStudentCity());
                            System.out.println("___________________________________");
                        }

                        System.out.println("**************************************");
                        break;
                    case 3:
                        // Display only one student
                        System.out.println("Enter user id : ");
                        int userId = sc.nextInt();
                        Student getStudent = studentDao.getStudent(userId);
                        System.out.println("Id : " + getStudent.getStudentId());
                        System.out.println("Name : " + getStudent.getStudentName());
                        System.out.println("City : " + getStudent.getStudentCity());
                        System.out.println("___________________________________");

                        break;
                    case 4:
                        // Update student
                        // taking inputs from users
                        System.out.print("Enter user id : ");
                        int upStudentId = sc.nextInt();

                        sc = new Scanner(System.in);
                        System.out.print("Enter user name : ");
                        String upStudentName = sc.nextLine();

                        System.out.print("Enter user city: ");
                        String upStudentCity = sc.nextLine();

                        // creating student object and setting values
                        Student upStudent = new Student();
                        upStudent.setStudentId(upStudentId);
                        upStudent.setStudentName(upStudentName);
                        upStudent.setStudentCity(upStudentCity);

                        // saving student object to database by calling insert of student dao
                        studentDao.updateStudent(upStudent);
                        System.out.println("Student id with " + upStudent.getStudentId() + " updated successfully");
                        System.out.println("***************************************");
                        System.out.println();
                        break;
                    case 5:
                        // Delete student
                        System.out.println("Enter user id : ");
                        int id = sc.nextInt();
                        studentDao.deleteStudent(id);
                        System.out.println("Student deleted...");
                        break;
                    case 6:
                        // exit
                        System.out.println("Thank you for using my application");
                        System.exit(0);
                }

            } catch (Exception e) {
                System.out.println("Invalid input try to another one");
                System.out.println(e.getMessage());
            }
        }

    }

}
