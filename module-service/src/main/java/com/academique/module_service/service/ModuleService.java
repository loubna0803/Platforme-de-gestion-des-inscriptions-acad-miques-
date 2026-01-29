package com.academique.module_service.service;

import com.academique.module_service.model.Module;
import com.academique.module_service.repository.ModuleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// @RequiredArgsConstructor

public class ModuleService {

    private final ModuleRepository repository;

    public ModuleService(ModuleRepository repository) {
        this.repository = repository;
    }
// Récupérer tous les modules
    public List<Module> getAllModules() {
        return repository.findAll();
    }
// Créer un nouveau module
    public Module saveModule(Module module) {
        return repository.save(module);
    }
 // Récupérer un module par son id
    public Module getModuleById(Long id) {
        return repository.findById(id).orElse(null);
    }
 // Récupérer un module par son titre
    public Module getModuleByTitle(String title ) {
        return repository.findByTitle(title).orElse(null);
    }
// Supprimer un module
    public void deleteModule(Long id) {
        repository.deleteById(id);
    }
}
