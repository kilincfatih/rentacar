package com.turkcell.rentacar.business.concretes;

import com.turkcell.rentacar.business.abstracts.TransmissionService;
import com.turkcell.rentacar.dataAccess.abstracts.TransmissionRepository;
import com.turkcell.rentacar.entities.concretes.Transmission;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TransmissionManager implements TransmissionService {
    private final TransmissionRepository transmissionRepository;

    //getAll Transmissions
    @Override
    public List<Transmission> getAll() {
        return transmissionRepository.findAll();
    }

    //getById Transmissions
    @Override
    public Transmission getById(int transmissionId) {
        return transmissionRepository.findById(transmissionId)
                .orElseThrow(() -> new RuntimeException("Transmission not found: " + transmissionId));
    }

    //add Transmission
    @Override
    public Transmission add(Transmission transmission) {
        return transmissionRepository.save(transmission);
    }

    //update Transmission
    @Override
    public Transmission update(Transmission transmission) {
        return transmissionRepository.save(transmission);
    }

    //delete Transmission
    @Override
    public void delete(int transmissionId) {
        transmissionRepository.deleteById(transmissionId);
    }


}
