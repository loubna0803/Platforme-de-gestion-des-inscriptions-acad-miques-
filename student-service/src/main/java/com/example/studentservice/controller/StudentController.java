package com.example.studentservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.studentservice.entity.Student;
import com.example.studentservice.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    // Créer un étudiant
    @PostMapping
    public Student create(@RequestBody Student student) {
        return service.save(student);
    }

    // Lister tous les étudiants
    @GetMapping
    public List<Student> getAll() {
        return service.findAll();
    }

    // Chercher un étudiant par ID
    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id) {
        return service.findById(id);
    }

    // Mettre à jour un étudiant
    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student student) {
        return service.update(id, student);
    }

    // Supprimer un étudiant
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    // Rechercher des étudiants par nom (optionnel)
    @GetMapping("/search")
    public List<Student> searchByName(@RequestParam String nom) {
        return service.findByNameContaining(nom);
    }
}
