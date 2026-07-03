package com.example.bus_tracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bus_tracking.entity.Route;

public interface RouteRepository extends JpaRepository<Route,Long>{

}