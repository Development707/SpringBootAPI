package com.SpringBootAPI.repository;

import com.SpringBootAPI.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
