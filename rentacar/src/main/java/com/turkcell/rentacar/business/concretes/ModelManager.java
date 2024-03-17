package com.turkcell.rentacar.business.concretes;

import com.turkcell.rentacar.business.abstracts.ModelService;
import com.turkcell.rentacar.dataAccess.abstracts.ModelRepository;
import com.turkcell.rentacar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService {
    private final ModelRepository modelRepository;

    //getAll Models
    @Override
    public List<Model> getAll() {
        return modelRepository.findAll();
    }

    //getById Models
    @Override
    public Model getById(int modelId) {
        return modelRepository.findById(modelId)
                .orElseThrow(() -> new RuntimeException("Model not found: " + modelId));
    }

    //add Model
    @Override
    public Model add(Model model) {
        return modelRepository.save(model);
    }

    //update Model
    @Override
    public Model update(Model model) {
        return modelRepository.save(model);
    }

    //delete Model
    @Override
    public void delete(int modelId) {
        modelRepository.deleteById(modelId);
    }


}
