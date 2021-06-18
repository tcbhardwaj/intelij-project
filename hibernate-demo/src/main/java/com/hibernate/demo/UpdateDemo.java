package com.hibernate.demo;

import com.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class UpdateDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            //starting transaction
            session.beginTransaction();

            Student student = session.get(Student.class, 1);
            student.setFirstName("Scooby");
            session.getTransaction().commit();

            // Update by query example
            session = factory.getCurrentSession();

            session.beginTransaction();
            session.createQuery("update Student set email = 'newmail@gmail.com' where id=2").executeUpdate();
            session.getTransaction().commit();

        } finally {
            //close the factory
            factory.close();
        }
    }
}
