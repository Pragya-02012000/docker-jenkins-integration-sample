package com.example.cruddemo.serviceimpl;

import com.example.cruddemo.service.EmployeeFuncInterface;

public class SayA extends SayB implements EmployeeFuncInterface {
    @Override
    public void say() {
        System.out.println("Hi A");
        EmployeeFuncInterface.help();
    }
}
