package com.student.demo.service;

import com.student.demo.dao.StudentDAO;
import com.student.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentDAO studentDAO;

    @Override
    @Transactional
    public List<Student> findAll() {
        return studentDAO.findAll();
    }

    @Override
    @Transactional
    public Student findById(int id) {
        return studentDAO.findById(id);
    }

    @Override
    @Transactional
    public void save(Student student) {
        studentDAO.save(student);
    }

    @Override
    @Transactional
    public void update(Student student) {
        studentDAO.update(student);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        studentDAO.deleteById(id);
    }
}
