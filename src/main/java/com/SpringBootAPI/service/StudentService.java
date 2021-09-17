package com.SpringBootAPI.service;

import com.SpringBootAPI.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudent();
    public Student getStudentById(Long studentId);
    public void deleteById(Long studentId);
    public Student updateStudent(Student student);
}
