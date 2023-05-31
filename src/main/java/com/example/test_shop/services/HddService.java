package com.example.test_shop.services;

import com.example.test_shop.dto.HddDto;
import com.example.test_shop.entities.Harddrive;
import com.example.test_shop.entities.Product;
import com.example.test_shop.exceptions.ProductException;
import com.example.test_shop.repositories.HarddriveRepository;
import com.example.test_shop.utilities.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HddService {
    private final HarddriveRepository repository;
    public Harddrive getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ProductException("Not Found"));
    }

    public List<Harddrive> getAll() {
        return repository.findAll();
    }

    public void add(HddDto dto) {
        Product product = Mapper.map(dto);
        Harddrive hdd = new Harddrive(product, dto.getSize());

        repository.save(hdd);
    }

    public void update(Harddrive hdd) {
        if (repository.findById(hdd.getId()).isEmpty()) {
            throw new ProductException("Not found");
        }

        repository.save(hdd);
    }
}
