package com.academique.formation_service.controller;

import com.academique.formation_service.model.Formation;
import com.academique.formation_service.service.FormationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formations")
public class FormationController {

    private final FormationService service;

    public FormationController(FormationService service) {
        this.service = service;
    }

    // GET : toutes les formations
    @GetMapping
    public List<Formation> getAll() {
        return service.getAll();
    }

    // GET : une formation par ID
    @GetMapping("/{id}")
    public ResponseEntity<Formation> getById(@PathVariable Long id) {
        return service.getById(id)
                      .map(ResponseEntity::ok)
                      .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // POST : ajouter une formation
    @PostMapping
    public Formation save(@RequestBody Formation formation) {
        return service.save(formation);
    }

    // PUT : mettre à jour une formation
    @PutMapping("/{id}")
    public ResponseEntity<Formation> update(@PathVariable Long id, @RequestBody Formation formation) {
        try {
            Formation updated = service.update(id, formation);
            return ResponseEntity.ok(updated);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // DELETE : supprimer une formation
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        try {
            service.delete(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
