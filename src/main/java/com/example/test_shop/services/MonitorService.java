package com.example.test_shop.services;

import com.example.test_shop.dto.MonitorDto;
import com.example.test_shop.entities.Monitor;
import com.example.test_shop.entities.Product;
import com.example.test_shop.exceptions.ProductException;
import com.example.test_shop.repositories.MonitorRepository;
import com.example.test_shop.utilities.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MonitorService {
    private final MonitorRepository repository;
    public Monitor getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ProductException("Not Found"));
    }

    public List<Monitor> getAll() {
        return repository.findAll();
    }

    public void add(MonitorDto dto) {
        Product product = Mapper.map(dto);
        Monitor monitor = new Monitor(product, dto.getSize());

        repository.save(monitor);
    }

    public void update(Monitor monitor) {
        if (repository.findById(monitor.getId()).isEmpty()) {
            throw new ProductException("Not found");
        }

        repository.save(monitor);
    }
}
