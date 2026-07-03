package com.example.bus_tracking.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="locations")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long busId;

    private Double latitude;

    private Double longitude;

    private Double speed;

    private Double heading;

    private LocalDateTime updatedAt;

    public Location(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public Long getBusId() {
        return busId;
    }

    public void setBusId(Long busId) {
        this.busId=busId;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude=latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude=longitude;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed=speed;
    }

    public Double getHeading() {
        return heading;
    }

    public void setHeading(Double heading) {
        this.heading=heading;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt=updatedAt;
    }

	public Location orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

}