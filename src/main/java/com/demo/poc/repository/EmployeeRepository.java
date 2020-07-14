package com.demo.poc.repository;

import com.demo.poc.domain.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class EmployeeRepository {

    private static final Employee employee1 = new Employee(1L, "Georgi", "Ivanov", 101L);
    private static final Employee employee2 = new Employee(2L, "Pesho", "Peshev", 102L);

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        return Collections.unmodifiableList(employees);
    }
}
