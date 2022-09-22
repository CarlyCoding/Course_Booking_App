package com.codeclan.courseBooking.courseBooking.repositories;

import com.codeclan.courseBooking.courseBooking.models.Course;
import com.codeclan.courseBooking.courseBooking.models.Customer;
import com.codeclan.courseBooking.courseBooking.models.RatingType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByRating(RatingType ratingType);
}
