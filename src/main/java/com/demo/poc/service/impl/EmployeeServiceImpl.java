package com.demo.poc.service.impl;

import com.demo.poc.domain.Employee;
import com.demo.poc.repository.EmployeeRepository;
import com.demo.poc.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.getAllEmployees();
    }
}
