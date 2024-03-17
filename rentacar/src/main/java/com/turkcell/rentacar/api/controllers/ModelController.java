package com.turkcell.rentacar.api.controllers;

import com.turkcell.rentacar.business.abstracts.ModelService;
import com.turkcell.rentacar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/models")
public class ModelController {
    private final ModelService modelService;

    @GetMapping
    public List<Model> getAll() {
        return modelService.getAll();
    }

    @GetMapping("/{modelId}")
    public Model getById(@PathVariable int modelId) {
        return modelService.getById(modelId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Model add(@RequestBody Model model) {
        return modelService.add(model);
    }

    @PutMapping("/{modelId}")
    public Model update(@PathVariable int modelId, @RequestBody Model model) {
        model.setId(modelId);
        return modelService.update(model);
    }

    @DeleteMapping("/{modelId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int modelId) {
        modelService.delete(modelId);
    }
}
