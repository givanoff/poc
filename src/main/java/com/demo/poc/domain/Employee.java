package com.demo.poc.domain;

//@Entity
public class Employee {

    private static Long id;

    private static String firstName;

    private static String lastName;

    private static  Long employeeId;

    public Employee(Long id, String firstName, String lastName, Long employeeId) {
        Employee.id = id;
        Employee.firstName = firstName;
        Employee.lastName = lastName;
        Employee.employeeId = employeeId;
    }

    public static Long getId() {
        return id;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static Long getEmployeeId() {
        return employeeId;
    }
}
