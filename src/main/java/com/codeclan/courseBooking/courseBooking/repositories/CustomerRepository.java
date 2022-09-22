package com.codeclan.courseBooking.courseBooking.repositories;

import com.codeclan.courseBooking.courseBooking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByBookingsCourseId(Long courseId);
}
