package com.codeclan.courseBooking.courseBooking.Controllers;

import com.codeclan.courseBooking.courseBooking.models.Course;
import com.codeclan.courseBooking.courseBooking.models.RatingType;
import com.codeclan.courseBooking.courseBooking.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/courses/rating")
    public ResponseEntity<List<Course>> getCoursesWithRating(@RequestParam(name = "rating")String rating){
        RatingType score = checkInput(rating);
        return new ResponseEntity<>(courseRepository.findByRating(score), HttpStatus.OK);
    }


    public RatingType checkInput(String rating){
        for (RatingType rate: RatingType.values()) {
            if(rating.toUpperCase().equals(rate.name())){
                return rate;
            }
        }
        return null;
    }
}
