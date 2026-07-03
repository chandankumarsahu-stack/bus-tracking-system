package com.example.bus_tracking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bus_tracking.entity.Route;
import com.example.bus_tracking.repository.RouteRepository;

@Service
public class RouteService {

    private final RouteRepository repository;

    public RouteService(RouteRepository repository){

        this.repository=repository;

    }

    public List<Route> getAll(){

        return repository.findAll();

    }

    public Route get(Long id){

        return repository.findById(id).orElseThrow();

    }

    public Route save(Route route){

        return repository.save(route);

    }

    public Route update(Long id,Route route){

        Route r=repository.findById(id).orElseThrow();

        r.setRouteName(route.getRouteName());
        r.setSource(route.getSource());
        r.setDestination(route.getDestination());
        r.setDistance(route.getDistance());
        r.setEstimatedTime(route.getEstimatedTime());
        r.setBus(route.getBus());

        return repository.save(r);

    }

    public void delete(Long id){

        repository.deleteById(id);

    }

}