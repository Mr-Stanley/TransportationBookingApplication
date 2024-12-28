package com.semicolon.africa.transportbookingapplication.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
@Getter
@Setter
public class Trips {
    @Id
    private String TripId;
    private LocalDateTime TripDate;
    private LocalDateTime TripTime;
    private String TripDestination;

    public String getTripId() {
        return TripId;
    }

    public void setTripId(String tripId) {
        TripId = tripId;
    }

    public LocalDateTime getTripDate() {
        return TripDate;
    }

    public void setTripDate(LocalDateTime tripDate) {
        TripDate = tripDate;
    }

    public LocalDateTime getTripTime() {
        return TripTime;
    }

    public void setTripTime(LocalDateTime tripTime) {
        TripTime = tripTime;
    }

    public String getTripDestination() {
        return TripDestination;
    }

    public void setTripDestination(String tripDestination) {
        TripDestination = tripDestination;
    }
}
