package com.example.bus_tracking.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "trip_history")
public class TripHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "bus_id")
    private Bus bus;

    @Column(name = "start_time")
    private LocalDateTime startTime;

    @Column(name = "end_time")
    private LocalDateTime endTime;

    @Column(name = "total_distance")
    private Double totalDistance;

    @Column(name = "average_speed")
    private Double averageSpeed;

    public TripHistory() {
    }

    public TripHistory(Long id, Bus bus,
                       LocalDateTime startTime,
                       LocalDateTime endTime,
                       Double totalDistance,
                       Double averageSpeed) {

        this.id = id;
        this.bus = bus;
        this.startTime = startTime;
        this.endTime = endTime;
        this.totalDistance = totalDistance;
        this.averageSpeed = averageSpeed;
    }

    public Long getId() {
        return id;
    }

    public Bus getBus() {
        return bus;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public Double getTotalDistance() {
        return totalDistance;
    }

    public Double getAverageSpeed() {
        return averageSpeed;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public void setTotalDistance(Double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public void setAverageSpeed(Double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }
}