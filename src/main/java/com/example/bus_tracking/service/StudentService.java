package com.example.bus_tracking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bus_tracking.entity.Student;
import com.example.bus_tracking.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getAll() {
        return repository.findAll();
    }

    public Student get(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Student save(Student student) {
        return repository.save(student);
    }

    public Student update(Long id, Student student) {

        Student s = repository.findById(id).orElseThrow();

        s.setStudentName(student.getStudentName());
        s.setRollNumber(student.getRollNumber());
        s.setClassName(student.getClassName());
        s.setSection(student.getSection());
        s.setParentName(student.getParentName());
        s.setPhone(student.getPhone());
        s.setBusId(student.getBusId());
        s.setAddress(student.getAddress());
        s.setStatus(student.getStatus());

        return repository.save(s);

    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}