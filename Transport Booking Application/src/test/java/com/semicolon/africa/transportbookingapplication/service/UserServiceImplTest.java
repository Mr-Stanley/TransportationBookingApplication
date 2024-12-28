package com.semicolon.africa.transportbookingapplication.service;

import com.semicolon.africa.transportbookingapplication.dtos.request.CreateUnregisteredUserLoginRequest;
import com.semicolon.africa.transportbookingapplication.dtos.request.CreateUserLoginRequest;
import com.semicolon.africa.transportbookingapplication.dtos.request.CreateUserRequest;
import com.semicolon.africa.transportbookingapplication.models.User;
import com.semicolon.africa.transportbookingapplication.repositories.UserRepository;
import com.semicolon.africa.transportbookingapplication.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;


    @Test
    public void testThatUserCanRegisterAnAccount(){
        CreateUserRequest createUserRequest = new CreateUserRequest();
        createUserRequest.setUserName("Stanley");
        createUserRequest.setUserEmail("stanley@gmail.com");
        createUserRequest.setUserPassword("123456789");
        createUserRequest.setUserPhoneNumber("08142796616");
        userService.createUser(createUserRequest);
        User createdUser = userRepository.findByUserEmail(createUserRequest.getUserEmail());
        assertEquals(1, userRepository.count());
        assertEquals("stanley@gmail.com", createdUser.getUserEmail());

    }

    @Test
    public void testThatUserCanLoginAfterRegisteringAnAccount(){
        CreateUserRequest createUserRequest = new CreateUserRequest();
        createUserRequest.setUserName("Ugochukwu");
        createUserRequest.setUserEmail("ugochukwu@gmail.com");
        createUserRequest.setUserPassword("123456789");
        createUserRequest.setUserPhoneNumber("08147014806");
        userService.createUser(createUserRequest);
        CreateUserLoginRequest createUserLoginRequest = new CreateUserLoginRequest();
        createUserLoginRequest.setUserEmail(createUserRequest.getUserEmail());
        createUserLoginRequest.setUserPassword(createUserRequest.getUserPassword());
        String loginResult = userService.loginUser(createUserLoginRequest);
        assertEquals("User Login Successful", loginResult);
    }

    @Test
    public void testThatUserCannotLoginWithoutRegisteringAnAccount(){
        CreateUnregisteredUserLoginRequest createUnregisteredUserLoginRequest = new CreateUnregisteredUserLoginRequest();
        createUnregisteredUserLoginRequest.setUserEmail(createUnregisteredUserLoginRequest.getUserEmail());
        createUnregisteredUserLoginRequest.setUserPassword(createUnregisteredUserLoginRequest.getUserPassword());
        String loginResult = userService.loginUnregisteredUser(createUnregisteredUserLoginRequest);
        assertEquals("User Not Registered Yet", loginResult);
    }

    @Test
    public void testThatUserCanBookABusForA_Trip(){
        CreateUserRequest createUserRequest = new CreateUserRequest();
        createUserRequest.setUserName("chuibuzor");
    }

}
