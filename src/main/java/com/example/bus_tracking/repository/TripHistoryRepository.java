package com.example.bus_tracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bus_tracking.entity.TripHistory;

public interface TripHistoryRepository extends JpaRepository<TripHistory, Long> {

}