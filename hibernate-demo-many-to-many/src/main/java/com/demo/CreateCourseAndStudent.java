package com.demo;

import com.demo.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCourseAndStudent {
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
            session.beginTransaction();
            Course course = session.get(Course.class, 9);
            Student student1 = new Student("Sunny", "Shekhawat", "sunny.shekhawat@gmail.com");
            Student student2 = new Student("Marry", "John", "marry.john@gmail.com");
            course.addStudent(student1);
            course.addStudent(student2);
            session.save(student1);
            session.save(student2);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
