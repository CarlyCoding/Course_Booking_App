package com.codeclan.courseBooking.courseBooking.Components;

import com.codeclan.courseBooking.courseBooking.models.Booking;
import com.codeclan.courseBooking.courseBooking.models.Course;
import com.codeclan.courseBooking.courseBooking.models.Customer;
import com.codeclan.courseBooking.courseBooking.models.RatingType;
import com.codeclan.courseBooking.courseBooking.repositories.BookingRepository;
import com.codeclan.courseBooking.courseBooking.repositories.CourseRepository;
import com.codeclan.courseBooking.courseBooking.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

//@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Customer bob = new Customer("Bob", "Edinburgh", 33);
        Course python = new Course("Intro to Python", "Edinburgh", RatingType.THREE);

        Booking booking1 = new Booking(LocalDate.of(2022,01,01), bob, python);

        bob.addBooking(booking1);
        python.addBooking(booking1);

        customerRepository.save(bob);
        courseRepository.save(python);
        bookingRepository.save(booking1);


    }
}
