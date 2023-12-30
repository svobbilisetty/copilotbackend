package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;

@RestController
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<?> home() {

        List<Employee> employees = Arrays.asList (
            new Employee(1L, "John", "Smith", "", "1000"),
            new Employee(2L, "Jane", "Doe", "", "2000"),
            new Employee(3L, "John", "Doe", "", "3000"),
            new Employee(4L, "Jane", "Smith", "", "4000")
        );


        return ResponseEntity.ok().body(employees);


    }
    
}
