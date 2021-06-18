package com.hibernate.demo;

import com.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            //starting transaction
            session.beginTransaction();

//            Student student = session.get(Student.class, 2);
//            session.delete(student);

            // Delete by query example


            session.createQuery("delete from Student where id=3").executeUpdate();
            session.getTransaction().commit();

        } finally {
            //close the factory
            factory.close();
        }
    }
}
