package com.demo.poc.repository;

import com.demo.poc.domain.Employee;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class EmployeeRepository {

    private static final List<Employee> employees = Arrays.asList(
            new Employee(1L, "Georgi", "Ivanov", 101L),
            new Employee(2L, "Pesho", "Peshev", 102L)
    );

    public List<Employee> getAllEmployees() {
        return employees;
    }
}
