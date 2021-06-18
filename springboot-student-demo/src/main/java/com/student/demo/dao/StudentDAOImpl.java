package com.student.demo.dao;

import com.student.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Student> findAll() {
        // get current hibernate session
        Session session = entityManager.unwrap(Session.class);
        // create query
        Query<Student> query = session.createQuery("from Student", Student.class);
        // execute the query
        List<Student> students = query.getResultList();
        // return the result
        return students;
    }

    @Override
    public Student findById(int id) {
        Session session = entityManager.unwrap(Session.class);
        Student student = session.get(Student.class, id);

        return student;
    }

    @Override
    public void save(Student student) {
        Session session = entityManager.unwrap(Session.class);

        session.saveOrUpdate(student);
    }

    @Override
    public void update(Student student) {
        Session session = entityManager.unwrap(Session.class);

        session.update(student);
    }

    @Override
    public void deleteById(int id) {
        Session session = entityManager.unwrap(Session.class);
        Query query = session.createQuery("delete from Student s where s.id = :id");
        query.setParameter("id", id);
        query.executeUpdate();
    }
}
