package com.mikjael.appcrudback.controller;

import com.mikjael.appcrudback.model.Salesperson;
import com.mikjael.appcrudback.service.ISalespersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
}
