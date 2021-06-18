package com.demo;

import com.demo.entity.Instructor;
import com.demo.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SaveDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        try{
            session.beginTransaction();
            Instructor instructor = new Instructor("Manav", "Rachna", "manav@gmail.com");
            InstructorDetail instructorDetail = new InstructorDetail("www.youtube.com/manav", "cricket");
            //saving Instructor Details
            instructor.setInstructorDetails(instructorDetail);
            session.save(instructor);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
