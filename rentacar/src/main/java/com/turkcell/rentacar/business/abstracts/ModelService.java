package com.turkcell.rentacar.business.abstracts;

import com.turkcell.rentacar.entities.concretes.Model;

import java.util.List;

public interface ModelService {
    List<Model> getAll();
    Model getById(int modelId);
    Model add(Model model);
    Model update(Model model);
    void delete(int modelId);
}
