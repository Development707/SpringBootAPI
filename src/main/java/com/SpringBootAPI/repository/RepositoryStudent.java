package com.SpringBootAPI.repository;

import com.SpringBootAPI.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryStudent extends CrudRepository<Student, Long> {
}
