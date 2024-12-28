package com.semicolon.africa.transportbookingapplication.services;

import com.semicolon.africa.transportbookingapplication.dtos.request.CreateUnregisteredUserLoginRequest;
import com.semicolon.africa.transportbookingapplication.dtos.request.CreateUserLoginRequest;
import com.semicolon.africa.transportbookingapplication.dtos.request.CreateUserRequest;
import com.semicolon.africa.transportbookingapplication.models.User;
import com.semicolon.africa.transportbookingapplication.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  UserRepository userRepository;



    @Override
    public String createUser(CreateUserRequest createUserRequest) {
        User newUser = new User();
        newUser.setUserName(createUserRequest.getUserName());
        newUser.setUserEmail(createUserRequest.getUserEmail());
        userRepository.findByUserEmail(createUserRequest.getUserEmail());
        newUser.setUserPassword(createUserRequest.getUserPassword());
        newUser.setUserPhoneNumber(createUserRequest.getUserPhoneNumber());
        userRepository.save(newUser);


        return "User Registered Successfully";
    }

    @Override
    public String loginUser(CreateUserLoginRequest createUserLoginRequest) {
        User newUser = new User();
        newUser.setUserEmail(createUserLoginRequest.getUserEmail());
        newUser.setUserPassword(createUserLoginRequest.getUserPassword());
        User result = userRepository.findByUserEmail(createUserLoginRequest.getUserEmail());
        if(result == null) {
            return "User Not Found";
        }
        if(!result.getUserPassword().equals(createUserLoginRequest.getUserPassword())) {
            return "Wrong Password";
        }
        return "User Login Successful";
    }

    @Override
    public String loginUnregisteredUser(CreateUnregisteredUserLoginRequest createUnregisteredUserLoginRequest) {
        User result = userRepository.findByUserEmail(createUnregisteredUserLoginRequest.getUserEmail());
        if(result == null) {
            return "User Not Registered Yet";
        }

        return "Kindly Register Before You Can Login";
    }
}
