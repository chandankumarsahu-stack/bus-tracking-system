package com.example.bus_tracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bus_tracking.entity.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {

}