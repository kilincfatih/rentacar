package com.turkcell.rentacar.business.abstracts;

import com.turkcell.rentacar.entities.concretes.Fuel;

import java.util.List;

public interface FuelService {
    List<Fuel> getAll();
    Fuel getById(int fuelId);
    Fuel add(Fuel fuel);
    Fuel update(Fuel fuel);
    void delete(int fuelId);
}
