package com.demo;

import com.demo.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetCourseAndStudent {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        try{
            /*
            This will delete course and its related reviews
             */
            session.beginTransaction();
            Student student = session.get(Student.class, 5);
            System.out.println("\n============= Student Details ==============");
            System.out.println(student);
            System.out.println("\n============= Course Details ==============");
            System.out.println(student.getCourses());
            System.out.println("\n===================================");

            Course course = session.get(Course.class, 9);
            System.out.println("\n============= Course Details ==============");
            System.out.println(course);
            System.out.println("\n============= Student Details ==============");
            System.out.println(course.getStudents());
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
