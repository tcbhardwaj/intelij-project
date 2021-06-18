package com.demo;

import com.demo.entity.Course;
import com.demo.entity.Instructor;
import com.demo.entity.InstructorDetail;
import com.demo.entity.Review;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCourseAndReviews {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        try{
            session.beginTransaction();
            Instructor instructor = session.get(Instructor.class, 2);
            Course course = new Course("Flutter with Susheel");
            instructor.addCourse(course);
            course.addReview(new Review("This is awesome course"));
            course.addReview(new Review("This is course is good for beginner"));
            session.save(course);



            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
