package com.semicolon.africa.transportbookingapplication.repositories;

import com.semicolon.africa.transportbookingapplication.models.Trips;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TripsRepository extends MongoRepository<Trips, String> {

}
