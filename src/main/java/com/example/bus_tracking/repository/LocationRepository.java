package com.example.bus_tracking.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bus_tracking.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

    Location findTopByBusIdOrderByUpdatedAtDesc(Long busId);

    List<Location> findAll();
}