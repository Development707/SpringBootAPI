package com.SpringBootAPI.controller;

import com.SpringBootAPI.entity.Student;
import com.SpringBootAPI.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping()
    public List<Student> getAllStudent(){
        return service.getAllStudent();
    }

    @PostMapping()
    public Student saveStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") Long studentId){
        return service.getStudentById(studentId);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable("id") Long studentId){
        service.deleteById(studentId);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }
}
