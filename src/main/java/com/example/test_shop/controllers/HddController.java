package com.example.test_shop.controllers;

import com.example.test_shop.dto.HddDto;
import com.example.test_shop.entities.Harddrive;
import com.example.test_shop.services.HddService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/product/hdd")
@RequiredArgsConstructor
public class HddController {
    private final HddService hddService;

    @PostMapping
    public ResponseEntity<String> add(@RequestBody HddDto dto) {
        hddService.add(dto);
        return ResponseEntity.ok("Saved");
    }

    @GetMapping
    public List<Harddrive> getAllHdd() {
        return hddService.getAll();
    }

    @GetMapping("/{id}")
    public Harddrive getHdd(@PathVariable Long id) {
        return hddService.getById(id);
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody Harddrive hdd) {
        hddService.update(hdd);
        return ResponseEntity.ok("Updated");
    }
}
