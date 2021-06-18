package com.demo;

import com.demo.entity.Course;
import com.demo.entity.Instructor;
import com.demo.entity.InstructorDetail;
import com.demo.entity.Review;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteCourseAndReviews {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        try{
            /*
            This will delete course and its related reviews
             */
            session.beginTransaction();
            Course course = session.get(Course.class, 10);
            System.out.println("Deleting:: "+course);
            session.delete(course);
            System.out.println("done");
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
