package com.example.cruddemo.service.impl;

import com.example.cruddemo.entity.Employee;
import com.example.cruddemo.repository.EmployeeRepository;
import com.example.cruddemo.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    EmployeeRepository employeeRepository;

    ObjectMapper obj;

    public String save(List<Employee> emp){
        employeeRepository.saveAll(emp);
        System.out.println("hello");
        return "Saved";
    }

    public List<Employee> get(){
        List<Employee> list = employeeRepository.findAll();

        Employee obj1=new Employee();
        Employee obj2=new Employee();
        if(obj2.equals(obj1)){}

        return list;
    }
}
