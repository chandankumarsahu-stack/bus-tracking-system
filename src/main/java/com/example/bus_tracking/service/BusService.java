package com.example.bus_tracking.service;

import com.example.bus_tracking.entity.Bus;
import com.example.bus_tracking.repository.BusRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService {

    private final BusRepository repository;

    public BusService(BusRepository repository) {
        this.repository = repository;
    }

    public List<Bus> getAllBuses() {
        return repository.findAll();
    }

    public Bus getBus(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Bus saveBus(Bus bus) {
        return repository.save(bus);
    }

    public Bus updateBus(Long id, Bus bus) {
        Bus existing = repository.findById(id).orElseThrow();

        existing.setBusNumber(bus.getBusNumber());
        existing.setBusName(bus.getBusName());
        existing.setCapacity(bus.getCapacity());
        existing.setStatus(bus.getStatus());

        return repository.save(existing);
    }

    public void deleteBus(Long id) {
        repository.deleteById(id);
    }

}