package com.hibernate.demo;


import com.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SaveDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        String URL = "jdbc:postgresql://localhost:5432/hbstudent";
//        Class.forName("org.postgresql.Driver");
//        Connection con = DriverManager.getConnection(URL, "postgres", "postgres");
//        System.out.println("connection creaed");

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            //save object
            Student student = new Student("Sam", "Decosta", "sam.d@gmail.com" );
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
        } finally {
            //close the factory
            factory.close();
        }
    }
}
