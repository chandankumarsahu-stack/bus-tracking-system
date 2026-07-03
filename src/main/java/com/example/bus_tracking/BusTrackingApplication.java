package com.example.bus_tracking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;

// r2dbc auto configuration ko exclude kar rahe hain taaki reactive crash na ho
@SpringBootApplication(exclude = {R2dbcAutoConfiguration.class})
public class BusTrackingApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusTrackingApplication.class, args);
    }
}