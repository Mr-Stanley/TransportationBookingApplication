package com.semicolon.africa.transportbookingapplication.repositories;

import com.semicolon.africa.transportbookingapplication.models.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingRepository extends MongoRepository<Booking, String> {

}
