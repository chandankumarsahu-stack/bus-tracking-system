package com.example.bus_tracking.entity;

import jakarta.persistence.*;

@Entity
@Table(name="routes")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String routeName;

    private String source;

    private String destination;

    private Double distance;

    private Integer estimatedTime;

    @OneToOne
    @JoinColumn(name="bus_id")
    private Bus bus;

    public Route() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName=routeName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source=source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination=destination;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance=distance;
    }

    public Integer getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(Integer estimatedTime) {
        this.estimatedTime=estimatedTime;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus=bus;
    }

}