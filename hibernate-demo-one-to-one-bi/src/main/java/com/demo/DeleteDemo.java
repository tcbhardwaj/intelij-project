package com.demo;

import com.demo.entity.Instructor;
import com.demo.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        try{
            session.beginTransaction();
            Instructor instructor = session.get(Instructor.class, 7);
            session.delete(instructor);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
