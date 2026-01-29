package com.academique.module_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private String title;
    private Boolean hours;
    private int maxStudents;

    public Module() {}

    public Module(String code, String title, Boolean hours, int maxStudents) {
        this.code = code;
        this.title = title;
        this.hours = hours;
        this.maxStudents = maxStudents;
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public Boolean getHours() { return hours; }
    public void setHours(Boolean hours) { this.hours = hours; }
    public int getMaxStudents() { return maxStudents; }
    public void setMaxStudents(int maxStudents) { this.maxStudents = maxStudents; }
}
