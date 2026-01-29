package com.academique.formation_service.controller;

import com.academique.formation_service.model.Formation;
import com.academique.formation_service.service.FormationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formations")
public class FormationController {

    private final FormationService service;

    public FormationController(FormationService service) {
        this.service = service;
    }

    @GetMapping
    public List<Formation> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Formation save(@RequestBody Formation formation) {
        return service.save(formation);
    }
}
