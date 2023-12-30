// repository class with static method to create 5 employees and return them from a mehtod
// Path: demo/src/main/java/com/example/demo/repository/EmployeeRepository.java
package com.example.demo.repository;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public class EmployeeRepository {

    public static List<Employee> getEmployees() {
        return Arrays.asList (
            new Employee(1L, "John", "Smith", "", "1000"),
            new Employee(2L, "Jane", "Doe", "", "2000"),
            new Employee(3L, "John", "Doe", "", "3000"),
            new Employee(4L, "Jane", "Smith", "", "4000")


        );
    }

    public Map<Integer, Employee> getEmployeesMap() {
            Map<Integer, Employee> employeesMap = new HashMap<>();
            employeesMap.put(1, new Employee(1L, "John", "Smith", "", "1000"));
            employeesMap.put(2, new Employee(2L, "Jane", "Doe", "", "2000"));
            employeesMap.put(3, new Employee(3L, "John", "Doe", "", "3000"));
            employeesMap.put(4, new Employee(4L, "Jane", "Smith", "", "4000"));
        return employeesMap;
    }

}