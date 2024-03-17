package com.turkcell.rentacar.api.controllers;

import com.turkcell.rentacar.business.abstracts.TransmissionService;
import com.turkcell.rentacar.entities.concretes.Transmission;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/transmissions")
public class TransmissionController {
    private final TransmissionService transmissionService;

    @GetMapping
    public List<Transmission> getAll() {
        return transmissionService.getAll();
    }

    @GetMapping("/{transmissionId}")
    public Transmission getById(@PathVariable int transmissionId) {
        return transmissionService.getById(transmissionId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Transmission add(@RequestBody Transmission transmission) {
        return transmissionService.add(transmission);
    }

    @PutMapping("/{transmissionId}")
    public Transmission update(@PathVariable int transmissionId, @RequestBody Transmission transmission) {
        transmission.setId(transmissionId);
        return transmissionService.update(transmission);
    }

    @DeleteMapping("/{transmissionId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int transmissionId) {
        transmissionService.delete(transmissionId);
    }
}
