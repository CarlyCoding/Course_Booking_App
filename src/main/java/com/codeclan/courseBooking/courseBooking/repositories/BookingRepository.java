package com.codeclan.courseBooking.courseBooking.repositories;

import com.codeclan.courseBooking.courseBooking.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
