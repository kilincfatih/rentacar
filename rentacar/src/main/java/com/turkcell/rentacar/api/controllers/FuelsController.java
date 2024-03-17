package com.turkcell.rentacar.api.controllers;

import com.turkcell.rentacar.business.abstracts.FuelService;
import com.turkcell.rentacar.entities.concretes.Fuel;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/fuels")
public class FuelsController {
    private final FuelService fuelService;
    @GetMapping
    public List<Fuel> getAll() {
        return fuelService.getAll();
    }

    @GetMapping("/{fuelId}")
    public Fuel getById(@PathVariable int fuelId) {
        return fuelService.getById(fuelId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Fuel add(@RequestBody Fuel fuel) {
        return fuelService.add(fuel);
    }

    @PutMapping("/{fuelId}")
    public Fuel update(@PathVariable int fuelId, @RequestBody Fuel fuel) {
        fuel.setId(fuelId);
        return fuelService.update(fuel);
    }

    @DeleteMapping("/{fuelId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int fuelId) {
        fuelService.delete(fuelId);
    }
}
