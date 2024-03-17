package com.turkcell.rentacar.business.abstracts;

import com.turkcell.rentacar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();
    Brand getById(int brandId);
    Brand add(Brand brand);
    Brand update(Brand brand);
    void delete(int brandId);
}
