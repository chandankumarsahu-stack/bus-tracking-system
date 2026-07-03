package com.example.bus_tracking.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.bus_tracking.entity.Student;
import com.example.bus_tracking.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Student get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public Student save(@RequestBody Student student) {
        return service.save(student);
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable Long id,
                          @RequestBody Student student) {
        return service.update(id, student);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}