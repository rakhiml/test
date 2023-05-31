package com.example.test_shop.services;

import com.example.test_shop.dto.NotebookDto;
import com.example.test_shop.entities.Notebook;
import com.example.test_shop.entities.Product;
import com.example.test_shop.exceptions.ProductException;
import com.example.test_shop.repositories.NotebookRepository;
import com.example.test_shop.utilities.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NotebookService {
    private final NotebookRepository repository;

    public Notebook getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ProductException("Not Found"));
    }

    public List<Notebook> getAll() {
        return repository.findAll();
    }

    public void add(NotebookDto dto) {
        Product product = Mapper.map(dto);
        Notebook note = new Notebook(product,dto.getSize());
        repository.save(note);
    }

    public void update(Notebook notebook) {
        if (repository.findById(notebook.getId()).isEmpty()) {
            throw new ProductException("Not found");
        }

        repository.save(notebook);
    }
}
