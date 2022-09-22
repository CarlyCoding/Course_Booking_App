package com.codeclan.courseBooking.courseBooking.repositories;

import com.codeclan.courseBooking.courseBooking.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
