package com.demo;

import com.demo.entity.Course;
import com.demo.entity.Instructor;
import com.demo.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetCourseDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        try{
            session.beginTransaction();
//            Course course = session.get(Course.class, 3);
//            System.out.println("Course::"+course);
//            System.out.println("Instructor::"+course.getInstructor());
            Instructor instructor = session.get(Instructor.class, 1);
            System.out.println("Instructor::"+instructor);
            System.out.println("Course::"+ instructor.getCourses());
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
