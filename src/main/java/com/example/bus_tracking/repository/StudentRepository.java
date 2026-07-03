package com.example.bus_tracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bus_tracking.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}