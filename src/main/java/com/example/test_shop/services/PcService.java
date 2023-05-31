package com.example.test_shop.services;

import com.example.test_shop.dto.PcDto;
import com.example.test_shop.entities.PersonalComputer;
import com.example.test_shop.entities.Product;
import com.example.test_shop.exceptions.ProductException;
import com.example.test_shop.repositories.PersonalComputerRepository;
import com.example.test_shop.utilities.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PcService {
    private final PersonalComputerRepository repository;

    public PersonalComputer getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ProductException("Not Found"));
    }

    public List<PersonalComputer> getAll() {
        return repository.findAll();
    }

    public void add(PcDto dto) {
        Product product = Mapper.map(dto);
        PersonalComputer pc = new PersonalComputer(product, dto.getFormFactor());
        repository.save(pc);
    }

    public void update(PersonalComputer pc) {
        if (repository.findById(pc.getId()).isEmpty()) {
            throw new ProductException("Not found");
        }

        repository.save(pc);
    }
}
