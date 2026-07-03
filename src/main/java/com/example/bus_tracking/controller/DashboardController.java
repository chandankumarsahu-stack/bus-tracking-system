package com.example.bus_tracking.controller;

import com.example.bus_tracking.dto.DashboardResponse;
import com.example.bus_tracking.repository.BusRepository;
import com.example.bus_tracking.repository.DriverRepository;
import com.example.bus_tracking.repository.ParentRepository;
import com.example.bus_tracking.repository.StudentRepository;
import com.example.bus_tracking.repository.RouteRepository;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dashboard")
@CrossOrigin(origins = "*")
public class DashboardController {

    private final BusRepository busRepository;
    private final DriverRepository driverRepository;
    private final ParentRepository parentRepository;
    private final StudentRepository studentRepository;
    private final RouteRepository routeRepository;

    public DashboardController(
            BusRepository busRepository,
            DriverRepository driverRepository,
            ParentRepository parentRepository,
            StudentRepository studentRepository,
            RouteRepository routeRepository) {

        this.busRepository = busRepository;
        this.driverRepository = driverRepository;
        this.parentRepository = parentRepository;
        this.studentRepository = studentRepository;
        this.routeRepository = routeRepository;
    }

    @GetMapping
    public DashboardResponse dashboard() {

        return new DashboardResponse(

                busRepository.count(),
                driverRepository.count(),
                parentRepository.count(),
                studentRepository.count(),
                routeRepository.count()

        );

    }

}