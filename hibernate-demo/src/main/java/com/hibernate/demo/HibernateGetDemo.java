package com.hibernate.demo;

import com.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateGetDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            //get object
            session.beginTransaction();
            Student student = session.get(Student.class, 5);
            System.out.println(student);
            session.getTransaction().commit();
        } finally {
            //close the factory
            factory.close();
        }
    }
}
