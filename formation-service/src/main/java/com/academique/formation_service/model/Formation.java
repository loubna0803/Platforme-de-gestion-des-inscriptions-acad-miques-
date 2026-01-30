package com.academique.formation_service.model;

import jakarta.persistence.*;

@Entity
public class Formation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer capacite;
    private String description;
    private String nom;

    // ✅ Assure-toi que tu as les getters
    public Long getId() { return id; }
    public Integer getCapacite() { return capacite; }
    public String getDescription() { return description; }
    public String getNom() { return nom; }

    // Optional : setters si tu veux POST/PUT
    public void setId(Long id) { this.id = id; }
    public void setCapacite(Integer capacite) { this.capacite = capacite; }
    public void setDescription(String description) { this.description = description; }
    public void setNom(String nom) { this.nom = nom; }
}

