package com.semicolon.africa.transportbookingapplication.dtos.request;

import org.springframework.data.annotation.Id;

public class CreateUnregisteredUserLoginRequest {
    @Id
    private String userId;
    private String userEmail;
    private String userPassword;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
