package com.semicolon.africa.transportbookingapplication.service;

import com.semicolon.africa.transportbookingapplication.repositories.BookingRepository;
import com.semicolon.africa.transportbookingapplication.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookingServiceImplTest {
    @Autowired
    private BookingService bookingService;

    @Autowired
    private BookingRepository bookingRepository;
}
