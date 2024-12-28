package com.semicolon.africa.transportbookingapplication.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
@Getter
@Setter
public class Admin {
    @Id
    private String AdminId;
    private String AdminName;
    private String AdminPassword;
    private String AdminEmail;
    private String AdminPhoneNumber;

    public String getAdminPhoneNumber() {
        return AdminPhoneNumber;
    }

    public void setAdminPhoneNumber(String adminPhoneNumber) {
        AdminPhoneNumber = adminPhoneNumber;
    }

    public String getAdminId() {
        return AdminId;
    }

    public void setAdminId(String adminId) {
        AdminId = adminId;
    }

    public String getAdminName() {
        return AdminName;
    }

    public void setAdminName(String adminName) {
        AdminName = adminName;
    }

    public String getAdminPassword() {
        return AdminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        AdminPassword = adminPassword;
    }

    public String getAdminEmail() {
        return AdminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        AdminEmail = adminEmail;
    }
}
