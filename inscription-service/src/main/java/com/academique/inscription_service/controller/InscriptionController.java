package com.academique.inscription_service.controller;

import com.academique.inscription_service.model.Inscription;
import com.academique.inscription_service.service.InscriptionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inscriptions")
public class InscriptionController {

    private final InscriptionService service;

    public InscriptionController(InscriptionService service) {
        this.service = service;
    }

    @PostMapping
    public Inscription inscrire(@RequestParam Long studentId,
                                @RequestParam Long moduleId,
                                @RequestParam Long formationId) {
        return service.inscrire(studentId, moduleId, formationId);
    }
}
