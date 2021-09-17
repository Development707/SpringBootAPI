package com.SpringBootAPI.service;

import com.SpringBootAPI.entity.Student;
import com.SpringBootAPI.repository.RepositoryStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceStudentImpl implements ServiceStudent{

    @Autowired
    private RepositoryStudent repository;

    @Override
    public Student saveStudent(Student student) {
        student.setId(0);
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
