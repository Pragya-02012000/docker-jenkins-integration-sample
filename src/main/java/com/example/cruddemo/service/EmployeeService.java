package com.example.cruddemo.service;

import com.example.cruddemo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {

    String save(List<Employee> employees);

    List<Employee> get();
}
