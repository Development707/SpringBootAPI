package com.SpringBootAPI.service;

import com.SpringBootAPI.entity.Student;
import com.SpringBootAPI.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository repository;

    @Override
    public Student saveStudent(Student student) {
        student.setId(0l);
        return repository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return (List<Student>) repository.findAll();
    }

    @Override
    public Student getStudentById(Long studentId) {
        return repository.findById(studentId).get();
    }

    @Override
    public void deleteById(Long studentId) {
        repository.deleteById(studentId);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }
}
