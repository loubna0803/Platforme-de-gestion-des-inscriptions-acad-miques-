package com.academique.formation_service.service;

import com.academique.formation_service.model.Formation;
import com.academique.formation_service.repository.FormationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormationService {

    private final FormationRepository repository;

    public FormationService(FormationRepository repository) {
        this.repository = repository;
    }

    // Récupérer toutes les formations
    public List<Formation> getAll() {
        return repository.findAll();
    }

    // Récupérer une formation par son ID
    public Optional<Formation> getById(Long id) {
        return repository.findById(id);
    }

    // Créer une nouvelle formation
    public Formation save(Formation formation) {
        return repository.save(formation);
    }

    // Mettre à jour une formation existante
    public Formation update(Long id, Formation formation) {
        return repository.findById(id)
                .map(existing -> {
                    existing.setNom(formation.getNom());
                    existing.setDescription(formation.getDescription());
                    existing.setCapacite(formation.getCapacite());
                    return repository.save(existing);
                })
                .orElseThrow(() -> new RuntimeException("Formation not found with id " + id));
    }

    // Supprimer une formation
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Formation not found with id " + id);
        }
        repository.deleteById(id);
    }
}
