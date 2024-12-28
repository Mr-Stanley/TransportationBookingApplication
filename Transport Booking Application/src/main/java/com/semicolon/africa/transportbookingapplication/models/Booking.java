package com.semicolon.africa.transportbookingapplication.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
@Getter
@Setter
public class Booking {
    @Id
    private String BookingId;
    private int TotalTravelers;
    private String BookingLocation;
    private String BookingDestination;
    private Trips DepartureTime;

    public Trips getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(Trips departureTime) {
        DepartureTime = departureTime;
    }

    public String getBookingId() {
        return BookingId;
    }

    public void setBookingId(String bookingId) {
        BookingId = bookingId;
    }

    public int getTotalTravelers() {
        return TotalTravelers;
    }

    public void setTotalTravelers(int totalTravelers) {
        TotalTravelers = totalTravelers;
    }

    public String getBookingLocation() {
        return BookingLocation;
    }

    public void setBookingLocation(String bookingLocation) {
        BookingLocation = bookingLocation;
    }

    public String getBookingDestination() {
        return BookingDestination;
    }

    public void setBookingDestination(String bookingDestination) {
        BookingDestination = bookingDestination;
    }
}
