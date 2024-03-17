package com.turkcell.rentacar.business.concretes;

import com.turkcell.rentacar.business.abstracts.FuelService;
import com.turkcell.rentacar.dataAccess.abstracts.FuelRepository;
import com.turkcell.rentacar.entities.concretes.Fuel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FuelManager implements FuelService {
    private final FuelRepository fuelRepository;

    //getAll Fuels
    @Override
    public List<Fuel> getAll() {
        return fuelRepository.findAll();
    }

    //getById Fuels
    @Override
    public Fuel getById(int fuelId) {
        return fuelRepository.findById(fuelId)
                .orElseThrow(() -> new RuntimeException("Fuel not found: " + fuelId));
    }

    //add Fuel
    @Override
    public Fuel add(Fuel fuel) {
        return fuelRepository.save(fuel);
    }

    //update Fuel
    @Override
    public Fuel update(Fuel fuel) {
        return fuelRepository.save(fuel);
    }

    //delete Fuel
    @Override
    public void delete(int fuelId) {
        fuelRepository.deleteById(fuelId);
    }


}
