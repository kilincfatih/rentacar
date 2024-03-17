package com.turkcell.rentacar.business.concretes;

import com.turkcell.rentacar.business.abstracts.BrandService;
import com.turkcell.rentacar.dataAccess.abstracts.BrandRepository;
import com.turkcell.rentacar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {

    //getAll Brands
    @Override
    public List<Brand> getAll() {
        return brandRepository.findAll();
    }

    //getById Brands
    @Override
    public Brand getById(int brandId) {
        return brandRepository.findById(brandId)
                .orElseThrow(() -> new RuntimeException("Brand not found: " + brandId));
    }

    //add brand
    private BrandRepository brandRepository;
    @Override
    public Brand add(Brand brand){
        Brand createBrand = brandRepository.save(brand);
        return createBrand;
    }

    //update brand
    @Override
    public Brand update(Brand brand) {
        return brandRepository.save(brand);
    }

    //delete brand
    @Override
    public void delete(int brandId) {
        brandRepository.deleteById(brandId);
    }


}
