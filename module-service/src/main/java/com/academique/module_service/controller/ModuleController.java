package com.academique.module_service.controller;

import com.academique.module_service.model.Module;
import com.academique.module_service.service.ModuleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/modules")
// @RequiredArgsConstructor

public class ModuleController {

    private final ModuleService service;

    public ModuleController(ModuleService service) {
        this.service = service;
    }
// GET http://localhost:8082/modules
    @GetMapping
    public List<Module> getAllModules() {
        return service.getAllModules();
    }
// POST http://localhost:8082/modules
    @PostMapping
    public Module saveModule(@RequestBody Module module) {
        return service.saveModule(module);
    }
// GET http://localhost:8082/modules/{id}
    @GetMapping("/{id}")
    public Module getModuleById(@PathVariable Long id) {
        return service.getModuleById(id);
    }
// GET http://localhost:8082/modules/{title}
    @GetMapping("/title/{title}")
    public Module getModuleByTitle(@PathVariable String title) {
    return service.getModuleByTitle(title);
}
// DELETE http://localhost:8082/modules/{id}
    @DeleteMapping("/{id}")
    public void deleteModule(@PathVariable Long id) {
        service.deleteModule(id);
    }
}
