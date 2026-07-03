package com.example.bus_tracking.dto;

public class JwtAuthResponse {

    private String token;

    private String type = "Bearer";

    private String role;

    private String fullName;

    public JwtAuthResponse() {
    }

    public JwtAuthResponse(String token, String role, String fullName) {
        this.token = token;
        this.role = role;
        this.fullName = fullName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}