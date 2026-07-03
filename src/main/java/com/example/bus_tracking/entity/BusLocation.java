package com.example.bus_tracking.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "bus_locations")
public class BusLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "bus_id")
    private Bus bus;

    private Double latitude;

    private Double longitude;

    private Double speed;

    private Double accuracy;

    private Double bearing;

    @Column(name = "location_time")
    private LocalDateTime locationTime;

    public BusLocation() {
    }

    public BusLocation(Long id, Bus bus, Double latitude,
                       Double longitude, Double speed,
                       Double accuracy, Double bearing,
                       LocalDateTime locationTime) {
        this.id = id;
        this.bus = bus;
        this.latitude = latitude;
        this.longitude = longitude;
        this.speed = speed;
        this.accuracy = accuracy;
        this.bearing = bearing;
        this.locationTime = locationTime;
    }

    public Long getId() {
        return id;
    }

    public Bus getBus() {
        return bus;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getSpeed() {
        return speed;
    }

    public Double getAccuracy() {
        return accuracy;
    }

    public Double getBearing() {
        return bearing;
    }

    public LocalDateTime getLocationTime() {
        return locationTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }

    public void setBearing(Double bearing) {
        this.bearing = bearing;
    }

    public void setLocationTime(LocalDateTime locationTime) {
        this.locationTime = locationTime;
    }
}