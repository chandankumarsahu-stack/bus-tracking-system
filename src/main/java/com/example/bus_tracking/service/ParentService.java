package com.example.bus_tracking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bus_tracking.entity.Parent;
import com.example.bus_tracking.repository.ParentRepository;

@Service
public class ParentService {

    private final ParentRepository repository;

    public ParentService(ParentRepository repository) {
        this.repository = repository;
    }

    public List<Parent> getAll() {
        return repository.findAll();
    }

    public Parent get(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Parent save(Parent parent) {
        return repository.save(parent);
    }

    public Parent update(Long id, Parent parent) {

        Parent p = repository.findById(id).orElseThrow();

        p.setStudentName(parent.getStudentName());
        p.setEmail(parent.getEmail());
        p.setPhone(parent.getPhone());
        p.setAddress(parent.getAddress());

        return repository.save(p);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}