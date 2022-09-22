package com.codeclan.courseBooking.courseBooking.Controllers;

import com.codeclan.courseBooking.courseBooking.models.Customer;
import com.codeclan.courseBooking.courseBooking.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/customer/course")
    public ResponseEntity<List<Customer>> getCustomersByCourse(@RequestParam (name= "course") Long id){
        return new ResponseEntity<>(customerRepository.findByBookingsCourseId(id) , HttpStatus.OK);
    }
}
;