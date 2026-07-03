package com.example.bus_tracking.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.bus_tracking.entity.Route;
import com.example.bus_tracking.service.RouteService;

@RestController
@RequestMapping("/route")
@CrossOrigin(origins="*")
public class RouteController {

    private final RouteService service;

    public RouteController(RouteService service){

        this.service=service;

    }

    @GetMapping
    public List<Route> getAll(){

        return service.getAll();

    }

    @GetMapping("/{id}")
    public Route get(@PathVariable Long id){

        return service.get(id);

    }

    @PostMapping
    public Route save(@RequestBody Route route){

        return service.save(route);

    }

    @PutMapping("/{id}")
    public Route update(@PathVariable Long id,
                        @RequestBody Route route){

        return service.update(id,route);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){

        service.delete(id);

    }

}