package com.turkcell.rentacar.api.controllers;


import com.turkcell.rentacar.business.abstracts.BrandService;
import com.turkcell.rentacar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/brands")
public class BrandsController {
    private BrandService brandService;

    @GetMapping
    public List<Brand> getAll() {
        return brandService.getAll();
    }

    @GetMapping("/{brandId}")
    public Brand getById(@PathVariable int brandId) {
        return brandService.getById(brandId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Brand add (@RequestBody Brand brand){
        return brandService.add(brand);
    }

    @PutMapping("/{brandId}")
    public Brand update(@PathVariable int brandId, @RequestBody Brand brand) {
        brand.setId(brandId);
        return brandService.update(brand);
    }
    
    @DeleteMapping("/{brandId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int brandId) {
        brandService.delete(brandId);
    }
}
