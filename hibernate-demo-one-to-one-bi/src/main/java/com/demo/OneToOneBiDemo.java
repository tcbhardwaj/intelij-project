package com.demo;

import com.demo.entity.Instructor;
import com.demo.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneBiDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{
            session.beginTransaction();

            InstructorDetail instuctorDetails  = session.get(InstructorDetail.class, 2);

            System.out.println(instuctorDetails);

            System.out.println(instuctorDetails.getInstructor());

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }

    }
}
