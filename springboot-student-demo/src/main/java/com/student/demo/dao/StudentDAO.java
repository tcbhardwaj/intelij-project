package com.student.demo.dao;

import com.student.demo.entity.Student;

import java.util.List;

public interface StudentDAO {
    public List<Student> findAll();
    public Student findById(int id);
    public void save(Student student);
    public void update(Student student);
    public void deleteById(int id);
}
