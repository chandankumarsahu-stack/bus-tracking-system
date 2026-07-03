package com.example.bus_tracking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bus_tracking.entity.Driver;
import com.example.bus_tracking.repository.DriverRepository;

@Service
public class DriverService {

    private final DriverRepository repository;

    public DriverService(DriverRepository repository) {
        this.repository = repository;
    }

    public List<Driver> getAll() {
        return repository.findAll();
    }

    public Driver get(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Driver save(Driver driver) {
        return repository.save(driver);
    }

    public Driver update(Long id, Driver driver) {

        Driver d = repository.findById(id).orElseThrow();

        d.setDriverName(driver.getDriverName());
        d.setPhone(driver.getPhone());
        d.setLicenseNumber(driver.getLicenseNumber());
        d.setAddress(driver.getAddress());
        d.setStatus(driver.getStatus());

        return repository.save(d);

    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}