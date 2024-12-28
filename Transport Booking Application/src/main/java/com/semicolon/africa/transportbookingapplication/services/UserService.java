package com.semicolon.africa.transportbookingapplication.services;

import com.semicolon.africa.transportbookingapplication.dtos.request.CreateUnregisteredUserLoginRequest;
import com.semicolon.africa.transportbookingapplication.dtos.request.CreateUserLoginRequest;
import com.semicolon.africa.transportbookingapplication.dtos.request.CreateUserRequest;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    String createUser(CreateUserRequest createUserRequest);

    String loginUser(CreateUserLoginRequest createUserLoginRequest);

    String loginUnregisteredUser(CreateUnregisteredUserLoginRequest createUnregisteredUserLoginRequest);
}
