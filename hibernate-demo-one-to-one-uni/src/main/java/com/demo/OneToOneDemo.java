package com.demo;

import com.demo.entity.Instructor;
import com.demo.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{
            session.beginTransaction();

            InstructorDetail instructorDetail = new InstructorDetail("www.youtube.com/susheel", "singing");
            Instructor instructor = new Instructor("Susheel", "Kumar", "susheel.kumar@gmail.com");
            instructor.setInstructorDetails(instructorDetail);
            session.save(instructor);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }

    }
}
