package com.example.bus_tracking.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.bus_tracking.entity.Driver;
import com.example.bus_tracking.service.DriverService;

@RestController
@RequestMapping("/driver-management")
@CrossOrigin("*")
public class DriverController {

    private final DriverService service;

    public DriverController(DriverService service) {
        this.service = service;
    }

    @GetMapping
    public List<Driver> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Driver get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public Driver save(@RequestBody Driver driver) {
        return service.save(driver);
    }

    @PutMapping("/{id}")
    public Driver update(@PathVariable Long id,
                         @RequestBody Driver driver) {
        return service.update(id, driver);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}