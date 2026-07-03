package com.example.bus_tracking.dto;

public class DashboardResponse {

    private long totalBuses;
    private long totalDrivers;
    private long totalParents;
    private long totalStudents;
    private long totalRoutes;

    public DashboardResponse() {
    }

    public DashboardResponse(long totalBuses,
                             long totalDrivers,
                             long totalParents,
                             long totalStudents,
                             long totalRoutes) {

        this.totalBuses = totalBuses;
        this.totalDrivers = totalDrivers;
        this.totalParents = totalParents;
        this.totalStudents = totalStudents;
        this.totalRoutes = totalRoutes;
    }

    public long getTotalBuses() {
        return totalBuses;
    }

    public void setTotalBuses(long totalBuses) {
        this.totalBuses = totalBuses;
    }

    public long getTotalDrivers() {
        return totalDrivers;
    }

    public void setTotalDrivers(long totalDrivers) {
        this.totalDrivers = totalDrivers;
    }

    public long getTotalParents() {
        return totalParents;
    }

    public void setTotalParents(long totalParents) {
        this.totalParents = totalParents;
    }

    public long getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(long totalStudents) {
        this.totalStudents = totalStudents;
    }

    public long getTotalRoutes() {
        return totalRoutes;
    }

    public void setTotalRoutes(long totalRoutes) {
        this.totalRoutes = totalRoutes;
    }

}