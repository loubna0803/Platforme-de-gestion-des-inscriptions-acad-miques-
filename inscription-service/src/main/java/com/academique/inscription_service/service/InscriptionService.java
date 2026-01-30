package com.academique.inscription_service.service;

import com.academique.inscription_service.client.ModuleClient;
import com.academique.inscription_service.client.StudentClient;
import com.academique.inscription_service.model.Inscription;
import com.academique.inscription_service.model.StatusInscription;
import com.academique.inscription_service.repository.InscriptionRepository;
import org.springframework.stereotype.Service;

@Service
public class InscriptionService {

    private final InscriptionRepository repository;
    private final StudentClient studentClient;
    private final ModuleClient moduleClient;

    public InscriptionService(InscriptionRepository repository,
                              StudentClient studentClient,
                              ModuleClient moduleClient) {
        this.repository = repository;
        this.studentClient = studentClient;
        this.moduleClient = moduleClient;
    }

    public Inscription inscrire(Long studentId, Long moduleId, Long formationId) {

        if (studentClient.getStudent(studentId) == null) {
            throw new RuntimeException("STUDENT_SERVICE_UNAVAILABLE");
        }

        if (moduleClient.getModule(moduleId) == null) {
            throw new RuntimeException("MODULE_SERVICE_UNAVAILABLE");
        }

        Inscription inscription = new Inscription(studentId, moduleId, formationId);
        inscription.setStatus(StatusInscription.VALIDEE);

        return repository.save(inscription);
    }
}
