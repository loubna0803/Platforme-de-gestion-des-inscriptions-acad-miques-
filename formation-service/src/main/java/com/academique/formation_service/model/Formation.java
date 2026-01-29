package com.academique.formation_service.model;

import jakarta.persistence.*;

@Entity
public class Formation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String description;
    private int capacite;

    // getters et setters
}
