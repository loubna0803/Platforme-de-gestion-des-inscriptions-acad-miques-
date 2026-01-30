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
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    @Override
public Student update(Long id, Student student) {
    Student existing = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Student not found"));
    existing.setNom(student.getNom());
    existing.setPrenom(student.getPrenom());
    existing.setEmail(student.getEmail());
    existing.setNiveau(student.getNiveau());
    return repository.save(existing);
}


    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
public List<Student> findByNomContaining(String nom) {
    return repository.findByNomContainingIgnoreCase(nom);
}

}
