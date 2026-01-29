package com.example.studentservice.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.studentservice.entity.Student;
import com.example.studentservice.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student save(Student student) {
        return repository.save(student);
    }

    @Override
    public List<Student> findAll() {
        return repository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
