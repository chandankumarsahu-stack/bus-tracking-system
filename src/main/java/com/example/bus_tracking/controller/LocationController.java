package com.example.bus_tracking.controller;

import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

import com.example.bus_tracking.dto.LocationRequest;
import com.example.bus_tracking.entity.Location;
import com.example.bus_tracking.service.LocationService;
import java.util.List;

@RestController
@RequestMapping("/location")
@CrossOrigin(origins="*")
public class LocationController {

    private final LocationService service;

    private final SimpMessagingTemplate messagingTemplate;

    public LocationController(LocationService service,
                              SimpMessagingTemplate messagingTemplate){

        this.service=service;
        this.messagingTemplate=messagingTemplate;

    }

    @PostMapping("/update")
    public Location update(@RequestBody LocationRequest request){

        Location location=service.save(request);

        messagingTemplate.convertAndSend(
                "/topic/location/"+request.getBusId(),
                location
        );

        return location;

    }

    @GetMapping("/{busId}")
    public Location latest(@PathVariable Long busId){

        return service.latest(busId);

    }
    
    @GetMapping("/all")
    public List<Location> allLocations() {
        return service.getAllLocations();
    }

}