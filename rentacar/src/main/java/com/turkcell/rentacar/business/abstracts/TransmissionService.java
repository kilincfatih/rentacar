package com.turkcell.rentacar.business.abstracts;

import com.turkcell.rentacar.entities.concretes.Transmission;

import java.util.List;

public interface TransmissionService {
    List<Transmission> getAll();
    Transmission getById(int transmissionId);
    Transmission add(Transmission transmission);
    Transmission update(Transmission transmission);
    void delete(int transmissionId);
}
