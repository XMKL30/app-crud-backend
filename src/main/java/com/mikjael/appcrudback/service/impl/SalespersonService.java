package com.mikjael.appcrudback.service.impl;

import com.mikjael.appcrudback.model.Salesperson;
import com.mikjael.appcrudback.repository.ISalespersonRepository;
import com.mikjael.appcrudback.service.ISalespersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalespersonService implements ISalespersonService {
    @Autowired
    private ISalespersonRepository salespersonRepository;
    @Override
    public void insert(Salesperson salesperson) {
        salespersonRepository.save(salesperson);
    }

    @Override
    public List<Salesperson> list() {
        return salespersonRepository.findAll();
    }

    @Override
    public void delete(String id) {
        salespersonRepository.deleteById(id);
    }

    @Override
    public List<Salesperson> findByName(String name) {
        return salespersonRepository.findByName(name);
    }
}