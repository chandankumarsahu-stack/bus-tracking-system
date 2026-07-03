package com.example.bus_tracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bus_tracking.entity.Parent;

public interface ParentRepository extends JpaRepository<Parent, Long> {

}