package com.semicolon.africa.transportbookingapplication.repositories;

import com.semicolon.africa.transportbookingapplication.models.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRespository extends MongoRepository<Admin, String> {
}
