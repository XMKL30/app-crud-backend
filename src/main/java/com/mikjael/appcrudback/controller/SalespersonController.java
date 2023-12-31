package com.mikjael.appcrudback.controller;

import com.mikjael.appcrudback.model.Salesperson;
import com.mikjael.appcrudback.service.ISalespersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/salesperson")
public class SalespersonController {
    @Autowired
    private ISalespersonService salespersonService;

    @GetMapping
    public List<Salesperson> list() {
        return salespersonService.list();
    }

    @GetMapping("/{id}")
    public Optional<Salesperson> getById(@PathVariable("id") String id) {
        return salespersonService.findById(id);
    }

    @PostMapping
    public void create(@RequestBody Salesperson salesperson) {
        salespersonService.insert(salesperson);
    }

    @PutMapping
    public void update(@RequestBody Salesperson salesperson) {
        salespersonService.update(salesperson);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
        salespersonService.delete(id);
    }

    @GetMapping("/search/name")
    public List<Salesperson> getByName(@RequestParam String name) {
        return salespersonService.listByName(name);
    }

    @GetMapping("search/agent")
    public List<Salesperson> getByAgentName(@RequestParam String agentName) {
        return salespersonService.listByAgentName(agentName);
    }
}
