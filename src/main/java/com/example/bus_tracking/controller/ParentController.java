package com.example.bus_tracking.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.bus_tracking.entity.Parent;
import com.example.bus_tracking.service.ParentService;

@RestController
@RequestMapping("/parent")
@CrossOrigin(origins="*")
public class ParentController {

    private final ParentService service;

    public ParentController(ParentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Parent> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Parent get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public Parent save(@RequestBody Parent parent) {
        return service.save(parent);
    }

    @PutMapping("/{id}")
    public Parent update(@PathVariable Long id,
                         @RequestBody Parent parent) {
        return service.update(id, parent);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}