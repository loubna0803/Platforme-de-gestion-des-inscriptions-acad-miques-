package com.academique.inscription_service.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "inscriptions")
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long studentId;
    private Long moduleId;
    private Long formationId;

    private LocalDate dateInscription;

    @Enumerated(EnumType.STRING)
    private StatusInscription status;

    public Inscription() {}

    public Inscription(Long studentId, Long moduleId, Long formationId) {
        this.studentId = studentId;
        this.moduleId = moduleId;
        this.formationId = formationId;
        this.dateInscription = LocalDate.now();
        this.status = StatusInscription.VALIDEE;
    }

    public Long getId() { return id; }
    public Long getStudentId() { return studentId; }
    public Long getModuleId() { return moduleId; }
    public Long getFormationId() { return formationId; }
    public LocalDate getDateInscription() { return dateInscription; }
    public StatusInscription getStatus() { return status; }

    public void setStatus(StatusInscription status) { this.status = status; }
}
