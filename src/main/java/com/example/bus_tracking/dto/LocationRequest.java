package com.example.bus_tracking.dto;

public class LocationRequest {

    private Long busId;

    private Double latitude;

    private Double longitude;

    private Double speed;

    private Double heading;

    public LocationRequest(){}

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

}