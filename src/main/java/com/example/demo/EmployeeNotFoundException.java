package com.example.demo;

public class EmployeeNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 6328812726367256417L;

    public EmployeeNotFoundException(Long id) {
        super("Could not find employee: " + id);
    }
}
