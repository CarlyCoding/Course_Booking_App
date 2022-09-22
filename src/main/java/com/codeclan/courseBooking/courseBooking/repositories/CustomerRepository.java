package com.codeclan.courseBooking.courseBooking.repositories;

import com.codeclan.courseBooking.courseBooking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
