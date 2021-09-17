package com.SpringBootAPI.controller;

import com.SpringBootAPI.DTO.StudentDTO;
import com.SpringBootAPI.entity.Student;
import com.SpringBootAPI.service.ServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class ControllerStudent {

    @Autowired
    private ServiceStudent service;

    @GetMapping
    public List<StudentDTO> getAllStudents(){
        List<StudentDTO> listDTO = new ArrayList<>();
        service.getAllStudent().forEach(student -> {
            listDTO.add(new StudentDTO(student));
        });
        return listDTO;
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") long id){
        return service.getStudentById(id);
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudentById(@PathVariable("id") long id){
        service.deleteById(id);
        return "Delete success!!";
    }
}
