package com.hibernate.demo;

import com.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            //starting transaction
            session.beginTransaction();

            // Query to fetch all records
            List<Student> students = session.createQuery("from Student").getResultList();
            System.out.println("\n======== All records ============");
            students.stream().forEach(s -> System.out.println(s));

            // Query with where clause
            students = session.createQuery("from Student where firstName='Lolo'").getResultList();
            System.out.println("\n======== Where first name Lolo ============");
            students.stream().forEach(s -> System.out.println(s));

            // Query with where clause with OR
            students = session.createQuery("from Student where firstName='Lolo' OR lastName='John'").getResultList();
            System.out.println("\n======== Where first name Lolo OR last name John============");
            students.stream().forEach(s -> System.out.println(s));

            // Query with where clause with like caluse
            students = session.createQuery("from Student where email like '%gmail%'").getResultList();
            System.out.println("\n======== Where email containing gmail ============");
            students.stream().forEach(s -> System.out.println(s));

            session.getTransaction().commit();
        } finally {
            //close the factory
            factory.close();
        }
    }
}
