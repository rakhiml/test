package com.example.test_shop.controllers;

import com.example.test_shop.dto.NotebookDto;
import com.example.test_shop.entities.Notebook;
import com.example.test_shop.services.NotebookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/product/note")
@RequiredArgsConstructor
public class NotebookController {
    private final NotebookService notebookService;

    @PostMapping
    public ResponseEntity<String> add(@RequestBody NotebookDto dto) {
        notebookService.add(dto);
        return ResponseEntity.ok("Saved");
    }

    @GetMapping
    public List<Notebook> getAllNotebook() {
        return notebookService.getAll();
    }

    @GetMapping("/{id}")
    public Notebook getNotebook(@PathVariable Long id) {
        return notebookService.getById(id);
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody @Valid Notebook notebook) {
        notebookService.update(notebook);
        return ResponseEntity.ok("Updated");
    }

}
