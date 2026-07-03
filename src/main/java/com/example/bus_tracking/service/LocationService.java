package com.example.bus_tracking.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.example.bus_tracking.dto.LocationRequest;
import com.example.bus_tracking.entity.Location;
import com.example.bus_tracking.repository.LocationRepository;
import java.util.List;

@Service
public class LocationService {
	public List<Location> getAllLocations() {
	    return repository.findAll();
	}
    private final LocationRepository repository;

    public LocationService(LocationRepository repository){

        this.repository=repository;

    }

    public Location save(LocationRequest request){

        System.out.println("Bus ID: " + request.getBusId());
        System.out.println("Latitude: " + request.getLatitude());
        System.out.println("Longitude: " + request.getLongitude());
        System.out.println("Speed: " + request.getSpeed());
        System.out.println("Heading: " + request.getHeading());

        Location location = new Location();

        location.setBusId(request.getBusId());
        location.setLatitude(request.getLatitude());
        location.setLongitude(request.getLongitude());
        location.setSpeed(request.getSpeed());
        location.setHeading(request.getHeading());
        location.setUpdatedAt(LocalDateTime.now());

        return repository.save(location);
    }

    public Location latest(Long busId){

        return repository
                .findTopByBusIdOrderByUpdatedAtDesc(busId)
                .orElse(null);

    }

}