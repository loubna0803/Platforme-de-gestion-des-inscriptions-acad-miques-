package com.academique.formation_service.service;

import com.academique.formation_service.model.Formation;
import com.academique.formation_service.repository.FormationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormationService {

    private final FormationRepository repository;

    public FormationService(FormationRepository repository) {
        this.repository = repository;
    }

    public List<Formation> getAll() {
        return repository.findAll();
    }

    public Formation save(Formation formation) {
        return repository.save(formation);
    }
}
