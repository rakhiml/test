package com.example.test_shop.controllers;

import com.example.test_shop.dto.MonitorDto;
import com.example.test_shop.entities.Monitor;
import com.example.test_shop.services.MonitorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/product/monitor")
@RequiredArgsConstructor
public class MonitorController {
    private final MonitorService monitorService;

    @PostMapping
    public ResponseEntity<String> add(@RequestBody MonitorDto dto) {
        monitorService.add(dto);
        return ResponseEntity.ok("Saved");
    }

    @GetMapping
    public List<Monitor> getAllMonitor() {
        return monitorService.getAll();
    }

    @GetMapping("/{id}")
    public Monitor getMonitor(@PathVariable Long id) {
        return monitorService.getById(id);
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody Monitor monitor) {
        monitorService.update(monitor);
        return ResponseEntity.ok("Updated");
    }
}
