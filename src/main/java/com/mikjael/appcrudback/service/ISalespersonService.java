package com.mikjael.appcrudback.service;

import com.mikjael.appcrudback.model.Salesperson;

import java.util.List;
import java.util.Optional;

public interface ISalespersonService {
    public void insert(Salesperson salesperson);
    public List<Salesperson> list();
    public void update(Salesperson salesperson);
    public void delete(String id);
    public Optional<Salesperson> findById(String id);
    List<Salesperson> listByName(String name);
    List<Salesperson> listByAgentName(String agentName);
}
