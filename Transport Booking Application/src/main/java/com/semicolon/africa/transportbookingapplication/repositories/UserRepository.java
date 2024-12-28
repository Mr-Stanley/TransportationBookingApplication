package com.semicolon.africa.transportbookingapplication.repositories;

import com.semicolon.africa.transportbookingapplication.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository <User, String>{
    User findByUserEmail(String email);
}
