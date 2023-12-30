package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@RestController
public class HomeController {

    @Autowired
    EmployeeRepository employeeRepository;

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

    @GetMapping("/employees")
    public ResponseEntity<?> employees() {
        return ResponseEntity.ok().body(employeeRepository.getEmployeesMap().values());
    }
    
}
