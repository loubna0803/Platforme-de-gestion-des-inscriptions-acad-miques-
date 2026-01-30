package com.example.studentservice.service;

import java.util.List;
import com.example.studentservice.entity.Student;

public interface StudentService {
    List<Student> findAll();
Student findById(Long id);
Student save(Student student);
Student update(Long id, Student student);
void delete(Long id);
List<Student> findByNomContaining(String nom);

}
