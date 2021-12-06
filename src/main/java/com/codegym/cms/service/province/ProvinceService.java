package com.codegym.cms.service.province;

import com.codegym.cms.model.Province;
import com.codegym.cms.repository.IProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProvinceService implements IProvinceService{

    @Autowired
    private IProvinceRepository repository;

    @Override
    public Iterable<Province> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Province> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Province save(Province province) {
        return repository.save(province);
    }

    @Override
    public void remove(Long id) {
         repository.deleteById(id);
    }
}
