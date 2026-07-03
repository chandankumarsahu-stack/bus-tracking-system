package com.example.bus_tracking.repository;

import com.example.bus_tracking.entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus, Long> {

}