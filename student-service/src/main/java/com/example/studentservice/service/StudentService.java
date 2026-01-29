package com.example.studentservice.service;

import java.util.List;
import com.example.studentservice.entity.Student;

public interface StudentService {
    Student save(Student student);
    List<Student> findAll();
    Student findById(Long id);
}
