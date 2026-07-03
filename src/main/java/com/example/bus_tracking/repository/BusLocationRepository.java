package com.example.bus_tracking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bus_tracking.entity.BusLocation;

public interface BusLocationRepository extends JpaRepository<BusLocation, Long>{

    Optional<BusLocation> findTopByBusIdOrderByLocationTimeDesc(Long busId);

}