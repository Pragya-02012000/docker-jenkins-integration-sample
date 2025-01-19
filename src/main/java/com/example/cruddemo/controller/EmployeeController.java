package com.example.cruddemo.controller;

import com.example.cruddemo.entity.Employee;
import com.example.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public String saveAll(@RequestBody List<Employee> employees){
        return employeeService.save(employees);
    }

    @GetMapping("/get")
    public List<Employee> find(){
        return employeeService.get();
    }

}
