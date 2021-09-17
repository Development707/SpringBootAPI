package com.SpringBootAPI.DTO;

import com.SpringBootAPI.entity.Student;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class StudentDTO {

    private String firstName, lastName, email;

    public StudentDTO(Student student) {
        this.firstName = student.getFirstName();
        this.lastName = student.getLastName();
        this.email = student.getEmail();
    }
}
