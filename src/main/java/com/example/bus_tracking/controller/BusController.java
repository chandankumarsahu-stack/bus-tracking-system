package com.example.bus_tracking.controller;

import com.example.bus_tracking.entity.Bus;
import com.example.bus_tracking.service.BusService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bus")
@CrossOrigin("*")
public class BusController {

    private final BusService service;

    public BusController(BusService service) {
        this.service = service;
    }

    @GetMapping
    public List<Bus> getAll() {
        return service.getAllBuses();
    }

    @GetMapping("/{id}")
    public Bus get(@PathVariable Long id) {
        return service.getBus(id);
    }

    @PostMapping
    public Bus save(@RequestBody Bus bus) {
        return service.saveBus(bus);
    }

    @PutMapping("/{id}")
    public Bus update(@PathVariable Long id,
                      @RequestBody Bus bus) {
        return service.updateBus(id, bus);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteBus(id);
    }

}