//package com.example.test_shop.controllers;
//
//import com.example.test_shop.dto.HddDto;
//import com.example.test_shop.dto.MonitorDto;
//import com.example.test_shop.dto.NotebookDto;
//import com.example.test_shop.dto.PcDto;
//import com.example.test_shop.entities.Harddrive;
//import com.example.test_shop.entities.Monitor;
//import com.example.test_shop.entities.Notebook;
//import com.example.test_shop.entities.PersonalComputer;
//import com.example.test_shop.entities.enums.ProductType;
//import com.example.test_shop.services.HddService;
//import com.example.test_shop.services.MonitorService;
//import com.example.test_shop.services.NotebookService;
//import com.example.test_shop.services.PcService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@CrossOrigin("*")
//@RequestMapping("/api/v1/product")
//@RequiredArgsConstructor
//public class ProductController {
//    private final NotebookService notebookService;
//    private final MonitorService monitorService;
//    private final PcService pcService;
//    private final HddService hddService;
//
//    @PostMapping("/pc")
//    public ResponseEntity<String> add(@RequestBody @Validated PcDto dto) {
//        pcService.add(dto);
//        return ResponseEntity.ok("Saved");
//    }
//
//    @PostMapping("/hdd")
//    public ResponseEntity<String> add(@RequestBody HddDto dto) {
//        hddService.add(dto);
//        return ResponseEntity.ok("Saved");
//    }
//
//    @PostMapping("/note")
//    public ResponseEntity<String> add(@RequestBody NotebookDto dto) {
//        notebookService.add(dto);
//        return ResponseEntity.ok("Saved");
//    }
//
//    @PostMapping("/monitor")
//    public ResponseEntity<String> add(@RequestBody MonitorDto dto) {
//        monitorService.add(dto);
//        return ResponseEntity.ok("Saved");
//    }
//
//    @GetMapping
//    public List<?> getAll(ProductType type) {
//        switch (type) {
//            case PC -> {
//                return pcService.getAll();
//            }
//            case HDD -> {
//                return hddService.getAll();
//            }
//            case MONITOR -> {
//                return monitorService.getAll();
//            }
//            case NOTEBOOK -> {
//                return notebookService.getAll();
//            }
//        }
//        return new ArrayList<>();
//    }
//
//    @GetMapping("/pc")
//    public List<PersonalComputer> getAllPc() {
//        return pcService.getAll();
//    }
//
//    @GetMapping("/hdd")
//    public List<Harddrive> getAllHdd() {
//        return hddService.getAll();
//    }
//
//    @GetMapping("/monitor")
//    public List<Monitor> getAllMonitor() {
//        return monitorService.getAll();
//    }
//
//    @GetMapping("/notebook")
//    public List<Notebook> getAllNotebook() {
//        return notebookService.getAll();
//    }
//
//
//    @GetMapping("/pc/{id}")
//    public PersonalComputer getPc(@PathVariable Long id) {
//        return pcService.getById(id);
//    }
//
//    @GetMapping("/hdd/{id}")
//    public Harddrive getHdd(@PathVariable Long id) {
//        return hddService.getById(id);
//    }
//
//    @GetMapping("/monitor/{id}")
//    public Monitor getMonitor(@PathVariable Long id) {
//        return monitorService.getById(id);
//    }
//
//    @GetMapping("/note/{id}")
//    public Notebook getNotebook(@PathVariable Long id) {
//        return notebookService.getById(id);
//    }
//
//    @PutMapping("/pc")
//    public ResponseEntity<String> update(@RequestBody PersonalComputer pc) {
//        pcService.update(pc);
//        return ResponseEntity.ok("Updated");
//    }
//
//    @PutMapping("/hdd")
//    public ResponseEntity<String> update(@RequestBody Harddrive hdd) {
//        hddService.update(hdd);
//        return ResponseEntity.ok("Updated");
//    }
//
//    @PutMapping("/monitor")
//    public ResponseEntity<String> update(@RequestBody Monitor monitor) {
//        monitorService.update(monitor);
//        return ResponseEntity.ok("Updated");
//    }
//
//    @PutMapping("/note")
//    public ResponseEntity<String> update(@RequestBody @Valid Notebook notebook) {
//        notebookService.update(notebook);
//        return ResponseEntity.ok("Updated");
//    }
//
//
//}
