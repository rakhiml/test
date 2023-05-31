package com.example.test_shop.controllers;

import com.example.test_shop.dto.PcDto;
import com.example.test_shop.entities.PersonalComputer;
import com.example.test_shop.services.PcService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/product/pc")
@RequiredArgsConstructor
public class PcController {
    private final PcService pcService;

    @PostMapping
    public ResponseEntity<String> add(@RequestBody @Validated PcDto dto) {
        pcService.add(dto);
        return ResponseEntity.ok("Saved");
    }

    @GetMapping
    public List<PersonalComputer> getAllPc() {
        return pcService.getAll();
    }

    @GetMapping("/{id}")
    public PersonalComputer getPc(@PathVariable Long id) {
        return pcService.getById(id);
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody PersonalComputer pc) {
        pcService.update(pc);
        return ResponseEntity.ok("Updated");
    }

}
