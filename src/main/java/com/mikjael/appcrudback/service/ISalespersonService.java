package com.mikjael.appcrudback.service;

import com.mikjael.appcrudback.model.Salesperson;

import java.util.List;

public interface ISalespersonService {
    public void insert(Salesperson salesperson);
    public List<Salesperson> list();
    public void delete(String id);
    List<Salesperson> findByName(String name);
}
