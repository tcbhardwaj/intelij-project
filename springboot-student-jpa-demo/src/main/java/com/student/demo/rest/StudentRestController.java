package com.student.demo.rest;

import com.student.demo.dao.StudentDAO;
import com.student.demo.entity.Student;
import com.student.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    @Autowired
    private StudentService studentService;


    @GetMapping("/students")
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/students/{id}")
    public Student findById(@PathVariable int id){
        Student student =  studentService.findById(id);
        if(student == null) {
            throw new RuntimeException("Student id not found");
        }

        return student;
    }

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student) {
        studentService.save(student);
        return student;
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student) {
        studentService.update(student);
        return student;
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentService.deleteById(id);
        return "Record deleted successfully";
    }


}
